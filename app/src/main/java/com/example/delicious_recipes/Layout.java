package com.example.delicious_recipes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Layout extends Activity {
    public void onClick11(View view){
        Intent in1= new Intent(Layout.this,Layout6.class);
        startActivity(in1);
    }
    public void onClick21(View view){
        Intent in2= new Intent(Layout.this,Layout5.class);
        startActivity(in2);
    }
    public void onClick31(View view){
        Intent in3= new Intent(Layout.this,Layout8.class);
        startActivity(in3);
    }
    public void onClick41(View view){
        Intent in4= new Intent(Layout.this,Layout7.class);
        startActivity(in4);
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
    }
}
