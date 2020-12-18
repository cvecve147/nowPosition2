package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.Nn */
final class C2551Nn {

    /* renamed from: a */
    private static final Class<?> f7657a = m10716d();

    /* renamed from: b */
    private static final C3039do<?, ?> f7658b = m10690a(false);

    /* renamed from: c */
    private static final C3039do<?, ?> f7659c = m10690a(true);

    /* renamed from: d */
    private static final C3039do<?, ?> f7660d = new C3096fo();

    /* renamed from: a */
    static int m10684a(int i, Object obj, C2493Ln ln) {
        return obj instanceof C2980bn ? C3525um.m14072a(i, (C2980bn) obj) : C3525um.m14085b(i, (C3498tn) obj, ln);
    }

    /* renamed from: a */
    static int m10685a(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int e = C3525um.m14097e(i) * size;
        if (list instanceof C3038dn) {
            C3038dn dnVar = (C3038dn) list;
            while (i2 < size) {
                Object b = dnVar.mo9279b(i2);
                e += b instanceof C3150hm ? C3525um.m14074a((C3150hm) b) : C3525um.m14077a((String) b);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                e += obj instanceof C3150hm ? C3525um.m14074a((C3150hm) obj) : C3525um.m14077a((String) obj);
                i2++;
            }
        }
        return e;
    }

