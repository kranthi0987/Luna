package com.techhades.luna.ui;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.techhades.luna.R;
import com.techhades.luna.ui.brightness.view.ChangeBrightness;

public class SplashScreen extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        textView = (TextView) findViewById(R.id.editText);
//        textView.setTypeface(null, Typeface.BOLD_ITALIC);
        textView.setTypeface(null, Typeface.BOLD);
//        textView.setTypeface(null, Typeface.ITALIC);
//        textView.setTypeface(null, Typeface.NORMAL);
        Typeface type = Typeface.createFromAsset(getAssets(), "fonts/Marigold.ttf");
        textView.setTypeface(type);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent in = new Intent(SplashScreen.this, ChangeBrightness.class);
                startActivity(in);
                finish();
            }
        }, 1000);
    }
}
