package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.C1461S;
import com.facebook.login.LoginClient;
import java.util.Collection;

class FacebookLiteLoginMethodHandler extends NativeAppLoginMethodHandler {
    public static final Parcelable.Creator<FacebookLiteLoginMethodHandler> CREATOR = new C1557m();

    FacebookLiteLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    FacebookLiteLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo6264a(LoginClient.Request request) {
        String e = LoginClient.m7199e();
        Intent a = C1461S.m6856a((Context) this.f5302b.mo6316c(), request.mo6329a(), (Collection<String>) request.mo6337f(), e, request.mo6339h(), request.mo6338g(), request.mo6333c(), mo6347a(request.mo6332b()));
        mo6349a("e2e", e);
        return mo6352a(a, LoginClient.m7200h());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo6265b() {
        return "fb_lite_login";
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
