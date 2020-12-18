package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.apache.http.protocol.HTTP;

/* renamed from: com.google.android.gms.internal.ads.Xe */
public final class C2830Xe implements C2893Zl {

    /* renamed from: a */
    private final Map<String, C3604xf> f8602a;

    /* renamed from: b */
    private long f8603b;

    /* renamed from: c */
    private final File f8604c;

    /* renamed from: d */
    private final int f8605d;

    public C2830Xe(File file) {
        this(file, 5242880);
    }

    private C2830Xe(File file, int i) {
        this.f8602a = new LinkedHashMap(16, 0.75f, true);
        this.f8603b = 0;
        this.f8604c = file;
        this.f8605d = 5242880;
    }

    /* renamed from: a */
    static int m11544a(InputStream inputStream) {
        return (m11555c(inputStream) << 24) | m11555c(inputStream) | 0 | (m11555c(inputStream) << 8) | (m11555c(inputStream) << 16);
    }

    /* renamed from: a */
    private static InputStream m11545a(File file) {
        return new FileInputStream(file);
    }

    /* renamed from: a */
    static String m11546a(C2831Xf xf) {
        return new String(m11552a(xf, m11553b((InputStream) xf)), HTTP.UTF_8);
    }

    /* renamed from: a */
    static void m11547a(OutputStream outputStream, int i) {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write(i >>> 24);
    }

