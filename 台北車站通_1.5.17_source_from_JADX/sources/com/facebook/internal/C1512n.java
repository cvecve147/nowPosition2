package com.facebook.internal;

import android.content.Intent;
import com.facebook.C1428i;
import com.facebook.C1601x;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.internal.n */
public final class C1512n implements C1428i {

    /* renamed from: a */
    private static Map<Integer, C1513a> f5189a = new HashMap();

    /* renamed from: b */
    private Map<Integer, C1513a> f5190b = new HashMap();

    /* renamed from: com.facebook.internal.n$a */
    public interface C1513a {
        /* renamed from: a */
        boolean mo6239a(int i, Intent intent);
    }

    /* renamed from: com.facebook.internal.n$b */
    public enum C1514b {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8);
        

        /* renamed from: k */
        private final int f5201k;

        private C1514b(int i) {
            this.f5201k = i;
        }

        /* renamed from: a */
        public int mo6240a() {
            return C1601x.m7393f() + this.f5201k;
        }
    }

    /* renamed from: a */
    private static synchronized C1513a m7060a(Integer num) {
        C1513a aVar;
        synchronized (C1512n.class) {
            aVar = f5189a.get(num);
        }
        return aVar;
    }

    /* renamed from: a */
    private static boolean m7061a(int i, int i2, Intent intent) {
        C1513a a = m7060a(Integer.valueOf(i));
        if (a != null) {
            return a.mo6239a(i2, intent);
        }
        return false;
    }

    /* renamed from: b */
    public static synchronized void m7062b(int i, C1513a aVar) {
        synchronized (C1512n.class) {
            C1484ca.m6976a((Object) aVar, "callback");
            if (!f5189a.containsKey(Integer.valueOf(i))) {
                f5189a.put(Integer.valueOf(i), aVar);
            }
        }
    }

    /* renamed from: a */
    public void mo6238a(int i, C1513a aVar) {
        C1484ca.m6976a((Object) aVar, "callback");
        this.f5190b.put(Integer.valueOf(i), aVar);
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        C1513a aVar = this.f5190b.get(Integer.valueOf(i));
        return aVar != null ? aVar.mo6239a(i2, intent) : m7061a(i, i2, intent);
    }
}
