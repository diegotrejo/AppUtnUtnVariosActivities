package ec.com.empresa.apputnutnvariosactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cmdOpenActivity_onClick(View v)
    {
        Intent i = new Intent( this, MainActivity2.class);
        startActivity(i);
    }
}