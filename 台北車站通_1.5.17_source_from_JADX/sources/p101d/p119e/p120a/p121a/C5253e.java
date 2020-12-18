package p101d.p119e.p120a.p121a;

import android.os.SystemClock;
import java.io.EOFException;
import java.io.File;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.http.protocol.HTTP;
import p101d.p119e.p120a.C5267b;
import p101d.p119e.p120a.C5296y;

/* renamed from: d.e.a.a.e */
public class C5253e implements C5267b {

    /* renamed from: a */
    private final Map<String, C5254a> f14877a;

    /* renamed from: b */
    private long f14878b;

    /* renamed from: c */
    private final File f14879c;

    /* renamed from: d */
    private final int f14880d;

    /* renamed from: d.e.a.a.e$a */
    static class C5254a {

        /* renamed from: a */
        public long f14881a;

        /* renamed from: b */
        public String f14882b;

        /* renamed from: c */
        public String f14883c;

        /* renamed from: d */
        public long f14884d;

        /* renamed from: e */
        public long f14885e;

        /* renamed from: f */
        public long f14886f;

        /* renamed from: g */
        public long f14887g;

        /* renamed from: h */
        public Map<String, String> f14888h;

        private C5254a() {
        }

        public C5254a(String str, C5267b.C5268a aVar) {
            this.f14882b = str;
            this.f14881a = (long) aVar.f14898a.length;
            this.f14883c = aVar.f14899b;
            this.f14884d = aVar.f14900c;
            this.f14885e = aVar.f14901d;
            this.f14886f = aVar.f14902e;
            this.f14887g = aVar.f14903f;
            this.f14888h = aVar.f14904g;
        }

        /* renamed from: a */
        public static C5254a m20355a(InputStream inputStream) {
            C5254a aVar = new C5254a();
            if (C5253e.m20337a(inputStream) == 538247942) {
                aVar.f14882b = C5253e.m20346c(inputStream);
                aVar.f14883c = C5253e.m20346c(inputStream);
                if (aVar.f14883c.equals("")) {
                    aVar.f14883c = null;
                }
                aVar.f14884d = C5253e.m20345b(inputStream);
                aVar.f14885e = C5253e.m20345b(inputStream);
                aVar.f14886f = C5253e.m20345b(inputStream);
                aVar.f14887g = C5253e.m20345b(inputStream);
                aVar.f14888h = C5253e.m20348d(inputStream);
                return aVar;
            }
            throw new IOException();
        }

        /* renamed from: a */
        public C5267b.C5268a mo14581a(byte[] bArr) {
            C5267b.C5268a aVar = new C5267b.C5268a();
            aVar.f14898a = bArr;
            aVar.f14899b = this.f14883c;
            aVar.f14900c = this.f14884d;
            aVar.f14901d = this.f14885e;
            aVar.f14902e = this.f14886f;
            aVar.f14903f = this.f14887g;
            aVar.f14904g = this.f14888h;
            return aVar;
        }

        /* renamed from: a */
        public boolean mo14582a(OutputStream outputStream) {
            try {
                C5253e.m20339a(outputStream, 538247942);
                C5253e.m20341a(outputStream, this.f14882b);
                C5253e.m20341a(outputStream, this.f14883c == null ? "" : this.f14883c);
                C5253e.m20340a(outputStream, this.f14884d);
                C5253e.m20340a(outputStream, this.f14885e);
                C5253e.m20340a(outputStream, this.f14886f);
                C5253e.m20340a(outputStream, this.f14887g);
                C5253e.m20343a(this.f14888h, outputStream);
                outputStream.flush();
                return true;
            } catch (IOException e) {
                C5296y.m20469a("%s", e.toString());
                return false;
            }
        }
    }

    /* renamed from: d.e.a.a.e$b */
    private static class C5255b extends FilterInputStream {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f14889a;

        private C5255b(InputStream inputStream) {
            super(inputStream);
            this.f14889a = 0;
        }

        public int read() {
            int read = super.read();
            if (read != -1) {
                this.f14889a++;
            }
            return read;
        }

        public int read(byte[] bArr, int i, int i2) {
            int read = super.read(bArr, i, i2);
            if (read != -1) {
                this.f14889a += read;
            }
            return read;
        }
    }

