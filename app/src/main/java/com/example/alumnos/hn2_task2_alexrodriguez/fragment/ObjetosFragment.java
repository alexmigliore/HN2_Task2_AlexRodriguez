package com.example.alumnos.hn2_task2_alexrodriguez.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.alumnos.hn2_task2_alexrodriguez.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ObjetosFragment extends Fragment {


    public ObjetosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_objetos, container, false);
    }

}
