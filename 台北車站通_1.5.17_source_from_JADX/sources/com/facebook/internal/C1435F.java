package com.facebook.internal;

import com.facebook.C1355K;
import com.facebook.C1601x;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: com.facebook.internal.F */
public final class C1435F {

    /* renamed from: a */
    static final String f5019a = "F";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final AtomicLong f5020b = new AtomicLong();

    /* renamed from: c */
    private final String f5021c;

    /* renamed from: d */
    private final C1439d f5022d;

    /* renamed from: e */
    private final File f5023e;

    /* renamed from: f */
    private boolean f5024f;

    /* renamed from: g */
    private boolean f5025g;

    /* renamed from: h */
    private final Object f5026h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public AtomicLong f5027i = new AtomicLong(0);

    /* renamed from: com.facebook.internal.F$a */
    private static class C1436a {

        /* renamed from: a */
        private static final FilenameFilter f5028a = new C1433D();

        /* renamed from: b */
        private static final FilenameFilter f5029b = new C1434E();

        /* renamed from: a */
        static FilenameFilter m6794a() {
            return f5028a;
        }

        /* renamed from: a */
        static void m6795a(File file) {
            File[] listFiles = file.listFiles(m6797b());
            if (listFiles != null) {
                for (File delete : listFiles) {
                    delete.delete();
                }
            }
        }

        /* renamed from: b */
        static File m6796b(File file) {
            return new File(file, "buffer" + Long.valueOf(C1435F.f5020b.incrementAndGet()).toString());
        }

        /* renamed from: b */
        static FilenameFilter m6797b() {
            return f5029b;
        }
    }

    /* renamed from: com.facebook.internal.F$b */
    private static class C1437b extends OutputStream {

        /* renamed from: a */
        final OutputStream f5030a;

        /* renamed from: b */
        final C1441f f5031b;

        C1437b(OutputStream outputStream, C1441f fVar) {
            this.f5030a = outputStream;
            this.f5031b = fVar;
        }

        public void close() {
            try {
                this.f5030a.close();
            } finally {
                this.f5031b.onClose();
            }
        }

        public void flush() {
            this.f5030a.flush();
        }

        public void write(int i) {
            this.f5030a.write(i);
        }

        public void write(byte[] bArr) {
            this.f5030a.write(bArr);
        }

        public void write(byte[] bArr, int i, int i2) {
            this.f5030a.write(bArr, i, i2);
        }
    }

    /* renamed from: com.facebook.internal.F$c */
    private static final class C1438c extends InputStream {

        /* renamed from: a */
        final InputStream f5032a;

        /* renamed from: b */
        final OutputStream f5033b;

        C1438c(InputStream inputStream, OutputStream outputStream) {
            this.f5032a = inputStream;
            this.f5033b = outputStream;
        }

        public int available() {
            return this.f5032a.available();
        }

        public void close() {
            try {
                this.f5032a.close();
            } finally {
                this.f5033b.close();
            }
        }

        public void mark(int i) {
            throw new UnsupportedOperationException();
        }

        public boolean markSupported() {
            return false;
        }

        public int read() {
            int read = this.f5032a.read();
            if (read >= 0) {
                this.f5033b.write(read);
            }
            return read;
        }

        public int read(byte[] bArr) {
            int read = this.f5032a.read(bArr);
            if (read > 0) {
                this.f5033b.write(bArr, 0, read);
            }
            return read;
        }

        public int read(byte[] bArr, int i, int i2) {
            int read = this.f5032a.read(bArr, i, i2);
            if (read > 0) {
                this.f5033b.write(bArr, i, read);
            }
            return read;
        }

        public synchronized void reset() {
            throw new UnsupportedOperationException();
        }

        public long skip(long j) {
            int read;
            byte[] bArr = new byte[1024];
            long j2 = 0;
            while (j2 < j && (read = read(bArr, 0, (int) Math.min(j - j2, (long) bArr.length))) >= 0) {
                j2 += (long) read;
            }
            return j2;
        }
    }

    /* renamed from: com.facebook.internal.F$d */
    public static final class C1439d {

