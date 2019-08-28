package com.zk.banner.loader;

import android.content.Context;
import android.view.View;
import android.widget.VideoView;

public abstract class VideoLoader implements ViewLoaderInterface<View> {
    @Override
    public View createView(Context context) {
        VideoView videoView = new VideoView(context);
        return videoView;
    }
}
