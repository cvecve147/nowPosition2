package com.facebook.login;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.facebook.C1427h;
import com.facebook.C1574p;
import com.facebook.internal.C1472W;
import com.facebook.internal.C1480ba;
import com.facebook.login.LoginClient;

abstract class NativeAppLoginMethodHandler extends LoginMethodHandler {
    NativeAppLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    NativeAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* renamed from: a */
    private LoginClient.Result m7256a(LoginClient.Request request, Intent intent) {
        Bundle extras = intent.getExtras();
        String a = m7257a(extras);
        String string = extras.getString("error_code");
        return "CONNECTION_FAILURE".equals(string) ? LoginClient.Result.m7238a(request, a, m7259b(extras), string) : LoginClient.Result.m7236a(request, a);
    }

    /* renamed from: a */
    private String m7257a(Bundle bundle) {
        String string = bundle.getString("error");
        return string == null ? bundle.getString("error_type") : string;
    }

    /* renamed from: b */
    private LoginClient.Result m7258b(LoginClient.Request request, Intent intent) {
        Bundle extras = intent.getExtras();
        String a = m7257a(extras);
        String string = extras.getString("error_code");
        String b = m7259b(extras);
        String string2 = extras.getString("e2e");
        if (!C1480ba.m6958b(string2)) {
            mo6350b(string2);
        }
        if (a == null && string == null && b == null) {
            try {
                return LoginClient.Result.m7235a(request, LoginMethodHandler.m7244a(request.mo6337f(), extras, C1427h.FACEBOOK_APPLICATION_WEB, request.mo6329a()));
            } catch (C1574p e) {
                return LoginClient.Result.m7237a(request, (String) null, e.getMessage());
            }
        } else if (C1472W.f5105a.contains(a)) {
            return null;
        } else {
            return C1472W.f5106b.contains(a) ? LoginClient.Result.m7236a(request, (String) null) : LoginClient.Result.m7238a(request, a, b, string);
        }
    }

    /* renamed from: b */
    private String m7259b(Bundle bundle) {
        String string = bundle.getString("error_message");
        return string == null ? bundle.getString("error_description") : string;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo6263a(int i, int i2, Intent intent) {
        LoginClient.Request i3 = this.f5302b.mo6323i();
        LoginClient.Result a = intent == null ? LoginClient.Result.m7236a(i3, "Operation canceled") : i2 == 0 ? m7256a(i3, intent) : i2 != -1 ? LoginClient.Result.m7237a(i3, "Unexpected resultCode from authorization.", (String) null) : m7258b(i3, intent);
        if (a != null) {
            this.f5302b.mo6313b(a);
            return true;
        }
        this.f5302b.mo6327m();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo6352a(Intent intent, int i) {
        if (intent == null) {
            return false;
        }
        try {
            this.f5302b.mo6321f().mo1351a(intent, i);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }
}
