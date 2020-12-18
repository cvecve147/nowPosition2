package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.C1678D;
import com.google.android.gms.ads.internal.C1690P;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.ads.internal.gmsg.C1741o;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.ha */
public final class C3138ha {

    /* renamed from: a */
    private final Object f9395a = new Object();

    /* renamed from: b */
    private final Context f9396b;

    /* renamed from: c */
    private final C2209Bp f9397c;

    /* renamed from: d */
    private final C2282Ed f9398d;

    /* renamed from: e */
    private final C2930_u f9399e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C1678D f9400f;

    /* renamed from: g */
    private ViewTreeObserver.OnGlobalLayoutListener f9401g;

    /* renamed from: h */
    private ViewTreeObserver.OnScrollChangedListener f9402h;

    /* renamed from: i */
    private final DisplayMetrics f9403i;

    /* renamed from: j */
    private C3115gf f9404j;

    /* renamed from: k */
    private int f9405k = -1;

    /* renamed from: l */
    private int f9406l = -1;

    public C3138ha(Context context, C2209Bp bp, C2282Ed ed, C2930_u _uVar, C1678D d) {
        this.f9396b = context;
        this.f9397c = bp;
        this.f9398d = ed;
        this.f9399e = _uVar;
        this.f9400f = d;
        this.f9404j = new C3115gf(200);
        C1697X.m7698e();
        this.f9403i = C3114ge.m12395a((WindowManager) context.getSystemService("window"));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m12510a(WeakReference<C3520uh> weakReference, boolean z) {
        C3520uh uhVar;
        if (weakReference != null && (uhVar = (C3520uh) weakReference.get()) != null && uhVar.getView() != null) {
            if (!z || this.f9404j.mo9462a()) {
                int[] iArr = new int[2];
                uhVar.getView().getLocationOnScreen(iArr);
                C3390pt.m13453a();
                boolean z2 = false;
                int b = C3432rf.m13606b(this.f9403i, iArr[0]);
                C3390pt.m13453a();
                int b2 = C3432rf.m13606b(this.f9403i, iArr[1]);
                synchronized (this.f9395a) {
                    if (!(this.f9405k == b && this.f9406l == b2)) {
                        this.f9405k = b;
                        this.f9406l = b2;
                        C2974bi mb = uhVar.mo8182mb();
                        int i = this.f9405k;
                        int i2 = this.f9406l;
                        if (!z) {
                            z2 = true;
                        }
                        mb.mo9227a(i, i2, z2);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo9486a(C3116gg ggVar, C3520uh uhVar, boolean z) {
        this.f9400f.mo6769rc();
        ggVar.mo9464b(uhVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo9487a(JSONObject jSONObject, C3116gg ggVar) {
        try {
            C1697X.m7699f();
            C3520uh a = C2201Bh.m9441a(this.f9396b, C3146hi.m12526b(), "native-video", false, false, this.f9397c, this.f9398d.f6942a.f10762k, this.f9399e, (C1690P) null, this.f9400f.mo6879kb(), this.f9398d.f6950i);
            a.mo8145a(C3146hi.m12527c());
            this.f9400f.mo6746a(a);
            WeakReference weakReference = new WeakReference(a);
            C2974bi mb = a.mo8182mb();
            if (this.f9401g == null) {
                this.f9401g = new C3313na(this, weakReference);
            }
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f9401g;
            if (this.f9402h == null) {
                this.f9402h = new C3342oa(this, weakReference);
            }
            mb.mo9228a(onGlobalLayoutListener, this.f9402h);
            a.mo8157b("/video", C1741o.f5727m);
            a.mo8157b("/videoMeta", C1741o.f5728n);
            a.mo8157b("/precache", new C3202jh());
            a.mo8157b("/delayPageLoaded", C1741o.f5731q);
            a.mo8157b("/instrument", C1741o.f5729o);
            a.mo8157b("/log", C1741o.f5722h);
            a.mo8157b("/videoClicked", C1741o.f5723i);
            a.mo8157b("/trackActiveViewUnit", new C3256la(this));
            a.mo8157b("/untrackActiveViewUnit", new C3285ma(this));
            a.mo8182mb().mo9231a((C3031di) new C3195ja(a, jSONObject));
            a.mo8182mb().mo9230a((C3003ci) new C3228ka(this, ggVar, a));
            a.loadUrl((String) C3390pt.m13458f().mo8515a(C2558Nu.f7803Qc));
        } catch (Exception e) {
            C2227Cf.m9535c("Exception occurred while getting video view", e);
            ggVar.mo9464b(null);
        }
    }
}
