package com.samsung.testwork171222;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.samsung.testwork171222.model.Product;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final String PRODUCT = "PRODUCT";

    //-------XML dates of data-------
    // Buttons
    private Button btAddProd, btSrcProd;

    // Views
    private EditText nameProd, dateInProd, amountOfProduct, priceOfProduct;

    // Classical types of data
    private List<Product> products = new ArrayList<Product>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btAddProd = findViewById(R.id.btnAddProd);
        btSrcProd = findViewById(R.id.btnSrcPrd);

        nameProd = findViewById(R.id.prod);
        dateInProd = findViewById(R.id.dateIn);
        amountOfProduct = findViewById(R.id.amount);
        priceOfProduct = findViewById(R.id.price);

        btAddProd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product product = new Product(
                        nameProd.getText().toString(),
                        dateInProd.getText().toString(),
                        Integer.parseInt(amountOfProduct.getText().toString()),
                        Integer.parseInt(priceOfProduct.getText().toString())
                );
                Log.e(PRODUCT, product.toString());
                products.add(product);
            }
        });

        btSrcProd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ProductActivity.class);
                intent.putExtra("Products", (Serializable) products);
                startActivity(intent);
            }
        });
    }
}