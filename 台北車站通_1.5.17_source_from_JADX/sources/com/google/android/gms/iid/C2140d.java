package com.google.android.gms.iid;

import android.os.Bundle;
import android.util.Log;

/* renamed from: com.google.android.gms.iid.d */
final class C2140d extends C2136D<Bundle> {
    C2140d(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo7750a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(bundle2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16 + String.valueOf(valueOf2).length());
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f6609b.mo14998a(bundle2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo7752a() {
        return false;
    }
}
