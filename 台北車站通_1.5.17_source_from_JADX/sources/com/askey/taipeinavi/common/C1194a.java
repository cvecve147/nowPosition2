package com.askey.taipeinavi.common;

import android.os.Bundle;
import android.support.p007v4.app.C0339l;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.askey.taipeinavi.home.C1254x;
import com.askey.taipeinavi.home.HomeActivity;

/* renamed from: com.askey.taipeinavi.common.a */
public abstract class C1194a extends C0339l {

    /* renamed from: a */
    protected HomeActivity f4380a;

    /* renamed from: b */
    protected C1254x f4381b;

    /* renamed from: c */
    private Unbinder f4382c;

    /* renamed from: K */
    public void mo1324K() {
        this.f4381b = null;
        this.f4380a = null;
        super.mo1324K();
    }

    /* renamed from: M */
    public void mo1293M() {
        super.mo1293M();
        Unbinder unbinder = this.f4382c;
        if (unbinder != null) {
            unbinder.mo5375a();
            this.f4382c = null;
        }
    }

    /* renamed from: a */
    public View mo1339a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(mo1304ea(), viewGroup, false);
        this.f4382c = ButterKnife.m5843a((Object) this, inflate);
        return inflate;
    }

    /* renamed from: b */
    public void mo1300b(Bundle bundle) {
        super.mo1300b(bundle);
        this.f4380a = (HomeActivity) mo1337a();
        this.f4381b = (C1254x) mo1413r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: ea */
    public abstract int mo1304ea();
}
