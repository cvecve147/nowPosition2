package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.C1427h;
import com.facebook.internal.C1469U;
import com.facebook.internal.C1480ba;
import com.facebook.login.LoginClient;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class GetTokenLoginMethodHandler extends LoginMethodHandler {
    public static final Parcelable.Creator<GetTokenLoginMethodHandler> CREATOR = new C1561q();

    /* renamed from: a */
    private C1558n f5273a;

    GetTokenLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    GetTokenLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6297a() {
        C1558n nVar = this.f5273a;
        if (nVar != null) {
            nVar.mo6166a();
            this.f5273a.mo6169a((C1469U.C1470a) null);
            this.f5273a = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6298a(LoginClient.Request request, Bundle bundle) {
        String string = bundle.getString("com.facebook.platform.extra.USER_ID");
        if (string == null || string.isEmpty()) {
            this.f5302b.mo6324j();
            C1480ba.m6941a(bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN"), (C1480ba.C1481a) new C1560p(this, bundle, request));
            return;
        }
        mo6300c(request, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo6264a(LoginClient.Request request) {
        this.f5273a = new C1558n(this.f5302b.mo6316c(), request.mo6329a());
        if (!this.f5273a.mo6170b()) {
            return false;
        }
        this.f5302b.mo6324j();
        this.f5273a.mo6169a((C1469U.C1470a) new C1559o(this, request));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo6265b() {
        return "get_token";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo6299b(LoginClient.Request request, Bundle bundle) {
        C1558n nVar = this.f5273a;
        if (nVar != null) {
            nVar.mo6169a((C1469U.C1470a) null);
        }
        this.f5273a = null;
        this.f5302b.mo6325k();
        if (bundle != null) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            Set<String> f = request.mo6337f();
            if (stringArrayList == null || (f != null && !stringArrayList.containsAll(f))) {
                HashSet hashSet = new HashSet();
                for (String next : f) {
                    if (!stringArrayList.contains(next)) {
                        hashSet.add(next);
                    }
                }
                if (!hashSet.isEmpty()) {
                    mo6349a("new_permissions", TextUtils.join(",", hashSet));
                }
                request.mo6330a((Set<String>) hashSet);
            } else {
                mo6298a(request, bundle);
                return;
            }
        }
        this.f5302b.mo6327m();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo6300c(LoginClient.Request request, Bundle bundle) {
        this.f5302b.mo6313b(LoginClient.Result.m7235a(this.f5302b.mo6323i(), LoginMethodHandler.m7243a(bundle, C1427h.FACEBOOK_APPLICATION_SERVICE, request.mo6329a())));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
