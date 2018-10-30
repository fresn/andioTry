package com.example.yimingma.andiotry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickLunch(View view){
        Intent AutioRecoder = new Intent(this,AudioRecordTest.class);
        startActivity(AutioRecoder);
    }
}
