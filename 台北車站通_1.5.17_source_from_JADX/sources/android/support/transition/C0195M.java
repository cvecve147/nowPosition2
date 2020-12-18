package android.support.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.support.p007v4.view.C0487v;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013b.p018b.p028h.p039h.C1080b;
import p013b.p018b.p028h.p039h.C1087i;
import p013b.p018b.p028h.p039h.C1101r;

/* renamed from: android.support.transition.M */
public abstract class C0195M implements Cloneable {

    /* renamed from: a */
    private static final int[] f959a = {2, 1, 3, 4};

    /* renamed from: b */
    private static final C0183A f960b = new C0192J();

    /* renamed from: c */
    private static ThreadLocal<C1080b<Animator, C0196a>> f961c = new ThreadLocal<>();
    /* access modifiers changed from: private */

    /* renamed from: A */
    public ArrayList<Animator> f962A = new ArrayList<>();

    /* renamed from: B */
    private int f963B = 0;

    /* renamed from: C */
    private boolean f964C = false;

    /* renamed from: D */
    private boolean f965D = false;

    /* renamed from: E */
    private ArrayList<C0198c> f966E = null;

    /* renamed from: F */
    private ArrayList<Animator> f967F = new ArrayList<>();

    /* renamed from: G */
    C0203Q f968G;

    /* renamed from: H */
    private C0197b f969H;

    /* renamed from: I */
    private C1080b<String, String> f970I;

    /* renamed from: J */
    private C0183A f971J = f960b;

    /* renamed from: d */
    private String f972d = getClass().getName();

    /* renamed from: e */
    private long f973e = -1;

    /* renamed from: f */
    long f974f = -1;

    /* renamed from: g */
    private TimeInterpolator f975g = null;

    /* renamed from: h */
    ArrayList<Integer> f976h = new ArrayList<>();

    /* renamed from: i */
    ArrayList<View> f977i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<String> f978j = null;

    /* renamed from: k */
    private ArrayList<Class> f979k = null;

    /* renamed from: l */
    private ArrayList<Integer> f980l = null;

    /* renamed from: m */
    private ArrayList<View> f981m = null;

    /* renamed from: n */
    private ArrayList<Class> f982n = null;

    /* renamed from: o */
    private ArrayList<String> f983o = null;

    /* renamed from: p */
    private ArrayList<Integer> f984p = null;

    /* renamed from: q */
    private ArrayList<View> f985q = null;

    /* renamed from: r */
    private ArrayList<Class> f986r = null;

    /* renamed from: s */
    private C0209W f987s = new C0209W();

    /* renamed from: t */
    private C0209W f988t = new C0209W();

    /* renamed from: u */
    C0205T f989u = null;

    /* renamed from: v */
    private int[] f990v = f959a;

    /* renamed from: w */
    private ArrayList<C0208V> f991w;

    /* renamed from: x */
    private ArrayList<C0208V> f992x;

    /* renamed from: y */
    private ViewGroup f993y = null;

    /* renamed from: z */
    boolean f994z = false;

    /* renamed from: android.support.transition.M$a */
    private static class C0196a {

        /* renamed from: a */
        View f995a;

        /* renamed from: b */
        String f996b;

        /* renamed from: c */
        C0208V f997c;

        /* renamed from: d */
        C0262va f998d;

        /* renamed from: e */
        C0195M f999e;

        C0196a(View view, String str, C0195M m, C0262va vaVar, C0208V v) {
            this.f995a = view;
            this.f996b = str;
            this.f997c = v;
            this.f998d = vaVar;
            this.f999e = m;
        }
    }

    /* renamed from: android.support.transition.M$b */
    public static abstract class C0197b {
    }

    /* renamed from: android.support.transition.M$c */
    public interface C0198c {
        /* renamed from: a */
        void mo1010a(C0195M m);

        /* renamed from: b */
        void mo1011b(C0195M m);

        /* renamed from: c */
        void mo1012c(C0195M m);

        /* renamed from: d */
        void mo1013d(C0195M m);
    }

    /* renamed from: a */
    private void m953a(Animator animator, C1080b<Animator, C0196a> bVar) {
        if (animator != null) {
            animator.addListener(new C0193K(this, bVar));
            mo978a(animator);
        }
    }

