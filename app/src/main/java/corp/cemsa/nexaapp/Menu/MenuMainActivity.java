package corp.cemsa.nexaapp.Menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import corp.cemsa.nexaapp.AlarmaModulo.AlarmaMainActivity;
import corp.cemsa.nexaapp.BuscarPlaca.BuscarPlacaMainActivity;
import corp.cemsa.nexaapp.HomeMainActivity;
import corp.cemsa.nexaapp.R;

public class MenuMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_main);
    }

    public void Registro(View view) {
        Intent intent = new Intent(this, HomeMainActivity.class);
        startActivity(intent);
    }
    public void SearchPlaca(View view) {
        Intent intent = new Intent(this, BuscarPlacaMainActivity.class);
        startActivity(intent);
    }
    public void Alarma(View view) {
        Intent intent = new Intent(this, AlarmaMainActivity.class);
        startActivity(intent);
    }
}
