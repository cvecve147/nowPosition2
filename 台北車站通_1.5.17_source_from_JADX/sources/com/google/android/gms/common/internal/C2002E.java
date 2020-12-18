package com.google.android.gms.common.internal;

import android.content.Intent;
import android.support.p007v4.app.C0339l;

/* renamed from: com.google.android.gms.common.internal.E */
final class C2002E extends C2030i {

    /* renamed from: a */
    private final /* synthetic */ Intent f6388a;

    /* renamed from: b */
    private final /* synthetic */ C0339l f6389b;

    /* renamed from: c */
    private final /* synthetic */ int f6390c;

    C2002E(Intent intent, C0339l lVar, int i) {
        this.f6388a = intent;
        this.f6389b = lVar;
        this.f6390c = i;
    }

    /* renamed from: a */
    public final void mo7569a() {
        Intent intent = this.f6388a;
        if (intent != null) {
            this.f6389b.mo1351a(intent, this.f6390c);
        }
    }
}
