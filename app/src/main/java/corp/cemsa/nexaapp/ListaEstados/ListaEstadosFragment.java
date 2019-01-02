package corp.cemsa.nexaapp.ListaEstados;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import corp.cemsa.nexaapp.HomeMainActivity;
import corp.cemsa.nexaapp.R;
import corp.cemsa.nexaapp.Registro.HomeFragment;

public class ListaEstadosFragment extends Fragment {

    public ListaEstadosFragment() {
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        android.support.v4.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.content_list, new ListaIndividualFragment());
        ft.commit();

  final View view = inflater.inflate(R.layout.fragment_lista_estados, container, false);
      /*BottomNavigationView bottomNavigationView = (BottomNavigationView)view.findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_home:
                        FragmentManager fragmentManager = getFragmentManager();

                        // Create FirstFragment with factory
                        Fragment fragment = new ListaIndividualFragment();

                        // Replace content
                        fragmentManager.beginTransaction().replace(R.id.content_list, fragment).addToBackStack("tag").commit();
                        break;
                    case R.id.menu_camera:
                        FragmentManager fragmentManager4 = getFragmentManager();

                        // Create FirstFragment with factory
                        Fragment fragment4 = new ListaEnTransporteFragment();

                        // Replace content
                        fragmentManager4.beginTransaction().replace(R.id.content_list, fragment4).addToBackStack("tag").commit();                        break;
                    case R.id.menu_search:
                        FragmentManager fragmentManager3 = getFragmentManager();

                        // Create FirstFragment with factory
                        Fragment fragment3 = new ListaCargadoragment();

                        // Replace content
                        fragmentManager3.beginTransaction().replace(R.id.content_list, fragment3).addToBackStack("tag").commit();
                        break;

                }
                return true;
            }
        });*/


        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();
    }


}
