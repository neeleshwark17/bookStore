package com.assignment.bookstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class CheckOut extends AppCompatActivity {
    Button mSubmit;
    EditText mEmail, mAddress, mPhone, mName;
    String email, address, phone, name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_out);


        mSubmit = findViewById(R.id._submit);
        mSubmit.setOnClickListener(view -> {

            mName = findViewById(R.id._name);
            mEmail = findViewById(R.id._email);
            mAddress = findViewById(R.id._address);
            mPhone = findViewById(R.id._phone);

            /////Parse values from input fields
            name = mName.getText().toString();
            email = mEmail.getText().toString();
            address = mAddress.getText().toString();
            phone = mPhone.getText().toString();


            ////Set Errors if text boxes are empty
            if (TextUtils.isEmpty(name)) {
                mName.setError("Enter valid name");
            }
            if (TextUtils.isEmpty(email)) {
                mEmail.setError("Email cannot be empty");
            }
            if (!isValidMail(email)) {
                mEmail.setError("Invalid email");
            }

            if (TextUtils.isEmpty(address)) {
                mAddress.setError("Enter valid address");
            }
            if (TextUtils.isEmpty(phone)) {
                mPhone.setError("Phone cannot be empty");
            }
            if (!isValidMobile(phone)) {
                mPhone.setError("Invalid Phone");
            }


            /////Start activity if validation is clear
            if (TextUtils.isEmpty(name) || TextUtils.isEmpty(email) || TextUtils.isEmpty(address) || TextUtils.isEmpty(phone) || !isValidMobile(phone) || !isValidMail(email)) {
                Toast.makeText(this, "Fill Details", Toast.LENGTH_SHORT).show();
            } else {
                startActivity(new Intent(this, ThankYou.class));
            }
        });
    }

    //For checking valid emial id
    private boolean isValidMail(String email) {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }


    //For checking valid mobile number
    private boolean isValidMobile(String phone) {
        return android.util.Patterns.PHONE.matcher(phone).matches();
    }
}