package com.example.alumnos.hn2_task2_alexrodriguez.activities;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.example.alumnos.hn2_task2_alexrodriguez.R;
import com.example.alumnos.hn2_task2_alexrodriguez.fragment.DescripcionFragment;
import com.example.alumnos.hn2_task2_alexrodriguez.fragment.ObjetosFragment;
import com.example.alumnos.hn2_task2_alexrodriguez.fragment.PerfilFragment;
import com.example.alumnos.hn2_task2_alexrodriguez.fragment.PersonajesFragment;
import com.example.alumnos.hn2_task2_alexrodriguez.fragment.VersionFragment;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private Toolbar toolbar ;
    private DrawerLayout drawer ;
    private NavigationView navView ;
    private FragmentManager fm ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawer = (DrawerLayout) findViewById(R.id.drawer);
        navView = (NavigationView) findViewById(R.id.navView);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_action_menu);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        navView.setNavigationItemSelectedListener(this);

        fm = getSupportFragmentManager();
        fm.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                drawer.openDrawer(GravityCompat.START);
                break;
        }
        return true;
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){

            case R.id.item_perfil:
                PerfilFragment perfilFragment = PerfilFragment.newInstance();
                fm.beginTransaction().replace(R.id.container,perfilFragment).commit() ;
                break;

            case R.id.item_descripcion:
                DescripcionFragment descripcionFragment = DescripcionFragment.newInstance();
                fm.beginTransaction().replace(R.id.container,descripcionFragment).commit() ;
                break;

            case R.id.item_personajes:
                PersonajesFragment personajesFragment = PersonajesFragment.newInstance();
                fm.beginTransaction().replace(R.id.container,personajesFragment).commit() ;
                break;

            case R.id.item_objetos:
                ObjetosFragment objetosFragment = ObjetosFragment.newInstance();
                fm.beginTransaction().replace(R.id.container,objetosFragment).commit() ;
                break;

            case R.id.item_tips:
                break;

            case R.id.item_ajustes:
                VersionFragment versionFragment = VersionFragment.newInstance();
                fm.beginTransaction().replace(R.id.container,versionFragment).commit() ;
                break;

            case R.id.item_salir:
                break;

        }
        item.setChecked(true);
        getSupportActionBar().setTitle(item.getTitle());
        drawer.closeDrawers();

        return false;
    }
}
