package p208e.p209a.p210a.p211a.p212a.p218e;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.message.TokenParser;
import org.apache.http.protocol.HTTP;

/* renamed from: e.a.a.a.a.e.f */
public class C6149f {

    /* renamed from: a */
    private static final String[] f17155a = new String[0];

    /* renamed from: b */
    private static C6151b f17156b = C6151b.f17169a;

    /* renamed from: c */
    private HttpURLConnection f17157c = null;

    /* renamed from: d */
    public final URL f17158d;

    /* renamed from: e */
    private final String f17159e;

    /* renamed from: f */
    private C6154e f17160f;

    /* renamed from: g */
    private boolean f17161g;

    /* renamed from: h */
    private boolean f17162h = true;

    /* renamed from: i */
    private boolean f17163i = false;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f17164j = 8192;

    /* renamed from: k */
    private String f17165k;

    /* renamed from: l */
    private int f17166l;

    /* renamed from: e.a.a.a.a.e.f$a */
    protected static abstract class C6150a<V> extends C6153d<V> {

        /* renamed from: a */
        private final Closeable f17167a;

        /* renamed from: b */
        private final boolean f17168b;

        protected C6150a(Closeable closeable, boolean z) {
            this.f17167a = closeable;
            this.f17168b = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo16222a() {
            Closeable closeable = this.f17167a;
            if (closeable instanceof Flushable) {
                ((Flushable) closeable).flush();
            }
            if (this.f17168b) {
                try {
                    this.f17167a.close();
                } catch (IOException unused) {
                }
            } else {
                this.f17167a.close();
            }
        }
    }

    /* renamed from: e.a.a.a.a.e.f$b */
    public interface C6151b {

        /* renamed from: a */
        public static final C6151b f17169a = new C6155g();

        /* renamed from: a */
        HttpURLConnection mo16223a(URL url);

        /* renamed from: a */
        HttpURLConnection mo16224a(URL url, Proxy proxy);
    }

    /* renamed from: e.a.a.a.a.e.f$c */
    public static class C6152c extends RuntimeException {
        protected C6152c(IOException iOException) {
            super(iOException);
        }

        public IOException getCause() {
            return (IOException) super.getCause();
        }
    }

    /* renamed from: e.a.a.a.a.e.f$d */
    protected static abstract class C6153d<V> implements Callable<V> {
        protected C6153d() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo16222a();

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract V mo16181b();

        public V call() {
            boolean z = true;
            try {
                V b = mo16181b();
                try {
                    mo16222a();
                    return b;
                } catch (IOException e) {
                    throw new C6152c(e);
                }
            } catch (C6152c e2) {
                throw e2;
            } catch (IOException e3) {
                throw new C6152c(e3);
            } catch (Throwable th) {
                th = th;
                mo16222a();
                throw th;
            }
        }
    }

    /* renamed from: e.a.a.a.a.e.f$e */
    public static class C6154e extends BufferedOutputStream {

        /* renamed from: a */
        private final CharsetEncoder f17170a;

        public C6154e(OutputStream outputStream, String str, int i) {
            super(outputStream, i);
            this.f17170a = Charset.forName(C6149f.m23260f(str)).newEncoder();
        }

        /* renamed from: a */
        public C6154e mo16227a(String str) {
            ByteBuffer encode = this.f17170a.encode(CharBuffer.wrap(str));
            super.write(encode.array(), 0, encode.limit());
            return this;
        }
    }

    public C6149f(CharSequence charSequence, String str) {
        try {
            this.f17158d = new URL(charSequence.toString());
            this.f17159e = str;
        } catch (MalformedURLException e) {
            throw new C6152c(e);
        }
    }

    /* renamed from: a */
    public static C6149f m23249a(CharSequence charSequence) {
        return new C6149f(charSequence, HttpDelete.METHOD_NAME);
    }

