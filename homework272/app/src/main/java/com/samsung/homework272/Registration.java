package com.samsung.homework272;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registration extends AppCompatActivity {
    public static final String LOGIN = "login";
    public static final String PASSWORD = "password";

    Button reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        reg = findViewById(R.id.reg);
        MyLis listener = new MyLis();
        reg.setOnClickListener(listener);
    }

    class MyLis implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            EditText logField = findViewById(R.id.login);
            EditText passField = findViewById(R.id.password);
            Intent intent;
            intent = new Intent(Registration.this, MainActivity.class);
            intent.putExtra(LOGIN, logField.getText().toString());
            intent.putExtra(PASSWORD, passField.getText().toString());
            startActivity(intent);
        }
    }
}