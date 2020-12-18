package com.google.android.gms.internal.ads;

import java.util.PriorityQueue;
import org.apache.http.message.TokenParser;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Sr */
public final class C2704Sr {
    /* renamed from: a */
    private static long m11207a(long j, int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return j;
        }
        return (i % 2 == 0 ? m11207a((j * j) % 1073807359, i / 2) : j * (m11207a((j * j) % 1073807359, i / 2) % 1073807359)) % 1073807359;
    }

    /* renamed from: a */
    private static String m11208a(String[] strArr, int i, int i2) {
        int i3 = i2 + i;
        if (strArr.length < i3) {
            C2227Cf.m9529a("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i4 = i3 - 1;
            if (i < i4) {
                sb.append(strArr[i]);
                sb.append(TokenParser.f19315SP);
                i++;
            } else {
                sb.append(strArr[i4]);
                return sb.toString();
            }
        }
    }

    /* renamed from: a */
    private static void m11209a(int i, long j, String str, int i2, PriorityQueue<C2733Tr> priorityQueue) {
        C2733Tr tr = new C2733Tr(j, str, i2);
        if ((priorityQueue.size() != i || (priorityQueue.peek().f8362c <= tr.f8362c && priorityQueue.peek().f8360a <= tr.f8360a)) && !priorityQueue.contains(tr)) {
            priorityQueue.add(tr);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    /* renamed from: a */
    public static void m11210a(String[] strArr, int i, int i2, PriorityQueue<C2733Tr> priorityQueue) {
        String[] strArr2 = strArr;
        int i3 = i2;
        if (strArr2.length < i3) {
            m11209a(i, m11211b(strArr2, 0, strArr2.length), m11208a(strArr2, 0, strArr2.length), strArr2.length, priorityQueue);
            return;
        }
        long b = m11211b(strArr2, 0, i3);
        m11209a(i, b, m11208a(strArr2, 0, i3), i2, priorityQueue);
        long a = m11207a(16785407, i3 - 1);
        for (int i4 = 1; i4 < (strArr2.length - i3) + 1; i4++) {
            b = ((((((b + 1073807359) - ((((((long) C2618Pr.m10931a(strArr2[i4 - 1])) + 2147483647L) % 1073807359) * a) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((((long) C2618Pr.m10931a(strArr2[(i4 + i3) - 1])) + 2147483647L) % 1073807359)) % 1073807359;
            m11209a(i, b, m11208a(strArr2, i4, i3), strArr2.length, priorityQueue);
        }
    }

    /* renamed from: b */
    private static long m11211b(String[] strArr, int i, int i2) {
        long a = (((long) C2618Pr.m10931a(strArr[0])) + 2147483647L) % 1073807359;
        for (int i3 = 1; i3 < i2; i3++) {
            a = (((a * 16785407) % 1073807359) + ((((long) C2618Pr.m10931a(strArr[i3])) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return a;
    }
}
