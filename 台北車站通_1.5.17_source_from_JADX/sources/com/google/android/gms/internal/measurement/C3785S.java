package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.util.C2083e;

/* renamed from: com.google.android.gms.internal.measurement.S */
public final class C3785S extends C3802Wa {

    /* renamed from: c */
    private final C3789T f11302c = new C3789T(this, getContext(), "google_app_measurement_local.db");

    /* renamed from: d */
    private boolean f11303d;

    C3785S(C3715Aa aa) {
        super(aa);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r8v2, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r8v3, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: type inference failed for: r8v11 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c9, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x012b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[ExcHandler: SQLiteDatabaseLockedException (unused android.database.sqlite.SQLiteDatabaseLockedException), SYNTHETIC, Splitter:B:9:0x002f] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00da A[SYNTHETIC, Splitter:B:55:0x00da] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x012b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x012b A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m15066a(int r17, byte[] r18) {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r2 = "Error writing entry to local database"
            r16.mo10451d()
            boolean r0 = r1.f11303d
            r3 = 0
            if (r0 == 0) goto L_0x000d
            return r3
        L_0x000d:
            android.content.ContentValues r4 = new android.content.ContentValues
            r4.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            java.lang.String r5 = "type"
            r4.put(r5, r0)
            java.lang.String r0 = "entry"
            r5 = r18
            r4.put(r0, r5)
            r5 = 5
            r6 = r3
            r7 = r5
        L_0x0025:
            if (r6 >= r5) goto L_0x013e
            r8 = 0
            r9 = 1
            android.database.sqlite.SQLiteDatabase r10 = r16.m15067z()     // Catch:{ SQLiteFullException -> 0x0112, SQLiteDatabaseLockedException -> 0x00ff, SQLiteException -> 0x00d5, all -> 0x00cf }
            if (r10 != 0) goto L_0x003e
            r1.f11303d = r9     // Catch:{ SQLiteFullException -> 0x003b, SQLiteDatabaseLockedException -> 0x00c9, SQLiteException -> 0x0037 }
            if (r10 == 0) goto L_0x0036
            r10.close()
        L_0x0036:
            return r3
        L_0x0037:
            r0 = move-exception
            r13 = r8
            goto L_0x00c7
        L_0x003b:
            r0 = move-exception
            goto L_0x0115
        L_0x003e:
            r10.beginTransaction()     // Catch:{ SQLiteFullException -> 0x00cc, SQLiteDatabaseLockedException -> 0x00c9, SQLiteException -> 0x00c4, all -> 0x00bf }
            r11 = 0
            java.lang.String r0 = "select count(1) from messages"
            android.database.Cursor r13 = r10.rawQuery(r0, r8)     // Catch:{ SQLiteFullException -> 0x00cc, SQLiteDatabaseLockedException -> 0x00c9, SQLiteException -> 0x00c4, all -> 0x00bf }
            if (r13 == 0) goto L_0x0060
            boolean r0 = r13.moveToFirst()     // Catch:{ SQLiteFullException -> 0x005c, SQLiteDatabaseLockedException -> 0x00bd, SQLiteException -> 0x0059, all -> 0x0056 }
            if (r0 == 0) goto L_0x0060
            long r11 = r13.getLong(r3)     // Catch:{ SQLiteFullException -> 0x005c, SQLiteDatabaseLockedException -> 0x00bd, SQLiteException -> 0x0059, all -> 0x0056 }
            goto L_0x0060
        L_0x0056:
            r0 = move-exception
            goto L_0x0133
        L_0x0059:
            r0 = move-exception
            goto L_0x00c7
        L_0x005c:
            r0 = move-exception
            r8 = r13
            goto L_0x0115
        L_0x0060:
            r14 = 100000(0x186a0, double:4.94066E-319)
            int r0 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            java.lang.String r5 = "messages"
            if (r0 < 0) goto L_0x00a7
            com.google.android.gms.internal.measurement.W r0 = r16.mo10385b()     // Catch:{ SQLiteFullException -> 0x005c, SQLiteDatabaseLockedException -> 0x00bd, SQLiteException -> 0x0059, all -> 0x0056 }
            com.google.android.gms.internal.measurement.Y r0 = r0.mo10585y()     // Catch:{ SQLiteFullException -> 0x005c, SQLiteDatabaseLockedException -> 0x00bd, SQLiteException -> 0x0059, all -> 0x0056 }
            java.lang.String r8 = "Data loss, local db full"
            r0.mo10592a(r8)     // Catch:{ SQLiteFullException -> 0x005c, SQLiteDatabaseLockedException -> 0x00bd, SQLiteException -> 0x0059, all -> 0x0056 }
            long r14 = r14 - r11
            r11 = 1
            long r14 = r14 + r11
            java.lang.String r0 = "rowid in (select rowid from messages order by rowid asc limit ?)"
            java.lang.String[] r8 = new java.lang.String[r9]     // Catch:{ SQLiteFullException -> 0x005c, SQLiteDatabaseLockedException -> 0x00bd, SQLiteException -> 0x0059, all -> 0x0056 }
            java.lang.String r11 = java.lang.Long.toString(r14)     // Catch:{ SQLiteFullException -> 0x005c, SQLiteDatabaseLockedException -> 0x00bd, SQLiteException -> 0x0059, all -> 0x0056 }
            r8[r3] = r11     // Catch:{ SQLiteFullException -> 0x005c, SQLiteDatabaseLockedException -> 0x00bd, SQLiteException -> 0x0059, all -> 0x0056 }
            int r0 = r10.delete(r5, r0, r8)     // Catch:{ SQLiteFullException -> 0x005c, SQLiteDatabaseLockedException -> 0x00bd, SQLiteException -> 0x0059, all -> 0x0056 }
            long r11 = (long) r0     // Catch:{ SQLiteFullException -> 0x005c, SQLiteDatabaseLockedException -> 0x00bd, SQLiteException -> 0x0059, all -> 0x0056 }
            int r0 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x00a7
            com.google.android.gms.internal.measurement.W r0 = r16.mo10385b()     // Catch:{ SQLiteFullException -> 0x005c, SQLiteDatabaseLockedException -> 0x00bd, SQLiteException -> 0x0059, all -> 0x0056 }
            com.google.android.gms.internal.measurement.Y r0 = r0.mo10585y()     // Catch:{ SQLiteFullException -> 0x005c, SQLiteDatabaseLockedException -> 0x00bd, SQLiteException -> 0x0059, all -> 0x0056 }
            java.lang.String r8 = "Different delete count than expected in local db. expected, received, difference"
            java.lang.Long r3 = java.lang.Long.valueOf(r14)     // Catch:{ SQLiteFullException -> 0x005c, SQLiteDatabaseLockedException -> 0x00bd, SQLiteException -> 0x0059, all -> 0x0056 }
            java.lang.Long r9 = java.lang.Long.valueOf(r11)     // Catch:{ SQLiteFullException -> 0x005c, SQLiteDatabaseLockedException -> 0x00bd, SQLiteException -> 0x0059, all -> 0x0056 }
            long r14 = r14 - r11
            java.lang.Long r11 = java.lang.Long.valueOf(r14)     // Catch:{ SQLiteFullException -> 0x005c, SQLiteDatabaseLockedException -> 0x00bd, SQLiteException -> 0x0059, all -> 0x0056 }
            r0.mo10595a(r8, r3, r9, r11)     // Catch:{ SQLiteFullException -> 0x005c, SQLiteDatabaseLockedException -> 0x00bd, SQLiteException -> 0x0059, all -> 0x0056 }
        L_0x00a7:
            r3 = 0
            r10.insertOrThrow(r5, r3, r4)     // Catch:{ SQLiteFullException -> 0x005c, SQLiteDatabaseLockedException -> 0x00bd, SQLiteException -> 0x0059, all -> 0x0056 }
            r10.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x005c, SQLiteDatabaseLockedException -> 0x00bd, SQLiteException -> 0x0059, all -> 0x0056 }
            r10.endTransaction()     // Catch:{ SQLiteFullException -> 0x005c, SQLiteDatabaseLockedException -> 0x00bd, SQLiteException -> 0x0059, all -> 0x0056 }
            if (r13 == 0) goto L_0x00b6
            r13.close()
        L_0x00b6:
            if (r10 == 0) goto L_0x00bb
            r10.close()
        L_0x00bb:
            r2 = 1
            return r2
        L_0x00bd:
            r8 = r13
            goto L_0x0101
        L_0x00bf:
            r0 = move-exception
            r3 = r8
            r13 = r3
            goto L_0x0133
        L_0x00c4:
            r0 = move-exception
            r3 = r8
            r13 = r3
        L_0x00c7:
            r8 = r10
            goto L_0x00d8
        L_0x00c9:
            r3 = r8
            r8 = r3
            goto L_0x0101
        L_0x00cc:
            r0 = move-exception
            r3 = r8
            goto L_0x0115
        L_0x00cf:
            r0 = move-exception
            r3 = r8
            r10 = r3
            r13 = r10
            goto L_0x0133
        L_0x00d5:
            r0 = move-exception
            r3 = r8
            r13 = r8
        L_0x00d8:
            if (r8 == 0) goto L_0x00e3
            boolean r3 = r8.inTransaction()     // Catch:{ all -> 0x00fc }
            if (r3 == 0) goto L_0x00e3
            r8.endTransaction()     // Catch:{ all -> 0x00fc }
        L_0x00e3:
            com.google.android.gms.internal.measurement.W r3 = r16.mo10385b()     // Catch:{ all -> 0x00fc }
            com.google.android.gms.internal.measurement.Y r3 = r3.mo10585y()     // Catch:{ all -> 0x00fc }
            r3.mo10593a(r2, r0)     // Catch:{ all -> 0x00fc }
            r3 = 1
            r1.f11303d = r3     // Catch:{ all -> 0x00fc }
            if (r13 == 0) goto L_0x00f6
            r13.close()
        L_0x00f6:
            if (r8 == 0) goto L_0x012b
            r8.close()
            goto L_0x012b
        L_0x00fc:
            r0 = move-exception
            r10 = r8
            goto L_0x0133
        L_0x00ff:
            r3 = r8
            r10 = r8
        L_0x0101:
            long r11 = (long) r7
            android.os.SystemClock.sleep(r11)     // Catch:{ all -> 0x0131 }
            int r7 = r7 + 20
            if (r8 == 0) goto L_0x010c
            r8.close()
        L_0x010c:
            if (r10 == 0) goto L_0x012b
        L_0x010e:
            r10.close()
            goto L_0x012b
        L_0x0112:
            r0 = move-exception
            r3 = r8
            r10 = r8
        L_0x0115:
            com.google.android.gms.internal.measurement.W r3 = r16.mo10385b()     // Catch:{ all -> 0x0131 }
            com.google.android.gms.internal.measurement.Y r3 = r3.mo10585y()     // Catch:{ all -> 0x0131 }
            r3.mo10593a(r2, r0)     // Catch:{ all -> 0x0131 }
            r3 = 1
            r1.f11303d = r3     // Catch:{ all -> 0x0131 }
            if (r8 == 0) goto L_0x0128
            r8.close()
        L_0x0128:
            if (r10 == 0) goto L_0x012b
            goto L_0x010e
        L_0x012b:
            int r6 = r6 + 1
            r3 = 0
            r5 = 5
            goto L_0x0025
        L_0x0131:
            r0 = move-exception
            r13 = r8
        L_0x0133:
            if (r13 == 0) goto L_0x0138
            r13.close()
        L_0x0138:
            if (r10 == 0) goto L_0x013d
            r10.close()
        L_0x013d:
            throw r0
        L_0x013e:
            com.google.android.gms.internal.measurement.W r0 = r16.mo10385b()
            com.google.android.gms.internal.measurement.Y r0 = r0.mo10576B()
            java.lang.String r2 = "Failed to write entry to local database"
            r0.mo10592a(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3785S.m15066a(int, byte[]):boolean");
    }

    /* renamed from: z */
    private final SQLiteDatabase m15067z() {
        if (this.f11303d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f11302c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f11303d = true;
        return null;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2083e mo10382a() {
        return super.mo10382a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:57|58|59|60) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:72|73|74|75) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:42|43|44|45|158) */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x016f, code lost:
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        r10 = null;
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        r10 = null;
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0043, code lost:
        r10 = null;
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        mo10385b().mo10585y().mo10592a("Failed to load event from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r13.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        mo10385b().mo10585y().mo10592a("Failed to load user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r13.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        mo10385b().mo10585y().mo10592a("Failed to load user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        r13.recycle();
        r0 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x009f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00d1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:72:0x0102 */
    /* JADX WARNING: Removed duplicated region for block: B:102:? A[ExcHandler: SQLiteDatabaseLockedException (unused android.database.sqlite.SQLiteDatabaseLockedException), SYNTHETIC, Splitter:B:12:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x017f A[SYNTHETIC, Splitter:B:113:0x017f] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x01c8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01c8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x01c8 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable> mo10537a(int r20) {
        /*
            r19 = this;
            r1 = r19
            java.lang.String r2 = "Error reading entries from local database"
            r19.mo10451d()
            boolean r0 = r1.f11303d
            r3 = 0
            if (r0 == 0) goto L_0x000d
            return r3
        L_0x000d:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            android.content.Context r0 = r19.getContext()
            java.lang.String r5 = "google_app_measurement_local.db"
            java.io.File r0 = r0.getDatabasePath(r5)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0023
            return r4
        L_0x0023:
            r5 = 5
            r6 = 0
            r8 = r5
            r7 = r6
        L_0x0027:
            if (r7 >= r5) goto L_0x01d9
            r9 = 1
            android.database.sqlite.SQLiteDatabase r15 = r19.m15067z()     // Catch:{ SQLiteFullException -> 0x01b0, SQLiteDatabaseLockedException -> 0x019d, SQLiteException -> 0x017a, all -> 0x0176 }
            if (r15 != 0) goto L_0x0047
            r1.f11303d = r9     // Catch:{ SQLiteFullException -> 0x0042, SQLiteDatabaseLockedException -> 0x016f, SQLiteException -> 0x003d, all -> 0x0038 }
            if (r15 == 0) goto L_0x0037
            r15.close()
        L_0x0037:
            return r3
        L_0x0038:
            r0 = move-exception
            r10 = r3
            r5 = r15
            goto L_0x01ce
        L_0x003d:
            r0 = move-exception
            r10 = r3
            r5 = r15
            goto L_0x017d
        L_0x0042:
            r0 = move-exception
            r10 = r3
            r5 = r15
            goto L_0x01b3
        L_0x0047:
            r15.beginTransaction()     // Catch:{ SQLiteFullException -> 0x0172, SQLiteDatabaseLockedException -> 0x016f, SQLiteException -> 0x016b, all -> 0x0166 }
            java.lang.String r11 = "messages"
            java.lang.String r0 = "rowid"
            java.lang.String r10 = "type"
            java.lang.String r12 = "entry"
            java.lang.String[] r12 = new java.lang.String[]{r0, r10, r12}     // Catch:{ SQLiteFullException -> 0x0172, SQLiteDatabaseLockedException -> 0x016f, SQLiteException -> 0x016b, all -> 0x0166 }
            r13 = 0
            r14 = 0
            r0 = 0
            r16 = 0
            java.lang.String r17 = "rowid asc"
            r10 = 100
            java.lang.String r18 = java.lang.Integer.toString(r10)     // Catch:{ SQLiteFullException -> 0x0172, SQLiteDatabaseLockedException -> 0x016f, SQLiteException -> 0x016b, all -> 0x0166 }
            r10 = r15
            r5 = r15
            r15 = r0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLiteFullException -> 0x0164, SQLiteDatabaseLockedException -> 0x0170, SQLiteException -> 0x0162, all -> 0x0160 }
            r11 = -1
        L_0x006c:
            boolean r0 = r10.moveToNext()     // Catch:{ SQLiteFullException -> 0x015d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x015b }
            if (r0 == 0) goto L_0x0127
            long r11 = r10.getLong(r6)     // Catch:{ SQLiteFullException -> 0x015d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x015b }
            int r0 = r10.getInt(r9)     // Catch:{ SQLiteFullException -> 0x015d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x015b }
            r13 = 2
            byte[] r14 = r10.getBlob(r13)     // Catch:{ SQLiteFullException -> 0x015d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x015b }
            if (r0 != 0) goto L_0x00b4
            android.os.Parcel r13 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x015d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x015b }
            int r0 = r14.length     // Catch:{ a -> 0x009f }
            r13.unmarshall(r14, r6, r0)     // Catch:{ a -> 0x009f }
            r13.setDataPosition(r6)     // Catch:{ a -> 0x009f }
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzeu> r0 = com.google.android.gms.internal.measurement.zzeu.CREATOR     // Catch:{ a -> 0x009f }
            java.lang.Object r0 = r0.createFromParcel(r13)     // Catch:{ a -> 0x009f }
            com.google.android.gms.internal.measurement.zzeu r0 = (com.google.android.gms.internal.measurement.zzeu) r0     // Catch:{ a -> 0x009f }
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x015d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x015b }
            if (r0 == 0) goto L_0x006c
        L_0x0099:
            r4.add(r0)     // Catch:{ SQLiteFullException -> 0x015d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x015b }
            goto L_0x006c
        L_0x009d:
            r0 = move-exception
            goto L_0x00b0
        L_0x009f:
            com.google.android.gms.internal.measurement.W r0 = r19.mo10385b()     // Catch:{ all -> 0x009d }
            com.google.android.gms.internal.measurement.Y r0 = r0.mo10585y()     // Catch:{ all -> 0x009d }
            java.lang.String r14 = "Failed to load event from local database"
            r0.mo10592a(r14)     // Catch:{ all -> 0x009d }
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x015d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x015b }
            goto L_0x006c
        L_0x00b0:
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x015d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x015b }
            throw r0     // Catch:{ SQLiteFullException -> 0x015d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x015b }
        L_0x00b4:
            java.lang.String r15 = "Failed to load user property from local database"
            if (r0 != r9) goto L_0x00e7
            android.os.Parcel r13 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x015d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x015b }
            int r0 = r14.length     // Catch:{ a -> 0x00d1 }
            r13.unmarshall(r14, r6, r0)     // Catch:{ a -> 0x00d1 }
            r13.setDataPosition(r6)     // Catch:{ a -> 0x00d1 }
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzjx> r0 = com.google.android.gms.internal.measurement.zzjx.CREATOR     // Catch:{ a -> 0x00d1 }
            java.lang.Object r0 = r0.createFromParcel(r13)     // Catch:{ a -> 0x00d1 }
            com.google.android.gms.internal.measurement.zzjx r0 = (com.google.android.gms.internal.measurement.zzjx) r0     // Catch:{ a -> 0x00d1 }
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x015d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x015b }
            goto L_0x00e0
        L_0x00cf:
            r0 = move-exception
            goto L_0x00e3
        L_0x00d1:
            com.google.android.gms.internal.measurement.W r0 = r19.mo10385b()     // Catch:{ all -> 0x00cf }
            com.google.android.gms.internal.measurement.Y r0 = r0.mo10585y()     // Catch:{ all -> 0x00cf }
            r0.mo10592a(r15)     // Catch:{ all -> 0x00cf }
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x015d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x015b }
            r0 = r3
        L_0x00e0:
            if (r0 == 0) goto L_0x006c
            goto L_0x0099
        L_0x00e3:
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x015d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x015b }
            throw r0     // Catch:{ SQLiteFullException -> 0x015d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x015b }
        L_0x00e7:
            if (r0 != r13) goto L_0x0118
            android.os.Parcel r13 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x015d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x015b }
            int r0 = r14.length     // Catch:{ a -> 0x0102 }
            r13.unmarshall(r14, r6, r0)     // Catch:{ a -> 0x0102 }
            r13.setDataPosition(r6)     // Catch:{ a -> 0x0102 }
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzed> r0 = com.google.android.gms.internal.measurement.zzed.CREATOR     // Catch:{ a -> 0x0102 }
            java.lang.Object r0 = r0.createFromParcel(r13)     // Catch:{ a -> 0x0102 }
            com.google.android.gms.internal.measurement.zzed r0 = (com.google.android.gms.internal.measurement.zzed) r0     // Catch:{ a -> 0x0102 }
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x015d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x015b }
            goto L_0x0111
        L_0x0100:
            r0 = move-exception
            goto L_0x0114
        L_0x0102:
            com.google.android.gms.internal.measurement.W r0 = r19.mo10385b()     // Catch:{ all -> 0x0100 }
            com.google.android.gms.internal.measurement.Y r0 = r0.mo10585y()     // Catch:{ all -> 0x0100 }
            r0.mo10592a(r15)     // Catch:{ all -> 0x0100 }
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x015d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x015b }
            r0 = r3
        L_0x0111:
            if (r0 == 0) goto L_0x006c
            goto L_0x0099
        L_0x0114:
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x015d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x015b }
            throw r0     // Catch:{ SQLiteFullException -> 0x015d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x015b }
        L_0x0118:
            com.google.android.gms.internal.measurement.W r0 = r19.mo10385b()     // Catch:{ SQLiteFullException -> 0x015d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x015b }
            com.google.android.gms.internal.measurement.Y r0 = r0.mo10585y()     // Catch:{ SQLiteFullException -> 0x015d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x015b }
            java.lang.String r13 = "Unknown record type in local database"
            r0.mo10592a(r13)     // Catch:{ SQLiteFullException -> 0x015d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x015b }
            goto L_0x006c
        L_0x0127:
            java.lang.String r0 = "messages"
            java.lang.String r13 = "rowid <= ?"
            java.lang.String[] r14 = new java.lang.String[r9]     // Catch:{ SQLiteFullException -> 0x015d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x015b }
            java.lang.String r11 = java.lang.Long.toString(r11)     // Catch:{ SQLiteFullException -> 0x015d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x015b }
            r14[r6] = r11     // Catch:{ SQLiteFullException -> 0x015d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x015b }
            int r0 = r5.delete(r0, r13, r14)     // Catch:{ SQLiteFullException -> 0x015d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x015b }
            int r11 = r4.size()     // Catch:{ SQLiteFullException -> 0x015d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x015b }
            if (r0 >= r11) goto L_0x014a
            com.google.android.gms.internal.measurement.W r0 = r19.mo10385b()     // Catch:{ SQLiteFullException -> 0x015d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x015b }
            com.google.android.gms.internal.measurement.Y r0 = r0.mo10585y()     // Catch:{ SQLiteFullException -> 0x015d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x015b }
            java.lang.String r11 = "Fewer entries removed from local database than expected"
            r0.mo10592a(r11)     // Catch:{ SQLiteFullException -> 0x015d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x015b }
        L_0x014a:
            r5.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x015d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x015b }
            r5.endTransaction()     // Catch:{ SQLiteFullException -> 0x015d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x015b }
            if (r10 == 0) goto L_0x0155
            r10.close()
        L_0x0155:
            if (r5 == 0) goto L_0x015a
            r5.close()
        L_0x015a:
            return r4
        L_0x015b:
            r0 = move-exception
            goto L_0x017d
        L_0x015d:
            r0 = move-exception
            goto L_0x01b3
        L_0x0160:
            r0 = move-exception
            goto L_0x0168
        L_0x0162:
            r0 = move-exception
            goto L_0x016d
        L_0x0164:
            r0 = move-exception
            goto L_0x0174
        L_0x0166:
            r0 = move-exception
            r5 = r15
        L_0x0168:
            r10 = r3
            goto L_0x01ce
        L_0x016b:
            r0 = move-exception
            r5 = r15
        L_0x016d:
            r10 = r3
            goto L_0x017d
        L_0x016f:
            r5 = r15
        L_0x0170:
            r10 = r3
            goto L_0x019f
        L_0x0172:
            r0 = move-exception
            r5 = r15
        L_0x0174:
            r10 = r3
            goto L_0x01b3
        L_0x0176:
            r0 = move-exception
            r5 = r3
            r10 = r5
            goto L_0x01ce
        L_0x017a:
            r0 = move-exception
            r5 = r3
            r10 = r5
        L_0x017d:
            if (r5 == 0) goto L_0x0188
            boolean r11 = r5.inTransaction()     // Catch:{ all -> 0x01cd }
            if (r11 == 0) goto L_0x0188
            r5.endTransaction()     // Catch:{ all -> 0x01cd }
        L_0x0188:
            com.google.android.gms.internal.measurement.W r11 = r19.mo10385b()     // Catch:{ all -> 0x01cd }
            com.google.android.gms.internal.measurement.Y r11 = r11.mo10585y()     // Catch:{ all -> 0x01cd }
            r11.mo10593a(r2, r0)     // Catch:{ all -> 0x01cd }
            r1.f11303d = r9     // Catch:{ all -> 0x01cd }
            if (r10 == 0) goto L_0x019a
            r10.close()
        L_0x019a:
            if (r5 == 0) goto L_0x01c8
            goto L_0x01ac
        L_0x019d:
            r5 = r3
            r10 = r5
        L_0x019f:
            long r11 = (long) r8
            android.os.SystemClock.sleep(r11)     // Catch:{ all -> 0x01cd }
            int r8 = r8 + 20
            if (r10 == 0) goto L_0x01aa
            r10.close()
        L_0x01aa:
            if (r5 == 0) goto L_0x01c8
        L_0x01ac:
            r5.close()
            goto L_0x01c8
        L_0x01b0:
            r0 = move-exception
            r5 = r3
            r10 = r5
        L_0x01b3:
            com.google.android.gms.internal.measurement.W r11 = r19.mo10385b()     // Catch:{ all -> 0x01cd }
            com.google.android.gms.internal.measurement.Y r11 = r11.mo10585y()     // Catch:{ all -> 0x01cd }
            r11.mo10593a(r2, r0)     // Catch:{ all -> 0x01cd }
            r1.f11303d = r9     // Catch:{ all -> 0x01cd }
            if (r10 == 0) goto L_0x01c5
            r10.close()
        L_0x01c5:
            if (r5 == 0) goto L_0x01c8
            goto L_0x01ac
        L_0x01c8:
            int r7 = r7 + 1
            r5 = 5
            goto L_0x0027
        L_0x01cd:
            r0 = move-exception
        L_0x01ce:
            if (r10 == 0) goto L_0x01d3
            r10.close()
        L_0x01d3:
            if (r5 == 0) goto L_0x01d8
            r5.close()
        L_0x01d8:
            throw r0
        L_0x01d9:
            com.google.android.gms.internal.measurement.W r0 = r19.mo10385b()
            com.google.android.gms.internal.measurement.Y r0 = r0.mo10576B()
            java.lang.String r2 = "Failed to read events from database in reasonable time"
            r0.mo10592a(r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3785S.mo10537a(int):java.util.List");
    }

    /* renamed from: a */
    public final boolean mo10538a(zzed zzed) {
        mo10454o();
        byte[] a = C3871mc.m15520a((Parcelable) zzed);
        if (a.length <= 131072) {
            return m15066a(2, a);
        }
        mo10385b().mo10576B().mo10592a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    /* renamed from: a */
    public final boolean mo10539a(zzeu zzeu) {
        Parcel obtain = Parcel.obtain();
        zzeu.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return m15066a(0, marshall);
        }
        mo10385b().mo10576B().mo10592a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    /* renamed from: a */
    public final boolean mo10540a(zzjx zzjx) {
        Parcel obtain = Parcel.obtain();
        zzjx.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return m15066a(1, marshall);
        }
        mo10385b().mo10576B().mo10592a("User property too long for local database. Sending directly to service");
        return false;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C3801W mo10385b() {
        return super.mo10385b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3909wa mo10386c() {
        return super.mo10386c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo10451d() {
        super.mo10451d();
    }

    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C3734F mo10452j() {
        return super.mo10452j();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C3793U mo10453n() {
        return super.mo10453n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C3871mc mo10454o() {
        return super.mo10454o();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C3849ha mo10455q() {
        return super.mo10455q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C3908w mo10456r() {
        return super.mo10456r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final boolean mo10457u() {
        return false;
    }

    /* renamed from: y */
    public final void mo10541y() {
        mo10451d();
        try {
            int delete = m15067z().delete("messages", (String) null, (String[]) null) + 0;
            if (delete > 0) {
                mo10385b().mo10580F().mo10593a("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            mo10385b().mo10585y().mo10593a("Error resetting local analytics data. error", e);
        }
    }
}
