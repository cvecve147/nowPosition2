package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.C1819b;
import com.google.android.gms.ads.mediation.C1837j;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.ju */
public final class C3220ju {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final HashSet<String> f9661a = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Bundle f9662b = new Bundle();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final HashMap<Class<? extends C1837j>, C1837j> f9663c = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final HashSet<String> f9664d = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Bundle f9665e = new Bundle();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final HashSet<String> f9666f = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Date f9667g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f9668h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f9669i = -1;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Location f9670j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f9671k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public String f9672l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public String f9673m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f9674n = -1;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f9675o;

    /* renamed from: a */
    public final void mo9624a(int i) {
        this.f9669i = i;
    }

    /* renamed from: a */
    public final void mo9625a(Location location) {
        this.f9670j = location;
    }

    /* renamed from: a */
    public final void mo9626a(Class<? extends C1819b> cls, Bundle bundle) {
        this.f9662b.putBundle(cls.getName(), bundle);
    }

    /* renamed from: a */
    public final void mo9627a(String str) {
        this.f9661a.add(str);
    }

    /* renamed from: a */
    public final void mo9628a(Date date) {
        this.f9667g = date;
    }

    /* renamed from: a */
    public final void mo9629a(boolean z) {
        this.f9674n = z ? 1 : 0;
    }

    /* renamed from: b */
    public final void mo9630b(String str) {
        this.f9664d.add(str);
    }

    /* renamed from: b */
    public final void mo9631b(boolean z) {
        this.f9675o = z;
    }

    /* renamed from: c */
    public final void mo9632c(String str) {
        this.f9664d.remove(str);
    }
}
