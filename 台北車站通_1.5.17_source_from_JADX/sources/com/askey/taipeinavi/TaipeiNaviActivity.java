package com.askey.taipeinavi;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p007v4.app.C0270D;
import android.support.p007v4.app.C0339l;
import butterknife.ButterKnife;
import p101d.p122f.p123a.C5299a;
import p208e.p209a.p210a.p211a.C6199f;
import p267i.p274b.p282c.C6744e;

public class TaipeiNaviActivity extends C6744e {

    /* renamed from: j */
    C1186c f4344j;

    public void onBackPressed() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_taipei_navi);
        ButterKnife.m5840a((Activity) this);
        super.mo17237d(R.color.white);
        C6199f.m23411a((Context) this, new C5299a());
        this.f4344j = new C1186c();
        this.f4344j.mo1405m(getIntent().getExtras());
        C0270D a = mo1430d().mo1494a();
        a.mo1123a((int) R.id.flayContainer, (C0339l) this.f4344j);
        a.mo1122a();
    }

    public void onResume() {
        mo17242p();
        super.onResume();
    }
}
