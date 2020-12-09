package com.example.authorization;

import androidx.annotation.ColorRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String login="1";
    String password="1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void checkInput(android.view.View v){
        TextView log = findViewById(R.id.input_login);
        TextView pas = findViewById(R.id.input_password);
        TextView result = findViewById(R.id.results);
        result.setText("");
        System.out.println(String.valueOf(pas.getText()));
        if(password.equals(pas.getText().toString()) && login.equals(log.getText().toString())){
            result.setText("Верно");
            result.setTextColor(getResources().getColor(R.color.green));
        }else{
            result.setText("Вы ошиблись в логине или пароле");
            result.setTextColor(getResources().getColor(R.color.red));
        }
        log.setText("");
        pas.setText("");
    }
}