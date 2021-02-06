package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText eName;
    private EditText ePassword;
    private Button eLogin;

    private String Username = "admin";
    private String Password = "password";

    boolean isValid = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eName = findViewById(R.id.etName);
        ePassword = findViewById(R.id.etPassword);
        eLogin = findViewById(R.id.btnLogin);

        eLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputName = eName.getText().toString();
                String inputPassword = ePassword.getText().toString();

                if ((inputName.isEmpty() || inputPassword.isEmpty())) {
                    Toast.makeText(v.getContext(), "Error, blank fields!", Toast.LENGTH_SHORT).show();
                } else {
                    isValid = validate(inputName, inputPassword);

                    if (!isValid) {
                        Toast.makeText(v.getContext(), "Incorrect Credentials!", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(v.getContext(), "Success!", Toast.LENGTH_SHORT).show();

                        Intent intent = new Intent(MainActivity.this, HomePageActivity.class);
                        startActivity(intent);
                    }
                }
            }
        });
    }

    boolean validate(String name, String password) {
        if (name.equals(Username) && password.equals(Password)) {
            return true;
        }

        return false;
    }

    static String usernameChecker(String name) {
        if (name.equals("admin")) {
            return name;
        }

        return "Wrong";
    }

    static String passwordChecker(String password) {
        if (password.equals("password")) {
            return password;
        }
        return "Wrong";
    }
}