package com.example.mycalculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     private EditText edit;
     private Button button;
     private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit= findViewById(R.id.edittext);
        button= findViewById(R.id.btn);

        textView= findViewById(R.id.answer);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double amount= Double.parseDouble(edit.getText().toString());
                amount=amount*75;
                textView.setText(amount+"");
            }
        });

    }
}