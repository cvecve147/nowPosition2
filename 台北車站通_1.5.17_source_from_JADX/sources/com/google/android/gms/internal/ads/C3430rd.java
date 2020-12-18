package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import com.google.android.gms.common.util.C2092n;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@TargetApi(21)
@C2478La
/* renamed from: com.google.android.gms.internal.ads.rd */
final class C3430rd {

    /* renamed from: a */
    private static final Map<String, String> f10106a;

    /* renamed from: b */
    private final Context f10107b;

    /* renamed from: c */
    private final List<String> f10108c;

    /* renamed from: d */
    private final C3056ed f10109d;

    static {
        HashMap hashMap = new HashMap();
        if (C2092n.m9168i()) {
            hashMap.put("android.webkit.resource.AUDIO_CAPTURE", "android.permission.RECORD_AUDIO");
            hashMap.put("android.webkit.resource.VIDEO_CAPTURE", "android.permission.CAMERA");
        }
        f10106a = hashMap;
    }

    C3430rd(Context context, List<String> list, C3056ed edVar) {
        this.f10107b = context;
        this.f10108c = list;
        this.f10109d = edVar;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        r5 = true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> mo9964a(java.lang.String[] r11) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r11.length
            r2 = 0
            r3 = r2
        L_0x0008:
            if (r3 >= r1) goto L_0x0078
            r4 = r11[r3]
            java.util.List<java.lang.String> r5 = r10.f10108c
            java.util.Iterator r5 = r5.iterator()
        L_0x0012:
            boolean r6 = r5.hasNext()
            r7 = 1
            if (r6 == 0) goto L_0x0044
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r8 = r6.equals(r4)
            if (r8 == 0) goto L_0x0027
        L_0x0025:
            r5 = r7
            goto L_0x0045
        L_0x0027:
            java.lang.String r8 = "android.webkit.resource."
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r9 = r6.length()
            if (r9 == 0) goto L_0x0038
            java.lang.String r6 = r8.concat(r6)
            goto L_0x003d
        L_0x0038:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r8)
        L_0x003d:
            boolean r6 = r6.equals(r4)
            if (r6 == 0) goto L_0x0012
            goto L_0x0025
        L_0x0044:
            r5 = r2
        L_0x0045:
            if (r5 == 0) goto L_0x0070
            java.util.Map<java.lang.String, java.lang.String> r5 = f10106a
            boolean r5 = r5.containsKey(r4)
            if (r5 == 0) goto L_0x0064
            com.google.android.gms.ads.internal.C1697X.m7698e()
            android.content.Context r5 = r10.f10107b
            java.util.Map<java.lang.String, java.lang.String> r6 = f10106a
            java.lang.Object r6 = r6.get(r4)
            java.lang.String r6 = (java.lang.String) r6
            boolean r5 = com.google.android.gms.internal.ads.C3114ge.m12418a((android.content.Context) r5, (java.lang.String) r6)
            if (r5 == 0) goto L_0x0063
            goto L_0x0064
        L_0x0063:
            r7 = r2
        L_0x0064:
            if (r7 == 0) goto L_0x006a
            r0.add(r4)
            goto L_0x0075
        L_0x006a:
            com.google.android.gms.internal.ads.ed r5 = r10.f10109d
            r5.mo9377c(r4)
            goto L_0x0075
        L_0x0070:
            com.google.android.gms.internal.ads.ed r5 = r10.f10109d
            r5.mo9376b((java.lang.String) r4)
        L_0x0075:
            int r3 = r3 + 1
            goto L_0x0008
        L_0x0078:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3430rd.mo9964a(java.lang.String[]):java.util.List");
    }
}
