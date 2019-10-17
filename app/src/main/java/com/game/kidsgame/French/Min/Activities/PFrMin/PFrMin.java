package com.game.kidsgame.French.Min.Activities.PFrMin;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;

import com.game.kidsgame.French.Min.Activities.OFrMin.OFrMin;
import com.game.kidsgame.French.Min.Activities.QFrMin.QFrMin;
import com.game.kidsgame.French.Min.ListLettersFrMin;
import com.game.kidsgame.R;

public class PFrMin extends AppCompatActivity {

    private PaintView paintView;
    ImageView next,previous;
    public static ImageView ops;
    public static int maxX, maxY;
    public static ObjectAnimator opsLength,opsHeight,opsDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_fr_min);

        paintView = findViewById(R.id.paintView);
        next = findViewById(R.id.next);
        previous = findViewById(R.id.previous);
        ops= findViewById(R.id.ops1);

        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        paintView.init(metrics);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), QFrMin.class));
            }
        });

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), OFrMin.class));
            }
        });




    }
    public void onWindowFocusChanged(boolean hasFocus){
        super.onWindowFocusChanged(hasFocus);
        maxX = paintView.getWidth();
        maxY = paintView.getHeight();


    }

    public void onBackPressed(){
        Intent i = new Intent(getApplicationContext(), ListLettersFrMin.class);
        startActivity(i);
        finish();
    }

    public static void onFailed(){

        ops.setTranslationY(-1000f);
        ops.setImageResource(R.mipmap.essaye1);
        ops.animate().translationYBy(1000f).setDuration(500);
        opsLength =  ObjectAnimator.ofFloat(ops, "scaleX", 0.9f);
        opsHeight = ObjectAnimator.ofFloat(ops, "scaleY", 1.1f);
        opsHeight.setDuration(2000);
        opsLength.setDuration(2000);
        opsHeight.setRepeatCount(ValueAnimator.INFINITE);
        opsLength.setRepeatCount(ValueAnimator.INFINITE);
        opsHeight.setRepeatMode(ValueAnimator.REVERSE);
        opsLength.setRepeatMode(ValueAnimator.REVERSE);
        AnimatorSet welcomeAnimation = new AnimatorSet();
        welcomeAnimation.play(opsHeight).with(opsLength);
        welcomeAnimation.start();

        opsDown =  ObjectAnimator.ofFloat(ops, "translationY", 1000f);
        opsDown.setDuration(500);
        opsDown.setStartDelay(1500);
        opsDown.start();
    }
    public static void onSuccess(){

        ops.setTranslationY(-1000f);
        ops.setImageResource(R.mipmap.succes);
        ops.animate().translationYBy(1000f).setDuration(500);
        opsLength =  ObjectAnimator.ofFloat(ops, "scaleX", 0.9f);
        opsHeight = ObjectAnimator.ofFloat(ops, "scaleY", 1.1f);
        opsHeight.setDuration(2000);
        opsLength.setDuration(2000);
        opsHeight.setRepeatCount(ValueAnimator.INFINITE);
        opsLength.setRepeatCount(ValueAnimator.INFINITE);
        opsHeight.setRepeatMode(ValueAnimator.REVERSE);
        opsLength.setRepeatMode(ValueAnimator.REVERSE);
        AnimatorSet welcomeAnimation = new AnimatorSet();
        welcomeAnimation.play(opsHeight).with(opsLength);
        welcomeAnimation.start();

        opsDown =  ObjectAnimator.ofFloat(ops, "translationY", 1000f);
        opsDown.setDuration(500);
        opsDown.setStartDelay(2000);
        opsDown.start();

    }


}
