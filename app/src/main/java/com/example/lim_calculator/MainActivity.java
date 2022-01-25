package com.example.lim_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText editTextVar1,editTextVar2;
    Button btnAdd,btnMinus,btnMultiply,btnDivide,btnModulo;
    TextView AnswerTxt;

    double var1,var2;








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //buttons
        btnAdd = findViewById(R.id.btnAdd);
        btnMinus = findViewById(R.id.btnMinus);
        btnDivide = findViewById(R.id.btnDivide);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnModulo = findViewById(R.id.btnModulo);



        //Answer text view
        AnswerTxt = findViewById(R.id.AnswerTxt);

        //creating button on-click listeners to make the buttons work
        btnAdd.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnModulo.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) { //this method is responsible for doing functions for on-click events

        //variable text boxes

        editTextVar1 = findViewById(R.id.editTextVar1);
        editTextVar2 = findViewById(R.id.editTextVar2);

        var1 = Double.parseDouble(editTextVar1.getText().toString());
        var2 = Double.parseDouble(editTextVar2.getText().toString());

        switch(v.getId()){
            case R.id.btnAdd:
                AnswerTxt.setText(Double.toString(var1 + var2));

                break;
            case R.id.btnMinus:
                AnswerTxt.setText(Double.toString(var1 - var2));

                break;
            case R.id.btnMultiply:
                AnswerTxt.setText(Double.toString(var1 * var2));

                break;
            case R.id.btnDivide:
                AnswerTxt.setText(Double.toString(var1 / var2));

                break;
            case R.id.btnModulo:
                AnswerTxt.setText(Double.toString(var1 % var2));

                break;
        }

    }


}