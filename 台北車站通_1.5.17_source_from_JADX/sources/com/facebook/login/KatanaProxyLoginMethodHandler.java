package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.C1461S;
import com.facebook.login.LoginClient;

class KatanaProxyLoginMethodHandler extends NativeAppLoginMethodHandler {
    public static final Parcelable.Creator<KatanaProxyLoginMethodHandler> CREATOR = new C1562r();

    KatanaProxyLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    KatanaProxyLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo6264a(LoginClient.Request request) {
        String e = LoginClient.m7199e();
        Intent b = C1461S.m6866b(this.f5302b.mo6316c(), request.mo6329a(), request.mo6337f(), e, request.mo6339h(), request.mo6338g(), request.mo6333c(), mo6347a(request.mo6332b()));
        mo6349a("e2e", e);
        return mo6352a(b, LoginClient.m7200h());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo6265b() {
        return "katana_proxy_auth";
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
