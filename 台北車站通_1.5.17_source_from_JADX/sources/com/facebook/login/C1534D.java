package com.facebook.login;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.C1428i;
import com.facebook.C1571m;
import com.facebook.C1572n;
import com.facebook.C1574p;
import com.facebook.C1601x;
import com.facebook.FacebookActivity;
import com.facebook.Profile;
import com.facebook.internal.C1484ca;
import com.facebook.internal.C1512n;
import com.facebook.login.LoginClient;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: com.facebook.login.D */
public class C1534D {

    /* renamed from: a */
    private static final Set<String> f5246a = m7121c();

    /* renamed from: b */
    private static volatile C1534D f5247b;

    /* renamed from: c */
    private C1563s f5248c = C1563s.NATIVE_WITH_FALLBACK;

    /* renamed from: d */
    private C1546b f5249d = C1546b.FRIENDS;

    /* renamed from: com.facebook.login.D$a */
    private static class C1535a implements C1538F {

        /* renamed from: a */
        private final Activity f5250a;

        C1535a(Activity activity) {
            C1484ca.m6976a((Object) activity, "activity");
            this.f5250a = activity;
        }

        /* renamed from: a */
        public Activity mo6277a() {
            return this.f5250a;
        }

        /* renamed from: a */
        public void mo6278a(Intent intent, int i) {
            this.f5250a.startActivityForResult(intent, i);
        }
    }

    /* renamed from: com.facebook.login.D$b */
    private static class C1536b {

        /* renamed from: a */
        private static volatile C1570z f5251a;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static synchronized C1570z m7132b(Context context) {
            synchronized (C1536b.class) {
                if (context == null) {
                    context = C1601x.m7386b();
                }
                if (context == null) {
                    return null;
                }
                if (f5251a == null) {
                    f5251a = new C1570z(context, C1601x.m7389c());
                }
                C1570z zVar = f5251a;
                return zVar;
            }
        }
    }

    C1534D() {
        C1484ca.m6983c();
    }

    /* renamed from: a */
    public static C1534D m7111a() {
        if (f5247b == null) {
            synchronized (C1534D.class) {
                if (f5247b == null) {
                    f5247b = new C1534D();
                }
            }
        }
        return f5247b;
    }

    /* renamed from: a */
    static C1537E m7112a(LoginClient.Request request, AccessToken accessToken) {
        Set<String> f = request.mo6337f();
        HashSet hashSet = new HashSet(accessToken.mo5892f());
        if (request.mo6339h()) {
            hashSet.retainAll(f);
        }
        HashSet hashSet2 = new HashSet(f);
        hashSet2.removeAll(hashSet);
        return new C1537E(accessToken, hashSet, hashSet2);
    }

    /* renamed from: a */
    private void m7113a(Context context, LoginClient.Request request) {
        C1570z a = C1536b.m7132b(context);
        if (a != null && request != null) {
            a.mo6391a(request);
        }
    }

