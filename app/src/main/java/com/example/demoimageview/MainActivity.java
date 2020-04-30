package com.example.demoimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView ivDay2, iv3, iv4, iv5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivDay2 = findViewById(R.id.imageView2);
        iv3 = findViewById(R.id.imageView3);
        iv4 = findViewById(R.id.imageView4);
        iv5 = findViewById(R.id.imageView5);
        ivDay2.setImageResource(R.drawable.day2);
        iv3.setImageResource(R.drawable.day3);
        iv4.setImageResource(R.drawable.day4);
        iv5.setImageResource(R.drawable.day5);
    }
}
