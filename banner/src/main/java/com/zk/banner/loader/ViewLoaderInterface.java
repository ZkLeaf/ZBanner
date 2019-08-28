package com.zk.banner.loader;

import android.content.Context;
import android.view.View;

import com.zk.banner.listener.OnVideoStateListener;

import java.io.Serializable;

/**
 * 通用view加载器
 * @param <T>
 */
public interface ViewLoaderInterface<T extends View> extends Serializable {

    void displayView(Context context, Object path, T view,OnVideoStateListener listener);

    T createView(Context context);
}
