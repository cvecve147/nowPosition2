package android.arch.lifecycle;

import android.arch.lifecycle.C0026d;
import java.util.Map;
import p013b.p014a.p015a.p016a.C0918c;
import p013b.p014a.p015a.p017b.C0923c;

public abstract class LiveData<T> {

    /* renamed from: a */
    private static final Object f104a = new Object();

    /* renamed from: b */
    private C0923c<C0037l<T>, LiveData<T>.a> f105b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f106c;

    /* renamed from: d */
    private volatile Object f107d;

    /* renamed from: e */
    private int f108e;

    /* renamed from: f */
    private boolean f109f;

    /* renamed from: g */
    private boolean f110g;

    class LifecycleBoundObserver extends LiveData<T>.a implements GenericLifecycleObserver {

        /* renamed from: e */
        final C0030f f111e;

        /* renamed from: f */
        final /* synthetic */ LiveData f112f;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo47a() {
            this.f111e.mo55b().mo53a(this);
        }

        /* renamed from: a */
        public void mo37a(C0030f fVar, C0026d.C0027a aVar) {
            if (this.f111e.mo55b().mo52a() == C0026d.C0028b.DESTROYED) {
                this.f112f.mo45a(this.f113a);
            } else {
                mo49a(mo48b());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo48b() {
            return this.f111e.mo55b().mo52a().mo54a(C0026d.C0028b.STARTED);
        }
    }

    /* renamed from: android.arch.lifecycle.LiveData$a */
    private abstract class C0022a {

        /* renamed from: a */
        final C0037l<T> f113a;

        /* renamed from: b */
        boolean f114b;

        /* renamed from: c */
        int f115c;

        /* renamed from: d */
        final /* synthetic */ LiveData f116d;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo47a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo49a(boolean z) {
            if (z != this.f114b) {
                this.f114b = z;
                int i = 1;
                boolean z2 = this.f116d.f106c == 0;
                LiveData liveData = this.f116d;
                int a = liveData.f106c;
                if (!this.f114b) {
                    i = -1;
                }
                int unused = liveData.f106c = a + i;
                if (z2 && this.f114b) {
                    this.f116d.mo44a();
                }
                if (this.f116d.f106c == 0 && !this.f114b) {
                    this.f116d.mo46b();
                }
                if (this.f114b) {
                    this.f116d.m75b(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract boolean mo48b();
    }

    /* renamed from: a */
    private void m72a(LiveData<T>.a aVar) {
        if (aVar.f114b) {
            if (!aVar.mo48b()) {
                aVar.mo49a(false);
                return;
            }
            int i = aVar.f115c;
            int i2 = this.f108e;
            if (i < i2) {
                aVar.f115c = i2;
                aVar.f113a.mo59a(this.f107d);
            }
        }
    }

    /* renamed from: a */
    private static void m74a(String str) {
        if (!C0918c.m5203b().mo4796a()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background" + " thread");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m75b(LiveData<T>.a aVar) {
        if (this.f109f) {
            this.f110g = true;
            return;
        }
        this.f109f = true;
        do {
            this.f110g = false;
            if (aVar == null) {
                C0923c<K, V>.d b = this.f105b.mo4802b();
                while (b.hasNext()) {
                    m72a((LiveData<T>.a) (C0022a) ((Map.Entry) b.next()).getValue());
                    if (this.f110g) {
                        break;
                    }
                }
            } else {
                m72a(aVar);
                aVar = null;
            }
        } while (this.f110g);
        this.f109f = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo44a();

    /* renamed from: a */
    public void mo45a(C0037l<T> lVar) {
        m74a("removeObserver");
        C0022a remove = this.f105b.remove(lVar);
        if (remove != null) {
            remove.mo47a();
            remove.mo49a(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo46b();
}
