package com.openlife.checkme.activity.splash;

import android.os.Bundle;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.sdk.C5008q;
import java.util.Date;

/* renamed from: com.openlife.checkme.activity.splash.d */
public class C4792d extends C5008q<C4803o, C4793e> implements C4791c {

    /* renamed from: a */
    private C4803o f13794a;

    /* renamed from: b */
    public static C4792d m18878b() {
        return new C4792d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C4803o mo12600l() {
        return this.f13794a;
    }

    /* renamed from: a */
    public void mo13245a(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12594a(boolean z, int i) {
    }

    /* renamed from: g */
    public void mo13247g() {
    }

    /* renamed from: i */
    public void mo12968i() {
        super.mo12968i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo12598j() {
        return C4957h.fragment_splash_cm;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        mo13247g();
        this.f13794a.mo13259a(getActivity().getIntent(), Long.valueOf(new Date().getTime()));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13794a = new C4803o(this, new C4793e());
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f13794a.mo13263d();
        mo12970m().mo5375a();
    }
}
