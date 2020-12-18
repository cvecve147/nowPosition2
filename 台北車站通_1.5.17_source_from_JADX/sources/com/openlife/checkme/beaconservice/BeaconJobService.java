package com.openlife.checkme.beaconservice;

import android.app.ActivityManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.os.Build;
import android.os.PersistableBundle;
import android.support.p007v4.app.C0297Y;
import android.support.p007v4.app.C0332ha;
import android.util.Log;
import com.openlife.checkme.net.model.BeaconData;
import com.openlife.checkme.net.model.BeaconNotificationData;
import com.openlife.checkme.net.model.Execution;
import com.openlife.checkme.net.model.Sensor;
import com.openlife.checkme.p093c.C4886p;
import com.openlife.checkme.p094d.C4947j;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import p013b.p018b.p028h.p029a.C1020d;
import p208e.p221b.C6213a;
import p208e.p221b.C6247e;
import p208e.p221b.C6412f;
import p208e.p221b.C6433l;
import p208e.p221b.p222a.p224b.C6216b;
import p208e.p221b.p241f.C6413a;
import p208e.p221b.p243h.C6418a;

public class BeaconJobService extends JobService implements C4858n {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C4886p f13867a;

    /* renamed from: b */
    C6247e<BeaconData> f13868b;

    /* renamed from: c */
    C6412f<BeaconData> f13869c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Execution f13870d = new Execution();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C4862r f13871e;

    /* renamed from: f */
    private C6413a f13872f;

    /* renamed from: g */
    private C4947j f13873g = C4947j.m19536a();

    /* renamed from: h */
    private String f13874h = "SDK";

    /* renamed from: i */
    boolean f13875i = false;

    /* renamed from: j */
    boolean f13876j = false;

    /* renamed from: k */
    private int f13877k;

    /* renamed from: l */
    private int f13878l;

    /* renamed from: m */
    private String f13879m;

    /* renamed from: a */
    private C6247e<BeaconData> m19040a() {
        this.f13868b = C6247e.m23537a(new C4849e(this), C6213a.LATEST);
        return this.f13868b;
    }

    /* renamed from: a */
    public static void m19041a(Context context) {
        ((JobScheduler) context.getSystemService("jobscheduler")).cancel(1);
    }

    /* renamed from: a */
    public static void m19042a(Context context, ArrayList<String> arrayList) {
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putStringArray("beacon", (String[]) arrayList.toArray(new String[arrayList.size()]));
        JobInfo.Builder builder = new JobInfo.Builder(1, new ComponentName(context, BeaconJobService.class));
        builder.setExtras(persistableBundle);
        builder.setMinimumLatency(100);
        builder.setOverrideDeadline(100);
        builder.setBackoffCriteria(TimeUnit.MINUTES.toMillis(10), 0);
        ((JobScheduler) context.getSystemService("jobscheduler")).schedule(builder.build());
    }

    /* renamed from: b */
    private boolean m19045b() {
        BluetoothAdapter b = mo13319b(getBaseContext());
        return b != null && b.isEnabled();
    }

