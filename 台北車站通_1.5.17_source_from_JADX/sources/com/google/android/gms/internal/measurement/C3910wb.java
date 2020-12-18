package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.p071b.C1985a;
import com.google.android.gms.common.util.C2083e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.wb */
public final class C3910wb extends C3802Wa {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3756Kb f11701c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C3766N f11702d;

    /* renamed from: e */
    private volatile Boolean f11703e;

    /* renamed from: f */
    private final C3726D f11704f;

    /* renamed from: g */
    private final C3818_b f11705g;

    /* renamed from: h */
    private final List<Runnable> f11706h = new ArrayList();

    /* renamed from: i */
    private final C3726D f11707i;

    protected C3910wb(C3715Aa aa) {
        super(aa);
        this.f11705g = new C3818_b(aa.mo10382a());
        this.f11701c = new C3756Kb(this);
        this.f11704f = new C3914xb(this, aa);
        this.f11707i = new C3724Cb(this, aa);
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public final void m15820F() {
        mo10451d();
        this.f11705g.mo10632b();
        this.f11704f.mo10439a(C3758L.f11179M.mo10498a().longValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public final void m15821G() {
        mo10451d();
        if (mo11040z()) {
            mo10385b().mo10580F().mo10592a("Inactivity, disconnecting from the service");
            mo11039y();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public final void m15822H() {
        mo10451d();
        mo10385b().mo10580F().mo10593a("Processing queued up service tasks", Integer.valueOf(this.f11706h.size()));
        for (Runnable run : this.f11706h) {
            try {
                run.run();
            } catch (Exception e) {
                mo10385b().mo10585y().mo10593a("Task exception while flushing queue", e);
            }
        }
        this.f11706h.clear();
        this.f11707i.mo10438a();
    }

    /* renamed from: a */
    private final zzdz m15825a(boolean z) {
        return mo10568i().mo10517a(z ? mo10385b().mo10581G() : null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m15826a(ComponentName componentName) {
        mo10451d();
        if (this.f11702d != null) {
            this.f11702d = null;
            mo10385b().mo10580F().mo10593a("Disconnected from device MeasurementService", componentName);
            mo10451d();
            mo11025B();
        }
    }

    /* renamed from: a */
    private final void m15828a(Runnable runnable) {
        mo10451d();
        if (mo11040z()) {
            runnable.run();
        } else if (((long) this.f11706h.size()) >= 1000) {
            mo10385b().mo10585y().mo10592a("Discarding data. Max runnable queue size reached");
        } else {
            this.f11706h.add(runnable);
            this.f11707i.mo10439a(60000);
            mo11025B();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final void mo11024A() {
        mo10451d();
        mo10588t();
        zzdz a = m15825a(false);
        mo10571m().mo10541y();
        m15828a((Runnable) new C3918yb(this, a));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f5  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11025B() {
        /*
            r6 = this;
            r6.mo10451d()
            r6.mo10588t()
            boolean r0 = r6.mo11040z()
            if (r0 == 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.Boolean r0 = r6.f11703e
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0102
            r6.mo10451d()
            r6.mo10588t()
            com.google.android.gms.internal.measurement.ha r0 = r6.mo10455q()
            java.lang.Boolean r0 = r0.mo10739A()
            if (r0 == 0) goto L_0x002c
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x002c
            r3 = r2
            goto L_0x00fc
        L_0x002c:
            com.google.android.gms.internal.measurement.Q r0 = r6.mo10568i()
            int r0 = r0.mo10516C()
            if (r0 != r2) goto L_0x003a
        L_0x0036:
            r0 = r2
        L_0x0037:
            r3 = r0
            goto L_0x00f3
        L_0x003a:
            com.google.android.gms.internal.measurement.W r0 = r6.mo10385b()
            com.google.android.gms.internal.measurement.Y r0 = r0.mo10580F()
            java.lang.String r3 = "Checking service availability"
            r0.mo10592a(r3)
            com.google.android.gms.internal.measurement.mc r0 = r6.mo10454o()
            com.google.android.gms.common.f r3 = com.google.android.gms.common.C1993f.m8774a()
            android.content.Context r0 = r0.getContext()
            r4 = 12451(0x30a3, float:1.7448E-41)
            int r0 = r3.mo7526a((android.content.Context) r0, (int) r4)
            if (r0 == 0) goto L_0x00e4
            if (r0 == r2) goto L_0x00d4
            r3 = 2
            if (r0 == r3) goto L_0x00a3
            r3 = 3
            if (r0 == r3) goto L_0x0095
            r3 = 9
            if (r0 == r3) goto L_0x008a
            r3 = 18
            if (r0 == r3) goto L_0x007e
            com.google.android.gms.internal.measurement.W r3 = r6.mo10385b()
            com.google.android.gms.internal.measurement.Y r3 = r3.mo10576B()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r4 = "Unexpected service status"
            r3.mo10593a(r4, r0)
        L_0x007c:
            r0 = r1
            goto L_0x0037
        L_0x007e:
            com.google.android.gms.internal.measurement.W r0 = r6.mo10385b()
            com.google.android.gms.internal.measurement.Y r0 = r0.mo10576B()
            java.lang.String r3 = "Service updating"
            goto L_0x00ee
        L_0x008a:
            com.google.android.gms.internal.measurement.W r0 = r6.mo10385b()
            com.google.android.gms.internal.measurement.Y r0 = r0.mo10576B()
            java.lang.String r3 = "Service invalid"
            goto L_0x009f
        L_0x0095:
            com.google.android.gms.internal.measurement.W r0 = r6.mo10385b()
            com.google.android.gms.internal.measurement.Y r0 = r0.mo10576B()
            java.lang.String r3 = "Service disabled"
        L_0x009f:
            r0.mo10592a(r3)
            goto L_0x007c
        L_0x00a3:
            com.google.android.gms.internal.measurement.W r0 = r6.mo10385b()
            com.google.android.gms.internal.measurement.Y r0 = r0.mo10579E()
            java.lang.String r3 = "Service container out of date"
            r0.mo10592a(r3)
            com.google.android.gms.internal.measurement.mc r0 = r6.mo10454o()
            int r0 = r0.mo10776A()
            r3 = 12600(0x3138, float:1.7656E-41)
            if (r0 >= r3) goto L_0x00bd
            goto L_0x00e1
        L_0x00bd:
            com.google.android.gms.internal.measurement.ha r0 = r6.mo10455q()
            java.lang.Boolean r0 = r0.mo10739A()
            if (r0 == 0) goto L_0x00d0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00ce
            goto L_0x00d0
        L_0x00ce:
            r0 = r1
            goto L_0x00d1
        L_0x00d0:
            r0 = r2
        L_0x00d1:
            r3 = r0
            r0 = r1
            goto L_0x00f3
        L_0x00d4:
            com.google.android.gms.internal.measurement.W r0 = r6.mo10385b()
            com.google.android.gms.internal.measurement.Y r0 = r0.mo10580F()
            java.lang.String r3 = "Service missing"
            r0.mo10592a(r3)
        L_0x00e1:
            r3 = r1
            r0 = r2
            goto L_0x00f3
        L_0x00e4:
            com.google.android.gms.internal.measurement.W r0 = r6.mo10385b()
            com.google.android.gms.internal.measurement.Y r0 = r0.mo10580F()
            java.lang.String r3 = "Service available"
        L_0x00ee:
            r0.mo10592a(r3)
            goto L_0x0036
        L_0x00f3:
            if (r0 == 0) goto L_0x00fc
            com.google.android.gms.internal.measurement.ha r0 = r6.mo10455q()
            r0.mo10747b((boolean) r3)
        L_0x00fc:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r6.f11703e = r0
        L_0x0102:
            java.lang.Boolean r0 = r6.f11703e
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0110
            com.google.android.gms.internal.measurement.Kb r0 = r6.f11701c
            r0.mo10492a()
            return
        L_0x0110:
            android.content.Context r0 = r6.getContext()
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            android.content.Context r4 = r6.getContext()
            java.lang.String r5 = "com.google.android.gms.measurement.AppMeasurementService"
            android.content.Intent r3 = r3.setClassName(r4, r5)
            r4 = 65536(0x10000, float:9.18355E-41)
            java.util.List r0 = r0.queryIntentServices(r3, r4)
            if (r0 == 0) goto L_0x0136
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0136
            r1 = r2
        L_0x0136:
            if (r1 == 0) goto L_0x0151
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.google.android.gms.measurement.START"
            r0.<init>(r1)
            android.content.ComponentName r1 = new android.content.ComponentName
            android.content.Context r2 = r6.getContext()
            r1.<init>(r2, r5)
            r0.setComponent(r1)
            com.google.android.gms.internal.measurement.Kb r1 = r6.f11701c
            r1.mo10493a((android.content.Intent) r0)
            return
        L_0x0151:
            com.google.android.gms.internal.measurement.W r0 = r6.mo10385b()
            com.google.android.gms.internal.measurement.Y r0 = r0.mo10585y()
            java.lang.String r1 = "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest"
            r0.mo10592a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3910wb.mo11025B():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final void mo11026C() {
        mo10451d();
        mo10588t();
        m15828a((Runnable) new C3716Ab(this, m15825a(true)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final void mo11027D() {
        mo10451d();
        mo10588t();
        m15828a((Runnable) new C3728Db(this, m15825a(true)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final Boolean mo11028E() {
        return this.f11703e;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2083e mo10382a() {
        return super.mo10382a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11029a(C3766N n) {
        mo10451d();
        C2061y.m9067a(n);
        this.f11702d = n;
        m15820F();
        m15822H();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11030a(C3766N n, AbstractSafeParcelable abstractSafeParcelable, zzdz zzdz) {
        int i;
        C3809Y y;
        String str;
        mo10451d();
        mo10588t();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            List<AbstractSafeParcelable> a = mo10571m().mo10537a(100);
            if (a != null) {
                arrayList.addAll(a);
                i = a.size();
            } else {
                i = 0;
            }
            if (abstractSafeParcelable != null && i < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) obj;
                if (abstractSafeParcelable2 instanceof zzeu) {
                    try {
                        n.mo10428a((zzeu) abstractSafeParcelable2, zzdz);
                    } catch (RemoteException e) {
                        e = e;
                        y = mo10385b().mo10585y();
                        str = "Failed to send event to the service";
                    }
                } else if (abstractSafeParcelable2 instanceof zzjx) {
                    try {
                        n.mo10430a((zzjx) abstractSafeParcelable2, zzdz);
                    } catch (RemoteException e2) {
                        e = e2;
                        y = mo10385b().mo10585y();
                        str = "Failed to send attribute to the service";
                    }
                } else if (abstractSafeParcelable2 instanceof zzed) {
                    try {
                        n.mo10427a((zzed) abstractSafeParcelable2, zzdz);
                    } catch (RemoteException e3) {
                        e = e3;
                        y = mo10385b().mo10585y();
                        str = "Failed to send conditional property to the service";
                    }
                } else {
                    mo10385b().mo10585y().mo10592a("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = i;
        }
        return;
        y.mo10593a(str, e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11031a(C3894sb sbVar) {
        mo10451d();
        mo10588t();
        m15828a((Runnable) new C3720Bb(this, sbVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11032a(zzed zzed) {
        C2061y.m9067a(zzed);
        mo10451d();
        mo10588t();
        m15828a((Runnable) new C3736Fb(this, true, mo10571m().mo10538a(zzed), new zzed(zzed), m15825a(true), zzed));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11033a(zzeu zzeu, String str) {
        C2061y.m9067a(zzeu);
        mo10451d();
        mo10588t();
        m15828a((Runnable) new C3732Eb(this, true, mo10571m().mo10539a(zzeu), zzeu, m15825a(true), str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11034a(zzjx zzjx) {
        mo10451d();
        mo10588t();
        m15828a((Runnable) new C3748Ib(this, mo10571m().mo10540a(zzjx), zzjx, m15825a(true)));
    }

    /* renamed from: a */
    public final void mo11035a(AtomicReference<String> atomicReference) {
        mo10451d();
        mo10588t();
        m15828a((Runnable) new C3922zb(this, atomicReference, m15825a(false)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11036a(AtomicReference<List<zzed>> atomicReference, String str, String str2, String str3) {
        mo10451d();
        mo10588t();
        m15828a((Runnable) new C3740Gb(this, atomicReference, str, str2, str3, m15825a(false)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11037a(AtomicReference<List<zzjx>> atomicReference, String str, String str2, String str3, boolean z) {
        mo10451d();
        mo10588t();
        m15828a((Runnable) new C3744Hb(this, atomicReference, str, str2, str3, z, m15825a(false)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11038a(AtomicReference<List<zzjx>> atomicReference, boolean z) {
        mo10451d();
        mo10588t();
        m15828a((Runnable) new C3752Jb(this, atomicReference, m15825a(false), z));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C3801W mo10385b() {
        return super.mo10385b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3909wa mo10386c() {
        return super.mo10386c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo10451d() {
        super.mo10451d();
    }

    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C3814Za mo10567h() {
        return super.mo10567h();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C3778Q mo10568i() {
        return super.mo10568i();
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C3734F mo10452j() {
        return super.mo10452j();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C3785S mo10571m() {
        return super.mo10571m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C3793U mo10453n() {
        return super.mo10453n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C3871mc mo10454o() {
        return super.mo10454o();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C3849ha mo10455q() {
        return super.mo10455q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C3908w mo10456r() {
        return super.mo10456r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final boolean mo10457u() {
        return false;
    }

    /* renamed from: y */
    public final void mo11039y() {
        mo10451d();
        mo10588t();
        try {
            C1985a.m8731a().mo7511b(getContext(), this.f11701c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f11702d = null;
    }

    /* renamed from: z */
    public final boolean mo11040z() {
        mo10451d();
        mo10588t();
        return this.f11702d != null;
    }
}
