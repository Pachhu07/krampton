 package com.aximo.krampton.Activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.aximo.krampton.R;

 public class KTSplashActivity extends AppCompatActivity {
     private int progressStatus = 0;
     String Assessee_Id;
     private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();

        splash();
    }
     public void splash() {
         new Thread(new Runnable() {
             public void run() {
                 while (progressStatus < 100) {
                     progressStatus +=10;
                     handler.post(new Runnable() {
                         public void run() {

                         }
                     });
                     try {
                         Thread.sleep(200);
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                     if (progressStatus == 100) {
                        /* if(Assessee_Id.equals("")||Assessee_Id.equals(null)){*/
                             Intent i = new Intent(KTSplashActivity.this, KTLoginActivity.class);
                             startActivity(i);finish();
                      /*   }else{
                             Intent i = new Intent(Splashscreen.this, DashBoard.class);
                             startActivity(i);
                             finish();}*/
                     }
                 }
             }
         }).start();
     }
 }
