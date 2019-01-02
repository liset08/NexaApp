package corp.cemsa.nexaapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import corp.cemsa.nexaapp.ListaEstados.ListaCargadoragment;
import corp.cemsa.nexaapp.ListaEstados.ListaEnTransporteFragment;
import corp.cemsa.nexaapp.ListaEstados.ListaIndividualFragment;
import corp.cemsa.nexaapp.Registro.EditEnTransporteFragment;
import corp.cemsa.nexaapp.Registro.HomeFragment;
import corp.cemsa.nexaapp.ListaEstados.ListaEstadosFragment;

public class HomeMainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_main);


setActionBar();

        android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.main_fragment, new ListaEstadosFragment());
        ft.commit();



    }


    public void EditTran(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();

        // Create FirstFragment with factory
        Fragment fragment = new EditEnTransporteFragment();

        // Replace content
        fragmentManager.beginTransaction().replace(R.id.main_fragment, fragment).addToBackStack("tag").commit();
    }

    public void GuardarReg(View view) {
        FragmentManager fragmentManager2 = getSupportFragmentManager();

        // Create FirstFragment with factory
        Fragment fragment2 = new ListaEstadosFragment();

        // Replace content
        fragmentManager2.beginTransaction().replace(R.id.main_fragment, new ListaEstadosFragment()).addToBackStack("tag").commit();


    }
    public void GuardarRegEdit(View view) {
        FragmentManager fragmentManager2 = getSupportFragmentManager();

        // Create FirstFragment with factory
        Fragment fragment2 = new ListaEstadosFragment();

        // Replace content
        fragmentManager2.beginTransaction().replace(R.id.main_fragment, new ListaEstadosFragment()).addToBackStack("tag").commit();


    }
    public void Recepcionado(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();

        // Create FirstFragment with factory
        Fragment fragment = new ListaIndividualFragment();

        // Replace content
        fragmentManager.beginTransaction().replace(R.id.content_list, fragment).addToBackStack("tag").commit();

    }
    public void EnCamino(View view) {
        FragmentManager fragmentManager4 = getSupportFragmentManager();

        // Create FirstFragment with factory
        Fragment fragment4 = new ListaEnTransporteFragment();

        // Replace content
        fragmentManager4.beginTransaction().replace(R.id.content_list, fragment4).addToBackStack("tag").commit();
    }
    public void Cargado(View view) {
        FragmentManager fragmentManager3 = getSupportFragmentManager();

        // Create FirstFragment with factory
        Fragment fragment3 = new ListaCargadoragment();

        // Replace content
        fragmentManager3.beginTransaction().replace(R.id.content_list, fragment3).addToBackStack("tag").commit();

    }
    private void setActionBar(){
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){

            case R.id.action_takepicture:
                // Get FragmentManager
                FragmentManager fragmentManager = getSupportFragmentManager();

                // Create FirstFragment with factory
                Fragment fragment = new HomeFragment();

                // Replace content
                fragmentManager.beginTransaction().replace(R.id.main_fragment, fragment).addToBackStack("tag").commit();
                break;

            case R.id.action_home:
                FragmentManager fragmentManager2 = getSupportFragmentManager();

                // Create FirstFragment with factory
                Fragment fragment2 = new ListaEstadosFragment();

                // Replace content
                fragmentManager2.beginTransaction().replace(R.id.main_fragment, fragment2).addToBackStack("tag").commit();
                break;
        }
        return super.onOptionsItemSelected(item);
    }


}
