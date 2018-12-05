package com.morinscompany.lesson2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loginOnClick(View view) {

//        EditText email = (EditText)findViewById(R.id.email);
//        EditText password = (EditText)findViewById(R.id.password);
//
//        String emailField = email.getText().toString();
//        String passwordField = password.getText().toString();
//
//        if ((emailField == null) || (passwordField == null)) {
//            return;
//        }
//
//        if ((emailField != null) || (passwordField != null)) {
//
//            int a = 0;
//        }

        Intent intent = new Intent(this, Header.class);
        startActivity(intent);
    }
}
