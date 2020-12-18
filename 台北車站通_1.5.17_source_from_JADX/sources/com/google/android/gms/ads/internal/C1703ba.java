package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.gms.ads.internal.overlay.C1781m;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.common.p072c.C1989c;
import com.google.android.gms.internal.ads.C2166Ab;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C2254Dd;
import com.google.android.gms.internal.ads.C2302Ew;
import com.google.android.gms.internal.ads.C2311Fd;
import com.google.android.gms.internal.ads.C2325Fr;
import com.google.android.gms.internal.ads.C2333Fz;
import com.google.android.gms.internal.ads.C2369Hd;
import com.google.android.gms.internal.ads.C2478La;
import com.google.android.gms.internal.ads.C2483Lf;
import com.google.android.gms.internal.ads.C2533Mz;
import com.google.android.gms.internal.ads.C2558Nu;
import com.google.android.gms.internal.ads.C2565Oa;
import com.google.android.gms.internal.ads.C2626Pz;
import com.google.android.gms.internal.ads.C2717Td;
import com.google.android.gms.internal.ads.C2791Vt;
import com.google.android.gms.internal.ads.C2804Wf;
import com.google.android.gms.internal.ads.C2878Yx;
import com.google.android.gms.internal.ads.C2930_u;
import com.google.android.gms.internal.ads.C2972bg;
import com.google.android.gms.internal.ads.C3057ee;
import com.google.android.gms.internal.ads.C3114ge;
import com.google.android.gms.internal.ads.C3196jb;
import com.google.android.gms.internal.ads.C3289me;
import com.google.android.gms.internal.ads.C3332ns;
import com.google.android.gms.internal.ads.C3389ps;
import com.google.android.gms.internal.ads.C3390pt;
import com.google.android.gms.internal.ads.C3507tw;
import com.google.android.gms.internal.ads.C3520uh;
import com.google.android.gms.internal.ads.C3568vz;
import com.google.android.gms.internal.ads.C3596wz;
import com.google.android.gms.internal.ads.C3624xz;
import com.google.android.gms.internal.ads.C3681zz;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzlu;
import com.google.android.gms.internal.ads.zzpl;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.ads.internal.ba */
public abstract class C1703ba extends C1700a implements C1781m, C1690P, C3624xz {

    /* renamed from: m */
    protected final C2533Mz f5658m;

    /* renamed from: n */
    private transient boolean f5659n;

    public C1703ba(Context context, zzjn zzjn, String str, C2533Mz mz, zzang zzang, C1804ua uaVar) {
        this(new C1698Y(context, zzjn, str, zzang), mz, (C1687M) null, uaVar);
    }

    private C1703ba(C1698Y y, C2533Mz mz, C1687M m, C1804ua uaVar) {
        super(y, (C1687M) null, uaVar);
        this.f5658m = mz;
        this.f5659n = false;
    }

