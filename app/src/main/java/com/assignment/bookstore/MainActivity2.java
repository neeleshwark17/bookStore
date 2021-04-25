package com.assignment.bookstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;


public class MainActivity2 extends AppCompatActivity {
    FrameLayout mFrameLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mFrameLayout = findViewById(R.id._frameLayout);

        getSupportFragmentManager().beginTransaction().add(R.id._frameLayout, new RecordsFragment()).commit();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}