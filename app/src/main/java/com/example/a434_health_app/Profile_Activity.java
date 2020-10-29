package com.example.a434_health_app;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Profile_Activity extends AppCompatActivity {

    String name,birthday,awards,interests, favSongs, stats;

    private Button backButton, saveButton;

    EditText nameInput;
    EditText birthdayInput;
    EditText awardsInput;
    EditText interestsInput;
    EditText favSongsInput;
    EditText statsInput;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        nameInput = (EditText) findViewById(R.id.profileName);
        birthdayInput = (EditText) findViewById(R.id.profileDOB);
        awardsInput = (EditText) findViewById(R.id.awards);
        interestsInput = (EditText) findViewById(R.id.profileInterests);
        favSongsInput = (EditText) findViewById(R.id.profilePlaylists);
        statsInput = (EditText) findViewById(R.id.profileStats);

        backButton = findViewById(R.id.backButton);
        saveButton = findViewById(R.id.saveButton);
        saveButton.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {
                    boolean flag = true;
                    name = nameInput.getText().toString();
                    birthday = birthdayInput.getText().toString();
                    if (birthday.charAt(2) != '/'){
                        flag = false;
                        showToast("Incorrect input of first /  in birthday " + birthday.charAt(2));
                    }
                    else if (birthday.charAt(5) != '/') {
                        flag = false;
                        showToast("Incorrect input of second / in birthday " + birthday.charAt(5));
                    }
                    else if (birthday.length() != 10) {
                        flag = false;
                        showToast("Incorrect birthday size");
                    }

                    awards = awardsInput.getText().toString();
                    interests = interestsInput.getText().toString();
                    favSongs = favSongsInput.getText().toString();
                    stats = statsInput.getText().toString();

                    if (flag) {
                        showToast("Your profile has been saved!");
                    }
                    else
                        showToast("Incorrect input");

                }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void showToast(String text){
        Toast.makeText(Profile_Activity.this, text, Toast.LENGTH_SHORT).show();
    }
}