        /* renamed from: a */
        private int f5034a = 1048576;

        /* renamed from: b */
        private int f5035b = 1024;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo6123a() {
            return this.f5034a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo6124b() {
            return this.f5035b;
        }
    }

    /* renamed from: com.facebook.internal.F$e */
    private static final class C1440e implements Comparable<C1440e> {

        /* renamed from: a */
        private final File f5036a;

        /* renamed from: b */
        private final long f5037b;

        C1440e(File file) {
            this.f5036a = file;
            this.f5037b = file.lastModified();
        }

        /* renamed from: a */
        public int compareTo(C1440e eVar) {
            if (mo6127b() < eVar.mo6127b()) {
                return -1;
            }
            if (mo6127b() > eVar.mo6127b()) {
                return 1;
            }
            return mo6126a().compareTo(eVar.mo6126a());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public File mo6126a() {
            return this.f5036a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public long mo6127b() {
            return this.f5037b;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C1440e) && compareTo((C1440e) obj) == 0;
        }

        public int hashCode() {
            return ((1073 + this.f5036a.hashCode()) * 37) + ((int) (this.f5037b % 2147483647L));
        }
    }

    /* renamed from: com.facebook.internal.F$f */
    private interface C1441f {
        void onClose();
    }

    /* renamed from: com.facebook.internal.F$g */
    private static final class C1442g {
        /* renamed from: a */
        static JSONObject m6803a(InputStream inputStream) {
            if (inputStream.read() != 0) {
                return null;
            }
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < 3; i3++) {
                int read = inputStream.read();
                if (read == -1) {
                    C1459P.m6841a(C1355K.CACHE, C1435F.f5019a, "readHeader: stream.read returned -1 while reading header size");
                    return null;
                }
                i2 = (i2 << 8) + (read & 255);
            }
            byte[] bArr = new byte[i2];
            while (i < bArr.length) {
                int read2 = inputStream.read(bArr, i, bArr.length - i);
                if (read2 < 1) {
                    C1459P.m6841a(C1355K.CACHE, C1435F.f5019a, "readHeader: stream.read stopped at " + Integer.valueOf(i) + " when expected " + bArr.length);
                    return null;
                }
                i += read2;
            }
            try {
                Object nextValue = new JSONTokener(new String(bArr)).nextValue();
                if (nextValue instanceof JSONObject) {
                    return (JSONObject) nextValue;
                }
                C1459P.m6841a(C1355K.CACHE, C1435F.f5019a, "readHeader: expected JSONObject, got " + nextValue.getClass().getCanonicalName());
                return null;
            } catch (JSONException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* renamed from: a */
        static void m6804a(OutputStream outputStream, JSONObject jSONObject) {
            byte[] bytes = jSONObject.toString().getBytes();
            outputStream.write(0);
            outputStream.write((bytes.length >> 16) & 255);
            outputStream.write((bytes.length >> 8) & 255);
            outputStream.write((bytes.length >> 0) & 255);
            outputStream.write(bytes);
        }
    }

