package com.jian.zbanner.loader;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.jian.zbanner.ui.RoundAngleImageView;
import com.zk.banner.listener.OnVideoStateListener;
import com.zk.banner.loader.ImageLoader;


public class GlideImageLoader extends ImageLoader {
    @Override
    public void displayView(Context context, Object path, ImageView view, OnVideoStateListener listener) {
        Glide.with(context)
                .load(path)
                .into(view);
    }

    @Override
    public ImageView createView(Context context) {
        return new RoundAngleImageView(context);
    }
}
