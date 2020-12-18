package com.onesignal;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.List;
import p013b.p018b.p021c.C0935a;
import p013b.p018b.p021c.C0942h;
import p013b.p018b.p021c.C0944j;
import p013b.p018b.p021c.C0947l;
import p013b.p018b.p021c.C0948m;

/* renamed from: com.onesignal.ab */
class C4339ab {

    /* renamed from: com.onesignal.ab$a */
    private static class C4340a extends C0947l {

        /* renamed from: a */
        private String f12850a;

        /* renamed from: b */
        private boolean f12851b;

        C4340a(String str, boolean z) {
            this.f12850a = str;
            this.f12851b = z;
        }

        /* renamed from: a */
        public void mo4840a(ComponentName componentName, C0942h hVar) {
            if (hVar != null) {
                hVar.mo4837a(0);
                C0948m a = hVar.mo4836a((C0935a) null);
                if (a != null) {
                    Uri parse = Uri.parse(this.f12850a);
                    a.mo4843a(parse, (Bundle) null, (List<Bundle>) null);
                    if (this.f12851b) {
                        C0944j a2 = new C0944j.C0945a(a).mo4839a();
                        a2.f3765a.setData(parse);
                        a2.f3765a.addFlags(268435456);
                        if (Build.VERSION.SDK_INT >= 16) {
                            C4306Xa.f12759e.startActivity(a2.f3765a, a2.f3766b);
                        } else {
                            C4306Xa.f12759e.startActivity(a2.f3765a);
                        }
                    }
                }
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: a */
    private static boolean m17286a() {
        return true;
    }

    /* renamed from: a */
    protected static boolean m17287a(String str, boolean z) {
        if (!m17286a()) {
            return false;
        }
        return C0942h.m5239a(C4306Xa.f12759e, "com.android.chrome", new C4340a(str, z));
    }
}
