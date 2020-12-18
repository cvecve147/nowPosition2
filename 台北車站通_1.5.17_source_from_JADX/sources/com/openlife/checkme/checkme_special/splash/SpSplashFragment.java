package com.openlife.checkme.checkme_special.splash;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.splash.C4792d;
import com.openlife.checkme.p094d.C4947j;
import com.openlife.checkme.p100ui.LoadingView;
import p101d.p108c.p109a.C5197l;

public class SpSplashFragment extends C4792d implements C4934e {

    /* renamed from: a */
    private C4936g f14099a;

    /* renamed from: b */
    private boolean f14100b = false;
    ConstraintLayout background;
    LoadingView loadingView;

    /* renamed from: k */
    public static SpSplashFragment m19425k() {
        return new SpSplashFragment();
    }

    /* renamed from: a */
    public void mo13245a(int i) {
        if (!this.f14100b) {
            this.loadingView.mo14065c();
            this.f14100b = true;
        }
    }

    /* renamed from: d */
    public void mo12962d(String str) {
        C5197l.C5198a aVar = new C5197l.C5198a(getActivity());
        aVar.mo14383a((CharSequence) str);
        aVar.mo14399f(C4961l.g_ok);
        aVar.mo14391b((C5197l.C5207j) new C4931b(this));
        aVar.mo14385a(false);
        aVar.mo14395c();
    }

    /* renamed from: f */
    public void mo12756f() {
        if (getActivity() != null && !getActivity().isFinishing()) {
            getActivity().runOnUiThread(new C4930a(this));
        }
    }

    /* renamed from: i */
    public void mo12968i() {
        super.mo12968i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo12598j() {
        return C4957h.fragment_splash_s_cm;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        String e = C4947j.m19536a().mo13554e().mo13533e();
        if (e == null) {
            e = "zh";
        }
        if (!e.equals("zh")) {
            this.loadingView.setLanguage(e);
            this.loadingView.setTitle("Taipei Main Station");
            this.loadingView.setTitle2("Navigator");
            this.loadingView.setSubTitle("Point collection");
            this.loadingView.setTitleFontSize(23);
            this.loadingView.setSubTitleFontSize(18);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f14099a = new C4936g(this, new C4935f());
    }

    public void onDestroyView() {
        LoadingView loadingView2 = this.loadingView;
        if (loadingView2 != null) {
            loadingView2.mo14062a();
        }
        super.onDestroyView();
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }
}
