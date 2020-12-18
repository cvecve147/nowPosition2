package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.common.util.C2092n;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p134b.C5468d;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Qv */
public final class C2650Qv extends C3075ew implements View.OnClickListener, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a */
    private static final String[] f8174a = {"2011", "1009", "3010"};

    /* renamed from: b */
    private final Object f8175b = new Object();

    /* renamed from: c */
    private final FrameLayout f8176c;

    /* renamed from: d */
    private FrameLayout f8177d;

    /* renamed from: e */
    private View f8178e;

    /* renamed from: f */
    private final boolean f8179f;

    /* renamed from: g */
    private Map<String, WeakReference<View>> f8180g = Collections.synchronizedMap(new HashMap());

    /* renamed from: h */
    private View f8181h;

    /* renamed from: i */
    private C2244Cv f8182i;

    /* renamed from: j */
    private boolean f8183j = false;

    /* renamed from: k */
    private Point f8184k = new Point();

    /* renamed from: l */
    private Point f8185l = new Point();

    /* renamed from: m */
    private WeakReference<C3217jr> f8186m = new WeakReference<>((Object) null);

    @TargetApi(21)
    public C2650Qv(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.f8176c = frameLayout;
        this.f8177d = frameLayout2;
        C1697X.m7688A();
        C3348og.m13242a((View) this.f8176c, (ViewTreeObserver.OnGlobalLayoutListener) this);
        C1697X.m7688A();
        C3348og.m13243a((View) this.f8176c, (ViewTreeObserver.OnScrollChangedListener) this);
        this.f8176c.setOnTouchListener(this);
        this.f8176c.setOnClickListener(this);
        if (frameLayout2 != null && C2092n.m9168i()) {
            frameLayout2.setElevation(Float.MAX_VALUE);
        }
        C2558Nu.m10773a(this.f8176c.getContext());
        this.f8179f = ((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7861ad)).booleanValue();
    }

    /* renamed from: bc */
    private final void m11012bc() {
        synchronized (this.f8175b) {
            if (!this.f8179f && this.f8183j) {
                int measuredWidth = this.f8176c.getMeasuredWidth();
                int measuredHeight = this.f8176c.getMeasuredHeight();
                if (!(measuredWidth == 0 || measuredHeight == 0 || this.f8177d == null)) {
                    this.f8177d.setLayoutParams(new FrameLayout.LayoutParams(measuredWidth, measuredHeight));
                    this.f8183j = false;
                }
            }
        }
    }

    /* renamed from: c */
    private final void m11013c(View view) {
        C2244Cv cv = this.f8182i;
        if (cv != null) {
            if (cv instanceof C2215Bv) {
                cv = ((C2215Bv) cv).mo7895d();
            }
            if (cv != null) {
                cv.mo7960b(view);
            }
        }
    }

    /* renamed from: i */
    private final int m11014i(int i) {
        C3390pt.m13453a();
        return C3432rf.m13605b(this.f8182i.getContext(), i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8757a(java.lang.String r4, p101d.p129g.p131b.p132a.p134b.C5464b r5) {
        /*
            r3 = this;
            java.lang.Object r5 = p101d.p129g.p131b.p132a.p134b.C5468d.m20962z(r5)
            android.view.View r5 = (android.view.View) r5
            java.lang.Object r0 = r3.f8175b
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r1 = r3.f8180g     // Catch:{ all -> 0x0040 }
            if (r1 != 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x000f:
            if (r5 != 0) goto L_0x0017
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5 = r3.f8180g     // Catch:{ all -> 0x0040 }
            r5.remove(r4)     // Catch:{ all -> 0x0040 }
            goto L_0x003c
        L_0x0017:
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r1 = r3.f8180g     // Catch:{ all -> 0x0040 }
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0040 }
            r2.<init>(r5)     // Catch:{ all -> 0x0040 }
            r1.put(r4, r2)     // Catch:{ all -> 0x0040 }
            java.lang.String r1 = "1098"
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x0040 }
            if (r1 != 0) goto L_0x003e
            java.lang.String r1 = "3011"
            boolean r4 = r1.equals(r4)     // Catch:{ all -> 0x0040 }
            if (r4 == 0) goto L_0x0032
            goto L_0x003e
        L_0x0032:
            r5.setOnTouchListener(r3)     // Catch:{ all -> 0x0040 }
            r4 = 1
            r5.setClickable(r4)     // Catch:{ all -> 0x0040 }
            r5.setOnClickListener(r3)     // Catch:{ all -> 0x0040 }
        L_0x003c:
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x003e:
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x0040:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2650Qv.mo8757a(java.lang.String, d.g.b.a.b.b):void");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0118 A[Catch:{ Exception -> 0x0194 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0163 A[Catch:{ Exception -> 0x0194 }] */
    /* renamed from: d */
    public final void mo8758d(p101d.p129g.p131b.p132a.p134b.C5464b r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f8175b
            monitor-enter(r0)
            r1 = 0
            r11.m11013c(r1)     // Catch:{ all -> 0x0257 }
            java.lang.Object r12 = p101d.p129g.p131b.p132a.p134b.C5468d.m20962z(r12)     // Catch:{ all -> 0x0257 }
            boolean r2 = r12 instanceof com.google.android.gms.internal.ads.C2387Hv     // Catch:{ all -> 0x0257 }
            if (r2 != 0) goto L_0x0016
            java.lang.String r12 = "Not an instance of native engine. This is most likely a transient error"
            com.google.android.gms.internal.ads.C2227Cf.m9536d(r12)     // Catch:{ all -> 0x0257 }
            monitor-exit(r0)     // Catch:{ all -> 0x0257 }
            return
        L_0x0016:
            boolean r2 = r11.f8179f     // Catch:{ all -> 0x0257 }
            r3 = 0
            if (r2 != 0) goto L_0x002e
            android.widget.FrameLayout r2 = r11.f8177d     // Catch:{ all -> 0x0257 }
            if (r2 == 0) goto L_0x002e
            android.widget.FrameLayout r2 = r11.f8177d     // Catch:{ all -> 0x0257 }
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams     // Catch:{ all -> 0x0257 }
            r4.<init>(r3, r3)     // Catch:{ all -> 0x0257 }
            r2.setLayoutParams(r4)     // Catch:{ all -> 0x0257 }
            android.widget.FrameLayout r2 = r11.f8176c     // Catch:{ all -> 0x0257 }
            r2.requestLayout()     // Catch:{ all -> 0x0257 }
        L_0x002e:
            r2 = 1
            r11.f8183j = r2     // Catch:{ all -> 0x0257 }
            com.google.android.gms.internal.ads.Hv r12 = (com.google.android.gms.internal.ads.C2387Hv) r12     // Catch:{ all -> 0x0257 }
            com.google.android.gms.internal.ads.Cv r4 = r11.f8182i     // Catch:{ all -> 0x0257 }
            if (r4 == 0) goto L_0x0052
            com.google.android.gms.internal.ads.Du<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.C2558Nu.f7815Sc     // Catch:{ all -> 0x0257 }
            com.google.android.gms.internal.ads.Lu r5 = com.google.android.gms.internal.ads.C3390pt.m13458f()     // Catch:{ all -> 0x0257 }
            java.lang.Object r4 = r5.mo8515a(r4)     // Catch:{ all -> 0x0257 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x0257 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x0257 }
            if (r4 == 0) goto L_0x0052
            com.google.android.gms.internal.ads.Cv r4 = r11.f8182i     // Catch:{ all -> 0x0257 }
            android.widget.FrameLayout r5 = r11.f8176c     // Catch:{ all -> 0x0257 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6 = r11.f8180g     // Catch:{ all -> 0x0257 }
            r4.mo7888a((android.view.View) r5, (java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>>) r6)     // Catch:{ all -> 0x0257 }
        L_0x0052:
            com.google.android.gms.internal.ads.Cv r4 = r11.f8182i     // Catch:{ all -> 0x0257 }
            boolean r4 = r4 instanceof com.google.android.gms.internal.ads.C2387Hv     // Catch:{ all -> 0x0257 }
            if (r4 == 0) goto L_0x008c
            com.google.android.gms.internal.ads.Cv r4 = r11.f8182i     // Catch:{ all -> 0x0257 }
            com.google.android.gms.internal.ads.Hv r4 = (com.google.android.gms.internal.ads.C2387Hv) r4     // Catch:{ all -> 0x0257 }
            if (r4 == 0) goto L_0x008c
            android.content.Context r5 = r4.getContext()     // Catch:{ all -> 0x0257 }
            if (r5 == 0) goto L_0x008c
            com.google.android.gms.internal.ads.td r5 = com.google.android.gms.ads.internal.C1697X.m7689B()     // Catch:{ all -> 0x0257 }
            android.widget.FrameLayout r6 = r11.f8176c     // Catch:{ all -> 0x0257 }
            android.content.Context r6 = r6.getContext()     // Catch:{ all -> 0x0257 }
            boolean r5 = r5.mo10044f(r6)     // Catch:{ all -> 0x0257 }
            if (r5 == 0) goto L_0x008c
            com.google.android.gms.internal.ads.sd r4 = r4.mo8305b()     // Catch:{ all -> 0x0257 }
            if (r4 == 0) goto L_0x007d
            r4.mo9995a((boolean) r3)     // Catch:{ all -> 0x0257 }
        L_0x007d:
            java.lang.ref.WeakReference<com.google.android.gms.internal.ads.jr> r5 = r11.f8186m     // Catch:{ all -> 0x0257 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x0257 }
            com.google.android.gms.internal.ads.jr r5 = (com.google.android.gms.internal.ads.C3217jr) r5     // Catch:{ all -> 0x0257 }
            if (r5 == 0) goto L_0x008c
            if (r4 == 0) goto L_0x008c
            r5.mo9612b((com.google.android.gms.internal.ads.C3331nr) r4)     // Catch:{ all -> 0x0257 }
        L_0x008c:
            com.google.android.gms.internal.ads.Cv r4 = r11.f8182i     // Catch:{ all -> 0x0257 }
            boolean r4 = r4 instanceof com.google.android.gms.internal.ads.C2215Bv     // Catch:{ all -> 0x0257 }
            if (r4 == 0) goto L_0x00a4
            com.google.android.gms.internal.ads.Cv r4 = r11.f8182i     // Catch:{ all -> 0x0257 }
            com.google.android.gms.internal.ads.Bv r4 = (com.google.android.gms.internal.ads.C2215Bv) r4     // Catch:{ all -> 0x0257 }
            boolean r4 = r4.mo7894c()     // Catch:{ all -> 0x0257 }
            if (r4 == 0) goto L_0x00a4
            com.google.android.gms.internal.ads.Cv r4 = r11.f8182i     // Catch:{ all -> 0x0257 }
            com.google.android.gms.internal.ads.Bv r4 = (com.google.android.gms.internal.ads.C2215Bv) r4     // Catch:{ all -> 0x0257 }
            r4.mo7891a((com.google.android.gms.internal.ads.C2244Cv) r12)     // Catch:{ all -> 0x0257 }
            goto L_0x00b0
        L_0x00a4:
            r11.f8182i = r12     // Catch:{ all -> 0x0257 }
            boolean r4 = r12 instanceof com.google.android.gms.internal.ads.C2215Bv     // Catch:{ all -> 0x0257 }
            if (r4 == 0) goto L_0x00b0
            r4 = r12
            com.google.android.gms.internal.ads.Bv r4 = (com.google.android.gms.internal.ads.C2215Bv) r4     // Catch:{ all -> 0x0257 }
            r4.mo7891a((com.google.android.gms.internal.ads.C2244Cv) r1)     // Catch:{ all -> 0x0257 }
        L_0x00b0:
            android.widget.FrameLayout r4 = r11.f8177d     // Catch:{ all -> 0x0257 }
            if (r4 != 0) goto L_0x00b6
            monitor-exit(r0)     // Catch:{ all -> 0x0257 }
            return
        L_0x00b6:
            com.google.android.gms.internal.ads.Du<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.C2558Nu.f7815Sc     // Catch:{ all -> 0x0257 }
            com.google.android.gms.internal.ads.Lu r5 = com.google.android.gms.internal.ads.C3390pt.m13458f()     // Catch:{ all -> 0x0257 }
            java.lang.Object r4 = r5.mo8515a(r4)     // Catch:{ all -> 0x0257 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x0257 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x0257 }
            if (r4 == 0) goto L_0x00cd
            android.widget.FrameLayout r4 = r11.f8177d     // Catch:{ all -> 0x0257 }
            r4.setClickable(r3)     // Catch:{ all -> 0x0257 }
        L_0x00cd:
            android.widget.FrameLayout r4 = r11.f8177d     // Catch:{ all -> 0x0257 }
            r4.removeAllViews()     // Catch:{ all -> 0x0257 }
            boolean r4 = r12.mo7883Eb()     // Catch:{ all -> 0x0257 }
            if (r4 == 0) goto L_0x0106
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5 = r11.f8180g     // Catch:{ all -> 0x0257 }
            if (r5 == 0) goto L_0x00fe
            java.lang.String r5 = "1098"
            java.lang.String r6 = "3011"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6}     // Catch:{ all -> 0x0257 }
            r6 = r3
        L_0x00e5:
            r7 = 2
            if (r6 >= r7) goto L_0x00fe
            r7 = r5[r6]     // Catch:{ all -> 0x0257 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r8 = r11.f8180g     // Catch:{ all -> 0x0257 }
            java.lang.Object r7 = r8.get(r7)     // Catch:{ all -> 0x0257 }
            java.lang.ref.WeakReference r7 = (java.lang.ref.WeakReference) r7     // Catch:{ all -> 0x0257 }
            if (r7 == 0) goto L_0x00fb
            java.lang.Object r5 = r7.get()     // Catch:{ all -> 0x0257 }
            android.view.View r5 = (android.view.View) r5     // Catch:{ all -> 0x0257 }
            goto L_0x00ff
        L_0x00fb:
            int r6 = r6 + 1
            goto L_0x00e5
        L_0x00fe:
            r5 = r1
        L_0x00ff:
            boolean r6 = r5 instanceof android.view.ViewGroup     // Catch:{ all -> 0x0257 }
            if (r6 == 0) goto L_0x0106
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5     // Catch:{ all -> 0x0257 }
            goto L_0x0107
        L_0x0106:
            r5 = r1
        L_0x0107:
            if (r4 == 0) goto L_0x010c
            if (r5 == 0) goto L_0x010c
            goto L_0x010d
        L_0x010c:
            r2 = r3
        L_0x010d:
            android.view.View r4 = r12.mo7885a((android.view.View.OnClickListener) r11, (boolean) r2)     // Catch:{ all -> 0x0257 }
            r11.f8181h = r4     // Catch:{ all -> 0x0257 }
            android.view.View r4 = r11.f8181h     // Catch:{ all -> 0x0257 }
            r10 = -1
            if (r4 == 0) goto L_0x0154
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r11.f8180g     // Catch:{ all -> 0x0257 }
            if (r4 == 0) goto L_0x012a
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r11.f8180g     // Catch:{ all -> 0x0257 }
            java.lang.String r6 = "1007"
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0257 }
            android.view.View r8 = r11.f8181h     // Catch:{ all -> 0x0257 }
            r7.<init>(r8)     // Catch:{ all -> 0x0257 }
            r4.put(r6, r7)     // Catch:{ all -> 0x0257 }
        L_0x012a:
            if (r2 == 0) goto L_0x0135
            r5.removeAllViews()     // Catch:{ all -> 0x0257 }
            android.view.View r2 = r11.f8181h     // Catch:{ all -> 0x0257 }
            r5.addView(r2)     // Catch:{ all -> 0x0257 }
            goto L_0x0154
        L_0x0135:
            android.content.Context r2 = r12.getContext()     // Catch:{ all -> 0x0257 }
            com.google.android.gms.ads.formats.a r4 = new com.google.android.gms.ads.formats.a     // Catch:{ all -> 0x0257 }
            r4.<init>(r2)     // Catch:{ all -> 0x0257 }
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams     // Catch:{ all -> 0x0257 }
            r2.<init>(r10, r10)     // Catch:{ all -> 0x0257 }
            r4.setLayoutParams(r2)     // Catch:{ all -> 0x0257 }
            android.view.View r2 = r11.f8181h     // Catch:{ all -> 0x0257 }
            r4.addView(r2)     // Catch:{ all -> 0x0257 }
            android.widget.FrameLayout r2 = r11.f8177d     // Catch:{ all -> 0x0257 }
            if (r2 == 0) goto L_0x0154
            android.widget.FrameLayout r2 = r11.f8177d     // Catch:{ all -> 0x0257 }
            r2.addView(r4)     // Catch:{ all -> 0x0257 }
        L_0x0154:
            android.widget.FrameLayout r5 = r11.f8176c     // Catch:{ all -> 0x0257 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6 = r11.f8180g     // Catch:{ all -> 0x0257 }
            r7 = 0
            r4 = r12
            r8 = r11
            r9 = r11
            r4.mo7890a((android.view.View) r5, (java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>>) r6, (java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>>) r7, (android.view.View.OnTouchListener) r8, (android.view.View.OnClickListener) r9)     // Catch:{ all -> 0x0257 }
            boolean r2 = r11.f8179f     // Catch:{ all -> 0x0257 }
            if (r2 == 0) goto L_0x018f
            android.view.View r2 = r11.f8178e     // Catch:{ all -> 0x0257 }
            if (r2 != 0) goto L_0x017e
            android.view.View r2 = new android.view.View     // Catch:{ all -> 0x0257 }
            android.widget.FrameLayout r4 = r11.f8176c     // Catch:{ all -> 0x0257 }
            android.content.Context r4 = r4.getContext()     // Catch:{ all -> 0x0257 }
            r2.<init>(r4)     // Catch:{ all -> 0x0257 }
            r11.f8178e = r2     // Catch:{ all -> 0x0257 }
            android.view.View r2 = r11.f8178e     // Catch:{ all -> 0x0257 }
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams     // Catch:{ all -> 0x0257 }
            r4.<init>(r10, r3)     // Catch:{ all -> 0x0257 }
            r2.setLayoutParams(r4)     // Catch:{ all -> 0x0257 }
        L_0x017e:
            android.widget.FrameLayout r2 = r11.f8176c     // Catch:{ all -> 0x0257 }
            android.view.View r4 = r11.f8178e     // Catch:{ all -> 0x0257 }
            android.view.ViewParent r4 = r4.getParent()     // Catch:{ all -> 0x0257 }
            if (r2 == r4) goto L_0x018f
            android.widget.FrameLayout r2 = r11.f8176c     // Catch:{ all -> 0x0257 }
            android.view.View r4 = r11.f8178e     // Catch:{ all -> 0x0257 }
            r2.addView(r4)     // Catch:{ all -> 0x0257 }
        L_0x018f:
            com.google.android.gms.internal.ads.uh r2 = r12.mo7886a()     // Catch:{ Exception -> 0x0194 }
            goto L_0x01aa
        L_0x0194:
            r2 = move-exception
            com.google.android.gms.ads.internal.C1697X.m7700g()     // Catch:{ all -> 0x0257 }
            boolean r4 = com.google.android.gms.internal.ads.C3289me.m13059e()     // Catch:{ all -> 0x0257 }
            if (r4 == 0) goto L_0x01a4
            java.lang.String r2 = "Privileged processes cannot create HTML overlays."
            com.google.android.gms.internal.ads.C2227Cf.m9536d(r2)     // Catch:{ all -> 0x0257 }
            goto L_0x01a9
        L_0x01a4:
            java.lang.String r4 = "Error obtaining overlay."
            com.google.android.gms.internal.ads.C2227Cf.m9533b(r4, r2)     // Catch:{ all -> 0x0257 }
        L_0x01a9:
            r2 = r1
        L_0x01aa:
            if (r2 == 0) goto L_0x01b9
            android.widget.FrameLayout r4 = r11.f8177d     // Catch:{ all -> 0x0257 }
            if (r4 == 0) goto L_0x01b9
            android.widget.FrameLayout r4 = r11.f8177d     // Catch:{ all -> 0x0257 }
            android.view.View r2 = r2.getView()     // Catch:{ all -> 0x0257 }
            r4.addView(r2)     // Catch:{ all -> 0x0257 }
        L_0x01b9:
            java.lang.Object r2 = r11.f8175b     // Catch:{ all -> 0x0257 }
            monitor-enter(r2)     // Catch:{ all -> 0x0257 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r11.f8180g     // Catch:{ all -> 0x0254 }
            r12.mo8304a((java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>>) r4)     // Catch:{ all -> 0x0254 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r11.f8180g     // Catch:{ all -> 0x0254 }
            if (r4 == 0) goto L_0x01e0
            java.lang.String[] r4 = f8174a     // Catch:{ all -> 0x0254 }
            int r5 = r4.length     // Catch:{ all -> 0x0254 }
        L_0x01c8:
            if (r3 >= r5) goto L_0x01e0
            r6 = r4[r3]     // Catch:{ all -> 0x0254 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r7 = r11.f8180g     // Catch:{ all -> 0x0254 }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ all -> 0x0254 }
            java.lang.ref.WeakReference r6 = (java.lang.ref.WeakReference) r6     // Catch:{ all -> 0x0254 }
            if (r6 == 0) goto L_0x01dd
            java.lang.Object r1 = r6.get()     // Catch:{ all -> 0x0254 }
            android.view.View r1 = (android.view.View) r1     // Catch:{ all -> 0x0254 }
            goto L_0x01e0
        L_0x01dd:
            int r3 = r3 + 1
            goto L_0x01c8
        L_0x01e0:
            boolean r3 = r1 instanceof android.widget.FrameLayout     // Catch:{ all -> 0x0254 }
            if (r3 != 0) goto L_0x01e9
            r12.mo7882Db()     // Catch:{ all -> 0x0254 }
        L_0x01e7:
            monitor-exit(r2)     // Catch:{ all -> 0x0254 }
            goto L_0x01fa
        L_0x01e9:
            com.google.android.gms.internal.ads.Rv r3 = new com.google.android.gms.internal.ads.Rv     // Catch:{ all -> 0x0254 }
            r3.<init>(r11, r1)     // Catch:{ all -> 0x0254 }
            boolean r4 = r12 instanceof com.google.android.gms.internal.ads.C2215Bv     // Catch:{ all -> 0x0254 }
            if (r4 == 0) goto L_0x01f6
            r12.mo8306b((android.view.View) r1, (com.google.android.gms.internal.ads.C2187Av) r3)     // Catch:{ all -> 0x0254 }
            goto L_0x01e7
        L_0x01f6:
            r12.mo7958a((android.view.View) r1, (com.google.android.gms.internal.ads.C2187Av) r3)     // Catch:{ all -> 0x0254 }
            goto L_0x01e7
        L_0x01fa:
            android.widget.FrameLayout r1 = r11.f8176c     // Catch:{ all -> 0x0257 }
            r12.mo8307d((android.view.View) r1)     // Catch:{ all -> 0x0257 }
            android.widget.FrameLayout r12 = r11.f8176c     // Catch:{ all -> 0x0257 }
            r11.m11013c(r12)     // Catch:{ all -> 0x0257 }
            com.google.android.gms.internal.ads.Cv r12 = r11.f8182i     // Catch:{ all -> 0x0257 }
            android.widget.FrameLayout r1 = r11.f8176c     // Catch:{ all -> 0x0257 }
            r12.mo7961c((android.view.View) r1)     // Catch:{ all -> 0x0257 }
            com.google.android.gms.internal.ads.Cv r12 = r11.f8182i     // Catch:{ all -> 0x0257 }
            boolean r12 = r12 instanceof com.google.android.gms.internal.ads.C2387Hv     // Catch:{ all -> 0x0257 }
            if (r12 == 0) goto L_0x0252
            com.google.android.gms.internal.ads.Cv r12 = r11.f8182i     // Catch:{ all -> 0x0257 }
            com.google.android.gms.internal.ads.Hv r12 = (com.google.android.gms.internal.ads.C2387Hv) r12     // Catch:{ all -> 0x0257 }
            if (r12 == 0) goto L_0x0252
            android.content.Context r1 = r12.getContext()     // Catch:{ all -> 0x0257 }
            if (r1 == 0) goto L_0x0252
            com.google.android.gms.internal.ads.td r1 = com.google.android.gms.ads.internal.C1697X.m7689B()     // Catch:{ all -> 0x0257 }
            android.widget.FrameLayout r2 = r11.f8176c     // Catch:{ all -> 0x0257 }
            android.content.Context r2 = r2.getContext()     // Catch:{ all -> 0x0257 }
            boolean r1 = r1.mo10044f(r2)     // Catch:{ all -> 0x0257 }
            if (r1 == 0) goto L_0x0252
            java.lang.ref.WeakReference<com.google.android.gms.internal.ads.jr> r1 = r11.f8186m     // Catch:{ all -> 0x0257 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0257 }
            com.google.android.gms.internal.ads.jr r1 = (com.google.android.gms.internal.ads.C3217jr) r1     // Catch:{ all -> 0x0257 }
            if (r1 != 0) goto L_0x024b
            com.google.android.gms.internal.ads.jr r1 = new com.google.android.gms.internal.ads.jr     // Catch:{ all -> 0x0257 }
            android.widget.FrameLayout r2 = r11.f8176c     // Catch:{ all -> 0x0257 }
            android.content.Context r2 = r2.getContext()     // Catch:{ all -> 0x0257 }
            android.widget.FrameLayout r3 = r11.f8176c     // Catch:{ all -> 0x0257 }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0257 }
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0257 }
            r2.<init>(r1)     // Catch:{ all -> 0x0257 }
            r11.f8186m = r2     // Catch:{ all -> 0x0257 }
        L_0x024b:
            com.google.android.gms.internal.ads.sd r12 = r12.mo8305b()     // Catch:{ all -> 0x0257 }
            r1.mo9611a((com.google.android.gms.internal.ads.C3331nr) r12)     // Catch:{ all -> 0x0257 }
        L_0x0252:
            monitor-exit(r0)     // Catch:{ all -> 0x0257 }
            return
        L_0x0254:
            r12 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0254 }
            throw r12     // Catch:{ all -> 0x0257 }
        L_0x0257:
            r12 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0257 }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2650Qv.mo8758d(d.g.b.a.b.b):void");
    }

    /* renamed from: d */
    public final void mo8759d(C5464b bVar, int i) {
        WeakReference<C3217jr> weakReference;
        C3217jr jrVar;
        if (!(!C1697X.m7689B().mo10044f(this.f8176c.getContext()) || (weakReference = this.f8186m) == null || (jrVar = (C3217jr) weakReference.get()) == null)) {
            jrVar.mo9610a();
        }
        m11012bc();
    }

    public final void destroy() {
        synchronized (this.f8175b) {
            if (this.f8177d != null) {
                this.f8177d.removeAllViews();
            }
            this.f8177d = null;
            this.f8180g = null;
            this.f8181h = null;
            this.f8182i = null;
            this.f8184k = null;
            this.f8185l = null;
            this.f8186m = null;
            this.f8178e = null;
        }
    }

    /* renamed from: e */
    public final void mo8761e(C5464b bVar) {
        this.f8182i.mo7887a((View) C5468d.m20962z(bVar));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p101d.p129g.p131b.p132a.p134b.C5464b mo8762h(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f8175b
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r1 = r3.f8180g     // Catch:{ all -> 0x0022 }
            r2 = 0
            if (r1 != 0) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return r2
        L_0x000a:
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r1 = r3.f8180g     // Catch:{ all -> 0x0022 }
            java.lang.Object r4 = r1.get(r4)     // Catch:{ all -> 0x0022 }
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4     // Catch:{ all -> 0x0022 }
            if (r4 != 0) goto L_0x0015
            goto L_0x001c
        L_0x0015:
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x0022 }
            r2 = r4
            android.view.View r2 = (android.view.View) r2     // Catch:{ all -> 0x0022 }
        L_0x001c:
            d.g.b.a.b.b r4 = p101d.p129g.p131b.p132a.p134b.C5468d.m20961a(r2)     // Catch:{ all -> 0x0022 }
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return r4
        L_0x0022:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2650Qv.mo8762h(java.lang.String):d.g.b.a.b.b");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f8175b
            monitor-enter(r0)
            com.google.android.gms.internal.ads.Cv r1 = r8.f8182i     // Catch:{ all -> 0x008e }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
            return
        L_0x0009:
            com.google.android.gms.internal.ads.Cv r1 = r8.f8182i     // Catch:{ all -> 0x008e }
            r1.mo7878A()     // Catch:{ all -> 0x008e }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x008e }
            r5.<init>()     // Catch:{ all -> 0x008e }
            java.lang.String r1 = "x"
            android.graphics.Point r2 = r8.f8184k     // Catch:{ all -> 0x008e }
            int r2 = r2.x     // Catch:{ all -> 0x008e }
            int r2 = r8.m11014i(r2)     // Catch:{ all -> 0x008e }
            float r2 = (float) r2     // Catch:{ all -> 0x008e }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x008e }
            java.lang.String r1 = "y"
            android.graphics.Point r2 = r8.f8184k     // Catch:{ all -> 0x008e }
            int r2 = r2.y     // Catch:{ all -> 0x008e }
            int r2 = r8.m11014i(r2)     // Catch:{ all -> 0x008e }
            float r2 = (float) r2     // Catch:{ all -> 0x008e }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x008e }
            java.lang.String r1 = "start_x"
            android.graphics.Point r2 = r8.f8185l     // Catch:{ all -> 0x008e }
            int r2 = r2.x     // Catch:{ all -> 0x008e }
            int r2 = r8.m11014i(r2)     // Catch:{ all -> 0x008e }
            float r2 = (float) r2     // Catch:{ all -> 0x008e }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x008e }
            java.lang.String r1 = "start_y"
            android.graphics.Point r2 = r8.f8185l     // Catch:{ all -> 0x008e }
            int r2 = r2.y     // Catch:{ all -> 0x008e }
            int r2 = r8.m11014i(r2)     // Catch:{ all -> 0x008e }
            float r2 = (float) r2     // Catch:{ all -> 0x008e }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x008e }
            android.view.View r1 = r8.f8181h     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x0083
            android.view.View r1 = r8.f8181h     // Catch:{ all -> 0x008e }
            boolean r1 = r1.equals(r9)     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x0083
            com.google.android.gms.internal.ads.Cv r1 = r8.f8182i     // Catch:{ all -> 0x008e }
            boolean r1 = r1 instanceof com.google.android.gms.internal.ads.C2215Bv     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x007a
            com.google.android.gms.internal.ads.Cv r1 = r8.f8182i     // Catch:{ all -> 0x008e }
            com.google.android.gms.internal.ads.Bv r1 = (com.google.android.gms.internal.ads.C2215Bv) r1     // Catch:{ all -> 0x008e }
            com.google.android.gms.internal.ads.Cv r1 = r1.mo7895d()     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x008c
            com.google.android.gms.internal.ads.Cv r1 = r8.f8182i     // Catch:{ all -> 0x008e }
            com.google.android.gms.internal.ads.Bv r1 = (com.google.android.gms.internal.ads.C2215Bv) r1     // Catch:{ all -> 0x008e }
            com.google.android.gms.internal.ads.Cv r2 = r1.mo7895d()     // Catch:{ all -> 0x008e }
            java.lang.String r4 = "1007"
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6 = r8.f8180g     // Catch:{ all -> 0x008e }
            android.widget.FrameLayout r7 = r8.f8176c     // Catch:{ all -> 0x008e }
        L_0x0075:
            r3 = r9
            r2.mo7959a(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x008e }
            goto L_0x008c
        L_0x007a:
            com.google.android.gms.internal.ads.Cv r2 = r8.f8182i     // Catch:{ all -> 0x008e }
            java.lang.String r4 = "1007"
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6 = r8.f8180g     // Catch:{ all -> 0x008e }
            android.widget.FrameLayout r7 = r8.f8176c     // Catch:{ all -> 0x008e }
            goto L_0x0075
        L_0x0083:
            com.google.android.gms.internal.ads.Cv r1 = r8.f8182i     // Catch:{ all -> 0x008e }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r2 = r8.f8180g     // Catch:{ all -> 0x008e }
            android.widget.FrameLayout r3 = r8.f8176c     // Catch:{ all -> 0x008e }
            r1.mo7889a(r9, r2, r5, r3)     // Catch:{ all -> 0x008e }
        L_0x008c:
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
            return
        L_0x008e:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2650Qv.onClick(android.view.View):void");
    }

    public final void onGlobalLayout() {
        synchronized (this.f8175b) {
            m11012bc();
            if (this.f8182i != null) {
                this.f8182i.mo7962c(this.f8176c, this.f8180g);
            }
        }
    }

    public final void onScrollChanged() {
        synchronized (this.f8175b) {
            if (this.f8182i != null) {
                this.f8182i.mo7962c(this.f8176c, this.f8180g);
            }
            m11012bc();
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized (this.f8175b) {
            if (this.f8182i == null) {
                return false;
            }
            int[] iArr = new int[2];
            this.f8176c.getLocationOnScreen(iArr);
            Point point = new Point((int) (motionEvent.getRawX() - ((float) iArr[0])), (int) (motionEvent.getRawY() - ((float) iArr[1])));
            this.f8184k = point;
            if (motionEvent.getAction() == 0) {
                this.f8185l = point;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setLocation((float) point.x, (float) point.y);
            this.f8182i.mo7957a(obtain);
            obtain.recycle();
            return false;
        }
    }
}
