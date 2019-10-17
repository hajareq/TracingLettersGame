package com.game.kidsgame.Arab;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.game.kidsgame.R;

public class ArGameFirst extends AppCompatActivity {


    ObjectAnimator kidA1,kidA2,kidA3,kidA4,kidA5;
    ImageView kid1,kid2,kid3,kid4,kid5;
    ImageView chasselintrus,questionsreponses,tracerlettre,habillage,memoire;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ar_game_first);



        kid1= findViewById(R.id.kid1);
        kid2= findViewById(R.id.kid2);
        kid3= findViewById(R.id.kid3);
        kid4= findViewById(R.id.kid4);
        kid5= findViewById(R.id.kid5);

        chasselintrus = findViewById(R.id.chasselintrus);
        questionsreponses= findViewById(R.id.questionsreponses);
        tracerlettre= findViewById(R.id.tracerlettre);
        habillage= findViewById(R.id.habillage);
        memoire= findViewById(R.id.memoire);


        ObjectAnimator scaleDownX1 = ObjectAnimator.ofFloat(tracerlettre, "scaleX", 1.1f);
        ObjectAnimator scaleDownY1 = ObjectAnimator.ofFloat(tracerlettre, "scaleY", 1.1f);
        scaleDownY1.setDuration(2000);
        scaleDownX1.setDuration(2000);
        scaleDownX1.setRepeatCount(ValueAnimator.INFINITE);
        scaleDownX1.setRepeatMode(ValueAnimator.REVERSE);
        scaleDownY1.setRepeatCount(ValueAnimator.INFINITE);
        scaleDownY1.setRepeatMode(ValueAnimator.REVERSE);
        AnimatorSet scaleDown = new AnimatorSet();
        scaleDown.play(scaleDownX1).with(scaleDownY1);
        scaleDown.start();

        ObjectAnimator scaleDownX2 = ObjectAnimator.ofFloat(questionsreponses, "scaleX", 1.1f);
        ObjectAnimator scaleDownY2 = ObjectAnimator.ofFloat(questionsreponses, "scaleY", 1.1f);
        scaleDownY2.setDuration(2000);
        scaleDownX2.setDuration(2000);
        scaleDownY2.setStartDelay(1000);
        scaleDownX2.setStartDelay(1000);
        scaleDownX2.setRepeatCount(ValueAnimator.INFINITE);
        scaleDownY2.setRepeatCount(ValueAnimator.INFINITE);
        scaleDownX2.setRepeatMode(ValueAnimator.REVERSE);
        scaleDownY2.setRepeatMode(ValueAnimator.REVERSE);
        AnimatorSet scaleDown2 = new AnimatorSet();
        scaleDown2.play(scaleDownX2).with(scaleDownY2);
        scaleDown2.start();

        ObjectAnimator scaleDownX = ObjectAnimator.ofFloat(habillage, "scaleX", 1.1f);
        ObjectAnimator scaleDownY = ObjectAnimator.ofFloat(habillage, "scaleY", 1.1f);
        scaleDownY.setDuration(2000);
        scaleDownX.setDuration(2000);
        scaleDownY.setStartDelay(2000);
        scaleDownX.setStartDelay(2000);
        scaleDownX.setRepeatCount(ValueAnimator.INFINITE);
        scaleDownY.setRepeatCount(ValueAnimator.INFINITE);
        scaleDownX.setRepeatMode(ValueAnimator.REVERSE);
        scaleDownY.setRepeatMode(ValueAnimator.REVERSE);
        AnimatorSet scaleDown3 = new AnimatorSet();
        scaleDown3.play(scaleDownX).with(scaleDownY);
        scaleDown3.start();

        ObjectAnimator scaleDownX3 = ObjectAnimator.ofFloat(memoire, "scaleX", 1.05f);
        ObjectAnimator scaleDownY3 = ObjectAnimator.ofFloat(memoire, "scaleY", 1.05f);
        scaleDownY3.setDuration(2000);
        scaleDownX3.setDuration(2000);
        scaleDownY3.setStartDelay(3000);
        scaleDownX3.setStartDelay(3000);
        scaleDownX3.setRepeatCount(ValueAnimator.INFINITE);
        scaleDownY3.setRepeatCount(ValueAnimator.INFINITE);
        scaleDownX3.setRepeatMode(ValueAnimator.REVERSE);
        scaleDownY3.setRepeatMode(ValueAnimator.REVERSE);
        AnimatorSet scaleDown4 = new AnimatorSet();
        scaleDown4.play(scaleDownX3).with(scaleDownY3);
        scaleDown4.start();

        ObjectAnimator scaleDownX4 = ObjectAnimator.ofFloat(chasselintrus, "scaleX", 1.1f);
        ObjectAnimator scaleDownY4 = ObjectAnimator.ofFloat(chasselintrus, "scaleY", 1.1f);
        scaleDownY4.setDuration(2000);
        scaleDownX4.setDuration(2000);
        scaleDownY4.setStartDelay(4000);
        scaleDownX4.setStartDelay(4000);
        scaleDownX4.setRepeatCount(ValueAnimator.INFINITE);
        scaleDownY4.setRepeatCount(ValueAnimator.INFINITE);
        scaleDownX4.setRepeatMode(ValueAnimator.REVERSE);
        scaleDownY4.setRepeatMode(ValueAnimator.REVERSE);
        AnimatorSet scaleDown5 = new AnimatorSet();
        scaleDown5.play(scaleDownX4).with(scaleDownY4);
        scaleDown5.start();

        kidA1 = ObjectAnimator.ofFloat(kid1,"translationY",0f,-30f);
        kidA1.setDuration(2000);
        kidA1.setRepeatCount(ValueAnimator.INFINITE);
        kidA1.setRepeatMode(ValueAnimator.REVERSE);
        kidA1.start();

        kidA2 = ObjectAnimator.ofFloat(kid2,"translationY",0f,-30f);
        kidA2.setDuration(2000);
        kidA2.setRepeatCount(ValueAnimator.INFINITE);
        kidA2.setRepeatMode(ValueAnimator.REVERSE);
        kidA2.setStartDelay(1000);
        kidA2.start();

        kidA3 = ObjectAnimator.ofFloat(kid3,"translationY",0f,-30f);
        kidA3.setDuration(2000);
        kidA3.setRepeatCount(ValueAnimator.INFINITE);
        kidA3.setRepeatMode(ValueAnimator.REVERSE);
        kidA3.setStartDelay(2000);
        kidA3.start();

        kidA4 = ObjectAnimator.ofFloat(kid4,"translationY",0f,-30f);
        kidA4.setDuration(2000);
        kidA4.setRepeatCount(ValueAnimator.INFINITE);
        kidA4.setRepeatMode(ValueAnimator.REVERSE);
        kidA4.setStartDelay(3000);
        kidA4.start();

        kidA5 = ObjectAnimator.ofFloat(kid5,"translationY",0f,-30f);
        kidA5.setDuration(2000);
        kidA5.setRepeatCount(ValueAnimator.INFINITE);
        kidA5.setRepeatMode(ValueAnimator.REVERSE);
        kidA5.setStartDelay(4000);
        kidA5.start();



    }
}
