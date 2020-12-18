package com.openlife.checkme.activity.browser;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.activity.C4672k;
import com.openlife.checkme.p093c.C4883m;
import com.openlife.checkme.p094d.C4938a;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.apache.http.protocol.HTTP;

public class TinyGameFragment extends C4672k<C4543m, C4538h> implements C4537g {

    /* renamed from: a */
    private Context f13254a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C4543m f13255b;
    WebView webView;

    /* renamed from: com.openlife.checkme.activity.browser.TinyGameFragment$a */
    public class C4530a {

        /* renamed from: a */
        private Context f13256a;

        /* renamed from: b */
        private String f13257b;

        public C4530a(Context context, String str) {
            this.f13256a = context;
            this.f13257b = str;
        }

        /* renamed from: a */
        private void m17939a() {
        }

        @JavascriptInterface
        public void game_close() {
            TinyGameFragment.this.mo12710g();
        }

        @JavascriptInterface
        public void login(String str, String str2, String str3) {
            String format = new SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
            try {
                String a = C4938a.m19448a(this.f13256a);
                String d = C4883m.m19242d("[CheckMe]" + a + "$!_" + format + "#");
                TinyGameFragment.this.webView.post(new C4534d(this, URLDecoder.decode(str, HTTP.UTF_8) + "/" + a + "/" + format + "/" + d + "?success=" + str2 + "&fail=" + str3 + "&src=" + this.f13257b));
            } catch (NoSuchAlgorithmException unused) {
                m17939a();
            } catch (UnsupportedEncodingException unused2) {
            }
        }
    }

    /* renamed from: g */
    public static TinyGameFragment m17930g(String str) {
        TinyGameFragment tinyGameFragment = new TinyGameFragment();
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        tinyGameFragment.setArguments(bundle);
        return tinyGameFragment;
    }

    /* renamed from: a */
    public void mo12707a() {
        getActivity().onBackPressed();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: a */
    public void mo12708a(String str) {
        CookieManager.getInstance().setAcceptCookie(true);
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this.webView, true);
        }
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.addJavascriptInterface(new C4530a(this.f13254a, str), "Checkme");
        this.webView.setWebViewClient(new C4532b(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12594a(boolean z, int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C4543m mo12600l() {
        return this.f13255b;
    }

    /* renamed from: g */
    public void mo12710g() {
        getActivity().runOnUiThread(new C4533c(this));
    }

    /* renamed from: i */
    public void mo12711i(String str) {
        this.webView.loadUrl(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo12598j() {
        return C4957h.fragment_tinygame_cm;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f13254a = getActivity().getBaseContext();
        String string = getArguments().getString("url");
        this.f13255b.mo12731c();
        mo12711i(string);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13255b = new C4543m(this, new C4538h());
    }
}
