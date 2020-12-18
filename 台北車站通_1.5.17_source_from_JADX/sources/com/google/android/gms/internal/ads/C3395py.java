package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.ads.internal.gmsg.C1718E;
import com.google.android.gms.common.util.C2093o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.py */
public abstract class C3395py<ReferenceT> {

    /* renamed from: a */
    private final Map<String, CopyOnWriteArrayList<C1718E<? super ReferenceT>>> f10053a = new HashMap();

    /* renamed from: b */
    private final synchronized void m13486b(String str, Map<String, String> map) {
        if (C2227Cf.m9531a(2)) {
            String valueOf = String.valueOf(str);
            C2857Yd.m11615f(valueOf.length() != 0 ? "Received GMSG: ".concat(valueOf) : new String("Received GMSG: "));
            for (String next : map.keySet()) {
                String str2 = map.get(next);
                StringBuilder sb = new StringBuilder(String.valueOf(next).length() + 4 + String.valueOf(str2).length());
                sb.append("  ");
                sb.append(next);
                sb.append(": ");
                sb.append(str2);
                C2857Yd.m11615f(sb.toString());
            }
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f10053a.get(str);
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C2972bg.f8938a.execute(new C3423qy(this, (C1718E) it.next(), map));
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo9917a(String str, C1718E<? super ReferenceT> e) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f10053a.get(str);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(e);
        }
    }

    /* renamed from: a */
    public final synchronized void mo9918a(String str, C2093o<C1718E<? super ReferenceT>> oVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f10053a.get(str);
        if (copyOnWriteArrayList != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C1718E e = (C1718E) it.next();
                if (oVar.apply(e)) {
                    arrayList.add(e);
                }
            }
            copyOnWriteArrayList.removeAll(arrayList);
        }
    }

    /* renamed from: a */
    public final boolean mo9919a(Uri uri) {
        if (!"gmsg".equalsIgnoreCase(uri.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            return false;
        }
        String path = uri.getPath();
        C1697X.m7698e();
        m13486b(path, C3114ge.m12404a(uri));
        return true;
    }

    /* renamed from: b */
    public final synchronized void mo9920b(String str, C1718E<? super ReferenceT> e) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f10053a.get(str);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            this.f10053a.put(str, copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add(e);
    }

    /* renamed from: k */
    public abstract ReferenceT mo9299k();

    /* renamed from: l */
    public synchronized void mo9543l() {
        this.f10053a.clear();
    }
}
