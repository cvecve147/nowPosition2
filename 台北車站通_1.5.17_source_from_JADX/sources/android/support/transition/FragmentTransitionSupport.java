package android.support.transition;

import android.graphics.Rect;
import android.support.p007v4.app.C0289S;
import android.support.transition.C0195M;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class FragmentTransitionSupport extends C0289S {
    /* renamed from: a */
    private static boolean m930a(C0195M m) {
        return !C0289S.m1284a((List) m.mo1002j()) || !C0289S.m1284a((List) m.mo1003k()) || !C0289S.m1284a((List) m.mo1004l());
    }

    /* renamed from: a */
    public Object mo950a(Object obj, Object obj2, Object obj3) {
        C0195M m = (C0195M) obj;
        C0195M m2 = (C0195M) obj2;
        C0195M m3 = (C0195M) obj3;
        if (m != null && m2 != null) {
            C0205T t = new C0205T();
            t.mo1022b(m);
            t.mo1022b(m2);
            t.mo1021b(1);
            m = t;
        } else if (m == null) {
            m = m2 != null ? m2 : null;
        }
        if (m3 == null) {
            return m;
        }
        C0205T t2 = new C0205T();
        if (m != null) {
            t2.mo1022b(m);
        }
        t2.mo1022b(m3);
        return t2;
    }

    /* renamed from: a */
    public void mo951a(ViewGroup viewGroup, Object obj) {
        C0201P.m1009a(viewGroup, (C0195M) obj);
    }

    /* renamed from: a */
    public void mo952a(Object obj, Rect rect) {
        if (obj != null) {
            ((C0195M) obj).mo979a((C0195M.C0197b) new C0261v(this, rect));
        }
    }

    /* renamed from: a */
    public void mo953a(Object obj, View view) {
        if (obj != null) {
            ((C0195M) obj).mo975a(view);
        }
    }

    /* renamed from: a */
    public void mo954a(Object obj, View view, ArrayList<View> arrayList) {
        ((C0195M) obj).mo974a((C0195M.C0198c) new C0257t(this, view, arrayList));
    }

    /* renamed from: a */
    public void mo955a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((C0195M) obj).mo974a((C0195M.C0198c) new C0259u(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    /* renamed from: a */
    public void mo956a(Object obj, ArrayList<View> arrayList) {
        C0195M m = (C0195M) obj;
        if (m != null) {
            int i = 0;
            if (m instanceof C0205T) {
                C0205T t = (C0205T) m;
                int q = t.mo1023q();
                while (i < q) {
                    mo956a((Object) t.mo1020a(i), arrayList);
                    i++;
                }
            } else if (!m930a(m) && C0289S.m1284a((List) m.mo1005m())) {
                int size = arrayList.size();
                while (i < size) {
                    m.mo975a(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo957a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C0195M m = (C0195M) obj;
        int i = 0;
        if (m instanceof C0205T) {
            C0205T t = (C0205T) m;
            int q = t.mo1023q();
            while (i < q) {
                mo957a((Object) t.mo1020a(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m930a(m)) {
            List<View> m2 = m.mo1005m();
            if (m2.size() == arrayList.size() && m2.containsAll(arrayList)) {
                int size = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size) {
                    m.mo975a(arrayList2.get(i));
                    i++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    m.mo994d(arrayList.get(size2));
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo958a(Object obj) {
        return obj instanceof C0195M;
    }

    /* renamed from: b */
    public Object mo959b(Object obj) {
        if (obj != null) {
            return ((C0195M) obj).clone();
        }
        return null;
    }

    /* renamed from: b */
    public Object mo960b(Object obj, Object obj2, Object obj3) {
        C0205T t = new C0205T();
        if (obj != null) {
            t.mo1022b((C0195M) obj);
        }
        if (obj2 != null) {
            t.mo1022b((C0195M) obj2);
        }
        if (obj3 != null) {
            t.mo1022b((C0195M) obj3);
        }
        return t;
    }

    /* renamed from: b */
    public void mo961b(Object obj, View view) {
        if (obj != null) {
            ((C0195M) obj).mo994d(view);
        }
    }

    /* renamed from: b */
    public void mo962b(Object obj, View view, ArrayList<View> arrayList) {
        C0205T t = (C0205T) obj;
        List<View> m = t.mo1005m();
        m.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0289S.m1283a(m, arrayList.get(i));
        }
        m.add(view);
        arrayList.add(view);
        mo956a((Object) t, arrayList);
    }

    /* renamed from: b */
    public void mo963b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C0205T t = (C0205T) obj;
        if (t != null) {
            t.mo1005m().clear();
            t.mo1005m().addAll(arrayList2);
            mo957a((Object) t, arrayList, arrayList2);
        }
    }

    /* renamed from: c */
    public Object mo964c(Object obj) {
        if (obj == null) {
            return null;
        }
        C0205T t = new C0205T();
        t.mo1022b((C0195M) obj);
        return t;
    }

    /* renamed from: c */
    public void mo965c(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            mo1172a(view, rect);
            ((C0195M) obj).mo979a((C0195M.C0197b) new C0253s(this, rect));
        }
    }
}
