package com.jian.zbanner.loader;

import android.content.Context;
import android.view.View;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.jian.zbanner.MyJzvdStd;
import com.zk.banner.listener.OnVideoStateListener;
import com.zk.banner.loader.VideoLoader;

/**
 * Created by zhanke on 2019/8/28.
 * Describe
 */
public class IjkVideoLoader extends VideoLoader {
//"http://img.zcool.cn/community/01700557a7f42f0000018c1bd6eb23.jpg"
    @Override
    public void displayView(Context context, Object path, View view, OnVideoStateListener listener) {
        MyJzvdStd jzVideo = (MyJzvdStd)view;
        jzVideo.setUp((String) path, "");
        RequestOptions options = new RequestOptions()
                .centerCrop()
                .fitCenter()
                .diskCacheStrategy(DiskCacheStrategy.NONE);
        Glide.with(context).load("http://img.zcool.cn/community/01700557a7f42f0000018c1bd6eb23.jpg").apply(options).into(jzVideo.thumbImageView);

        jzVideo.setOnVideoStateListener(listener);

    }

    @Override
    public View createView(Context context) {
        MyJzvdStd view = new MyJzvdStd(context);
        return view;
    }
}
