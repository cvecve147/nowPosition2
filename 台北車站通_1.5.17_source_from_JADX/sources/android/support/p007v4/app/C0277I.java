package android.support.p007v4.app;

import android.graphics.Rect;
import android.os.Build;
import android.support.p007v4.view.C0487v;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p013b.p018b.p028h.p039h.C1080b;

/* renamed from: android.support.v4.app.I */
class C0277I {

    /* renamed from: a */
    private static final int[] f1200a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8};

    /* renamed from: b */
    private static final C0289S f1201b = (Build.VERSION.SDK_INT >= 21 ? new C0285N() : null);

    /* renamed from: c */
    private static final C0289S f1202c = m1225a();

    /* renamed from: android.support.v4.app.I$a */
    static class C0278a {

        /* renamed from: a */
        public C0339l f1203a;

        /* renamed from: b */
        public boolean f1204b;

        /* renamed from: c */
        public C0321d f1205c;

        /* renamed from: d */
        public C0339l f1206d;

        /* renamed from: e */
        public boolean f1207e;

        /* renamed from: f */
        public C0321d f1208f;

        C0278a() {
        }
    }

    /* renamed from: a */
    private static C0278a m1224a(C0278a aVar, SparseArray<C0278a> sparseArray, int i) {
        if (aVar != null) {
            return aVar;
        }
        C0278a aVar2 = new C0278a();
        sparseArray.put(i, aVar2);
        return aVar2;
    }

    /* renamed from: a */
    private static C0289S m1225a() {
        try {
            return (C0289S) Class.forName("android.support.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static C0289S m1226a(C0339l lVar, C0339l lVar2) {
        ArrayList arrayList = new ArrayList();
        if (lVar != null) {
            Object l = lVar.mo1402l();
            if (l != null) {
                arrayList.add(l);
            }
            Object v = lVar.mo1418v();
            if (v != null) {
                arrayList.add(v);
            }
            Object x = lVar.mo1420x();
            if (x != null) {
                arrayList.add(x);
            }
        }
        if (lVar2 != null) {
            Object j = lVar2.mo1398j();
            if (j != null) {
                arrayList.add(j);
            }
            Object s = lVar2.mo1414s();
            if (s != null) {
                arrayList.add(s);
            }
            Object w = lVar2.mo1419w();
            if (w != null) {
                arrayList.add(w);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        C0289S s2 = f1201b;
        if (s2 != null && m1247a(s2, (List<Object>) arrayList)) {
            return f1201b;
        }
        C0289S s3 = f1202c;
        if (s3 != null && m1247a(s3, (List<Object>) arrayList)) {
            return f1202c;
        }
        if (f1201b == null && f1202c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: a */
    private static C1080b<String, String> m1228a(int i, ArrayList<C0321d> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        C1080b<String, String> bVar = new C1080b<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C0321d dVar = arrayList.get(i4);
            if (dVar.mo1266b(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                ArrayList<String> arrayList5 = dVar.f1362r;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = dVar.f1362r;
                        arrayList4 = dVar.f1363s;
                    } else {
                        ArrayList<String> arrayList6 = dVar.f1362r;
                        arrayList3 = dVar.f1363s;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String remove = bVar.remove(str2);
                        if (remove != null) {
                            bVar.put(str, remove);
                        } else {
                            bVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return bVar;
    }

    /* renamed from: a */
    private static Object m1230a(C0289S s, C0339l lVar, C0339l lVar2, boolean z) {
        if (lVar == null || lVar2 == null) {
            return null;
        }
        return s.mo964c(s.mo959b(z ? lVar2.mo1420x() : lVar.mo1419w()));
    }

    /* renamed from: a */
    private static Object m1231a(C0289S s, C0339l lVar, boolean z) {
        if (lVar == null) {
            return null;
        }
        return s.mo959b(z ? lVar.mo1414s() : lVar.mo1398j());
    }

    /* renamed from: a */
    private static Object m1232a(C0289S s, ViewGroup viewGroup, View view, C1080b<String, String> bVar, C0278a aVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        C1080b<String, String> bVar2;
        Object obj3;
        Object obj4;
        Rect rect;
        C0289S s2 = s;
        C0278a aVar2 = aVar;
        ArrayList<View> arrayList3 = arrayList;
        Object obj5 = obj;
        C0339l lVar = aVar2.f1203a;
        C0339l lVar2 = aVar2.f1206d;
        if (lVar == null || lVar2 == null) {
            return null;
        }
        boolean z = aVar2.f1204b;
        if (bVar.isEmpty()) {
            bVar2 = bVar;
            obj3 = null;
        } else {
            obj3 = m1230a(s2, lVar, lVar2, z);
            bVar2 = bVar;
        }
        C1080b<String, View> c = m1257c(s2, bVar2, obj3, aVar2);
        if (bVar.isEmpty()) {
            obj4 = null;
        } else {
            arrayList3.addAll(c.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        m1254b(lVar, lVar2, z, c, true);
        if (obj4 != null) {
            rect = new Rect();
            s2.mo962b(obj4, view, arrayList3);
            m1238a(s, obj4, obj2, c, aVar2.f1207e, aVar2.f1208f);
            if (obj5 != null) {
                s2.mo952a(obj5, rect);
            }
        } else {
            rect = null;
        }
        C0276H h = r0;
        C0276H h2 = new C0276H(s, bVar, obj4, aVar, arrayList2, view, lVar, lVar2, z, arrayList, obj, rect);
        C0320ca.m1419a(viewGroup, h);
        return obj4;
    }

    /* renamed from: a */
    private static Object m1233a(C0289S s, Object obj, Object obj2, Object obj3, C0339l lVar, boolean z) {
        return (obj == null || obj2 == null || lVar == null) ? true : z ? lVar.mo1380d() : lVar.mo1376c() ? s.mo960b(obj2, obj, obj3) : s.mo950a(obj2, obj, obj3);
    }

    /* renamed from: a */
    private static String m1234a(C1080b<String, String> bVar, String str) {
        int size = bVar.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(bVar.mo5241d(i))) {
                return bVar.mo5236b(i);
            }
        }
        return null;
    }

    /* renamed from: a */
    private static void m1236a(C0289S s, ViewGroup viewGroup, C0339l lVar, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        ViewGroup viewGroup2 = viewGroup;
        C0320ca.m1419a(viewGroup, new C0272F(obj, s, view, lVar, arrayList, arrayList2, arrayList3, obj2));
    }

    /* renamed from: a */
    private static void m1237a(C0289S s, Object obj, C0339l lVar, ArrayList<View> arrayList) {
        if (lVar != null && obj != null && lVar.f1428m && lVar.f1398C && lVar.f1413R) {
            lVar.mo1389f(true);
            s.mo954a(obj, lVar.mo1422z(), arrayList);
            C0320ca.m1419a(lVar.f1405J, new C0271E(arrayList));
        }
    }

    /* renamed from: a */
    private static void m1238a(C0289S s, Object obj, Object obj2, C1080b<String, View> bVar, boolean z, C0321d dVar) {
        ArrayList<String> arrayList = dVar.f1362r;
        if (arrayList != null && !arrayList.isEmpty()) {
            View view = bVar.get((z ? dVar.f1363s : dVar.f1362r).get(0));
            s.mo965c(obj, view);
            if (obj2 != null) {
                s.mo965c(obj2, view);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0041, code lost:
        if (r10.f1428m != false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0077, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0093, code lost:
        if (r10.f1398C == false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0095, code lost:
        r1 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00e9 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:95:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m1239a(android.support.p007v4.app.C0321d r16, android.support.p007v4.app.C0321d.C0322a r17, android.util.SparseArray<android.support.p007v4.app.C0277I.C0278a> r18, boolean r19, boolean r20) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            android.support.v4.app.l r10 = r1.f1367b
            if (r10 != 0) goto L_0x000d
            return
        L_0x000d:
            int r11 = r10.f1396A
            if (r11 != 0) goto L_0x0012
            return
        L_0x0012:
            if (r3 == 0) goto L_0x001b
            int[] r4 = f1200a
            int r1 = r1.f1366a
            r1 = r4[r1]
            goto L_0x001d
        L_0x001b:
            int r1 = r1.f1366a
        L_0x001d:
            r4 = 0
            r5 = 1
            if (r1 == r5) goto L_0x0088
            r6 = 3
            if (r1 == r6) goto L_0x0060
            r6 = 4
            if (r1 == r6) goto L_0x0048
            r6 = 5
            if (r1 == r6) goto L_0x0035
            r6 = 6
            if (r1 == r6) goto L_0x0060
            r6 = 7
            if (r1 == r6) goto L_0x0088
            r1 = r4
            r12 = r1
            r13 = r12
            goto L_0x009c
        L_0x0035:
            if (r20 == 0) goto L_0x0044
            boolean r1 = r10.f1413R
            if (r1 == 0) goto L_0x0097
            boolean r1 = r10.f1398C
            if (r1 != 0) goto L_0x0097
            boolean r1 = r10.f1428m
            if (r1 == 0) goto L_0x0097
            goto L_0x0095
        L_0x0044:
            boolean r1 = r10.f1398C
            goto L_0x0098
        L_0x0048:
            if (r20 == 0) goto L_0x0057
            boolean r1 = r10.f1413R
            if (r1 == 0) goto L_0x0079
            boolean r1 = r10.f1428m
            if (r1 == 0) goto L_0x0079
            boolean r1 = r10.f1398C
            if (r1 == 0) goto L_0x0079
        L_0x0056:
            goto L_0x0077
        L_0x0057:
            boolean r1 = r10.f1428m
            if (r1 == 0) goto L_0x0079
            boolean r1 = r10.f1398C
            if (r1 != 0) goto L_0x0079
            goto L_0x0056
        L_0x0060:
            if (r20 == 0) goto L_0x007b
            boolean r1 = r10.f1428m
            if (r1 != 0) goto L_0x0079
            android.view.View r1 = r10.f1406K
            if (r1 == 0) goto L_0x0079
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0079
            float r1 = r10.f1414S
            r6 = 0
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 < 0) goto L_0x0079
        L_0x0077:
            r1 = r5
            goto L_0x0084
        L_0x0079:
            r1 = r4
            goto L_0x0084
        L_0x007b:
            boolean r1 = r10.f1428m
            if (r1 == 0) goto L_0x0079
            boolean r1 = r10.f1398C
            if (r1 != 0) goto L_0x0079
            goto L_0x0077
        L_0x0084:
            r13 = r1
            r1 = r4
            r12 = r5
            goto L_0x009c
        L_0x0088:
            if (r20 == 0) goto L_0x008d
            boolean r1 = r10.f1412Q
            goto L_0x0098
        L_0x008d:
            boolean r1 = r10.f1428m
            if (r1 != 0) goto L_0x0097
            boolean r1 = r10.f1398C
            if (r1 != 0) goto L_0x0097
        L_0x0095:
            r1 = r5
            goto L_0x0098
        L_0x0097:
            r1 = r4
        L_0x0098:
            r12 = r4
            r13 = r12
            r4 = r1
            r1 = r5
        L_0x009c:
            java.lang.Object r6 = r2.get(r11)
            android.support.v4.app.I$a r6 = (android.support.p007v4.app.C0277I.C0278a) r6
            if (r4 == 0) goto L_0x00ae
            android.support.v4.app.I$a r6 = m1224a((android.support.p007v4.app.C0277I.C0278a) r6, (android.util.SparseArray<android.support.p007v4.app.C0277I.C0278a>) r2, (int) r11)
            r6.f1203a = r10
            r6.f1204b = r3
            r6.f1205c = r0
        L_0x00ae:
            r14 = r6
            r15 = 0
            if (r20 != 0) goto L_0x00d5
            if (r1 == 0) goto L_0x00d5
            if (r14 == 0) goto L_0x00bc
            android.support.v4.app.l r1 = r14.f1206d
            if (r1 != r10) goto L_0x00bc
            r14.f1206d = r15
        L_0x00bc:
            android.support.v4.app.y r4 = r0.f1345a
            int r1 = r10.f1418c
            if (r1 >= r5) goto L_0x00d5
            int r1 = r4.f1525r
            if (r1 < r5) goto L_0x00d5
            boolean r1 = r0.f1364t
            if (r1 != 0) goto L_0x00d5
            r4.mo1567f(r10)
            r6 = 1
            r7 = 0
            r8 = 0
            r9 = 0
            r5 = r10
            r4.mo1536a((android.support.p007v4.app.C0339l) r5, (int) r6, (int) r7, (int) r8, (boolean) r9)
        L_0x00d5:
            if (r13 == 0) goto L_0x00e7
            if (r14 == 0) goto L_0x00dd
            android.support.v4.app.l r1 = r14.f1206d
            if (r1 != 0) goto L_0x00e7
        L_0x00dd:
            android.support.v4.app.I$a r14 = m1224a((android.support.p007v4.app.C0277I.C0278a) r14, (android.util.SparseArray<android.support.p007v4.app.C0277I.C0278a>) r2, (int) r11)
            r14.f1206d = r10
            r14.f1207e = r3
            r14.f1208f = r0
        L_0x00e7:
            if (r20 != 0) goto L_0x00f3
            if (r12 == 0) goto L_0x00f3
            if (r14 == 0) goto L_0x00f3
            android.support.v4.app.l r0 = r14.f1203a
            if (r0 != r10) goto L_0x00f3
            r14.f1203a = r15
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p007v4.app.C0277I.m1239a(android.support.v4.app.d, android.support.v4.app.d$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: a */
    public static void m1240a(C0321d dVar, SparseArray<C0278a> sparseArray, boolean z) {
        int size = dVar.f1346b.size();
        for (int i = 0; i < size; i++) {
            m1239a(dVar, dVar.f1346b.get(i), sparseArray, false, z);
        }
    }

    /* renamed from: a */
    private static void m1242a(C0360y yVar, int i, C0278a aVar, View view, C1080b<String, String> bVar) {
        C0339l lVar;
        C0339l lVar2;
        C0289S a;
        Object obj;
        C0360y yVar2 = yVar;
        C0278a aVar2 = aVar;
        View view2 = view;
        C1080b<String, String> bVar2 = bVar;
        ViewGroup viewGroup = yVar2.f1527t.mo1313a() ? (ViewGroup) yVar2.f1527t.mo1312a(i) : null;
        if (viewGroup != null && (a = m1226a(lVar2, lVar)) != null) {
            boolean z = aVar2.f1204b;
            boolean z2 = aVar2.f1207e;
            Object a2 = m1231a(a, (lVar = aVar2.f1203a), z);
            Object b = m1250b(a, (lVar2 = aVar2.f1206d), z2);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = arrayList;
            Object obj2 = b;
            C0289S s = a;
            Object a3 = m1232a(a, viewGroup, view, bVar, aVar, (ArrayList<View>) arrayList, (ArrayList<View>) arrayList2, a2, obj2);
            Object obj3 = a2;
            if (obj3 == null && a3 == null) {
                obj = obj2;
                if (obj == null) {
                    return;
                }
            } else {
                obj = obj2;
            }
            ArrayList<View> b2 = m1252b(s, obj, lVar2, (ArrayList<View>) arrayList3, view2);
            Object obj4 = (b2 == null || b2.isEmpty()) ? null : obj;
            s.mo953a(obj3, view2);
            Object a4 = m1233a(s, obj3, obj4, a3, lVar, aVar2.f1204b);
            if (a4 != null) {
                ArrayList arrayList4 = new ArrayList();
                C0289S s2 = s;
                s2.mo955a(a4, obj3, arrayList4, obj4, b2, a3, arrayList2);
                m1236a(s2, viewGroup, lVar, view, (ArrayList<View>) arrayList2, obj3, (ArrayList<View>) arrayList4, obj4, b2);
                ArrayList arrayList5 = arrayList2;
                s.mo1174a((View) viewGroup, (ArrayList<View>) arrayList5, (Map<String, String>) bVar2);
                s.mo951a(viewGroup, a4);
                s.mo1175a(viewGroup, (ArrayList<View>) arrayList5, (Map<String, String>) bVar2);
            }
        }
    }

    /* renamed from: a */
    static void m1243a(C0360y yVar, ArrayList<C0321d> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z) {
        if (yVar.f1525r >= 1) {
            SparseArray sparseArray = new SparseArray();
            for (int i3 = i; i3 < i2; i3++) {
                C0321d dVar = arrayList.get(i3);
                if (arrayList2.get(i3).booleanValue()) {
                    m1253b(dVar, (SparseArray<C0278a>) sparseArray, z);
                } else {
                    m1240a(dVar, (SparseArray<C0278a>) sparseArray, z);
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(yVar.f1526s.mo1491c());
                int size = sparseArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    int keyAt = sparseArray.keyAt(i4);
                    C1080b<String, String> a = m1228a(keyAt, arrayList, arrayList2, i, i2);
                    C0278a aVar = (C0278a) sparseArray.valueAt(i4);
                    if (z) {
                        m1255b(yVar, keyAt, aVar, view, a);
                    } else {
                        m1242a(yVar, keyAt, aVar, view, a);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m1244a(C1080b<String, String> bVar, C1080b<String, View> bVar2) {
        for (int size = bVar.size() - 1; size >= 0; size--) {
            if (!bVar2.containsKey(bVar.mo5241d(size))) {
                bVar.mo5237c(size);
            }
        }
    }

    /* renamed from: a */
    private static void m1246a(ArrayList<View> arrayList, C1080b<String, View> bVar, Collection<String> collection) {
        for (int size = bVar.size() - 1; size >= 0; size--) {
            View d = bVar.mo5241d(size);
            if (collection.contains(C0487v.m2299o(d))) {
                arrayList.add(d);
            }
        }
    }

    /* renamed from: a */
    private static boolean m1247a(C0289S s, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!s.mo958a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static View m1248b(C1080b<String, View> bVar, C0278a aVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        C0321d dVar = aVar.f1205c;
        if (obj == null || bVar == null || (arrayList = dVar.f1362r) == null || arrayList.isEmpty()) {
            return null;
        }
        return bVar.get((z ? dVar.f1362r : dVar.f1363s).get(0));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C1080b<String, View> m1249b(C0289S s, C1080b<String, String> bVar, Object obj, C0278a aVar) {
        C0325ea eaVar;
        ArrayList<String> arrayList;
        String a;
        C0339l lVar = aVar.f1203a;
        View z = lVar.mo1422z();
        if (bVar.isEmpty() || obj == null || z == null) {
            bVar.clear();
            return null;
        }
        C1080b<String, View> bVar2 = new C1080b<>();
        s.mo1177a((Map<String, View>) bVar2, z);
        C0321d dVar = aVar.f1205c;
        if (aVar.f1204b) {
            eaVar = lVar.mo1404m();
            arrayList = dVar.f1362r;
        } else {
            eaVar = lVar.mo1400k();
            arrayList = dVar.f1363s;
        }
        if (arrayList != null) {
            bVar2.mo5113a(arrayList);
            bVar2.mo5113a(bVar.values());
        }
        if (eaVar != null) {
            eaVar.mo1276a(arrayList, bVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = bVar2.get(str);
                if (view == null) {
                    String a2 = m1234a(bVar, str);
                    if (a2 != null) {
                        bVar.remove(a2);
                    }
                } else if (!str.equals(C0487v.m2299o(view)) && (a = m1234a(bVar, str)) != null) {
                    bVar.put(a, C0487v.m2299o(view));
                }
            }
        } else {
            m1244a(bVar, bVar2);
        }
        return bVar2;
    }

    /* renamed from: b */
    private static Object m1250b(C0289S s, C0339l lVar, boolean z) {
        if (lVar == null) {
            return null;
        }
        return s.mo959b(z ? lVar.mo1418v() : lVar.mo1402l());
    }

    /* renamed from: b */
    private static Object m1251b(C0289S s, ViewGroup viewGroup, View view, C1080b<String, String> bVar, C0278a aVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Rect rect;
        View view2;
        C0289S s2 = s;
        View view3 = view;
        C1080b<String, String> bVar2 = bVar;
        C0278a aVar2 = aVar;
        ArrayList<View> arrayList3 = arrayList;
        ArrayList<View> arrayList4 = arrayList2;
        Object obj4 = obj;
        C0339l lVar = aVar2.f1203a;
        C0339l lVar2 = aVar2.f1206d;
        if (lVar != null) {
            lVar.mo1422z().setVisibility(0);
        }
        if (lVar == null || lVar2 == null) {
            return null;
        }
        boolean z = aVar2.f1204b;
        Object a = bVar.isEmpty() ? null : m1230a(s, lVar, lVar2, z);
        C1080b<String, View> c = m1257c(s, bVar2, a, aVar2);
        C1080b<String, View> b = m1249b(s, bVar2, a, aVar2);
        if (bVar.isEmpty()) {
            if (c != null) {
                c.clear();
            }
            if (b != null) {
                b.clear();
            }
            obj3 = null;
        } else {
            m1246a(arrayList3, c, (Collection<String>) bVar.keySet());
            m1246a(arrayList4, b, bVar.values());
            obj3 = a;
        }
        if (obj4 == null && obj2 == null && obj3 == null) {
            return null;
        }
        m1254b(lVar, lVar2, z, c, true);
        if (obj3 != null) {
            arrayList4.add(view3);
            s.mo962b(obj3, view3, arrayList3);
            m1238a(s, obj3, obj2, c, aVar2.f1207e, aVar2.f1208f);
            Rect rect2 = new Rect();
            View b2 = m1248b(b, aVar2, obj4, z);
            if (b2 != null) {
                s.mo952a(obj4, rect2);
            }
            rect = rect2;
            view2 = b2;
        } else {
            view2 = null;
            rect = null;
        }
        C0320ca.m1419a(viewGroup, new C0275G(lVar, lVar2, z, b, view2, s, rect));
        return obj3;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static ArrayList<View> m1252b(C0289S s, Object obj, C0339l lVar, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View z = lVar.mo1422z();
        if (z != null) {
            s.mo1176a(arrayList2, z);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        s.mo956a(obj, arrayList2);
        return arrayList2;
    }

    /* renamed from: b */
    public static void m1253b(C0321d dVar, SparseArray<C0278a> sparseArray, boolean z) {
        if (dVar.f1345a.f1527t.mo1313a()) {
            for (int size = dVar.f1346b.size() - 1; size >= 0; size--) {
                m1239a(dVar, dVar.f1346b.get(size), sparseArray, true, z);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m1254b(C0339l lVar, C0339l lVar2, boolean z, C1080b<String, View> bVar, boolean z2) {
        C0325ea k = z ? lVar2.mo1400k() : lVar.mo1400k();
        if (k != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = bVar == null ? 0 : bVar.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(bVar.mo5236b(i));
                arrayList.add(bVar.mo5241d(i));
            }
            if (z2) {
                k.mo1277b(arrayList2, arrayList, (List<View>) null);
            } else {
                k.mo1275a(arrayList2, arrayList, (List<View>) null);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        r11 = r4.f1203a;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m1255b(android.support.p007v4.app.C0360y r17, int r18, android.support.p007v4.app.C0277I.C0278a r19, android.view.View r20, p013b.p018b.p028h.p039h.C1080b<java.lang.String, java.lang.String> r21) {
        /*
            r0 = r17
            r4 = r19
            r9 = r20
            android.support.v4.app.o r1 = r0.f1527t
            boolean r1 = r1.mo1313a()
            if (r1 == 0) goto L_0x0019
            android.support.v4.app.o r0 = r0.f1527t
            r1 = r18
            android.view.View r0 = r0.mo1312a(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            r10 = r0
            if (r10 != 0) goto L_0x001e
            return
        L_0x001e:
            android.support.v4.app.l r11 = r4.f1203a
            android.support.v4.app.l r12 = r4.f1206d
            android.support.v4.app.S r13 = m1226a((android.support.p007v4.app.C0339l) r12, (android.support.p007v4.app.C0339l) r11)
            if (r13 != 0) goto L_0x0029
            return
        L_0x0029:
            boolean r14 = r4.f1204b
            boolean r0 = r4.f1207e
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.Object r7 = m1231a((android.support.p007v4.app.C0289S) r13, (android.support.p007v4.app.C0339l) r11, (boolean) r14)
            java.lang.Object r6 = m1250b((android.support.p007v4.app.C0289S) r13, (android.support.p007v4.app.C0339l) r12, (boolean) r0)
            r0 = r13
            r1 = r10
            r2 = r20
            r3 = r21
            r4 = r19
            r5 = r8
            r17 = r6
            r6 = r15
            r18 = r7
            r16 = r10
            r10 = r8
            r8 = r17
            java.lang.Object r8 = m1251b(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r6 = r18
            if (r6 != 0) goto L_0x0061
            if (r8 != 0) goto L_0x0061
            r7 = r17
            if (r7 != 0) goto L_0x0063
            return
        L_0x0061:
            r7 = r17
        L_0x0063:
            java.util.ArrayList r5 = m1252b((android.support.p007v4.app.C0289S) r13, (java.lang.Object) r7, (android.support.p007v4.app.C0339l) r12, (java.util.ArrayList<android.view.View>) r10, (android.view.View) r9)
            java.util.ArrayList r9 = m1252b((android.support.p007v4.app.C0289S) r13, (java.lang.Object) r6, (android.support.p007v4.app.C0339l) r11, (java.util.ArrayList<android.view.View>) r15, (android.view.View) r9)
            r0 = 4
            m1256b(r9, r0)
            r0 = r13
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r11
            r11 = r5
            r5 = r14
            java.lang.Object r14 = m1233a((android.support.p007v4.app.C0289S) r0, (java.lang.Object) r1, (java.lang.Object) r2, (java.lang.Object) r3, (android.support.p007v4.app.C0339l) r4, (boolean) r5)
            if (r14 == 0) goto L_0x00a4
            m1237a((android.support.p007v4.app.C0289S) r13, (java.lang.Object) r7, (android.support.p007v4.app.C0339l) r12, (java.util.ArrayList<android.view.View>) r11)
            java.util.ArrayList r12 = r13.mo1171a((java.util.ArrayList<android.view.View>) r15)
            r0 = r13
            r1 = r14
            r2 = r6
            r3 = r9
            r4 = r7
            r5 = r11
            r6 = r8
            r7 = r15
            r0.mo955a(r1, r2, r3, r4, r5, r6, r7)
            r0 = r16
            r13.mo951a((android.view.ViewGroup) r0, (java.lang.Object) r14)
            r1 = r13
            r2 = r0
            r3 = r10
            r4 = r15
            r5 = r12
            r6 = r21
            r1.mo1173a(r2, r3, r4, r5, r6)
            r0 = 0
            m1256b(r9, r0)
            r13.mo963b((java.lang.Object) r8, (java.util.ArrayList<android.view.View>) r10, (java.util.ArrayList<android.view.View>) r15)
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p007v4.app.C0277I.m1255b(android.support.v4.app.y, int, android.support.v4.app.I$a, android.view.View, b.b.h.h.b):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m1256b(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }

    /* renamed from: c */
    private static C1080b<String, View> m1257c(C0289S s, C1080b<String, String> bVar, Object obj, C0278a aVar) {
        C0325ea eaVar;
        ArrayList<String> arrayList;
        if (bVar.isEmpty() || obj == null) {
            bVar.clear();
            return null;
        }
        C0339l lVar = aVar.f1206d;
        C1080b<String, View> bVar2 = new C1080b<>();
        s.mo1177a((Map<String, View>) bVar2, lVar.mo1422z());
        C0321d dVar = aVar.f1208f;
        if (aVar.f1207e) {
            eaVar = lVar.mo1400k();
            arrayList = dVar.f1363s;
        } else {
            eaVar = lVar.mo1404m();
            arrayList = dVar.f1362r;
        }
        bVar2.mo5113a(arrayList);
        if (eaVar != null) {
            eaVar.mo1276a(arrayList, bVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = bVar2.get(str);
                if (view == null) {
                    bVar.remove(str);
                } else if (!str.equals(C0487v.m2299o(view))) {
                    bVar.put(C0487v.m2299o(view), bVar.remove(str));
                }
            }
        } else {
            bVar.mo5113a(bVar2.keySet());
        }
        return bVar2;
    }
}