    /* renamed from: a */
    private void m7114a(Context context, LoginClient.Result.C1541a aVar, Map<String, String> map, Exception exc, boolean z, LoginClient.Request request) {
        C1570z a = C1536b.m7132b(context);
        if (a != null) {
            if (request == null) {
                a.mo6397c("fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("try_login_activity", z ? "1" : "0");
            a.mo6395a(request.mo6332b(), hashMap, aVar, map, exc);
        }
    }

    /* renamed from: a */
    private void m7115a(AccessToken accessToken, LoginClient.Request request, C1574p pVar, boolean z, C1572n<C1537E> nVar) {
        if (accessToken != null) {
            AccessToken.m6458a(accessToken);
            Profile.m6616a();
        }
        if (nVar != null) {
            C1537E a = accessToken != null ? m7112a(request, accessToken) : null;
            if (z || (a != null && a.mo6295b().size() == 0)) {
                nVar.onCancel();
            } else if (pVar != null) {
                nVar.mo6398a(pVar);
            } else if (accessToken != null) {
                nVar.mo6399a(a);
            }
        }
    }

    /* renamed from: a */
    private void m7116a(C1538F f, LoginClient.Request request) {
        m7113a((Context) f.mo6277a(), request);
        C1512n.m7062b(C1512n.C1514b.Login.mo6240a(), new C1533C(this));
        if (!m7120b(f, request)) {
            C1574p pVar = new C1574p("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
            m7114a(f.mo6277a(), LoginClient.Result.C1541a.ERROR, (Map<String, String>) null, pVar, false, request);
            throw pVar;
        }
    }

    /* renamed from: a */
    private boolean m7117a(Intent intent) {
        return C1601x.m7386b().getPackageManager().resolveActivity(intent, 0) != null;
    }

    /* renamed from: a */
    static boolean m7118a(String str) {
        return str != null && (str.startsWith("publish") || str.startsWith("manage") || f5246a.contains(str));
    }

    /* renamed from: b */
    private void m7119b(Collection<String> collection) {
        if (collection != null) {
            for (String next : collection) {
                if (m7118a(next)) {
                    throw new C1574p(String.format("Cannot pass a publish or manage permission (%s) to a request for read authorization", new Object[]{next}));
                }
            }
        }
    }

    /* renamed from: b */
    private boolean m7120b(C1538F f, LoginClient.Request request) {
        Intent a = mo6270a(request);
        if (!m7117a(a)) {
            return false;
        }
        try {
            f.mo6278a(a, LoginClient.m7200h());
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    private static Set<String> m7121c() {
        return Collections.unmodifiableSet(new C1532B());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Intent mo6270a(LoginClient.Request request) {
        Intent intent = new Intent();
        intent.setClass(C1601x.m7386b(), FacebookActivity.class);
        intent.setAction(request.mo6336e().toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", request);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        return intent;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public LoginClient.Request mo6271a(Collection<String> collection) {
        LoginClient.Request request = new LoginClient.Request(this.f5248c, Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet()), this.f5249d, C1601x.m7389c(), UUID.randomUUID().toString());
        request.mo6331a(AccessToken.m6460b() != null);
        return request;
    }

    /* renamed from: a */
    public void mo6272a(Activity activity, Collection<String> collection) {
        m7119b(collection);
        m7116a((C1538F) new C1535a(activity), mo6271a(collection));
    }

    /* renamed from: a */
    public void mo6273a(C1428i iVar, C1572n<C1537E> nVar) {
        if (iVar instanceof C1512n) {
            ((C1512n) iVar).mo6238a(C1512n.C1514b.Login.mo6240a(), new C1531A(this, nVar));
            return;
        }
        throw new C1574p("Unexpected CallbackManager, please use the provided Factory.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo6274a(int i, Intent intent) {
        return mo6275a(i, intent, (C1572n<C1537E>) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo6275a(int i, Intent intent, C1572n<C1537E> nVar) {
        Map<String, String> map;
        LoginClient.Result.C1541a aVar;
        boolean z;
        AccessToken accessToken;
        LoginClient.Request request;
        LoginClient.Request request2;
        Map<String, String> map2;
        AccessToken accessToken2;
        int i2 = i;
        Intent intent2 = intent;
        LoginClient.Result.C1541a aVar2 = LoginClient.Result.C1541a.ERROR;
        C1574p pVar = null;
        boolean z2 = false;
        if (intent2 != null) {
            LoginClient.Result result = (LoginClient.Result) intent2.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (result != null) {
                LoginClient.Request request3 = result.f5294e;
                LoginClient.Result.C1541a aVar3 = result.f5290a;
                if (i2 != -1) {
                    if (i2 == 0) {
                        z2 = true;
                    }
                    accessToken2 = null;
                } else if (aVar3 == LoginClient.Result.C1541a.SUCCESS) {
                    accessToken2 = result.f5291b;
                } else {
                    pVar = new C1571m(result.f5292c);
                    accessToken2 = null;
                }
                map2 = result.f5295f;
                LoginClient.Result.C1541a aVar4 = aVar3;
                request2 = request3;
                aVar2 = aVar4;
            } else {
                accessToken2 = null;
                map2 = null;
                request2 = null;
            }
            map = map2;
            aVar = aVar2;
            z = z2;
            LoginClient.Request request4 = request2;
            accessToken = accessToken2;
            request = request4;
        } else if (i2 == 0) {
            aVar = LoginClient.Result.C1541a.CANCEL;
            z = true;
            request = null;
            accessToken = null;
            map = null;
        } else {
            aVar = aVar2;
            request = null;
            accessToken = null;
            map = null;
            z = false;
        }
        if (pVar == null && accessToken == null && !z) {
            pVar = new C1574p("Unexpected call to LoginManager.onActivityResult");
        }
        m7114a((Context) null, aVar, map, pVar, true, request);
        m7115a(accessToken, request, pVar, z, nVar);
        return true;
    }

    /* renamed from: b */
    public void mo6276b() {
        AccessToken.m6458a((AccessToken) null);
        Profile.m6617a((Profile) null);
    }
}
