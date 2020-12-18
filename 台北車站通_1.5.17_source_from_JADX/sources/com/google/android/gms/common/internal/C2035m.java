package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

/* renamed from: com.google.android.gms.common.internal.m */
public abstract class C2035m {

    /* renamed from: a */
    private static final Object f6502a = new Object();

    /* renamed from: b */
    private static C2035m f6503b;

    /* renamed from: com.google.android.gms.common.internal.m$a */
    protected static final class C2036a {

        /* renamed from: a */
        private final String f6504a;

        /* renamed from: b */
        private final String f6505b;

        /* renamed from: c */
        private final ComponentName f6506c = null;

        /* renamed from: d */
        private final int f6507d;

        public C2036a(String str, String str2, int i) {
            C2061y.m9076b(str);
            this.f6504a = str;
            C2061y.m9076b(str2);
            this.f6505b = str2;
            this.f6507d = i;
        }

        /* renamed from: a */
        public final int mo7692a() {
            return this.f6507d;
        }

        /* renamed from: a */
        public final Intent mo7693a(Context context) {
            String str = this.f6504a;
            return str != null ? new Intent(str).setPackage(this.f6505b) : new Intent().setComponent(this.f6506c);
        }

        /* renamed from: b */
        public final ComponentName mo7694b() {
            return this.f6506c;
        }

        /* renamed from: c */
        public final String mo7695c() {
            return this.f6505b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2036a)) {
                return false;
            }
            C2036a aVar = (C2036a) obj;
            return C2059x.m9064a(this.f6504a, aVar.f6504a) && C2059x.m9064a(this.f6505b, aVar.f6505b) && C2059x.m9064a(this.f6506c, aVar.f6506c) && this.f6507d == aVar.f6507d;
        }

        public final int hashCode() {
            return C2059x.m9062a(this.f6504a, this.f6505b, this.f6506c, Integer.valueOf(this.f6507d));
        }

        public final String toString() {
            String str = this.f6504a;
            return str == null ? this.f6506c.flattenToString() : str;
        }
    }

    /* renamed from: a */
    public static C2035m m8974a(Context context) {
        synchronized (f6502a) {
            if (f6503b == null) {
                f6503b = new C2005H(context.getApplicationContext());
            }
        }
        return f6503b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo7581a(C2036a aVar, ServiceConnection serviceConnection, String str);

    /* renamed from: a */
    public boolean mo7690a(String str, String str2, int i, ServiceConnection serviceConnection, String str3) {
        return mo7581a(new C2036a(str, str2, i), serviceConnection, str3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo7582b(C2036a aVar, ServiceConnection serviceConnection, String str);

    /* renamed from: b */
    public void mo7691b(String str, String str2, int i, ServiceConnection serviceConnection, String str3) {
        mo7582b(new C2036a(str, str2, i), serviceConnection, str3);
    }
}
