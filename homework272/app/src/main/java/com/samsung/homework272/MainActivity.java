package com.samsung.homework272;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    StringBuilder login = new StringBuilder();
    StringBuilder password = new StringBuilder();
    Button btn_enter;
    EditText logField;
    EditText passField;
    TextView tv_res;
    String name;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login.append("hello_world");
        password.append("password");

        btn_enter = findViewById(R.id.btn_enter);
        logField = findViewById(R.id.login);
        passField = findViewById(R.id.password);
        tv_res = findViewById(R.id.tv_res);

        MyLis lis = new MyLis();
        btn_enter.setOnClickListener(lis);
        name = getIntent().getStringExtra(Registration.LOGIN);
        tv_res.setText(name);
    }

    class MyLis implements View.OnClickListener {
        @SuppressLint("SetTextI18n")
        @Override
        public void onClick(View view) {
            if (logField.getText().toString().equals(login.toString()) && passField.getText().toString().equals(password.toString())) {
                tv_res.setText("Right");
            } else {
                Intent intent = new Intent(MainActivity.this, Registration.class);
                startActivity(intent);
            }
        }
    }
}