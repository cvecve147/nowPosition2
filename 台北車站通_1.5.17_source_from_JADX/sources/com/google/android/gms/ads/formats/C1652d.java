package com.google.android.gms.ads.formats;

import com.google.android.gms.ads.C1815k;
import com.google.android.gms.internal.ads.C2478La;

@C2478La
/* renamed from: com.google.android.gms.ads.formats.d */
public final class C1652d {

    /* renamed from: a */
    private final boolean f5475a;

    /* renamed from: b */
    private final int f5476b;

    /* renamed from: c */
    private final boolean f5477c;

    /* renamed from: d */
    private final int f5478d;

    /* renamed from: e */
    private final C1815k f5479e;

    /* renamed from: com.google.android.gms.ads.formats.d$a */
    public static final class C1653a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f5480a = false;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f5481b = -1;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f5482c = false;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C1815k f5483d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f5484e = 1;

        /* renamed from: a */
        public final C1653a mo6621a(int i) {
            this.f5484e = i;
            return this;
        }

        /* renamed from: a */
        public final C1653a mo6622a(C1815k kVar) {
            this.f5483d = kVar;
            return this;
        }

        /* renamed from: a */
        public final C1653a mo6623a(boolean z) {
            this.f5482c = z;
            return this;
        }

        /* renamed from: a */
        public final C1652d mo6624a() {
            return new C1652d(this);
        }

        /* renamed from: b */
        public final C1653a mo6625b(int i) {
            this.f5481b = i;
            return this;
        }

        /* renamed from: b */
        public final C1653a mo6626b(boolean z) {
            this.f5480a = z;
            return this;
        }
    }

    private C1652d(C1653a aVar) {
        this.f5475a = aVar.f5480a;
        this.f5476b = aVar.f5481b;
        this.f5477c = aVar.f5482c;
        this.f5478d = aVar.f5484e;
        this.f5479e = aVar.f5483d;
    }

    /* renamed from: a */
    public final int mo6616a() {
        return this.f5478d;
    }

    /* renamed from: b */
    public final int mo6617b() {
        return this.f5476b;
    }

    /* renamed from: c */
    public final C1815k mo6618c() {
        return this.f5479e;
    }

    /* renamed from: d */
    public final boolean mo6619d() {
        return this.f5477c;
    }

    /* renamed from: e */
    public final boolean mo6620e() {
        return this.f5475a;
    }
}
