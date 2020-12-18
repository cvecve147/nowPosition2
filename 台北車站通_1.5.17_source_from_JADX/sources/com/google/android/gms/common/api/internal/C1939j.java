package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.internal.C2061y;

/* renamed from: com.google.android.gms.common.api.internal.j */
public final class C1939j<L> {

    /* renamed from: a */
    private final C1942c f6268a;

    /* renamed from: b */
    private volatile L f6269b;

    /* renamed from: c */
    private final C1940a<L> f6270c;

    /* renamed from: com.google.android.gms.common.api.internal.j$a */
    public static final class C1940a<L> {

        /* renamed from: a */
        private final L f6271a;

        /* renamed from: b */
        private final String f6272b;

        C1940a(L l, String str) {
            this.f6271a = l;
            this.f6272b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1940a)) {
                return false;
            }
            C1940a aVar = (C1940a) obj;
            return this.f6271a == aVar.f6271a && this.f6272b.equals(aVar.f6272b);
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f6271a) * 31) + this.f6272b.hashCode();
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.j$b */
    public interface C1941b<L> {
        /* renamed from: a */
        void mo7457a();

        /* renamed from: a */
        void mo7458a(L l);
    }

    /* renamed from: com.google.android.gms.common.api.internal.j$c */
    private final class C1942c extends Handler {
        public C1942c(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            boolean z = true;
            if (message.what != 1) {
                z = false;
            }
            C2061y.m9073a(z);
            C1939j.this.mo7454b((C1941b) message.obj);
        }
    }

    C1939j(Looper looper, L l, String str) {
        this.f6268a = new C1942c(looper);
        C2061y.m9068a(l, (Object) "Listener must not be null");
        this.f6269b = l;
        C2061y.m9076b(str);
        this.f6270c = new C1940a<>(l, str);
    }

    /* renamed from: a */
    public final void mo7451a() {
        this.f6269b = null;
    }

    /* renamed from: a */
    public final void mo7452a(C1941b<? super L> bVar) {
        C2061y.m9068a(bVar, (Object) "Notifier must not be null");
        this.f6268a.sendMessage(this.f6268a.obtainMessage(1, bVar));
    }

    /* renamed from: b */
    public final C1940a<L> mo7453b() {
        return this.f6270c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo7454b(C1941b<? super L> bVar) {
        L l = this.f6269b;
        if (l == null) {
            bVar.mo7457a();
            return;
        }
        try {
            bVar.mo7458a(l);
        } catch (RuntimeException e) {
            bVar.mo7457a();
            throw e;
        }
    }
}
