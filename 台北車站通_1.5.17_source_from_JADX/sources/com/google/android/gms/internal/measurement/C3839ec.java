package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.common.p072c.C1989c;
import com.google.android.gms.common.util.C2083e;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpStatus;
import p013b.p018b.p028h.p039h.C1080b;

/* renamed from: com.google.android.gms.internal.measurement.ec */
public class C3839ec implements C3900u {

    /* renamed from: a */
    C3905va f11425a;

    /* renamed from: b */
    C3821aa f11426b;

    /* renamed from: c */
    private C3920z f11427c;

    /* renamed from: d */
    private C3841fa f11428d;

    /* renamed from: e */
    private C3823ac f11429e;

    /* renamed from: f */
    private C3896t f11430f;

    /* renamed from: g */
    private C3715Aa f11431g;

    /* renamed from: h */
    private boolean f11432h = false;

    /* renamed from: i */
    private boolean f11433i;

    /* renamed from: j */
    private long f11434j;

    /* renamed from: k */
    private List<Runnable> f11435k;

    /* renamed from: l */
    private int f11436l;

    /* renamed from: m */
    private int f11437m;

    /* renamed from: n */
    private boolean f11438n;

    /* renamed from: o */
    private boolean f11439o;

    /* renamed from: p */
    private boolean f11440p;

    /* renamed from: q */
    private FileLock f11441q;

    /* renamed from: r */
    private FileChannel f11442r;

    /* renamed from: s */
    private List<Long> f11443s;

    /* renamed from: t */
    private List<Long> f11444t;

    /* renamed from: u */
    long f11445u;

    /* renamed from: A */
    private final boolean mo10373A() {
        mo10388e();
        mo10714n();
        return this.f11433i;
    }

