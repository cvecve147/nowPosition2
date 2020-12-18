package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.ads.internal.C1697X;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.protocol.HTTP;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Tx */
public final class C2739Tx {

    /* renamed from: a */
    private final Map<C2766Ux, C2795Vx> f8366a = new HashMap();

    /* renamed from: b */
    private final LinkedList<C2766Ux> f8367b = new LinkedList<>();

    /* renamed from: c */
    private C3365ox f8368c;

    /* renamed from: a */
    static Set<String> m11307a(zzjj zzjj) {
        HashSet hashSet = new HashSet();
        hashSet.addAll(zzjj.f10877c.keySet());
        Bundle bundle = zzjj.f10887m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle != null) {
            hashSet.addAll(bundle.keySet());
        }
        return hashSet;
    }

    /* renamed from: a */
    private static void m11308a(Bundle bundle, String str) {
        while (true) {
            String[] split = str.split("/", 2);
            if (split.length != 0) {
                String str2 = split[0];
                if (split.length == 1) {
                    bundle.remove(str2);
                    return;
                }
                bundle = bundle.getBundle(str2);
                if (bundle != null) {
                    str = split[1];
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static void m11309a(String str, C2766Ux ux) {
        if (C2227Cf.m9531a(2)) {
            C2857Yd.m11615f(String.format(str, new Object[]{ux}));
        }
    }

    /* renamed from: a */
    private static String[] m11310a(String str) {
        try {
            String[] split = str.split("\u0000");
            for (int i = 0; i < split.length; i++) {
                split[i] = new String(Base64.decode(split[i], 0), HTTP.UTF_8);
            }
            return split;
        } catch (UnsupportedEncodingException unused) {
            return new String[0];
        }
    }

    /* renamed from: b */
    static zzjj m11311b(zzjj zzjj) {
        zzjj d = m11316d(zzjj);
        Bundle bundle = d.f10887m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle != null) {
            bundle.putBoolean("_skipMediation", true);
        }
        d.f10877c.putBoolean("_skipMediation", true);
        return d;
    }

    /* renamed from: b */
    private final String m11312b() {
        try {
            StringBuilder sb = new StringBuilder();
            Iterator it = this.f8367b.iterator();
            while (it.hasNext()) {
                sb.append(Base64.encodeToString(((C2766Ux) it.next()).toString().getBytes(HTTP.UTF_8), 0));
                if (it.hasNext()) {
                    sb.append("\u0000");
                }
            }
            return sb.toString();
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    /* renamed from: b */
    private static boolean m11313b(String str) {
        try {
            return Pattern.matches((String) C3390pt.m13458f().mo8515a(C2558Nu.f7730Eb), str);
        } catch (RuntimeException e) {
            C1697X.m7702i().mo8319a((Throwable) e, "InterstitialAdPool.isExcludedAdUnit");
            return false;
        }
    }

    /* renamed from: c */
    private static zzjj m11314c(zzjj zzjj) {
        zzjj d = m11316d(zzjj);
        for (String str : ((String) C3390pt.m13458f().mo8515a(C2558Nu.f7706Ab)).split(",")) {
            m11308a(d.f10887m, str);
            if (str.startsWith("com.google.ads.mediation.admob.AdMobAdapter/")) {
                m11308a(d.f10877c, str.replaceFirst("com.google.ads.mediation.admob.AdMobAdapter/", ""));
            }
        }
        return d;
    }

    /* renamed from: c */
    private static String m11315c(String str) {
        try {
            Matcher matcher = Pattern.compile("([^/]+/[0-9]+).*").matcher(str);
            return matcher.matches() ? matcher.group(1) : str;
        } catch (RuntimeException unused) {
            return str;
        }
    }

    /* renamed from: d */
    private static zzjj m11316d(zzjj zzjj) {
        Parcel obtain = Parcel.obtain();
        zzjj.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        zzjj createFromParcel = zzjj.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return ((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7937nb)).booleanValue() ? createFromParcel.mo10310b() : createFromParcel;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C2822Wx mo8914a(zzjj zzjj, String str) {
        if (m11313b(str)) {
            return null;
        }
        int i = new C2940ac(this.f8368c.mo9842a()).mo9188a().f8745n;
        zzjj c = m11314c(zzjj);
        String c2 = m11315c(str);
        C2766Ux ux = new C2766Ux(c, c2, i);
        C2795Vx vx = this.f8366a.get(ux);
        if (vx == null) {
            m11309a("Interstitial pool created at %s.", ux);
            vx = new C2795Vx(c, c2, i);
            this.f8366a.put(ux, vx);
        }
        this.f8367b.remove(ux);
        this.f8367b.add(ux);
        vx.mo8984g();
        while (true) {
            if (this.f8367b.size() <= ((Integer) C3390pt.m13458f().mo8515a(C2558Nu.f7712Bb)).intValue()) {
                break;
            }
            C2766Ux remove = this.f8367b.remove();
            C2795Vx vx2 = this.f8366a.get(remove);
            m11309a("Evicting interstitial queue for %s.", remove);
            while (vx2.mo8980c() > 0) {
                C2822Wx a = vx2.mo8975a((zzjj) null);
                if (a.f8580e) {
                    C2878Yx.m11651a().mo9083c();
                }
                a.f8576a.mo6973mc();
            }
            this.f8366a.remove(remove);
        }
        while (vx.mo8980c() > 0) {
            C2822Wx a2 = vx.mo8975a(c);
            if (a2.f8580e) {
                if (C1697X.m7705l().mo7725a() - a2.f8579d > ((long) ((Integer) C3390pt.m13458f().mo8515a(C2558Nu.f7724Db)).intValue()) * 1000) {
                    m11309a("Expired interstitial at %s.", ux);
                    C2878Yx.m11651a().mo9082b();
                }
            }
            String str2 = a2.f8577b != null ? " (inline) " : " ";
            StringBuilder sb = new StringBuilder(str2.length() + 34);
            sb.append("Pooled interstitial");
            sb.append(str2);
            sb.append("returned at %s.");
            m11309a(sb.toString(), ux);
            return a2;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        r5 = r1.mo8980c();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8915a() {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.ox r0 = r8.f8368c
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.util.Map<com.google.android.gms.internal.ads.Ux, com.google.android.gms.internal.ads.Vx> r0 = r8.f8366a
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x000f:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0089
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r1.getKey()
            com.google.android.gms.internal.ads.Ux r3 = (com.google.android.gms.internal.ads.C2766Ux) r3
            java.lang.Object r1 = r1.getValue()
            com.google.android.gms.internal.ads.Vx r1 = (com.google.android.gms.internal.ads.C2795Vx) r1
            r4 = 2
            boolean r5 = com.google.android.gms.internal.ads.C2227Cf.m9531a((int) r4)
            if (r5 == 0) goto L_0x0056
            int r5 = r1.mo8980c()
            int r6 = r1.mo8982e()
            if (r6 >= r5) goto L_0x0056
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]
            int r6 = r5 - r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7[r2] = r6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 1
            r7[r6] = r5
            r7[r4] = r3
            java.lang.String r4 = "Loading %s/%s pooled interstitials for %s."
            java.lang.String r4 = java.lang.String.format(r4, r7)
            com.google.android.gms.internal.ads.C2857Yd.m11615f(r4)
        L_0x0056:
            int r4 = r1.mo8983f()
            int r4 = r4 + r2
        L_0x005b:
            int r2 = r1.mo8980c()
            com.google.android.gms.internal.ads.Du<java.lang.Integer> r5 = com.google.android.gms.internal.ads.C2558Nu.f7718Cb
            com.google.android.gms.internal.ads.Lu r6 = com.google.android.gms.internal.ads.C3390pt.m13458f()
            java.lang.Object r5 = r6.mo8515a(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r2 >= r5) goto L_0x0081
            java.lang.String r2 = "Pooling and loading one new interstitial for %s."
            m11309a((java.lang.String) r2, (com.google.android.gms.internal.ads.C2766Ux) r3)
            com.google.android.gms.internal.ads.ox r2 = r8.f8368c
            boolean r2 = r1.mo8978a((com.google.android.gms.internal.ads.C3365ox) r2)
            if (r2 == 0) goto L_0x005b
            int r4 = r4 + 1
            goto L_0x005b
        L_0x0081:
            com.google.android.gms.internal.ads.Yx r1 = com.google.android.gms.internal.ads.C2878Yx.m11651a()
            r1.mo9081a(r4)
            goto L_0x000f
        L_0x0089:
            com.google.android.gms.internal.ads.ox r0 = r8.f8368c
            if (r0 == 0) goto L_0x00e8
            android.content.Context r0 = r0.mo9842a()
            java.lang.String r1 = "com.google.android.gms.ads.internal.interstitial.InterstitialAdPool"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.clear()
            java.util.Map<com.google.android.gms.internal.ads.Ux, com.google.android.gms.internal.ads.Vx> r1 = r8.f8366a
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x00a8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00dc
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            com.google.android.gms.internal.ads.Ux r3 = (com.google.android.gms.internal.ads.C2766Ux) r3
            java.lang.Object r2 = r2.getValue()
            com.google.android.gms.internal.ads.Vx r2 = (com.google.android.gms.internal.ads.C2795Vx) r2
            boolean r4 = r2.mo8985h()
            if (r4 == 0) goto L_0x00a8
            com.google.android.gms.internal.ads._x r4 = new com.google.android.gms.internal.ads._x
            r4.<init>(r2)
            java.lang.String r2 = r4.mo9184a()
            java.lang.String r4 = r3.toString()
            r0.putString(r4, r2)
            java.lang.String r2 = "Saved interstitial queue for %s."
            m11309a((java.lang.String) r2, (com.google.android.gms.internal.ads.C2766Ux) r3)
            goto L_0x00a8
        L_0x00dc:
            java.lang.String r1 = r8.m11312b()
            java.lang.String r2 = "PoolKeys"
            r0.putString(r2, r1)
            r0.apply()
        L_0x00e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2739Tx.mo8915a():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo8916a(C3365ox oxVar) {
        if (this.f8368c == null) {
            this.f8368c = oxVar.mo9845b();
            C3365ox oxVar2 = this.f8368c;
            if (oxVar2 != null) {
                SharedPreferences sharedPreferences = oxVar2.mo9842a().getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0);
                while (this.f8367b.size() > 0) {
                    C2766Ux remove = this.f8367b.remove();
                    C2795Vx vx = this.f8366a.get(remove);
                    m11309a("Flushing interstitial queue for %s.", remove);
                    while (vx.mo8980c() > 0) {
                        vx.mo8975a((zzjj) null).f8576a.mo6973mc();
                    }
                    this.f8366a.remove(remove);
                }
                try {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry next : sharedPreferences.getAll().entrySet()) {
                        if (!((String) next.getKey()).equals("PoolKeys")) {
                            C2933_x a = C2933_x.m11896a((String) next.getValue());
                            C2766Ux ux = new C2766Ux(a.f8874a, a.f8875b, a.f8876c);
                            if (!this.f8366a.containsKey(ux)) {
                                this.f8366a.put(ux, new C2795Vx(a.f8874a, a.f8875b, a.f8876c));
                                hashMap.put(ux.toString(), ux);
                                m11309a("Restored interstitial queue for %s.", ux);
                            }
                        }
                    }
                    for (String str : m11310a(sharedPreferences.getString("PoolKeys", ""))) {
                        C2766Ux ux2 = (C2766Ux) hashMap.get(str);
                        if (this.f8366a.containsKey(ux2)) {
                            this.f8367b.add(ux2);
                        }
                    }
                } catch (IOException | RuntimeException e) {
                    C1697X.m7702i().mo8319a(e, "InterstitialAdPool.restore");
                    C2227Cf.m9535c("Malformed preferences value for InterstitialAdPool.", e);
                    this.f8366a.clear();
                    this.f8367b.clear();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo8917b(zzjj zzjj, String str) {
        C3365ox oxVar = this.f8368c;
        if (oxVar != null) {
            int i = new C2940ac(oxVar.mo9842a()).mo9188a().f8745n;
            zzjj c = m11314c(zzjj);
            String c2 = m11315c(str);
            C2766Ux ux = new C2766Ux(c, c2, i);
            C2795Vx vx = this.f8366a.get(ux);
            if (vx == null) {
                m11309a("Interstitial pool created at %s.", ux);
                vx = new C2795Vx(c, c2, i);
                this.f8366a.put(ux, vx);
            }
            vx.mo8977a(this.f8368c, zzjj);
            vx.mo8984g();
            m11309a("Inline entry added to the queue at %s.", ux);
        }
    }
}
