package com.nostra13.universalimageloader.core;

import android.graphics.Bitmap;
import com.nostra13.universalimageloader.core.assist.LoadedFrom;
import com.nostra13.universalimageloader.core.display.BitmapDisplayer;
import com.nostra13.universalimageloader.core.imageaware.ImageAware;
import com.nostra13.universalimageloader.core.listener.ImageLoadingListener;
import com.nostra13.universalimageloader.utils.C4220L;

final class DisplayBitmapTask implements Runnable {
    private static final String LOG_DISPLAY_IMAGE_IN_IMAGEAWARE = "Display image in ImageAware (loaded from %1$s) [%2$s]";
    private static final String LOG_TASK_CANCELLED_IMAGEAWARE_COLLECTED = "ImageAware was collected by GC. Task is cancelled. [%s]";
    private static final String LOG_TASK_CANCELLED_IMAGEAWARE_REUSED = "ImageAware is reused for another image. Task is cancelled. [%s]";
    private final Bitmap bitmap;
    private final BitmapDisplayer displayer;
    private final ImageLoaderEngine engine;
    private final ImageAware imageAware;
    private final String imageUri;
    private final ImageLoadingListener listener;
    private final LoadedFrom loadedFrom;
    private final String memoryCacheKey;

    public DisplayBitmapTask(Bitmap bitmap2, ImageLoadingInfo imageLoadingInfo, ImageLoaderEngine imageLoaderEngine, LoadedFrom loadedFrom2) {
        this.bitmap = bitmap2;
        this.imageUri = imageLoadingInfo.uri;
        this.imageAware = imageLoadingInfo.imageAware;
        this.memoryCacheKey = imageLoadingInfo.memoryCacheKey;
        this.displayer = imageLoadingInfo.options.getDisplayer();
        this.listener = imageLoadingInfo.listener;
        this.engine = imageLoaderEngine;
        this.loadedFrom = loadedFrom2;
    }

    private boolean isViewWasReused() {
        return !this.memoryCacheKey.equals(this.engine.getLoadingUriForView(this.imageAware));
    }

    public void run() {
        Object[] objArr;
        String str;
        if (this.imageAware.isCollected()) {
            objArr = new Object[]{this.memoryCacheKey};
            str = LOG_TASK_CANCELLED_IMAGEAWARE_COLLECTED;
        } else if (isViewWasReused()) {
            objArr = new Object[]{this.memoryCacheKey};
            str = LOG_TASK_CANCELLED_IMAGEAWARE_REUSED;
        } else {
            C4220L.m16763d(LOG_DISPLAY_IMAGE_IN_IMAGEAWARE, this.loadedFrom, this.memoryCacheKey);
            this.displayer.display(this.bitmap, this.imageAware, this.loadedFrom);
            this.engine.cancelDisplayTaskFor(this.imageAware);
            this.listener.onLoadingComplete(this.imageUri, this.imageAware.getWrappedView(), this.bitmap);
            return;
        }
        C4220L.m16763d(str, objArr);
        this.listener.onLoadingCancelled(this.imageUri, this.imageAware.getWrappedView());
    }
}
