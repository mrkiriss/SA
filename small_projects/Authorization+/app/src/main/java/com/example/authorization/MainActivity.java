package com.example.authorization;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    String login="admin";
    String password="god";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == 0) {
            TextView log = findViewById(R.id.inp_login);
            TextView pas = findViewById(R.id.inp_password);
            login=data.getStringExtra("login");
            log.setText(login);
            password=data.getStringExtra("password");
            pas.setText(password);
        }
    }
    public void checkInput(android.view.View v){
        TextView log = findViewById(R.id.inp_login);
        TextView pas = findViewById(R.id.inp_password);
        TextView result = findViewById(R.id.results);
        result.setText("");
        System.out.println(String.valueOf(pas.getText()));
        if(password.equals(pas.getText().toString()) && login.equals(log.getText().toString())){
            result.setText("Верно");
            result.setTextColor(getResources().getColor(R.color.green));
        }else{
            Intent i = new Intent(MainActivity.this,Registration.class);
            startActivityForResult(i,0);
        }
        log.setText("");
        pas.setText("");
    }
}