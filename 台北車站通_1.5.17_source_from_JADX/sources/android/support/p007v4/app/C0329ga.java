package android.support.p007v4.app;

import android.app.Activity;
import android.arch.lifecycle.C0026d;
import android.arch.lifecycle.C0030f;
import android.arch.lifecycle.C0032h;
import android.arch.lifecycle.C0038m;
import android.os.Bundle;
import p013b.p018b.p028h.p039h.C1101r;

/* renamed from: android.support.v4.app.ga */
public class C0329ga extends Activity implements C0030f {

    /* renamed from: a */
    private C1101r<Class<? extends Object>, Object> f1374a = new C1101r<>();

    /* renamed from: b */
    private C0032h f1375b = new C0032h(this);

    /* renamed from: b */
    public C0026d mo55b() {
        return this.f1375b;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0038m.m111a((Activity) this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.f1375b.mo56a(C0026d.C0028b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
