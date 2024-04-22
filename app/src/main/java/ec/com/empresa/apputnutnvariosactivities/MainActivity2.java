package ec.com.empresa.apputnutnvariosactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    EditText txtDato1, txtdato2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtDato1 = findViewById(R.id.txtDato1);
        txtdato2 = findViewById(R.id.txtDato2);
    }

    public  void cmdRegresar_onClick(View v)
    {
        finish();
    }

    public void cmdAbrirActivity3_onClick(View v)
    {
        Intent i3 = new Intent(this, MainActivity3.class);

        i3.putExtra("dato1", txtDato1.getText().toString());
        i3.putExtra("dato2", txtdato2.getText().toString());

        startActivity(i3);
    }
}