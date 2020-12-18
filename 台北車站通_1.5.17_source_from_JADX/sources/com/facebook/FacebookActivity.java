package com.facebook;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p007v4.app.C0270D;
import android.support.p007v4.app.C0336i;
import android.support.p007v4.app.C0339l;
import android.support.p007v4.app.C0344n;
import android.support.p007v4.app.C0350r;
import android.util.Log;
import com.facebook.internal.C1461S;
import com.facebook.internal.C1518r;
import com.facebook.login.C1569y;
import com.facebook.share.internal.DeviceShareDialogFragment;
import com.facebook.share.model.ShareContent;

public class FacebookActivity extends C0344n {

    /* renamed from: m */
    public static String f4759m = "PassThrough";

    /* renamed from: n */
    private static String f4760n = "SingleFragment";

    /* renamed from: o */
    private static final String f4761o = "com.facebook.FacebookActivity";

    /* renamed from: p */
    private C0339l f4762p;

    /* renamed from: k */
    private void m6479k() {
        setResult(0, C1461S.m6857a(getIntent(), (Bundle) null, C1461S.m6861a(C1461S.m6868b(getIntent()))));
        finish();
    }

    /* renamed from: i */
    public C0339l mo2622i() {
        return this.f4762p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C0339l mo5915j() {
        C0336i iVar;
        Intent intent = getIntent();
        C0350r d = mo1430d();
        C0339l a = d.mo1495a(f4760n);
        if (a != null) {
            return a;
        }
        if ("FacebookDialogFragment".equals(intent.getAction())) {
            C0336i rVar = new C1518r();
            rVar.mo1392g(true);
            iVar = rVar;
        } else if ("DeviceShareDialogFragment".equals(intent.getAction())) {
            DeviceShareDialogFragment deviceShareDialogFragment = new DeviceShareDialogFragment();
            deviceShareDialogFragment.mo1392g(true);
            deviceShareDialogFragment.mo6406a((ShareContent) intent.getParcelableExtra("content"));
            iVar = deviceShareDialogFragment;
        } else {
            C1569y yVar = new C1569y();
            yVar.mo1392g(true);
            C0270D a2 = d.mo1494a();
            a2.mo1124a(C1364U.com_facebook_fragment_container, yVar, f4760n);
            a2.mo1122a();
            return yVar;
        }
        iVar.mo1299a(d, f4760n);
        return iVar;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0339l lVar = this.f4762p;
        if (lVar != null) {
            lVar.onConfigurationChanged(configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!C1601x.m7402o()) {
            Log.d(f4761o, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
            C1601x.m7390c(getApplicationContext());
        }
        setContentView(C1365V.com_facebook_activity_layout);
        if (f4759m.equals(intent.getAction())) {
            m6479k();
        } else {
            this.f4762p = mo5915j();
        }
    }
}
