package com.example.farras23.perhitunganskor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(3000);
                }catch(InterruptedException ex){
                    ex.printStackTrace();
                }finally {
                    startActivity(new Intent(SplashScreen.this,MainActivity.class));
                    finish();
                }
            }
        });
        thread.start();
    }
}

