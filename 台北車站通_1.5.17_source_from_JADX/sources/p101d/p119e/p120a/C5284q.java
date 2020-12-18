package p101d.p119e.p120a;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;
import org.apache.http.protocol.HTTP;
import p101d.p119e.p120a.C5267b;
import p101d.p119e.p120a.C5288s;
import p101d.p119e.p120a.C5296y;

/* renamed from: d.e.a.q */
public abstract class C5284q<T> implements Comparable<C5284q<T>> {

    /* renamed from: a */
    private static long f14938a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C5296y.C5297a f14939b;

    /* renamed from: c */
    private final int f14940c;

    /* renamed from: d */
    private final String f14941d;

    /* renamed from: e */
    private String f14942e;

    /* renamed from: f */
    private String f14943f;

    /* renamed from: g */
    private final int f14944g;

    /* renamed from: h */
    private C5288s.C5289a f14945h;

    /* renamed from: i */
    private Integer f14946i;

    /* renamed from: j */
    private C5286r f14947j;

    /* renamed from: k */
    private boolean f14948k;

    /* renamed from: l */
    private boolean f14949l;

    /* renamed from: m */
    private boolean f14950m;

    /* renamed from: n */
    private C5292u f14951n;

    /* renamed from: o */
    private C5267b.C5268a f14952o;

    /* renamed from: p */
    private Object f14953p;

    /* renamed from: d.e.a.q$a */
    public enum C5285a {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public C5284q(int i, String str, C5288s.C5289a aVar) {
        this.f14939b = C5296y.C5297a.f14978a ? new C5296y.C5297a() : null;
        this.f14948k = true;
        this.f14949l = false;
        this.f14950m = false;
        this.f14952o = null;
        this.f14940c = i;
        this.f14941d = str;
        this.f14943f = m20412a(i, str);
        this.f14945h = aVar;
        mo14624a((C5292u) new C5271e());
        this.f14944g = mo14601d(str);
    }

    /* renamed from: a */
    private static String m20412a(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Request:");
        sb.append(i);
        sb.append(":");
        sb.append(str);
        sb.append(":");
        sb.append(System.currentTimeMillis());
        sb.append(":");
        long j = f14938a;
        f14938a = 1 + j;
        sb.append(j);
        return C5275h.m20405a(sb.toString());
    }

    /* renamed from: a */
    private byte[] m20413a(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry next : map.entrySet()) {
                sb.append(URLEncoder.encode((String) next.getKey(), str));
                sb.append('=');
                sb.append(URLEncoder.encode((String) next.getValue(), str));
                sb.append('&');
            }
            return sb.toString().getBytes(str);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Encoding not supported: " + str, e);
        }
    }

    /* renamed from: d */
    private static int mo14601d(String str) {
        Uri parse;
        String host;
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    /* renamed from: A */
    public void mo14619A() {
        this.f14950m = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo14591B() {
        this.f14945h = null;
    }

    /* renamed from: C */
    public final boolean mo14620C() {
        return this.f14948k;
    }

    /* renamed from: a */
    public final C5284q<?> mo14621a(int i) {
        this.f14946i = Integer.valueOf(i);
        return this;
    }

    /* renamed from: a */
    public C5284q<?> mo14622a(C5267b.C5268a aVar) {
        this.f14952o = aVar;
        return this;
    }

    /* renamed from: a */
    public C5284q<?> mo14623a(C5286r rVar) {
        this.f14947j = rVar;
        return this;
    }

    /* renamed from: a */
    public C5284q<?> mo14624a(C5292u uVar) {
        this.f14951n = uVar;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C5288s<T> mo14590a(C5279l lVar);

    /* renamed from: a */
    public void mo14625a(C5295x xVar) {
        C5288s.C5289a aVar = this.f14945h;
        if (aVar != null) {
            aVar.mo14131a(xVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo14592a(T t);

    /* renamed from: a */
    public void mo14626a(String str) {
        if (C5296y.C5297a.f14978a) {
            this.f14939b.mo14659a(str, Thread.currentThread().getId());
        }
    }

    /* renamed from: a */
    public byte[] mo14593a() {
        Map<String, String> o = mo14639o();
        if (o == null || o.size() <= 0) {
            return null;
        }
        return m20413a(o, mo14640p());
    }

    /* renamed from: b */
    public int compareTo(C5284q<T> qVar) {
        C5285a f = mo14634f();
        C5285a f2 = qVar.mo14634f();
        return f == f2 ? this.f14946i.intValue() - qVar.f14946i.intValue() : f2.ordinal() - f.ordinal();
    }

    /* renamed from: b */
    public C5284q<?> mo14628b(Object obj) {
        this.f14953p = obj;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C5295x mo14629b(C5295x xVar) {
        return xVar;
    }

    /* renamed from: b */
    public String mo14594b() {
        return "application/x-www-form-urlencoded; charset=" + mo14640p();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo14630b(String str) {
        C5286r rVar = this.f14947j;
        if (rVar != null) {
            rVar.mo14653b(this);
            mo14591B();
        }
        if (C5296y.C5297a.f14978a) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new C5283p(this, str, id));
                return;
            }
            this.f14939b.mo14659a(str, id);
            this.f14939b.mo14658a(toString());
        }
    }

    /* renamed from: c */
    public C5267b.C5268a mo14631c() {
        return this.f14952o;
    }

    /* renamed from: c */
    public void mo14632c(String str) {
        this.f14942e = str;
    }

    /* renamed from: f */
    public C5285a mo14634f() {
        return C5285a.NORMAL;
    }

    /* renamed from: k */
    public String mo14635k() {
        return this.f14940c + ":" + this.f14941d;
    }

    /* renamed from: l */
    public Map<String, String> mo14636l() {
        return Collections.emptyMap();
    }

    /* renamed from: m */
    public int mo14637m() {
        return this.f14940c;
    }

    /* renamed from: n */
    public String mo14638n() {
        return this.f14941d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public Map<String, String> mo14639o() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public String mo14640p() {
        return HTTP.UTF_8;
    }

    @Deprecated
    /* renamed from: q */
    public byte[] mo14595q() {
        Map<String, String> s = mo14641s();
        if (s == null || s.size() <= 0) {
            return null;
        }
        return m20413a(s, mo14642t());
    }

    @Deprecated
    /* renamed from: r */
    public String mo14596r() {
        return mo14594b();
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: s */
    public Map<String, String> mo14641s() {
        return mo14639o();
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: t */
    public String mo14642t() {
        return mo14640p();
    }

    public String toString() {
        String str = "0x" + Integer.toHexString(mo14646w());
        StringBuilder sb = new StringBuilder();
        sb.append(this.f14949l ? "[X] " : "[ ] ");
        sb.append(mo14647x());
        sb.append(" ");
        sb.append(str);
        sb.append(" ");
        sb.append(mo14634f());
        sb.append(" ");
        sb.append(this.f14946i);
        return sb.toString();
    }

    /* renamed from: u */
    public C5292u mo14644u() {
        return this.f14951n;
    }

    /* renamed from: v */
    public final int mo14645v() {
        return this.f14951n.mo14607a();
    }

    /* renamed from: w */
    public int mo14646w() {
        return this.f14944g;
    }

    /* renamed from: x */
    public String mo14647x() {
        String str = this.f14942e;
        return str != null ? str : this.f14941d;
    }

    /* renamed from: y */
    public boolean mo14648y() {
        return this.f14950m;
    }

    /* renamed from: z */
    public boolean mo14649z() {
        return this.f14949l;
    }
}
