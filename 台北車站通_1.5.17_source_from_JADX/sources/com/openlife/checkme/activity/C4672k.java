package com.openlife.checkme.activity;

import android.app.Activity;
import android.app.Fragment;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p011v7.app.C0621l;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.C4962m;
import com.openlife.checkme.activity.C4703m;
import com.openlife.checkme.activity.C4757r;
import com.openlife.checkme.activity.home.MainActivity;
import com.openlife.checkme.activity.login.LoginActivity;
import com.openlife.checkme.activity.login.phonebinding.PhoneBindingActivity;
import com.openlife.checkme.p091b.C4837a;
import com.openlife.checkme.p093c.C4883m;
import com.openlife.checkme.p094d.C4947j;
import p101d.p108c.p109a.C5197l;

/* renamed from: com.openlife.checkme.activity.k */
public abstract class C4672k<P extends C4757r, M extends C4703m> extends Fragment implements C4835t {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public P f13547a;

    /* renamed from: b */
    private ProgressDialog f13548b;

    /* renamed from: c */
    private Unbinder f13549c;

    /* renamed from: d */
    int f13550d = C4947j.m19536a().mo13554e().mo13536f();

    /* renamed from: e */
    private C0621l f13551e;

    /* renamed from: a */
    private void m18385a(Context context, String str) {
        C0621l lVar = this.f13551e;
        if (lVar == null) {
            C0621l.C0622a aVar = new C0621l.C0622a(context, C4962m.MyDialogTheme);
            aVar.mo2606b(C4961l.app_name);
            aVar.mo2600a((CharSequence) str);
            aVar.mo2607b(C4961l.g_confirm, (DialogInterface.OnClickListener) new C4544c(this));
            this.f13551e = aVar.mo2604a();
        } else if (!lVar.isShowing()) {
            this.f13551e.show();
        }
    }

    /* renamed from: a */
    public ProgressDialog mo12955a(Activity activity, int i) {
        return C4883m.m19216a((Context) activity, i);
    }

    /* renamed from: a */
    public void mo12956a(String str, int i) {
        C5197l.C5198a aVar = new C5197l.C5198a(getActivity());
        aVar.mo14383a((CharSequence) str);
        aVar.mo14394c((CharSequence) mo12966g(C4961l.g_ok));
        aVar.mo14391b((C5197l.C5207j) new C4573f(this, i));
        aVar.mo14385a(false);
        aVar.mo14395c();
    }

