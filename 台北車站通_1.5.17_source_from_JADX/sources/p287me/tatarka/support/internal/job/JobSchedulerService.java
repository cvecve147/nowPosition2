package p287me.tatarka.support.internal.job;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import p287me.tatarka.support.internal.receivers.C6803c;
import p287me.tatarka.support.internal.receivers.IdleReceiver;
import p287me.tatarka.support.internal.receivers.TimeReceiver;
import p287me.tatarka.support.job.C6809b;
import p287me.tatarka.support.job.JobParameters;

/* renamed from: me.tatarka.support.internal.job.JobSchedulerService */
public class JobSchedulerService extends Service {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public SparseArray<C6793a> f18859a = new SparseArray<>();

    /* renamed from: b */
    private final Handler f18860b = new C6794a(this, Looper.getMainLooper());

    /* renamed from: me.tatarka.support.internal.job.JobSchedulerService$a */
    private class C6793a implements ServiceConnection {

        /* renamed from: a */
        C6803c f18861a;

        /* renamed from: b */
        JobParameters f18862b;

        /* renamed from: c */
        C6809b f18863c;

        /* renamed from: d */
        boolean f18864d = true;

        C6793a(C6803c cVar) {
            this.f18861a = cVar;
            this.f18862b = new JobParameters(new C6795b(this, JobSchedulerService.this, cVar), cVar.mo17402d(), cVar.mo17400b(), !cVar.mo17412n());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17365a(boolean z) {
            C6809b bVar = this.f18863c;
            if (bVar != null) {
                this.f18864d = z;
                try {
                    bVar.mo17451a(this.f18862b);
                } catch (Exception e) {
                    Log.e("JobServiceSchedulerService", "Error while stopping job: " + this.f18861a.mo17402d());
                    throw new RuntimeException(e);
                }
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.f18863c = (C6809b) iBinder;
            try {
                this.f18863c.mo17452b(this.f18862b);
            } catch (Exception e) {
                Log.e("JobServiceSchedulerService", "Error while starting job: " + this.f18861a.mo17401c());
                throw new RuntimeException(e);
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            JobSchedulerService.this.f18859a.remove(this.f18861a.mo17402d());
            this.f18863c = null;
            this.f18862b = null;
            JobSchedulerService.this.m25758c();
        }
    }

    /* renamed from: a */
    private C6803c m25740a(C6803c cVar) {
        if (cVar.mo17409k()) {
            return cVar;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long d = cVar.mo17401c().mo17422d();
        int f = cVar.mo17404f() + 1;
        return new C6803c(cVar, elapsedRealtime + Math.min(cVar.mo17401c().mo17419a() != 0 ? (long) Math.scalb((float) d, f - 1) : d * ((long) f), 18000000), Long.MAX_VALUE, f);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25741a() {
        int size = this.f18859a.size();
        for (int i = 0; i < size; i++) {
            C6793a aVar = this.f18859a.get(this.f18859a.keyAt(i));
            if (!aVar.f18861a.mo17412n()) {
                aVar.mo17365a(true);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25742a(int i) {
        C6803c a;
        if (this.f18859a.get(i) == null) {
            C6797d a2 = C6797d.m25778a((Context) this);
            synchronized (a2) {
                a = a2.mo17374a(i);
            }
            if (a != null) {
                Intent intent = new Intent();
                intent.setComponent(a.mo17401c().mo17428i());
                int i2 = 1;
                if (Build.VERSION.SDK_INT >= 14) {
                    i2 = 33;
                }
                C6793a aVar = new C6793a(a);
                this.f18859a.put(a.mo17402d(), aVar);
                bindService(intent, aVar, i2);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25743a(int i, C6793a aVar) {
        if (this.f18859a.get(i) != null) {
            unbindService(aVar);
        }
        this.f18859a.remove(i);
        C6797d a = C6797d.m25778a((Context) this);
        synchronized (a) {
            a.mo17378b(aVar.f18861a);
        }
    }

    /* renamed from: a */
    static void m25744a(Context context) {
        context.startService(new Intent(context, JobSchedulerService.class).putExtra("EXTRA_MSG", 3));
    }

    /* renamed from: a */
    static void m25745a(Context context, int i) {
        context.startService(new Intent(context, JobSchedulerService.class).putExtra("EXTRA_MSG", 0).putExtra("EXTRA_JOB_ID", i));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25750a(C6803c cVar, boolean z) {
        C6803c a = z ? m25740a(cVar) : m25752b(cVar);
        C6797d a2 = C6797d.m25778a((Context) this);
        synchronized (a2) {
            a2.mo17378b(cVar);
            a2.mo17376a(a);
        }
        TimeReceiver.m25825a((Context) this, a);
        if (cVar.mo17409k()) {
            IdleReceiver.m25803a((Context) this, a);
        }
    }

    /* renamed from: b */
    private C6803c m25752b(C6803c cVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long max = elapsedRealtime + Math.max(cVar.mo17403e() - elapsedRealtime, 0);
        return new C6803c(cVar, max, max + cVar.mo17401c().mo17424e(), 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m25753b() {
        int size = this.f18859a.size();
        for (int i = 0; i < size; i++) {
            this.f18859a.get(this.f18859a.keyAt(i)).mo17365a(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m25754b(int i) {
        C6793a aVar = this.f18859a.get(i);
        if (aVar != null) {
            aVar.mo17365a(false);
        }
    }

    /* renamed from: b */
    static void m25755b(Context context) {
        context.startService(new Intent(context, JobSchedulerService.class).putExtra("EXTRA_MSG", 2));
    }

    /* renamed from: b */
    static void m25756b(Context context, int i) {
        context.startService(new Intent(context, JobSchedulerService.class).putExtra("EXTRA_MSG", 1).putExtra("EXTRA_JOB_ID", i));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m25758c() {
        if (this.f18859a.size() == 0) {
            JobServiceCompat.m25769b((Context) this);
            stopSelf();
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        this.f18860b.handleMessage(Message.obtain(this.f18860b, intent.getIntExtra("EXTRA_MSG", -1), intent));
        return 2;
    }
}
