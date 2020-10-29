package com.example.a434_health_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Nutrition_Goal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition__goal);

        //add page for this where they check boxes for what they want
        Button improve_cooking_button = findViewById(R.id.improve_cooking_button);

        improve_cooking_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");
                startActivity(new Intent(getApplicationContext(), Set_Cooking_Goal_popup.class));
            }
        });

        //add page for this where they check boxes for what they want
        Button healthy_eating_button = findViewById(R.id.healthy_eating_button);

        healthy_eating_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");
                startActivity(new Intent(getApplicationContext(), Set_Eating_Goal_Popup.class));
            }
        });
    }
}

