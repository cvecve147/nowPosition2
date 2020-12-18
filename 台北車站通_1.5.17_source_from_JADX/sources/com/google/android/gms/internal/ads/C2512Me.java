package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Me */
public final class C2512Me {

    /* renamed from: a */
    private final String[] f7570a;

    /* renamed from: b */
    private final double[] f7571b;

    /* renamed from: c */
    private final double[] f7572c;

    /* renamed from: d */
    private final int[] f7573d;

    /* renamed from: e */
    private int f7574e;

    private C2512Me(C2601Pe pe) {
        int size = pe.f8097b.size();
        this.f7570a = (String[]) pe.f8096a.toArray(new String[size]);
        this.f7571b = m10591a((List<Double>) pe.f8097b);
        this.f7572c = m10591a((List<Double>) pe.f8098c);
        this.f7573d = new int[size];
        this.f7574e = 0;
    }

    /* renamed from: a */
    private static double[] m10591a(List<Double> list) {
        double[] dArr = new double[list.size()];
        for (int i = 0; i < dArr.length; i++) {
            dArr[i] = list.get(i).doubleValue();
        }
        return dArr;
    }

    /* renamed from: a */
    public final List<C2569Oe> mo8529a() {
        ArrayList arrayList = new ArrayList(this.f7570a.length);
        int i = 0;
        while (true) {
            String[] strArr = this.f7570a;
            if (i >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i];
            double d = this.f7572c[i];
            double d2 = this.f7571b[i];
            int[] iArr = this.f7573d;
            arrayList.add(new C2569Oe(str, d, d2, ((double) iArr[i]) / ((double) this.f7574e), iArr[i]));
            i++;
        }
    }

    /* renamed from: a */
    public final void mo8530a(double d) {
        this.f7574e++;
        int i = 0;
        while (true) {
            double[] dArr = this.f7572c;
            if (i < dArr.length) {
                if (dArr[i] <= d && d < this.f7571b[i]) {
                    int[] iArr = this.f7573d;
                    iArr[i] = iArr[i] + 1;
                }
                if (d >= this.f7572c[i]) {
                    i++;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