    public C5253e(File file) {
        this(file, 5242880);
    }

    public C5253e(File file, int i) {
        this.f14877a = new LinkedHashMap(16, 0.75f, true);
        this.f14878b = 0;
        this.f14879c = file;
        this.f14880d = i;
    }

    /* renamed from: a */
    static int m20337a(InputStream inputStream) {
        return (m20350e(inputStream) << 24) | (m20350e(inputStream) << 0) | 0 | (m20350e(inputStream) << 8) | (m20350e(inputStream) << 16);
    }

    /* renamed from: a */
    private void m20338a(int i) {
        long j;
        long j2 = (long) i;
        if (this.f14878b + j2 >= ((long) this.f14880d)) {
            if (C5296y.f14977b) {
                C5296y.m20472c("Pruning old cache entries.", new Object[0]);
            }
            long j3 = this.f14878b;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Iterator<Map.Entry<String, C5254a>> it = this.f14877a.entrySet().iterator();
            int i2 = 0;
            while (it.hasNext()) {
                C5254a aVar = (C5254a) it.next().getValue();
                if (mo14576a(aVar.f14882b).delete()) {
                    j = j2;
                    this.f14878b -= aVar.f14881a;
                } else {
                    j = j2;
                    String str = aVar.f14882b;
                    C5296y.m20469a("Could not delete cache entry for key=%s, filename=%s", str, m20347c(str));
                }
                it.remove();
                i2++;
                if (((float) (this.f14878b + j)) < ((float) this.f14880d) * 0.9f) {
                    break;
                }
                j2 = j;
            }
            if (C5296y.f14977b) {
                C5296y.m20472c("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.f14878b - j3), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
            }
        }
    }

    /* renamed from: a */
    static void m20339a(OutputStream outputStream, int i) {
        outputStream.write((i >> 0) & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    /* renamed from: a */
    static void m20340a(OutputStream outputStream, long j) {
        outputStream.write((byte) ((int) (j >>> 0)));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    /* renamed from: a */
    static void m20341a(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes(HTTP.UTF_8);
        m20340a(outputStream, (long) bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    /* renamed from: a */
    private void m20342a(String str, C5254a aVar) {
        if (!this.f14877a.containsKey(str)) {
            this.f14878b += aVar.f14881a;
        } else {
            this.f14878b += aVar.f14881a - this.f14877a.get(str).f14881a;
        }
        this.f14877a.put(str, aVar);
    }

    /* renamed from: a */
    static void m20343a(Map<String, String> map, OutputStream outputStream) {
        if (map != null) {
            m20339a(outputStream, map.size());
            for (Map.Entry next : map.entrySet()) {
                m20341a(outputStream, (String) next.getKey());
                m20341a(outputStream, (String) next.getValue());
            }
            return;
        }
        m20339a(outputStream, 0);
    }

    /* renamed from: a */
    private static byte[] m20344a(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read == -1) {
                break;
            }
            i2 += read;
        }
        if (i2 == i) {
            return bArr;
        }
        throw new IOException("Expected " + i + " bytes, read " + i2 + " bytes");
    }

    /* renamed from: b */
    static long m20345b(InputStream inputStream) {
        return ((((long) m20350e(inputStream)) & 255) << 0) | 0 | ((((long) m20350e(inputStream)) & 255) << 8) | ((((long) m20350e(inputStream)) & 255) << 16) | ((((long) m20350e(inputStream)) & 255) << 24) | ((((long) m20350e(inputStream)) & 255) << 32) | ((((long) m20350e(inputStream)) & 255) << 40) | ((((long) m20350e(inputStream)) & 255) << 48) | ((255 & ((long) m20350e(inputStream))) << 56);
    }

    /* renamed from: c */
    static String m20346c(InputStream inputStream) {
        return new String(m20344a(inputStream, (int) m20345b(inputStream)), HTTP.UTF_8);
    }

    /* renamed from: c */
    private String m20347c(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(str.substring(0, length).hashCode());
        return valueOf + String.valueOf(str.substring(length).hashCode());
    }

    /* renamed from: d */
    static Map<String, String> m20348d(InputStream inputStream) {
        int a = m20337a(inputStream);
        Map<String, String> emptyMap = a == 0 ? Collections.emptyMap() : new HashMap<>(a);
        for (int i = 0; i < a; i++) {
            emptyMap.put(m20346c(inputStream).intern(), m20346c(inputStream).intern());
        }
        return emptyMap;
    }

    /* renamed from: d */
    private void m20349d(String str) {
        C5254a aVar = this.f14877a.get(str);
        if (aVar != null) {
            this.f14878b -= aVar.f14881a;
            this.f14877a.remove(str);
        }
    }

    /* renamed from: e */
    private static int m20350e(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    /* renamed from: a */
    public File mo14576a(String str) {
        return new File(this.f14879c, m20347c(str));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:25|26|(2:35|36)|37|38) */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0063 */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005a A[SYNTHETIC, Splitter:B:32:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0066 A[SYNTHETIC, Splitter:B:40:0x0066] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0069 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo14577a() {
        /*
            r8 = this;
            monitor-enter(r8)
            java.io.File r0 = r8.f14879c     // Catch:{ all -> 0x006e }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x006e }
            r1 = 0
            if (r0 != 0) goto L_0x0024
            java.io.File r0 = r8.f14879c     // Catch:{ all -> 0x006e }
            boolean r0 = r0.mkdirs()     // Catch:{ all -> 0x006e }
            if (r0 != 0) goto L_0x0022
            java.lang.String r0 = "Unable to create cache dir %s"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x006e }
            java.io.File r3 = r8.f14879c     // Catch:{ all -> 0x006e }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ all -> 0x006e }
            r2[r1] = r3     // Catch:{ all -> 0x006e }
            p101d.p119e.p120a.C5296y.m20471b(r0, r2)     // Catch:{ all -> 0x006e }
        L_0x0022:
            monitor-exit(r8)
            return
        L_0x0024:
            java.io.File r0 = r8.f14879c     // Catch:{ all -> 0x006e }
            java.io.File[] r0 = r0.listFiles()     // Catch:{ all -> 0x006e }
            if (r0 != 0) goto L_0x002e
            monitor-exit(r8)
            return
        L_0x002e:
            int r2 = r0.length     // Catch:{ all -> 0x006e }
        L_0x002f:
            if (r1 >= r2) goto L_0x006c
            r3 = r0[r1]     // Catch:{ all -> 0x006e }
            r4 = 0
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0058 }
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0058 }
            r6.<init>(r3)     // Catch:{ IOException -> 0x0058 }
            r5.<init>(r6)     // Catch:{ IOException -> 0x0058 }
            d.e.a.a.e$a r4 = p101d.p119e.p120a.p121a.C5253e.C5254a.m20355a((java.io.InputStream) r5)     // Catch:{ IOException -> 0x0054, all -> 0x0051 }
            long r6 = r3.length()     // Catch:{ IOException -> 0x0054, all -> 0x0051 }
            r4.f14881a = r6     // Catch:{ IOException -> 0x0054, all -> 0x0051 }
            java.lang.String r6 = r4.f14882b     // Catch:{ IOException -> 0x0054, all -> 0x0051 }
            r8.m20342a((java.lang.String) r6, (p101d.p119e.p120a.p121a.C5253e.C5254a) r4)     // Catch:{ IOException -> 0x0054, all -> 0x0051 }
            r5.close()     // Catch:{ IOException -> 0x0069 }
            goto L_0x0069
        L_0x0051:
            r0 = move-exception
            r4 = r5
            goto L_0x005e
        L_0x0054:
            r4 = r5
            goto L_0x0058
        L_0x0056:
            r0 = move-exception
            goto L_0x005e
        L_0x0058:
            if (r3 == 0) goto L_0x0064
            r3.delete()     // Catch:{ all -> 0x0056 }
            goto L_0x0064
        L_0x005e:
            if (r4 == 0) goto L_0x0063
            r4.close()     // Catch:{ IOException -> 0x0063 }
        L_0x0063:
            throw r0     // Catch:{ all -> 0x006e }
        L_0x0064:
            if (r4 == 0) goto L_0x0069
            r4.close()     // Catch:{ IOException -> 0x0069 }
        L_0x0069:
            int r1 = r1 + 1
            goto L_0x002f
        L_0x006c:
            monitor-exit(r8)
            return
        L_0x006e:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p119e.p120a.p121a.C5253e.mo14577a():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:13|14|(1:16)|17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        if (r0.delete() == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        p101d.p119e.p120a.C5296y.m20469a("Could not clean up file %s", r0.getAbsolutePath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0045 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo14578a(java.lang.String r7, p101d.p119e.p120a.C5267b.C5268a r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r8.f14898a     // Catch:{ all -> 0x005a }
            int r0 = r0.length     // Catch:{ all -> 0x005a }
            r6.m20338a((int) r0)     // Catch:{ all -> 0x005a }
            java.io.File r0 = r6.mo14576a((java.lang.String) r7)     // Catch:{ all -> 0x005a }
            r1 = 0
            r2 = 1
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0045 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0045 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x0045 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x0045 }
            d.e.a.a.e$a r4 = new d.e.a.a.e$a     // Catch:{ IOException -> 0x0045 }
            r4.<init>(r7, r8)     // Catch:{ IOException -> 0x0045 }
            boolean r5 = r4.mo14582a((java.io.OutputStream) r3)     // Catch:{ IOException -> 0x0045 }
            if (r5 == 0) goto L_0x002f
            byte[] r8 = r8.f14898a     // Catch:{ IOException -> 0x0045 }
            r3.write(r8)     // Catch:{ IOException -> 0x0045 }
            r3.close()     // Catch:{ IOException -> 0x0045 }
            r6.m20342a((java.lang.String) r7, (p101d.p119e.p120a.p121a.C5253e.C5254a) r4)     // Catch:{ IOException -> 0x0045 }
            monitor-exit(r6)
            return
        L_0x002f:
            r3.close()     // Catch:{ IOException -> 0x0045 }
            java.lang.String r7 = "Failed to write header for %s"
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x0045 }
            java.lang.String r3 = r0.getAbsolutePath()     // Catch:{ IOException -> 0x0045 }
            r8[r1] = r3     // Catch:{ IOException -> 0x0045 }
            p101d.p119e.p120a.C5296y.m20469a(r7, r8)     // Catch:{ IOException -> 0x0045 }
            java.io.IOException r7 = new java.io.IOException     // Catch:{ IOException -> 0x0045 }
            r7.<init>()     // Catch:{ IOException -> 0x0045 }
            throw r7     // Catch:{ IOException -> 0x0045 }
        L_0x0045:
            boolean r7 = r0.delete()     // Catch:{ all -> 0x005a }
            if (r7 != 0) goto L_0x0058
            java.lang.String r7 = "Could not clean up file %s"
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x005a }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x005a }
            r8[r1] = r0     // Catch:{ all -> 0x005a }
            p101d.p119e.p120a.C5296y.m20469a(r7, r8)     // Catch:{ all -> 0x005a }
        L_0x0058:
            monitor-exit(r6)
            return
        L_0x005a:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p119e.p120a.p121a.C5253e.mo14578a(java.lang.String, d.e.a.b$a):void");
    }

    /* renamed from: b */
    public synchronized void mo14579b(String str) {
        boolean delete = mo14576a(str).delete();
        m20349d(str);
        if (!delete) {
            C5296y.m20469a("Could not delete cache entry for key=%s, filename=%s", str, m20347c(str));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0062 A[SYNTHETIC, Splitter:B:31:0x0062] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0084 A[SYNTHETIC, Splitter:B:44:0x0084] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x008f A[SYNTHETIC, Splitter:B:53:0x008f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p101d.p119e.p120a.C5267b.C5268a get(java.lang.String r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            java.util.Map<java.lang.String, d.e.a.a.e$a> r0 = r11.f14877a     // Catch:{ all -> 0x0096 }
            java.lang.Object r0 = r0.get(r12)     // Catch:{ all -> 0x0096 }
            d.e.a.a.e$a r0 = (p101d.p119e.p120a.p121a.C5253e.C5254a) r0     // Catch:{ all -> 0x0096 }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r11)
            return r1
        L_0x000e:
            java.io.File r2 = r11.mo14576a((java.lang.String) r12)     // Catch:{ all -> 0x0096 }
            r3 = 1
            r4 = 0
            r5 = 2
            d.e.a.a.e$b r6 = new d.e.a.a.e$b     // Catch:{ IOException -> 0x006a, NegativeArraySizeException -> 0x0048, all -> 0x0045 }
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x006a, NegativeArraySizeException -> 0x0048, all -> 0x0045 }
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ IOException -> 0x006a, NegativeArraySizeException -> 0x0048, all -> 0x0045 }
            r8.<init>(r2)     // Catch:{ IOException -> 0x006a, NegativeArraySizeException -> 0x0048, all -> 0x0045 }
            r7.<init>(r8)     // Catch:{ IOException -> 0x006a, NegativeArraySizeException -> 0x0048, all -> 0x0045 }
            r6.<init>(r7)     // Catch:{ IOException -> 0x006a, NegativeArraySizeException -> 0x0048, all -> 0x0045 }
            p101d.p119e.p120a.p121a.C5253e.C5254a.m20355a((java.io.InputStream) r6)     // Catch:{ IOException -> 0x0043, NegativeArraySizeException -> 0x0041 }
            long r7 = r2.length()     // Catch:{ IOException -> 0x0043, NegativeArraySizeException -> 0x0041 }
            int r9 = r6.f14889a     // Catch:{ IOException -> 0x0043, NegativeArraySizeException -> 0x0041 }
            long r9 = (long) r9     // Catch:{ IOException -> 0x0043, NegativeArraySizeException -> 0x0041 }
            long r7 = r7 - r9
            int r7 = (int) r7     // Catch:{ IOException -> 0x0043, NegativeArraySizeException -> 0x0041 }
            byte[] r7 = m20344a((java.io.InputStream) r6, (int) r7)     // Catch:{ IOException -> 0x0043, NegativeArraySizeException -> 0x0041 }
            d.e.a.b$a r12 = r0.mo14581a((byte[]) r7)     // Catch:{ IOException -> 0x0043, NegativeArraySizeException -> 0x0041 }
            r6.close()     // Catch:{ IOException -> 0x003f }
            monitor-exit(r11)
            return r12
        L_0x003f:
            monitor-exit(r11)
            return r1
        L_0x0041:
            r0 = move-exception
            goto L_0x004a
        L_0x0043:
            r0 = move-exception
            goto L_0x006c
        L_0x0045:
            r12 = move-exception
            r6 = r1
            goto L_0x008d
        L_0x0048:
            r0 = move-exception
            r6 = r1
        L_0x004a:
            java.lang.String r7 = "%s: %s"
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x008c }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ all -> 0x008c }
            r5[r4] = r2     // Catch:{ all -> 0x008c }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x008c }
            r5[r3] = r0     // Catch:{ all -> 0x008c }
            p101d.p119e.p120a.C5296y.m20469a(r7, r5)     // Catch:{ all -> 0x008c }
            r11.mo14579b((java.lang.String) r12)     // Catch:{ all -> 0x008c }
            if (r6 == 0) goto L_0x0068
            r6.close()     // Catch:{ IOException -> 0x0066 }
            goto L_0x0068
        L_0x0066:
            monitor-exit(r11)
            return r1
        L_0x0068:
            monitor-exit(r11)
            return r1
        L_0x006a:
            r0 = move-exception
            r6 = r1
        L_0x006c:
            java.lang.String r7 = "%s: %s"
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x008c }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ all -> 0x008c }
            r5[r4] = r2     // Catch:{ all -> 0x008c }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x008c }
            r5[r3] = r0     // Catch:{ all -> 0x008c }
            p101d.p119e.p120a.C5296y.m20469a(r7, r5)     // Catch:{ all -> 0x008c }
            r11.mo14579b((java.lang.String) r12)     // Catch:{ all -> 0x008c }
            if (r6 == 0) goto L_0x008a
            r6.close()     // Catch:{ IOException -> 0x0088 }
            goto L_0x008a
        L_0x0088:
            monitor-exit(r11)
            return r1
        L_0x008a:
            monitor-exit(r11)
            return r1
        L_0x008c:
            r12 = move-exception
        L_0x008d:
            if (r6 == 0) goto L_0x0095
            r6.close()     // Catch:{ IOException -> 0x0093 }
            goto L_0x0095
        L_0x0093:
            monitor-exit(r11)
            return r1
        L_0x0095:
            throw r12     // Catch:{ all -> 0x0096 }
        L_0x0096:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p119e.p120a.p121a.C5253e.get(java.lang.String):d.e.a.b$a");
    }
}
