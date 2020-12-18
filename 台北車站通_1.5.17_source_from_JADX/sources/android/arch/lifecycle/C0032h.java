package android.arch.lifecycle;

import android.arch.lifecycle.C0026d;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p013b.p014a.p015a.p017b.C0921a;
import p013b.p014a.p015a.p017b.C0923c;

/* renamed from: android.arch.lifecycle.h */
public class C0032h extends C0026d {

    /* renamed from: a */
    private C0921a<C0029e, C0033a> f129a = new C0921a<>();

    /* renamed from: b */
    private C0026d.C0028b f130b;

    /* renamed from: c */
    private final WeakReference<C0030f> f131c;

    /* renamed from: d */
    private int f132d = 0;

    /* renamed from: e */
    private boolean f133e = false;

    /* renamed from: f */
    private boolean f134f = false;

    /* renamed from: g */
    private ArrayList<C0026d.C0028b> f135g = new ArrayList<>();

    /* renamed from: android.arch.lifecycle.h$a */
    static class C0033a {

        /* renamed from: a */
        C0026d.C0028b f136a;

        /* renamed from: b */
        GenericLifecycleObserver f137b;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo58a(C0030f fVar, C0026d.C0027a aVar) {
            C0026d.C0028b a = C0032h.m93a(aVar);
            this.f136a = C0032h.m94a(this.f136a, a);
            this.f137b.mo37a(fVar, aVar);
            this.f136a = a;
        }
    }

    public C0032h(C0030f fVar) {
        this.f131c = new WeakReference<>(fVar);
        this.f130b = C0026d.C0028b.INITIALIZED;
    }

    /* renamed from: a */
    static C0026d.C0028b m93a(C0026d.C0027a aVar) {
        switch (C0031g.f127a[aVar.ordinal()]) {
            case 1:
            case 2:
                return C0026d.C0028b.CREATED;
            case 3:
            case 4:
                return C0026d.C0028b.STARTED;
            case 5:
                return C0026d.C0028b.RESUMED;
            case 6:
                return C0026d.C0028b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
    }

    /* renamed from: a */
    static C0026d.C0028b m94a(C0026d.C0028b bVar, C0026d.C0028b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    /* renamed from: a */
    private void m95a(C0030f fVar) {
        Iterator<Map.Entry<C0029e, C0033a>> descendingIterator = this.f129a.descendingIterator();
        while (descendingIterator.hasNext() && !this.f134f) {
            Map.Entry next = descendingIterator.next();
            C0033a aVar = (C0033a) next.getValue();
            while (aVar.f136a.compareTo(this.f130b) > 0 && !this.f134f && this.f129a.contains(next.getKey())) {
                C0026d.C0027a b = m96b(aVar.f136a);
                m102d(m93a(b));
                aVar.mo58a(fVar, b);
                m99c();
            }
        }
    }

    /* renamed from: b */
    private static C0026d.C0027a m96b(C0026d.C0028b bVar) {
        int i = C0031g.f128b[bVar.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException();
        } else if (i == 2) {
            return C0026d.C0027a.ON_DESTROY;
        } else {
            if (i == 3) {
                return C0026d.C0027a.ON_STOP;
            }
            if (i == 4) {
                return C0026d.C0027a.ON_PAUSE;
            }
            if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    private void m97b(C0030f fVar) {
        C0923c<K, V>.d b = this.f129a.mo4802b();
        while (b.hasNext() && !this.f134f) {
            Map.Entry entry = (Map.Entry) b.next();
            C0033a aVar = (C0033a) entry.getValue();
            while (aVar.f136a.compareTo(this.f130b) < 0 && !this.f134f && this.f129a.contains(entry.getKey())) {
                m102d(aVar.f136a);
                aVar.mo58a(fVar, m103e(aVar.f136a));
                m99c();
            }
        }
    }

    /* renamed from: b */
    private boolean m98b() {
        if (this.f129a.size() == 0) {
            return true;
        }
        C0026d.C0028b bVar = this.f129a.mo4801a().getValue().f136a;
        C0026d.C0028b bVar2 = this.f129a.mo4803c().getValue().f136a;
        return bVar == bVar2 && this.f130b == bVar2;
    }

    /* renamed from: c */
    private void m99c() {
        ArrayList<C0026d.C0028b> arrayList = this.f135g;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: c */
    private void m100c(C0026d.C0028b bVar) {
        if (this.f130b != bVar) {
            this.f130b = bVar;
            if (this.f133e || this.f132d != 0) {
                this.f134f = true;
                return;
            }
            this.f133e = true;
            m101d();
            this.f133e = false;
        }
    }

    /* renamed from: d */
    private void m101d() {
        C0030f fVar = (C0030f) this.f131c.get();
        if (fVar == null) {
            Log.w("LifecycleRegistry", "LifecycleOwner is garbage collected, you shouldn't try dispatch new events from it.");
            return;
        }
        while (!m98b()) {
            this.f134f = false;
            if (this.f130b.compareTo(this.f129a.mo4801a().getValue().f136a) < 0) {
                m95a(fVar);
            }
            Map.Entry<C0029e, C0033a> c = this.f129a.mo4803c();
            if (!this.f134f && c != null && this.f130b.compareTo(c.getValue().f136a) > 0) {
                m97b(fVar);
            }
        }
        this.f134f = false;
    }

    /* renamed from: d */
    private void m102d(C0026d.C0028b bVar) {
        this.f135g.add(bVar);
    }

    /* renamed from: e */
    private static C0026d.C0027a m103e(C0026d.C0028b bVar) {
        int i = C0031g.f128b[bVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return C0026d.C0027a.ON_START;
            }
            if (i == 3) {
                return C0026d.C0027a.ON_RESUME;
            }
            if (i == 4) {
                throw new IllegalArgumentException();
            } else if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
        }
        return C0026d.C0027a.ON_CREATE;
    }

    /* renamed from: a */
    public C0026d.C0028b mo52a() {
        return this.f130b;
    }

    /* renamed from: a */
    public void mo56a(C0026d.C0028b bVar) {
        m100c(bVar);
    }

    /* renamed from: a */
    public void mo53a(C0029e eVar) {
        this.f129a.remove(eVar);
    }

    /* renamed from: b */
    public void mo57b(C0026d.C0027a aVar) {
        m100c(m93a(aVar));
    }
}
