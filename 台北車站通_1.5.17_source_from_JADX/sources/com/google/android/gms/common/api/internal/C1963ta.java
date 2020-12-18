package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import com.google.android.gms.common.api.C1981o;
import java.lang.ref.WeakReference;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.common.api.internal.ta */
final class C1963ta implements IBinder.DeathRecipient, C1965ua {

    /* renamed from: a */
    private final WeakReference<BasePendingResult<?>> f6308a;

    /* renamed from: b */
    private final WeakReference<C1981o> f6309b;

    /* renamed from: c */
    private final WeakReference<IBinder> f6310c;

    private C1963ta(BasePendingResult<?> basePendingResult, C1981o oVar, IBinder iBinder) {
        this.f6309b = new WeakReference<>(oVar);
        this.f6308a = new WeakReference<>(basePendingResult);
        this.f6310c = new WeakReference<>(iBinder);
    }

    /* synthetic */ C1963ta(BasePendingResult basePendingResult, C1981o oVar, IBinder iBinder, C1961sa saVar) {
        this(basePendingResult, (C1981o) null, iBinder);
    }

    /* renamed from: a */
    private final void m8653a() {
        BasePendingResult basePendingResult = (BasePendingResult) this.f6308a.get();
        C1981o oVar = (C1981o) this.f6309b.get();
        if (!(oVar == null || basePendingResult == null)) {
            oVar.mo7500a(basePendingResult.mo7335d().intValue());
        }
        IBinder iBinder = (IBinder) this.f6310c.get();
        if (iBinder != null) {
            try {
                iBinder.unlinkToDeath(this, 0);
            } catch (NoSuchElementException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo7485a(BasePendingResult<?> basePendingResult) {
        m8653a();
    }

    public final void binderDied() {
        m8653a();
    }
}
