package com.onesignal;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.onesignal.C4250I;
import com.onesignal.C4306Xa;
import com.onesignal.C4342b;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import org.apache.http.protocol.HTTP;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(19)
/* renamed from: com.onesignal.jc */
class C4384jc extends C4342b.C4343a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f12926a = "com.onesignal.jc";

    /* renamed from: b */
    private static final int f12927b = C4256Ja.m16901a(24);
    /* access modifiers changed from: private */
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: c */
    public static C4384jc f12928c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C4259Ka f12929d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C4250I f12930e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Activity f12931f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C4364fa f12932g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f12933h = true;

    /* renamed from: com.onesignal.jc$a */
    private class C4385a {
        private C4385a() {
        }

        /* synthetic */ C4385a(C4384jc jcVar, C4341ac acVar) {
            this();
        }

        /* renamed from: a */
        private C4387c m17411a(JSONObject jSONObject) {
            C4387c cVar = C4387c.FULL_SCREEN;
            try {
                return (!jSONObject.has("displayLocation") || jSONObject.get("displayLocation").equals("")) ? cVar : C4387c.valueOf(jSONObject.optString("displayLocation", "FULL_SCREEN").toUpperCase());
            } catch (JSONException e) {
                e.printStackTrace();
                return cVar;
            }
        }

        /* renamed from: b */
        private int m17412b(JSONObject jSONObject) {
            try {
                return C4384jc.m17400b(C4384jc.this.f12931f, jSONObject.getJSONObject("pageMetaData"));
            } catch (JSONException unused) {
                return -1;
            }
        }

        /* renamed from: c */
        private void m17413c(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("body");
            String optString = jSONObject2.optString("id", (String) null);
            if (C4384jc.this.f12932g.f12893f) {
                C4406pa.m17450b().mo12527b(C4384jc.this.f12932g, jSONObject2);
            } else if (optString != null) {
                C4406pa.m17450b().mo12523a(C4384jc.this.f12932g, jSONObject2);
            }
            if (jSONObject2.getBoolean("close")) {
                C4384jc.this.m17390a((C4386b) null);
            }
        }

        /* renamed from: d */
        private void m17414d(JSONObject jSONObject) {
            C4387c a = m17411a(jSONObject);
            C4384jc.this.m17391a(a, a == C4387c.FULL_SCREEN ? -1 : m17412b(jSONObject));
        }

        @JavascriptInterface
        public void postMessage(String str) {
            try {
                C4306Xa.C4316j jVar = C4306Xa.C4316j.DEBUG;
                C4306Xa.m17154b(jVar, "OSJavaScriptInterface:postMessage: " + str);
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString(SVGParser.XML_STYLESHEET_ATTR_TYPE);
                if (string.equals("rendering_complete")) {
                    m17414d(jSONObject);
                } else if (string.equals("action_taken")) {
                    m17413c(jSONObject);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.onesignal.jc$b */
    interface C4386b {
        /* renamed from: c */
        void mo12461c();
    }

    /* renamed from: com.onesignal.jc$c */
    enum C4387c {
        TOP_BANNER,
        BOTTOM_BANNER,
        CENTER_MODAL,
        FULL_SCREEN;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo12508a() {
            int i = C4380ic.f12921a[ordinal()];
            return i == 1 || i == 2;
        }
    }

    private C4384jc(C4364fa faVar, Activity activity) {
        this.f12932g = faVar;
        this.f12931f = activity;
    }

    /* access modifiers changed from: private */
    @SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface"})
    /* renamed from: a */
    public void m17387a(Activity activity, String str) {
        m17406c();
        this.f12929d = new C4259Ka(activity);
        this.f12929d.setOverScrollMode(2);
        this.f12929d.setVerticalScrollBarEnabled(false);
        this.f12929d.setHorizontalScrollBarEnabled(false);
        this.f12929d.getSettings().setJavaScriptEnabled(true);
        this.f12929d.addJavascriptInterface(new C4385a(this, (C4341ac) null), "OSAndroid");
        m17388a((WebView) this.f12929d);
        C4256Ja.m16903a(this.f12931f, new C4366fc(this, activity, str));
    }

    /* renamed from: a */
    private void m17388a(WebView webView) {
        if (Build.VERSION.SDK_INT == 19) {
            webView.setLayerType(1, (Paint) null);
        }
    }

    /* renamed from: a */
    static void m17389a(C4364fa faVar, String str) {
        Activity activity = C4342b.f12860f;
        if (activity != null) {
            C4384jc jcVar = f12928c;
            if (jcVar == null || !faVar.f12893f) {
                m17403b(activity, faVar, str);
            } else {
                jcVar.m17390a((C4386b) new C4341ac(activity, faVar, str));
            }
        } else {
            Looper.prepare();
            new Handler().postDelayed(new C4350bc(faVar, str), 200);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17390a(C4386b bVar) {
        C4250I i = this.f12930e;
        if (i != null) {
            i.mo12307a((C4386b) new C4376hc(this, bVar));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17391a(C4387c cVar, int i) {
        this.f12930e = new C4250I(this.f12929d, cVar, i, this.f12932g.mo12496a());
        this.f12930e.mo12306a((C4250I.C4251a) new C4372gc(this));
        C4342b.m17294a(f12926a + this.f12932g.f12888a, (C4342b.C4343a) this);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17397a(Integer num) {
        this.f12930e.mo12305a((WebView) this.f12929d);
        if (num != null) {
            this.f12930e.mo12303a(num.intValue());
        }
        this.f12930e.mo12310b(this.f12931f);
        this.f12930e.mo12302a();
    }

    /* renamed from: b */
    private static int m17399b(Activity activity) {
        return C4256Ja.m16905b(activity) - (f12927b * 2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m17400b(Activity activity, JSONObject jSONObject) {
        try {
            int a = C4256Ja.m16901a(jSONObject.getJSONObject("rect").getInt("height"));
            C4306Xa.C4316j jVar = C4306Xa.C4316j.DEBUG;
            C4306Xa.m17154b(jVar, "getPageHeightData:pxHeight: " + a);
            int c = m17404c(activity);
            if (a <= c) {
                return a;
            }
            C4306Xa.C4316j jVar2 = C4306Xa.C4316j.DEBUG;
            C4306Xa.m17135a(jVar2, "getPageHeightData:pxHeight is over screen max: " + c);
            return c;
        } catch (JSONException e) {
            C4306Xa.m17136a(C4306Xa.C4316j.ERROR, "pageRectToViewHeight could not get page height", (Throwable) e);
            return -1;
        }
    }

    /* renamed from: b */
    private void m17402b() {
        if (this.f12930e.mo12309b() == C4387c.FULL_SCREEN) {
            m17397a((Integer) null);
        } else {
            C4256Ja.m16903a(this.f12931f, new C4362ec(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m17403b(Activity activity, C4364fa faVar, String str) {
        try {
            String encodeToString = Base64.encodeToString(str.getBytes(HTTP.UTF_8), 2);
            C4384jc jcVar = new C4384jc(faVar, activity);
            f12928c = jcVar;
            C4252Ia.m16867a((Runnable) new C4354cc(jcVar, activity, encodeToString));
        } catch (UnsupportedEncodingException e) {
            C4306Xa.m17136a(C4306Xa.C4316j.ERROR, "Catch on initInAppMessage: ", (Throwable) e);
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    private static int m17404c(Activity activity) {
        return C4256Ja.m16902a(activity) - (f12927b * 2);
    }

    /* renamed from: c */
    private static void m17406c() {
        if (Build.VERSION.SDK_INT >= 19 && C4306Xa.m17145a(C4306Xa.C4316j.DEBUG)) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m17408d(Activity activity) {
        this.f12929d.layout(0, 0, m17399b(activity), m17404c(activity));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12462a(Activity activity) {
        this.f12931f = activity;
        if (this.f12933h) {
            m17397a((Integer) null);
        } else {
            m17402b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12463a(WeakReference<Activity> weakReference) {
        C4250I i = this.f12930e;
        if (i != null) {
            i.mo12308a(weakReference);
        }
    }
}
