package corp.cemsa.nexaapp.Registro;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Spinner;

import corp.cemsa.nexaapp.HomeMainActivity;
import corp.cemsa.nexaapp.R;


public class EditEnTransporteFragment extends Fragment {

    public EditEnTransporteFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view =   inflater.inflate(R.layout.fragment_edit_en_transporte, container, false);
        EditText etp= (EditText) view.findViewById(R.id.etxt_o);
        Spinner etp2= (Spinner) view.findViewById(R.id.etxt_r);
        EditText etp3= (EditText) view.findViewById(R.id.etxt_sg);
        EditText etp4 = (EditText) view.findViewById(R.id.etxt_sa);
        EditText etp5 = (EditText) view.findViewById(R.id.etxt_sb);
        EditText etp6 = (EditText) view.findViewById(R.id.etxt_sc);

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
