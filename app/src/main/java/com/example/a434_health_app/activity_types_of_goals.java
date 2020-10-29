package com.example.a434_health_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

public class activity_types_of_goals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_types_of_goals);




        Button addMentslGoalsButton = findViewById(R.id.mental_goal);

        addMentslGoalsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");
                startActivity(new Intent(getApplicationContext(), Mental_Goal.class));
            }
        });

        Button addPhysicalGoalsButton = findViewById(R.id.physical_goal);

        addPhysicalGoalsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");
                startActivity(new Intent(getApplicationContext(), Physical_Goal.class));
            }
        });

        Button addNutritionalGoalsButton = findViewById(R.id.nutrition_goal);

        addNutritionalGoalsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");
                startActivity(new Intent(getApplicationContext(), Nutrition_Goal.class));
            }
        });
    }



}
