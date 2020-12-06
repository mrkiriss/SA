package com.example.equation;

import android.app.Activity;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    // Вызывается при создании Активности
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Инициализирует Активность.
        setContentView(R.layout.activity_main);
    }

    /** Вызывается при нажатии пользователем на кнопку Решить */
    public void solveEquation(View view) {
        double a = Double.parseDouble( ((EditText)
                findViewById(R.id.coefficient_a)).getText().toString());
        double b = Double.parseDouble( ((EditText)
                findViewById(R.id.coefficient_b)).getText().toString());
        double c = Double.parseDouble( ((EditText)
                findViewById(R.id.coefficient_c)).getText().toString());
        double D=b*b-4*a*c;
        TextView result = (TextView) findViewById(R.id.result);
		if (a!=0 && b==0 && c==0 || a==0 && b!=0 && c==0){
			result.setText("Единственное решение: 0");
			return;
		}
        if (D<0){
            result.setText("Нет решений");
        }else if(D==0){
            if (a==0){
                result.setText(c==0?"Решением ялвяется любое число":"Нет решений");
            }else{
                result.setText("Единственное решение: "+String.valueOf(-b/(2*a)));
            }
        }else{
            if (a==0){
                result.setText("Единственное решение: "+String.valueOf(-c/b));
            }else{
                result.setText("x1 = "+String.valueOf((-b+Math.pow(D,0.5))/(2*a))+"\nx2 = "+String.valueOf((-b-Math.pow(D,0.5))/(2*a)));
            }
        }
    }

}