package com.example.workshop.starterworkshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivitty extends AppCompatActivity {
    TextView etNama, etKelas, etEmail, etPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activitty);

        etNama = (TextView) findViewById(R.id.Nama);
        etKelas = (TextView) findViewById(R.id.Kelas);
        etEmail = (TextView) findViewById(R.id.Email);
        etPass = (TextView) findViewById(R.id.Password);

        Bundle b = getIntent().getExtras();
        etNama.setText(b.getString("nama"));
        etKelas.setText(b.getString("nelas"));
        etEmail.setText(b.getString("email"));
        etPass.setText(b.getString("pass"));
    }
}

//asdasdasd