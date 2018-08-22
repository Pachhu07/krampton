package com.aximo.krampton.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.aximo.krampton.R;

public class KTLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ktlogin);

        Button ktLoginAction = findViewById(R.id.ktLoginButton);
        ktLoginAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KTLoginActivity.this, KTDashboardActivity.class);
                startActivity(intent);
            }
        });
    }
}
