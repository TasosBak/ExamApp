package com.example.user.examapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState == null){
            MerchantFragment mainFragment = new MerchantFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.activity_main, mainFragment, null).commit();
        }
    }
}

