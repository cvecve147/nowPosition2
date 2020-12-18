package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p007v4.app.C0344n;
import com.facebook.C1427h;
import com.facebook.C1574p;
import com.facebook.internal.C1496ha;
import com.facebook.internal.C1518r;
import com.facebook.login.LoginClient;

class WebViewLoginMethodHandler extends WebLoginMethodHandler {
    public static final Parcelable.Creator<WebViewLoginMethodHandler> CREATOR = new C1540H();

    /* renamed from: a */
    private C1496ha f5304a;

    /* renamed from: b */
    private String f5305b;

    /* renamed from: com.facebook.login.WebViewLoginMethodHandler$a */
    static class C1544a extends C1496ha.C1497a {

        /* renamed from: h */
        private String f5306h;

        /* renamed from: i */
        private boolean f5307i;

        public C1544a(Context context, String str, Bundle bundle) {
            super(context, str, "oauth", bundle);
        }

        /* renamed from: a */
        public C1496ha mo6213a() {
            Bundle e = mo6217e();
            e.putString("redirect_uri", "fbconnect://success");
            e.putString("client_id", mo6214b());
            e.putString("e2e", this.f5306h);
            e.putString("response_type", "token,signed_request");
            e.putString("return_scopes", "true");
            e.putString("auth_type", "rerequest");
            return new C1496ha(mo6215c(), "oauth", e, mo6218f(), mo6216d());
        }

        /* renamed from: a */
        public C1544a mo6358a(String str) {
            this.f5306h = str;
            return this;
        }

        /* renamed from: a */
        public C1544a mo6359a(boolean z) {
            this.f5307i = z;
            return this;
        }
    }

    WebViewLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.f5305b = parcel.readString();
    }

    WebViewLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6297a() {
        C1496ha haVar = this.f5304a;
        if (haVar != null) {
            haVar.cancel();
            this.f5304a = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo6264a(LoginClient.Request request) {
        Bundle b = mo6355b(request);
        C1539G g = new C1539G(this, request);
        this.f5305b = LoginClient.m7199e();
        mo6349a("e2e", this.f5305b);
        C0344n c = this.f5302b.mo6316c();
        C1544a aVar = new C1544a(c, request.mo6329a(), b);
        aVar.mo6358a(this.f5305b);
        aVar.mo6359a(request.mo6339h());
        aVar.mo6212a(g);
        this.f5304a = aVar.mo6213a();
        C1518r rVar = new C1518r();
        rVar.mo1392g(true);
        rVar.mo6242a(this.f5304a);
        rVar.mo1299a(c.mo1430d(), "FacebookDialogFragment");
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo6265b() {
        return "web_view";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo6356b(LoginClient.Request request, Bundle bundle, C1574p pVar) {
        super.mo6354a(request, bundle, pVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo6351c() {
        return true;
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C1427h mo6268e() {
        return C1427h.WEB_VIEW;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f5305b);
    }
}
