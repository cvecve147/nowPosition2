package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.common.util.C2083e;
import com.google.android.gms.common.util.C2084f;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p013b.p018b.p028h.p039h.C1080b;
import p101d.p129g.p131b.p132a.p144g.C5536g;
import p101d.p129g.p131b.p132a.p144g.C5540j;

/* renamed from: com.google.android.gms.internal.measurement.Za */
public final class C3814Za extends C3802Wa {

    /* renamed from: c */
    protected C3890rb f11359c;

    /* renamed from: d */
    private AppMeasurement.C3997b f11360d;

    /* renamed from: e */
    private final Set<AppMeasurement.C3998c> f11361e = new CopyOnWriteArraySet();

    /* renamed from: f */
    private boolean f11362f;

    /* renamed from: g */
    private final AtomicReference<String> f11363g = new AtomicReference<>();

    /* renamed from: h */
    protected boolean f11364h = true;

    protected C3814Za(C3715Aa aa) {
        super(aa);
    }

    /* renamed from: a */
    private final void m15214a(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle bundle2;
        Bundle bundle3 = bundle;
        if (bundle3 == null) {
            bundle2 = new Bundle();
        } else {
            Bundle bundle4 = new Bundle(bundle3);
            for (String str4 : bundle4.keySet()) {
                Object obj = bundle4.get(str4);
                if (obj instanceof Bundle) {
                    bundle4.putBundle(str4, new Bundle((Bundle) obj));
                } else {
                    int i = 0;
                    if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        while (i < parcelableArr.length) {
                            if (parcelableArr[i] instanceof Bundle) {
                                parcelableArr[i] = new Bundle((Bundle) parcelableArr[i]);
                            }
                            i++;
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        while (i < arrayList.size()) {
                            Object obj2 = arrayList.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.set(i, new Bundle((Bundle) obj2));
                            }
                            i++;
                        }
                    }
                }
            }
            bundle2 = bundle4;
        }
        mo10386c().mo11020a((Runnable) new C3886qb(this, str, str2, j, bundle2, z, z2, z3, str3));
    }

    /* renamed from: a */
    private final void m15215a(String str, String str2, long j, Object obj) {
        mo10386c().mo11020a((Runnable) new C3822ab(this, str, str2, obj, j));
    }

    /* renamed from: a */
    private final void m15216a(String str, String str2, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        m15214a(str, str2, mo10382a().mo7725a(), bundle, true, z2, z3, (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m15217a(String str, String str2, Object obj, long j) {
        C2061y.m9076b(str);
        C2061y.m9076b(str2);
        mo10451d();
        mo10588t();
        if (!this.f11325a.mo10395s()) {
            mo10385b().mo10579E().mo10592a("User property not set since app measurement is disabled");
        } else if (this.f11325a.mo10381I()) {
            mo10385b().mo10579E().mo10594a("Setting user property (FE)", mo10453n().mo10557a(str2), obj);
            mo10569k().mo11034a(new zzjx(str2, j, obj, str));
        }
    }

    /* renamed from: b */
    private final List<AppMeasurement.ConditionalUserProperty> m15218b(String str, String str2, String str3) {
        C3809Y y;
        String str4;
        if (mo10386c().mo11023z()) {
            y = mo10385b().mo10585y();
            str4 = "Cannot get conditional user properties from analytics worker thread";
        } else {
            mo10386c();
            if (C3909wa.m15801y()) {
                y = mo10385b().mo10585y();
                str4 = "Cannot get conditional user properties from main thread";
            } else {
                AtomicReference atomicReference = new AtomicReference();
                synchronized (atomicReference) {
                    this.f11325a.mo10386c().mo11020a((Runnable) new C3850hb(this, atomicReference, str, str2, str3));
                    try {
                        atomicReference.wait(5000);
                    } catch (InterruptedException e) {
                        mo10385b().mo10576B().mo10594a("Interrupted waiting for get conditional user properties", str, e);
                    }
                }
                List<zzed> list = (List) atomicReference.get();
                if (list == null) {
                    mo10385b().mo10576B().mo10593a("Timed out waiting for get conditional user properties", str);
                    return Collections.emptyList();
                }
                ArrayList arrayList = new ArrayList(list.size());
                for (zzed zzed : list) {
                    AppMeasurement.ConditionalUserProperty conditionalUserProperty = new AppMeasurement.ConditionalUserProperty();
                    conditionalUserProperty.mAppId = str;
                    conditionalUserProperty.mOrigin = str2;
                    conditionalUserProperty.mCreationTimestamp = zzed.f11772d;
                    zzjx zzjx = zzed.f11771c;
                    conditionalUserProperty.mName = zzjx.f11786b;
                    conditionalUserProperty.mValue = zzjx.mo11112b();
                    conditionalUserProperty.mActive = zzed.f11773e;
                    conditionalUserProperty.mTriggerEventName = zzed.f11774f;
                    zzeu zzeu = zzed.f11775g;
                    if (zzeu != null) {
                        conditionalUserProperty.mTimedOutEventName = zzeu.f11781a;
                        zzer zzer = zzeu.f11782b;
                        if (zzer != null) {
                            conditionalUserProperty.mTimedOutEventParams = zzer.mo11102b();
                        }
                    }
                    conditionalUserProperty.mTriggerTimeout = zzed.f11776h;
                    zzeu zzeu2 = zzed.f11777i;
                    if (zzeu2 != null) {
                        conditionalUserProperty.mTriggeredEventName = zzeu2.f11781a;
                        zzer zzer2 = zzeu2.f11782b;
                        if (zzer2 != null) {
                            conditionalUserProperty.mTriggeredEventParams = zzer2.mo11102b();
                        }
                    }
                    conditionalUserProperty.mTriggeredTimestamp = zzed.f11771c.f11787c;
                    conditionalUserProperty.mTimeToLive = zzed.f11778j;
                    zzeu zzeu3 = zzed.f11779k;
                    if (zzeu3 != null) {
                        conditionalUserProperty.mExpiredEventName = zzeu3.f11781a;
                        zzer zzer3 = zzeu3.f11782b;
                        if (zzer3 != null) {
                            conditionalUserProperty.mExpiredEventParams = zzer3.mo11102b();
                        }
                    }
                    arrayList.add(conditionalUserProperty);
                }
                return arrayList;
            }
        }
        y.mo10592a(str4);
        return Collections.emptyList();
    }

    /* renamed from: b */
    private final Map<String, Object> m15219b(String str, String str2, String str3, boolean z) {
        C3809Y B;
        String str4;
        if (mo10386c().mo11023z()) {
            B = mo10385b().mo10585y();
            str4 = "Cannot get user properties from analytics worker thread";
        } else {
            mo10386c();
            if (C3909wa.m15801y()) {
                B = mo10385b().mo10585y();
                str4 = "Cannot get user properties from main thread";
            } else {
                AtomicReference atomicReference = new AtomicReference();
                synchronized (atomicReference) {
                    this.f11325a.mo10386c().mo11020a((Runnable) new C3854ib(this, atomicReference, str, str2, str3, z));
                    try {
                        atomicReference.wait(5000);
                    } catch (InterruptedException e) {
                        mo10385b().mo10576B().mo10593a("Interrupted waiting for get user properties", e);
                    }
                }
                List<zzjx> list = (List) atomicReference.get();
                if (list == null) {
                    B = mo10385b().mo10576B();
                    str4 = "Timed out waiting for get user properties";
                } else {
                    C1080b bVar = new C1080b(list.size());
                    for (zzjx zzjx : list) {
                        bVar.put(zzjx.f11786b, zzjx.mo11112b());
                    }
                    return bVar;
                }
            }
        }
        B.mo10592a(str4);
        return Collections.emptyMap();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m15221b(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        String[] strArr;
        int i;
        int i2;
        Bundle bundle2;
        String str4 = str;
        String str5 = str2;
        Bundle bundle3 = bundle;
        C2061y.m9076b(str);
        C2061y.m9076b(str2);
        C2061y.m9067a(bundle);
        mo10451d();
        mo10588t();
        if (!this.f11325a.mo10395s()) {
            mo10385b().mo10579E().mo10592a("Event not sent since app measurement is disabled");
            return;
        }
        int i3 = 0;
        if (!this.f11362f) {
            this.f11362f = true;
            try {
                try {
                    Class.forName("com.google.android.gms.tagmanager.TagManagerService").getDeclaredMethod("initialize", new Class[]{Context.class}).invoke((Object) null, new Object[]{getContext()});
                } catch (Exception e) {
                    mo10385b().mo10576B().mo10593a("Failed to invoke Tag Manager's initialize() method", e);
                }
            } catch (ClassNotFoundException unused) {
                mo10385b().mo10578D().mo10592a("Tag Manager is not found and thus will not be used");
            }
        }
        if (z3 && !"_iap".equals(str5)) {
            C3871mc h = this.f11325a.mo10392h();
            int i4 = 2;
            if (h.mo10795b("event", str5)) {
                if (!h.mo10790a("event", AppMeasurement.C3996a.f11903a, str5)) {
                    i4 = 13;
                } else if (h.mo10789a("event", 40, str5)) {
                    i4 = 0;
                }
            }
            if (i4 != 0) {
                mo10385b().mo10575A().mo10593a("Invalid public event name. Event will not be logged (FE)", mo10453n().mo10557a(str5));
                this.f11325a.mo10392h();
                String a = C3871mc.m15510a(str5, 40, true);
                if (str5 != null) {
                    i3 = str2.length();
                }
                this.f11325a.mo10392h().mo10783a(i4, "_ev", a, i3);
                return;
            }
        }
        C3894sb y = mo10570l().mo10972y();
        if (y != null && !bundle3.containsKey("_sc")) {
            y.f11642d = true;
        }
        C3898tb.m15689a(y, bundle3, z && z3);
        boolean equals = "am".equals(str4);
        boolean g = C3871mc.m15531g(str2);
        if (z && this.f11360d != null && !g && !equals) {
            mo10385b().mo10579E().mo10594a("Passing event to registered event handler (FE)", mo10453n().mo10557a(str5), mo10453n().mo10551a(bundle3));
            this.f11360d.mo11330a(str, str2, bundle, j);
        } else if (this.f11325a.mo10381I()) {
            int c = mo10454o().mo10797c(str5);
            if (c != 0) {
                mo10385b().mo10575A().mo10593a("Invalid event name. Event will not be logged (FE)", mo10453n().mo10557a(str5));
                mo10454o();
                String a2 = C3871mc.m15510a(str5, 40, true);
                if (str5 != null) {
                    i3 = str2.length();
                }
                this.f11325a.mo10392h().mo10787a(str3, c, "_ev", a2, i3);
                return;
            }
            List a3 = C2084f.m9119a((T[]) new String[]{"_o", "_sn", "_sc", "_si"});
            String str6 = "_si";
            String str7 = "_o";
            Bundle a4 = mo10454o().mo10779a(str2, bundle, (List<String>) a3, z3, true);
            C3894sb sbVar = (a4 == null || !a4.containsKey("_sc") || !a4.containsKey(str6)) ? null : new C3894sb(a4.getString("_sn"), a4.getString("_sc"), Long.valueOf(a4.getLong(str6)).longValue());
            if (sbVar == null) {
                sbVar = y;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(a4);
            long nextLong = mo10454o().mo10805z().nextLong();
            String[] strArr2 = (String[]) a4.keySet().toArray(new String[bundle.size()]);
            Arrays.sort(strArr2);
            int length = strArr2.length;
            int i5 = 0;
            int i6 = 0;
            while (i6 < length) {
                String str8 = strArr2[i6];
                Object obj = a4.get(str8);
                mo10454o();
                Bundle[] a5 = C3871mc.m15522a(obj);
                if (a5 != null) {
                    String str9 = "_eid";
                    a4.putInt(str8, a5.length);
                    String str10 = str8;
                    int i7 = 0;
                    while (i7 < a5.length) {
                        Bundle bundle4 = a5[i7];
                        C3898tb.m15689a(sbVar, bundle4, true);
                        int i8 = i7;
                        int i9 = i6;
                        int i10 = length;
                        Bundle a6 = mo10454o().mo10779a("_ep", bundle4, (List<String>) a3, z3, false);
                        a6.putString("_en", str5);
                        String str11 = str9;
                        a6.putLong(str11, nextLong);
                        String str12 = str10;
                        a6.putString("_gn", str12);
                        a6.putInt("_ll", a5.length);
                        int i11 = i8;
                        a6.putInt("_i", i11);
                        arrayList.add(a6);
                        int i12 = i11 + 1;
                        str10 = str12;
                        a4 = a4;
                        i6 = i9;
                        length = i10;
                        i5 = i5;
                        strArr2 = strArr2;
                        str9 = str11;
                        i7 = i12;
                    }
                    int i13 = i5;
                    i2 = i6;
                    i = length;
                    strArr = strArr2;
                    bundle2 = a4;
                    i5 += a5.length;
                } else {
                    i2 = i6;
                    i = length;
                    strArr = strArr2;
                    bundle2 = a4;
                }
                i6 = i2 + 1;
                a4 = bundle2;
                length = i;
                strArr2 = strArr;
            }
            Bundle bundle5 = a4;
            if (i5 != 0) {
                bundle5.putLong("_eid", nextLong);
                bundle5.putInt("_epc", i5);
            }
            int i14 = 0;
            while (i14 < arrayList.size()) {
                Bundle bundle6 = (Bundle) arrayList.get(i14);
                String str13 = i14 != 0 ? "_ep" : str5;
                bundle6.putString(str7, str4);
                if (z2) {
                    bundle6 = mo10454o().mo10778a(bundle6);
                }
                Bundle bundle7 = bundle6;
                mo10385b().mo10579E().mo10594a("Logging event (FE)", mo10453n().mo10557a(str5), mo10453n().mo10551a(bundle7));
                mo10569k().mo11033a(new zzeu(str13, new zzer(bundle7), str, j), str3);
                if (!equals) {
                    for (AppMeasurement.C3998c a7 : this.f11361e) {
                        a7.mo11331a(str, str2, new Bundle(bundle7), j);
                    }
                }
                i14++;
            }
            if (mo10570l().mo10972y() != null && "_ae".equals(str5)) {
                mo10572p().mo10573a(true);
            }
        }
    }

    /* renamed from: b */
    private final void m15222b(String str, String str2, String str3, Bundle bundle) {
        long a = mo10382a().mo7725a();
        C2061y.m9076b(str2);
        AppMeasurement.ConditionalUserProperty conditionalUserProperty = new AppMeasurement.ConditionalUserProperty();
        conditionalUserProperty.mAppId = str;
        conditionalUserProperty.mName = str2;
        conditionalUserProperty.mCreationTimestamp = a;
        if (str3 != null) {
            conditionalUserProperty.mExpiredEventName = str3;
            conditionalUserProperty.mExpiredEventParams = bundle;
        }
        mo10386c().mo11020a((Runnable) new C3846gb(this, conditionalUserProperty));
    }

    /* renamed from: c */
    private final void m15223c(AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        long a = mo10382a().mo7725a();
        C2061y.m9067a(conditionalUserProperty);
        C2061y.m9076b(conditionalUserProperty.mName);
        C2061y.m9076b(conditionalUserProperty.mOrigin);
        C2061y.m9067a(conditionalUserProperty.mValue);
        conditionalUserProperty.mCreationTimestamp = a;
        String str = conditionalUserProperty.mName;
        Object obj = conditionalUserProperty.mValue;
        if (mo10454o().mo10800e(str) != 0) {
            mo10385b().mo10585y().mo10593a("Invalid conditional user property name", mo10453n().mo10559c(str));
        } else if (mo10454o().mo10793b(str, obj) != 0) {
            mo10385b().mo10585y().mo10594a("Invalid conditional user property value", mo10453n().mo10559c(str), obj);
        } else {
            Object c = mo10454o().mo10798c(str, obj);
            if (c == null) {
                mo10385b().mo10585y().mo10594a("Unable to normalize conditional user property value", mo10453n().mo10559c(str), obj);
                return;
            }
            conditionalUserProperty.mValue = c;
            long j = conditionalUserProperty.mTriggerTimeout;
            if (TextUtils.isEmpty(conditionalUserProperty.mTriggerEventName) || (j <= 15552000000L && j >= 1)) {
                long j2 = conditionalUserProperty.mTimeToLive;
                if (j2 > 15552000000L || j2 < 1) {
                    mo10385b().mo10585y().mo10594a("Invalid conditional user property time to live", mo10453n().mo10559c(str), Long.valueOf(j2));
                } else {
                    mo10386c().mo11020a((Runnable) new C3842fb(this, conditionalUserProperty));
                }
            } else {
                mo10385b().mo10585y().mo10594a("Invalid conditional user property timeout", mo10453n().mo10559c(str), Long.valueOf(j));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m15224c(boolean z) {
        mo10451d();
        mo10588t();
        mo10385b().mo10579E().mo10593a("Setting app measurement enabled (FE)", Boolean.valueOf(z));
        mo10455q().mo10745a(z);
        if (!mo10456r().mo11010i(mo10568i().mo10520z())) {
            mo10569k().mo11027D();
        } else if (!this.f11325a.mo10395s() || !this.f11364h) {
            mo10569k().mo11027D();
        } else {
            mo10385b().mo10579E().mo10592a("Recording app launch after enabling measurement for the first time (FE)");
            mo10603G();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m15225d(AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        AppMeasurement.ConditionalUserProperty conditionalUserProperty2 = conditionalUserProperty;
        mo10451d();
        mo10588t();
        C2061y.m9067a(conditionalUserProperty);
        C2061y.m9076b(conditionalUserProperty2.mName);
        C2061y.m9076b(conditionalUserProperty2.mOrigin);
        C2061y.m9067a(conditionalUserProperty2.mValue);
        if (!this.f11325a.mo10395s()) {
            mo10385b().mo10579E().mo10592a("Conditional property not sent since Firebase Analytics is disabled");
            return;
        }
        zzjx zzjx = new zzjx(conditionalUserProperty2.mName, conditionalUserProperty2.mTriggeredTimestamp, conditionalUserProperty2.mValue, conditionalUserProperty2.mOrigin);
        try {
            zzeu a = mo10454o().mo10781a(conditionalUserProperty2.mTriggeredEventName, conditionalUserProperty2.mTriggeredEventParams, conditionalUserProperty2.mOrigin, 0, true, false);
            zzeu a2 = mo10454o().mo10781a(conditionalUserProperty2.mTimedOutEventName, conditionalUserProperty2.mTimedOutEventParams, conditionalUserProperty2.mOrigin, 0, true, false);
            zzeu a3 = mo10454o().mo10781a(conditionalUserProperty2.mExpiredEventName, conditionalUserProperty2.mExpiredEventParams, conditionalUserProperty2.mOrigin, 0, true, false);
            String str = conditionalUserProperty2.mAppId;
            String str2 = conditionalUserProperty2.mOrigin;
            long j = conditionalUserProperty2.mCreationTimestamp;
            String str3 = conditionalUserProperty2.mTriggerEventName;
            long j2 = conditionalUserProperty2.mTriggerTimeout;
            zzed zzed = r3;
            zzed zzed2 = new zzed(str, str2, zzjx, j, false, str3, a2, j2, a, conditionalUserProperty2.mTimeToLive, a3);
            mo10569k().mo11032a(zzed);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m15226e(AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        AppMeasurement.ConditionalUserProperty conditionalUserProperty2 = conditionalUserProperty;
        mo10451d();
        mo10588t();
        C2061y.m9067a(conditionalUserProperty);
        C2061y.m9076b(conditionalUserProperty2.mName);
        if (!this.f11325a.mo10395s()) {
            mo10385b().mo10579E().mo10592a("Conditional property not cleared since Firebase Analytics is disabled");
            return;
        }
        zzjx zzjx = new zzjx(conditionalUserProperty2.mName, 0, (Object) null, (String) null);
        try {
            zzeu a = mo10454o().mo10781a(conditionalUserProperty2.mExpiredEventName, conditionalUserProperty2.mExpiredEventParams, conditionalUserProperty2.mOrigin, conditionalUserProperty2.mCreationTimestamp, true, false);
            zzed zzed = r3;
            zzed zzed2 = new zzed(conditionalUserProperty2.mAppId, conditionalUserProperty2.mOrigin, zzjx, conditionalUserProperty2.mCreationTimestamp, conditionalUserProperty2.mActive, conditionalUserProperty2.mTriggerEventName, (zzeu) null, conditionalUserProperty2.mTriggerTimeout, (zzeu) null, conditionalUserProperty2.mTimeToLive, a);
            mo10569k().mo11032a(zzed);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: A */
    public final String mo10597A() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) mo10386c().mo11018a(atomicReference, 15000, "String test flag value", new C3858jb(this, atomicReference));
    }

    /* renamed from: B */
    public final String mo10598B() {
        return this.f11363g.get();
    }

    /* renamed from: C */
    public final Boolean mo10599C() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) mo10386c().mo11018a(atomicReference, 15000, "boolean test flag value", new C3817_a(this, atomicReference));
    }

    /* renamed from: D */
    public final Long mo10600D() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) mo10386c().mo11018a(atomicReference, 15000, "long test flag value", new C3862kb(this, atomicReference));
    }

    /* renamed from: E */
    public final Integer mo10601E() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) mo10386c().mo11018a(atomicReference, 15000, "int test flag value", new C3866lb(this, atomicReference));
    }

    /* renamed from: F */
    public final Double mo10602F() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) mo10386c().mo11018a(atomicReference, 15000, "double test flag value", new C3870mb(this, atomicReference));
    }

    /* renamed from: G */
    public final void mo10603G() {
        mo10451d();
        mo10588t();
        if (this.f11325a.mo10381I()) {
            mo10569k().mo11026C();
            this.f11364h = false;
            String C = mo10455q().mo10741C();
            if (!TextUtils.isEmpty(C)) {
                mo10452j().mo10588t();
                if (!C.equals(Build.VERSION.RELEASE)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", C);
                    mo10623b("auto", "_ou", bundle);
                }
            }
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2083e mo10382a() {
        return super.mo10382a();
    }

    /* renamed from: a */
    public final List<AppMeasurement.ConditionalUserProperty> mo10604a(String str, String str2, String str3) {
        C2061y.m9076b(str);
        mo10564e();
        throw null;
    }

    /* renamed from: a */
    public final Map<String, Object> mo10605a(String str, String str2, String str3, boolean z) {
        C2061y.m9076b(str);
        mo10564e();
        throw null;
    }

    /* renamed from: a */
    public final Map<String, Object> mo10606a(String str, String str2, boolean z) {
        return m15219b((String) null, str, str2, z);
    }

    /* renamed from: a */
    public final void mo10607a(long j) {
        mo10386c().mo11020a((Runnable) new C3878ob(this, j));
    }

    /* renamed from: a */
    public final void mo10608a(AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        C2061y.m9067a(conditionalUserProperty);
        AppMeasurement.ConditionalUserProperty conditionalUserProperty2 = new AppMeasurement.ConditionalUserProperty(conditionalUserProperty);
        if (!TextUtils.isEmpty(conditionalUserProperty2.mAppId)) {
            mo10385b().mo10576B().mo10592a("Package name should be null when calling setConditionalUserProperty");
        }
        conditionalUserProperty2.mAppId = null;
        m15223c(conditionalUserProperty2);
    }

    /* renamed from: a */
    public final void mo10609a(AppMeasurement.C3997b bVar) {
        AppMeasurement.C3997b bVar2;
        mo10451d();
        mo10588t();
        if (!(bVar == null || bVar == (bVar2 = this.f11360d))) {
            C2061y.m9078b(bVar2 == null, "EventInterceptor already set.");
        }
        this.f11360d = bVar;
    }

    /* renamed from: a */
    public final void mo10610a(AppMeasurement.C3998c cVar) {
        mo10588t();
        C2061y.m9067a(cVar);
        if (!this.f11361e.add(cVar)) {
            mo10385b().mo10576B().mo10592a("OnEventListener already registered");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10611a(String str) {
        this.f11363g.set(str);
    }

    /* renamed from: a */
    public final void mo10612a(String str, String str2, Bundle bundle) {
        m15222b((String) null, str, str2, bundle);
    }

    /* renamed from: a */
    public final void mo10613a(String str, String str2, Bundle bundle, long j) {
        m15214a(str, str2, j, bundle, false, true, true, (String) null);
    }

    /* renamed from: a */
    public final void mo10614a(String str, String str2, Bundle bundle, boolean z) {
        m15216a(str, str2, bundle, true, this.f11360d == null || C3871mc.m15531g(str2), true, (String) null);
    }

    /* renamed from: a */
    public final void mo10615a(String str, String str2, Object obj) {
        C2061y.m9076b(str);
        long a = mo10382a().mo7725a();
        int e = mo10454o().mo10800e(str2);
        int i = 0;
        if (e != 0) {
            mo10454o();
            String a2 = C3871mc.m15510a(str2, 24, true);
            if (str2 != null) {
                i = str2.length();
            }
            this.f11325a.mo10392h().mo10783a(e, "_ev", a2, i);
        } else if (obj != null) {
            int b = mo10454o().mo10793b(str2, obj);
            if (b != 0) {
                mo10454o();
                String a3 = C3871mc.m15510a(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i = String.valueOf(obj).length();
                }
                this.f11325a.mo10392h().mo10783a(b, "_ev", a3, i);
                return;
            }
            Object c = mo10454o().mo10798c(str2, obj);
            if (c != null) {
                m15215a(str, str2, a, c);
            }
        } else {
            m15215a(str, str2, a, (Object) null);
        }
    }

    /* renamed from: a */
    public final void mo10616a(String str, String str2, String str3, Bundle bundle) {
        C2061y.m9076b(str);
        mo10564e();
        throw null;
    }

    /* renamed from: a */
    public final void mo10617a(boolean z) {
        mo10588t();
        mo10386c().mo11020a((Runnable) new C3874nb(this, z));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C3801W mo10385b() {
        return super.mo10385b();
    }

    /* renamed from: b */
    public final List<AppMeasurement.ConditionalUserProperty> mo10618b(String str, String str2) {
        return m15218b((String) null, str, str2);
    }

    /* renamed from: b */
    public final List<zzjx> mo10619b(boolean z) {
        C3809Y B;
        String str;
        mo10588t();
        mo10385b().mo10579E().mo10592a("Fetching user attributes (FE)");
        if (mo10386c().mo11023z()) {
            B = mo10385b().mo10585y();
            str = "Cannot get all user properties from analytics worker thread";
        } else {
            mo10386c();
            if (C3909wa.m15801y()) {
                B = mo10385b().mo10585y();
                str = "Cannot get all user properties from main thread";
            } else {
                AtomicReference atomicReference = new AtomicReference();
                synchronized (atomicReference) {
                    this.f11325a.mo10386c().mo11020a((Runnable) new C3826bb(this, atomicReference, z));
                    try {
                        atomicReference.wait(5000);
                    } catch (InterruptedException e) {
                        mo10385b().mo10576B().mo10593a("Interrupted waiting for get user properties", e);
                    }
                }
                List<zzjx> list = (List) atomicReference.get();
                if (list != null) {
                    return list;
                }
                B = mo10385b().mo10576B();
                str = "Timed out waiting for get user properties";
            }
        }
        B.mo10592a(str);
        return Collections.emptyList();
    }

    /* renamed from: b */
    public final void mo10620b(long j) {
        mo10386c().mo11020a((Runnable) new C3882pb(this, j));
    }

    /* renamed from: b */
    public final void mo10621b(AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        C2061y.m9067a(conditionalUserProperty);
        C2061y.m9076b(conditionalUserProperty.mAppId);
        mo10564e();
        throw null;
    }

    /* renamed from: b */
    public final void mo10622b(AppMeasurement.C3998c cVar) {
        mo10588t();
        C2061y.m9067a(cVar);
        if (!this.f11361e.remove(cVar)) {
            mo10385b().mo10576B().mo10592a("OnEventListener had not been registered");
        }
    }

    /* renamed from: b */
    public final void mo10623b(String str, String str2, Bundle bundle) {
        m15216a(str, str2, bundle, true, this.f11360d == null || C3871mc.m15531g(str2), false, (String) null);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3909wa mo10386c() {
        return super.mo10386c();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:10|11|12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        mo10385b().mo10576B().mo10592a("Interrupted waiting for app instance id");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001d */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo10624c(long r4) {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.wa r1 = r3.mo10386c()     // Catch:{ all -> 0x002d }
            com.google.android.gms.internal.measurement.db r2 = new com.google.android.gms.internal.measurement.db     // Catch:{ all -> 0x002d }
            r2.<init>(r3, r0)     // Catch:{ all -> 0x002d }
            r1.mo11020a((java.lang.Runnable) r2)     // Catch:{ all -> 0x002d }
            r0.wait(r4)     // Catch:{ InterruptedException -> 0x001d }
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            java.lang.Object r4 = r0.get()
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L_0x001d:
            com.google.android.gms.internal.measurement.W r4 = r3.mo10385b()     // Catch:{ all -> 0x002d }
            com.google.android.gms.internal.measurement.Y r4 = r4.mo10576B()     // Catch:{ all -> 0x002d }
            java.lang.String r5 = "Interrupted waiting for app instance id"
            r4.mo10592a(r5)     // Catch:{ all -> 0x002d }
            r4 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return r4
        L_0x002d:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3814Za.mo10624c(long):java.lang.String");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo10625c(String str, String str2, Bundle bundle) {
        mo10451d();
        m15221b(str, str2, mo10382a().mo7725a(), bundle, true, this.f11360d == null || C3871mc.m15531g(str2), false, (String) null);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo10451d() {
        super.mo10451d();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo10564e() {
        super.mo10564e();
        throw null;
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

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C3910wb mo10569k() {
        return super.mo10569k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C3898tb mo10570l() {
        return super.mo10570l();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C3793U mo10453n() {
        return super.mo10453n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C3871mc mo10454o() {
        return super.mo10454o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C3799Vb mo10572p() {
        return super.mo10572p();
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
    public final C5536g<String> mo10626y() {
        try {
            String z = mo10455q().mo10753z();
            return z != null ? C5540j.m21078a(z) : C5540j.m21079a((Executor) mo10386c().mo11017A(), new C3830cb(this));
        } catch (Exception e) {
            mo10385b().mo10576B().mo10592a("Failed to schedule task for getAppInstanceId");
            return C5540j.m21077a(e);
        }
    }

    /* renamed from: z */
    public final void mo10627z() {
        mo10386c().mo11020a((Runnable) new C3838eb(this, mo10382a().mo7725a()));
    }
}
