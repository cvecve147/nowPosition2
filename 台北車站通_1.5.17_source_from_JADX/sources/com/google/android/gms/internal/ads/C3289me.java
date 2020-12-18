package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.DownloadManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.C1697X;
import java.io.InputStream;
import java.util.Map;
import java.util.Set;

@TargetApi(8)
@C2478La
/* renamed from: com.google.android.gms.internal.ads.me */
public class C3289me {
    private C3289me() {
    }

    /* renamed from: a */
    public static boolean m13057a(C3520uh uhVar) {
        if (uhVar == null) {
            return false;
        }
        uhVar.onPause();
        return true;
    }

    /* renamed from: b */
    public static boolean m13058b(C3520uh uhVar) {
        if (uhVar == null) {
            return false;
        }
        uhVar.onResume();
        return true;
    }

    /* renamed from: e */
    public static boolean m13059e() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    /* renamed from: a */
    public int mo9712a() {
        throw null;
    }

    /* renamed from: a */
    public Drawable mo9713a(Context context, Bitmap bitmap, boolean z, float f) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    /* renamed from: a */
    public WebResourceResponse mo9714a(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    /* renamed from: a */
    public C3550vh mo9715a(C3520uh uhVar, boolean z) {
        throw null;
    }

    /* renamed from: a */
    public String mo9716a(Context context) {
        return "";
    }

    /* renamed from: a */
    public String mo9717a(SslError sslError) {
        throw null;
    }

    /* renamed from: a */
    public Set<String> mo9718a(Uri uri) {
        throw null;
    }

    /* renamed from: a */
    public void mo9719a(View view, Drawable drawable) {
        view.setBackgroundDrawable(drawable);
    }

    /* renamed from: a */
    public void mo9720a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
    }

    /* renamed from: a */
    public boolean mo9721a(DownloadManager.Request request) {
        throw null;
    }

    /* renamed from: a */
    public boolean mo9722a(Context context, WebSettings webSettings) {
        return false;
    }

    /* renamed from: a */
    public boolean mo9723a(View view) {
        return (view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true;
    }

    /* renamed from: a */
    public boolean mo9724a(Window window) {
        throw null;
    }

    /* renamed from: b */
    public int mo9725b() {
        throw null;
    }

    /* renamed from: b */
    public void mo9726b(Context context) {
    }

    /* renamed from: b */
    public boolean mo9727b(View view) {
        throw null;
    }

    /* renamed from: c */
    public int mo9728c() {
        return 5;
    }

    /* renamed from: c */
    public CookieManager mo9729c(Context context) {
        if (m13059e()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            C2227Cf.m9533b("Failed to obtain CookieManager.", th);
            C1697X.m7702i().mo8319a(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    /* renamed from: c */
    public boolean mo9730c(View view) {
        throw null;
    }

    /* renamed from: d */
    public ViewGroup.LayoutParams mo9731d() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    /* renamed from: f */
    public int mo9732f() {
        throw null;
    }
}
