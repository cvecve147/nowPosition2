package p208e.p209a.p210a.p211a.p212a.p214b;

import android.content.Context;
import p208e.p209a.p210a.p211a.C6199f;
import p208e.p209a.p210a.p211a.p212a.p213a.C6062b;
import p208e.p209a.p210a.p211a.p212a.p213a.C6064d;

/* renamed from: e.a.a.a.a.b.w */
public class C6094w {

    /* renamed from: a */
    private final C6064d<String> f17052a = new C6093v(this);

    /* renamed from: b */
    private final C6062b<String> f17053b = new C6062b<>();

    /* renamed from: a */
    public String mo16084a(Context context) {
        try {
            String a = this.f17053b.mo16035a(context, this.f17052a);
            if ("".equals(a)) {
                return null;
            }
            return a;
        } catch (Exception e) {
            C6199f.m23420f().mo16266b("Fabric", "Failed to determine installer package name", e);
            return null;
        }
    }
}
