package com.openlife.checkme;

import android.content.Intent;
import android.os.Bundle;
import android.support.p011v7.app.C0623m;
import android.widget.Button;
import com.openlife.checkme.activity.splash.p090a.C4789a;
import com.openlife.checkme.sdk.C4978b;
import com.openlife.checkme.sdk.C4995e;

public class TestMainActivity extends C0623m {

    /* renamed from: d */
    private int f13116d = 0;

    /* renamed from: e */
    private String[] f13117e = {"Normal 登入", "Auth 登入", "無登入畫面登入"};

    /* renamed from: f */
    private String[] f13118f = {"POAY"};
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C4978b f13119g;

    /* renamed from: h */
    private C4995e f13120h;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C4957h.activity_test_main);
        C4978b a = C4978b.m19617a();
        a.mo13990a(getApplication(), "TAIPEINAVI", "96ce0662d39f420c485eb89e4d5c663154937e399c7e", "74241", TestMainActivity.class);
        this.f13119g = a;
        C4978b bVar = this.f13119g;
        int i = C4959j.card_icon_location;
        bVar.mo13989a(i, i, C4961l.account_title);
        this.f13120h = new C4995e(this);
        this.f13120h.mo14015a((C4995e.C4996a) new C4964o(this));
        this.f13120h.mo14018b(getIntent());
        this.f13119g.mo13993b();
        this.f13119g.mo13988a(C4948e.taipeinavi);
        C4789a aVar = new C4789a();
        aVar.mo13235a("g8eUqT208bHRKrGDEk0XyJQI");
        ((Button) findViewById(C4956g.normal_login_btn)).setOnClickListener(new C4965p(this, aVar));
        ((Button) findViewById(C4956g.normal_login_btn2)).setOnClickListener(new C4966q(this));
        ((Button) findViewById(C4956g.normal_login_btn3)).setOnClickListener(new C4967r(this));
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f13119g.mo13995d();
        this.f13120h.mo14014a();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        this.f13120h.mo14018b(intent);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f13120h.mo14017b();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f13120h.mo14019c();
    }
}
