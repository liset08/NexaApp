package corp.cemsa.nexaapp.BuscarPlaca;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import corp.cemsa.nexaapp.HomeMainActivity;
import corp.cemsa.nexaapp.ListaEstados.ListaEstadosFragment;
import corp.cemsa.nexaapp.R;

public class BuscarPlacaMainActivity extends AppCompatActivity {

    EditText txtPlaca ;
    TextView txtmensaje ;
    String answerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_placa_main);

        txtPlaca = (EditText)findViewById(R.id.etxt_placa);
         answerText = txtPlaca.getText().toString();
setActionBar();
    }

    private void setActionBar(){
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }
    public void DetallePlaca(View view) {
        Intent intent = new Intent(this, DetalleLineChartActivity.class);
        startActivity(intent);
    }
    public void BuscarPlaca(View view) {
        txtmensaje = (TextView)findViewById(R.id.txt_mensaje);


        if (txtPlaca.getText().toString().equalsIgnoreCase("AOC123")) {
            FragmentManager fragmentManager2 = getSupportFragmentManager();

            // Create FirstFragment with factory
            Fragment fragment2 = new ListaPlacasFragment();

            // Replace content
            fragmentManager2.beginTransaction().replace(R.id.search_placa, fragment2).addToBackStack("tag").commit();
        }else {

            txtmensaje.setText("☹"+ " No tiene registros actuales ");
            txtmensaje.setTextColor(Color.BLACK);
        }



    }
}
