package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.location.Location;
import android.os.IBinder;
import com.google.android.gms.common.api.internal.C1939j;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.location.C3936c;
import com.google.android.gms.location.C3937d;
import com.google.android.gms.location.C3950p;
import com.google.android.gms.location.C3953s;
import com.google.android.gms.location.LocationRequest;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.location.k */
public final class C3698k {

    /* renamed from: a */
    private final C3709v<C3696i> f10938a;

    /* renamed from: b */
    private final Context f10939b;

    /* renamed from: c */
    private ContentProviderClient f10940c = null;

    /* renamed from: d */
    private boolean f10941d = false;

    /* renamed from: e */
    private final Map<C1939j.C1940a<C3937d>, C3703p> f10942e = new HashMap();

    /* renamed from: f */
    private final Map<C1939j.C1940a<Object>, C3702o> f10943f = new HashMap();

    /* renamed from: g */
    private final Map<C1939j.C1940a<C3936c>, C3699l> f10944g = new HashMap();

    public C3698k(Context context, C3709v<C3696i> vVar) {
        this.f10939b = context;
        this.f10938a = vVar;
    }

    /* renamed from: a */
    private final C3703p m14807a(C1939j<C3937d> jVar) {
        C3703p pVar;
        synchronized (this.f10942e) {
            pVar = this.f10942e.get(jVar.mo7453b());
            if (pVar == null) {
                pVar = new C3703p(jVar);
            }
            this.f10942e.put(jVar.mo7453b(), pVar);
        }
        return pVar;
    }

    /* renamed from: a */
    public final Location mo10345a() {
        this.f10938a.mo10324a();
        return this.f10938a.mo10325b().mo10343b(this.f10939b.getPackageName());
    }

    /* renamed from: a */
    public final void mo10346a(C1939j.C1940a<C3937d> aVar, C3693f fVar) {
        this.f10938a.mo10324a();
        C2061y.m9068a(aVar, (Object) "Invalid null listener key");
        synchronized (this.f10942e) {
            C3703p remove = this.f10942e.remove(aVar);
            if (remove != null) {
                remove.mo10353Xa();
                this.f10938a.mo10325b().mo10341a(zzbf.m14843a((C3953s) remove, fVar));
            }
        }
    }

    /* renamed from: a */
    public final void mo10347a(LocationRequest locationRequest, C1939j<C3937d> jVar, C3693f fVar) {
        this.f10938a.mo10324a();
        this.f10938a.mo10325b().mo10341a(new zzbf(1, zzbd.m14841a(locationRequest), m14807a(jVar).asBinder(), (PendingIntent) null, (IBinder) null, fVar != null ? fVar.asBinder() : null));
    }

    /* renamed from: a */
    public final void mo10348a(boolean z) {
        this.f10938a.mo10324a();
        this.f10938a.mo10325b().mo10344j(z);
        this.f10941d = z;
    }

    /* renamed from: b */
    public final void mo10349b() {
        synchronized (this.f10942e) {
            for (C3703p next : this.f10942e.values()) {
                if (next != null) {
                    this.f10938a.mo10325b().mo10341a(zzbf.m14843a((C3953s) next, (C3693f) null));
                }
            }
            this.f10942e.clear();
        }
        synchronized (this.f10944g) {
            for (C3699l next2 : this.f10944g.values()) {
                if (next2 != null) {
                    this.f10938a.mo10325b().mo10341a(zzbf.m14842a((C3950p) next2, (C3693f) null));
                }
            }
            this.f10944g.clear();
        }
        synchronized (this.f10943f) {
            for (C3702o next3 : this.f10943f.values()) {
                if (next3 != null) {
                    this.f10938a.mo10325b().mo10342a(new zzo(2, (zzm) null, next3.asBinder(), (IBinder) null));
                }
            }
            this.f10943f.clear();
        }
    }

    /* renamed from: c */
    public final void mo10350c() {
        if (this.f10941d) {
            mo10348a(false);
        }
    }
}
