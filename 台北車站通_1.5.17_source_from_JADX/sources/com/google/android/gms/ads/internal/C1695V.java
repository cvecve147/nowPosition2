package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.C2209Bp;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C2558Nu;
import com.google.android.gms.internal.ads.C3390pt;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.ads.internal.V */
final class C1695V extends AsyncTask<Void, Void, String> {

    /* renamed from: a */
    private final /* synthetic */ C1691Q f5556a;

    private C1695V(C1691Q q) {
        this.f5556a = q;
    }

    /* synthetic */ C1695V(C1691Q q, C1692S s) {
        this(q);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final String doInBackground(Void... voidArr) {
        try {
            C2209Bp unused = this.f5556a.f5551h = (C2209Bp) this.f5556a.f5546c.get(((Long) C3390pt.m13458f().mo8515a(C2558Nu.f8005yd)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            C2227Cf.m9535c("", e);
        }
        return this.f5556a.mo6813bc();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        if (this.f5556a.f5549f != null && str != null) {
            this.f5556a.f5549f.loadUrl(str);
        }
    }
}
