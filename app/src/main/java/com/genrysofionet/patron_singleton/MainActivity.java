package com.genrysofionet.patron_singleton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtUserNickName, txtUserFullName, txtUserAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeUiObjects();
        uiObjectsOutlets();
    }

    private void initializeUiObjects(){
        txtUserNickName = findViewById(R.id.main_activity_txt_nick_name);
        txtUserFullName = findViewById(R.id.main_activity_txt_full_name);
        txtUserAge      = findViewById(R.id.main_activity_txt_age);
    }

    private void uiObjectsOutlets(){
        Patron_Singleton patron=Patron_Singleton.getInformacion();
        txtUserNickName.setText(patron.getUsuario());
        txtUserFullName.setText(patron.getNombreCom());
        txtUserAge.setText(String.valueOf(patron.getEdadUsuario()));
    }
}
