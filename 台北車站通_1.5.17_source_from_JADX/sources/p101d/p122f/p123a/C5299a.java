package p101d.p122f.p123a;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import p101d.p122f.p123a.p124a.C5307a;
import p101d.p122f.p123a.p125b.C5338e;
import p101d.p122f.p123a.p126c.C5351F;
import p208e.p209a.p210a.p211a.C6208m;
import p208e.p209a.p210a.p211a.C6209n;

/* renamed from: d.f.a.a */
public class C5299a extends C6208m<Void> implements C6209n {

    /* renamed from: g */
    public final C5307a f14984g;

    /* renamed from: h */
    public final C5338e f14985h;

    /* renamed from: i */
    public final C5351F f14986i;

    /* renamed from: j */
    public final Collection<? extends C6208m> f14987j;

    public C5299a() {
        this(new C5307a(), new C5338e(), new C5351F());
    }

    C5299a(C5307a aVar, C5338e eVar, C5351F f) {
        this.f14984g = aVar;
        this.f14985h = eVar;
        this.f14986i = f;
        this.f14987j = Collections.unmodifiableCollection(Arrays.asList(new C6208m[]{aVar, eVar, f}));
    }

    /* renamed from: a */
    public Collection<? extends C6208m> mo14661a() {
        return this.f14987j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Void m20480c() {
        return null;
    }

    /* renamed from: o */
    public String mo14663o() {
        return "com.crashlytics.sdk.android:crashlytics";
    }

    /* renamed from: q */
    public String mo14664q() {
        return "2.6.8.dev";
    }
}
