package com.assignment.bookstore;

public class ObjectClass {
    String mBookTitle;
    String mBookAuthor;
    String mBookIssueDate;
    String mBookPrice;
    String mOverView;
    int mBookIcon;

    public ObjectClass(String bookTitle, String bookAuthor, String bookIssueDate, String bookPrice, int bookIcon, String OverView) {
        this.mBookTitle = bookTitle;
        this.mBookAuthor = bookAuthor;
        this.mBookIssueDate = bookIssueDate;
        this.mBookPrice = bookPrice;
        this.mOverView = OverView;
        this.mBookIcon = bookIcon;
    }

    public String getmBookTitle() {
        return mBookTitle;
    }

    public String getmBookAuthor() {
        return mBookAuthor;
    }

    public String getmBookIssueDate() {
        return mBookIssueDate;
    }

    public String getmBookPrice() {
        return mBookPrice;
    }

    public String getmOverView() {
        return mOverView;
    }

    public int getmBookIcon() {
        return mBookIcon;
    }

}
