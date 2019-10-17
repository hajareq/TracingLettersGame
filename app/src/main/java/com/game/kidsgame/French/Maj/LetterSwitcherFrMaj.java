package com.game.kidsgame.French.Maj;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.game.kidsgame.French.Maj.Activities.A.A;
import com.game.kidsgame.French.Maj.Activities.B.B;
import com.game.kidsgame.French.Maj.Activities.C.C;
import com.game.kidsgame.French.Maj.Activities.D.D;
import com.game.kidsgame.French.Maj.Activities.E.E;
import com.game.kidsgame.French.Maj.Activities.F.F;
import com.game.kidsgame.French.Maj.Activities.G.G;
import com.game.kidsgame.French.Maj.Activities.H.H;
import com.game.kidsgame.French.Maj.Activities.I.I;
import com.game.kidsgame.French.Maj.Activities.J.J;
import com.game.kidsgame.French.Maj.Activities.K.K;
import com.game.kidsgame.French.Maj.Activities.L.L;
import com.game.kidsgame.French.Maj.Activities.M.M;
import com.game.kidsgame.French.Maj.Activities.N.N;
import com.game.kidsgame.French.Maj.Activities.O.O;
import com.game.kidsgame.French.Maj.Activities.P.P;
import com.game.kidsgame.French.Maj.Activities.Q.Q;
import com.game.kidsgame.French.Maj.Activities.S.S;
import com.game.kidsgame.French.Maj.Activities.T.T;
import com.game.kidsgame.French.Maj.Activities.U.U;
import com.game.kidsgame.French.Maj.Activities.V.V;
import com.game.kidsgame.French.Maj.Activities.W.W;
import com.game.kidsgame.French.Maj.Activities.X.X;
import com.game.kidsgame.French.Maj.Activities.Y.Y;
import com.game.kidsgame.French.Maj.Activities.Z.Z;

public class LetterSwitcherFrMaj extends AppCompatActivity {


    private static final String DRAWABLE_RESOURE = "resource";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(com.game.kidsgame.R.layout.activity_letter_switcher_fr_min);


        int drawbleResource = getIntent().getIntExtra(DRAWABLE_RESOURE, 0);
        Intent i;
        switch (drawbleResource){
            case com.game.kidsgame.R.mipmap.amaj:
                i = new Intent(getApplicationContext(), A.class);
                startActivity(i);
                finish();
                break;
            case com.game.kidsgame.R.mipmap.bmaj:
                i = new Intent(getApplicationContext(), B.class);
                startActivity(i);
                finish();
                break;
            case com.game.kidsgame.R.mipmap.cmaj:
                i = new Intent(getApplicationContext(), C.class);
                startActivity(i);
                finish();
                break;
            case com.game.kidsgame.R.mipmap.dmaj:
                i = new Intent(getApplicationContext(), D.class);
                startActivity(i);
                finish();
                break;
            case com.game.kidsgame.R.mipmap.emaj:
                i = new Intent(getApplicationContext(), E.class);
                startActivity(i);
                finish();
                break;
            case com.game.kidsgame.R.mipmap.fmaj:
                i = new Intent(getApplicationContext(), F.class);
                startActivity(i);
                finish();
                break;
            case com.game.kidsgame.R.mipmap.gmaj:
                i = new Intent(getApplicationContext(), G.class);
                startActivity(i);
                finish();
                break;
            case com.game.kidsgame.R.mipmap.hmaj:
                i = new Intent(getApplicationContext(), H.class);
                startActivity(i);
                finish();
                break;
            case com.game.kidsgame.R.mipmap.imaj:
                i = new Intent(getApplicationContext(), I.class);
                startActivity(i);
                finish();
                break;
            case com.game.kidsgame.R.mipmap.jmaj:
                i = new Intent(getApplicationContext(), J.class);
                startActivity(i);
                finish();
                break;
            case com.game.kidsgame.R.mipmap.kmaj:
                i = new Intent(getApplicationContext(), K.class);
                startActivity(i);
                finish();
                break;
            case com.game.kidsgame.R.mipmap.lmaj:
                i = new Intent(getApplicationContext(), L.class);
                startActivity(i);
                finish();
                break;
            case com.game.kidsgame.R.mipmap.mmaj:
                i = new Intent(getApplicationContext(), M.class);
                startActivity(i);
                finish();
                break;
            case com.game.kidsgame.R.mipmap.nmaj:
                i = new Intent(getApplicationContext(), N.class);
                startActivity(i);
                finish();
                break;
            case com.game.kidsgame.R.mipmap.omaj:
                i = new Intent(getApplicationContext(), O.class);
                startActivity(i);
                finish();
                break;
            case com.game.kidsgame.R.mipmap.pmaj:
                i = new Intent(getApplicationContext(), P.class);
                startActivity(i);
                finish();
                break;
            case com.game.kidsgame.R.mipmap.qmaj:
                i = new Intent(getApplicationContext(), Q.class);
                startActivity(i);
                finish();
                break;
            case com.game.kidsgame.R.mipmap.rmaj:
                i = new Intent(getApplicationContext(), com.game.kidsgame.French.Maj.Activities.R.R.class);
                startActivity(i);
                finish();
                break;
            case com.game.kidsgame.R.mipmap.smaj:
                i = new Intent(getApplicationContext(), S.class);
                startActivity(i);
                finish();
                break;
            case com.game.kidsgame.R.mipmap.tmaj:
                i = new Intent(getApplicationContext(), T.class);
                startActivity(i);
                finish();
                break;
            case com.game.kidsgame.R.mipmap.umaj:
                i = new Intent(getApplicationContext(), U.class);
                startActivity(i);
                finish();
                break;
            case com.game.kidsgame.R.mipmap.vmaj:
                i = new Intent(getApplicationContext(), V.class);
                startActivity(i);
                finish();
                break;
            case com.game.kidsgame.R.mipmap.wmaj:
                i = new Intent(getApplicationContext(), W.class);
                startActivity(i);
                finish();
                break;
            case com.game.kidsgame.R.mipmap.xmaj:
                i = new Intent(getApplicationContext(), X.class);
                startActivity(i);
                finish();
                break;
            case com.game.kidsgame.R.mipmap.ymaj:
                i = new Intent(getApplicationContext(), Y.class);
                startActivity(i);
                finish();
                break;
            case com.game.kidsgame.R.mipmap.zmaj:
                i = new Intent(getApplicationContext(), Z.class);
                startActivity(i);
                finish();
                break;
        }
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}