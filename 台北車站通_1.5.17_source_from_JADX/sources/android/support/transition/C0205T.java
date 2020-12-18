package android.support.transition;

import android.support.transition.C0195M;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: android.support.transition.T */
public class C0205T extends C0195M {

    /* renamed from: K */
    private ArrayList<C0195M> f1009K = new ArrayList<>();

    /* renamed from: L */
    private boolean f1010L = true;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public int f1011M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public boolean f1012N = false;

    /* renamed from: android.support.transition.T$a */
    static class C0206a extends C0199N {

        /* renamed from: a */
        C0205T f1013a;

        C0206a(C0205T t) {
            this.f1013a = t;
        }

        /* renamed from: b */
        public void mo1011b(C0195M m) {
            if (!this.f1013a.f1012N) {
                this.f1013a.mo1008p();
                boolean unused = this.f1013a.f1012N = true;
            }
        }

        /* renamed from: d */
        public void mo1013d(C0195M m) {
            C0205T.m1021c(this.f1013a);
            if (this.f1013a.f1011M == 0) {
                boolean unused = this.f1013a.f1012N = false;
                this.f1013a.mo995d();
            }
            m.mo987b((C0195M.C0198c) this);
        }
    }

    /* renamed from: c */
    static /* synthetic */ int m1021c(C0205T t) {
        int i = t.f1011M - 1;
        t.f1011M = i;
        return i;
    }

    /* renamed from: r */
    private void m1022r() {
        C0206a aVar = new C0206a(this);
        Iterator<C0195M> it = this.f1009K.iterator();
        while (it.hasNext()) {
            it.next().mo974a((C0195M.C0198c) aVar);
        }
        this.f1011M = this.f1009K.size();
    }

    /* renamed from: a */
    public C0195M mo1020a(int i) {
        if (i < 0 || i >= this.f1009K.size()) {
            return null;
        }
        return this.f1009K.get(i);
    }

    /* renamed from: a */
    public C0205T m1027a(long j) {
        super.mo973a(j);
        if (this.f974f >= 0) {
            int size = this.f1009K.size();
            for (int i = 0; i < size; i++) {
                this.f1009K.get(i).mo973a(j);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C0205T m1028a(C0195M.C0198c cVar) {
        super.mo974a(cVar);
        return this;
    }

    /* renamed from: a */
    public C0205T m1029a(View view) {
        for (int i = 0; i < this.f1009K.size(); i++) {
            this.f1009K.get(i).mo975a(view);
        }
        super.mo975a(view);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo977a(String str) {
        String a = super.mo977a(str);
        for (int i = 0; i < this.f1009K.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append("\n");
            sb.append(this.f1009K.get(i).mo977a(str + "  "));
            a = sb.toString();
        }
        return a;
    }

    /* renamed from: a */
    public void mo979a(C0195M.C0197b bVar) {
        super.mo979a(bVar);
        int size = this.f1009K.size();
        for (int i = 0; i < size; i++) {
            this.f1009K.get(i).mo979a(bVar);
        }
    }

    /* renamed from: a */
    public void mo980a(C0208V v) {
        if (mo990b(v.f1015b)) {
            Iterator<C0195M> it = this.f1009K.iterator();
            while (it.hasNext()) {
                C0195M next = it.next();
                if (next.mo990b(v.f1015b)) {
                    next.mo980a(v);
                    v.f1016c.add(next);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo982a(ViewGroup viewGroup, C0209W w, C0209W w2, ArrayList<C0208V> arrayList, ArrayList<C0208V> arrayList2) {
        long i = mo1001i();
        int size = this.f1009K.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0195M m = this.f1009K.get(i2);
            if (i > 0 && (this.f1010L || i2 == 0)) {
                long i3 = m.mo1001i();
                if (i3 > 0) {
                    m.mo986b(i3 + i);
                } else {
                    m.mo986b(i);
                }
            }
            m.mo982a(viewGroup, w, w2, arrayList, arrayList2);
        }
    }

    /* renamed from: b */
    public C0205T mo1021b(int i) {
        if (i == 0) {
            this.f1010L = true;
        } else if (i == 1) {
            this.f1010L = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        }
        return this;
    }

    /* renamed from: b */
    public C0205T m1037b(long j) {
        super.mo986b(j);
        return this;
    }

    /* renamed from: b */
    public C0205T m1038b(C0195M.C0198c cVar) {
        super.mo987b(cVar);
        return this;
    }

    /* renamed from: b */
    public C0205T mo1022b(C0195M m) {
        this.f1009K.add(m);
        m.f989u = this;
        long j = this.f974f;
        if (j >= 0) {
            m.mo973a(j);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo989b(C0208V v) {
        super.mo989b(v);
        int size = this.f1009K.size();
        for (int i = 0; i < size; i++) {
            this.f1009K.get(i).mo989b(v);
        }
    }

    /* renamed from: c */
    public void mo991c(C0208V v) {
        if (mo990b(v.f1015b)) {
            Iterator<C0195M> it = this.f1009K.iterator();
            while (it.hasNext()) {
                C0195M next = it.next();
                if (next.mo990b(v.f1015b)) {
                    next.mo991c(v);
                    v.f1016c.add(next);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo992c(View view) {
        super.mo992c(view);
        int size = this.f1009K.size();
        for (int i = 0; i < size; i++) {
            this.f1009K.get(i).mo992c(view);
        }
    }

    public C0195M clone() {
        C0205T t = (C0205T) super.clone();
        t.f1009K = new ArrayList<>();
        int size = this.f1009K.size();
        for (int i = 0; i < size; i++) {
            t.mo1022b(this.f1009K.get(i).clone());
        }
        return t;
    }

    /* renamed from: d */
    public C0205T m1044d(View view) {
        for (int i = 0; i < this.f1009K.size(); i++) {
            this.f1009K.get(i).mo994d(view);
        }
        super.mo994d(view);
        return this;
    }

    /* renamed from: e */
    public void mo997e(View view) {
        super.mo997e(view);
        int size = this.f1009K.size();
        for (int i = 0; i < size; i++) {
            this.f1009K.get(i).mo997e(view);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo1007o() {
        if (this.f1009K.isEmpty()) {
            mo1008p();
            mo995d();
            return;
        }
        m1022r();
        if (!this.f1010L) {
            for (int i = 1; i < this.f1009K.size(); i++) {
                this.f1009K.get(i - 1).mo974a((C0195M.C0198c) new C0204S(this, this.f1009K.get(i)));
            }
            C0195M m = this.f1009K.get(0);
            if (m != null) {
                m.mo1007o();
                return;
            }
            return;
        }
        Iterator<C0195M> it = this.f1009K.iterator();
        while (it.hasNext()) {
            it.next().mo1007o();
        }
    }

    /* renamed from: q */
    public int mo1023q() {
        return this.f1009K.size();
    }
}
