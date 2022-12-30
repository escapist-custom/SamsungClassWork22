package com.samsung.testwork171222;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.samsung.testwork171222.model.Product;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductActivity extends AppCompatActivity {

    //-------XML types of data-------
    // Views
    private EditText entName;
    private TextView textView;

    // Button
    private Button btnFndPrd;

    // Classical dates of data
    private String nameMean;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        entName = findViewById(R.id.entNamePr);
        btnFndPrd = findViewById(R.id.btnFndPrd);
        textView = findViewById(R.id.tv);
        List products = (List) getIntent().getSerializableExtra("Products");
        Product[] product = new Product[products.size()];
        for (int i = 0; i < product.length; i++) {
            product[i] = (Product) products.get(i);
        }
        btnFndPrd.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                for (int i = 0; i < product.length; i++) {
                    if (product[i].getName().equals(entName.getText().toString()))
                        textView.setText(
                            "Name: " + product[i].getName() + "\n" +
                            "Date in: " + product[i].getDateIn() + "\n" +
                            "Amount: " + product[i].getAmount() + "\n" +
                            "Price: " + product[i].getPrice()
                        );
                }
            }
        });
    }
}