package com.balarama.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void send_message(View view){
        Toast.makeText(this, "Sending Data from App...", Toast.LENGTH_SHORT).show();
    }
    public void receive_message(View view){
        Toast.makeText(this, "Receiving Data from App...", Toast.LENGTH_SHORT).show();
    }
    public void delete_message(View view){
        Toast.makeText(this, "Deleting Data from App...", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}