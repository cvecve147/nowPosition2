package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.x */
public final class C2059x {

    /* renamed from: com.google.android.gms.common.internal.x$a */
    public static final class C2060a {

        /* renamed from: a */
        private final List<String> f6521a;

        /* renamed from: b */
        private final Object f6522b;

        private C2060a(Object obj) {
            C2061y.m9067a(obj);
            this.f6522b = obj;
            this.f6521a = new ArrayList();
        }

        /* renamed from: a */
        public final C2060a mo7711a(String str, Object obj) {
            List<String> list = this.f6521a;
            C2061y.m9067a(str);
            String str2 = str;
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(valueOf).length());
            sb.append(str2);
            sb.append("=");
            sb.append(valueOf);
            list.add(sb.toString());
            return this;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f6522b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f6521a.size();
            for (int i = 0; i < size; i++) {
                sb.append(this.f6521a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static int m9062a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: a */
    public static C2060a m9063a(Object obj) {
        return new C2060a(obj);
    }

    /* renamed from: a */
    public static boolean m9064a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
