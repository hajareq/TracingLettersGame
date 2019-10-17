package com.game.kidsgame.Sprites;

import com.example.emobadaragaminglib.Base.Game;
import com.example.emobadaragaminglib.Base.Image;
import com.example.emobadaragaminglib.Components.Sprite;

public class Dot extends Sprite {
    public Dot(Image image, int x, int y, int height, int width) {
        super( image, x, y, height, width);
        setStatic(false);
    }

}
