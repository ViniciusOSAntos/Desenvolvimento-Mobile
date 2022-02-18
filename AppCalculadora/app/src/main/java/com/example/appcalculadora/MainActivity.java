package com.example.appcalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editV1, editV2, editResp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editV1 = (EditText)  findViewById(R.id.editValor1);
        editV2 = (EditText)  findViewById(R.id.editValor2);
        editResp = (EditText)  findViewById(R.id.editResposta);
    }
    public void somar(View v){
        double v1, v2, resp;
        v1 = Double.parseDouble(editV1.getText().toString());
        v2 = Double.parseDouble(editV2.getText().toString());

        resp = v1 + v2;

        editResp.setText(String.valueOf(resp));
    }
    public void subtracao(View v){
        double v1, v2, resp;
        v1 = Double.parseDouble(editV1.getText().toString());
        v2 = Double.parseDouble(editV2.getText().toString());

        resp = v1 - v2;

        editResp.setText(String.valueOf(resp));
    }
    public void multiplicacao(View v){
        double v1, v2, resp;
        v1 = Double.parseDouble(editV1.getText().toString());
        v2 = Double.parseDouble(editV2.getText().toString());

        resp = v1 * v2;

        editResp.setText(String.valueOf(resp));
    } public void divisao(View v){
        double v1, v2, resp;
        v1 = Double.parseDouble(editV1.getText().toString());
        v2 = Double.parseDouble(editV2.getText().toString());

        resp = v1 / v2;

        editResp.setText(String.valueOf(resp));
    }
}