package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2577Om;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.wm */
final class C3583wm implements C3613xo {

    /* renamed from: a */
    private final C3525um f10453a;

    private C3583wm(C3525um umVar) {
        C2641Qm.m10989a(umVar, "output");
        this.f10453a = umVar;
        this.f10453a.f10307c = this;
    }

    /* renamed from: a */
    public static C3583wm m14338a(C3525um umVar) {
        C3583wm wmVar = umVar.f10307c;
        return wmVar != null ? wmVar : new C3583wm(umVar);
    }

    /* renamed from: a */
    public final int mo10165a() {
        return C2577Om.C2582e.f8058l;
    }

    /* renamed from: a */
    public final void mo10166a(int i) {
        this.f10453a.mo10092a(i, 4);
    }

    /* renamed from: a */
    public final void mo10167a(int i, double d) {
        this.f10453a.mo10090a(i, d);
    }

    /* renamed from: a */
    public final void mo10168a(int i, float f) {
        this.f10453a.mo10091a(i, f);
    }

    /* renamed from: a */
    public final void mo10169a(int i, int i2) {
        this.f10453a.mo10109c(i, i2);
    }

    /* renamed from: a */
    public final void mo10170a(int i, long j) {
        this.f10453a.mo10110c(i, j);
    }

    /* renamed from: a */
    public final void mo10171a(int i, C3150hm hmVar) {
        this.f10453a.mo10094a(i, hmVar);
    }

    /* renamed from: a */
    public final void mo10172a(int i, Object obj) {
        if (obj instanceof C3150hm) {
            this.f10453a.mo10106b(i, (C3150hm) obj);
        } else {
            this.f10453a.mo10095a(i, (C3498tn) obj);
        }
    }

    /* renamed from: a */
    public final void mo10173a(int i, Object obj, C2493Ln ln) {
        C3525um umVar = this.f10453a;
        umVar.mo10092a(i, 3);
        ln.mo8498a((C3498tn) obj, (C3613xo) umVar.f10307c);
        umVar.mo10092a(i, 4);
    }

    /* renamed from: a */
    public final void mo10174a(int i, String str) {
        this.f10453a.mo10097a(i, str);
    }