    /* renamed from: a */
    static void m11548a(OutputStream outputStream, long j) {
        outputStream.write((byte) ((int) j));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    /* renamed from: a */
    static void m11549a(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes(HTTP.UTF_8);
        m11548a(outputStream, (long) bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    /* renamed from: a */
    private final synchronized void m11550a(String str) {
        boolean delete = m11558e(str).delete();
        m11556c(str);
        if (!delete) {
            C3656zb.m14679a("Could not delete cache entry for key=%s, filename=%s", str, m11557d(str));
        }
    }

    /* renamed from: a */
    private final void m11551a(String str, C3604xf xfVar) {
        if (!this.f8602a.containsKey(str)) {
            this.f8603b += xfVar.f10501a;
        } else {
            this.f8603b += xfVar.f10501a - this.f8602a.get(str).f10501a;
        }
        this.f8602a.put(str, xfVar);
    }

    /* renamed from: a */
    private static byte[] m11552a(C2831Xf xf, long j) {
        long a = xf.mo9026a();
        if (j >= 0 && j <= a) {
            int i = (int) j;
            if (((long) i) == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(xf).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(73);
        sb.append("streamToBytes length=");
        sb.append(j);
        sb.append(", maxLength=");
        sb.append(a);
        throw new IOException(sb.toString());
    }

    /* renamed from: b */
    static long m11553b(InputStream inputStream) {
        return (((long) m11555c(inputStream)) & 255) | 0 | ((((long) m11555c(inputStream)) & 255) << 8) | ((((long) m11555c(inputStream)) & 255) << 16) | ((((long) m11555c(inputStream)) & 255) << 24) | ((((long) m11555c(inputStream)) & 255) << 32) | ((((long) m11555c(inputStream)) & 255) << 40) | ((((long) m11555c(inputStream)) & 255) << 48) | ((255 & ((long) m11555c(inputStream))) << 56);
    }

    /* renamed from: b */
    static List<C2589Ot> m11554b(C2831Xf xf) {
        int a = m11544a((InputStream) xf);
        List<C2589Ot> emptyList = a == 0 ? Collections.emptyList() : new ArrayList<>(a);
        for (int i = 0; i < a; i++) {
            emptyList.add(new C2589Ot(m11546a(xf).intern(), m11546a(xf).intern()));
        }
        return emptyList;
    }

    /* renamed from: c */
    private static int m11555c(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    /* renamed from: c */
    private final void m11556c(String str) {
        C3604xf remove = this.f8602a.remove(str);
        if (remove != null) {
            this.f8603b -= remove.f10501a;
        }
    }

    /* renamed from: d */
    private static String m11557d(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        String valueOf2 = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: e */
    private final File m11558e(String str) {
        return new File(this.f8604c, m11557d(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0059 */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo9023G() {
        /*
            r9 = this;
            monitor-enter(r9)
            java.io.File r0 = r9.f8604c     // Catch:{ all -> 0x0061 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0061 }
            r1 = 0
            if (r0 != 0) goto L_0x0024
            java.io.File r0 = r9.f8604c     // Catch:{ all -> 0x0061 }
            boolean r0 = r0.mkdirs()     // Catch:{ all -> 0x0061 }
            if (r0 != 0) goto L_0x0022
            java.lang.String r0 = "Unable to create cache dir %s"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0061 }
            java.io.File r3 = r9.f8604c     // Catch:{ all -> 0x0061 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ all -> 0x0061 }
            r2[r1] = r3     // Catch:{ all -> 0x0061 }
            com.google.android.gms.internal.ads.C3656zb.m14681b(r0, r2)     // Catch:{ all -> 0x0061 }
        L_0x0022:
            monitor-exit(r9)
            return
        L_0x0024:
            java.io.File r0 = r9.f8604c     // Catch:{ all -> 0x0061 }
            java.io.File[] r0 = r0.listFiles()     // Catch:{ all -> 0x0061 }
            if (r0 != 0) goto L_0x002e
            monitor-exit(r9)
            return
        L_0x002e:
            int r2 = r0.length     // Catch:{ all -> 0x0061 }
        L_0x002f:
            if (r1 >= r2) goto L_0x005f
            r3 = r0[r1]     // Catch:{ all -> 0x0061 }
            long r4 = r3.length()     // Catch:{ IOException -> 0x0059 }
            com.google.android.gms.internal.ads.Xf r6 = new com.google.android.gms.internal.ads.Xf     // Catch:{ IOException -> 0x0059 }
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0059 }
            java.io.InputStream r8 = m11545a((java.io.File) r3)     // Catch:{ IOException -> 0x0059 }
            r7.<init>(r8)     // Catch:{ IOException -> 0x0059 }
            r6.<init>(r7, r4)     // Catch:{ IOException -> 0x0059 }
            com.google.android.gms.internal.ads.xf r7 = com.google.android.gms.internal.ads.C3604xf.m14415a((com.google.android.gms.internal.ads.C2831Xf) r6)     // Catch:{ all -> 0x0054 }
            r7.f10501a = r4     // Catch:{ all -> 0x0054 }
            java.lang.String r4 = r7.f10502b     // Catch:{ all -> 0x0054 }
            r9.m11551a((java.lang.String) r4, (com.google.android.gms.internal.ads.C3604xf) r7)     // Catch:{ all -> 0x0054 }
            r6.close()     // Catch:{ IOException -> 0x0059 }
            goto L_0x005c
        L_0x0054:
            r4 = move-exception
            r6.close()     // Catch:{ IOException -> 0x0059 }
            throw r4     // Catch:{ IOException -> 0x0059 }
        L_0x0059:
            r3.delete()     // Catch:{ all -> 0x0061 }
        L_0x005c:
            int r1 = r1 + 1
            goto L_0x002f
        L_0x005f:
            monitor-exit(r9)
            return
        L_0x0061:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2830Xe.mo9023G():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:32|33|(1:35)|36|37) */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f0, code lost:
        if (r3.delete() == false) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f2, code lost:
        com.google.android.gms.internal.ads.C3656zb.m14679a("Could not clean up file %s", r3.getAbsolutePath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0102, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00ec */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo9024a(java.lang.String r17, com.google.android.gms.internal.ads.C3471sp r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            monitor-enter(r16)
            byte[] r3 = r2.f10218a     // Catch:{ all -> 0x0103 }
            int r3 = r3.length     // Catch:{ all -> 0x0103 }
            long r4 = r1.f8603b     // Catch:{ all -> 0x0103 }
            long r6 = (long) r3     // Catch:{ all -> 0x0103 }
            long r4 = r4 + r6
            int r3 = r1.f8605d     // Catch:{ all -> 0x0103 }
            long r8 = (long) r3     // Catch:{ all -> 0x0103 }
            int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            r5 = 0
            if (r3 < 0) goto L_0x00ae
            boolean r3 = com.google.android.gms.internal.ads.C3656zb.f10640b     // Catch:{ all -> 0x0103 }
            if (r3 == 0) goto L_0x0021
            java.lang.String r3 = "Pruning old cache entries."
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x0103 }
            com.google.android.gms.internal.ads.C3656zb.m14682c(r3, r8)     // Catch:{ all -> 0x0103 }
        L_0x0021:
            long r8 = r1.f8603b     // Catch:{ all -> 0x0103 }
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0103 }
            java.util.Map<java.lang.String, com.google.android.gms.internal.ads.xf> r3 = r1.f8602a     // Catch:{ all -> 0x0103 }
            java.util.Set r3 = r3.entrySet()     // Catch:{ all -> 0x0103 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0103 }
            r12 = r5
        L_0x0032:
            boolean r13 = r3.hasNext()     // Catch:{ all -> 0x0103 }
            if (r13 == 0) goto L_0x0085
            java.lang.Object r13 = r3.next()     // Catch:{ all -> 0x0103 }
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13     // Catch:{ all -> 0x0103 }
            java.lang.Object r13 = r13.getValue()     // Catch:{ all -> 0x0103 }
            com.google.android.gms.internal.ads.xf r13 = (com.google.android.gms.internal.ads.C3604xf) r13     // Catch:{ all -> 0x0103 }
            java.lang.String r15 = r13.f10502b     // Catch:{ all -> 0x0103 }
            java.io.File r15 = r1.m11558e(r15)     // Catch:{ all -> 0x0103 }
            boolean r15 = r15.delete()     // Catch:{ all -> 0x0103 }
            if (r15 == 0) goto L_0x0058
            long r4 = r1.f8603b     // Catch:{ all -> 0x0103 }
            long r14 = r13.f10501a     // Catch:{ all -> 0x0103 }
            long r4 = r4 - r14
            r1.f8603b = r4     // Catch:{ all -> 0x0103 }
            goto L_0x006e
        L_0x0058:
            java.lang.String r4 = "Could not delete cache entry for key=%s, filename=%s"
            r5 = 2
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch:{ all -> 0x0103 }
            java.lang.String r5 = r13.f10502b     // Catch:{ all -> 0x0103 }
            r15 = 0
            r14[r15] = r5     // Catch:{ all -> 0x0103 }
            java.lang.String r5 = r13.f10502b     // Catch:{ all -> 0x0103 }
            java.lang.String r5 = m11557d(r5)     // Catch:{ all -> 0x0103 }
            r13 = 1
            r14[r13] = r5     // Catch:{ all -> 0x0103 }
            com.google.android.gms.internal.ads.C3656zb.m14679a(r4, r14)     // Catch:{ all -> 0x0103 }
        L_0x006e:
            r3.remove()     // Catch:{ all -> 0x0103 }
            int r12 = r12 + 1
            long r4 = r1.f8603b     // Catch:{ all -> 0x0103 }
            long r4 = r4 + r6
            float r4 = (float) r4     // Catch:{ all -> 0x0103 }
            int r5 = r1.f8605d     // Catch:{ all -> 0x0103 }
            float r5 = (float) r5     // Catch:{ all -> 0x0103 }
            r13 = 1063675494(0x3f666666, float:0.9)
            float r5 = r5 * r13
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x0083
            goto L_0x0085
        L_0x0083:
            r5 = 0
            goto L_0x0032
        L_0x0085:
            boolean r3 = com.google.android.gms.internal.ads.C3656zb.f10640b     // Catch:{ all -> 0x0103 }
            if (r3 == 0) goto L_0x00ae
            java.lang.String r3 = "pruned %d files, %d bytes, %d ms"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0103 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0103 }
            r6 = 0
            r4[r6] = r5     // Catch:{ all -> 0x0103 }
            long r5 = r1.f8603b     // Catch:{ all -> 0x0103 }
            long r5 = r5 - r8
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0103 }
            r6 = 1
            r4[r6] = r5     // Catch:{ all -> 0x0103 }
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0103 }
            long r5 = r5 - r10
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0103 }
            r6 = 2
            r4[r6] = r5     // Catch:{ all -> 0x0103 }
            com.google.android.gms.internal.ads.C3656zb.m14682c(r3, r4)     // Catch:{ all -> 0x0103 }
        L_0x00ae:
            java.io.File r3 = r16.m11558e(r17)     // Catch:{ all -> 0x0103 }
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x00ec }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00ec }
            r5.<init>(r3)     // Catch:{ IOException -> 0x00ec }
            r4.<init>(r5)     // Catch:{ IOException -> 0x00ec }
            com.google.android.gms.internal.ads.xf r5 = new com.google.android.gms.internal.ads.xf     // Catch:{ IOException -> 0x00ec }
            r5.<init>(r0, r2)     // Catch:{ IOException -> 0x00ec }
            boolean r6 = r5.mo10209a((java.io.OutputStream) r4)     // Catch:{ IOException -> 0x00ec }
            if (r6 == 0) goto L_0x00d4
            byte[] r2 = r2.f10218a     // Catch:{ IOException -> 0x00ec }
            r4.write(r2)     // Catch:{ IOException -> 0x00ec }
            r4.close()     // Catch:{ IOException -> 0x00ec }
            r1.m11551a((java.lang.String) r0, (com.google.android.gms.internal.ads.C3604xf) r5)     // Catch:{ IOException -> 0x00ec }
            monitor-exit(r16)
            return
        L_0x00d4:
            r4.close()     // Catch:{ IOException -> 0x00ec }
            java.lang.String r0 = "Failed to write header for %s"
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x00ec }
            java.lang.String r2 = r3.getAbsolutePath()     // Catch:{ IOException -> 0x00ec }
            r5 = 0
            r4[r5] = r2     // Catch:{ IOException -> 0x00ec }
            com.google.android.gms.internal.ads.C3656zb.m14679a(r0, r4)     // Catch:{ IOException -> 0x00ec }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x00ec }
            r0.<init>()     // Catch:{ IOException -> 0x00ec }
            throw r0     // Catch:{ IOException -> 0x00ec }
        L_0x00ec:
            boolean r0 = r3.delete()     // Catch:{ all -> 0x0103 }
            if (r0 != 0) goto L_0x0101
            java.lang.String r0 = "Could not clean up file %s"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0103 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ all -> 0x0103 }
            r4 = 0
            r2[r4] = r3     // Catch:{ all -> 0x0103 }
            com.google.android.gms.internal.ads.C3656zb.m14679a(r0, r2)     // Catch:{ all -> 0x0103 }
        L_0x0101:
            monitor-exit(r16)
            return
        L_0x0103:
            r0 = move-exception
            monitor-exit(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2830Xe.mo9024a(java.lang.String, com.google.android.gms.internal.ads.sp):void");
    }

    /* renamed from: b */
    public final synchronized C3471sp mo9025b(String str) {
        C2831Xf xf;
        C3604xf xfVar = this.f8602a.get(str);
        if (xfVar == null) {
            return null;
        }
        File e = m11558e(str);
        try {
            xf = new C2831Xf(new BufferedInputStream(m11545a(e)), e.length());
            C3604xf a = C3604xf.m14415a(xf);
            if (!TextUtils.equals(str, a.f10502b)) {
                C3656zb.m14679a("%s: key=%s, found=%s", e.getAbsolutePath(), str, a.f10502b);
                m11556c(str);
                xf.close();
                return null;
            }
            byte[] a2 = m11552a(xf, xf.mo9026a());
            C3471sp spVar = new C3471sp();
            spVar.f10218a = a2;
            spVar.f10219b = xfVar.f10503c;
            spVar.f10220c = xfVar.f10504d;
            spVar.f10221d = xfVar.f10505e;
            spVar.f10222e = xfVar.f10506f;
            spVar.f10223f = xfVar.f10507g;
            List<C2589Ot> list = xfVar.f10508h;
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (C2589Ot next : list) {
                treeMap.put(next.mo8649a(), next.mo8650b());
            }
            spVar.f10224g = treeMap;
            spVar.f10225h = Collections.unmodifiableList(xfVar.f10508h);
            xf.close();
            return spVar;
        } catch (IOException e2) {
            C3656zb.m14679a("%s: %s", e.getAbsolutePath(), e2.toString());
            m11550a(str);
            return null;
        } catch (Throwable th) {
            xf.close();
            throw th;
        }
    }
}
