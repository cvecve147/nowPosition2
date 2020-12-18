package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.ads.internal.gmsg.C1718E;
import com.google.android.gms.ads.internal.gmsg.C1728b;
import com.google.android.gms.ads.internal.gmsg.HttpClient;
import com.google.android.gms.common.C1997i;
import com.google.android.gms.common.C2063j;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Ab */
public final class C2166Ab extends C2717Td {

    /* renamed from: d */
    private static final long f6659d = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: e */
    private static final Object f6660e = new Object();

    /* renamed from: f */
    private static boolean f6661f = false;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static C2275Dy f6662g = null;

    /* renamed from: h */
    private static HttpClient f6663h = null;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static C1728b f6664i = null;

    /* renamed from: j */
    private static C1718E<Object> f6665j = null;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C2536Na f6666k;

    /* renamed from: l */
    private final C3196jb f6667l;

    /* renamed from: m */
    private final Object f6668m = new Object();

    /* renamed from: n */
    private final Context f6669n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C2653Qy f6670o;

    /* renamed from: p */
    private C3389ps f6671p;

    public C2166Ab(Context context, C3196jb jbVar, C2536Na na, C3389ps psVar) {
        super(true);
        this.f6666k = na;
        this.f6669n = context;
        this.f6667l = jbVar;
        this.f6671p = psVar;
        synchronized (f6660e) {
            if (!f6661f) {
                f6664i = new C1728b();
                f6663h = new HttpClient(context.getApplicationContext(), jbVar.f9582j);
                f6665j = new C2395Ib();
                f6662g = new C2275Dy(this.f6669n.getApplicationContext(), this.f6667l.f9582j, (String) C3390pt.m13458f().mo8515a(C2558Nu.f7863b), new C2367Hb(), new C2337Gb());
                f6661f = true;
            }
        }
    }

    /* renamed from: a */
    private final zzaej m9313a(zzaef zzaef) {
        C1697X.m7698e();
        String a = C3114ge.m12399a();
        JSONObject a2 = m9314a(zzaef, a);
        if (a2 == null) {
            return new zzaej(0);
        }
        long b = C1697X.m7705l().mo7726b();
        Future<JSONObject> a3 = f6664i.mo6934a(a);
        C3432rf.f10110a.post(new C2223Cb(this, a2, a));
        try {
            JSONObject jSONObject = a3.get(f6659d - (C1697X.m7705l().mo7726b() - b), TimeUnit.MILLISECONDS);
            if (jSONObject == null) {
                return new zzaej(-1);
            }
            zzaej a4 = C2656Rb.m11026a(this.f6669n, zzaef, jSONObject.toString());
            return (a4.f10807f == -3 || !TextUtils.isEmpty(a4.f10805d)) ? a4 : new zzaej(3);
        } catch (InterruptedException | CancellationException unused) {
            return new zzaej(-1);
        } catch (TimeoutException unused2) {
            return new zzaej(2);
        } catch (ExecutionException unused3) {
            return new zzaej(0);
        }
    }

    /* renamed from: a */
    private final JSONObject m9314a(zzaef zzaef, String str) {
        C2909_b _bVar;
        AdvertisingIdClient.Info info;
        Bundle bundle = zzaef.f10753c.f10877c.getBundle("sdk_less_server_data");
        if (bundle == null) {
            return null;
        }
        try {
            _bVar = C1697X.m7709p().mo9225a(this.f6669n).get();
        } catch (Exception e) {
            C2227Cf.m9535c("Error grabbing device info: ", e);
            _bVar = null;
        }
        Context context = this.f6669n;
        C2451Kb kb = new C2451Kb();
        kb.f7422j = zzaef;
        kb.f7423k = _bVar;
        JSONObject a = C2656Rb.m11030a(context, kb);
        if (a == null) {
            return null;
        }
        try {
            info = AdvertisingIdClient.getAdvertisingIdInfo(this.f6669n);
        } catch (C1997i | C2063j | IOException | IllegalStateException e2) {
            C2227Cf.m9535c("Cannot get advertising id info", e2);
            info = null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("request_id", str);
        hashMap.put("request_param", a);
        hashMap.put("data", bundle);
        if (info != null) {
            hashMap.put("adid", info.getId());
            hashMap.put("lat", Integer.valueOf(info.isLimitAdTrackingEnabled() ? 1 : 0));
        }
        try {
            return C1697X.m7698e().mo9447a((Map<String, ?>) hashMap);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    protected static void m9315a(C3452ry ryVar) {
        ryVar.mo9186b("/loadAd", f6664i);
        ryVar.mo9186b("/fetchHttpRequest", f6663h);
        ryVar.mo9186b("/invalidRequest", f6665j);
    }

    /* renamed from: b */
    protected static void m9317b(C3452ry ryVar) {
        ryVar.mo9185a("/loadAd", f6664i);
        ryVar.mo9185a("/fetchHttpRequest", f6663h);
        ryVar.mo9185a("/invalidRequest", f6665j);
    }

    /* renamed from: c */
    public final void mo7015c() {
        synchronized (this.f6668m) {
            C3432rf.f10110a.post(new C2309Fb(this));
        }
    }

    /* renamed from: d */
    public final void mo7016d() {
        C2227Cf.m9532b("SdkLessAdLoaderBackgroundTask started.");
        String b = C1697X.m7689B().mo10035b(this.f6669n);
        zzaef zzaef = new zzaef(this.f6667l, -1, C1697X.m7689B().mo10049k(this.f6669n), C1697X.m7689B().mo10031a(this.f6669n), b);
        C1697X.m7689B().mo10043f(this.f6669n, b);
        zzaej a = m9313a(zzaef);
        long b2 = C1697X.m7705l().mo7726b();
        zzaef zzaef2 = zzaef;
        C3432rf.f10110a.post(new C2195Bb(this, new C2282Ed(zzaef2, a, (C3596wz) null, (zzjn) null, a.f10807f, b2, a.f10816o, (JSONObject) null, this.f6671p)));
    }
}
