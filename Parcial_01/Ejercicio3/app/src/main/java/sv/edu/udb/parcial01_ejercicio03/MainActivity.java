package sv.edu.udb.parcial01_ejercicio03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etNombre1;
    private EditText etApellido1;
    private EditText etCargo1;
    private EditText etHoras1;
    private EditText etNombre2;
    private EditText etApellido2;
    private EditText etCargo2;
    private EditText etHoras2;
    private EditText etNombre3;
    private EditText etApellido3;
    private EditText etCargo3;
    private EditText etHoras3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre1 = (EditText)findViewById(R.id.txtNombre1);
        etApellido1 = (EditText)findViewById(R.id.txtApellido1);
        etCargo1 = (EditText)findViewById(R.id.txtCargo1);
        etHoras1 = (EditText)findViewById(R.id.txtHoras1);
        etNombre2 = (EditText)findViewById(R.id.txtNombre2);
        etApellido2 = (EditText)findViewById(R.id.txtApellido2);
        etCargo2 = (EditText)findViewById(R.id.txtCargo2);
        etHoras2 = (EditText)findViewById(R.id.txtHoras2);
        etNombre3 = (EditText)findViewById(R.id.txtNombre3);
        etApellido3 = (EditText)findViewById(R.id.txtApellido3);
        etCargo3 = (EditText)findViewById(R.id.txtCargo3);
        etHoras3 = (EditText)findViewById(R.id.txtHoras3);
    }

    public void AnswerActivity(View v){
        if(Float.parseFloat(etHoras1.getText().toString()) < 0 || Float.parseFloat(etHoras2.getText().toString()) < 0 || Float.parseFloat(etHoras3.getText().toString()) < 0){
            Toast.makeText(MainActivity.this, "Las horas no pueden ser negativas", Toast.LENGTH_LONG).show();
        }else {
            Intent i = new Intent(this, AnswerActivity.class);
            i.putExtra("txtNombre1", etNombre1.getText().toString());
            i.putExtra("txtApellido1", etApellido1.getText().toString());
            i.putExtra("txtCargo1", etCargo1.getText().toString());
            i.putExtra("txtHoras1", etHoras1.getText().toString());
            i.putExtra("txtNombre2", etNombre2.getText().toString());
            i.putExtra("txtApellido2", etApellido2.getText().toString());
            i.putExtra("txtCargo2", etCargo2.getText().toString());
            i.putExtra("txtHoras2", etHoras2.getText().toString());
            i.putExtra("txtNombre3", etNombre3.getText().toString());
            i.putExtra("txtApellido3", etApellido3.getText().toString());
            i.putExtra("txtCargo3", etCargo3.getText().toString());
            i.putExtra("txtHoras3", etHoras3.getText().toString());
            startActivity(i);
        }
    }
}