    /* renamed from: a */
    public static C6149f m23250a(CharSequence charSequence, Map<?, ?> map, boolean z) {
        String a = m23251a(charSequence, map);
        if (z) {
            a = m23255b((CharSequence) a);
        }
        return m23257c((CharSequence) a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0065 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0045  */
    /* renamed from: a */
    public static java.lang.String m23251a(java.lang.CharSequence r3, java.util.Map<?, ?> r4) {
        /*
            java.lang.String r3 = r3.toString()
            if (r4 == 0) goto L_0x0069
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x000d
            goto L_0x0069
        L_0x000d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            m23256b((java.lang.String) r3, (java.lang.StringBuilder) r0)
            m23253a((java.lang.String) r3, (java.lang.StringBuilder) r0)
            java.util.Set r3 = r4.entrySet()
            java.util.Iterator r3 = r3.iterator()
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r1 = r4.getKey()
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            r1 = 61
            r0.append(r1)
            java.lang.Object r4 = r4.getValue()
            if (r4 == 0) goto L_0x003f
        L_0x003c:
            r0.append(r4)
        L_0x003f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0065
            r4 = 38
            r0.append(r4)
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r2 = r4.getKey()
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            r0.append(r1)
            java.lang.Object r4 = r4.getValue()
            if (r4 == 0) goto L_0x003f
            goto L_0x003c
        L_0x0065:
            java.lang.String r3 = r0.toString()
        L_0x0069:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p208e.p209a.p210a.p211a.p212a.p218e.C6149f.m23251a(java.lang.CharSequence, java.util.Map):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r4.charAt(r2) != '&') goto L_0x000f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.StringBuilder m23253a(java.lang.String r4, java.lang.StringBuilder r5) {
        /*
            r0 = 63
            int r1 = r4.indexOf(r0)
            int r2 = r5.length()
            int r2 = r2 + -1
            r3 = -1
            if (r1 != r3) goto L_0x0013
        L_0x000f:
            r5.append(r0)
            goto L_0x001e
        L_0x0013:
            if (r1 >= r2) goto L_0x001e
            char r4 = r4.charAt(r2)
            r0 = 38
            if (r4 == r0) goto L_0x001e
            goto L_0x000f
        L_0x001e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p208e.p209a.p210a.p211a.p212a.p218e.C6149f.m23253a(java.lang.String, java.lang.StringBuilder):java.lang.StringBuilder");
    }

    /* renamed from: b */
    public static C6149f m23254b(CharSequence charSequence, Map<?, ?> map, boolean z) {
        String a = m23251a(charSequence, map);
        if (z) {
            a = m23255b((CharSequence) a);
        }
        return m23258d((CharSequence) a);
    }

    /* renamed from: b */
    public static String m23255b(CharSequence charSequence) {
        int i;
        try {
            URL url = new URL(charSequence.toString());
            String host = url.getHost();
            int port = url.getPort();
            if (port != -1) {
                host = host + ':' + Integer.toString(port);
            }
            try {
                String aSCIIString = new URI(url.getProtocol(), host, url.getPath(), url.getQuery(), (String) null).toASCIIString();
                int indexOf = aSCIIString.indexOf(63);
                if (indexOf <= 0 || (i = indexOf + 1) >= aSCIIString.length()) {
                    return aSCIIString;
                }
                return aSCIIString.substring(0, i) + aSCIIString.substring(i).replace("+", "%2B");
            } catch (URISyntaxException e) {
                IOException iOException = new IOException("Parsing URI failed");
                iOException.initCause(e);
                throw new C6152c(iOException);
            }
        } catch (IOException e2) {
            throw new C6152c(e2);
        }
    }

    /* renamed from: b */
    private static StringBuilder m23256b(String str, StringBuilder sb) {
        if (str.indexOf(58) + 2 == str.lastIndexOf(47)) {
            sb.append('/');
        }
        return sb;
    }

    /* renamed from: c */
    public static C6149f m23257c(CharSequence charSequence) {
        return new C6149f(charSequence, HttpGet.METHOD_NAME);
    }

    /* renamed from: d */
    public static C6149f m23258d(CharSequence charSequence) {
        return new C6149f(charSequence, HttpPost.METHOD_NAME);
    }

    /* renamed from: e */
    public static C6149f m23259e(CharSequence charSequence) {
        return new C6149f(charSequence, HttpPut.METHOD_NAME);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static String m23260f(String str) {
        return (str == null || str.length() <= 0) ? HTTP.UTF_8 : str;
    }

    /* renamed from: q */
    private HttpURLConnection m23261q() {
        try {
            HttpURLConnection a = this.f17165k != null ? f17156b.mo16224a(this.f17158d, m23262r()) : f17156b.mo16223a(this.f17158d);
            a.setRequestMethod(this.f17159e);
            return a;
        } catch (IOException e) {
            throw new C6152c(e);
        }
    }

    /* renamed from: r */
    private Proxy m23262r() {
        return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(this.f17165k, this.f17166l));
    }

    /* renamed from: a */
    public int mo16182a(String str, int i) {
        mo16208f();
        return mo16214j().getHeaderFieldInt(str, i);
    }

    /* renamed from: a */
    public C6149f mo16183a(int i) {
        mo16214j().setConnectTimeout(i);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C6149f mo16184a(InputStream inputStream, OutputStream outputStream) {
        return (C6149f) new C6148e(this, inputStream, this.f17162h, inputStream, outputStream).call();
    }

    /* renamed from: a */
    public C6149f mo16185a(String str, Number number) {
        mo16187a(str, (String) null, number);
        return this;
    }

    /* renamed from: a */
    public C6149f mo16186a(String str, String str2) {
        if (str2 == null || str2.length() <= 0) {
            mo16200c("Content-Type", str);
            return this;
        }
        mo16200c("Content-Type", str + HTTP.CHARSET_PARAM + str2);
        return this;
    }

    /* renamed from: a */
    public C6149f mo16187a(String str, String str2, Number number) {
        mo16188a(str, str2, number != null ? number.toString() : null);
        return this;
    }

    /* renamed from: a */
    public C6149f mo16188a(String str, String str2, String str3) {
        mo16191a(str, str2, (String) null, str3);
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0023 A[SYNTHETIC, Splitter:B:19:0x0023] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p208e.p209a.p210a.p211a.p212a.p218e.C6149f mo16189a(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.io.File r7) {
        /*
            r3 = this;
            r0 = 0
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x001a }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x001a }
            r2.<init>(r7)     // Catch:{ IOException -> 0x001a }
            r1.<init>(r2)     // Catch:{ IOException -> 0x001a }
            r3.mo16190a((java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (java.io.InputStream) r1)     // Catch:{ IOException -> 0x0015, all -> 0x0012 }
            r1.close()     // Catch:{ IOException -> 0x0011 }
        L_0x0011:
            return r3
        L_0x0012:
            r4 = move-exception
            r0 = r1
            goto L_0x0021
        L_0x0015:
            r4 = move-exception
            r0 = r1
            goto L_0x001b
        L_0x0018:
            r4 = move-exception
            goto L_0x0021
        L_0x001a:
            r4 = move-exception
        L_0x001b:
            e.a.a.a.a.e.f$c r5 = new e.a.a.a.a.e.f$c     // Catch:{ all -> 0x0018 }
            r5.<init>(r4)     // Catch:{ all -> 0x0018 }
            throw r5     // Catch:{ all -> 0x0018 }
        L_0x0021:
            if (r0 == 0) goto L_0x0026
            r0.close()     // Catch:{ IOException -> 0x0026 }
        L_0x0026:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p208e.p209a.p210a.p211a.p212a.p218e.C6149f.mo16189a(java.lang.String, java.lang.String, java.lang.String, java.io.File):e.a.a.a.a.e.f");
    }

    /* renamed from: a */
    public C6149f mo16190a(String str, String str2, String str3, InputStream inputStream) {
        try {
            mo16218n();
            mo16195b(str, str2, str3);
            mo16184a(inputStream, (OutputStream) this.f17160f);
            return this;
        } catch (IOException e) {
            throw new C6152c(e);
        }
    }

    /* renamed from: a */
    public C6149f mo16191a(String str, String str2, String str3, String str4) {
        try {
            mo16218n();
            mo16195b(str, str2, str3);
            this.f17160f.mo16227a(str4);
            return this;
        } catch (IOException e) {
            throw new C6152c(e);
        }
    }

    /* renamed from: a */
    public C6149f mo16192a(Map.Entry<String, String> entry) {
        mo16200c(entry.getKey(), entry.getValue());
        return this;
    }

    /* renamed from: a */
    public C6149f mo16193a(boolean z) {
        mo16214j().setUseCaches(z);
        return this;
    }

    /* renamed from: a */
    public String mo16194a() {
        return mo16197b(mo16202d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C6149f mo16195b(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append("form-data; name=\"");
        sb.append(str);
        if (str2 != null) {
            sb.append("\"; filename=\"");
            sb.append(str2);
        }
        sb.append(TokenParser.DQUOTE);
        mo16210f("Content-Disposition", sb.toString());
        if (str3 != null) {
            mo16210f("Content-Type", str3);
        }
        mo16209f((CharSequence) "\r\n");
        return this;
    }

    /* renamed from: b */
    public BufferedInputStream mo16196b() {
        return new BufferedInputStream(mo16219o(), this.f17164j);
    }

    /* renamed from: b */
    public String mo16197b(String str) {
        ByteArrayOutputStream c = mo16201c();
        try {
            mo16184a((InputStream) mo16196b(), (OutputStream) c);
            return c.toString(m23260f(str));
        } catch (IOException e) {
            throw new C6152c(e);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006f A[EDGE_INSN: B:30:0x006f->B:29:0x006f ?: BREAK  , SYNTHETIC] */
    /* renamed from: b */
    protected java.lang.String mo16198b(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x006f
            int r1 = r9.length()
            if (r1 != 0) goto L_0x000a
            goto L_0x006f
        L_0x000a:
            int r1 = r9.length()
            r2 = 59
            int r3 = r9.indexOf(r2)
            r4 = 1
            int r3 = r3 + r4
            if (r3 == 0) goto L_0x006f
            if (r3 != r1) goto L_0x001b
            goto L_0x006f
        L_0x001b:
            int r5 = r9.indexOf(r2, r3)
            r6 = -1
            if (r5 != r6) goto L_0x0023
        L_0x0022:
            r5 = r1
        L_0x0023:
            if (r3 >= r5) goto L_0x006f
            r7 = 61
            int r7 = r9.indexOf(r7, r3)
            if (r7 == r6) goto L_0x0066
            if (r7 >= r5) goto L_0x0066
            java.lang.String r3 = r9.substring(r3, r7)
            java.lang.String r3 = r3.trim()
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x0066
            int r7 = r7 + 1
            java.lang.String r3 = r9.substring(r7, r5)
            java.lang.String r3 = r3.trim()
            int r7 = r3.length()
            if (r7 == 0) goto L_0x0066
            r9 = 2
            if (r7 <= r9) goto L_0x0065
            r9 = 0
            char r9 = r3.charAt(r9)
            r10 = 34
            if (r10 != r9) goto L_0x0065
            int r7 = r7 - r4
            char r9 = r3.charAt(r7)
            if (r10 != r9) goto L_0x0065
            java.lang.String r9 = r3.substring(r4, r7)
            return r9
        L_0x0065:
            return r3
        L_0x0066:
            int r3 = r5 + 1
            int r5 = r9.indexOf(r2, r3)
            if (r5 != r6) goto L_0x0023
            goto L_0x0022
        L_0x006f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p208e.p209a.p210a.p211a.p212a.p218e.C6149f.mo16198b(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: c */
    public C6149f mo16199c(String str) {
        mo16186a(str, (String) null);
        return this;
    }

    /* renamed from: c */
    public C6149f mo16200c(String str, String str2) {
        mo16214j().setRequestProperty(str, str2);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public ByteArrayOutputStream mo16201c() {
        int i = mo16213i();
        return i > 0 ? new ByteArrayOutputStream(i) : new ByteArrayOutputStream();
    }

    /* renamed from: d */
    public String mo16202d() {
        return mo16204d("Content-Type", "charset");
    }

    /* renamed from: d */
    public String mo16203d(String str) {
        mo16208f();
        return mo16214j().getHeaderField(str);
    }

    /* renamed from: d */
    public String mo16204d(String str, String str2) {
        return mo16198b(mo16203d(str), str2);
    }

    /* renamed from: e */
    public int mo16205e(String str) {
        return mo16182a(str, -1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C6149f mo16206e() {
        C6154e eVar = this.f17160f;
        if (eVar == null) {
            return this;
        }
        if (this.f17161g) {
            eVar.mo16227a("\r\n--00content0boundary00--\r\n");
        }
        if (this.f17162h) {
            try {
                this.f17160f.close();
            } catch (IOException unused) {
            }
        } else {
            this.f17160f.close();
        }
        this.f17160f = null;
        return this;
    }

    /* renamed from: e */
    public C6149f mo16207e(String str, String str2) {
        mo16188a(str, (String) null, str2);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C6149f mo16208f() {
        try {
            mo16206e();
            return this;
        } catch (IOException e) {
            throw new C6152c(e);
        }
    }

    /* renamed from: f */
    public C6149f mo16209f(CharSequence charSequence) {
        try {
            mo16217m();
            this.f17160f.mo16227a(charSequence.toString());
            return this;
        } catch (IOException e) {
            throw new C6152c(e);
        }
    }

    /* renamed from: f */
    public C6149f mo16210f(String str, String str2) {
        mo16209f((CharSequence) str);
        mo16209f((CharSequence) ": ");
        mo16209f((CharSequence) str2);
        mo16209f((CharSequence) "\r\n");
        return this;
    }

    /* renamed from: g */
    public int mo16211g() {
        try {
            mo16206e();
            return mo16214j().getResponseCode();
        } catch (IOException e) {
            throw new C6152c(e);
        }
    }

    /* renamed from: h */
    public String mo16212h() {
        return mo16203d("Content-Encoding");
    }

    /* renamed from: i */
    public int mo16213i() {
        return mo16205e("Content-Length");
    }

    /* renamed from: j */
    public HttpURLConnection mo16214j() {
        if (this.f17157c == null) {
            this.f17157c = m23261q();
        }
        return this.f17157c;
    }

    /* renamed from: k */
    public String mo16215k() {
        return mo16214j().getRequestMethod();
    }

    /* renamed from: l */
    public boolean mo16216l() {
        return 200 == mo16211g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C6149f mo16217m() {
        if (this.f17160f != null) {
            return this;
        }
        mo16214j().setDoOutput(true);
        this.f17160f = new C6154e(mo16214j().getOutputStream(), mo16198b(mo16214j().getRequestProperty("Content-Type"), "charset"), this.f17164j);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C6149f mo16218n() {
        String str;
        C6154e eVar;
        if (!this.f17161g) {
            this.f17161g = true;
            mo16199c("multipart/form-data; boundary=00content0boundary00");
            mo16217m();
            eVar = this.f17160f;
            str = "--00content0boundary00\r\n";
        } else {
            eVar = this.f17160f;
            str = "\r\n--00content0boundary00\r\n";
        }
        eVar.mo16227a(str);
        return this;
    }

    /* renamed from: o */
    public InputStream mo16219o() {
        InputStream inputStream;
        if (mo16211g() < 400) {
            try {
                inputStream = mo16214j().getInputStream();
            } catch (IOException e) {
                throw new C6152c(e);
            }
        } else {
            inputStream = mo16214j().getErrorStream();
            if (inputStream == null) {
                try {
                    inputStream = mo16214j().getInputStream();
                } catch (IOException e2) {
                    throw new C6152c(e2);
                }
            }
        }
        if (!this.f17163i || !"gzip".equals(mo16212h())) {
            return inputStream;
        }
        try {
            return new GZIPInputStream(inputStream);
        } catch (IOException e3) {
            throw new C6152c(e3);
        }
    }

    /* renamed from: p */
    public URL mo16220p() {
        return mo16214j().getURL();
    }

    public String toString() {
        return mo16215k() + TokenParser.f19315SP + mo16220p();
    }
}
