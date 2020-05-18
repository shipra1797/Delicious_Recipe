package com.example.delicious_recipes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Layout3 extends Activity {

    public void onClick13(View view){
        Intent in1= new Intent(Layout3.this,Layout36.class);
        startActivity(in1);
    }
    public void onClick23(View view){
        Intent in2= new Intent(Layout3.this,Layout35.class);
        startActivity(in2);
    }
    public void onClick33(View view){
        Intent in3= new Intent(Layout3.this,Layout38.class);
        startActivity(in3);
    }
    public void onClick43(View view){
        Intent in4= new Intent(Layout3.this,Layout37.class);
        startActivity(in4);
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout3);
    }
}
