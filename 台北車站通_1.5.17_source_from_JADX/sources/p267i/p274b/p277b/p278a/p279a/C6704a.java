package p267i.p274b.p277b.p278a.p279a;

import android.app.Activity;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import p267i.p274b.p277b.p278a.C6707b;
import p267i.p274b.p277b.p278a.p279a.C6705b;
import p267i.p274b.p277b.p280b.C6738b;

/* renamed from: i.b.b.a.a.a */
public class C6704a implements Callback {

    /* renamed from: a */
    protected Activity f18614a = null;

    /* renamed from: b */
    protected C6705b f18615b = null;

    /* renamed from: c */
    protected boolean f18616c = false;

    /* renamed from: d */
    protected String f18617d = null;

    /* renamed from: e */
    protected String f18618e = null;

    /* renamed from: f */
    protected Object f18619f = null;

    /* renamed from: g */
    protected Object f18620g = null;

    /* renamed from: h */
    protected C6707b f18621h;

    public C6704a(Activity activity, C6705b bVar, int i) {
        this.f18614a = activity;
        this.f18615b = bVar;
        mo17124a(i);
    }

    /* renamed from: a */
    private void mo17124a(int i) {
        this.f18617d = String.valueOf(i);
        this.f18618e = C6738b.m25537a(C6738b.f18738h);
    }

    /* renamed from: c */
    private void m25443c() {
        this.f18614a = null;
        this.f18615b = null;
    }

    /* renamed from: a */
    public void mo17154a() {
        C6705b bVar = this.f18615b;
        if (bVar != null) {
            if (this.f18616c) {
                bVar.mo17123a(this.f18619f);
            } else {
                C6705b.C6706a aVar = new C6705b.C6706a();
                aVar.f18622a = this.f18617d;
                aVar.f18623b = this.f18618e;
                this.f18615b.mo17122a(aVar, this.f18619f);
            }
        }
        C6707b bVar2 = this.f18621h;
        if (bVar2 != null) {
            bVar2.mo17160a(bVar2, this.f18616c);
        }
        m25443c();
    }

    /* renamed from: a */
    public void mo17155a(C6707b bVar) {
        this.f18621h = bVar;
    }

    /* renamed from: b */
    public Object mo17156b() {
        return this.f18620g;
    }

    public void onFailure(Call call, IOException iOException) {
        mo17154a();
    }

    public void onResponse(Call call, Response response) {
    }
}
