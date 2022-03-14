package com.example.appcalculadorav3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner spCalcular;
    EditText edtV1;
    EditText edtV2;
    EditText edtResp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtV1 = (EditText) findViewById(R.id.editValor1);
        edtV2 = (EditText) findViewById(R.id.editValor2);
        edtResp = (EditText) findViewById(R.id.editResposta) ;
        spCalcular = (Spinner) findViewById(R.id.spinner);

    }
    public void calcular(View v){
        double v1, v2, resp;
        if(spCalcular.getSelectedItemId()==0){
            Calculadora calc = new Calculadora(Double.parseDouble(edtV1.getText().toString()),Double.parseDouble(edtV2.getText().toString()));
            edtResp.setText(calc.formatar(calc.somar(), 2));
        }
        else if(spCalcular.getSelectedItemId()==1){
            Calculadora calc = new Calculadora(Double.parseDouble(edtV1.getText().toString()),Double.parseDouble(edtV2.getText().toString()));
            edtResp.setText(calc.formatar(calc.subtrair(), 2));
        }
        else if(spCalcular.getSelectedItemId()==2){
            Calculadora calc = new Calculadora(Double.parseDouble(edtV1.getText().toString()),Double.parseDouble(edtV2.getText().toString()));
            edtResp.setText(calc.formatar(calc.multiplicar(), 2));
        }
        else if(spCalcular.getSelectedItemId()==3){
            Calculadora calc = new Calculadora(Double.parseDouble(edtV1.getText().toString()),Double.parseDouble(edtV2.getText().toString()));
            edtResp.setText(calc.formatar(calc.dividir(), 2));
        }



    }
}