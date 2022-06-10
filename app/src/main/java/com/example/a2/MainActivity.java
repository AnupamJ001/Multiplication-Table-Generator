package com.example.a2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textview;
    private TextView editTextNumber;
    private TextView textview2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        textview=findViewById(R.id.textView);
        editTextNumber=findViewById(R.id.editTextNumber);
        textview2=findViewById(R.id.textView2);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Multiplication Table Generated", Toast.LENGTH_SHORT).show();
                String s = editTextNumber.getText().toString();
                int a = Integer.parseInt(s);
                textview2.setText(null);
                for(int i = 1;i<=10;i++) {
                    long b = a * i;
                    textview2.append(a + " * " + i + " = " + b + "\n");
                }
            }
        });

    }
}