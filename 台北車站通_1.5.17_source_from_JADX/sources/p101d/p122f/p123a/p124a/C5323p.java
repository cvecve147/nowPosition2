package p101d.p122f.p123a.p124a;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p101d.p122f.p123a.p124a.C5301B;
import p208e.p209a.p210a.p211a.C6199f;
import p208e.p209a.p210a.p211a.C6208m;
import p208e.p209a.p210a.p211a.C6211p;
import p208e.p209a.p210a.p211a.p212a.p214b.C6077i;
import p208e.p209a.p210a.p211a.p212a.p214b.C6080l;
import p208e.p209a.p210a.p211a.p212a.p217d.C6140g;
import p208e.p209a.p210a.p211a.p212a.p217d.C6143j;
import p208e.p209a.p210a.p211a.p212a.p218e.C6156h;
import p208e.p209a.p210a.p211a.p212a.p220g.C6167b;

/* renamed from: d.f.a.a.p */
class C5323p implements C5333z {

    /* renamed from: a */
    private final C6208m f15061a;

    /* renamed from: b */
    private final C6156h f15062b;

    /* renamed from: c */
    private final Context f15063c;

    /* renamed from: d */
    private final C5330w f15064d;

    /* renamed from: e */
    private final ScheduledExecutorService f15065e;

    /* renamed from: f */
    private final AtomicReference<ScheduledFuture<?>> f15066f = new AtomicReference<>();

    /* renamed from: g */
    final C5304C f15067g;

    /* renamed from: h */
    C6140g f15068h;

    /* renamed from: i */
    C6077i f15069i = new C6077i();

    /* renamed from: j */
    C5324q f15070j = new C5325r();

    /* renamed from: k */
    boolean f15071k = true;

    /* renamed from: l */
    boolean f15072l = true;

    /* renamed from: m */
    volatile int f15073m = -1;

    public C5323p(C6208m mVar, Context context, ScheduledExecutorService scheduledExecutorService, C5330w wVar, C6156h hVar, C5304C c) {
        this.f15061a = mVar;
        this.f15063c = context;
        this.f15065e = scheduledExecutorService;
        this.f15064d = wVar;
        this.f15062b = hVar;
        this.f15067g = c;
    }

    /* renamed from: a */
    public void mo14709a() {
        if (this.f15068h == null) {
            C6080l.m23054c(this.f15063c, "skipping files send because we don't yet know the target endpoint");
            return;
        }
        C6080l.m23054c(this.f15063c, "Sending all files");
        List<File> d = this.f15064d.mo16166d();
        int i = 0;
        while (true) {
            try {
                if (d.size() <= 0) {
                    break;
                }
                C6080l.m23054c(this.f15063c, String.format(Locale.US, "attempt to send batch of %d files", new Object[]{Integer.valueOf(d.size())}));
                boolean a = this.f15068h.mo14702a(d);
                if (a) {
                    i += d.size();
                    this.f15064d.mo16164a(d);
                }
                if (!a) {
                    break;
                }
                d = this.f15064d.mo16166d();
            } catch (Exception e) {
                C6080l.m23040a(this.f15063c, "Failed to send batch of analytics files to server: " + e.getMessage(), (Throwable) e);
            }
        }
        if (i == 0) {
            this.f15064d.mo16165b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14715a(long j, long j2) {
        if (this.f15066f.get() == null) {
            C6143j jVar = new C6143j(this.f15063c, this);
            Context context = this.f15063c;
            C6080l.m23054c(context, "Scheduling time based file roll over every " + j2 + " seconds");
            try {
                this.f15066f.set(this.f15065e.scheduleAtFixedRate(jVar, j, j2, TimeUnit.SECONDS));
            } catch (RejectedExecutionException e) {
                C6080l.m23040a(this.f15063c, "Failed to schedule time based file roll over", (Throwable) e);
            }
        }
    }

    /* renamed from: a */
    public void mo14710a(C5301B.C5302a aVar) {
        C6211p f;
        StringBuilder sb;
        String str;
        C5301B a = aVar.mo14667a(this.f15067g);
        if (!this.f15071k && C5301B.C5303b.CUSTOM.equals(a.f14990c)) {
            f = C6199f.m23420f();
            sb = new StringBuilder();
            str = "Custom events tracking disabled - skipping event: ";
        } else if (!this.f15072l && C5301B.C5303b.PREDEFINED.equals(a.f14990c)) {
            f = C6199f.m23420f();
            sb = new StringBuilder();
            str = "Predefined events tracking disabled - skipping event: ";
        } else if (this.f15070j.mo14717a(a)) {
            f = C6199f.m23420f();
            sb = new StringBuilder();
            str = "Skipping filtered event: ";
        } else {
            try {
                this.f15064d.mo16163a(a);
            } catch (IOException e) {
                C6211p f2 = C6199f.m23420f();
                f2.mo16266b("Answers", "Failed to write event: " + a, e);
            }
            mo14716e();
            return;
        }
        sb.append(str);
        sb.append(a);
        f.mo16269d("Answers", sb.toString());
    }

    /* renamed from: a */
    public void mo14711a(C6167b bVar, String str) {
        this.f15068h = C5318l.m20528a(new C5331x(this.f15061a, str, bVar.f17185a, this.f15062b, this.f15069i.mo16060c(this.f15063c)));
        this.f15064d.mo14723a(bVar);
        this.f15071k = bVar.f17190f;
        C6211p f = C6199f.m23420f();
        StringBuilder sb = new StringBuilder();
        sb.append("Custom event tracking ");
        String str2 = "enabled";
        sb.append(this.f15071k ? str2 : "disabled");
        f.mo16269d("Answers", sb.toString());
        this.f15072l = bVar.f17191g;
        C6211p f2 = C6199f.m23420f();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Predefined event tracking ");
        if (!this.f15072l) {
            str2 = "disabled";
        }
        sb2.append(str2);
        f2.mo16269d("Answers", sb2.toString());
        if (bVar.f17193i > 1) {
            C6199f.m23420f().mo16269d("Answers", "Event sampling enabled");
            this.f15070j = new C5329v(bVar.f17193i);
        }
        this.f15073m = bVar.f17186b;
        mo14715a(0, (long) this.f15073m);
    }

    /* renamed from: b */
    public boolean mo14712b() {
        try {
            return this.f15064d.mo16167g();
        } catch (IOException e) {
            C6080l.m23040a(this.f15063c, "Failed to roll file over.", (Throwable) e);
            return false;
        }
    }

    /* renamed from: c */
    public void mo14713c() {
        if (this.f15066f.get() != null) {
            C6080l.m23054c(this.f15063c, "Cancelling time-based rollover because no events are currently being generated.");
            this.f15066f.get().cancel(false);
            this.f15066f.set((Object) null);
        }
    }

    /* renamed from: d */
    public void mo14714d() {
        this.f15064d.mo16161a();
    }

    /* renamed from: e */
    public void mo14716e() {
        if (this.f15073m != -1) {
            mo14715a((long) this.f15073m, (long) this.f15073m);
        }
    }
}
