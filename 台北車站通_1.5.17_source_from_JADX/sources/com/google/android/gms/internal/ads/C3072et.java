package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.C1819b;
import com.google.android.gms.ads.p068d.C1643a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.et */
public final class C3072et {

    /* renamed from: a */
    public static final C3072et f9119a = new C3072et();

    protected C3072et() {
    }

    /* renamed from: a */
    public static zzjj m12305a(Context context, C3187iu iuVar) {
        List list;
        Context context2;
        String str;
        C3187iu iuVar2 = iuVar;
        Date a = iuVar.mo9573a();
        long time = a != null ? a.getTime() : -1;
        String b = iuVar.mo9575b();
        int d = iuVar.mo9577d();
        Set<String> e = iuVar.mo9578e();
        if (!e.isEmpty()) {
            list = Collections.unmodifiableList(new ArrayList(e));
            context2 = context;
        } else {
            context2 = context;
            list = null;
        }
        boolean a2 = iuVar2.mo9574a(context2);
        int n = iuVar.mo9587n();
        Location f = iuVar.mo9579f();
        Bundle a3 = iuVar2.mo9572a((Class<? extends C1819b>) AdMobAdapter.class);
        boolean g = iuVar.mo9580g();
        String h = iuVar.mo9581h();
        C1643a k = iuVar.mo9584k();
        if (k == null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                String packageName = applicationContext.getPackageName();
                C3390pt.m13453a();
                str = C3432rf.m13599a(Thread.currentThread().getStackTrace(), packageName);
            } else {
                str = null;
            }
            return new zzjj(7, time, a3, d, list, a2, n, g, h, (zzmq) null, f, b, iuVar.mo9586m(), iuVar.mo9576c(), Collections.unmodifiableList(new ArrayList(iuVar.mo9588o())), iuVar.mo9583j(), str, iuVar.mo9582i());
        }
        new zzmq(k);
        throw null;
    }
}
