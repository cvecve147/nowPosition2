package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.ads.internal.C1804ua;
import com.google.android.gms.ads.internal.gmsg.C1718E;
import com.google.android.gms.ads.internal.overlay.C1771c;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.p066b.C1636a;
import com.google.android.gms.common.util.C2093o;
import java.util.Map;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Gh */
public final class C2343Gh extends FrameLayout implements C3520uh {

    /* renamed from: a */
    private final C3520uh f7064a;

    /* renamed from: b */
    private final C2484Lg f7065b;

    public C2343Gh(C3520uh uhVar) {
        super(uhVar.getContext());
        this.f7064a = uhVar;
        this.f7065b = new C2484Lg(uhVar.mo8161db(), this, this);
        addView(this.f7064a.getView());
    }

    /* renamed from: Ab */
    public final int mo8133Ab() {
        return getMeasuredWidth();
    }

    /* renamed from: Bb */
    public final int mo8134Bb() {
        return getMeasuredHeight();
    }

    /* renamed from: Cb */
    public final void mo8135Cb() {
        this.f7064a.mo8135Cb();
    }

    /* renamed from: Db */
    public final void mo6792Db() {
        this.f7064a.mo6792Db();
    }

    /* renamed from: Eb */
    public final void mo6793Eb() {
        this.f7064a.mo6793Eb();
    }

