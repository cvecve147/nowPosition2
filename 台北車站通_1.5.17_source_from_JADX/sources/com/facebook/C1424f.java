package com.facebook;

import com.facebook.AccessToken;
import com.facebook.C1343G;
import com.facebook.C1425g;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.f */
class C1424f implements C1343G.C1344a {

    /* renamed from: a */
    final /* synthetic */ AccessToken f4985a;

    /* renamed from: b */
    final /* synthetic */ AccessToken.C1335a f4986b;

    /* renamed from: c */
    final /* synthetic */ AtomicBoolean f4987c;

    /* renamed from: d */
    final /* synthetic */ C1425g.C1426a f4988d;

    /* renamed from: e */
    final /* synthetic */ Set f4989e;

    /* renamed from: f */
    final /* synthetic */ Set f4990f;

    /* renamed from: g */
    final /* synthetic */ C1425g f4991g;

    C1424f(C1425g gVar, AccessToken accessToken, AccessToken.C1335a aVar, AtomicBoolean atomicBoolean, C1425g.C1426a aVar2, Set set, Set set2) {
        this.f4991g = gVar;
        this.f4985a = accessToken;
        this.f4986b = aVar;
        this.f4987c = atomicBoolean;
        this.f4988d = aVar2;
        this.f4989e = set;
        this.f4990f = set2;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x0052=Splitter:B:18:0x0052, B:43:0x00dd=Splitter:B:43:0x00dd} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5948a(com.facebook.C1343G r15) {
        /*
            r14 = this;
            r15 = 0
            r0 = 0
            com.facebook.g r1 = com.facebook.C1425g.m6764c()     // Catch:{ all -> 0x00f9 }
            com.facebook.AccessToken r1 = r1.mo6095b()     // Catch:{ all -> 0x00f9 }
            if (r1 == 0) goto L_0x00dd
            com.facebook.g r1 = com.facebook.C1425g.m6764c()     // Catch:{ all -> 0x00f9 }
            com.facebook.AccessToken r1 = r1.mo6095b()     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = r1.mo5896i()     // Catch:{ all -> 0x00f9 }
            com.facebook.AccessToken r2 = r14.f4985a     // Catch:{ all -> 0x00f9 }
            java.lang.String r2 = r2.mo5896i()     // Catch:{ all -> 0x00f9 }
            if (r1 == r2) goto L_0x0022
            goto L_0x00dd
        L_0x0022:
            java.util.concurrent.atomic.AtomicBoolean r1 = r14.f4987c     // Catch:{ all -> 0x00f9 }
            boolean r1 = r1.get()     // Catch:{ all -> 0x00f9 }
            if (r1 != 0) goto L_0x0052
            com.facebook.g$a r1 = r14.f4988d     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = r1.f4998a     // Catch:{ all -> 0x00f9 }
            if (r1 != 0) goto L_0x0052
            com.facebook.g$a r1 = r14.f4988d     // Catch:{ all -> 0x00f9 }
            int r1 = r1.f4999b     // Catch:{ all -> 0x00f9 }
            if (r1 != 0) goto L_0x0052
            com.facebook.AccessToken$a r1 = r14.f4986b     // Catch:{ all -> 0x00f9 }
            if (r1 == 0) goto L_0x0046
            com.facebook.AccessToken$a r1 = r14.f4986b     // Catch:{ all -> 0x00f9 }
            com.facebook.p r2 = new com.facebook.p     // Catch:{ all -> 0x00f9 }
            java.lang.String r3 = "Failed to refresh access token"
            r2.<init>((java.lang.String) r3)     // Catch:{ all -> 0x00f9 }
            r1.mo5901a((com.facebook.C1574p) r2)     // Catch:{ all -> 0x00f9 }
        L_0x0046:
            com.facebook.g r0 = r14.f4991g
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f4996e
            r0.set(r15)
            com.facebook.AccessToken$a r15 = r14.f4986b
            return
        L_0x0052:
            com.facebook.AccessToken r1 = new com.facebook.AccessToken     // Catch:{ all -> 0x00f9 }
            com.facebook.g$a r2 = r14.f4988d     // Catch:{ all -> 0x00f9 }
            java.lang.String r2 = r2.f4998a     // Catch:{ all -> 0x00f9 }
            if (r2 == 0) goto L_0x005f
            com.facebook.g$a r2 = r14.f4988d     // Catch:{ all -> 0x00f9 }
            java.lang.String r2 = r2.f4998a     // Catch:{ all -> 0x00f9 }
            goto L_0x0065
        L_0x005f:
            com.facebook.AccessToken r2 = r14.f4985a     // Catch:{ all -> 0x00f9 }
            java.lang.String r2 = r2.mo5894h()     // Catch:{ all -> 0x00f9 }
        L_0x0065:
            r3 = r2
            com.facebook.AccessToken r2 = r14.f4985a     // Catch:{ all -> 0x00f9 }
            java.lang.String r4 = r2.mo5886a()     // Catch:{ all -> 0x00f9 }
            com.facebook.AccessToken r2 = r14.f4985a     // Catch:{ all -> 0x00f9 }
            java.lang.String r5 = r2.mo5896i()     // Catch:{ all -> 0x00f9 }
            java.util.concurrent.atomic.AtomicBoolean r2 = r14.f4987c     // Catch:{ all -> 0x00f9 }
            boolean r2 = r2.get()     // Catch:{ all -> 0x00f9 }
            if (r2 == 0) goto L_0x007d
            java.util.Set r2 = r14.f4989e     // Catch:{ all -> 0x00f9 }
            goto L_0x0083
        L_0x007d:
            com.facebook.AccessToken r2 = r14.f4985a     // Catch:{ all -> 0x00f9 }
            java.util.Set r2 = r2.mo5892f()     // Catch:{ all -> 0x00f9 }
        L_0x0083:
            r6 = r2
            java.util.concurrent.atomic.AtomicBoolean r2 = r14.f4987c     // Catch:{ all -> 0x00f9 }
            boolean r2 = r2.get()     // Catch:{ all -> 0x00f9 }
            if (r2 == 0) goto L_0x008f
            java.util.Set r2 = r14.f4990f     // Catch:{ all -> 0x00f9 }
            goto L_0x0095
        L_0x008f:
            com.facebook.AccessToken r2 = r14.f4985a     // Catch:{ all -> 0x00f9 }
            java.util.Set r2 = r2.mo5887c()     // Catch:{ all -> 0x00f9 }
        L_0x0095:
            r7 = r2
            com.facebook.AccessToken r2 = r14.f4985a     // Catch:{ all -> 0x00f9 }
            com.facebook.h r8 = r2.mo5893g()     // Catch:{ all -> 0x00f9 }
            com.facebook.g$a r2 = r14.f4988d     // Catch:{ all -> 0x00f9 }
            int r2 = r2.f4999b     // Catch:{ all -> 0x00f9 }
            if (r2 == 0) goto L_0x00b0
            java.util.Date r2 = new java.util.Date     // Catch:{ all -> 0x00f9 }
            com.facebook.g$a r9 = r14.f4988d     // Catch:{ all -> 0x00f9 }
            int r9 = r9.f4999b     // Catch:{ all -> 0x00f9 }
            long r9 = (long) r9     // Catch:{ all -> 0x00f9 }
            r11 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r11
            r2.<init>(r9)     // Catch:{ all -> 0x00f9 }
            goto L_0x00b6
        L_0x00b0:
            com.facebook.AccessToken r2 = r14.f4985a     // Catch:{ all -> 0x00f9 }
            java.util.Date r2 = r2.mo5888d()     // Catch:{ all -> 0x00f9 }
        L_0x00b6:
            r9 = r2
            java.util.Date r10 = new java.util.Date     // Catch:{ all -> 0x00f9 }
            r10.<init>()     // Catch:{ all -> 0x00f9 }
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00f9 }
            com.facebook.g r0 = com.facebook.C1425g.m6764c()     // Catch:{ all -> 0x00d8 }
            r0.mo6094a((com.facebook.AccessToken) r1)     // Catch:{ all -> 0x00d8 }
            com.facebook.g r0 = r14.f4991g
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f4996e
            r0.set(r15)
            com.facebook.AccessToken$a r15 = r14.f4986b
            if (r15 == 0) goto L_0x00d7
            r15.mo5900a((com.facebook.AccessToken) r1)
        L_0x00d7:
            return
        L_0x00d8:
            r0 = move-exception
            r13 = r1
            r1 = r0
            r0 = r13
            goto L_0x00fa
        L_0x00dd:
            com.facebook.AccessToken$a r1 = r14.f4986b     // Catch:{ all -> 0x00f9 }
            if (r1 == 0) goto L_0x00ed
            com.facebook.AccessToken$a r1 = r14.f4986b     // Catch:{ all -> 0x00f9 }
            com.facebook.p r2 = new com.facebook.p     // Catch:{ all -> 0x00f9 }
            java.lang.String r3 = "No current access token to refresh"
            r2.<init>((java.lang.String) r3)     // Catch:{ all -> 0x00f9 }
            r1.mo5901a((com.facebook.C1574p) r2)     // Catch:{ all -> 0x00f9 }
        L_0x00ed:
            com.facebook.g r0 = r14.f4991g
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f4996e
            r0.set(r15)
            com.facebook.AccessToken$a r15 = r14.f4986b
            return
        L_0x00f9:
            r1 = move-exception
        L_0x00fa:
            com.facebook.g r2 = r14.f4991g
            java.util.concurrent.atomic.AtomicBoolean r2 = r2.f4996e
            r2.set(r15)
            com.facebook.AccessToken$a r15 = r14.f4986b
            if (r15 == 0) goto L_0x010c
            if (r0 == 0) goto L_0x010c
            r15.mo5900a((com.facebook.AccessToken) r0)
        L_0x010c:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C1424f.mo5948a(com.facebook.G):void");
    }
}
