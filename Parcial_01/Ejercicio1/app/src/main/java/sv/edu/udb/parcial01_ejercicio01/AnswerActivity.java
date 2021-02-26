package sv.edu.udb.parcial01_ejercicio01;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.os.Bundle;

public class AnswerActivity extends AppCompatActivity {

    private TextView tvX1;
    private TextView tvX2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        tvX1=(TextView)findViewById(R.id.txtViewX1);
        tvX2=(TextView)findViewById(R.id.txtViewX2);

        Bundle bundle = getIntent().getExtras();
        String valueA = bundle.getString("txtA");
        String valueB = bundle.getString("txtB");
        String valueC = bundle.getString("txtC");

        Double numberA = Double.parseDouble(valueA);
        Double numberB = Double.parseDouble(valueB);
        Double numberC = Double.parseDouble(valueC);

        Double raiz = Math.pow(numberB,2) - 4 * numberA * numberC;

        Double x1 = (-numberB + Math.sqrt(raiz)) / 2*numberA;
        Double x2 = (-numberB - Math.sqrt(raiz)) / 2*numberA;

        tvX1.setText(x1.toString());
        tvX2.setText(x2.toString());
    }

    public void finalizar(View v){
        finish();
    }
}