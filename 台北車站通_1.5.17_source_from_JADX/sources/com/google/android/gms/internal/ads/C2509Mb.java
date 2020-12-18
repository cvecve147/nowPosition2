package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.C1697X;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Mb */
public final class C2509Mb extends C3371pb {

    /* renamed from: a */
    private static final Object f7557a = new Object();

    /* renamed from: b */
    private static C2509Mb f7558b;

    /* renamed from: c */
    private final Context f7559c;

    /* renamed from: d */
    private final C2479Lb f7560d;

    /* renamed from: e */
    private final ScheduledExecutorService f7561e = Executors.newSingleThreadScheduledExecutor();

    private C2509Mb(Context context, C2479Lb lb) {
        this.f7559c = context;
        this.f7560d = lb;
    }

    /* renamed from: a */
    public static C2509Mb m10582a(Context context, C2479Lb lb) {
        C2509Mb mb;
        synchronized (f7557a) {
            if (f7558b == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                C2558Nu.m10773a(context);
                f7558b = new C2509Mb(context, lb);
                if (context.getApplicationContext() != null) {
                    C1697X.m7698e().mo9458c(context);
                }
                C2773Vd.m11403a(context);
            }
            mb = f7558b;
        }
        return mb;
    }

    /* renamed from: a */
    private static zzaej m10584a(Context context, C2479Lb lb, zzaef zzaef, ScheduledExecutorService scheduledExecutorService) {
        C2930_u _uVar;
        Bundle bundle;
        String string;
        Context context2 = context;
        C2479Lb lb2 = lb;
        zzaef zzaef2 = zzaef;
        ScheduledExecutorService scheduledExecutorService2 = scheduledExecutorService;
        C2227Cf.m9532b("Starting ad request from service using: google.afma.request.getAdDictionary");
        C2930_u _uVar2 = new C2930_u(((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7900ha)).booleanValue(), "load_ad", zzaef2.f10755d.f10893a);
        if (zzaef2.f10749a > 10) {
            long j = zzaef2.f10723A;
            if (j != -1) {
                _uVar2.mo9180a(_uVar2.mo9175a(j), "cts");
            }
        }
        C2875Yu a = _uVar2.mo9174a();
        C2804Wf<V> a2 = C2483Lf.m10496a(lb2.f7497i.mo10156a(context2), ((Long) C3390pt.m13458f().mo8515a(C2558Nu.f7720Cd)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService2);
        C2804Wf<V> a3 = C2483Lf.m10496a(lb2.f7496h.mo9533a(context2), ((Long) C3390pt.m13458f().mo8515a(C2558Nu.f7890fc)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService2);
        C2804Wf<String> a4 = lb2.f7491c.mo10227a(zzaef2.f10758g.packageName);
        C2804Wf<String> b = lb2.f7491c.mo10228b(zzaef2.f10758g.packageName);
        C2804Wf<String> a5 = lb2.f7498j.mo7805a(zzaef2.f10759h, zzaef2.f10758g);
        Future<C2909_b> a6 = C1697X.m7709p().mo9225a(context2);
        C2804Wf a7 = C2483Lf.m10495a(null);
        Bundle bundle2 = zzaef2.f10753c.f10877c;
        boolean z = (bundle2 == null || bundle2.getString("_ad") == null) ? false : true;
        if (zzaef2.f10729G && !z) {
            a7 = lb2.f7494f.mo10025a(zzaef2.f10757f);
        }
        C2930_u _uVar3 = _uVar2;
        C2875Yu yu = a;
        C2804Wf a8 = C2483Lf.m10496a(a7, ((Long) C3390pt.m13458f().mo8515a(C2558Nu.f7927ld)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService2);
        C2804Wf<V> a9 = C2483Lf.m10495a(null);
        if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7907ib)).booleanValue()) {
            _uVar = _uVar3;
            a9 = C2483Lf.m10496a(lb2.f7498j.mo7804a(context2), ((Long) C3390pt.m13458f().mo8515a(C2558Nu.f7913jb)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService2);
        } else {
            _uVar = _uVar3;
        }
        if (zzaef2.f10749a < 4 || (bundle = zzaef2.f10766o) == null) {
            bundle = null;
        }
        ((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7996xa)).booleanValue();
        C1697X.m7698e();
        if (C3114ge.m12418a(context2, "android.permission.ACCESS_NETWORK_STATE") && ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo() == null) {
            C2227Cf.m9532b("Device is offline.");
        }
        String uuid = zzaef2.f10749a >= 7 ? zzaef2.f10773v : UUID.randomUUID().toString();
        new C2687Sb(context2, uuid, zzaef2.f10757f.packageName);
        Bundle bundle3 = zzaef2.f10753c.f10877c;
        if (bundle3 != null && (string = bundle3.getString("_ad")) != null) {
            return C2656Rb.m11026a(context2, zzaef2, string);
        }
        List<String> a10 = lb2.f7492d.mo7850a(zzaef2.f10774w);
        String str = uuid;
        Bundle bundle4 = (Bundle) C2483Lf.m10501a(a2, null, ((Long) C3390pt.m13458f().mo8515a(C2558Nu.f7720Cd)).longValue(), TimeUnit.MILLISECONDS);
        C3197jc jcVar = (C3197jc) C2483Lf.m10500a(a3, null);
        Location location = (Location) C2483Lf.m10500a(a8, null);
        AdvertisingIdClient.Info info = (AdvertisingIdClient.Info) C2483Lf.m10500a(a9, null);
        String str2 = (String) C2483Lf.m10500a(a5, null);
        String str3 = (String) C2483Lf.m10500a(a4, null);
        String str4 = (String) C2483Lf.m10500a(b, null);
        C2909_b _bVar = (C2909_b) C2483Lf.m10500a(a6, null);
        if (_bVar == null) {
            C2227Cf.m9536d("Error fetching device info. This is not recoverable.");
            return new zzaej(0);
        }
        C2451Kb kb = new C2451Kb();
        kb.f7422j = zzaef2;
        kb.f7423k = _bVar;
        kb.f7417e = jcVar;
        kb.f7416d = location;
        kb.f7414b = bundle4;
        kb.f7420h = str2;
        kb.f7421i = info;
        if (a10 == null) {
            kb.f7415c.clear();
        }
        kb.f7415c = a10;
        kb.f7413a = bundle;
        kb.f7418f = str3;
        kb.f7419g = str4;
        Context context3 = context;
        kb.f7424l = lb2.f7490b.mo9481a(context3);
        kb.f7425m = lb2.f7499k;
        JSONObject a11 = C2656Rb.m11030a(context3, kb);
        if (a11 == null) {
            return new zzaej(0);
        }
        if (zzaef2.f10749a < 7) {
            try {
                a11.put("request_id", str);
            } catch (JSONException unused) {
            }
        }
        C2875Yu yu2 = yu;
        C2930_u _uVar4 = _uVar;
        _uVar4.mo9180a(yu2, "arc");
        _uVar4.mo9174a();
        ScheduledExecutorService scheduledExecutorService3 = scheduledExecutorService;
        C2804Wf<V> a12 = C2483Lf.m10496a(C2483Lf.m10497a(lb2.f7500l.mo8734b().mo9344a(a11), C2537Nb.f7631a, (Executor) scheduledExecutorService3), 10, TimeUnit.SECONDS, scheduledExecutorService3);
        C2804Wf<Void> a13 = lb2.f7493e.mo9367a();
        if (a13 != null) {
            C2427Jf.m10346a(a13, "AdRequestServiceImpl.loadAd.flags");
        }
        C2855Yb yb = (C2855Yb) C2483Lf.m10500a(a12, null);
        if (yb == null) {
            return new zzaej(0);
        }
        if (yb.mo9054a() != -2) {
            return new zzaej(yb.mo9054a());
        }
        _uVar4.mo9183d();
        zzaej a14 = !TextUtils.isEmpty(yb.mo9063i()) ? C2656Rb.m11026a(context3, zzaef2, yb.mo9063i()) : null;
        if (a14 == null && !TextUtils.isEmpty(yb.mo9057c())) {
            a14 = m10585a(zzaef, context, zzaef2.f10762k.f10855a, yb.mo9057c(), str3, str4, yb, _uVar4, lb);
        }
        if (a14 == null) {
            a14 = new zzaej(0);
        }
        _uVar4.mo9180a(yu2, "tts");
        a14.f10827z = _uVar4.mo9181b();
        return a14;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e9, code lost:
        r0 = r6.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r6 = new java.io.InputStreamReader(r11.getInputStream());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        com.google.android.gms.ads.internal.C1697X.m7698e();
        r10 = com.google.android.gms.internal.ads.C3114ge.m12402a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        com.google.android.gms.common.util.C2090l.m9157a(r6);
        r3.mo10122a(r10);
        m10586a(r0, (java.util.Map<java.lang.String, java.util.List<java.lang.String>>) r12, r10, r9);
        r5.mo8989a(r0, r12, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0109, code lost:
        if (r1 == null) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010b, code lost:
        r1.mo9180a(r4, "ufe");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0114, code lost:
        r0 = r5.mo8988a(r7, r23.mo9064j());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r11.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x011f, code lost:
        if (r2 == null) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0121, code lost:
        r2.f7495g.mo9488a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0126, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0127, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0128, code lost:
        r16 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x012b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x012c, code lost:
        r16 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        com.google.android.gms.common.util.C2090l.m9157a(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0131, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x014c, code lost:
        com.google.android.gms.internal.ads.C2227Cf.m9536d("No location header to follow redirect.");
        r0 = new com.google.android.gms.internal.ads.zzaej(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        r11.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x015a, code lost:
        if (r2 == null) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x015c, code lost:
        r2.f7495g.mo9488a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0161, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x017b, code lost:
        com.google.android.gms.internal.ads.C2227Cf.m9536d("Too many redirects.");
        r0 = new com.google.android.gms.internal.ads.zzaej(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        r11.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0189, code lost:
        if (r2 == null) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x018b, code lost:
        r2.f7495g.mo9488a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0190, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008a A[Catch:{ all -> 0x00c0, all -> 0x01ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a1 A[Catch:{ all -> 0x00c0, all -> 0x01ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cb A[Catch:{ all -> 0x00c0, all -> 0x01ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0140 A[Catch:{ all -> 0x00c0, all -> 0x01ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01a3 A[EDGE_INSN: B:119:0x01a3->B:99:0x01a3 ?: BREAK  
    EDGE_INSN: B:120:0x01a3->B:99:0x01a3 ?: BREAK  ] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzaej m10585a(com.google.android.gms.internal.ads.zzaef r17, android.content.Context r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, com.google.android.gms.internal.ads.C2855Yb r23, com.google.android.gms.internal.ads.C2930_u r24, com.google.android.gms.internal.ads.C2479Lb r25) {
        /*
            r0 = r17
            r1 = r24
            r2 = r25
            if (r1 == 0) goto L_0x000d
            com.google.android.gms.internal.ads.Yu r4 = r24.mo9174a()
            goto L_0x000e
        L_0x000d:
            r4 = 0
        L_0x000e:
            com.google.android.gms.internal.ads.Wb r5 = new com.google.android.gms.internal.ads.Wb     // Catch:{ IOException -> 0x01d6 }
            java.lang.String r6 = r23.mo9059e()     // Catch:{ IOException -> 0x01d6 }
            r5.<init>(r0, r6)     // Catch:{ IOException -> 0x01d6 }
            java.lang.String r6 = "AdRequestServiceImpl: Sending request: "
            java.lang.String r7 = java.lang.String.valueOf(r20)     // Catch:{ IOException -> 0x01d6 }
            int r8 = r7.length()     // Catch:{ IOException -> 0x01d6 }
            if (r8 == 0) goto L_0x0029
            java.lang.String r6 = r6.concat(r7)     // Catch:{ IOException -> 0x01d6 }
            r7 = r6
            goto L_0x002e
        L_0x0029:
            java.lang.String r7 = new java.lang.String     // Catch:{ IOException -> 0x01d6 }
            r7.<init>(r6)     // Catch:{ IOException -> 0x01d6 }
        L_0x002e:
            com.google.android.gms.internal.ads.C2227Cf.m9532b(r7)     // Catch:{ IOException -> 0x01d6 }
            java.net.URL r6 = new java.net.URL     // Catch:{ IOException -> 0x01d6 }
            r7 = r20
            r6.<init>(r7)     // Catch:{ IOException -> 0x01d6 }
            com.google.android.gms.common.util.e r7 = com.google.android.gms.ads.internal.C1697X.m7705l()     // Catch:{ IOException -> 0x01d6 }
            long r7 = r7.mo7726b()     // Catch:{ IOException -> 0x01d6 }
            r9 = 0
            r10 = r9
        L_0x0042:
            if (r2 == 0) goto L_0x0049
            com.google.android.gms.internal.ads.hc r11 = r2.f7495g     // Catch:{ IOException -> 0x01d6 }
            r11.mo9489b()     // Catch:{ IOException -> 0x01d6 }
        L_0x0049:
            java.net.URLConnection r11 = r6.openConnection()     // Catch:{ IOException -> 0x01d6 }
            java.net.HttpURLConnection r11 = (java.net.HttpURLConnection) r11     // Catch:{ IOException -> 0x01d6 }
            com.google.android.gms.internal.ads.ge r12 = com.google.android.gms.ads.internal.C1697X.m7698e()     // Catch:{ all -> 0x01ca }
            r13 = r18
            r14 = r19
            r12.mo9450a((android.content.Context) r13, (java.lang.String) r14, (boolean) r9, (java.net.HttpURLConnection) r11)     // Catch:{ all -> 0x01ca }
            boolean r12 = r23.mo9061g()     // Catch:{ all -> 0x01ca }
            if (r12 == 0) goto L_0x007e
            boolean r12 = android.text.TextUtils.isEmpty(r21)     // Catch:{ all -> 0x01ca }
            if (r12 != 0) goto L_0x006e
            java.lang.String r12 = "x-afma-drt-cookie"
            r15 = r21
            r11.addRequestProperty(r12, r15)     // Catch:{ all -> 0x01ca }
            goto L_0x0070
        L_0x006e:
            r15 = r21
        L_0x0070:
            boolean r12 = android.text.TextUtils.isEmpty(r22)     // Catch:{ all -> 0x01ca }
            if (r12 != 0) goto L_0x0080
            java.lang.String r12 = "x-afma-drt-v2-cookie"
            r9 = r22
            r11.addRequestProperty(r12, r9)     // Catch:{ all -> 0x01ca }
            goto L_0x0082
        L_0x007e:
            r15 = r21
        L_0x0080:
            r9 = r22
        L_0x0082:
            java.lang.String r12 = r0.f10730H     // Catch:{ all -> 0x01ca }
            boolean r16 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x01ca }
            if (r16 != 0) goto L_0x0094
            java.lang.String r16 = "Sending webview cookie in ad request header."
            com.google.android.gms.internal.ads.C2227Cf.m9532b(r16)     // Catch:{ all -> 0x01ca }
            java.lang.String r3 = "Cookie"
            r11.addRequestProperty(r3, r12)     // Catch:{ all -> 0x01ca }
        L_0x0094:
            r3 = 1
            if (r23 == 0) goto L_0x00cb
            java.lang.String r12 = r23.mo9060f()     // Catch:{ all -> 0x01ca }
            boolean r12 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x01ca }
            if (r12 != 0) goto L_0x00cb
            r11.setDoOutput(r3)     // Catch:{ all -> 0x01ca }
            java.lang.String r12 = r23.mo9060f()     // Catch:{ all -> 0x01ca }
            byte[] r12 = r12.getBytes()     // Catch:{ all -> 0x01ca }
            int r3 = r12.length     // Catch:{ all -> 0x01ca }
            r11.setFixedLengthStreamingMode(r3)     // Catch:{ all -> 0x01ca }
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x00c4 }
            java.io.OutputStream r9 = r11.getOutputStream()     // Catch:{ all -> 0x00c4 }
            r3.<init>(r9)     // Catch:{ all -> 0x00c4 }
            r3.write(r12)     // Catch:{ all -> 0x00c0 }
            com.google.android.gms.common.util.C2090l.m9157a(r3)     // Catch:{ all -> 0x01ca }
            goto L_0x00cc
        L_0x00c0:
            r0 = move-exception
            r16 = r3
            goto L_0x00c7
        L_0x00c4:
            r0 = move-exception
            r16 = 0
        L_0x00c7:
            com.google.android.gms.common.util.C2090l.m9157a(r16)     // Catch:{ all -> 0x01ca }
            throw r0     // Catch:{ all -> 0x01ca }
        L_0x00cb:
            r12 = 0
        L_0x00cc:
            com.google.android.gms.internal.ads.vf r3 = new com.google.android.gms.internal.ads.vf     // Catch:{ all -> 0x01ca }
            java.lang.String r9 = r0.f10773v     // Catch:{ all -> 0x01ca }
            r3.<init>(r9)     // Catch:{ all -> 0x01ca }
            r3.mo10125a((java.net.HttpURLConnection) r11, (byte[]) r12)     // Catch:{ all -> 0x01ca }
            int r9 = r11.getResponseCode()     // Catch:{ all -> 0x01ca }
            java.util.Map r12 = r11.getHeaderFields()     // Catch:{ all -> 0x01ca }
            r3.mo10124a((java.net.HttpURLConnection) r11, (int) r9)     // Catch:{ all -> 0x01ca }
            r0 = 200(0xc8, float:2.8E-43)
            r13 = 300(0x12c, float:4.2E-43)
            if (r9 < r0) goto L_0x0132
            if (r9 >= r13) goto L_0x0132
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x01ca }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ all -> 0x012b }
            java.io.InputStream r10 = r11.getInputStream()     // Catch:{ all -> 0x012b }
            r6.<init>(r10)     // Catch:{ all -> 0x012b }
            com.google.android.gms.ads.internal.C1697X.m7698e()     // Catch:{ all -> 0x0127 }
            java.lang.String r10 = com.google.android.gms.internal.ads.C3114ge.m12402a((java.io.InputStreamReader) r6)     // Catch:{ all -> 0x0127 }
            com.google.android.gms.common.util.C2090l.m9157a(r6)     // Catch:{ all -> 0x01ca }
            r3.mo10122a((java.lang.String) r10)     // Catch:{ all -> 0x01ca }
            m10586a((java.lang.String) r0, (java.util.Map<java.lang.String, java.util.List<java.lang.String>>) r12, (java.lang.String) r10, (int) r9)     // Catch:{ all -> 0x01ca }
            r5.mo8989a(r0, r12, r10)     // Catch:{ all -> 0x01ca }
            if (r1 == 0) goto L_0x0114
            java.lang.String r0 = "ufe"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ all -> 0x01ca }
            r1.mo9180a((com.google.android.gms.internal.ads.C2875Yu) r4, (java.lang.String[]) r0)     // Catch:{ all -> 0x01ca }
        L_0x0114:
            boolean r0 = r23.mo9064j()     // Catch:{ all -> 0x01ca }
            com.google.android.gms.internal.ads.zzaej r0 = r5.mo8988a((long) r7, (boolean) r0)     // Catch:{ all -> 0x01ca }
            r11.disconnect()     // Catch:{ IOException -> 0x01d6 }
            if (r2 == 0) goto L_0x0126
            com.google.android.gms.internal.ads.hc r1 = r2.f7495g     // Catch:{ IOException -> 0x01d6 }
            r1.mo9488a()     // Catch:{ IOException -> 0x01d6 }
        L_0x0126:
            return r0
        L_0x0127:
            r0 = move-exception
            r16 = r6
            goto L_0x012e
        L_0x012b:
            r0 = move-exception
            r16 = 0
        L_0x012e:
            com.google.android.gms.common.util.C2090l.m9157a(r16)     // Catch:{ all -> 0x01ca }
            throw r0     // Catch:{ all -> 0x01ca }
        L_0x0132:
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x01ca }
            r3 = 0
            m10586a((java.lang.String) r0, (java.util.Map<java.lang.String, java.util.List<java.lang.String>>) r12, (java.lang.String) r3, (int) r9)     // Catch:{ all -> 0x01ca }
            if (r9 < r13) goto L_0x01a3
            r0 = 400(0x190, float:5.6E-43)
            if (r9 >= r0) goto L_0x01a3
            java.lang.String r0 = "Location"
            java.lang.String r0 = r11.getHeaderField(r0)     // Catch:{ all -> 0x01ca }
            boolean r6 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x01ca }
            if (r6 == 0) goto L_0x0162
            java.lang.String r0 = "No location header to follow redirect."
            com.google.android.gms.internal.ads.C2227Cf.m9536d(r0)     // Catch:{ all -> 0x01ca }
            com.google.android.gms.internal.ads.zzaej r0 = new com.google.android.gms.internal.ads.zzaej     // Catch:{ all -> 0x01ca }
            r1 = 0
            r0.<init>(r1)     // Catch:{ all -> 0x01ca }
            r11.disconnect()     // Catch:{ IOException -> 0x01d6 }
            if (r2 == 0) goto L_0x0161
            com.google.android.gms.internal.ads.hc r1 = r2.f7495g     // Catch:{ IOException -> 0x01d6 }
            r1.mo9488a()     // Catch:{ IOException -> 0x01d6 }
        L_0x0161:
            return r0
        L_0x0162:
            java.net.URL r6 = new java.net.URL     // Catch:{ all -> 0x01ca }
            r6.<init>(r0)     // Catch:{ all -> 0x01ca }
            r0 = 1
            int r10 = r10 + r0
            com.google.android.gms.internal.ads.Du<java.lang.Integer> r0 = com.google.android.gms.internal.ads.C2558Nu.f7946oe     // Catch:{ all -> 0x01ca }
            com.google.android.gms.internal.ads.Lu r9 = com.google.android.gms.internal.ads.C3390pt.m13458f()     // Catch:{ all -> 0x01ca }
            java.lang.Object r0 = r9.mo8515a(r0)     // Catch:{ all -> 0x01ca }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x01ca }
            int r0 = r0.intValue()     // Catch:{ all -> 0x01ca }
            if (r10 <= r0) goto L_0x0191
            java.lang.String r0 = "Too many redirects."
            com.google.android.gms.internal.ads.C2227Cf.m9536d(r0)     // Catch:{ all -> 0x01ca }
            com.google.android.gms.internal.ads.zzaej r0 = new com.google.android.gms.internal.ads.zzaej     // Catch:{ all -> 0x01ca }
            r1 = 0
            r0.<init>(r1)     // Catch:{ all -> 0x01ca }
            r11.disconnect()     // Catch:{ IOException -> 0x01d6 }
            if (r2 == 0) goto L_0x0190
            com.google.android.gms.internal.ads.hc r1 = r2.f7495g     // Catch:{ IOException -> 0x01d6 }
            r1.mo9488a()     // Catch:{ IOException -> 0x01d6 }
        L_0x0190:
            return r0
        L_0x0191:
            r5.mo8990a(r12)     // Catch:{ all -> 0x01ca }
            r11.disconnect()     // Catch:{ IOException -> 0x01d6 }
            if (r2 == 0) goto L_0x019e
            com.google.android.gms.internal.ads.hc r0 = r2.f7495g     // Catch:{ IOException -> 0x01d6 }
            r0.mo9488a()     // Catch:{ IOException -> 0x01d6 }
        L_0x019e:
            r0 = r17
            r9 = 0
            goto L_0x0042
        L_0x01a3:
            r0 = 46
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ca }
            r1.<init>(r0)     // Catch:{ all -> 0x01ca }
            java.lang.String r0 = "Received error HTTP response code: "
            r1.append(r0)     // Catch:{ all -> 0x01ca }
            r1.append(r9)     // Catch:{ all -> 0x01ca }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01ca }
            com.google.android.gms.internal.ads.C2227Cf.m9536d(r0)     // Catch:{ all -> 0x01ca }
            com.google.android.gms.internal.ads.zzaej r0 = new com.google.android.gms.internal.ads.zzaej     // Catch:{ all -> 0x01ca }
            r1 = 0
            r0.<init>(r1)     // Catch:{ all -> 0x01ca }
            r11.disconnect()     // Catch:{ IOException -> 0x01d6 }
            if (r2 == 0) goto L_0x01c9
            com.google.android.gms.internal.ads.hc r1 = r2.f7495g     // Catch:{ IOException -> 0x01d6 }
            r1.mo9488a()     // Catch:{ IOException -> 0x01d6 }
        L_0x01c9:
            return r0
        L_0x01ca:
            r0 = move-exception
            r11.disconnect()     // Catch:{ IOException -> 0x01d6 }
            if (r2 == 0) goto L_0x01d5
            com.google.android.gms.internal.ads.hc r1 = r2.f7495g     // Catch:{ IOException -> 0x01d6 }
            r1.mo9488a()     // Catch:{ IOException -> 0x01d6 }
        L_0x01d5:
            throw r0     // Catch:{ IOException -> 0x01d6 }
        L_0x01d6:
            r0 = move-exception
            java.lang.String r1 = "Error while connecting to ad server: "
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            if (r2 == 0) goto L_0x01ec
            java.lang.String r0 = r1.concat(r0)
            goto L_0x01f1
        L_0x01ec:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x01f1:
            com.google.android.gms.internal.ads.C2227Cf.m9536d(r0)
            com.google.android.gms.internal.ads.zzaej r0 = new com.google.android.gms.internal.ads.zzaej
            r1 = 2
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2509Mb.m10585a(com.google.android.gms.internal.ads.zzaef, android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.google.android.gms.internal.ads.Yb, com.google.android.gms.internal.ads._u, com.google.android.gms.internal.ads.Lb):com.google.android.gms.internal.ads.zzaej");
    }

    /* renamed from: a */
    private static void m10586a(String str, Map<String, List<String>> map, String str2, int i) {
        if (C2227Cf.m9531a(2)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39);
            sb.append("Http Response: {\n  URL:\n    ");
            sb.append(str);
            sb.append("\n  Headers:");
            C2857Yd.m11615f(sb.toString());
            if (map != null) {
                for (String next : map.keySet()) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(next).length() + 5);
                    sb2.append("    ");
                    sb2.append(next);
                    sb2.append(":");
                    C2857Yd.m11615f(sb2.toString());
                    for (String valueOf : map.get(next)) {
                        String valueOf2 = String.valueOf(valueOf);
                        C2857Yd.m11615f(valueOf2.length() != 0 ? "      ".concat(valueOf2) : new String("      "));
                    }
                }
            }
            C2857Yd.m11615f("  Body:");
            if (str2 != null) {
                int i2 = 0;
                while (i2 < Math.min(str2.length(), 100000)) {
                    int i3 = i2 + 1000;
                    C2857Yd.m11615f(str2.substring(i2, Math.min(str2.length(), i3)));
                    i2 = i3;
                }
            } else {
                C2857Yd.m11615f("    null");
            }
            StringBuilder sb3 = new StringBuilder(34);
            sb3.append("  Response Code:\n    ");
            sb3.append(i);
            sb3.append("\n}");
            C2857Yd.m11615f(sb3.toString());
        }
    }

    /* renamed from: a */
    public final zzaej mo8524a(zzaef zzaef) {
        return m10584a(this.f7559c, this.f7560d, zzaef, this.f7561e);
    }

    /* renamed from: a */
    public final void mo8525a(zzaef zzaef, C3428rb rbVar) {
        C1697X.m7702i().mo8316a(this.f7559c, zzaef.f10762k);
        C2804Wf<?> a = C3057ee.m12269a((Runnable) new C2566Ob(this, zzaef, rbVar));
        C1697X.m7713t().mo9309b();
        C1697X.m7713t().mo9308a().postDelayed(new C2598Pb(this, a), 60000);
    }

    /* renamed from: a */
    public final void mo8526a(zzaey zzaey, C3514ub ubVar) {
        C2857Yd.m11615f("Nonagon code path entered in octagon");
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public final void mo8527b(zzaey zzaey, C3514ub ubVar) {
        C2857Yd.m11615f("Nonagon code path entered in octagon");
        throw new IllegalArgumentException();
    }
}
