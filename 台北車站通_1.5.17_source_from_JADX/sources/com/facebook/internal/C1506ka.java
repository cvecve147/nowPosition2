package com.facebook.internal;

import com.facebook.C1601x;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.internal.ka */
public class C1506ka {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Object f5177a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C1508b f5178b;

    /* renamed from: c */
    private final int f5179c;

    /* renamed from: d */
    private final Executor f5180d;

    /* renamed from: e */
    private C1508b f5181e;

    /* renamed from: f */
    private int f5182f;

    /* renamed from: com.facebook.internal.ka$a */
    public interface C1507a {
        /* renamed from: a */
        void mo6232a();
    }

    /* renamed from: com.facebook.internal.ka$b */
    private class C1508b implements C1507a {

        /* renamed from: a */
        private final Runnable f5183a;

        /* renamed from: b */
        private C1508b f5184b;

        /* renamed from: c */
        private C1508b f5185c;

        /* renamed from: d */
        private boolean f5186d;

        C1508b(Runnable runnable) {
            this.f5183a = runnable;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1508b mo6233a(C1508b bVar) {
            if (bVar == this && (bVar = this.f5184b) == this) {
                bVar = null;
            }
            C1508b bVar2 = this.f5184b;
            bVar2.f5185c = this.f5185c;
            this.f5185c.f5184b = bVar2;
            this.f5185c = null;
            this.f5184b = null;
            return bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1508b mo6234a(C1508b bVar, boolean z) {
            if (bVar == null) {
                this.f5185c = this;
                this.f5184b = this;
                bVar = this;
            } else {
                this.f5184b = bVar;
                this.f5185c = bVar.f5185c;
                C1508b bVar2 = this.f5184b;
                this.f5185c.f5184b = this;
                bVar2.f5185c = this;
            }
            return z ? this : bVar;
        }

        /* renamed from: a */
        public void mo6232a() {
            synchronized (C1506ka.this.f5177a) {
                if (!mo6237c()) {
                    C1508b unused = C1506ka.this.f5178b = mo6233a(C1506ka.this.f5178b);
                    C1508b unused2 = C1506ka.this.f5178b = mo6234a(C1506ka.this.f5178b, true);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6235a(boolean z) {
            this.f5186d = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Runnable mo6236b() {
            return this.f5183a;
        }

        /* renamed from: c */
        public boolean mo6237c() {
            return this.f5186d;
        }
    }

    public C1506ka(int i) {
        this(i, C1601x.m7395h());
    }

    public C1506ka(int i, Executor executor) {
        this.f5177a = new Object();
        this.f5181e = null;
        this.f5182f = 0;
        this.f5179c = i;
        this.f5180d = executor;
    }

    /* renamed from: a */
    private void m7042a() {
        m7047b((C1508b) null);
    }

    /* renamed from: a */
    private void m7043a(C1508b bVar) {
        this.f5180d.execute(new C1504ja(this, bVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m7047b(C1508b bVar) {
        C1508b bVar2;
        synchronized (this.f5177a) {
            if (bVar != null) {
                this.f5181e = bVar.mo6233a(this.f5181e);
                this.f5182f--;
            }
            if (this.f5182f < this.f5179c) {
                bVar2 = this.f5178b;
                if (bVar2 != null) {
                    this.f5178b = bVar2.mo6233a(this.f5178b);
                    this.f5181e = bVar2.mo6234a(this.f5181e, false);
                    this.f5182f++;
                    bVar2.mo6235a(true);
                }
            } else {
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            m7043a(bVar2);
        }
    }

    /* renamed from: a */
    public C1507a mo6230a(Runnable runnable) {
        return mo6231a(runnable, true);
    }

    /* renamed from: a */
    public C1507a mo6231a(Runnable runnable, boolean z) {
        C1508b bVar = new C1508b(runnable);
        synchronized (this.f5177a) {
            this.f5178b = bVar.mo6234a(this.f5178b, z);
        }
        m7042a();
        return bVar;
    }
}
