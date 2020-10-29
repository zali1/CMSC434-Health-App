package com.example.a434_health_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Physical_Goal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physical_goal);

        //add page for this where they check boxes for what they want
        Button lose_weight_button = findViewById(R.id.lose_weight_button);

        lose_weight_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");
                startActivity(new Intent(getApplicationContext(), Set_Weight_Goal_Popup.class));
            }
        });

        //add page for this where they check boxes for what they want
        Button build_muscle_button = findViewById(R.id.build_muscle_button);

        build_muscle_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");
                startActivity(new Intent(getApplicationContext(), Set_Muscle_Goal_Popup.class));
            }
        });
    }
}

