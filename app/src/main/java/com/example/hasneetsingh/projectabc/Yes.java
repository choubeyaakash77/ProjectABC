package com.example.hasneetsingh.projectabc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.sql.Time;

public class Yes extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yes);

        final TextView text= (TextView) findViewById(R.id.ambulance);

        Time t= new Time();

        text.setText("finding an ambulance near you and informing all members within 200 metres from you...");


        text.postDelayed(new Runnable() {
            public void run() {text.setVisibility(View.INVISIBLE);}}, 5000);

    }
}
