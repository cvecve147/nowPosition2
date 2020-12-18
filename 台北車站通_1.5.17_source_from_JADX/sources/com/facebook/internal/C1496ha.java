package com.facebook.internal;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.AccessToken;
import com.facebook.C1363T;
import com.facebook.C1366W;
import com.facebook.C1573o;
import com.facebook.C1574p;
import com.facebook.C1576r;
import com.facebook.C1601x;
import com.facebook.GraphRequest;
import com.facebook.share.internal.C1585g;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;

/* renamed from: com.facebook.internal.ha */
public class C1496ha extends Dialog {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f5148a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f5149b;

    /* renamed from: c */
    private C1499c f5150c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public WebView f5151d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ProgressDialog f5152e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ImageView f5153f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public FrameLayout f5154g;

    /* renamed from: h */
    private C1500d f5155h;

    /* renamed from: i */
    private boolean f5156i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f5157j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f5158k;

    /* renamed from: com.facebook.internal.ha$a */
    public static class C1497a {

        /* renamed from: a */
        private Context f5159a;

        /* renamed from: b */
        private String f5160b;

        /* renamed from: c */
        private String f5161c;

        /* renamed from: d */
        private int f5162d;

        /* renamed from: e */
        private C1499c f5163e;

        /* renamed from: f */
        private Bundle f5164f;

        /* renamed from: g */
        private AccessToken f5165g;

