package com.google.android.gms.internal.vision;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.internal.vision.i */
public abstract class C3932i<T> {

    /* renamed from: a */
    private final Context f11797a;

    /* renamed from: b */
    private final Object f11798b = new Object();

    /* renamed from: c */
    private final String f11799c;

    /* renamed from: d */
    private boolean f11800d = false;

    /* renamed from: e */
    private T f11801e;

    public C3932i(Context context, String str) {
        this.f11797a = context;
        this.f11799c = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo11120a(DynamiteModule dynamiteModule, Context context);

    /* renamed from: a */
    public final boolean mo11128a() {
        return mo11130d() != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo11123b();

    /* renamed from: c */
    public final void mo11129c() {
        synchronized (this.f11798b) {
            if (this.f11801e != null) {
                try {
                    mo11123b();
                } catch (RemoteException e) {
                    Log.e(this.f11799c, "Could not finalize native handle", e);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final T mo11130d() {
        synchronized (this.f11798b) {
            if (this.f11801e != null) {
                T t = this.f11801e;
                return t;
            }
            try {
                this.f11801e = mo11120a(DynamiteModule.m9187a(this.f11797a, DynamiteModule.f6578k, "com.google.android.gms.vision.dynamite"), this.f11797a);
            } catch (RemoteException | DynamiteModule.C2101a e) {
                Log.e(this.f11799c, "Error creating remote native handle", e);
            }
            if (!this.f11800d && this.f11801e == null) {
                Log.w(this.f11799c, "Native handle not yet available. Reverting to no-op handle.");
                this.f11800d = true;
            } else if (this.f11800d && this.f11801e != null) {
                Log.w(this.f11799c, "Native handle is now available.");
            }
            T t2 = this.f11801e;
            return t2;
        }
    }
}