    /* renamed from: a */
    public final void mo10175a(int i, List<C3150hm> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f10453a.mo10094a(i, list.get(i2));
        }
    }

    /* renamed from: a */
    public final void mo10176a(int i, List<?> list, C2493Ln ln) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo10182b(i, (Object) list.get(i2), ln);
        }
    }

    /* renamed from: a */
    public final void mo10177a(int i, List<Boolean> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f10453a.mo10092a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3525um.m14089b(list.get(i4).booleanValue());
            }
            this.f10453a.mo10103b(i3);
            while (i2 < list.size()) {
                this.f10453a.mo10101a(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10453a.mo10098a(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo10178a(int i, boolean z) {
        this.f10453a.mo10098a(i, z);
    }

    /* renamed from: b */
    public final void mo10179b(int i) {
        this.f10453a.mo10092a(i, 3);
    }

    /* renamed from: b */
    public final void mo10180b(int i, int i2) {
        this.f10453a.mo10114e(i, i2);
    }

    /* renamed from: b */
    public final void mo10181b(int i, long j) {
        this.f10453a.mo10105b(i, j);
    }

    /* renamed from: b */
    public final void mo10182b(int i, Object obj, C2493Ln ln) {
        this.f10453a.mo10096a(i, (C3498tn) obj, ln);
    }

    /* renamed from: b */
    public final void mo10183b(int i, List<String> list) {
        int i2 = 0;
        if (list instanceof C3038dn) {
            C3038dn dnVar = (C3038dn) list;
            while (i2 < list.size()) {
                Object b = dnVar.mo9279b(i2);
                if (b instanceof String) {
                    this.f10453a.mo10097a(i, (String) b);
                } else {
                    this.f10453a.mo10094a(i, (C3150hm) b);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10453a.mo10097a(i, list.get(i2));
            i2++;
        }
    }

    /* renamed from: b */
    public final void mo10184b(int i, List<?> list, C2493Ln ln) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo10173a(i, (Object) list.get(i2), ln);
        }
    }

    /* renamed from: b */
    public final void mo10185b(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f10453a.mo10092a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3525um.m14100f(list.get(i4).intValue());
            }
            this.f10453a.mo10103b(i3);
            while (i2 < list.size()) {
                this.f10453a.mo10089a(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10453a.mo10104b(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: c */
    public final void mo10186c(int i, int i2) {
        this.f10453a.mo10113d(i, i2);
    }

    /* renamed from: c */
    public final void mo10187c(int i, long j) {
        this.f10453a.mo10110c(i, j);
    }

    /* renamed from: c */
    public final void mo10188c(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f10453a.mo10092a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3525um.m14117k(list.get(i4).intValue());
            }
            this.f10453a.mo10103b(i3);
            while (i2 < list.size()) {
                this.f10453a.mo10089a(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10453a.mo10104b(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: d */
    public final void mo10189d(int i, int i2) {
        this.f10453a.mo10104b(i, i2);
    }

    /* renamed from: d */
    public final void mo10190d(int i, long j) {
        this.f10453a.mo10093a(i, j);
    }

    /* renamed from: d */
    public final void mo10191d(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f10453a.mo10092a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3525um.m14096d(list.get(i4).longValue());
            }
            this.f10453a.mo10103b(i3);
            while (i2 < list.size()) {
                this.f10453a.mo10099a(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10453a.mo10093a(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: e */
    public final void mo10192e(int i, int i2) {
        this.f10453a.mo10114e(i, i2);
    }

    /* renamed from: e */
    public final void mo10193e(int i, long j) {
        this.f10453a.mo10093a(i, j);
    }

    /* renamed from: e */
    public final void mo10194e(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f10453a.mo10092a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3525um.m14111h(list.get(i4).longValue());
            }
            this.f10453a.mo10103b(i3);
            while (i2 < list.size()) {
                this.f10453a.mo10111c(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10453a.mo10110c(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: f */
    public final void mo10195f(int i, int i2) {
        this.f10453a.mo10104b(i, i2);
    }

    /* renamed from: f */
    public final void mo10196f(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f10453a.mo10092a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3525um.m14112i(list.get(i4).intValue());
            }
            this.f10453a.mo10103b(i3);
            while (i2 < list.size()) {
                this.f10453a.mo10112d(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10453a.mo10114e(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: g */
    public final void mo10197g(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f10453a.mo10092a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3525um.m14104g(list.get(i4).intValue());
            }
            this.f10453a.mo10103b(i3);
            while (i2 < list.size()) {
                this.f10453a.mo10103b(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10453a.mo10109c(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: h */
    public final void mo10198h(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f10453a.mo10092a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3525um.m14115j(list.get(i4).intValue());
            }
            this.f10453a.mo10103b(i3);
            while (i2 < list.size()) {
                this.f10453a.mo10112d(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10453a.mo10114e(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: i */
    public final void mo10199i(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f10453a.mo10092a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3525um.m14107g(list.get(i4).longValue());
            }
            this.f10453a.mo10103b(i3);
            while (i2 < list.size()) {
                this.f10453a.mo10111c(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10453a.mo10110c(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: j */
    public final void mo10200j(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f10453a.mo10092a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3525um.m14103f(list.get(i4).longValue());
            }
            this.f10453a.mo10103b(i3);
            while (i2 < list.size()) {
                this.f10453a.mo10107b(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10453a.mo10105b(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: k */
    public final void mo10201k(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f10453a.mo10092a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3525um.m14099e(list.get(i4).longValue());
            }
            this.f10453a.mo10103b(i3);
            while (i2 < list.size()) {
                this.f10453a.mo10099a(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10453a.mo10093a(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: l */
    public final void mo10202l(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f10453a.mo10092a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3525um.m14108h(list.get(i4).intValue());
            }
            this.f10453a.mo10103b(i3);
            while (i2 < list.size()) {
                this.f10453a.mo10108c(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10453a.mo10113d(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: m */
    public final void mo10203m(int i, List<Double> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f10453a.mo10092a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3525um.m14079b(list.get(i4).doubleValue());
            }
            this.f10453a.mo10103b(i3);
            while (i2 < list.size()) {
                this.f10453a.mo10087a(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10453a.mo10090a(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    /* renamed from: n */
    public final void mo10204n(int i, List<Float> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f10453a.mo10092a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3525um.m14080b(list.get(i4).floatValue());
            }
            this.f10453a.mo10103b(i3);
            while (i2 < list.size()) {
                this.f10453a.mo10088a(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10453a.mo10091a(i, list.get(i2).floatValue());
            i2++;
        }
    }
}