    /* renamed from: a */
    private void m954a(C0209W w, C0209W w2) {
        C1080b bVar = new C1080b((C1101r) w.f1017a);
        C1080b bVar2 = new C1080b((C1101r) w2.f1017a);
        int i = 0;
        while (true) {
            int[] iArr = this.f990v;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 == 1) {
                    m961b((C1080b<View, C0208V>) bVar, (C1080b<View, C0208V>) bVar2);
                } else if (i2 == 2) {
                    m958a((C1080b<View, C0208V>) bVar, (C1080b<View, C0208V>) bVar2, w.f1020d, w2.f1020d);
                } else if (i2 == 3) {
                    m957a((C1080b<View, C0208V>) bVar, (C1080b<View, C0208V>) bVar2, w.f1018b, w2.f1018b);
                } else if (i2 == 4) {
                    m959a((C1080b<View, C0208V>) bVar, (C1080b<View, C0208V>) bVar2, w.f1019c, w2.f1019c);
                }
                i++;
            } else {
                m956a((C1080b<View, C0208V>) bVar, (C1080b<View, C0208V>) bVar2);
                return;
            }
        }
    }

    /* renamed from: a */
    private static void m955a(C0209W w, View view, C0208V v) {
        w.f1017a.put(view, v);
        int id = view.getId();
        if (id >= 0) {
            if (w.f1018b.indexOfKey(id) >= 0) {
                w.f1018b.put(id, (Object) null);
            } else {
                w.f1018b.put(id, view);
            }
        }
        String o = C0487v.m2299o(view);
        if (o != null) {
            if (w.f1020d.containsKey(o)) {
                w.f1020d.put(o, null);
            } else {
                w.f1020d.put(o, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (w.f1019c.mo5150c(itemIdAtPosition) >= 0) {
                    View b = w.f1019c.mo5147b(itemIdAtPosition);
                    if (b != null) {
                        C0487v.m2284b(b, false);
                        w.f1019c.mo5149b(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                C0487v.m2284b(view, true);
                w.f1019c.mo5149b(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: a */
    private void m956a(C1080b<View, C0208V> bVar, C1080b<View, C0208V> bVar2) {
        for (int i = 0; i < bVar.size(); i++) {
            C0208V d = bVar.mo5241d(i);
            if (mo990b(d.f1015b)) {
                this.f991w.add(d);
                this.f992x.add((Object) null);
            }
        }
        for (int i2 = 0; i2 < bVar2.size(); i2++) {
            C0208V d2 = bVar2.mo5241d(i2);
            if (mo990b(d2.f1015b)) {
                this.f992x.add(d2);
                this.f991w.add((Object) null);
            }
        }
    }

    /* renamed from: a */
    private void m957a(C1080b<View, C0208V> bVar, C1080b<View, C0208V> bVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = sparseArray.valueAt(i);
            if (valueAt != null && mo990b(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && mo990b(view)) {
                C0208V v = bVar.get(valueAt);
                C0208V v2 = bVar2.get(view);
                if (!(v == null || v2 == null)) {
                    this.f991w.add(v);
                    this.f992x.add(v2);
                    bVar.remove(valueAt);
                    bVar2.remove(view);
                }
            }
        }
    }

    /* renamed from: a */
    private void m958a(C1080b<View, C0208V> bVar, C1080b<View, C0208V> bVar2, C1080b<String, View> bVar3, C1080b<String, View> bVar4) {
        View view;
        int size = bVar3.size();
        for (int i = 0; i < size; i++) {
            View d = bVar3.mo5241d(i);
            if (d != null && mo990b(d) && (view = bVar4.get(bVar3.mo5236b(i))) != null && mo990b(view)) {
                C0208V v = bVar.get(d);
                C0208V v2 = bVar2.get(view);
                if (!(v == null || v2 == null)) {
                    this.f991w.add(v);
                    this.f992x.add(v2);
                    bVar.remove(d);
                    bVar2.remove(view);
                }
            }
        }
    }

    /* renamed from: a */
    private void m959a(C1080b<View, C0208V> bVar, C1080b<View, C0208V> bVar2, C1087i<View> iVar, C1087i<View> iVar2) {
        View b;
        int e = iVar.mo5154e();
        for (int i = 0; i < e; i++) {
            View c = iVar.mo5151c(i);
            if (c != null && mo990b(c) && (b = iVar2.mo5147b(iVar.mo5144a(i))) != null && mo990b(b)) {
                C0208V v = bVar.get(c);
                C0208V v2 = bVar2.get(b);
                if (!(v == null || v2 == null)) {
                    this.f991w.add(v);
                    this.f992x.add(v2);
                    bVar.remove(c);
                    bVar2.remove(b);
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m960a(C0208V v, C0208V v2, String str) {
        Object obj = v.f1014a.get(str);
        Object obj2 = v2.f1014a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* renamed from: b */
    private void m961b(C1080b<View, C0208V> bVar, C1080b<View, C0208V> bVar2) {
        C0208V remove;
        View view;
        for (int size = bVar.size() - 1; size >= 0; size--) {
            View b = bVar.mo5236b(size);
            if (!(b == null || !mo990b(b) || (remove = bVar2.remove(b)) == null || (view = remove.f1015b) == null || !mo990b(view))) {
                this.f991w.add(bVar.mo5237c(size));
                this.f992x.add(remove);
            }
        }
    }

    /* renamed from: c */
    private void m962c(View view, boolean z) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.f980l;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.f981m;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class> arrayList3 = this.f982n;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i = 0;
                        while (i < size) {
                            if (!this.f982n.get(i).isInstance(view)) {
                                i++;
                            } else {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        C0208V v = new C0208V();
                        v.f1015b = view;
                        if (z) {
                            mo991c(v);
                        } else {
                            mo980a(v);
                        }
                        v.f1016c.add(this);
                        mo989b(v);
                        m955a(z ? this.f987s : this.f988t, view, v);
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.f984p;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.f985q;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class> arrayList6 = this.f986r;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    int i2 = 0;
                                    while (i2 < size2) {
                                        if (!this.f986r.get(i2).isInstance(view)) {
                                            i2++;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                    m962c(viewGroup.getChildAt(i3), z);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: q */
    private static C1080b<Animator, C0196a> mo1023q() {
        C1080b<Animator, C0196a> bVar = f961c.get();
        if (bVar != null) {
            return bVar;
        }
        C1080b<Animator, C0196a> bVar2 = new C1080b<>();
        f961c.set(bVar2);
        return bVar2;
    }

    /* renamed from: a */
    public Animator mo972a(ViewGroup viewGroup, C0208V v, C0208V v2) {
        return null;
    }

    /* renamed from: a */
    public C0195M mo973a(long j) {
        this.f974f = j;
        return this;
    }

    /* renamed from: a */
    public C0195M mo974a(C0198c cVar) {
        if (this.f966E == null) {
            this.f966E = new ArrayList<>();
        }
        this.f966E.add(cVar);
        return this;
    }

    /* renamed from: a */
    public C0195M mo975a(View view) {
        this.f977i.add(view);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0208V mo976a(View view, boolean z) {
        C0205T t = this.f989u;
        if (t != null) {
            return t.mo976a(view, z);
        }
        ArrayList<C0208V> arrayList = z ? this.f991w : this.f992x;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            C0208V v = arrayList.get(i2);
            if (v == null) {
                return null;
            }
            if (v.f1015b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i < 0) {
            return null;
        }
        return (z ? this.f992x : this.f991w).get(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo977a(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f974f != -1) {
            str2 = str2 + "dur(" + this.f974f + ") ";
        }
        if (this.f973e != -1) {
            str2 = str2 + "dly(" + this.f973e + ") ";
        }
        if (this.f975g != null) {
            str2 = str2 + "interp(" + this.f975g + ") ";
        }
        if (this.f976h.size() <= 0 && this.f977i.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f976h.size() > 0) {
            String str4 = str3;
            for (int i = 0; i < this.f976h.size(); i++) {
                if (i > 0) {
                    str4 = str4 + ", ";
                }
                str4 = str4 + this.f976h.get(i);
            }
            str3 = str4;
        }
        if (this.f977i.size() > 0) {
            for (int i2 = 0; i2 < this.f977i.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f977i.get(i2);
            }
        }
        return str3 + ")";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo978a(Animator animator) {
        if (animator == null) {
            mo995d();
            return;
        }
        if (mo996e() >= 0) {
            animator.setDuration(mo996e());
        }
        if (mo1001i() >= 0) {
            animator.setStartDelay(mo1001i());
        }
        if (mo998f() != null) {
            animator.setInterpolator(mo998f());
        }
        animator.addListener(new C0194L(this));
        animator.start();
    }

    /* renamed from: a */
    public void mo979a(C0197b bVar) {
        this.f969H = bVar;
    }

    /* renamed from: a */
    public abstract void mo980a(C0208V v);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo981a(ViewGroup viewGroup) {
        C0196a aVar;
        this.f991w = new ArrayList<>();
        this.f992x = new ArrayList<>();
        m954a(this.f987s, this.f988t);
        C1080b<Animator, C0196a> q = mo1023q();
        int size = q.size();
        C0262va d = C0236ka.m1122d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator b = q.mo5236b(i);
            if (!(b == null || (aVar = q.get(b)) == null || aVar.f995a == null || !d.equals(aVar.f998d))) {
                C0208V v = aVar.f997c;
                View view = aVar.f995a;
                C0208V b2 = mo988b(view, true);
                C0208V a = mo976a(view, true);
                if (!(b2 == null && a == null) && aVar.f999e.mo985a(v, a)) {
                    if (b.isRunning() || b.isStarted()) {
                        b.cancel();
                    } else {
                        q.remove(b);
                    }
                }
            }
        }
        mo982a(viewGroup, this.f987s, this.f988t, this.f991w, this.f992x);
        mo1007o();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo982a(ViewGroup viewGroup, C0209W w, C0209W w2, ArrayList<C0208V> arrayList, ArrayList<C0208V> arrayList2) {
        int i;
        int i2;
        Animator a;
        View view;
        Animator animator;
        C0208V v;
        C0208V v2;
        Animator animator2;
        ViewGroup viewGroup2 = viewGroup;
        C1080b<Animator, C0196a> q = mo1023q();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        int i3 = 0;
        while (i3 < size) {
            C0208V v3 = arrayList.get(i3);
            C0208V v4 = arrayList2.get(i3);
            if (v3 != null && !v3.f1016c.contains(this)) {
                v3 = null;
            }
            if (v4 != null && !v4.f1016c.contains(this)) {
                v4 = null;
            }
            if (!(v3 == null && v4 == null)) {
                if ((v3 == null || v4 == null || mo985a(v3, v4)) && (a = mo972a(viewGroup2, v3, v4)) != null) {
                    if (v4 != null) {
                        view = v4.f1015b;
                        String[] n = mo1006n();
                        if (view != null && n != null && n.length > 0) {
                            v2 = new C0208V();
                            v2.f1015b = view;
                            Animator animator3 = a;
                            i2 = size;
                            C0208V v5 = w2.f1017a.get(view);
                            if (v5 != null) {
                                int i4 = 0;
                                while (i4 < n.length) {
                                    v2.f1014a.put(n[i4], v5.f1014a.get(n[i4]));
                                    i4++;
                                    ArrayList<C0208V> arrayList3 = arrayList2;
                                    i3 = i3;
                                    v5 = v5;
                                }
                            }
                            i = i3;
                            int size2 = q.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size2) {
                                    animator2 = animator3;
                                    break;
                                }
                                C0196a aVar = q.get(q.mo5236b(i5));
                                if (aVar.f997c != null && aVar.f995a == view && aVar.f996b.equals(mo999g()) && aVar.f997c.equals(v2)) {
                                    animator2 = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            i2 = size;
                            i = i3;
                            animator2 = a;
                            v2 = null;
                        }
                        animator = animator2;
                        v = v2;
                    } else {
                        i2 = size;
                        i = i3;
                        view = v3.f1015b;
                        animator = a;
                        v = null;
                    }
                    if (animator != null) {
                        C0203Q q2 = this.f968G;
                        if (q2 != null) {
                            long a2 = q2.mo1017a(viewGroup2, this, v3, v4);
                            sparseIntArray.put(this.f967F.size(), (int) a2);
                            j = Math.min(a2, j);
                        }
                        q.put(animator, new C0196a(view, mo999g(), this, C0236ka.m1122d(viewGroup), v));
                        this.f967F.add(animator);
                        j = j;
                    }
                    i3 = i + 1;
                    size = i2;
                }
            }
            i2 = size;
            i = i3;
            i3 = i + 1;
            size = i2;
        }
        if (j != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                Animator animator4 = this.f967F.get(sparseIntArray.keyAt(i6));
                animator4.setStartDelay((((long) sparseIntArray.valueAt(i6)) - j) + animator4.getStartDelay());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo983a(ViewGroup viewGroup, boolean z) {
        C1080b<String, String> bVar;
        ArrayList<String> arrayList;
        ArrayList<Class> arrayList2;
        mo984a(z);
        if ((this.f976h.size() > 0 || this.f977i.size() > 0) && (((arrayList = this.f978j) == null || arrayList.isEmpty()) && ((arrayList2 = this.f979k) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.f976h.size(); i++) {
                View findViewById = viewGroup.findViewById(this.f976h.get(i).intValue());
                if (findViewById != null) {
                    C0208V v = new C0208V();
                    v.f1015b = findViewById;
                    if (z) {
                        mo991c(v);
                    } else {
                        mo980a(v);
                    }
                    v.f1016c.add(this);
                    mo989b(v);
                    m955a(z ? this.f987s : this.f988t, findViewById, v);
                }
            }
            for (int i2 = 0; i2 < this.f977i.size(); i2++) {
                View view = this.f977i.get(i2);
                C0208V v2 = new C0208V();
                v2.f1015b = view;
                if (z) {
                    mo991c(v2);
                } else {
                    mo980a(v2);
                }
                v2.f1016c.add(this);
                mo989b(v2);
                m955a(z ? this.f987s : this.f988t, view, v2);
            }
        } else {
            m962c(viewGroup, z);
        }
        if (!z && (bVar = this.f970I) != null) {
            int size = bVar.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList3.add(this.f987s.f1020d.remove(this.f970I.mo5236b(i3)));
            }
            for (int i4 = 0; i4 < size; i4++) {
                View view2 = (View) arrayList3.get(i4);
                if (view2 != null) {
                    this.f987s.f1020d.put(this.f970I.mo5241d(i4), view2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo984a(boolean z) {
        C0209W w;
        if (z) {
            this.f987s.f1017a.clear();
            this.f987s.f1018b.clear();
            w = this.f987s;
        } else {
            this.f988t.f1017a.clear();
            this.f988t.f1018b.clear();
            w = this.f988t;
        }
        w.f1019c.mo5153d();
    }

    /* renamed from: a */
    public boolean mo985a(C0208V v, C0208V v2) {
        if (v == null || v2 == null) {
            return false;
        }
        String[] n = mo1006n();
        if (n != null) {
            int length = n.length;
            int i = 0;
            while (i < length) {
                if (!m960a(v, v2, n[i])) {
                    i++;
                }
            }
            return false;
        }
        for (String a : v.f1014a.keySet()) {
            if (m960a(v, v2, a)) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: b */
    public C0195M mo986b(long j) {
        this.f973e = j;
        return this;
    }

    /* renamed from: b */
    public C0195M mo987b(C0198c cVar) {
        ArrayList<C0198c> arrayList = this.f966E;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(cVar);
        if (this.f966E.size() == 0) {
            this.f966E = null;
        }
        return this;
    }

    /* renamed from: b */
    public C0208V mo988b(View view, boolean z) {
        C0205T t = this.f989u;
        if (t != null) {
            return t.mo988b(view, z);
        }
        return (z ? this.f987s : this.f988t).f1017a.get(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo989b(C0208V v) {
        String[] a;
        if (this.f968G != null && !v.f1014a.isEmpty() && (a = this.f968G.mo1019a()) != null) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= a.length) {
                    z = true;
                    break;
                } else if (!v.f1014a.containsKey(a[i])) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                this.f968G.mo1018a(v);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo990b(View view) {
        ArrayList<Class> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.f980l;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f981m;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class> arrayList5 = this.f982n;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (this.f982n.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f983o != null && C0487v.m2299o(view) != null && this.f983o.contains(C0487v.m2299o(view))) {
            return false;
        }
        if ((this.f976h.size() == 0 && this.f977i.size() == 0 && (((arrayList = this.f979k) == null || arrayList.isEmpty()) && ((arrayList2 = this.f978j) == null || arrayList2.isEmpty()))) || this.f976h.contains(Integer.valueOf(id)) || this.f977i.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f978j;
        if (arrayList6 != null && arrayList6.contains(C0487v.m2299o(view))) {
            return true;
        }
        if (this.f979k != null) {
            for (int i2 = 0; i2 < this.f979k.size(); i2++) {
                if (this.f979k.get(i2).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public abstract void mo991c(C0208V v);

    /* renamed from: c */
    public void mo992c(View view) {
        if (!this.f965D) {
            C1080b<Animator, C0196a> q = mo1023q();
            int size = q.size();
            C0262va d = C0236ka.m1122d(view);
            for (int i = size - 1; i >= 0; i--) {
                C0196a d2 = q.mo5241d(i);
                if (d2.f995a != null && d.equals(d2.f998d)) {
                    C0213a.m1062a(q.mo5236b(i));
                }
            }
            ArrayList<C0198c> arrayList = this.f966E;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f966E.clone();
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((C0198c) arrayList2.get(i2)).mo1010a(this);
                }
            }
            this.f964C = true;
        }
    }

    public C0195M clone() {
        try {
            C0195M m = (C0195M) super.clone();
            m.f967F = new ArrayList<>();
            m.f987s = new C0209W();
            m.f988t = new C0209W();
            m.f991w = null;
            m.f992x = null;
            return m;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public C0195M mo994d(View view) {
        this.f977i.remove(view);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo995d() {
        this.f963B--;
        if (this.f963B == 0) {
            ArrayList<C0198c> arrayList = this.f966E;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f966E.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((C0198c) arrayList2.get(i)).mo1013d(this);
                }
            }
            for (int i2 = 0; i2 < this.f987s.f1019c.mo5154e(); i2++) {
                View c = this.f987s.f1019c.mo5151c(i2);
                if (c != null) {
                    C0487v.m2284b(c, false);
                }
            }
            for (int i3 = 0; i3 < this.f988t.f1019c.mo5154e(); i3++) {
                View c2 = this.f988t.f1019c.mo5151c(i3);
                if (c2 != null) {
                    C0487v.m2284b(c2, false);
                }
            }
            this.f965D = true;
        }
    }

    /* renamed from: e */
    public long mo996e() {
        return this.f974f;
    }

    /* renamed from: e */
    public void mo997e(View view) {
        if (this.f964C) {
            if (!this.f965D) {
                C1080b<Animator, C0196a> q = mo1023q();
                int size = q.size();
                C0262va d = C0236ka.m1122d(view);
                for (int i = size - 1; i >= 0; i--) {
                    C0196a d2 = q.mo5241d(i);
                    if (d2.f995a != null && d.equals(d2.f998d)) {
                        C0213a.m1064b(q.mo5236b(i));
                    }
                }
                ArrayList<C0198c> arrayList = this.f966E;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f966E.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((C0198c) arrayList2.get(i2)).mo1012c(this);
                    }
                }
            }
            this.f964C = false;
        }
    }

    /* renamed from: f */
    public TimeInterpolator mo998f() {
        return this.f975g;
    }

    /* renamed from: g */
    public String mo999g() {
        return this.f972d;
    }

    /* renamed from: h */
    public C0183A mo1000h() {
        return this.f971J;
    }

    /* renamed from: i */
    public long mo1001i() {
        return this.f973e;
    }

    /* renamed from: j */
    public List<Integer> mo1002j() {
        return this.f976h;
    }

    /* renamed from: k */
    public List<String> mo1003k() {
        return this.f978j;
    }

    /* renamed from: l */
    public List<Class> mo1004l() {
        return this.f979k;
    }

    /* renamed from: m */
    public List<View> mo1005m() {
        return this.f977i;
    }

    /* renamed from: n */
    public String[] mo1006n() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo1007o() {
        mo1008p();
        C1080b<Animator, C0196a> q = mo1023q();
        Iterator<Animator> it = this.f967F.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (q.containsKey(next)) {
                mo1008p();
                m953a(next, q);
            }
        }
        this.f967F.clear();
        mo995d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo1008p() {
        if (this.f963B == 0) {
            ArrayList<C0198c> arrayList = this.f966E;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f966E.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((C0198c) arrayList2.get(i)).mo1011b(this);
                }
            }
            this.f965D = false;
        }
        this.f963B++;
    }

    public String toString() {
        return mo977a("");
    }
}
