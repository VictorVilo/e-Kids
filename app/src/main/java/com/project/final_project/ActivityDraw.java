package com.project.final_project;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.transition.TransitionManager;

import com.rm.freedrawview.FreeDrawSerializableState;
import com.rm.freedrawview.FreeDrawView;
import com.rm.freedrawview.PathDrawnListener;
import com.rm.freedrawview.PathRedoUndoCountChangeListener;

import static com.project.final_project.EasyPaint.DEFAULT_BRUSH_SIZE;

public class ActivityDraw extends AppCompatActivity
        implements View.OnClickListener, SeekBar.OnSeekBarChangeListener,
        PathRedoUndoCountChangeListener, FreeDrawView.DrawCreatorListener, PathDrawnListener {

    private static final String TAG = ActivityDraw.class.getSimpleName();

    private static final int THICKNESS_STEP = 2;
    private static final int THICKNESS_MAX = 80;
    private static final int THICKNESS_MIN = 15;

    private static final int ALPHA_STEP = 1;
    private static final int ALPHA_MAX = 255;
    private static final int ALPHA_MIN = 0;

    private LinearLayout mRoot;
    private FreeDrawView mFreeDrawView;
    private View mSideView;
    private SeekBar mThicknessBar, mAlphaBar;
    private TextView mTxtRedoCount, mTxtUndoCount;
    private ProgressBar mProgressBar;

    private ImageView mImgScreen, mBtnUndo, mBtnRedo, mBtnRandomColor, mBtnClearAll, mBtnChangeColor;
    private Menu mMenu;


    MediaPlayer ourSong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_draw);


        ourSong = MediaPlayer.create(this, R.raw.dance_monkey);
        ourSong.start();

        mRoot = (LinearLayout) findViewById(R.id.root);

        mImgScreen = (ImageView) findViewById(R.id.img_screen);

        mTxtRedoCount = (TextView) findViewById(R.id.txt_redo_count);
        mTxtUndoCount = (TextView) findViewById(R.id.txt_undo_count);

        mProgressBar = (ProgressBar) findViewById(R.id.progress);

        mFreeDrawView = (FreeDrawView) findViewById(R.id.free_draw_view);
        mFreeDrawView.setOnPathDrawnListener(this);
        mFreeDrawView.setPathRedoUndoCountChangeListener(this);

        mSideView = findViewById(R.id.side_view);
        mBtnRandomColor = (ImageView) findViewById(R.id.image_draw_color);
        mBtnUndo = (ImageView) findViewById(R.id.image_draw_undo);
        mBtnRedo = (ImageView) findViewById(R.id.image_draw_redo);
        mBtnClearAll = (ImageView) findViewById(R.id.image_clear_all);
        mBtnChangeColor = (ImageView) findViewById(R.id.image_draw_opacity);


        mAlphaBar = (SeekBar) findViewById(R.id.slider_alpha);
        mThicknessBar = (SeekBar) findViewById(R.id.slider_thickness);

        mAlphaBar.setOnSeekBarChangeListener(null);
        mThicknessBar.setOnSeekBarChangeListener(null);

        mBtnRandomColor.setOnClickListener(this);
        mBtnUndo.setOnClickListener(this);
        mBtnRedo.setOnClickListener(this);
        mBtnClearAll.setOnClickListener(this);


        if (savedInstanceState == null) {
            showLoadingSpinner();

            // Restore the previous saved state
            FileHelper.getSavedStoreFromFile(this,
                    new FileHelper.StateExtractorInterface() {
                        @Override
                        public void onStateExtracted(FreeDrawSerializableState state) {
                            if (state != null) {
                                mFreeDrawView.restoreStateFromSerializable(state);
                            }

                            hideLoadingSpinner();
                        }

                        @Override
                        public void onStateExtractionError() {
                            hideLoadingSpinner();
                        }
                    });
        }

        mAlphaBar.setMax((ALPHA_MAX - ALPHA_MIN) / ALPHA_STEP);
        int alphaProgress = ((mFreeDrawView.getPaintAlpha() - ALPHA_MIN) / ALPHA_STEP);
        mAlphaBar.setProgress(alphaProgress);
        mAlphaBar.setOnSeekBarChangeListener(this);

        mThicknessBar.setMax((THICKNESS_MAX - THICKNESS_MIN) / THICKNESS_STEP);
        int thicknessProgress = (int)
                ((mFreeDrawView.getPaintWidth() - THICKNESS_MIN) / THICKNESS_STEP);
        mThicknessBar.setProgress(thicknessProgress);
        mThicknessBar.setOnSeekBarChangeListener(this);
        mSideView.setBackgroundColor(mFreeDrawView.getPaintColor());
    }

    private void showLoadingSpinner() {

        TransitionManager.beginDelayedTransition(mRoot);
        mProgressBar.setVisibility(View.VISIBLE);
    }

    private void hideLoadingSpinner() {

        mProgressBar.setVisibility(View.GONE);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {


        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }


        return super.onOptionsItemSelected(item);
    }

    private void takeAndShowScreenshot() {

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mFreeDrawView.getDrawScreenshot(this);
    }

    @Override
    protected void onPause() {
        super.onPause();

        FileHelper.saveStateIntoFile(this, mFreeDrawView.getCurrentViewStateAsSerializable(), null);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        mSideView.setBackgroundColor(mFreeDrawView.getPaintColor());
    }

    private void changeColor() {
        int color = ColorHelper.getRandomMaterialColor(this);

        mFreeDrawView.setPaintColor(color);

        mSideView.setBackgroundColor(mFreeDrawView.getPaintColor());
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == mBtnRandomColor.getId()) {
            changeColor();
        }

        if (id == mBtnUndo.getId()) {
            mFreeDrawView.undoLast();
        }

        if (id == mBtnRedo.getId()) {
            mFreeDrawView.redoLast();
        }

        if (id == mBtnClearAll.getId()) {
            mFreeDrawView.undoAll();
        }

    }

    // SliderListener
    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        if (seekBar.getId() == mThicknessBar.getId()) {
            mFreeDrawView.setPaintWidthPx(THICKNESS_MIN + (progress * THICKNESS_STEP));
        } else {
            mFreeDrawView.setPaintAlpha(ALPHA_MIN + (progress * ALPHA_STEP));
        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onBackPressed() {
        if (mImgScreen.getVisibility() == View.VISIBLE) {

            mImgScreen.setImageBitmap(null);
            mImgScreen.setVisibility(View.GONE);

            mFreeDrawView.setVisibility(View.VISIBLE);
            mSideView.setVisibility(View.VISIBLE);

            getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        } else {
            super.onBackPressed();
        }
    }

    // PathRedoUndoCountChangeListener.
    @Override
    public void onUndoCountChanged(int undoCount) {
        mTxtUndoCount.setText(String.valueOf(undoCount));
    }

    @Override
    public void onRedoCountChanged(int redoCount) {
        mTxtRedoCount.setText(String.valueOf(redoCount));
    }

    // PathDrawnListener
    @Override
    public void onNewPathDrawn() {
        // The user has finished drawing a path
    }

    @Override
    public void onPathStart() {
        // The user has started drawing a path
    }


    // DrawCreatorListener
    @Override
    public void onDrawCreated(Bitmap draw) {
        mSideView.setVisibility(View.GONE);
        mFreeDrawView.setVisibility(View.GONE);

        mImgScreen.setVisibility(View.VISIBLE);

        mImgScreen.setImageBitmap(draw);
    }

    @Override
    public void onDrawCreationError() {
        Toast.makeText(this, "Error, cannot create bitmap", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        ourSong.stop();
        super.onStop();
    }
}
