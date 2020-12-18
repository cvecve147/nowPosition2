package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Mr */
public final class C2525Mr {

    /* renamed from: a */
    private final int f7616a;

    /* renamed from: b */
    private final int f7617b;

    /* renamed from: c */
    private final int f7618c;

    /* renamed from: d */
    private final C2497Lr f7619d = new C2646Qr();

    public C2525Mr(int i) {
        this.f7617b = i;
        this.f7616a = 6;
        this.f7618c = 0;
    }

    /* renamed from: a */
    private final String m10623a(String str) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return "";
        }
        C2587Or or = new C2587Or();
        PriorityQueue priorityQueue = new PriorityQueue(this.f7617b, new C2555Nr(this));
        for (String a : split) {
            String[] a2 = C2618Pr.m10932a(a, false);
            if (a2.length != 0) {
                C2704Sr.m11210a(a2, this.f7617b, this.f7616a, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                or.mo8647a(this.f7619d.mo8513a(((C2733Tr) it.next()).f8361b));
            } catch (IOException e) {
                C2227Cf.m9533b("Error while writing hash to byteStream", e);
            }
        }
        return or.toString();
    }

    /* renamed from: a */
    public final String mo8557a(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            String str = arrayList.get(i);
            i++;
            sb.append(str.toLowerCase(Locale.US));
            sb.append(10);
        }
        return m10623a(sb.toString());
    }
}
