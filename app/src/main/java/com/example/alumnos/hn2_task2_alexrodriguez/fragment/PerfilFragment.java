package com.example.alumnos.hn2_task2_alexrodriguez.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.alumnos.hn2_task2_alexrodriguez.preferencias.Preferencias;
import com.example.alumnos.hn2_task2_alexrodriguez.beans.UsuarioBean;
import com.example.alumnos.hn2_task2_alexrodriguez.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link PerfilFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class PerfilFragment extends Fragment {

    private OnFragmentInteractionListener mListener;
    private TextView txtUsuario ;
    private TextView txtNombre ;

    public PerfilFragment() {

    }

public static PerfilFragment newInstance () {return  new PerfilFragment(); }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_perfil, container, false);
        txtUsuario = (TextView) view.findViewById(R.id.txtUsuario);
        txtNombre = (TextView) view.findViewById(R.id.txtNombre);
        Preferencias preferencias = new Preferencias(getActivity()) ;
        UsuarioBean usuario = preferencias.getUsuario() ;
        txtUsuario.setText("Email: "+usuario.getEmail()) ;
        txtNombre.setText("Nombre: "+usuario.getNombre());
        return view;
    }



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
   /*     if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }*/
    }
    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }


}
