package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.measurement.Nc */
public final class C3769Nc {

    /* renamed from: a */
    private static final ConcurrentHashMap<Uri, C3769Nc> f11250a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private static final String[] f11251b = {"key", "value"};

    /* renamed from: c */
    private final ContentResolver f11252c;

    /* renamed from: d */
    private final Uri f11253d;

    /* renamed from: e */
    private final ContentObserver f11254e;

    /* renamed from: f */
    private final Object f11255f = new Object();

    /* renamed from: g */
    private volatile Map<String, String> f11256g;

    /* renamed from: h */
    private final Object f11257h = new Object();

    /* renamed from: i */
    private final List<C3777Pc> f11258i = new ArrayList();

    private C3769Nc(ContentResolver contentResolver, Uri uri) {
        this.f11252c = contentResolver;
        this.f11253d = uri;
        this.f11254e = new C3773Oc(this, (Handler) null);
    }

    /* renamed from: a */
    public static C3769Nc m14992a(ContentResolver contentResolver, Uri uri) {
        C3769Nc nc = f11250a.get(uri);
        if (nc != null) {
            return nc;
        }
        C3769Nc nc2 = new C3769Nc(contentResolver, uri);
        C3769Nc putIfAbsent = f11250a.putIfAbsent(uri, nc2);
        if (putIfAbsent != null) {
            return putIfAbsent;
        }
        nc2.f11252c.registerContentObserver(nc2.f11253d, false, nc2.f11254e);
        return nc2;
    }

    /* renamed from: c */
    private final Map<String, String> m14994c() {
        Cursor query;
        try {
            HashMap hashMap = new HashMap();
            query = this.f11252c.query(this.f11253d, f11251b, (String) null, (String[]) null, (String) null);
            if (query != null) {
                while (query.moveToNext()) {
                    hashMap.put(query.getString(0), query.getString(1));
                }
                query.close();
            }
            return hashMap;
        } catch (SQLiteException | SecurityException unused) {
            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            return null;
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m14995d() {
        synchronized (this.f11257h) {
            for (C3777Pc a : this.f11258i) {
                a.mo10513a();
            }
        }
    }

    /* renamed from: a */
    public final Map<String, String> mo10506a() {
        Map<String, String> c = C3781Qc.m15052a("gms:phenotype:phenotype_flag:debug_disable_caching", false) ? m14994c() : this.f11256g;
        if (c == null) {
            synchronized (this.f11255f) {
                Map<String, String> map = this.f11256g;
                if (map == null) {
                    map = m14994c();
                    this.f11256g = map;
                }
            }
        }
        return c != null ? c : Collections.emptyMap();
    }

    /* renamed from: b */
    public final void mo10507b() {
        synchronized (this.f11255f) {
            this.f11256g = null;
        }
    }
}
