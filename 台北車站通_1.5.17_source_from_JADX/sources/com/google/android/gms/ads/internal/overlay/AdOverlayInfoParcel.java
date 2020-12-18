package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.gmsg.C1737k;
import com.google.android.gms.ads.internal.gmsg.C1739m;
import com.google.android.gms.ads.internal.zzaq;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;
import com.google.android.gms.internal.ads.C2478La;
import com.google.android.gms.internal.ads.C2845Xs;
import com.google.android.gms.internal.ads.C3520uh;
import com.google.android.gms.internal.ads.zzang;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p134b.C5468d;

@C2478La
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new C1780l();

    /* renamed from: a */
    public final zzc f5811a;

    /* renamed from: b */
    public final C2845Xs f5812b;

    /* renamed from: c */
    public final C1781m f5813c;

    /* renamed from: d */
    public final C3520uh f5814d;

    /* renamed from: e */
    public final C1739m f5815e;

    /* renamed from: f */
    public final String f5816f;

    /* renamed from: g */
    public final boolean f5817g;

    /* renamed from: h */
    public final String f5818h;

    /* renamed from: i */
    public final C1787s f5819i;

    /* renamed from: j */
    public final int f5820j;

    /* renamed from: k */
    public final int f5821k;

    /* renamed from: l */
    public final String f5822l;

    /* renamed from: m */
    public final zzang f5823m;

    /* renamed from: n */
    public final String f5824n;

    /* renamed from: o */
    public final zzaq f5825o;

    /* renamed from: p */
    public final C1737k f5826p;

    AdOverlayInfoParcel(zzc zzc, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i, int i2, String str3, zzang zzang, String str4, zzaq zzaq, IBinder iBinder6) {
        this.f5811a = zzc;
        this.f5812b = (C2845Xs) C5468d.m20962z(C5464b.C5465a.asInterface(iBinder));
        this.f5813c = (C1781m) C5468d.m20962z(C5464b.C5465a.asInterface(iBinder2));
        this.f5814d = (C3520uh) C5468d.m20962z(C5464b.C5465a.asInterface(iBinder3));
        this.f5826p = (C1737k) C5468d.m20962z(C5464b.C5465a.asInterface(iBinder6));
        this.f5815e = (C1739m) C5468d.m20962z(C5464b.C5465a.asInterface(iBinder4));
        this.f5816f = str;
        this.f5817g = z;
        this.f5818h = str2;
        this.f5819i = (C1787s) C5468d.m20962z(C5464b.C5465a.asInterface(iBinder5));
        this.f5820j = i;
        this.f5821k = i2;
        this.f5822l = str3;
        this.f5823m = zzang;
        this.f5824n = str4;
        this.f5825o = zzaq;
    }

    public AdOverlayInfoParcel(zzc zzc, C2845Xs xs, C1781m mVar, C1787s sVar, zzang zzang) {
        this.f5811a = zzc;
        this.f5812b = xs;
        this.f5813c = mVar;
        this.f5814d = null;
        this.f5826p = null;
        this.f5815e = null;
        this.f5816f = null;
        this.f5817g = false;
        this.f5818h = null;
        this.f5819i = sVar;
        this.f5820j = -1;
        this.f5821k = 4;
        this.f5822l = null;
        this.f5823m = zzang;
        this.f5824n = null;
        this.f5825o = null;
    }

    public AdOverlayInfoParcel(C2845Xs xs, C1781m mVar, C1737k kVar, C1739m mVar2, C1787s sVar, C3520uh uhVar, boolean z, int i, String str, zzang zzang) {
        this.f5811a = null;
        this.f5812b = xs;
        this.f5813c = mVar;
        this.f5814d = uhVar;
        this.f5826p = kVar;
        this.f5815e = mVar2;
        this.f5816f = null;
        this.f5817g = z;
        this.f5818h = null;
        this.f5819i = sVar;
        this.f5820j = i;
        this.f5821k = 3;
        this.f5822l = str;
        this.f5823m = zzang;
        this.f5824n = null;
        this.f5825o = null;
    }

    public AdOverlayInfoParcel(C2845Xs xs, C1781m mVar, C1737k kVar, C1739m mVar2, C1787s sVar, C3520uh uhVar, boolean z, int i, String str, String str2, zzang zzang) {
        this.f5811a = null;
        this.f5812b = xs;
        this.f5813c = mVar;
        this.f5814d = uhVar;
        this.f5826p = kVar;
        this.f5815e = mVar2;
        this.f5816f = str2;
        this.f5817g = z;
        this.f5818h = str;
        this.f5819i = sVar;
        this.f5820j = i;
        this.f5821k = 3;
        this.f5822l = null;
        this.f5823m = zzang;
        this.f5824n = null;
        this.f5825o = null;
    }

    public AdOverlayInfoParcel(C2845Xs xs, C1781m mVar, C1787s sVar, C3520uh uhVar, int i, zzang zzang, String str, zzaq zzaq) {
        this.f5811a = null;
        this.f5812b = xs;
        this.f5813c = mVar;
        this.f5814d = uhVar;
        this.f5826p = null;
        this.f5815e = null;
        this.f5816f = null;
        this.f5817g = false;
        this.f5818h = null;
        this.f5819i = sVar;
        this.f5820j = i;
        this.f5821k = 1;
        this.f5822l = null;
        this.f5823m = zzang;
        this.f5824n = str;
        this.f5825o = zzaq;
    }

    public AdOverlayInfoParcel(C2845Xs xs, C1781m mVar, C1787s sVar, C3520uh uhVar, boolean z, int i, zzang zzang) {
        this.f5811a = null;
        this.f5812b = xs;
        this.f5813c = mVar;
        this.f5814d = uhVar;
        this.f5826p = null;
        this.f5815e = null;
        this.f5816f = null;
        this.f5817g = z;
        this.f5818h = null;
        this.f5819i = sVar;
        this.f5820j = i;
        this.f5821k = 2;
        this.f5822l = null;
        this.f5823m = zzang;
        this.f5824n = null;
        this.f5825o = null;
    }

    /* renamed from: a */
    public static AdOverlayInfoParcel m7986a(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m7987a(Intent intent, AdOverlayInfoParcel adOverlayInfoParcel) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9034a(parcel, 2, (Parcelable) this.f5811a, i, false);
        C2049b.m9033a(parcel, 3, C5468d.m20961a(this.f5812b).asBinder(), false);
        C2049b.m9033a(parcel, 4, C5468d.m20961a(this.f5813c).asBinder(), false);
        C2049b.m9033a(parcel, 5, C5468d.m20961a(this.f5814d).asBinder(), false);
        C2049b.m9033a(parcel, 6, C5468d.m20961a(this.f5815e).asBinder(), false);
        C2049b.m9038a(parcel, 7, this.f5816f, false);
        C2049b.m9040a(parcel, 8, this.f5817g);
        C2049b.m9038a(parcel, 9, this.f5818h, false);
        C2049b.m9033a(parcel, 10, C5468d.m20961a(this.f5819i).asBinder(), false);
        C2049b.m9030a(parcel, 11, this.f5820j);
        C2049b.m9030a(parcel, 12, this.f5821k);
        C2049b.m9038a(parcel, 13, this.f5822l, false);
        C2049b.m9034a(parcel, 14, (Parcelable) this.f5823m, i, false);
        C2049b.m9038a(parcel, 16, this.f5824n, false);
        C2049b.m9034a(parcel, 17, (Parcelable) this.f5825o, i, false);
        C2049b.m9033a(parcel, 18, C5468d.m20961a(this.f5826p).asBinder(), false);
        C2049b.m9026a(parcel, a);
    }
}
