package com.facebook.p060a;

import com.facebook.internal.C1430A;
import java.util.HashSet;

/* renamed from: com.facebook.a.p */
class C1405p implements Runnable {
    C1405p() {
    }

    public void run() {
        HashSet<String> hashSet = new HashSet<>();
        for (C1387b b : C1402n.m6703e()) {
            hashSet.add(b.mo6046b());
        }
        for (String a : hashSet) {
            C1430A.m6774a(a, true);
        }
    }
}
