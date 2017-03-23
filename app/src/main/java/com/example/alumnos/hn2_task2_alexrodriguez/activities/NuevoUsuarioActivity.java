package com.example.alumnos.hn2_task2_alexrodriguez.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.example.alumnos.hn2_task2_alexrodriguez.preferencias.Preferencias;
import com.example.alumnos.hn2_task2_alexrodriguez.beans.UsuarioBean;
import com.example.alumnos.hn2_task2_alexrodriguez.R;

public class NuevoUsuarioActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editEmail, editNombre, editPass;
    private Button btnGuardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_usuario);

        editEmail = (EditText) findViewById(R.id.editEmail);
        editNombre = (EditText) findViewById(R.id.editNombre);
        editPass = (EditText) findViewById(R.id.editPass);

        btnGuardar = (Button) findViewById(R.id.btnGuardar);

        btnGuardar.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        String email = editEmail.getText().toString();
        String nombre = editNombre.getText().toString();
        String pass = editPass.getText().toString();


        if(email!=null && nombre!=null  && pass!=null  &&
                !email.isEmpty() && !nombre.isEmpty() &&  !pass.isEmpty()  ){
            //email formato correcto, pass y pass2 iguales
            UsuarioBean usuarioBean = new UsuarioBean(email, nombre, pass);


            Preferencias preferencias = new Preferencias(NuevoUsuarioActivity.this);
            preferencias.setUsuario(usuarioBean);

            Toast.makeText(NuevoUsuarioActivity.this,
                    "El usuario se ha guardado correctamente",
                    Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(NuevoUsuarioActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        }else{
            Toast.makeText(NuevoUsuarioActivity.this,
                    "Todos los datos son obligatorios",
                    Toast.LENGTH_SHORT).show();
        }
    }
}
