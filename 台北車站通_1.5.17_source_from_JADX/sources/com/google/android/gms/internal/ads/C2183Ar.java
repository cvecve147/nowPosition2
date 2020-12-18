package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C1697X;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Ar */
public final class C2183Ar {

    /* renamed from: a */
    private final Object f6702a = new Object();

    /* renamed from: b */
    private int f6703b;

    /* renamed from: c */
    private List<C3673zr> f6704c = new LinkedList();

    /* renamed from: a */
    public final C3673zr mo7843a() {
        synchronized (this.f6702a) {
            C3673zr zrVar = null;
            if (this.f6704c.size() == 0) {
                C2227Cf.m9532b("Queue empty");
                return null;
            }
            int i = 0;
            if (this.f6704c.size() >= 2) {
                int i2 = Integer.MIN_VALUE;
                int i3 = 0;
                for (C3673zr next : this.f6704c) {
                    int a = next.mo10268a();
                    if (a > i2) {
                        i = i3;
                        zrVar = next;
                        i2 = a;
                    }
                    i3++;
                }
                this.f6704c.remove(i);
                return zrVar;
            }
            C3673zr zrVar2 = this.f6704c.get(0);
            zrVar2.mo10277f();
            return zrVar2;
        }
    }

    /* renamed from: a */
    public final boolean mo7844a(C3673zr zrVar) {
        synchronized (this.f6702a) {
            return this.f6704c.contains(zrVar);
        }
    }

    /* renamed from: b */
    public final boolean mo7845b(C3673zr zrVar) {
        synchronized (this.f6702a) {
            Iterator<C3673zr> it = this.f6704c.iterator();
            while (it.hasNext()) {
                C3673zr next = it.next();
                if (!((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7954qa)).booleanValue() || C1697X.m7702i().mo8333m().mo9146b()) {
                    if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7966sa)).booleanValue() && !C1697X.m7702i().mo8333m().mo9152d() && zrVar != next && next.mo10275e().equals(zrVar.mo10275e())) {
                        it.remove();
                        return true;
                    }
                } else if (zrVar != next && next.mo10271b().equals(zrVar.mo10271b())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: c */
    public final void mo7846c(C3673zr zrVar) {
        synchronized (this.f6702a) {
            if (this.f6704c.size() >= 10) {
                int size = this.f6704c.size();
                StringBuilder sb = new StringBuilder(41);
                sb.append("Queue is full, current size = ");
                sb.append(size);
                C2227Cf.m9532b(sb.toString());
                this.f6704c.remove(0);
            }
            int i = this.f6703b;
            this.f6703b = i + 1;
            zrVar.mo10269a(i);
            this.f6704c.add(zrVar);
        }
    }
}