    /* renamed from: c */
    private boolean m19047c(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.processName.equals(context.getPackageName()) && next.importance == 100) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    private void m19048e(List<String> list) {
        this.f13871e.mo13370a();
        if (!list.isEmpty() && m19045b()) {
            this.f13867a = new C4886p();
            this.f13867a.mo13407a(mo13319b(getBaseContext()));
            if (this.f13868b == null) {
                this.f13868b = m19040a();
            }
            this.f13867a.mo13405a((C4886p.C4887a) new C4839a(this, list));
            if (!this.f13867a.mo13406a()) {
                this.f13872f = new C4840b(this);
                C6433l.m24012a(0, 12, TimeUnit.SECONDS).mo16545b(C6418a.m23997c()).mo16540a(C6216b.m23500a()).mo16542a(this.f13872f);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m19049f(List<String> list) {
        this.f13868b.mo16346a(new C4842d(this, list)).mo16353b(C6418a.m23996b()).mo16347a(C6216b.m23500a()).mo16351b(new C4841c(this));
    }

    /* renamed from: g */
    private void m19050g(List<BeaconNotificationData> list) {
        this.f13873g.mo13555f().mo13509a(list);
    }

    /* renamed from: h */
    private BeaconNotificationData m19051h(List<BeaconNotificationData> list) {
        List<BeaconNotificationData> d = this.f13873g.mo13555f().mo13515d();
        List<BeaconNotificationData> f = this.f13873g.mo13555f().mo13517f();
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            BeaconNotificationData beaconNotificationData = list.get(size);
            for (int i = 0; i < d.size(); i++) {
                if (beaconNotificationData.getId() == d.get(i).getId()) {
                    list.remove(size);
                }
            }
            for (int i2 = 0; i2 < f.size(); i2++) {
                if (beaconNotificationData.getId() == f.get(i2).getId()) {
                    list.remove(size);
                }
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: a */
    public void mo13316a(int i, int i2, int i3) {
        this.f13877k = i;
        this.f13878l = i2;
        this.f13879m = getString(i3);
    }

    /* renamed from: a */
    public void mo13317a(BeaconNotificationData beaconNotificationData, List<BeaconNotificationData> list) {
        int nextInt = new Random().nextInt();
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (Build.VERSION.SDK_INT >= 26) {
            notificationManager.createNotificationChannel(new NotificationChannel(this.f13874h, "SDK", 4));
        }
        new Intent();
        try {
            Intent intent = new Intent(getApplicationContext(), Class.forName(this.f13873g.mo13554e().mo13539g()));
            intent.setFlags(603979776);
            intent.putExtra("beaconAD", (Serializable) list);
            PendingIntent activity = PendingIntent.getActivity(this, nextInt, intent, 134217728);
            C0297Y.C0301d dVar = new C0297Y.C0301d(getApplicationContext(), this.f13874h);
            dVar.mo1214c((CharSequence) this.f13879m);
            dVar.mo1199a(activity);
            dVar.mo1221f(this.f13878l);
            dVar.mo1200a(BitmapFactory.decodeResource(getApplication().getResources(), this.f13877k));
            dVar.mo1210b((CharSequence) beaconNotificationData.getMessage());
            dVar.mo1208b(6);
            dVar.mo1220e(1);
            dVar.mo1205a("promo");
            dVar.mo1222g(1);
            dVar.mo1201a(RingtoneManager.getDefaultUri(2));
            dVar.mo1206a(true);
            dVar.mo1207a(new long[]{0, 500});
            C0297Y.C0300c cVar = new C0297Y.C0300c();
            cVar.mo1193a((CharSequence) beaconNotificationData.getMessage());
            dVar.mo1203a((C0297Y.C0304g) cVar);
            C0332ha.m1462a(getApplicationContext()).mo1288a(intent);
            dVar.mo1199a(activity);
            notificationManager.notify(nextInt, dVar.mo1194a());
        } catch (ClassNotFoundException unused) {
        }
    }

    /* renamed from: a */
    public void mo13318a(List<Sensor> list) {
        if (!list.isEmpty()) {
            this.f13871e.mo13373b(list);
        }
    }

    /* renamed from: b */
    public BluetoothAdapter mo13319b(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i <= 17) {
            return BluetoothAdapter.getDefaultAdapter();
        }
        if (i >= 18) {
            return ((BluetoothManager) context.getSystemService("bluetooth")).getAdapter();
        }
        return null;
    }

    /* renamed from: b */
    public void mo13320b(List<BeaconNotificationData> list) {
        this.f13871e.mo13374c(list);
    }

    /* renamed from: c */
    public void mo13321c(List<BeaconNotificationData> list) {
        if (!list.isEmpty()) {
            mo13322d(list);
        }
    }

    /* renamed from: d */
    public void mo13322d(List<BeaconNotificationData> list) {
        if (m19047c(getBaseContext())) {
            Intent intent = new Intent("SERVICE_EVENT");
            intent.putExtra("SERVICE_INTENT_NAME", (Serializable) list);
            C1020d.m5430a(getBaseContext()).mo5020a(intent);
            return;
        }
        BeaconNotificationData h = m19051h(list);
        if (h != null) {
            m19050g(new C4850f(this, h));
            mo13317a(h, list);
        }
    }

    public void onCreate() {
        super.onCreate();
        this.f13871e = new C4862r(this, new C4859o());
        this.f13871e.mo13372b();
    }

    public void onDestroy() {
        C6413a aVar = this.f13872f;
        if (aVar != null) {
            aVar.mo15709a();
        }
        C4886p pVar = this.f13867a;
        if (pVar != null) {
            pVar.mo13409c();
            this.f13867a.mo13405a((C4886p.C4887a) null);
        }
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }

    public boolean onStartJob(JobParameters jobParameters) {
        this.f13875i = true;
        m19048e(new ArrayList(Arrays.asList(jobParameters.getExtras().getStringArray("beacon"))));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        this.f13875i = false;
        this.f13876j = true;
        boolean z = this.f13875i;
        jobFinished(jobParameters, z);
        return z;
    }

    public void onTaskRemoved(Intent intent) {
        Log.i("Tag", "onTaskRemoved");
        super.onTaskRemoved(intent);
    }
}
