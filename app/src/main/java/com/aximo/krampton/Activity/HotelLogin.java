package com.aximo.krampton.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.aximo.krampton.R;

public class HotelLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_login);

        Button ktLoginAction = findViewById(R.id.ktLoginButton);
        ktLoginAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotelLogin.this, RigFormActivity.class);
                startActivity(intent);
            }
        });
    }
}
