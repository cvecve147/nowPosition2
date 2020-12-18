package p013b.p018b.p021c;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;

/* renamed from: b.b.c.m */
public final class C0948m {

    /* renamed from: a */
    private final Object f3773a = new Object();

    /* renamed from: b */
    private final C0951o f3774b;

    /* renamed from: c */
    private final C0949n f3775c;

    /* renamed from: d */
    private final ComponentName f3776d;

    C0948m(C0951o oVar, C0949n nVar, ComponentName componentName) {
        this.f3774b = oVar;
        this.f3775c = nVar;
        this.f3776d = componentName;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public IBinder mo4842a() {
        return this.f3775c.asBinder();
    }

    /* renamed from: a */
    public boolean mo4843a(Uri uri, Bundle bundle, List<Bundle> list) {
        try {
            return this.f3774b.mo4849a(this.f3775c, uri, bundle, list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ComponentName mo4844b() {
        return this.f3776d;
    }
}
