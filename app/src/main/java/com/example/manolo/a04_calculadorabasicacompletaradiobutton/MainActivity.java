package com.example.manolo.a04_calculadorabasicacompletaradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText et1, et2;
    private TextView tvResul;
    private RadioButton rbSuma, rbResta, rbMultiplicacion, rbDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        tvResul=(TextView)findViewById(R.id.tvResul);
        rbSuma=(RadioButton)findViewById(R.id.rbSuma);
        rbResta=(RadioButton)findViewById(R.id.rbResta);
        rbMultiplicacion=(RadioButton)findViewById(R.id.rbMultiplicacion);
        rbDivision=(RadioButton)findViewById(R.id.rbDivision);

    }

    public void operar(View v){
        if(rbSuma.isChecked()) {
            //Toast.makeText(this, "Suma", Toast.LENGTH_LONG).show();
            suma();
        }
        if(rbResta.isChecked()) {
            //Toast.makeText(this, "Resta", Toast.LENGTH_LONG).show();
            resta();
        }
        if(rbMultiplicacion.isChecked()) {
            //Toast.makeText(this, "Multiplicacion", Toast.LENGTH_LONG).show();
            multi();
        }
        if(rbDivision.isChecked()) {
            //Toast.makeText(this, "Division", Toast.LENGTH_LONG).show();
            divi();
        }
    }

    public void suma(){
        tvResul.setText(String.valueOf(Double.parseDouble(et1.getText().toString())+Double.parseDouble(et2.getText().toString())));
    }
    public void resta(){
        tvResul.setText(String.valueOf(Double.parseDouble(et1.getText().toString())-Double.parseDouble(et2.getText().toString())));
    }
    public void multi(){
        tvResul.setText(String.valueOf(Double.parseDouble(et1.getText().toString())*Double.parseDouble(et2.getText().toString())));
    }
    public void divi(){ //Si divido entre 0 Java devuelve Infinity
        if (et2.getText().toString().equals("0"))
            Toast.makeText(getApplicationContext(), "No se puede dividir entre 0", Toast.LENGTH_LONG).show();
        else
            tvResul.setText(String.valueOf(Double.parseDouble(et1.getText().toString())-Double.parseDouble(et2.getText().toString())));
    }
}
