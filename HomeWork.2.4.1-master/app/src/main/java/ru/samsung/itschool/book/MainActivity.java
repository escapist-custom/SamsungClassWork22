package ru.samsung.itschool.book;

import static java.util.jar.Pack200.Packer.ERROR;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {
    // Fields of entering text
    EditText a = (EditText)findViewById(R.id.a);
    EditText b = (EditText)findViewById(R.id.b);
    EditText c = (EditText)findViewById(R.id.c);
    // Button "Calculate"
    Button cal = (Button)findViewById(R.id.run);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        solveEquation();
    }

    public void solveEquation() {
        TextView result = (TextView) findViewById(R.id.res);
        // Double meanings of fields in XML
        double da = Double.parseDouble(a.getText().toString());
        double db = Double.parseDouble(b.getText().toString());
        double dc = Double.parseDouble(c.getText().toString());
        double d = db * db - 4 * da * dc;
        if (d > 0) {
            double x1, x2;
            x1 = (-db + Math.sqrt(d)) / 2 * da;
            x2 = (-db - Math.sqrt(d)) / 2 * da;
            result.setText(x1 + " " + x2);
        } else if (d == 0) {
            double x;
            x = -db / (2 * da);
            result.setText(String.valueOf(x));
        } else {
            String res = "none";
            result.setText(res);
        }
    };
}
