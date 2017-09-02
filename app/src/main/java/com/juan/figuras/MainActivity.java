package com.juan.figuras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RadioButton rCirculo, rCuadro, rCubo, rTriangulo;
    private Double perimetro, area, volumen;
    private EditText eLado, eLado1, eLado2, eLado3, eArista, eRadio;
    private TextView tCalculos;
    private Button bCalcular;
    private double lado, lado1, lado2, lado3, arista, radio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eLado= (EditText) findViewById(R.id.eLado);
        eLado1= (EditText) findViewById(R.id.eLado1);
        eLado2= (EditText) findViewById(R.id.eLado2);
        eLado3= (EditText) findViewById(R.id.eLado3);
        eArista= (EditText) findViewById(R.id.eArista);
        eRadio= (EditText) findViewById(R.id.eRadio);
        rCirculo=(RadioButton) findViewById(R.id.rCirculo);
        rCuadro=(RadioButton) findViewById(R.id.rCuadro);
        rCubo=(RadioButton) findViewById(R.id.rCubo);
        rTriangulo=(RadioButton) findViewById(R.id.rTriangulo);
        tCalculos= (TextView) findViewById(R.id.tCalculos);
        bCalcular= (Button) findViewById(R.id.bCalcular);

        bCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(rCirculo.isChecked()){
                    String Radio= eRadio.getText().toString();
                    if(Radio.isEmpty()){
                        tCalculos.setText("Faltan campos por llenar");
                    }
                    else{
                        double radio= Double.valueOf(eRadio.getText().toString());
                        area=3.14*radio*radio;
                        perimetro=2*3.14*radio;
                        tCalculos.setText("Área: "+area+" Perímetro: "+perimetro);
                    }

                }
                if(rCuadro.isChecked()){
                    String Lado= eLado.getText().toString();
                    if(Lado.isEmpty()){
                        tCalculos.setText("Faltan campos por completar.");
                    }
                    else{
                        double lado= Double.valueOf(eLado.getText().toString());
                        area=lado*lado;
                        perimetro=4*lado;
                        tCalculos.setText("Área: "+area+" Perímetro: "+perimetro);
                    }

                }
                if(rCubo.isChecked()){
                    String Arista= eArista.getText().toString();
                    if(Arista.isEmpty()){
                        tCalculos.setText("Faltan campos por llenar.");
                    }
                    else{
                        double arista= Double.valueOf(eArista.getText().toString());
                        area= 6*arista*arista;
                        perimetro=12*arista;
                        volumen=3*arista;
                        tCalculos.setText("Área: "+area+" Perímetro: "+perimetro+"\nVolumen: "+volumen);
                    }
                    }

                if(rTriangulo.isChecked()){
                    String Lad1, Lad2, Lad3;
                    Lad1= eLado1.getText().toString();
                    Lad2= eLado2.getText().toString();
                    Lad3= eLado3.getText().toString();
                    if (Lad1.isEmpty() || Lad2.isEmpty() || Lad3.isEmpty()){
                        tCalculos.setText("Faltan campos por completar");
                    }
                    else{
                        double lad1= Double.valueOf(eLado1.getText().toString());
                        double lad2= Double.valueOf(eLado2.getText().toString());
                        double lad3= Double.valueOf(eLado3.getText().toString());
                        double s= (lad1+lad2+lad3)/2;
                        double raiz= s*((s-lad1)*(s-lad2)*(s-lad3));
                        area= Math.sqrt(raiz);
                        perimetro= lad1+lad2+lad3;
                        tCalculos.setText("Área: "+area+" Perímetro: "+perimetro);
                    }

                }
            }
        });
}
}
