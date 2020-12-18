package com.openlife.checkme.activity.browser;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.BaseActivity;
import com.openlife.checkme.p093c.C4883m;
import com.openlife.checkme.p094d.C4947j;
import org.apache.http.protocol.HTTP;

public class BrowserActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public ProgressDialog f13247a;

    /* renamed from: b */
    private String f13248b;

    /* renamed from: c */
    private String f13249c;

    /* renamed from: d */
    private String f13250d;

    /* renamed from: e */
    private String f13251e;
    WebView webView;

    /* renamed from: a */
    public static void m17921a(Activity activity, String str, int i) {
        Intent intent = new Intent(activity, BrowserActivity.class);
        intent.putExtra("LAUNCH_TYPE", "content");
        intent.putExtra("content", str);
        intent.putExtra("title", activity.getResources().getString(i));
        activity.startActivityForResult(intent, 9999);
    }

    /* renamed from: a */
    private boolean m17922a() {
        String queryParameter;
        if (getIntent() == null) {
            return false;
        }
        Uri data = getIntent().getData();
        if (data == null) {
            this.f13248b = getIntent().getStringExtra("url");
            this.f13249c = getIntent().getStringExtra("content");
            this.f13250d = getIntent().getStringExtra("LAUNCH_TYPE");
            this.f13251e = getIntent().getStringExtra("title");
            return true;
        } else if (!data.getHost().equals(getString(C4961l.host_browser)) || (queryParameter = data.getQueryParameter("url")) == null || queryParameter.isEmpty()) {
            return false;
        } else {
            this.f13248b = queryParameter;
            this.f13250d = "url";
            return true;
        }
    }

    /* renamed from: p */
    private void m17923p() {
        this.f13247a = C4883m.m19216a((Context) this, C4947j.m19536a().mo13554e().mo13536f());
        String str = this.f13251e;
        if (str != null) {
            setTitle(str);
        }
        this.webView.setWebViewClient(new C4531a(this));
        if (this.f13250d.equals("content")) {
            this.webView.loadDataWithBaseURL("", this.f13249c, "text/html", HTTP.UTF_8, "");
        } else {
            this.webView.loadUrl(this.f13248b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int mo12581n() {
        return C4957h.activity_browser_cm;
    }

    public void onBackPressed() {
        if (this.webView.canGoBack()) {
            this.webView.goBack();
        } else {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (m17922a()) {
            m17923p();
        } else {
            finish();
        }
    }
}
