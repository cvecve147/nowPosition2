package com.google.android.gms.maps.p075a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.maps.a.n */
public class C3972n {

    /* renamed from: a */
    private static final String f11864a = "n";
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b */
    private static Context f11865b;

    /* renamed from: c */
    private static C3973o f11866c;

    /* JADX WARNING: type inference failed for: r1v4, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.maps.p075a.C3973o m16061a(android.content.Context r3) {
        /*
            com.google.android.gms.common.internal.C2061y.m9067a(r3)
            com.google.android.gms.maps.a.o r0 = f11866c
            if (r0 == 0) goto L_0x0008
            return r0
        L_0x0008:
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r0 = com.google.android.gms.common.C2064k.isGooglePlayServicesAvailable(r3, r0)
            if (r0 != 0) goto L_0x005f
            java.lang.String r0 = f11864a
            java.lang.String r1 = "Making Creator dynamically"
            android.util.Log.i(r0, r1)
            android.content.Context r0 = m16064b(r3)
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.String r1 = "com.google.android.gms.maps.internal.CreatorImpl"
            java.lang.Object r0 = m16063a(r0, r1)
            android.os.IBinder r0 = (android.os.IBinder) r0
            if (r0 != 0) goto L_0x002c
            r0 = 0
            goto L_0x0040
        L_0x002c:
            java.lang.String r1 = "com.google.android.gms.maps.internal.ICreator"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.maps.p075a.C3973o
            if (r2 == 0) goto L_0x003a
            r0 = r1
            com.google.android.gms.maps.a.o r0 = (com.google.android.gms.maps.p075a.C3973o) r0
            goto L_0x0040
        L_0x003a:
            com.google.android.gms.maps.a.p r1 = new com.google.android.gms.maps.a.p
            r1.<init>(r0)
            r0 = r1
        L_0x0040:
            f11866c = r0
            com.google.android.gms.maps.a.o r0 = f11866c     // Catch:{ RemoteException -> 0x0058 }
            android.content.Context r3 = m16064b(r3)     // Catch:{ RemoteException -> 0x0058 }
            android.content.res.Resources r3 = r3.getResources()     // Catch:{ RemoteException -> 0x0058 }
            d.g.b.a.b.b r3 = p101d.p129g.p131b.p132a.p134b.C5468d.m20961a(r3)     // Catch:{ RemoteException -> 0x0058 }
            int r1 = com.google.android.gms.common.GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE     // Catch:{ RemoteException -> 0x0058 }
            r0.mo11240c(r3, r1)     // Catch:{ RemoteException -> 0x0058 }
            com.google.android.gms.maps.a.o r3 = f11866c
            return r3
        L_0x0058:
            r3 = move-exception
            com.google.android.gms.maps.model.d r0 = new com.google.android.gms.maps.model.d
            r0.<init>(r3)
            throw r0
        L_0x005f:
            com.google.android.gms.common.i r3 = new com.google.android.gms.common.i
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.p075a.C3972n.m16061a(android.content.Context):com.google.android.gms.maps.a.o");
    }

    /* renamed from: a */
    private static <T> T m16062a(Class<?> cls) {
        try {
            return cls.newInstance();
        } catch (InstantiationException unused) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalStateException(valueOf.length() != 0 ? "Unable to instantiate the dynamic class ".concat(valueOf) : new String("Unable to instantiate the dynamic class "));
        } catch (IllegalAccessException unused2) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new IllegalStateException(valueOf2.length() != 0 ? "Unable to call the default constructor of ".concat(valueOf2) : new String("Unable to call the default constructor of "));
        }
    }

    /* renamed from: a */
    private static <T> T m16063a(ClassLoader classLoader, String str) {
        try {
            C2061y.m9067a(classLoader);
            return m16062a(classLoader.loadClass(str));
        } catch (ClassNotFoundException unused) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Unable to find dynamic class ".concat(valueOf) : new String("Unable to find dynamic class "));
        }
    }

    /* renamed from: b */
    private static Context m16064b(Context context) {
        Context context2 = f11865b;
        if (context2 != null) {
            return context2;
        }
        Context c = m16065c(context);
        f11865b = c;
        return c;
    }

    /* renamed from: c */
    private static Context m16065c(Context context) {
        try {
            return DynamiteModule.m9187a(context, DynamiteModule.f6574g, "com.google.android.gms.maps_dynamite").mo7729a();
        } catch (Throwable th) {
            Log.e(f11864a, "Failed to load maps module, use legacy", th);
            return GooglePlayServicesUtil.getRemoteContext(context);
        }
    }
}
