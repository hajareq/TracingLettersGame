package com.game.kidsgame;

import android.content.pm.ActivityInfo;

import com.example.emobadaragaminglib.Base.Graphics;
import com.example.emobadaragaminglib.Base.Screen;
import com.example.emobadaragaminglib.Implementation.AndroidGame;
import com.game.kidsgame.Assets.Clothes;


public class GameActivity extends AndroidGame {

    @Override
    public Screen getInitScreen() {
        initAssets();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        return new GameScreen(this,this);
    }

    private void initAssets(){
       // Backgrounds.level1bg = getGraphics().newImage(R.drawable.room_01,Graphics.ImageFormat.ARGB8888,getResources());
      //  Backgrounds.level1bg = getGraphics().newImage(R.drawable.white,Graphics.ImageFormat.ARGB8888,getResources());
      /*
      * initialisation dyal white image bash anresmou
      */
        Clothes.pants2_01 = getGraphics().newImage(R.drawable.white_dot,Graphics.ImageFormat.ARGB8888,getResources());
      //  Clothes.top2_01 = getGraphics().newImage(R.drawable.top2_01,Graphics.ImageFormat.ARGB8888,getResources());


    }
}