    /* renamed from: a */
    public void mo12957a(String str, String str2) {
        C5197l.C5198a aVar;
        C5197l.C5207j jVar;
        int c = C4947j.m19536a().mo13554e().mo13527c();
        if (c != 0) {
            if (c == 1) {
                aVar = new C5197l.C5198a(getActivity());
                aVar.mo14383a((CharSequence) str);
                aVar.mo14394c((CharSequence) mo12966g(C4961l.g_connectservice));
                jVar = new C4574g(this, str2);
            } else if (c == 3) {
                aVar = new C5197l.C5198a(getActivity());
                aVar.mo14383a((CharSequence) str);
                aVar.mo14394c((CharSequence) mo12966g(C4961l.g_connectservice));
                jVar = new C4671j(this, str2);
            } else {
                return;
            }
            aVar.mo14391b(jVar);
        } else {
            aVar = new C5197l.C5198a(getActivity());
            aVar.mo14383a((CharSequence) str);
            aVar.mo14394c((CharSequence) mo12966g(C4961l.g_connectservice));
            aVar.mo14392b((CharSequence) mo12966g(C4961l.g_loginbyguest));
            aVar.mo14391b((C5197l.C5207j) new C4670i(this, str2));
            aVar.mo14382a((C5197l.C5207j) new C4626h(this));
        }
        aVar.mo14385a(false);
        aVar.mo14395c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo12594a(boolean z, int i);

    /* renamed from: b */
    public void mo12958b(int i) {
        PhoneBindingActivity.m18458a(getActivity(), i);
    }

    /* renamed from: b */
    public void mo12959b(String str) {
        C5197l.C5198a aVar = new C5197l.C5198a(getActivity());
        aVar.mo14383a((CharSequence) str);
        aVar.mo14394c((CharSequence) mo12966g(C4961l.g_ok));
        aVar.mo14395c();
    }

    /* renamed from: c */
    public void mo12960c(String str) {
        C5197l.C5198a aVar = new C5197l.C5198a(getActivity());
        aVar.mo14383a((CharSequence) str);
        aVar.mo14394c((CharSequence) mo12966g(C4961l.g_ok));
        aVar.mo14391b((C5197l.C5207j) new C4457a(this));
        aVar.mo14385a(false);
        aVar.mo14395c();
    }

    /* renamed from: d */
    public void mo12961d() {
        getActivity().finish();
    }

    /* renamed from: d */
    public void mo12962d(String str) {
        C5197l.C5198a aVar = new C5197l.C5198a(getActivity());
        aVar.mo14383a((CharSequence) str);
        aVar.mo14394c((CharSequence) mo12966g(C4961l.g_ok));
        aVar.mo14391b((C5197l.C5207j) new C4529b(this));
        aVar.mo14385a(false);
        aVar.mo14395c();
    }

    /* renamed from: e */
    public void mo12963e() {
        if (getActivity() != null && !getActivity().isFinishing()) {
            this.f13548b.show();
        }
    }

    /* renamed from: e */
    public void mo12964e(String str) {
        C5197l.C5198a aVar = new C5197l.C5198a(getActivity());
        aVar.mo14383a((CharSequence) str);
        aVar.mo14394c((CharSequence) mo12966g(C4961l.g_ok));
        aVar.mo14392b((CharSequence) mo12966g(C4961l.g_cancel));
        aVar.mo14391b((C5197l.C5207j) new C4546e(this));
        aVar.mo14382a((C5197l.C5207j) new C4545d(this));
        aVar.mo14385a(false);
        aVar.mo14395c();
    }

    /* renamed from: f */
    public void mo12756f() {
        if (getActivity() != null && !getActivity().isFinishing()) {
            this.f13548b.dismiss();
        }
    }

    /* renamed from: f */
    public void mo12965f(String str) {
        C5197l.C5198a aVar = new C5197l.C5198a(getActivity());
        aVar.mo14383a((CharSequence) str);
        aVar.mo14394c((CharSequence) mo12966g(C4961l.g_ok));
        aVar.mo14395c();
    }

    /* renamed from: g */
    public String mo12966g(int i) {
        return C4837a.m19034a(C4947j.m19536a(), i, getActivity().getBaseContext());
    }

    /* renamed from: h */
    public void mo12967h() {
        if (getActivity() != null && !getActivity().isFinishing()) {
            this.f13548b.dismiss();
            m18385a((Context) getActivity(), mo12966g(C4961l.g_a_network_error));
        }
    }

    /* renamed from: i */
    public void mo12968i() {
        MainActivity.m18285a(getActivity());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract int mo12598j();

    /* renamed from: j */
    public void mo12969j(String str) {
        if (getActivity() != null && !getActivity().isFinishing()) {
            this.f13548b.dismiss();
            C4883m.m19227a((Context) getActivity(), str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract P mo12600l();

    /* renamed from: m */
    public Unbinder mo12970m() {
        return this.f13549c;
    }

    /* renamed from: n */
    public void mo12971n() {
        int c = C4947j.m19536a().mo13554e().mo13527c();
        if (c == 0) {
            LoginActivity.m18423b(getActivity());
        } else if (c == 1 || c == 3) {
            getActivity().setResult(10000);
            mo12961d();
        }
        C4947j.m19536a().mo13553d().mo13498m();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(mo12598j(), viewGroup, false);
        this.f13549c = ButterKnife.m5843a((Object) this, inflate);
        if (this.f13550d != -1) {
            z = true;
        }
        mo12594a(z, this.f13550d);
        this.f13547a = mo12600l();
        if (this.f13548b == null) {
            this.f13548b = mo12955a(getActivity(), this.f13550d);
        }
        return inflate;
    }

    public void onDestroy() {
        super.onDestroy();
        P p = this.f13547a;
        if (p != null) {
            p.mo13154b();
        }
        ProgressDialog progressDialog = this.f13548b;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f13548b.dismiss();
        }
    }
}