    /* renamed from: a */
    private final C3196jb m7797a(zzjj zzjj, Bundle bundle, C2369Hd hd, int i) {
        PackageInfo packageInfo;
        Bundle bundle2;
        String str;
        JSONArray optJSONArray;
        ApplicationInfo applicationInfo = this.f5648f.f5616c.getApplicationInfo();
        int i2 = 0;
        try {
            packageInfo = C1989c.m8748b(this.f5648f.f5616c).mo7521b(applicationInfo.packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        DisplayMetrics displayMetrics = this.f5648f.f5616c.getResources().getDisplayMetrics();
        C1699Z z = this.f5648f.f5619f;
        if (z == null || z.getParent() == null) {
            bundle2 = null;
        } else {
            int[] iArr = new int[2];
            this.f5648f.f5619f.getLocationOnScreen(iArr);
            int i3 = iArr[0];
            int i4 = 1;
            int i5 = iArr[1];
            int width = this.f5648f.f5619f.getWidth();
            int height = this.f5648f.f5619f.getHeight();
            if (!this.f5648f.f5619f.isShown() || i3 + width <= 0 || i5 + height <= 0 || i3 > displayMetrics.widthPixels || i5 > displayMetrics.heightPixels) {
                i4 = 0;
            }
            Bundle bundle3 = new Bundle(5);
            bundle3.putInt("x", i3);
            bundle3.putInt("y", i5);
            bundle3.putInt("width", width);
            bundle3.putInt("height", height);
            bundle3.putInt("visible", i4);
            bundle2 = bundle3;
        }
        String a = C1697X.m7702i().mo8323c().mo8662a();
        C1698Y y = this.f5648f;
        y.f5625l = new C2311Fd(a, y.f5615b);
        this.f5648f.f5625l.mo8068a(zzjj);
        C1697X.m7698e();
        C1698Y y2 = this.f5648f;
        String a2 = C3114ge.m12400a(y2.f5616c, (View) y2.f5619f, y2.f5622i);
        long j = 0;
        C2791Vt vt = this.f5648f.f5630q;
        if (vt != null) {
            try {
                j = vt.getValue();
            } catch (RemoteException unused2) {
                C2227Cf.m9536d("Cannot get correlation id, default to 0.");
            }
        }
        long j2 = j;
        String uuid = UUID.randomUUID().toString();
        Bundle a3 = C1697X.m7703j().mo8771a(this.f5648f.f5616c, this, a);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i6 = 0; i6 < this.f5648f.f5635v.size(); i6++) {
            String b = this.f5648f.f5635v.mo5236b(i6);
            arrayList.add(b);
            if (this.f5648f.f5634u.containsKey(b) && this.f5648f.f5634u.get(b) != null) {
                arrayList2.add(b);
            }
        }
        C2804Wf a4 = C3057ee.m12270a(new C1709ea(this));
        C2804Wf a5 = C3057ee.m12270a(new C1711fa(this));
        String c = hd != null ? hd.mo8256c() : null;
        List<String> list = this.f5648f.f5602F;
        if (list != null && list.size() > 0) {
            if (packageInfo != null) {
                i2 = packageInfo.versionCode;
            }
            if (i2 > C1697X.m7702i().mo8333m().mo9157g()) {
                C1697X.m7702i().mo8333m().mo9163m();
                C1697X.m7702i().mo8333m().mo9134a(i2);
            } else {
                JSONObject l = C1697X.m7702i().mo8333m().mo9162l();
                if (!(l == null || (optJSONArray = l.optJSONArray(this.f5648f.f5615b)) == null)) {
                    str = optJSONArray.toString();
                    C1698Y y3 = this.f5648f;
                    zzjn zzjn = y3.f5622i;
                    String str2 = y3.f5615b;
                    String c2 = C3390pt.m13455c();
                    C1698Y y4 = this.f5648f;
                    ArrayList arrayList3 = arrayList2;
                    zzang zzang = y4.f5618e;
                    ArrayList arrayList4 = arrayList3;
                    ArrayList arrayList5 = arrayList;
                    List<String> list2 = y4.f5602F;
                    boolean a6 = C1697X.m7702i().mo8333m().mo9141a();
                    int i7 = displayMetrics.widthPixels;
                    int i8 = displayMetrics.heightPixels;
                    float f = displayMetrics.density;
                    List<String> a7 = C2558Nu.m10772a();
                    C1698Y y5 = this.f5648f;
                    String str3 = y5.f5614a;
                    zzpl zzpl = y5.f5636w;
                    String f2 = y5.mo6844f();
                    float a8 = C1697X.m7691D().mo10229a();
                    boolean b2 = C1697X.m7691D().mo10232b();
                    C1697X.m7698e();
                    int i9 = C3114ge.m12442i(this.f5648f.f5616c);
                    C1697X.m7698e();
                    int d = C3114ge.m12432d((View) this.f5648f.f5619f);
                    boolean z2 = this.f5648f.f5616c instanceof Activity;
                    boolean f3 = C1697X.m7702i().mo8333m().mo9156f();
                    boolean f4 = C1697X.m7702i().mo8326f();
                    int a9 = C1697X.m7719z().mo9389a();
                    C1697X.m7698e();
                    Bundle c3 = C3114ge.m12427c();
                    String a10 = C1697X.m7708o().mo8259a();
                    zzlu zzlu = this.f5648f.f5638y;
                    boolean b3 = C1697X.m7708o().mo8263b();
                    Bundle j3 = C2878Yx.m11651a().mo9090j();
                    boolean e = C1697X.m7702i().mo8333m().mo9154e(this.f5648f.f5615b);
                    C1698Y y6 = this.f5648f;
                    boolean a11 = C1989c.m8748b(y6.f5616c).mo7518a();
                    boolean g = C1697X.m7702i().mo8327g();
                    C1697X.m7700g();
                    C3196jb jbVar = r2;
                    C3196jb jbVar2 = new C3196jb(bundle2, zzjj, zzjn, str2, applicationInfo, packageInfo, a, c2, zzang, a3, list2, arrayList5, bundle, a6, i7, i8, f, a2, j2, uuid, a7, str3, zzpl, f2, a8, b2, i9, d, z2, f3, a4, c, f4, a9, c3, a10, zzlu, b3, j3, e, a5, y6.f5597A, str, arrayList4, i, a11, g, C3289me.m13059e(), (ArrayList) C2483Lf.m10501a(C1697X.m7702i().mo8334n(), null, 1000, TimeUnit.MILLISECONDS));
                    return jbVar;
                }
            }
        }
        str = null;
        C1698Y y32 = this.f5648f;
        zzjn zzjn2 = y32.f5622i;
        String str22 = y32.f5615b;
        String c22 = C3390pt.m13455c();
        C1698Y y42 = this.f5648f;
        ArrayList arrayList32 = arrayList2;
        zzang zzang2 = y42.f5618e;
        ArrayList arrayList42 = arrayList32;
        ArrayList arrayList52 = arrayList;
        List<String> list22 = y42.f5602F;
        boolean a62 = C1697X.m7702i().mo8333m().mo9141a();
        int i72 = displayMetrics.widthPixels;
        int i82 = displayMetrics.heightPixels;
        float f5 = displayMetrics.density;
        List<String> a72 = C2558Nu.m10772a();
        C1698Y y52 = this.f5648f;
        String str32 = y52.f5614a;
        zzpl zzpl2 = y52.f5636w;
        String f22 = y52.mo6844f();
        float a82 = C1697X.m7691D().mo10229a();
        boolean b22 = C1697X.m7691D().mo10232b();
        C1697X.m7698e();
        int i92 = C3114ge.m12442i(this.f5648f.f5616c);
        C1697X.m7698e();
        int d2 = C3114ge.m12432d((View) this.f5648f.f5619f);
        boolean z22 = this.f5648f.f5616c instanceof Activity;
        boolean f32 = C1697X.m7702i().mo8333m().mo9156f();
        boolean f42 = C1697X.m7702i().mo8326f();
        int a92 = C1697X.m7719z().mo9389a();
        C1697X.m7698e();
        Bundle c32 = C3114ge.m12427c();
        String a102 = C1697X.m7708o().mo8259a();
        zzlu zzlu2 = this.f5648f.f5638y;
        boolean b32 = C1697X.m7708o().mo8263b();
        Bundle j32 = C2878Yx.m11651a().mo9090j();
        boolean e2 = C1697X.m7702i().mo8333m().mo9154e(this.f5648f.f5615b);
        C1698Y y62 = this.f5648f;
        boolean a112 = C1989c.m8748b(y62.f5616c).mo7518a();
        boolean g2 = C1697X.m7702i().mo8327g();
        C1697X.m7700g();
        C3196jb jbVar3 = jbVar2;
        C3196jb jbVar22 = new C3196jb(bundle2, zzjj, zzjn2, str22, applicationInfo, packageInfo, a, c22, zzang2, a3, list22, arrayList52, bundle, a62, i72, i82, f5, a2, j2, uuid, a72, str32, zzpl2, f22, a82, b22, i92, d2, z22, f32, a4, c, f42, a92, c32, a102, zzlu2, b32, j32, e2, a5, y62.f5597A, str, arrayList42, i, a112, g2, C3289me.m13059e(), (ArrayList) C2483Lf.m10501a(C1697X.m7702i().mo8334n(), null, 1000, TimeUnit.MILLISECONDS));
        return jbVar3;
    }

    /* renamed from: c */
    static String m7798c(C2254Dd dd) {
        C3568vz vzVar;
        if (dd == null) {
            return null;
        }
        String str = dd.f6879r;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && (vzVar = dd.f6877p) != null) {
            try {
                return new JSONObject(vzVar.f10415k).getString("class_name");
            } catch (NullPointerException | JSONException unused) {
            }
        }
        return str;
    }

