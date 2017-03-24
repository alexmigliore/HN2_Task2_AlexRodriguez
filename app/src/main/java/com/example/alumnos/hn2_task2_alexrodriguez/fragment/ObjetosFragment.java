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
import com.example.alumnos.hn2_task2_alexrodriguez.test.Datos;

import java.util.ArrayList;


public class ObjetosFragment extends Fragment {

    private ArrayList<ItemBean> objetos;
    private ListView lstObjetos ;


    public ObjetosFragment() {
        // Required empty public constructor
    }


    public static ObjetosFragment newInstance () {return  new ObjetosFragment(); }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        objetos = Datos.getObjetos();

        View view = inflater.inflate(R.layout.fragment_objetos, container, false);
        lstObjetos = (ListView) view.findViewById(R.id.lstObjetos) ;

        ItemAdapter adapternew = new ItemAdapter(getActivity(),R.layout.item, objetos) ;
        lstObjetos.setAdapter(adapternew);
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

