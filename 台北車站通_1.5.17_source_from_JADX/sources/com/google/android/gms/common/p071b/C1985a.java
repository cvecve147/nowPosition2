package com.google.android.gms.common.p071b;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import com.google.android.gms.common.util.C2082d;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.common.b.a */
public class C1985a {

    /* renamed from: a */
    private static final Object f6351a = new Object();

    /* renamed from: b */
    private static volatile C1985a f6352b;

    /* renamed from: c */
    private static boolean f6353c = false;

    /* renamed from: d */
    private final List<String> f6354d;

    /* renamed from: e */
    private final List<String> f6355e;

    /* renamed from: f */
    private final List<String> f6356f;

    /* renamed from: g */
    private final List<String> f6357g;

    private C1985a() {
        List<String> list = Collections.EMPTY_LIST;
        this.f6354d = list;
        this.f6355e = list;
        this.f6356f = list;
        this.f6357g = list;
    }

    /* renamed from: a */
    public static C1985a m8731a() {
        if (f6352b == null) {
            synchronized (f6351a) {
                if (f6352b == null) {
                    f6352b = new C1985a();
                }
            }
        }
        return f6352b;
    }

    @SuppressLint({"UntrackedBindService"})
    /* renamed from: a */
    private static boolean m8732a(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, boolean z) {
        if (z) {
            ComponentName component = intent.getComponent();
            if (component == null ? false : C2082d.m9113c(context, component.getPackageName())) {
                Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                return false;
            }
        }
        return context.bindService(intent, serviceConnection, i);
    }

    /* renamed from: a */
    public void mo7507a(Context context, ServiceConnection serviceConnection) {
    }

    /* renamed from: a */
    public void mo7508a(Context context, ServiceConnection serviceConnection, String str, Intent intent) {
    }

    /* renamed from: a */
    public boolean mo7509a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return mo7510a(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    /* renamed from: a */
    public boolean mo7510a(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        return m8732a(context, str, intent, serviceConnection, i, true);
    }

    @SuppressLint({"UntrackedBindService"})
    /* renamed from: b */
    public void mo7511b(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
    }
}
