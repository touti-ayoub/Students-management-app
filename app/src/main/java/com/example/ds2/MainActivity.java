package com.example.ds2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nom,classe;
    Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nom=findViewById(R.id.nom);
        classe=findViewById(R.id.classe);
        add=findViewById(R.id.add);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(nom.getText().toString())) {
                    Toast.makeText(MainActivity.this, "vous devez entrer un nom", Toast.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(classe.getText().toString())) {
                    Toast.makeText(MainActivity.this, "vous devez entrer un classe", Toast.LENGTH_SHORT).show();
                } else {

                    Intent i = new Intent(getApplicationContext(), StudentsActivity.class);
                    i.putExtra("nom", nom.getText().toString());
                    i.putExtra("classe", classe.getText().toString());
                    startActivity(i);
                }
            }


        });

    }
}