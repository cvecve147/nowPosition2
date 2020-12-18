package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.google.android.gms.common.internal.D */
final class C2001D extends C2030i {

    /* renamed from: a */
    private final /* synthetic */ Intent f6385a;

    /* renamed from: b */
    private final /* synthetic */ Activity f6386b;

    /* renamed from: c */
    private final /* synthetic */ int f6387c;

    C2001D(Intent intent, Activity activity, int i) {
        this.f6385a = intent;
        this.f6386b = activity;
        this.f6387c = i;
    }

    /* renamed from: a */
    public final void mo7569a() {
        Intent intent = this.f6385a;
        if (intent != null) {
            this.f6386b.startActivityForResult(intent, this.f6387c);
        }
    }
}
