package com.game.kidsgame;

import android.app.Activity;

import com.example.emobadaragaminglib.Base.Game;
import com.example.emobadaragaminglib.Base.Screen;
import com.example.emobadaragaminglib.Components.Sprite;
import com.game.kidsgame.Assets.Clothes;
import com.game.kidsgame.Sprites.Dot;


public class GameScreen extends Screen {


    private Sprite bg;
    private Sprite top2_01;
    private Sprite pants2_01;

    public GameScreen(Game game,Activity activity) {
        super(game);
    //    bg = new Sprite(game,Backgrounds.level1bg,0,0,game.getGraphics().getHeight(),game.getGraphics().getWidth());
      //  top2_01 = new Sprite(game,Clothes.top2_01,200,100,200,100);
        //pants2_01 = new Sprite(game,Clothes.pants2_01,400,200,200,100);
        // definition dyal sprite b dik l white image li initialisina kbel
        pants2_01 = new Dot( Clothes.pants2_01,400,200,100,100);
      //  top2_01.setStatic(false);
      // bash nkedro nharkouha
        pants2_01.setStatic(false);

        //addSprite(bg);
     //   addSprite(top2_01);
     //n ajoutewha l'activity
        addSprite(pants2_01);
    }

    private void putPlaceHolders(){

    }

    @Override
    public void render(float deltaTime) {

      // hna logique kaml fash katharek chi sprite hadi kat executa 
       // g.drawARGB(255,0,0,0);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void backButton() {

    }
}
