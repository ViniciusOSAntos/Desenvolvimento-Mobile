package com.example.appcalculadorav2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    EditText edtValor1, edtValor2, edtResultado;
    RadioButton rbSomar, rbDiminuir, rbMultiplicar, rbDividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtValor1 = (EditText) findViewById(R.id.editText1);
        edtValor2 = (EditText) findViewById(R.id.editText2);
        edtResultado = (EditText) findViewById(R.id.editResultado);

        rbSomar = (RadioButton) findViewById(R.id.radioSomar);
        rbDiminuir = (RadioButton) findViewById(R.id.radioDiminuir);
        rbMultiplicar = (RadioButton) findViewById(R.id.radioMultiplicar);
        rbDividir = (RadioButton) findViewById(R.id.radioDividir);
    }

    public void calcular(View v){
        double v1, v2, resp;
        v1 = Double.parseDouble(edtValor1.getText().toString());
        v2 = Double.parseDouble(edtValor2.getText().toString());

        if(rbSomar.isChecked()){
            resp = v1 + v2;
        }else if(rbDiminuir.isChecked()){
            resp = v1 - v2;
        }else if(rbMultiplicar.isChecked()){
            resp = v1 * v2;
        }else{
            resp = v1 / v2;
        }

        edtResultado.setText(String.valueOf(resp));
    }


}