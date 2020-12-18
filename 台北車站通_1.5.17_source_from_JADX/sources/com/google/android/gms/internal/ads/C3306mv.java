package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpStatus;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.mv */
public final class C3306mv extends C2820Wv {

    /* renamed from: a */
    private static final int f9825a = Color.rgb(12, 174, HttpStatus.SC_PARTIAL_CONTENT);

    /* renamed from: b */
    private static final int f9826b;

    /* renamed from: c */
    private static final int f9827c;

    /* renamed from: d */
    private static final int f9828d = f9825a;

    /* renamed from: e */
    private final String f9829e;

    /* renamed from: f */
    private final List<C3420qv> f9830f = new ArrayList();

    /* renamed from: g */
    private final List<C2903Zv> f9831g = new ArrayList();

    /* renamed from: h */
    private final int f9832h;

    /* renamed from: i */
    private final int f9833i;

    /* renamed from: j */
    private final int f9834j;

    /* renamed from: k */
    private final int f9835k;

    /* renamed from: l */
    private final int f9836l;

    /* renamed from: m */
    private final boolean f9837m;

    static {
        int rgb = Color.rgb(HttpStatus.SC_NO_CONTENT, HttpStatus.SC_NO_CONTENT, HttpStatus.SC_NO_CONTENT);
        f9826b = rgb;
        f9827c = rgb;
    }

    public C3306mv(String str, List<C3420qv> list, Integer num, Integer num2, Integer num3, int i, int i2, boolean z) {
        this.f9829e = str;
        if (list != null) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                C3420qv qvVar = list.get(i3);
                this.f9830f.add(qvVar);
                this.f9831g.add(qvVar);
            }
        }
        this.f9832h = num != null ? num.intValue() : f9827c;
        this.f9833i = num2 != null ? num2.intValue() : f9828d;
        this.f9834j = num3 != null ? num3.intValue() : 12;
        this.f9835k = i;
        this.f9836l = i2;
        this.f9837m = z;
    }

    /* renamed from: bc */
    public final int mo9756bc() {
        return this.f9832h;
    }

    /* renamed from: cc */
    public final int mo9757cc() {
        return this.f9833i;
    }

    /* renamed from: dc */
    public final int mo9758dc() {
        return this.f9834j;
    }

    /* renamed from: ea */
    public final List<C2903Zv> mo8973ea() {
        return this.f9831g;
    }

    /* renamed from: ec */
    public final List<C3420qv> mo9759ec() {
        return this.f9830f;
    }

    /* renamed from: fc */
    public final int mo9760fc() {
        return this.f9835k;
    }

    /* renamed from: gc */
    public final int mo9761gc() {
        return this.f9836l;
    }

    public final String getText() {
        return this.f9829e;
    }

    /* renamed from: hc */
    public final boolean mo9762hc() {
        return this.f9837m;
    }
}
