package com.example.authorization;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }
    public void checkReg(android.view.View v){
        TextView log = findViewById(R.id.reg_login);
        TextView pas = findViewById(R.id.reg_password);
        System.out.println(String.valueOf(pas.getText()));
        Intent i = new Intent();
        i.putExtra("login",log.getText().toString());
        i.putExtra("password",pas.getText().toString());
        setResult(0,i);
        log.setText("");
        pas.setText("");
        finish();
    }
}