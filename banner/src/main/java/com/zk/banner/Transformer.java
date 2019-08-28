package com.zk.banner;

import android.support.v4.view.ViewPager.PageTransformer;

import com.zk.banner.transformer.AccordionTransformer;
import com.zk.banner.transformer.BackgroundToForegroundTransformer;
import com.zk.banner.transformer.CubeInTransformer;
import com.zk.banner.transformer.CubeOutTransformer;
import com.zk.banner.transformer.DefaultTransformer;
import com.zk.banner.transformer.DepthPageTransformer;
import com.zk.banner.transformer.FlipHorizontalTransformer;
import com.zk.banner.transformer.FlipVerticalTransformer;
import com.zk.banner.transformer.ForegroundToBackgroundTransformer;
import com.zk.banner.transformer.RotateDownTransformer;
import com.zk.banner.transformer.RotateUpTransformer;
import com.zk.banner.transformer.ScaleInOutTransformer;
import com.zk.banner.transformer.StackTransformer;
import com.zk.banner.transformer.TabletTransformer;
import com.zk.banner.transformer.ZoomInTransformer;
import com.zk.banner.transformer.ZoomOutSlideTransformer;
import com.zk.banner.transformer.ZoomOutTranformer;

public class Transformer {
    public static Class<? extends PageTransformer> Default = DefaultTransformer.class;
    public static Class<? extends PageTransformer> Accordion = AccordionTransformer.class;
    public static Class<? extends PageTransformer> BackgroundToForeground = BackgroundToForegroundTransformer.class;
    public static Class<? extends PageTransformer> ForegroundToBackground = ForegroundToBackgroundTransformer.class;
    public static Class<? extends PageTransformer> CubeIn = CubeInTransformer.class;
    public static Class<? extends PageTransformer> CubeOut = CubeOutTransformer.class;
    public static Class<? extends PageTransformer> DepthPage = DepthPageTransformer.class;
    public static Class<? extends PageTransformer> FlipHorizontal = FlipHorizontalTransformer.class;
    public static Class<? extends PageTransformer> FlipVertical = FlipVerticalTransformer.class;
    public static Class<? extends PageTransformer> RotateDown = RotateDownTransformer.class;
    public static Class<? extends PageTransformer> RotateUp = RotateUpTransformer.class;
    public static Class<? extends PageTransformer> ScaleInOut = ScaleInOutTransformer.class;
    public static Class<? extends PageTransformer> Stack = StackTransformer.class;
    public static Class<? extends PageTransformer> Tablet = TabletTransformer.class;
    public static Class<? extends PageTransformer> ZoomIn = ZoomInTransformer.class;
    public static Class<? extends PageTransformer> ZoomOut = ZoomOutTranformer.class;
    public static Class<? extends PageTransformer> ZoomOutSlide = ZoomOutSlideTransformer.class;
}
