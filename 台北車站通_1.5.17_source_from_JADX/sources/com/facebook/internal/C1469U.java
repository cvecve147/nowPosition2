package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

/* renamed from: com.facebook.internal.U */
public abstract class C1469U implements ServiceConnection {

    /* renamed from: a */
    private final Context f5095a;

    /* renamed from: b */
    private final Handler f5096b;

    /* renamed from: c */
    private C1470a f5097c;

    /* renamed from: d */
    private boolean f5098d;

    /* renamed from: e */
    private Messenger f5099e;

    /* renamed from: f */
    private int f5100f;

    /* renamed from: g */
    private int f5101g;

    /* renamed from: h */
    private final String f5102h;

    /* renamed from: i */
    private final int f5103i;

    /* renamed from: com.facebook.internal.U$a */
    public interface C1470a {
        /* renamed from: a */
        void mo6173a(Bundle bundle);
    }

    public C1469U(Context context, int i, int i2, int i3, String str) {
        Context applicationContext = context.getApplicationContext();
        this.f5095a = applicationContext != null ? applicationContext : context;
        this.f5100f = i;
        this.f5101g = i2;
        this.f5102h = str;
        this.f5103i = i3;
        this.f5096b = new C1468T(this);
    }

    /* renamed from: b */
    private void m6895b(Bundle bundle) {
        if (this.f5098d) {
            this.f5098d = false;
            C1470a aVar = this.f5097c;
            if (aVar != null) {
                aVar.mo6173a(bundle);
            }
        }
    }

    /* renamed from: c */
    private void m6896c() {
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.f5102h);
        mo6167a(bundle);
        Message obtain = Message.obtain((Handler) null, this.f5100f);
        obtain.arg1 = this.f5103i;
        obtain.setData(bundle);
        obtain.replyTo = new Messenger(this.f5096b);
        try {
            this.f5099e.send(obtain);
        } catch (RemoteException unused) {
            m6895b((Bundle) null);
        }
    }

    /* renamed from: a */
    public void mo6166a() {
        this.f5098d = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo6167a(Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6168a(Message message) {
        if (message.what == this.f5101g) {
            Bundle data = message.getData();
            if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                data = null;
            }
            m6895b(data);
            try {
                this.f5095a.unbindService(this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo6169a(C1470a aVar) {
        this.f5097c = aVar;
    }

    /* renamed from: b */
    public boolean mo6170b() {
        Intent a;
        if (this.f5098d || C1461S.m6852a(this.f5103i) == -1 || (a = C1461S.m6854a(this.f5095a)) == null) {
            return false;
        }
        this.f5098d = true;
        this.f5095a.bindService(a, this, 1);
        return true;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f5099e = new Messenger(iBinder);
        m6896c();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.f5099e = null;
        try {
            this.f5095a.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        m6895b((Bundle) null);
    }
}
