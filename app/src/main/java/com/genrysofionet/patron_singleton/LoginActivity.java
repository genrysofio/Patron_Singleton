package com.genrysofionet.patron_singleton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText    edtusuario, edtnombre, edtEdad;
    private Button      btnSingIn;

    private String  usuario, nombreComp;
    private Integer edad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initializeUiObjects();
        uiObjectsActions();
    }

    private void initializeUiObjects(){
        edtusuario = findViewById(R.id.login_activity_edt_nick_name);
        edtnombre = findViewById(R.id.login_activity_edt_full_name);
        edtEdad      = findViewById(R.id.login_activity_edt_age);
        btnSingIn       = findViewById(R.id.login_activity_btn_sign_in);
    }

    private void uiObjectsActions(){
        btnSingIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (infoCompleta()){
                    Patron_Singleton.getInformacion().setUsuario(usuario);
                    Patron_Singleton.getInformacion().setNombreCom(nombreComp);
                    Patron_Singleton.getInformacion().setEdadUsuario(edad);

                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                }
            }
        });
    }

    private boolean infoCompleta(){
        usuario    = edtusuario.getText().toString().trim();
        nombreComp    = edtnombre.getText().toString().trim();
        edad         = Integer.valueOf(edtEdad.getText().toString().trim());

        if (usuario.isEmpty() || nombreComp.isEmpty() || edad == null){
            if (usuario.isEmpty()) edtusuario.setError("ingrese usuario");
            if (nombreComp.isEmpty()) edtnombre.setError("ingrese nombre");
            if (edad == null)        edtEdad.setError("ingrese edad");
            return false;
        } else {
            return true;
        }
    }
}
