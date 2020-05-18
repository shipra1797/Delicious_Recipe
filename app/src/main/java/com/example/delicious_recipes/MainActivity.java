package com.example.delicious_recipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void onClick1(View view){
        Intent in1= new Intent(MainActivity.this,Layout.class);
        startActivity(in1);
    }
    public void onClick2(View view){
        Intent in2= new Intent(MainActivity.this,Layout2.class);
        startActivity(in2);
    }
    public void onClick17(View view){
        Intent in3= new Intent(MainActivity.this,Layout3.class);
        startActivity(in3);
    }
    public void onClick4(View view){
        Intent in4= new Intent(MainActivity.this,Layout4.class);
        startActivity(in4);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
