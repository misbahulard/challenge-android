package com.example.workshop.starterworkshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    EditText etNama, etKelas, etEmail, etPass;
    Button btnKirim;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.Nama);
        etKelas = (EditText) findViewById(R.id.Kelas);
        etEmail = (EditText) findViewById(R.id.Email);
        etPass = (EditText) findViewById(R.id.Password);
        btnKirim = (Button) findViewById(R.id.login);

        btnKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, LoginActivitty.class);
                i.putExtra("nama", etNama.getText().toString());
                i.putExtra("kelas", etNama.getText().toString());
                i.putExtra("email", etNama.getText().toString());
                i.putExtra("password", etNama.getText().toString());
                startActivity(i);
            }
        });
    }
}
