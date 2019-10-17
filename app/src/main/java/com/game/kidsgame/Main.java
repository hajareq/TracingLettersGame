package com.game.kidsgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.e_mobadara.audiomanaging.AudioSettingsActivity;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void manageAudio(View view){
        Intent i = new Intent(this,AudioSettingsActivity.class);
        startActivity(i);
    }

    public void startGame(View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
