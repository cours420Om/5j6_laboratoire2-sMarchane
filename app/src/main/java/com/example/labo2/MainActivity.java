package com.example.labo2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

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

        btnSauvegarder.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Context contexte = getApplicationContext();
                String texte = "Le profil est sauvegardé";
                int duree = Toast.LENGTH_LONG;

                Toast msg_toast = Toast.makeText(contexte, texte, duree);

                msg_toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
                msg_toast.show();

            }
        });

        btnQuitter.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                closeApp();
            }
        });
    }

    private void closeApp() {


        new AlertDialog.Builder(this).setMessage("Êtes-vous sûr de vouloir quitter l'application!")
                .setPositiveButton("Oui", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                .setNegativeButton("Non", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "Retour", Toast.LENGTH_SHORT).show();
                    }
                }).show();
    }


}