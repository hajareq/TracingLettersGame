package com.game.kidsgame.French.Num;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.game.kidsgame.French.Num.FrNumActivities.EightFrNum;
import com.game.kidsgame.French.Num.FrNumActivities.FiveFrNum;
import com.game.kidsgame.French.Num.FrNumActivities.FourFrNum;
import com.game.kidsgame.French.Num.FrNumActivities.NineFrNum;
import com.game.kidsgame.French.Num.FrNumActivities.OneFrNum;
import com.game.kidsgame.French.Num.FrNumActivities.SevenFrNum;
import com.game.kidsgame.French.Num.FrNumActivities.SixFrNum;
import com.game.kidsgame.French.Num.FrNumActivities.ThreeFrNum;
import com.game.kidsgame.French.Num.FrNumActivities.TwoFrNum;
import com.game.kidsgame.French.Num.FrNumActivities.ZeroFrNum;
import com.game.kidsgame.R;

public class NumberSwitcherFr extends AppCompatActivity {

    private static final String DRAWABLE_RESOURE = "resource";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_switcher_fr);


        int drawbleResource = getIntent().getIntExtra(DRAWABLE_RESOURE, 0);
        Intent i;
        switch (drawbleResource) {
            case R.mipmap.number00:
                i = new Intent(getApplicationContext(), ZeroFrNum.class);
                startActivity(i);
                finish();
                break;
            case R.mipmap.number01:
                i = new Intent(getApplicationContext(), OneFrNum.class);
                startActivity(i);
                finish();
                break;
            case R.mipmap.number02:
                i = new Intent(getApplicationContext(), TwoFrNum.class);
                startActivity(i);
                finish();
                break;
            case R.mipmap.number03:
                i = new Intent(getApplicationContext(), ThreeFrNum.class);
                startActivity(i);
                finish();
                break;
            case R.mipmap.number04:
                i = new Intent(getApplicationContext(), FourFrNum.class);
                startActivity(i);
                finish();
                break;
            case R.mipmap.number05:
                i = new Intent(getApplicationContext(), FiveFrNum.class);
                startActivity(i);
                finish();
                break;
            case R.mipmap.number06:
                i = new Intent(getApplicationContext(), SixFrNum.class);
                startActivity(i);
                finish();
                break;
            case R.mipmap.number07:
                i = new Intent(getApplicationContext(), SevenFrNum.class);
                startActivity(i);
                finish();
                break;
            case R.mipmap.number08:
                i = new Intent(getApplicationContext(), EightFrNum.class);
                startActivity(i);
                finish();
                break;
            case R.mipmap.number09:
                i = new Intent(getApplicationContext(), NineFrNum.class);
                startActivity(i);
                finish();
                break;
            }


        }
}
