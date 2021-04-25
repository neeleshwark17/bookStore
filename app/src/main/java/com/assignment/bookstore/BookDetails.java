package com.assignment.bookstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.widgets.ChainHead;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class BookDetails extends AppCompatActivity {
    String BookTitle, BookAuthor, BookIssueDate, BookPrice,BookOverView;
    Button mCheckOut;
    int BookIcon;

    ImageView imageView;
    TextView Author, Title, Price, Date,OverView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_details);

        //////Getting the resources from previous activity
        BookTitle = getIntent().getStringExtra("BookTitle");
        BookAuthor = getIntent().getStringExtra("BookAuthor");
        BookIssueDate = getIntent().getStringExtra("BookIssueDate");
        BookPrice = getIntent().getStringExtra("BookPrice");
        BookIcon = getIntent().getIntExtra("BookIcon", 0);
        BookOverView=getIntent().getStringExtra("BookOverView");
        /////Objects Definition
        imageView = findViewById(R.id._bookIcon);
        Author = findViewById(R.id._bookAuthor);
        Title = findViewById(R.id._bookTitle);
        Price = findViewById(R.id._bookPrice);
        Date = findViewById(R.id._bookIssueDate);
        OverView=findViewById(R.id._bookOverView);


        ////Setting the Resources of the book details
        imageView.setImageResource(BookIcon);
        Author.setText(BookAuthor);
        Title.setText(BookTitle);
        Price.setText(BookPrice);
        Date.setText(BookIssueDate);
        OverView.setText(BookOverView);


        ////Listener for starting activity
        mCheckOut = findViewById(R.id._checkOutBtn);
        mCheckOut.setOnClickListener(view -> {
            startActivity(new Intent(this, CheckOut.class));
        });
    }
}