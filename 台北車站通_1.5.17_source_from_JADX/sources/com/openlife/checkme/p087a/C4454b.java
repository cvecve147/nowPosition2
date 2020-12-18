package com.openlife.checkme.p087a;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1850a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.C3937d;
import com.google.android.gms.location.C3938e;
import com.google.android.gms.location.LocationRequest;
import com.nostra13.universalimageloader.core.download.BaseImageDownloader;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.C4968s;
import java.lang.ref.WeakReference;
import p013b.p018b.p028h.p029a.C1006a;
import p101d.p204k.p205a.C6053f;

/* renamed from: com.openlife.checkme.a.b */
public class C4454b implements GoogleApiClient.C1848b, GoogleApiClient.C1849c, C3937d {

    /* renamed from: a */
    private LocationRequest f13125a;

    /* renamed from: b */
    private GoogleApiClient f13126b;

    /* renamed from: c */
    private LocationManager f13127c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final WeakReference<Context> f13128d;

    /* renamed from: e */
    private int f13129e = 10000;

    /* renamed from: f */
    private int f13130f = BaseImageDownloader.DEFAULT_HTTP_CONNECT_TIMEOUT;

    /* renamed from: g */
    private boolean f13131g = false;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C4456b f13132h;

    /* renamed from: i */
    private C4455a f13133i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f13134j = false;

    /* renamed from: com.openlife.checkme.a.b$a */
    private class C4455a implements C3937d {

        /* renamed from: a */
        private final WeakReference<C3937d> f13135a;

        C4455a(C3937d dVar) {
            this.f13135a = new WeakReference<>(dVar);
        }

        public void onLocationChanged(Location location) {
            if (this.f13135a.get() != null && !C4454b.this.f13134j && C4454b.this.f13132h != null && C4454b.this.f13128d.get() != null) {
                C4454b.this.f13132h.mo12570a(location);
            }
        }
    }

    /* renamed from: com.openlife.checkme.a.b$b */
    public interface C4456b {
        /* renamed from: a */
        void mo12568a();

        /* renamed from: a */
        void mo12569a(int i);

        /* renamed from: a */
        void mo12570a(Location location);

        /* renamed from: b */
        void mo12571b();

        /* renamed from: c */
        void mo12572c(int i);

        /* renamed from: d */
        void mo12573d(int i);

        /* renamed from: g */
        void mo12574g();
    }

    public C4454b(Context context) {
        this.f13128d = new WeakReference<>(context);
        this.f13133i = new C4455a(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m17666e() {
        Context context = (Context) this.f13128d.get();
        if (context != null) {
            this.f13125a = new LocationRequest();
            this.f13125a.mo11141b((long) this.f13129e);
            this.f13125a.mo11140a((long) this.f13130f);
            this.f13125a.mo11143c(100);
            GoogleApiClient.C1847a aVar = new GoogleApiClient.C1847a(context.getApplicationContext());
            aVar.mo7256a((GoogleApiClient.C1848b) this);
            aVar.mo7257a((GoogleApiClient.C1849c) this);
            aVar.mo7258a((C1850a<? extends C1850a.C1854d.C1858d>) C3938e.f11825c);
            this.f13126b = aVar.mo7259a();
            if (!this.f13126b.mo7252b()) {
                this.f13126b.connect();
                this.f13131g = true;
            }
        }
    }

    /* renamed from: f */
    private boolean m17667f() {
        Context context = (Context) this.f13128d.get();
        if (context == null) {
            return false;
        }
        if (C1006a.m5387a(context, "android.permission.ACCESS_FINE_LOCATION") != 0 && C1006a.m5387a(context, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
            return false;
        }
        this.f13127c = (LocationManager) context.getSystemService("location");
        LocationManager locationManager = this.f13127c;
        if (locationManager == null) {
            return false;
        }
        if (!locationManager.isProviderEnabled("gps")) {
            C4456b bVar = this.f13132h;
            if (bVar != null) {
                bVar.mo12572c(C4961l.g_gps_msg);
            }
            this.f13127c = null;
            return false;
        }
        this.f13127c = null;
        return true;
    }

    /* renamed from: g */
    private void m17668g() {
        GoogleApiClient googleApiClient;
        Context context = (Context) this.f13128d.get();
        if ((context == null || C1006a.m5387a(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || C1006a.m5387a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) && (googleApiClient = this.f13126b) != null && googleApiClient.mo7252b()) {
            C3938e.f11826d.mo10331a(this.f13126b, this.f13125a, this);
            if (this.f13132h != null && this.f13128d.get() != null) {
                Location a = C3938e.f11826d.mo10330a(this.f13126b);
                if (a != null) {
                    this.f13133i.onLocationChanged(a);
                    return;
                }
                this.f13127c = (LocationManager) context.getSystemService("location");
                LocationManager locationManager = this.f13127c;
                if (locationManager != null && (!locationManager.isProviderEnabled("gps") || !this.f13127c.isProviderEnabled("network"))) {
                    this.f13132h.mo12571b();
                }
                this.f13132h.mo12568a();
                this.f13127c = null;
            }
        }
    }

    /* renamed from: a */
    public void mo12562a() {
        GoogleApiClient googleApiClient = this.f13126b;
        if (googleApiClient != null && !googleApiClient.mo7252b() && this.f13131g) {
            this.f13126b.connect();
            this.f13126b.mo7247a((GoogleApiClient.C1848b) this);
            this.f13126b.mo7248a((GoogleApiClient.C1849c) this);
        }
    }

    /* renamed from: a */
    public void mo12563a(Activity activity) {
        if (((Context) this.f13128d.get()) != null) {
            new C6053f(activity).mo16004c(C4968s.m19591a()).mo16543b(new C4453a(this));
        }
    }

    /* renamed from: a */
    public void mo7263a(ConnectionResult connectionResult) {
        C4456b bVar = this.f13132h;
        if (bVar != null) {
            bVar.mo12573d(C4961l.g_location_error_msg);
        }
    }

    /* renamed from: a */
    public void mo12564a(C4456b bVar) {
        this.f13132h = bVar;
    }

    /* renamed from: b */
    public void mo12565b() {
        GoogleApiClient googleApiClient = this.f13126b;
        if (googleApiClient != null && googleApiClient.mo7252b()) {
            C3938e.f11826d.mo10332a(this.f13126b, this);
            this.f13126b.mo7250b((GoogleApiClient.C1848b) this);
            this.f13126b.mo7251b((GoogleApiClient.C1849c) this);
            this.f13126b.disconnect();
        }
    }

    /* renamed from: c */
    public void mo12566c() {
        this.f13134j = true;
    }

    /* renamed from: d */
    public void mo12567d() {
        this.f13132h = null;
    }

    /* renamed from: f */
    public void mo7261f(int i) {
    }

    /* renamed from: j */
    public void mo7262j(Bundle bundle) {
        if (m17667f()) {
            m17668g();
        }
    }

    public void onLocationChanged(Location location) {
        if (location != null) {
            this.f13133i.onLocationChanged(location);
        }
    }
}
