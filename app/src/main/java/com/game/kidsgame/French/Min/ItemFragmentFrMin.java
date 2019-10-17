package com.game.kidsgame.French.Min;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.game.kidsgame.R;

public class ItemFragmentFrMin extends Fragment {

    private static final String POSITON = "position";
    private static final String SCALE = "scale";
    private static final String DRAWABLE_RESOURE = "resource";

    private int screenWidth;
    private int screenHeight;

    private int[] imageArray = new int[]{R.mipmap.amin, R.mipmap.bmin,
            R.mipmap.cmin, R.mipmap.dmin, R.mipmap.emin,
            R.mipmap.fmin, R.mipmap.gmin, R.mipmap.hmin,
            R.mipmap.imin, R.mipmap.jmin,R.mipmap.kmin, R.mipmap.lmin, R.mipmap.mmin,
            R.mipmap.nmin, R.mipmap.omin, R.mipmap.pmin,
            R.mipmap.qmin, R.mipmap.rmin, R.mipmap.smin,
            R.mipmap.tmin, R.mipmap.umin,R.mipmap.vmin, R.mipmap.wmin, R.mipmap.xmin,
            R.mipmap.ymin, R.mipmap.zmin};

    public static Fragment newInstance(ListLettersFrMin context, int pos, float scale) {
        Bundle b = new Bundle();
        b.putInt(POSITON, pos);
        b.putFloat(SCALE, scale);

        return Fragment.instantiate(context, ItemFragmentFrMin.class.getName(), b);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWidthAndHeight();
    }

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (container == null) {
            return null;
        }

        final int postion = this.getArguments().getInt(POSITON);
        float scale = this.getArguments().getFloat(SCALE);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(500, 800);
        LinearLayout linearLayout = (LinearLayout) inflater.inflate(R.layout.fragment_image_fr_min, container, false);

        CarouselLinearLayoutFrMin root = (CarouselLinearLayoutFrMin) linearLayout.findViewById(R.id.root_container_fr_min);
        ImageView imageView = (ImageView) linearLayout.findViewById(R.id.pagerImgFrMin);

        imageView.setLayoutParams(layoutParams);
        imageView.setImageResource(imageArray[postion]);

        //handling click event
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(getActivity(), LetterSwitcherFrMin.class);
               intent.putExtra(DRAWABLE_RESOURE, imageArray[postion]);
               startActivity(intent);
            }
        });

        root.setScaleBoth(scale);

        return linearLayout;
    }

    /**
     * Get device screen width and height
     */
    private void getWidthAndHeight() {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        screenHeight = displaymetrics.heightPixels;
        screenWidth = displaymetrics.widthPixels;
    }
}