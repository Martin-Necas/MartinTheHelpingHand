package com.example.frantisek.helpfulhandthird;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void LightsControl(View view) {

        Intent startLightsControl = new Intent(this, LightsControl.class);
        startActivity(startLightsControl);

    }
}
