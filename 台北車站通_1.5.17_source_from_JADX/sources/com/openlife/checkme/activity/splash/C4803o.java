package com.openlife.checkme.activity.splash;

import android.content.Intent;
import com.openlife.checkme.C4948e;
import com.openlife.checkme.activity.p088a.C4458a;
import com.openlife.checkme.activity.p088a.C4464g;
import com.openlife.checkme.activity.splash.C4788a;
import com.openlife.checkme.activity.splash.C4791c;
import com.openlife.checkme.activity.splash.p090a.C4789a;
import com.openlife.checkme.net.model.AuthLoginBody;
import com.openlife.checkme.net.model.CheckUpdateResponse;
import com.openlife.checkme.net.model.LoginResponse;
import com.openlife.checkme.net.model.SystemConfigResponse;
import com.openlife.checkme.p094d.C4947j;
import java.util.concurrent.TimeUnit;
import p208e.p221b.C6247e;
import p208e.p221b.C6433l;
import p208e.p221b.p222a.p224b.C6216b;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p227d.C6239a;
import p208e.p221b.p227d.C6242d;
import p208e.p221b.p243h.C6418a;

/* renamed from: com.openlife.checkme.activity.splash.o */
public class C4803o<V extends C4791c, M extends C4788a> extends C4790b {

    /* renamed from: d */
    private C6223b f13806d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C4791c f13807e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C4788a f13808f;

    /* renamed from: g */
    private Long f13809g = 0L;

    public C4803o(V v, M m) {
        super(v, m);
        this.f13807e = v;
        this.f13808f = m;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public C6247e m18914e() {
        return C6247e.m23536a(200, TimeUnit.MILLISECONDS, C6418a.m23996b()).mo16356d();
    }

    /* renamed from: a */
    public void mo13259a(Intent intent, Long l) {
        AuthLoginBody a;
        this.f13809g = l;
        if (intent.getExtras() == null || (intent.getExtras() != null && !intent.getExtras().containsKey("INTENT_NAME_LOGIN_TYPE"))) {
            this.f13808f.mo13233c(0);
            mo13262c();
            return;
        }
        if (intent.getExtras().containsKey("INTENT_NAME_SRC")) {
            this.f13808f.mo12977b(intent.getExtras().getString("INTENT_NAME_SRC"));
        }
        if (intent.getExtras().containsKey("INTENT_NAME_LANGUAGE")) {
            this.f13808f.mo12979c(intent.getExtras().getString("INTENT_NAME_LANGUAGE", C4789a.f13785a));
        }
        if (intent.getExtras().containsKey("INTENT_NAME_COLOR")) {
            this.f13808f.mo12976b(intent.getExtras().getInt("INTENT_NAME_COLOR", C4948e.cyan));
        }
        if (intent.getExtras().containsKey("INTENT_NAME_LOGIN_TYPE")) {
            C4789a aVar = null;
            if (intent.getExtras().containsKey("INTENT_NAME_PARAMS")) {
                aVar = (C4789a) intent.getExtras().get("INTENT_NAME_PARAMS");
            }
            int intValue = ((Integer) intent.getExtras().get("INTENT_NAME_LOGIN_TYPE")).intValue();
            if (intValue != 0) {
                if (intValue == 1) {
                    this.f13808f.mo13233c(1);
                    a = this.f13808f.mo13224a(aVar);
                    if (!a.getVendorUid().equals(C4947j.m19536a().mo13553d().mo13494j())) {
                        C4947j.m19536a().mo13553d().mo13498m();
                        C4947j.m19536a().mo13552c().mo13504b();
                        C4947j.m19536a().mo13555f().mo13516e();
                        C4947j.m19536a().mo13555f().mo13513c();
                        C4947j.m19536a().mo13555f().mo13518g();
                    }
                } else if (intValue == 3) {
                    this.f13808f.mo13233c(3);
                    a = this.f13808f.mo13224a(aVar);
                } else {
                    return;
                }
                mo13260a(a);
                return;
            }
            this.f13808f.mo13233c(0);
            if (aVar != null) {
                this.f13808f.mo13230a(aVar.mo13242g());
            }
            mo13262c();
        }
    }

    /* renamed from: a */
    public void mo13260a(AuthLoginBody authLoginBody) {
        C4458a a = mo13150a();
        C4788a aVar = this.f13808f;
        C6433l<SystemConfigResponse> a2 = aVar.mo13227a(aVar.mo13232b());
        C6433l<LoginResponse> a3 = this.f13808f.mo13225a(authLoginBody);
        C4788a aVar2 = this.f13808f;
        a.mo12586a(C6433l.m24023a(a2, a3, aVar2.mo12887a(aVar2.mo12896m(), this.f13809g), new C4802n(this)).mo16545b(C6418a.m23996b()).mo16533a((C6242d<? super C6223b>) new C4801m(this)).mo16532a((C6239a) new C4800l(this)).mo16540a(C6216b.m23500a()).mo16526a(new C4798j(this, authLoginBody), (C6242d<? super Throwable>) new C4799k(this)));
    }

    /* renamed from: a */
    public void mo13261a(C6247e eVar) {
        this.f13806d = eVar.mo16356d().mo16347a(C6216b.m23500a()).mo16351b(new C4797i(this));
    }

    /* renamed from: c */
    public void mo13262c() {
        C4458a a = mo13150a();
        C4788a aVar = this.f13808f;
        C6433l<SystemConfigResponse> a2 = aVar.mo13227a(aVar.mo13232b());
        C4788a aVar2 = this.f13808f;
        C6433l<CheckUpdateResponse> a3 = aVar2.mo13226a(aVar2.mo13234g());
        C4788a aVar3 = this.f13808f;
        C4464g.m17700a(a, C6433l.m24023a(a2, a3, aVar3.mo12887a(aVar3.mo12896m(), this.f13809g), new C4794f(this)), new C4795g(this), new C4796h(this), this.f13807e);
    }

    /* renamed from: d */
    public void mo13263d() {
        C6223b bVar = this.f13806d;
        if (bVar != null) {
            bVar.mo15709a();
        }
    }
}
