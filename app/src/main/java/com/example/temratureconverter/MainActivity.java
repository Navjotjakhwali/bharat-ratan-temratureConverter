package com.example.temratureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
double fahrenite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText1=findViewById(R.id.edit1);
        TextView editText2=findViewById(R.id.edit2);
        Button button=findViewById(R.id.b1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            double celcius=Double.parseDouble(editText1.getText().toString());
           fahrenite=(celcius*1.8)+32;
           editText2.setText(String.valueOf(fahrenite));
            }
        });
    }
}