    /* renamed from: B */
    public void mo6735B() {
        C3520uh uhVar;
        C2626Pz pz;
        C2061y.m9072a("resume must be called on the main UI thread.");
        C2254Dd dd = this.f5648f.f5623j;
        if (dd == null || (uhVar = dd.f6863b) == null) {
            uhVar = null;
        }
        if (uhVar != null && this.f5648f.mo6842d()) {
            C1697X.m7700g();
            C3289me.m13058b(this.f5648f.f5623j.f6863b);
        }
        C2254Dd dd2 = this.f5648f.f5623j;
        if (!(dd2 == null || (pz = dd2.f6878q) == null)) {
            try {
                pz.mo8705B();
            } catch (RemoteException unused) {
                C2227Cf.m9536d("Could not resume mediation adapter.");
            }
        }
        if (uhVar == null || !uhVar.mo8193sb()) {
            this.f5647e.mo6786c();
        }
        this.f5650h.mo8556d(this.f5648f.f5623j);
    }

    /* renamed from: Db */
    public final void mo6792Db() {
        Executor executor = C2972bg.f8938a;
        C1687M m = this.f5647e;
        m.getClass();
        executor.execute(C1707da.m7829a(m));
    }

    /* renamed from: Eb */
    public final void mo6793Eb() {
        Executor executor = C2972bg.f8938a;
        C1687M m = this.f5647e;
        m.getClass();
        executor.execute(C1705ca.m7828a(m));
    }

