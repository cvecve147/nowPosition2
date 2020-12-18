package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.google.android.gms.internal.ads.yp */
public abstract class C3642yp implements C3614xp {

    /* renamed from: a */
    protected static volatile C2701Sp f10586a;

    /* renamed from: b */
    protected MotionEvent f10587b;

    /* renamed from: c */
    protected LinkedList<MotionEvent> f10588c = new LinkedList<>();

    /* renamed from: d */
    protected long f10589d = 0;

    /* renamed from: e */
    protected long f10590e = 0;

    /* renamed from: f */
    protected long f10591f = 0;

    /* renamed from: g */
    protected long f10592g = 0;

    /* renamed from: h */
    protected long f10593h = 0;

    /* renamed from: i */
    protected long f10594i = 0;

    /* renamed from: j */
    protected long f10595j = 0;

    /* renamed from: k */
    protected double f10596k;

    /* renamed from: l */
    private double f10597l;

    /* renamed from: m */
    private double f10598m;

    /* renamed from: n */
    protected float f10599n;

    /* renamed from: o */
    protected float f10600o;

    /* renamed from: p */
    protected float f10601p;

    /* renamed from: q */
    protected float f10602q;

    /* renamed from: r */
    private boolean f10603r = false;

    /* renamed from: s */
    protected boolean f10604s = false;

    /* renamed from: t */
    protected DisplayMetrics f10605t;

    protected C3642yp(Context context) {
        try {
            if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7992wc)).booleanValue()) {
                C3010cp.m12104a();
            } else {
                C2870Yp.m11637a(f10586a);
            }
            this.f10605t = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private final String m14621a(Context context, String str, boolean z, View view, Activity activity, byte[] bArr) {
        C2921_l _lVar;
        int i;
        if (z) {
            try {
                _lVar = mo10253a(context, view, activity);
                this.f10603r = true;
            } catch (UnsupportedEncodingException | GeneralSecurityException unused) {
                i = 7;
                return Integer.toString(i);
            } catch (Throwable unused2) {
                i = 3;
                return Integer.toString(i);
            }
        } else {
            _lVar = mo10254a(context, (C3609xk) null);
        }
        if (_lVar != null) {
            if (_lVar.mo8362a() != 0) {
                return C3010cp.m12101a(_lVar, str);
            }
        }
        return Integer.toString(5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract long mo10252a(StackTraceElement[] stackTraceElementArr);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C2921_l mo10253a(Context context, View view, Activity activity);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C2921_l mo10254a(Context context, C3609xk xkVar);

    /* renamed from: a */
    public final String mo6943a(Context context) {
        if (C2925_p.m11871a()) {
            if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f8004yc)).booleanValue()) {
                throw new IllegalStateException("The caller must not be called from the UI thread.");
            }
        }
        return m14621a(context, (String) null, false, (View) null, (Activity) null, (byte[]) null);
    }

    /* renamed from: a */
    public final String mo6944a(Context context, String str, View view) {
        return mo6945a(context, str, view, (Activity) null);
    }

    /* renamed from: a */
    public final String mo6945a(Context context, String str, View view, Activity activity) {
        return m14621a(context, str, true, view, activity, (byte[]) null);
    }

    /* renamed from: a */
    public final void mo6946a(int i, int i2, int i3) {
        MotionEvent motionEvent;
        MotionEvent motionEvent2 = this.f10587b;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        DisplayMetrics displayMetrics = this.f10605t;
        if (displayMetrics != null) {
            float f = displayMetrics.density;
            motionEvent = MotionEvent.obtain(0, (long) i3, 1, ((float) i) * f, ((float) i2) * f, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            motionEvent = null;
        }
        this.f10587b = motionEvent;
        this.f10604s = false;
    }

    /* renamed from: a */
    public final void mo6947a(MotionEvent motionEvent) {
        boolean z = false;
        if (this.f10603r) {
            this.f10592g = 0;
            this.f10591f = 0;
            this.f10590e = 0;
            this.f10589d = 0;
            this.f10593h = 0;
            this.f10595j = 0;
            this.f10594i = 0;
            Iterator it = this.f10588c.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.f10588c.clear();
            this.f10587b = null;
            this.f10603r = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f10596k = 0.0d;
            this.f10597l = (double) motionEvent.getRawX();
            this.f10598m = (double) motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = (double) motionEvent.getRawX();
            double rawY = (double) motionEvent.getRawY();
            double d = rawX - this.f10597l;
            double d2 = rawY - this.f10598m;
            this.f10596k += Math.sqrt((d * d) + (d2 * d2));
            this.f10597l = rawX;
            this.f10598m = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 == 0) {
            this.f10599n = motionEvent.getX();
            this.f10600o = motionEvent.getY();
            this.f10601p = motionEvent.getRawX();
            this.f10602q = motionEvent.getRawY();
            this.f10589d++;
        } else if (action2 == 1) {
            this.f10587b = MotionEvent.obtain(motionEvent);
            this.f10588c.add(this.f10587b);
            if (this.f10588c.size() > 6) {
                this.f10588c.remove().recycle();
            }
            this.f10591f++;
            this.f10593h = mo10252a(new Throwable().getStackTrace());
        } else if (action2 == 2) {
            this.f10590e += (long) (motionEvent.getHistorySize() + 1);
            try {
                C2897Zp b = mo10255b(motionEvent);
                if ((b == null || b.f8704e == null || b.f8707h == null) ? false : true) {
                    this.f10594i += b.f8704e.longValue() + b.f8707h.longValue();
                }
                if (!(this.f10605t == null || b == null || b.f8705f == null || b.f8708i == null)) {
                    z = true;
                }
                if (z) {
                    this.f10595j += b.f8705f.longValue() + b.f8708i.longValue();
                }
            } catch (C2616Pp unused) {
            }
        } else if (action2 == 3) {
            this.f10592g++;
        }
        this.f10604s = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C2897Zp mo10255b(MotionEvent motionEvent);
}
