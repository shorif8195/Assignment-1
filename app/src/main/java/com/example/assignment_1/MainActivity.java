package com.example.assignment_1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button show_btn;
    private TextView text;
    private int n = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        show_btn = (Button) findViewById(R.id.btn);
        text = (TextView) findViewById(R.id.text2);
        Toast.makeText(getApplicationContext(),"Welcome",Toast.LENGTH_SHORT).show();
        show_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n++;
                text.setText("Clicked show btn "+n+" times");


            }
        });

    }
}