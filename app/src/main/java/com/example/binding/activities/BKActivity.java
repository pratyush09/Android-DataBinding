package com.example.binding.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.binding.R;

/**
 * Created by pratyush on 6/21/16.
 */
public class BKActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bk);
        getSupportActionBar().setTitle(BKActivity.class.getSimpleName());

    }
}
