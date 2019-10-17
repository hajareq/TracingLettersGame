package com.game.kidsgame.French.Num.FrNumActivities;

import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.widget.ImageView;
import com.game.kidsgame.R;

public class FiveFrNum extends AppCompatActivity {

    private PaintView paintView;
    ImageView next,previous;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_fr_num);

        paintView = findViewById(R.id.paintView);
        next = findViewById(R.id.next);
        previous = findViewById(R.id.previous);
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        paintView.init(metrics);
        Display mdisp = getWindowManager().getDefaultDisplay();
        Point mdispSize = new Point();
        mdisp.getSize(mdispSize);
        int maxX = mdispSize.x;
        int maxY = mdispSize.y;

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SixFrNum.class));
            }
        });

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), FourFrNum.class));
            }
        });


        System.out.println("max X: "+ maxX);
        System.out.println("max Y: "+ maxY);

    }
    public void onWindowFocusChanged(boolean hasFocus){
        super.onWindowFocusChanged(hasFocus);
        paintView = findViewById(R.id.paintView);
        String x = Integer.toString(paintView.getWidth());
        String y = Integer.toString(paintView.getHeight());
        //show ImageView width and height
        System.out.println("max X view: "+ x);
        System.out.println("max Y view: "+ y);

    }


}
