package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C1678D;
import com.google.android.gms.ads.internal.C1690P;
import com.google.android.gms.ads.internal.C1697X;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.http.protocol.HTTP;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.X */
public final class C2825X implements Callable<C2254Dd> {

    /* renamed from: a */
    private static long f8584a = 10;

    /* renamed from: b */
    private final Context f8585b;

    /* renamed from: c */
    private final C2632Qe f8586c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1678D f8587d;

    /* renamed from: e */
    private final C2209Bp f8588e;

    /* renamed from: f */
    private final C3370pa f8589f;

    /* renamed from: g */
    private final Object f8590g = new Object();

    /* renamed from: h */
    private final C2282Ed f8591h;

    /* renamed from: i */
    private final C2930_u f8592i;

    /* renamed from: j */
    private boolean f8593j;

    /* renamed from: k */
    private int f8594k;

    /* renamed from: l */
    private List<String> f8595l;

    /* renamed from: m */
    private JSONObject f8596m;

    /* renamed from: n */
    private String f8597n;

    /* renamed from: o */
    private String f8598o;

    public C2825X(Context context, C1678D d, C2632Qe qe, C2209Bp bp, C2282Ed ed, C2930_u _uVar) {
        this.f8585b = context;
        this.f8587d = d;
        this.f8586c = qe;
        this.f8591h = ed;
        this.f8588e = bp;
        this.f8592i = _uVar;
        this.f8589f = d.mo6762mc();
        this.f8593j = false;
        this.f8594k = -2;
        this.f8595l = null;
        this.f8597n = null;
        this.f8598o = null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        if (r4.length() != 0) goto L_0x0046;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007f A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a9 A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0152 A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0153 A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01bb A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01f0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C2254Dd call() {
        /*
            r15 = this;
            java.lang.String r0 = "custom_template_id"
            r1 = 0
            r2 = 0
            com.google.android.gms.ads.internal.D r3 = r15.f8587d     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            java.lang.String r12 = r3.mo6760kc()     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            boolean r3 = r15.m11532b()     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            if (r3 != 0) goto L_0x006e
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            com.google.android.gms.internal.ads.Ed r4 = r15.f8591h     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            com.google.android.gms.internal.ads.zzaej r4 = r4.f6943b     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            java.lang.String r4 = r4.f10805d     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            r3.<init>(r4)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            com.google.android.gms.internal.ads.Ed r5 = r15.f8591h     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            com.google.android.gms.internal.ads.zzaej r5 = r5.f6943b     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            java.lang.String r5 = r5.f10805d     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            r4.<init>(r5)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            int r5 = r4.length()     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            java.lang.String r6 = "ads"
            if (r5 == 0) goto L_0x0042
            org.json.JSONArray r4 = r4.optJSONArray(r6)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            if (r4 == 0) goto L_0x0039
            org.json.JSONObject r4 = r4.optJSONObject(r1)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            goto L_0x003a
        L_0x0039:
            r4 = r2
        L_0x003a:
            if (r4 == 0) goto L_0x0042
            int r4 = r4.length()     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            if (r4 != 0) goto L_0x0046
        L_0x0042:
            r4 = 3
            r15.m11526a((int) r4)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
        L_0x0046:
            com.google.android.gms.internal.ads.pa r4 = r15.f8589f     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            com.google.android.gms.internal.ads.Wf r3 = r4.mo9856b(r3)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            long r4 = f8584a     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            java.lang.Object r3 = r3.get(r4, r7)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            org.json.JSONObject r3 = (org.json.JSONObject) r3     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            java.lang.String r4 = "success"
            boolean r4 = r3.optBoolean(r4, r1)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            if (r4 == 0) goto L_0x006e
            java.lang.String r4 = "json"
            org.json.JSONObject r3 = r3.getJSONObject(r4)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            org.json.JSONArray r3 = r3.optJSONArray(r6)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            org.json.JSONObject r3 = r3.getJSONObject(r1)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            r9 = r3
            goto L_0x006f
        L_0x006e:
            r9 = r2
        L_0x006f:
            java.lang.String r3 = "enable_omid"
            boolean r3 = r9.optBoolean(r3)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            java.lang.String r4 = "omid_settings"
            if (r3 != 0) goto L_0x007f
        L_0x0079:
            com.google.android.gms.internal.ads.Vf r5 = com.google.android.gms.internal.ads.C2483Lf.m10495a(r2)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            r13 = r5
            goto L_0x00a3
        L_0x007f:
            org.json.JSONObject r5 = r9.optJSONObject(r4)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            if (r5 != 0) goto L_0x0086
            goto L_0x0079
        L_0x0086:
            java.lang.String r6 = "omid_html"
            java.lang.String r5 = r5.optString(r6)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            if (r6 == 0) goto L_0x0093
            goto L_0x0079
        L_0x0093:
            com.google.android.gms.internal.ads.gg r6 = new com.google.android.gms.internal.ads.gg     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            r6.<init>()     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            java.util.concurrent.Executor r7 = com.google.android.gms.internal.ads.C2972bg.f8938a     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            com.google.android.gms.internal.ads.Y r8 = new com.google.android.gms.internal.ads.Y     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            r8.<init>(r15, r6, r5)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            r7.execute(r8)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            r13 = r6
        L_0x00a3:
            boolean r5 = r15.m11532b()     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            if (r5 != 0) goto L_0x0147
            if (r9 != 0) goto L_0x00ad
            goto L_0x0147
        L_0x00ad:
            java.lang.String r5 = "template_id"
            java.lang.String r5 = r9.getString(r5)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            com.google.android.gms.internal.ads.Ed r6 = r15.f8591h     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            com.google.android.gms.internal.ads.zzaef r6 = r6.f6942a     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            com.google.android.gms.internal.ads.zzpl r6 = r6.f10776y     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            if (r6 == 0) goto L_0x00c4
            com.google.android.gms.internal.ads.Ed r6 = r15.f8591h     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            com.google.android.gms.internal.ads.zzaef r6 = r6.f6942a     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            com.google.android.gms.internal.ads.zzpl r6 = r6.f10776y     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            boolean r6 = r6.f10909b     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            goto L_0x00c5
        L_0x00c4:
            r6 = r1
        L_0x00c5:
            com.google.android.gms.internal.ads.Ed r7 = r15.f8591h     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            com.google.android.gms.internal.ads.zzaef r7 = r7.f6942a     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            com.google.android.gms.internal.ads.zzpl r7 = r7.f10776y     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            if (r7 == 0) goto L_0x00d6
            com.google.android.gms.internal.ads.Ed r7 = r15.f8591h     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            com.google.android.gms.internal.ads.zzaef r7 = r7.f6942a     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            com.google.android.gms.internal.ads.zzpl r7 = r7.f10776y     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            boolean r7 = r7.f10911d     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            goto L_0x00d7
        L_0x00d6:
            r7 = r1
        L_0x00d7:
            java.lang.String r8 = "2"
            boolean r8 = r8.equals(r5)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            if (r8 == 0) goto L_0x00e9
            com.google.android.gms.internal.ads.qa r0 = new com.google.android.gms.internal.ads.qa     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            com.google.android.gms.internal.ads.Ed r5 = r15.f8591h     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            boolean r5 = r5.f6951j     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            r0.<init>(r6, r7, r5)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            goto L_0x0148
        L_0x00e9:
            java.lang.String r8 = "1"
            boolean r8 = r8.equals(r5)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            if (r8 == 0) goto L_0x00fb
            com.google.android.gms.internal.ads.ra r0 = new com.google.android.gms.internal.ads.ra     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            com.google.android.gms.internal.ads.Ed r5 = r15.f8591h     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            boolean r5 = r5.f6951j     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            r0.<init>(r6, r7, r5)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            goto L_0x0148
        L_0x00fb:
            java.lang.String r7 = "3"
            boolean r5 = r7.equals(r5)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            if (r5 == 0) goto L_0x0144
            java.lang.String r5 = r9.getString(r0)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            com.google.android.gms.internal.ads.gg r7 = new com.google.android.gms.internal.ads.gg     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            r7.<init>()     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            android.os.Handler r8 = com.google.android.gms.internal.ads.C3114ge.f9351a     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            com.google.android.gms.internal.ads.aa r10 = new com.google.android.gms.internal.ads.aa     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            r10.<init>(r15, r7, r5)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            r8.post(r10)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            long r10 = f8584a     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            java.lang.Object r5 = r7.get(r10, r5)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            if (r5 == 0) goto L_0x0126
            com.google.android.gms.internal.ads.sa r0 = new com.google.android.gms.internal.ads.sa     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            r0.<init>(r6)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            goto L_0x0148
        L_0x0126:
            java.lang.String r5 = "No handler for custom template: "
            java.lang.String r0 = r9.getString(r0)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            int r6 = r0.length()     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            if (r6 == 0) goto L_0x013b
            java.lang.String r0 = r5.concat(r0)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            goto L_0x0140
        L_0x013b:
            java.lang.String r0 = new java.lang.String     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            r0.<init>(r5)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
        L_0x0140:
            com.google.android.gms.internal.ads.C2227Cf.m9529a((java.lang.String) r0)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            goto L_0x0147
        L_0x0144:
            r15.m11526a((int) r1)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
        L_0x0147:
            r0 = r2
        L_0x0148:
            boolean r5 = r15.m11532b()     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            if (r5 != 0) goto L_0x01b6
            if (r0 == 0) goto L_0x01b6
            if (r9 != 0) goto L_0x0153
            goto L_0x01b6
        L_0x0153:
            java.lang.String r5 = "tracking_urls_and_actions"
            org.json.JSONObject r5 = r9.getJSONObject(r5)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            java.lang.String r6 = "impression_tracking_urls"
            org.json.JSONArray r6 = r5.optJSONArray(r6)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            if (r6 != 0) goto L_0x0163
            r7 = r2
            goto L_0x0179
        L_0x0163:
            int r7 = r6.length()     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            r8 = r1
        L_0x016a:
            int r10 = r6.length()     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            if (r8 >= r10) goto L_0x0179
            java.lang.String r10 = r6.getString(r8)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            r7[r8] = r10     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            int r8 = r8 + 1
            goto L_0x016a
        L_0x0179:
            if (r7 != 0) goto L_0x017d
            r6 = r2
            goto L_0x0181
        L_0x017d:
            java.util.List r6 = java.util.Arrays.asList(r7)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
        L_0x0181:
            r15.f8595l = r6     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            java.lang.String r6 = "active_view"
            org.json.JSONObject r5 = r5.optJSONObject(r6)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            r15.f8596m = r5     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            java.lang.String r5 = "debug_signals"
            java.lang.String r5 = r9.optString(r5)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            r15.f8597n = r5     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            java.lang.String r4 = r9.optString(r4)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            r15.f8598o = r4     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            com.google.android.gms.internal.ads.Fv r0 = r0.mo9445a(r15, r9)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            com.google.android.gms.internal.ads.Hv r14 = new com.google.android.gms.internal.ads.Hv     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            android.content.Context r5 = r15.f8585b     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            com.google.android.gms.ads.internal.D r6 = r15.f8587d     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            com.google.android.gms.internal.ads.pa r7 = r15.f8589f     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            com.google.android.gms.internal.ads.Bp r8 = r15.f8588e     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            com.google.android.gms.internal.ads.Ed r4 = r15.f8591h     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            com.google.android.gms.internal.ads.zzaef r4 = r4.f6942a     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            com.google.android.gms.internal.ads.zzang r11 = r4.f10762k     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            r4 = r14
            r10 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            r0.mo8104a(r14)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            goto L_0x01b7
        L_0x01b6:
            r0 = r2
        L_0x01b7:
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.C3564vv     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            if (r4 == 0) goto L_0x01ca
            r4 = r0
            com.google.android.gms.internal.ads.vv r4 = (com.google.android.gms.internal.ads.C3564vv) r4     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            com.google.android.gms.internal.ads.ba r5 = new com.google.android.gms.internal.ads.ba     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            r5.<init>(r15, r4)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            com.google.android.gms.internal.ads.pa r4 = r15.f8589f     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            java.lang.String r6 = "/nativeAdCustomClick"
            r4.mo9857b(r6, r5)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
        L_0x01ca:
            com.google.android.gms.internal.ads.Dd r0 = r15.m11522a((com.google.android.gms.internal.ads.C2329Fv) r0, (boolean) r3)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            com.google.android.gms.ads.internal.D r3 = r15.f8587d     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            com.google.android.gms.internal.ads.uh r4 = m11529b((com.google.android.gms.internal.ads.C2804Wf<com.google.android.gms.internal.ads.C3520uh>) r13)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            r3.mo6753b((com.google.android.gms.internal.ads.C3520uh) r4)     // Catch:{ CancellationException -> 0x01e6, ExecutionException -> 0x01e4, InterruptedException -> 0x01e2, JSONException -> 0x01e0, TimeoutException -> 0x01dc, Exception -> 0x01d8 }
            return r0
        L_0x01d8:
            r0 = move-exception
            java.lang.String r3 = "Error occured while doing native ads initialization."
            goto L_0x01e9
        L_0x01dc:
            r0 = move-exception
            java.lang.String r3 = "Timeout when loading native ad."
            goto L_0x01e9
        L_0x01e0:
            r0 = move-exception
            goto L_0x01e7
        L_0x01e2:
            r0 = move-exception
            goto L_0x01e7
        L_0x01e4:
            r0 = move-exception
            goto L_0x01e7
        L_0x01e6:
            r0 = move-exception
        L_0x01e7:
            java.lang.String r3 = "Malformed native JSON response."
        L_0x01e9:
            com.google.android.gms.internal.ads.C2227Cf.m9535c(r3, r0)
            boolean r0 = r15.f8593j
            if (r0 != 0) goto L_0x01f3
            r15.m11526a((int) r1)
        L_0x01f3:
            com.google.android.gms.internal.ads.Dd r0 = r15.m11522a((com.google.android.gms.internal.ads.C2329Fv) r2, (boolean) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2825X.call():com.google.android.gms.internal.ads.Dd");
    }

    /* renamed from: a */
    private final C2254Dd m11522a(C2329Fv fv, boolean z) {
        int i;
        synchronized (this.f8590g) {
            int i2 = this.f8594k;
            if (fv == null && this.f8594k == -2) {
                i2 = 0;
            }
            i = i2;
        }
        C2329Fv fv2 = i != -2 ? null : fv;
        C2282Ed ed = this.f8591h;
        zzaef zzaef = ed.f6942a;
        zzjj zzjj = zzaef.f10753c;
        zzaej zzaej = ed.f6943b;
        zzaej zzaej2 = zzaej;
        return new C2254Dd(zzjj, (C3520uh) null, zzaej.f10806e, i, zzaej.f10808g, this.f8595l, zzaej.f10814m, zzaej.f10813l, zzaef.f10760i, false, (C3568vz) null, (C2626Pz) null, (String) null, (C3596wz) null, (C3681zz) null, 0, ed.f6945d, zzaej2.f10809h, ed.f6947f, ed.f6948g, zzaej2.f10817p, this.f8596m, fv2, (zzaig) null, (List<String>) null, (List<String>) null, zzaej2.f10784G, zzaej2.f10785H, (String) null, zzaej2.f10788K, this.f8597n, ed.f6950i, zzaej2.f10796S, ed.f6951j, z, zzaej2.f10799V, zzaej2.f10800W, this.f8598o);
    }

    /* renamed from: a */
    private final C2804Wf<C3420qv> m11523a(JSONObject jSONObject, boolean z, boolean z2) {
        String string = z ? jSONObject.getString("url") : jSONObject.optString("url");
        double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        if (!TextUtils.isEmpty(string)) {
            return z2 ? C2483Lf.m10495a(new C3420qv((Drawable) null, Uri.parse(string), optDouble)) : this.f8586c.mo8741a(string, new C3053ea(this, z, optDouble, optBoolean, string));
        }
        mo9017a(0, z);
        return C2483Lf.m10495a(null);
    }

    /* renamed from: a */
    static C3520uh m11524a(C2804Wf<C3520uh> wf) {
        try {
            return (C3520uh) wf.get((long) ((Integer) C3390pt.m13458f().mo8515a(C2558Nu.f7831Vc)).intValue(), TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            C2227Cf.m9535c("InterruptedException occurred while waiting for video to load", e);
            Thread.currentThread().interrupt();
            return null;
        } catch (CancellationException | ExecutionException | TimeoutException e2) {
            C2227Cf.m9535c("Exception occurred while waiting for video to load", e2);
            return null;
        }
    }

    /* renamed from: a */
    private final void m11526a(int i) {
        synchronized (this.f8590g) {
            this.f8593j = true;
            this.f8594k = i;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m11528a(C3507tw twVar, String str) {
        try {
            C2302Ew p = this.f8587d.mo6765p(twVar.mo10061l());
            if (p != null) {
                p.mo8060a(twVar, str);
            }
        } catch (RemoteException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
            sb.append("Failed to call onCustomClick for asset ");
            sb.append(str);
            sb.append(".");
            C2227Cf.m9535c(sb.toString(), e);
        }
    }

    /* renamed from: b */
    private static C3520uh m11529b(C2804Wf<C3520uh> wf) {
        try {
            return (C3520uh) wf.get((long) ((Integer) C3390pt.m13458f().mo8515a(C2558Nu.f7836Wc)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            C2227Cf.m9535c("", e);
            Thread.currentThread().interrupt();
            return null;
        } catch (CancellationException | ExecutionException | TimeoutException e2) {
            C2227Cf.m9535c("", e2);
            return null;
        }
    }

    /* renamed from: b */
    private static Integer m11530b(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static <V> List<V> m11531b(List<C2804Wf<V>> list) {
        ArrayList arrayList = new ArrayList();
        for (C2804Wf<V> wf : list) {
            Object obj = wf.get();
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private final boolean m11532b() {
        boolean z;
        synchronized (this.f8590g) {
            z = this.f8593j;
        }
        return z;
    }

    /* renamed from: a */
    public final C2804Wf<C3306mv> mo9012a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return C2483Lf.m10495a(null);
        }
        String optString = optJSONObject.optString("text");
        int optInt = optJSONObject.optInt("text_size", -1);
        Integer b = m11530b(optJSONObject, "text_color");
        Integer b2 = m11530b(optJSONObject, "bg_color");
        int optInt2 = optJSONObject.optInt("animation_ms", 1000);
        int optInt3 = optJSONObject.optInt("presentation_ms", 4000);
        zzpl zzpl = this.f8591h.f6942a.f10776y;
        int i = (zzpl == null || zzpl.f10908a < 2) ? 1 : zzpl.f10912e;
        boolean optBoolean = optJSONObject.optBoolean("allow_pub_rendering");
        List<C2804Wf> arrayList = new ArrayList<>();
        if (optJSONObject.optJSONArray("images") != null) {
            arrayList = mo9015a(optJSONObject, "images", false, false, true);
        } else {
            arrayList.add(mo9014a(optJSONObject, "image", false, false));
        }
        C3116gg ggVar = new C3116gg();
        int size = arrayList.size();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        for (C2804Wf a : arrayList) {
            a.mo8923a(new C3081fa(atomicInteger, size, ggVar, arrayList), C3057ee.f9097a);
            arrayList = arrayList;
        }
        return C2483Lf.m10498a(ggVar, new C3023da(this, optString, b2, b, optInt, optInt3, optInt2, i, optBoolean), (Executor) C3057ee.f9097a);
    }

    /* renamed from: a */
    public final C2804Wf<C3520uh> mo9013a(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return C2483Lf.m10495a(null);
        }
        if (TextUtils.isEmpty(optJSONObject.optString("vast_xml"))) {
            C2227Cf.m9536d("Required field 'vast_xml' is missing");
            return C2483Lf.m10495a(null);
        }
        C3138ha haVar = new C3138ha(this.f8585b, this.f8588e, this.f8591h, this.f8592i, this.f8587d);
        C3116gg ggVar = new C3116gg();
        C2972bg.f8938a.execute(new C3166ia(haVar, optJSONObject, ggVar));
        return ggVar;
    }

    /* renamed from: a */
    public final C2804Wf<C3420qv> mo9014a(JSONObject jSONObject, String str, boolean z, boolean z2) {
        JSONObject jSONObject2 = z ? jSONObject.getJSONObject(str) : jSONObject.optJSONObject(str);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return m11523a(jSONObject2, z, z2);
    }

    /* renamed from: a */
    public final List<C2804Wf<C3420qv>> mo9015a(JSONObject jSONObject, String str, boolean z, boolean z2, boolean z3) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        ArrayList arrayList = new ArrayList();
        if (optJSONArray == null || optJSONArray.length() == 0) {
            mo9017a(0, false);
            return arrayList;
        }
        int length = z3 ? optJSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            arrayList.add(m11523a(jSONObject2, false, z2));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final Future<C3420qv> mo9016a(JSONObject jSONObject, String str, boolean z) {
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        boolean optBoolean = jSONObject2.optBoolean("require", true);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return m11523a(jSONObject2, optBoolean, z);
    }

    /* renamed from: a */
    public final void mo9017a(int i, boolean z) {
        if (z) {
            m11526a(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo9018a(C3116gg ggVar, String str) {
        try {
            C1697X.m7699f();
            C3520uh a = C2201Bh.m9441a(this.f8585b, C3146hi.m12526b(), "native-omid", false, false, this.f8588e, this.f8591h.f6942a.f10762k, this.f8592i, (C1690P) null, this.f8587d.mo6879kb(), this.f8591h.f6950i);
            a.mo8182mb().mo9230a((C3003ci) new C2881Z(ggVar, a));
            a.loadData(str, "text/html", HTTP.UTF_8);
        } catch (Exception e) {
            ggVar.mo9464b(null);
            C2227Cf.m9535c("", e);
        }
    }
}
