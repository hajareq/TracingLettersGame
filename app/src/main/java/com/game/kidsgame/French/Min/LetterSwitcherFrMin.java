package com.game.kidsgame.French.Min;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.game.kidsgame.French.Min.Activities.A.A;
import com.game.kidsgame.French.Min.Activities.B.B;
import com.game.kidsgame.French.Min.Activities.CFrMin.CFrMin;
import com.game.kidsgame.French.Min.Activities.DFrMin.DFrMin;
import com.game.kidsgame.French.Min.Activities.EFrMin.EFrMin;
import com.game.kidsgame.French.Min.Activities.FFrMin.FFrMin;
import com.game.kidsgame.French.Min.Activities.GFrMin.GFrMin;
import com.game.kidsgame.French.Min.Activities.HFrMin.HFrMin;
import com.game.kidsgame.French.Min.Activities.IFrMin.IFrMin;
import com.game.kidsgame.French.Min.Activities.JFrMin.JFrMin;
import com.game.kidsgame.French.Min.Activities.KFrMin.KFrMin;
import com.game.kidsgame.French.Min.Activities.LFrMin.LFrMin;
import com.game.kidsgame.French.Min.Activities.MFrMin.MFrMin;
import com.game.kidsgame.French.Min.Activities.NFrMin.NFrMin;
import com.game.kidsgame.French.Min.Activities.OFrMin.OFrMin;
import com.game.kidsgame.French.Min.Activities.PFrMin.PFrMin;
import com.game.kidsgame.French.Min.Activities.QFrMin.QFrMin;
import com.game.kidsgame.French.Min.Activities.RFrMin.RFrMin;
import com.game.kidsgame.French.Min.Activities.SFrMin.SFrMin;
import com.game.kidsgame.French.Min.Activities.TFrMin.TFrMin;
import com.game.kidsgame.French.Min.Activities.UFrMin.UFrMin;
import com.game.kidsgame.French.Min.Activities.VFrMin.VFrMin;
import com.game.kidsgame.French.Min.Activities.WFrMin.WFrMin;
import com.game.kidsgame.French.Min.Activities.XFrMin.XFrMin;
import com.game.kidsgame.French.Min.Activities.YFrMin.YFrMin;
import com.game.kidsgame.French.Min.Activities.ZFrMin.ZFrMin;
import com.game.kidsgame.R;

public class LetterSwitcherFrMin extends AppCompatActivity {

    private ImageView imageView;
    private Button button;
    private static final String DRAWABLE_RESOURE = "resource";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_letter_switcher_fr_min);

        imageView = (ImageView)findViewById(R.id.img);
        button = (Button)findViewById(R.id.btnClose);

        int drawbleResource = getIntent().getIntExtra(DRAWABLE_RESOURE, 0);
        //imageView.setImageResource(drawbleResource);
        Intent i;
        switch (drawbleResource){
            case R.mipmap.amin:
                i = new Intent(getApplicationContext(), A.class);
                startActivity(i);
                finish();
                break;
            case R.mipmap.bmin:
                i = new Intent(getApplicationContext(), B.class);
                startActivity(i);
                finish();
                break;
            case R.mipmap.cmin:
                i = new Intent(getApplicationContext(), CFrMin.class);
                startActivity(i);
                finish();
                break;
            case R.mipmap.dmin:
                i = new Intent(getApplicationContext(), DFrMin.class);
                startActivity(i);
                finish();
                break;
            case R.mipmap.emin:
                i = new Intent(getApplicationContext(), EFrMin.class);
                startActivity(i);
                finish();
                break;
            case R.mipmap.fmin:
                i = new Intent(getApplicationContext(), FFrMin.class);
                startActivity(i);
                finish();
                break;
            case R.mipmap.gmin:
                i = new Intent(getApplicationContext(), GFrMin.class);
                startActivity(i);
                finish();
                break;
            case R.mipmap.hmin:
                i = new Intent(getApplicationContext(), HFrMin.class);
                startActivity(i);
                finish();
                break;
            case R.mipmap.imin:
                i = new Intent(getApplicationContext(), IFrMin.class);
                startActivity(i);
                finish();
                break;
            case R.mipmap.jmin:
                i = new Intent(getApplicationContext(), JFrMin.class);
                startActivity(i);
                finish();
                break;
            case R.mipmap.kmin:
                i = new Intent(getApplicationContext(), KFrMin.class);
                startActivity(i);
                finish();
                break;
            case R.mipmap.lmin:
                i = new Intent(getApplicationContext(), LFrMin.class);
                startActivity(i);
                finish();
                break;
            case R.mipmap.mmin:
                i = new Intent(getApplicationContext(), MFrMin.class);
                startActivity(i);
                finish();
                break;
            case R.mipmap.nmin:
                i = new Intent(getApplicationContext(), NFrMin.class);
                startActivity(i);
                finish();
                break;
            case R.mipmap.omin:
                i = new Intent(getApplicationContext(), OFrMin.class);
                startActivity(i);
                finish();
                break;
            case R.mipmap.pmin:
                i = new Intent(getApplicationContext(), PFrMin.class);
                startActivity(i);
                finish();
                break;
            case R.mipmap.qmin:
                i = new Intent(getApplicationContext(), QFrMin.class);
                startActivity(i);
                finish();
                break;
            case R.mipmap.rmin:
                i = new Intent(getApplicationContext(), RFrMin.class);
                startActivity(i);
                finish();
                break;
            case R.mipmap.smin:
                i = new Intent(getApplicationContext(), SFrMin.class);
                startActivity(i);
                finish();
                break;
            case R.mipmap.tmin:
                i = new Intent(getApplicationContext(), TFrMin.class);
                startActivity(i);
                finish();
                break;
            case R.mipmap.umin:
                i = new Intent(getApplicationContext(), UFrMin.class);
                startActivity(i);
                finish();
                break;
            case R.mipmap.vmin:
                i = new Intent(getApplicationContext(), VFrMin.class);
                startActivity(i);
                finish();
                break;
            case R.mipmap.wmin:
                i = new Intent(getApplicationContext(), WFrMin.class);
                startActivity(i);
                finish();
                break;
            case R.mipmap.xmin:
                i = new Intent(getApplicationContext(), XFrMin.class);
                startActivity(i);
                finish();
                break;
            case R.mipmap.ymin:
                i = new Intent(getApplicationContext(), YFrMin.class);
                startActivity(i);
                finish();
                break;
            case R.mipmap.zmin:
                i = new Intent(getApplicationContext(), ZFrMin.class);
                startActivity(i);
                finish();
                break;



        }




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}