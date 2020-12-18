package android.support.transition;

import android.support.p007v4.view.C0487v;
import android.support.transition.C0195M;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p013b.p018b.p028h.p039h.C1080b;

/* renamed from: android.support.transition.P */
public class C0201P {

    /* renamed from: a */
    private static C0195M f1002a = new C0222e();

    /* renamed from: b */
    private static ThreadLocal<WeakReference<C1080b<ViewGroup, ArrayList<C0195M>>>> f1003b = new ThreadLocal<>();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static ArrayList<ViewGroup> f1004c = new ArrayList<>();

    /* renamed from: android.support.transition.P$a */
    private static class C0202a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a */
        C0195M f1005a;

        /* renamed from: b */
        ViewGroup f1006b;

        C0202a(C0195M m, ViewGroup viewGroup) {
            this.f1005a = m;
            this.f1006b = viewGroup;
        }

        /* renamed from: a */
        private void m1013a() {
            this.f1006b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f1006b.removeOnAttachStateChangeListener(this);
        }

        public boolean onPreDraw() {
            m1013a();
            if (!C0201P.f1004c.remove(this.f1006b)) {
                return true;
            }
            C1080b<ViewGroup, ArrayList<C0195M>> b = C0201P.m1010b();
            ArrayList arrayList = b.get(this.f1006b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                b.put(this.f1006b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f1005a);
            this.f1005a.mo974a((C0195M.C0198c) new C0200O(this, b));
            this.f1005a.mo983a(this.f1006b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((C0195M) it.next()).mo997e(this.f1006b);
                }
            }
            this.f1005a.mo981a(this.f1006b);
            return true;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            m1013a();
            C0201P.f1004c.remove(this.f1006b);
            ArrayList arrayList = C0201P.m1010b().get(this.f1006b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C0195M) it.next()).mo997e(this.f1006b);
                }
            }
            this.f1005a.mo984a(true);
        }
    }

    /* renamed from: a */
    public static void m1009a(ViewGroup viewGroup, C0195M m) {
        if (!f1004c.contains(viewGroup) && C0487v.m2309y(viewGroup)) {
            f1004c.add(viewGroup);
            if (m == null) {
                m = f1002a;
            }
            C0195M clone = m.clone();
            m1012c(viewGroup, clone);
            C0191I.m949a(viewGroup, (C0191I) null);
            m1011b(viewGroup, clone);
        }
    }

    /* renamed from: b */
    static C1080b<ViewGroup, ArrayList<C0195M>> m1010b() {
        WeakReference weakReference = f1003b.get();
        if (weakReference == null || weakReference.get() == null) {
            WeakReference weakReference2 = new WeakReference(new C1080b());
            f1003b.set(weakReference2);
            weakReference = weakReference2;
        }
        return (C1080b) weakReference.get();
    }

    /* renamed from: b */
    private static void m1011b(ViewGroup viewGroup, C0195M m) {
        if (m != null && viewGroup != null) {
            C0202a aVar = new C0202a(m, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    /* renamed from: c */
    private static void m1012c(ViewGroup viewGroup, C0195M m) {
        ArrayList arrayList = m1010b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C0195M) it.next()).mo992c((View) viewGroup);
            }
        }
        if (m != null) {
            m.mo983a(viewGroup, true);
        }
        C0191I a = C0191I.m948a(viewGroup);
        if (a != null) {
            a.mo968a();
        }
    }
}
