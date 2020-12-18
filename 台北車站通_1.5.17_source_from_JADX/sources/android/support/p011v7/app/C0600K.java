package android.support.p011v7.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;
import p013b.p018b.p028h.p029a.C1023e;

/* renamed from: android.support.v7.app.K */
class C0600K {

    /* renamed from: a */
    private static C0600K f2264a;

    /* renamed from: b */
    private final Context f2265b;

    /* renamed from: c */
    private final LocationManager f2266c;

    /* renamed from: d */
    private final C0601a f2267d = new C0601a();

    /* renamed from: android.support.v7.app.K$a */
    private static class C0601a {

        /* renamed from: a */
        boolean f2268a;

        /* renamed from: b */
        long f2269b;

        /* renamed from: c */
        long f2270c;

        /* renamed from: d */
        long f2271d;

        /* renamed from: e */
        long f2272e;

        /* renamed from: f */
        long f2273f;

        C0601a() {
        }
    }

    C0600K(Context context, LocationManager locationManager) {
        this.f2265b = context;
        this.f2266c = locationManager;
    }

    /* renamed from: a */
    private Location m2943a(String str) {
        try {
            if (this.f2266c.isProviderEnabled(str)) {
                return this.f2266c.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    /* renamed from: a */
    static C0600K m2944a(Context context) {
        if (f2264a == null) {
            Context applicationContext = context.getApplicationContext();
            f2264a = new C0600K(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f2264a;
    }

    /* renamed from: a */
    private void m2945a(Location location) {
        long j;
        C0601a aVar = this.f2267d;
        long currentTimeMillis = System.currentTimeMillis();
        C0599J a = C0599J.m2941a();
        C0599J j2 = a;
        j2.mo2541a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j3 = a.f2261b;
        j2.mo2541a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = true;
        if (a.f2263d != 1) {
            z = false;
        }
        long j4 = a.f2262c;
        long j5 = j3;
        long j6 = a.f2261b;
        long j7 = j4;
        boolean z2 = z;
        a.mo2541a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j8 = a.f2262c;
        if (j7 == -1 || j6 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j6 ? 0 + j8 : currentTimeMillis > j7 ? 0 + j6 : 0 + j7) + 60000;
        }
        aVar.f2268a = z2;
        aVar.f2269b = j5;
        aVar.f2270c = j7;
        aVar.f2271d = j6;
        aVar.f2272e = j8;
        aVar.f2273f = j;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    private Location m2946b() {
        Location location = null;
        Location a = C1023e.m5438b(this.f2265b, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m2943a("network") : null;
        if (C1023e.m5438b(this.f2265b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = m2943a("gps");
        }
        return (location == null || a == null) ? location != null ? location : a : location.getTime() > a.getTime() ? location : a;
    }

    /* renamed from: c */
    private boolean m2947c() {
        return this.f2267d.f2273f > System.currentTimeMillis();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2542a() {
        C0601a aVar = this.f2267d;
        if (m2947c()) {
            return aVar.f2268a;
        }
        Location b = m2946b();
        if (b != null) {
            m2945a(b);
            return aVar.f2268a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
