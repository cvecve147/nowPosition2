package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.api.internal.Ha */
final class C1892Ha implements C1932fa {

    /* renamed from: a */
    private final /* synthetic */ C1888Fa f6124a;

    private C1892Ha(C1888Fa fa) {
        this.f6124a = fa;
    }

    /* synthetic */ C1892Ha(C1888Fa fa, C1890Ga ga) {
        this(fa);
    }

    /* renamed from: a */
    public final void mo7353a(int i, boolean z) {
        this.f6124a.f6119m.lock();
        try {
            if (!this.f6124a.f6118l && this.f6124a.f6117k != null) {
                if (this.f6124a.f6117k.mo7218f()) {
                    boolean unused = this.f6124a.f6118l = true;
                    this.f6124a.f6111e.mo7261f(i);
                }
            }
            boolean unused2 = this.f6124a.f6118l = false;
            this.f6124a.m8357a(i, z);
        } finally {
            this.f6124a.f6119m.unlock();
        }
    }

    /* renamed from: a */
    public final void mo7354a(Bundle bundle) {
        this.f6124a.f6119m.lock();
        try {
            this.f6124a.m8358a(bundle);
            ConnectionResult unused = this.f6124a.f6116j = ConnectionResult.f6007a;
            this.f6124a.m8367c();
        } finally {
            this.f6124a.f6119m.unlock();
        }
    }

    /* renamed from: a */
    public final void mo7355a(ConnectionResult connectionResult) {
        this.f6124a.f6119m.lock();
        try {
            ConnectionResult unused = this.f6124a.f6116j = connectionResult;
            this.f6124a.m8367c();
        } finally {
            this.f6124a.f6119m.unlock();
        }
    }
}
