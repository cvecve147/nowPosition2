package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.ads.p066b.C1636a;
import java.util.Map;
import org.apache.http.HttpHeaders;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.MA */
public final class C2507MA extends C3311n {

    /* renamed from: c */
    private final Map<String, String> f7550c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Context f7551d;

    /* renamed from: e */
    private String f7552e = m10578d("description");

    /* renamed from: f */
    private long f7553f = m10579e("start_ticks");

    /* renamed from: g */
    private long f7554g = m10579e("end_ticks");

    /* renamed from: h */
    private String f7555h = m10578d("summary");

    /* renamed from: i */
    private String f7556i = m10578d("location");

    public C2507MA(C3520uh uhVar, Map<String, String> map) {
        super(uhVar, "createCalendarEvent");
        this.f7550c = map;
        this.f7551d = uhVar.mo8163eb();
    }

    /* renamed from: d */
    private final String m10578d(String str) {
        return TextUtils.isEmpty(this.f7550c.get(str)) ? "" : this.f7550c.get(str);
    }

    /* renamed from: e */
    private final long m10579e(String str) {
        String str2 = this.f7550c.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    @TargetApi(14)
    /* renamed from: a */
    public final Intent mo8522a() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.f7552e);
        data.putExtra("eventLocation", this.f7556i);
        data.putExtra("description", this.f7555h);
        long j = this.f7553f;
        if (j > -1) {
            data.putExtra("beginTime", j);
        }
        long j2 = this.f7554g;
        if (j2 > -1) {
            data.putExtra("endTime", j2);
        }
        data.setFlags(268435456);
        return data;
    }

    /* renamed from: b */
    public final void mo8523b() {
        if (this.f7551d == null) {
            mo9766a("Activity context is not available.");
            return;
        }
        C1697X.m7698e();
        if (!C3114ge.m12439f(this.f7551d).mo10259d()) {
            mo9766a("This feature is not available on the device.");
            return;
        }
        C1697X.m7698e();
        AlertDialog.Builder e = C3114ge.m12435e(this.f7551d);
        Resources b = C1697X.m7702i().mo8321b();
        e.setTitle(b != null ? b.getString(C1636a.f5453s5) : "Create calendar event");
        e.setMessage(b != null ? b.getString(C1636a.f5454s6) : "Allow Ad to create a calendar event?");
        e.setPositiveButton(b != null ? b.getString(C1636a.f5451s3) : HttpHeaders.ACCEPT, new C2535NA(this));
        e.setNegativeButton(b != null ? b.getString(C1636a.f5452s4) : "Decline", new C2993c(this));
        e.create().show();
    }
}