    /* renamed from: a */
    static int m10686a(int i, List<?> list, C2493Ln ln) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = C3525um.m14097e(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            e += obj instanceof C2980bn ? C3525um.m14073a((C2980bn) obj) : C3525um.m14076a((C3498tn) obj, ln);
        }
        return e;
    }

    /* renamed from: a */
    static int m10687a(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m10688a(list) + (list.size() * C3525um.m14097e(i));
    }

    /* renamed from: a */
    static int m10688a(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3179in) {
            C3179in inVar = (C3179in) list;
            i = 0;
            while (i2 < size) {
                i += C3525um.m14096d(inVar.mo9557c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3525um.m14096d(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static C3039do<?, ?> m10689a() {
        return f7658b;
    }

    /* renamed from: a */
    private static C3039do<?, ?> m10690a(boolean z) {
        try {
            Class<?> e = m10720e();
            if (e == null) {
                return null;
            }
            return (C3039do) e.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    static <UT, UB> UB m10691a(int i, int i2, UB ub, C3039do<UT, UB> doVar) {
        if (ub == null) {
            ub = doVar.mo9319a();
        }
        doVar.mo9322a(ub, i, (long) i2);
        return ub;
    }

    /* renamed from: a */
    static <UT, UB> UB m10692a(int i, List<Integer> list, C2698Sm<?> sm, UB ub, C3039do<UT, UB> doVar) {
        UB ub2;
        if (sm == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            loop1:
            while (true) {
                ub2 = ub;
                while (it.hasNext()) {
                    int intValue = it.next().intValue();
                    if (sm.mo8338a(intValue) == null) {
                        ub = m10691a(i, intValue, ub2, doVar);
                        it.remove();
                    }
                }
                break loop1;
            }
        } else {
            int size = list.size();
            ub2 = ub;
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue2 = list.get(i3).intValue();
                if (sm.mo8338a(intValue2) != null) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue2));
                    }
                    i2++;
                } else {
                    ub2 = m10691a(i, intValue2, ub2, doVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        }
        return ub2;
    }

    /* renamed from: a */
    public static void m10693a(int i, List<String> list, C3613xo xoVar) {
        if (list != null && !list.isEmpty()) {
            xoVar.mo10183b(i, list);
        }
    }

    /* renamed from: a */
    public static void m10694a(int i, List<?> list, C3613xo xoVar, C2493Ln ln) {
        if (list != null && !list.isEmpty()) {
            xoVar.mo10176a(i, list, ln);
        }
    }

    /* renamed from: a */
    public static void m10695a(int i, List<Double> list, C3613xo xoVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            xoVar.mo10203m(i, list, z);
        }
    }

    /* renamed from: a */
    static <T, FT extends C2406Im<FT>> void m10696a(C2263Dm<FT> dm, T t, T t2) {
        C2350Gm<FT> a = dm.mo7995a((Object) t2);
        if (!a.mo8222b()) {
            dm.mo8002b(t).mo8221a(a);
        }
    }

    /* renamed from: a */
    static <T, UT, UB> void m10697a(C3039do<UT, UB> doVar, T t, T t2) {
        doVar.mo9326a((Object) t, doVar.mo9334c(doVar.mo9320a((Object) t), doVar.mo9320a((Object) t2)));
    }

    /* renamed from: a */
    static <T> void m10698a(C3355on onVar, T t, T t2, long j) {
        C3210jo.m12735a((Object) t, j, onVar.mo9829a(C3210jo.m12757f(t, j), C3210jo.m12757f(t2, j)));
    }

    /* renamed from: a */
    public static void m10699a(Class<?> cls) {
        Class<?> cls2;
        if (!C2577Om.class.isAssignableFrom(cls) && (cls2 = f7657a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: a */
    public static boolean m10700a(int i, int i2, int i3) {
        if (i2 < 40) {
            return true;
        }
        long j = (long) i3;
        return ((((long) i2) - ((long) i)) + 1) + 9 <= ((2 * j) + 3) + ((j + 3) * 3);
    }

    /* renamed from: a */
    static boolean m10701a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: b */
    static int m10702b(int i, List<C3150hm> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = size * C3525um.m14097e(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            e += C3525um.m14074a(list.get(i2));
        }
        return e;
    }

    /* renamed from: b */
    static int m10703b(int i, List<C3498tn> list, C2493Ln ln) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C3525um.m14092c(i, list.get(i3), ln);
        }
        return i2;
    }

    /* renamed from: b */
    static int m10704b(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m10705b(list) + (size * C3525um.m14097e(i));
    }

    /* renamed from: b */
    static int m10705b(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3179in) {
            C3179in inVar = (C3179in) list;
            i = 0;
            while (i2 < size) {
                i += C3525um.m14099e(inVar.mo9557c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3525um.m14099e(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static C3039do<?, ?> m10706b() {
        return f7659c;
    }

    /* renamed from: b */
    public static void m10707b(int i, List<C3150hm> list, C3613xo xoVar) {
        if (list != null && !list.isEmpty()) {
            xoVar.mo10175a(i, list);
        }
    }

    /* renamed from: b */
    public static void m10708b(int i, List<?> list, C3613xo xoVar, C2493Ln ln) {
        if (list != null && !list.isEmpty()) {
            xoVar.mo10184b(i, list, ln);
        }
    }

    /* renamed from: b */
    public static void m10709b(int i, List<Float> list, C3613xo xoVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            xoVar.mo10204n(i, list, z);
        }
    }

    /* renamed from: c */
    static int m10710c(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m10711c(list) + (size * C3525um.m14097e(i));
    }

    /* renamed from: c */
    static int m10711c(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3179in) {
            C3179in inVar = (C3179in) list;
            i = 0;
            while (i2 < size) {
                i += C3525um.m14103f(inVar.mo9557c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3525um.m14103f(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: c */
    public static C3039do<?, ?> m10712c() {
        return f7660d;
    }

    /* renamed from: c */
    public static void m10713c(int i, List<Long> list, C3613xo xoVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            xoVar.mo10191d(i, list, z);
        }
    }

    /* renamed from: d */
    static int m10714d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m10715d(list) + (size * C3525um.m14097e(i));
    }

    /* renamed from: d */
    static int m10715d(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2613Pm) {
            C2613Pm pm = (C2613Pm) list;
            i = 0;
            while (i2 < size) {
                i += C3525um.m14117k(pm.mo8688c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3525um.m14117k(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: d */
    private static Class<?> m10716d() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static void m10717d(int i, List<Long> list, C3613xo xoVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            xoVar.mo10201k(i, list, z);
        }
    }

    /* renamed from: e */
    static int m10718e(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m10719e(list) + (size * C3525um.m14097e(i));
    }

    /* renamed from: e */
    static int m10719e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2613Pm) {
            C2613Pm pm = (C2613Pm) list;
            i = 0;
            while (i2 < size) {
                i += C3525um.m14100f(pm.mo8688c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3525um.m14100f(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: e */
    private static Class<?> m10720e() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static void m10721e(int i, List<Long> list, C3613xo xoVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            xoVar.mo10200j(i, list, z);
        }
    }

    /* renamed from: f */
    static int m10722f(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m10723f(list) + (size * C3525um.m14097e(i));
    }

    /* renamed from: f */
    static int m10723f(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2613Pm) {
            C2613Pm pm = (C2613Pm) list;
            i = 0;
            while (i2 < size) {
                i += C3525um.m14104g(pm.mo8688c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3525um.m14104g(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: f */
    public static void m10724f(int i, List<Long> list, C3613xo xoVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            xoVar.mo10199i(i, list, z);
        }
    }

    /* renamed from: g */
    static int m10725g(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m10726g(list) + (size * C3525um.m14097e(i));
    }

    /* renamed from: g */
    static int m10726g(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2613Pm) {
            C2613Pm pm = (C2613Pm) list;
            i = 0;
            while (i2 < size) {
                i += C3525um.m14108h(pm.mo8688c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3525um.m14108h(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: g */
    public static void m10727g(int i, List<Long> list, C3613xo xoVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            xoVar.mo10194e(i, list, z);
        }
    }

    /* renamed from: h */
    static int m10728h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C3525um.m14113i(i, 0);
    }

    /* renamed from: h */
    static int m10729h(List<?> list) {
        return list.size() << 2;
    }

    /* renamed from: h */
    public static void m10730h(int i, List<Integer> list, C3613xo xoVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            xoVar.mo10185b(i, list, z);
        }
    }

    /* renamed from: i */
    static int m10731i(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C3525um.m14106g(i, 0);
    }

    /* renamed from: i */
    static int m10732i(List<?> list) {
        return list.size() << 3;
    }

    /* renamed from: i */
    public static void m10733i(int i, List<Integer> list, C3613xo xoVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            xoVar.mo10197g(i, list, z);
        }
    }

    /* renamed from: j */
    static int m10734j(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C3525um.m14087b(i, true);
    }

    /* renamed from: j */
    static int m10735j(List<?> list) {
        return list.size();
    }

    /* renamed from: j */
    public static void m10736j(int i, List<Integer> list, C3613xo xoVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            xoVar.mo10202l(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m10737k(int i, List<Integer> list, C3613xo xoVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            xoVar.mo10196f(i, list, z);
        }
    }

    /* renamed from: l */
    public static void m10738l(int i, List<Integer> list, C3613xo xoVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            xoVar.mo10198h(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m10739m(int i, List<Integer> list, C3613xo xoVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            xoVar.mo10188c(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m10740n(int i, List<Boolean> list, C3613xo xoVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            xoVar.mo10177a(i, list, z);
        }
    }
}
