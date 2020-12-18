package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.measurement.ha */
final class C3849ha extends C3802Wa {

    /* renamed from: c */
    static final Pair<String, Long> f11469c = new Pair<>("", 0L);

    /* renamed from: d */
    private SharedPreferences f11470d;

    /* renamed from: e */
    public C3865la f11471e;

    /* renamed from: f */
    public final C3861ka f11472f = new C3861ka(this, "last_upload", 0);

    /* renamed from: g */
    public final C3861ka f11473g = new C3861ka(this, "last_upload_attempt", 0);

    /* renamed from: h */
    public final C3861ka f11474h = new C3861ka(this, "backoff", 0);

    /* renamed from: i */
    public final C3861ka f11475i = new C3861ka(this, "last_delete_stale", 0);

    /* renamed from: j */
    public final C3861ka f11476j = new C3861ka(this, "midnight_offset", 0);

    /* renamed from: k */
    public final C3861ka f11477k = new C3861ka(this, "first_open_time", 0);

    /* renamed from: l */
    public final C3861ka f11478l = new C3861ka(this, "app_install_time", 0);

    /* renamed from: m */
    public final C3869ma f11479m = new C3869ma(this, "app_instance_id", (String) null);

    /* renamed from: n */
    private String f11480n;

    /* renamed from: o */
    private boolean f11481o;

    /* renamed from: p */
    private long f11482p;

    /* renamed from: q */
    private String f11483q;

    /* renamed from: r */
    private long f11484r;

    /* renamed from: s */
    private final Object f11485s = new Object();

    /* renamed from: t */
    public final C3861ka f11486t = new C3861ka(this, "time_before_start", 10000);

    /* renamed from: u */
    public final C3861ka f11487u = new C3861ka(this, "session_timeout", 1800000);

    /* renamed from: v */
    public final C3857ja f11488v = new C3857ja(this, "start_new_session", true);

    /* renamed from: w */
    public final C3861ka f11489w = new C3861ka(this, "last_pause_time", 0);

    /* renamed from: x */
    public final C3861ka f11490x = new C3861ka(this, "time_active", 0);

    /* renamed from: y */
    public boolean f11491y;

    C3849ha(C3715Aa aa) {
        super(aa);
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public final SharedPreferences m15462F() {
        mo10451d();
        mo10588t();
        return this.f11470d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final Boolean mo10739A() {
        mo10451d();
        if (!m15462F().contains("use_service")) {
            return null;
        }
        return Boolean.valueOf(m15462F().getBoolean("use_service", false));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final void mo10740B() {
        mo10451d();
        mo10385b().mo10580F().mo10592a("Clearing collection preferences.");
        boolean contains = m15462F().contains("measurement_enabled");
        boolean z = true;
        if (contains) {
            z = mo10749c(true);
        }
        SharedPreferences.Editor edit = m15462F().edit();
        edit.clear();
        edit.apply();
        if (contains) {
            mo10745a(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final String mo10741C() {
        mo10451d();
        String string = m15462F().getString("previous_os_version", (String) null);
        mo10452j().mo10588t();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor edit = m15462F().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final boolean mo10742D() {
        mo10451d();
        return m15462F().getBoolean("deferred_analytics_collection", false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final boolean mo10743E() {
        return this.f11470d.contains("deferred_analytics_collection");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Pair<String, Boolean> mo10744a(String str) {
        mo10451d();
        long b = mo10382a().mo7726b();
        String str2 = this.f11480n;
        if (str2 != null && b < this.f11482p) {
            return new Pair<>(str2, Boolean.valueOf(this.f11481o));
        }
        this.f11482p = b + mo10456r().mo10998a(str, C3758L.f11201h);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(getContext());
            if (advertisingIdInfo != null) {
                this.f11480n = advertisingIdInfo.getId();
                this.f11481o = advertisingIdInfo.isLimitAdTrackingEnabled();
            }
            if (this.f11480n == null) {
                this.f11480n = "";
            }
        } catch (Exception e) {
            mo10385b().mo10579E().mo10593a("Unable to get advertising id", e);
            this.f11480n = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(this.f11480n, Boolean.valueOf(this.f11481o));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10745a(boolean z) {
        mo10451d();
        mo10385b().mo10580F().mo10593a("Setting measurementEnabled", Boolean.valueOf(z));
        SharedPreferences.Editor edit = m15462F().edit();
        edit.putBoolean("measurement_enabled", z);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo10746b(String str) {
        mo10451d();
        String str2 = (String) mo10744a(str).first;
        MessageDigest a = C3871mc.m15512a("MD5");
        if (a == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, a.digest(str2.getBytes()))});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo10747b(boolean z) {
        mo10451d();
        mo10385b().mo10580F().mo10593a("Setting useService", Boolean.valueOf(z));
        SharedPreferences.Editor edit = m15462F().edit();
        edit.putBoolean("use_service", z);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo10748c(String str) {
        mo10451d();
        SharedPreferences.Editor edit = m15462F().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo10749c(boolean z) {
        mo10451d();
        return m15462F().getBoolean("measurement_enabled", z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo10750d(String str) {
        synchronized (this.f11485s) {
            this.f11483q = str;
            this.f11484r = mo10382a().mo7726b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo10751d(boolean z) {
        mo10451d();
        mo10385b().mo10580F().mo10593a("Updating deferred analytics collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = m15462F().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final boolean mo10457u() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo10518v() {
        this.f11470d = getContext().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f11491y = this.f11470d.getBoolean("has_been_opened", false);
        if (!this.f11491y) {
            SharedPreferences.Editor edit = this.f11470d.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f11471e = new C3865la(this, "health_monitor", Math.max(0, C3758L.f11202i.mo10498a().longValue()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final String mo10752y() {
        mo10451d();
        return m15462F().getString("gmp_app_id", (String) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final String mo10753z() {
        synchronized (this.f11485s) {
            if (Math.abs(mo10382a().mo7726b() - this.f11484r) >= 1000) {
                return null;
            }
            String str = this.f11483q;
            return str;
        }
    }
}
