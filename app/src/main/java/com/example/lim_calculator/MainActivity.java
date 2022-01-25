package com.example.lim_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText var1txt, var2txt;
    Button btnAdd, btnMinus, btnMultiply, btnDivide, btnModulo;
    TextView answerTxt;
    double variable1, variable2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnModulo.setOnClickListener(this);

        //text boxes
        var1txt = findViewById(R.id.editTextVar1);
        var2txt = findViewById(R.id.editTextVar2);
        //buttons
        btnAdd = findViewById(R.id.btnAdd);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        btnModulo = findViewById(R.id.btnModulo);
        //Answer
        answerTxt = findViewById(R.id.AnswerTxt);

        variable1 = Double.parseDouble(String.valueOf(var1txt.getText()));
        variable2 = Double.parseDouble(String.valueOf(var2txt.getText()));



    }
    @Override
    public void onClick(View v) {


        switch(v.getId()) {
            case R.id.btnAdd:
                answerTxt.setText(String.valueOf( variable1 + variable2 ));
                break;
            case R.id.btnMinus:
                answerTxt.setText(String.valueOf( variable1 - variable2 ));
                break;
            case R.id.btnMultiply:
                answerTxt.setText(String.valueOf(variable1 * variable2));
                break;
            case R.id.btnDivide:
                answerTxt.setText(String.valueOf(variable1 / variable2));
                break;
            case R.id.btnModulo:
                answerTxt.setText(String.valueOf(variable1 % variable2));
                break;
        }
    }
}