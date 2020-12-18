package p250g.p255b.p256a.p261e;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.security.AccessController;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import p250g.p255b.p256a.C6567g;

/* renamed from: g.b.a.e.i */
public class C6565i implements C6562f {

    /* renamed from: a */
    private final File f18272a;

    /* renamed from: b */
    private final String f18273b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ClassLoader f18274c;

    /* renamed from: d */
    private final Map<String, Object> f18275d;

    /* renamed from: e */
    private final Set<String> f18276e;

    public C6565i(File file) {
        if (file == null) {
            throw new IllegalArgumentException("No file directory provided");
        } else if (!file.exists()) {
            throw new IOException("File directory doesn't exist: " + file);
        } else if (file.isDirectory()) {
            this.f18272a = file;
            this.f18273b = null;
            this.f18274c = null;
            this.f18275d = m25080a(m25083c("ZoneInfoMap"));
            this.f18276e = Collections.unmodifiableSortedSet(new TreeSet(this.f18275d.keySet()));
        } else {
            throw new IOException("File doesn't refer to a directory: " + file);
        }
    }

    public C6565i(String str) {
        this(str, (ClassLoader) null, false);
    }

    private C6565i(String str, ClassLoader classLoader, boolean z) {
        if (str != null) {
            if (!str.endsWith("/")) {
                str = str + '/';
            }
            this.f18272a = null;
            this.f18273b = str;
            if (classLoader == null && !z) {
                classLoader = C6565i.class.getClassLoader();
            }
            this.f18274c = classLoader;
            this.f18275d = m25080a(m25083c("ZoneInfoMap"));
            this.f18276e = Collections.unmodifiableSortedSet(new TreeSet(this.f18275d.keySet()));
            return;
        }
        throw new IllegalArgumentException("No resource path provided");
    }

    /* renamed from: a */
    private static Map<String, Object> m25080a(InputStream inputStream) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        try {
            m25081a(dataInputStream, concurrentHashMap);
            concurrentHashMap.put("UTC", new SoftReference(C6567g.f18277a));
            return concurrentHashMap;
        } finally {
            try {
                dataInputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m25081a(DataInputStream dataInputStream, Map<String, Object> map) {
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        String[] strArr = new String[readUnsignedShort];
        int i = 0;
        for (int i2 = 0; i2 < readUnsignedShort; i2++) {
            strArr[i2] = dataInputStream.readUTF().intern();
        }
        int readUnsignedShort2 = dataInputStream.readUnsignedShort();
        while (i < readUnsignedShort2) {
            try {
                map.put(strArr[dataInputStream.readUnsignedShort()], strArr[dataInputStream.readUnsignedShort()]);
                i++;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new IOException("Corrupt zone info map");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x002c A[SYNTHETIC, Splitter:B:19:0x002c] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0032 A[SYNTHETIC, Splitter:B:24:0x0032] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p250g.p255b.p256a.C6567g m25082b(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            java.io.InputStream r1 = r5.m25083c(r6)     // Catch:{ IOException -> 0x0020, all -> 0x001d }
            g.b.a.g r2 = p250g.p255b.p256a.p261e.C6554b.m25031a((java.io.InputStream) r1, (java.lang.String) r6)     // Catch:{ IOException -> 0x001b }
            java.util.Map<java.lang.String, java.lang.Object> r3 = r5.f18275d     // Catch:{ IOException -> 0x001b }
            java.lang.ref.SoftReference r4 = new java.lang.ref.SoftReference     // Catch:{ IOException -> 0x001b }
            r4.<init>(r2)     // Catch:{ IOException -> 0x001b }
            r3.put(r6, r4)     // Catch:{ IOException -> 0x001b }
            if (r1 == 0) goto L_0x0018
            r1.close()     // Catch:{ IOException -> 0x0018 }
        L_0x0018:
            return r2
        L_0x0019:
            r6 = move-exception
            goto L_0x0030
        L_0x001b:
            r2 = move-exception
            goto L_0x0022
        L_0x001d:
            r6 = move-exception
            r1 = r0
            goto L_0x0030
        L_0x0020:
            r2 = move-exception
            r1 = r0
        L_0x0022:
            r5.mo16961a((java.lang.Exception) r2)     // Catch:{ all -> 0x0019 }
            java.util.Map<java.lang.String, java.lang.Object> r2 = r5.f18275d     // Catch:{ all -> 0x0019 }
            r2.remove(r6)     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x002f
            r1.close()     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            return r0
        L_0x0030:
            if (r1 == 0) goto L_0x0035
            r1.close()     // Catch:{ IOException -> 0x0035 }
        L_0x0035:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p250g.p255b.p256a.p261e.C6565i.m25082b(java.lang.String):g.b.a.g");
    }

    /* renamed from: c */
    private InputStream m25083c(String str) {
        File file = this.f18272a;
        if (file != null) {
            return new FileInputStream(new File(file, str));
        }
        String concat = this.f18273b.concat(str);
        InputStream inputStream = (InputStream) AccessController.doPrivileged(new C6564h(this, concat));
        if (inputStream != null) {
            return inputStream;
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("Resource not found: \"");
        sb.append(concat);
        sb.append("\" ClassLoader: ");
        ClassLoader classLoader = this.f18274c;
        sb.append(classLoader != null ? classLoader.toString() : "system");
        throw new IOException(sb.toString());
    }

    /* renamed from: a */
    public C6567g mo16958a(String str) {
        Object obj;
        if (str == null || (obj = this.f18275d.get(str)) == null) {
            return null;
        }
        if (!(obj instanceof SoftReference)) {
            return str.equals(obj) ? m25082b(str) : mo16958a((String) obj);
        }
        C6567g gVar = (C6567g) ((SoftReference) obj).get();
        return gVar != null ? gVar : m25082b(str);
    }

    /* renamed from: a */
    public Set<String> mo16959a() {
        return this.f18276e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16961a(Exception exc) {
        exc.printStackTrace();
    }
}
