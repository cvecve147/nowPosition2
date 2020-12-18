package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.ads.internal.C1806va;
import com.google.android.gms.ads.internal.overlay.C1771c;
import com.google.android.gms.common.util.C2092n;

@TargetApi(11)
@C2478La
/* renamed from: com.google.android.gms.internal.ads.mh */
public final class C3292mh extends WebChromeClient {

    /* renamed from: a */
    private final C3520uh f9792a;

    public C3292mh(C3520uh uhVar) {
        this.f9792a = uhVar;
    }

    /* renamed from: a */
    private static Context m13085a(WebView webView) {
        if (!(webView instanceof C3520uh)) {
            return webView.getContext();
        }
        C3520uh uhVar = (C3520uh) webView;
        Activity eb = uhVar.mo8163eb();
        return eb != null ? eb : uhVar.getContext();
    }

    /* renamed from: a */
    private final boolean m13086a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        AlertDialog create;
        C1806va i;
        try {
            if (this.f9792a == null || this.f9792a.mo8182mb() == null || this.f9792a.mo8182mb().mo9241i() == null || (i = this.f9792a.mo8182mb().mo9241i()) == null || i.mo7033b()) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle(str2);
                if (z) {
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(context);
                    textView.setText(str3);
                    EditText editText = new EditText(context);
                    editText.setText(str4);
                    linearLayout.addView(textView);
                    linearLayout.addView(editText);
                    create = builder.setView(linearLayout).setPositiveButton(17039370, new C3463sh(jsPromptResult, editText)).setNegativeButton(17039360, new C3434rh(jsPromptResult)).setOnCancelListener(new C3406qh(jsPromptResult)).create();
                } else {
                    create = builder.setMessage(str3).setPositiveButton(17039370, new C3377ph(jsResult)).setNegativeButton(17039360, new C3349oh(jsResult)).setOnCancelListener(new C3320nh(jsResult)).create();
                }
                create.show();
                return true;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(str3).length());
            sb.append("window.");
            sb.append(str);
            sb.append("('");
            sb.append(str3);
            sb.append("')");
            i.mo7032a(sb.toString());
            return false;
        } catch (WindowManager.BadTokenException e) {
            C2227Cf.m9535c("Fail to display Dialog.", e);
        }
    }

    public final void onCloseWindow(WebView webView) {
        String str;
        if (!(webView instanceof C3520uh)) {
            str = "Tried to close a WebView that wasn't an AdWebView.";
        } else {
            C1771c Ya = ((C3520uh) webView).mo8137Ya();
            if (Ya == null) {
                str = "Tried to close an AdWebView not associated with an overlay.";
            } else {
                Ya.mo6994bc();
                return;
            }
        }
        C2227Cf.m9536d(str);
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        int lineNumber = consoleMessage.lineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 19 + String.valueOf(sourceId).length());
        sb.append("JS: ");
        sb.append(message);
        sb.append(" (");
        sb.append(sourceId);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(")");
        String sb2 = sb.toString();
        if (sb2.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = C3491th.f10256a[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            C2227Cf.m9529a(sb2);
        } else if (i == 2) {
            C2227Cf.m9536d(sb2);
        } else if (i == 3 || i == 4 || i != 5) {
            C2227Cf.m9534c(sb2);
        } else {
            C2227Cf.m9532b(sb2);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.f9792a.mo8187ob() != null) {
            webView2.setWebViewClient(this.f9792a.mo8187ob());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j != 0) {
            if (j2 == 0) {
                j = Math.min(j + Math.min(131072, j4), 1048576);
            } else if (j2 <= Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        } else if (j2 > j4 || j2 > 1048576) {
            j2 = 0;
        }
        quotaUpdater.updateQuota(j2);
    }

    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z;
        if (callback != null) {
            C1697X.m7698e();
            if (!C3114ge.m12418a(this.f9792a.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                C1697X.m7698e();
                if (!C3114ge.m12418a(this.f9792a.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z = false;
                    callback.invoke(str, z, true);
                }
            }
            z = true;
            callback.invoke(str, z, true);
        }
    }

    public final void onHideCustomView() {
        C1771c Ya = this.f9792a.mo8137Ya();
        if (Ya == null) {
            C2227Cf.m9536d("Could not get ad overlay when hiding custom view.");
        } else {
            Ya.mo6995cc();
        }
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return m13086a(m13085a(webView), "alert", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return m13086a(m13085a(webView), "onBeforeUnload", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return m13086a(m13085a(webView), "confirm", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return m13086a(m13085a(webView), "prompt", str, str2, str3, (JsResult) null, jsPromptResult, true);
    }

    @TargetApi(21)
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        if (C2092n.m9168i()) {
            if (!((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7859ab)).booleanValue()) {
                C3520uh uhVar = this.f9792a;
                if (uhVar == null || uhVar.mo8182mb() == null || this.f9792a.mo8182mb().mo9240h() == null) {
                    super.onPermissionRequest(permissionRequest);
                    return;
                }
                String[] a = this.f9792a.mo8182mb().mo9240h().mo9374a(permissionRequest.getResources());
                if (a.length > 0) {
                    permissionRequest.grant(a);
                    return;
                } else {
                    permissionRequest.deny();
                    return;
                }
            }
        }
        super.onPermissionRequest(permissionRequest);
    }

    public final void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
        long j3 = j + 131072;
        if (5242880 - j2 < j3) {
            quotaUpdater.updateQuota(0);
        } else {
            quotaUpdater.updateQuota(j3);
        }
    }

    @Deprecated
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        C1771c Ya = this.f9792a.mo8137Ya();
        if (Ya == null) {
            C2227Cf.m9536d("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        Ya.mo6992a(view, customViewCallback);
        Ya.setRequestedOrientation(i);
    }

    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
