package com.openlife.checkme.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.openlife.checkme.C4948e;
import com.openlife.checkme.activity.splash.SplashActivity;
import com.openlife.checkme.activity.splash.p090a.C4789a;
import com.openlife.checkme.beaconservice.BeaconJobService;
import com.openlife.checkme.beaconservice.BeaconService;
import com.openlife.checkme.checkme_special.splash.SpSplashActivity;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import p013b.p018b.p028h.p029a.C1020d;

/* renamed from: com.openlife.checkme.sdk.b */
public class C4978b implements C4998g {

    /* renamed from: a */
    private static C4978b f14154a;

    /* renamed from: b */
    private Context f14155b;

    /* renamed from: c */
    private String f14156c = C4789a.f13785a;

    /* renamed from: d */
    private int f14157d = C4948e.cyan;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C4981c f14158e;

    /* renamed from: f */
    private boolean f14159f = false;

    /* renamed from: g */
    private String f14160g;

    /* renamed from: h */
    private C5006o f14161h = new C5006o(this, new C5005n());

    /* renamed from: i */
    private BroadcastReceiver f14162i = new C4969a(this);

    /* renamed from: com.openlife.checkme.sdk.b$a */
    public enum C4979a {
        TW,
        EN
    }

    /* renamed from: com.openlife.checkme.sdk.b$b */
    public enum C4980b {
        EMPTY("LOGIN OBJECT CANNOT EMPTY"),
        NOT_SUPPORT_TYPE("INPUT VARIABLE NOT SUPPORT THIS LOGIN TYPE");
        

        /* renamed from: d */
        private String f14169d;

        private C4980b(String str) {
            this.f14169d = str;
        }

        /* renamed from: a */
        public String mo13996a() {
            return this.f14169d;
        }
    }

    /* renamed from: com.openlife.checkme.sdk.b$c */
    public interface C4981c {
        /* renamed from: a */
        void mo13997a();

        /* renamed from: c */
        void mo13998c();

        /* renamed from: h */
        void mo13999h(String str);
    }

    /* renamed from: a */
    public static C4978b m19617a() {
        C4978b bVar = f14154a;
        if (bVar != null) {
            return bVar;
        }
        f14154a = new C4978b();
        return f14154a;
    }

    /* renamed from: a */
    private C4978b m19618a(String str, String str2) {
        this.f14161h.mo14037e(str);
        this.f14161h.mo14036d(str2);
        return this;
    }

    /* renamed from: a */
    private Integer m19619a(C4789a aVar) {
        if (aVar.mo13244i()) {
            return 3;
        }
        return !aVar.mo13242g().isEmpty() ? 1 : 1;
    }

    /* renamed from: a */
    private void m19620a(BeaconService.C4838a aVar) {
        m19623e();
        if (this.f14161h == null) {
            this.f14161h = new C5006o(this, new C5005n());
        }
        this.f14161h.mo13378a(aVar);
        this.f14161h.mo13379a(Long.valueOf(new Date().getTime()));
    }

    /* renamed from: b */
    private Class m19621b(String str) {
        return ((str.hashCode() == 52392498 && str.equals("74241")) ? (char) 0 : 65535) != 0 ? SplashActivity.class : SpSplashActivity.class;
    }

    /* renamed from: b */
    private boolean m19622b(C4789a aVar) {
        return aVar.mo13243h();
    }

    /* renamed from: e */
    private void m19623e() {
        if (Build.VERSION.SDK_INT >= 21) {
            BeaconJobService.m19041a(this.f14155b);
            return;
        }
        this.f14155b.stopService(new Intent(this.f14155b, BeaconService.class));
    }

    /* renamed from: a */
    public C4978b mo13988a(int i) {
        this.f14157d = i;
        this.f14161h.mo14031a(i);
        return this;
    }

    /* renamed from: a */
    public C4978b mo13989a(int i, int i2, int i3) {
        this.f14161h.mo14032a(i, i2, i3);
        return this;
    }

    /* renamed from: a */
    public C4978b mo13990a(Application application, String str, String str2, String str3, Class cls) {
        this.f14155b = application.getBaseContext();
        m19618a(str, str2);
        this.f14161h.mo14035c(str3);
        this.f14161h.mo14034b(cls.getName());
        this.f14160g = str3;
        return this;
    }

    /* renamed from: a */
    public C4978b mo13991a(String str) {
        this.f14161h.mo14033a(str);
        return this;
    }

    /* renamed from: a */
    public void mo13992a(Activity activity, C4789a aVar) {
        if (!m19622b(aVar)) {
            Integer a = m19619a(aVar);
            if (a != null) {
                Intent intent = new Intent(this.f14155b, m19621b(this.f14160g));
                intent.putExtra("INTENT_NAME_PARAMS", aVar);
                intent.putExtra("INTENT_NAME_SRC", this.f14160g);
                intent.putExtra("INTENT_NAME_LANGUAGE", this.f14156c);
                intent.putExtra("INTENT_NAME_COLOR", this.f14157d);
                intent.putExtra("INTENT_NAME_LOGIN_TYPE", a);
                activity.startActivity(intent);
                return;
            }
            throw new NullPointerException(C4980b.NOT_SUPPORT_TYPE.mo13996a());
        }
        throw new NullPointerException(C4980b.EMPTY.mo13996a());
    }

    /* renamed from: b */
    public void mo13993b() {
        m19620a(BeaconService.C4838a.AUTH_SERVICE);
    }

    /* renamed from: c */
    public void mo13994c() {
        m19623e();
    }

    /* renamed from: c */
    public void mo12926c(List<String> list) {
        if (Build.VERSION.SDK_INT >= 21) {
            BeaconJobService.m19042a(this.f14155b, (ArrayList<String>) (ArrayList) list);
            return;
        }
        Intent intent = new Intent(this.f14155b, BeaconService.class);
        intent.putStringArrayListExtra("EXTRA_BEACON_LIST", (ArrayList) list);
        this.f14155b.stopService(intent);
        this.f14155b.startService(intent);
    }

    /* renamed from: d */
    public void mo13995d() {
        C1020d.m5430a(this.f14155b).mo5018a(this.f14162i);
        this.f14158e = null;
        this.f14159f = false;
    }
}
