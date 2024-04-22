package ec.com.empresa.apputnutnvariosactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView lblDato1, lblDato2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        lblDato1 = findViewById(R.id.lblDato1);
        lblDato2 = findViewById(R.id.lblDato2);

        Bundle extras = getIntent().getExtras();

        lblDato1.setText( extras.getString("dato1") );
        lblDato2.setText( extras.getString("dato2") );
    }

    public void cmdRegresar_onClick(View v)
    {
        finish();
    }
}