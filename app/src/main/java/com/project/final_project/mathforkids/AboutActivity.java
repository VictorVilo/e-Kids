package com.project.final_project.mathforkids;

import android.annotation.SuppressLint;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.project.final_project.R;


/**
 * @author Created by Janice
 * Shows information about the application version
 * and the developers
 */
public class AboutActivity extends AppCompatActivity {

    @SuppressLint("StringFormatMatches")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about2);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        Resources res = getResources();
        //Put the version number into the about page
        final TextView versionText = (TextView) findViewById(R.id.version);
        try {
            PackageInfo pInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
            String version = pInfo.versionName;
            versionText.setText(res.getString(R.string.versionNumber, version));
        } catch (PackageManager.NameNotFoundException e) {
            versionText.setText(res.getString(R.string.versionNumber, 1.0));
        }
    }
}
