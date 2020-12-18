package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.x */
public class C1524x extends C1496ha {

    /* renamed from: l */
    private static final String f5215l = "com.facebook.internal.x";

    /* renamed from: m */
    private boolean f5216m;

    public C1524x(Context context, String str, String str2) {
        super(context, str);
        mo6200b(str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bundle mo6195a(String str) {
        Bundle d = C1480ba.m6963d(Uri.parse(str).getQuery());
        String string = d.getString("bridge_args");
        d.remove("bridge_args");
        if (!C1480ba.m6958b(string)) {
            try {
                d.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", C1510m.m7058a(new JSONObject(string)));
            } catch (JSONException e) {
                C1480ba.m6944a(f5215l, "Unable to parse bridge_args JSON", (Throwable) e);
            }
        }
        String string2 = d.getString("method_results");
        d.remove("method_results");
        if (!C1480ba.m6958b(string2)) {
            if (C1480ba.m6958b(string2)) {
                string2 = "{}";
            }
            try {
                d.putBundle("com.facebook.platform.protocol.RESULT_ARGS", C1510m.m7058a(new JSONObject(string2)));
            } catch (JSONException e2) {
                C1480ba.m6944a(f5215l, "Unable to parse bridge_args JSON", (Throwable) e2);
            }
        }
        d.remove(ClientCookie.VERSION_ATTR);
        d.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", C1461S.m6871c());
        return d;
    }

    public void cancel() {
        WebView a = mo6196a();
        if (!mo6202c() || mo6201b() || a == null || !a.isShown()) {
            super.cancel();
        } else if (!this.f5216m) {
            this.f5216m = true;
            a.loadUrl("javascript:" + "(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
            new Handler(Looper.getMainLooper()).postDelayed(new C1523w(this), 1500);
        }
    }
}
