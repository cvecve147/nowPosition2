package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.C1697X;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p134b.C5468d;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Sv */
public final class C2708Sv extends C3189iw implements View.OnClickListener, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a */
    static final String[] f8310a = {"2011", "1009", "3010"};

    /* renamed from: b */
    private final Object f8311b = new Object();

    /* renamed from: c */
    private final WeakReference<View> f8312c;

    /* renamed from: d */
    private final Map<String, WeakReference<View>> f8313d = new HashMap();

    /* renamed from: e */
    private final Map<String, WeakReference<View>> f8314e = new HashMap();

    /* renamed from: f */
    private final Map<String, WeakReference<View>> f8315f = new HashMap();

    /* renamed from: g */
    private C2244Cv f8316g;

    /* renamed from: h */
    private View f8317h;

    /* renamed from: i */
    private Point f8318i = new Point();

    /* renamed from: j */
    private Point f8319j = new Point();

    /* renamed from: k */
    private WeakReference<C3217jr> f8320k = new WeakReference<>((Object) null);

    public C2708Sv(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        C1697X.m7688A();
        C3348og.m13242a(view, (ViewTreeObserver.OnGlobalLayoutListener) this);
        C1697X.m7688A();
        C3348og.m13243a(view, (ViewTreeObserver.OnScrollChangedListener) this);
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        this.f8312c = new WeakReference<>(view);
        for (Map.Entry next : hashMap.entrySet()) {
            String str = (String) next.getKey();
            View view2 = (View) next.getValue();
            if (view2 != null) {
                this.f8313d.put(str, new WeakReference(view2));
                if (!"1098".equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.f8315f.putAll(this.f8313d);
        for (Map.Entry next2 : hashMap2.entrySet()) {
            View view3 = (View) next2.getValue();
            if (view3 != null) {
                this.f8314e.put((String) next2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
            }
        }
        this.f8315f.putAll(this.f8314e);
        C2558Nu.m10773a(view.getContext());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m11217a(com.google.android.gms.internal.ads.C2387Hv r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f8311b
            monitor-enter(r0)
            java.lang.String[] r1 = f8310a     // Catch:{ all -> 0x003b }
            int r2 = r1.length     // Catch:{ all -> 0x003b }
            r3 = 0
        L_0x0007:
            if (r3 >= r2) goto L_0x001f
            r4 = r1[r3]     // Catch:{ all -> 0x003b }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5 = r6.f8315f     // Catch:{ all -> 0x003b }
            java.lang.Object r4 = r5.get(r4)     // Catch:{ all -> 0x003b }
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4     // Catch:{ all -> 0x003b }
            if (r4 == 0) goto L_0x001c
            java.lang.Object r1 = r4.get()     // Catch:{ all -> 0x003b }
            android.view.View r1 = (android.view.View) r1     // Catch:{ all -> 0x003b }
            goto L_0x0020
        L_0x001c:
            int r3 = r3 + 1
            goto L_0x0007
        L_0x001f:
            r1 = 0
        L_0x0020:
            boolean r2 = r1 instanceof android.widget.FrameLayout     // Catch:{ all -> 0x003b }
            if (r2 != 0) goto L_0x0029
            r7.mo7882Db()     // Catch:{ all -> 0x003b }
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            return
        L_0x0029:
            com.google.android.gms.internal.ads.Uv r2 = new com.google.android.gms.internal.ads.Uv     // Catch:{ all -> 0x003b }
            r2.<init>(r6, r1)     // Catch:{ all -> 0x003b }
            boolean r3 = r7 instanceof com.google.android.gms.internal.ads.C2215Bv     // Catch:{ all -> 0x003b }
            if (r3 == 0) goto L_0x0036
            r7.mo8306b((android.view.View) r1, (com.google.android.gms.internal.ads.C2187Av) r2)     // Catch:{ all -> 0x003b }
            goto L_0x0039
        L_0x0036:
            r7.mo7958a((android.view.View) r1, (com.google.android.gms.internal.ads.C2187Av) r2)     // Catch:{ all -> 0x003b }
        L_0x0039:
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            return
        L_0x003b:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2708Sv.m11217a(com.google.android.gms.internal.ads.Hv):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m11220a(String[] strArr) {
        for (String str : strArr) {
            if (this.f8313d.get(str) != null) {
                return true;
            }
        }
        for (String str2 : strArr) {
            if (this.f8314e.get(str2) != null) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: c */
    private final void m11221c(View view) {
        synchronized (this.f8311b) {
            if (this.f8316g != null) {
                C2244Cv d = this.f8316g instanceof C2215Bv ? ((C2215Bv) this.f8316g).mo7895d() : this.f8316g;
                if (d != null) {
                    d.mo7960b(view);
                }
            }
        }
    }

    /* renamed from: i */
    private final int m11222i(int i) {
        int b;
        synchronized (this.f8311b) {
            C3390pt.m13453a();
            b = C3432rf.m13605b(this.f8316g.getContext(), i);
        }
        return b;
    }

    /* renamed from: Pa */
    public final void mo8851Pa() {
        synchronized (this.f8311b) {
            this.f8317h = null;
            this.f8316g = null;
            this.f8318i = null;
            this.f8319j = null;
        }
    }

    /* renamed from: d */
    public final void mo8852d(C5464b bVar) {
        int i;
        KeyEvent.Callback callback;
        synchronized (this.f8311b) {
            ViewGroup viewGroup = null;
            m11221c((View) null);
            Object z = C5468d.m20962z(bVar);
            if (!(z instanceof C2387Hv)) {
                C2227Cf.m9536d("Not an instance of native engine. This is most likely a transient error");
                return;
            }
            C2387Hv hv = (C2387Hv) z;
            if (!hv.mo7880Bb()) {
                C2227Cf.m9529a("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
                return;
            }
            View view = (View) this.f8312c.get();
            if (!(this.f8316g == null || view == null)) {
                if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7815Sc)).booleanValue()) {
                    this.f8316g.mo7888a(view, this.f8315f);
                }
            }
            synchronized (this.f8311b) {
                i = 0;
                if (this.f8316g instanceof C2387Hv) {
                    C2387Hv hv2 = (C2387Hv) this.f8316g;
                    View view2 = (View) this.f8312c.get();
                    if (!(hv2 == null || hv2.getContext() == null || view2 == null || !C1697X.m7689B().mo10044f(view2.getContext()))) {
                        C3459sd b = hv2.mo8305b();
                        if (b != null) {
                            b.mo9995a(false);
                        }
                        C3217jr jrVar = (C3217jr) this.f8320k.get();
                        if (!(jrVar == null || b == null)) {
                            jrVar.mo9612b((C3331nr) b);
                        }
                    }
                }
            }
            if (!(this.f8316g instanceof C2215Bv) || !((C2215Bv) this.f8316g).mo7894c()) {
                this.f8316g = hv;
                if (hv instanceof C2215Bv) {
                    ((C2215Bv) hv).mo7891a((C2244Cv) null);
                }
            } else {
                ((C2215Bv) this.f8316g).mo7891a((C2244Cv) hv);
            }
            String[] strArr = {"1098", "3011"};
            while (true) {
                if (i >= 2) {
                    callback = null;
                    break;
                }
                WeakReference weakReference = this.f8315f.get(strArr[i]);
                if (weakReference != null) {
                    callback = (View) weakReference.get();
                    break;
                }
                i++;
            }
            if (callback == null) {
                C2227Cf.m9536d("Ad choices asset view is not provided.");
            } else {
                if (callback instanceof ViewGroup) {
                    viewGroup = (ViewGroup) callback;
                }
                if (viewGroup != null) {
                    this.f8317h = hv.mo7885a((View.OnClickListener) this, true);
                    if (this.f8317h != null) {
                        this.f8315f.put("1007", new WeakReference(this.f8317h));
                        this.f8313d.put("1007", new WeakReference(this.f8317h));
                        viewGroup.removeAllViews();
                        viewGroup.addView(this.f8317h);
                    }
                }
            }
            hv.mo7890a(view, this.f8313d, this.f8314e, (View.OnTouchListener) this, (View.OnClickListener) this);
            C3114ge.f9351a.post(new C2737Tv(this, hv));
            m11221c(view);
            this.f8316g.mo7961c(view);
            synchronized (this.f8311b) {
                if (this.f8316g instanceof C2387Hv) {
                    C2387Hv hv3 = (C2387Hv) this.f8316g;
                    View view3 = (View) this.f8312c.get();
                    if (!(hv3 == null || hv3.getContext() == null || view3 == null || !C1697X.m7689B().mo10044f(view3.getContext()))) {
                        C3217jr jrVar2 = (C3217jr) this.f8320k.get();
                        if (jrVar2 == null) {
                            jrVar2 = new C3217jr(view3.getContext(), view3);
                            this.f8320k = new WeakReference<>(jrVar2);
                        }
                        jrVar2.mo9611a((C3331nr) hv3.mo8305b());
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo8853e(C5464b bVar) {
        synchronized (this.f8311b) {
            this.f8316g.mo7887a((View) C5468d.m20962z(bVar));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f8311b
            monitor-enter(r0)
            com.google.android.gms.internal.ads.Cv r1 = r8.f8316g     // Catch:{ all -> 0x0090 }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
            return
        L_0x0009:
            java.lang.ref.WeakReference<android.view.View> r1 = r8.f8312c     // Catch:{ all -> 0x0090 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0090 }
            r7 = r1
            android.view.View r7 = (android.view.View) r7     // Catch:{ all -> 0x0090 }
            if (r7 != 0) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
            return
        L_0x0016:
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x0090 }
            r5.<init>()     // Catch:{ all -> 0x0090 }
            java.lang.String r1 = "x"
            android.graphics.Point r2 = r8.f8318i     // Catch:{ all -> 0x0090 }
            int r2 = r2.x     // Catch:{ all -> 0x0090 }
            int r2 = r8.m11222i(r2)     // Catch:{ all -> 0x0090 }
            float r2 = (float) r2     // Catch:{ all -> 0x0090 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x0090 }
            java.lang.String r1 = "y"
            android.graphics.Point r2 = r8.f8318i     // Catch:{ all -> 0x0090 }
            int r2 = r2.y     // Catch:{ all -> 0x0090 }
            int r2 = r8.m11222i(r2)     // Catch:{ all -> 0x0090 }
            float r2 = (float) r2     // Catch:{ all -> 0x0090 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x0090 }
            java.lang.String r1 = "start_x"
            android.graphics.Point r2 = r8.f8319j     // Catch:{ all -> 0x0090 }
            int r2 = r2.x     // Catch:{ all -> 0x0090 }
            int r2 = r8.m11222i(r2)     // Catch:{ all -> 0x0090 }
            float r2 = (float) r2     // Catch:{ all -> 0x0090 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x0090 }
            java.lang.String r1 = "start_y"
            android.graphics.Point r2 = r8.f8319j     // Catch:{ all -> 0x0090 }
            int r2 = r2.y     // Catch:{ all -> 0x0090 }
            int r2 = r8.m11222i(r2)     // Catch:{ all -> 0x0090 }
            float r2 = (float) r2     // Catch:{ all -> 0x0090 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x0090 }
            android.view.View r1 = r8.f8317h     // Catch:{ all -> 0x0090 }
            if (r1 == 0) goto L_0x0087
            android.view.View r1 = r8.f8317h     // Catch:{ all -> 0x0090 }
            boolean r1 = r1.equals(r9)     // Catch:{ all -> 0x0090 }
            if (r1 == 0) goto L_0x0087
            com.google.android.gms.internal.ads.Cv r1 = r8.f8316g     // Catch:{ all -> 0x0090 }
            boolean r1 = r1 instanceof com.google.android.gms.internal.ads.C2215Bv     // Catch:{ all -> 0x0090 }
            if (r1 == 0) goto L_0x0080
            com.google.android.gms.internal.ads.Cv r1 = r8.f8316g     // Catch:{ all -> 0x0090 }
            com.google.android.gms.internal.ads.Bv r1 = (com.google.android.gms.internal.ads.C2215Bv) r1     // Catch:{ all -> 0x0090 }
            com.google.android.gms.internal.ads.Cv r1 = r1.mo7895d()     // Catch:{ all -> 0x0090 }
            if (r1 == 0) goto L_0x008e
            com.google.android.gms.internal.ads.Cv r1 = r8.f8316g     // Catch:{ all -> 0x0090 }
            com.google.android.gms.internal.ads.Bv r1 = (com.google.android.gms.internal.ads.C2215Bv) r1     // Catch:{ all -> 0x0090 }
            com.google.android.gms.internal.ads.Cv r2 = r1.mo7895d()     // Catch:{ all -> 0x0090 }
            java.lang.String r4 = "1007"
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6 = r8.f8315f     // Catch:{ all -> 0x0090 }
        L_0x007b:
            r3 = r9
            r2.mo7959a(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0090 }
            goto L_0x008e
        L_0x0080:
            com.google.android.gms.internal.ads.Cv r2 = r8.f8316g     // Catch:{ all -> 0x0090 }
            java.lang.String r4 = "1007"
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6 = r8.f8315f     // Catch:{ all -> 0x0090 }
            goto L_0x007b
        L_0x0087:
            com.google.android.gms.internal.ads.Cv r1 = r8.f8316g     // Catch:{ all -> 0x0090 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r2 = r8.f8315f     // Catch:{ all -> 0x0090 }
            r1.mo7889a(r9, r2, r5, r7)     // Catch:{ all -> 0x0090 }
        L_0x008e:
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
            return
        L_0x0090:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2708Sv.onClick(android.view.View):void");
    }

    public final void onGlobalLayout() {
        View view;
        synchronized (this.f8311b) {
            if (!(this.f8316g == null || (view = (View) this.f8312c.get()) == null)) {
                this.f8316g.mo7962c(view, this.f8315f);
            }
        }
    }

    public final void onScrollChanged() {
        View view;
        synchronized (this.f8311b) {
            if (!(this.f8316g == null || (view = (View) this.f8312c.get()) == null)) {
                this.f8316g.mo7962c(view, this.f8315f);
            }
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized (this.f8311b) {
            if (this.f8316g == null) {
                return false;
            }
            View view2 = (View) this.f8312c.get();
            if (view2 == null) {
                return false;
            }
            int[] iArr = new int[2];
            view2.getLocationOnScreen(iArr);
            Point point = new Point((int) (motionEvent.getRawX() - ((float) iArr[0])), (int) (motionEvent.getRawY() - ((float) iArr[1])));
            this.f8318i = point;
            if (motionEvent.getAction() == 0) {
                this.f8319j = point;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setLocation((float) point.x, (float) point.y);
            this.f8316g.mo7957a(obtain);
            obtain.recycle();
            return false;
        }
    }
}
