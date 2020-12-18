package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.ads.p066b.C1636a;
import java.util.Map;
import org.apache.http.HttpHeaders;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.g */
public final class C3108g extends C3311n {

    /* renamed from: c */
    private final Map<String, String> f9347c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Context f9348d;

    public C3108g(C3520uh uhVar, Map<String, String> map) {
        super(uhVar, "storePicture");
        this.f9347c = map;
        this.f9348d = uhVar.mo8163eb();
    }

    /* renamed from: a */
    public final void mo9444a() {
        if (this.f9348d == null) {
            mo9766a("Activity context is not available");
            return;
        }
        C1697X.m7698e();
        if (!C3114ge.m12439f(this.f9348d).mo10258c()) {
            mo9766a("Feature is not supported by the device.");
            return;
        }
        String str = this.f9347c.get("iurl");
        if (TextUtils.isEmpty(str)) {
            mo9766a("Image url cannot be empty.");
        } else if (!URLUtil.isValidUrl(str)) {
            String valueOf = String.valueOf(str);
            mo9766a(valueOf.length() != 0 ? "Invalid image url: ".concat(valueOf) : new String("Invalid image url: "));
        } else {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            C1697X.m7698e();
            if (!C3114ge.m12431c(lastPathSegment)) {
                String valueOf2 = String.valueOf(lastPathSegment);
                mo9766a(valueOf2.length() != 0 ? "Image type not recognized: ".concat(valueOf2) : new String("Image type not recognized: "));
                return;
            }
            Resources b = C1697X.m7702i().mo8321b();
            C1697X.m7698e();
            AlertDialog.Builder e = C3114ge.m12435e(this.f9348d);
            e.setTitle(b != null ? b.getString(C1636a.f5449s1) : "Save image");
            e.setMessage(b != null ? b.getString(C1636a.f5450s2) : "Allow Ad to store image in Picture gallery?");
            e.setPositiveButton(b != null ? b.getString(C1636a.f5451s3) : HttpHeaders.ACCEPT, new C3136h(this, str, lastPathSegment));
            e.setNegativeButton(b != null ? b.getString(C1636a.f5452s4) : "Decline", new C3164i(this));
            e.create().show();
        }
    }
}
