package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.C2035m;
import com.google.android.gms.common.p071b.C1985a;
import java.util.HashMap;

/* renamed from: com.google.android.gms.common.internal.H */
final class C2005H extends C2035m implements Handler.Callback {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final HashMap<C2035m.C2036a, C2006I> f6404c = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Context f6405d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Handler f6406e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C1985a f6407f;

    /* renamed from: g */
    private final long f6408g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final long f6409h;

    C2005H(Context context) {
        this.f6405d = context.getApplicationContext();
        this.f6406e = new Handler(context.getMainLooper(), this);
        this.f6407f = C1985a.m8731a();
        this.f6408g = 5000;
        this.f6409h = 300000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7581a(C2035m.C2036a aVar, ServiceConnection serviceConnection, String str) {
        boolean d;
        C2061y.m9068a(serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f6404c) {
            C2006I i = this.f6404c.get(aVar);
            if (i == null) {
                i = new C2006I(this, aVar);
                i.mo7585a(serviceConnection, str);
                i.mo7586a(str);
                this.f6404c.put(aVar, i);
            } else {
                this.f6406e.removeMessages(0, aVar);
                if (!i.mo7587a(serviceConnection)) {
                    i.mo7585a(serviceConnection, str);
                    int c = i.mo7591c();
                    if (c == 1) {
                        serviceConnection.onServiceConnected(i.mo7588b(), i.mo7584a());
                    } else if (c == 2) {
                        i.mo7586a(str);
                    }
                } else {
                    String valueOf = String.valueOf(aVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            d = i.mo7592d();
        }
        return d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo7582b(C2035m.C2036a aVar, ServiceConnection serviceConnection, String str) {
        C2061y.m9068a(serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f6404c) {
            C2006I i = this.f6404c.get(aVar);
            if (i == null) {
                String valueOf = String.valueOf(aVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (i.mo7587a(serviceConnection)) {
                i.mo7589b(serviceConnection, str);
                if (i.mo7593e()) {
                    this.f6406e.sendMessageDelayed(this.f6406e.obtainMessage(0, aVar), this.f6408g);
                }
            } else {
                String valueOf2 = String.valueOf(aVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f6404c) {
                C2035m.C2036a aVar = (C2035m.C2036a) message.obj;
                C2006I i2 = this.f6404c.get(aVar);
                if (i2 != null && i2.mo7593e()) {
                    if (i2.mo7592d()) {
                        i2.mo7590b("GmsClientSupervisor");
                    }
                    this.f6404c.remove(aVar);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.f6404c) {
                C2035m.C2036a aVar2 = (C2035m.C2036a) message.obj;
                C2006I i3 = this.f6404c.get(aVar2);
                if (i3 != null && i3.mo7591c() == 3) {
                    String valueOf = String.valueOf(aVar2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.wtf("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName b = i3.mo7588b();
                    if (b == null) {
                        b = aVar2.mo7694b();
                    }
                    if (b == null) {
                        b = new ComponentName(aVar2.mo7695c(), "unknown");
                    }
                    i3.onServiceDisconnected(b);
                }
            }
            return true;
        }
    }
}
