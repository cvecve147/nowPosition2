package p208e.p209a.p210a.p211a;

import android.util.Log;

/* renamed from: e.a.a.a.c */
public class C6196c implements C6211p {

    /* renamed from: a */
    private int f17281a;

    public C6196c() {
        this.f17281a = 4;
    }

    public C6196c(int i) {
        this.f17281a = i;
    }

    /* renamed from: a */
    public void mo16260a(int i, String str, String str2) {
        mo16261a(i, str, str2, false);
    }

    /* renamed from: a */
    public void mo16261a(int i, String str, String str2, boolean z) {
        if (z || mo16264a(str, i)) {
            Log.println(i, str, str2);
        }
    }

    /* renamed from: a */
    public void mo16262a(String str, String str2) {
        mo16263a(str, str2, (Throwable) null);
    }

    /* renamed from: a */
    public void mo16263a(String str, String str2, Throwable th) {
        if (mo16264a(str, 5)) {
            Log.w(str, str2, th);
        }
    }

    /* renamed from: a */
    public boolean mo16264a(String str, int i) {
        return this.f17281a <= i;
    }

    /* renamed from: b */
    public void mo16265b(String str, String str2) {
        mo16266b(str, str2, (Throwable) null);
    }

    /* renamed from: b */
    public void mo16266b(String str, String str2, Throwable th) {
        if (mo16264a(str, 6)) {
            Log.e(str, str2, th);
        }
    }

    /* renamed from: c */
    public void mo16267c(String str, String str2) {
        mo16272e(str, str2, (Throwable) null);
    }

    /* renamed from: c */
    public void mo16268c(String str, String str2, Throwable th) {
        if (mo16264a(str, 3)) {
            Log.d(str, str2, th);
        }
    }

    /* renamed from: d */
    public void mo16269d(String str, String str2) {
        mo16268c(str, str2, (Throwable) null);
    }

    /* renamed from: d */
    public void mo16270d(String str, String str2, Throwable th) {
        if (mo16264a(str, 4)) {
            Log.i(str, str2, th);
        }
    }

    /* renamed from: e */
    public void mo16271e(String str, String str2) {
        mo16270d(str, str2, (Throwable) null);
    }

    /* renamed from: e */
    public void mo16272e(String str, String str2, Throwable th) {
        if (mo16264a(str, 2)) {
            Log.v(str, str2, th);
        }
    }
}
