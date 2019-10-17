package com.game.kidsgame;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.ensias_auth_library.FoxyAuth;
import com.game.kidsgame.Arab.ArGameFirst;
import com.game.kidsgame.English.EnGameFirst;
import com.game.kidsgame.French.FrGameFirst;

public class MainActivity extends AppCompatActivity {

    ObjectAnimator welcomeHeight, welcomeLength,welcomeDown, frHeight, frLength, arHeight,arLength,enHeight,enLength ;
    public static boolean soundON = true;
    int play=0;
    private ImageView soundControl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //FoxyAuth.emerge(this,MainActivity.class);

        startService(new Intent(MainActivity.this, SoundService.class));
        soundControl = findViewById(R.id.soundControl);
        soundControl.setImageResource(R.mipmap.sound);
        if(soundON){
            soundControl.setImageResource(R.mipmap.sound);
            soundControl.refreshDrawableState();
            play = 0;
        }

        soundControl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play++;
                if(play%2!=0) {
                    soundControl.setImageResource(R.mipmap.nosound);
                    soundControl.refreshDrawableState();
                    SoundService.getPlayer().pause();
                    soundON = false;

                }
                else {
                    soundControl.setImageResource(R.mipmap.sound);
                    soundControl.refreshDrawableState();
                    SoundService.getPlayer().start();
                    soundON = true;

                }



            }
        });
        ImageView welcome = findViewById(R.id.welcome);
        ImageView arabe = findViewById(R.id.arabe);
        ImageView anglais = findViewById(R.id.anglais);
        ImageView francais = findViewById(R.id.francais);


        welcome.setTranslationY(-2000f);
        welcome.setImageResource(R.mipmap.welcome);
        welcome.animate().translationYBy(2000f).setDuration(2000);
        welcomeLength =  ObjectAnimator.ofFloat(welcome, "scaleX", 0.9f);
        welcomeHeight = ObjectAnimator.ofFloat(welcome, "scaleY", 1.1f);
        welcomeHeight.setDuration(3000);
        welcomeLength.setDuration(3000);
        welcomeHeight.setRepeatCount(ValueAnimator.INFINITE);
        welcomeLength.setRepeatCount(ValueAnimator.INFINITE);
        welcomeHeight.setRepeatMode(ValueAnimator.REVERSE);
        welcomeLength.setRepeatMode(ValueAnimator.REVERSE);
        AnimatorSet welcomeAnimation = new AnimatorSet();
        welcomeAnimation.play(welcomeHeight).with(welcomeLength);
        welcomeAnimation.start();

        welcomeDown =  ObjectAnimator.ofFloat(welcome, "translationY", 2000f);
        welcomeDown.setDuration(1000);
        welcomeDown.setStartDelay(5000);
        welcomeDown.start();




        frHeight =  ObjectAnimator.ofFloat(francais, "scaleX", 0.9f);
        frLength = ObjectAnimator.ofFloat(francais, "scaleY", 1.1f);
        frHeight.setDuration(1000);
        frLength.setDuration(1000);
        frHeight.setRepeatCount(ValueAnimator.INFINITE);
        frLength.setRepeatCount(ValueAnimator.INFINITE);
        frHeight.setRepeatMode(ValueAnimator.REVERSE);
        frLength.setRepeatMode(ValueAnimator.REVERSE);
        AnimatorSet frAnimation = new AnimatorSet();
        frAnimation.play(frHeight).with(frLength);
        frAnimation.start();



        arHeight =  ObjectAnimator.ofFloat(arabe, "scaleX", 0.9f);
        arLength = ObjectAnimator.ofFloat(arabe, "scaleY", 1.1f);
        arHeight.setDuration(1000);
        arLength.setDuration(1000);
        arHeight.setRepeatCount(ValueAnimator.INFINITE);
        arLength.setRepeatCount(ValueAnimator.INFINITE);
        arHeight.setRepeatMode(ValueAnimator.REVERSE);
        arLength.setRepeatMode(ValueAnimator.REVERSE);
        AnimatorSet arAnimation = new AnimatorSet();
        arAnimation.play(arHeight).with(arLength);
        arAnimation.start();




        enLength =  ObjectAnimator.ofFloat(anglais, "scaleX", 0.9f);
        enHeight = ObjectAnimator.ofFloat(anglais, "scaleY", 1.1f);
        enHeight.setDuration(1000);
        enLength.setDuration(1000);
        enHeight.setRepeatCount(ValueAnimator.INFINITE);
        enLength.setRepeatCount(ValueAnimator.INFINITE);
        enHeight.setRepeatMode(ValueAnimator.REVERSE);
        enLength.setRepeatMode(ValueAnimator.REVERSE);
        AnimatorSet enAnimation = new AnimatorSet();
        enAnimation.play(enHeight).with(enLength);
        enAnimation.start();

        francais.setTranslationY(2000f);
        francais.setImageResource(R.mipmap.francais);
        francais.animate().translationYBy(-2000f).setDuration(2000).setStartDelay(5500);

        arabe.setTranslationX(-2000f);
        arabe.setImageResource(R.mipmap.arab);
        arabe.animate().translationXBy(2000f).setDuration(2000).setStartDelay(5500);

        anglais.setTranslationX(2000f);
        anglais.setImageResource(R.mipmap.anglais);
        anglais.animate().translationXBy(-2000f).setDuration(2000).setStartDelay(5500);

        arabe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Language.language="ar";
                Intent i = new Intent(MainActivity.this, ArGameFirst.class);
                startActivity(i);
            }
        });

        francais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Language.language="fr";
                Intent i = new Intent(MainActivity.this, FrGameFirst.class);
                startActivity(i);
            }
        });

        anglais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Language.language="en";
                Intent i = new Intent(MainActivity.this, EnGameFirst.class);
                startActivity(i);

            }
        });





    }


    @Override
    protected void onDestroy() {

        stopService(new Intent(MainActivity.this, SoundService.class));
        super.onDestroy();
    }

    @Override
    public void onBackPressed() {
        finishAffinity();
        System.exit(0);
    }

}
