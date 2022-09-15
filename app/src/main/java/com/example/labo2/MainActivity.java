package com.example.labo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
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

        etNom = (EditText) findViewById(R.id.editTextPersonName);
        etCourriel = (EditText) findViewById(R.id.editTextEmailAddress);
        etPhone = (EditText) findViewById(R.id.editTextPhone);
        etMdp = (EditText)  findViewById(R.id.editTextPassword);
        etConfirmerMdp = (EditText)  findViewById(R.id.editTextPasswordConfirmation);
        chkAfficher1 = (CheckBox) findViewById(R.id.checkBox);
        chkAfficher2 = (CheckBox) findViewById(R.id.checkBox2);
        chkAccepte = (CheckBox) findViewById(R.id.checkBox3);
        btnSauvegarder = (Button) findViewById(R.id.button3);
        btnQuitter = (Button) findViewById(R.id.button4);

        /*ImageView img = (ImageView) findViewById(R.id.iv_avatar);
        img.setImageResource(R.drawable.avatar);*/




        chkAfficher1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(b){
                    etMdp.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                }else{
                    etMdp.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                }


            }
        });

        chkAfficher2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    etConfirmerMdp.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                }else{
                    etConfirmerMdp.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                }

            }
        });
    }
}