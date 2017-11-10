package com.example.frantisek.helpfulhandthird;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;


public class LightsControl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lights_control);

        Switch s = (Switch) findViewById(R.id.switchBathroom);

        if (s != null) {
            s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    char state;
                    TextView house = (TextView) findViewById(R.id.myHouse);
                    if(isChecked) state = 'A';
                    else state = 'B';
                }
            });

        }

    }
}

