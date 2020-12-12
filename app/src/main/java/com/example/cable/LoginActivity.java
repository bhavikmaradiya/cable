package com.example.cable;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.toolbox.StringRequest;
import com.example.cable.Model.Common;

public class LoginActivity extends AppCompatActivity {
    Button btnlogin;
    EditText etMobileNo, etPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        etMobileNo = findViewById(R.id.etMobile);
        etPassword = findViewById(R.id.etPassword);
        btnlogin = findViewById(R.id.btnlogin);


        btnlogin.setOnClickListener(v -> {
            if (etMobileNo.getText().toString().trim().length() != 10) {
                Toast.makeText(LoginActivity.this, "Enter valid mobile no", Toast.LENGTH_SHORT).show();
            } else if (etPassword.getText().toString().trim().isEmpty()) {
                Toast.makeText(LoginActivity.this, "Enter valid password", Toast.LENGTH_SHORT).show();
            } else {
                StringRequest request = new StringRequest(Common.RECIPIENT, response -> {
                    Toast.makeText(LoginActivity.this, response, Toast.LENGTH_SHORT).show();
                }, error -> Toast.makeText(LoginActivity.this, error.getMessage(), Toast.LENGTH_SHORT).show());

            }
        });


    }
}