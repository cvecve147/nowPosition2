package com.facebook.internal;

import com.facebook.internal.C1435F;
import java.io.File;

/* renamed from: com.facebook.internal.B */
class C1431B implements C1435F.C1441f {

    /* renamed from: a */
    final /* synthetic */ long f5014a;

    /* renamed from: b */
    final /* synthetic */ File f5015b;

    /* renamed from: c */
    final /* synthetic */ String f5016c;

    /* renamed from: d */
    final /* synthetic */ C1435F f5017d;

    C1431B(C1435F f, long j, File file, String str) {
        this.f5017d = f;
        this.f5014a = j;
        this.f5015b = file;
        this.f5016c = str;
    }

    public void onClose() {
        if (this.f5014a < this.f5017d.f5027i.get()) {
            this.f5015b.delete();
        } else {
            this.f5017d.m6785a(this.f5016c, this.f5015b);
        }
    }
}
