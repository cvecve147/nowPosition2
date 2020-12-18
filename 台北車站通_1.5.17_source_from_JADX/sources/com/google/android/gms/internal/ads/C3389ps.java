package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import p101d.p129g.p131b.p132a.p134b.C5468d;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.ps */
public final class C3389ps {

    /* renamed from: a */
    C2382Hq f10039a;

    /* renamed from: b */
    boolean f10040b;

    public C3389ps() {
    }

    public C3389ps(Context context) {
        C2558Nu.m10773a(context);
        if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7922ke)).booleanValue()) {
            try {
                this.f10039a = C2410Iq.m10317a(DynamiteModule.m9187a(context, DynamiteModule.f6574g, ModuleDescriptor.MODULE_ID).mo7730a("com.google.android.gms.ads.clearcut.DynamiteClearcutLogger"));
                C5468d.m20961a(context);
                this.f10039a.mo8300b(C5468d.m20961a(context), "GMA_SDK");
                this.f10040b = true;
            } catch (RemoteException | DynamiteModule.C2101a | NullPointerException unused) {
                C2227Cf.m9532b("Cannot dynamite load clearcut");
            }
        }
    }

    public C3389ps(Context context, String str, String str2) {
        C2558Nu.m10773a(context);
        try {
            this.f10039a = C2410Iq.m10317a(DynamiteModule.m9187a(context, DynamiteModule.f6574g, ModuleDescriptor.MODULE_ID).mo7730a("com.google.android.gms.ads.clearcut.DynamiteClearcutLogger"));
            C5468d.m20961a(context);
            this.f10039a.mo8297a(C5468d.m20961a(context), str, (String) null);
            this.f10040b = true;
        } catch (RemoteException | DynamiteModule.C2101a | NullPointerException unused) {
            C2227Cf.m9532b("Cannot dynamite load clearcut");
        }
    }

    /* renamed from: a */
    public final C3446rs mo9898a(byte[] bArr) {
        return new C3446rs(this, bArr);
    }
}
