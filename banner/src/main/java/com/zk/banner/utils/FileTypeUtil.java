package com.zk.banner.utils;

import android.text.TextUtils;

import java.net.FileNameMap;
import java.net.URLConnection;

public class FileTypeUtil {
    private final static String PREFIX_VIDEO = "video/";

    private final static String[] VODEO = {".mp4",".3gp",".avi",".rmvb",".vob",".flv",".wmv"};

    /**
     * Get the Mime Type from a File
     *
     * @param fileName 文件名
     * @return 返回MIME类型
     * thx https://www.oschina.net/question/571282_223549
     * add by fengwenhua 2017年5月3日09:55:01
     */
    private static String getMimeType(String fileName) {
        FileNameMap fileNameMap = URLConnection.getFileNameMap();
        String type = fileNameMap.getContentTypeFor(fileName);
        return type;
    }

    /**
     * 根据文件后缀名判断 文件是否是视频文件
     *
     * @param fileName 文件名
     * @return 是否是视频文件
     */
    public static boolean isVideoFile(String fileName) {
        String mimeType = getMimeType(fileName);
        if (!TextUtils.isEmpty(fileName) && mimeType.contains(PREFIX_VIDEO)) {
            return true;
        }
        return false;
    }

    public static boolean isVideoUrl(String url){
        if (!TextUtils.isEmpty(url) ){
            for (String s:VODEO) {
                if (url.contains(s)){
                    return true;
                }
            }
        }
        return false;
    }
}
