package com.example.parcial01_ejercicio02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;


public class AnswerActivity extends AppCompatActivity {
    private TextView tvVotos1;
    private TextView tvVotos2;
    private TextView tvVotos3;
    private TextView tvVotos4;
    private TextView tvPorcentaje1;
    private TextView tvPorcentaje2;
    private TextView tvPorcentaje3;
    private TextView tvPorcentaje4;
    private  TextView tvNulos;
    private TextView tvPorcentajeNulos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        tvVotos1 = (TextView)findViewById(R.id.txtViewVotos1);
        tvVotos2 = (TextView)findViewById(R.id.txtViewVotos2);
        tvVotos3 = (TextView)findViewById(R.id.txtViewVotos3);
        tvVotos4 = (TextView)findViewById(R.id.txtViewVotos4);
        tvPorcentaje1 = (TextView)findViewById(R.id.txtViewPorcentaje1);
        tvPorcentaje2 = (TextView)findViewById(R.id.txtViewPorcentaje2);
        tvPorcentaje3 = (TextView)findViewById(R.id.txtViewPorcentaje3);
        tvPorcentaje4 = (TextView)findViewById(R.id.txtViewPorcentaje4);
        tvNulos =(TextView)findViewById(R.id.txtViewNulos);
        tvPorcentajeNulos = (TextView) findViewById(R.id.txtViewPorcentajeNulos);
        Bundle bundle = getIntent().getExtras();
        String stringVotos = bundle.getString("txtvotos");
        String[] votos = stringVotos.split(",");
        Integer cantidadVotos1=0;
        Integer cantidadVotos2=0;
        Integer cantidadVotos3=0;
        Integer cantidadVotos4=0;
        Integer votosNulos = 0;
        for( int i= 0 ; i< votos.length ; i++){
            if(Integer.parseInt(votos[i]) == 1){
                cantidadVotos1++;
            }else if (Integer.parseInt(votos[i])==2){
                cantidadVotos2++;
            }else if(Integer.parseInt(votos[i])==3){
                cantidadVotos3++;
            }else if(Integer.parseInt(votos[i])==4){
                cantidadVotos4++;
            }else{
                votosNulos++;
            }
        }
        Integer numeroVotos = votos.length;
        String cantidadVotos = numeroVotos.toString();
        Float porcentaje = 100/Float.parseFloat(cantidadVotos);
        String porcentajeValor = porcentaje.toString();
        Float porcentajeVotos1=(cantidadVotos1)*Float.parseFloat(porcentajeValor);
        Float porcentajeVotos2=(cantidadVotos2)*Float.parseFloat(porcentajeValor);
        Float porcentajeVotos3=(cantidadVotos3)*Float.parseFloat(porcentajeValor);
        Float porcentajeVotos4=(cantidadVotos4)*Float.parseFloat(porcentajeValor);
        Float porcentajeVotosNulos=(votosNulos)*Float.parseFloat(porcentajeValor);

        tvVotos1.setText(cantidadVotos1.toString());
        tvVotos2.setText(cantidadVotos2.toString());
        tvVotos3.setText(cantidadVotos3.toString());
        tvVotos4.setText(cantidadVotos4.toString());
        tvPorcentaje1.setText((porcentajeVotos1.toString()+"%"));
        tvPorcentaje2.setText((porcentajeVotos2.toString()+"%"));
        tvPorcentaje3.setText((porcentajeVotos3.toString()+"%"));
        tvPorcentaje4.setText((porcentajeVotos4.toString()+"%"));
        tvNulos.setText(votosNulos.toString());
        tvPorcentajeNulos.setText((porcentajeVotosNulos.toString()+"%"));



    }
    public void finalizar(View v){
        finish();
    }
}