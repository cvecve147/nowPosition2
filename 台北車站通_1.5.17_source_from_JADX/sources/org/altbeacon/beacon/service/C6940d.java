package org.altbeacon.beacon.service;

import android.os.Bundle;
import org.altbeacon.beacon.Region;

/* renamed from: org.altbeacon.beacon.service.d */
public class C6940d {

    /* renamed from: a */
    private final boolean f19153a;

    /* renamed from: b */
    private final Region f19154b;

    public C6940d(boolean z, Region region) {
        this.f19153a = z;
        this.f19154b = region;
    }

    /* renamed from: a */
    public static C6940d m26229a(Bundle bundle) {
        bundle.setClassLoader(Region.class.getClassLoader());
        return new C6940d(Boolean.valueOf(bundle.getBoolean("inside")).booleanValue(), bundle.get("region") != null ? (Region) bundle.getSerializable("region") : null);
    }

    /* renamed from: a */
    public Region mo18873a() {
        return this.f19154b;
    }

    /* renamed from: b */
    public boolean mo18874b() {
        return this.f19153a;
    }

    /* renamed from: c */
    public Bundle mo18875c() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("region", this.f19154b);
        bundle.putBoolean("inside", this.f19153a);
        return bundle;
    }
}
