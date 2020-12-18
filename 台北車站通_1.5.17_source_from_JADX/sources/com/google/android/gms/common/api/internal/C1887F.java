package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C1850a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.api.internal.F */
final class C1887F extends C1895J {

    /* renamed from: b */
    private final ArrayList<C1850a.C1861f> f6105b;

    /* renamed from: c */
    private final /* synthetic */ C1974z f6106c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1887F(C1974z zVar, ArrayList<C1850a.C1861f> arrayList) {
        super(zVar, (C1875A) null);
        this.f6106c = zVar;
        this.f6105b = arrayList;
    }

    /* renamed from: a */
    public final void mo7341a() {
        this.f6106c.f6327a.f6194n.f6166q = this.f6106c.m8714h();
        ArrayList<C1850a.C1861f> arrayList = this.f6105b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C1850a.C1861f fVar = arrayList.get(i);
            i++;
            fVar.mo7291a(this.f6106c.f6341o, this.f6106c.f6327a.f6194n.f6166q);
        }
    }
}
