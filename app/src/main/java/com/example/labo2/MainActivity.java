package com.example.labo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    EditText etNom;
    EditText etCourriel;
    EditText etPhone;
    EditText etMdp;
    EditText etConfirmerMdp;
    CheckBox chkAfficher1;
    CheckBox chkAfficher2;
    CheckBox chkAccepte;
    Button btnSauvegarder;
    Button btnQuitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNom = (EditText) findViewById()

        /*ImageView img = (ImageView) findViewById(R.id.iv_avatar);
        img.setImageResource(R.drawable.avatar);*/


    }
}