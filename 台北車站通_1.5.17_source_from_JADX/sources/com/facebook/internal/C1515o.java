package com.facebook.internal;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.C1601x;
import p013b.p018b.p021c.C0944j;

/* renamed from: com.facebook.internal.o */
public class C1515o {

    /* renamed from: a */
    private Uri f5202a;

    public C1515o(String str, Bundle bundle) {
        bundle = bundle == null ? new Bundle() : bundle;
        String b = C1472W.m6906b();
        this.f5202a = C1480ba.m6919a(b, C1601x.m7397j() + "/" + "dialog/" + str, bundle);
    }

    /* renamed from: a */
    public void mo6241a(Activity activity, String str) {
        C0944j a = new C0944j.C0945a().mo4839a();
        a.f3765a.setPackage(str);
        a.f3765a.addFlags(1073741824);
        a.mo4838a(activity, this.f5202a);
    }
}
