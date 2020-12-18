package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import java.net.HttpURLConnection;
import java.util.List;

/* renamed from: com.facebook.F */
public class C1340F extends AsyncTask<Void, Void, List<C1352H>> {

    /* renamed from: a */
    private static final String f4755a = "com.facebook.F";

    /* renamed from: b */
    private final HttpURLConnection f4756b;

    /* renamed from: c */
    private final C1343G f4757c;

    /* renamed from: d */
    private Exception f4758d;

    public C1340F(C1343G g) {
        this((HttpURLConnection) null, g);
    }

    public C1340F(HttpURLConnection httpURLConnection, C1343G g) {
        this.f4757c = g;
        this.f4756b = httpURLConnection;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List<C1352H> doInBackground(Void... voidArr) {
        try {
            return this.f4756b == null ? this.f4757c.mo5926a() : GraphRequest.m6515a(this.f4756b, this.f4757c);
        } catch (Exception e) {
            this.f4758d = e;
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(List<C1352H> list) {
        super.onPostExecute(list);
        Exception exc = this.f4758d;
        if (exc != null) {
            Log.d(f4755a, String.format("onPostExecute: exception encountered during request: %s", new Object[]{exc.getMessage()}));
        }
    }

    /* access modifiers changed from: protected */
    public void onPreExecute() {
        super.onPreExecute();
        if (C1601x.m7401n()) {
            Log.d(f4755a, String.format("execute async task: %s", new Object[]{this}));
        }
        if (this.f4757c.mo5939f() == null) {
            this.f4757c.mo5928a(Thread.currentThread() instanceof HandlerThread ? new Handler() : new Handler(Looper.getMainLooper()));
        }
    }

    public String toString() {
        return "{RequestAsyncTask: " + " connection: " + this.f4756b + ", requests: " + this.f4757c + "}";
    }
}
