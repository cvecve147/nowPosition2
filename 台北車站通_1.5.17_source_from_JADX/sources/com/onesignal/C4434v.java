package com.onesignal;

import com.google.android.gms.common.api.GoogleApiClient;

/* renamed from: com.onesignal.v */
class C4434v {

    /* renamed from: a */
    private final GoogleApiClient f13064a;

    /* renamed from: b */
    private final Class f13065b;

    C4434v(GoogleApiClient googleApiClient) {
        this.f13064a = googleApiClient;
        this.f13065b = googleApiClient.getClass();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12543a() {
        try {
            this.f13065b.getMethod("connect", new Class[0]).invoke(this.f13064a, new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo12544b() {
        try {
            this.f13065b.getMethod("disconnect", new Class[0]).invoke(this.f13064a, new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public GoogleApiClient mo12545c() {
        return this.f13064a;
    }
}
