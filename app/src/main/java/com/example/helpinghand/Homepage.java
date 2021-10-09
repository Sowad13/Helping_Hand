package com.example.helpinghand;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Homepage extends AppCompatActivity {

    ImageButton psycbtn, grpbtn, diarybtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        psycbtn = findViewById(R.id.psychome);
        grpbtn = findViewById(R.id.grphome);
        diarybtn = findViewById(R.id.diareyhome);

        psycbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity();

            }
        });

    }

    private void changeActivity(){
        Intent intent = new Intent(this, Messaging.class);
        startActivity(intent);
    }
}