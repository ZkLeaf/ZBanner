package com.jian.zbanner.loader;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.zk.banner.listener.OnVideoStateListener;
import com.zk.banner.loader.ImageLoader;


public class FrescoImageLoader extends ImageLoader {
    //提供createImageView 方法，方便fresco自定义ImageView

    @Override
    public void displayView(Context context, Object path, ImageView view, OnVideoStateListener listener) {
        Uri uri = Uri.parse((String) path);
        view.setImageURI(uri);
    }

    @Override
    public ImageView createView(Context context) {
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(context);
        return simpleDraweeView;
    }
}
