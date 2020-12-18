package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1850a;
import com.google.android.gms.common.internal.C2011d;
import com.google.android.gms.common.internal.C2039p;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.google.android.gms.common.api.internal.C */
final class C1881C extends C1895J {

    /* renamed from: b */
    private final Map<C1850a.C1861f, C1877B> f6097b;

    /* renamed from: c */
    final /* synthetic */ C1974z f6098c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1881C(C1974z zVar, Map<C1850a.C1861f, C1877B> map) {
        super(zVar, (C1875A) null);
        this.f6098c = zVar;
        this.f6097b = map;
    }

    /* renamed from: a */
    public final void mo7341a() {
        C2039p pVar = new C2039p(this.f6098c.f6330d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C1850a.C1861f next : this.f6097b.keySet()) {
            if (!next.mo7296f() || this.f6097b.get(next).f6079c) {
                arrayList2.add(next);
            } else {
                arrayList.add(next);
            }
        }
        int i = -1;
        int i2 = 0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                i = pVar.mo7702a(this.f6098c.f6329c, (C1850a.C1861f) obj);
                if (i != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                i = pVar.mo7702a(this.f6098c.f6329c, (C1850a.C1861f) obj2);
                if (i == 0) {
                    break;
                }
            }
        }
        if (i != 0) {
            this.f6098c.f6327a.mo7382a((C1909T) new C1883D(this, this.f6098c, new ConnectionResult(i, (PendingIntent) null)));
            return;
        }
        if (this.f6098c.f6339m) {
            this.f6098c.f6337k.connect();
        }
        for (C1850a.C1861f next2 : this.f6097b.keySet()) {
            C2011d.C2015d dVar = this.f6097b.get(next2);
            if (!next2.mo7296f() || pVar.mo7702a(this.f6098c.f6329c, next2) == 0) {
                next2.mo7289a(dVar);
            } else {
                this.f6098c.f6327a.mo7382a((C1909T) new C1885E(this, this.f6098c, dVar));
            }
        }
    }
}
