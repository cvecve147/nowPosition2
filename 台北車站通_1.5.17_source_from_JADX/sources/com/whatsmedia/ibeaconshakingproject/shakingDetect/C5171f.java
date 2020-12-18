package com.whatsmedia.ibeaconshakingproject.shakingDetect;

import android.os.AsyncTask;
import android.util.Log;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import p101d.p206l.p207a.C6058d;

/* renamed from: com.whatsmedia.ibeaconshakingproject.shakingDetect.f */
public class C5171f extends AsyncTask<String, Void, String> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(String... strArr) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.accumulate("id", strArr[0]);
            String jSONObject2 = jSONObject.toString();
            DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
            HttpPost httpPost = new HttpPost("https://us-central1-taipei-kiosk.cloudfunctions.net/requestInfo");
            httpPost.setEntity(new StringEntity(jSONObject2, HTTP.UTF_8));
            httpPost.setHeader("Content-Type", "application/json");
            httpPost.setHeader(HttpHeaders.ACCEPT_ENCODING, "application/json");
            httpPost.setHeader(HttpHeaders.ACCEPT_LANGUAGE, "en-US");
            HttpResponse execute = defaultHttpClient.execute(httpPost);
            Log.w("QueingSystem", execute.getEntity().toString());
            return EntityUtils.toString(execute.getEntity());
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        super.onPostExecute(str);
        C6058d.m22971e().mo16020a(str);
    }
}
