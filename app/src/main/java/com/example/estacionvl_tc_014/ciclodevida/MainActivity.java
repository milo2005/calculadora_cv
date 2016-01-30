package com.example.estacionvl_tc_014.ciclodevida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    final String TAG = "ciclovida";

    EditText numero1, numero2;
    TextView resultado;
    Button sumar, restar, div, mul;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Asocia el Layout a el Activity
        setContentView(R.layout.activity_main);
        Log.i("ciclovida", "Paso por OnCreate");


        numero1 = (EditText) findViewById(R.id.numero1);
        numero2 = (EditText) findViewById(R.id.numero2);
        resultado = (TextView) findViewById(R.id.resultado);
        sumar = (Button) findViewById(R.id.sumar);
        restar = (Button) findViewById(R.id.restar);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);


        sumar.setOnClickListener(this);
        restar.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);


    }

    //region Ciclo de Vida
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ciclovida", "Paso por OnStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: Entro en onResume");
    }

    @Override
    protected void onPause() {
        Log.i(TAG, "onPause: Entro en onPause");

        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i(TAG, "onStop: Entro en onStop");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart: Entro en onRestart");
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG, "onDestroy: Entro en onDestroy");
        super.onDestroy();

    }
    //endregion

    @Override
    public void onClick(View v) {

        String n1 = numero1.getText().toString();
        String n2 = numero2.getText().toString();

        int ni1 = Integer.parseInt(n1);
        int ni2 = Integer.parseInt(n2);
        int r = 0;

        switch(v.getId()){
            case R.id.sumar:
                r = ni1 + ni2;
                break;
            case R.id.restar:
                r = ni1 - ni2;
                break;
            case R.id.div:
                r = ni1 / ni2;
                break;
            case R.id.mul:
                r = ni1 * ni2;
                break;
        }

        resultado.setText(""+r);

    }
}
