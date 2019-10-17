package com.game.kidsgame.English;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.game.kidsgame.French.Maj.ListLettersFrMaj;
import com.game.kidsgame.French.Min.ListLettersFrMin;
import com.game.kidsgame.French.Num.ListNumbersFr;
import com.game.kidsgame.R;

public class EnChoices extends AppCompatActivity {

    ObjectAnimator majHeight, majLength, minHeight,minLength,numHeight,numLength ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_en_choices);



        ImageView maj = findViewById(R.id.maj);
/*        ImageView min = findViewById(R.id.min);
        ImageView num = findViewById(R.id.num);*/




        majHeight =  ObjectAnimator.ofFloat(maj, "scaleX", 0.9f);
        majLength = ObjectAnimator.ofFloat(maj, "scaleY", 1.1f);
        majHeight.setDuration(1000);
        majLength.setDuration(1000);
        majHeight.setRepeatCount(ValueAnimator.INFINITE);
        majLength.setRepeatCount(ValueAnimator.INFINITE);
        majHeight.setRepeatMode(ValueAnimator.REVERSE);
        majLength.setRepeatMode(ValueAnimator.REVERSE);
        AnimatorSet frAnimation = new AnimatorSet();
        frAnimation.play(majHeight).with(majLength);
        frAnimation.start();



      /*  minHeight =  ObjectAnimator.ofFloat(min, "scaleX", 0.9f);
        minLength = ObjectAnimator.ofFloat(min, "scaleY", 1.1f);
        minHeight.setDuration(1000);
        minLength.setDuration(1000);
        minHeight.setRepeatCount(ValueAnimator.INFINITE);
        minLength.setRepeatCount(ValueAnimator.INFINITE);
        minHeight.setRepeatMode(ValueAnimator.REVERSE);
        minLength.setRepeatMode(ValueAnimator.REVERSE);
        AnimatorSet arAnimation = new AnimatorSet();
        arAnimation.play(minHeight).with(minLength);
        arAnimation.start();*/




     /*   numLength =  ObjectAnimator.ofFloat(num, "scaleX", 0.9f);
        numHeight = ObjectAnimator.ofFloat(num, "scaleY", 1.1f);
        numHeight.setDuration(1000);
        numLength.setDuration(1000);
        numHeight.setRepeatCount(ValueAnimator.INFINITE);
        numLength.setRepeatCount(ValueAnimator.INFINITE);
        numHeight.setRepeatMode(ValueAnimator.REVERSE);
        numLength.setRepeatMode(ValueAnimator.REVERSE);
        AnimatorSet enAnimation = new AnimatorSet();
        enAnimation.play(numHeight).with(numLength);
        enAnimation.start();*/

        maj.setTranslationY(-1000f);
        maj.setImageResource(R.mipmap.maj);
        maj.animate().translationYBy(1000f).setDuration(2000);

     /*   min.setTranslationY(-1000f);
        min.setImageResource(R.mipmap.min);
        min.animate().translationYBy(1000f).setDuration(2000);

        num.setTranslationY(-1000f);
        num.setImageResource(R.mipmap.numbers);
        num.animate().translationYBy(1000f).setDuration(2000);*/

     /*   min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(EnChoices.this, ListLettersFrMin.class);
                startActivity(i);
            }
        });

        num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(EnChoices.this, ListNumbersFr.class);
                startActivity(i);
            }
        });*/

        maj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(EnChoices.this, ListLettersFrMaj.class);
                startActivity(i);

            }
        });


    }
}
