package p101d.p122f.p123a.p126c;

import java.io.File;
import java.util.Map;
import p208e.p209a.p210a.p211a.C6199f;
import p208e.p209a.p210a.p211a.C6208m;
import p208e.p209a.p210a.p211a.C6211p;
import p208e.p209a.p210a.p211a.p212a.p214b.C6067a;
import p208e.p209a.p210a.p211a.p212a.p214b.C6100z;
import p208e.p209a.p210a.p211a.p212a.p218e.C6147d;
import p208e.p209a.p210a.p211a.p212a.p218e.C6149f;
import p208e.p209a.p210a.p211a.p212a.p218e.C6156h;

/* renamed from: d.f.a.c.M */
class C5361M extends C6067a implements C5360L {
    public C5361M(C6208m mVar, String str, String str2, C6156h hVar) {
        super(mVar, str, str2, hVar, C6147d.POST);
    }

    /* renamed from: a */
    private C6149f m20643a(C6149f fVar, C5359K k) {
        fVar.mo16200c("X-CRASHLYTICS-API-KEY", k.f15145a);
        fVar.mo16200c("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        fVar.mo16200c("X-CRASHLYTICS-API-CLIENT-VERSION", this.f16985f.mo14664q());
        for (Map.Entry<String, String> a : k.f15146b.mo14791a().entrySet()) {
            fVar.mo16192a(a);
        }
        return fVar;
    }

    /* renamed from: a */
    private C6149f m20644a(C6149f fVar, C5411ga gaVar) {
        fVar.mo16207e("report[identifier]", gaVar.mo14792b());
        if (gaVar.mo14794d().length == 1) {
            C6199f.m23420f().mo16269d("CrashlyticsCore", "Adding single file " + gaVar.getFileName() + " to report " + gaVar.mo14792b());
            fVar.mo16189a("report[file]", gaVar.getFileName(), "application/octet-stream", gaVar.mo14793c());
            return fVar;
        }
        int i = 0;
        for (File file : gaVar.mo14794d()) {
            C6199f.m23420f().mo16269d("CrashlyticsCore", "Adding file " + file.getName() + " to report " + gaVar.mo14792b());
            StringBuilder sb = new StringBuilder();
            sb.append("report[file");
            sb.append(i);
            sb.append("]");
            fVar.mo16189a(sb.toString(), file.getName(), "application/octet-stream", file);
            i++;
        }
        return fVar;
    }

    /* renamed from: a */
    public boolean mo14778a(C5359K k) {
        C6149f a = mo16040a();
        m20643a(a, k);
        m20644a(a, k.f15146b);
        C6211p f = C6199f.m23420f();
        f.mo16269d("CrashlyticsCore", "Sending report to: " + mo16042b());
        int g = a.mo16211g();
        C6211p f2 = C6199f.m23420f();
        f2.mo16269d("CrashlyticsCore", "Create report request ID: " + a.mo16203d("X-REQUEST-ID"));
        C6211p f3 = C6199f.m23420f();
        f3.mo16269d("CrashlyticsCore", "Result was: " + g);
        return C6100z.m23128a(g) == 0;
    }
}
