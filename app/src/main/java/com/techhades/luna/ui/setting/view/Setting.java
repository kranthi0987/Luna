package com.techhades.luna.ui.setting.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.techhades.luna.R;
import com.techhades.luna.helper.SharedPrefs;

public class Setting extends AppCompatActivity {

    private Toolbar toolbar;
    private SharedPrefs sharedPrefs;
    private CheckBox showNotification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        sharedPrefs = new SharedPrefs(this);
        showNotification = (CheckBox) findViewById(R.id.showNotification);

        if (sharedPrefs.showNotification()) {
            showNotification.setChecked(true);
        } else {
            showNotification.setChecked(false);
        }
        showNotification.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b) {
                    sharedPrefs.setShowNotification(true);
                } else {
                    sharedPrefs.setShowNotification(false);
                }
            }
        });

    }
}
