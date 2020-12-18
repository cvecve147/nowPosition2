package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.C1697X;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Oa */
public final class C2565Oa extends C2717Td implements C2939ab {

    /* renamed from: d */
    private final C2536Na f8017d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C3196jb f8018e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Object f8019f = new Object();

    /* renamed from: g */
    private final Context f8020g;

    /* renamed from: h */
    private final C3275ls f8021h;

    /* renamed from: i */
    private final C3389ps f8022i;

    /* renamed from: j */
    private zzaef f8023j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Runnable f8024k;

    /* renamed from: l */
    C3660ze f8025l;

    /* renamed from: m */
    private zzaej f8026m;

    /* renamed from: n */
    private C3596wz f8027n;

    public C2565Oa(Context context, C3196jb jbVar, C2536Na na, C3389ps psVar) {
        C3275ls lsVar;
        C3303ms msVar;
        this.f8017d = na;
        this.f8020g = context;
        this.f8018e = jbVar;
        this.f8022i = psVar;
        this.f8021h = new C3275ls(this.f8022i);
        this.f8021h.mo9685a((C3303ms) new C2597Pa(this));
        C2526Ms ms = new C2526Ms();
        ms.f7620c = Integer.valueOf(this.f8018e.f9582j.f10856b);
        ms.f7621d = Integer.valueOf(this.f8018e.f9582j.f10857c);
        ms.f7622e = Integer.valueOf(this.f8018e.f9582j.f10858d ? 0 : 2);
        this.f8021h.mo9685a((C3303ms) new C2628Qa(ms));
        if (this.f8018e.f9578f != null) {
            this.f8021h.mo9685a((C3303ms) new C2655Ra(this));
        }
        zzjn zzjn = this.f8018e.f9575c;
        if (zzjn.f10896d && "interstitial_mb".equals(zzjn.f10893a)) {
            lsVar = this.f8021h;
            msVar = C2686Sa.f8230a;
        } else if (zzjn.f10896d && "reward_mb".equals(zzjn.f10893a)) {
            lsVar = this.f8021h;
            msVar = C2714Ta.f8330a;
        } else if (zzjn.f10900h || zzjn.f10896d) {
            lsVar = this.f8021h;
            msVar = C2770Va.f8429a;
        } else {
            lsVar = this.f8021h;
            msVar = C2743Ua.f8372a;
        }
        lsVar.mo9685a(msVar);
        this.f8021h.mo9686a(C3332ns.AD_REQUEST);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.f10744V;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.zzjn m10781a(com.google.android.gms.internal.ads.zzaef r12) {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.zzaef r0 = r11.f8023j
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0012
            java.util.List<java.lang.Integer> r0 = r0.f10744V
            if (r0 == 0) goto L_0x0012
            int r0 = r0.size()
            if (r0 <= r1) goto L_0x0012
            r0 = r1
            goto L_0x0013
        L_0x0012:
            r0 = r2
        L_0x0013:
            if (r0 == 0) goto L_0x001f
            com.google.android.gms.internal.ads.wz r0 = r11.f8027n
            if (r0 == 0) goto L_0x001f
            boolean r0 = r0.f10498t
            if (r0 != 0) goto L_0x001f
            r12 = 0
            return r12
        L_0x001f:
            com.google.android.gms.internal.ads.zzaej r0 = r11.f8026m
            boolean r0 = r0.f10779B
            if (r0 == 0) goto L_0x0040
            com.google.android.gms.internal.ads.zzjn r0 = r12.f10755d
            com.google.android.gms.internal.ads.zzjn[] r0 = r0.f10899g
            int r3 = r0.length
            r4 = r2
        L_0x002b:
            if (r4 >= r3) goto L_0x0040
            r5 = r0[r4]
            boolean r6 = r5.f10901i
            if (r6 == 0) goto L_0x003d
            com.google.android.gms.internal.ads.zzjn r0 = new com.google.android.gms.internal.ads.zzjn
            com.google.android.gms.internal.ads.zzjn r12 = r12.f10755d
            com.google.android.gms.internal.ads.zzjn[] r12 = r12.f10899g
            r0.<init>((com.google.android.gms.internal.ads.zzjn) r5, (com.google.android.gms.internal.ads.zzjn[]) r12)
            return r0
        L_0x003d:
            int r4 = r4 + 1
            goto L_0x002b
        L_0x0040:
            com.google.android.gms.internal.ads.zzaej r0 = r11.f8026m
            java.lang.String r0 = r0.f10815n
            if (r0 == 0) goto L_0x00fe
            java.lang.String r3 = "x"
            java.lang.String[] r0 = r0.split(r3)
            int r3 = r0.length
            r4 = 2
            if (r3 == r4) goto L_0x0071
            com.google.android.gms.internal.ads.Ya r12 = new com.google.android.gms.internal.ads.Ya
            java.lang.String r0 = "Invalid ad size format from the ad response: "
            com.google.android.gms.internal.ads.zzaej r1 = r11.f8026m
            java.lang.String r1 = r1.f10815n
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r3 = r1.length()
            if (r3 == 0) goto L_0x0067
            java.lang.String r0 = r0.concat(r1)
            goto L_0x006d
        L_0x0067:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r0 = r1
        L_0x006d:
            r12.<init>(r0, r2)
            throw r12
        L_0x0071:
            r3 = r0[r2]     // Catch:{ NumberFormatException -> 0x00dd }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x00dd }
            r0 = r0[r1]     // Catch:{ NumberFormatException -> 0x00dd }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x00dd }
            com.google.android.gms.internal.ads.zzjn r1 = r12.f10755d
            com.google.android.gms.internal.ads.zzjn[] r1 = r1.f10899g
            int r4 = r1.length
            r5 = r2
        L_0x0083:
            if (r5 >= r4) goto L_0x00bc
            r6 = r1[r5]
            android.content.Context r7 = r11.f8020g
            android.content.res.Resources r7 = r7.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            int r8 = r6.f10897e
            r9 = -1
            if (r8 != r9) goto L_0x009d
            int r8 = r6.f10898f
            float r8 = (float) r8
            float r8 = r8 / r7
            int r8 = (int) r8
        L_0x009d:
            int r9 = r6.f10894b
            r10 = -2
            if (r9 != r10) goto L_0x00a7
            int r9 = r6.f10895c
            float r9 = (float) r9
            float r9 = r9 / r7
            int r9 = (int) r9
        L_0x00a7:
            if (r3 != r8) goto L_0x00b9
            if (r0 != r9) goto L_0x00b9
            boolean r7 = r6.f10901i
            if (r7 != 0) goto L_0x00b9
            com.google.android.gms.internal.ads.zzjn r0 = new com.google.android.gms.internal.ads.zzjn
            com.google.android.gms.internal.ads.zzjn r12 = r12.f10755d
            com.google.android.gms.internal.ads.zzjn[] r12 = r12.f10899g
            r0.<init>((com.google.android.gms.internal.ads.zzjn) r6, (com.google.android.gms.internal.ads.zzjn[]) r12)
            return r0
        L_0x00b9:
            int r5 = r5 + 1
            goto L_0x0083
        L_0x00bc:
            com.google.android.gms.internal.ads.Ya r12 = new com.google.android.gms.internal.ads.Ya
            java.lang.String r0 = "The ad size from the ad response was not one of the requested sizes: "
            com.google.android.gms.internal.ads.zzaej r1 = r11.f8026m
            java.lang.String r1 = r1.f10815n
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r3 = r1.length()
            if (r3 == 0) goto L_0x00d3
            java.lang.String r0 = r0.concat(r1)
            goto L_0x00d9
        L_0x00d3:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r0 = r1
        L_0x00d9:
            r12.<init>(r0, r2)
            throw r12
        L_0x00dd:
            com.google.android.gms.internal.ads.Ya r12 = new com.google.android.gms.internal.ads.Ya
            java.lang.String r0 = "Invalid ad size number from the ad response: "
            com.google.android.gms.internal.ads.zzaej r1 = r11.f8026m
            java.lang.String r1 = r1.f10815n
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r3 = r1.length()
            if (r3 == 0) goto L_0x00f4
            java.lang.String r0 = r0.concat(r1)
            goto L_0x00fa
        L_0x00f4:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r0 = r1
        L_0x00fa:
            r12.<init>(r0, r2)
            throw r12
        L_0x00fe:
            com.google.android.gms.internal.ads.Ya r12 = new com.google.android.gms.internal.ads.Ya
            java.lang.String r0 = "The ad response must specify one of the supported ad sizes."
            r12.<init>(r0, r2)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2565Oa.m10781a(com.google.android.gms.internal.ads.zzaef):com.google.android.gms.internal.ads.zzjn");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m10783a(int i, String str) {
        int i2 = i;
        if (i2 == 3 || i2 == -1) {
            C2227Cf.m9534c(str);
        } else {
            C2227Cf.m9536d(str);
        }
        zzaej zzaej = this.f8026m;
        if (zzaej == null) {
            this.f8026m = new zzaej(i2);
        } else {
            this.f8026m = new zzaej(i2, zzaej.f10813l);
        }
        zzaef zzaef = this.f8023j;
        if (zzaef == null) {
            zzaef = new zzaef(this.f8018e, -1, (String) null, (String) null, (String) null);
        }
        zzaej zzaej2 = this.f8026m;
        this.f8017d.mo6860a(new C2282Ed(zzaef, zzaej2, this.f8027n, (zzjn) null, i, -1, zzaej2.f10816o, (JSONObject) null, this.f8021h, (Boolean) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C3660ze mo8602a(zzang zzang, C3172ig<zzaef> igVar) {
        Context context = this.f8020g;
        if (new C2908_a(context).mo9133a(zzang)) {
            C2227Cf.m9532b("Fetching ad response from local ad request service.");
            C3111gb gbVar = new C3111gb(context, igVar, this);
            gbVar.mo8107a();
            return gbVar;
        }
        C2227Cf.m9532b("Fetching ad response from remote ad request service.");
        C3390pt.m13453a();
        if (C3432rf.m13611c(context)) {
            return new C3139hb(context, zzang, igVar, this);
        }
        C2227Cf.m9536d("Failed to connect to remote ad request service.");
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo8603a(C2212Bs bs) {
        bs.f6761i.f10708c = this.f8018e.f9578f.packageName;
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01e9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8604a(com.google.android.gms.internal.ads.zzaej r14) {
        /*
            r13 = this;
            java.lang.String r0 = "Received ad response."
            com.google.android.gms.internal.ads.C2227Cf.m9532b(r0)
            r13.f8026m = r14
            com.google.android.gms.common.util.e r14 = com.google.android.gms.ads.internal.C1697X.m7705l()
            long r6 = r14.mo7726b()
            java.lang.Object r14 = r13.f8019f
            monitor-enter(r14)
            r0 = 0
            r13.f8025l = r0     // Catch:{ all -> 0x0215 }
            monitor-exit(r14)     // Catch:{ all -> 0x0215 }
            com.google.android.gms.internal.ads.Id r14 = com.google.android.gms.ads.internal.C1697X.m7702i()
            com.google.android.gms.internal.ads._d r14 = r14.mo8333m()
            com.google.android.gms.internal.ads.zzaej r1 = r13.f8026m
            boolean r1 = r1.f10786I
            r14.mo9151d((boolean) r1)
            com.google.android.gms.internal.ads.Du<java.lang.Boolean> r14 = com.google.android.gms.internal.ads.C2558Nu.f7997xb
            com.google.android.gms.internal.ads.Lu r1 = com.google.android.gms.internal.ads.C3390pt.m13458f()
            java.lang.Object r14 = r1.mo8515a(r14)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x005c
            com.google.android.gms.internal.ads.zzaej r14 = r13.f8026m
            boolean r14 = r14.f10794Q
            if (r14 == 0) goto L_0x004d
            com.google.android.gms.internal.ads.Id r14 = com.google.android.gms.ads.internal.C1697X.m7702i()
            com.google.android.gms.internal.ads._d r14 = r14.mo8333m()
            com.google.android.gms.internal.ads.zzaef r1 = r13.f8023j
            java.lang.String r1 = r1.f10756e
            r14.mo9148c((java.lang.String) r1)
            goto L_0x005c
        L_0x004d:
            com.google.android.gms.internal.ads.Id r14 = com.google.android.gms.ads.internal.C1697X.m7702i()
            com.google.android.gms.internal.ads._d r14 = r14.mo8333m()
            com.google.android.gms.internal.ads.zzaef r1 = r13.f8023j
            java.lang.String r1 = r1.f10756e
            r14.mo9150d((java.lang.String) r1)
        L_0x005c:
            com.google.android.gms.internal.ads.zzaej r14 = r13.f8026m     // Catch:{ Ya -> 0x0208 }
            int r14 = r14.f10807f     // Catch:{ Ya -> 0x0208 }
            r1 = -2
            r2 = -3
            if (r14 == r1) goto L_0x008c
            com.google.android.gms.internal.ads.zzaej r14 = r13.f8026m     // Catch:{ Ya -> 0x0208 }
            int r14 = r14.f10807f     // Catch:{ Ya -> 0x0208 }
            if (r14 != r2) goto L_0x006b
            goto L_0x008c
        L_0x006b:
            com.google.android.gms.internal.ads.Ya r14 = new com.google.android.gms.internal.ads.Ya     // Catch:{ Ya -> 0x0208 }
            com.google.android.gms.internal.ads.zzaej r0 = r13.f8026m     // Catch:{ Ya -> 0x0208 }
            int r0 = r0.f10807f     // Catch:{ Ya -> 0x0208 }
            r1 = 66
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Ya -> 0x0208 }
            r2.<init>(r1)     // Catch:{ Ya -> 0x0208 }
            java.lang.String r1 = "There was a problem getting an ad response. ErrorCode: "
            r2.append(r1)     // Catch:{ Ya -> 0x0208 }
            r2.append(r0)     // Catch:{ Ya -> 0x0208 }
            java.lang.String r0 = r2.toString()     // Catch:{ Ya -> 0x0208 }
            com.google.android.gms.internal.ads.zzaej r1 = r13.f8026m     // Catch:{ Ya -> 0x0208 }
            int r1 = r1.f10807f     // Catch:{ Ya -> 0x0208 }
            r14.<init>(r0, r1)     // Catch:{ Ya -> 0x0208 }
            throw r14     // Catch:{ Ya -> 0x0208 }
        L_0x008c:
            com.google.android.gms.internal.ads.zzaej r14 = r13.f8026m     // Catch:{ Ya -> 0x0208 }
            int r14 = r14.f10807f     // Catch:{ Ya -> 0x0208 }
            r1 = 0
            if (r14 == r2) goto L_0x013b
            com.google.android.gms.internal.ads.zzaej r14 = r13.f8026m     // Catch:{ Ya -> 0x0208 }
            java.lang.String r14 = r14.f10805d     // Catch:{ Ya -> 0x0208 }
            boolean r14 = android.text.TextUtils.isEmpty(r14)     // Catch:{ Ya -> 0x0208 }
            if (r14 != 0) goto L_0x0132
            com.google.android.gms.internal.ads.Id r14 = com.google.android.gms.ads.internal.C1697X.m7702i()     // Catch:{ Ya -> 0x0208 }
            com.google.android.gms.internal.ads._d r14 = r14.mo8333m()     // Catch:{ Ya -> 0x0208 }
            com.google.android.gms.internal.ads.zzaej r2 = r13.f8026m     // Catch:{ Ya -> 0x0208 }
            boolean r2 = r2.f10823v     // Catch:{ Ya -> 0x0208 }
            r14.mo9140a((boolean) r2)     // Catch:{ Ya -> 0x0208 }
            com.google.android.gms.internal.ads.zzaej r14 = r13.f8026m     // Catch:{ Ya -> 0x0208 }
            boolean r14 = r14.f10810i     // Catch:{ Ya -> 0x0208 }
            if (r14 == 0) goto L_0x00f0
            com.google.android.gms.internal.ads.wz r14 = new com.google.android.gms.internal.ads.wz     // Catch:{ JSONException -> 0x00c9 }
            com.google.android.gms.internal.ads.zzaej r2 = r13.f8026m     // Catch:{ JSONException -> 0x00c9 }
            java.lang.String r2 = r2.f10805d     // Catch:{ JSONException -> 0x00c9 }
            r14.<init>((java.lang.String) r2)     // Catch:{ JSONException -> 0x00c9 }
            r13.f8027n = r14     // Catch:{ JSONException -> 0x00c9 }
            com.google.android.gms.internal.ads.Id r14 = com.google.android.gms.ads.internal.C1697X.m7702i()     // Catch:{ JSONException -> 0x00c9 }
            com.google.android.gms.internal.ads.wz r2 = r13.f8027n     // Catch:{ JSONException -> 0x00c9 }
            boolean r2 = r2.f10486h     // Catch:{ JSONException -> 0x00c9 }
            r14.mo8320a((boolean) r2)     // Catch:{ JSONException -> 0x00c9 }
            goto L_0x00fb
        L_0x00c9:
            r14 = move-exception
            java.lang.String r0 = "Could not parse mediation config."
            com.google.android.gms.internal.ads.C2227Cf.m9533b(r0, r14)     // Catch:{ Ya -> 0x0208 }
            com.google.android.gms.internal.ads.Ya r14 = new com.google.android.gms.internal.ads.Ya     // Catch:{ Ya -> 0x0208 }
            java.lang.String r0 = "Could not parse mediation config: "
            com.google.android.gms.internal.ads.zzaej r2 = r13.f8026m     // Catch:{ Ya -> 0x0208 }
            java.lang.String r2 = r2.f10805d     // Catch:{ Ya -> 0x0208 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Ya -> 0x0208 }
            int r3 = r2.length()     // Catch:{ Ya -> 0x0208 }
            if (r3 == 0) goto L_0x00e6
            java.lang.String r0 = r0.concat(r2)     // Catch:{ Ya -> 0x0208 }
            goto L_0x00ec
        L_0x00e6:
            java.lang.String r2 = new java.lang.String     // Catch:{ Ya -> 0x0208 }
            r2.<init>(r0)     // Catch:{ Ya -> 0x0208 }
            r0 = r2
        L_0x00ec:
            r14.<init>(r0, r1)     // Catch:{ Ya -> 0x0208 }
            throw r14     // Catch:{ Ya -> 0x0208 }
        L_0x00f0:
            com.google.android.gms.internal.ads.Id r14 = com.google.android.gms.ads.internal.C1697X.m7702i()     // Catch:{ Ya -> 0x0208 }
            com.google.android.gms.internal.ads.zzaej r2 = r13.f8026m     // Catch:{ Ya -> 0x0208 }
            boolean r2 = r2.f10789L     // Catch:{ Ya -> 0x0208 }
            r14.mo8320a((boolean) r2)     // Catch:{ Ya -> 0x0208 }
        L_0x00fb:
            com.google.android.gms.internal.ads.zzaej r14 = r13.f8026m     // Catch:{ Ya -> 0x0208 }
            java.lang.String r14 = r14.f10787J     // Catch:{ Ya -> 0x0208 }
            boolean r14 = android.text.TextUtils.isEmpty(r14)     // Catch:{ Ya -> 0x0208 }
            if (r14 != 0) goto L_0x013b
            com.google.android.gms.internal.ads.Du<java.lang.Boolean> r14 = com.google.android.gms.internal.ads.C2558Nu.f7744Gd     // Catch:{ Ya -> 0x0208 }
            com.google.android.gms.internal.ads.Lu r2 = com.google.android.gms.internal.ads.C3390pt.m13458f()     // Catch:{ Ya -> 0x0208 }
            java.lang.Object r14 = r2.mo8515a(r14)     // Catch:{ Ya -> 0x0208 }
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch:{ Ya -> 0x0208 }
            boolean r14 = r14.booleanValue()     // Catch:{ Ya -> 0x0208 }
            if (r14 == 0) goto L_0x013b
            java.lang.String r14 = "Received cookie from server. Setting webview cookie in CookieManager."
            com.google.android.gms.internal.ads.C2227Cf.m9532b(r14)     // Catch:{ Ya -> 0x0208 }
            com.google.android.gms.internal.ads.me r14 = com.google.android.gms.ads.internal.C1697X.m7700g()     // Catch:{ Ya -> 0x0208 }
            android.content.Context r2 = r13.f8020g     // Catch:{ Ya -> 0x0208 }
            android.webkit.CookieManager r14 = r14.mo9729c((android.content.Context) r2)     // Catch:{ Ya -> 0x0208 }
            if (r14 == 0) goto L_0x013b
            java.lang.String r2 = "googleads.g.doubleclick.net"
            com.google.android.gms.internal.ads.zzaej r3 = r13.f8026m     // Catch:{ Ya -> 0x0208 }
            java.lang.String r3 = r3.f10787J     // Catch:{ Ya -> 0x0208 }
            r14.setCookie(r2, r3)     // Catch:{ Ya -> 0x0208 }
            goto L_0x013b
        L_0x0132:
            com.google.android.gms.internal.ads.Ya r14 = new com.google.android.gms.internal.ads.Ya     // Catch:{ Ya -> 0x0208 }
            java.lang.String r0 = "No fill from ad server."
            r1 = 3
            r14.<init>(r0, r1)     // Catch:{ Ya -> 0x0208 }
            throw r14     // Catch:{ Ya -> 0x0208 }
        L_0x013b:
            com.google.android.gms.internal.ads.zzaef r14 = r13.f8023j     // Catch:{ Ya -> 0x0208 }
            com.google.android.gms.internal.ads.zzjn r14 = r14.f10755d     // Catch:{ Ya -> 0x0208 }
            com.google.android.gms.internal.ads.zzjn[] r14 = r14.f10899g     // Catch:{ Ya -> 0x0208 }
            if (r14 == 0) goto L_0x014b
            com.google.android.gms.internal.ads.zzaef r14 = r13.f8023j     // Catch:{ Ya -> 0x0208 }
            com.google.android.gms.internal.ads.zzjn r14 = r13.m10781a((com.google.android.gms.internal.ads.zzaef) r14)     // Catch:{ Ya -> 0x0208 }
            r4 = r14
            goto L_0x014c
        L_0x014b:
            r4 = r0
        L_0x014c:
            com.google.android.gms.internal.ads.Id r14 = com.google.android.gms.ads.internal.C1697X.m7702i()
            com.google.android.gms.internal.ads._d r14 = r14.mo8333m()
            com.google.android.gms.internal.ads.zzaej r2 = r13.f8026m
            boolean r2 = r2.f10824w
            r14.mo9145b((boolean) r2)
            com.google.android.gms.internal.ads.Id r14 = com.google.android.gms.ads.internal.C1697X.m7702i()
            com.google.android.gms.internal.ads._d r14 = r14.mo8333m()
            com.google.android.gms.internal.ads.zzaej r2 = r13.f8026m
            boolean r2 = r2.f10793P
            r14.mo9149c((boolean) r2)
            com.google.android.gms.internal.ads.zzaej r14 = r13.f8026m
            java.lang.String r14 = r14.f10820s
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 != 0) goto L_0x0185
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ Exception -> 0x017f }
            com.google.android.gms.internal.ads.zzaej r2 = r13.f8026m     // Catch:{ Exception -> 0x017f }
            java.lang.String r2 = r2.f10820s     // Catch:{ Exception -> 0x017f }
            r14.<init>(r2)     // Catch:{ Exception -> 0x017f }
            r10 = r14
            goto L_0x0186
        L_0x017f:
            r14 = move-exception
            java.lang.String r2 = "Error parsing the JSON for Active View."
            com.google.android.gms.internal.ads.C2227Cf.m9533b(r2, r14)
        L_0x0185:
            r10 = r0
        L_0x0186:
            com.google.android.gms.internal.ads.zzaej r14 = r13.f8026m
            int r14 = r14.f10797T
            r2 = 2
            r3 = 1
            if (r14 != r2) goto L_0x01cb
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            com.google.android.gms.internal.ads.zzaef r14 = r13.f8023j
            com.google.android.gms.internal.ads.zzjj r14 = r14.f10753c
            android.os.Bundle r14 = r14.f10887m
            if (r14 == 0) goto L_0x019b
            goto L_0x01a0
        L_0x019b:
            android.os.Bundle r14 = new android.os.Bundle
            r14.<init>()
        L_0x01a0:
            java.lang.Class<com.google.ads.mediation.admob.AdMobAdapter> r2 = com.google.ads.mediation.admob.AdMobAdapter.class
            java.lang.String r2 = r2.getName()
            android.os.Bundle r2 = r14.getBundle(r2)
            if (r2 == 0) goto L_0x01b7
            java.lang.Class<com.google.ads.mediation.admob.AdMobAdapter> r2 = com.google.ads.mediation.admob.AdMobAdapter.class
            java.lang.String r2 = r2.getName()
            android.os.Bundle r14 = r14.getBundle(r2)
            goto L_0x01c6
        L_0x01b7:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.Class<com.google.ads.mediation.admob.AdMobAdapter> r5 = com.google.ads.mediation.admob.AdMobAdapter.class
            java.lang.String r5 = r5.getName()
            r14.putBundle(r5, r2)
            r14 = r2
        L_0x01c6:
            java.lang.String r2 = "render_test_label"
            r14.putBoolean(r2, r3)
        L_0x01cb:
            com.google.android.gms.internal.ads.zzaej r14 = r13.f8026m
            int r14 = r14.f10797T
            if (r14 != r3) goto L_0x01d5
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
        L_0x01d5:
            com.google.android.gms.internal.ads.zzaej r14 = r13.f8026m
            int r14 = r14.f10797T
            if (r14 != 0) goto L_0x01e9
            com.google.android.gms.internal.ads.zzaef r14 = r13.f8023j
            com.google.android.gms.internal.ads.zzjj r14 = r14.f10753c
            boolean r14 = com.google.android.gms.internal.ads.C3200jf.m12710a(r14)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            r12 = r14
            goto L_0x01ea
        L_0x01e9:
            r12 = r0
        L_0x01ea:
            com.google.android.gms.internal.ads.Ed r14 = new com.google.android.gms.internal.ads.Ed
            com.google.android.gms.internal.ads.zzaef r1 = r13.f8023j
            com.google.android.gms.internal.ads.zzaej r2 = r13.f8026m
            com.google.android.gms.internal.ads.wz r3 = r13.f8027n
            r5 = -2
            long r8 = r2.f10816o
            com.google.android.gms.internal.ads.ls r11 = r13.f8021h
            r0 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r11, r12)
            com.google.android.gms.internal.ads.Na r0 = r13.f8017d
            r0.mo6860a(r14)
        L_0x0200:
            android.os.Handler r14 = com.google.android.gms.internal.ads.C3114ge.f9351a
            java.lang.Runnable r0 = r13.f8024k
            r14.removeCallbacks(r0)
            return
        L_0x0208:
            r14 = move-exception
            int r0 = r14.mo9053a()
            java.lang.String r14 = r14.getMessage()
            r13.m10783a((int) r0, (java.lang.String) r14)
            goto L_0x0200
        L_0x0215:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x0215 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2565Oa.mo8604a(com.google.android.gms.internal.ads.zzaej):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo8605b(C2212Bs bs) {
        bs.f6756d = this.f8018e.f9594v;
    }

    /* renamed from: c */
    public final void mo7015c() {
        synchronized (this.f8019f) {
            if (this.f8025l != null) {
                this.f8025l.cancel();
            }
        }
    }

    /* renamed from: d */
    public final void mo7016d() {
        Bundle bundle;
        String string;
        C2227Cf.m9532b("AdLoaderBackgroundTask started.");
        this.f8024k = new C2799Wa(this);
        C3114ge.f9351a.postDelayed(this.f8024k, ((Long) C3390pt.m13458f().mo8515a(C2558Nu.f7926lc)).longValue());
        long b = C1697X.m7705l().mo7726b();
        if (!((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7908ic)).booleanValue() || (bundle = this.f8018e.f9574b.f10877c) == null || (string = bundle.getString("_ad")) == null) {
            C3291mg mgVar = new C3291mg();
            C3057ee.m12269a((Runnable) new C2826Xa(this, mgVar));
            String k = C1697X.m7689B().mo10049k(this.f8020g);
            String a = C1697X.m7689B().mo10031a(this.f8020g);
            String b2 = C1697X.m7689B().mo10035b(this.f8020g);
            C1697X.m7689B().mo10043f(this.f8020g, b2);
            this.f8023j = new zzaef(this.f8018e, b, k, a, b2);
            mgVar.mo9536a(this.f8023j);
            return;
        }
        this.f8023j = new zzaef(this.f8018e, b, (String) null, (String) null, (String) null);
        mo8604a(C2656Rb.m11026a(this.f8020g, this.f8023j, string));
    }
}
