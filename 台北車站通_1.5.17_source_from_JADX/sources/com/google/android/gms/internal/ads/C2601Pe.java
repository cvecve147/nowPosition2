package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Pe */
public final class C2601Pe {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final List<String> f8096a = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final List<Double> f8097b = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final List<Double> f8098c = new ArrayList();

    /* renamed from: a */
    public final C2512Me mo8663a() {
        return new C2512Me(this);
    }

    /* renamed from: a */
    public final C2601Pe mo8664a(String str, double d, double d2) {
        int i = 0;
        while (i < this.f8096a.size()) {
            double doubleValue = this.f8098c.get(i).doubleValue();
            double doubleValue2 = this.f8097b.get(i).doubleValue();
            if (d < doubleValue || (doubleValue == d && d2 < doubleValue2)) {
                break;
            }
            i++;
        }
        this.f8096a.add(i, str);
        this.f8098c.add(i, Double.valueOf(d));
        this.f8097b.add(i, Double.valueOf(d2));
        return this;
    }
}
