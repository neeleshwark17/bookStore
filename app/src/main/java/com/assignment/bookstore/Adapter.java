package com.assignment.bookstore;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

import javax.xml.xpath.XPathFunctionResolver;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    ArrayList<ObjectClass> mArrayList;


    Adapter(ArrayList<ObjectClass> mArrayList) {
        this.mArrayList = mArrayList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ObjectClass objectClass = mArrayList.get(position);
        holder.bookAuthor.setText(objectClass.getmBookAuthor());
        holder.bookTitle.setText(objectClass.getmBookTitle());
        holder.bookIssueDate.setText(objectClass.getmBookIssueDate());
        holder.bookPrice.setText(objectClass.getmBookPrice());
        holder.bookIcon.setImageResource(objectClass.getmBookIcon());

        holder.itemView.setOnClickListener(view -> {
            Intent intent = new Intent(view.getContext(), BookDetails.class);
            intent.putExtra("BookAuthor", objectClass.getmBookAuthor());
            intent.putExtra("BookIssueDate", objectClass.getmBookIssueDate());
            intent.putExtra("BookPrice", objectClass.getmBookPrice());
            intent.putExtra("BookTitle", objectClass.getmBookTitle());
            intent.putExtra("BookIcon", objectClass.getmBookIcon());
            intent.putExtra("BookOverView",objectClass.getmOverView());
            view.getContext().startActivity(intent);
        });

    }


    @Override
    public int getItemCount() {
        return mArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView bookTitle;
        TextView bookIssueDate;
        TextView bookPrice;
        TextView bookAuthor;
        ImageView bookIcon;
        TextView bookOverView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            bookTitle = itemView.findViewById(R.id._bookTitle);
            bookAuthor = itemView.findViewById(R.id._bookAuthor);
            bookIcon = itemView.findViewById(R.id._bookIcon);
            bookIssueDate = itemView.findViewById(R.id._bookIssueDate);
            bookPrice = itemView.findViewById(R.id._bookPrice);
        }
    }
}
