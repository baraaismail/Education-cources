package com.baraa.www.example;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Example1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example1);
    }

    public void goToNextpage(View view){
        Context context = Example1.this;
        Class destinationActivity = Example2.class;
        Intent intent = new Intent(context,destinationActivity);
        startActivity(intent);
    }
}
