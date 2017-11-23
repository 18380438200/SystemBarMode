package com.example.systembar.systembarmode;

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

    public void setFullscreen(View view){
        startActivity(new Intent(this,SetFullscreenActivity.class));
    }

    public void setColor(View view){
        startActivity(new Intent(this,SetColorActivity.class));
    }

    public void setPic(View view){
        startActivity(new Intent(this,SetPicActivity.class));
    }

}
