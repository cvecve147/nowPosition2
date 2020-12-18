package com.google.android.gms.internal.measurement;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C2061y;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.measurement.z */
final class C3920z extends C3835dc {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final String[] f11732d = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final String[] f11733e = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final String[] f11734f = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final String[] f11735g = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final String[] f11736h = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final String[] f11737i = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: j */
    private final C3722C f11738j = new C3722C(this, getContext(), "google_app_measurement.db");
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C3818_b f11739k = new C3818_b(mo10382a());

    C3920z(C3839ec ecVar) {
        super(ecVar);
    }

    /* renamed from: Q */
    private final boolean m15883Q() {
        return getContext().getDatabasePath("google_app_measurement.db").exists();
    }

    /* renamed from: a */
    private final long m15884a(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = mo11051A().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j2 = rawQuery.getLong(0);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return j2;
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return j;
        } catch (SQLiteException e) {
            mo10385b().mo10585y().mo10594a("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    private final Object m15886a(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            mo10385b().mo10585y().mo10592a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i));
            }
            if (type == 3) {
                return cursor.getString(i);
            }
            if (type != 4) {
                mo10385b().mo10585y().mo10593a("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            mo10385b().mo10585y().mo10592a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    /* renamed from: a */
    private static Set<String> m15887a(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
        sb.append("SELECT * FROM ");
        sb.append(str);
        sb.append(" LIMIT 0");
        Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), (String[]) null);
        try {
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    /* renamed from: a */
    private static void m15888a(ContentValues contentValues, String str, Object obj) {
        C2061y.m9076b(str);
        C2061y.m9067a(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    /* renamed from: a */
    static void m15889a(C3801W w, SQLiteDatabase sQLiteDatabase) {
        if (w != null) {
            File file = new File(sQLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                w.mo10576B().mo10592a("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                w.mo10576B().mo10592a("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                w.mo10576B().mo10592a("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                w.mo10576B().mo10592a("Failed to turn on database write permission for owner");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }

    /* renamed from: a */
    static void m15890a(C3801W w, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        if (w != null) {
            if (!m15891a(w, sQLiteDatabase, str)) {
                sQLiteDatabase.execSQL(str2);
            }
            if (w != null) {
                try {
                    Set<String> a = m15887a(sQLiteDatabase, str);
                    String[] split = str3.split(",");
                    int length = split.length;
                    int i = 0;
                    while (i < length) {
                        String str4 = split[i];
                        if (a.remove(str4)) {
                            i++;
                        } else {
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 35 + String.valueOf(str4).length());
                            sb.append("Table ");
                            sb.append(str);
                            sb.append(" is missing required column: ");
                            sb.append(str4);
                            throw new SQLiteException(sb.toString());
                        }
                    }
                    if (strArr != null) {
                        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
                            if (!a.remove(strArr[i2])) {
                                sQLiteDatabase.execSQL(strArr[i2 + 1]);
                            }
                        }
                    }
                    if (!a.isEmpty()) {
                        w.mo10576B().mo10594a("Table has extra columns. table, columns", str, TextUtils.join(", ", a));
                    }
                } catch (SQLiteException e) {
                    w.mo10585y().mo10593a("Failed to verify columns on table that was just created", str);
                    throw e;
                }
            } else {
                throw new IllegalArgumentException("Monitor must not be null");
            }
        } else {
            throw new IllegalArgumentException("Monitor must not be null");
        }
    }

    /* renamed from: a */
    private static boolean m15891a(C3801W w, SQLiteDatabase sQLiteDatabase, String str) {
        if (w != null) {
            Cursor cursor = null;
            try {
                SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
                Cursor query = sQLiteDatabase2.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, (String) null, (String) null, (String) null);
                boolean moveToFirst = query.moveToFirst();
                if (query != null) {
                    query.close();
                }
                return moveToFirst;
            } catch (SQLiteException e) {
                w.mo10576B().mo10594a("Error querying for table", str, e);
                if (cursor != null) {
                    cursor.close();
                }
                return false;
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Monitor must not be null");
        }
    }

    /* renamed from: a */
    private final boolean m15892a(String str, int i, C3887qc qcVar) {
        mo10685v();
        mo10451d();
        C2061y.m9076b(str);
        C2061y.m9067a(qcVar);
        if (TextUtils.isEmpty(qcVar.f11598e)) {
            mo10385b().mo10576B().mo10595a("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", C3801W.m15166a(str), Integer.valueOf(i), String.valueOf(qcVar.f11597d));
            return false;
        }
        try {
            byte[] bArr = new byte[qcVar.mo10758d()];
            C3824b a = C3824b.m15344a(bArr, 0, bArr.length);
            qcVar.mo10405a(a);
            a.mo10662a();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(i));
            contentValues.put("filter_id", qcVar.f11597d);
            contentValues.put("event_name", qcVar.f11598e);
            contentValues.put("data", bArr);
            try {
                if (mo11051A().insertWithOnConflict("event_filters", (String) null, contentValues, 5) != -1) {
                    return true;
                }
                mo10385b().mo10585y().mo10593a("Failed to insert event filter (got -1). appId", C3801W.m15166a(str));
                return true;
            } catch (SQLiteException e) {
                mo10385b().mo10585y().mo10594a("Error storing event filter. appId", C3801W.m15166a(str), e);
                return false;
            }
        } catch (IOException e2) {
            mo10385b().mo10585y().mo10594a("Configuration loss. Failed to serialize event filter. appId", C3801W.m15166a(str), e2);
            return false;
        }
    }

    /* renamed from: a */
    private final boolean m15893a(String str, int i, C3899tc tcVar) {
        mo10685v();
        mo10451d();
        C2061y.m9076b(str);
        C2061y.m9067a(tcVar);
        if (TextUtils.isEmpty(tcVar.f11663e)) {
            mo10385b().mo10576B().mo10595a("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", C3801W.m15166a(str), Integer.valueOf(i), String.valueOf(tcVar.f11662d));
            return false;
        }
        try {
            byte[] bArr = new byte[tcVar.mo10758d()];
            C3824b a = C3824b.m15344a(bArr, 0, bArr.length);
            tcVar.mo10405a(a);
            a.mo10662a();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(i));
            contentValues.put("filter_id", tcVar.f11662d);
            contentValues.put("property_name", tcVar.f11663e);
            contentValues.put("data", bArr);
            try {
                if (mo11051A().insertWithOnConflict("property_filters", (String) null, contentValues, 5) != -1) {
                    return true;
                }
                mo10385b().mo10585y().mo10593a("Failed to insert property filter (got -1). appId", C3801W.m15166a(str));
                return false;
            } catch (SQLiteException e) {
                mo10385b().mo10585y().mo10594a("Error storing property filter. appId", C3801W.m15166a(str), e);
                return false;
            }
        } catch (IOException e2) {
            mo10385b().mo10585y().mo10594a("Configuration loss. Failed to serialize property filter. appId", C3801W.m15166a(str), e2);
            return false;
        }
    }

    /* renamed from: a */
    private final boolean m15894a(String str, List<Integer> list) {
        C2061y.m9076b(str);
        mo10685v();
        mo10451d();
        SQLiteDatabase A = mo11051A();
        try {
            long b = m15895b("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, mo10456r().mo11000b(str, C3758L.f11178L)));
            if (b <= ((long) max)) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                Integer num = list.get(i);
                if (num == null || !(num instanceof Integer)) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String join = TextUtils.join(",", arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 140);
            sb3.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb3.append(sb2);
            sb3.append(" order by rowid desc limit -1 offset ?)");
            return A.delete("audience_filter_values", sb3.toString(), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e) {
            mo10385b().mo10585y().mo10594a("Database error querying filters. appId", C3801W.m15166a(str), e);
            return false;
        }
    }

    /* renamed from: b */
    private final long m15895b(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = mo11051A().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e) {
            mo10385b().mo10585y().mo10594a("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final SQLiteDatabase mo11051A() {
        mo10451d();
        try {
            return this.f11738j.getWritableDatabase();
        } catch (SQLiteException e) {
            mo10385b().mo10576B().mo10593a("Error opening database", e);
            throw e;
        }
    }

    /* renamed from: B */
    public final void mo11052B() {
        mo10685v();
        mo11051A().setTransactionSuccessful();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0041  */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo11053C() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.mo11051A()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0029, all -> 0x0024 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x0022 }
            if (r2 == 0) goto L_0x001c
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x0022 }
            if (r0 == 0) goto L_0x001b
            r0.close()
        L_0x001b:
            return r1
        L_0x001c:
            if (r0 == 0) goto L_0x0021
            r0.close()
        L_0x0021:
            return r1
        L_0x0022:
            r2 = move-exception
            goto L_0x002b
        L_0x0024:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x003f
        L_0x0029:
            r2 = move-exception
            r0 = r1
        L_0x002b:
            com.google.android.gms.internal.measurement.W r3 = r6.mo10385b()     // Catch:{ all -> 0x003e }
            com.google.android.gms.internal.measurement.Y r3 = r3.mo10585y()     // Catch:{ all -> 0x003e }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.mo10593a(r4, r2)     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x003d
            r0.close()
        L_0x003d:
            return r1
        L_0x003e:
            r1 = move-exception
        L_0x003f:
            if (r0 == 0) goto L_0x0044
            r0.close()
        L_0x0044:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3920z.mo11053C():java.lang.String");
    }

    /* renamed from: D */
    public final boolean mo11054D() {
        return m15895b("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final void mo11055E() {
        int delete;
        mo10451d();
        mo10685v();
        if (m15883Q()) {
            long a = mo10455q().f11475i.mo10763a();
            long b = mo10382a().mo7726b();
            if (Math.abs(b - a) > C3758L.f11171E.mo10498a().longValue()) {
                mo10455q().f11475i.mo10764a(b);
                mo10451d();
                mo10685v();
                if (m15883Q() && (delete = mo11051A().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(mo10382a().mo7725a()), String.valueOf(C3908w.m15759u())})) > 0) {
                    mo10385b().mo10580F().mo10593a("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                }
            }
        }
    }

    /* renamed from: F */
    public final long mo11056F() {
        return m15884a("select max(bundle_end_timestamp) from queue", (String[]) null, 0);
    }

    /* renamed from: G */
    public final long mo11057G() {
        return m15884a("select max(timestamp) from raw_events", (String[]) null, 0);
    }

    /* renamed from: H */
    public final boolean mo11058H() {
        return m15895b("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    /* renamed from: I */
    public final boolean mo11059I() {
        return m15895b("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    /* renamed from: J */
    public final long mo11060J() {
        Cursor cursor = null;
        try {
            cursor = mo11051A().rawQuery("select rowid from raw_events order by rowid desc limit 1;", (String[]) null);
            if (!cursor.moveToFirst()) {
                if (cursor != null) {
                    cursor.close();
                }
                return -1;
            }
            long j = cursor.getLong(0);
            if (cursor != null) {
                cursor.close();
            }
            return j;
        } catch (SQLiteException e) {
            mo10385b().mo10585y().mo10593a("Error querying raw events", e);
            if (cursor != null) {
                cursor.close();
            }
            return -1;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final long mo11061a(C3725Cc cc) {
        long j;
        mo10451d();
        mo10685v();
        C2061y.m9067a(cc);
        C2061y.m9076b(cc.f11058r);
        try {
            byte[] bArr = new byte[cc.mo10758d()];
            C3824b a = C3824b.m15344a(bArr, 0, bArr.length);
            cc.mo10405a(a);
            a.mo10662a();
            C3871mc o = mo10454o();
            C2061y.m9067a(bArr);
            o.mo10451d();
            MessageDigest a2 = C3871mc.m15512a("MD5");
            if (a2 == null) {
                o.mo10385b().mo10585y().mo10592a("Failed to get MD5");
                j = 0;
            } else {
                j = C3871mc.m15527c(a2.digest(bArr));
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", cc.f11058r);
            contentValues.put("metadata_fingerprint", Long.valueOf(j));
            contentValues.put("metadata", bArr);
            try {
                mo11051A().insertWithOnConflict("raw_events_metadata", (String) null, contentValues, 4);
                return j;
            } catch (SQLiteException e) {
                mo10385b().mo10585y().mo10594a("Error storing raw event metadata. appId", C3801W.m15166a(cc.f11058r), e);
                throw e;
            }
        } catch (IOException e2) {
            mo10385b().mo10585y().mo10594a("Data loss. Failed to serialize event metadata. appId", C3801W.m15166a(cc.f11058r), e2);
            throw e2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair<com.google.android.gms.internal.measurement.C3923zc, java.lang.Long> mo11062a(java.lang.String r8, java.lang.Long r9) {
        /*
            r7 = this;
            r7.mo10451d()
            r7.mo10685v()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.mo11051A()     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            r4 = 0
            r3[r4] = r8     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            r6 = 1
            r3[r6] = r5     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0072 }
            if (r2 != 0) goto L_0x0037
            com.google.android.gms.internal.measurement.W r8 = r7.mo10385b()     // Catch:{ SQLiteException -> 0x0072 }
            com.google.android.gms.internal.measurement.Y r8 = r8.mo10580F()     // Catch:{ SQLiteException -> 0x0072 }
            java.lang.String r9 = "Main event not found"
            r8.mo10592a(r9)     // Catch:{ SQLiteException -> 0x0072 }
            if (r1 == 0) goto L_0x0036
            r1.close()
        L_0x0036:
            return r0
        L_0x0037:
            byte[] r2 = r1.getBlob(r4)     // Catch:{ SQLiteException -> 0x0072 }
            long r5 = r1.getLong(r6)     // Catch:{ SQLiteException -> 0x0072 }
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch:{ SQLiteException -> 0x0072 }
            int r5 = r2.length     // Catch:{ SQLiteException -> 0x0072 }
            com.google.android.gms.internal.measurement.a r2 = com.google.android.gms.internal.measurement.C3820a.m15286a(r2, r4, r5)     // Catch:{ SQLiteException -> 0x0072 }
            com.google.android.gms.internal.measurement.zc r4 = new com.google.android.gms.internal.measurement.zc     // Catch:{ SQLiteException -> 0x0072 }
            r4.<init>()     // Catch:{ SQLiteException -> 0x0072 }
            r4.mo10404a((com.google.android.gms.internal.measurement.C3820a) r2)     // Catch:{ IOException -> 0x005a }
            android.util.Pair r8 = android.util.Pair.create(r4, r3)     // Catch:{ SQLiteException -> 0x0072 }
            if (r1 == 0) goto L_0x0059
            r1.close()
        L_0x0059:
            return r8
        L_0x005a:
            r2 = move-exception
            com.google.android.gms.internal.measurement.W r3 = r7.mo10385b()     // Catch:{ SQLiteException -> 0x0072 }
            com.google.android.gms.internal.measurement.Y r3 = r3.mo10585y()     // Catch:{ SQLiteException -> 0x0072 }
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r8)     // Catch:{ SQLiteException -> 0x0072 }
            r3.mo10595a(r4, r8, r9, r2)     // Catch:{ SQLiteException -> 0x0072 }
            if (r1 == 0) goto L_0x0071
            r1.close()
        L_0x0071:
            return r0
        L_0x0072:
            r8 = move-exception
            goto L_0x0079
        L_0x0074:
            r8 = move-exception
            r1 = r0
            goto L_0x008d
        L_0x0077:
            r8 = move-exception
            r1 = r0
        L_0x0079:
            com.google.android.gms.internal.measurement.W r9 = r7.mo10385b()     // Catch:{ all -> 0x008c }
            com.google.android.gms.internal.measurement.Y r9 = r9.mo10585y()     // Catch:{ all -> 0x008c }
            java.lang.String r2 = "Error selecting main event"
            r9.mo10593a(r2, r8)     // Catch:{ all -> 0x008c }
            if (r1 == 0) goto L_0x008b
            r1.close()
        L_0x008b:
            return r0
        L_0x008c:
            r8 = move-exception
        L_0x008d:
            if (r1 == 0) goto L_0x0092
            r1.close()
        L_0x0092:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3920z.mo11062a(java.lang.String, java.lang.Long):android.util.Pair");
    }

    /* renamed from: a */
    public final C3714A mo11063a(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C2061y.m9076b(str);
        mo10451d();
        mo10685v();
        String[] strArr = {str};
        C3714A a = new C3714A();
        Cursor cursor = null;
        try {
            SQLiteDatabase A = mo11051A();
            cursor = A.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                mo10385b().mo10576B().mo10593a("Not updating daily counts, app is not known. appId", C3801W.m15166a(str));
                if (cursor != null) {
                    cursor.close();
                }
                return a;
            }
            if (cursor.getLong(0) == j) {
                a.f10981b = cursor.getLong(1);
                a.f10980a = cursor.getLong(2);
                a.f10982c = cursor.getLong(3);
                a.f10983d = cursor.getLong(4);
                a.f10984e = cursor.getLong(5);
            }
            if (z) {
                a.f10981b++;
            }
            if (z2) {
                a.f10980a++;
            }
            if (z3) {
                a.f10982c++;
            }
            if (z4) {
                a.f10983d++;
            }
            if (z5) {
                a.f10984e++;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("day", Long.valueOf(j));
            contentValues.put("daily_public_events_count", Long.valueOf(a.f10980a));
            contentValues.put("daily_events_count", Long.valueOf(a.f10981b));
            contentValues.put("daily_conversions_count", Long.valueOf(a.f10982c));
            contentValues.put("daily_error_events_count", Long.valueOf(a.f10983d));
            contentValues.put("daily_realtime_events_count", Long.valueOf(a.f10984e));
            A.update("apps", contentValues, "app_id=?", strArr);
            if (cursor != null) {
                cursor.close();
            }
            return a;
        } catch (SQLiteException e) {
            mo10385b().mo10585y().mo10594a("Error updating daily counts. appId", C3801W.m15166a(str), e);
            if (cursor != null) {
                cursor.close();
            }
            return a;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo11064a(long r5) {
        /*
            r4 = this;
            r4.mo10451d()
            r4.mo10685v()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.mo11051A()     // Catch:{ SQLiteException -> 0x0043, all -> 0x0040 }
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0043, all -> 0x0040 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x0043, all -> 0x0040 }
            r6 = 0
            r3[r6] = r5     // Catch:{ SQLiteException -> 0x0043, all -> 0x0040 }
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x0043, all -> 0x0040 }
            boolean r1 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x003e }
            if (r1 != 0) goto L_0x0034
            com.google.android.gms.internal.measurement.W r6 = r4.mo10385b()     // Catch:{ SQLiteException -> 0x003e }
            com.google.android.gms.internal.measurement.Y r6 = r6.mo10580F()     // Catch:{ SQLiteException -> 0x003e }
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.mo10592a(r1)     // Catch:{ SQLiteException -> 0x003e }
            if (r5 == 0) goto L_0x0033
            r5.close()
        L_0x0033:
            return r0
        L_0x0034:
            java.lang.String r6 = r5.getString(r6)     // Catch:{ SQLiteException -> 0x003e }
            if (r5 == 0) goto L_0x003d
            r5.close()
        L_0x003d:
            return r6
        L_0x003e:
            r6 = move-exception
            goto L_0x0045
        L_0x0040:
            r6 = move-exception
            r5 = r0
            goto L_0x0059
        L_0x0043:
            r6 = move-exception
            r5 = r0
        L_0x0045:
            com.google.android.gms.internal.measurement.W r1 = r4.mo10385b()     // Catch:{ all -> 0x0058 }
            com.google.android.gms.internal.measurement.Y r1 = r1.mo10585y()     // Catch:{ all -> 0x0058 }
            java.lang.String r2 = "Error selecting expired configs"
            r1.mo10593a(r2, r6)     // Catch:{ all -> 0x0058 }
            if (r5 == 0) goto L_0x0057
            r5.close()
        L_0x0057:
            return r0
        L_0x0058:
            r6 = move-exception
        L_0x0059:
            if (r5 == 0) goto L_0x005e
            r5.close()
        L_0x005e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3920z.mo11064a(long):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.internal.measurement.C3867lc> mo11065a(java.lang.String r14) {
        /*
            r13 = this;
            com.google.android.gms.common.internal.C2061y.m9076b((java.lang.String) r14)
            r13.mo10451d()
            r13.mo10685v()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r13.mo11051A()     // Catch:{ SQLiteException -> 0x0085, all -> 0x0082 }
            java.lang.String r3 = "user_attributes"
            java.lang.String r4 = "name"
            java.lang.String r5 = "origin"
            java.lang.String r6 = "set_timestamp"
            java.lang.String r7 = "value"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7}     // Catch:{ SQLiteException -> 0x0085, all -> 0x0082 }
            java.lang.String r5 = "app_id=?"
            r11 = 1
            java.lang.String[] r6 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x0085, all -> 0x0082 }
            r12 = 0
            r6[r12] = r14     // Catch:{ SQLiteException -> 0x0085, all -> 0x0082 }
            r7 = 0
            r8 = 0
            java.lang.String r9 = "rowid"
            java.lang.String r10 = "1000"
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x0085, all -> 0x0082 }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0080 }
            if (r3 != 0) goto L_0x003f
            if (r2 == 0) goto L_0x003e
            r2.close()
        L_0x003e:
            return r0
        L_0x003f:
            java.lang.String r7 = r2.getString(r12)     // Catch:{ SQLiteException -> 0x0080 }
            java.lang.String r3 = r2.getString(r11)     // Catch:{ SQLiteException -> 0x0080 }
            if (r3 != 0) goto L_0x004b
            java.lang.String r3 = ""
        L_0x004b:
            r6 = r3
            r3 = 2
            long r8 = r2.getLong(r3)     // Catch:{ SQLiteException -> 0x0080 }
            r3 = 3
            java.lang.Object r10 = r13.m15886a((android.database.Cursor) r2, (int) r3)     // Catch:{ SQLiteException -> 0x0080 }
            if (r10 != 0) goto L_0x006a
            com.google.android.gms.internal.measurement.W r3 = r13.mo10385b()     // Catch:{ SQLiteException -> 0x0080 }
            com.google.android.gms.internal.measurement.Y r3 = r3.mo10585y()     // Catch:{ SQLiteException -> 0x0080 }
            java.lang.String r4 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r14)     // Catch:{ SQLiteException -> 0x0080 }
            r3.mo10593a(r4, r5)     // Catch:{ SQLiteException -> 0x0080 }
            goto L_0x0074
        L_0x006a:
            com.google.android.gms.internal.measurement.lc r3 = new com.google.android.gms.internal.measurement.lc     // Catch:{ SQLiteException -> 0x0080 }
            r4 = r3
            r5 = r14
            r4.<init>(r5, r6, r7, r8, r10)     // Catch:{ SQLiteException -> 0x0080 }
            r0.add(r3)     // Catch:{ SQLiteException -> 0x0080 }
        L_0x0074:
            boolean r3 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0080 }
            if (r3 != 0) goto L_0x003f
            if (r2 == 0) goto L_0x007f
            r2.close()
        L_0x007f:
            return r0
        L_0x0080:
            r0 = move-exception
            goto L_0x0087
        L_0x0082:
            r14 = move-exception
            r2 = r1
            goto L_0x009f
        L_0x0085:
            r0 = move-exception
            r2 = r1
        L_0x0087:
            com.google.android.gms.internal.measurement.W r3 = r13.mo10385b()     // Catch:{ all -> 0x009e }
            com.google.android.gms.internal.measurement.Y r3 = r3.mo10585y()     // Catch:{ all -> 0x009e }
            java.lang.String r4 = "Error querying user properties. appId"
            java.lang.Object r14 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r14)     // Catch:{ all -> 0x009e }
            r3.mo10594a(r4, r14, r0)     // Catch:{ all -> 0x009e }
            if (r2 == 0) goto L_0x009d
            r2.close()
        L_0x009d:
            return r1
        L_0x009e:
            r14 = move-exception
        L_0x009f:
            if (r2 == 0) goto L_0x00a4
            r2.close()
        L_0x00a4:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3920z.mo11065a(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c3 A[LOOP:0: B:18:0x0054->B:42:0x00c3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c5 A[EDGE_INSN: B:56:0x00c5->B:43:0x00c5 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<android.util.Pair<com.google.android.gms.internal.measurement.C3725Cc, java.lang.Long>> mo11066a(java.lang.String r13, int r14, int r15) {
        /*
            r12 = this;
            r12.mo10451d()
            r12.mo10685v()
            r0 = 1
            r1 = 0
            if (r14 <= 0) goto L_0x000c
            r2 = r0
            goto L_0x000d
        L_0x000c:
            r2 = r1
        L_0x000d:
            com.google.android.gms.common.internal.C2061y.m9073a((boolean) r2)
            if (r15 <= 0) goto L_0x0014
            r2 = r0
            goto L_0x0015
        L_0x0014:
            r2 = r1
        L_0x0015:
            com.google.android.gms.common.internal.C2061y.m9073a((boolean) r2)
            com.google.android.gms.common.internal.C2061y.m9076b((java.lang.String) r13)
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r12.mo11051A()     // Catch:{ SQLiteException -> 0x00cd }
            java.lang.String r4 = "queue"
            java.lang.String r5 = "rowid"
            java.lang.String r6 = "data"
            java.lang.String r7 = "retry_count"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7}     // Catch:{ SQLiteException -> 0x00cd }
            java.lang.String r6 = "app_id=?"
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x00cd }
            r7[r1] = r13     // Catch:{ SQLiteException -> 0x00cd }
            r8 = 0
            r9 = 0
            java.lang.String r10 = "rowid"
            java.lang.String r11 = java.lang.String.valueOf(r14)     // Catch:{ SQLiteException -> 0x00cd }
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x00cd }
            boolean r14 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x00cd }
            if (r14 != 0) goto L_0x004e
            java.util.List r13 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x00cd }
            if (r2 == 0) goto L_0x004d
            r2.close()
        L_0x004d:
            return r13
        L_0x004e:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00cd }
            r14.<init>()     // Catch:{ SQLiteException -> 0x00cd }
            r3 = r1
        L_0x0054:
            long r4 = r2.getLong(r1)     // Catch:{ SQLiteException -> 0x00cd }
            byte[] r6 = r2.getBlob(r0)     // Catch:{ IOException -> 0x00ad }
            com.google.android.gms.internal.measurement.mc r7 = r12.mo10454o()     // Catch:{ IOException -> 0x00ad }
            byte[] r6 = r7.mo10796b((byte[]) r6)     // Catch:{ IOException -> 0x00ad }
            boolean r7 = r14.isEmpty()     // Catch:{ SQLiteException -> 0x00cd }
            if (r7 != 0) goto L_0x006e
            int r7 = r6.length     // Catch:{ SQLiteException -> 0x00cd }
            int r7 = r7 + r3
            if (r7 > r15) goto L_0x00c5
        L_0x006e:
            int r7 = r6.length     // Catch:{ SQLiteException -> 0x00cd }
            com.google.android.gms.internal.measurement.a r7 = com.google.android.gms.internal.measurement.C3820a.m15286a(r6, r1, r7)     // Catch:{ SQLiteException -> 0x00cd }
            com.google.android.gms.internal.measurement.Cc r8 = new com.google.android.gms.internal.measurement.Cc     // Catch:{ SQLiteException -> 0x00cd }
            r8.<init>()     // Catch:{ SQLiteException -> 0x00cd }
            r8.mo10404a((com.google.android.gms.internal.measurement.C3820a) r7)     // Catch:{ IOException -> 0x009a }
            r7 = 2
            boolean r9 = r2.isNull(r7)     // Catch:{ SQLiteException -> 0x00cd }
            if (r9 != 0) goto L_0x008c
            int r7 = r2.getInt(r7)     // Catch:{ SQLiteException -> 0x00cd }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ SQLiteException -> 0x00cd }
            r8.f11043N = r7     // Catch:{ SQLiteException -> 0x00cd }
        L_0x008c:
            int r6 = r6.length     // Catch:{ SQLiteException -> 0x00cd }
            int r3 = r3 + r6
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ SQLiteException -> 0x00cd }
            android.util.Pair r4 = android.util.Pair.create(r8, r4)     // Catch:{ SQLiteException -> 0x00cd }
            r14.add(r4)     // Catch:{ SQLiteException -> 0x00cd }
            goto L_0x00bd
        L_0x009a:
            r4 = move-exception
            com.google.android.gms.internal.measurement.W r5 = r12.mo10385b()     // Catch:{ SQLiteException -> 0x00cd }
            com.google.android.gms.internal.measurement.Y r5 = r5.mo10585y()     // Catch:{ SQLiteException -> 0x00cd }
            java.lang.String r6 = "Failed to merge queued bundle. appId"
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r13)     // Catch:{ SQLiteException -> 0x00cd }
        L_0x00a9:
            r5.mo10594a(r6, r7, r4)     // Catch:{ SQLiteException -> 0x00cd }
            goto L_0x00bd
        L_0x00ad:
            r4 = move-exception
            com.google.android.gms.internal.measurement.W r5 = r12.mo10385b()     // Catch:{ SQLiteException -> 0x00cd }
            com.google.android.gms.internal.measurement.Y r5 = r5.mo10585y()     // Catch:{ SQLiteException -> 0x00cd }
            java.lang.String r6 = "Failed to unzip queued bundle. appId"
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r13)     // Catch:{ SQLiteException -> 0x00cd }
            goto L_0x00a9
        L_0x00bd:
            boolean r4 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x00cd }
            if (r4 == 0) goto L_0x00c5
            if (r3 <= r15) goto L_0x0054
        L_0x00c5:
            if (r2 == 0) goto L_0x00ca
            r2.close()
        L_0x00ca:
            return r14
        L_0x00cb:
            r13 = move-exception
            goto L_0x00e9
        L_0x00cd:
            r14 = move-exception
            com.google.android.gms.internal.measurement.W r15 = r12.mo10385b()     // Catch:{ all -> 0x00cb }
            com.google.android.gms.internal.measurement.Y r15 = r15.mo10585y()     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = "Error querying bundles. appId"
            java.lang.Object r13 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r13)     // Catch:{ all -> 0x00cb }
            r15.mo10594a(r0, r13, r14)     // Catch:{ all -> 0x00cb }
            java.util.List r13 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00cb }
            if (r2 == 0) goto L_0x00e8
            r2.close()
        L_0x00e8:
            return r13
        L_0x00e9:
            if (r2 == 0) goto L_0x00ee
            r2.close()
        L_0x00ee:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3920z.mo11066a(java.lang.String, int, int):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f9, code lost:
        r12 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0100, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0101, code lost:
        r12 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0104, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0105, code lost:
        r12 = r21;
        r11 = r22;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0100 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0127  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.internal.measurement.C3867lc> mo11067a(java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
            r21 = this;
            com.google.android.gms.common.internal.C2061y.m9076b((java.lang.String) r22)
            r21.mo10451d()
            r21.mo10685v()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0104, all -> 0x0100 }
            r3 = 3
            r2.<init>(r3)     // Catch:{ SQLiteException -> 0x0104, all -> 0x0100 }
            r11 = r22
            r2.add(r11)     // Catch:{ SQLiteException -> 0x00fc, all -> 0x0100 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00fc, all -> 0x0100 }
            java.lang.String r5 = "app_id=?"
            r4.<init>(r5)     // Catch:{ SQLiteException -> 0x00fc, all -> 0x0100 }
            boolean r5 = android.text.TextUtils.isEmpty(r23)     // Catch:{ SQLiteException -> 0x00fc, all -> 0x0100 }
            if (r5 != 0) goto L_0x0032
            r5 = r23
            r2.add(r5)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            java.lang.String r6 = " and origin=?"
            r4.append(r6)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            goto L_0x0034
        L_0x0032:
            r5 = r23
        L_0x0034:
            boolean r6 = android.text.TextUtils.isEmpty(r24)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            if (r6 != 0) goto L_0x004c
            java.lang.String r6 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            java.lang.String r7 = "*"
            java.lang.String r6 = r6.concat(r7)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            r2.add(r6)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            java.lang.String r6 = " and name glob ?"
            r4.append(r6)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
        L_0x004c:
            int r6 = r2.size()     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            java.lang.Object[] r2 = r2.toArray(r6)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            r16 = r2
            java.lang.String[] r16 = (java.lang.String[]) r16     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            android.database.sqlite.SQLiteDatabase r12 = r21.mo11051A()     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            java.lang.String r13 = "user_attributes"
            java.lang.String r2 = "name"
            java.lang.String r6 = "set_timestamp"
            java.lang.String r7 = "value"
            java.lang.String r8 = "origin"
            java.lang.String[] r14 = new java.lang.String[]{r2, r6, r7, r8}     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            java.lang.String r15 = r4.toString()     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            r17 = 0
            r18 = 0
            java.lang.String r19 = "rowid"
            java.lang.String r20 = "1001"
            android.database.Cursor r2 = r12.query(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            boolean r4 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            if (r4 != 0) goto L_0x0088
            if (r2 == 0) goto L_0x0087
            r2.close()
        L_0x0087:
            return r0
        L_0x0088:
            int r4 = r0.size()     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            r6 = 1000(0x3e8, float:1.401E-42)
            if (r4 < r6) goto L_0x00a4
            com.google.android.gms.internal.measurement.W r3 = r21.mo10385b()     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            com.google.android.gms.internal.measurement.Y r3 = r3.mo10585y()     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            java.lang.String r4 = "Read more than the max allowed user properties, ignoring excess"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            r3.mo10593a(r4, r6)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            r12 = r21
            goto L_0x00e3
        L_0x00a4:
            r4 = 0
            java.lang.String r7 = r2.getString(r4)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            r4 = 1
            long r8 = r2.getLong(r4)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            r4 = 2
            r12 = r21
            java.lang.Object r10 = r12.m15886a((android.database.Cursor) r2, (int) r4)     // Catch:{ SQLiteException -> 0x00ee }
            java.lang.String r13 = r2.getString(r3)     // Catch:{ SQLiteException -> 0x00ee }
            if (r10 != 0) goto L_0x00cf
            com.google.android.gms.internal.measurement.W r4 = r21.mo10385b()     // Catch:{ SQLiteException -> 0x00eb }
            com.google.android.gms.internal.measurement.Y r4 = r4.mo10585y()     // Catch:{ SQLiteException -> 0x00eb }
            java.lang.String r5 = "(2)Read invalid user property value, ignoring it"
            java.lang.Object r6 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r22)     // Catch:{ SQLiteException -> 0x00eb }
            r14 = r24
            r4.mo10595a(r5, r6, r13, r14)     // Catch:{ SQLiteException -> 0x00eb }
            goto L_0x00dd
        L_0x00cf:
            r14 = r24
            com.google.android.gms.internal.measurement.lc r15 = new com.google.android.gms.internal.measurement.lc     // Catch:{ SQLiteException -> 0x00eb }
            r4 = r15
            r5 = r22
            r6 = r13
            r4.<init>(r5, r6, r7, r8, r10)     // Catch:{ SQLiteException -> 0x00eb }
            r0.add(r15)     // Catch:{ SQLiteException -> 0x00eb }
        L_0x00dd:
            boolean r4 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x00eb }
            if (r4 != 0) goto L_0x00e9
        L_0x00e3:
            if (r2 == 0) goto L_0x00e8
            r2.close()
        L_0x00e8:
            return r0
        L_0x00e9:
            r5 = r13
            goto L_0x0088
        L_0x00eb:
            r0 = move-exception
            r5 = r13
            goto L_0x010c
        L_0x00ee:
            r0 = move-exception
            goto L_0x010c
        L_0x00f0:
            r0 = move-exception
            r12 = r21
            goto L_0x0124
        L_0x00f4:
            r0 = move-exception
            r12 = r21
            goto L_0x010c
        L_0x00f8:
            r0 = move-exception
            r12 = r21
            goto L_0x010b
        L_0x00fc:
            r0 = move-exception
            r12 = r21
            goto L_0x0109
        L_0x0100:
            r0 = move-exception
            r12 = r21
            goto L_0x0125
        L_0x0104:
            r0 = move-exception
            r12 = r21
            r11 = r22
        L_0x0109:
            r5 = r23
        L_0x010b:
            r2 = r1
        L_0x010c:
            com.google.android.gms.internal.measurement.W r3 = r21.mo10385b()     // Catch:{ all -> 0x0123 }
            com.google.android.gms.internal.measurement.Y r3 = r3.mo10585y()     // Catch:{ all -> 0x0123 }
            java.lang.String r4 = "(2)Error querying user properties"
            java.lang.Object r6 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r22)     // Catch:{ all -> 0x0123 }
            r3.mo10595a(r4, r6, r5, r0)     // Catch:{ all -> 0x0123 }
            if (r2 == 0) goto L_0x0122
            r2.close()
        L_0x0122:
            return r1
        L_0x0123:
            r0 = move-exception
        L_0x0124:
            r1 = r2
        L_0x0125:
            if (r1 == 0) goto L_0x012a
            r1.close()
        L_0x012a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3920z.mo11067a(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* renamed from: a */
    public final List<zzed> mo11068a(String str, String[] strArr) {
        mo10451d();
        mo10685v();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = mo11051A().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, (String) null, (String) null, "rowid", "1001");
            if (!cursor.moveToFirst()) {
                if (cursor != null) {
                    cursor.close();
                }
                return arrayList;
            }
            while (true) {
                if (arrayList.size() < 1000) {
                    boolean z = false;
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    String string3 = cursor.getString(2);
                    Object a = m15886a(cursor, 3);
                    if (cursor.getInt(4) != 0) {
                        z = true;
                    }
                    String string4 = cursor.getString(5);
                    long j = cursor.getLong(6);
                    boolean z2 = z;
                    zzed zzed = r3;
                    zzed zzed2 = new zzed(string, string2, new zzjx(string3, cursor.getLong(10), a, string2), cursor.getLong(8), z2, string4, (zzeu) mo10454o().mo10780a(cursor.getBlob(7), zzeu.CREATOR), j, (zzeu) mo10454o().mo10780a(cursor.getBlob(9), zzeu.CREATOR), cursor.getLong(11), (zzeu) mo10454o().mo10780a(cursor.getBlob(12), zzeu.CREATOR));
                    arrayList.add(zzed);
                    if (!cursor.moveToNext()) {
                        break;
                    }
                } else {
                    mo10385b().mo10585y().mo10593a("Read more than the max allowed conditional properties, ignoring extra", 1000);
                    break;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } catch (SQLiteException e) {
            mo10385b().mo10585y().mo10593a("Error querying conditional user property value", e);
            List<zzed> emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo11069a(C3742H h) {
        C2061y.m9067a(h);
        mo10451d();
        mo10685v();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", h.f11123a);
        contentValues.put("name", h.f11124b);
        contentValues.put("lifetime_count", Long.valueOf(h.f11125c));
        contentValues.put("current_bundle_count", Long.valueOf(h.f11126d));
        contentValues.put("last_fire_timestamp", Long.valueOf(h.f11127e));
        contentValues.put("last_bundled_timestamp", Long.valueOf(h.f11128f));
        contentValues.put("last_sampled_complex_event_id", h.f11129g);
        contentValues.put("last_sampling_rate", h.f11130h);
        Boolean bool = h.f11131i;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (mo11051A().insertWithOnConflict("events", (String) null, contentValues, 5) == -1) {
                mo10385b().mo10585y().mo10593a("Failed to insert/update event aggregates (got -1). appId", C3801W.m15166a(h.f11123a));
            }
        } catch (SQLiteException e) {
            mo10385b().mo10585y().mo10594a("Error storing event aggregates. appId", C3801W.m15166a(h.f11123a), e);
        }
    }

    /* renamed from: a */
    public final void mo11070a(C3888r rVar) {
        C2061y.m9067a(rVar);
        mo10451d();
        mo10685v();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", rVar.mo10912e());
        contentValues.put("app_instance_id", rVar.mo10897a());
        contentValues.put("gmp_app_id", rVar.mo10901b());
        contentValues.put("resettable_device_id_hash", rVar.mo10918g());
        contentValues.put("last_bundle_index", Long.valueOf(rVar.mo10935o()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(rVar.mo10923i()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(rVar.mo10925j()));
        contentValues.put("app_version", rVar.mo10909d());
        contentValues.put("app_store", rVar.mo10929l());
        contentValues.put("gmp_version", Long.valueOf(rVar.mo10931m()));
        contentValues.put("dev_cert_hash", Long.valueOf(rVar.mo10933n()));
        contentValues.put("measurement_enabled", Boolean.valueOf(rVar.mo10908c()));
        contentValues.put("day", Long.valueOf(rVar.mo10940s()));
        contentValues.put("daily_public_events_count", Long.valueOf(rVar.mo10941t()));
        contentValues.put("daily_events_count", Long.valueOf(rVar.mo10942u()));
        contentValues.put("daily_conversions_count", Long.valueOf(rVar.mo10943v()));
        contentValues.put("config_fetched_time", Long.valueOf(rVar.mo10937p()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(rVar.mo10938q()));
        contentValues.put("app_version_int", Long.valueOf(rVar.mo10927k()));
        contentValues.put("firebase_instance_id", rVar.mo10921h());
        contentValues.put("daily_error_events_count", Long.valueOf(rVar.mo10945x()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(rVar.mo10944w()));
        contentValues.put("health_monitor_sample", rVar.mo10946y());
        contentValues.put("android_id", Long.valueOf(rVar.mo10894A()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(rVar.mo10895B()));
        contentValues.put("ssaid_reporting_enabled", Boolean.valueOf(rVar.mo10896C()));
        try {
            SQLiteDatabase A = mo11051A();
            if (((long) A.update("apps", contentValues, "app_id = ?", new String[]{rVar.mo10912e()})) == 0 && A.insertWithOnConflict("apps", (String) null, contentValues, 5) == -1) {
                mo10385b().mo10585y().mo10593a("Failed to insert/update app (got -1). appId", C3801W.m15166a(rVar.mo10912e()));
            }
        } catch (SQLiteException e) {
            mo10385b().mo10585y().mo10594a("Error storing app. appId", C3801W.m15166a(rVar.mo10912e()), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0094, code lost:
        r9.mo10594a(r12, r13, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0113, code lost:
        r13 = true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11071a(java.lang.String r17, com.google.android.gms.internal.measurement.C3883pc[] r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            java.lang.String r3 = "app_id=? and audience_id=?"
            java.lang.String r4 = "event_filters"
            java.lang.String r5 = "app_id=?"
            java.lang.String r6 = "property_filters"
            r16.mo10685v()
            r16.mo10451d()
            com.google.android.gms.common.internal.C2061y.m9076b((java.lang.String) r17)
            com.google.android.gms.common.internal.C2061y.m9067a(r18)
            android.database.sqlite.SQLiteDatabase r7 = r16.mo11051A()
            r7.beginTransaction()
            r16.mo10685v()     // Catch:{ all -> 0x0135 }
            r16.mo10451d()     // Catch:{ all -> 0x0135 }
            com.google.android.gms.common.internal.C2061y.m9076b((java.lang.String) r17)     // Catch:{ all -> 0x0135 }
            android.database.sqlite.SQLiteDatabase r8 = r16.mo11051A()     // Catch:{ all -> 0x0135 }
            r9 = 1
            java.lang.String[] r10 = new java.lang.String[r9]     // Catch:{ all -> 0x0135 }
            r11 = 0
            r10[r11] = r0     // Catch:{ all -> 0x0135 }
            r8.delete(r6, r5, r10)     // Catch:{ all -> 0x0135 }
            java.lang.String[] r10 = new java.lang.String[r9]     // Catch:{ all -> 0x0135 }
            r10[r11] = r0     // Catch:{ all -> 0x0135 }
            r8.delete(r4, r5, r10)     // Catch:{ all -> 0x0135 }
            int r5 = r2.length     // Catch:{ all -> 0x0135 }
            r8 = r11
        L_0x0040:
            if (r8 >= r5) goto L_0x0119
            r10 = r2[r8]     // Catch:{ all -> 0x0135 }
            r16.mo10685v()     // Catch:{ all -> 0x0135 }
            r16.mo10451d()     // Catch:{ all -> 0x0135 }
            com.google.android.gms.common.internal.C2061y.m9076b((java.lang.String) r17)     // Catch:{ all -> 0x0135 }
            com.google.android.gms.common.internal.C2061y.m9067a(r10)     // Catch:{ all -> 0x0135 }
            com.google.android.gms.internal.measurement.qc[] r12 = r10.f11583f     // Catch:{ all -> 0x0135 }
            com.google.android.gms.common.internal.C2061y.m9067a(r12)     // Catch:{ all -> 0x0135 }
            com.google.android.gms.internal.measurement.tc[] r12 = r10.f11582e     // Catch:{ all -> 0x0135 }
            com.google.android.gms.common.internal.C2061y.m9067a(r12)     // Catch:{ all -> 0x0135 }
            java.lang.Integer r12 = r10.f11581d     // Catch:{ all -> 0x0135 }
            if (r12 != 0) goto L_0x0072
            com.google.android.gms.internal.measurement.W r10 = r16.mo10385b()     // Catch:{ all -> 0x0135 }
            com.google.android.gms.internal.measurement.Y r10 = r10.mo10576B()     // Catch:{ all -> 0x0135 }
            java.lang.String r12 = "Audience with no ID. appId"
            java.lang.Object r13 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r17)     // Catch:{ all -> 0x0135 }
            r10.mo10593a(r12, r13)     // Catch:{ all -> 0x0135 }
            r13 = r9
            goto L_0x0114
        L_0x0072:
            java.lang.Integer r12 = r10.f11581d     // Catch:{ all -> 0x0135 }
            int r12 = r12.intValue()     // Catch:{ all -> 0x0135 }
            com.google.android.gms.internal.measurement.qc[] r13 = r10.f11583f     // Catch:{ all -> 0x0135 }
            int r14 = r13.length     // Catch:{ all -> 0x0135 }
            r15 = r11
        L_0x007c:
            if (r15 >= r14) goto L_0x009d
            r9 = r13[r15]     // Catch:{ all -> 0x0135 }
            java.lang.Integer r9 = r9.f11597d     // Catch:{ all -> 0x0135 }
            if (r9 != 0) goto L_0x0099
            com.google.android.gms.internal.measurement.W r9 = r16.mo10385b()     // Catch:{ all -> 0x0135 }
            com.google.android.gms.internal.measurement.Y r9 = r9.mo10576B()     // Catch:{ all -> 0x0135 }
            java.lang.String r12 = "Event filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r13 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r17)     // Catch:{ all -> 0x0135 }
            java.lang.Integer r10 = r10.f11581d     // Catch:{ all -> 0x0135 }
        L_0x0094:
            r9.mo10594a(r12, r13, r10)     // Catch:{ all -> 0x0135 }
            goto L_0x0113
        L_0x0099:
            int r15 = r15 + 1
            r9 = 1
            goto L_0x007c
        L_0x009d:
            com.google.android.gms.internal.measurement.tc[] r9 = r10.f11582e     // Catch:{ all -> 0x0135 }
            int r13 = r9.length     // Catch:{ all -> 0x0135 }
            r14 = r11
        L_0x00a1:
            if (r14 >= r13) goto L_0x00bd
            r15 = r9[r14]     // Catch:{ all -> 0x0135 }
            java.lang.Integer r15 = r15.f11662d     // Catch:{ all -> 0x0135 }
            if (r15 != 0) goto L_0x00ba
            com.google.android.gms.internal.measurement.W r9 = r16.mo10385b()     // Catch:{ all -> 0x0135 }
            com.google.android.gms.internal.measurement.Y r9 = r9.mo10576B()     // Catch:{ all -> 0x0135 }
            java.lang.String r12 = "Property filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r13 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r17)     // Catch:{ all -> 0x0135 }
            java.lang.Integer r10 = r10.f11581d     // Catch:{ all -> 0x0135 }
            goto L_0x0094
        L_0x00ba:
            int r14 = r14 + 1
            goto L_0x00a1
        L_0x00bd:
            com.google.android.gms.internal.measurement.qc[] r9 = r10.f11583f     // Catch:{ all -> 0x0135 }
            int r13 = r9.length     // Catch:{ all -> 0x0135 }
            r14 = r11
        L_0x00c1:
            if (r14 >= r13) goto L_0x00d0
            r15 = r9[r14]     // Catch:{ all -> 0x0135 }
            boolean r15 = r1.m15892a((java.lang.String) r0, (int) r12, (com.google.android.gms.internal.measurement.C3887qc) r15)     // Catch:{ all -> 0x0135 }
            if (r15 != 0) goto L_0x00cd
            r9 = r11
            goto L_0x00d1
        L_0x00cd:
            int r14 = r14 + 1
            goto L_0x00c1
        L_0x00d0:
            r9 = 1
        L_0x00d1:
            if (r9 == 0) goto L_0x00e6
            com.google.android.gms.internal.measurement.tc[] r10 = r10.f11582e     // Catch:{ all -> 0x0135 }
            int r13 = r10.length     // Catch:{ all -> 0x0135 }
            r14 = r11
        L_0x00d7:
            if (r14 >= r13) goto L_0x00e6
            r15 = r10[r14]     // Catch:{ all -> 0x0135 }
            boolean r15 = r1.m15893a((java.lang.String) r0, (int) r12, (com.google.android.gms.internal.measurement.C3899tc) r15)     // Catch:{ all -> 0x0135 }
            if (r15 != 0) goto L_0x00e3
            r9 = r11
            goto L_0x00e6
        L_0x00e3:
            int r14 = r14 + 1
            goto L_0x00d7
        L_0x00e6:
            if (r9 != 0) goto L_0x0113
            r16.mo10685v()     // Catch:{ all -> 0x0135 }
            r16.mo10451d()     // Catch:{ all -> 0x0135 }
            com.google.android.gms.common.internal.C2061y.m9076b((java.lang.String) r17)     // Catch:{ all -> 0x0135 }
            android.database.sqlite.SQLiteDatabase r9 = r16.mo11051A()     // Catch:{ all -> 0x0135 }
            r10 = 2
            java.lang.String[] r13 = new java.lang.String[r10]     // Catch:{ all -> 0x0135 }
            r13[r11] = r0     // Catch:{ all -> 0x0135 }
            java.lang.String r14 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x0135 }
            r15 = 1
            r13[r15] = r14     // Catch:{ all -> 0x0135 }
            r9.delete(r6, r3, r13)     // Catch:{ all -> 0x0135 }
            java.lang.String[] r10 = new java.lang.String[r10]     // Catch:{ all -> 0x0135 }
            r10[r11] = r0     // Catch:{ all -> 0x0135 }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x0135 }
            r13 = 1
            r10[r13] = r12     // Catch:{ all -> 0x0135 }
            r9.delete(r4, r3, r10)     // Catch:{ all -> 0x0135 }
            goto L_0x0114
        L_0x0113:
            r13 = 1
        L_0x0114:
            int r8 = r8 + 1
            r9 = r13
            goto L_0x0040
        L_0x0119:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0135 }
            r3.<init>()     // Catch:{ all -> 0x0135 }
            int r4 = r2.length     // Catch:{ all -> 0x0135 }
        L_0x011f:
            if (r11 >= r4) goto L_0x012b
            r5 = r2[r11]     // Catch:{ all -> 0x0135 }
            java.lang.Integer r5 = r5.f11581d     // Catch:{ all -> 0x0135 }
            r3.add(r5)     // Catch:{ all -> 0x0135 }
            int r11 = r11 + 1
            goto L_0x011f
        L_0x012b:
            r1.m15894a((java.lang.String) r0, (java.util.List<java.lang.Integer>) r3)     // Catch:{ all -> 0x0135 }
            r7.setTransactionSuccessful()     // Catch:{ all -> 0x0135 }
            r7.endTransaction()
            return
        L_0x0135:
            r0 = move-exception
            r7.endTransaction()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3920z.mo11071a(java.lang.String, com.google.android.gms.internal.measurement.pc[]):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11072a(List<Long> list) {
        mo10451d();
        mo10685v();
        C2061y.m9067a(list);
        C2061y.m9066a(list.size());
        if (m15883Q()) {
            String join = TextUtils.join(",", list);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 80);
            sb3.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb3.append(sb2);
            sb3.append(" AND retry_count =  2147483647 LIMIT 1");
            if (m15895b(sb3.toString(), (String[]) null) > 0) {
                mo10385b().mo10576B().mo10592a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase A = mo11051A();
                StringBuilder sb4 = new StringBuilder(String.valueOf(sb2).length() + 127);
                sb4.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb4.append(sb2);
                sb4.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                A.execSQL(sb4.toString());
            } catch (SQLiteException e) {
                mo10385b().mo10585y().mo10593a("Error incrementing retry count. error", e);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo11073a(C3725Cc cc, boolean z) {
        C3809Y y;
        Object a;
        String str;
        mo10451d();
        mo10685v();
        C2061y.m9067a(cc);
        C2061y.m9076b(cc.f11058r);
        C2061y.m9067a(cc.f11049i);
        mo11055E();
        long a2 = mo10382a().mo7725a();
        if (cc.f11049i.longValue() < a2 - C3908w.m15759u() || cc.f11049i.longValue() > C3908w.m15759u() + a2) {
            mo10385b().mo10576B().mo10595a("Storing bundle outside of the max uploading time span. appId, now, timestamp", C3801W.m15166a(cc.f11058r), Long.valueOf(a2), cc.f11049i);
        }
        try {
            byte[] bArr = new byte[cc.mo10758d()];
            C3824b a3 = C3824b.m15344a(bArr, 0, bArr.length);
            cc.mo10405a(a3);
            a3.mo10662a();
            byte[] a4 = mo10454o().mo10792a(bArr);
            mo10385b().mo10580F().mo10593a("Saving bundle, size", Integer.valueOf(a4.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", cc.f11058r);
            contentValues.put("bundle_end_timestamp", cc.f11049i);
            contentValues.put("data", a4);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            Integer num = cc.f11043N;
            if (num != null) {
                contentValues.put("retry_count", num);
            }
            try {
                if (mo11051A().insert("queue", (String) null, contentValues) != -1) {
                    return true;
                }
                mo10385b().mo10585y().mo10593a("Failed to insert bundle (got -1). appId", C3801W.m15166a(cc.f11058r));
                return false;
            } catch (SQLiteException e) {
                e = e;
                y = mo10385b().mo10585y();
                a = C3801W.m15166a(cc.f11058r);
                str = "Error storing bundle. appId";
                y.mo10594a(str, a, e);
                return false;
            }
        } catch (IOException e2) {
            e = e2;
            y = mo10385b().mo10585y();
            a = C3801W.m15166a(cc.f11058r);
            str = "Data loss. Failed to serialize bundle. appId";
            y.mo10594a(str, a, e);
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo11074a(C3738G g, long j, boolean z) {
        C3809Y y;
        Object a;
        String str;
        mo10451d();
        mo10685v();
        C2061y.m9067a(g);
        C2061y.m9076b(g.f11109a);
        C3923zc zcVar = new C3923zc();
        zcVar.f11750g = Long.valueOf(g.f11113e);
        zcVar.f11747d = new C3717Ac[g.f11114f.size()];
        Iterator<String> it = g.f11114f.iterator();
        int i = 0;
        while (it.hasNext()) {
            String next = it.next();
            C3717Ac ac = new C3717Ac();
            zcVar.f11747d[i] = ac;
            ac.f11014d = next;
            mo10454o().mo10785a(ac, g.f11114f.mo11101a(next));
            i++;
        }
        try {
            byte[] bArr = new byte[zcVar.mo10758d()];
            C3824b a2 = C3824b.m15344a(bArr, 0, bArr.length);
            zcVar.mo10405a(a2);
            a2.mo10662a();
            mo10385b().mo10580F().mo10594a("Saving event, name, data size", mo10453n().mo10557a(g.f11110b), Integer.valueOf(bArr.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", g.f11109a);
            contentValues.put("name", g.f11110b);
            contentValues.put("timestamp", Long.valueOf(g.f11112d));
            contentValues.put("metadata_fingerprint", Long.valueOf(j));
            contentValues.put("data", bArr);
            contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
            try {
                if (mo11051A().insert("raw_events", (String) null, contentValues) != -1) {
                    return true;
                }
                mo10385b().mo10585y().mo10593a("Failed to insert raw event (got -1). appId", C3801W.m15166a(g.f11109a));
                return false;
            } catch (SQLiteException e) {
                e = e;
                y = mo10385b().mo10585y();
                a = C3801W.m15166a(g.f11109a);
                str = "Error storing raw event. appId";
                y.mo10594a(str, a, e);
                return false;
            }
        } catch (IOException e2) {
            e = e2;
            y = mo10385b().mo10585y();
            a = C3801W.m15166a(g.f11109a);
            str = "Data loss. Failed to serialize event params/data. appId";
            y.mo10594a(str, a, e);
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo11075a(C3867lc lcVar) {
        C2061y.m9067a(lcVar);
        mo10451d();
        mo10685v();
        if (mo11083d(lcVar.f11534a, lcVar.f11536c) == null) {
            if (C3871mc.m15526b(lcVar.f11536c)) {
                if (m15895b("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{lcVar.f11534a}) >= 25) {
                    return false;
                }
            } else {
                if (m15895b("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{lcVar.f11534a, lcVar.f11535b}) >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", lcVar.f11534a);
        contentValues.put("origin", lcVar.f11535b);
        contentValues.put("name", lcVar.f11536c);
        contentValues.put("set_timestamp", Long.valueOf(lcVar.f11537d));
        m15888a(contentValues, "value", lcVar.f11538e);
        try {
            if (mo11051A().insertWithOnConflict("user_attributes", (String) null, contentValues, 5) == -1) {
                mo10385b().mo10585y().mo10593a("Failed to insert/update user property (got -1). appId", C3801W.m15166a(lcVar.f11534a));
            }
        } catch (SQLiteException e) {
            mo10385b().mo10585y().mo10594a("Error storing user property. appId", C3801W.m15166a(lcVar.f11534a), e);
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo11076a(zzed zzed) {
        C2061y.m9067a(zzed);
        mo10451d();
        mo10685v();
        if (mo11083d(zzed.f11769a, zzed.f11771c.f11786b) == null) {
            if (m15895b("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{zzed.f11769a}) >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzed.f11769a);
        contentValues.put("origin", zzed.f11770b);
        contentValues.put("name", zzed.f11771c.f11786b);
        m15888a(contentValues, "value", zzed.f11771c.mo11112b());
        contentValues.put("active", Boolean.valueOf(zzed.f11773e));
        contentValues.put("trigger_event_name", zzed.f11774f);
        contentValues.put("trigger_timeout", Long.valueOf(zzed.f11776h));
        mo10454o();
        contentValues.put("timed_out_event", C3871mc.m15520a((Parcelable) zzed.f11775g));
        contentValues.put("creation_timestamp", Long.valueOf(zzed.f11772d));
        mo10454o();
        contentValues.put("triggered_event", C3871mc.m15520a((Parcelable) zzed.f11777i));
        contentValues.put("triggered_timestamp", Long.valueOf(zzed.f11771c.f11787c));
        contentValues.put("time_to_live", Long.valueOf(zzed.f11778j));
        mo10454o();
        contentValues.put("expired_event", C3871mc.m15520a((Parcelable) zzed.f11779k));
        try {
            if (mo11051A().insertWithOnConflict("conditional_properties", (String) null, contentValues, 5) == -1) {
                mo10385b().mo10585y().mo10593a("Failed to insert/update conditional user property (got -1)", C3801W.m15166a(zzed.f11769a));
            }
        } catch (SQLiteException e) {
            mo10385b().mo10585y().mo10594a("Error storing conditional user property", C3801W.m15166a(zzed.f11769a), e);
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo11077a(String str, Long l, long j, C3923zc zcVar) {
        mo10451d();
        mo10685v();
        C2061y.m9067a(zcVar);
        C2061y.m9076b(str);
        C2061y.m9067a(l);
        try {
            byte[] bArr = new byte[zcVar.mo10758d()];
            C3824b a = C3824b.m15344a(bArr, 0, bArr.length);
            zcVar.mo10405a(a);
            a.mo10662a();
            mo10385b().mo10580F().mo10594a("Saving complex main event, appId, data size", mo10453n().mo10557a(str), Integer.valueOf(bArr.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("event_id", l);
            contentValues.put("children_to_process", Long.valueOf(j));
            contentValues.put("main_event", bArr);
            try {
                if (mo11051A().insertWithOnConflict("main_event_params", (String) null, contentValues, 5) != -1) {
                    return true;
                }
                mo10385b().mo10585y().mo10593a("Failed to insert complex main event (got -1). appId", C3801W.m15166a(str));
                return false;
            } catch (SQLiteException e) {
                mo10385b().mo10585y().mo10594a("Error storing complex main event. appId", C3801W.m15166a(str), e);
                return false;
            }
        } catch (IOException e2) {
            mo10385b().mo10585y().mo10595a("Data loss. Failed to serialize event params/data. appId, eventId", C3801W.m15166a(str), l, e2);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0105  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.C3742H mo11078b(java.lang.String r22, java.lang.String r23) {
        /*
            r21 = this;
            r15 = r23
            com.google.android.gms.common.internal.C2061y.m9076b((java.lang.String) r22)
            com.google.android.gms.common.internal.C2061y.m9076b((java.lang.String) r23)
            r21.mo10451d()
            r21.mo10685v()
            r16 = 0
            android.database.sqlite.SQLiteDatabase r1 = r21.mo11051A()     // Catch:{ SQLiteException -> 0x00e0, all -> 0x00dc }
            java.lang.String r2 = "events"
            java.lang.String r3 = "lifetime_count"
            java.lang.String r4 = "current_bundle_count"
            java.lang.String r5 = "last_fire_timestamp"
            java.lang.String r6 = "last_bundled_timestamp"
            java.lang.String r7 = "last_sampled_complex_event_id"
            java.lang.String r8 = "last_sampling_rate"
            java.lang.String r9 = "last_exempt_from_sampling"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5, r6, r7, r8, r9}     // Catch:{ SQLiteException -> 0x00e0, all -> 0x00dc }
            java.lang.String r4 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x00e0, all -> 0x00dc }
            r9 = 0
            r5[r9] = r22     // Catch:{ SQLiteException -> 0x00e0, all -> 0x00dc }
            r10 = 1
            r5[r10] = r15     // Catch:{ SQLiteException -> 0x00e0, all -> 0x00dc }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x00e0, all -> 0x00dc }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d4 }
            if (r1 != 0) goto L_0x0046
            if (r14 == 0) goto L_0x0045
            r14.close()
        L_0x0045:
            return r16
        L_0x0046:
            long r4 = r14.getLong(r9)     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d4 }
            long r6 = r14.getLong(r10)     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d4 }
            long r11 = r14.getLong(r0)     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d4 }
            r0 = 3
            boolean r1 = r14.isNull(r0)     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d4 }
            if (r1 == 0) goto L_0x005c
            r0 = 0
            goto L_0x0060
        L_0x005c:
            long r0 = r14.getLong(r0)     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d4 }
        L_0x0060:
            r17 = r0
            r0 = 4
            boolean r1 = r14.isNull(r0)     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d4 }
            if (r1 == 0) goto L_0x006c
            r0 = r16
            goto L_0x0074
        L_0x006c:
            long r0 = r14.getLong(r0)     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d4 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d4 }
        L_0x0074:
            r1 = 5
            boolean r2 = r14.isNull(r1)     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d4 }
            if (r2 == 0) goto L_0x007e
            r13 = r16
            goto L_0x0087
        L_0x007e:
            long r1 = r14.getLong(r1)     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d4 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d4 }
            r13 = r1
        L_0x0087:
            r1 = 6
            boolean r2 = r14.isNull(r1)     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d4 }
            if (r2 != 0) goto L_0x00a0
            long r1 = r14.getLong(r1)     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d4 }
            r19 = 1
            int r1 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r1 != 0) goto L_0x0099
            r9 = r10
        L_0x0099:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d4 }
            r19 = r1
            goto L_0x00a2
        L_0x00a0:
            r19 = r16
        L_0x00a2:
            com.google.android.gms.internal.measurement.H r20 = new com.google.android.gms.internal.measurement.H     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d4 }
            r1 = r20
            r2 = r22
            r3 = r23
            r8 = r11
            r10 = r17
            r12 = r0
            r17 = r14
            r14 = r19
            r1.<init>(r2, r3, r4, r6, r8, r10, r12, r13, r14)     // Catch:{ SQLiteException -> 0x00d2 }
            boolean r0 = r17.moveToNext()     // Catch:{ SQLiteException -> 0x00d2 }
            if (r0 == 0) goto L_0x00cc
            com.google.android.gms.internal.measurement.W r0 = r21.mo10385b()     // Catch:{ SQLiteException -> 0x00d2 }
            com.google.android.gms.internal.measurement.Y r0 = r0.mo10585y()     // Catch:{ SQLiteException -> 0x00d2 }
            java.lang.String r1 = "Got multiple records for event aggregates, expected one. appId"
            java.lang.Object r2 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r22)     // Catch:{ SQLiteException -> 0x00d2 }
            r0.mo10593a(r1, r2)     // Catch:{ SQLiteException -> 0x00d2 }
        L_0x00cc:
            if (r17 == 0) goto L_0x00d1
            r17.close()
        L_0x00d1:
            return r20
        L_0x00d2:
            r0 = move-exception
            goto L_0x00e3
        L_0x00d4:
            r0 = move-exception
            r17 = r14
            goto L_0x0103
        L_0x00d8:
            r0 = move-exception
            r17 = r14
            goto L_0x00e3
        L_0x00dc:
            r0 = move-exception
            r17 = r16
            goto L_0x0103
        L_0x00e0:
            r0 = move-exception
            r17 = r16
        L_0x00e3:
            com.google.android.gms.internal.measurement.W r1 = r21.mo10385b()     // Catch:{ all -> 0x0102 }
            com.google.android.gms.internal.measurement.Y r1 = r1.mo10585y()     // Catch:{ all -> 0x0102 }
            java.lang.String r2 = "Error querying events. appId"
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r22)     // Catch:{ all -> 0x0102 }
            com.google.android.gms.internal.measurement.U r4 = r21.mo10453n()     // Catch:{ all -> 0x0102 }
            java.lang.String r4 = r4.mo10557a((java.lang.String) r15)     // Catch:{ all -> 0x0102 }
            r1.mo10595a(r2, r3, r4, r0)     // Catch:{ all -> 0x0102 }
            if (r17 == 0) goto L_0x0101
            r17.close()
        L_0x0101:
            return r16
        L_0x0102:
            r0 = move-exception
        L_0x0103:
            if (r17 == 0) goto L_0x0108
            r17.close()
        L_0x0108:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3920z.mo11078b(java.lang.String, java.lang.String):com.google.android.gms.internal.measurement.H");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0113 A[Catch:{ SQLiteException -> 0x019d }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0117 A[Catch:{ SQLiteException -> 0x019d }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x014b A[Catch:{ SQLiteException -> 0x019d }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x014e A[Catch:{ SQLiteException -> 0x019d }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x015d A[Catch:{ SQLiteException -> 0x019d }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0172 A[Catch:{ SQLiteException -> 0x019d }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0186 A[Catch:{ SQLiteException -> 0x019d }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01ca  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.C3888r mo11079b(java.lang.String r31) {
        /*
            r30 = this;
            r1 = r31
            com.google.android.gms.common.internal.C2061y.m9076b((java.lang.String) r31)
            r30.mo10451d()
            r30.mo10685v()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r30.mo11051A()     // Catch:{ SQLiteException -> 0x01ac, all -> 0x01a7 }
            java.lang.String r4 = "apps"
            java.lang.String r5 = "app_instance_id"
            java.lang.String r6 = "gmp_app_id"
            java.lang.String r7 = "resettable_device_id_hash"
            java.lang.String r8 = "last_bundle_index"
            java.lang.String r9 = "last_bundle_start_timestamp"
            java.lang.String r10 = "last_bundle_end_timestamp"
            java.lang.String r11 = "app_version"
            java.lang.String r12 = "app_store"
            java.lang.String r13 = "gmp_version"
            java.lang.String r14 = "dev_cert_hash"
            java.lang.String r15 = "measurement_enabled"
            java.lang.String r16 = "day"
            java.lang.String r17 = "daily_public_events_count"
            java.lang.String r18 = "daily_events_count"
            java.lang.String r19 = "daily_conversions_count"
            java.lang.String r20 = "config_fetched_time"
            java.lang.String r21 = "failed_config_fetch_time"
            java.lang.String r22 = "app_version_int"
            java.lang.String r23 = "firebase_instance_id"
            java.lang.String r24 = "daily_error_events_count"
            java.lang.String r25 = "daily_realtime_events_count"
            java.lang.String r26 = "health_monitor_sample"
            java.lang.String r27 = "android_id"
            java.lang.String r28 = "adid_reporting_enabled"
            java.lang.String r29 = "ssaid_reporting_enabled"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29}     // Catch:{ SQLiteException -> 0x01ac, all -> 0x01a7 }
            java.lang.String r6 = "app_id=?"
            r0 = 1
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x01ac, all -> 0x01a7 }
            r11 = 0
            r7[r11] = r1     // Catch:{ SQLiteException -> 0x01ac, all -> 0x01a7 }
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x01ac, all -> 0x01a7 }
            boolean r4 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x01a3, all -> 0x019f }
            if (r4 != 0) goto L_0x0063
            if (r3 == 0) goto L_0x0062
            r3.close()
        L_0x0062:
            return r2
        L_0x0063:
            com.google.android.gms.internal.measurement.r r4 = new com.google.android.gms.internal.measurement.r     // Catch:{ SQLiteException -> 0x01a3, all -> 0x019f }
            r5 = r30
            com.google.android.gms.internal.measurement.ec r6 = r5.f11404b     // Catch:{ SQLiteException -> 0x019d }
            com.google.android.gms.internal.measurement.Aa r6 = r6.mo10718r()     // Catch:{ SQLiteException -> 0x019d }
            r4.<init>(r6, r1)     // Catch:{ SQLiteException -> 0x019d }
            java.lang.String r6 = r3.getString(r11)     // Catch:{ SQLiteException -> 0x019d }
            r4.mo10903b((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x019d }
            java.lang.String r6 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x019d }
            r4.mo10906c((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x019d }
            r6 = 2
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x019d }
            r4.mo10911d((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x019d }
            r6 = 3
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x019d }
            r4.mo10919g((long) r6)     // Catch:{ SQLiteException -> 0x019d }
            r6 = 4
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x019d }
            r4.mo10902b((long) r6)     // Catch:{ SQLiteException -> 0x019d }
            r6 = 5
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x019d }
            r4.mo10905c((long) r6)     // Catch:{ SQLiteException -> 0x019d }
            r6 = 6
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x019d }
            r4.mo10899a((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x019d }
            r6 = 7
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x019d }
            r4.mo10917f((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x019d }
            r6 = 8
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x019d }
            r4.mo10913e((long) r6)     // Catch:{ SQLiteException -> 0x019d }
            r6 = 9
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x019d }
            r4.mo10916f((long) r6)     // Catch:{ SQLiteException -> 0x019d }
            r6 = 10
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x019d }
            if (r7 != 0) goto L_0x00d1
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x019d }
            if (r6 == 0) goto L_0x00cf
            goto L_0x00d1
        L_0x00cf:
            r6 = r11
            goto L_0x00d2
        L_0x00d1:
            r6 = r0
        L_0x00d2:
            r4.mo10900a((boolean) r6)     // Catch:{ SQLiteException -> 0x019d }
            r6 = 11
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x019d }
            r4.mo10926j(r6)     // Catch:{ SQLiteException -> 0x019d }
            r6 = 12
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x019d }
            r4.mo10928k(r6)     // Catch:{ SQLiteException -> 0x019d }
            r6 = 13
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x019d }
            r4.mo10930l(r6)     // Catch:{ SQLiteException -> 0x019d }
            r6 = 14
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x019d }
            r4.mo10932m(r6)     // Catch:{ SQLiteException -> 0x019d }
            r6 = 15
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x019d }
            r4.mo10922h(r6)     // Catch:{ SQLiteException -> 0x019d }
            r6 = 16
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x019d }
            r4.mo10924i(r6)     // Catch:{ SQLiteException -> 0x019d }
            r6 = 17
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x019d }
            if (r7 == 0) goto L_0x0117
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            goto L_0x011c
        L_0x0117:
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x019d }
            long r6 = (long) r6     // Catch:{ SQLiteException -> 0x019d }
        L_0x011c:
            r4.mo10910d((long) r6)     // Catch:{ SQLiteException -> 0x019d }
            r6 = 18
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x019d }
            r4.mo10914e((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x019d }
            r6 = 19
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x019d }
            r4.mo10936o(r6)     // Catch:{ SQLiteException -> 0x019d }
            r6 = 20
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x019d }
            r4.mo10934n(r6)     // Catch:{ SQLiteException -> 0x019d }
            r6 = 21
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x019d }
            r4.mo10920g((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x019d }
            r6 = 22
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x019d }
            if (r7 == 0) goto L_0x014e
            r6 = 0
            goto L_0x0152
        L_0x014e:
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x019d }
        L_0x0152:
            r4.mo10898a((long) r6)     // Catch:{ SQLiteException -> 0x019d }
            r6 = 23
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x019d }
            if (r7 != 0) goto L_0x0166
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x019d }
            if (r6 == 0) goto L_0x0164
            goto L_0x0166
        L_0x0164:
            r6 = r11
            goto L_0x0167
        L_0x0166:
            r6 = r0
        L_0x0167:
            r4.mo10904b((boolean) r6)     // Catch:{ SQLiteException -> 0x019d }
            r6 = 24
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x019d }
            if (r7 != 0) goto L_0x017a
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x019d }
            if (r6 == 0) goto L_0x0179
            goto L_0x017a
        L_0x0179:
            r0 = r11
        L_0x017a:
            r4.mo10907c((boolean) r0)     // Catch:{ SQLiteException -> 0x019d }
            r4.mo10915f()     // Catch:{ SQLiteException -> 0x019d }
            boolean r0 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x019d }
            if (r0 == 0) goto L_0x0197
            com.google.android.gms.internal.measurement.W r0 = r30.mo10385b()     // Catch:{ SQLiteException -> 0x019d }
            com.google.android.gms.internal.measurement.Y r0 = r0.mo10585y()     // Catch:{ SQLiteException -> 0x019d }
            java.lang.String r6 = "Got multiple records for app, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r31)     // Catch:{ SQLiteException -> 0x019d }
            r0.mo10593a(r6, r7)     // Catch:{ SQLiteException -> 0x019d }
        L_0x0197:
            if (r3 == 0) goto L_0x019c
            r3.close()
        L_0x019c:
            return r4
        L_0x019d:
            r0 = move-exception
            goto L_0x01b0
        L_0x019f:
            r0 = move-exception
            r5 = r30
            goto L_0x01c8
        L_0x01a3:
            r0 = move-exception
            r5 = r30
            goto L_0x01b0
        L_0x01a7:
            r0 = move-exception
            r5 = r30
            r3 = r2
            goto L_0x01c8
        L_0x01ac:
            r0 = move-exception
            r5 = r30
            r3 = r2
        L_0x01b0:
            com.google.android.gms.internal.measurement.W r4 = r30.mo10385b()     // Catch:{ all -> 0x01c7 }
            com.google.android.gms.internal.measurement.Y r4 = r4.mo10585y()     // Catch:{ all -> 0x01c7 }
            java.lang.String r6 = "Error querying app. appId"
            java.lang.Object r1 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r31)     // Catch:{ all -> 0x01c7 }
            r4.mo10594a(r6, r1, r0)     // Catch:{ all -> 0x01c7 }
            if (r3 == 0) goto L_0x01c6
            r3.close()
        L_0x01c6:
            return r2
        L_0x01c7:
            r0 = move-exception
        L_0x01c8:
            if (r3 == 0) goto L_0x01cd
            r3.close()
        L_0x01cd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3920z.mo11079b(java.lang.String):com.google.android.gms.internal.measurement.r");
    }

    /* renamed from: b */
    public final List<zzed> mo11080b(String str, String str2, String str3) {
        C2061y.m9076b(str);
        mo10451d();
        mo10685v();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return mo11068a(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* renamed from: c */
    public final long mo11081c(String str) {
        C2061y.m9076b(str);
        mo10451d();
        mo10685v();
        try {
            return (long) mo11051A().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, mo10456r().mo11000b(str, C3758L.f11215v))))});
        } catch (SQLiteException e) {
            mo10385b().mo10585y().mo10594a("Error deleting over the limit events. appId", C3801W.m15166a(str), e);
            return 0;
        }
    }

    /* renamed from: c */
    public final void mo11082c(String str, String str2) {
        C2061y.m9076b(str);
        C2061y.m9076b(str2);
        mo10451d();
        mo10685v();
        try {
            mo10385b().mo10580F().mo10593a("Deleted user attribute rows", Integer.valueOf(mo11051A().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2})));
        } catch (SQLiteException e) {
            mo10385b().mo10585y().mo10595a("Error deleting user attribute. appId", C3801W.m15166a(str), mo10453n().mo10559c(str2), e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a9  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.C3867lc mo11083d(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r8 = r20
            com.google.android.gms.common.internal.C2061y.m9076b((java.lang.String) r19)
            com.google.android.gms.common.internal.C2061y.m9076b((java.lang.String) r20)
            r18.mo10451d()
            r18.mo10685v()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r18.mo11051A()     // Catch:{ SQLiteException -> 0x0083, all -> 0x007e }
            java.lang.String r11 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r1 = "value"
            java.lang.String r2 = "origin"
            java.lang.String[] r12 = new java.lang.String[]{r0, r1, r2}     // Catch:{ SQLiteException -> 0x0083, all -> 0x007e }
            java.lang.String r13 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0083, all -> 0x007e }
            r1 = 0
            r14[r1] = r19     // Catch:{ SQLiteException -> 0x0083, all -> 0x007e }
            r2 = 1
            r14[r2] = r8     // Catch:{ SQLiteException -> 0x0083, all -> 0x007e }
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x0083, all -> 0x007e }
            boolean r3 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x007a, all -> 0x0076 }
            if (r3 != 0) goto L_0x003f
            if (r10 == 0) goto L_0x003e
            r10.close()
        L_0x003e:
            return r9
        L_0x003f:
            long r5 = r10.getLong(r1)     // Catch:{ SQLiteException -> 0x007a, all -> 0x0076 }
            r11 = r18
            java.lang.Object r7 = r11.m15886a((android.database.Cursor) r10, (int) r2)     // Catch:{ SQLiteException -> 0x0074 }
            java.lang.String r3 = r10.getString(r0)     // Catch:{ SQLiteException -> 0x0074 }
            com.google.android.gms.internal.measurement.lc r0 = new com.google.android.gms.internal.measurement.lc     // Catch:{ SQLiteException -> 0x0074 }
            r1 = r0
            r2 = r19
            r4 = r20
            r1.<init>(r2, r3, r4, r5, r7)     // Catch:{ SQLiteException -> 0x0074 }
            boolean r1 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x0074 }
            if (r1 == 0) goto L_0x006e
            com.google.android.gms.internal.measurement.W r1 = r18.mo10385b()     // Catch:{ SQLiteException -> 0x0074 }
            com.google.android.gms.internal.measurement.Y r1 = r1.mo10585y()     // Catch:{ SQLiteException -> 0x0074 }
            java.lang.String r2 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r19)     // Catch:{ SQLiteException -> 0x0074 }
            r1.mo10593a(r2, r3)     // Catch:{ SQLiteException -> 0x0074 }
        L_0x006e:
            if (r10 == 0) goto L_0x0073
            r10.close()
        L_0x0073:
            return r0
        L_0x0074:
            r0 = move-exception
            goto L_0x0087
        L_0x0076:
            r0 = move-exception
            r11 = r18
            goto L_0x00a7
        L_0x007a:
            r0 = move-exception
            r11 = r18
            goto L_0x0087
        L_0x007e:
            r0 = move-exception
            r11 = r18
            r10 = r9
            goto L_0x00a7
        L_0x0083:
            r0 = move-exception
            r11 = r18
            r10 = r9
        L_0x0087:
            com.google.android.gms.internal.measurement.W r1 = r18.mo10385b()     // Catch:{ all -> 0x00a6 }
            com.google.android.gms.internal.measurement.Y r1 = r1.mo10585y()     // Catch:{ all -> 0x00a6 }
            java.lang.String r2 = "Error querying user property. appId"
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r19)     // Catch:{ all -> 0x00a6 }
            com.google.android.gms.internal.measurement.U r4 = r18.mo10453n()     // Catch:{ all -> 0x00a6 }
            java.lang.String r4 = r4.mo10559c(r8)     // Catch:{ all -> 0x00a6 }
            r1.mo10595a(r2, r3, r4, r0)     // Catch:{ all -> 0x00a6 }
            if (r10 == 0) goto L_0x00a5
            r10.close()
        L_0x00a5:
            return r9
        L_0x00a6:
            r0 = move-exception
        L_0x00a7:
            if (r10 == 0) goto L_0x00ac
            r10.close()
        L_0x00ac:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3920z.mo11083d(java.lang.String, java.lang.String):com.google.android.gms.internal.measurement.lc");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0073  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo11084d(java.lang.String r11) {
        /*
            r10 = this;
            com.google.android.gms.common.internal.C2061y.m9076b((java.lang.String) r11)
            r10.mo10451d()
            r10.mo10685v()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.mo11051A()     // Catch:{ SQLiteException -> 0x0057, all -> 0x0054 }
            java.lang.String r2 = "apps"
            java.lang.String r3 = "remote_config"
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch:{ SQLiteException -> 0x0057, all -> 0x0054 }
            java.lang.String r4 = "app_id=?"
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0057, all -> 0x0054 }
            r9 = 0
            r5[r9] = r11     // Catch:{ SQLiteException -> 0x0057, all -> 0x0054 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0057, all -> 0x0054 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0052 }
            if (r2 != 0) goto L_0x0031
            if (r1 == 0) goto L_0x0030
            r1.close()
        L_0x0030:
            return r0
        L_0x0031:
            byte[] r2 = r1.getBlob(r9)     // Catch:{ SQLiteException -> 0x0052 }
            boolean r3 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0052 }
            if (r3 == 0) goto L_0x004c
            com.google.android.gms.internal.measurement.W r3 = r10.mo10385b()     // Catch:{ SQLiteException -> 0x0052 }
            com.google.android.gms.internal.measurement.Y r3 = r3.mo10585y()     // Catch:{ SQLiteException -> 0x0052 }
            java.lang.String r4 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r11)     // Catch:{ SQLiteException -> 0x0052 }
            r3.mo10593a(r4, r5)     // Catch:{ SQLiteException -> 0x0052 }
        L_0x004c:
            if (r1 == 0) goto L_0x0051
            r1.close()
        L_0x0051:
            return r2
        L_0x0052:
            r2 = move-exception
            goto L_0x0059
        L_0x0054:
            r11 = move-exception
            r1 = r0
            goto L_0x0071
        L_0x0057:
            r2 = move-exception
            r1 = r0
        L_0x0059:
            com.google.android.gms.internal.measurement.W r3 = r10.mo10385b()     // Catch:{ all -> 0x0070 }
            com.google.android.gms.internal.measurement.Y r3 = r3.mo10585y()     // Catch:{ all -> 0x0070 }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r11 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r11)     // Catch:{ all -> 0x0070 }
            r3.mo10594a(r4, r11, r2)     // Catch:{ all -> 0x0070 }
            if (r1 == 0) goto L_0x006f
            r1.close()
        L_0x006f:
            return r0
        L_0x0070:
            r11 = move-exception
        L_0x0071:
            if (r1 == 0) goto L_0x0076
            r1.close()
        L_0x0076:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3920z.mo11084d(java.lang.String):byte[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0125  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.zzed mo11085e(java.lang.String r30, java.lang.String r31) {
        /*
            r29 = this;
            r7 = r31
            com.google.android.gms.common.internal.C2061y.m9076b((java.lang.String) r30)
            com.google.android.gms.common.internal.C2061y.m9076b((java.lang.String) r31)
            r29.mo10451d()
            r29.mo10685v()
            r8 = 0
            android.database.sqlite.SQLiteDatabase r9 = r29.mo11051A()     // Catch:{ SQLiteException -> 0x00ff, all -> 0x00fa }
            java.lang.String r10 = "conditional_properties"
            java.lang.String r11 = "origin"
            java.lang.String r12 = "value"
            java.lang.String r13 = "active"
            java.lang.String r14 = "trigger_event_name"
            java.lang.String r15 = "trigger_timeout"
            java.lang.String r16 = "timed_out_event"
            java.lang.String r17 = "creation_timestamp"
            java.lang.String r18 = "triggered_event"
            java.lang.String r19 = "triggered_timestamp"
            java.lang.String r20 = "time_to_live"
            java.lang.String r21 = "expired_event"
            java.lang.String[] r11 = new java.lang.String[]{r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}     // Catch:{ SQLiteException -> 0x00ff, all -> 0x00fa }
            java.lang.String r12 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r13 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x00ff, all -> 0x00fa }
            r1 = 0
            r13[r1] = r30     // Catch:{ SQLiteException -> 0x00ff, all -> 0x00fa }
            r2 = 1
            r13[r2] = r7     // Catch:{ SQLiteException -> 0x00ff, all -> 0x00fa }
            r14 = 0
            r15 = 0
            r16 = 0
            android.database.Cursor r9 = r9.query(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ SQLiteException -> 0x00ff, all -> 0x00fa }
            boolean r3 = r9.moveToFirst()     // Catch:{ SQLiteException -> 0x00f6, all -> 0x00f2 }
            if (r3 != 0) goto L_0x004e
            if (r9 == 0) goto L_0x004d
            r9.close()
        L_0x004d:
            return r8
        L_0x004e:
            java.lang.String r16 = r9.getString(r1)     // Catch:{ SQLiteException -> 0x00f6, all -> 0x00f2 }
            r10 = r29
            java.lang.Object r5 = r10.m15886a((android.database.Cursor) r9, (int) r2)     // Catch:{ SQLiteException -> 0x00f0 }
            int r0 = r9.getInt(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            if (r0 == 0) goto L_0x0061
            r20 = r2
            goto L_0x0063
        L_0x0061:
            r20 = r1
        L_0x0063:
            r0 = 3
            java.lang.String r21 = r9.getString(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            r0 = 4
            long r23 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.internal.measurement.mc r0 = r29.mo10454o()     // Catch:{ SQLiteException -> 0x00f0 }
            r1 = 5
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzeu> r2 = com.google.android.gms.internal.measurement.zzeu.CREATOR     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable r0 = r0.mo10780a((byte[]) r1, r2)     // Catch:{ SQLiteException -> 0x00f0 }
            r22 = r0
            com.google.android.gms.internal.measurement.zzeu r22 = (com.google.android.gms.internal.measurement.zzeu) r22     // Catch:{ SQLiteException -> 0x00f0 }
            r0 = 6
            long r18 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.internal.measurement.mc r0 = r29.mo10454o()     // Catch:{ SQLiteException -> 0x00f0 }
            r1 = 7
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzeu> r2 = com.google.android.gms.internal.measurement.zzeu.CREATOR     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable r0 = r0.mo10780a((byte[]) r1, r2)     // Catch:{ SQLiteException -> 0x00f0 }
            r25 = r0
            com.google.android.gms.internal.measurement.zzeu r25 = (com.google.android.gms.internal.measurement.zzeu) r25     // Catch:{ SQLiteException -> 0x00f0 }
            r0 = 8
            long r3 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            r0 = 9
            long r26 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.internal.measurement.mc r0 = r29.mo10454o()     // Catch:{ SQLiteException -> 0x00f0 }
            r1 = 10
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzeu> r2 = com.google.android.gms.internal.measurement.zzeu.CREATOR     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable r0 = r0.mo10780a((byte[]) r1, r2)     // Catch:{ SQLiteException -> 0x00f0 }
            r28 = r0
            com.google.android.gms.internal.measurement.zzeu r28 = (com.google.android.gms.internal.measurement.zzeu) r28     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.internal.measurement.zzjx r17 = new com.google.android.gms.internal.measurement.zzjx     // Catch:{ SQLiteException -> 0x00f0 }
            r1 = r17
            r2 = r31
            r6 = r16
            r1.<init>(r2, r3, r5, r6)     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.internal.measurement.zzed r0 = new com.google.android.gms.internal.measurement.zzed     // Catch:{ SQLiteException -> 0x00f0 }
            r14 = r0
            r15 = r30
            r14.<init>(r15, r16, r17, r18, r20, r21, r22, r23, r25, r26, r28)     // Catch:{ SQLiteException -> 0x00f0 }
            boolean r1 = r9.moveToNext()     // Catch:{ SQLiteException -> 0x00f0 }
            if (r1 == 0) goto L_0x00ea
            com.google.android.gms.internal.measurement.W r1 = r29.mo10385b()     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.internal.measurement.Y r1 = r1.mo10585y()     // Catch:{ SQLiteException -> 0x00f0 }
            java.lang.String r2 = "Got multiple records for conditional property, expected one"
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r30)     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.internal.measurement.U r4 = r29.mo10453n()     // Catch:{ SQLiteException -> 0x00f0 }
            java.lang.String r4 = r4.mo10559c(r7)     // Catch:{ SQLiteException -> 0x00f0 }
            r1.mo10594a(r2, r3, r4)     // Catch:{ SQLiteException -> 0x00f0 }
        L_0x00ea:
            if (r9 == 0) goto L_0x00ef
            r9.close()
        L_0x00ef:
            return r0
        L_0x00f0:
            r0 = move-exception
            goto L_0x0103
        L_0x00f2:
            r0 = move-exception
            r10 = r29
            goto L_0x0123
        L_0x00f6:
            r0 = move-exception
            r10 = r29
            goto L_0x0103
        L_0x00fa:
            r0 = move-exception
            r10 = r29
            r9 = r8
            goto L_0x0123
        L_0x00ff:
            r0 = move-exception
            r10 = r29
            r9 = r8
        L_0x0103:
            com.google.android.gms.internal.measurement.W r1 = r29.mo10385b()     // Catch:{ all -> 0x0122 }
            com.google.android.gms.internal.measurement.Y r1 = r1.mo10585y()     // Catch:{ all -> 0x0122 }
            java.lang.String r2 = "Error querying conditional property"
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r30)     // Catch:{ all -> 0x0122 }
            com.google.android.gms.internal.measurement.U r4 = r29.mo10453n()     // Catch:{ all -> 0x0122 }
            java.lang.String r4 = r4.mo10559c(r7)     // Catch:{ all -> 0x0122 }
            r1.mo10595a(r2, r3, r4, r0)     // Catch:{ all -> 0x0122 }
            if (r9 == 0) goto L_0x0121
            r9.close()
        L_0x0121:
            return r8
        L_0x0122:
            r0 = move-exception
        L_0x0123:
            if (r9 == 0) goto L_0x0128
            r9.close()
        L_0x0128:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3920z.mo11085e(java.lang.String, java.lang.String):com.google.android.gms.internal.measurement.zzed");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0098  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, com.google.android.gms.internal.measurement.C3729Dc> mo11086e(java.lang.String r12) {
        /*
            r11 = this;
            r11.mo10685v()
            r11.mo10451d()
            com.google.android.gms.common.internal.C2061y.m9076b((java.lang.String) r12)
            android.database.sqlite.SQLiteDatabase r0 = r11.mo11051A()
            r8 = 0
            java.lang.String r1 = "audience_filter_values"
            java.lang.String r2 = "audience_id"
            java.lang.String r3 = "current_results"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}     // Catch:{ SQLiteException -> 0x007c, all -> 0x0079 }
            java.lang.String r3 = "app_id=?"
            r9 = 1
            java.lang.String[] r4 = new java.lang.String[r9]     // Catch:{ SQLiteException -> 0x007c, all -> 0x0079 }
            r10 = 0
            r4[r10] = r12     // Catch:{ SQLiteException -> 0x007c, all -> 0x0079 }
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ SQLiteException -> 0x007c, all -> 0x0079 }
            boolean r1 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x0077 }
            if (r1 != 0) goto L_0x0033
            if (r0 == 0) goto L_0x0032
            r0.close()
        L_0x0032:
            return r8
        L_0x0033:
            b.b.h.h.b r1 = new b.b.h.h.b     // Catch:{ SQLiteException -> 0x0077 }
            r1.<init>()     // Catch:{ SQLiteException -> 0x0077 }
        L_0x0038:
            int r2 = r0.getInt(r10)     // Catch:{ SQLiteException -> 0x0077 }
            byte[] r3 = r0.getBlob(r9)     // Catch:{ SQLiteException -> 0x0077 }
            int r4 = r3.length     // Catch:{ SQLiteException -> 0x0077 }
            com.google.android.gms.internal.measurement.a r3 = com.google.android.gms.internal.measurement.C3820a.m15286a(r3, r10, r4)     // Catch:{ SQLiteException -> 0x0077 }
            com.google.android.gms.internal.measurement.Dc r4 = new com.google.android.gms.internal.measurement.Dc     // Catch:{ SQLiteException -> 0x0077 }
            r4.<init>()     // Catch:{ SQLiteException -> 0x0077 }
            r4.mo10404a((com.google.android.gms.internal.measurement.C3820a) r3)     // Catch:{ IOException -> 0x0055 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0077 }
            r1.put(r2, r4)     // Catch:{ SQLiteException -> 0x0077 }
            goto L_0x006b
        L_0x0055:
            r3 = move-exception
            com.google.android.gms.internal.measurement.W r4 = r11.mo10385b()     // Catch:{ SQLiteException -> 0x0077 }
            com.google.android.gms.internal.measurement.Y r4 = r4.mo10585y()     // Catch:{ SQLiteException -> 0x0077 }
            java.lang.String r5 = "Failed to merge filter results. appId, audienceId, error"
            java.lang.Object r6 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r12)     // Catch:{ SQLiteException -> 0x0077 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0077 }
            r4.mo10595a(r5, r6, r2, r3)     // Catch:{ SQLiteException -> 0x0077 }
        L_0x006b:
            boolean r2 = r0.moveToNext()     // Catch:{ SQLiteException -> 0x0077 }
            if (r2 != 0) goto L_0x0038
            if (r0 == 0) goto L_0x0076
            r0.close()
        L_0x0076:
            return r1
        L_0x0077:
            r1 = move-exception
            goto L_0x007e
        L_0x0079:
            r12 = move-exception
            r0 = r8
            goto L_0x0096
        L_0x007c:
            r1 = move-exception
            r0 = r8
        L_0x007e:
            com.google.android.gms.internal.measurement.W r2 = r11.mo10385b()     // Catch:{ all -> 0x0095 }
            com.google.android.gms.internal.measurement.Y r2 = r2.mo10585y()     // Catch:{ all -> 0x0095 }
            java.lang.String r3 = "Database error querying filter results. appId"
            java.lang.Object r12 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r12)     // Catch:{ all -> 0x0095 }
            r2.mo10594a(r3, r12, r1)     // Catch:{ all -> 0x0095 }
            if (r0 == 0) goto L_0x0094
            r0.close()
        L_0x0094:
            return r8
        L_0x0095:
            r12 = move-exception
        L_0x0096:
            if (r0 == 0) goto L_0x009b
            r0.close()
        L_0x009b:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3920z.mo11086e(java.lang.String):java.util.Map");
    }

    /* renamed from: f */
    public final int mo11087f(String str, String str2) {
        C2061y.m9076b(str);
        C2061y.m9076b(str2);
        mo10451d();
        mo10685v();
        try {
            return mo11051A().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            mo10385b().mo10585y().mo10595a("Error deleting conditional property", C3801W.m15166a(str), mo10453n().mo10559c(str2), e);
            return 0;
        }
    }

    /* renamed from: f */
    public final long mo11088f(String str) {
        C2061y.m9076b(str);
        return m15884a("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b2  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.C3887qc>> mo11089g(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.mo10685v()
            r12.mo10451d()
            com.google.android.gms.common.internal.C2061y.m9076b((java.lang.String) r13)
            com.google.android.gms.common.internal.C2061y.m9076b((java.lang.String) r14)
            b.b.h.h.b r0 = new b.b.h.h.b
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.mo11051A()
            r9 = 0
            java.lang.String r2 = "event_filters"
            java.lang.String r3 = "audience_id"
            java.lang.String r4 = "data"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch:{ SQLiteException -> 0x0096, all -> 0x0093 }
            java.lang.String r4 = "app_id=? AND event_name=?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0096, all -> 0x0093 }
            r10 = 0
            r5[r10] = r13     // Catch:{ SQLiteException -> 0x0096, all -> 0x0093 }
            r11 = 1
            r5[r11] = r14     // Catch:{ SQLiteException -> 0x0096, all -> 0x0093 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0096, all -> 0x0093 }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0091 }
            if (r1 != 0) goto L_0x0042
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0091 }
            if (r14 == 0) goto L_0x0041
            r14.close()
        L_0x0041:
            return r13
        L_0x0042:
            byte[] r1 = r14.getBlob(r11)     // Catch:{ SQLiteException -> 0x0091 }
            int r2 = r1.length     // Catch:{ SQLiteException -> 0x0091 }
            com.google.android.gms.internal.measurement.a r1 = com.google.android.gms.internal.measurement.C3820a.m15286a(r1, r10, r2)     // Catch:{ SQLiteException -> 0x0091 }
            com.google.android.gms.internal.measurement.qc r2 = new com.google.android.gms.internal.measurement.qc     // Catch:{ SQLiteException -> 0x0091 }
            r2.<init>()     // Catch:{ SQLiteException -> 0x0091 }
            r2.mo10404a((com.google.android.gms.internal.measurement.C3820a) r1)     // Catch:{ IOException -> 0x0073 }
            int r1 = r14.getInt(r10)     // Catch:{ SQLiteException -> 0x0091 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch:{ SQLiteException -> 0x0091 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ SQLiteException -> 0x0091 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ SQLiteException -> 0x0091 }
            if (r3 != 0) goto L_0x006f
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0091 }
            r3.<init>()     // Catch:{ SQLiteException -> 0x0091 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ SQLiteException -> 0x0091 }
            r0.put(r1, r3)     // Catch:{ SQLiteException -> 0x0091 }
        L_0x006f:
            r3.add(r2)     // Catch:{ SQLiteException -> 0x0091 }
            goto L_0x0085
        L_0x0073:
            r1 = move-exception
            com.google.android.gms.internal.measurement.W r2 = r12.mo10385b()     // Catch:{ SQLiteException -> 0x0091 }
            com.google.android.gms.internal.measurement.Y r2 = r2.mo10585y()     // Catch:{ SQLiteException -> 0x0091 }
            java.lang.String r3 = "Failed to merge filter. appId"
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r13)     // Catch:{ SQLiteException -> 0x0091 }
            r2.mo10594a(r3, r4, r1)     // Catch:{ SQLiteException -> 0x0091 }
        L_0x0085:
            boolean r1 = r14.moveToNext()     // Catch:{ SQLiteException -> 0x0091 }
            if (r1 != 0) goto L_0x0042
            if (r14 == 0) goto L_0x0090
            r14.close()
        L_0x0090:
            return r0
        L_0x0091:
            r0 = move-exception
            goto L_0x0098
        L_0x0093:
            r13 = move-exception
            r14 = r9
            goto L_0x00b0
        L_0x0096:
            r0 = move-exception
            r14 = r9
        L_0x0098:
            com.google.android.gms.internal.measurement.W r1 = r12.mo10385b()     // Catch:{ all -> 0x00af }
            com.google.android.gms.internal.measurement.Y r1 = r1.mo10585y()     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r13)     // Catch:{ all -> 0x00af }
            r1.mo10594a(r2, r13, r0)     // Catch:{ all -> 0x00af }
            if (r14 == 0) goto L_0x00ae
            r14.close()
        L_0x00ae:
            return r9
        L_0x00af:
            r13 = move-exception
        L_0x00b0:
            if (r14 == 0) goto L_0x00b5
            r14.close()
        L_0x00b5:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3920z.mo11089g(java.lang.String, java.lang.String):java.util.Map");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b2  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.C3899tc>> mo11090h(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.mo10685v()
            r12.mo10451d()
            com.google.android.gms.common.internal.C2061y.m9076b((java.lang.String) r13)
            com.google.android.gms.common.internal.C2061y.m9076b((java.lang.String) r14)
            b.b.h.h.b r0 = new b.b.h.h.b
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.mo11051A()
            r9 = 0
            java.lang.String r2 = "property_filters"
            java.lang.String r3 = "audience_id"
            java.lang.String r4 = "data"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch:{ SQLiteException -> 0x0096, all -> 0x0093 }
            java.lang.String r4 = "app_id=? AND property_name=?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0096, all -> 0x0093 }
            r10 = 0
            r5[r10] = r13     // Catch:{ SQLiteException -> 0x0096, all -> 0x0093 }
            r11 = 1
            r5[r11] = r14     // Catch:{ SQLiteException -> 0x0096, all -> 0x0093 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0096, all -> 0x0093 }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0091 }
            if (r1 != 0) goto L_0x0042
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0091 }
            if (r14 == 0) goto L_0x0041
            r14.close()
        L_0x0041:
            return r13
        L_0x0042:
            byte[] r1 = r14.getBlob(r11)     // Catch:{ SQLiteException -> 0x0091 }
            int r2 = r1.length     // Catch:{ SQLiteException -> 0x0091 }
            com.google.android.gms.internal.measurement.a r1 = com.google.android.gms.internal.measurement.C3820a.m15286a(r1, r10, r2)     // Catch:{ SQLiteException -> 0x0091 }
            com.google.android.gms.internal.measurement.tc r2 = new com.google.android.gms.internal.measurement.tc     // Catch:{ SQLiteException -> 0x0091 }
            r2.<init>()     // Catch:{ SQLiteException -> 0x0091 }
            r2.mo10404a((com.google.android.gms.internal.measurement.C3820a) r1)     // Catch:{ IOException -> 0x0073 }
            int r1 = r14.getInt(r10)     // Catch:{ SQLiteException -> 0x0091 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch:{ SQLiteException -> 0x0091 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ SQLiteException -> 0x0091 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ SQLiteException -> 0x0091 }
            if (r3 != 0) goto L_0x006f
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0091 }
            r3.<init>()     // Catch:{ SQLiteException -> 0x0091 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ SQLiteException -> 0x0091 }
            r0.put(r1, r3)     // Catch:{ SQLiteException -> 0x0091 }
        L_0x006f:
            r3.add(r2)     // Catch:{ SQLiteException -> 0x0091 }
            goto L_0x0085
        L_0x0073:
            r1 = move-exception
            com.google.android.gms.internal.measurement.W r2 = r12.mo10385b()     // Catch:{ SQLiteException -> 0x0091 }
            com.google.android.gms.internal.measurement.Y r2 = r2.mo10585y()     // Catch:{ SQLiteException -> 0x0091 }
            java.lang.String r3 = "Failed to merge filter"
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r13)     // Catch:{ SQLiteException -> 0x0091 }
            r2.mo10594a(r3, r4, r1)     // Catch:{ SQLiteException -> 0x0091 }
        L_0x0085:
            boolean r1 = r14.moveToNext()     // Catch:{ SQLiteException -> 0x0091 }
            if (r1 != 0) goto L_0x0042
            if (r14 == 0) goto L_0x0090
            r14.close()
        L_0x0090:
            return r0
        L_0x0091:
            r0 = move-exception
            goto L_0x0098
        L_0x0093:
            r13 = move-exception
            r14 = r9
            goto L_0x00b0
        L_0x0096:
            r0 = move-exception
            r14 = r9
        L_0x0098:
            com.google.android.gms.internal.measurement.W r1 = r12.mo10385b()     // Catch:{ all -> 0x00af }
            com.google.android.gms.internal.measurement.Y r1 = r1.mo10585y()     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r13)     // Catch:{ all -> 0x00af }
            r1.mo10594a(r2, r13, r0)     // Catch:{ all -> 0x00af }
            if (r14 == 0) goto L_0x00ae
            r14.close()
        L_0x00ae:
            return r9
        L_0x00af:
            r13 = move-exception
        L_0x00b0:
            if (r14 == 0) goto L_0x00b5
            r14.close()
        L_0x00b5:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3920z.mo11090h(java.lang.String, java.lang.String):java.util.Map");
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final long mo11091i(String str, String str2) {
        long j;
        C2061y.m9076b(str);
        C2061y.m9076b(str2);
        mo10451d();
        mo10685v();
        SQLiteDatabase A = mo11051A();
        A.beginTransaction();
        try {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 32);
            sb.append("select ");
            sb.append(str2);
            sb.append(" from app2 where app_id=?");
            j = m15884a(sb.toString(), new String[]{str}, -1);
            if (j == -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("first_open_count", 0);
                contentValues.put("previous_install_count", 0);
                if (A.insertWithOnConflict("app2", (String) null, contentValues, 5) == -1) {
                    mo10385b().mo10585y().mo10594a("Failed to insert column (got -1). appId", C3801W.m15166a(str), str2);
                    A.endTransaction();
                    return -1;
                }
                j = 0;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str);
                contentValues2.put(str2, Long.valueOf(1 + j));
                if (((long) A.update("app2", contentValues2, "app_id = ?", new String[]{str})) == 0) {
                    mo10385b().mo10585y().mo10594a("Failed to update column (got 0). appId", C3801W.m15166a(str), str2);
                    A.endTransaction();
                    return -1;
                }
                A.setTransactionSuccessful();
                A.endTransaction();
                return j;
            } catch (SQLiteException e) {
                e = e;
            }
        } catch (SQLiteException e2) {
            e = e2;
            j = 0;
            try {
                mo10385b().mo10585y().mo10595a("Error inserting column. appId", C3801W.m15166a(str), str2, e);
                A.endTransaction();
                return j;
            } catch (Throwable th) {
                A.endTransaction();
                throw th;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final boolean mo10657w() {
        return false;
    }

    /* renamed from: y */
    public final void mo11092y() {
        mo10685v();
        mo11051A().beginTransaction();
    }

    /* renamed from: z */
    public final void mo11093z() {
        mo10685v();
        mo11051A().endTransaction();
    }
}
