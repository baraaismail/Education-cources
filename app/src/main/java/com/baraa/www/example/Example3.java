package com.baraa.www.example;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Example3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example3);
    }

    public void goToNextpage(View view) {
        Context context = Example3.this;
        Class destinationActivity = Example4.class;
        Intent intent = new Intent(context, destinationActivity);
        startActivity(intent);

    }
}