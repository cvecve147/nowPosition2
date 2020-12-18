package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p101d.p129g.p131b.p132a.p134b.C5464b;

/* renamed from: com.google.android.gms.internal.ads.s */
public abstract class C3454s extends C2296Eq implements C3425r {
    public C3454s() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    /* renamed from: a */
    public static C3425r m13730a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return queryLocalInterface instanceof C3425r ? (C3425r) queryLocalInterface : new C3482t(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                mo6997e((Bundle) C2324Fq.m9801a(parcel, Bundle.CREATOR));
                break;
            case 2:
                mo6989Ma();
                break;
            case 3:
                mo7005k();
                break;
            case 4:
                onResume();
                break;
            case 5:
                onPause();
                break;
            case 6:
                Bundle bundle = (Bundle) C2324Fq.m9801a(parcel, Bundle.CREATOR);
                mo7002h(bundle);
                parcel2.writeNoException();
                C2324Fq.m9807b(parcel2, bundle);
                return true;
            case 7:
                mo7010p();
                break;
            case 8:
                onDestroy();
                break;
            case 9:
                mo6999fa();
                break;
            case 10:
                mo6990Ua();
                break;
            case 11:
                boolean Aa = mo6988Aa();
                parcel2.writeNoException();
                C2324Fq.m9804a(parcel2, Aa);
                return true;
            case 12:
                onActivityResult(parcel.readInt(), parcel.readInt(), (Intent) C2324Fq.m9801a(parcel, Intent.CREATOR));
                break;
            case 13:
                mo7003h(C5464b.C5465a.asInterface(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
