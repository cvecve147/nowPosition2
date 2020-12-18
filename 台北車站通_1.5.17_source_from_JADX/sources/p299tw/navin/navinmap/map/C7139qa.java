package p299tw.navin.navinmap.map;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import okhttp3.Callback;
import p267i.p268a.p269a.C6684c;
import p267i.p268a.p269a.p270a.C6667g;
import p267i.p268a.p269a.p271b.C6669a;
import p267i.p268a.p269a.p271b.C6679b;
import p267i.p268a.p269a.p271b.p272a.C6678i;
import p267i.p274b.p277b.p278a.p279a.C6705b;
import p299tw.navin.navinmap.util.C7157a;
import p299tw.navin.navinmap.util.C7173l;

/* renamed from: tw.navin.navinmap.map.qa */
class C7139qa extends C7132na {

    /* renamed from: d */
    private Bundle f19707d;

    /* renamed from: e */
    private final int f19708e = 0;

    /* renamed from: f */
    private final int f19709f = 1;

    /* renamed from: g */
    private int f19710g = 0;

    /* renamed from: h */
    private Handler f19711h = new C7134oa(this);

    C7139qa(Activity activity) {
        super(activity);
    }

    /* renamed from: b */
    private void m26857b(String str) {
        if (C7173l.m26999a((Context) this.f19697a)) {
            C6679b a = C6679b.m25387a((Callback) new C6678i(this.f19697a, new C6669a(this.f19711h, C6684c.request_user_trace_success, C6684c.request_user_trace_failed)), str, this.f19707d);
            this.f19707d = a.mo17161b();
            a.mo17157a();
            return;
        }
        m26860d();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m26858c() {
        C6667g.m25371i(this.f19697a, C7173l.m26992a());
        m26860d();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m26859c(C6705b.C6706a aVar) {
        if (!mo21218a(aVar)) {
            C7157a.m26966b("UT - Token Expired");
            return;
        }
        C7157a.m26966b("UT - Failed");
        m26860d();
    }

    /* renamed from: d */
    private void m26860d() {
        this.f19707d = null;
        this.f19710g = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21217a(String str) {
        m26857b(str);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo21234a(java.lang.String r6, p299tw.navin.navinmap.map.C7112l.C7119g r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f19710g     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r5)
            return
        L_0x0007:
            android.app.Activity r0 = r5.f19697a     // Catch:{ all -> 0x0042 }
            boolean r0 = p299tw.navin.navinmap.util.C7173l.m26999a((android.content.Context) r0)     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0040
            r0 = 1
            r5.f19710g = r0     // Catch:{ all -> 0x0042 }
            i.a.a.b.d r0 = r5.f19698b     // Catch:{ all -> 0x0042 }
            android.app.Activity r1 = r5.f19697a     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = r0.mo17125a((android.app.Activity) r1)     // Catch:{ all -> 0x0042 }
            i.a.a.b.a r1 = new i.a.a.b.a     // Catch:{ all -> 0x0042 }
            android.os.Handler r2 = r5.f19711h     // Catch:{ all -> 0x0042 }
            int r3 = p267i.p268a.p269a.C6684c.request_user_trace_success     // Catch:{ all -> 0x0042 }
            int r4 = p267i.p268a.p269a.C6684c.request_user_trace_failed     // Catch:{ all -> 0x0042 }
            r1.<init>(r2, r3, r4)     // Catch:{ all -> 0x0042 }
            i.a.a.b.a.i r2 = new i.a.a.b.a.i     // Catch:{ all -> 0x0042 }
            android.app.Activity r3 = r5.f19697a     // Catch:{ all -> 0x0042 }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x0042 }
            i.a.a.b.b r6 = p267i.p268a.p269a.p271b.C6679b.m25390a((okhttp3.Callback) r2, (java.lang.String) r0, (java.lang.String) r6, (p299tw.navin.navinmap.map.C7112l.C7119g) r7)     // Catch:{ all -> 0x0042 }
            android.os.Bundle r7 = r6.mo17161b()     // Catch:{ all -> 0x0042 }
            r5.f19707d = r7     // Catch:{ all -> 0x0042 }
            android.app.Activity r7 = r5.f19697a     // Catch:{ all -> 0x0042 }
            tw.navin.navinmap.map.pa r0 = new tw.navin.navinmap.map.pa     // Catch:{ all -> 0x0042 }
            r0.<init>(r5, r6)     // Catch:{ all -> 0x0042 }
            r7.runOnUiThread(r0)     // Catch:{ all -> 0x0042 }
        L_0x0040:
            monitor-exit(r5)
            return
        L_0x0042:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p299tw.navin.navinmap.map.C7139qa.mo21234a(java.lang.String, tw.navin.navinmap.map.l$g):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo21219b() {
        super.mo21219b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo21220b(C6705b.C6706a aVar) {
        C7157a.m26966b("UT - Refresh Token Failed");
        m26860d();
    }
}
