package com.baraa.www.example;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Example4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example4);
    }


    public void goToNextpage(View view) {
        Context context = Example4.this;
        Class destinationActivity = Example5.class;
        Intent intent = new Intent(context, destinationActivity);
        startActivity(intent);
    }
}