        public C1497a(Context context, String str, Bundle bundle) {
            this.f5165g = AccessToken.m6460b();
            if (this.f5165g == null) {
                String c = C1480ba.m6960c(context);
                if (c != null) {
                    this.f5160b = c;
                } else {
                    throw new C1574p("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
            }
            m7025a(context, str, bundle);
        }

        public C1497a(Context context, String str, String str2, Bundle bundle) {
            str = str == null ? C1480ba.m6960c(context) : str;
            C1484ca.m6977a(str, "applicationId");
            this.f5160b = str;
            m7025a(context, str2, bundle);
        }

        /* renamed from: a */
        private void m7025a(Context context, String str, Bundle bundle) {
            this.f5159a = context;
            this.f5161c = str;
            if (bundle != null) {
                this.f5164f = bundle;
            } else {
                this.f5164f = new Bundle();
            }
        }

        /* renamed from: a */
        public C1497a mo6212a(C1499c cVar) {
            this.f5163e = cVar;
            return this;
        }

        /* renamed from: a */
        public C1496ha mo6213a() {
            AccessToken accessToken = this.f5165g;
            if (accessToken != null) {
                this.f5164f.putString("app_id", accessToken.mo5886a());
                this.f5164f.putString("access_token", this.f5165g.mo5894h());
            } else {
                this.f5164f.putString("app_id", this.f5160b);
            }
            return new C1496ha(this.f5159a, this.f5161c, this.f5164f, this.f5162d, this.f5163e);
        }

        /* renamed from: b */
        public String mo6214b() {
            return this.f5160b;
        }

        /* renamed from: c */
        public Context mo6215c() {
            return this.f5159a;
        }

        /* renamed from: d */
        public C1499c mo6216d() {
            return this.f5163e;
        }

        /* renamed from: e */
        public Bundle mo6217e() {
            return this.f5164f;
        }

        /* renamed from: f */
        public int mo6218f() {
            return this.f5162d;
        }
    }

    /* renamed from: com.facebook.internal.ha$b */
    private class C1498b extends WebViewClient {
        private C1498b() {
        }

        /* synthetic */ C1498b(C1496ha haVar, C1488da daVar) {
            this();
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!C1496ha.this.f5157j) {
                C1496ha.this.f5152e.dismiss();
            }
            C1496ha.this.f5154g.setBackgroundColor(0);
            C1496ha.this.f5151d.setVisibility(0);
            C1496ha.this.f5153f.setVisibility(0);
            boolean unused = C1496ha.this.f5158k = true;
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            C1480ba.m6943a("FacebookSDK.WebDialog", "Webview loading URL: " + str);
            super.onPageStarted(webView, str, bitmap);
            if (!C1496ha.this.f5157j) {
                C1496ha.this.f5152e.show();
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            C1496ha.this.mo6199a((Throwable) new C1573o(str, i, str2));
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslErrorHandler.cancel();
            C1496ha.this.mo6199a((Throwable) new C1573o((String) null, -11, (String) null));
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x008b  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0091  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean shouldOverrideUrlLoading(android.webkit.WebView r6, java.lang.String r7) {
            /*
                r5 = this;
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r0 = "Redirect URL: "
                r6.append(r0)
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                java.lang.String r0 = "FacebookSDK.WebDialog"
                com.facebook.internal.C1480ba.m6943a((java.lang.String) r0, (java.lang.String) r6)
                com.facebook.internal.ha r6 = com.facebook.internal.C1496ha.this
                java.lang.String r6 = r6.f5149b
                boolean r6 = r7.startsWith(r6)
                r0 = 1
                if (r6 == 0) goto L_0x00a1
                com.facebook.internal.ha r6 = com.facebook.internal.C1496ha.this
                android.os.Bundle r6 = r6.mo6195a((java.lang.String) r7)
                java.lang.String r7 = "error"
                java.lang.String r7 = r6.getString(r7)
                if (r7 != 0) goto L_0x0037
                java.lang.String r7 = "error_type"
                java.lang.String r7 = r6.getString(r7)
            L_0x0037:
                java.lang.String r1 = "error_msg"
                java.lang.String r1 = r6.getString(r1)
                if (r1 != 0) goto L_0x0045
                java.lang.String r1 = "error_message"
                java.lang.String r1 = r6.getString(r1)
            L_0x0045:
                if (r1 != 0) goto L_0x004d
                java.lang.String r1 = "error_description"
                java.lang.String r1 = r6.getString(r1)
            L_0x004d:
                java.lang.String r2 = "error_code"
                java.lang.String r2 = r6.getString(r2)
                boolean r3 = com.facebook.internal.C1480ba.m6958b((java.lang.String) r2)
                r4 = -1
                if (r3 != 0) goto L_0x005f
                int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x005f }
                goto L_0x0060
            L_0x005f:
                r2 = r4
            L_0x0060:
                boolean r3 = com.facebook.internal.C1480ba.m6958b((java.lang.String) r7)
                if (r3 == 0) goto L_0x0074
                boolean r3 = com.facebook.internal.C1480ba.m6958b((java.lang.String) r1)
                if (r3 == 0) goto L_0x0074
                if (r2 != r4) goto L_0x0074
                com.facebook.internal.ha r7 = com.facebook.internal.C1496ha.this
                r7.mo6197a((android.os.Bundle) r6)
                goto L_0x00a0
            L_0x0074:
                if (r7 == 0) goto L_0x0087
                java.lang.String r6 = "access_denied"
                boolean r6 = r7.equals(r6)
                if (r6 != 0) goto L_0x008b
                java.lang.String r6 = "OAuthAccessDeniedException"
                boolean r6 = r7.equals(r6)
                if (r6 == 0) goto L_0x0087
                goto L_0x008b
            L_0x0087:
                r6 = 4201(0x1069, float:5.887E-42)
                if (r2 != r6) goto L_0x0091
            L_0x008b:
                com.facebook.internal.ha r6 = com.facebook.internal.C1496ha.this
                r6.cancel()
                goto L_0x00a0
            L_0x0091:
                com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
                r6.<init>(r2, r7, r1)
                com.facebook.internal.ha r7 = com.facebook.internal.C1496ha.this
                com.facebook.z r2 = new com.facebook.z
                r2.<init>(r6, r1)
                r7.mo6199a((java.lang.Throwable) r2)
            L_0x00a0:
                return r0
            L_0x00a1:
                java.lang.String r6 = "fbconnect://cancel"
                boolean r6 = r7.startsWith(r6)
                if (r6 == 0) goto L_0x00af
                com.facebook.internal.ha r6 = com.facebook.internal.C1496ha.this
                r6.cancel()
                return r0
            L_0x00af:
                java.lang.String r6 = "touch"
                boolean r6 = r7.contains(r6)
                r1 = 0
                if (r6 == 0) goto L_0x00b9
                return r1
            L_0x00b9:
                com.facebook.internal.ha r6 = com.facebook.internal.C1496ha.this     // Catch:{ ActivityNotFoundException -> 0x00ce }
                android.content.Context r6 = r6.getContext()     // Catch:{ ActivityNotFoundException -> 0x00ce }
                android.content.Intent r2 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x00ce }
                java.lang.String r3 = "android.intent.action.VIEW"
                android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ ActivityNotFoundException -> 0x00ce }
                r2.<init>(r3, r7)     // Catch:{ ActivityNotFoundException -> 0x00ce }
                r6.startActivity(r2)     // Catch:{ ActivityNotFoundException -> 0x00ce }
                return r0
            L_0x00ce:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C1496ha.C1498b.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
        }
    }

    /* renamed from: com.facebook.internal.ha$c */
    public interface C1499c {
        /* renamed from: a */
        void mo6224a(Bundle bundle, C1574p pVar);
    }

    /* renamed from: com.facebook.internal.ha$d */
    private class C1500d extends AsyncTask<Void, Void, String[]> {

        /* renamed from: a */
        private String f5167a;

        /* renamed from: b */
        private Bundle f5168b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public Exception[] f5169c;

        C1500d(String str, Bundle bundle) {
            this.f5167a = str;
            this.f5168b = bundle;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String[] strArr) {
            C1496ha.this.f5152e.dismiss();
            for (Exception exc : this.f5169c) {
                if (exc != null) {
                    C1496ha.this.mo6199a((Throwable) exc);
                    return;
                }
            }
            if (strArr == null) {
                C1496ha.this.mo6199a((Throwable) new C1574p("Failed to stage photos for web dialog"));
                return;
            }
            List asList = Arrays.asList(strArr);
            if (asList.contains((Object) null)) {
                C1496ha.this.mo6199a((Throwable) new C1574p("Failed to stage photos for web dialog"));
                return;
            }
            C1480ba.m6949a(this.f5168b, SVGParser.XML_STYLESHEET_ATTR_MEDIA, (Object) new JSONArray(asList));
            String unused = C1496ha.this.f5148a = C1480ba.m6919a(C1472W.m6906b(), C1601x.m7397j() + "/" + "dialog/" + this.f5167a, this.f5168b).toString();
            C1496ha.this.m7007a((C1496ha.this.f5153f.getDrawable().getIntrinsicWidth() / 2) + 1);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String[] doInBackground(Void... voidArr) {
            String[] stringArray = this.f5168b.getStringArray(SVGParser.XML_STYLESHEET_ATTR_MEDIA);
            String[] strArr = new String[stringArray.length];
            this.f5169c = new Exception[stringArray.length];
            CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            AccessToken b = AccessToken.m6460b();
            int i = 0;
            while (i < stringArray.length) {
                try {
                    if (isCancelled()) {
                        Iterator it = concurrentLinkedQueue.iterator();
                        while (it.hasNext()) {
                            ((AsyncTask) it.next()).cancel(true);
                        }
                        return null;
                    }
                    Uri parse = Uri.parse(stringArray[i]);
                    if (C1480ba.m6966d(parse)) {
                        strArr[i] = parse.toString();
                        countDownLatch.countDown();
                    } else {
                        concurrentLinkedQueue.add(C1585g.m7348a(b, parse, (GraphRequest.C1347b) new C1502ia(this, strArr, i, countDownLatch)).mo5956b());
                    }
                    i++;
                } catch (Exception unused) {
                    Iterator it2 = concurrentLinkedQueue.iterator();
                    while (it2.hasNext()) {
                        ((AsyncTask) it2.next()).cancel(true);
                    }
                    return null;
                }
            }
            countDownLatch.await();
            return strArr;
        }
    }

    public C1496ha(Context context, String str) {
        this(context, str, C1601x.m7400m());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1496ha(Context context, String str, int i) {
        super(context, i == 0 ? C1601x.m7400m() : i);
        this.f5149b = "fbconnect://success";
        this.f5156i = false;
        this.f5157j = false;
        this.f5158k = false;
        this.f5148a = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1496ha(Context context, String str, Bundle bundle, int i, C1499c cVar) {
        super(context, i == 0 ? C1601x.m7400m() : i);
        this.f5149b = "fbconnect://success";
        this.f5156i = false;
        this.f5157j = false;
        this.f5158k = false;
        bundle = bundle == null ? new Bundle() : bundle;
        bundle.putString("redirect_uri", "fbconnect://success");
        bundle.putString("display", "touch");
        bundle.putString("sdk", String.format(Locale.ROOT, "android-%s", new Object[]{C1601x.m7399l()}));
        this.f5150c = cVar;
        if (!str.equals("share") || !bundle.containsKey(SVGParser.XML_STYLESHEET_ATTR_MEDIA)) {
            String b = C1472W.m6906b();
            this.f5148a = C1480ba.m6919a(b, C1601x.m7397j() + "/" + "dialog/" + str, bundle).toString();
            return;
        }
        this.f5155h = new C1500d(str, bundle);
    }

    /* renamed from: a */
    private int m7004a(int i, float f, int i2, int i3) {
        int i4 = (int) (((float) i) / f);
        double d = 0.5d;
        if (i4 <= i2) {
            d = 1.0d;
        } else if (i4 < i3) {
            d = 0.5d + ((((double) (i3 - i4)) / ((double) (i3 - i2))) * 0.5d);
        }
        return (int) (((double) i) * d);
    }

    /* access modifiers changed from: private */
    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: a */
    public void m7007a(int i) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f5151d = new C1492fa(this, getContext().getApplicationContext());
        this.f5151d.setVerticalScrollBarEnabled(false);
        this.f5151d.setHorizontalScrollBarEnabled(false);
        this.f5151d.setWebViewClient(new C1498b(this, (C1488da) null));
        this.f5151d.getSettings().setJavaScriptEnabled(true);
        this.f5151d.loadUrl(this.f5148a);
        this.f5151d.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f5151d.setVisibility(4);
        this.f5151d.getSettings().setSavePassword(false);
        this.f5151d.getSettings().setSaveFormData(false);
        this.f5151d.setFocusable(true);
        this.f5151d.setFocusableInTouchMode(true);
        this.f5151d.setOnTouchListener(new C1494ga(this));
        linearLayout.setPadding(i, i, i, i);
        linearLayout.addView(this.f5151d);
        linearLayout.setBackgroundColor(-872415232);
        this.f5154g.addView(linearLayout);
    }

    /* renamed from: e */
    private void m7014e() {
        this.f5153f = new ImageView(getContext());
        this.f5153f.setOnClickListener(new C1490ea(this));
        this.f5153f.setImageDrawable(getContext().getResources().getDrawable(C1363T.com_facebook_close));
        this.f5153f.setVisibility(4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bundle mo6195a(String str) {
        Uri parse = Uri.parse(str);
        Bundle d = C1480ba.m6963d(parse.getQuery());
        d.putAll(C1480ba.m6963d(parse.getFragment()));
        return d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public WebView mo6196a() {
        return this.f5151d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6197a(Bundle bundle) {
        C1499c cVar = this.f5150c;
        if (cVar != null && !this.f5156i) {
            this.f5156i = true;
            cVar.mo6224a(bundle, (C1574p) null);
            dismiss();
        }
    }

    /* renamed from: a */
    public void mo6198a(C1499c cVar) {
        this.f5150c = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6199a(Throwable th) {
        if (this.f5150c != null && !this.f5156i) {
            this.f5156i = true;
            this.f5150c.mo6224a((Bundle) null, th instanceof C1574p ? (C1574p) th : new C1574p(th));
            dismiss();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6200b(String str) {
        this.f5149b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo6201b() {
        return this.f5156i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo6202c() {
        return this.f5158k;
    }

    public void cancel() {
        if (this.f5150c != null && !this.f5156i) {
            mo6199a((Throwable) new C1576r());
        }
    }

    /* renamed from: d */
    public void mo6204d() {
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        if (i >= i2) {
            i = i2;
        }
        int i3 = displayMetrics.widthPixels;
        int i4 = displayMetrics.heightPixels;
        if (i3 < i4) {
            i3 = i4;
        }
        getWindow().setLayout(Math.min(m7004a(i, displayMetrics.density, 480, 800), displayMetrics.widthPixels), Math.min(m7004a(i3, displayMetrics.density, 800, 1280), displayMetrics.heightPixels));
    }

    public void dismiss() {
        ProgressDialog progressDialog;
        WebView webView = this.f5151d;
        if (webView != null) {
            webView.stopLoading();
        }
        if (!this.f5157j && (progressDialog = this.f5152e) != null && progressDialog.isShowing()) {
            this.f5152e.dismiss();
        }
        super.dismiss();
    }

    public void onAttachedToWindow() {
        this.f5157j = false;
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f5152e = new ProgressDialog(getContext());
        this.f5152e.requestWindowFeature(1);
        this.f5152e.setMessage(getContext().getString(C1366W.com_facebook_loading));
        this.f5152e.setCanceledOnTouchOutside(false);
        this.f5152e.setOnCancelListener(new C1488da(this));
        requestWindowFeature(1);
        this.f5154g = new FrameLayout(getContext());
        mo6204d();
        getWindow().setGravity(17);
        getWindow().setSoftInputMode(16);
        m7014e();
        if (this.f5148a != null) {
            m7007a((this.f5153f.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        this.f5154g.addView(this.f5153f, new ViewGroup.LayoutParams(-2, -2));
        setContentView(this.f5154g);
    }

    public void onDetachedFromWindow() {
        this.f5157j = true;
        super.onDetachedFromWindow();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            cancel();
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        C1500d dVar = this.f5155h;
        if (dVar == null || dVar.getStatus() != AsyncTask.Status.PENDING) {
            mo6204d();
            return;
        }
        this.f5155h.execute(new Void[0]);
        this.f5152e.show();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        C1500d dVar = this.f5155h;
        if (dVar != null) {
            dVar.cancel(true);
            this.f5152e.dismiss();
        }
        super.onStop();
    }
}
