package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ConditionVariable;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* renamed from: com.google.android.gms.internal.ads.vp */
public class C3558vp {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final ConditionVariable f10386a = new ConditionVariable();

    /* renamed from: b */
    protected static volatile C3389ps f10387b = null;

    /* renamed from: c */
    private static volatile Random f10388c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C2701Sp f10389d;

    /* renamed from: e */
    protected volatile Boolean f10390e;

    public C3558vp(C2701Sp sp) {
        this.f10389d = sp;
        sp.mo8838c().execute(new C3586wp(this));
    }

    /* renamed from: a */
    public static int m14287a() {
        try {
            return Build.VERSION.SDK_INT >= 21 ? ThreadLocalRandom.current().nextInt() : m14290c().nextInt();
        } catch (RuntimeException unused) {
            return m14290c().nextInt();
        }
    }

    /* renamed from: c */
    private static Random m14290c() {
        if (f10388c == null) {
            synchronized (C3558vp.class) {
                if (f10388c == null) {
                    f10388c = new Random();
                }
            }
        }
        return f10388c;
    }

    /* renamed from: a */
    public final void mo10151a(int i, int i2, long j) {
        try {
            f10386a.block();
            if (this.f10390e.booleanValue() && f10387b != null) {
                C2835Xj xj = new C2835Xj();
                xj.f8614c = this.f10389d.f8286b.getPackageName();
                xj.f8615d = Long.valueOf(j);
                C3446rs a = f10387b.mo9898a(C2408Io.m10310a((C2408Io) xj));
                a.mo9988a(i2);
                a.mo9990b(i);
                a.mo9989a();
            }
        } catch (Exception unused) {
        }
    }
}
