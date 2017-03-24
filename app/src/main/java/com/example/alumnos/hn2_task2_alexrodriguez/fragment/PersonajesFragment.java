package com.example.alumnos.hn2_task2_alexrodriguez.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.alumnos.hn2_task2_alexrodriguez.R;
import com.example.alumnos.hn2_task2_alexrodriguez.adapters.ItemAdapter;
import com.example.alumnos.hn2_task2_alexrodriguez.beans.ItemBean;
import com.example.alumnos.hn2_task2_alexrodriguez.beans.PersonajeBean;
import com.example.alumnos.hn2_task2_alexrodriguez.test.Datos;

import java.util.ArrayList;


public class PersonajesFragment extends Fragment {


    private ArrayList<ItemBean> personajes;
    private ListView lstpersonajes ;

    public PersonajesFragment() {
        // Required empty public constructor
    }

    public static PersonajesFragment newInstance () {return  new PersonajesFragment(); }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        personajes = Datos.getPersonajes();

        View view = inflater.inflate(R.layout.fragment_personajes, container, false);
        lstpersonajes = (ListView) view.findViewById(R.id.lstpersonajes) ;

        ItemAdapter adapternew = new ItemAdapter(getActivity(),R.layout.item, personajes) ;
        lstpersonajes.setAdapter(adapternew);
        return view ;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }
}
