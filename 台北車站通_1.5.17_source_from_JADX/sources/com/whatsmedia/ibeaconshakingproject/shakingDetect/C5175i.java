package com.whatsmedia.ibeaconshakingproject.shakingDetect;

import android.net.Uri;
import android.os.AsyncTask;
import p101d.p206l.p207a.C6058d;

/* renamed from: com.whatsmedia.ibeaconshakingproject.shakingDetect.i */
public class C5175i extends AsyncTask<String, Void, String> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(String... strArr) {
        return C5176j.m20025a("https://us-central1-taipei-kiosk.cloudfunctions.net/deviceList", new Uri.Builder().appendQueryParameter("aaa", "bbb"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        super.onPostExecute(str);
        C5169d.m20004a(str);
        C6058d.m22971e().mo16022c();
    }
}
