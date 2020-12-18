package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Yg */
public final class C2860Yg {

    /* renamed from: a */
    private final int f8652a;

    /* renamed from: b */
    private final List<C2589Ot> f8653b;

    /* renamed from: c */
    private final int f8654c;

    /* renamed from: d */
    private final InputStream f8655d;

    public C2860Yg(int i, List<C2589Ot> list) {
        this(i, list, -1, (InputStream) null);
    }

    public C2860Yg(int i, List<C2589Ot> list, int i2, InputStream inputStream) {
        this.f8652a = i;
        this.f8653b = list;
        this.f8654c = i2;
        this.f8655d = inputStream;
    }

    /* renamed from: a */
    public final InputStream mo9068a() {
        return this.f8655d;
    }

    /* renamed from: b */
    public final int mo9069b() {
        return this.f8654c;
    }

    /* renamed from: c */
    public final int mo9070c() {
        return this.f8652a;
    }

    /* renamed from: d */
    public final List<C2589Ot> mo9071d() {
        return Collections.unmodifiableList(this.f8653b);
    }
}
