package p013b.p018b.p021c;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import p013b.p018b.p021c.C0951o;

/* renamed from: b.b.c.l */
public abstract class C0947l implements ServiceConnection {
    /* renamed from: a */
    public abstract void mo4840a(ComponentName componentName, C0942h hVar);

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        mo4840a(componentName, new C0946k(this, C0951o.C0952a.m5256a(iBinder), componentName));
    }
}
