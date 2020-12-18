package android.support.p007v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.q */
public abstract class C0349q<E> extends C0347o {

    /* renamed from: a */
    private final Activity f1479a;

    /* renamed from: b */
    final Context f1480b;

    /* renamed from: c */
    private final Handler f1481c;

    /* renamed from: d */
    final int f1482d;

    /* renamed from: e */
    final C0360y f1483e;

    C0349q(Activity activity, Context context, Handler handler, int i) {
        this.f1483e = new C0360y();
        this.f1479a = activity;
        this.f1480b = context;
        this.f1481c = handler;
        this.f1482d = i;
    }

    C0349q(C0344n nVar) {
        this(nVar, nVar, nVar.f1462a, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo1456a(C0339l lVar);

    /* renamed from: a */
    public abstract void mo1457a(C0339l lVar, Intent intent, int i, Bundle bundle);

    /* renamed from: a */
    public abstract void mo1458a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Activity mo1490b() {
        return this.f1479a;
    }

    /* renamed from: b */
    public abstract boolean mo1459b(C0339l lVar);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Context mo1491c() {
        return this.f1480b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0360y mo1492d() {
        return this.f1483e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Handler mo1493e() {
        return this.f1481c;
    }

    /* renamed from: f */
    public abstract LayoutInflater mo1460f();

    /* renamed from: g */
    public abstract int mo1461g();

    /* renamed from: h */
    public abstract boolean mo1462h();

    /* renamed from: i */
    public abstract void mo1463i();
}
