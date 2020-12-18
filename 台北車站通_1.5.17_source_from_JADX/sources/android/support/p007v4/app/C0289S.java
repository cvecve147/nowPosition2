package android.support.p007v4.app;

import android.graphics.Rect;
import android.support.p007v4.view.C0487v;
import android.support.p007v4.view.C0500y;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: android.support.v4.app.S */
public abstract class C0289S {
    /* renamed from: a */
    static String m1282a(Map<String, String> map, String str) {
        for (Map.Entry next : map.entrySet()) {
            if (str.equals(next.getValue())) {
                return (String) next.getKey();
            }
        }
        return null;
    }

    /* renamed from: a */
    protected static void m1283a(List<View> list, View view) {
        int size = list.size();
        if (!m1285a(list, view, size)) {
            list.add(view);
            for (int i = size; i < list.size(); i++) {
                View view2 = list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!m1285a(list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    protected static boolean m1284a(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: a */
    private static boolean m1285a(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public abstract Object mo950a(Object obj, Object obj2, Object obj3);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<String> mo1171a(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(C0487v.m2299o(view));
            C0487v.m2279a(view, (String) null);
        }
        return arrayList2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1172a(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1173a(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String o = C0487v.m2299o(view2);
            arrayList4.add(o);
            if (o != null) {
                C0487v.m2279a(view2, (String) null);
                String str = map.get(o);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        C0487v.m2279a(arrayList2.get(i2), o);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        C0320ca.m1419a(view, new C0286O(this, size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1174a(View view, ArrayList<View> arrayList, Map<String, String> map) {
        C0320ca.m1419a(view, new C0287P(this, arrayList, map));
    }

    /* renamed from: a */
    public abstract void mo951a(ViewGroup viewGroup, Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1175a(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        C0320ca.m1419a(viewGroup, new C0288Q(this, arrayList, map));
    }

    /* renamed from: a */
    public abstract void mo952a(Object obj, Rect rect);

    /* renamed from: a */
    public abstract void mo953a(Object obj, View view);

    /* renamed from: a */
    public abstract void mo954a(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo955a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: a */
    public abstract void mo956a(Object obj, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo957a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1176a(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            boolean z = view instanceof ViewGroup;
            ViewGroup viewGroup = view;
            if (z) {
                ViewGroup viewGroup2 = (ViewGroup) view;
                boolean a = C0500y.m2417a(viewGroup2);
                viewGroup = viewGroup2;
                if (!a) {
                    int childCount = viewGroup2.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        mo1176a(arrayList, viewGroup2.getChildAt(i));
                    }
                    return;
                }
            }
            arrayList.add(viewGroup);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1177a(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String o = C0487v.m2299o(view);
            if (o != null) {
                map.put(o, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    mo1177a(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* renamed from: a */
    public abstract boolean mo958a(Object obj);

    /* renamed from: b */
    public abstract Object mo959b(Object obj);

    /* renamed from: b */
    public abstract Object mo960b(Object obj, Object obj2, Object obj3);

    /* renamed from: b */
    public abstract void mo961b(Object obj, View view);

    /* renamed from: b */
    public abstract void mo962b(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: b */
    public abstract void mo963b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: c */
    public abstract Object mo964c(Object obj);

    /* renamed from: c */
    public abstract void mo965c(Object obj, View view);
}
