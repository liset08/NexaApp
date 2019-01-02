package corp.cemsa.nexaapp.Registro;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import corp.cemsa.nexaapp.R;


public class HomeFragment extends Fragment {



    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_home, container, false);

        EditText etp= (EditText) view.findViewById(R.id.etxt_p);
        EditText etp2= (EditText) view.findViewById(R.id.etxt_s);
        EditText etp3= (EditText) view.findViewById(R.id.etxt_t);
        EditText etp4 = (EditText) view.findViewById(R.id.etxt_c);
        EditText etp5 = (EditText) view.findViewById(R.id.etxt_q);
        EditText etp6 = (EditText) view.findViewById(R.id.etxt_e);


        etp.setFocusable(false);
        etp.setEnabled(false);


        etp2.setFocusable(false);
        etp2.setEnabled(false);


        etp3.setFocusable(false);
        etp3.setEnabled(false);

        etp4.setFocusable(false);
        etp4.setEnabled(false);

        etp5.setFocusable(false);
        etp5.setEnabled(false);

        etp6.setFocusable(false);
        etp6.setEnabled(false);

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
