package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.C1690P;
import com.google.android.gms.ads.internal.C1804ua;
import com.google.android.gms.ads.internal.gmsg.C1718E;
import com.google.android.gms.ads.internal.overlay.C1771c;
import com.google.android.gms.common.util.C2093o;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.uh */
public interface C3520uh extends C1690P, C2749Ug, C2635Qh, C2662Rh, C2777Vh, C2861Yh, C2915_h, C2946ai, C3331nr, C2991by, C2247Cy {
    /* renamed from: Xa */
    void mo8136Xa();

    /* renamed from: Ya */
    C1771c mo8137Ya();

    /* renamed from: Za */
    C2902Zu mo8138Za();

    /* renamed from: _a */
    void mo8139_a();

    /* renamed from: a */
    void mo8140a(Context context);

    /* renamed from: a */
    void mo8141a(C1771c cVar);

    /* renamed from: a */
    void mo8143a(C2187Av av);

    /* renamed from: a */
    void mo8144a(C2457Kh kh);

    /* renamed from: a */
    void mo8145a(C3146hi hiVar);

    /* renamed from: a */
    void mo8147a(String str, C1718E<? super C3520uh> e);

    /* renamed from: a */
    void mo8148a(String str, C2093o<C1718E<? super C3520uh>> oVar);

    /* renamed from: ab */
    void mo8155ab();

    /* renamed from: b */
    void mo8156b(C1771c cVar);

    /* renamed from: b */
    void mo8157b(String str, C1718E<? super C3520uh> e);

    /* renamed from: b */
    void mo8158b(String str, String str2, String str3);

    /* renamed from: bb */
    void mo8159bb();

    /* renamed from: cb */
    void mo8160cb();

    /* renamed from: db */
    Context mo8161db();

    void destroy();

    /* renamed from: eb */
    Activity mo8163eb();

    /* renamed from: f */
    void mo8164f(int i);

    /* renamed from: fb */
    boolean mo8165fb();

    /* renamed from: gb */
    C2187Av mo8166gb();

    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    View.OnClickListener getOnClickListener();

    ViewParent getParent();

    int getRequestedOrientation();

    View getView();

    WebView getWebView();

    int getWidth();

    /* renamed from: hb */
    C2209Bp mo8171hb();

    /* renamed from: ib */
    void mo8172ib();

    boolean isDestroyed();

    /* renamed from: jb */
    C2457Kh mo8174jb();

    /* renamed from: kb */
    C1804ua mo8175kb();

    /* renamed from: l */
    void mo8176l(boolean z);

    /* renamed from: lb */
    boolean mo8177lb();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    /* renamed from: m */
    void mo8181m(boolean z);

    /* renamed from: mb */
    C2974bi mo8182mb();

    void measure(int i, int i2);

    /* renamed from: n */
    void mo8183n(boolean z);

    /* renamed from: nb */
    void mo8184nb();

    /* renamed from: o */
    void mo8185o(String str);

    /* renamed from: o */
    void mo8186o(boolean z);

    /* renamed from: ob */
    WebViewClient mo8187ob();

    void onPause();

    void onResume();

    /* renamed from: pb */
    String mo8190pb();

    /* renamed from: qb */
    boolean mo8191qb();

    /* renamed from: rb */
    C3146hi mo8192rb();

    /* renamed from: sb */
    boolean mo8193sb();

    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setRequestedOrientation(int i);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void stopLoading();

    /* renamed from: tb */
    C1771c mo8200tb();

    /* renamed from: ub */
    zzang mo8201ub();

    /* renamed from: vb */
    boolean mo8202vb();

    /* renamed from: wb */
    void mo8203wb();
}
