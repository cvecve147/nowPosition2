package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C1697X;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.He */
public final class C2370He {

    /* renamed from: a */
    private final Object f7128a = new Object();

    /* renamed from: b */
    private String f7129b = "";

    /* renamed from: c */
    private String f7130c = "";

    /* renamed from: d */
    private boolean f7131d = false;

    /* renamed from: e */
    private String f7132e = "";

    /* renamed from: a */
    private final String m10053a(Context context) {
        String str;
        synchronized (this.f7128a) {
            if (TextUtils.isEmpty(this.f7129b)) {
                C1697X.m7698e();
                this.f7129b = C3114ge.m12429c(context, "debug_signals_id.txt");
                if (TextUtils.isEmpty(this.f7129b)) {
                    C1697X.m7698e();
                    this.f7129b = C3114ge.m12399a();
                    C1697X.m7698e();
                    C3114ge.m12426b(context, "debug_signals_id.txt", this.f7129b);
                }
            }
            str = this.f7129b;
        }
        return str;
    }

    /* renamed from: a */
    private final void m10054a(Context context, String str, boolean z, boolean z2) {
        if (!(context instanceof Activity)) {
            C2227Cf.m9534c("Can not create dialog without Activity Context");
        } else {
            C3114ge.f9351a.post(new C2398Ie(this, context, str, z, z2));
        }
    }

    /* renamed from: b */
    private final boolean m10055b(Context context, String str, String str2) {
        String d = m10058d(context, m10056c(context, (String) C3390pt.m13458f().mo8515a(C2558Nu.f7874ce), str, str2).toString(), str2);
        if (TextUtils.isEmpty(d)) {
            C2227Cf.m9532b("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(d.trim());
            String optString = jSONObject.optString("gct");
            this.f7132e = jSONObject.optString("status");
            synchronized (this.f7128a) {
                this.f7130c = optString;
            }
            return true;
        } catch (JSONException e) {
            C2227Cf.m9535c("Fail to get in app preview response json.", e);
            return false;
        }
    }

    /* renamed from: c */
    private final Uri m10056c(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("linkedDeviceId", m10053a(context));
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    /* renamed from: c */
    private final boolean m10057c(Context context, String str, String str2) {
        String d = m10058d(context, m10056c(context, (String) C3390pt.m13458f().mo8515a(C2558Nu.f7880de), str, str2).toString(), str2);
        if (TextUtils.isEmpty(d)) {
            C2227Cf.m9532b("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(d.trim()).optString("debug_mode"));
            synchronized (this.f7128a) {
                this.f7131d = equals;
            }
            return equals;
        } catch (JSONException e) {
            C2227Cf.m9535c("Fail to get debug mode response json.", e);
            return false;
        }
    }

    /* renamed from: d */
    private static String m10058d(Context context, String str, String str2) {
        String str3;
        Throwable e;
        String str4;
        String str5;
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", C1697X.m7698e().mo9454b(context, str2));
        C2804Wf<String> a = new C2632Qe(context).mo8742a(str, (Map<String, String>) hashMap);
        try {
            return (String) a.get((long) ((Integer) C3390pt.m13458f().mo8515a(C2558Nu.f7892fe)).intValue(), TimeUnit.MILLISECONDS);
        } catch (TimeoutException e2) {
            e = e2;
            str5 = "Timeout while retriving a response from: ";
            str4 = String.valueOf(str);
            if (str4.length() == 0) {
                str3 = new String(str5);
                C2227Cf.m9533b(str3, e);
                a.cancel(true);
                return null;
            }
            str3 = str5.concat(str4);
            C2227Cf.m9533b(str3, e);
            a.cancel(true);
            return null;
        } catch (InterruptedException e3) {
            e = e3;
            str5 = "Interrupted while retriving a response from: ";
            str4 = String.valueOf(str);
            if (str4.length() == 0) {
                str3 = new String(str5);
                C2227Cf.m9533b(str3, e);
                a.cancel(true);
                return null;
            }
            str3 = str5.concat(str4);
            C2227Cf.m9533b(str3, e);
            a.cancel(true);
            return null;
        } catch (Exception e4) {
            String valueOf = String.valueOf(str);
            C2227Cf.m9533b(valueOf.length() != 0 ? "Error retriving a response from: ".concat(valueOf) : new String("Error retriving a response from: "), e4);
            return null;
        }
    }

    /* renamed from: e */
    private final void m10059e(Context context, String str, String str2) {
        C1697X.m7698e();
        C3114ge.m12408a(context, m10056c(context, (String) C3390pt.m13458f().mo8515a(C2558Nu.f7868be), str, str2));
    }

    /* renamed from: a */
    public final String mo8259a() {
        String str;
        synchronized (this.f7128a) {
            str = this.f7130c;
        }
        return str;
    }

    /* renamed from: a */
    public final void mo8260a(Context context, String str, String str2) {
        if (!m10055b(context, str, str2)) {
            m10054a(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
        } else if ("2".equals(this.f7132e)) {
            C2227Cf.m9532b("Creative is not pushed for this device.");
            m10054a(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(this.f7132e)) {
            C2227Cf.m9532b("The app is not linked for creative preview.");
            m10059e(context, str, str2);
        } else if ("0".equals(this.f7132e)) {
            C2227Cf.m9532b("Device is linked for in app preview.");
            m10054a(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    /* renamed from: a */
    public final void mo8261a(Context context, String str, String str2, String str3) {
        boolean b = mo8263b();
        if (m10057c(context, str, str2)) {
            if (!b && !TextUtils.isEmpty(str3)) {
                mo8262b(context, str2, str3, str);
            }
            C2227Cf.m9532b("Device is linked for debug signals.");
            m10054a(context, "The device is successfully linked for troubleshooting.", false, true);
            return;
        }
        m10059e(context, str, str2);
    }

    /* renamed from: b */
    public final void mo8262b(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = m10056c(context, (String) C3390pt.m13458f().mo8515a(C2558Nu.f7886ee), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        C1697X.m7698e();
        C3114ge.m12409a(context, str, buildUpon.build().toString());
    }

    /* renamed from: b */
    public final boolean mo8263b() {
        boolean z;
        synchronized (this.f7128a) {
            z = this.f7131d;
        }
        return z;
    }
}
