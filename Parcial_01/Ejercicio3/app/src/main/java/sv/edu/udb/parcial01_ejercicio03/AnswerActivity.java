package sv.edu.udb.parcial01_ejercicio03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    private TextView tvNombre1;
    private TextView tvIsss1;
    private TextView tvAfp1;
    private TextView tvRenta1;
    private TextView tvSueldo1;
    private TextView tvNombre2;
    private TextView tvIsss2;
    private TextView tvAfp2;
    private TextView tvRenta2;
    private TextView tvSueldo2;
    private TextView tvNombre3;
    private TextView tvIsss3;
    private TextView tvAfp3;
    private TextView tvRenta3;
    private TextView tvSueldo3;
    private TextView tvMensaje;
    private TextView tvMayorSalario;
    private TextView tvMasTres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        tvNombre1 = (TextView)findViewById(R.id.txtViewNombre1);
        tvIsss1 = (TextView)findViewById(R.id.txtViewIsss1);
        tvAfp1 = (TextView)findViewById(R.id.txtViewAfp1);
        tvRenta1 = (TextView)findViewById(R.id.txtViewRenta1);
        tvSueldo1 = (TextView)findViewById(R.id.txtViewSueldo1);
        tvNombre2 = (TextView)findViewById(R.id.txtViewNombre2);
        tvIsss2 = (TextView)findViewById(R.id.txtViewIsss2);
        tvAfp2 = (TextView)findViewById(R.id.txtViewAfp2);
        tvRenta2 = (TextView)findViewById(R.id.txtViewRenta2);
        tvSueldo2 = (TextView)findViewById(R.id.txtViewSueldo2);
        tvNombre3 = (TextView)findViewById(R.id.txtViewNombre3);
        tvIsss3 = (TextView)findViewById(R.id.txtViewIsss3);
        tvAfp3 = (TextView)findViewById(R.id.txtViewAfp3);
        tvRenta3 = (TextView)findViewById(R.id.txtViewRenta3);
        tvSueldo3 = (TextView)findViewById(R.id.txtViewSueldo3);
        tvMensaje = (TextView)findViewById(R.id.txtViewMensaje);
        tvMayorSalario = (TextView)findViewById(R.id.txtViewMayorSalario);
        tvMasTres = (TextView)findViewById(R.id.txtViewMasTres);

        Bundle bundle = getIntent().getExtras();
        String nombre1 = bundle.getString("txtNombre1");
        String nombre2 = bundle.getString("txtNombre2");
        String nombre3 = bundle.getString("txtNombre3");
        Double horas1 = Double.parseDouble(bundle.getString("txtHoras1"));
        Double horas2 = Double.parseDouble(bundle.getString("txtHoras2"));
        Double horas3 = Double.parseDouble(bundle.getString("txtHoras3"));
        String cargo1 = bundle.getString("txtCargo1");
        String cargo2 = bundle.getString("txtCargo2");
        String cargo3 = bundle.getString("txtCargo3");

        Double salarioBase1 = 0.0;
        Double salarioBase2 = 0.0;
        Double salarioBase3 = 0.0;
        Double salarioLiquido1 = 0.0;
        Double salarioLiquido2 = 0.0;
        Double salarioLiquido3 = 0.0;

        Double descuentoIsss = 0.0525;
        Double descuentoAfp = 0.0688;
        Double descuentoRenta = 0.1;
        Double bonoGerente = 0.1;
        Double bonoAsistente  = 0.05;
        Double bonoSecretaria = 0.03;
        Double bonoGeneral = 0.02;

        if(horas1 > 160){salarioBase1 = ((horas1 - 160) * 11.50) + (160 * 9.75);}else{salarioBase1 = horas1 * 9.75;}
        if(horas2 > 160){salarioBase2 = ((horas2 - 160) * 11.50) + (160 * 9.75);}else{salarioBase2 = horas2 * 9.75;}
        if(horas3 > 160){salarioBase3 = ((horas3 - 160) * 11.50) + (160 * 9.75);}else{salarioBase3 = horas3 * 9.75;}

        Double descuentoIsss1 = salarioBase1 * descuentoIsss;
        Double descuentoIsss2 = salarioBase2 * descuentoIsss;
        Double descuentoIsss3 = salarioBase3 * descuentoIsss;
        Double descuentoAfp1 = salarioBase1 * descuentoAfp;
        Double descuentoAfp2 = salarioBase2 * descuentoAfp;
        Double descuentoAfp3 = salarioBase3 * descuentoAfp;
        Double descuentoRenta1 = salarioBase1 * descuentoRenta;
        Double descuentoRenta2 = salarioBase2 * descuentoRenta;
        Double descuentoRenta3 = salarioBase3 * descuentoRenta;

        salarioLiquido1 = salarioBase1 - (descuentoIsss1 + descuentoAfp1 + descuentoRenta1);
        salarioLiquido2 = salarioBase2 - (descuentoIsss2 + descuentoAfp2 + descuentoRenta2);
        salarioLiquido3 = salarioBase3 - (descuentoIsss3 + descuentoAfp3 + descuentoRenta3);

        Double salarioFinal1 = 0.0;
        Double salarioFinal2 = 0.0;
        Double salarioFinal3 = 0.0;

        Integer mayoresTres = 0;

        if(cargo1.toLowerCase() == "gerente" && cargo2.toLowerCase() == "asistente" && cargo3.toLowerCase() == "secretaria"){
            tvMensaje.setText("NO HAY BONOS");
        }else{
            if(cargo1.toLowerCase().equals("gerente")){
                salarioFinal1 = salarioLiquido1 + (salarioLiquido1*bonoGerente);
            }else if(cargo1.toLowerCase().equals("asistente")){
                salarioFinal1 = salarioLiquido1 + (salarioLiquido1*bonoAsistente);
            }else if(cargo1.toLowerCase() == "secretaria"){
                salarioFinal1 = salarioLiquido1 + (salarioLiquido1*bonoSecretaria);
            }else{
                salarioFinal1 = salarioLiquido1 + (salarioLiquido1*bonoGeneral);
            }

            if(cargo2.toLowerCase() == "gerente"){
                salarioFinal2 = salarioLiquido2 + (salarioLiquido2*bonoGerente);
            }else if(cargo2.toLowerCase() == "asistente"){
                salarioFinal2 = salarioLiquido2 + (salarioLiquido2*bonoAsistente);
            }else if(cargo2.toLowerCase() == "secretaria"){
                salarioFinal2 = salarioLiquido2 + (salarioLiquido2*bonoSecretaria);
            }else{
                salarioFinal2 = salarioLiquido2 + (salarioLiquido2*bonoGeneral);
            }

            if(cargo3.toLowerCase() == "gerente"){
                salarioFinal3 = salarioLiquido3 + (salarioLiquido3*bonoGerente);
            }else if(cargo3.toLowerCase() == "asistente"){
                salarioFinal3 = salarioLiquido3 + (salarioLiquido3*bonoAsistente);
            }else if(cargo3.toLowerCase() == "secretaria"){
                salarioFinal3 = salarioLiquido3 + (salarioLiquido3*bonoSecretaria);
            }else{
                salarioFinal3 = salarioLiquido3 + (salarioLiquido3*bonoGeneral);
            }
        }

        tvNombre1.setText(salarioBase1.toString());
        tvIsss1.setText(descuentoIsss1.toString());
        tvAfp1.setText(descuentoAfp1.toString());
        tvRenta1.setText(descuentoRenta1.toString());
        tvSueldo1.setText(salarioFinal1.toString());
        tvNombre2.setText(nombre2);
        tvIsss2.setText(descuentoIsss2.toString());
        tvAfp2.setText(descuentoAfp2.toString());
        tvRenta2.setText(descuentoRenta2.toString());
        tvSueldo2.setText(salarioFinal2.toString());
        tvNombre3.setText(nombre3);
        tvIsss3.setText(descuentoIsss3.toString());
        tvAfp3.setText(descuentoAfp3.toString());
        tvRenta3.setText(descuentoRenta3.toString());
        tvSueldo3.setText(salarioFinal3.toString());

        if(salarioFinal1 > salarioFinal2){
            if(salarioFinal1 > salarioFinal3){
                tvMayorSalario.setText(nombre1 + " tiene el mayor salario");
            }else{
                tvMayorSalario.setText(nombre3 + " tiene el mayor salario");
            }
        }else if(salarioFinal2 > salarioFinal1){
            if(salarioFinal2 > salarioFinal3){
                tvMayorSalario.setText(nombre2 + " tiene el mayor salario");
            }else{
                tvMayorSalario.setText(nombre3 + " tiene el mayor salario");
            }
        }else{
            tvMayorSalario.setText(nombre3 + " tiene el mayor salario");
        }

        if(salarioFinal1 >= 300){
            mayoresTres++;
        }

        if(salarioFinal2 >= 300){
            mayoresTres++;
        }

        if(salarioFinal3 >= 300){
            mayoresTres++;
        }

        tvMasTres.setText("Salarios mayores a $300: " + mayoresTres);
    }

    public void finalizar(View v){
        finish();
    }
}