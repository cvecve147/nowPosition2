package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.C1649c;
import java.util.ArrayList;
import java.util.List;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Yv */
public final class C2876Yv extends C1649c.C1650a {

    /* renamed from: a */
    private final C2793Vv f8665a;

    /* renamed from: b */
    private final List<C1649c.C1651b> f8666b = new ArrayList();

    /* renamed from: c */
    private String f8667c;

    public C2876Yv(C2793Vv vv) {
        C2903Zv zv;
        IBinder iBinder;
        this.f8665a = vv;
        try {
            this.f8667c = this.f8665a.getText();
        } catch (RemoteException e) {
            C2227Cf.m9533b("", e);
            this.f8667c = "";
        }
        try {
            for (C2903Zv next : vv.mo8973ea()) {
                if (!(next instanceof IBinder) || (iBinder = (IBinder) next) == null) {
                    zv = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zv = queryLocalInterface instanceof C2903Zv ? (C2903Zv) queryLocalInterface : new C2960aw(iBinder);
                }
                if (zv != null) {
                    this.f8666b.add(new C2989bw(zv));
                }
            }
        } catch (RemoteException e2) {
            C2227Cf.m9533b("", e2);
        }
    }
}
