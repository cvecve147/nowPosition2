package p208e.p209a.p210a.p211a.p212a.p214b;

import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;
import p208e.p209a.p210a.p211a.C6208m;
import p208e.p209a.p210a.p211a.p212a.p218e.C6147d;
import p208e.p209a.p210a.p211a.p212a.p218e.C6149f;
import p208e.p209a.p210a.p211a.p212a.p218e.C6156h;

/* renamed from: e.a.a.a.a.b.a */
public abstract class C6067a {

    /* renamed from: a */
    private static final Pattern f16980a = Pattern.compile("http(s?)://[^\\/]+", 2);

    /* renamed from: b */
    private final String f16981b;

    /* renamed from: c */
    private final C6156h f16982c;

    /* renamed from: d */
    private final C6147d f16983d;

    /* renamed from: e */
    private final String f16984e;

    /* renamed from: f */
    protected final C6208m f16985f;

    public C6067a(C6208m mVar, String str, String str2, C6156h hVar, C6147d dVar) {
        if (str2 == null) {
            throw new IllegalArgumentException("url must not be null.");
        } else if (hVar != null) {
            this.f16985f = mVar;
            this.f16984e = str;
            this.f16981b = m22994a(str2);
            this.f16982c = hVar;
            this.f16983d = dVar;
        } else {
            throw new IllegalArgumentException("requestFactory must not be null.");
        }
    }

    /* renamed from: a */
    private String m22994a(String str) {
        return !C6080l.m23051b(this.f16984e) ? f16980a.matcher(str).replaceFirst(this.f16984e) : str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C6149f mo16040a() {
        return mo16041a((Map<String, String>) Collections.emptyMap());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C6149f mo16041a(Map<String, String> map) {
        C6149f a = this.f16982c.mo16179a(this.f16983d, mo16042b(), map);
        a.mo16193a(false);
        a.mo16183a(10000);
        a.mo16200c("User-Agent", "Crashlytics Android SDK/" + this.f16985f.mo14664q());
        a.mo16200c("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo16042b() {
        return this.f16981b;
    }
}
