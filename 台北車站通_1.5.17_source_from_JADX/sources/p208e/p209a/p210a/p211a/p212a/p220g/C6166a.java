package p208e.p209a.p210a.p211a.p212a.p220g;

import android.content.res.Resources;
import java.io.Closeable;
import java.io.InputStream;
import java.util.Collection;
import java.util.Locale;
import org.apache.http.client.methods.HttpPost;
import p208e.p209a.p210a.p211a.C6199f;
import p208e.p209a.p210a.p211a.C6208m;
import p208e.p209a.p210a.p211a.C6210o;
import p208e.p209a.p210a.p211a.C6211p;
import p208e.p209a.p210a.p211a.p212a.p214b.C6067a;
import p208e.p209a.p210a.p211a.p212a.p214b.C6080l;
import p208e.p209a.p210a.p211a.p212a.p214b.C6100z;
import p208e.p209a.p210a.p211a.p212a.p218e.C6147d;
import p208e.p209a.p210a.p211a.p212a.p218e.C6149f;
import p208e.p209a.p210a.p211a.p212a.p218e.C6156h;

/* renamed from: e.a.a.a.a.g.a */
abstract class C6166a extends C6067a implements C6171f {
    public C6166a(C6208m mVar, String str, String str2, C6156h hVar, C6147d dVar) {
        super(mVar, str, str2, hVar, dVar);
    }

    /* renamed from: a */
    private C6149f m23332a(C6149f fVar, C6169d dVar) {
        fVar.mo16200c("X-CRASHLYTICS-API-KEY", dVar.f17197a);
        fVar.mo16200c("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        fVar.mo16200c("X-CRASHLYTICS-API-CLIENT-VERSION", this.f16985f.mo14664q());
        return fVar;
    }

    /* renamed from: b */
    private C6149f m23333b(C6149f fVar, C6169d dVar) {
        fVar.mo16207e("app[identifier]", dVar.f17198b);
        fVar.mo16207e("app[name]", dVar.f17202f);
        fVar.mo16207e("app[display_version]", dVar.f17199c);
        fVar.mo16207e("app[build_version]", dVar.f17200d);
        fVar.mo16185a("app[source]", (Number) Integer.valueOf(dVar.f17203g));
        fVar.mo16207e("app[minimum_sdk_version]", dVar.f17204h);
        fVar.mo16207e("app[built_sdk_version]", dVar.f17205i);
        if (!C6080l.m23051b(dVar.f17201e)) {
            fVar.mo16207e("app[instance_identifier]", dVar.f17201e);
        }
        if (dVar.f17206j != null) {
            InputStream inputStream = null;
            try {
                inputStream = this.f16985f.mo16305k().getResources().openRawResource(dVar.f17206j.f17229b);
                fVar.mo16207e("app[icon][hash]", dVar.f17206j.f17228a);
                fVar.mo16190a("app[icon][data]", "icon.png", "application/octet-stream", inputStream);
                fVar.mo16185a("app[icon][width]", (Number) Integer.valueOf(dVar.f17206j.f17230c));
                fVar.mo16185a("app[icon][height]", (Number) Integer.valueOf(dVar.f17206j.f17231d));
            } catch (Resources.NotFoundException e) {
                C6211p f = C6199f.m23420f();
                f.mo16266b("Fabric", "Failed to find app icon with resource ID: " + dVar.f17206j.f17229b, e);
            } catch (Throwable th) {
                C6080l.m23042a((Closeable) inputStream, "Failed to close app icon InputStream.");
                throw th;
            }
            C6080l.m23042a((Closeable) inputStream, "Failed to close app icon InputStream.");
        }
        Collection<C6210o> collection = dVar.f17207k;
        if (collection != null) {
            for (C6210o next : collection) {
                fVar.mo16207e(mo16240b(next), next.mo16314c());
                fVar.mo16207e(mo16239a(next), next.mo16312a());
            }
        }
        return fVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo16239a(C6210o oVar) {
        return String.format(Locale.US, "app[build][libraries][%s][type]", new Object[]{oVar.mo16313b()});
    }

    /* renamed from: a */
    public boolean mo16238a(C6169d dVar) {
        C6149f a = mo16040a();
        m23332a(a, dVar);
        m23333b(a, dVar);
        C6211p f = C6199f.m23420f();
        f.mo16269d("Fabric", "Sending app info to " + mo16042b());
        if (dVar.f17206j != null) {
            C6211p f2 = C6199f.m23420f();
            f2.mo16269d("Fabric", "App icon hash is " + dVar.f17206j.f17228a);
            C6211p f3 = C6199f.m23420f();
            f3.mo16269d("Fabric", "App icon size is " + dVar.f17206j.f17230c + "x" + dVar.f17206j.f17231d);
        }
        int g = a.mo16211g();
        String str = HttpPost.METHOD_NAME.equals(a.mo16215k()) ? "Create" : "Update";
        C6211p f4 = C6199f.m23420f();
        f4.mo16269d("Fabric", str + " app request ID: " + a.mo16203d("X-REQUEST-ID"));
        C6211p f5 = C6199f.m23420f();
        f5.mo16269d("Fabric", "Result was " + g);
        return C6100z.m23128a(g) == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo16240b(C6210o oVar) {
        return String.format(Locale.US, "app[build][libraries][%s][version]", new Object[]{oVar.mo16313b()});
    }
}
