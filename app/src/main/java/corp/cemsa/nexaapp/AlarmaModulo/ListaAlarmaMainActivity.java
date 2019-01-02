package corp.cemsa.nexaapp.AlarmaModulo;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import corp.cemsa.nexaapp.HomeMainActivity;
import corp.cemsa.nexaapp.R;

public class ListaAlarmaMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alarma_main);

        setActionBar();
    }

    public void MostrarReporteAlarma(View view) {
        Intent intent = new Intent(this, ReporteMainActivity.class);
        startActivity(intent);
    }

    private void setActionBar(){
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }
}
