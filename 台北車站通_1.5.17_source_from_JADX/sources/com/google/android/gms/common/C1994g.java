package com.google.android.gms.common;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C2044s;
import com.google.android.gms.common.internal.C2055v;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.dynamite.DynamiteModule;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p134b.C5468d;

/* renamed from: com.google.android.gms.common.g */
final class C1994g {

    /* renamed from: a */
    private static volatile C2055v f6373a;

    /* renamed from: b */
    private static final Object f6374b = new Object();

    /* renamed from: c */
    private static Context f6375c;

    /* renamed from: com.google.android.gms.common.g$a */
    static abstract class C1995a extends C2044s.C2045a {

        /* renamed from: a */
        private int f6376a;

        protected C1995a(byte[] bArr) {
            C2061y.m9073a(bArr.length == 25);
            this.f6376a = Arrays.hashCode(bArr);
        }

        /* renamed from: o */
        protected static byte[] m8791o(String str) {
            try {
                return str.getBytes("ISO-8859-1");
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Xa */
        public abstract byte[] mo7547Xa();

        /* renamed from: Y */
        public int mo7548Y() {
            return hashCode();
        }

        public boolean equals(Object obj) {
            C5464b oa;
            if (obj != null && (obj instanceof C2044s)) {
                try {
                    C2044s sVar = (C2044s) obj;
                    if (sVar.mo7548Y() != hashCode() || (oa = sVar.mo7551oa()) == null) {
                        return false;
                    }
                    return Arrays.equals(mo7547Xa(), (byte[]) C5468d.m20962z(oa));
                } catch (RemoteException e) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f6376a;
        }

        /* renamed from: oa */
        public C5464b mo7551oa() {
            return C5468d.m20961a(mo7547Xa());
        }
    }

    /* renamed from: a */
    static C2074u m8788a(String str, C1995a aVar, boolean z) {
        String str2;
        try {
            m8789a();
            C2061y.m9067a(f6375c);
            try {
                if (f6373a.mo7710a(new GoogleCertificatesQuery(str, aVar, z), C5468d.m20961a(f6375c.getPackageManager()))) {
                    return C2074u.m9100b();
                }
                boolean z2 = true;
                if (z || !m8788a(str, aVar, true).f6534b) {
                    z2 = false;
                }
                return C2074u.m9098a(str, aVar, z, z2);
            } catch (RemoteException e) {
                e = e;
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                str2 = "module call";
                return C2074u.m9099a(str2, e);
            }
        } catch (DynamiteModule.C2101a e2) {
            e = e2;
            str2 = "module init";
            return C2074u.m9099a(str2, e);
        }
    }

    /* renamed from: a */
    private static void m8789a() {
        if (f6373a == null) {
            C2061y.m9067a(f6375c);
            synchronized (f6374b) {
                if (f6373a == null) {
                    f6373a = C2055v.C2056a.asInterface(DynamiteModule.m9187a(f6375c, DynamiteModule.f6577j, "com.google.android.gms.googlecertificates").mo7730a("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized void m8790a(android.content.Context r2) {
        /*
            java.lang.Class<com.google.android.gms.common.g> r0 = com.google.android.gms.common.C1994g.class
            monitor-enter(r0)
            android.content.Context r1 = f6375c     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0011
            if (r2 == 0) goto L_0x0018
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x001a }
            f6375c = r2     // Catch:{ all -> 0x001a }
            monitor-exit(r0)
            return
        L_0x0011:
            java.lang.String r2 = "GoogleCertificates"
            java.lang.String r1 = "GoogleCertificates has been initialized already"
            android.util.Log.w(r2, r1)     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r0)
            return
        L_0x001a:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.C1994g.m8790a(android.content.Context):void");
    }
}
