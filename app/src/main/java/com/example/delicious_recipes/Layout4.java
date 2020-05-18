package com.example.delicious_recipes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Layout4 extends Activity {

    public void onClick14(View view){
        Intent in1= new Intent(Layout4.this,Layout46.class);
        startActivity(in1);
    }
    public void onClick24(View view){
        Intent in2= new Intent(Layout4.this,Layout45.class);
        startActivity(in2);
    }
    public void onClick34(View view){
        Intent in3= new Intent(Layout4.this,Layout48.class);
        startActivity(in3);
    }
    public void onClick44(View view){
        Intent in4= new Intent(Layout4.this,Layout47.class);
        startActivity(in4);
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout4);
    }
}