    /* renamed from: a */
    private final int m15383a(FileChannel fileChannel) {
        mo10388e();
        if (fileChannel == null || !fileChannel.isOpen()) {
            mo10385b().mo10585y().mo10592a("Bad channel to read from");
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0);
            int read = fileChannel.read(allocate);
            if (read != 4) {
                if (read != -1) {
                    mo10385b().mo10576B().mo10593a("Unexpected data length. Bytes read", Integer.valueOf(read));
                }
                return 0;
            }
            allocate.flip();
            return allocate.getInt();
        } catch (IOException e) {
            mo10385b().mo10585y().mo10593a("Failed to read from channel", e);
            return 0;
        }
    }

    /* renamed from: a */
    private final zzdz m15385a(Context context, String str, String str2, boolean z, boolean z2, boolean z3, long j) {
        String str3;
        String str4;
        int i;
        String str5 = str;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            mo10385b().mo10585y().mo10592a("PackageManager is null, can not log app install information");
            return null;
        }
        try {
            str3 = packageManager.getInstallerPackageName(str5);
        } catch (IllegalArgumentException unused) {
            mo10385b().mo10585y().mo10593a("Error retrieving installer package name. appId", C3801W.m15166a(str));
            str3 = "Unknown";
        }
        if (str3 == null) {
            str3 = "manual_install";
        } else if ("com.android.vending".equals(str3)) {
            str3 = "";
        }
        String str6 = str3;
        try {
            PackageInfo b = C1989c.m8748b(context).mo7521b(str5, 0);
            if (b != null) {
                CharSequence b2 = C1989c.m8748b(context).mo7522b(str5);
                if (!TextUtils.isEmpty(b2)) {
                    String charSequence = b2.toString();
                }
                String str7 = b.versionName;
                i = b.versionCode;
                str4 = str7;
            } else {
                i = Integer.MIN_VALUE;
                str4 = "Unknown";
            }
            return new zzdz(str, str2, str4, (long) i, str6, 12451, mo10392h().mo10794b(context, str5), (String) null, z, false, "", 0, mo10394j().mo11011j(str5) ? j : 0, 0, z2, z3, false);
        } catch (PackageManager.NameNotFoundException unused2) {
            mo10385b().mo10585y().mo10594a("Error retrieving newly installed package info. appId, appName", C3801W.m15166a(str), "Unknown");
            return null;
        }
    }

    /* renamed from: a */
    private final void m15386a(C3888r rVar) {
        C1080b bVar;
        mo10388e();
        if (TextUtils.isEmpty(rVar.mo10901b())) {
            mo10702a(rVar.mo10912e(), HttpStatus.SC_NO_CONTENT, (Throwable) null, (byte[]) null, (Map<String, List<String>>) null);
            return;
        }
        String b = rVar.mo10901b();
        String a = rVar.mo10897a();
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder encodedAuthority = builder.scheme(C3758L.f11204k.mo10498a()).encodedAuthority(C3758L.f11205l.mo10498a());
        String valueOf = String.valueOf(b);
        encodedAuthority.path(valueOf.length() != 0 ? "config/app/".concat(valueOf) : new String("config/app/")).appendQueryParameter("app_instance_id", a).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", "12451");
        String uri = builder.build().toString();
        try {
            URL url = new URL(uri);
            mo10385b().mo10580F().mo10593a("Fetching remote configuration", rVar.mo10912e());
            C3911wc a2 = mo10395s().mo10983a(rVar.mo10912e());
            String b2 = mo10395s().mo10986b(rVar.mo10912e());
            if (a2 == null || TextUtils.isEmpty(b2)) {
                bVar = null;
            } else {
                C1080b bVar2 = new C1080b();
                bVar2.put(HttpHeaders.IF_MODIFIED_SINCE, b2);
                bVar = bVar2;
            }
            this.f11438n = true;
            C3821aa m = mo10713m();
            String e = rVar.mo10912e();
            C3847gc gcVar = new C3847gc(this);
            m.mo10451d();
            m.mo10685v();
            C2061y.m9067a(url);
            C2061y.m9067a(gcVar);
            m.mo10386c().mo11022b((Runnable) new C3837ea(m, e, url, (byte[]) null, bVar, gcVar));
        } catch (MalformedURLException unused) {
            mo10385b().mo10585y().mo10594a("Failed to parse config URL. Not fetching. appId", C3801W.m15166a(rVar.mo10912e()), uri);
        }
    }

    /* renamed from: a */
    private final boolean m15387a(int i, FileChannel fileChannel) {
        mo10388e();
        if (fileChannel == null || !fileChannel.isOpen()) {
            mo10385b().mo10585y().mo10592a("Bad channel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i);
        allocate.flip();
        try {
            fileChannel.truncate(0);
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                mo10385b().mo10585y().mo10593a("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e) {
            mo10385b().mo10585y().mo10593a("Failed to write to channel", e);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x022d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x022e, code lost:
        r1 = r0;
        r8 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0251, code lost:
        if (r8 != null) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0076, code lost:
        if (r4 != null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008e, code lost:
        r8 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x011b, code lost:
        if (r8 != null) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ac, code lost:
        if (r6 != null) goto L_0x01ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01fc, code lost:
        if (r6 != null) goto L_0x01ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x021b, code lost:
        if (r8 == null) goto L_0x0255;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x022d A[ExcHandler: all (r0v7 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r4 
      PHI: (r4v51 android.database.Cursor) = (r4v59 android.database.Cursor), (r4v63 android.database.Cursor), (r4v63 android.database.Cursor), (r4v63 android.database.Cursor), (r4v63 android.database.Cursor) binds: [B:38:0x00cb, B:16:0x0070, B:22:0x007d, B:24:0x0081, B:25:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:16:0x0070] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0259 A[Catch:{ SQLiteException -> 0x0aa3, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0267 A[Catch:{ SQLiteException -> 0x0aa3, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x051c A[Catch:{ SQLiteException -> 0x0aa3, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x05fe A[Catch:{ SQLiteException -> 0x0aa3, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x0616 A[Catch:{ SQLiteException -> 0x0aa3, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0636 A[Catch:{ SQLiteException -> 0x0aa3, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0760 A[Catch:{ SQLiteException -> 0x0aa3, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x076f A[Catch:{ SQLiteException -> 0x0aa3, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0772 A[Catch:{ SQLiteException -> 0x0aa3, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x0793 A[Catch:{ SQLiteException -> 0x0aa3, all -> 0x0ade }] */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x0ac6 A[SYNTHETIC, Splitter:B:412:0x0ac6] */
    /* JADX WARNING: Removed duplicated region for block: B:419:0x0ada A[SYNTHETIC, Splitter:B:419:0x0ada] */
    /* JADX WARNING: Removed duplicated region for block: B:441:0x0613 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010a A[Catch:{ SQLiteException -> 0x021f }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0122 A[SYNTHETIC, Splitter:B:55:0x0122] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:117:0x0255=Splitter:B:117:0x0255, B:20:0x0078=Splitter:B:20:0x0078, B:53:0x011d=Splitter:B:53:0x011d, B:73:0x01ae=Splitter:B:73:0x01ae} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m15388a(java.lang.String r38, long r39) {
        /*
            r37 = this;
            r1 = r37
            java.lang.String r2 = "_lte"
            com.google.android.gms.internal.measurement.z r3 = r37.mo10712l()
            r3.mo11092y()
            com.google.android.gms.internal.measurement.ic r3 = new com.google.android.gms.internal.measurement.ic     // Catch:{ all -> 0x0ade }
            r4 = 0
            r3.<init>(r1, r4)     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.z r5 = r37.mo10712l()     // Catch:{ all -> 0x0ade }
            long r6 = r1.f11445u     // Catch:{ all -> 0x0ade }
            com.google.android.gms.common.internal.C2061y.m9067a(r3)     // Catch:{ all -> 0x0ade }
            r5.mo10451d()     // Catch:{ all -> 0x0ade }
            r5.mo10685v()     // Catch:{ all -> 0x0ade }
            r8 = -1
            r10 = 2
            r11 = 0
            r12 = 1
            android.database.sqlite.SQLiteDatabase r15 = r5.mo11051A()     // Catch:{ SQLiteException -> 0x023c, all -> 0x0237 }
            boolean r13 = android.text.TextUtils.isEmpty(r4)     // Catch:{ SQLiteException -> 0x023c, all -> 0x0237 }
            java.lang.String r14 = ""
            if (r13 == 0) goto L_0x0091
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 == 0) goto L_0x0044
            java.lang.String[] r4 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x023c, all -> 0x0237 }
            java.lang.String r16 = java.lang.String.valueOf(r6)     // Catch:{ SQLiteException -> 0x023c, all -> 0x0237 }
            r4[r11] = r16     // Catch:{ SQLiteException -> 0x023c, all -> 0x0237 }
            java.lang.String r16 = java.lang.String.valueOf(r39)     // Catch:{ SQLiteException -> 0x023c, all -> 0x0237 }
            r4[r12] = r16     // Catch:{ SQLiteException -> 0x023c, all -> 0x0237 }
            goto L_0x004c
        L_0x0044:
            java.lang.String[] r4 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x023c, all -> 0x0237 }
            java.lang.String r16 = java.lang.String.valueOf(r39)     // Catch:{ SQLiteException -> 0x023c, all -> 0x0237 }
            r4[r11] = r16     // Catch:{ SQLiteException -> 0x023c, all -> 0x0237 }
        L_0x004c:
            if (r13 == 0) goto L_0x0050
            java.lang.String r14 = "rowid <= ? and "
        L_0x0050:
            int r13 = r14.length()     // Catch:{ SQLiteException -> 0x023c, all -> 0x0237 }
            int r13 = r13 + 148
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x023c, all -> 0x0237 }
            r10.<init>(r13)     // Catch:{ SQLiteException -> 0x023c, all -> 0x0237 }
            java.lang.String r13 = "select app_id, metadata_fingerprint from raw_events where "
            r10.append(r13)     // Catch:{ SQLiteException -> 0x023c, all -> 0x0237 }
            r10.append(r14)     // Catch:{ SQLiteException -> 0x023c, all -> 0x0237 }
            java.lang.String r13 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r10.append(r13)     // Catch:{ SQLiteException -> 0x023c, all -> 0x0237 }
            java.lang.String r10 = r10.toString()     // Catch:{ SQLiteException -> 0x023c, all -> 0x0237 }
            android.database.Cursor r4 = r15.rawQuery(r10, r4)     // Catch:{ SQLiteException -> 0x023c, all -> 0x0237 }
            boolean r10 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0232, all -> 0x022d }
            if (r10 != 0) goto L_0x007d
            if (r4 == 0) goto L_0x0255
        L_0x0078:
            r4.close()     // Catch:{ all -> 0x0ade }
            goto L_0x0255
        L_0x007d:
            java.lang.String r10 = r4.getString(r11)     // Catch:{ SQLiteException -> 0x0232, all -> 0x022d }
            java.lang.String r13 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x008d, all -> 0x022d }
            r4.close()     // Catch:{ SQLiteException -> 0x008d, all -> 0x022d }
            r22 = r4
            r4 = r10
            r10 = r13
            goto L_0x00df
        L_0x008d:
            r0 = move-exception
            r8 = r4
            goto L_0x0235
        L_0x0091:
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x00a2
            r10 = 2
            java.lang.String[] r13 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x023c, all -> 0x0237 }
            r10 = 0
            r13[r11] = r10     // Catch:{ SQLiteException -> 0x023c, all -> 0x0237 }
            java.lang.String r10 = java.lang.String.valueOf(r6)     // Catch:{ SQLiteException -> 0x023c, all -> 0x0237 }
            r13[r12] = r10     // Catch:{ SQLiteException -> 0x023c, all -> 0x0237 }
            goto L_0x00a7
        L_0x00a2:
            r10 = 0
            java.lang.String[] r13 = new java.lang.String[]{r10}     // Catch:{ SQLiteException -> 0x023c, all -> 0x0237 }
        L_0x00a7:
            if (r4 == 0) goto L_0x00ab
            java.lang.String r14 = " and rowid <= ?"
        L_0x00ab:
            int r4 = r14.length()     // Catch:{ SQLiteException -> 0x023c, all -> 0x0237 }
            int r4 = r4 + 84
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x023c, all -> 0x0237 }
            r10.<init>(r4)     // Catch:{ SQLiteException -> 0x023c, all -> 0x0237 }
            java.lang.String r4 = "select metadata_fingerprint from raw_events where app_id = ?"
            r10.append(r4)     // Catch:{ SQLiteException -> 0x023c, all -> 0x0237 }
            r10.append(r14)     // Catch:{ SQLiteException -> 0x023c, all -> 0x0237 }
            java.lang.String r4 = " order by rowid limit 1;"
            r10.append(r4)     // Catch:{ SQLiteException -> 0x023c, all -> 0x0237 }
            java.lang.String r4 = r10.toString()     // Catch:{ SQLiteException -> 0x023c, all -> 0x0237 }
            android.database.Cursor r4 = r15.rawQuery(r4, r13)     // Catch:{ SQLiteException -> 0x023c, all -> 0x0237 }
            boolean r10 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0232, all -> 0x022d }
            if (r10 != 0) goto L_0x00d4
            if (r4 == 0) goto L_0x0255
            goto L_0x0078
        L_0x00d4:
            java.lang.String r13 = r4.getString(r11)     // Catch:{ SQLiteException -> 0x0232, all -> 0x022d }
            r4.close()     // Catch:{ SQLiteException -> 0x0232, all -> 0x022d }
            r22 = r4
            r10 = r13
            r4 = 0
        L_0x00df:
            java.lang.String r14 = "raw_events_metadata"
            java.lang.String r13 = "metadata"
            java.lang.String[] r16 = new java.lang.String[]{r13}     // Catch:{ SQLiteException -> 0x0228, all -> 0x0222 }
            java.lang.String r17 = "app_id = ? and metadata_fingerprint = ?"
            r13 = 2
            java.lang.String[] r8 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x0228, all -> 0x0222 }
            r8[r11] = r4     // Catch:{ SQLiteException -> 0x0228, all -> 0x0222 }
            r8[r12] = r10     // Catch:{ SQLiteException -> 0x0228, all -> 0x0222 }
            r18 = 0
            r19 = 0
            java.lang.String r20 = "rowid"
            java.lang.String r21 = "2"
            r13 = r15
            r9 = r15
            r15 = r16
            r16 = r17
            r17 = r8
            android.database.Cursor r8 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ SQLiteException -> 0x0228, all -> 0x0222 }
            boolean r13 = r8.moveToFirst()     // Catch:{ SQLiteException -> 0x021f }
            if (r13 != 0) goto L_0x0122
            com.google.android.gms.internal.measurement.W r6 = r5.mo10385b()     // Catch:{ SQLiteException -> 0x021f }
            com.google.android.gms.internal.measurement.Y r6 = r6.mo10585y()     // Catch:{ SQLiteException -> 0x021f }
            java.lang.String r7 = "Raw event metadata record is missing. appId"
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r4)     // Catch:{ SQLiteException -> 0x021f }
            r6.mo10593a(r7, r9)     // Catch:{ SQLiteException -> 0x021f }
            if (r8 == 0) goto L_0x0255
        L_0x011d:
            r8.close()     // Catch:{ all -> 0x0ade }
            goto L_0x0255
        L_0x0122:
            byte[] r13 = r8.getBlob(r11)     // Catch:{ SQLiteException -> 0x021f }
            int r14 = r13.length     // Catch:{ SQLiteException -> 0x021f }
            com.google.android.gms.internal.measurement.a r13 = com.google.android.gms.internal.measurement.C3820a.m15286a(r13, r11, r14)     // Catch:{ SQLiteException -> 0x021f }
            com.google.android.gms.internal.measurement.Cc r14 = new com.google.android.gms.internal.measurement.Cc     // Catch:{ SQLiteException -> 0x021f }
            r14.<init>()     // Catch:{ SQLiteException -> 0x021f }
            r14.mo10404a((com.google.android.gms.internal.measurement.C3820a) r13)     // Catch:{ IOException -> 0x0208 }
            boolean r13 = r8.moveToNext()     // Catch:{ SQLiteException -> 0x021f }
            if (r13 == 0) goto L_0x014a
            com.google.android.gms.internal.measurement.W r13 = r5.mo10385b()     // Catch:{ SQLiteException -> 0x021f }
            com.google.android.gms.internal.measurement.Y r13 = r13.mo10576B()     // Catch:{ SQLiteException -> 0x021f }
            java.lang.String r15 = "Get multiple raw event metadata records, expected one. appId"
            java.lang.Object r12 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r4)     // Catch:{ SQLiteException -> 0x021f }
            r13.mo10593a(r15, r12)     // Catch:{ SQLiteException -> 0x021f }
        L_0x014a:
            r8.close()     // Catch:{ SQLiteException -> 0x021f }
            r3.mo10408a(r14)     // Catch:{ SQLiteException -> 0x021f }
            r12 = -1
            int r14 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            r12 = 3
            if (r14 == 0) goto L_0x016c
            java.lang.String r13 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            java.lang.String[] r14 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x021f }
            r14[r11] = r4     // Catch:{ SQLiteException -> 0x021f }
            r15 = 1
            r14[r15] = r10     // Catch:{ SQLiteException -> 0x021f }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ SQLiteException -> 0x021f }
            r7 = 2
            r14[r7] = r6     // Catch:{ SQLiteException -> 0x021f }
            r16 = r13
            r17 = r14
            goto L_0x017a
        L_0x016c:
            java.lang.String r6 = "app_id = ? and metadata_fingerprint = ?"
            r7 = 2
            java.lang.String[] r13 = new java.lang.String[r7]     // Catch:{ SQLiteException -> 0x021f }
            r13[r11] = r4     // Catch:{ SQLiteException -> 0x021f }
            r7 = 1
            r13[r7] = r10     // Catch:{ SQLiteException -> 0x021f }
            r16 = r6
            r17 = r13
        L_0x017a:
            java.lang.String r14 = "raw_events"
            java.lang.String r6 = "rowid"
            java.lang.String r7 = "name"
            java.lang.String r10 = "timestamp"
            java.lang.String r13 = "data"
            java.lang.String[] r15 = new java.lang.String[]{r6, r7, r10, r13}     // Catch:{ SQLiteException -> 0x021f }
            r18 = 0
            r19 = 0
            java.lang.String r20 = "rowid"
            r21 = 0
            r13 = r9
            android.database.Cursor r6 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ SQLiteException -> 0x021f }
            boolean r7 = r6.moveToFirst()     // Catch:{ SQLiteException -> 0x0204, all -> 0x01ff }
            if (r7 != 0) goto L_0x01b3
            com.google.android.gms.internal.measurement.W r7 = r5.mo10385b()     // Catch:{ SQLiteException -> 0x0204, all -> 0x01ff }
            com.google.android.gms.internal.measurement.Y r7 = r7.mo10576B()     // Catch:{ SQLiteException -> 0x0204, all -> 0x01ff }
            java.lang.String r8 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r4)     // Catch:{ SQLiteException -> 0x0204, all -> 0x01ff }
            r7.mo10593a(r8, r9)     // Catch:{ SQLiteException -> 0x0204, all -> 0x01ff }
            if (r6 == 0) goto L_0x0255
        L_0x01ae:
            r6.close()     // Catch:{ all -> 0x0ade }
            goto L_0x0255
        L_0x01b3:
            long r7 = r6.getLong(r11)     // Catch:{ SQLiteException -> 0x0204, all -> 0x01ff }
            byte[] r9 = r6.getBlob(r12)     // Catch:{ SQLiteException -> 0x0204, all -> 0x01ff }
            int r10 = r9.length     // Catch:{ SQLiteException -> 0x0204, all -> 0x01ff }
            com.google.android.gms.internal.measurement.a r9 = com.google.android.gms.internal.measurement.C3820a.m15286a(r9, r11, r10)     // Catch:{ SQLiteException -> 0x0204, all -> 0x01ff }
            com.google.android.gms.internal.measurement.zc r10 = new com.google.android.gms.internal.measurement.zc     // Catch:{ SQLiteException -> 0x0204, all -> 0x01ff }
            r10.<init>()     // Catch:{ SQLiteException -> 0x0204, all -> 0x01ff }
            r10.mo10404a((com.google.android.gms.internal.measurement.C3820a) r9)     // Catch:{ IOException -> 0x01e3 }
            r9 = 1
            java.lang.String r13 = r6.getString(r9)     // Catch:{ SQLiteException -> 0x0204, all -> 0x01ff }
            r10.f11748e = r13     // Catch:{ SQLiteException -> 0x0204, all -> 0x01ff }
            r9 = 2
            long r13 = r6.getLong(r9)     // Catch:{ SQLiteException -> 0x0204, all -> 0x01ff }
            java.lang.Long r9 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteException -> 0x0204, all -> 0x01ff }
            r10.f11749f = r9     // Catch:{ SQLiteException -> 0x0204, all -> 0x01ff }
            boolean r7 = r3.mo10409a(r7, r10)     // Catch:{ SQLiteException -> 0x0204, all -> 0x01ff }
            if (r7 != 0) goto L_0x01f6
            if (r6 == 0) goto L_0x0255
            goto L_0x01ae
        L_0x01e3:
            r0 = move-exception
            r7 = r0
            com.google.android.gms.internal.measurement.W r8 = r5.mo10385b()     // Catch:{ SQLiteException -> 0x0204, all -> 0x01ff }
            com.google.android.gms.internal.measurement.Y r8 = r8.mo10585y()     // Catch:{ SQLiteException -> 0x0204, all -> 0x01ff }
            java.lang.String r9 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r10 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r4)     // Catch:{ SQLiteException -> 0x0204, all -> 0x01ff }
            r8.mo10594a(r9, r10, r7)     // Catch:{ SQLiteException -> 0x0204, all -> 0x01ff }
        L_0x01f6:
            boolean r7 = r6.moveToNext()     // Catch:{ SQLiteException -> 0x0204, all -> 0x01ff }
            if (r7 != 0) goto L_0x01b3
            if (r6 == 0) goto L_0x0255
            goto L_0x01ae
        L_0x01ff:
            r0 = move-exception
            r1 = r0
            r8 = r6
            goto L_0x0ad8
        L_0x0204:
            r0 = move-exception
            r10 = r4
            r8 = r6
            goto L_0x0235
        L_0x0208:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.internal.measurement.W r7 = r5.mo10385b()     // Catch:{ SQLiteException -> 0x021f }
            com.google.android.gms.internal.measurement.Y r7 = r7.mo10585y()     // Catch:{ SQLiteException -> 0x021f }
            java.lang.String r9 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r10 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r4)     // Catch:{ SQLiteException -> 0x021f }
            r7.mo10594a(r9, r10, r6)     // Catch:{ SQLiteException -> 0x021f }
            if (r8 == 0) goto L_0x0255
            goto L_0x011d
        L_0x021f:
            r0 = move-exception
            r10 = r4
            goto L_0x0235
        L_0x0222:
            r0 = move-exception
            r1 = r0
            r8 = r22
            goto L_0x0ad8
        L_0x0228:
            r0 = move-exception
            r10 = r4
            r8 = r22
            goto L_0x0235
        L_0x022d:
            r0 = move-exception
            r1 = r0
            r8 = r4
            goto L_0x0ad8
        L_0x0232:
            r0 = move-exception
            r8 = r4
            r10 = 0
        L_0x0235:
            r4 = r0
            goto L_0x0240
        L_0x0237:
            r0 = move-exception
            r1 = r0
            r8 = 0
            goto L_0x0ad8
        L_0x023c:
            r0 = move-exception
            r4 = r0
            r8 = 0
            r10 = 0
        L_0x0240:
            com.google.android.gms.internal.measurement.W r5 = r5.mo10385b()     // Catch:{ all -> 0x0ad6 }
            com.google.android.gms.internal.measurement.Y r5 = r5.mo10585y()     // Catch:{ all -> 0x0ad6 }
            java.lang.String r6 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r10)     // Catch:{ all -> 0x0ad6 }
            r5.mo10594a(r6, r7, r4)     // Catch:{ all -> 0x0ad6 }
            if (r8 == 0) goto L_0x0255
            goto L_0x011d
        L_0x0255:
            java.util.List<com.google.android.gms.internal.measurement.zc> r4 = r3.f11507c     // Catch:{ all -> 0x0ade }
            if (r4 == 0) goto L_0x0264
            java.util.List<com.google.android.gms.internal.measurement.zc> r4 = r3.f11507c     // Catch:{ all -> 0x0ade }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0ade }
            if (r4 == 0) goto L_0x0262
            goto L_0x0264
        L_0x0262:
            r4 = r11
            goto L_0x0265
        L_0x0264:
            r4 = 1
        L_0x0265:
            if (r4 != 0) goto L_0x0ac6
            com.google.android.gms.internal.measurement.Cc r4 = r3.f11505a     // Catch:{ all -> 0x0ade }
            java.util.List<com.google.android.gms.internal.measurement.zc> r5 = r3.f11507c     // Catch:{ all -> 0x0ade }
            int r5 = r5.size()     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.zc[] r5 = new com.google.android.gms.internal.measurement.C3923zc[r5]     // Catch:{ all -> 0x0ade }
            r4.f11045e = r5     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.w r5 = r37.mo10394j()     // Catch:{ all -> 0x0ade }
            java.lang.String r6 = r4.f11058r     // Catch:{ all -> 0x0ade }
            boolean r5 = r5.mo11006e(r6)     // Catch:{ all -> 0x0ade }
            r8 = r11
            r9 = r8
            r12 = r9
            r13 = 0
        L_0x0282:
            java.util.List<com.google.android.gms.internal.measurement.zc> r10 = r3.f11507c     // Catch:{ all -> 0x0ade }
            int r10 = r10.size()     // Catch:{ all -> 0x0ade }
            if (r8 >= r10) goto L_0x0571
            java.util.List<com.google.android.gms.internal.measurement.zc> r10 = r3.f11507c     // Catch:{ all -> 0x0ade }
            java.lang.Object r10 = r10.get(r8)     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.zc r10 = (com.google.android.gms.internal.measurement.C3923zc) r10     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.va r6 = r37.mo10395s()     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Cc r7 = r3.f11505a     // Catch:{ all -> 0x0ade }
            java.lang.String r7 = r7.f11058r     // Catch:{ all -> 0x0ade }
            java.lang.String r15 = r10.f11748e     // Catch:{ all -> 0x0ade }
            boolean r6 = r6.mo10987b(r7, r15)     // Catch:{ all -> 0x0ade }
            java.lang.String r7 = "_err"
            if (r6 == 0) goto L_0x030e
            com.google.android.gms.internal.measurement.W r6 = r37.mo10385b()     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Y r6 = r6.mo10576B()     // Catch:{ all -> 0x0ade }
            java.lang.String r15 = "Dropping blacklisted raw event. appId"
            com.google.android.gms.internal.measurement.Cc r11 = r3.f11505a     // Catch:{ all -> 0x0ade }
            java.lang.String r11 = r11.f11058r     // Catch:{ all -> 0x0ade }
            java.lang.Object r11 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r11)     // Catch:{ all -> 0x0ade }
            r19 = r12
            com.google.android.gms.internal.measurement.U r12 = r37.mo10390g()     // Catch:{ all -> 0x0ade }
            java.lang.String r1 = r10.f11748e     // Catch:{ all -> 0x0ade }
            java.lang.String r1 = r12.mo10557a((java.lang.String) r1)     // Catch:{ all -> 0x0ade }
            r6.mo10594a(r15, r11, r1)     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.va r1 = r37.mo10395s()     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Cc r6 = r3.f11505a     // Catch:{ all -> 0x0ade }
            java.lang.String r6 = r6.f11058r     // Catch:{ all -> 0x0ade }
            boolean r1 = r1.mo10992e(r6)     // Catch:{ all -> 0x0ade }
            if (r1 != 0) goto L_0x02e4
            com.google.android.gms.internal.measurement.va r1 = r37.mo10395s()     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Cc r6 = r3.f11505a     // Catch:{ all -> 0x0ade }
            java.lang.String r6 = r6.f11058r     // Catch:{ all -> 0x0ade }
            boolean r1 = r1.mo10993f(r6)     // Catch:{ all -> 0x0ade }
            if (r1 == 0) goto L_0x02e2
            goto L_0x02e4
        L_0x02e2:
            r1 = 0
            goto L_0x02e5
        L_0x02e4:
            r1 = 1
        L_0x02e5:
            if (r1 != 0) goto L_0x0306
            java.lang.String r1 = r10.f11748e     // Catch:{ all -> 0x0ade }
            boolean r1 = r7.equals(r1)     // Catch:{ all -> 0x0ade }
            if (r1 != 0) goto L_0x0306
            com.google.android.gms.internal.measurement.mc r23 = r37.mo10392h()     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Cc r1 = r3.f11505a     // Catch:{ all -> 0x0ade }
            java.lang.String r1 = r1.f11058r     // Catch:{ all -> 0x0ade }
            r25 = 11
            java.lang.String r26 = "_ev"
            java.lang.String r6 = r10.f11748e     // Catch:{ all -> 0x0ade }
            r28 = 0
            r24 = r1
            r27 = r6
            r23.mo10787a((java.lang.String) r24, (int) r25, (java.lang.String) r26, (java.lang.String) r27, (int) r28)     // Catch:{ all -> 0x0ade }
        L_0x0306:
            r21 = r2
            r22 = r8
            r12 = r19
            goto L_0x0568
        L_0x030e:
            r19 = r12
            com.google.android.gms.internal.measurement.va r1 = r37.mo10395s()     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Cc r6 = r3.f11505a     // Catch:{ all -> 0x0ade }
            java.lang.String r6 = r6.f11058r     // Catch:{ all -> 0x0ade }
            java.lang.String r11 = r10.f11748e     // Catch:{ all -> 0x0ade }
            boolean r1 = r1.mo10989c(r6, r11)     // Catch:{ all -> 0x0ade }
            if (r1 != 0) goto L_0x0336
            r37.mo10392h()     // Catch:{ all -> 0x0ade }
            java.lang.String r6 = r10.f11748e     // Catch:{ all -> 0x0ade }
            boolean r6 = com.google.android.gms.internal.measurement.C3871mc.m15533j(r6)     // Catch:{ all -> 0x0ade }
            if (r6 == 0) goto L_0x032c
            goto L_0x0336
        L_0x032c:
            r21 = r2
            r22 = r8
            r23 = r13
            r12 = r19
            goto L_0x050c
        L_0x0336:
            com.google.android.gms.internal.measurement.Ac[] r6 = r10.f11747d     // Catch:{ all -> 0x0ade }
            if (r6 != 0) goto L_0x033f
            r6 = 0
            com.google.android.gms.internal.measurement.Ac[] r11 = new com.google.android.gms.internal.measurement.C3717Ac[r6]     // Catch:{ all -> 0x0ade }
            r10.f11747d = r11     // Catch:{ all -> 0x0ade }
        L_0x033f:
            com.google.android.gms.internal.measurement.Ac[] r6 = r10.f11747d     // Catch:{ all -> 0x0ade }
            int r11 = r6.length     // Catch:{ all -> 0x0ade }
            r21 = r2
            r12 = 0
            r15 = 0
            r20 = 0
        L_0x0348:
            java.lang.String r2 = "_r"
            r22 = r8
            java.lang.String r8 = "_c"
            if (r12 >= r11) goto L_0x0383
            r23 = r11
            r11 = r6[r12]     // Catch:{ all -> 0x0ade }
            r24 = r6
            java.lang.String r6 = r11.f11014d     // Catch:{ all -> 0x0ade }
            boolean r6 = r8.equals(r6)     // Catch:{ all -> 0x0ade }
            if (r6 == 0) goto L_0x0368
            r17 = 1
            java.lang.Long r2 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x0ade }
            r11.f11016f = r2     // Catch:{ all -> 0x0ade }
            r15 = 1
            goto L_0x037a
        L_0x0368:
            java.lang.String r6 = r11.f11014d     // Catch:{ all -> 0x0ade }
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x0ade }
            if (r2 == 0) goto L_0x037a
            r17 = 1
            java.lang.Long r2 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x0ade }
            r11.f11016f = r2     // Catch:{ all -> 0x0ade }
            r20 = 1
        L_0x037a:
            int r12 = r12 + 1
            r8 = r22
            r11 = r23
            r6 = r24
            goto L_0x0348
        L_0x0383:
            if (r15 != 0) goto L_0x03c1
            if (r1 == 0) goto L_0x03c1
            com.google.android.gms.internal.measurement.W r6 = r37.mo10385b()     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Y r6 = r6.mo10580F()     // Catch:{ all -> 0x0ade }
            java.lang.String r11 = "Marking event as conversion"
            com.google.android.gms.internal.measurement.U r12 = r37.mo10390g()     // Catch:{ all -> 0x0ade }
            java.lang.String r15 = r10.f11748e     // Catch:{ all -> 0x0ade }
            java.lang.String r12 = r12.mo10557a((java.lang.String) r15)     // Catch:{ all -> 0x0ade }
            r6.mo10593a(r11, r12)     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Ac[] r6 = r10.f11747d     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Ac[] r11 = r10.f11747d     // Catch:{ all -> 0x0ade }
            int r11 = r11.length     // Catch:{ all -> 0x0ade }
            r12 = 1
            int r11 = r11 + r12
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r11)     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Ac[] r6 = (com.google.android.gms.internal.measurement.C3717Ac[]) r6     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Ac r11 = new com.google.android.gms.internal.measurement.Ac     // Catch:{ all -> 0x0ade }
            r11.<init>()     // Catch:{ all -> 0x0ade }
            r11.f11014d = r8     // Catch:{ all -> 0x0ade }
            r17 = 1
            java.lang.Long r12 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x0ade }
            r11.f11016f = r12     // Catch:{ all -> 0x0ade }
            int r12 = r6.length     // Catch:{ all -> 0x0ade }
            r15 = 1
            int r12 = r12 - r15
            r6[r12] = r11     // Catch:{ all -> 0x0ade }
            r10.f11747d = r6     // Catch:{ all -> 0x0ade }
        L_0x03c1:
            if (r20 != 0) goto L_0x03fd
            com.google.android.gms.internal.measurement.W r6 = r37.mo10385b()     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Y r6 = r6.mo10580F()     // Catch:{ all -> 0x0ade }
            java.lang.String r11 = "Marking event as real-time"
            com.google.android.gms.internal.measurement.U r12 = r37.mo10390g()     // Catch:{ all -> 0x0ade }
            java.lang.String r15 = r10.f11748e     // Catch:{ all -> 0x0ade }
            java.lang.String r12 = r12.mo10557a((java.lang.String) r15)     // Catch:{ all -> 0x0ade }
            r6.mo10593a(r11, r12)     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Ac[] r6 = r10.f11747d     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Ac[] r11 = r10.f11747d     // Catch:{ all -> 0x0ade }
            int r11 = r11.length     // Catch:{ all -> 0x0ade }
            r12 = 1
            int r11 = r11 + r12
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r11)     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Ac[] r6 = (com.google.android.gms.internal.measurement.C3717Ac[]) r6     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Ac r11 = new com.google.android.gms.internal.measurement.Ac     // Catch:{ all -> 0x0ade }
            r11.<init>()     // Catch:{ all -> 0x0ade }
            r11.f11014d = r2     // Catch:{ all -> 0x0ade }
            r17 = 1
            java.lang.Long r12 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x0ade }
            r11.f11016f = r12     // Catch:{ all -> 0x0ade }
            int r12 = r6.length     // Catch:{ all -> 0x0ade }
            r15 = 1
            int r12 = r12 - r15
            r6[r12] = r11     // Catch:{ all -> 0x0ade }
            r10.f11747d = r6     // Catch:{ all -> 0x0ade }
        L_0x03fd:
            com.google.android.gms.internal.measurement.z r23 = r37.mo10712l()     // Catch:{ all -> 0x0ade }
            long r24 = r37.mo10397v()     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Cc r6 = r3.f11505a     // Catch:{ all -> 0x0ade }
            java.lang.String r6 = r6.f11058r     // Catch:{ all -> 0x0ade }
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 1
            r26 = r6
            com.google.android.gms.internal.measurement.A r6 = r23.mo11063a(r24, r26, r27, r28, r29, r30, r31)     // Catch:{ all -> 0x0ade }
            long r11 = r6.f10984e     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.w r6 = r37.mo10394j()     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Cc r15 = r3.f11505a     // Catch:{ all -> 0x0ade }
            java.lang.String r15 = r15.f11058r     // Catch:{ all -> 0x0ade }
            int r6 = r6.mo10997a((java.lang.String) r15)     // Catch:{ all -> 0x0ade }
            r23 = r13
            long r13 = (long) r6     // Catch:{ all -> 0x0ade }
            int r6 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r6 <= 0) goto L_0x0464
            r6 = 0
        L_0x042f:
            com.google.android.gms.internal.measurement.Ac[] r11 = r10.f11747d     // Catch:{ all -> 0x0ade }
            int r11 = r11.length     // Catch:{ all -> 0x0ade }
            if (r6 >= r11) goto L_0x0461
            com.google.android.gms.internal.measurement.Ac[] r11 = r10.f11747d     // Catch:{ all -> 0x0ade }
            r11 = r11[r6]     // Catch:{ all -> 0x0ade }
            java.lang.String r11 = r11.f11014d     // Catch:{ all -> 0x0ade }
            boolean r11 = r2.equals(r11)     // Catch:{ all -> 0x0ade }
            if (r11 == 0) goto L_0x045e
            com.google.android.gms.internal.measurement.Ac[] r2 = r10.f11747d     // Catch:{ all -> 0x0ade }
            int r2 = r2.length     // Catch:{ all -> 0x0ade }
            r11 = 1
            int r2 = r2 - r11
            com.google.android.gms.internal.measurement.Ac[] r2 = new com.google.android.gms.internal.measurement.C3717Ac[r2]     // Catch:{ all -> 0x0ade }
            if (r6 <= 0) goto L_0x044f
            com.google.android.gms.internal.measurement.Ac[] r11 = r10.f11747d     // Catch:{ all -> 0x0ade }
            r12 = 0
            java.lang.System.arraycopy(r11, r12, r2, r12, r6)     // Catch:{ all -> 0x0ade }
        L_0x044f:
            int r11 = r2.length     // Catch:{ all -> 0x0ade }
            if (r6 >= r11) goto L_0x045b
            com.google.android.gms.internal.measurement.Ac[] r11 = r10.f11747d     // Catch:{ all -> 0x0ade }
            int r12 = r6 + 1
            int r13 = r2.length     // Catch:{ all -> 0x0ade }
            int r13 = r13 - r6
            java.lang.System.arraycopy(r11, r12, r2, r6, r13)     // Catch:{ all -> 0x0ade }
        L_0x045b:
            r10.f11747d = r2     // Catch:{ all -> 0x0ade }
            goto L_0x0461
        L_0x045e:
            int r6 = r6 + 1
            goto L_0x042f
        L_0x0461:
            r12 = r19
            goto L_0x0465
        L_0x0464:
            r12 = 1
        L_0x0465:
            java.lang.String r2 = r10.f11748e     // Catch:{ all -> 0x0ade }
            boolean r2 = com.google.android.gms.internal.measurement.C3871mc.m15526b((java.lang.String) r2)     // Catch:{ all -> 0x0ade }
            if (r2 == 0) goto L_0x050c
            if (r1 == 0) goto L_0x050c
            com.google.android.gms.internal.measurement.z r25 = r37.mo10712l()     // Catch:{ all -> 0x0ade }
            long r26 = r37.mo10397v()     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Cc r1 = r3.f11505a     // Catch:{ all -> 0x0ade }
            java.lang.String r1 = r1.f11058r     // Catch:{ all -> 0x0ade }
            r29 = 0
            r30 = 0
            r31 = 1
            r32 = 0
            r33 = 0
            r28 = r1
            com.google.android.gms.internal.measurement.A r1 = r25.mo11063a(r26, r28, r29, r30, r31, r32, r33)     // Catch:{ all -> 0x0ade }
            long r1 = r1.f10982c     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.w r6 = r37.mo10394j()     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Cc r11 = r3.f11505a     // Catch:{ all -> 0x0ade }
            java.lang.String r11 = r11.f11058r     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.M<java.lang.Integer> r13 = com.google.android.gms.internal.measurement.C3758L.f11213t     // Catch:{ all -> 0x0ade }
            int r6 = r6.mo11000b(r11, r13)     // Catch:{ all -> 0x0ade }
            long r13 = (long) r6     // Catch:{ all -> 0x0ade }
            int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x050c
            com.google.android.gms.internal.measurement.W r1 = r37.mo10385b()     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Y r1 = r1.mo10576B()     // Catch:{ all -> 0x0ade }
            java.lang.String r2 = "Too many conversions. Not logging as conversion. appId"
            com.google.android.gms.internal.measurement.Cc r6 = r3.f11505a     // Catch:{ all -> 0x0ade }
            java.lang.String r6 = r6.f11058r     // Catch:{ all -> 0x0ade }
            java.lang.Object r6 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r6)     // Catch:{ all -> 0x0ade }
            r1.mo10593a(r2, r6)     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Ac[] r1 = r10.f11747d     // Catch:{ all -> 0x0ade }
            int r2 = r1.length     // Catch:{ all -> 0x0ade }
            r6 = 0
            r11 = 0
            r13 = 0
        L_0x04bb:
            if (r6 >= r2) goto L_0x04d5
            r14 = r1[r6]     // Catch:{ all -> 0x0ade }
            java.lang.String r15 = r14.f11014d     // Catch:{ all -> 0x0ade }
            boolean r15 = r8.equals(r15)     // Catch:{ all -> 0x0ade }
            if (r15 == 0) goto L_0x04c9
            r13 = r14
            goto L_0x04d2
        L_0x04c9:
            java.lang.String r14 = r14.f11014d     // Catch:{ all -> 0x0ade }
            boolean r14 = r7.equals(r14)     // Catch:{ all -> 0x0ade }
            if (r14 == 0) goto L_0x04d2
            r11 = 1
        L_0x04d2:
            int r6 = r6 + 1
            goto L_0x04bb
        L_0x04d5:
            if (r11 == 0) goto L_0x04ea
            if (r13 == 0) goto L_0x04ea
            com.google.android.gms.internal.measurement.Ac[] r1 = r10.f11747d     // Catch:{ all -> 0x0ade }
            r2 = 1
            com.google.android.gms.internal.measurement.Ac[] r6 = new com.google.android.gms.internal.measurement.C3717Ac[r2]     // Catch:{ all -> 0x0ade }
            r2 = 0
            r6[r2] = r13     // Catch:{ all -> 0x0ade }
            java.lang.Object[] r1 = com.google.android.gms.common.util.C2080b.m9106a((T[]) r1, (T[]) r6)     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Ac[] r1 = (com.google.android.gms.internal.measurement.C3717Ac[]) r1     // Catch:{ all -> 0x0ade }
            r10.f11747d = r1     // Catch:{ all -> 0x0ade }
            goto L_0x050c
        L_0x04ea:
            if (r13 == 0) goto L_0x04f7
            r13.f11014d = r7     // Catch:{ all -> 0x0ade }
            r1 = 10
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0ade }
            r13.f11016f = r1     // Catch:{ all -> 0x0ade }
            goto L_0x050c
        L_0x04f7:
            com.google.android.gms.internal.measurement.W r1 = r37.mo10385b()     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Y r1 = r1.mo10585y()     // Catch:{ all -> 0x0ade }
            java.lang.String r2 = "Did not find conversion parameter. appId"
            com.google.android.gms.internal.measurement.Cc r6 = r3.f11505a     // Catch:{ all -> 0x0ade }
            java.lang.String r6 = r6.f11058r     // Catch:{ all -> 0x0ade }
            java.lang.Object r6 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r6)     // Catch:{ all -> 0x0ade }
            r1.mo10593a(r2, r6)     // Catch:{ all -> 0x0ade }
        L_0x050c:
            if (r5 == 0) goto L_0x055f
            java.lang.String r1 = "_e"
            java.lang.String r2 = r10.f11748e     // Catch:{ all -> 0x0ade }
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0ade }
            if (r1 == 0) goto L_0x055f
            com.google.android.gms.internal.measurement.Ac[] r1 = r10.f11747d     // Catch:{ all -> 0x0ade }
            if (r1 == 0) goto L_0x054c
            com.google.android.gms.internal.measurement.Ac[] r1 = r10.f11747d     // Catch:{ all -> 0x0ade }
            int r1 = r1.length     // Catch:{ all -> 0x0ade }
            if (r1 != 0) goto L_0x0522
            goto L_0x054c
        L_0x0522:
            r37.mo10392h()     // Catch:{ all -> 0x0ade }
            java.lang.String r1 = "_et"
            java.lang.Object r1 = com.google.android.gms.internal.measurement.C3871mc.m15524b((com.google.android.gms.internal.measurement.C3923zc) r10, (java.lang.String) r1)     // Catch:{ all -> 0x0ade }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x0ade }
            if (r1 != 0) goto L_0x0545
            com.google.android.gms.internal.measurement.W r1 = r37.mo10385b()     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Y r1 = r1.mo10576B()     // Catch:{ all -> 0x0ade }
            java.lang.String r2 = "Engagement event does not include duration. appId"
            com.google.android.gms.internal.measurement.Cc r6 = r3.f11505a     // Catch:{ all -> 0x0ade }
            java.lang.String r6 = r6.f11058r     // Catch:{ all -> 0x0ade }
            java.lang.Object r6 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r6)     // Catch:{ all -> 0x0ade }
        L_0x0541:
            r1.mo10593a(r2, r6)     // Catch:{ all -> 0x0ade }
            goto L_0x055f
        L_0x0545:
            long r1 = r1.longValue()     // Catch:{ all -> 0x0ade }
            long r13 = r23 + r1
            goto L_0x0561
        L_0x054c:
            com.google.android.gms.internal.measurement.W r1 = r37.mo10385b()     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Y r1 = r1.mo10576B()     // Catch:{ all -> 0x0ade }
            java.lang.String r2 = "Engagement event does not contain any parameters. appId"
            com.google.android.gms.internal.measurement.Cc r6 = r3.f11505a     // Catch:{ all -> 0x0ade }
            java.lang.String r6 = r6.f11058r     // Catch:{ all -> 0x0ade }
            java.lang.Object r6 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r6)     // Catch:{ all -> 0x0ade }
            goto L_0x0541
        L_0x055f:
            r13 = r23
        L_0x0561:
            com.google.android.gms.internal.measurement.zc[] r1 = r4.f11045e     // Catch:{ all -> 0x0ade }
            int r2 = r9 + 1
            r1[r9] = r10     // Catch:{ all -> 0x0ade }
            r9 = r2
        L_0x0568:
            int r8 = r22 + 1
            r11 = 0
            r1 = r37
            r2 = r21
            goto L_0x0282
        L_0x0571:
            r21 = r2
            r19 = r12
            r23 = r13
            java.util.List<com.google.android.gms.internal.measurement.zc> r1 = r3.f11507c     // Catch:{ all -> 0x0ade }
            int r1 = r1.size()     // Catch:{ all -> 0x0ade }
            if (r9 >= r1) goto L_0x0589
            com.google.android.gms.internal.measurement.zc[] r1 = r4.f11045e     // Catch:{ all -> 0x0ade }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r9)     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.zc[] r1 = (com.google.android.gms.internal.measurement.C3923zc[]) r1     // Catch:{ all -> 0x0ade }
            r4.f11045e = r1     // Catch:{ all -> 0x0ade }
        L_0x0589:
            if (r5 == 0) goto L_0x064c
            com.google.android.gms.internal.measurement.z r1 = r37.mo10712l()     // Catch:{ all -> 0x0ade }
            java.lang.String r2 = r4.f11058r     // Catch:{ all -> 0x0ade }
            r5 = r21
            com.google.android.gms.internal.measurement.lc r1 = r1.mo11083d(r2, r5)     // Catch:{ all -> 0x0ade }
            if (r1 == 0) goto L_0x05c2
            java.lang.Object r2 = r1.f11538e     // Catch:{ all -> 0x0ade }
            if (r2 != 0) goto L_0x059e
            goto L_0x05c2
        L_0x059e:
            com.google.android.gms.internal.measurement.lc r2 = new com.google.android.gms.internal.measurement.lc     // Catch:{ all -> 0x0ade }
            java.lang.String r7 = r4.f11058r     // Catch:{ all -> 0x0ade }
            java.lang.String r8 = "auto"
            java.lang.String r9 = "_lte"
            com.google.android.gms.common.util.e r6 = r37.mo10382a()     // Catch:{ all -> 0x0ade }
            long r10 = r6.mo7725a()     // Catch:{ all -> 0x0ade }
            java.lang.Object r1 = r1.f11538e     // Catch:{ all -> 0x0ade }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x0ade }
            long r12 = r1.longValue()     // Catch:{ all -> 0x0ade }
            long r12 = r12 + r23
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0ade }
            r6 = r2
            r6.<init>(r7, r8, r9, r10, r12)     // Catch:{ all -> 0x0ade }
            r1 = r2
            goto L_0x05dd
        L_0x05c2:
            com.google.android.gms.internal.measurement.lc r1 = new com.google.android.gms.internal.measurement.lc     // Catch:{ all -> 0x0ade }
            java.lang.String r2 = r4.f11058r     // Catch:{ all -> 0x0ade }
            java.lang.String r27 = "auto"
            java.lang.String r28 = "_lte"
            com.google.android.gms.common.util.e r6 = r37.mo10382a()     // Catch:{ all -> 0x0ade }
            long r29 = r6.mo7725a()     // Catch:{ all -> 0x0ade }
            java.lang.Long r31 = java.lang.Long.valueOf(r23)     // Catch:{ all -> 0x0ade }
            r25 = r1
            r26 = r2
            r25.<init>(r26, r27, r28, r29, r31)     // Catch:{ all -> 0x0ade }
        L_0x05dd:
            com.google.android.gms.internal.measurement.Ec r2 = new com.google.android.gms.internal.measurement.Ec     // Catch:{ all -> 0x0ade }
            r2.<init>()     // Catch:{ all -> 0x0ade }
            r2.f11090e = r5     // Catch:{ all -> 0x0ade }
            com.google.android.gms.common.util.e r6 = r37.mo10382a()     // Catch:{ all -> 0x0ade }
            long r6 = r6.mo7725a()     // Catch:{ all -> 0x0ade }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0ade }
            r2.f11089d = r6     // Catch:{ all -> 0x0ade }
            java.lang.Object r6 = r1.f11538e     // Catch:{ all -> 0x0ade }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ all -> 0x0ade }
            r2.f11092g = r6     // Catch:{ all -> 0x0ade }
            r6 = 0
        L_0x05f9:
            com.google.android.gms.internal.measurement.Ec[] r7 = r4.f11046f     // Catch:{ all -> 0x0ade }
            int r7 = r7.length     // Catch:{ all -> 0x0ade }
            if (r6 >= r7) goto L_0x0613
            com.google.android.gms.internal.measurement.Ec[] r7 = r4.f11046f     // Catch:{ all -> 0x0ade }
            r7 = r7[r6]     // Catch:{ all -> 0x0ade }
            java.lang.String r7 = r7.f11090e     // Catch:{ all -> 0x0ade }
            boolean r7 = r5.equals(r7)     // Catch:{ all -> 0x0ade }
            if (r7 == 0) goto L_0x0610
            com.google.android.gms.internal.measurement.Ec[] r5 = r4.f11046f     // Catch:{ all -> 0x0ade }
            r5[r6] = r2     // Catch:{ all -> 0x0ade }
            r5 = 1
            goto L_0x0614
        L_0x0610:
            int r6 = r6 + 1
            goto L_0x05f9
        L_0x0613:
            r5 = 0
        L_0x0614:
            if (r5 != 0) goto L_0x0630
            com.google.android.gms.internal.measurement.Ec[] r5 = r4.f11046f     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Ec[] r6 = r4.f11046f     // Catch:{ all -> 0x0ade }
            int r6 = r6.length     // Catch:{ all -> 0x0ade }
            r7 = 1
            int r6 = r6 + r7
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r6)     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Ec[] r5 = (com.google.android.gms.internal.measurement.C3733Ec[]) r5     // Catch:{ all -> 0x0ade }
            r4.f11046f = r5     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Ec[] r5 = r4.f11046f     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Cc r6 = r3.f11505a     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Ec[] r6 = r6.f11046f     // Catch:{ all -> 0x0ade }
            int r6 = r6.length     // Catch:{ all -> 0x0ade }
            r7 = 1
            int r6 = r6 - r7
            r5[r6] = r2     // Catch:{ all -> 0x0ade }
        L_0x0630:
            r5 = 0
            int r2 = (r23 > r5 ? 1 : (r23 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x064c
            com.google.android.gms.internal.measurement.z r2 = r37.mo10712l()     // Catch:{ all -> 0x0ade }
            r2.mo11075a((com.google.android.gms.internal.measurement.C3867lc) r1)     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.W r2 = r37.mo10385b()     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Y r2 = r2.mo10579E()     // Catch:{ all -> 0x0ade }
            java.lang.String r5 = "Updated lifetime engagement user property with value. Value"
            java.lang.Object r1 = r1.f11538e     // Catch:{ all -> 0x0ade }
            r2.mo10593a(r5, r1)     // Catch:{ all -> 0x0ade }
        L_0x064c:
            java.lang.String r1 = r4.f11058r     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Ec[] r2 = r4.f11046f     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.zc[] r5 = r4.f11045e     // Catch:{ all -> 0x0ade }
            r6 = r37
            com.google.android.gms.internal.measurement.yc[] r1 = r6.m15390a(r1, r2, r5)     // Catch:{ all -> 0x0ade }
            r4.f11033D = r1     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.w r1 = r37.mo10394j()     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Cc r2 = r3.f11505a     // Catch:{ all -> 0x0ade }
            java.lang.String r2 = r2.f11058r     // Catch:{ all -> 0x0ade }
            boolean r1 = r1.mo11004d(r2)     // Catch:{ all -> 0x0ade }
            if (r1 == 0) goto L_0x090e
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x0ade }
            r1.<init>()     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.zc[] r2 = r4.f11045e     // Catch:{ all -> 0x0ade }
            int r2 = r2.length     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.zc[] r2 = new com.google.android.gms.internal.measurement.C3923zc[r2]     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.mc r5 = r37.mo10392h()     // Catch:{ all -> 0x0ade }
            java.security.SecureRandom r5 = r5.mo10805z()     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.zc[] r7 = r4.f11045e     // Catch:{ all -> 0x0ade }
            int r8 = r7.length     // Catch:{ all -> 0x0ade }
            r9 = 0
            r10 = 0
        L_0x067f:
            if (r9 >= r8) goto L_0x08dd
            r11 = r7[r9]     // Catch:{ all -> 0x0ade }
            java.lang.String r12 = r11.f11748e     // Catch:{ all -> 0x0ade }
            java.lang.String r13 = "_ep"
            boolean r12 = r12.equals(r13)     // Catch:{ all -> 0x0ade }
            java.lang.String r13 = "_efs"
            java.lang.String r14 = "_sr"
            if (r12 == 0) goto L_0x0703
            r37.mo10392h()     // Catch:{ all -> 0x0ade }
            java.lang.String r12 = "_en"
            java.lang.Object r12 = com.google.android.gms.internal.measurement.C3871mc.m15524b((com.google.android.gms.internal.measurement.C3923zc) r11, (java.lang.String) r12)     // Catch:{ all -> 0x0ade }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0ade }
            java.lang.Object r15 = r1.get(r12)     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.H r15 = (com.google.android.gms.internal.measurement.C3742H) r15     // Catch:{ all -> 0x0ade }
            if (r15 != 0) goto L_0x06b3
            com.google.android.gms.internal.measurement.z r15 = r37.mo10712l()     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Cc r6 = r3.f11505a     // Catch:{ all -> 0x0ade }
            java.lang.String r6 = r6.f11058r     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.H r15 = r15.mo11078b((java.lang.String) r6, (java.lang.String) r12)     // Catch:{ all -> 0x0ade }
            r1.put(r12, r15)     // Catch:{ all -> 0x0ade }
        L_0x06b3:
            java.lang.Long r6 = r15.f11129g     // Catch:{ all -> 0x0ade }
            if (r6 != 0) goto L_0x06fd
            java.lang.Long r6 = r15.f11130h     // Catch:{ all -> 0x0ade }
            long r20 = r6.longValue()     // Catch:{ all -> 0x0ade }
            r17 = 1
            int r6 = (r20 > r17 ? 1 : (r20 == r17 ? 0 : -1))
            if (r6 <= 0) goto L_0x06d0
            r37.mo10392h()     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Ac[] r6 = r11.f11747d     // Catch:{ all -> 0x0ade }
            java.lang.Long r12 = r15.f11130h     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Ac[] r6 = com.google.android.gms.internal.measurement.C3871mc.m15523a((com.google.android.gms.internal.measurement.C3717Ac[]) r6, (java.lang.String) r14, (java.lang.Object) r12)     // Catch:{ all -> 0x0ade }
            r11.f11747d = r6     // Catch:{ all -> 0x0ade }
        L_0x06d0:
            java.lang.Boolean r6 = r15.f11131i     // Catch:{ all -> 0x0ade }
            if (r6 == 0) goto L_0x06ed
            java.lang.Boolean r6 = r15.f11131i     // Catch:{ all -> 0x0ade }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x0ade }
            if (r6 == 0) goto L_0x06ed
            r37.mo10392h()     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Ac[] r6 = r11.f11747d     // Catch:{ all -> 0x0ade }
            r14 = 1
            java.lang.Long r12 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Ac[] r6 = com.google.android.gms.internal.measurement.C3871mc.m15523a((com.google.android.gms.internal.measurement.C3717Ac[]) r6, (java.lang.String) r13, (java.lang.Object) r12)     // Catch:{ all -> 0x0ade }
            r11.f11747d = r6     // Catch:{ all -> 0x0ade }
        L_0x06ed:
            int r6 = r10 + 1
            r2[r10] = r11     // Catch:{ all -> 0x0ade }
            r15 = r3
            r22 = r4
            r23 = r5
            r10 = r6
        L_0x06f7:
            r20 = r7
            r21 = r8
            goto L_0x078f
        L_0x06fd:
            r15 = r3
            r22 = r4
            r23 = r5
            goto L_0x06f7
        L_0x0703:
            java.lang.String r6 = "_dbg"
            r17 = 1
            java.lang.Long r12 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x0ade }
            boolean r15 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0ade }
            if (r15 != 0) goto L_0x0759
            if (r12 != 0) goto L_0x0714
            goto L_0x0759
        L_0x0714:
            com.google.android.gms.internal.measurement.Ac[] r15 = r11.f11747d     // Catch:{ all -> 0x0ade }
            r20 = r7
            int r7 = r15.length     // Catch:{ all -> 0x0ade }
            r21 = r8
            r8 = 0
        L_0x071c:
            if (r8 >= r7) goto L_0x075d
            r22 = r7
            r7 = r15[r8]     // Catch:{ all -> 0x0ade }
            r23 = r15
            java.lang.String r15 = r7.f11014d     // Catch:{ all -> 0x0ade }
            boolean r15 = r6.equals(r15)     // Catch:{ all -> 0x0ade }
            if (r15 == 0) goto L_0x0752
            boolean r6 = r12 instanceof java.lang.Long     // Catch:{ all -> 0x0ade }
            if (r6 == 0) goto L_0x0738
            java.lang.Long r6 = r7.f11016f     // Catch:{ all -> 0x0ade }
            boolean r6 = r12.equals(r6)     // Catch:{ all -> 0x0ade }
            if (r6 != 0) goto L_0x0750
        L_0x0738:
            boolean r6 = r12 instanceof java.lang.String     // Catch:{ all -> 0x0ade }
            if (r6 == 0) goto L_0x0744
            java.lang.String r6 = r7.f11015e     // Catch:{ all -> 0x0ade }
            boolean r6 = r12.equals(r6)     // Catch:{ all -> 0x0ade }
            if (r6 != 0) goto L_0x0750
        L_0x0744:
            boolean r6 = r12 instanceof java.lang.Double     // Catch:{ all -> 0x0ade }
            if (r6 == 0) goto L_0x075d
            java.lang.Double r6 = r7.f11018h     // Catch:{ all -> 0x0ade }
            boolean r6 = r12.equals(r6)     // Catch:{ all -> 0x0ade }
            if (r6 == 0) goto L_0x075d
        L_0x0750:
            r6 = 1
            goto L_0x075e
        L_0x0752:
            int r8 = r8 + 1
            r7 = r22
            r15 = r23
            goto L_0x071c
        L_0x0759:
            r20 = r7
            r21 = r8
        L_0x075d:
            r6 = 0
        L_0x075e:
            if (r6 != 0) goto L_0x076f
            com.google.android.gms.internal.measurement.va r6 = r37.mo10395s()     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Cc r7 = r3.f11505a     // Catch:{ all -> 0x0ade }
            java.lang.String r7 = r7.f11058r     // Catch:{ all -> 0x0ade }
            java.lang.String r8 = r11.f11748e     // Catch:{ all -> 0x0ade }
            int r12 = r6.mo10990d(r7, r8)     // Catch:{ all -> 0x0ade }
            goto L_0x0770
        L_0x076f:
            r12 = 1
        L_0x0770:
            if (r12 > 0) goto L_0x0793
            com.google.android.gms.internal.measurement.W r6 = r37.mo10385b()     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Y r6 = r6.mo10576B()     // Catch:{ all -> 0x0ade }
            java.lang.String r7 = "Sample rate must be positive. event, rate"
            java.lang.String r8 = r11.f11748e     // Catch:{ all -> 0x0ade }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0ade }
            r6.mo10594a(r7, r8, r12)     // Catch:{ all -> 0x0ade }
            int r6 = r10 + 1
            r2[r10] = r11     // Catch:{ all -> 0x0ade }
            r15 = r3
            r22 = r4
            r23 = r5
            r10 = r6
        L_0x078f:
            r4 = 1
            goto L_0x08ce
        L_0x0793:
            java.lang.String r6 = r11.f11748e     // Catch:{ all -> 0x0ade }
            java.lang.Object r6 = r1.get(r6)     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.H r6 = (com.google.android.gms.internal.measurement.C3742H) r6     // Catch:{ all -> 0x0ade }
            if (r6 != 0) goto L_0x07e3
            com.google.android.gms.internal.measurement.z r6 = r37.mo10712l()     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Cc r7 = r3.f11505a     // Catch:{ all -> 0x0ade }
            java.lang.String r7 = r7.f11058r     // Catch:{ all -> 0x0ade }
            java.lang.String r8 = r11.f11748e     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.H r6 = r6.mo11078b((java.lang.String) r7, (java.lang.String) r8)     // Catch:{ all -> 0x0ade }
            if (r6 != 0) goto L_0x07e3
            com.google.android.gms.internal.measurement.W r6 = r37.mo10385b()     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Y r6 = r6.mo10576B()     // Catch:{ all -> 0x0ade }
            java.lang.String r7 = "Event being bundled has no eventAggregate. appId, eventName"
            com.google.android.gms.internal.measurement.Cc r8 = r3.f11505a     // Catch:{ all -> 0x0ade }
            java.lang.String r8 = r8.f11058r     // Catch:{ all -> 0x0ade }
            java.lang.String r15 = r11.f11748e     // Catch:{ all -> 0x0ade }
            r6.mo10594a(r7, r8, r15)     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.H r6 = new com.google.android.gms.internal.measurement.H     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Cc r7 = r3.f11505a     // Catch:{ all -> 0x0ade }
            java.lang.String r7 = r7.f11058r     // Catch:{ all -> 0x0ade }
            java.lang.String r8 = r11.f11748e     // Catch:{ all -> 0x0ade }
            r26 = 1
            r28 = 1
            java.lang.Long r15 = r11.f11749f     // Catch:{ all -> 0x0ade }
            long r30 = r15.longValue()     // Catch:{ all -> 0x0ade }
            r32 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r23 = r6
            r24 = r7
            r25 = r8
            r23.<init>(r24, r25, r26, r28, r30, r32, r34, r35, r36)     // Catch:{ all -> 0x0ade }
        L_0x07e3:
            r37.mo10392h()     // Catch:{ all -> 0x0ade }
            java.lang.String r7 = "_eid"
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C3871mc.m15524b((com.google.android.gms.internal.measurement.C3923zc) r11, (java.lang.String) r7)     // Catch:{ all -> 0x0ade }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0ade }
            if (r7 == 0) goto L_0x07f2
            r8 = 1
            goto L_0x07f3
        L_0x07f2:
            r8 = 0
        L_0x07f3:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x0ade }
            r15 = 1
            if (r12 != r15) goto L_0x0822
            int r7 = r10 + 1
            r2[r10] = r11     // Catch:{ all -> 0x0ade }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0ade }
            if (r8 == 0) goto L_0x081a
            java.lang.Long r8 = r6.f11129g     // Catch:{ all -> 0x0ade }
            if (r8 != 0) goto L_0x0810
            java.lang.Long r8 = r6.f11130h     // Catch:{ all -> 0x0ade }
            if (r8 != 0) goto L_0x0810
            java.lang.Boolean r8 = r6.f11131i     // Catch:{ all -> 0x0ade }
            if (r8 == 0) goto L_0x081a
        L_0x0810:
            r8 = 0
            com.google.android.gms.internal.measurement.H r6 = r6.mo10475a(r8, r8, r8)     // Catch:{ all -> 0x0ade }
            java.lang.String r8 = r11.f11748e     // Catch:{ all -> 0x0ade }
        L_0x0817:
            r1.put(r8, r6)     // Catch:{ all -> 0x0ade }
        L_0x081a:
            r15 = r3
            r22 = r4
            r23 = r5
            r10 = r7
            goto L_0x078f
        L_0x0822:
            int r15 = r5.nextInt(r12)     // Catch:{ all -> 0x0ade }
            if (r15 != 0) goto L_0x0858
            r37.mo10392h()     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Ac[] r7 = r11.f11747d     // Catch:{ all -> 0x0ade }
            long r12 = (long) r12     // Catch:{ all -> 0x0ade }
            java.lang.Long r15 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Ac[] r7 = com.google.android.gms.internal.measurement.C3871mc.m15523a((com.google.android.gms.internal.measurement.C3717Ac[]) r7, (java.lang.String) r14, (java.lang.Object) r15)     // Catch:{ all -> 0x0ade }
            r11.f11747d = r7     // Catch:{ all -> 0x0ade }
            int r7 = r10 + 1
            r2[r10] = r11     // Catch:{ all -> 0x0ade }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0ade }
            if (r8 == 0) goto L_0x084b
            java.lang.Long r8 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0ade }
            r10 = 0
            com.google.android.gms.internal.measurement.H r6 = r6.mo10475a(r10, r8, r10)     // Catch:{ all -> 0x0ade }
        L_0x084b:
            java.lang.String r8 = r11.f11748e     // Catch:{ all -> 0x0ade }
            java.lang.Long r10 = r11.f11749f     // Catch:{ all -> 0x0ade }
            long r10 = r10.longValue()     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.H r6 = r6.mo10476b(r10)     // Catch:{ all -> 0x0ade }
            goto L_0x0817
        L_0x0858:
            r15 = r3
            r22 = r4
            long r3 = r6.f11128f     // Catch:{ all -> 0x0ade }
            r23 = r5
            java.lang.Long r5 = r11.f11749f     // Catch:{ all -> 0x0ade }
            long r24 = r5.longValue()     // Catch:{ all -> 0x0ade }
            long r24 = r24 - r3
            long r3 = java.lang.Math.abs(r24)     // Catch:{ all -> 0x0ade }
            r24 = 86400000(0x5265c00, double:4.2687272E-316)
            int r3 = (r3 > r24 ? 1 : (r3 == r24 ? 0 : -1))
            if (r3 < 0) goto L_0x08bc
            r37.mo10392h()     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Ac[] r3 = r11.f11747d     // Catch:{ all -> 0x0ade }
            r4 = 1
            java.lang.Long r7 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Ac[] r3 = com.google.android.gms.internal.measurement.C3871mc.m15523a((com.google.android.gms.internal.measurement.C3717Ac[]) r3, (java.lang.String) r13, (java.lang.Object) r7)     // Catch:{ all -> 0x0ade }
            r11.f11747d = r3     // Catch:{ all -> 0x0ade }
            r37.mo10392h()     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Ac[] r3 = r11.f11747d     // Catch:{ all -> 0x0ade }
            long r12 = (long) r12     // Catch:{ all -> 0x0ade }
            java.lang.Long r7 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Ac[] r3 = com.google.android.gms.internal.measurement.C3871mc.m15523a((com.google.android.gms.internal.measurement.C3717Ac[]) r3, (java.lang.String) r14, (java.lang.Object) r7)     // Catch:{ all -> 0x0ade }
            r11.f11747d = r3     // Catch:{ all -> 0x0ade }
            int r3 = r10 + 1
            r2[r10] = r11     // Catch:{ all -> 0x0ade }
            boolean r7 = r8.booleanValue()     // Catch:{ all -> 0x0ade }
            if (r7 == 0) goto L_0x08ab
            java.lang.Long r7 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0ade }
            r8 = 1
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x0ade }
            r8 = 0
            com.google.android.gms.internal.measurement.H r6 = r6.mo10475a(r8, r7, r10)     // Catch:{ all -> 0x0ade }
        L_0x08ab:
            java.lang.String r7 = r11.f11748e     // Catch:{ all -> 0x0ade }
            java.lang.Long r8 = r11.f11749f     // Catch:{ all -> 0x0ade }
            long r10 = r8.longValue()     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.H r6 = r6.mo10476b(r10)     // Catch:{ all -> 0x0ade }
            r1.put(r7, r6)     // Catch:{ all -> 0x0ade }
            r10 = r3
            goto L_0x08ce
        L_0x08bc:
            r4 = 1
            boolean r3 = r8.booleanValue()     // Catch:{ all -> 0x0ade }
            if (r3 == 0) goto L_0x08ce
            java.lang.String r3 = r11.f11748e     // Catch:{ all -> 0x0ade }
            r8 = 0
            com.google.android.gms.internal.measurement.H r6 = r6.mo10475a(r7, r8, r8)     // Catch:{ all -> 0x0ade }
            r1.put(r3, r6)     // Catch:{ all -> 0x0ade }
        L_0x08ce:
            int r9 = r9 + 1
            r6 = r37
            r3 = r15
            r7 = r20
            r8 = r21
            r4 = r22
            r5 = r23
            goto L_0x067f
        L_0x08dd:
            r15 = r3
            r3 = r4
            com.google.android.gms.internal.measurement.zc[] r4 = r3.f11045e     // Catch:{ all -> 0x0ade }
            int r4 = r4.length     // Catch:{ all -> 0x0ade }
            if (r10 >= r4) goto L_0x08ec
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r10)     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.zc[] r2 = (com.google.android.gms.internal.measurement.C3923zc[]) r2     // Catch:{ all -> 0x0ade }
            r3.f11045e = r2     // Catch:{ all -> 0x0ade }
        L_0x08ec:
            java.util.Set r1 = r1.entrySet()     // Catch:{ all -> 0x0ade }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0ade }
        L_0x08f4:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0ade }
            if (r2 == 0) goto L_0x0910
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0ade }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.z r4 = r37.mo10712l()     // Catch:{ all -> 0x0ade }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.H r2 = (com.google.android.gms.internal.measurement.C3742H) r2     // Catch:{ all -> 0x0ade }
            r4.mo11069a((com.google.android.gms.internal.measurement.C3742H) r2)     // Catch:{ all -> 0x0ade }
            goto L_0x08f4
        L_0x090e:
            r15 = r3
            r3 = r4
        L_0x0910:
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0ade }
            r3.f11048h = r1     // Catch:{ all -> 0x0ade }
            r1 = -9223372036854775808
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0ade }
            r3.f11049i = r1     // Catch:{ all -> 0x0ade }
            r1 = 0
        L_0x0924:
            com.google.android.gms.internal.measurement.zc[] r2 = r3.f11045e     // Catch:{ all -> 0x0ade }
            int r2 = r2.length     // Catch:{ all -> 0x0ade }
            if (r1 >= r2) goto L_0x0958
            com.google.android.gms.internal.measurement.zc[] r2 = r3.f11045e     // Catch:{ all -> 0x0ade }
            r2 = r2[r1]     // Catch:{ all -> 0x0ade }
            java.lang.Long r4 = r2.f11749f     // Catch:{ all -> 0x0ade }
            long r4 = r4.longValue()     // Catch:{ all -> 0x0ade }
            java.lang.Long r6 = r3.f11048h     // Catch:{ all -> 0x0ade }
            long r6 = r6.longValue()     // Catch:{ all -> 0x0ade }
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x0941
            java.lang.Long r4 = r2.f11749f     // Catch:{ all -> 0x0ade }
            r3.f11048h = r4     // Catch:{ all -> 0x0ade }
        L_0x0941:
            java.lang.Long r4 = r2.f11749f     // Catch:{ all -> 0x0ade }
            long r4 = r4.longValue()     // Catch:{ all -> 0x0ade }
            java.lang.Long r6 = r3.f11049i     // Catch:{ all -> 0x0ade }
            long r6 = r6.longValue()     // Catch:{ all -> 0x0ade }
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x0955
            java.lang.Long r2 = r2.f11749f     // Catch:{ all -> 0x0ade }
            r3.f11049i = r2     // Catch:{ all -> 0x0ade }
        L_0x0955:
            int r1 = r1 + 1
            goto L_0x0924
        L_0x0958:
            r1 = r15
            com.google.android.gms.internal.measurement.Cc r2 = r1.f11505a     // Catch:{ all -> 0x0ade }
            java.lang.String r2 = r2.f11058r     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.z r4 = r37.mo10712l()     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.r r4 = r4.mo11079b(r2)     // Catch:{ all -> 0x0ade }
            if (r4 != 0) goto L_0x097d
            com.google.android.gms.internal.measurement.W r4 = r37.mo10385b()     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Y r4 = r4.mo10585y()     // Catch:{ all -> 0x0ade }
            java.lang.String r5 = "Bundling raw events w/o app info. appId"
            com.google.android.gms.internal.measurement.Cc r6 = r1.f11505a     // Catch:{ all -> 0x0ade }
            java.lang.String r6 = r6.f11058r     // Catch:{ all -> 0x0ade }
            java.lang.Object r6 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r6)     // Catch:{ all -> 0x0ade }
            r4.mo10593a(r5, r6)     // Catch:{ all -> 0x0ade }
            goto L_0x09d9
        L_0x097d:
            com.google.android.gms.internal.measurement.zc[] r5 = r3.f11045e     // Catch:{ all -> 0x0ade }
            int r5 = r5.length     // Catch:{ all -> 0x0ade }
            if (r5 <= 0) goto L_0x09d9
            long r5 = r4.mo10925j()     // Catch:{ all -> 0x0ade }
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0991
            java.lang.Long r7 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0ade }
            goto L_0x0992
        L_0x0991:
            r7 = 0
        L_0x0992:
            r3.f11051k = r7     // Catch:{ all -> 0x0ade }
            long r7 = r4.mo10923i()     // Catch:{ all -> 0x0ade }
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x099f
            goto L_0x09a0
        L_0x099f:
            r5 = r7
        L_0x09a0:
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x09a9
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0ade }
            goto L_0x09aa
        L_0x09a9:
            r5 = 0
        L_0x09aa:
            r3.f11050j = r5     // Catch:{ all -> 0x0ade }
            r4.mo10939r()     // Catch:{ all -> 0x0ade }
            long r5 = r4.mo10935o()     // Catch:{ all -> 0x0ade }
            int r5 = (int) r5     // Catch:{ all -> 0x0ade }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0ade }
            r3.f11066z = r5     // Catch:{ all -> 0x0ade }
            java.lang.Long r5 = r3.f11048h     // Catch:{ all -> 0x0ade }
            long r5 = r5.longValue()     // Catch:{ all -> 0x0ade }
            r4.mo10902b((long) r5)     // Catch:{ all -> 0x0ade }
            java.lang.Long r5 = r3.f11049i     // Catch:{ all -> 0x0ade }
            long r5 = r5.longValue()     // Catch:{ all -> 0x0ade }
            r4.mo10905c((long) r5)     // Catch:{ all -> 0x0ade }
            java.lang.String r5 = r4.mo10947z()     // Catch:{ all -> 0x0ade }
            r3.f11030A = r5     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.z r5 = r37.mo10712l()     // Catch:{ all -> 0x0ade }
            r5.mo11070a((com.google.android.gms.internal.measurement.C3888r) r4)     // Catch:{ all -> 0x0ade }
        L_0x09d9:
            com.google.android.gms.internal.measurement.zc[] r4 = r3.f11045e     // Catch:{ all -> 0x0ade }
            int r4 = r4.length     // Catch:{ all -> 0x0ade }
            if (r4 <= 0) goto L_0x0a25
            com.google.android.gms.internal.measurement.va r4 = r37.mo10395s()     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Cc r5 = r1.f11505a     // Catch:{ all -> 0x0ade }
            java.lang.String r5 = r5.f11058r     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.wc r4 = r4.mo10983a((java.lang.String) r5)     // Catch:{ all -> 0x0ade }
            if (r4 == 0) goto L_0x09f6
            java.lang.Long r5 = r4.f11708c     // Catch:{ all -> 0x0ade }
            if (r5 != 0) goto L_0x09f1
            goto L_0x09f6
        L_0x09f1:
            java.lang.Long r4 = r4.f11708c     // Catch:{ all -> 0x0ade }
        L_0x09f3:
            r3.f11039J = r4     // Catch:{ all -> 0x0ade }
            goto L_0x0a1c
        L_0x09f6:
            com.google.android.gms.internal.measurement.Cc r4 = r1.f11505a     // Catch:{ all -> 0x0ade }
            java.lang.String r4 = r4.f11031B     // Catch:{ all -> 0x0ade }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0ade }
            if (r4 == 0) goto L_0x0a07
            r4 = -1
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0ade }
            goto L_0x09f3
        L_0x0a07:
            com.google.android.gms.internal.measurement.W r4 = r37.mo10385b()     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Y r4 = r4.mo10576B()     // Catch:{ all -> 0x0ade }
            java.lang.String r5 = "Did not find measurement config or missing version info. appId"
            com.google.android.gms.internal.measurement.Cc r6 = r1.f11505a     // Catch:{ all -> 0x0ade }
            java.lang.String r6 = r6.f11058r     // Catch:{ all -> 0x0ade }
            java.lang.Object r6 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r6)     // Catch:{ all -> 0x0ade }
            r4.mo10593a(r5, r6)     // Catch:{ all -> 0x0ade }
        L_0x0a1c:
            com.google.android.gms.internal.measurement.z r4 = r37.mo10712l()     // Catch:{ all -> 0x0ade }
            r12 = r19
            r4.mo11073a((com.google.android.gms.internal.measurement.C3725Cc) r3, (boolean) r12)     // Catch:{ all -> 0x0ade }
        L_0x0a25:
            com.google.android.gms.internal.measurement.z r3 = r37.mo10712l()     // Catch:{ all -> 0x0ade }
            java.util.List<java.lang.Long> r1 = r1.f11506b     // Catch:{ all -> 0x0ade }
            com.google.android.gms.common.internal.C2061y.m9067a(r1)     // Catch:{ all -> 0x0ade }
            r3.mo10451d()     // Catch:{ all -> 0x0ade }
            r3.mo10685v()     // Catch:{ all -> 0x0ade }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ade }
            java.lang.String r5 = "rowid in ("
            r4.<init>(r5)     // Catch:{ all -> 0x0ade }
            r5 = 0
        L_0x0a3c:
            int r6 = r1.size()     // Catch:{ all -> 0x0ade }
            if (r5 >= r6) goto L_0x0a59
            if (r5 == 0) goto L_0x0a49
            java.lang.String r6 = ","
            r4.append(r6)     // Catch:{ all -> 0x0ade }
        L_0x0a49:
            java.lang.Object r6 = r1.get(r5)     // Catch:{ all -> 0x0ade }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ all -> 0x0ade }
            long r6 = r6.longValue()     // Catch:{ all -> 0x0ade }
            r4.append(r6)     // Catch:{ all -> 0x0ade }
            int r5 = r5 + 1
            goto L_0x0a3c
        L_0x0a59:
            java.lang.String r5 = ")"
            r4.append(r5)     // Catch:{ all -> 0x0ade }
            android.database.sqlite.SQLiteDatabase r5 = r3.mo11051A()     // Catch:{ all -> 0x0ade }
            java.lang.String r6 = "raw_events"
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0ade }
            r7 = 0
            int r4 = r5.delete(r6, r4, r7)     // Catch:{ all -> 0x0ade }
            int r5 = r1.size()     // Catch:{ all -> 0x0ade }
            if (r4 == r5) goto L_0x0a8c
            com.google.android.gms.internal.measurement.W r3 = r3.mo10385b()     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Y r3 = r3.mo10585y()     // Catch:{ all -> 0x0ade }
            java.lang.String r5 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0ade }
            int r1 = r1.size()     // Catch:{ all -> 0x0ade }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0ade }
            r3.mo10594a(r5, r4, r1)     // Catch:{ all -> 0x0ade }
        L_0x0a8c:
            com.google.android.gms.internal.measurement.z r1 = r37.mo10712l()     // Catch:{ all -> 0x0ade }
            android.database.sqlite.SQLiteDatabase r3 = r1.mo11051A()     // Catch:{ all -> 0x0ade }
            java.lang.String r4 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0aa3 }
            r6 = 0
            r5[r6] = r2     // Catch:{ SQLiteException -> 0x0aa3 }
            r6 = 1
            r5[r6] = r2     // Catch:{ SQLiteException -> 0x0aa3 }
            r3.execSQL(r4, r5)     // Catch:{ SQLiteException -> 0x0aa3 }
            goto L_0x0ab6
        L_0x0aa3:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.internal.measurement.W r1 = r1.mo10385b()     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.Y r1 = r1.mo10585y()     // Catch:{ all -> 0x0ade }
            java.lang.String r4 = "Failed to remove unused event metadata. appId"
            java.lang.Object r2 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r2)     // Catch:{ all -> 0x0ade }
            r1.mo10594a(r4, r2, r3)     // Catch:{ all -> 0x0ade }
        L_0x0ab6:
            com.google.android.gms.internal.measurement.z r1 = r37.mo10712l()     // Catch:{ all -> 0x0ade }
            r1.mo11052B()     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.z r1 = r37.mo10712l()
            r1.mo11093z()
            r1 = 1
            return r1
        L_0x0ac6:
            com.google.android.gms.internal.measurement.z r1 = r37.mo10712l()     // Catch:{ all -> 0x0ade }
            r1.mo11052B()     // Catch:{ all -> 0x0ade }
            com.google.android.gms.internal.measurement.z r1 = r37.mo10712l()
            r1.mo11093z()
            r1 = 0
            return r1
        L_0x0ad6:
            r0 = move-exception
            r1 = r0
        L_0x0ad8:
            if (r8 == 0) goto L_0x0add
            r8.close()     // Catch:{ all -> 0x0ade }
        L_0x0add:
            throw r1     // Catch:{ all -> 0x0ade }
        L_0x0ade:
            r0 = move-exception
            r1 = r0
            com.google.android.gms.internal.measurement.z r2 = r37.mo10712l()
            r2.mo11093z()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3839ec.m15388a(java.lang.String, long):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0125  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m15389a(java.lang.String r14, com.google.android.gms.internal.measurement.zzeu r15) {
        /*
            r13 = this;
            com.google.android.gms.internal.measurement.zzer r0 = r15.f11782b
            java.lang.String r1 = "currency"
            java.lang.String r0 = r0.mo11104c(r1)
            java.lang.String r1 = r15.f11781a
            java.lang.String r2 = "ecommerce_purchase"
            boolean r1 = r2.equals(r1)
            r2 = 0
            java.lang.String r3 = "value"
            if (r1 == 0) goto L_0x005f
            com.google.android.gms.internal.measurement.zzer r1 = r15.f11782b
            java.lang.Double r1 = r1.mo11105d(r3)
            double r4 = r1.doubleValue()
            r6 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r4 = r4 * r6
            r8 = 0
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x0038
            com.google.android.gms.internal.measurement.zzer r1 = r15.f11782b
            java.lang.Long r1 = r1.mo11103b(r3)
            long r3 = r1.longValue()
            double r3 = (double) r3
            double r4 = r3 * r6
        L_0x0038:
            r6 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L_0x0049
            r6 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L_0x0049
            long r3 = java.lang.Math.round(r4)
            goto L_0x0069
        L_0x0049:
            com.google.android.gms.internal.measurement.W r15 = r13.mo10385b()
            com.google.android.gms.internal.measurement.Y r15 = r15.mo10576B()
            java.lang.Object r14 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r14)
            java.lang.Double r0 = java.lang.Double.valueOf(r4)
            java.lang.String r1 = "Data lost. Currency value is too big. appId"
            r15.mo10594a(r1, r14, r0)
            return r2
        L_0x005f:
            com.google.android.gms.internal.measurement.zzer r1 = r15.f11782b
            java.lang.Long r1 = r1.mo11103b(r3)
            long r3 = r1.longValue()
        L_0x0069:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r5 = 1
            if (r1 != 0) goto L_0x014f
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r0 = r0.toUpperCase(r1)
            java.lang.String r1 = "[A-Z]{3}"
            boolean r1 = r0.matches(r1)
            if (r1 == 0) goto L_0x014f
            java.lang.String r1 = "_ltv_"
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r6 = r0.length()
            if (r6 == 0) goto L_0x008f
            java.lang.String r0 = r1.concat(r0)
            goto L_0x0094
        L_0x008f:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x0094:
            r9 = r0
            com.google.android.gms.internal.measurement.z r0 = r13.mo10712l()
            com.google.android.gms.internal.measurement.lc r0 = r0.mo11083d(r14, r9)
            if (r0 == 0) goto L_0x00c4
            java.lang.Object r0 = r0.f11538e
            boolean r1 = r0 instanceof java.lang.Long
            if (r1 != 0) goto L_0x00a6
            goto L_0x00c4
        L_0x00a6:
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            com.google.android.gms.internal.measurement.lc r2 = new com.google.android.gms.internal.measurement.lc
            java.lang.String r8 = r15.f11783c
            com.google.android.gms.common.util.e r15 = r13.mo10382a()
            long r10 = r15.mo7725a()
            long r0 = r0 + r3
            java.lang.Long r12 = java.lang.Long.valueOf(r0)
            r6 = r2
            r7 = r14
            r6.<init>(r7, r8, r9, r10, r12)
            r0 = r2
            goto L_0x011b
        L_0x00c4:
            com.google.android.gms.internal.measurement.z r0 = r13.mo10712l()
            com.google.android.gms.internal.measurement.w r1 = r13.mo10394j()
            com.google.android.gms.internal.measurement.M<java.lang.Integer> r6 = com.google.android.gms.internal.measurement.C3758L.f11177K
            int r1 = r1.mo11000b(r14, r6)
            int r1 = r1 - r5
            com.google.android.gms.common.internal.C2061y.m9076b((java.lang.String) r14)
            r0.mo10451d()
            r0.mo10685v()
            android.database.sqlite.SQLiteDatabase r6 = r0.mo11051A()     // Catch:{ SQLiteException -> 0x00f4 }
            java.lang.String r7 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r8 = 3
            java.lang.String[] r8 = new java.lang.String[r8]     // Catch:{ SQLiteException -> 0x00f4 }
            r8[r2] = r14     // Catch:{ SQLiteException -> 0x00f4 }
            r8[r5] = r14     // Catch:{ SQLiteException -> 0x00f4 }
            r2 = 2
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ SQLiteException -> 0x00f4 }
            r8[r2] = r1     // Catch:{ SQLiteException -> 0x00f4 }
            r6.execSQL(r7, r8)     // Catch:{ SQLiteException -> 0x00f4 }
            goto L_0x0106
        L_0x00f4:
            r1 = move-exception
            com.google.android.gms.internal.measurement.W r0 = r0.mo10385b()
            com.google.android.gms.internal.measurement.Y r0 = r0.mo10585y()
            java.lang.Object r2 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r14)
            java.lang.String r6 = "Error pruning currencies. appId"
            r0.mo10594a(r6, r2, r1)
        L_0x0106:
            com.google.android.gms.internal.measurement.lc r0 = new com.google.android.gms.internal.measurement.lc
            java.lang.String r8 = r15.f11783c
            com.google.android.gms.common.util.e r15 = r13.mo10382a()
            long r10 = r15.mo7725a()
            java.lang.Long r12 = java.lang.Long.valueOf(r3)
            r6 = r0
            r7 = r14
            r6.<init>(r7, r8, r9, r10, r12)
        L_0x011b:
            com.google.android.gms.internal.measurement.z r15 = r13.mo10712l()
            boolean r15 = r15.mo11075a((com.google.android.gms.internal.measurement.C3867lc) r0)
            if (r15 != 0) goto L_0x014f
            com.google.android.gms.internal.measurement.W r15 = r13.mo10385b()
            com.google.android.gms.internal.measurement.Y r15 = r15.mo10585y()
            java.lang.Object r1 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r14)
            com.google.android.gms.internal.measurement.U r2 = r13.mo10390g()
            java.lang.String r3 = r0.f11536c
            java.lang.String r2 = r2.mo10559c(r3)
            java.lang.Object r0 = r0.f11538e
            java.lang.String r3 = "Too many unique user properties are set. Ignoring user property. appId"
            r15.mo10595a(r3, r1, r2, r0)
            com.google.android.gms.internal.measurement.mc r6 = r13.mo10392h()
            r8 = 9
            r9 = 0
            r10 = 0
            r11 = 0
            r7 = r14
            r6.mo10787a((java.lang.String) r7, (int) r8, (java.lang.String) r9, (java.lang.String) r10, (int) r11)
        L_0x014f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3839ec.m15389a(java.lang.String, com.google.android.gms.internal.measurement.zzeu):boolean");
    }

    /* renamed from: a */
    private final C3919yc[] m15390a(String str, C3733Ec[] ecArr, C3923zc[] zcVarArr) {
        C2061y.m9076b(str);
        return mo10711k().mo10963a(str, zcVarArr, ecArr);
    }

    /* renamed from: b */
    private final Boolean m15391b(C3888r rVar) {
        try {
            if (rVar.mo10927k() != -2147483648L) {
                if (rVar.mo10927k() == ((long) C1989c.m8748b(getContext()).mo7521b(rVar.mo10912e(), 0).versionCode)) {
                    return true;
                }
            } else {
                String str = C1989c.m8748b(getContext()).mo7521b(rVar.mo10912e(), 0).versionName;
                if (rVar.mo10909d() != null && rVar.mo10909d().equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static void m15392b(C3835dc dcVar) {
        if (dcVar == null) {
            throw new IllegalStateException("Upload component not created");
        } else if (!dcVar.mo10684u()) {
            String valueOf = String.valueOf(dcVar.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0545, code lost:
        r2 = true;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m15393b(com.google.android.gms.internal.measurement.zzeu r34, com.google.android.gms.internal.measurement.zzdz r35) {
        /*
            r33 = this;
            r1 = r33
            r0 = r34
            r2 = r35
            com.google.android.gms.common.internal.C2061y.m9067a(r35)
            java.lang.String r3 = r2.f11752a
            com.google.android.gms.common.internal.C2061y.m9076b((java.lang.String) r3)
            long r3 = java.lang.System.nanoTime()
            r33.mo10388e()
            r33.mo10714n()
            java.lang.String r15 = r2.f11752a
            r33.mo10392h()
            boolean r5 = com.google.android.gms.internal.measurement.C3871mc.m15517a((com.google.android.gms.internal.measurement.zzeu) r34, (com.google.android.gms.internal.measurement.zzdz) r35)
            if (r5 != 0) goto L_0x0024
            return
        L_0x0024:
            boolean r5 = r2.f11759h
            if (r5 != 0) goto L_0x002c
            r1.m15394e(r2)
            return
        L_0x002c:
            com.google.android.gms.internal.measurement.va r5 = r33.mo10395s()
            java.lang.String r6 = r0.f11781a
            boolean r5 = r5.mo10987b(r15, r6)
            java.lang.String r6 = "_err"
            r19 = 1
            if (r5 == 0) goto L_0x00cf
            com.google.android.gms.internal.measurement.W r2 = r33.mo10385b()
            com.google.android.gms.internal.measurement.Y r2 = r2.mo10576B()
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r15)
            com.google.android.gms.internal.measurement.U r4 = r33.mo10390g()
            java.lang.String r5 = r0.f11781a
            java.lang.String r4 = r4.mo10557a((java.lang.String) r5)
            java.lang.String r5 = "Dropping blacklisted event. appId"
            r2.mo10594a(r5, r3, r4)
            com.google.android.gms.internal.measurement.va r2 = r33.mo10395s()
            boolean r2 = r2.mo10992e(r15)
            if (r2 != 0) goto L_0x006e
            com.google.android.gms.internal.measurement.va r2 = r33.mo10395s()
            boolean r2 = r2.mo10993f(r15)
            if (r2 == 0) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            r14 = 0
            goto L_0x0070
        L_0x006e:
            r14 = r19
        L_0x0070:
            if (r14 != 0) goto L_0x0089
            java.lang.String r2 = r0.f11781a
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x0089
            com.google.android.gms.internal.measurement.mc r5 = r33.mo10392h()
            r7 = 11
            java.lang.String r9 = r0.f11781a
            r10 = 0
            java.lang.String r8 = "_ev"
            r6 = r15
            r5.mo10787a((java.lang.String) r6, (int) r7, (java.lang.String) r8, (java.lang.String) r9, (int) r10)
        L_0x0089:
            if (r14 == 0) goto L_0x00ce
            com.google.android.gms.internal.measurement.z r0 = r33.mo10712l()
            com.google.android.gms.internal.measurement.r r0 = r0.mo11079b(r15)
            if (r0 == 0) goto L_0x00ce
            long r2 = r0.mo10938q()
            long r4 = r0.mo10937p()
            long r2 = java.lang.Math.max(r2, r4)
            com.google.android.gms.common.util.e r4 = r33.mo10382a()
            long r4 = r4.mo7725a()
            long r4 = r4 - r2
            long r2 = java.lang.Math.abs(r4)
            com.google.android.gms.internal.measurement.M<java.lang.Long> r4 = com.google.android.gms.internal.measurement.C3758L.f11172F
            java.lang.Object r4 = r4.mo10498a()
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x00ce
            com.google.android.gms.internal.measurement.W r2 = r33.mo10385b()
            com.google.android.gms.internal.measurement.Y r2 = r2.mo10579E()
            java.lang.String r3 = "Fetching config for blacklisted app"
            r2.mo10592a(r3)
            r1.m15386a((com.google.android.gms.internal.measurement.C3888r) r0)
        L_0x00ce:
            return
        L_0x00cf:
            com.google.android.gms.internal.measurement.W r5 = r33.mo10385b()
            r13 = 2
            boolean r5 = r5.mo10584a((int) r13)
            if (r5 == 0) goto L_0x00ef
            com.google.android.gms.internal.measurement.W r5 = r33.mo10385b()
            com.google.android.gms.internal.measurement.Y r5 = r5.mo10580F()
            com.google.android.gms.internal.measurement.U r7 = r33.mo10390g()
            java.lang.String r7 = r7.mo10556a((com.google.android.gms.internal.measurement.zzeu) r0)
            java.lang.String r8 = "Logging event"
            r5.mo10593a(r8, r7)
        L_0x00ef:
            com.google.android.gms.internal.measurement.z r5 = r33.mo10712l()
            r5.mo11092y()
            r1.m15394e(r2)     // Catch:{ all -> 0x05f2 }
            java.lang.String r5 = "_iap"
            java.lang.String r7 = r0.f11781a     // Catch:{ all -> 0x05f2 }
            boolean r5 = r5.equals(r7)     // Catch:{ all -> 0x05f2 }
            if (r5 != 0) goto L_0x010d
            java.lang.String r5 = "ecommerce_purchase"
            java.lang.String r7 = r0.f11781a     // Catch:{ all -> 0x05f2 }
            boolean r5 = r5.equals(r7)     // Catch:{ all -> 0x05f2 }
            if (r5 == 0) goto L_0x0122
        L_0x010d:
            boolean r5 = r1.m15389a((java.lang.String) r15, (com.google.android.gms.internal.measurement.zzeu) r0)     // Catch:{ all -> 0x05f2 }
            if (r5 != 0) goto L_0x0122
            com.google.android.gms.internal.measurement.z r0 = r33.mo10712l()     // Catch:{ all -> 0x05f2 }
            r0.mo11052B()     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.z r0 = r33.mo10712l()
            r0.mo11093z()
            return
        L_0x0122:
            java.lang.String r5 = r0.f11781a     // Catch:{ all -> 0x05f2 }
            boolean r16 = com.google.android.gms.internal.measurement.C3871mc.m15526b((java.lang.String) r5)     // Catch:{ all -> 0x05f2 }
            java.lang.String r5 = r0.f11781a     // Catch:{ all -> 0x05f2 }
            boolean r17 = r6.equals(r5)     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.z r5 = r33.mo10712l()     // Catch:{ all -> 0x05f2 }
            long r6 = r33.mo10397v()     // Catch:{ all -> 0x05f2 }
            r9 = 1
            r11 = 0
            r18 = 0
            r8 = r15
            r10 = r16
            r12 = r17
            r13 = r18
            com.google.android.gms.internal.measurement.A r5 = r5.mo11063a(r6, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x05f2 }
            long r6 = r5.f10981b     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.M<java.lang.Integer> r8 = com.google.android.gms.internal.measurement.C3758L.f11210q     // Catch:{ all -> 0x05f2 }
            java.lang.Object r8 = r8.mo10498a()     // Catch:{ all -> 0x05f2 }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x05f2 }
            int r8 = r8.intValue()     // Catch:{ all -> 0x05f2 }
            long r8 = (long) r8     // Catch:{ all -> 0x05f2 }
            long r6 = r6 - r8
            r12 = 0
            int r8 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            r9 = 1000(0x3e8, double:4.94E-321)
            r20 = 1
            if (r8 <= 0) goto L_0x018a
            long r6 = r6 % r9
            int r0 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1))
            if (r0 != 0) goto L_0x017b
            com.google.android.gms.internal.measurement.W r0 = r33.mo10385b()     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.Y r0 = r0.mo10585y()     // Catch:{ all -> 0x05f2 }
            java.lang.String r2 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r15)     // Catch:{ all -> 0x05f2 }
            long r4 = r5.f10981b     // Catch:{ all -> 0x05f2 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x05f2 }
            r0.mo10594a(r2, r3, r4)     // Catch:{ all -> 0x05f2 }
        L_0x017b:
            com.google.android.gms.internal.measurement.z r0 = r33.mo10712l()     // Catch:{ all -> 0x05f2 }
            r0.mo11052B()     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.z r0 = r33.mo10712l()
            r0.mo11093z()
            return
        L_0x018a:
            if (r16 == 0) goto L_0x01dd
            long r6 = r5.f10980a     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.M<java.lang.Integer> r8 = com.google.android.gms.internal.measurement.C3758L.f11212s     // Catch:{ all -> 0x05f2 }
            java.lang.Object r8 = r8.mo10498a()     // Catch:{ all -> 0x05f2 }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x05f2 }
            int r8 = r8.intValue()     // Catch:{ all -> 0x05f2 }
            r22 = r15
            long r14 = (long) r8     // Catch:{ all -> 0x05f2 }
            long r6 = r6 - r14
            int r8 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r8 <= 0) goto L_0x01df
            long r6 = r6 % r9
            int r2 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1))
            if (r2 != 0) goto L_0x01be
            com.google.android.gms.internal.measurement.W r2 = r33.mo10385b()     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.Y r2 = r2.mo10585y()     // Catch:{ all -> 0x05f2 }
            java.lang.String r3 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r22)     // Catch:{ all -> 0x05f2 }
            long r5 = r5.f10980a     // Catch:{ all -> 0x05f2 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x05f2 }
            r2.mo10594a(r3, r4, r5)     // Catch:{ all -> 0x05f2 }
        L_0x01be:
            com.google.android.gms.internal.measurement.mc r5 = r33.mo10392h()     // Catch:{ all -> 0x05f2 }
            r7 = 16
            java.lang.String r8 = "_ev"
            java.lang.String r9 = r0.f11781a     // Catch:{ all -> 0x05f2 }
            r10 = 0
            r6 = r22
            r5.mo10787a((java.lang.String) r6, (int) r7, (java.lang.String) r8, (java.lang.String) r9, (int) r10)     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.z r0 = r33.mo10712l()     // Catch:{ all -> 0x05f2 }
            r0.mo11052B()     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.z r0 = r33.mo10712l()
            r0.mo11093z()
            return
        L_0x01dd:
            r22 = r15
        L_0x01df:
            if (r17 == 0) goto L_0x022b
            long r6 = r5.f10983d     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.w r8 = r33.mo10394j()     // Catch:{ all -> 0x05f2 }
            java.lang.String r9 = r2.f11752a     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.M<java.lang.Integer> r10 = com.google.android.gms.internal.measurement.C3758L.f11211r     // Catch:{ all -> 0x05f2 }
            int r8 = r8.mo11000b(r9, r10)     // Catch:{ all -> 0x05f2 }
            r9 = 1000000(0xf4240, float:1.401298E-39)
            int r8 = java.lang.Math.min(r9, r8)     // Catch:{ all -> 0x05f2 }
            r14 = 0
            int r8 = java.lang.Math.max(r14, r8)     // Catch:{ all -> 0x05f2 }
            long r8 = (long) r8     // Catch:{ all -> 0x05f2 }
            long r6 = r6 - r8
            int r8 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r8 <= 0) goto L_0x022c
            int r0 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1))
            if (r0 != 0) goto L_0x021c
            com.google.android.gms.internal.measurement.W r0 = r33.mo10385b()     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.Y r0 = r0.mo10585y()     // Catch:{ all -> 0x05f2 }
            java.lang.String r2 = "Too many error events logged. appId, count"
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r22)     // Catch:{ all -> 0x05f2 }
            long r4 = r5.f10983d     // Catch:{ all -> 0x05f2 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x05f2 }
            r0.mo10594a(r2, r3, r4)     // Catch:{ all -> 0x05f2 }
        L_0x021c:
            com.google.android.gms.internal.measurement.z r0 = r33.mo10712l()     // Catch:{ all -> 0x05f2 }
            r0.mo11052B()     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.z r0 = r33.mo10712l()
            r0.mo11093z()
            return
        L_0x022b:
            r14 = 0
        L_0x022c:
            com.google.android.gms.internal.measurement.zzer r5 = r0.f11782b     // Catch:{ all -> 0x05f2 }
            android.os.Bundle r15 = r5.mo11102b()     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.mc r5 = r33.mo10392h()     // Catch:{ all -> 0x05f2 }
            java.lang.String r6 = "_o"
            java.lang.String r7 = r0.f11783c     // Catch:{ all -> 0x05f2 }
            r5.mo10784a((android.os.Bundle) r15, (java.lang.String) r6, (java.lang.Object) r7)     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.mc r5 = r33.mo10392h()     // Catch:{ all -> 0x05f2 }
            r10 = r22
            boolean r5 = r5.mo10802h(r10)     // Catch:{ all -> 0x05f2 }
            java.lang.String r11 = "_r"
            if (r5 == 0) goto L_0x0263
            com.google.android.gms.internal.measurement.mc r5 = r33.mo10392h()     // Catch:{ all -> 0x05f2 }
            java.lang.String r6 = "_dbg"
            java.lang.Long r7 = java.lang.Long.valueOf(r20)     // Catch:{ all -> 0x05f2 }
            r5.mo10784a((android.os.Bundle) r15, (java.lang.String) r6, (java.lang.Object) r7)     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.mc r5 = r33.mo10392h()     // Catch:{ all -> 0x05f2 }
            java.lang.Long r6 = java.lang.Long.valueOf(r20)     // Catch:{ all -> 0x05f2 }
            r5.mo10784a((android.os.Bundle) r15, (java.lang.String) r11, (java.lang.Object) r6)     // Catch:{ all -> 0x05f2 }
        L_0x0263:
            com.google.android.gms.internal.measurement.z r5 = r33.mo10712l()     // Catch:{ all -> 0x05f2 }
            long r5 = r5.mo11081c(r10)     // Catch:{ all -> 0x05f2 }
            int r7 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r7 <= 0) goto L_0x0284
            com.google.android.gms.internal.measurement.W r7 = r33.mo10385b()     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.Y r7 = r7.mo10576B()     // Catch:{ all -> 0x05f2 }
            java.lang.String r8 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r10)     // Catch:{ all -> 0x05f2 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x05f2 }
            r7.mo10594a(r8, r9, r5)     // Catch:{ all -> 0x05f2 }
        L_0x0284:
            com.google.android.gms.internal.measurement.G r9 = new com.google.android.gms.internal.measurement.G     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.Aa r6 = r1.f11431g     // Catch:{ all -> 0x05f2 }
            java.lang.String r7 = r0.f11783c     // Catch:{ all -> 0x05f2 }
            java.lang.String r8 = r0.f11781a     // Catch:{ all -> 0x05f2 }
            long r12 = r0.f11784d     // Catch:{ all -> 0x05f2 }
            r20 = 0
            r5 = r9
            r0 = r8
            r8 = r10
            r22 = r3
            r3 = r9
            r9 = r0
            r0 = r10
            r4 = r11
            r10 = r12
            r12 = r20
            r20 = r14
            r14 = r15
            r5.<init>((com.google.android.gms.internal.measurement.C3715Aa) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9, (long) r10, (long) r12, (android.os.Bundle) r14)     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.z r5 = r33.mo10712l()     // Catch:{ all -> 0x05f2 }
            java.lang.String r6 = r3.f11110b     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.H r5 = r5.mo11078b((java.lang.String) r0, (java.lang.String) r6)     // Catch:{ all -> 0x05f2 }
            if (r5 != 0) goto L_0x030d
            com.google.android.gms.internal.measurement.z r5 = r33.mo10712l()     // Catch:{ all -> 0x05f2 }
            long r5 = r5.mo11088f(r0)     // Catch:{ all -> 0x05f2 }
            r7 = 500(0x1f4, double:2.47E-321)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 < 0) goto L_0x02f4
            if (r16 == 0) goto L_0x02f4
            com.google.android.gms.internal.measurement.W r2 = r33.mo10385b()     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.Y r2 = r2.mo10585y()     // Catch:{ all -> 0x05f2 }
            java.lang.String r4 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r0)     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.U r6 = r33.mo10390g()     // Catch:{ all -> 0x05f2 }
            java.lang.String r3 = r3.f11110b     // Catch:{ all -> 0x05f2 }
            java.lang.String r3 = r6.mo10557a((java.lang.String) r3)     // Catch:{ all -> 0x05f2 }
            r6 = 500(0x1f4, float:7.0E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x05f2 }
            r2.mo10595a(r4, r5, r3, r6)     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.mc r5 = r33.mo10392h()     // Catch:{ all -> 0x05f2 }
            r7 = 8
            r8 = 0
            r9 = 0
            r10 = 0
            r6 = r0
            r5.mo10787a((java.lang.String) r6, (int) r7, (java.lang.String) r8, (java.lang.String) r9, (int) r10)     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.z r0 = r33.mo10712l()
            r0.mo11093z()
            return
        L_0x02f4:
            com.google.android.gms.internal.measurement.H r21 = new com.google.android.gms.internal.measurement.H     // Catch:{ all -> 0x05f2 }
            java.lang.String r7 = r3.f11110b     // Catch:{ all -> 0x05f2 }
            r8 = 0
            r10 = 0
            long r12 = r3.f11112d     // Catch:{ all -> 0x05f2 }
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r5 = r21
            r6 = r0
            r5.<init>(r6, r7, r8, r10, r12, r14, r16, r17, r18)     // Catch:{ all -> 0x05f2 }
            goto L_0x031c
        L_0x030d:
            com.google.android.gms.internal.measurement.Aa r0 = r1.f11431g     // Catch:{ all -> 0x05f2 }
            long r6 = r5.f11127e     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.G r9 = r3.mo10466a(r0, r6)     // Catch:{ all -> 0x05f2 }
            long r6 = r9.f11112d     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.H r21 = r5.mo10474a(r6)     // Catch:{ all -> 0x05f2 }
            r3 = r9
        L_0x031c:
            r0 = r21
            com.google.android.gms.internal.measurement.z r5 = r33.mo10712l()     // Catch:{ all -> 0x05f2 }
            r5.mo11069a((com.google.android.gms.internal.measurement.C3742H) r0)     // Catch:{ all -> 0x05f2 }
            r33.mo10388e()     // Catch:{ all -> 0x05f2 }
            r33.mo10714n()     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.common.internal.C2061y.m9067a(r3)     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.common.internal.C2061y.m9067a(r35)     // Catch:{ all -> 0x05f2 }
            java.lang.String r0 = r3.f11109a     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.common.internal.C2061y.m9076b((java.lang.String) r0)     // Catch:{ all -> 0x05f2 }
            java.lang.String r0 = r3.f11109a     // Catch:{ all -> 0x05f2 }
            java.lang.String r5 = r2.f11752a     // Catch:{ all -> 0x05f2 }
            boolean r0 = r0.equals(r5)     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.common.internal.C2061y.m9073a((boolean) r0)     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.Cc r5 = new com.google.android.gms.internal.measurement.Cc     // Catch:{ all -> 0x05f2 }
            r5.<init>()     // Catch:{ all -> 0x05f2 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r19)     // Catch:{ all -> 0x05f2 }
            r5.f11044d = r0     // Catch:{ all -> 0x05f2 }
            java.lang.String r0 = "android"
            r5.f11052l = r0     // Catch:{ all -> 0x05f2 }
            java.lang.String r0 = r2.f11752a     // Catch:{ all -> 0x05f2 }
            r5.f11058r = r0     // Catch:{ all -> 0x05f2 }
            java.lang.String r0 = r2.f11755d     // Catch:{ all -> 0x05f2 }
            r5.f11057q = r0     // Catch:{ all -> 0x05f2 }
            java.lang.String r0 = r2.f11754c     // Catch:{ all -> 0x05f2 }
            r5.f11059s = r0     // Catch:{ all -> 0x05f2 }
            long r6 = r2.f11761j     // Catch:{ all -> 0x05f2 }
            r8 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r6 = 0
            if (r0 != 0) goto L_0x0368
            r0 = r6
            goto L_0x036f
        L_0x0368:
            long r7 = r2.f11761j     // Catch:{ all -> 0x05f2 }
            int r0 = (int) r7     // Catch:{ all -> 0x05f2 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x05f2 }
        L_0x036f:
            r5.f11035F = r0     // Catch:{ all -> 0x05f2 }
            long r7 = r2.f11756e     // Catch:{ all -> 0x05f2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x05f2 }
            r5.f11060t = r0     // Catch:{ all -> 0x05f2 }
            java.lang.String r0 = r2.f11753b     // Catch:{ all -> 0x05f2 }
            r5.f11031B = r0     // Catch:{ all -> 0x05f2 }
            long r7 = r2.f11757f     // Catch:{ all -> 0x05f2 }
            r9 = 0
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x0387
            r0 = r6
            goto L_0x038d
        L_0x0387:
            long r7 = r2.f11757f     // Catch:{ all -> 0x05f2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x05f2 }
        L_0x038d:
            r5.f11065y = r0     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.ha r0 = r33.mo10393i()     // Catch:{ all -> 0x05f2 }
            java.lang.String r7 = r2.f11752a     // Catch:{ all -> 0x05f2 }
            android.util.Pair r0 = r0.mo10744a((java.lang.String) r7)     // Catch:{ all -> 0x05f2 }
            if (r0 == 0) goto L_0x03b6
            java.lang.Object r7 = r0.first     // Catch:{ all -> 0x05f2 }
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ all -> 0x05f2 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x05f2 }
            if (r7 != 0) goto L_0x03b6
            boolean r7 = r2.f11766o     // Catch:{ all -> 0x05f2 }
            if (r7 == 0) goto L_0x0409
            java.lang.Object r7 = r0.first     // Catch:{ all -> 0x05f2 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x05f2 }
            r5.f11062v = r7     // Catch:{ all -> 0x05f2 }
            java.lang.Object r0 = r0.second     // Catch:{ all -> 0x05f2 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x05f2 }
            r5.f11063w = r0     // Catch:{ all -> 0x05f2 }
            goto L_0x0409
        L_0x03b6:
            com.google.android.gms.internal.measurement.F r0 = r33.mo10389f()     // Catch:{ all -> 0x05f2 }
            android.content.Context r7 = r33.getContext()     // Catch:{ all -> 0x05f2 }
            boolean r0 = r0.mo10450a(r7)     // Catch:{ all -> 0x05f2 }
            if (r0 != 0) goto L_0x0409
            boolean r0 = r2.f11767p     // Catch:{ all -> 0x05f2 }
            if (r0 == 0) goto L_0x0409
            android.content.Context r0 = r33.getContext()     // Catch:{ all -> 0x05f2 }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ all -> 0x05f2 }
            java.lang.String r7 = "android_id"
            java.lang.String r0 = android.provider.Settings.Secure.getString(r0, r7)     // Catch:{ all -> 0x05f2 }
            if (r0 != 0) goto L_0x03ee
            com.google.android.gms.internal.measurement.W r0 = r33.mo10385b()     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.Y r0 = r0.mo10576B()     // Catch:{ all -> 0x05f2 }
            java.lang.String r7 = "null secure ID. appId"
            java.lang.String r8 = r5.f11058r     // Catch:{ all -> 0x05f2 }
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r8)     // Catch:{ all -> 0x05f2 }
            r0.mo10593a(r7, r8)     // Catch:{ all -> 0x05f2 }
            java.lang.String r0 = "null"
            goto L_0x0407
        L_0x03ee:
            boolean r7 = r0.isEmpty()     // Catch:{ all -> 0x05f2 }
            if (r7 == 0) goto L_0x0407
            com.google.android.gms.internal.measurement.W r7 = r33.mo10385b()     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.Y r7 = r7.mo10576B()     // Catch:{ all -> 0x05f2 }
            java.lang.String r8 = "empty secure ID. appId"
            java.lang.String r11 = r5.f11058r     // Catch:{ all -> 0x05f2 }
            java.lang.Object r11 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r11)     // Catch:{ all -> 0x05f2 }
            r7.mo10593a(r8, r11)     // Catch:{ all -> 0x05f2 }
        L_0x0407:
            r5.f11038I = r0     // Catch:{ all -> 0x05f2 }
        L_0x0409:
            com.google.android.gms.internal.measurement.F r0 = r33.mo10389f()     // Catch:{ all -> 0x05f2 }
            r0.mo10588t()     // Catch:{ all -> 0x05f2 }
            java.lang.String r0 = android.os.Build.MODEL     // Catch:{ all -> 0x05f2 }
            r5.f11054n = r0     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.F r0 = r33.mo10389f()     // Catch:{ all -> 0x05f2 }
            r0.mo10588t()     // Catch:{ all -> 0x05f2 }
            java.lang.String r0 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x05f2 }
            r5.f11053m = r0     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.F r0 = r33.mo10389f()     // Catch:{ all -> 0x05f2 }
            long r7 = r0.mo10458y()     // Catch:{ all -> 0x05f2 }
            int r0 = (int) r7     // Catch:{ all -> 0x05f2 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x05f2 }
            r5.f11056p = r0     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.F r0 = r33.mo10389f()     // Catch:{ all -> 0x05f2 }
            java.lang.String r0 = r0.mo10459z()     // Catch:{ all -> 0x05f2 }
            r5.f11055o = r0     // Catch:{ all -> 0x05f2 }
            r5.f11061u = r6     // Catch:{ all -> 0x05f2 }
            r5.f11047g = r6     // Catch:{ all -> 0x05f2 }
            r5.f11048h = r6     // Catch:{ all -> 0x05f2 }
            r5.f11049i = r6     // Catch:{ all -> 0x05f2 }
            long r7 = r2.f11763l     // Catch:{ all -> 0x05f2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x05f2 }
            r5.f11040K = r0     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.Aa r0 = r1.f11431g     // Catch:{ all -> 0x05f2 }
            boolean r0 = r0.mo10395s()     // Catch:{ all -> 0x05f2 }
            if (r0 == 0) goto L_0x0458
            boolean r0 = com.google.android.gms.internal.measurement.C3908w.m15761x()     // Catch:{ all -> 0x05f2 }
            if (r0 == 0) goto L_0x0458
            r5.f11041L = r6     // Catch:{ all -> 0x05f2 }
        L_0x0458:
            com.google.android.gms.internal.measurement.z r0 = r33.mo10712l()     // Catch:{ all -> 0x05f2 }
            java.lang.String r6 = r2.f11752a     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.r r0 = r0.mo11079b(r6)     // Catch:{ all -> 0x05f2 }
            if (r0 != 0) goto L_0x04c4
            com.google.android.gms.internal.measurement.r r0 = new com.google.android.gms.internal.measurement.r     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.Aa r6 = r1.f11431g     // Catch:{ all -> 0x05f2 }
            java.lang.String r7 = r2.f11752a     // Catch:{ all -> 0x05f2 }
            r0.<init>(r6, r7)     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.Aa r6 = r1.f11431g     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.Q r6 = r6.mo10398w()     // Catch:{ all -> 0x05f2 }
            java.lang.String r6 = r6.mo10514A()     // Catch:{ all -> 0x05f2 }
            r0.mo10903b((java.lang.String) r6)     // Catch:{ all -> 0x05f2 }
            java.lang.String r6 = r2.f11762k     // Catch:{ all -> 0x05f2 }
            r0.mo10914e((java.lang.String) r6)     // Catch:{ all -> 0x05f2 }
            java.lang.String r6 = r2.f11753b     // Catch:{ all -> 0x05f2 }
            r0.mo10906c((java.lang.String) r6)     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.ha r6 = r33.mo10393i()     // Catch:{ all -> 0x05f2 }
            java.lang.String r7 = r2.f11752a     // Catch:{ all -> 0x05f2 }
            java.lang.String r6 = r6.mo10746b((java.lang.String) r7)     // Catch:{ all -> 0x05f2 }
            r0.mo10911d((java.lang.String) r6)     // Catch:{ all -> 0x05f2 }
            r0.mo10919g((long) r9)     // Catch:{ all -> 0x05f2 }
            r0.mo10902b((long) r9)     // Catch:{ all -> 0x05f2 }
            r0.mo10905c((long) r9)     // Catch:{ all -> 0x05f2 }
            java.lang.String r6 = r2.f11754c     // Catch:{ all -> 0x05f2 }
            r0.mo10899a((java.lang.String) r6)     // Catch:{ all -> 0x05f2 }
            long r6 = r2.f11761j     // Catch:{ all -> 0x05f2 }
            r0.mo10910d((long) r6)     // Catch:{ all -> 0x05f2 }
            java.lang.String r6 = r2.f11755d     // Catch:{ all -> 0x05f2 }
            r0.mo10917f((java.lang.String) r6)     // Catch:{ all -> 0x05f2 }
            long r6 = r2.f11756e     // Catch:{ all -> 0x05f2 }
            r0.mo10913e((long) r6)     // Catch:{ all -> 0x05f2 }
            long r6 = r2.f11757f     // Catch:{ all -> 0x05f2 }
            r0.mo10916f((long) r6)     // Catch:{ all -> 0x05f2 }
            boolean r6 = r2.f11759h     // Catch:{ all -> 0x05f2 }
            r0.mo10900a((boolean) r6)     // Catch:{ all -> 0x05f2 }
            long r6 = r2.f11763l     // Catch:{ all -> 0x05f2 }
            r0.mo10898a((long) r6)     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.z r6 = r33.mo10712l()     // Catch:{ all -> 0x05f2 }
            r6.mo11070a((com.google.android.gms.internal.measurement.C3888r) r0)     // Catch:{ all -> 0x05f2 }
        L_0x04c4:
            java.lang.String r6 = r0.mo10897a()     // Catch:{ all -> 0x05f2 }
            r5.f11064x = r6     // Catch:{ all -> 0x05f2 }
            java.lang.String r0 = r0.mo10921h()     // Catch:{ all -> 0x05f2 }
            r5.f11034E = r0     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.z r0 = r33.mo10712l()     // Catch:{ all -> 0x05f2 }
            java.lang.String r2 = r2.f11752a     // Catch:{ all -> 0x05f2 }
            java.util.List r0 = r0.mo11065a((java.lang.String) r2)     // Catch:{ all -> 0x05f2 }
            int r2 = r0.size()     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.Ec[] r2 = new com.google.android.gms.internal.measurement.C3733Ec[r2]     // Catch:{ all -> 0x05f2 }
            r5.f11046f = r2     // Catch:{ all -> 0x05f2 }
            r2 = r20
        L_0x04e4:
            int r6 = r0.size()     // Catch:{ all -> 0x05f2 }
            if (r2 >= r6) goto L_0x051d
            com.google.android.gms.internal.measurement.Ec r6 = new com.google.android.gms.internal.measurement.Ec     // Catch:{ all -> 0x05f2 }
            r6.<init>()     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.Ec[] r7 = r5.f11046f     // Catch:{ all -> 0x05f2 }
            r7[r2] = r6     // Catch:{ all -> 0x05f2 }
            java.lang.Object r7 = r0.get(r2)     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.lc r7 = (com.google.android.gms.internal.measurement.C3867lc) r7     // Catch:{ all -> 0x05f2 }
            java.lang.String r7 = r7.f11536c     // Catch:{ all -> 0x05f2 }
            r6.f11090e = r7     // Catch:{ all -> 0x05f2 }
            java.lang.Object r7 = r0.get(r2)     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.lc r7 = (com.google.android.gms.internal.measurement.C3867lc) r7     // Catch:{ all -> 0x05f2 }
            long r7 = r7.f11537d     // Catch:{ all -> 0x05f2 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x05f2 }
            r6.f11089d = r7     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.mc r7 = r33.mo10392h()     // Catch:{ all -> 0x05f2 }
            java.lang.Object r8 = r0.get(r2)     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.lc r8 = (com.google.android.gms.internal.measurement.C3867lc) r8     // Catch:{ all -> 0x05f2 }
            java.lang.Object r8 = r8.f11538e     // Catch:{ all -> 0x05f2 }
            r7.mo10786a((com.google.android.gms.internal.measurement.C3733Ec) r6, (java.lang.Object) r8)     // Catch:{ all -> 0x05f2 }
            int r2 = r2 + 1
            goto L_0x04e4
        L_0x051d:
            com.google.android.gms.internal.measurement.z r0 = r33.mo10712l()     // Catch:{ IOException -> 0x058d }
            long r5 = r0.mo11061a((com.google.android.gms.internal.measurement.C3725Cc) r5)     // Catch:{ IOException -> 0x058d }
            com.google.android.gms.internal.measurement.z r0 = r33.mo10712l()     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.zzer r2 = r3.f11114f     // Catch:{ all -> 0x05f2 }
            if (r2 == 0) goto L_0x0582
            com.google.android.gms.internal.measurement.zzer r2 = r3.f11114f     // Catch:{ all -> 0x05f2 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x05f2 }
        L_0x0533:
            boolean r7 = r2.hasNext()     // Catch:{ all -> 0x05f2 }
            if (r7 == 0) goto L_0x0548
            java.lang.Object r7 = r2.next()     // Catch:{ all -> 0x05f2 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x05f2 }
            boolean r7 = r4.equals(r7)     // Catch:{ all -> 0x05f2 }
            if (r7 == 0) goto L_0x0533
        L_0x0545:
            r2 = r19
            goto L_0x0584
        L_0x0548:
            com.google.android.gms.internal.measurement.va r2 = r33.mo10395s()     // Catch:{ all -> 0x05f2 }
            java.lang.String r4 = r3.f11109a     // Catch:{ all -> 0x05f2 }
            java.lang.String r7 = r3.f11110b     // Catch:{ all -> 0x05f2 }
            boolean r2 = r2.mo10989c(r4, r7)     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.z r24 = r33.mo10712l()     // Catch:{ all -> 0x05f2 }
            long r25 = r33.mo10397v()     // Catch:{ all -> 0x05f2 }
            java.lang.String r4 = r3.f11109a     // Catch:{ all -> 0x05f2 }
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r27 = r4
            com.google.android.gms.internal.measurement.A r4 = r24.mo11063a(r25, r27, r28, r29, r30, r31, r32)     // Catch:{ all -> 0x05f2 }
            if (r2 == 0) goto L_0x0582
            long r7 = r4.f10984e     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.w r2 = r33.mo10394j()     // Catch:{ all -> 0x05f2 }
            java.lang.String r4 = r3.f11109a     // Catch:{ all -> 0x05f2 }
            int r2 = r2.mo10997a((java.lang.String) r4)     // Catch:{ all -> 0x05f2 }
            long r11 = (long) r2     // Catch:{ all -> 0x05f2 }
            int r2 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r2 >= 0) goto L_0x0582
            goto L_0x0545
        L_0x0582:
            r2 = r20
        L_0x0584:
            boolean r0 = r0.mo11074a((com.google.android.gms.internal.measurement.C3738G) r3, (long) r5, (boolean) r2)     // Catch:{ all -> 0x05f2 }
            if (r0 == 0) goto L_0x05a1
            r1.f11434j = r9     // Catch:{ all -> 0x05f2 }
            goto L_0x05a1
        L_0x058d:
            r0 = move-exception
            com.google.android.gms.internal.measurement.W r2 = r33.mo10385b()     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.Y r2 = r2.mo10585y()     // Catch:{ all -> 0x05f2 }
            java.lang.String r4 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r5 = r5.f11058r     // Catch:{ all -> 0x05f2 }
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r5)     // Catch:{ all -> 0x05f2 }
            r2.mo10594a(r4, r5, r0)     // Catch:{ all -> 0x05f2 }
        L_0x05a1:
            com.google.android.gms.internal.measurement.z r0 = r33.mo10712l()     // Catch:{ all -> 0x05f2 }
            r0.mo11052B()     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.W r0 = r33.mo10385b()     // Catch:{ all -> 0x05f2 }
            r2 = 2
            boolean r0 = r0.mo10584a((int) r2)     // Catch:{ all -> 0x05f2 }
            if (r0 == 0) goto L_0x05c8
            com.google.android.gms.internal.measurement.W r0 = r33.mo10385b()     // Catch:{ all -> 0x05f2 }
            com.google.android.gms.internal.measurement.Y r0 = r0.mo10580F()     // Catch:{ all -> 0x05f2 }
            java.lang.String r2 = "Event recorded"
            com.google.android.gms.internal.measurement.U r4 = r33.mo10390g()     // Catch:{ all -> 0x05f2 }
            java.lang.String r3 = r4.mo10553a((com.google.android.gms.internal.measurement.C3738G) r3)     // Catch:{ all -> 0x05f2 }
            r0.mo10593a(r2, r3)     // Catch:{ all -> 0x05f2 }
        L_0x05c8:
            com.google.android.gms.internal.measurement.z r0 = r33.mo10712l()
            r0.mo11093z()
            r33.mo10399x()
            com.google.android.gms.internal.measurement.W r0 = r33.mo10385b()
            com.google.android.gms.internal.measurement.Y r0 = r0.mo10580F()
            long r2 = java.lang.System.nanoTime()
            long r2 = r2 - r22
            r4 = 500000(0x7a120, double:2.47033E-318)
            long r2 = r2 + r4
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 / r4
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "Background event processing time, ms"
            r0.mo10593a(r3, r2)
            return
        L_0x05f2:
            r0 = move-exception
            com.google.android.gms.internal.measurement.z r2 = r33.mo10712l()
            r2.mo11093z()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3839ec.m15393b(com.google.android.gms.internal.measurement.zzeu, com.google.android.gms.internal.measurement.zzdz):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x014a  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.C3888r m15394e(com.google.android.gms.internal.measurement.zzdz r8) {
        /*
            r7 = this;
            r7.mo10388e()
            r7.mo10714n()
            com.google.android.gms.common.internal.C2061y.m9067a(r8)
            java.lang.String r0 = r8.f11752a
            com.google.android.gms.common.internal.C2061y.m9076b((java.lang.String) r0)
            com.google.android.gms.internal.measurement.z r0 = r7.mo10712l()
            java.lang.String r1 = r8.f11752a
            com.google.android.gms.internal.measurement.r r0 = r0.mo11079b(r1)
            com.google.android.gms.internal.measurement.ha r1 = r7.mo10393i()
            java.lang.String r2 = r8.f11752a
            java.lang.String r1 = r1.mo10746b((java.lang.String) r2)
            r2 = 1
            if (r0 != 0) goto L_0x0040
            com.google.android.gms.internal.measurement.r r0 = new com.google.android.gms.internal.measurement.r
            com.google.android.gms.internal.measurement.Aa r3 = r7.f11431g
            java.lang.String r4 = r8.f11752a
            r0.<init>(r3, r4)
            com.google.android.gms.internal.measurement.Aa r3 = r7.f11431g
            com.google.android.gms.internal.measurement.Q r3 = r3.mo10398w()
            java.lang.String r3 = r3.mo10514A()
            r0.mo10903b((java.lang.String) r3)
            r0.mo10911d((java.lang.String) r1)
        L_0x003e:
            r1 = r2
            goto L_0x005c
        L_0x0040:
            java.lang.String r3 = r0.mo10918g()
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x005b
            r0.mo10911d((java.lang.String) r1)
            com.google.android.gms.internal.measurement.Aa r1 = r7.f11431g
            com.google.android.gms.internal.measurement.Q r1 = r1.mo10398w()
            java.lang.String r1 = r1.mo10514A()
            r0.mo10903b((java.lang.String) r1)
            goto L_0x003e
        L_0x005b:
            r1 = 0
        L_0x005c:
            java.lang.String r3 = r8.f11753b
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0076
            java.lang.String r3 = r8.f11753b
            java.lang.String r4 = r0.mo10901b()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0076
            java.lang.String r1 = r8.f11753b
            r0.mo10906c((java.lang.String) r1)
            r1 = r2
        L_0x0076:
            java.lang.String r3 = r8.f11762k
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0090
            java.lang.String r3 = r8.f11762k
            java.lang.String r4 = r0.mo10921h()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0090
            java.lang.String r1 = r8.f11762k
            r0.mo10914e((java.lang.String) r1)
            r1 = r2
        L_0x0090:
            long r3 = r8.f11756e
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x00a6
            long r5 = r0.mo10931m()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x00a6
            long r3 = r8.f11756e
            r0.mo10913e((long) r3)
            r1 = r2
        L_0x00a6:
            java.lang.String r3 = r8.f11754c
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x00c0
            java.lang.String r3 = r8.f11754c
            java.lang.String r4 = r0.mo10909d()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00c0
            java.lang.String r1 = r8.f11754c
            r0.mo10899a((java.lang.String) r1)
            r1 = r2
        L_0x00c0:
            long r3 = r8.f11761j
            long r5 = r0.mo10927k()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x00d0
            long r3 = r8.f11761j
            r0.mo10910d((long) r3)
            r1 = r2
        L_0x00d0:
            java.lang.String r3 = r8.f11755d
            if (r3 == 0) goto L_0x00e4
            java.lang.String r4 = r0.mo10929l()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00e4
            java.lang.String r1 = r8.f11755d
            r0.mo10917f((java.lang.String) r1)
            r1 = r2
        L_0x00e4:
            long r3 = r8.f11757f
            long r5 = r0.mo10933n()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x00f4
            long r3 = r8.f11757f
            r0.mo10916f((long) r3)
            r1 = r2
        L_0x00f4:
            boolean r3 = r8.f11759h
            boolean r4 = r0.mo10908c()
            if (r3 == r4) goto L_0x0102
            boolean r1 = r8.f11759h
            r0.mo10900a((boolean) r1)
            r1 = r2
        L_0x0102:
            java.lang.String r3 = r8.f11758g
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x011c
            java.lang.String r3 = r8.f11758g
            java.lang.String r4 = r0.mo10946y()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x011c
            java.lang.String r1 = r8.f11758g
            r0.mo10920g((java.lang.String) r1)
            r1 = r2
        L_0x011c:
            long r3 = r8.f11763l
            long r5 = r0.mo10894A()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x012c
            long r3 = r8.f11763l
            r0.mo10898a((long) r3)
            r1 = r2
        L_0x012c:
            boolean r3 = r8.f11766o
            boolean r4 = r0.mo10895B()
            if (r3 == r4) goto L_0x013a
            boolean r1 = r8.f11766o
            r0.mo10904b((boolean) r1)
            r1 = r2
        L_0x013a:
            boolean r3 = r8.f11767p
            boolean r4 = r0.mo10896C()
            if (r3 == r4) goto L_0x0148
            boolean r8 = r8.f11767p
            r0.mo10907c((boolean) r8)
            r1 = r2
        L_0x0148:
            if (r1 == 0) goto L_0x0151
            com.google.android.gms.internal.measurement.z r8 = r7.mo10712l()
            r8.mo11070a((com.google.android.gms.internal.measurement.C3888r) r0)
        L_0x0151:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3839ec.m15394e(com.google.android.gms.internal.measurement.zzdz):com.google.android.gms.internal.measurement.r");
    }

    /* renamed from: s */
    private final C3905va mo10395s() {
        m15392b((C3835dc) this.f11425a);
        return this.f11425a;
    }

    /* renamed from: t */
    private final C3841fa m15396t() {
        C3841fa faVar = this.f11428d;
        if (faVar != null) {
            return faVar;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    /* renamed from: u */
    private final C3823ac mo10396u() {
        m15392b((C3835dc) this.f11429e);
        return this.f11429e;
    }

    /* renamed from: v */
    private final long mo10397v() {
        long a = mo10382a().mo7725a();
        C3849ha i = mo10393i();
        i.mo10588t();
        i.mo10451d();
        long a2 = i.f11476j.mo10763a();
        if (a2 == 0) {
            a2 = 1 + ((long) i.mo10454o().mo10805z().nextInt(86400000));
            i.f11476j.mo10764a(a2);
        }
        return ((((a + a2) / 1000) / 60) / 60) / 24;
    }

    /* renamed from: w */
    private final boolean mo10398w() {
        mo10388e();
        mo10714n();
        return mo10712l().mo11058H() || !TextUtils.isEmpty(mo10712l().mo11053C());
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0185  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void mo10399x() {
        /*
            r20 = this;
            r0 = r20
            r20.mo10388e()
            r20.mo10714n()
            boolean r1 = r20.mo10373A()
            if (r1 != 0) goto L_0x000f
            return
        L_0x000f:
            long r1 = r0.f11434j
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0050
            com.google.android.gms.common.util.e r1 = r20.mo10382a()
            long r1 = r1.mo7726b()
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            long r7 = r0.f11434j
            long r1 = r1 - r7
            long r1 = java.lang.Math.abs(r1)
            long r5 = r5 - r1
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x004e
            com.google.android.gms.internal.measurement.W r1 = r20.mo10385b()
            com.google.android.gms.internal.measurement.Y r1 = r1.mo10580F()
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.lang.String r3 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r1.mo10593a(r3, r2)
            com.google.android.gms.internal.measurement.fa r1 = r20.m15396t()
            r1.mo10727a()
            com.google.android.gms.internal.measurement.ac r1 = r20.mo10396u()
            r1.mo10661y()
            return
        L_0x004e:
            r0.f11434j = r3
        L_0x0050:
            com.google.android.gms.internal.measurement.Aa r1 = r0.f11431g
            boolean r1 = r1.mo10381I()
            if (r1 == 0) goto L_0x0222
            boolean r1 = r20.mo10398w()
            if (r1 != 0) goto L_0x0060
            goto L_0x0222
        L_0x0060:
            com.google.android.gms.common.util.e r1 = r20.mo10382a()
            long r1 = r1.mo7725a()
            com.google.android.gms.internal.measurement.M<java.lang.Long> r5 = com.google.android.gms.internal.measurement.C3758L.f11173G
            java.lang.Object r5 = r5.mo10498a()
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.internal.measurement.z r7 = r20.mo10712l()
            boolean r7 = r7.mo11059I()
            if (r7 != 0) goto L_0x008f
            com.google.android.gms.internal.measurement.z r7 = r20.mo10712l()
            boolean r7 = r7.mo11054D()
            if (r7 == 0) goto L_0x008d
            goto L_0x008f
        L_0x008d:
            r7 = 0
            goto L_0x0090
        L_0x008f:
            r7 = 1
        L_0x0090:
            if (r7 == 0) goto L_0x00ae
            com.google.android.gms.internal.measurement.w r9 = r20.mo10394j()
            java.lang.String r9 = r9.mo11014w()
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 != 0) goto L_0x00ab
            java.lang.String r10 = ".none."
            boolean r9 = r10.equals(r9)
            if (r9 != 0) goto L_0x00ab
            com.google.android.gms.internal.measurement.M<java.lang.Long> r9 = com.google.android.gms.internal.measurement.C3758L.f11168B
            goto L_0x00b0
        L_0x00ab:
            com.google.android.gms.internal.measurement.M<java.lang.Long> r9 = com.google.android.gms.internal.measurement.C3758L.f11167A
            goto L_0x00b0
        L_0x00ae:
            com.google.android.gms.internal.measurement.M<java.lang.Long> r9 = com.google.android.gms.internal.measurement.C3758L.f11219z
        L_0x00b0:
            java.lang.Object r9 = r9.mo10498a()
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            long r9 = java.lang.Math.max(r3, r9)
            com.google.android.gms.internal.measurement.ha r11 = r20.mo10393i()
            com.google.android.gms.internal.measurement.ka r11 = r11.f11472f
            long r11 = r11.mo10763a()
            com.google.android.gms.internal.measurement.ha r13 = r20.mo10393i()
            com.google.android.gms.internal.measurement.ka r13 = r13.f11473g
            long r13 = r13.mo10763a()
            com.google.android.gms.internal.measurement.z r15 = r20.mo10712l()
            r16 = r9
            long r8 = r15.mo11056F()
            com.google.android.gms.internal.measurement.z r10 = r20.mo10712l()
            r18 = r5
            long r5 = r10.mo11057G()
            long r5 = java.lang.Math.max(r8, r5)
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x00f1
        L_0x00ee:
            r8 = r3
            goto L_0x0165
        L_0x00f1:
            long r5 = r5 - r1
            long r5 = java.lang.Math.abs(r5)
            long r5 = r1 - r5
            long r11 = r11 - r1
            long r8 = java.lang.Math.abs(r11)
            long r8 = r1 - r8
            long r13 = r13 - r1
            long r10 = java.lang.Math.abs(r13)
            long r1 = r1 - r10
            long r8 = java.lang.Math.max(r8, r1)
            long r10 = r5 + r18
            if (r7 == 0) goto L_0x0117
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x0117
            long r10 = java.lang.Math.min(r5, r8)
            long r10 = r10 + r16
        L_0x0117:
            com.google.android.gms.internal.measurement.mc r7 = r20.mo10392h()
            r12 = r16
            boolean r7 = r7.mo10788a((long) r8, (long) r12)
            if (r7 != 0) goto L_0x0125
            long r8 = r8 + r12
            goto L_0x0126
        L_0x0125:
            r8 = r10
        L_0x0126:
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x0165
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x0165
            r5 = 0
        L_0x012f:
            r6 = 20
            com.google.android.gms.internal.measurement.M<java.lang.Integer> r7 = com.google.android.gms.internal.measurement.C3758L.f11175I
            java.lang.Object r7 = r7.mo10498a()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r10 = 0
            int r7 = java.lang.Math.max(r10, r7)
            int r6 = java.lang.Math.min(r6, r7)
            if (r5 >= r6) goto L_0x00ee
            r6 = 1
            long r6 = r6 << r5
            com.google.android.gms.internal.measurement.M<java.lang.Long> r11 = com.google.android.gms.internal.measurement.C3758L.f11174H
            java.lang.Object r11 = r11.mo10498a()
            java.lang.Long r11 = (java.lang.Long) r11
            long r11 = r11.longValue()
            long r11 = java.lang.Math.max(r3, r11)
            long r11 = r11 * r6
            long r8 = r8 + r11
            int r6 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x0162
            goto L_0x0165
        L_0x0162:
            int r5 = r5 + 1
            goto L_0x012f
        L_0x0165:
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0185
            com.google.android.gms.internal.measurement.W r1 = r20.mo10385b()
            com.google.android.gms.internal.measurement.Y r1 = r1.mo10580F()
            java.lang.String r2 = "Next upload time is 0"
            r1.mo10592a(r2)
            com.google.android.gms.internal.measurement.fa r1 = r20.m15396t()
            r1.mo10727a()
            com.google.android.gms.internal.measurement.ac r1 = r20.mo10396u()
            r1.mo10661y()
            return
        L_0x0185:
            com.google.android.gms.internal.measurement.aa r1 = r20.mo10713m()
            boolean r1 = r1.mo10658y()
            if (r1 != 0) goto L_0x01ab
            com.google.android.gms.internal.measurement.W r1 = r20.mo10385b()
            com.google.android.gms.internal.measurement.Y r1 = r1.mo10580F()
            java.lang.String r2 = "No network"
            r1.mo10592a(r2)
            com.google.android.gms.internal.measurement.fa r1 = r20.m15396t()
            r1.mo10728b()
            com.google.android.gms.internal.measurement.ac r1 = r20.mo10396u()
            r1.mo10661y()
            return
        L_0x01ab:
            com.google.android.gms.internal.measurement.ha r1 = r20.mo10393i()
            com.google.android.gms.internal.measurement.ka r1 = r1.f11474h
            long r1 = r1.mo10763a()
            com.google.android.gms.internal.measurement.M<java.lang.Long> r5 = com.google.android.gms.internal.measurement.C3758L.f11217x
            java.lang.Object r5 = r5.mo10498a()
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.internal.measurement.mc r7 = r20.mo10392h()
            boolean r7 = r7.mo10788a((long) r1, (long) r5)
            if (r7 != 0) goto L_0x01d4
            long r1 = r1 + r5
            long r8 = java.lang.Math.max(r8, r1)
        L_0x01d4:
            com.google.android.gms.internal.measurement.fa r1 = r20.m15396t()
            r1.mo10727a()
            com.google.android.gms.common.util.e r1 = r20.mo10382a()
            long r1 = r1.mo7725a()
            long r8 = r8 - r1
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x0209
            com.google.android.gms.internal.measurement.M<java.lang.Long> r1 = com.google.android.gms.internal.measurement.C3758L.f11169C
            java.lang.Object r1 = r1.mo10498a()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r8 = java.lang.Math.max(r3, r1)
            com.google.android.gms.internal.measurement.ha r1 = r20.mo10393i()
            com.google.android.gms.internal.measurement.ka r1 = r1.f11472f
            com.google.android.gms.common.util.e r2 = r20.mo10382a()
            long r2 = r2.mo7725a()
            r1.mo10764a(r2)
        L_0x0209:
            com.google.android.gms.internal.measurement.W r1 = r20.mo10385b()
            com.google.android.gms.internal.measurement.Y r1 = r1.mo10580F()
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            java.lang.String r3 = "Upload scheduled in approximately ms"
            r1.mo10593a(r3, r2)
            com.google.android.gms.internal.measurement.ac r1 = r20.mo10396u()
            r1.mo10660a(r8)
            return
        L_0x0222:
            com.google.android.gms.internal.measurement.W r1 = r20.mo10385b()
            com.google.android.gms.internal.measurement.Y r1 = r1.mo10580F()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.mo10592a(r2)
            com.google.android.gms.internal.measurement.fa r1 = r20.m15396t()
            r1.mo10727a()
            com.google.android.gms.internal.measurement.ac r1 = r20.mo10396u()
            r1.mo10661y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3839ec.mo10399x():void");
    }

    /* renamed from: y */
    private final void mo10400y() {
        mo10388e();
        if (this.f11438n || this.f11439o || this.f11440p) {
            mo10385b().mo10580F().mo10595a("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f11438n), Boolean.valueOf(this.f11439o), Boolean.valueOf(this.f11440p));
            return;
        }
        mo10385b().mo10580F().mo10592a("Stopping uploading service(s)");
        List<Runnable> list = this.f11435k;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            this.f11435k.clear();
        }
    }

    /* renamed from: z */
    private final boolean mo10401z() {
        String str;
        C3809Y y;
        mo10388e();
        try {
            this.f11442r = new RandomAccessFile(new File(getContext().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.f11441q = this.f11442r.tryLock();
            if (this.f11441q != null) {
                mo10385b().mo10580F().mo10592a("Storage concurrent access okay");
                return true;
            }
            mo10385b().mo10585y().mo10592a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            e = e;
            y = mo10385b().mo10585y();
            str = "Failed to acquire storage lock";
            y.mo10593a(str, e);
            return false;
        } catch (IOException e2) {
            e = e2;
            y = mo10385b().mo10585y();
            str = "Failed to access storage lock file";
            y.mo10593a(str, e);
            return false;
        }
    }

    /* renamed from: a */
    public C2083e mo10382a() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final zzdz mo10692a(String str) {
        C3809Y E;
        String str2;
        Object obj;
        String str3 = str;
        C3888r b = mo10712l().mo11079b(str3);
        if (b == null || TextUtils.isEmpty(b.mo10909d())) {
            E = mo10385b().mo10579E();
            str2 = "No app data available; dropping";
            obj = str3;
        } else {
            Boolean b2 = m15391b(b);
            if (b2 == null || b2.booleanValue()) {
                C3888r rVar = b;
                return new zzdz(str, b.mo10901b(), b.mo10909d(), b.mo10927k(), b.mo10929l(), b.mo10931m(), b.mo10933n(), (String) null, b.mo10908c(), false, b.mo10921h(), b.mo10894A(), 0, 0, rVar.mo10895B(), rVar.mo10896C(), false);
            }
            E = mo10385b().mo10585y();
            str2 = "App version does not match; dropping. appId";
            obj = C3801W.m15166a(str);
        }
        E.mo10593a(str2, obj);
        return null;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10693a(int i, Throwable th, byte[] bArr, String str) {
        C3920z l;
        mo10388e();
        mo10714n();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.f11439o = false;
                mo10400y();
                throw th2;
            }
        }
        List<Long> list = this.f11443s;
        this.f11443s = null;
        boolean z = true;
        if ((i == 200 || i == 204) && th == null) {
            try {
                mo10393i().f11472f.mo10764a(mo10382a().mo7725a());
                mo10393i().f11473g.mo10764a(0);
                mo10399x();
                mo10385b().mo10580F().mo10594a("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                mo10712l().mo11092y();
                try {
                    for (Long next : list) {
                        try {
                            l = mo10712l();
                            long longValue = next.longValue();
                            l.mo10451d();
                            l.mo10685v();
                            if (l.mo11051A().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e) {
                            l.mo10385b().mo10585y().mo10593a("Failed to delete a bundle in a queue table", e);
                            throw e;
                        } catch (SQLiteException e2) {
                            if (this.f11444t == null || !this.f11444t.contains(next)) {
                                throw e2;
                            }
                        }
                    }
                    mo10712l().mo11052B();
                    mo10712l().mo11093z();
                    this.f11444t = null;
                    if (!mo10713m().mo10658y() || !mo10398w()) {
                        this.f11445u = -1;
                        mo10399x();
                    } else {
                        mo10715o();
                    }
                    this.f11434j = 0;
                } catch (Throwable th3) {
                    mo10712l().mo11093z();
                    throw th3;
                }
            } catch (SQLiteException e3) {
                mo10385b().mo10585y().mo10593a("Database error while trying to delete uploaded bundles", e3);
                this.f11434j = mo10382a().mo7726b();
                mo10385b().mo10580F().mo10593a("Disable upload, time", Long.valueOf(this.f11434j));
            }
        } else {
            mo10385b().mo10580F().mo10594a("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            mo10393i().f11473g.mo10764a(mo10382a().mo7725a());
            if (i != 503) {
                if (i != 429) {
                    z = false;
                }
            }
            if (z) {
                mo10393i().f11474h.mo10764a(mo10382a().mo7725a());
            }
            if (mo10394j().mo11008g(str)) {
                mo10712l().mo11072a(list);
            }
            mo10399x();
        }
        this.f11439o = false;
        mo10400y();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10694a(C3715Aa aa) {
        this.f11431g = aa;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10695a(C3835dc dcVar) {
        this.f11436l++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10696a(C3859jc jcVar) {
        mo10388e();
        C3920z zVar = new C3920z(this.f11431g);
        zVar.mo10686x();
        this.f11427c = zVar;
        mo10394j().mo10999a((C3916y) this.f11425a);
        C3896t tVar = new C3896t(this.f11431g);
        tVar.mo10686x();
        this.f11430f = tVar;
        C3823ac acVar = new C3823ac(this.f11431g);
        acVar.mo10686x();
        this.f11429e = acVar;
        this.f11428d = new C3841fa(this.f11431g);
        if (this.f11436l != this.f11437m) {
            mo10385b().mo10585y().mo10594a("Not all upload components initialized", Integer.valueOf(this.f11436l), Integer.valueOf(this.f11437m));
        }
        this.f11432h = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10697a(zzdz zzdz) {
        if (this.f11443s != null) {
            this.f11444t = new ArrayList();
            this.f11444t.addAll(this.f11443s);
        }
        C3920z l = mo10712l();
        String str = zzdz.f11752a;
        C2061y.m9076b(str);
        l.mo10451d();
        l.mo10685v();
        try {
            SQLiteDatabase A = l.mo11051A();
            String[] strArr = {str};
            int delete = A.delete("apps", "app_id=?", strArr) + 0 + A.delete("events", "app_id=?", strArr) + A.delete("user_attributes", "app_id=?", strArr) + A.delete("conditional_properties", "app_id=?", strArr) + A.delete("raw_events", "app_id=?", strArr) + A.delete("raw_events_metadata", "app_id=?", strArr) + A.delete("queue", "app_id=?", strArr) + A.delete("audience_filter_values", "app_id=?", strArr) + A.delete("main_event_params", "app_id=?", strArr);
            if (delete > 0) {
                l.mo10385b().mo10580F().mo10594a("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            l.mo10385b().mo10585y().mo10594a("Error resetting analytics data. appId, error", C3801W.m15166a(str), e);
        }
        zzdz a = m15385a(getContext(), zzdz.f11752a, zzdz.f11753b, zzdz.f11759h, zzdz.f11766o, zzdz.f11767p, zzdz.f11764m);
        if (!mo10394j().mo11010i(zzdz.f11752a) || zzdz.f11759h) {
            mo10709c(a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10698a(zzed zzed, zzdz zzdz) {
        C3809Y y;
        String str;
        Object a;
        String c;
        Object b;
        C3809Y y2;
        String str2;
        Object a2;
        String c2;
        Object obj;
        C2061y.m9067a(zzed);
        C2061y.m9076b(zzed.f11769a);
        C2061y.m9067a(zzed.f11770b);
        C2061y.m9067a(zzed.f11771c);
        C2061y.m9076b(zzed.f11771c.f11786b);
        mo10388e();
        mo10714n();
        if (!TextUtils.isEmpty(zzdz.f11753b)) {
            if (!zzdz.f11759h) {
                m15394e(zzdz);
                return;
            }
            zzed zzed2 = new zzed(zzed);
            boolean z = false;
            zzed2.f11773e = false;
            mo10712l().mo11092y();
            try {
                zzed e = mo10712l().mo11085e(zzed2.f11769a, zzed2.f11771c.f11786b);
                if (e != null && !e.f11770b.equals(zzed2.f11770b)) {
                    mo10385b().mo10576B().mo10595a("Updating a conditional user property with different origin. name, origin, origin (from DB)", mo10390g().mo10559c(zzed2.f11771c.f11786b), zzed2.f11770b, e.f11770b);
                }
                if (e != null && e.f11773e) {
                    zzed2.f11770b = e.f11770b;
                    zzed2.f11772d = e.f11772d;
                    zzed2.f11776h = e.f11776h;
                    zzed2.f11774f = e.f11774f;
                    zzed2.f11777i = e.f11777i;
                    zzed2.f11773e = e.f11773e;
                    zzed2.f11771c = new zzjx(zzed2.f11771c.f11786b, e.f11771c.f11787c, zzed2.f11771c.mo11112b(), e.f11771c.f11791g);
                } else if (TextUtils.isEmpty(zzed2.f11774f)) {
                    zzed2.f11771c = new zzjx(zzed2.f11771c.f11786b, zzed2.f11772d, zzed2.f11771c.mo11112b(), zzed2.f11771c.f11791g);
                    zzed2.f11773e = true;
                    z = true;
                }
                if (zzed2.f11773e) {
                    zzjx zzjx = zzed2.f11771c;
                    C3867lc lcVar = new C3867lc(zzed2.f11769a, zzed2.f11770b, zzjx.f11786b, zzjx.f11787c, zzjx.mo11112b());
                    if (mo10712l().mo11075a(lcVar)) {
                        y2 = mo10385b().mo10579E();
                        str2 = "User property updated immediately";
                        a2 = zzed2.f11769a;
                        c2 = mo10390g().mo10559c(lcVar.f11536c);
                        obj = lcVar.f11538e;
                    } else {
                        y2 = mo10385b().mo10585y();
                        str2 = "(2)Too many active user properties, ignoring";
                        a2 = C3801W.m15166a(zzed2.f11769a);
                        c2 = mo10390g().mo10559c(lcVar.f11536c);
                        obj = lcVar.f11538e;
                    }
                    y2.mo10595a(str2, a2, c2, obj);
                    if (z && zzed2.f11777i != null) {
                        m15393b(new zzeu(zzed2.f11777i, zzed2.f11772d), zzdz);
                    }
                }
                if (mo10712l().mo11076a(zzed2)) {
                    y = mo10385b().mo10579E();
                    str = "Conditional property added";
                    a = zzed2.f11769a;
                    c = mo10390g().mo10559c(zzed2.f11771c.f11786b);
                    b = zzed2.f11771c.mo11112b();
                } else {
                    y = mo10385b().mo10585y();
                    str = "Too many conditional properties, ignoring";
                    a = C3801W.m15166a(zzed2.f11769a);
                    c = mo10390g().mo10559c(zzed2.f11771c.f11786b);
                    b = zzed2.f11771c.mo11112b();
                }
                y.mo10595a(str, a, c, b);
                mo10712l().mo11052B();
            } finally {
                mo10712l().mo11093z();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10699a(zzeu zzeu, zzdz zzdz) {
        List<zzed> list;
        List<zzed> list2;
        List<zzed> list3;
        C3809Y y;
        String str;
        Object a;
        String c;
        Object obj;
        zzeu zzeu2 = zzeu;
        zzdz zzdz2 = zzdz;
        C2061y.m9067a(zzdz);
        C2061y.m9076b(zzdz2.f11752a);
        mo10388e();
        mo10714n();
        String str2 = zzdz2.f11752a;
        long j = zzeu2.f11784d;
        mo10392h();
        if (C3871mc.m15517a(zzeu, zzdz)) {
            if (!zzdz2.f11759h) {
                m15394e(zzdz2);
                return;
            }
            mo10712l().mo11092y();
            try {
                C3920z l = mo10712l();
                C2061y.m9076b(str2);
                l.mo10451d();
                l.mo10685v();
                int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                if (i < 0) {
                    l.mo10385b().mo10576B().mo10594a("Invalid time querying timed out conditional properties", C3801W.m15166a(str2), Long.valueOf(j));
                    list = Collections.emptyList();
                } else {
                    list = l.mo11068a("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
                }
                for (zzed next : list) {
                    if (next != null) {
                        mo10385b().mo10579E().mo10595a("User property timed out", next.f11769a, mo10390g().mo10559c(next.f11771c.f11786b), next.f11771c.mo11112b());
                        if (next.f11775g != null) {
                            m15393b(new zzeu(next.f11775g, j), zzdz2);
                        }
                        mo10712l().mo11087f(str2, next.f11771c.f11786b);
                    }
                }
                C3920z l2 = mo10712l();
                C2061y.m9076b(str2);
                l2.mo10451d();
                l2.mo10685v();
                if (i < 0) {
                    l2.mo10385b().mo10576B().mo10594a("Invalid time querying expired conditional properties", C3801W.m15166a(str2), Long.valueOf(j));
                    list2 = Collections.emptyList();
                } else {
                    list2 = l2.mo11068a("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(list2.size());
                for (zzed next2 : list2) {
                    if (next2 != null) {
                        mo10385b().mo10579E().mo10595a("User property expired", next2.f11769a, mo10390g().mo10559c(next2.f11771c.f11786b), next2.f11771c.mo11112b());
                        mo10712l().mo11082c(str2, next2.f11771c.f11786b);
                        if (next2.f11779k != null) {
                            arrayList.add(next2.f11779k);
                        }
                        mo10712l().mo11087f(str2, next2.f11771c.f11786b);
                    }
                }
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    m15393b(new zzeu((zzeu) obj2, j), zzdz2);
                }
                C3920z l3 = mo10712l();
                String str3 = zzeu2.f11781a;
                C2061y.m9076b(str2);
                C2061y.m9076b(str3);
                l3.mo10451d();
                l3.mo10685v();
                if (i < 0) {
                    l3.mo10385b().mo10576B().mo10595a("Invalid time querying triggered conditional properties", C3801W.m15166a(str2), l3.mo10453n().mo10557a(str3), Long.valueOf(j));
                    list3 = Collections.emptyList();
                } else {
                    list3 = l3.mo11068a("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j)});
                }
                ArrayList arrayList2 = new ArrayList(list3.size());
                for (zzed next3 : list3) {
                    if (next3 != null) {
                        zzjx zzjx = next3.f11771c;
                        C3867lc lcVar = r4;
                        C3867lc lcVar2 = new C3867lc(next3.f11769a, next3.f11770b, zzjx.f11786b, j, zzjx.mo11112b());
                        if (mo10712l().mo11075a(lcVar)) {
                            y = mo10385b().mo10579E();
                            str = "User property triggered";
                            a = next3.f11769a;
                            c = mo10390g().mo10559c(lcVar.f11536c);
                            obj = lcVar.f11538e;
                        } else {
                            y = mo10385b().mo10585y();
                            str = "Too many active user properties, ignoring";
                            a = C3801W.m15166a(next3.f11769a);
                            c = mo10390g().mo10559c(lcVar.f11536c);
                            obj = lcVar.f11538e;
                        }
                        y.mo10595a(str, a, c, obj);
                        if (next3.f11777i != null) {
                            arrayList2.add(next3.f11777i);
                        }
                        next3.f11771c = new zzjx(lcVar);
                        next3.f11773e = true;
                        mo10712l().mo11076a(next3);
                    }
                }
                m15393b(zzeu, zzdz);
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj3 = arrayList2.get(i3);
                    i3++;
                    m15393b(new zzeu((zzeu) obj3, j), zzdz2);
                }
                mo10712l().mo11052B();
            } finally {
                mo10712l().mo11093z();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10700a(zzjx zzjx, zzdz zzdz) {
        mo10388e();
        mo10714n();
        if (!TextUtils.isEmpty(zzdz.f11753b)) {
            if (!zzdz.f11759h) {
                m15394e(zzdz);
                return;
            }
            int e = mo10392h().mo10800e(zzjx.f11786b);
            int i = 0;
            if (e != 0) {
                mo10392h();
                String a = C3871mc.m15510a(zzjx.f11786b, 24, true);
                String str = zzjx.f11786b;
                mo10392h().mo10787a(zzdz.f11752a, e, "_ev", a, str != null ? str.length() : 0);
                return;
            }
            int b = mo10392h().mo10793b(zzjx.f11786b, zzjx.mo11112b());
            if (b != 0) {
                mo10392h();
                String a2 = C3871mc.m15510a(zzjx.f11786b, 24, true);
                Object b2 = zzjx.mo11112b();
                if (b2 != null && ((b2 instanceof String) || (b2 instanceof CharSequence))) {
                    i = String.valueOf(b2).length();
                }
                mo10392h().mo10787a(zzdz.f11752a, b, "_ev", a2, i);
                return;
            }
            Object c = mo10392h().mo10798c(zzjx.f11786b, zzjx.mo11112b());
            if (c != null) {
                C3867lc lcVar = new C3867lc(zzdz.f11752a, zzjx.f11791g, zzjx.f11786b, zzjx.f11787c, c);
                mo10385b().mo10579E().mo10594a("Setting user property", mo10390g().mo10559c(lcVar.f11536c), c);
                mo10712l().mo11092y();
                try {
                    m15394e(zzdz);
                    boolean a3 = mo10712l().mo11075a(lcVar);
                    mo10712l().mo11052B();
                    if (a3) {
                        mo10385b().mo10579E().mo10594a("User property set", mo10390g().mo10559c(lcVar.f11536c), lcVar.f11538e);
                    } else {
                        mo10385b().mo10585y().mo10594a("Too many unique user properties are set. Ignoring user property", mo10390g().mo10559c(lcVar.f11536c), lcVar.f11538e);
                        mo10392h().mo10787a(zzdz.f11752a, 9, (String) null, (String) null, 0);
                    }
                } finally {
                    mo10712l().mo11093z();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10701a(Runnable runnable) {
        mo10388e();
        if (this.f11435k == null) {
            this.f11435k = new ArrayList();
        }
        this.f11435k.add(runnable);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0120 A[Catch:{ all -> 0x0163, all -> 0x016c }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012e A[Catch:{ all -> 0x0163, all -> 0x016c }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10702a(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
            r6 = this;
            r6.mo10388e()
            r6.mo10714n()
            com.google.android.gms.common.internal.C2061y.m9076b((java.lang.String) r7)
            r0 = 0
            if (r10 != 0) goto L_0x000e
            byte[] r10 = new byte[r0]     // Catch:{ all -> 0x016c }
        L_0x000e:
            com.google.android.gms.internal.measurement.W r1 = r6.mo10385b()     // Catch:{ all -> 0x016c }
            com.google.android.gms.internal.measurement.Y r1 = r1.mo10580F()     // Catch:{ all -> 0x016c }
            java.lang.String r2 = "onConfigFetched. Response size"
            int r3 = r10.length     // Catch:{ all -> 0x016c }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x016c }
            r1.mo10593a(r2, r3)     // Catch:{ all -> 0x016c }
            com.google.android.gms.internal.measurement.z r1 = r6.mo10712l()     // Catch:{ all -> 0x016c }
            r1.mo11092y()     // Catch:{ all -> 0x016c }
            com.google.android.gms.internal.measurement.z r1 = r6.mo10712l()     // Catch:{ all -> 0x0163 }
            com.google.android.gms.internal.measurement.r r1 = r1.mo11079b(r7)     // Catch:{ all -> 0x0163 }
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 304(0x130, float:4.26E-43)
            r4 = 1
            if (r8 == r2) goto L_0x003c
            r2 = 204(0xcc, float:2.86E-43)
            if (r8 == r2) goto L_0x003c
            if (r8 != r3) goto L_0x0040
        L_0x003c:
            if (r9 != 0) goto L_0x0040
            r2 = r4
            goto L_0x0041
        L_0x0040:
            r2 = r0
        L_0x0041:
            if (r1 != 0) goto L_0x0056
            com.google.android.gms.internal.measurement.W r8 = r6.mo10385b()     // Catch:{ all -> 0x0163 }
            com.google.android.gms.internal.measurement.Y r8 = r8.mo10576B()     // Catch:{ all -> 0x0163 }
            java.lang.String r9 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r7)     // Catch:{ all -> 0x0163 }
            r8.mo10593a(r9, r7)     // Catch:{ all -> 0x0163 }
            goto L_0x0157
        L_0x0056:
            r5 = 404(0x194, float:5.66E-43)
            if (r2 != 0) goto L_0x00ba
            if (r8 != r5) goto L_0x005d
            goto L_0x00ba
        L_0x005d:
            com.google.android.gms.common.util.e r10 = r6.mo10382a()     // Catch:{ all -> 0x0163 }
            long r10 = r10.mo7725a()     // Catch:{ all -> 0x0163 }
            r1.mo10924i(r10)     // Catch:{ all -> 0x0163 }
            com.google.android.gms.internal.measurement.z r10 = r6.mo10712l()     // Catch:{ all -> 0x0163 }
            r10.mo11070a((com.google.android.gms.internal.measurement.C3888r) r1)     // Catch:{ all -> 0x0163 }
            com.google.android.gms.internal.measurement.W r10 = r6.mo10385b()     // Catch:{ all -> 0x0163 }
            com.google.android.gms.internal.measurement.Y r10 = r10.mo10580F()     // Catch:{ all -> 0x0163 }
            java.lang.String r11 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0163 }
            r10.mo10594a(r11, r1, r9)     // Catch:{ all -> 0x0163 }
            com.google.android.gms.internal.measurement.va r9 = r6.mo10395s()     // Catch:{ all -> 0x0163 }
            r9.mo10988c(r7)     // Catch:{ all -> 0x0163 }
            com.google.android.gms.internal.measurement.ha r7 = r6.mo10393i()     // Catch:{ all -> 0x0163 }
            com.google.android.gms.internal.measurement.ka r7 = r7.f11473g     // Catch:{ all -> 0x0163 }
            com.google.android.gms.common.util.e r9 = r6.mo10382a()     // Catch:{ all -> 0x0163 }
            long r9 = r9.mo7725a()     // Catch:{ all -> 0x0163 }
            r7.mo10764a(r9)     // Catch:{ all -> 0x0163 }
            r7 = 503(0x1f7, float:7.05E-43)
            if (r8 == r7) goto L_0x00a2
            r7 = 429(0x1ad, float:6.01E-43)
            if (r8 != r7) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            r4 = r0
        L_0x00a2:
            if (r4 == 0) goto L_0x00b5
            com.google.android.gms.internal.measurement.ha r7 = r6.mo10393i()     // Catch:{ all -> 0x0163 }
            com.google.android.gms.internal.measurement.ka r7 = r7.f11474h     // Catch:{ all -> 0x0163 }
            com.google.android.gms.common.util.e r8 = r6.mo10382a()     // Catch:{ all -> 0x0163 }
            long r8 = r8.mo7725a()     // Catch:{ all -> 0x0163 }
            r7.mo10764a(r8)     // Catch:{ all -> 0x0163 }
        L_0x00b5:
            r6.mo10399x()     // Catch:{ all -> 0x0163 }
            goto L_0x0157
        L_0x00ba:
            r9 = 0
            if (r11 == 0) goto L_0x00c6
            java.lang.String r2 = "Last-Modified"
            java.lang.Object r11 = r11.get(r2)     // Catch:{ all -> 0x0163 }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x0163 }
            goto L_0x00c7
        L_0x00c6:
            r11 = r9
        L_0x00c7:
            if (r11 == 0) goto L_0x00d6
            int r2 = r11.size()     // Catch:{ all -> 0x0163 }
            if (r2 <= 0) goto L_0x00d6
            java.lang.Object r11 = r11.get(r0)     // Catch:{ all -> 0x0163 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0163 }
            goto L_0x00d7
        L_0x00d6:
            r11 = r9
        L_0x00d7:
            if (r8 == r5) goto L_0x00f3
            if (r8 != r3) goto L_0x00dc
            goto L_0x00f3
        L_0x00dc:
            com.google.android.gms.internal.measurement.va r9 = r6.mo10395s()     // Catch:{ all -> 0x0163 }
            boolean r9 = r9.mo10985a(r7, r10, r11)     // Catch:{ all -> 0x0163 }
            if (r9 != 0) goto L_0x010c
            com.google.android.gms.internal.measurement.z r7 = r6.mo10712l()     // Catch:{ all -> 0x016c }
        L_0x00ea:
            r7.mo11093z()     // Catch:{ all -> 0x016c }
            r6.f11438n = r0
            r6.mo10400y()
            return
        L_0x00f3:
            com.google.android.gms.internal.measurement.va r11 = r6.mo10395s()     // Catch:{ all -> 0x0163 }
            com.google.android.gms.internal.measurement.wc r11 = r11.mo10983a((java.lang.String) r7)     // Catch:{ all -> 0x0163 }
            if (r11 != 0) goto L_0x010c
            com.google.android.gms.internal.measurement.va r11 = r6.mo10395s()     // Catch:{ all -> 0x0163 }
            boolean r9 = r11.mo10985a(r7, r9, r9)     // Catch:{ all -> 0x0163 }
            if (r9 != 0) goto L_0x010c
            com.google.android.gms.internal.measurement.z r7 = r6.mo10712l()     // Catch:{ all -> 0x016c }
            goto L_0x00ea
        L_0x010c:
            com.google.android.gms.common.util.e r9 = r6.mo10382a()     // Catch:{ all -> 0x0163 }
            long r2 = r9.mo7725a()     // Catch:{ all -> 0x0163 }
            r1.mo10922h(r2)     // Catch:{ all -> 0x0163 }
            com.google.android.gms.internal.measurement.z r9 = r6.mo10712l()     // Catch:{ all -> 0x0163 }
            r9.mo11070a((com.google.android.gms.internal.measurement.C3888r) r1)     // Catch:{ all -> 0x0163 }
            if (r8 != r5) goto L_0x012e
            com.google.android.gms.internal.measurement.W r8 = r6.mo10385b()     // Catch:{ all -> 0x0163 }
            com.google.android.gms.internal.measurement.Y r8 = r8.mo10577C()     // Catch:{ all -> 0x0163 }
            java.lang.String r9 = "Config not found. Using empty config. appId"
            r8.mo10593a(r9, r7)     // Catch:{ all -> 0x0163 }
            goto L_0x0144
        L_0x012e:
            com.google.android.gms.internal.measurement.W r7 = r6.mo10385b()     // Catch:{ all -> 0x0163 }
            com.google.android.gms.internal.measurement.Y r7 = r7.mo10580F()     // Catch:{ all -> 0x0163 }
            java.lang.String r9 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0163 }
            int r10 = r10.length     // Catch:{ all -> 0x0163 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0163 }
            r7.mo10594a(r9, r8, r10)     // Catch:{ all -> 0x0163 }
        L_0x0144:
            com.google.android.gms.internal.measurement.aa r7 = r6.mo10713m()     // Catch:{ all -> 0x0163 }
            boolean r7 = r7.mo10658y()     // Catch:{ all -> 0x0163 }
            if (r7 == 0) goto L_0x00b5
            boolean r7 = r6.mo10398w()     // Catch:{ all -> 0x0163 }
            if (r7 == 0) goto L_0x00b5
            r6.mo10715o()     // Catch:{ all -> 0x0163 }
        L_0x0157:
            com.google.android.gms.internal.measurement.z r7 = r6.mo10712l()     // Catch:{ all -> 0x0163 }
            r7.mo11052B()     // Catch:{ all -> 0x0163 }
            com.google.android.gms.internal.measurement.z r7 = r6.mo10712l()     // Catch:{ all -> 0x016c }
            goto L_0x00ea
        L_0x0163:
            r7 = move-exception
            com.google.android.gms.internal.measurement.z r8 = r6.mo10712l()     // Catch:{ all -> 0x016c }
            r8.mo11093z()     // Catch:{ all -> 0x016c }
            throw r7     // Catch:{ all -> 0x016c }
        L_0x016c:
            r7 = move-exception
            r6.f11438n = r0
            r6.mo10400y()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3839ec.mo10702a(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* renamed from: a */
    public final void mo10703a(boolean z) {
        mo10399x();
    }

    /* renamed from: a */
    public final byte[] mo10704a(zzeu zzeu, String str) {
        mo10714n();
        mo10388e();
        C3715Aa.m14848t();
        throw null;
    }

    /* renamed from: b */
    public C3801W mo10385b() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo10705b(zzdz zzdz) {
        mo10388e();
        mo10714n();
        C2061y.m9076b(zzdz.f11752a);
        m15394e(zzdz);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo10706b(zzed zzed, zzdz zzdz) {
        C2061y.m9067a(zzed);
        C2061y.m9076b(zzed.f11769a);
        C2061y.m9067a(zzed.f11771c);
        C2061y.m9076b(zzed.f11771c.f11786b);
        mo10388e();
        mo10714n();
        if (!TextUtils.isEmpty(zzdz.f11753b)) {
            if (!zzdz.f11759h) {
                m15394e(zzdz);
                return;
            }
            mo10712l().mo11092y();
            try {
                m15394e(zzdz);
                zzed e = mo10712l().mo11085e(zzed.f11769a, zzed.f11771c.f11786b);
                if (e != null) {
                    mo10385b().mo10579E().mo10594a("Removing conditional user property", zzed.f11769a, mo10390g().mo10559c(zzed.f11771c.f11786b));
                    mo10712l().mo11087f(zzed.f11769a, zzed.f11771c.f11786b);
                    if (e.f11773e) {
                        mo10712l().mo11082c(zzed.f11769a, zzed.f11771c.f11786b);
                    }
                    if (zzed.f11779k != null) {
                        Bundle bundle = null;
                        if (zzed.f11779k.f11782b != null) {
                            bundle = zzed.f11779k.f11782b.mo11102b();
                        }
                        Bundle bundle2 = bundle;
                        m15393b(mo10392h().mo10781a(zzed.f11779k.f11781a, bundle2, e.f11770b, zzed.f11779k.f11784d, true, false), zzdz);
                    }
                } else {
                    mo10385b().mo10576B().mo10594a("Conditional user property doesn't exist", C3801W.m15166a(zzed.f11769a), mo10390g().mo10559c(zzed.f11771c.f11786b));
                }
                mo10712l().mo11052B();
            } finally {
                mo10712l().mo11093z();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo10707b(zzeu zzeu, String str) {
        zzeu zzeu2 = zzeu;
        String str2 = str;
        C3888r b = mo10712l().mo11079b(str2);
        if (b == null || TextUtils.isEmpty(b.mo10909d())) {
            mo10385b().mo10579E().mo10593a("No app data available; dropping event", str2);
            return;
        }
        Boolean b2 = m15391b(b);
        if (b2 == null) {
            if (!"_ui".equals(zzeu2.f11781a)) {
                mo10385b().mo10576B().mo10593a("Could not find package. appId", C3801W.m15166a(str));
            }
        } else if (!b2.booleanValue()) {
            mo10385b().mo10585y().mo10593a("App version does not match; dropping event. appId", C3801W.m15166a(str));
            return;
        }
        zzdz zzdz = r2;
        C3888r rVar = b;
        zzdz zzdz2 = new zzdz(str, b.mo10901b(), b.mo10909d(), b.mo10927k(), b.mo10929l(), b.mo10931m(), b.mo10933n(), (String) null, b.mo10908c(), false, rVar.mo10921h(), rVar.mo10894A(), 0, 0, rVar.mo10895B(), rVar.mo10896C(), false);
        mo10699a(zzeu2, zzdz);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo10708b(zzjx zzjx, zzdz zzdz) {
        mo10388e();
        mo10714n();
        if (!TextUtils.isEmpty(zzdz.f11753b)) {
            if (!zzdz.f11759h) {
                m15394e(zzdz);
                return;
            }
            mo10385b().mo10579E().mo10593a("Removing user property", mo10390g().mo10559c(zzjx.f11786b));
            mo10712l().mo11092y();
            try {
                m15394e(zzdz);
                mo10712l().mo11082c(zzdz.f11752a, zzjx.f11786b);
                mo10712l().mo11052B();
                mo10385b().mo10579E().mo10593a("User property removed", mo10390g().mo10559c(zzjx.f11786b));
            } finally {
                mo10712l().mo11093z();
            }
        }
    }

    /* renamed from: c */
    public C3909wa mo10386c() {
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x02d6 A[Catch:{ SQLiteException -> 0x0134, all -> 0x03b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0303 A[Catch:{ SQLiteException -> 0x0134, all -> 0x03b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0387 A[Catch:{ SQLiteException -> 0x0134, all -> 0x03b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01bd A[Catch:{ SQLiteException -> 0x0134, all -> 0x03b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01ca A[Catch:{ SQLiteException -> 0x0134, all -> 0x03b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01d8 A[Catch:{ SQLiteException -> 0x0134, all -> 0x03b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0291 A[Catch:{ SQLiteException -> 0x0134, all -> 0x03b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0296 A[Catch:{ SQLiteException -> 0x0134, all -> 0x03b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x029d A[Catch:{ SQLiteException -> 0x0134, all -> 0x03b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x029f A[Catch:{ SQLiteException -> 0x0134, all -> 0x03b3 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10709c(com.google.android.gms.internal.measurement.zzdz r22) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "_pfo"
            java.lang.String r6 = "_uwa"
            java.lang.String r0 = "app_id=?"
            r21.mo10388e()
            r21.mo10714n()
            com.google.android.gms.common.internal.C2061y.m9067a(r22)
            java.lang.String r7 = r2.f11752a
            com.google.android.gms.common.internal.C2061y.m9076b((java.lang.String) r7)
            java.lang.String r7 = r2.f11753b
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x0025
            return
        L_0x0025:
            com.google.android.gms.internal.measurement.z r7 = r21.mo10712l()
            java.lang.String r8 = r2.f11752a
            com.google.android.gms.internal.measurement.r r7 = r7.mo11079b(r8)
            r8 = 0
            if (r7 == 0) goto L_0x0058
            java.lang.String r10 = r7.mo10901b()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L_0x0058
            java.lang.String r10 = r2.f11753b
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x0058
            r7.mo10922h(r8)
            com.google.android.gms.internal.measurement.z r10 = r21.mo10712l()
            r10.mo11070a((com.google.android.gms.internal.measurement.C3888r) r7)
            com.google.android.gms.internal.measurement.va r7 = r21.mo10395s()
            java.lang.String r10 = r2.f11752a
            r7.mo10991d(r10)
        L_0x0058:
            boolean r7 = r2.f11759h
            if (r7 != 0) goto L_0x0060
            r21.m15394e(r22)
            return
        L_0x0060:
            long r10 = r2.f11764m
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x006e
            com.google.android.gms.common.util.e r7 = r21.mo10382a()
            long r10 = r7.mo7725a()
        L_0x006e:
            int r7 = r2.f11765n
            r15 = 0
            r14 = 1
            if (r7 == 0) goto L_0x008e
            if (r7 == r14) goto L_0x008e
            com.google.android.gms.internal.measurement.W r12 = r21.mo10385b()
            com.google.android.gms.internal.measurement.Y r12 = r12.mo10576B()
            java.lang.String r13 = r2.f11752a
            java.lang.Object r13 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r13)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r8 = "Incorrect app type, assuming installed app. appId, appType"
            r12.mo10594a(r8, r13, r7)
            r7 = r15
        L_0x008e:
            com.google.android.gms.internal.measurement.z r8 = r21.mo10712l()
            r8.mo11092y()
            com.google.android.gms.internal.measurement.z r8 = r21.mo10712l()     // Catch:{ all -> 0x03b3 }
            java.lang.String r9 = r2.f11752a     // Catch:{ all -> 0x03b3 }
            com.google.android.gms.internal.measurement.r r8 = r8.mo11079b(r9)     // Catch:{ all -> 0x03b3 }
            if (r8 == 0) goto L_0x0147
            java.lang.String r12 = r8.mo10901b()     // Catch:{ all -> 0x03b3 }
            if (r12 == 0) goto L_0x0147
            java.lang.String r12 = r8.mo10901b()     // Catch:{ all -> 0x03b3 }
            java.lang.String r13 = r2.f11753b     // Catch:{ all -> 0x03b3 }
            boolean r12 = r12.equals(r13)     // Catch:{ all -> 0x03b3 }
            if (r12 != 0) goto L_0x0147
            com.google.android.gms.internal.measurement.W r12 = r21.mo10385b()     // Catch:{ all -> 0x03b3 }
            com.google.android.gms.internal.measurement.Y r12 = r12.mo10576B()     // Catch:{ all -> 0x03b3 }
            java.lang.String r13 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r16 = r8.mo10912e()     // Catch:{ all -> 0x03b3 }
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r16)     // Catch:{ all -> 0x03b3 }
            r12.mo10593a(r13, r9)     // Catch:{ all -> 0x03b3 }
            com.google.android.gms.internal.measurement.z r9 = r21.mo10712l()     // Catch:{ all -> 0x03b3 }
            java.lang.String r8 = r8.mo10912e()     // Catch:{ all -> 0x03b3 }
            r9.mo10685v()     // Catch:{ all -> 0x03b3 }
            r9.mo10451d()     // Catch:{ all -> 0x03b3 }
            com.google.android.gms.common.internal.C2061y.m9076b((java.lang.String) r8)     // Catch:{ all -> 0x03b3 }
            android.database.sqlite.SQLiteDatabase r12 = r9.mo11051A()     // Catch:{ SQLiteException -> 0x0134 }
            java.lang.String[] r13 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x0134 }
            r13[r15] = r8     // Catch:{ SQLiteException -> 0x0134 }
            java.lang.String r14 = "events"
            int r14 = r12.delete(r14, r0, r13)     // Catch:{ SQLiteException -> 0x0134 }
            int r14 = r14 + r15
            java.lang.String r15 = "user_attributes"
            int r15 = r12.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x0134 }
            int r14 = r14 + r15
            java.lang.String r15 = "conditional_properties"
            int r15 = r12.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x0134 }
            int r14 = r14 + r15
            java.lang.String r15 = "apps"
            int r15 = r12.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x0134 }
            int r14 = r14 + r15
            java.lang.String r15 = "raw_events"
            int r15 = r12.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x0134 }
            int r14 = r14 + r15
            java.lang.String r15 = "raw_events_metadata"
            int r15 = r12.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x0134 }
            int r14 = r14 + r15
            java.lang.String r15 = "event_filters"
            int r15 = r12.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x0134 }
            int r14 = r14 + r15
            java.lang.String r15 = "property_filters"
            int r15 = r12.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x0134 }
            int r14 = r14 + r15
            java.lang.String r15 = "audience_filter_values"
            int r0 = r12.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x0134 }
            int r14 = r14 + r0
            if (r14 <= 0) goto L_0x0146
            com.google.android.gms.internal.measurement.W r0 = r9.mo10385b()     // Catch:{ SQLiteException -> 0x0134 }
            com.google.android.gms.internal.measurement.Y r0 = r0.mo10580F()     // Catch:{ SQLiteException -> 0x0134 }
            java.lang.String r12 = "Deleted application data. app, records"
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)     // Catch:{ SQLiteException -> 0x0134 }
            r0.mo10594a(r12, r8, r13)     // Catch:{ SQLiteException -> 0x0134 }
            goto L_0x0146
        L_0x0134:
            r0 = move-exception
            com.google.android.gms.internal.measurement.W r9 = r9.mo10385b()     // Catch:{ all -> 0x03b3 }
            com.google.android.gms.internal.measurement.Y r9 = r9.mo10585y()     // Catch:{ all -> 0x03b3 }
            java.lang.String r12 = "Error deleting application data. appId, error"
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r8)     // Catch:{ all -> 0x03b3 }
            r9.mo10594a(r12, r8, r0)     // Catch:{ all -> 0x03b3 }
        L_0x0146:
            r8 = 0
        L_0x0147:
            if (r8 == 0) goto L_0x01b7
            long r12 = r8.mo10927k()     // Catch:{ all -> 0x03b3 }
            r14 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            java.lang.String r9 = "_pv"
            if (r0 == 0) goto L_0x0182
            long r12 = r8.mo10927k()     // Catch:{ all -> 0x03b3 }
            long r14 = r2.f11761j     // Catch:{ all -> 0x03b3 }
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x01b7
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x03b3 }
            r0.<init>()     // Catch:{ all -> 0x03b3 }
            java.lang.String r8 = r8.mo10909d()     // Catch:{ all -> 0x03b3 }
            r0.putString(r9, r8)     // Catch:{ all -> 0x03b3 }
            com.google.android.gms.internal.measurement.zzeu r8 = new com.google.android.gms.internal.measurement.zzeu     // Catch:{ all -> 0x03b3 }
            java.lang.String r13 = "_au"
            com.google.android.gms.internal.measurement.zzer r14 = new com.google.android.gms.internal.measurement.zzer     // Catch:{ all -> 0x03b3 }
            r14.<init>(r0)     // Catch:{ all -> 0x03b3 }
            java.lang.String r15 = "auto"
            r12 = r8
            r9 = 1
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x03b3 }
        L_0x017e:
            r1.mo10699a((com.google.android.gms.internal.measurement.zzeu) r8, (com.google.android.gms.internal.measurement.zzdz) r2)     // Catch:{ all -> 0x03b3 }
            goto L_0x01b8
        L_0x0182:
            r15 = 1
            java.lang.String r0 = r8.mo10909d()     // Catch:{ all -> 0x03b3 }
            if (r0 == 0) goto L_0x01b5
            java.lang.String r0 = r8.mo10909d()     // Catch:{ all -> 0x03b3 }
            java.lang.String r12 = r2.f11754c     // Catch:{ all -> 0x03b3 }
            boolean r0 = r0.equals(r12)     // Catch:{ all -> 0x03b3 }
            if (r0 != 0) goto L_0x01b5
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x03b3 }
            r0.<init>()     // Catch:{ all -> 0x03b3 }
            java.lang.String r8 = r8.mo10909d()     // Catch:{ all -> 0x03b3 }
            r0.putString(r9, r8)     // Catch:{ all -> 0x03b3 }
            com.google.android.gms.internal.measurement.zzeu r8 = new com.google.android.gms.internal.measurement.zzeu     // Catch:{ all -> 0x03b3 }
            java.lang.String r13 = "_au"
            com.google.android.gms.internal.measurement.zzer r14 = new com.google.android.gms.internal.measurement.zzer     // Catch:{ all -> 0x03b3 }
            r14.<init>(r0)     // Catch:{ all -> 0x03b3 }
            java.lang.String r0 = "auto"
            r12 = r8
            r9 = r15
            r15 = r0
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x03b3 }
            goto L_0x017e
        L_0x01b5:
            r9 = r15
            goto L_0x01b8
        L_0x01b7:
            r9 = 1
        L_0x01b8:
            r21.m15394e(r22)     // Catch:{ all -> 0x03b3 }
            if (r7 != 0) goto L_0x01ca
            com.google.android.gms.internal.measurement.z r0 = r21.mo10712l()     // Catch:{ all -> 0x03b3 }
            java.lang.String r8 = r2.f11752a     // Catch:{ all -> 0x03b3 }
            java.lang.String r12 = "_f"
        L_0x01c5:
            com.google.android.gms.internal.measurement.H r0 = r0.mo11078b((java.lang.String) r8, (java.lang.String) r12)     // Catch:{ all -> 0x03b3 }
            goto L_0x01d6
        L_0x01ca:
            if (r7 != r9) goto L_0x01d5
            com.google.android.gms.internal.measurement.z r0 = r21.mo10712l()     // Catch:{ all -> 0x03b3 }
            java.lang.String r8 = r2.f11752a     // Catch:{ all -> 0x03b3 }
            java.lang.String r12 = "_v"
            goto L_0x01c5
        L_0x01d5:
            r0 = 0
        L_0x01d6:
            if (r0 != 0) goto L_0x0387
            r12 = 3600000(0x36ee80, double:1.7786363E-317)
            long r14 = r10 / r12
            r18 = r10
            r9 = 1
            long r14 = r14 + r9
            long r14 = r14 * r12
            java.lang.String r0 = "_dac"
            java.lang.String r11 = "_r"
            java.lang.String r13 = "_c"
            if (r7 != 0) goto L_0x031b
            com.google.android.gms.internal.measurement.zzjx r7 = new com.google.android.gms.internal.measurement.zzjx     // Catch:{ all -> 0x03b3 }
            java.lang.String r16 = "_fot"
            java.lang.Long r17 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x03b3 }
            java.lang.String r20 = "auto"
            r12 = r7
            r14 = r13
            r13 = r16
            r8 = r14
            r14 = r18
            r16 = r17
            r17 = r20
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x03b3 }
            r1.mo10700a((com.google.android.gms.internal.measurement.zzjx) r7, (com.google.android.gms.internal.measurement.zzdz) r2)     // Catch:{ all -> 0x03b3 }
            r21.mo10388e()     // Catch:{ all -> 0x03b3 }
            r21.mo10714n()     // Catch:{ all -> 0x03b3 }
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ all -> 0x03b3 }
            r7.<init>()     // Catch:{ all -> 0x03b3 }
            r7.putLong(r8, r9)     // Catch:{ all -> 0x03b3 }
            r7.putLong(r11, r9)     // Catch:{ all -> 0x03b3 }
            r11 = 0
            r7.putLong(r6, r11)     // Catch:{ all -> 0x03b3 }
            r7.putLong(r5, r11)     // Catch:{ all -> 0x03b3 }
            r7.putLong(r4, r11)     // Catch:{ all -> 0x03b3 }
            r7.putLong(r3, r11)     // Catch:{ all -> 0x03b3 }
            com.google.android.gms.internal.measurement.w r8 = r21.mo10394j()     // Catch:{ all -> 0x03b3 }
            java.lang.String r11 = r2.f11752a     // Catch:{ all -> 0x03b3 }
            boolean r8 = r8.mo11010i(r11)     // Catch:{ all -> 0x03b3 }
            if (r8 == 0) goto L_0x0238
            boolean r8 = r2.f11768q     // Catch:{ all -> 0x03b3 }
            if (r8 == 0) goto L_0x0238
            r7.putLong(r0, r9)     // Catch:{ all -> 0x03b3 }
        L_0x0238:
            android.content.Context r0 = r21.getContext()     // Catch:{ all -> 0x03b3 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x03b3 }
            if (r0 != 0) goto L_0x0257
            com.google.android.gms.internal.measurement.W r0 = r21.mo10385b()     // Catch:{ all -> 0x03b3 }
            com.google.android.gms.internal.measurement.Y r0 = r0.mo10585y()     // Catch:{ all -> 0x03b3 }
            java.lang.String r3 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.String r4 = r2.f11752a     // Catch:{ all -> 0x03b3 }
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r4)     // Catch:{ all -> 0x03b3 }
            r0.mo10593a(r3, r4)     // Catch:{ all -> 0x03b3 }
            goto L_0x02e8
        L_0x0257:
            android.content.Context r0 = r21.getContext()     // Catch:{ NameNotFoundException -> 0x0269 }
            com.google.android.gms.common.c.b r0 = com.google.android.gms.common.p072c.C1989c.m8748b(r0)     // Catch:{ NameNotFoundException -> 0x0269 }
            java.lang.String r8 = r2.f11752a     // Catch:{ NameNotFoundException -> 0x0269 }
            r11 = 0
            android.content.pm.PackageInfo r0 = r0.mo7521b(r8, r11)     // Catch:{ NameNotFoundException -> 0x0267 }
            goto L_0x027f
        L_0x0267:
            r0 = move-exception
            goto L_0x026b
        L_0x0269:
            r0 = move-exception
            r11 = 0
        L_0x026b:
            com.google.android.gms.internal.measurement.W r8 = r21.mo10385b()     // Catch:{ all -> 0x03b3 }
            com.google.android.gms.internal.measurement.Y r8 = r8.mo10585y()     // Catch:{ all -> 0x03b3 }
            java.lang.String r12 = "Package info is null, first open report might be inaccurate. appId"
            java.lang.String r13 = r2.f11752a     // Catch:{ all -> 0x03b3 }
            java.lang.Object r13 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r13)     // Catch:{ all -> 0x03b3 }
            r8.mo10594a(r12, r13, r0)     // Catch:{ all -> 0x03b3 }
            r0 = 0
        L_0x027f:
            if (r0 == 0) goto L_0x02b0
            long r12 = r0.firstInstallTime     // Catch:{ all -> 0x03b3 }
            r14 = 0
            int r8 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r8 == 0) goto L_0x02b0
            long r12 = r0.firstInstallTime     // Catch:{ all -> 0x03b3 }
            long r14 = r0.lastUpdateTime     // Catch:{ all -> 0x03b3 }
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x0296
            r7.putLong(r6, r9)     // Catch:{ all -> 0x03b3 }
            r0 = r11
            goto L_0x0297
        L_0x0296:
            r0 = 1
        L_0x0297:
            com.google.android.gms.internal.measurement.zzjx r6 = new com.google.android.gms.internal.measurement.zzjx     // Catch:{ all -> 0x03b3 }
            java.lang.String r13 = "_fi"
            if (r0 == 0) goto L_0x029f
            r14 = r9
            goto L_0x02a1
        L_0x029f:
            r14 = 0
        L_0x02a1:
            java.lang.Long r16 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x03b3 }
            java.lang.String r17 = "auto"
            r12 = r6
            r14 = r18
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x03b3 }
            r1.mo10700a((com.google.android.gms.internal.measurement.zzjx) r6, (com.google.android.gms.internal.measurement.zzdz) r2)     // Catch:{ all -> 0x03b3 }
        L_0x02b0:
            android.content.Context r0 = r21.getContext()     // Catch:{ NameNotFoundException -> 0x02bf }
            com.google.android.gms.common.c.b r0 = com.google.android.gms.common.p072c.C1989c.m8748b(r0)     // Catch:{ NameNotFoundException -> 0x02bf }
            java.lang.String r6 = r2.f11752a     // Catch:{ NameNotFoundException -> 0x02bf }
            android.content.pm.ApplicationInfo r0 = r0.mo7517a((java.lang.String) r6, (int) r11)     // Catch:{ NameNotFoundException -> 0x02bf }
            goto L_0x02d4
        L_0x02bf:
            r0 = move-exception
            com.google.android.gms.internal.measurement.W r6 = r21.mo10385b()     // Catch:{ all -> 0x03b3 }
            com.google.android.gms.internal.measurement.Y r6 = r6.mo10585y()     // Catch:{ all -> 0x03b3 }
            java.lang.String r8 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.String r11 = r2.f11752a     // Catch:{ all -> 0x03b3 }
            java.lang.Object r11 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r11)     // Catch:{ all -> 0x03b3 }
            r6.mo10594a(r8, r11, r0)     // Catch:{ all -> 0x03b3 }
            r0 = 0
        L_0x02d4:
            if (r0 == 0) goto L_0x02e8
            int r6 = r0.flags     // Catch:{ all -> 0x03b3 }
            r8 = 1
            r6 = r6 & r8
            if (r6 == 0) goto L_0x02df
            r7.putLong(r4, r9)     // Catch:{ all -> 0x03b3 }
        L_0x02df:
            int r0 = r0.flags     // Catch:{ all -> 0x03b3 }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x02e8
            r7.putLong(r3, r9)     // Catch:{ all -> 0x03b3 }
        L_0x02e8:
            com.google.android.gms.internal.measurement.z r0 = r21.mo10712l()     // Catch:{ all -> 0x03b3 }
            java.lang.String r3 = r2.f11752a     // Catch:{ all -> 0x03b3 }
            com.google.android.gms.common.internal.C2061y.m9076b((java.lang.String) r3)     // Catch:{ all -> 0x03b3 }
            r0.mo10451d()     // Catch:{ all -> 0x03b3 }
            r0.mo10685v()     // Catch:{ all -> 0x03b3 }
            java.lang.String r4 = "first_open_count"
            long r3 = r0.mo11091i(r3, r4)     // Catch:{ all -> 0x03b3 }
            r11 = 0
            int r0 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x0306
            r7.putLong(r5, r3)     // Catch:{ all -> 0x03b3 }
        L_0x0306:
            com.google.android.gms.internal.measurement.zzeu r0 = new com.google.android.gms.internal.measurement.zzeu     // Catch:{ all -> 0x03b3 }
            java.lang.String r13 = "_f"
            com.google.android.gms.internal.measurement.zzer r14 = new com.google.android.gms.internal.measurement.zzer     // Catch:{ all -> 0x03b3 }
            r14.<init>(r7)     // Catch:{ all -> 0x03b3 }
            java.lang.String r15 = "auto"
            r12 = r0
            r16 = r18
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x03b3 }
        L_0x0317:
            r1.mo10699a((com.google.android.gms.internal.measurement.zzeu) r0, (com.google.android.gms.internal.measurement.zzdz) r2)     // Catch:{ all -> 0x03b3 }
            goto L_0x0368
        L_0x031b:
            r8 = r13
            r3 = 1
            if (r7 != r3) goto L_0x0368
            com.google.android.gms.internal.measurement.zzjx r3 = new com.google.android.gms.internal.measurement.zzjx     // Catch:{ all -> 0x03b3 }
            java.lang.String r13 = "_fvt"
            java.lang.Long r16 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x03b3 }
            java.lang.String r17 = "auto"
            r12 = r3
            r14 = r18
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x03b3 }
            r1.mo10700a((com.google.android.gms.internal.measurement.zzjx) r3, (com.google.android.gms.internal.measurement.zzdz) r2)     // Catch:{ all -> 0x03b3 }
            r21.mo10388e()     // Catch:{ all -> 0x03b3 }
            r21.mo10714n()     // Catch:{ all -> 0x03b3 }
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ all -> 0x03b3 }
            r3.<init>()     // Catch:{ all -> 0x03b3 }
            r3.putLong(r8, r9)     // Catch:{ all -> 0x03b3 }
            r3.putLong(r11, r9)     // Catch:{ all -> 0x03b3 }
            com.google.android.gms.internal.measurement.w r4 = r21.mo10394j()     // Catch:{ all -> 0x03b3 }
            java.lang.String r5 = r2.f11752a     // Catch:{ all -> 0x03b3 }
            boolean r4 = r4.mo11010i(r5)     // Catch:{ all -> 0x03b3 }
            if (r4 == 0) goto L_0x0356
            boolean r4 = r2.f11768q     // Catch:{ all -> 0x03b3 }
            if (r4 == 0) goto L_0x0356
            r3.putLong(r0, r9)     // Catch:{ all -> 0x03b3 }
        L_0x0356:
            com.google.android.gms.internal.measurement.zzeu r0 = new com.google.android.gms.internal.measurement.zzeu     // Catch:{ all -> 0x03b3 }
            java.lang.String r13 = "_v"
            com.google.android.gms.internal.measurement.zzer r14 = new com.google.android.gms.internal.measurement.zzer     // Catch:{ all -> 0x03b3 }
            r14.<init>(r3)     // Catch:{ all -> 0x03b3 }
            java.lang.String r15 = "auto"
            r12 = r0
            r16 = r18
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x03b3 }
            goto L_0x0317
        L_0x0368:
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x03b3 }
            r0.<init>()     // Catch:{ all -> 0x03b3 }
            java.lang.String r3 = "_et"
            r0.putLong(r3, r9)     // Catch:{ all -> 0x03b3 }
            com.google.android.gms.internal.measurement.zzeu r3 = new com.google.android.gms.internal.measurement.zzeu     // Catch:{ all -> 0x03b3 }
            java.lang.String r13 = "_e"
            com.google.android.gms.internal.measurement.zzer r14 = new com.google.android.gms.internal.measurement.zzer     // Catch:{ all -> 0x03b3 }
            r14.<init>(r0)     // Catch:{ all -> 0x03b3 }
            java.lang.String r15 = "auto"
            r12 = r3
            r16 = r18
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x03b3 }
        L_0x0383:
            r1.mo10699a((com.google.android.gms.internal.measurement.zzeu) r3, (com.google.android.gms.internal.measurement.zzdz) r2)     // Catch:{ all -> 0x03b3 }
            goto L_0x03a4
        L_0x0387:
            r18 = r10
            boolean r0 = r2.f11760i     // Catch:{ all -> 0x03b3 }
            if (r0 == 0) goto L_0x03a4
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x03b3 }
            r0.<init>()     // Catch:{ all -> 0x03b3 }
            com.google.android.gms.internal.measurement.zzeu r3 = new com.google.android.gms.internal.measurement.zzeu     // Catch:{ all -> 0x03b3 }
            java.lang.String r13 = "_cd"
            com.google.android.gms.internal.measurement.zzer r14 = new com.google.android.gms.internal.measurement.zzer     // Catch:{ all -> 0x03b3 }
            r14.<init>(r0)     // Catch:{ all -> 0x03b3 }
            java.lang.String r15 = "auto"
            r12 = r3
            r16 = r18
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x03b3 }
            goto L_0x0383
        L_0x03a4:
            com.google.android.gms.internal.measurement.z r0 = r21.mo10712l()     // Catch:{ all -> 0x03b3 }
            r0.mo11052B()     // Catch:{ all -> 0x03b3 }
            com.google.android.gms.internal.measurement.z r0 = r21.mo10712l()
            r0.mo11093z()
            return
        L_0x03b3:
            r0 = move-exception
            com.google.android.gms.internal.measurement.z r2 = r21.mo10712l()
            r2.mo11093z()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3839ec.mo10709c(com.google.android.gms.internal.measurement.zzdz):void");
    }

    /* renamed from: d */
    public final String mo10710d(zzdz zzdz) {
        try {
            return (String) mo10386c().mo11019a(new C3851hc(this, zzdz)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            mo10385b().mo10585y().mo10594a("Failed to get app instance id. appId", C3801W.m15166a(zzdz.f11752a), e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo10387d() {
        mo10388e();
        mo10712l().mo11055E();
        if (mo10393i().f11472f.mo10763a() == 0) {
            mo10393i().f11472f.mo10764a(mo10382a().mo7725a());
        }
        mo10399x();
    }

    /* renamed from: e */
    public void mo10388e() {
        throw null;
    }

    /* renamed from: f */
    public C3734F mo10389f() {
        throw null;
    }

    /* renamed from: g */
    public C3793U mo10390g() {
        throw null;
    }

    public Context getContext() {
        throw null;
    }

    /* renamed from: h */
    public C3871mc mo10392h() {
        throw null;
    }

    /* renamed from: i */
    public C3849ha mo10393i() {
        throw null;
    }

    /* renamed from: j */
    public C3908w mo10394j() {
        throw null;
    }

    /* renamed from: k */
    public final C3896t mo10711k() {
        m15392b((C3835dc) this.f11430f);
        return this.f11430f;
    }

    /* renamed from: l */
    public final C3920z mo10712l() {
        m15392b((C3835dc) this.f11427c);
        return this.f11427c;
    }

    /* renamed from: m */
    public final C3821aa mo10713m() {
        m15392b((C3835dc) this.f11426b);
        return this.f11426b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo10714n() {
        if (!this.f11432h) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:81|82) */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        mo10385b().mo10585y().mo10594a("Failed to parse upload URL. Not uploading. appId", com.google.android.gms.internal.measurement.C3801W.m15166a(r5), r6);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x0256 */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10715o() {
        /*
            r17 = this;
            r1 = r17
            r17.mo10388e()
            r17.mo10714n()
            r0 = 1
            r1.f11440p = r0
            r2 = 0
            com.google.android.gms.internal.measurement.Aa r3 = r1.f11431g     // Catch:{ all -> 0x028d }
            com.google.android.gms.internal.measurement.wb r3 = r3.mo10399x()     // Catch:{ all -> 0x028d }
            java.lang.Boolean r3 = r3.mo11028E()     // Catch:{ all -> 0x028d }
            if (r3 != 0) goto L_0x002b
            com.google.android.gms.internal.measurement.W r0 = r17.mo10385b()     // Catch:{ all -> 0x028d }
            com.google.android.gms.internal.measurement.Y r0 = r0.mo10576B()     // Catch:{ all -> 0x028d }
            java.lang.String r3 = "Upload data called on the client side before use of service was decided"
        L_0x0022:
            r0.mo10592a(r3)     // Catch:{ all -> 0x028d }
        L_0x0025:
            r1.f11440p = r2
            r17.mo10400y()
            return
        L_0x002b:
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x028d }
            if (r3 == 0) goto L_0x003c
            com.google.android.gms.internal.measurement.W r0 = r17.mo10385b()     // Catch:{ all -> 0x028d }
            com.google.android.gms.internal.measurement.Y r0 = r0.mo10585y()     // Catch:{ all -> 0x028d }
            java.lang.String r3 = "Upload called in the client side when service should be used"
            goto L_0x0022
        L_0x003c:
            long r3 = r1.f11434j     // Catch:{ all -> 0x028d }
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0048
        L_0x0044:
            r17.mo10399x()     // Catch:{ all -> 0x028d }
            goto L_0x0025
        L_0x0048:
            r17.mo10388e()     // Catch:{ all -> 0x028d }
            java.util.List<java.lang.Long> r3 = r1.f11443s     // Catch:{ all -> 0x028d }
            if (r3 == 0) goto L_0x0051
            r3 = r0
            goto L_0x0052
        L_0x0051:
            r3 = r2
        L_0x0052:
            if (r3 == 0) goto L_0x005f
            com.google.android.gms.internal.measurement.W r0 = r17.mo10385b()     // Catch:{ all -> 0x028d }
            com.google.android.gms.internal.measurement.Y r0 = r0.mo10580F()     // Catch:{ all -> 0x028d }
            java.lang.String r3 = "Uploading requested multiple times"
            goto L_0x0022
        L_0x005f:
            com.google.android.gms.internal.measurement.aa r3 = r17.mo10713m()     // Catch:{ all -> 0x028d }
            boolean r3 = r3.mo10658y()     // Catch:{ all -> 0x028d }
            if (r3 != 0) goto L_0x0077
            com.google.android.gms.internal.measurement.W r0 = r17.mo10385b()     // Catch:{ all -> 0x028d }
            com.google.android.gms.internal.measurement.Y r0 = r0.mo10580F()     // Catch:{ all -> 0x028d }
            java.lang.String r3 = "Network not connected, ignoring upload request"
            r0.mo10592a(r3)     // Catch:{ all -> 0x028d }
            goto L_0x0044
        L_0x0077:
            com.google.android.gms.common.util.e r3 = r17.mo10382a()     // Catch:{ all -> 0x028d }
            long r3 = r3.mo7725a()     // Catch:{ all -> 0x028d }
            long r7 = com.google.android.gms.internal.measurement.C3908w.m15760v()     // Catch:{ all -> 0x028d }
            long r7 = r3 - r7
            r9 = 0
            r1.m15388a((java.lang.String) r9, (long) r7)     // Catch:{ all -> 0x028d }
            com.google.android.gms.internal.measurement.ha r7 = r17.mo10393i()     // Catch:{ all -> 0x028d }
            com.google.android.gms.internal.measurement.ka r7 = r7.f11472f     // Catch:{ all -> 0x028d }
            long r7 = r7.mo10763a()     // Catch:{ all -> 0x028d }
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x00ae
            com.google.android.gms.internal.measurement.W r5 = r17.mo10385b()     // Catch:{ all -> 0x028d }
            com.google.android.gms.internal.measurement.Y r5 = r5.mo10579E()     // Catch:{ all -> 0x028d }
            java.lang.String r6 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r7 = r3 - r7
            long r7 = java.lang.Math.abs(r7)     // Catch:{ all -> 0x028d }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x028d }
            r5.mo10593a(r6, r7)     // Catch:{ all -> 0x028d }
        L_0x00ae:
            com.google.android.gms.internal.measurement.z r5 = r17.mo10712l()     // Catch:{ all -> 0x028d }
            java.lang.String r5 = r5.mo11053C()     // Catch:{ all -> 0x028d }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x028d }
            r7 = -1
            if (r6 != 0) goto L_0x0269
            long r10 = r1.f11445u     // Catch:{ all -> 0x028d }
            int r6 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x00ce
            com.google.android.gms.internal.measurement.z r6 = r17.mo10712l()     // Catch:{ all -> 0x028d }
            long r6 = r6.mo11060J()     // Catch:{ all -> 0x028d }
            r1.f11445u = r6     // Catch:{ all -> 0x028d }
        L_0x00ce:
            com.google.android.gms.internal.measurement.w r6 = r17.mo10394j()     // Catch:{ all -> 0x028d }
            com.google.android.gms.internal.measurement.M<java.lang.Integer> r7 = com.google.android.gms.internal.measurement.C3758L.f11206m     // Catch:{ all -> 0x028d }
            int r6 = r6.mo11000b(r5, r7)     // Catch:{ all -> 0x028d }
            com.google.android.gms.internal.measurement.w r7 = r17.mo10394j()     // Catch:{ all -> 0x028d }
            com.google.android.gms.internal.measurement.M<java.lang.Integer> r8 = com.google.android.gms.internal.measurement.C3758L.f11207n     // Catch:{ all -> 0x028d }
            int r7 = r7.mo11000b(r5, r8)     // Catch:{ all -> 0x028d }
            int r7 = java.lang.Math.max(r2, r7)     // Catch:{ all -> 0x028d }
            com.google.android.gms.internal.measurement.z r8 = r17.mo10712l()     // Catch:{ all -> 0x028d }
            java.util.List r6 = r8.mo11066a((java.lang.String) r5, (int) r6, (int) r7)     // Catch:{ all -> 0x028d }
            boolean r7 = r6.isEmpty()     // Catch:{ all -> 0x028d }
            if (r7 != 0) goto L_0x0025
            java.util.Iterator r7 = r6.iterator()     // Catch:{ all -> 0x028d }
        L_0x00f8:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x028d }
            if (r8 == 0) goto L_0x0113
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x028d }
            android.util.Pair r8 = (android.util.Pair) r8     // Catch:{ all -> 0x028d }
            java.lang.Object r8 = r8.first     // Catch:{ all -> 0x028d }
            com.google.android.gms.internal.measurement.Cc r8 = (com.google.android.gms.internal.measurement.C3725Cc) r8     // Catch:{ all -> 0x028d }
            java.lang.String r10 = r8.f11062v     // Catch:{ all -> 0x028d }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x028d }
            if (r10 != 0) goto L_0x00f8
            java.lang.String r7 = r8.f11062v     // Catch:{ all -> 0x028d }
            goto L_0x0114
        L_0x0113:
            r7 = r9
        L_0x0114:
            if (r7 == 0) goto L_0x013f
            r8 = r2
        L_0x0117:
            int r10 = r6.size()     // Catch:{ all -> 0x028d }
            if (r8 >= r10) goto L_0x013f
            java.lang.Object r10 = r6.get(r8)     // Catch:{ all -> 0x028d }
            android.util.Pair r10 = (android.util.Pair) r10     // Catch:{ all -> 0x028d }
            java.lang.Object r10 = r10.first     // Catch:{ all -> 0x028d }
            com.google.android.gms.internal.measurement.Cc r10 = (com.google.android.gms.internal.measurement.C3725Cc) r10     // Catch:{ all -> 0x028d }
            java.lang.String r11 = r10.f11062v     // Catch:{ all -> 0x028d }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x028d }
            if (r11 != 0) goto L_0x013c
            java.lang.String r10 = r10.f11062v     // Catch:{ all -> 0x028d }
            boolean r10 = r10.equals(r7)     // Catch:{ all -> 0x028d }
            if (r10 != 0) goto L_0x013c
            java.util.List r6 = r6.subList(r2, r8)     // Catch:{ all -> 0x028d }
            goto L_0x013f
        L_0x013c:
            int r8 = r8 + 1
            goto L_0x0117
        L_0x013f:
            com.google.android.gms.internal.measurement.Bc r7 = new com.google.android.gms.internal.measurement.Bc     // Catch:{ all -> 0x028d }
            r7.<init>()     // Catch:{ all -> 0x028d }
            int r8 = r6.size()     // Catch:{ all -> 0x028d }
            com.google.android.gms.internal.measurement.Cc[] r8 = new com.google.android.gms.internal.measurement.C3725Cc[r8]     // Catch:{ all -> 0x028d }
            r7.f11023c = r8     // Catch:{ all -> 0x028d }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x028d }
            int r10 = r6.size()     // Catch:{ all -> 0x028d }
            r8.<init>(r10)     // Catch:{ all -> 0x028d }
            boolean r10 = com.google.android.gms.internal.measurement.C3908w.m15761x()     // Catch:{ all -> 0x028d }
            if (r10 == 0) goto L_0x0167
            com.google.android.gms.internal.measurement.w r10 = r17.mo10394j()     // Catch:{ all -> 0x028d }
            boolean r10 = r10.mo11003c(r5)     // Catch:{ all -> 0x028d }
            if (r10 == 0) goto L_0x0167
            r10 = r0
            goto L_0x0168
        L_0x0167:
            r10 = r2
        L_0x0168:
            r11 = r2
        L_0x0169:
            com.google.android.gms.internal.measurement.Cc[] r12 = r7.f11023c     // Catch:{ all -> 0x028d }
            int r12 = r12.length     // Catch:{ all -> 0x028d }
            if (r11 >= r12) goto L_0x01b4
            com.google.android.gms.internal.measurement.Cc[] r12 = r7.f11023c     // Catch:{ all -> 0x028d }
            java.lang.Object r13 = r6.get(r11)     // Catch:{ all -> 0x028d }
            android.util.Pair r13 = (android.util.Pair) r13     // Catch:{ all -> 0x028d }
            java.lang.Object r13 = r13.first     // Catch:{ all -> 0x028d }
            com.google.android.gms.internal.measurement.Cc r13 = (com.google.android.gms.internal.measurement.C3725Cc) r13     // Catch:{ all -> 0x028d }
            r12[r11] = r13     // Catch:{ all -> 0x028d }
            java.lang.Object r12 = r6.get(r11)     // Catch:{ all -> 0x028d }
            android.util.Pair r12 = (android.util.Pair) r12     // Catch:{ all -> 0x028d }
            java.lang.Object r12 = r12.second     // Catch:{ all -> 0x028d }
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ all -> 0x028d }
            r8.add(r12)     // Catch:{ all -> 0x028d }
            com.google.android.gms.internal.measurement.Cc[] r12 = r7.f11023c     // Catch:{ all -> 0x028d }
            r12 = r12[r11]     // Catch:{ all -> 0x028d }
            r13 = 12451(0x30a3, double:6.1516E-320)
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x028d }
            r12.f11061u = r13     // Catch:{ all -> 0x028d }
            com.google.android.gms.internal.measurement.Cc[] r12 = r7.f11023c     // Catch:{ all -> 0x028d }
            r12 = r12[r11]     // Catch:{ all -> 0x028d }
            java.lang.Long r13 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x028d }
            r12.f11047g = r13     // Catch:{ all -> 0x028d }
            com.google.android.gms.internal.measurement.Cc[] r12 = r7.f11023c     // Catch:{ all -> 0x028d }
            r12 = r12[r11]     // Catch:{ all -> 0x028d }
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x028d }
            r12.f11032C = r13     // Catch:{ all -> 0x028d }
            if (r10 != 0) goto L_0x01b1
            com.google.android.gms.internal.measurement.Cc[] r12 = r7.f11023c     // Catch:{ all -> 0x028d }
            r12 = r12[r11]     // Catch:{ all -> 0x028d }
            r12.f11041L = r9     // Catch:{ all -> 0x028d }
        L_0x01b1:
            int r11 = r11 + 1
            goto L_0x0169
        L_0x01b4:
            com.google.android.gms.internal.measurement.W r6 = r17.mo10385b()     // Catch:{ all -> 0x028d }
            r10 = 2
            boolean r6 = r6.mo10584a((int) r10)     // Catch:{ all -> 0x028d }
            if (r6 == 0) goto L_0x01c7
            com.google.android.gms.internal.measurement.U r6 = r17.mo10390g()     // Catch:{ all -> 0x028d }
            java.lang.String r9 = r6.mo10552a((com.google.android.gms.internal.measurement.C3721Bc) r7)     // Catch:{ all -> 0x028d }
        L_0x01c7:
            com.google.android.gms.internal.measurement.mc r6 = r17.mo10392h()     // Catch:{ all -> 0x028d }
            byte[] r14 = r6.mo10791a((com.google.android.gms.internal.measurement.C3721Bc) r7)     // Catch:{ all -> 0x028d }
            com.google.android.gms.internal.measurement.M<java.lang.String> r6 = com.google.android.gms.internal.measurement.C3758L.f11216w     // Catch:{ all -> 0x028d }
            java.lang.Object r6 = r6.mo10498a()     // Catch:{ all -> 0x028d }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x028d }
            java.net.URL r13 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0256 }
            r13.<init>(r6)     // Catch:{ MalformedURLException -> 0x0256 }
            boolean r10 = r8.isEmpty()     // Catch:{ MalformedURLException -> 0x0256 }
            if (r10 != 0) goto L_0x01e4
            r10 = r0
            goto L_0x01e5
        L_0x01e4:
            r10 = r2
        L_0x01e5:
            com.google.android.gms.common.internal.C2061y.m9073a((boolean) r10)     // Catch:{ MalformedURLException -> 0x0256 }
            java.util.List<java.lang.Long> r10 = r1.f11443s     // Catch:{ MalformedURLException -> 0x0256 }
            if (r10 == 0) goto L_0x01fa
            com.google.android.gms.internal.measurement.W r8 = r17.mo10385b()     // Catch:{ MalformedURLException -> 0x0256 }
            com.google.android.gms.internal.measurement.Y r8 = r8.mo10585y()     // Catch:{ MalformedURLException -> 0x0256 }
            java.lang.String r10 = "Set uploading progress before finishing the previous upload"
            r8.mo10592a(r10)     // Catch:{ MalformedURLException -> 0x0256 }
            goto L_0x0201
        L_0x01fa:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x0256 }
            r10.<init>(r8)     // Catch:{ MalformedURLException -> 0x0256 }
            r1.f11443s = r10     // Catch:{ MalformedURLException -> 0x0256 }
        L_0x0201:
            com.google.android.gms.internal.measurement.ha r8 = r17.mo10393i()     // Catch:{ MalformedURLException -> 0x0256 }
            com.google.android.gms.internal.measurement.ka r8 = r8.f11473g     // Catch:{ MalformedURLException -> 0x0256 }
            r8.mo10764a(r3)     // Catch:{ MalformedURLException -> 0x0256 }
            java.lang.String r3 = "?"
            com.google.android.gms.internal.measurement.Cc[] r4 = r7.f11023c     // Catch:{ MalformedURLException -> 0x0256 }
            int r4 = r4.length     // Catch:{ MalformedURLException -> 0x0256 }
            if (r4 <= 0) goto L_0x0217
            com.google.android.gms.internal.measurement.Cc[] r3 = r7.f11023c     // Catch:{ MalformedURLException -> 0x0256 }
            r3 = r3[r2]     // Catch:{ MalformedURLException -> 0x0256 }
            java.lang.String r3 = r3.f11058r     // Catch:{ MalformedURLException -> 0x0256 }
        L_0x0217:
            com.google.android.gms.internal.measurement.W r4 = r17.mo10385b()     // Catch:{ MalformedURLException -> 0x0256 }
            com.google.android.gms.internal.measurement.Y r4 = r4.mo10580F()     // Catch:{ MalformedURLException -> 0x0256 }
            java.lang.String r7 = "Uploading data. app, uncompressed size, data"
            int r8 = r14.length     // Catch:{ MalformedURLException -> 0x0256 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ MalformedURLException -> 0x0256 }
            r4.mo10595a(r7, r3, r8, r9)     // Catch:{ MalformedURLException -> 0x0256 }
            r1.f11439o = r0     // Catch:{ MalformedURLException -> 0x0256 }
            com.google.android.gms.internal.measurement.aa r11 = r17.mo10713m()     // Catch:{ MalformedURLException -> 0x0256 }
            com.google.android.gms.internal.measurement.fc r0 = new com.google.android.gms.internal.measurement.fc     // Catch:{ MalformedURLException -> 0x0256 }
            r0.<init>(r1, r5)     // Catch:{ MalformedURLException -> 0x0256 }
            r11.mo10451d()     // Catch:{ MalformedURLException -> 0x0256 }
            r11.mo10685v()     // Catch:{ MalformedURLException -> 0x0256 }
            com.google.android.gms.common.internal.C2061y.m9067a(r13)     // Catch:{ MalformedURLException -> 0x0256 }
            com.google.android.gms.common.internal.C2061y.m9067a(r14)     // Catch:{ MalformedURLException -> 0x0256 }
            com.google.android.gms.common.internal.C2061y.m9067a(r0)     // Catch:{ MalformedURLException -> 0x0256 }
            com.google.android.gms.internal.measurement.wa r3 = r11.mo10386c()     // Catch:{ MalformedURLException -> 0x0256 }
            com.google.android.gms.internal.measurement.ea r4 = new com.google.android.gms.internal.measurement.ea     // Catch:{ MalformedURLException -> 0x0256 }
            r15 = 0
            r10 = r4
            r12 = r5
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ MalformedURLException -> 0x0256 }
            r3.mo11022b((java.lang.Runnable) r4)     // Catch:{ MalformedURLException -> 0x0256 }
            goto L_0x0025
        L_0x0256:
            com.google.android.gms.internal.measurement.W r0 = r17.mo10385b()     // Catch:{ all -> 0x028d }
            com.google.android.gms.internal.measurement.Y r0 = r0.mo10585y()     // Catch:{ all -> 0x028d }
            java.lang.String r3 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C3801W.m15166a((java.lang.String) r5)     // Catch:{ all -> 0x028d }
            r0.mo10594a(r3, r4, r6)     // Catch:{ all -> 0x028d }
            goto L_0x0025
        L_0x0269:
            r1.f11445u = r7     // Catch:{ all -> 0x028d }
            com.google.android.gms.internal.measurement.z r0 = r17.mo10712l()     // Catch:{ all -> 0x028d }
            long r5 = com.google.android.gms.internal.measurement.C3908w.m15760v()     // Catch:{ all -> 0x028d }
            long r3 = r3 - r5
            java.lang.String r0 = r0.mo11064a((long) r3)     // Catch:{ all -> 0x028d }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x028d }
            if (r3 != 0) goto L_0x0025
            com.google.android.gms.internal.measurement.z r3 = r17.mo10712l()     // Catch:{ all -> 0x028d }
            com.google.android.gms.internal.measurement.r r0 = r3.mo11079b(r0)     // Catch:{ all -> 0x028d }
            if (r0 == 0) goto L_0x0025
            r1.m15386a((com.google.android.gms.internal.measurement.C3888r) r0)     // Catch:{ all -> 0x028d }
            goto L_0x0025
        L_0x028d:
            r0 = move-exception
            r1.f11440p = r2
            r17.mo10400y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3839ec.mo10715o():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo10716p() {
        C3809Y y;
        Integer valueOf;
        Integer valueOf2;
        String str;
        mo10388e();
        mo10714n();
        if (!this.f11433i) {
            mo10385b().mo10578D().mo10592a("This instance being marked as an uploader");
            mo10388e();
            mo10714n();
            if (mo10373A() && mo10401z()) {
                int a = m15383a(this.f11442r);
                int B = this.f11431g.mo10398w().mo10515B();
                mo10388e();
                if (a > B) {
                    y = mo10385b().mo10585y();
                    valueOf = Integer.valueOf(a);
                    valueOf2 = Integer.valueOf(B);
                    str = "Panic: can't downgrade version. Previous, current version";
                } else if (a < B) {
                    if (m15387a(B, this.f11442r)) {
                        y = mo10385b().mo10580F();
                        valueOf = Integer.valueOf(a);
                        valueOf2 = Integer.valueOf(B);
                        str = "Storage version upgraded. Previous, current version";
                    } else {
                        y = mo10385b().mo10585y();
                        valueOf = Integer.valueOf(a);
                        valueOf2 = Integer.valueOf(B);
                        str = "Storage version upgrade failed. Previous, current version";
                    }
                }
                y.mo10594a(str, valueOf, valueOf2);
            }
            this.f11433i = true;
            mo10399x();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo10717q() {
        this.f11437m++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final C3715Aa mo10718r() {
        return this.f11431g;
    }
}
