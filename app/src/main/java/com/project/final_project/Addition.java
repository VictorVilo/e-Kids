package com.project.final_project;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Addition extends AppCompatActivity {

    ImageView nOne1, nTwo2, nThree3, nFour4, nFive5, nSix6, nSeven7, nEight8, nNine9, nTen10;
    ImageView mOne1, mTwo2, mThree3, mFour4, mFive5, mSix6, mSeven7, mEight8, mNine9, mTen10;
    ImageView resImg1, resImg2, equals;
    TextView nText1, nText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);

        nOne1 = findViewById(R.id.number_one);
        nTwo2 = findViewById(R.id.number_two);
        nThree3 = findViewById(R.id.number_three);
        nFour4 = findViewById(R.id.number_four);
        nFive5 = findViewById(R.id.number_five);
        nSix6 = findViewById(R.id.number_six);
        nSeven7 = findViewById(R.id.number_seven);
        nEight8 = findViewById(R.id.number_eight);
        nNine9 = findViewById(R.id.number_nine);
        nTen10 = findViewById(R.id.number_ten);

        mOne1 = findViewById(R.id.number_one1);
        mTwo2 = findViewById(R.id.number_two2);
        mThree3 = findViewById(R.id.number_three3);
        mFour4 = findViewById(R.id.number_four4);
        mFive5 = findViewById(R.id.number_five5);
        mSix6 = findViewById(R.id.number_six6);
        mSeven7 = findViewById(R.id.number_seven7);
        mEight8 = findViewById(R.id.number_eight8);
        mNine9 = findViewById(R.id.number_nine9);
        mTen10 = findViewById(R.id.number_ten10);

        nText1 = findViewById(R.id.num_one);
        nText2 = findViewById(R.id.num_two);

        resImg1 = findViewById(R.id.res1);
        resImg2 = findViewById(R.id.res2);

        equals = findViewById(R.id.equals_sign);

        nOne1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nText1.setText("1");
            }
        });
        nTwo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nText1.setText("2");
            }
        });
        nThree3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nText1.setText("3");
            }
        });
        nFour4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nText1.setText("4");
            }
        });
        nFive5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nText1.setText("5");
            }
        });
        nSix6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nText1.setText("6");
            }
        });
        nSeven7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nText1.setText("7");
            }
        });
        nEight8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nText1.setText("8");
            }
        });
        nNine9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nText1.setText("9");
            }
        });
        nTen10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nText1.setText("10");
            }
        });

        mOne1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nText2.setText("1");
            }
        });

        mTwo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nText2.setText("2");
            }
        });
        mThree3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nText2.setText("3");
            }
        });
        mFour4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nText2.setText("4");
            }
        });
        mFive5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nText2.setText("5");
            }
        });

        mSix6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nText2.setText("6");
            }
        });
        mSeven7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nText2.setText("7");
            }
        });
        mEight8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nText2.setText("8");
            }
        });
        mNine9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nText2.setText("9");
            }
        });
        mTen10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nText2.setText("10");
            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nText1.getText() == "1") {
                    if (nText2.getText() == "1") {
                        resImg1.setImageResource(R.drawable.number_two);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "2") {
                        resImg1.setImageResource(R.drawable.number_three);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "3") {
                        resImg1.setImageResource(R.drawable.number_four);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "4") {
                        resImg1.setImageResource(R.drawable.number_five);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "5") {
                        resImg1.setImageResource(R.drawable.number_six);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "6") {
                        resImg1.setImageResource(R.drawable.number_seven);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "7") {
                        resImg1.setImageResource(R.drawable.number_eight);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "8") {
                        resImg1.setImageResource(R.drawable.number_nine);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "9") {
                        resImg1.setImageResource(R.drawable.number_ten);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "10") {
                        resImg1.setImageResource(R.drawable.number_one);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                }

                if (nText1.getText() == "2") {
                    if (nText2.getText() == "1") {
                        resImg1.setImageResource(R.drawable.number_three);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "2") {
                        resImg1.setImageResource(R.drawable.number_four);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "3") {
                        resImg1.setImageResource(R.drawable.number_five);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "4") {
                        resImg1.setImageResource(R.drawable.number_six);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "5") {
                        resImg1.setImageResource(R.drawable.number_seven);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "6") {
                        resImg1.setImageResource(R.drawable.number_eight);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "7") {
                        resImg1.setImageResource(R.drawable.number_nine);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "8") {
                        resImg1.setImageResource(R.drawable.number_ten);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "9") {
                        resImg1.setImageResource(R.drawable.number_one);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "10") {
                        resImg1.setImageResource(R.drawable.number_two);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                }

                if (nText1.getText() == "3") {
                    if (nText2.getText() == "1") {
                        resImg1.setImageResource(R.drawable.number_four);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "2") {
                        resImg1.setImageResource(R.drawable.number_five);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "3") {
                        resImg1.setImageResource(R.drawable.number_six);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "4") {
                        resImg1.setImageResource(R.drawable.number_seven);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "5") {
                        resImg1.setImageResource(R.drawable.number_eight);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "6") {
                        resImg1.setImageResource(R.drawable.number_nine);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "7") {
                        resImg1.setImageResource(R.drawable.number_ten);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "8") {
                        resImg1.setImageResource(R.drawable.number_one);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "9") {
                        resImg1.setImageResource(R.drawable.number_two);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "10") {
                        resImg1.setImageResource(R.drawable.number_three);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                }

                if (nText1.getText() == "4") {
                    if (nText2.getText() == "1") {
                        resImg1.setImageResource(R.drawable.number_five);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "2") {
                        resImg1.setImageResource(R.drawable.number_six);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "3") {
                        resImg1.setImageResource(R.drawable.number_seven);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "4") {
                        resImg1.setImageResource(R.drawable.number_eight);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "5") {
                        resImg1.setImageResource(R.drawable.number_nine);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "6") {
                        resImg1.setImageResource(R.drawable.number_ten);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "7") {
                        resImg1.setImageResource(R.drawable.number_one);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "8") {
                        resImg1.setImageResource(R.drawable.number_two);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "9") {
                        resImg1.setImageResource(R.drawable.number_three);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "10") {
                        resImg1.setImageResource(R.drawable.number_four);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                }

                if (nText1.getText() == "5") {
                    if (nText2.getText() == "1") {
                        resImg1.setImageResource(R.drawable.number_six);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "2") {
                        resImg1.setImageResource(R.drawable.number_seven);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "3") {
                        resImg1.setImageResource(R.drawable.number_eight);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "4") {
                        resImg1.setImageResource(R.drawable.number_nine);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "5") {
                        resImg1.setImageResource(R.drawable.number_ten);
                        resImg2.setImageResource(0);
                    }
                    if (nText2.getText() == "6") {
                        resImg1.setImageResource(R.drawable.number_one);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "7") {
                        resImg1.setImageResource(R.drawable.number_two);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "8") {
                        resImg1.setImageResource(R.drawable.number_three);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "9") {
                        resImg1.setImageResource(R.drawable.number_four);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "10") {
                        resImg1.setImageResource(R.drawable.number_five);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                }

                if (nText1.getText() == "6") {
                    if (nText2.getText() == "1") {
                        resImg1.setImageResource(R.drawable.number_seven);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "2") {
                        resImg1.setImageResource(R.drawable.number_eight);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "3") {
                        resImg1.setImageResource(R.drawable.number_nine);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "4") {
                        resImg1.setImageResource(R.drawable.number_ten);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "5") {
                        resImg1.setImageResource(R.drawable.number_one);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "6") {
                        resImg1.setImageResource(R.drawable.number_two);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "7") {
                        resImg1.setImageResource(R.drawable.number_three);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "8") {
                        resImg1.setImageResource(R.drawable.number_four);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "9") {
                        resImg1.setImageResource(R.drawable.number_five);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "10") {
                        resImg1.setImageResource(R.drawable.number_six);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                }

                if (nText1.getText() == "7") {
                    if (nText2.getText() == "1") {
                        resImg1.setImageResource(R.drawable.number_eight);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "2") {
                        resImg1.setImageResource(R.drawable.number_nine);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "3") {
                        resImg1.setImageResource(R.drawable.number_ten);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "4") {
                        resImg1.setImageResource(R.drawable.number_one);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "5") {
                        resImg1.setImageResource(R.drawable.number_two);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "6") {
                        resImg1.setImageResource(R.drawable.number_three);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "7") {
                        resImg1.setImageResource(R.drawable.number_four);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "8") {
                        resImg1.setImageResource(R.drawable.number_five);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "9") {
                        resImg1.setImageResource(R.drawable.number_six);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "10") {
                        resImg1.setImageResource(R.drawable.number_seven);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                }

                if (nText1.getText() == "8") {
                    if (nText2.getText() == "1") {
                        resImg1.setImageResource(R.drawable.number_nine);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "2") {
                        resImg1.setImageResource(R.drawable.number_ten);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "3") {
                        resImg1.setImageResource(R.drawable.number_one);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "4") {
                        resImg1.setImageResource(R.drawable.number_two);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "5") {
                        resImg1.setImageResource(R.drawable.number_three);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "6") {
                        resImg1.setImageResource(R.drawable.number_four);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "7") {
                        resImg1.setImageResource(R.drawable.number_five);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "8") {
                        resImg1.setImageResource(R.drawable.number_six);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "9") {
                        resImg1.setImageResource(R.drawable.number_seven);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "10") {
                        resImg1.setImageResource(R.drawable.number_eight);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                }

                if (nText1.getText() == "9") {
                    if (nText2.getText() == "1") {
                        resImg1.setImageResource(R.drawable.number_ten);
                        resImg2.setImageResource(0);

                    }
                    if (nText2.getText() == "2") {
                        resImg1.setImageResource(R.drawable.number_one);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "3") {
                        resImg1.setImageResource(R.drawable.number_two);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "4") {
                        resImg1.setImageResource(R.drawable.number_three);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "5") {
                        resImg1.setImageResource(R.drawable.number_four);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "6") {
                        resImg1.setImageResource(R.drawable.number_five);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "7") {
                        resImg1.setImageResource(R.drawable.number_six);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "8") {
                        resImg1.setImageResource(R.drawable.number_seven);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "9") {
                        resImg1.setImageResource(R.drawable.number_eight);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "10") {
                        resImg1.setImageResource(R.drawable.number_nine);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                }

                if (nText1.getText() == "10") {
                    if (nText2.getText() == "1") {
                        resImg1.setImageResource(R.drawable.number_one);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "2") {
                        resImg1.setImageResource(R.drawable.number_two);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "3") {
                        resImg1.setImageResource(R.drawable.number_three);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "4") {
                        resImg1.setImageResource(R.drawable.number_four);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "5") {
                        resImg1.setImageResource(R.drawable.number_five);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "6") {
                        resImg1.setImageResource(R.drawable.number_six);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "7") {
                        resImg1.setImageResource(R.drawable.number_seven);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "8") {
                        resImg1.setImageResource(R.drawable.number_eight);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "9") {
                        resImg1.setImageResource(R.drawable.number_nine);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                    if (nText2.getText() == "10") {
                        resImg1.setImageResource(R.drawable.number_ten);
                        resImg2.setImageResource(R.drawable.number_ten);

                    }
                }

            }


        });

    }
}
