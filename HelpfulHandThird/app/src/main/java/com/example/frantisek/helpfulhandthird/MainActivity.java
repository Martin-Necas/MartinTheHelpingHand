package com.example.frantisek.helpfulhandthird;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Registration(View view) {

        Intent startRegistration = new Intent(this, registration.class);
        startActivity(startRegistration);

    }

    public void Menu(View view) {

        Intent startMenu = new Intent(this, menu.class);
        startActivity(startMenu);

    }
}
