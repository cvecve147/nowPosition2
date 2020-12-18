package com.openlife.checkme;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.cache.memory.impl.WeakMemoryCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;
import com.nostra13.universalimageloader.core.display.CircleBitmapDisplayer;
import com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer;
import com.nostra13.universalimageloader.core.download.BaseImageDownloader;
import com.openlife.checkme.p094d.C4947j;
import org.apache.http.HttpStatus;
import p013b.p018b.p025f.C0993b;

/* renamed from: com.openlife.checkme.a */
public class C4452a extends C0993b {

    /* renamed from: a */
    private static final DisplayImageOptions f13121a = new DisplayImageOptions.Builder().resetViewBeforeLoading(true).cacheOnDisk(true).cacheInMemory(true).imageScaleType(ImageScaleType.EXACTLY).bitmapConfig(Bitmap.Config.RGB_565).build();

    /* renamed from: b */
    public static final DisplayImageOptions f13122b = new DisplayImageOptions.Builder().resetViewBeforeLoading(true).cacheOnDisk(true).cacheInMemory(true).imageScaleType(ImageScaleType.EXACTLY).bitmapConfig(Bitmap.Config.RGB_565).showImageOnLoading(C4959j.default_gift).showImageOnFail(C4959j.default_gift).showImageForEmptyUri(C4959j.default_gift).displayer(new CircleBitmapDisplayer()).build();

    /* renamed from: c */
    public static final DisplayImageOptions f13123c = new DisplayImageOptions.Builder().resetViewBeforeLoading(true).cacheOnDisk(true).cacheInMemory(true).imageScaleType(ImageScaleType.EXACTLY).bitmapConfig(Bitmap.Config.RGB_565).showImageOnLoading(C4959j.account_img_default).showImageOnFail(C4959j.account_img_default).showImageForEmptyUri(C4959j.account_img_default).displayer(new CircleBitmapDisplayer()).build();

    /* renamed from: a */
    public static final DisplayImageOptions m17659a(int i) {
        return new DisplayImageOptions.Builder().resetViewBeforeLoading(true).cacheOnDisk(true).cacheInMemory(true).showImageOnLoading(i).showImageOnFail(i).showImageForEmptyUri(i).imageScaleType(ImageScaleType.EXACTLY).bitmapConfig(Bitmap.Config.RGB_565).displayer(new FadeInBitmapDisplayer(HttpStatus.SC_INTERNAL_SERVER_ERROR)).build();
    }

    /* renamed from: a */
    public static void m17660a(Context context) {
        ImageLoaderConfiguration.Builder builder = new ImageLoaderConfiguration.Builder(context);
        builder.threadPriority(3);
        builder.denyCacheImageMultipleSizesInMemory();
        builder.diskCacheFileNameGenerator(new Md5FileNameGenerator());
        builder.diskCacheSize(((int) Runtime.getRuntime().maxMemory()) / 8);
        builder.tasksProcessingOrder(QueueProcessingType.LIFO);
        builder.threadPoolSize(3);
        builder.imageDownloader(new BaseImageDownloader(context, BaseImageDownloader.DEFAULT_HTTP_CONNECT_TIMEOUT, 30000));
        builder.memoryCache(new WeakMemoryCache());
        builder.defaultDisplayImageOptions(f13121a);
        ImageLoader.getInstance().init(builder.build());
    }

    public void onCreate() {
        super.onCreate();
        C4947j.m19536a().mo13550a(this);
        C4968s.m19589a((Application) this);
        m17660a(getApplicationContext());
    }
}
