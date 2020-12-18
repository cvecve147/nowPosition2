package p013b.p018b.p021c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.text.TextUtils;

/* renamed from: b.b.c.h */
public class C0942h {

    /* renamed from: a */
    private final C0951o f3763a;

    /* renamed from: b */
    private final ComponentName f3764b;

    C0942h(C0951o oVar, ComponentName componentName) {
        this.f3763a = oVar;
        this.f3764b = componentName;
    }

    /* renamed from: a */
    public static boolean m5239a(Context context, String str, C0947l lVar) {
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, lVar, 33);
    }

    /* renamed from: a */
    public C0948m mo4836a(C0935a aVar) {
        C0941g gVar = new C0941g(this, aVar);
        try {
            if (!this.f3763a.mo4848a((C0949n) gVar)) {
                return null;
            }
            return new C0948m(this.f3763a, gVar, this.f3764b);
        } catch (RemoteException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public boolean mo4837a(long j) {
        try {
            return this.f3763a.mo4847a(j);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
