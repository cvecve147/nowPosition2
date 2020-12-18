package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.C2035m;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.I */
final class C2006I implements ServiceConnection {

    /* renamed from: a */
    private final Set<ServiceConnection> f6410a = new HashSet();

    /* renamed from: b */
    private int f6411b = 2;

    /* renamed from: c */
    private boolean f6412c;

    /* renamed from: d */
    private IBinder f6413d;

    /* renamed from: e */
    private final C2035m.C2036a f6414e;

    /* renamed from: f */
    private ComponentName f6415f;

    /* renamed from: g */
    private final /* synthetic */ C2005H f6416g;

    public C2006I(C2005H h, C2035m.C2036a aVar) {
        this.f6416g = h;
        this.f6414e = aVar;
    }

    /* renamed from: a */
    public final IBinder mo7584a() {
        return this.f6413d;
    }

    /* renamed from: a */
    public final void mo7585a(ServiceConnection serviceConnection, String str) {
        this.f6416g.f6407f.mo7508a(this.f6416g.f6405d, serviceConnection, str, this.f6414e.mo7693a(this.f6416g.f6405d));
        this.f6410a.add(serviceConnection);
    }

    /* renamed from: a */
    public final void mo7586a(String str) {
        this.f6411b = 3;
        this.f6412c = this.f6416g.f6407f.mo7510a(this.f6416g.f6405d, str, this.f6414e.mo7693a(this.f6416g.f6405d), this, this.f6414e.mo7692a());
        if (this.f6412c) {
            this.f6416g.f6406e.sendMessageDelayed(this.f6416g.f6406e.obtainMessage(1, this.f6414e), this.f6416g.f6409h);
            return;
        }
        this.f6411b = 2;
        try {
            this.f6416g.f6407f.mo7511b(this.f6416g.f6405d, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: a */
    public final boolean mo7587a(ServiceConnection serviceConnection) {
        return this.f6410a.contains(serviceConnection);
    }

    /* renamed from: b */
    public final ComponentName mo7588b() {
        return this.f6415f;
    }

    /* renamed from: b */
    public final void mo7589b(ServiceConnection serviceConnection, String str) {
        this.f6416g.f6407f.mo7507a(this.f6416g.f6405d, serviceConnection);
        this.f6410a.remove(serviceConnection);
    }

    /* renamed from: b */
    public final void mo7590b(String str) {
        this.f6416g.f6406e.removeMessages(1, this.f6414e);
        this.f6416g.f6407f.mo7511b(this.f6416g.f6405d, this);
        this.f6412c = false;
        this.f6411b = 2;
    }

    /* renamed from: c */
    public final int mo7591c() {
        return this.f6411b;
    }

    /* renamed from: d */
    public final boolean mo7592d() {
        return this.f6412c;
    }

    /* renamed from: e */
    public final boolean mo7593e() {
        return this.f6410a.isEmpty();
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f6416g.f6404c) {
            this.f6416g.f6406e.removeMessages(1, this.f6414e);
            this.f6413d = iBinder;
            this.f6415f = componentName;
            for (ServiceConnection onServiceConnected : this.f6410a) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f6411b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f6416g.f6404c) {
            this.f6416g.f6406e.removeMessages(1, this.f6414e);
            this.f6413d = null;
            this.f6415f = componentName;
            for (ServiceConnection onServiceDisconnected : this.f6410a) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f6411b = 2;
        }
    }
}
