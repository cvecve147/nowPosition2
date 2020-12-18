package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p007v4.app.C0339l;
import android.support.p007v4.app.C0344n;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.C1366W;
import com.facebook.C1574p;
import com.facebook.internal.C1480ba;
import com.facebook.internal.C1484ca;
import com.facebook.internal.C1512n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class LoginClient implements Parcelable {
    public static final Parcelable.Creator<LoginClient> CREATOR = new C1564t();

    /* renamed from: a */
    LoginMethodHandler[] f5274a;

    /* renamed from: b */
    int f5275b = -1;

    /* renamed from: c */
    C0339l f5276c;

    /* renamed from: d */
    C1543b f5277d;

    /* renamed from: e */
    C1542a f5278e;

    /* renamed from: f */
    boolean f5279f;

    /* renamed from: g */
    Request f5280g;

    /* renamed from: h */
    Map<String, String> f5281h;

    /* renamed from: i */
    private C1570z f5282i;

    public static class Request implements Parcelable {
        public static final Parcelable.Creator<Request> CREATOR = new C1565u();

        /* renamed from: a */
        private final C1563s f5283a;

        /* renamed from: b */
        private Set<String> f5284b;

        /* renamed from: c */
        private final C1546b f5285c;

        /* renamed from: d */
        private final String f5286d;

        /* renamed from: e */
        private final String f5287e;

        /* renamed from: f */
        private boolean f5288f;

        /* renamed from: g */
        private String f5289g;

        private Request(Parcel parcel) {
            boolean z = false;
            this.f5288f = false;
            String readString = parcel.readString();
            C1546b bVar = null;
            this.f5283a = readString != null ? C1563s.valueOf(readString) : null;
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.f5284b = new HashSet(arrayList);
            String readString2 = parcel.readString();
            this.f5285c = readString2 != null ? C1546b.valueOf(readString2) : bVar;
            this.f5286d = parcel.readString();
            this.f5287e = parcel.readString();
            this.f5288f = parcel.readByte() != 0 ? true : z;
            this.f5289g = parcel.readString();
        }

        /* synthetic */ Request(Parcel parcel, C1564t tVar) {
            this(parcel);
        }

        Request(C1563s sVar, Set<String> set, C1546b bVar, String str, String str2) {
            this.f5288f = false;
            this.f5283a = sVar;
            this.f5284b = set == null ? new HashSet<>() : set;
            this.f5285c = bVar;
            this.f5286d = str;
            this.f5287e = str2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo6329a() {
            return this.f5286d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6330a(Set<String> set) {
            C1484ca.m6976a((Object) set, "permissions");
            this.f5284b = set;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6331a(boolean z) {
            this.f5288f = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public String mo6332b() {
            return this.f5287e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C1546b mo6333c() {
            return this.f5285c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public String mo6334d() {
            return this.f5289g;
        }

        public int describeContents() {
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C1563s mo6336e() {
            return this.f5283a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public Set<String> mo6337f() {
            return this.f5284b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public boolean mo6338g() {
            for (String a : this.f5284b) {
                if (C1534D.m7118a(a)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public boolean mo6339h() {
            return this.f5288f;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C1563s sVar = this.f5283a;
            String str = null;
            parcel.writeString(sVar != null ? sVar.name() : null);
            parcel.writeStringList(new ArrayList(this.f5284b));
            C1546b bVar = this.f5285c;
            if (bVar != null) {
                str = bVar.name();
            }
            parcel.writeString(str);
            parcel.writeString(this.f5286d);
            parcel.writeString(this.f5287e);
            parcel.writeByte(this.f5288f ? (byte) 1 : 0);
            parcel.writeString(this.f5289g);
        }
    }

    public static class Result implements Parcelable {
        public static final Parcelable.Creator<Result> CREATOR = new C1566v();

        /* renamed from: a */
        final C1541a f5290a;

        /* renamed from: b */
        final AccessToken f5291b;

        /* renamed from: c */
        final String f5292c;

        /* renamed from: d */
        final String f5293d;

        /* renamed from: e */
        final Request f5294e;

        /* renamed from: f */
        public Map<String, String> f5295f;

        /* renamed from: com.facebook.login.LoginClient$Result$a */
        enum C1541a {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR("error");
            

            /* renamed from: e */
            private final String f5300e;

            private C1541a(String str) {
                this.f5300e = str;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public String mo6343a() {
                return this.f5300e;
            }
        }

        private Result(Parcel parcel) {
            this.f5290a = C1541a.valueOf(parcel.readString());
            this.f5291b = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.f5292c = parcel.readString();
            this.f5293d = parcel.readString();
            this.f5294e = (Request) parcel.readParcelable(Request.class.getClassLoader());
            this.f5295f = C1480ba.m6933a(parcel);
        }

        /* synthetic */ Result(Parcel parcel, C1564t tVar) {
            this(parcel);
        }

        Result(Request request, C1541a aVar, AccessToken accessToken, String str, String str2) {
            C1484ca.m6976a((Object) aVar, "code");
            this.f5294e = request;
            this.f5291b = accessToken;
            this.f5292c = str;
            this.f5290a = aVar;
            this.f5293d = str2;
        }

        /* renamed from: a */
        static Result m7235a(Request request, AccessToken accessToken) {
            return new Result(request, C1541a.SUCCESS, accessToken, (String) null, (String) null);
        }

        /* renamed from: a */
        static Result m7236a(Request request, String str) {
            return new Result(request, C1541a.CANCEL, (AccessToken) null, str, (String) null);
        }

        /* renamed from: a */
        static Result m7237a(Request request, String str, String str2) {
            return m7238a(request, str, str2, (String) null);
        }

        /* renamed from: a */
        static Result m7238a(Request request, String str, String str2, String str3) {
            return new Result(request, C1541a.ERROR, (AccessToken) null, TextUtils.join(": ", C1480ba.m6932a((T[]) new String[]{str, str2})), str3);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f5290a.name());
            parcel.writeParcelable(this.f5291b, i);
            parcel.writeString(this.f5292c);
            parcel.writeString(this.f5293d);
            parcel.writeParcelable(this.f5294e, i);
            C1480ba.m6939a(parcel, this.f5295f);
        }
    }

    /* renamed from: com.facebook.login.LoginClient$a */
    interface C1542a {
        /* renamed from: a */
        void mo6344a();

        /* renamed from: b */
        void mo6345b();
    }

    /* renamed from: com.facebook.login.LoginClient$b */
    public interface C1543b {
        /* renamed from: a */
        void mo6346a(Result result);
    }

    public LoginClient(Parcel parcel) {
        Parcelable[] readParcelableArray = parcel.readParcelableArray(LoginMethodHandler.class.getClassLoader());
        this.f5274a = new LoginMethodHandler[readParcelableArray.length];
        for (int i = 0; i < readParcelableArray.length; i++) {
            LoginMethodHandler[] loginMethodHandlerArr = this.f5274a;
            loginMethodHandlerArr[i] = (LoginMethodHandler) readParcelableArray[i];
            loginMethodHandlerArr[i].mo6348a(this);
        }
        this.f5275b = parcel.readInt();
        this.f5280g = (Request) parcel.readParcelable(Request.class.getClassLoader());
        this.f5281h = C1480ba.m6933a(parcel);
    }

    public LoginClient(C0339l lVar) {
        this.f5276c = lVar;
    }

    /* renamed from: a */
    private void m7195a(String str, Result result, Map<String, String> map) {
        m7196a(str, result.f5290a.mo6343a(), result.f5292c, result.f5293d, map);
    }

    /* renamed from: a */
    private void m7196a(String str, String str2, String str3, String str4, Map<String, String> map) {
        if (this.f5280g == null) {
            m7202o().mo6393a("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
        } else {
            m7202o().mo6394a(this.f5280g.mo6332b(), str, str2, str3, str4, map);
        }
    }

    /* renamed from: a */
    private void m7197a(String str, String str2, boolean z) {
        if (this.f5281h == null) {
            this.f5281h = new HashMap();
        }
        if (this.f5281h.containsKey(str) && z) {
            str2 = this.f5281h.get(str) + "," + str2;
        }
        this.f5281h.put(str, str2);
    }

    /* renamed from: d */
    private void m7198d(Result result) {
        C1543b bVar = this.f5277d;
        if (bVar != null) {
            bVar.mo6346a(result);
        }
    }

    /* renamed from: e */
    static String m7199e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: h */
    public static int m7200h() {
        return C1512n.C1514b.Login.mo6240a();
    }

    /* renamed from: n */
    private void m7201n() {
        mo6309a(Result.m7237a(this.f5280g, "Login attempt failed.", (String) null));
    }

    /* renamed from: o */
    private C1570z m7202o() {
        C1570z zVar = this.f5282i;
        if (zVar == null || !zVar.mo6390a().equals(this.f5280g.mo6329a())) {
            this.f5282i = new C1570z(mo6316c(), this.f5280g.mo6329a());
        }
        return this.f5282i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo6305a(String str) {
        return mo6316c().checkCallingOrSelfPermission(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6306a() {
        if (this.f5275b >= 0) {
            mo6319d().mo6297a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6307a(C0339l lVar) {
        if (this.f5276c == null) {
            this.f5276c = lVar;
            return;
        }
        throw new C1574p("Can't set fragment once it is already set.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6308a(Request request) {
        if (request != null) {
            if (this.f5280g != null) {
                throw new C1574p("Attempted to authorize while a request is pending.");
            } else if (AccessToken.m6460b() == null || mo6314b()) {
                this.f5280g = request;
                this.f5274a = mo6315b(request);
                mo6327m();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6309a(Result result) {
        LoginMethodHandler d = mo6319d();
        if (d != null) {
            m7195a(d.mo6265b(), result, d.f5301a);
        }
        Map<String, String> map = this.f5281h;
        if (map != null) {
            result.f5295f = map;
        }
        this.f5274a = null;
        this.f5275b = -1;
        this.f5280g = null;
        this.f5281h = null;
        m7198d(result);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6310a(C1542a aVar) {
        this.f5278e = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6311a(C1543b bVar) {
        this.f5277d = bVar;
    }

    /* renamed from: a */
    public boolean mo6312a(int i, int i2, Intent intent) {
        if (this.f5280g != null) {
            return mo6319d().mo6263a(i, i2, intent);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo6313b(Result result) {
        if (result.f5291b == null || AccessToken.m6460b() == null) {
            mo6309a(result);
        } else {
            mo6318c(result);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo6314b() {
        if (this.f5279f) {
            return true;
        }
        if (mo6305a("android.permission.INTERNET") != 0) {
            C0344n c = mo6316c();
            mo6309a(Result.m7237a(this.f5280g, c.getString(C1366W.com_facebook_internet_permission_error_title), c.getString(C1366W.com_facebook_internet_permission_error_message)));
            return false;
        }
        this.f5279f = true;
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public LoginMethodHandler[] mo6315b(Request request) {
        ArrayList arrayList = new ArrayList();
        C1563s e = request.mo6336e();
        if (e.mo6380k()) {
            arrayList.add(new GetTokenLoginMethodHandler(this));
        }
        if (e.mo6381l()) {
            arrayList.add(new KatanaProxyLoginMethodHandler(this));
        }
        if (e.mo6379c()) {
            arrayList.add(new FacebookLiteLoginMethodHandler(this));
        }
        if (e.mo6377a()) {
            arrayList.add(new CustomTabLoginMethodHandler(this));
        }
        if (e.mo6382m()) {
            arrayList.add(new WebViewLoginMethodHandler(this));
        }
        if (e.mo6378b()) {
            arrayList.add(new DeviceAuthMethodHandler(this));
        }
        LoginMethodHandler[] loginMethodHandlerArr = new LoginMethodHandler[arrayList.size()];
        arrayList.toArray(loginMethodHandlerArr);
        return loginMethodHandlerArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0344n mo6316c() {
        return this.f5276c.mo1337a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo6317c(Request request) {
        if (!mo6322g()) {
            mo6308a(request);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo6318c(Result result) {
        Result result2;
        if (result.f5291b != null) {
            AccessToken b = AccessToken.m6460b();
            AccessToken accessToken = result.f5291b;
            if (!(b == null || accessToken == null)) {
                try {
                    if (b.mo5896i().equals(accessToken.mo5896i())) {
                        result2 = Result.m7235a(this.f5280g, result.f5291b);
                        mo6309a(result2);
                        return;
                    }
                } catch (Exception e) {
                    mo6309a(Result.m7237a(this.f5280g, "Caught exception", e.getMessage()));
                    return;
                }
            }
            result2 = Result.m7237a(this.f5280g, "User logged in as different Facebook user.", (String) null);
            mo6309a(result2);
            return;
        }
        throw new C1574p("Can't validate without a token");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public LoginMethodHandler mo6319d() {
        int i = this.f5275b;
        if (i >= 0) {
            return this.f5274a[i];
        }
        return null;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: f */
    public C0339l mo6321f() {
        return this.f5276c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo6322g() {
        return this.f5280g != null && this.f5275b >= 0;
    }

    /* renamed from: i */
    public Request mo6323i() {
        return this.f5280g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo6324j() {
        C1542a aVar = this.f5278e;
        if (aVar != null) {
            aVar.mo6344a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo6325k() {
        C1542a aVar = this.f5278e;
        if (aVar != null) {
            aVar.mo6345b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo6326l() {
        LoginMethodHandler d = mo6319d();
        if (!d.mo6351c() || mo6314b()) {
            boolean a = d.mo6264a(this.f5280g);
            if (a) {
                m7202o().mo6396b(this.f5280g.mo6332b(), d.mo6265b());
            } else {
                m7202o().mo6392a(this.f5280g.mo6332b(), d.mo6265b());
                m7197a("not_tried", d.mo6265b(), true);
            }
            return a;
        }
        m7197a("no_internet_permission", "1", false);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo6327m() {
        int i;
        if (this.f5275b >= 0) {
            m7196a(mo6319d().mo6265b(), "skipped", (String) null, (String) null, mo6319d().f5301a);
        }
        do {
            LoginMethodHandler[] loginMethodHandlerArr = this.f5274a;
            if (loginMethodHandlerArr != null && (i = this.f5275b) < loginMethodHandlerArr.length - 1) {
                this.f5275b = i + 1;
            } else if (this.f5280g != null) {
                m7201n();
                return;
            } else {
                return;
            }
        } while (!mo6326l());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelableArray(this.f5274a, i);
        parcel.writeInt(this.f5275b);
        parcel.writeParcelable(this.f5280g, i);
        C1480ba.m6939a(parcel, this.f5281h);
    }
}
