package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.X */
final class C3805X implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ int f11344a;

    /* renamed from: b */
    private final /* synthetic */ String f11345b;

    /* renamed from: c */
    private final /* synthetic */ Object f11346c;

    /* renamed from: d */
    private final /* synthetic */ Object f11347d;

    /* renamed from: e */
    private final /* synthetic */ Object f11348e;

    /* renamed from: f */
    private final /* synthetic */ C3801W f11349f;

    C3805X(C3801W w, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f11349f = w;
        this.f11344a = i;
        this.f11345b = str;
        this.f11346c = obj;
        this.f11347d = obj2;
        this.f11348e = obj3;
    }

    public final void run() {
        char c;
        C3801W w;
        C3849ha i = this.f11349f.f11325a.mo10393i();
        if (!i.mo10587s()) {
            this.f11349f.mo10582a(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (this.f11349f.f11330c == 0) {
            if (this.f11349f.mo10456r().mo11012s()) {
                w = this.f11349f;
                c = 'C';
            } else {
                w = this.f11349f;
                c = 'c';
            }
            char unused = w.f11330c = c;
        }
        if (this.f11349f.f11331d < 0) {
            long unused2 = this.f11349f.f11331d = 12451;
        }
        char charAt = "01VDIWEA?".charAt(this.f11344a);
        char a = this.f11349f.f11330c;
        long b = this.f11349f.f11331d;
        String a2 = C3801W.m15168a(true, this.f11345b, this.f11346c, this.f11347d, this.f11348e);
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 24);
        sb.append("2");
        sb.append(charAt);
        sb.append(a);
        sb.append(b);
        sb.append(":");
        sb.append(a2);
        String sb2 = sb.toString();
        if (sb2.length() > 1024) {
            sb2 = this.f11345b.substring(0, 1024);
        }
        i.f11471e.mo10771a(sb2, 1);
    }
}
