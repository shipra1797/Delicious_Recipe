package com.example.delicious_recipes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Layout2 extends Activity {

    public void onClick12(View view){
        Intent in1= new Intent(Layout2.this,Layout26.class);
        startActivity(in1);
    }
    public void onClick22(View view){
        Intent in2= new Intent(Layout2.this,Layout25.class);
        startActivity(in2);
    }
    public void onClick32(View view){
        Intent in3= new Intent(Layout2.this,Layout28.class);
        startActivity(in3);
    }
    public void onClick42(View view){
        Intent in4= new Intent(Layout2.this,Layout27.class);
        startActivity(in4);
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);
    }
}
