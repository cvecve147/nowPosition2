package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.C1993f;
import com.google.android.gms.common.api.C1850a;

/* renamed from: com.google.android.gms.common.internal.p */
public class C2039p {

    /* renamed from: a */
    private final SparseIntArray f6514a = new SparseIntArray();

    /* renamed from: b */
    private C1993f f6515b;

    public C2039p(C1993f fVar) {
        C2061y.m9067a(fVar);
        this.f6515b = fVar;
    }

    /* renamed from: a */
    public int mo7702a(Context context, C1850a.C1861f fVar) {
        C2061y.m9067a(context);
        C2061y.m9067a(fVar);
        if (!fVar.mo7296f()) {
            return 0;
        }
        int g = fVar.mo7297g();
        int i = this.f6514a.get(g, -1);
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        while (true) {
            if (i2 < this.f6514a.size()) {
                int keyAt = this.f6514a.keyAt(i2);
                if (keyAt > g && this.f6514a.get(keyAt) == 0) {
                    i = 0;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        if (i == -1) {
            i = this.f6515b.mo7526a(context, g);
        }
        this.f6514a.put(g, i);
        return i;
    }

    /* renamed from: a */
    public void mo7703a() {
        this.f6514a.clear();
    }
}