    /* renamed from: Xa */
    public final void mo8136Xa() {
        TextView textView = new TextView(getContext());
        Resources b = C1697X.m7702i().mo8321b();
        textView.setText(b != null ? b.getString(C1636a.f5455s7) : "Test Ad");
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        if (Build.VERSION.SDK_INT >= 16) {
            textView.setBackground(gradientDrawable);
        } else {
            textView.setBackgroundDrawable(gradientDrawable);
        }
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    /* renamed from: Ya */
    public final C1771c mo8137Ya() {
        return this.f7064a.mo8137Ya();
    }

    /* renamed from: Za */
    public final C2902Zu mo8138Za() {
        return this.f7064a.mo8138Za();
    }

    /* renamed from: _a */
    public final void mo8139_a() {
        this.f7065b.mo8475a();
        this.f7064a.mo8139_a();
    }

    /* renamed from: a */
    public final void mo8140a(Context context) {
        this.f7064a.mo8140a(context);
    }

    /* renamed from: a */
    public final void mo8141a(C1771c cVar) {
        this.f7064a.mo8141a(cVar);
    }

    /* renamed from: a */
    public final void mo8142a(zzc zzc) {
        this.f7064a.mo8142a(zzc);
    }

    /* renamed from: a */
    public final void mo8143a(C2187Av av) {
        this.f7064a.mo8143a(av);
    }

    /* renamed from: a */
    public final void mo8144a(C2457Kh kh) {
        this.f7064a.mo8144a(kh);
    }

    /* renamed from: a */
    public final void mo8145a(C3146hi hiVar) {
        this.f7064a.mo8145a(hiVar);
    }

    /* renamed from: a */
    public final void mo8146a(C3302mr mrVar) {
        this.f7064a.mo8146a(mrVar);
    }

    /* renamed from: a */
    public final void mo7966a(String str) {
        this.f7064a.mo7966a(str);
    }

    /* renamed from: a */
    public final void mo8147a(String str, C1718E<? super C3520uh> e) {
        this.f7064a.mo8147a(str, e);
    }

    /* renamed from: a */
    public final void mo8148a(String str, C2093o<C1718E<? super C3520uh>> oVar) {
        this.f7064a.mo8148a(str, oVar);
    }

    /* renamed from: a */
    public final void mo8149a(String str, Map<String, ?> map) {
        this.f7064a.mo8149a(str, map);
    }

    /* renamed from: a */
    public final void mo8150a(String str, JSONObject jSONObject) {
        this.f7064a.mo8150a(str, jSONObject);
    }

    /* renamed from: a */
    public final void mo8151a(boolean z) {
        this.f7064a.mo8151a(z);
    }

    /* renamed from: a */
    public final void mo8152a(boolean z, int i) {
        this.f7064a.mo8152a(z, i);
    }

    /* renamed from: a */
    public final void mo8153a(boolean z, int i, String str) {
        this.f7064a.mo8153a(z, i, str);
    }

    /* renamed from: a */
    public final void mo8154a(boolean z, int i, String str, String str2) {
        this.f7064a.mo8154a(z, i, str, str2);
    }

    /* renamed from: ab */
    public final void mo8155ab() {
        this.f7064a.mo8155ab();
    }

    /* renamed from: b */
    public final void mo8156b(C1771c cVar) {
        this.f7064a.mo8156b(cVar);
    }

    /* renamed from: b */
    public final void mo8157b(String str, C1718E<? super C3520uh> e) {
        this.f7064a.mo8157b(str, e);
    }

    /* renamed from: b */
    public final void mo8158b(String str, String str2, String str3) {
        this.f7064a.mo8158b(str, str2, str3);
    }

    /* renamed from: b */
    public final void mo7967b(String str, JSONObject jSONObject) {
        this.f7064a.mo7967b(str, jSONObject);
    }

    /* renamed from: bb */
    public final void mo8159bb() {
        this.f7064a.mo8159bb();
    }

    /* renamed from: cb */
    public final void mo8160cb() {
        setBackgroundColor(0);
        this.f7064a.setBackgroundColor(0);
    }

    /* renamed from: db */
    public final Context mo8161db() {
        return this.f7064a.mo8161db();
    }

    public final void destroy() {
        this.f7064a.destroy();
    }

    /* renamed from: eb */
    public final Activity mo8163eb() {
        return this.f7064a.mo8163eb();
    }

    /* renamed from: f */
    public final void mo8164f(int i) {
        this.f7064a.mo8164f(i);
    }

    /* renamed from: fb */
    public final boolean mo8165fb() {
        return this.f7064a.mo8165fb();
    }

    /* renamed from: gb */
    public final C2187Av mo8166gb() {
        return this.f7064a.mo8166gb();
    }

    public final View.OnClickListener getOnClickListener() {
        return this.f7064a.getOnClickListener();
    }

    public final int getRequestedOrientation() {
        return this.f7064a.getRequestedOrientation();
    }

    public final View getView() {
        return this;
    }

    public final WebView getWebView() {
        return this.f7064a.getWebView();
    }

    /* renamed from: hb */
    public final C2209Bp mo8171hb() {
        return this.f7064a.mo8171hb();
    }

    /* renamed from: ib */
    public final void mo8172ib() {
        this.f7064a.mo8172ib();
    }

    public final boolean isDestroyed() {
        return this.f7064a.isDestroyed();
    }

    /* renamed from: jb */
    public final C2457Kh mo8174jb() {
        return this.f7064a.mo8174jb();
    }

    /* renamed from: kb */
    public final C1804ua mo8175kb() {
        return this.f7064a.mo8175kb();
    }

    /* renamed from: l */
    public final void mo8176l(boolean z) {
        this.f7064a.mo8176l(z);
    }

    /* renamed from: lb */
    public final boolean mo8177lb() {
        return this.f7064a.mo8177lb();
    }

    public final void loadData(String str, String str2, String str3) {
        this.f7064a.loadData(str, str2, str3);
    }

    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f7064a.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public final void loadUrl(String str) {
        this.f7064a.loadUrl(str);
    }

    /* renamed from: m */
    public final void mo8181m(boolean z) {
        this.f7064a.mo8181m(z);
    }

    /* renamed from: mb */
    public final C2974bi mo8182mb() {
        return this.f7064a.mo8182mb();
    }

    /* renamed from: n */
    public final void mo8183n(boolean z) {
        this.f7064a.mo8183n(z);
    }

    /* renamed from: nb */
    public final void mo8184nb() {
        this.f7064a.mo8184nb();
    }

    /* renamed from: o */
    public final void mo8185o(String str) {
        this.f7064a.mo8185o(str);
    }

    /* renamed from: o */
    public final void mo8186o(boolean z) {
        this.f7064a.mo8186o(z);
    }

    /* renamed from: ob */
    public final WebViewClient mo8187ob() {
        return this.f7064a.mo8187ob();
    }

    public final void onPause() {
        this.f7065b.mo8478b();
        this.f7064a.onPause();
    }

    public final void onResume() {
        this.f7064a.onResume();
    }

    /* renamed from: pb */
    public final String mo8190pb() {
        return this.f7064a.mo8190pb();
    }

    /* renamed from: qb */
    public final boolean mo8191qb() {
        return this.f7064a.mo8191qb();
    }

    /* renamed from: rb */
    public final C3146hi mo8192rb() {
        return this.f7064a.mo8192rb();
    }

    /* renamed from: sb */
    public final boolean mo8193sb() {
        return this.f7064a.mo8193sb();
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f7064a.setOnClickListener(onClickListener);
    }

    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f7064a.setOnTouchListener(onTouchListener);
    }

    public final void setRequestedOrientation(int i) {
        this.f7064a.setRequestedOrientation(i);
    }

    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f7064a.setWebChromeClient(webChromeClient);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f7064a.setWebViewClient(webViewClient);
    }

    public final void stopLoading() {
        this.f7064a.stopLoading();
    }

    /* renamed from: tb */
    public final C1771c mo8200tb() {
        return this.f7064a.mo8200tb();
    }

    /* renamed from: ub */
    public final zzang mo8201ub() {
        return this.f7064a.mo8201ub();
    }

    /* renamed from: vb */
    public final boolean mo8202vb() {
        return this.f7064a.mo8202vb();
    }

    /* renamed from: wb */
    public final void mo8203wb() {
        this.f7064a.mo8203wb();
    }

    /* renamed from: xb */
    public final C2875Yu mo8204xb() {
        return this.f7064a.mo8204xb();
    }

    /* renamed from: yb */
    public final C2484Lg mo8205yb() {
        return this.f7065b;
    }

    /* renamed from: zb */
    public final String mo8206zb() {
        return this.f7064a.mo8206zb();
    }
}
