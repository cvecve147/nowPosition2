package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.common.util.C2084f;
import java.util.Set;
import org.apache.http.client.config.CookieSpecs;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.d */
public final class C3021d extends C3311n {

    /* renamed from: c */
    private static final Set<String> f9029c = C2084f.m9133b((T[]) new String[]{"top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center"});

    /* renamed from: d */
    private String f9030d = "top-right";

    /* renamed from: e */
    private boolean f9031e = true;

    /* renamed from: f */
    private int f9032f = 0;

    /* renamed from: g */
    private int f9033g = 0;

    /* renamed from: h */
    private int f9034h = -1;

    /* renamed from: i */
    private int f9035i = 0;

    /* renamed from: j */
    private int f9036j = 0;

    /* renamed from: k */
    private int f9037k = -1;

    /* renamed from: l */
    private final Object f9038l = new Object();

    /* renamed from: m */
    private final C3520uh f9039m;

    /* renamed from: n */
    private final Activity f9040n;

    /* renamed from: o */
    private C3146hi f9041o;

    /* renamed from: p */
    private ImageView f9042p;

    /* renamed from: q */
    private LinearLayout f9043q;

    /* renamed from: r */
    private C3340o f9044r;

    /* renamed from: s */
    private PopupWindow f9045s;

    /* renamed from: t */
    private RelativeLayout f9046t;

    /* renamed from: u */
    private ViewGroup f9047u;

    public C3021d(C3520uh uhVar, C3340o oVar) {
        super(uhVar, "resize");
        this.f9039m = uhVar;
        this.f9040n = uhVar.mo8163eb();
        this.f9044r = oVar;
    }

