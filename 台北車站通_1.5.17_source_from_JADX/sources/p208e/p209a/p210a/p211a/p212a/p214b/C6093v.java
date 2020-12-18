package p208e.p209a.p210a.p211a.p212a.p214b;

import android.content.Context;
import p208e.p209a.p210a.p211a.p212a.p213a.C6064d;

/* renamed from: e.a.a.a.a.b.v */
class C6093v implements C6064d<String> {

    /* renamed from: a */
    final /* synthetic */ C6094w f17051a;

    C6093v(C6094w wVar) {
        this.f17051a = wVar;
    }

    /* renamed from: a */
    public String m23099a(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }
}
