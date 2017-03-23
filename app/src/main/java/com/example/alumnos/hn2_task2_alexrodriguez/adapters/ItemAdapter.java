package com.example.alumnos.hn2_task2_alexrodriguez.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alumnos.hn2_task2_alexrodriguez.R;
import com.example.alumnos.hn2_task2_alexrodriguez.beans.ItemBean;

import java.util.ArrayList;
import java.util.List;



public class ItemAdapter extends ArrayAdapter<ItemBean> {
    private Context context;
    private int resource;
    private List<ItemBean> objects;


    public ItemAdapter(Context context, int resource, List<ItemBean> objects) {
        super(context, resource, objects);
        this.context=context ;
        this.resource = resource ;
        this.objects = objects ;
    }

    class  ViewHolder{
        ImageView foto ;
        TextView nombre ;

    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        ViewHolder viewHolder;

        if(view==null){
            viewHolder = new ViewHolder();
            view = LayoutInflater.from(context).inflate(resource,null);
            viewHolder.foto = (ImageView) view.findViewById(R.id.foto);
            viewHolder.nombre = (TextView) view.findViewById(R.id.txtItem);
            view.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) view.getTag();
        }

        ItemBean itemBean = objects.get(position);

        viewHolder.foto.setImageDrawable(ContextCompat.getDrawable(context,itemBean.getFoto()));
        viewHolder.nombre.setText(String.valueOf(itemBean.getNombrePersonaje()));
        return view;
    }

}
