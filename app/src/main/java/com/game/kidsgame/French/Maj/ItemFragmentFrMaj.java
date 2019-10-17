package com.game.kidsgame.French.Maj;
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

public class ItemFragmentFrMaj extends Fragment {

    private static final String POSITON = "position";
    private static final String SCALE = "scale";
    private static final String DRAWABLE_RESOURE = "resource";

    private int screenWidth;
    private int screenHeight;

    private int[] imageArray = new int[]{R.mipmap.amaj, R.mipmap.bmaj,
            R.mipmap.cmaj, R.mipmap.dmaj, R.mipmap.emaj,
            R.mipmap.fmaj, R.mipmap.gmaj, R.mipmap.hmaj,
            R.mipmap.imaj, R.mipmap.jmaj,R.mipmap.kmaj, R.mipmap.lmaj, R.mipmap.mmaj,
            R.mipmap.nmaj, R.mipmap.omaj, R.mipmap.pmaj,
            R.mipmap.qmaj, R.mipmap.rmaj, R.mipmap.smaj,
            R.mipmap.tmaj, R.mipmap.umaj,R.mipmap.vmaj, R.mipmap.wmaj, R.mipmap.xmaj,
            R.mipmap.ymaj, R.mipmap.zmaj};

    public static Fragment newInstance(ListLettersFrMaj context, int pos, float scale) {
        Bundle b = new Bundle();
        b.putInt(POSITON, pos);
        b.putFloat(SCALE, scale);

        return Fragment.instantiate(context, ItemFragmentFrMaj.class.getName(), b);
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
        LinearLayout linearLayout = (LinearLayout) inflater.inflate(R.layout.fragment_image_fr_maj, container, false);

        CarouselLinearLayoutFrMaj root = linearLayout.findViewById(R.id.root_container_fr_maj);
        ImageView imageView = linearLayout.findViewById(R.id.pagerImgFrMaj);

        imageView.setLayoutParams(layoutParams);
        imageView.setImageResource(imageArray[postion]);

        //handling click event
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), LetterSwitcherFrMaj.class);
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