    /* renamed from: Jb */
    public void mo6736Jb() {
        mo6490f();
    }

    /* renamed from: Nb */
    public final void mo6882Nb() {
        mo6897yb();
    }

    /* renamed from: O */
    public final String mo6796O() {
        C2254Dd dd = this.f5648f.f5623j;
        if (dd == null) {
            return null;
        }
        return m7798c(dd);
    }

    /* renamed from: Qb */
    public void mo6739Qb() {
        C2227Cf.m9536d("Mediated ad does not support onVideoEnd callback");
    }

    /* renamed from: Sb */
    public final void mo6883Sb() {
        C2254Dd dd = this.f5648f.f5623j;
        if (dd != null) {
            String str = dd.f6879r;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 74);
            sb.append("Mediation adapter ");
            sb.append(str);
            sb.append(" refreshed, but mediation adapters should never refresh.");
            C2227Cf.m9536d(sb.toString());
        }
        mo6886a(this.f5648f.f5623j, true);
        mo6889b(this.f5648f.f5623j, true);
        mo6756ec();
    }

    /* renamed from: Wb */
    public void mo6742Wb() {
        mo6892e();
    }

    /* renamed from: Xb */
    public final void mo6884Xb() {
        mo6871cc();
    }

    /* renamed from: _b */
    public final void mo6885_b() {
        mo6896xb();
    }

    /* renamed from: a */
    public final void mo6859a(C2254Dd dd) {
        C3596wz wzVar;
        List<String> list;
        super.mo6859a(dd);
        if (dd.f6877p != null) {
            C2227Cf.m9532b("Disable the debug gesture detector on the mediation ad frame.");
            C1699Z z = this.f5648f.f5619f;
            if (z != null) {
                z.mo6850d();
            }
            C2227Cf.m9532b("Pinging network fill URLs.");
            C1697X.m7717x();
            C1698Y y = this.f5648f;
            C2333Fz.m9842a(y.f5616c, y.f5618e.f10855a, dd, y.f5615b, false, dd.f6877p.f10414j);
            C3596wz wzVar2 = dd.f6880s;
            if (!(wzVar2 == null || (list = wzVar2.f10485g) == null || list.size() <= 0)) {
                C2227Cf.m9532b("Pinging urls remotely");
                C1697X.m7698e().mo9451a(this.f5648f.f5616c, dd.f6880s.f10485g);
            }
        } else {
            C2227Cf.m9532b("Enable the debug gesture detector on the admob ad frame.");
            C1699Z z2 = this.f5648f.f5619f;
            if (z2 != null) {
                z2.mo6849c();
            }
        }
        if (dd.f6865d == 3 && (wzVar = dd.f6880s) != null && wzVar.f10484f != null) {
            C2227Cf.m9532b("Pinging no fill URLs.");
            C1697X.m7717x();
            C1698Y y2 = this.f5648f;
            C2333Fz.m9842a(y2.f5616c, y2.f5618e.f10855a, dd, y2.f5615b, false, dd.f6880s.f10484f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6886a(C2254Dd dd, boolean z) {
        if (dd == null) {
            C2227Cf.m9536d("Ad state was null when trying to ping impression URLs.");
            return;
        }
        if (dd == null) {
            C2227Cf.m9536d("Ad state was null when trying to ping impression URLs.");
        } else {
            C2227Cf.m9532b("Pinging Impression URLs.");
            C2311Fd fd = this.f5648f.f5625l;
            if (fd != null) {
                fd.mo8070b();
            }
            dd.f6856N.mo9686a(C3332ns.AD_IMPRESSION);
            if (dd.f6866e != null && !dd.f6849G) {
                C1697X.m7698e();
                C1698Y y = this.f5648f;
                C3114ge.m12410a(y.f5616c, y.f5618e.f10855a, mo6868c(dd.f6866e));
                dd.f6849G = true;
            }
        }
        if (!dd.f6851I || z) {
            C3596wz wzVar = dd.f6880s;
            if (!(wzVar == null || wzVar.f10482d == null)) {
                C1697X.m7717x();
                C1698Y y2 = this.f5648f;
                C2333Fz.m9842a(y2.f5616c, y2.f5618e.f10855a, dd, y2.f5615b, z, mo6868c(dd.f6880s.f10482d));
            }
            C3568vz vzVar = dd.f6877p;
            if (!(vzVar == null || vzVar.f10411g == null)) {
                C1697X.m7717x();
                C1698Y y3 = this.f5648f;
                C2333Fz.m9842a(y3.f5616c, y3.f5618e.f10855a, dd, y3.f5615b, z, dd.f6877p.f10411g);
            }
            dd.f6851I = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo6748a(C2254Dd dd, C2254Dd dd2) {
        int i;
        C3681zz zzVar;
        if (!(dd == null || (zzVar = dd.f6881t) == null)) {
            zzVar.mo10288a((C3624xz) null);
        }
        C3681zz zzVar2 = dd2.f6881t;
        if (zzVar2 != null) {
            zzVar2.mo10288a((C3624xz) this);
        }
        C3596wz wzVar = dd2.f6880s;
        int i2 = 0;
        if (wzVar != null) {
            i2 = wzVar.f10496r;
            i = wzVar.f10497s;
        } else {
            i = 0;
        }
        this.f5648f.f5603G.mo8736a(i2, i);
        return true;
    }

    /* renamed from: a */
    public final boolean mo6887a(C3196jb jbVar, C2930_u _uVar) {
        this.f5643a = _uVar;
        _uVar.mo9178a("seq_num", jbVar.f9579g);
        _uVar.mo9178a("request_id", jbVar.f9594v);
        _uVar.mo9178a("session_id", jbVar.f9580h);
        PackageInfo packageInfo = jbVar.f9578f;
        if (packageInfo != null) {
            _uVar.mo9178a("app_version", String.valueOf(packageInfo.versionCode));
        }
        C1698Y y = this.f5648f;
        C1697X.m7694a();
        Context context = this.f5648f.f5616c;
        C3389ps psVar = this.f5654l.f5900d;
        C2717Td ab = jbVar.f9574b.f10877c.getBundle("sdk_less_server_data") != null ? new C2166Ab(context, jbVar, this, psVar) : new C2565Oa(context, jbVar, this, psVar);
        ab.mo8892e();
        y.f5620g = ab;
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r0 > 0) goto L_0x0012;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo6749a(com.google.android.gms.internal.ads.zzjj r5, com.google.android.gms.internal.ads.C2254Dd r6, boolean r7) {
        /*
            r4 = this;
            if (r7 != 0) goto L_0x0031
            com.google.android.gms.ads.internal.Y r7 = r4.f5648f
            boolean r7 = r7.mo6842d()
            if (r7 == 0) goto L_0x0031
            long r0 = r6.f6870i
            r2 = 0
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 <= 0) goto L_0x0018
        L_0x0012:
            com.google.android.gms.ads.internal.M r6 = r4.f5647e
            r6.mo6783a((com.google.android.gms.internal.ads.zzjj) r5, (long) r0)
            goto L_0x0031
        L_0x0018:
            com.google.android.gms.internal.ads.wz r7 = r6.f6880s
            if (r7 == 0) goto L_0x0023
            long r0 = r7.f10488j
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 <= 0) goto L_0x0023
            goto L_0x0012
        L_0x0023:
            boolean r7 = r6.f6876o
            if (r7 != 0) goto L_0x0031
            int r6 = r6.f6865d
            r7 = 2
            if (r6 != r7) goto L_0x0031
            com.google.android.gms.ads.internal.M r6 = r4.f5647e
            r6.mo6785b(r5)
        L_0x0031:
            com.google.android.gms.ads.internal.M r5 = r4.f5647e
            boolean r5 = r5.mo6788e()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.C1703ba.mo6749a(com.google.android.gms.internal.ads.zzjj, com.google.android.gms.internal.ads.Dd, boolean):boolean");
    }

    /* renamed from: a */
    public boolean mo6750a(zzjj zzjj, C2930_u _uVar) {
        return mo6888a(zzjj, _uVar, 1);
    }

    /* renamed from: a */
    public final boolean mo6888a(zzjj zzjj, C2930_u _uVar, int i) {
        C2369Hd hd;
        if (!mo6893jc()) {
            return false;
        }
        C1697X.m7698e();
        C2325Fr a = C1697X.m7702i().mo8315a(this.f5648f.f5616c);
        String str = null;
        Bundle a2 = a == null ? null : C3114ge.m12394a(a);
        this.f5647e.mo6781a();
        this.f5648f.f5605I = 0;
        if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7951pd)).booleanValue()) {
            hd = C1697X.m7702i().mo8333m().mo9158h();
            C1708e m = C1697X.m7706m();
            C1698Y y = this.f5648f;
            Context context = y.f5616c;
            zzang zzang = y.f5618e;
            String str2 = y.f5615b;
            if (hd != null) {
                str = hd.mo8257d();
            }
            m.mo6902a(context, zzang, false, hd, str, str2, (Runnable) null);
        } else {
            hd = null;
        }
        return mo6887a(m7797a(zzjj, a2, hd, i), _uVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo6889b(C2254Dd dd, boolean z) {
        if (dd != null) {
            if (!(dd == null || dd.f6867f == null || dd.f6850H)) {
                C1697X.m7698e();
                C1698Y y = this.f5648f;
                C3114ge.m12410a(y.f5616c, y.f5618e.f10855a, mo6865b(dd.f6867f));
                dd.f6850H = true;
            }
            if (!dd.f6852J || z) {
                C3596wz wzVar = dd.f6880s;
                if (!(wzVar == null || wzVar.f10483e == null)) {
                    C1697X.m7717x();
                    C1698Y y2 = this.f5648f;
                    C2333Fz.m9842a(y2.f5616c, y2.f5618e.f10855a, dd, y2.f5615b, z, mo6865b(dd.f6880s.f10483e));
                }
                C3568vz vzVar = dd.f6877p;
                if (!(vzVar == null || vzVar.f10412h == null)) {
                    C1697X.m7717x();
                    C1698Y y3 = this.f5648f;
                    C2333Fz.m9842a(y3.f5616c, y3.f5618e.f10855a, dd, y3.f5615b, z, dd.f6877p.f10412h);
                }
                dd.f6852J = true;
            }
        }
    }

    /* renamed from: b */
    public final void mo6890b(C3507tw twVar, String str) {
        String str2;
        C2302Ew ew = null;
        if (twVar != null) {
            try {
                str2 = twVar.mo10061l();
            } catch (RemoteException e) {
                C2227Cf.m9535c("Unable to call onCustomClick.", e);
                return;
            }
        } else {
            str2 = null;
        }
        if (!(this.f5648f.f5634u == null || str2 == null)) {
            ew = this.f5648f.f5634u.get(str2);
        }
        if (ew == null) {
            C2227Cf.m9536d("Mediation adapter invoked onCustomClick but no listeners were set.");
        } else {
            ew.mo8060a(twVar, str);
        }
    }

    /* renamed from: b */
    public final void mo6891b(String str, String str2) {
        mo6863a(str, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo6866b(C2254Dd dd) {
        zzjj zzjj = this.f5649g;
        boolean z = false;
        if (zzjj != null) {
            this.f5649g = null;
        } else {
            zzjj = dd.f6862a;
            Bundle bundle = zzjj.f10877c;
            if (bundle != null) {
                z = bundle.getBoolean("_noRefresh", false);
            }
        }
        return mo6749a(zzjj, dd, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo6873d(zzjj zzjj) {
        return super.mo6873d(zzjj) && !this.f5659n;
    }

    /* renamed from: e */
    public final void mo6892e() {
        mo6886a(this.f5648f.f5623j, false);
    }

    /* renamed from: f */
    public void mo6490f() {
        C2254Dd dd = this.f5648f.f5623j;
        if (dd == null) {
            C2227Cf.m9536d("Ad state was null when trying to ping click URLs.");
            return;
        }
        C3596wz wzVar = dd.f6880s;
        if (!(wzVar == null || wzVar.f10481c == null)) {
            C1697X.m7717x();
            C1698Y y = this.f5648f;
            Context context = y.f5616c;
            String str = y.f5618e.f10855a;
            C2254Dd dd2 = y.f5623j;
            C2333Fz.m9842a(context, str, dd2, y.f5615b, false, mo6868c(dd2.f6880s.f10481c));
        }
        C3568vz vzVar = this.f5648f.f5623j.f6877p;
        if (!(vzVar == null || vzVar.f10410f == null)) {
            C1697X.m7717x();
            C1698Y y2 = this.f5648f;
            Context context2 = y2.f5616c;
            String str2 = y2.f5618e.f10855a;
            C2254Dd dd3 = y2.f5623j;
            C2333Fz.m9842a(context2, str2, dd3, y2.f5615b, false, dd3.f6877p.f10410f);
        }
        super.mo6490f();
    }

    /* renamed from: i */
    public final String mo6820i() {
        C2254Dd dd = this.f5648f.f5623j;
        if (dd == null) {
            return null;
        }
        return dd.f6879r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: jc */
    public boolean mo6893jc() {
        C1697X.m7698e();
        if (C3114ge.m12418a(this.f5648f.f5616c, "android.permission.INTERNET")) {
            C1697X.m7698e();
            return C3114ge.m12417a(this.f5648f.f5616c);
        }
    }

    public final void onPause() {
        this.f5650h.mo8555c(this.f5648f.f5623j);
    }

    public final void onResume() {
        this.f5650h.mo8556d(this.f5648f.f5623j);
    }

    public void pause() {
        C2626Pz pz;
        C2061y.m9072a("pause must be called on the main UI thread.");
        C1698Y y = this.f5648f;
        C2254Dd dd = y.f5623j;
        if (!(dd == null || dd.f6863b == null || !y.mo6842d())) {
            C1697X.m7700g();
            C3289me.m13057a(this.f5648f.f5623j.f6863b);
        }
        C2254Dd dd2 = this.f5648f.f5623j;
        if (!(dd2 == null || (pz = dd2.f6878q) == null)) {
            try {
                pz.pause();
            } catch (RemoteException unused) {
                C2227Cf.m9536d("Could not pause mediation adapter.");
            }
        }
        this.f5650h.mo8555c(this.f5648f.f5623j);
        this.f5647e.mo6784b();
    }

    public void showInterstitial() {
        C2227Cf.m9536d("showInterstitial is not supported for current ad type");
    }

    /* renamed from: xb */
    public void mo6896xb() {
        this.f5659n = true;
        mo6874dc();
    }

    /* renamed from: yb */
    public void mo6897yb() {
        this.f5659n = false;
        mo6867bc();
        this.f5648f.f5625l.mo8074d();
    }
}
