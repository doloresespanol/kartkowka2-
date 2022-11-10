package com.example.kartkowka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
public int licznik;
TextView textView;
Button losuj,zwieksz,zmniejsz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        losuj = findViewById(R.id.button3);
        zwieksz = findViewById(R.id.button4);
        zmniejsz = findViewById(R.id.button5);
        textView = findViewById(R.id.textView3);

        losuj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                licznik = (int)(Math.random()*6+1);
                textView.setText(String.valueOf(licznik));
                zwieksz.setVisibility(View.VISIBLE);
                zmniejsz.setVisibility(View.VISIBLE);
            }
        });

        zwieksz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                licznik++;
                textView.setText(String.valueOf(licznik));
                zwieksz.setVisibility(View.INVISIBLE);
                zmniejsz.setVisibility(View.INVISIBLE);
            }
        });

        zmniejsz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                licznik--;
                textView.setText(String.valueOf(licznik));
                zwieksz.setVisibility(View.INVISIBLE);
                zmniejsz.setVisibility(View.INVISIBLE);
            }
        });
    }
}