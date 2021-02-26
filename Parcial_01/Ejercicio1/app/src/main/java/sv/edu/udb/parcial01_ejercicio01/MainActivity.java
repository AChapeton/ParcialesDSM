package sv.edu.udb.parcial01_ejercicio01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private EditText etA;
    private EditText etB;
    private EditText etC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etA=(EditText)findViewById(R.id.txtA);
        etB=(EditText)findViewById(R.id.txtB);
        etC=(EditText)findViewById(R.id.txtC);
    }

    public void AnswerActivity(View v){
        Intent i = new Intent(this, AnswerActivity.class);
        i.putExtra("txtA", etA.getText().toString());
        i.putExtra("txtB", etB.getText().toString());
        i.putExtra("txtC", etC.getText().toString());
        startActivity(i);
    }
}