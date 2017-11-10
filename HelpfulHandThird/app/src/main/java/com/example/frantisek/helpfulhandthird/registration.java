package com.example.frantisek.helpfulhandthird;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.frantisek.helpfulhandthird.model.Model;

public class registration extends Activity {
    private Button registrationButton;
    private EditText nameEditText;
    private EditText surenameEditText;
    private EditText emailEditText;
    private EditText passwordEditText;
    private EditText repasswordEditText;

    private Model model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        initParams();
    }

    private void initParams() {
        registrationButton = (Button) findViewById(R.id.reg_button_register);
        nameEditText = (EditText) findViewById(R.id.reg_editText_name);
        surenameEditText = (EditText) findViewById(R.id.reg_editText_sname);
        emailEditText = (EditText) findViewById(R.id.reg_editText_email);
        passwordEditText = (EditText) findViewById(R.id.reg_editText_paswd);
        repasswordEditText = (EditText) findViewById(R.id.reg_editText_repaswd);

        model = new Model(this);
    }

    private class ButtonListenner implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            String name = nameEditText.getText().toString();
            String surename = surenameEditText.getText().toString();
            String email = emailEditText.getText().toString();
            String password = passwordEditText.getText().toString();
            String repassword = repasswordEditText.getText().toString();

            if (!password.equals(repassword)) {
                Toast.makeText(getBaseContext(), "Your password doesn't match. Retype it.", Toast.LENGTH_LONG).show();
            } else {
                model.insertNote(name, surename, email, password);
                login();
            }
        }
    }

    public void login() {
        Intent startLogin = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(startLogin);

    }
}
