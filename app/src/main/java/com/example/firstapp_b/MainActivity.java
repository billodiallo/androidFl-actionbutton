package com.example.firstapp_b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textViewNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = findViewById(R.id.fab);
        textViewNumber = findViewById(R.id.textViewNumber);
        fab.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
            int id = view.getId();
            if (id == R.id.fab) {
                String text = textViewNumber.getText().toString();
                int number = Integer.parseInt(text);
                int newNumber = number * 2;
                textViewNumber.setText(Integer.toString(newNumber));
                Toast.makeText(this,number + " change to " + newNumber , Toast.LENGTH_LONG).show();

            }
    }
}