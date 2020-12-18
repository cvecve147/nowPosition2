package p101d.p122f.p123a.p124a;

import java.io.File;
import java.util.List;
import p208e.p209a.p210a.p211a.C6199f;
import p208e.p209a.p210a.p211a.C6208m;
import p208e.p209a.p210a.p211a.p212a.p214b.C6067a;
import p208e.p209a.p210a.p211a.p212a.p214b.C6100z;
import p208e.p209a.p210a.p211a.p212a.p217d.C6140g;
import p208e.p209a.p210a.p211a.p212a.p218e.C6147d;
import p208e.p209a.p210a.p211a.p212a.p218e.C6149f;
import p208e.p209a.p210a.p211a.p212a.p218e.C6156h;

/* renamed from: d.f.a.a.x */
class C5331x extends C6067a implements C6140g {

    /* renamed from: g */
    private final String f15082g;

    public C5331x(C6208m mVar, String str, String str2, C6156h hVar, String str3) {
        super(mVar, str, str2, hVar, C6147d.POST);
        this.f15082g = str3;
    }

    /* renamed from: a */
    public boolean mo14702a(List<File> list) {
        C6149f a = mo16040a();
        a.mo16200c("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        a.mo16200c("X-CRASHLYTICS-API-CLIENT-VERSION", this.f16985f.mo14664q());
        a.mo16200c("X-CRASHLYTICS-API-KEY", this.f15082g);
        int i = 0;
        for (File next : list) {
            a.mo16189a("session_analytics_file_" + i, next.getName(), "application/vnd.crashlytics.android.events", next);
            i++;
        }
        C6199f.m23420f().mo16269d("Answers", "Sending " + list.size() + " analytics files to " + mo16042b());
        int g = a.mo16211g();
        C6199f.m23420f().mo16269d("Answers", "Response code for analytics file send is " + g);
        return C6100z.m23128a(g) == 0;
    }
}
