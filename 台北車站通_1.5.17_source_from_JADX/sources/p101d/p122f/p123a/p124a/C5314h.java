package p101d.p122f.p123a.p124a;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import p101d.p122f.p123a.p124a.C5301B;
import p208e.p209a.p210a.p211a.C6199f;
import p208e.p209a.p210a.p211a.C6208m;
import p208e.p209a.p210a.p211a.p212a.p217d.C6138e;
import p208e.p209a.p210a.p211a.p212a.p218e.C6156h;
import p208e.p209a.p210a.p211a.p212a.p220g.C6167b;

/* renamed from: d.f.a.a.h */
class C5314h implements C6138e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C6208m f15041a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f15042b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C5315i f15043c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C5306E f15044d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C6156h f15045e;

    /* renamed from: f */
    final ScheduledExecutorService f15046f;

    /* renamed from: g */
    C5333z f15047g = new C5322o();

    public C5314h(C6208m mVar, Context context, C5315i iVar, C5306E e, C6156h hVar, ScheduledExecutorService scheduledExecutorService) {
        this.f15041a = mVar;
        this.f15042b = context;
        this.f15043c = iVar;
        this.f15044d = e;
        this.f15045e = hVar;
        this.f15046f = scheduledExecutorService;
    }

    /* renamed from: a */
    private void m20502a(Runnable runnable) {
        try {
            this.f15046f.submit(runnable);
        } catch (Exception e) {
            C6199f.m23420f().mo16266b("Answers", "Failed to submit events task", e);
        }
    }

    /* renamed from: b */
    private void m20504b(Runnable runnable) {
        try {
            this.f15046f.submit(runnable).get();
        } catch (Exception e) {
            C6199f.m23420f().mo16266b("Answers", "Failed to run events task", e);
        }
    }

    /* renamed from: a */
    public void mo14683a() {
        m20502a((Runnable) new C5309c(this));
    }

    /* renamed from: a */
    public void mo14684a(C5301B.C5302a aVar) {
        mo14685a(aVar, false, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14685a(C5301B.C5302a aVar, boolean z, boolean z2) {
        C5313g gVar = new C5313g(this, aVar, z2);
        if (z) {
            m20504b((Runnable) gVar);
        } else {
            m20502a((Runnable) gVar);
        }
    }

    /* renamed from: a */
    public void mo14686a(C6167b bVar, String str) {
        m20502a((Runnable) new C5308b(this, bVar, str));
    }

    /* renamed from: a */
    public void mo14687a(String str) {
        m20502a((Runnable) new C5310d(this));
    }

    /* renamed from: b */
    public void mo14688b() {
        m20502a((Runnable) new C5311e(this));
    }

    /* renamed from: b */
    public void mo14689b(C5301B.C5302a aVar) {
        mo14685a(aVar, false, true);
    }

    /* renamed from: c */
    public void mo14690c() {
        m20502a((Runnable) new C5312f(this));
    }

    /* renamed from: c */
    public void mo14691c(C5301B.C5302a aVar) {
        mo14685a(aVar, true, false);
    }
}
