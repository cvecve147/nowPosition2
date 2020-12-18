package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.Nr */
final class C2555Nr implements Comparator<C2733Tr> {
    C2555Nr(C2525Mr mr) {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        C2733Tr tr = (C2733Tr) obj;
        C2733Tr tr2 = (C2733Tr) obj2;
        int i = tr.f8362c - tr2.f8362c;
        return i != 0 ? i : (int) (tr.f8360a - tr2.f8360a);
    }
}
