package com.facebook.p060a;

import android.content.Context;
import android.os.Bundle;
import com.facebook.GraphRequest;
import com.facebook.internal.C1478b;
import com.facebook.internal.C1480ba;
import com.facebook.internal.C1485d;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.protocol.HTTP;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.a.w */
class C1414w {

    /* renamed from: a */
    private List<C1392f> f4959a = new ArrayList();

    /* renamed from: b */
    private List<C1392f> f4960b = new ArrayList();

    /* renamed from: c */
    private int f4961c;

    /* renamed from: d */
    private C1485d f4962d;

    /* renamed from: e */
    private String f4963e;

    /* renamed from: f */
    private final int f4964f = 1000;

    public C1414w(C1485d dVar, String str) {
        this.f4962d = dVar;
        this.f4963e = str;
    }

    /* renamed from: a */
    private void m6729a(GraphRequest graphRequest, Context context, int i, JSONArray jSONArray, boolean z) {
        JSONObject jSONObject;
        try {
            jSONObject = C1478b.m6915a(C1478b.C1479a.CUSTOM_APP_EVENTS, this.f4962d, this.f4963e, z, context);
            if (this.f4961c > 0) {
                jSONObject.put("num_skipped_events", i);
            }
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        graphRequest.mo5954a(jSONObject);
        Bundle h = graphRequest.mo5963h();
        if (h == null) {
            h = new Bundle();
        }
        String jSONArray2 = jSONArray.toString();
        if (jSONArray2 != null) {
            h.putByteArray("custom_events_file", m6730a(jSONArray2));
            graphRequest.mo5958c((Object) jSONArray2);
        }
        graphRequest.mo5951a(h);
    }

    /* renamed from: a */
    private byte[] m6730a(String str) {
        try {
            return str.getBytes(HTTP.UTF_8);
        } catch (UnsupportedEncodingException e) {
            C1480ba.m6942a("Encoding exception: ", (Exception) e);
            return null;
        }
    }

    /* renamed from: a */
    public synchronized int mo6075a() {
        return this.f4959a.size();
    }

    /* renamed from: a */
    public int mo6076a(GraphRequest graphRequest, Context context, boolean z, boolean z2) {
        synchronized (this) {
            int i = this.f4961c;
            this.f4960b.addAll(this.f4959a);
            this.f4959a.clear();
            JSONArray jSONArray = new JSONArray();
            for (C1392f next : this.f4960b) {
                if (!next.mo6053d()) {
                    C1480ba.m6943a("Event with invalid checksum: %s", next.toString());
                } else if (z || !next.mo6050a()) {
                    jSONArray.put(next.mo6051b());
                }
            }
            if (jSONArray.length() == 0) {
                return 0;
            }
            m6729a(graphRequest, context, i, jSONArray, z2);
            return jSONArray.length();
        }
    }

    /* renamed from: a */
    public synchronized void mo6077a(C1392f fVar) {
        if (this.f4959a.size() + this.f4960b.size() >= 1000) {
            this.f4961c++;
        } else {
            this.f4959a.add(fVar);
        }
    }

    /* renamed from: a */
    public synchronized void mo6078a(boolean z) {
        if (z) {
            this.f4959a.addAll(this.f4960b);
        }
        this.f4960b.clear();
        this.f4961c = 0;
    }

    /* renamed from: b */
    public synchronized List<C1392f> mo6079b() {
        List<C1392f> list;
        list = this.f4959a;
        this.f4959a = new ArrayList();
        return list;
    }
}
