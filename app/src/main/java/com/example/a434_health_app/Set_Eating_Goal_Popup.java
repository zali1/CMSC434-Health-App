package com.example.a434_health_app;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import androidx.annotation.Nullable;

public class Set_Eating_Goal_Popup extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.set_eating_goal_popup);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.8), (int)(height*.8));

    }
}