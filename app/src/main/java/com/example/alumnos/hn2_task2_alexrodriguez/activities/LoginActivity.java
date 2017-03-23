package com.example.alumnos.hn2_task2_alexrodriguez.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.alumnos.hn2_task2_alexrodriguez.preferencias.Preferencias;
import com.example.alumnos.hn2_task2_alexrodriguez.beans.UsuarioBean;
import com.example.alumnos.hn2_task2_alexrodriguez.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editEmail, editPass;
    private Button btnEnviar;
    private Button btnNuevo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Preferencias preferencias = new Preferencias(LoginActivity.this);
        if (preferencias.isLogin() == false) {

            editEmail = (EditText) findViewById(R.id.editEmail);
            editPass = (EditText) findViewById(R.id.editPass);

            btnEnviar = (Button) findViewById(R.id.btnEnviar);
            btnNuevo = (Button) findViewById(R.id.btnNuevo);

            btnEnviar.setOnClickListener(this);
            btnNuevo.setOnClickListener(this);
        } else {
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btnEnviar: //login
                //validar datos
                String email = editEmail.getText().toString();
                String pass = editPass.getText().toString();
                if (email != null && pass != null && !email.isEmpty() && !pass.isEmpty()) {
                    Preferencias preferencias = new Preferencias(LoginActivity.this);
                    UsuarioBean usuarioBean = preferencias.getUsuario();
                    Log.d("LoginActivity","onClick: preferencias: "+usuarioBean.toJson());
                    if (usuarioBean.getEmail() != null) {
                        if (email.equals(usuarioBean.getEmail()) && pass.equals(usuarioBean.getPass())) {

                            preferencias.setLogin(true);
                            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                            startActivity(intent);
                            finish();
                        } else {
                            Toast.makeText(LoginActivity.this, "Datos incorrectos", Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        Toast.makeText(LoginActivity.this, "No existe el usuario", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(LoginActivity.this, "Datos obligatorios", Toast.LENGTH_SHORT).show();
                }

                break;

            case R.id.btnNuevo:
                Intent intent = new Intent(LoginActivity.this, NuevoUsuarioActivity.class);
                startActivity(intent);
                break;
        }


    }
}
