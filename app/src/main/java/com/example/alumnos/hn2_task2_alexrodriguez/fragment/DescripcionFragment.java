package com.example.alumnos.hn2_task2_alexrodriguez.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.alumnos.hn2_task2_alexrodriguez.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link DescripcionFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class DescripcionFragment extends Fragment {

    private OnFragmentInteractionListener mListener;
    private TextView txtDescripcion ;

    public DescripcionFragment() {
        // Required empty public constructor
    }
    public static DescripcionFragment newInstance () {return  new DescripcionFragment(); }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_descripcion, container, false);
        txtDescripcion = (TextView) view.findViewById(R.id.txtDescripcion);
        txtDescripcion.setText("Esta es la descripción del juego contara con 3 naves") ;
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
