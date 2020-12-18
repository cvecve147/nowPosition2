package p287me.tatarka.support.internal.job;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import java.util.ArrayList;
import p013b.p018b.p028h.p029a.C1024f;
import p245f.p246a.p247a.p248a.p249a.C6448b;
import p287me.tatarka.support.internal.receivers.BootReceiver;
import p287me.tatarka.support.internal.receivers.C6801b;
import p287me.tatarka.support.internal.receivers.C6803c;
import p287me.tatarka.support.internal.receivers.C6804d;
import p287me.tatarka.support.internal.receivers.IdleReceiver;
import p287me.tatarka.support.internal.receivers.NetworkReceiver;
import p287me.tatarka.support.internal.receivers.PowerReceiver;
import p287me.tatarka.support.internal.receivers.TimeReceiver;
import p287me.tatarka.support.job.JobInfo;

/* renamed from: me.tatarka.support.internal.job.JobServiceCompat */
public class JobServiceCompat extends IntentService {

    /* renamed from: a */
    private static PowerManager.WakeLock f18866a;

    public JobServiceCompat() {
        super("JobServiceCompat");
    }

    /* renamed from: a */
    public static Intent m25762a(Context context) {
        return new Intent(context, JobServiceCompat.class).putExtra("EXTRA_MSG", 5);
    }

    /* renamed from: a */
    private void m25763a() {
        C6801b.m25830a(this).mo17387a();
        C6797d a = C6797d.m25778a((Context) this);
        synchronized (a) {
            C6448b<C6803c> b = a.mo17377b();
            for (int i = 0; i < b.size(); i++) {
                m25765a(b.mo16567e(i));
            }
        }
    }

    /* renamed from: a */
    private void m25764a(int i) {
        m25768b(i);
        C6797d a = C6797d.m25778a((Context) this);
        synchronized (a) {
            a.mo17378b(a.mo17374a(i));
        }
        JobSchedulerService.m25756b((Context) this, i);
    }

    /* renamed from: a */
    private void m25765a(C6803c cVar) {
        if (cVar.mo17407i() || cVar.mo17411m()) {
            NetworkReceiver.m25809a((Context) this, cVar);
            C6804d.m25862b(this, NetworkReceiver.class);
        }
        if (cVar.mo17406h()) {
            PowerReceiver.m25813a((Context) this, cVar);
            C6804d.m25862b(this, PowerReceiver.class);
        }
        if (cVar.mo17409k()) {
            IdleReceiver.m25803a((Context) this, cVar);
        }
        if (cVar.mo17413o()) {
            C6804d.m25862b(this, BootReceiver.class);
        }
        TimeReceiver.m25825a((Context) this, cVar);
    }

    /* renamed from: a */
    private void m25766a(JobInfo jobInfo) {
        C6803c cVar = new C6803c(jobInfo);
        C6797d a = C6797d.m25778a((Context) this);
        synchronized (a) {
            a.mo17378b(a.mo17374a(jobInfo.mo17421c()));
            a.mo17376a(cVar);
        }
        m25765a(cVar);
    }

    /* renamed from: b */
    private void m25767b() {
        C6797d a = C6797d.m25778a((Context) this);
        synchronized (a) {
            C6448b<C6803c> b = a.mo17377b();
            for (int i = 0; i < b.size(); i++) {
                m25768b(b.mo16567e(i).mo17402d());
            }
            a.mo17375a();
        }
        JobSchedulerService.m25755b((Context) this);
    }

    /* renamed from: b */
    private void m25768b(int i) {
        TimeReceiver.m25822a((Context) this, i);
    }

    /* renamed from: b */
    static void m25769b(Context context) {
        context.startService(new Intent(context, JobServiceCompat.class).putExtra("EXTRA_MSG", 4));
    }

    /* renamed from: c */
    public static Intent m25770c(Context context) {
        return new Intent(context, JobServiceCompat.class).putExtra("EXTRA_MSG", 3).putExtra("EXTRA_RELEASE_WAKE_LOCK", true);
    }

    /* renamed from: c */
    private void m25771c() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C6797d a = C6797d.m25778a((Context) this);
        synchronized (a) {
            C6448b<C6803c> b = a.mo17377b();
            int i = 0;
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
            while (true) {
                if (i >= b.size()) {
                    break;
                }
                C6803c e = b.mo16567e(i);
                if (e.mo17407i() || e.mo17411m()) {
                    z = true;
                }
                if (e.mo17406h()) {
                    z2 = true;
                }
                if (e.mo17409k()) {
                    z4 = true;
                }
                if (e.mo17413o()) {
                    z3 = true;
                }
                if (z && z2 && z3 && z4) {
                    break;
                }
                i++;
            }
        }
        if (!z) {
            C6804d.m25861a(this, NetworkReceiver.class);
        }
        if (!z2) {
            C6804d.m25861a(this, PowerReceiver.class);
        }
        if (!z4) {
            IdleReceiver.m25805b(this);
        }
        if (!z3) {
            C6804d.m25861a(this, BootReceiver.class);
        }
        if (f18866a.isHeld()) {
            f18866a.release();
        }
    }

    /* renamed from: d */
    private void m25772d() {
        boolean isEmpty;
        JobSchedulerService.m25744a((Context) this);
        C6797d a = C6797d.m25778a((Context) this);
        ArrayList<Integer> arrayList = new ArrayList<>();
        synchronized (a) {
            C6448b<C6803c> b = a.mo17377b();
            for (int i = 0; i < b.size(); i++) {
                C6803c e = b.mo16567e(i);
                if (e.mo17414p()) {
                    arrayList.add(Integer.valueOf(e.mo17402d()));
                }
            }
            isEmpty = b.isEmpty();
        }
        if (!arrayList.isEmpty()) {
            f18866a.acquire();
            for (Integer intValue : arrayList) {
                JobSchedulerService.m25745a((Context) this, intValue.intValue());
            }
        }
        if (isEmpty) {
            m25771c();
        }
    }

    public void onCreate() {
        super.onCreate();
        PowerManager powerManager = (PowerManager) getSystemService("power");
        if (f18866a == null) {
            f18866a = powerManager.newWakeLock(1, "JobServiceCompat");
        }
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        int intExtra = intent.getIntExtra("EXTRA_MSG", -1);
        if (intExtra == 0) {
            m25766a((JobInfo) intent.getParcelableExtra("EXTRA_JOB"));
        } else if (intExtra == 1) {
            m25764a(intent.getIntExtra("EXTRA_JOB_ID", 0));
        } else if (intExtra == 2) {
            m25767b();
        } else if (intExtra != 3) {
            if (intExtra != 4) {
                if (intExtra == 5) {
                    m25763a();
                } else {
                    return;
                }
            }
            m25771c();
        } else {
            m25772d();
            if (intent.getBooleanExtra("EXTRA_RELEASE_WAKE_LOCK", false)) {
                C1024f.m5439a(intent);
            }
        }
    }
}