    public C1435F(String str, C1439d dVar) {
        this.f5021c = str;
        this.f5022d = dVar;
        this.f5023e = new File(C1601x.m7392e(), str);
        this.f5026h = new Object();
        if (this.f5023e.mkdirs() || this.f5023e.isDirectory()) {
            C1436a.m6795a(this.f5023e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m6785a(String str, File file) {
        if (!file.renameTo(new File(this.f5023e, C1480ba.m6961c(str)))) {
            file.delete();
        }
        m6786b();
    }

    /* renamed from: b */
    private void m6786b() {
        synchronized (this.f5026h) {
            if (!this.f5024f) {
                this.f5024f = true;
                C1601x.m7395h().execute(new C1432C(this));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m6788c() {
        long j;
        synchronized (this.f5026h) {
            this.f5024f = false;
            this.f5025g = true;
        }
        try {
            C1459P.m6841a(C1355K.CACHE, f5019a, "trim started");
            PriorityQueue priorityQueue = new PriorityQueue();
            File[] listFiles = this.f5023e.listFiles(C1436a.m6794a());
            long j2 = 0;
            if (listFiles != null) {
                long j3 = 0;
                j = 0;
                for (File file : listFiles) {
                    C1440e eVar = new C1440e(file);
                    priorityQueue.add(eVar);
                    C1459P.m6841a(C1355K.CACHE, f5019a, "  trim considering time=" + Long.valueOf(eVar.mo6127b()) + " name=" + eVar.mo6126a().getName());
                    j3 += file.length();
                    j++;
                }
                j2 = j3;
            } else {
                j = 0;
            }
            while (true) {
                if (j2 > ((long) this.f5022d.mo6123a()) || j > ((long) this.f5022d.mo6124b())) {
                    File a = ((C1440e) priorityQueue.remove()).mo6126a();
                    C1459P.m6841a(C1355K.CACHE, f5019a, "  trim removing " + a.getName());
                    j2 -= a.length();
                    j--;
                    a.delete();
                } else {
                    synchronized (this.f5026h) {
                        this.f5025g = false;
                        this.f5026h.notifyAll();
                    }
                    return;
                }
            }
        } catch (Throwable th) {
            synchronized (this.f5026h) {
                this.f5025g = false;
                this.f5026h.notifyAll();
                throw th;
            }
        }
    }

    /* renamed from: a */
    public InputStream mo6103a(String str) {
        return mo6105a(str, (String) null);
    }

    /* renamed from: a */
    public InputStream mo6104a(String str, InputStream inputStream) {
        return new C1438c(inputStream, mo6106b(str));
    }

    /* renamed from: a */
    public InputStream mo6105a(String str, String str2) {
        File file = new File(this.f5023e, C1480ba.m6961c(str));
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 8192);
            try {
                JSONObject a = C1442g.m6803a(bufferedInputStream);
                if (a == null) {
                    return null;
                }
                String optString = a.optString("key");
                if (optString != null) {
                    if (optString.equals(str)) {
                        String optString2 = a.optString("tag", (String) null);
                        if ((str2 != null || optString2 == null) && (str2 == null || str2.equals(optString2))) {
                            long time = new Date().getTime();
                            C1355K k = C1355K.CACHE;
                            String str3 = f5019a;
                            C1459P.m6841a(k, str3, "Setting lastModified to " + Long.valueOf(time) + " for " + file.getName());
                            file.setLastModified(time);
                            return bufferedInputStream;
                        }
                        bufferedInputStream.close();
                        return null;
                    }
                }
                bufferedInputStream.close();
                return null;
            } finally {
                bufferedInputStream.close();
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public OutputStream mo6106b(String str) {
        return mo6107b(str, (String) null);
    }

    /* renamed from: b */
    public OutputStream mo6107b(String str, String str2) {
        File b = C1436a.m6796b(this.f5023e);
        b.delete();
        if (b.createNewFile()) {
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new C1437b(new FileOutputStream(b), new C1431B(this, System.currentTimeMillis(), b, str)), 8192);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("key", str);
                    if (!C1480ba.m6958b(str2)) {
                        jSONObject.put("tag", str2);
                    }
                    C1442g.m6804a(bufferedOutputStream, jSONObject);
                    return bufferedOutputStream;
                } catch (JSONException e) {
                    C1355K k = C1355K.CACHE;
                    String str3 = f5019a;
                    C1459P.m6839a(k, 5, str3, "Error creating JSON header for cache file: " + e);
                    throw new IOException(e.getMessage());
                } catch (Throwable th) {
                    bufferedOutputStream.close();
                    throw th;
                }
            } catch (FileNotFoundException e2) {
                C1355K k2 = C1355K.CACHE;
                String str4 = f5019a;
                C1459P.m6839a(k2, 5, str4, "Error creating buffer output stream: " + e2);
                throw new IOException(e2.getMessage());
            }
        } else {
            throw new IOException("Could not create file at " + b.getAbsolutePath());
        }
    }

    public String toString() {
        return "{FileLruCache: tag:" + this.f5021c + " file:" + this.f5023e.getName() + "}";
    }
}