    /* renamed from: b */
    private final void m12128b(int i, int i2) {
        mo9764a(i, i2 - C1697X.m7698e().mo9459c(this.f9040n)[0], this.f9037k, this.f9034h);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f7, code lost:
        if ((r5 + 50) <= r1[1]) goto L_0x00fa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0107 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0109  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int[] m12129b() {
        /*
            r12 = this;
            com.google.android.gms.internal.ads.ge r0 = com.google.android.gms.ads.internal.C1697X.m7698e()
            android.app.Activity r1 = r12.f9040n
            int[] r0 = r0.mo9457b((android.app.Activity) r1)
            com.google.android.gms.internal.ads.ge r1 = com.google.android.gms.ads.internal.C1697X.m7698e()
            android.app.Activity r2 = r12.f9040n
            int[] r1 = r1.mo9459c((android.app.Activity) r2)
            r2 = 0
            r3 = r0[r2]
            r4 = 1
            r0 = r0[r4]
            int r5 = r12.f9037k
            r6 = 2
            r7 = 50
            if (r5 < r7) goto L_0x00ff
            if (r5 <= r3) goto L_0x0025
            goto L_0x00ff
        L_0x0025:
            int r8 = r12.f9034h
            if (r8 < r7) goto L_0x00fc
            if (r8 <= r0) goto L_0x002d
            goto L_0x00fc
        L_0x002d:
            if (r8 != r0) goto L_0x0035
            if (r5 != r3) goto L_0x0035
            java.lang.String r0 = "Cannot resize to a full-screen ad."
            goto L_0x0101
        L_0x0035:
            boolean r0 = r12.f9031e
            if (r0 == 0) goto L_0x00fa
            java.lang.String r0 = r12.f9030d
            r5 = -1
            int r8 = r0.hashCode()
            r9 = 5
            r10 = 4
            r11 = 3
            switch(r8) {
                case -1364013995: goto L_0x0079;
                case -1012429441: goto L_0x006f;
                case -655373719: goto L_0x0065;
                case 1163912186: goto L_0x005b;
                case 1288627767: goto L_0x0051;
                case 1755462605: goto L_0x0047;
                default: goto L_0x0046;
            }
        L_0x0046:
            goto L_0x0082
        L_0x0047:
            java.lang.String r8 = "top-center"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0082
            r5 = r4
            goto L_0x0082
        L_0x0051:
            java.lang.String r8 = "bottom-center"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0082
            r5 = r10
            goto L_0x0082
        L_0x005b:
            java.lang.String r8 = "bottom-right"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0082
            r5 = r9
            goto L_0x0082
        L_0x0065:
            java.lang.String r8 = "bottom-left"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0082
            r5 = r11
            goto L_0x0082
        L_0x006f:
            java.lang.String r8 = "top-left"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0082
            r5 = r2
            goto L_0x0082
        L_0x0079:
            java.lang.String r8 = "center"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0082
            r5 = r6
        L_0x0082:
            if (r5 == 0) goto L_0x00e5
            if (r5 == r4) goto L_0x00d9
            if (r5 == r6) goto L_0x00c2
            if (r5 == r11) goto L_0x00b3
            if (r5 == r10) goto L_0x00a7
            if (r5 == r9) goto L_0x009d
            int r0 = r12.f9032f
            int r5 = r12.f9035i
            int r0 = r0 + r5
            int r5 = r12.f9037k
            int r0 = r0 + r5
            int r0 = r0 - r7
        L_0x0097:
            int r5 = r12.f9033g
            int r8 = r12.f9036j
            int r5 = r5 + r8
            goto L_0x00eb
        L_0x009d:
            int r0 = r12.f9032f
            int r5 = r12.f9035i
            int r0 = r0 + r5
            int r5 = r12.f9037k
            int r0 = r0 + r5
            int r0 = r0 - r7
            goto L_0x00b8
        L_0x00a7:
            int r0 = r12.f9032f
            int r5 = r12.f9035i
            int r0 = r0 + r5
            int r5 = r12.f9037k
            int r5 = r5 / r6
            int r0 = r0 + r5
            int r0 = r0 + -25
            goto L_0x00b8
        L_0x00b3:
            int r0 = r12.f9032f
            int r5 = r12.f9035i
            int r0 = r0 + r5
        L_0x00b8:
            int r5 = r12.f9033g
            int r8 = r12.f9036j
            int r5 = r5 + r8
            int r8 = r12.f9034h
            int r5 = r5 + r8
            int r5 = r5 - r7
            goto L_0x00eb
        L_0x00c2:
            int r0 = r12.f9032f
            int r5 = r12.f9035i
            int r0 = r0 + r5
            int r5 = r12.f9037k
            int r5 = r5 / r6
            int r0 = r0 + r5
            int r0 = r0 + -25
            int r5 = r12.f9033g
            int r8 = r12.f9036j
            int r5 = r5 + r8
            int r8 = r12.f9034h
            int r8 = r8 / r6
            int r5 = r5 + r8
            int r5 = r5 + -25
            goto L_0x00eb
        L_0x00d9:
            int r0 = r12.f9032f
            int r5 = r12.f9035i
            int r0 = r0 + r5
            int r5 = r12.f9037k
            int r5 = r5 / r6
            int r0 = r0 + r5
            int r0 = r0 + -25
            goto L_0x0097
        L_0x00e5:
            int r0 = r12.f9032f
            int r5 = r12.f9035i
            int r0 = r0 + r5
            goto L_0x0097
        L_0x00eb:
            if (r0 < 0) goto L_0x0104
            int r0 = r0 + r7
            if (r0 > r3) goto L_0x0104
            r0 = r1[r2]
            if (r5 < r0) goto L_0x0104
            int r5 = r5 + r7
            r0 = r1[r4]
            if (r5 <= r0) goto L_0x00fa
            goto L_0x0104
        L_0x00fa:
            r0 = r4
            goto L_0x0105
        L_0x00fc:
            java.lang.String r0 = "Height is too small or too large."
            goto L_0x0101
        L_0x00ff:
            java.lang.String r0 = "Width is too small or too large."
        L_0x0101:
            com.google.android.gms.internal.ads.C2227Cf.m9536d(r0)
        L_0x0104:
            r0 = r2
        L_0x0105:
            if (r0 != 0) goto L_0x0109
            r0 = 0
            return r0
        L_0x0109:
            boolean r0 = r12.f9031e
            if (r0 == 0) goto L_0x011e
            int[] r0 = new int[r6]
            int r1 = r12.f9032f
            int r3 = r12.f9035i
            int r1 = r1 + r3
            r0[r2] = r1
            int r1 = r12.f9033g
            int r2 = r12.f9036j
            int r1 = r1 + r2
            r0[r4] = r1
            return r0
        L_0x011e:
            com.google.android.gms.internal.ads.ge r0 = com.google.android.gms.ads.internal.C1697X.m7698e()
            android.app.Activity r1 = r12.f9040n
            int[] r0 = r0.mo9457b((android.app.Activity) r1)
            com.google.android.gms.internal.ads.ge r1 = com.google.android.gms.ads.internal.C1697X.m7698e()
            android.app.Activity r3 = r12.f9040n
            int[] r1 = r1.mo9459c((android.app.Activity) r3)
            r0 = r0[r2]
            int r3 = r12.f9032f
            int r5 = r12.f9035i
            int r3 = r3 + r5
            int r5 = r12.f9033g
            int r7 = r12.f9036j
            int r5 = r5 + r7
            if (r3 >= 0) goto L_0x0142
            r0 = r2
            goto L_0x014b
        L_0x0142:
            int r7 = r12.f9037k
            int r8 = r3 + r7
            if (r8 <= r0) goto L_0x014a
            int r0 = r0 - r7
            goto L_0x014b
        L_0x014a:
            r0 = r3
        L_0x014b:
            r3 = r1[r2]
            if (r5 >= r3) goto L_0x0152
            r5 = r1[r2]
            goto L_0x015e
        L_0x0152:
            int r3 = r12.f9034h
            int r7 = r5 + r3
            r8 = r1[r4]
            if (r7 <= r8) goto L_0x015e
            r1 = r1[r4]
            int r5 = r1 - r3
        L_0x015e:
            int[] r1 = new int[r6]
            r1[r2] = r0
            r1[r4] = r5
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3021d.m12129b():int[]");
    }

    /* renamed from: a */
    public final void mo9300a(int i, int i2) {
        this.f9032f = i;
        this.f9033g = i2;
    }

    /* renamed from: a */
    public final void mo9301a(int i, int i2, boolean z) {
        synchronized (this.f9038l) {
            this.f9032f = i;
            this.f9033g = i2;
            if (this.f9045s != null && z) {
                int[] b = m12129b();
                if (b != null) {
                    PopupWindow popupWindow = this.f9045s;
                    C3390pt.m13453a();
                    int a = C3432rf.m13595a((Context) this.f9040n, b[0]);
                    C3390pt.m13453a();
                    popupWindow.update(a, C3432rf.m13595a((Context) this.f9040n, b[1]), this.f9045s.getWidth(), this.f9045s.getHeight());
                    m12128b(b[0], b[1]);
                } else {
                    mo9303a(true);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:119:0x02b3 A[Catch:{ RuntimeException -> 0x02d4 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9302a(java.util.Map<java.lang.String, java.lang.String> r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            java.lang.Object r2 = r1.f9038l
            monitor-enter(r2)
            android.app.Activity r3 = r1.f9040n     // Catch:{ all -> 0x032a }
            if (r3 != 0) goto L_0x0012
            java.lang.String r0 = "Not an activity context. Cannot resize."
            r1.mo9766a(r0)     // Catch:{ all -> 0x032a }
            monitor-exit(r2)     // Catch:{ all -> 0x032a }
            return
        L_0x0012:
            com.google.android.gms.internal.ads.uh r3 = r1.f9039m     // Catch:{ all -> 0x032a }
            com.google.android.gms.internal.ads.hi r3 = r3.mo8192rb()     // Catch:{ all -> 0x032a }
            if (r3 != 0) goto L_0x0021
            java.lang.String r0 = "Webview is not yet available, size is not set."
            r1.mo9766a(r0)     // Catch:{ all -> 0x032a }
            monitor-exit(r2)     // Catch:{ all -> 0x032a }
            return
        L_0x0021:
            com.google.android.gms.internal.ads.uh r3 = r1.f9039m     // Catch:{ all -> 0x032a }
            com.google.android.gms.internal.ads.hi r3 = r3.mo8192rb()     // Catch:{ all -> 0x032a }
            boolean r3 = r3.mo9497d()     // Catch:{ all -> 0x032a }
            if (r3 == 0) goto L_0x0034
            java.lang.String r0 = "Is interstitial. Cannot resize an interstitial."
            r1.mo9766a(r0)     // Catch:{ all -> 0x032a }
            monitor-exit(r2)     // Catch:{ all -> 0x032a }
            return
        L_0x0034:
            com.google.android.gms.internal.ads.uh r3 = r1.f9039m     // Catch:{ all -> 0x032a }
            boolean r3 = r3.mo8165fb()     // Catch:{ all -> 0x032a }
            if (r3 == 0) goto L_0x0043
            java.lang.String r0 = "Cannot resize an expanded banner."
            r1.mo9766a(r0)     // Catch:{ all -> 0x032a }
            monitor-exit(r2)     // Catch:{ all -> 0x032a }
            return
        L_0x0043:
            java.lang.String r3 = "width"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x032a }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x032a }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x032a }
            if (r3 != 0) goto L_0x0062
            com.google.android.gms.ads.internal.C1697X.m7698e()     // Catch:{ all -> 0x032a }
            java.lang.String r3 = "width"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x032a }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x032a }
            int r3 = com.google.android.gms.internal.ads.C3114ge.m12422b((java.lang.String) r3)     // Catch:{ all -> 0x032a }
            r1.f9037k = r3     // Catch:{ all -> 0x032a }
        L_0x0062:
            java.lang.String r3 = "height"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x032a }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x032a }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x032a }
            if (r3 != 0) goto L_0x0081
            com.google.android.gms.ads.internal.C1697X.m7698e()     // Catch:{ all -> 0x032a }
            java.lang.String r3 = "height"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x032a }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x032a }
            int r3 = com.google.android.gms.internal.ads.C3114ge.m12422b((java.lang.String) r3)     // Catch:{ all -> 0x032a }
            r1.f9034h = r3     // Catch:{ all -> 0x032a }
        L_0x0081:
            java.lang.String r3 = "offsetX"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x032a }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x032a }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x032a }
            if (r3 != 0) goto L_0x00a0
            com.google.android.gms.ads.internal.C1697X.m7698e()     // Catch:{ all -> 0x032a }
            java.lang.String r3 = "offsetX"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x032a }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x032a }
            int r3 = com.google.android.gms.internal.ads.C3114ge.m12422b((java.lang.String) r3)     // Catch:{ all -> 0x032a }
            r1.f9035i = r3     // Catch:{ all -> 0x032a }
        L_0x00a0:
            java.lang.String r3 = "offsetY"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x032a }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x032a }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x032a }
            if (r3 != 0) goto L_0x00bf
            com.google.android.gms.ads.internal.C1697X.m7698e()     // Catch:{ all -> 0x032a }
            java.lang.String r3 = "offsetY"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x032a }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x032a }
            int r3 = com.google.android.gms.internal.ads.C3114ge.m12422b((java.lang.String) r3)     // Catch:{ all -> 0x032a }
            r1.f9036j = r3     // Catch:{ all -> 0x032a }
        L_0x00bf:
            java.lang.String r3 = "allowOffscreen"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x032a }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x032a }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x032a }
            if (r3 != 0) goto L_0x00db
            java.lang.String r3 = "allowOffscreen"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x032a }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x032a }
            boolean r3 = java.lang.Boolean.parseBoolean(r3)     // Catch:{ all -> 0x032a }
            r1.f9031e = r3     // Catch:{ all -> 0x032a }
        L_0x00db:
            java.lang.String r3 = "customClosePosition"
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x032a }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x032a }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x032a }
            if (r3 != 0) goto L_0x00eb
            r1.f9030d = r0     // Catch:{ all -> 0x032a }
        L_0x00eb:
            int r0 = r1.f9037k     // Catch:{ all -> 0x032a }
            r3 = 1
            r4 = 0
            if (r0 < 0) goto L_0x00f7
            int r0 = r1.f9034h     // Catch:{ all -> 0x032a }
            if (r0 < 0) goto L_0x00f7
            r0 = r3
            goto L_0x00f8
        L_0x00f7:
            r0 = r4
        L_0x00f8:
            if (r0 != 0) goto L_0x0101
            java.lang.String r0 = "Invalid width and height options. Cannot resize."
            r1.mo9766a(r0)     // Catch:{ all -> 0x032a }
            monitor-exit(r2)     // Catch:{ all -> 0x032a }
            return
        L_0x0101:
            android.app.Activity r0 = r1.f9040n     // Catch:{ all -> 0x032a }
            android.view.Window r0 = r0.getWindow()     // Catch:{ all -> 0x032a }
            if (r0 == 0) goto L_0x0323
            android.view.View r5 = r0.getDecorView()     // Catch:{ all -> 0x032a }
            if (r5 != 0) goto L_0x0111
            goto L_0x0323
        L_0x0111:
            int[] r5 = r16.m12129b()     // Catch:{ all -> 0x032a }
            if (r5 != 0) goto L_0x011e
            java.lang.String r0 = "Resize location out of screen or close button is not visible."
            r1.mo9766a(r0)     // Catch:{ all -> 0x032a }
            monitor-exit(r2)     // Catch:{ all -> 0x032a }
            return
        L_0x011e:
            com.google.android.gms.internal.ads.C3390pt.m13453a()     // Catch:{ all -> 0x032a }
            android.app.Activity r6 = r1.f9040n     // Catch:{ all -> 0x032a }
            int r7 = r1.f9037k     // Catch:{ all -> 0x032a }
            int r6 = com.google.android.gms.internal.ads.C3432rf.m13595a((android.content.Context) r6, (int) r7)     // Catch:{ all -> 0x032a }
            com.google.android.gms.internal.ads.C3390pt.m13453a()     // Catch:{ all -> 0x032a }
            android.app.Activity r7 = r1.f9040n     // Catch:{ all -> 0x032a }
            int r8 = r1.f9034h     // Catch:{ all -> 0x032a }
            int r7 = com.google.android.gms.internal.ads.C3432rf.m13595a((android.content.Context) r7, (int) r8)     // Catch:{ all -> 0x032a }
            com.google.android.gms.internal.ads.uh r8 = r1.f9039m     // Catch:{ all -> 0x032a }
            android.view.View r8 = r8.getView()     // Catch:{ all -> 0x032a }
            android.view.ViewParent r8 = r8.getParent()     // Catch:{ all -> 0x032a }
            if (r8 == 0) goto L_0x031c
            boolean r9 = r8 instanceof android.view.ViewGroup     // Catch:{ all -> 0x032a }
            if (r9 == 0) goto L_0x031c
            r9 = r8
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9     // Catch:{ all -> 0x032a }
            com.google.android.gms.internal.ads.uh r10 = r1.f9039m     // Catch:{ all -> 0x032a }
            android.view.View r10 = r10.getView()     // Catch:{ all -> 0x032a }
            r9.removeView(r10)     // Catch:{ all -> 0x032a }
            android.widget.PopupWindow r9 = r1.f9045s     // Catch:{ all -> 0x032a }
            if (r9 != 0) goto L_0x0183
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8     // Catch:{ all -> 0x032a }
            r1.f9047u = r8     // Catch:{ all -> 0x032a }
            com.google.android.gms.ads.internal.C1697X.m7698e()     // Catch:{ all -> 0x032a }
            com.google.android.gms.internal.ads.uh r8 = r1.f9039m     // Catch:{ all -> 0x032a }
            android.view.View r8 = r8.getView()     // Catch:{ all -> 0x032a }
            android.graphics.Bitmap r8 = com.google.android.gms.internal.ads.C3114ge.m12393a((android.view.View) r8)     // Catch:{ all -> 0x032a }
            android.widget.ImageView r9 = new android.widget.ImageView     // Catch:{ all -> 0x032a }
            android.app.Activity r10 = r1.f9040n     // Catch:{ all -> 0x032a }
            r9.<init>(r10)     // Catch:{ all -> 0x032a }
            r1.f9042p = r9     // Catch:{ all -> 0x032a }
            android.widget.ImageView r9 = r1.f9042p     // Catch:{ all -> 0x032a }
            r9.setImageBitmap(r8)     // Catch:{ all -> 0x032a }
            com.google.android.gms.internal.ads.uh r8 = r1.f9039m     // Catch:{ all -> 0x032a }
            com.google.android.gms.internal.ads.hi r8 = r8.mo8192rb()     // Catch:{ all -> 0x032a }
            r1.f9041o = r8     // Catch:{ all -> 0x032a }
            android.view.ViewGroup r8 = r1.f9047u     // Catch:{ all -> 0x032a }
            android.widget.ImageView r9 = r1.f9042p     // Catch:{ all -> 0x032a }
            r8.addView(r9)     // Catch:{ all -> 0x032a }
            goto L_0x0188
        L_0x0183:
            android.widget.PopupWindow r8 = r1.f9045s     // Catch:{ all -> 0x032a }
            r8.dismiss()     // Catch:{ all -> 0x032a }
        L_0x0188:
            android.widget.RelativeLayout r8 = new android.widget.RelativeLayout     // Catch:{ all -> 0x032a }
            android.app.Activity r9 = r1.f9040n     // Catch:{ all -> 0x032a }
            r8.<init>(r9)     // Catch:{ all -> 0x032a }
            r1.f9046t = r8     // Catch:{ all -> 0x032a }
            android.widget.RelativeLayout r8 = r1.f9046t     // Catch:{ all -> 0x032a }
            r8.setBackgroundColor(r4)     // Catch:{ all -> 0x032a }
            android.widget.RelativeLayout r8 = r1.f9046t     // Catch:{ all -> 0x032a }
            android.view.ViewGroup$LayoutParams r9 = new android.view.ViewGroup$LayoutParams     // Catch:{ all -> 0x032a }
            r9.<init>(r6, r7)     // Catch:{ all -> 0x032a }
            r8.setLayoutParams(r9)     // Catch:{ all -> 0x032a }
            com.google.android.gms.ads.internal.C1697X.m7698e()     // Catch:{ all -> 0x032a }
            android.widget.RelativeLayout r8 = r1.f9046t     // Catch:{ all -> 0x032a }
            android.widget.PopupWindow r8 = com.google.android.gms.internal.ads.C3114ge.m12397a((android.view.View) r8, (int) r6, (int) r7, (boolean) r4)     // Catch:{ all -> 0x032a }
            r1.f9045s = r8     // Catch:{ all -> 0x032a }
            android.widget.PopupWindow r8 = r1.f9045s     // Catch:{ all -> 0x032a }
            r8.setOutsideTouchable(r3)     // Catch:{ all -> 0x032a }
            android.widget.PopupWindow r8 = r1.f9045s     // Catch:{ all -> 0x032a }
            r8.setTouchable(r3)     // Catch:{ all -> 0x032a }
            android.widget.PopupWindow r8 = r1.f9045s     // Catch:{ all -> 0x032a }
            boolean r9 = r1.f9031e     // Catch:{ all -> 0x032a }
            if (r9 != 0) goto L_0x01bd
            r9 = r3
            goto L_0x01be
        L_0x01bd:
            r9 = r4
        L_0x01be:
            r8.setClippingEnabled(r9)     // Catch:{ all -> 0x032a }
            android.widget.RelativeLayout r8 = r1.f9046t     // Catch:{ all -> 0x032a }
            com.google.android.gms.internal.ads.uh r9 = r1.f9039m     // Catch:{ all -> 0x032a }
            android.view.View r9 = r9.getView()     // Catch:{ all -> 0x032a }
            r10 = -1
            r8.addView(r9, r10, r10)     // Catch:{ all -> 0x032a }
            android.widget.LinearLayout r8 = new android.widget.LinearLayout     // Catch:{ all -> 0x032a }
            android.app.Activity r9 = r1.f9040n     // Catch:{ all -> 0x032a }
            r8.<init>(r9)     // Catch:{ all -> 0x032a }
            r1.f9043q = r8     // Catch:{ all -> 0x032a }
            android.widget.RelativeLayout$LayoutParams r8 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ all -> 0x032a }
            com.google.android.gms.internal.ads.C3390pt.m13453a()     // Catch:{ all -> 0x032a }
            android.app.Activity r9 = r1.f9040n     // Catch:{ all -> 0x032a }
            r11 = 50
            int r9 = com.google.android.gms.internal.ads.C3432rf.m13595a((android.content.Context) r9, (int) r11)     // Catch:{ all -> 0x032a }
            com.google.android.gms.internal.ads.C3390pt.m13453a()     // Catch:{ all -> 0x032a }
            android.app.Activity r12 = r1.f9040n     // Catch:{ all -> 0x032a }
            int r11 = com.google.android.gms.internal.ads.C3432rf.m13595a((android.content.Context) r12, (int) r11)     // Catch:{ all -> 0x032a }
            r8.<init>(r9, r11)     // Catch:{ all -> 0x032a }
            java.lang.String r9 = r1.f9030d     // Catch:{ all -> 0x032a }
            int r11 = r9.hashCode()     // Catch:{ all -> 0x032a }
            r12 = 5
            r13 = 4
            r14 = 3
            r15 = 2
            switch(r11) {
                case -1364013995: goto L_0x022f;
                case -1012429441: goto L_0x0225;
                case -655373719: goto L_0x021b;
                case 1163912186: goto L_0x0211;
                case 1288627767: goto L_0x0207;
                case 1755462605: goto L_0x01fd;
                default: goto L_0x01fc;
            }     // Catch:{ all -> 0x032a }
        L_0x01fc:
            goto L_0x0238
        L_0x01fd:
            java.lang.String r11 = "top-center"
            boolean r9 = r9.equals(r11)     // Catch:{ all -> 0x032a }
            if (r9 == 0) goto L_0x0238
            r10 = r3
            goto L_0x0238
        L_0x0207:
            java.lang.String r11 = "bottom-center"
            boolean r9 = r9.equals(r11)     // Catch:{ all -> 0x032a }
            if (r9 == 0) goto L_0x0238
            r10 = r13
            goto L_0x0238
        L_0x0211:
            java.lang.String r11 = "bottom-right"
            boolean r9 = r9.equals(r11)     // Catch:{ all -> 0x032a }
            if (r9 == 0) goto L_0x0238
            r10 = r12
            goto L_0x0238
        L_0x021b:
            java.lang.String r11 = "bottom-left"
            boolean r9 = r9.equals(r11)     // Catch:{ all -> 0x032a }
            if (r9 == 0) goto L_0x0238
            r10 = r14
            goto L_0x0238
        L_0x0225:
            java.lang.String r11 = "top-left"
            boolean r9 = r9.equals(r11)     // Catch:{ all -> 0x032a }
            if (r9 == 0) goto L_0x0238
            r10 = r4
            goto L_0x0238
        L_0x022f:
            java.lang.String r11 = "center"
            boolean r9 = r9.equals(r11)     // Catch:{ all -> 0x032a }
            if (r9 == 0) goto L_0x0238
            r10 = r15
        L_0x0238:
            r9 = 9
            r11 = 10
            if (r10 == 0) goto L_0x026e
            r4 = 14
            if (r10 == r3) goto L_0x026a
            if (r10 == r15) goto L_0x0264
            r15 = 12
            if (r10 == r14) goto L_0x025d
            if (r10 == r13) goto L_0x0259
            r4 = 11
            if (r10 == r12) goto L_0x0255
            r8.addRule(r11)     // Catch:{ all -> 0x032a }
        L_0x0251:
            r8.addRule(r4)     // Catch:{ all -> 0x032a }
            goto L_0x0272
        L_0x0255:
            r8.addRule(r15)     // Catch:{ all -> 0x032a }
            goto L_0x0251
        L_0x0259:
            r8.addRule(r15)     // Catch:{ all -> 0x032a }
            goto L_0x0251
        L_0x025d:
            r8.addRule(r15)     // Catch:{ all -> 0x032a }
        L_0x0260:
            r8.addRule(r9)     // Catch:{ all -> 0x032a }
            goto L_0x0272
        L_0x0264:
            r4 = 13
            r8.addRule(r4)     // Catch:{ all -> 0x032a }
            goto L_0x0272
        L_0x026a:
            r8.addRule(r11)     // Catch:{ all -> 0x032a }
            goto L_0x0251
        L_0x026e:
            r8.addRule(r11)     // Catch:{ all -> 0x032a }
            goto L_0x0260
        L_0x0272:
            android.widget.LinearLayout r4 = r1.f9043q     // Catch:{ all -> 0x032a }
            com.google.android.gms.internal.ads.e r9 = new com.google.android.gms.internal.ads.e     // Catch:{ all -> 0x032a }
            r9.<init>(r1)     // Catch:{ all -> 0x032a }
            r4.setOnClickListener(r9)     // Catch:{ all -> 0x032a }
            android.widget.LinearLayout r4 = r1.f9043q     // Catch:{ all -> 0x032a }
            java.lang.String r9 = "Close button"
            r4.setContentDescription(r9)     // Catch:{ all -> 0x032a }
            android.widget.RelativeLayout r4 = r1.f9046t     // Catch:{ all -> 0x032a }
            android.widget.LinearLayout r9 = r1.f9043q     // Catch:{ all -> 0x032a }
            r4.addView(r9, r8)     // Catch:{ all -> 0x032a }
            android.widget.PopupWindow r4 = r1.f9045s     // Catch:{ RuntimeException -> 0x02d4 }
            android.view.View r0 = r0.getDecorView()     // Catch:{ RuntimeException -> 0x02d4 }
            com.google.android.gms.internal.ads.C3390pt.m13453a()     // Catch:{ RuntimeException -> 0x02d4 }
            android.app.Activity r8 = r1.f9040n     // Catch:{ RuntimeException -> 0x02d4 }
            r9 = 0
            r10 = r5[r9]     // Catch:{ RuntimeException -> 0x02d4 }
            int r8 = com.google.android.gms.internal.ads.C3432rf.m13595a((android.content.Context) r8, (int) r10)     // Catch:{ RuntimeException -> 0x02d4 }
            com.google.android.gms.internal.ads.C3390pt.m13453a()     // Catch:{ RuntimeException -> 0x02d4 }
            android.app.Activity r9 = r1.f9040n     // Catch:{ RuntimeException -> 0x02d4 }
            r10 = r5[r3]     // Catch:{ RuntimeException -> 0x02d4 }
            int r9 = com.google.android.gms.internal.ads.C3432rf.m13595a((android.content.Context) r9, (int) r10)     // Catch:{ RuntimeException -> 0x02d4 }
            r10 = 0
            r4.showAtLocation(r0, r10, r8, r9)     // Catch:{ RuntimeException -> 0x02d4 }
            r0 = r5[r10]     // Catch:{ all -> 0x032a }
            r4 = r5[r3]     // Catch:{ all -> 0x032a }
            com.google.android.gms.internal.ads.o r8 = r1.f9044r     // Catch:{ all -> 0x032a }
            if (r8 == 0) goto L_0x02bc
            com.google.android.gms.internal.ads.o r8 = r1.f9044r     // Catch:{ all -> 0x032a }
            int r9 = r1.f9037k     // Catch:{ all -> 0x032a }
            int r10 = r1.f9034h     // Catch:{ all -> 0x032a }
            r8.mo6911a(r0, r4, r9, r10)     // Catch:{ all -> 0x032a }
        L_0x02bc:
            com.google.android.gms.internal.ads.uh r0 = r1.f9039m     // Catch:{ all -> 0x032a }
            com.google.android.gms.internal.ads.hi r4 = com.google.android.gms.internal.ads.C3146hi.m12524a(r6, r7)     // Catch:{ all -> 0x032a }
            r0.mo8145a((com.google.android.gms.internal.ads.C3146hi) r4)     // Catch:{ all -> 0x032a }
            r0 = 0
            r0 = r5[r0]     // Catch:{ all -> 0x032a }
            r3 = r5[r3]     // Catch:{ all -> 0x032a }
            r1.m12128b(r0, r3)     // Catch:{ all -> 0x032a }
            java.lang.String r0 = "resized"
            r1.mo9769c(r0)     // Catch:{ all -> 0x032a }
            monitor-exit(r2)     // Catch:{ all -> 0x032a }
            return
        L_0x02d4:
            r0 = move-exception
            java.lang.String r3 = "Cannot show popup window: "
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x032a }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x032a }
            int r4 = r0.length()     // Catch:{ all -> 0x032a }
            if (r4 == 0) goto L_0x02ea
            java.lang.String r0 = r3.concat(r0)     // Catch:{ all -> 0x032a }
            goto L_0x02ef
        L_0x02ea:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x032a }
            r0.<init>(r3)     // Catch:{ all -> 0x032a }
        L_0x02ef:
            r1.mo9766a(r0)     // Catch:{ all -> 0x032a }
            android.widget.RelativeLayout r0 = r1.f9046t     // Catch:{ all -> 0x032a }
            com.google.android.gms.internal.ads.uh r3 = r1.f9039m     // Catch:{ all -> 0x032a }
            android.view.View r3 = r3.getView()     // Catch:{ all -> 0x032a }
            r0.removeView(r3)     // Catch:{ all -> 0x032a }
            android.view.ViewGroup r0 = r1.f9047u     // Catch:{ all -> 0x032a }
            if (r0 == 0) goto L_0x031a
            android.view.ViewGroup r0 = r1.f9047u     // Catch:{ all -> 0x032a }
            android.widget.ImageView r3 = r1.f9042p     // Catch:{ all -> 0x032a }
            r0.removeView(r3)     // Catch:{ all -> 0x032a }
            android.view.ViewGroup r0 = r1.f9047u     // Catch:{ all -> 0x032a }
            com.google.android.gms.internal.ads.uh r3 = r1.f9039m     // Catch:{ all -> 0x032a }
            android.view.View r3 = r3.getView()     // Catch:{ all -> 0x032a }
            r0.addView(r3)     // Catch:{ all -> 0x032a }
            com.google.android.gms.internal.ads.uh r0 = r1.f9039m     // Catch:{ all -> 0x032a }
            com.google.android.gms.internal.ads.hi r3 = r1.f9041o     // Catch:{ all -> 0x032a }
            r0.mo8145a((com.google.android.gms.internal.ads.C3146hi) r3)     // Catch:{ all -> 0x032a }
        L_0x031a:
            monitor-exit(r2)     // Catch:{ all -> 0x032a }
            return
        L_0x031c:
            java.lang.String r0 = "Webview is detached, probably in the middle of a resize or expand."
            r1.mo9766a(r0)     // Catch:{ all -> 0x032a }
            monitor-exit(r2)     // Catch:{ all -> 0x032a }
            return
        L_0x0323:
            java.lang.String r0 = "Activity context is not ready, cannot get window or decor view."
            r1.mo9766a(r0)     // Catch:{ all -> 0x032a }
            monitor-exit(r2)     // Catch:{ all -> 0x032a }
            return
        L_0x032a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x032a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3021d.mo9302a(java.util.Map):void");
    }

    /* renamed from: a */
    public final void mo9303a(boolean z) {
        synchronized (this.f9038l) {
            if (this.f9045s != null) {
                this.f9045s.dismiss();
                this.f9046t.removeView(this.f9039m.getView());
                if (this.f9047u != null) {
                    this.f9047u.removeView(this.f9042p);
                    this.f9047u.addView(this.f9039m.getView());
                    this.f9039m.mo8145a(this.f9041o);
                }
                if (z) {
                    mo9769c(CookieSpecs.DEFAULT);
                    if (this.f9044r != null) {
                        this.f9044r.mo6909Yb();
                    }
                }
                this.f9045s = null;
                this.f9046t = null;
                this.f9047u = null;
                this.f9043q = null;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo9304a() {
        boolean z;
        synchronized (this.f9038l) {
            z = this.f9045s != null;
        }
        return z;
    }
}
