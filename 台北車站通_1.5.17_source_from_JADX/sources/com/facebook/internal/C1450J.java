package com.facebook.internal;

import android.content.Context;
import android.net.Uri;

/* renamed from: com.facebook.internal.J */
public class C1450J {

    /* renamed from: a */
    private Context f5058a;

    /* renamed from: b */
    private Uri f5059b;

    /* renamed from: c */
    private C1452b f5060c;

    /* renamed from: d */
    private boolean f5061d;

    /* renamed from: e */
    private Object f5062e;

    /* renamed from: com.facebook.internal.J$a */
    public static class C1451a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Context f5063a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Uri f5064b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C1452b f5065c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f5066d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public Object f5067e;

        public C1451a(Context context, Uri uri) {
            C1484ca.m6976a((Object) uri, "imageUri");
            this.f5063a = context;
            this.f5064b = uri;
        }

        /* renamed from: a */
        public C1451a mo6147a(C1452b bVar) {
            this.f5065c = bVar;
            return this;
        }

        /* renamed from: a */
        public C1450J mo6148a() {
            return new C1450J(this);
        }
    }

    /* renamed from: com.facebook.internal.J$b */
    public interface C1452b {
        /* renamed from: a */
        void mo6149a(C1453K k);
    }

    private C1450J(C1451a aVar) {
        this.f5058a = aVar.f5063a;
        this.f5059b = aVar.f5064b;
        this.f5060c = aVar.f5065c;
        this.f5061d = aVar.f5066d;
        this.f5062e = aVar.f5067e == null ? new Object() : aVar.f5067e;
    }

    /* renamed from: a */
    public C1452b mo6142a() {
        return this.f5060c;
    }

    /* renamed from: b */
    public Object mo6143b() {
        return this.f5062e;
    }

    /* renamed from: c */
    public Context mo6144c() {
        return this.f5058a;
    }

    /* renamed from: d */
    public Uri mo6145d() {
        return this.f5059b;
    }

    /* renamed from: e */
    public boolean mo6146e() {
        return this.f5061d;
    }
}
