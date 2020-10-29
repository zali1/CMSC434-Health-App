package com.example.a434_health_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mental_Goal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mental__goal);

        //add page for this where they check boxes for what they want
        Button reduce_stress_button = findViewById(R.id.reduce_stress_button);

        reduce_stress_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");
                startActivity(new Intent(getApplicationContext(), Set_Stress_Goal_popup.class));
            }
        });

        //add page for this where they check boxes for what they want
        Button build_confidence_button = findViewById(R.id.build_confidence_button);

        build_confidence_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");
                startActivity(new Intent(getApplicationContext(), Set_Confidence_Goal_popup.class));
            }
        });
    }
}
