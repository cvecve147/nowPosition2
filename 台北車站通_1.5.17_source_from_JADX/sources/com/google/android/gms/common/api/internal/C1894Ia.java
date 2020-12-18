package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.api.internal.Ia */
final class C1894Ia implements C1932fa {

    /* renamed from: a */
    private final /* synthetic */ C1888Fa f6126a;

    private C1894Ia(C1888Fa fa) {
        this.f6126a = fa;
    }

    /* synthetic */ C1894Ia(C1888Fa fa, C1890Ga ga) {
        this(fa);
    }

    /* renamed from: a */
    public final void mo7353a(int i, boolean z) {
        this.f6126a.f6119m.lock();
        try {
            if (this.f6126a.f6118l) {
                boolean unused = this.f6126a.f6118l = false;
                this.f6126a.m8357a(i, z);
            } else {
                boolean unused2 = this.f6126a.f6118l = true;
                this.f6126a.f6110d.mo7261f(i);
            }
        } finally {
            this.f6126a.f6119m.unlock();
        }
    }

    /* renamed from: a */
    public final void mo7354a(Bundle bundle) {
        this.f6126a.f6119m.lock();
        try {
            ConnectionResult unused = this.f6126a.f6117k = ConnectionResult.f6007a;
            this.f6126a.m8367c();
        } finally {
            this.f6126a.f6119m.unlock();
        }
    }

    /* renamed from: a */
    public final void mo7355a(ConnectionResult connectionResult) {
        this.f6126a.f6119m.lock();
        try {
            ConnectionResult unused = this.f6126a.f6117k = connectionResult;
            this.f6126a.m8367c();
        } finally {
            this.f6126a.f6119m.unlock();
        }
    }
}
