package com.example.authorization;

import androidx.annotation.ColorRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String login="admin";
    String password="god";
    String help="admin none";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void checkInput(android.view.View v){
        TextView log = findViewById(R.id.input_login);
        TextView pas = findViewById(R.id.input_password);
        if(password==pas.getText() && login==log.getText()){
            TextView result = findViewById(R.id.results);
            result.setText("Верно");
            result.setTextColor(getResources().getColor(R.color.green));
        }else{
            TextView result = findViewById(R.id.results);
            result.setText("Вы ошиблись в логине или пароле");
            result.setTextColor(getResources().getColor(R.color.red));
        }
        log.setText("");
        pas.setText("");
    }

}