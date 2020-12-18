package com.google.firebase.iid;

import android.os.Bundle;

/* renamed from: com.google.firebase.iid.d */
final class C4073d extends C4071b<Bundle> {
    C4073d(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11498a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        mo11500a(bundle2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo11501a() {
        return false;
    }
}
