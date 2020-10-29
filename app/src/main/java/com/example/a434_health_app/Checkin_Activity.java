package com.example.a434_health_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Checkin_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkin_);


        Button mentalGoalsBtn = findViewById(R.id.mental_goal);

        mentalGoalsBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");
                startActivity(new Intent(getApplicationContext(), Mental_Checkin.class));
            }
        });

        Button physicalGoalsBtn = findViewById(R.id.physical_goal);

        physicalGoalsBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");
                startActivity(new Intent(getApplicationContext(), Physical_Checkin.class));
            }
        });

        Button nutriGoalsBtn = findViewById(R.id.nutrition_goal);

        nutriGoalsBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");
                startActivity(new Intent(getApplicationContext(), Nutri_Checkin.class));
            }
        });
    }
}

