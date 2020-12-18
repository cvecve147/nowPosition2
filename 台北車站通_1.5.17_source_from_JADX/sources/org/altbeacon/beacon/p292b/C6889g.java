package org.altbeacon.beacon.p292b;

import android.content.Context;
import android.os.AsyncTask;
import android.provider.Settings;

/* renamed from: org.altbeacon.beacon.b.g */
public class C6889g extends AsyncTask<Void, Void, Void> {

    /* renamed from: a */
    private Exception f18985a = null;

    /* renamed from: b */
    private String f18986b = null;

    /* renamed from: c */
    private String f18987c = null;

    /* renamed from: d */
    private Context f18988d;

    /* renamed from: e */
    private C6886d f18989e;

    /* renamed from: f */
    private C6890a f18990f;

    /* renamed from: org.altbeacon.beacon.b.g$a */
    interface C6890a {
        /* renamed from: a */
        void mo18733a(String str, Exception exc, int i);
    }

    public C6889g(Context context, String str, C6890a aVar) {
        this.f18988d = context;
        this.f18989e = new C6886d(str, m26004d());
        this.f18990f = aVar;
    }

    /* renamed from: a */
    private String m26001a() {
        return Settings.Secure.getString(this.f18988d.getContentResolver(), "android_id");
    }

    /* renamed from: b */
    private String m26002b() {
        return C6883a.m25972a().toString();
    }

    /* renamed from: c */
    private String m26003c() {
        return this.f18988d.getPackageName();
    }

    /* renamed from: d */
    private String m26004d() {
        return "Android Beacon Library;" + m26005e() + ";" + m26003c() + ";" + m26001a() + ";" + m26002b();
    }

    /* renamed from: e */
    private String m26005e() {
        return "2.16.1";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Void doInBackground(Void... voidArr) {
        this.f18989e.mo18732d();
        C6890a aVar = this.f18990f;
        if (aVar == null) {
            return null;
        }
        aVar.mo18733a(this.f18989e.mo18731c(), this.f18989e.mo18729a(), this.f18989e.mo18730b());
        return null;
    }
}
