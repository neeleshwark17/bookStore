package com.assignment.bookstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CardView mCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCardView = findViewById(R.id._cardViewLogo);

        mCardView.setOnClickListener(view -> {
            Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, MainActivity2.class));
        });


    }
}