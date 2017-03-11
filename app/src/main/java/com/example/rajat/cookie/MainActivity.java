package com.example.rajat.cookie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button mEatCookieButton;
    TextView mStatusTextView;
    ImageView mCookieImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStatusTextView = (TextView) findViewById(R.id.status_text_view);

        mCookieImage = (ImageView) findViewById(R.id.android_cookie_image_view);

        mEatCookieButton = (Button) findViewById(R.id.eat_cookie_btn);
        mEatCookieButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCookieImage.setImageResource(R.drawable.after_cookie);
                mStatusTextView.setText("I'm so full.");
            }
        });
    }
}
