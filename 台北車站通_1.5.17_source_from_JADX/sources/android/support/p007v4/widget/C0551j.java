package android.support.p007v4.widget;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p013b.p018b.p028h.p039h.C1097n;
import p013b.p018b.p028h.p039h.C1098o;
import p013b.p018b.p028h.p039h.C1101r;

/* renamed from: android.support.v4.widget.j */
public final class C0551j<T> {

    /* renamed from: a */
    private final C1097n<ArrayList<T>> f2062a = new C1098o(10);

    /* renamed from: b */
    private final C1101r<T, ArrayList<T>> f2063b = new C1101r<>();

    /* renamed from: c */
    private final ArrayList<T> f2064c = new ArrayList<>();

    /* renamed from: d */
    private final HashSet<T> f2065d = new HashSet<>();

    /* renamed from: a */
    private void m2728a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList arrayList2 = this.f2063b.get(t);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        m2728a(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    /* renamed from: a */
    private void m2729a(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f2062a.mo5228a(arrayList);
    }

    /* renamed from: c */
    private ArrayList<T> m2730c() {
        ArrayList<T> a = this.f2062a.mo5227a();
        return a == null ? new ArrayList<>() : a;
    }

    /* renamed from: a */
    public void mo2372a() {
        int size = this.f2063b.size();
        for (int i = 0; i < size; i++) {
            ArrayList d = this.f2063b.mo5241d(i);
            if (d != null) {
                m2729a(d);
            }
        }
        this.f2063b.clear();
    }

    /* renamed from: a */
    public void mo2373a(T t) {
        if (!this.f2063b.containsKey(t)) {
            this.f2063b.put(t, null);
        }
    }

    /* renamed from: a */
    public void mo2374a(T t, T t2) {
        if (!this.f2063b.containsKey(t) || !this.f2063b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = this.f2063b.get(t);
        if (arrayList == null) {
            arrayList = m2730c();
            this.f2063b.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    /* renamed from: b */
    public ArrayList<T> mo2375b() {
        this.f2064c.clear();
        this.f2065d.clear();
        int size = this.f2063b.size();
        for (int i = 0; i < size; i++) {
            m2728a(this.f2063b.mo5236b(i), this.f2064c, this.f2065d);
        }
        return this.f2064c;
    }

    /* renamed from: b */
    public boolean mo2376b(T t) {
        return this.f2063b.containsKey(t);
    }

    /* renamed from: c */
    public List mo2377c(T t) {
        return this.f2063b.get(t);
    }

    /* renamed from: d */
    public List<T> mo2378d(T t) {
        int size = this.f2063b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList d = this.f2063b.mo5241d(i);
            if (d != null && d.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f2063b.mo5236b(i));
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public boolean mo2379e(T t) {
        int size = this.f2063b.size();
        for (int i = 0; i < size; i++) {
            ArrayList d = this.f2063b.mo5241d(i);
            if (d != null && d.contains(t)) {
                return true;
            }
        }
        return false;
    }
}
