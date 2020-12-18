package com.openlife.checkme.sdk;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.splash.p090a.C4789a;
import com.openlife.checkme.p093c.C4883m;
import com.openlife.checkme.p094d.C4947j;
import com.openlife.checkme.sdk.p099b.C4983b;
import com.openlife.checkme.sdk.p099b.C4985d;
import com.openlife.checkme.sdk.p099b.C4992k;
import p013b.p018b.p028h.p029a.C1020d;
import p101d.p108c.p109a.C5197l;

/* renamed from: com.openlife.checkme.sdk.m */
public class C5004m extends C5008q<C4992k, C4985d> implements C4983b {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C4992k f14199b;

    /* renamed from: c */
    private int f14200c = -1;

    /* renamed from: b */
    private void m19713b(int i, String str) {
        Intent intent = new Intent();
        intent.setAction("INTENT_LOGIN_ACTION");
        intent.putExtra("INTENT_LOGIN_NAME", i);
        intent.putExtra("INTENT_LOGIN_ERROR", str);
        C1020d.m5430a(getActivity().getBaseContext()).mo5020a(intent);
    }

    /* renamed from: h */
    private void m19714h(int i) {
        Intent intent = new Intent();
        intent.setAction("INTENT_LOGIN_ACTION");
        intent.putExtra("INTENT_LOGIN_NAME", i);
        C1020d.m5430a(getActivity().getBaseContext()).mo5020a(intent);
    }

    /* renamed from: o */
    public static C5004m m19715o() {
        Bundle bundle = new Bundle();
        C5004m mVar = new C5004m();
        mVar.setArguments(bundle);
        return mVar;
    }

    /* renamed from: a */
    public ProgressDialog mo12955a(Activity activity, int i) {
        ProgressDialog a = C4883m.m19217a((Context) activity, i, (DialogInterface.OnCancelListener) new C4999h(this));
        a.setMessage(((CheckMeLoginActivity) getActivity()).mo13981d(C4961l.g_loading));
        return a;
    }

    /* renamed from: a */
    public void mo12957a(String str, String str2) {
        super.mo12957a(str, str2);
        if (C4947j.m19536a().mo13554e().mo13527c() == 2) {
            CheckMeLoginActivity checkMeLoginActivity = (CheckMeLoginActivity) getActivity();
            C5197l.C5198a aVar = new C5197l.C5198a(checkMeLoginActivity);
            aVar.mo14383a((CharSequence) str);
            aVar.mo14394c((CharSequence) checkMeLoginActivity.mo13981d(C4961l.g_connectservice));
            aVar.mo14391b((C5197l.C5207j) new C5002k(this, str2));
            aVar.mo14385a(false);
            aVar.mo14395c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12594a(boolean z, int i) {
        if (z) {
            this.f14200c = i;
        }
    }

    /* renamed from: c */
    public void mo14001c() {
        m19714h(20002);
    }

    /* renamed from: d */
    public void mo12962d(String str) {
        super.mo12968i();
    }

    /* renamed from: e */
    public void mo12964e(String str) {
        CheckMeLoginActivity checkMeLoginActivity = (CheckMeLoginActivity) getActivity();
        C5197l.C5198a aVar = new C5197l.C5198a(checkMeLoginActivity);
        aVar.mo14383a((CharSequence) str);
        aVar.mo14394c((CharSequence) checkMeLoginActivity.mo13981d(C4961l.g_ok));
        aVar.mo14392b((CharSequence) checkMeLoginActivity.mo13981d(C4961l.g_cancel));
        aVar.mo14391b((C5197l.C5207j) new C5001j(this));
        aVar.mo14382a((C5197l.C5207j) new C5000i(this));
        aVar.mo14385a(false);
        int i = this.f14200c;
        if (i != -1) {
            aVar.mo14398e(i);
            aVar.mo14393c(this.f14200c);
        }
        aVar.mo14395c();
    }

    /* renamed from: f */
    public void mo14002f(int i) {
        CheckMeLoginActivity checkMeLoginActivity = (CheckMeLoginActivity) getActivity();
        C5197l.C5198a aVar = new C5197l.C5198a(checkMeLoginActivity);
        aVar.mo14383a((CharSequence) checkMeLoginActivity.mo13981d(i));
        aVar.mo14394c((CharSequence) checkMeLoginActivity.mo13981d(C4961l.g_ok));
        aVar.mo14391b((C5197l.C5207j) new C5003l(this));
        aVar.mo14385a(false);
        aVar.mo14395c();
    }

    /* renamed from: h */
    public void mo14003h(String str) {
        m19713b(20001, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo12598j() {
        return C4957h.fragment_checkme_cm;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C4992k m19726l() {
        return this.f14199b;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f14199b.mo14011a((C4789a) getActivity().getIntent().getExtras().get("INTENT_NAME_PARAMS"));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String string = getActivity().getIntent().getExtras().getString("INTENT_NAME_SRC");
        this.f14199b = new C4992k(this, new C4985d());
        this.f14199b.mo14012a(string);
    }

    public void onDestroy() {
        super.onDestroy();
    }
}
