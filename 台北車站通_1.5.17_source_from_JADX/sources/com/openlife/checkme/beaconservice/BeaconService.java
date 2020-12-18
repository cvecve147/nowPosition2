package com.openlife.checkme.beaconservice;

import android.app.ActivityManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.os.Build;
import android.os.IBinder;
import android.support.p007v4.app.C0297Y;
import android.support.p007v4.app.C0332ha;
import com.openlife.checkme.net.model.BeaconData;
import com.openlife.checkme.net.model.BeaconNotificationData;
import com.openlife.checkme.net.model.Execution;
import com.openlife.checkme.net.model.Sensor;
import com.openlife.checkme.p093c.C4886p;
import com.openlife.checkme.p094d.C4947j;
import java.io.Serializable;
import java.util.ArrayList;
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

public class BeaconService extends Service implements C4858n {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public List<String> f13882a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C4886p f13883b;

    /* renamed from: c */
    C6247e<BeaconData> f13884c;

    /* renamed from: d */
    C6412f<BeaconData> f13885d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Execution f13886e = new Execution();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C4862r f13887f;

    /* renamed from: g */
    private C6413a f13888g;

    /* renamed from: h */
    private C4947j f13889h = C4947j.m19536a();

    /* renamed from: i */
    private String f13890i = "SDK";

    /* renamed from: j */
    private int f13891j;

    /* renamed from: k */
    private int f13892k;

    /* renamed from: l */
    private String f13893l;

    /* renamed from: com.openlife.checkme.beaconservice.BeaconService$a */
    public enum C4838a {
        AUTH_SERVICE,
        NORMAL_SERVICE
    }

    /* renamed from: a */
    private C6247e<BeaconData> m19062a() {
        this.f13884c = C6247e.m23537a(new C4855k(this), C6213a.LATEST);
        return this.f13884c;
    }

    /* renamed from: b */
    private boolean m19066b() {
        BluetoothAdapter a = mo13330a(getBaseContext());
        return a != null && a.isEnabled();
    }

    /* renamed from: b */
    private boolean m19067b(Context context) {
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

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m19070e(List<String> list) {
        this.f13884c.mo16346a(new C4854j(this, list)).mo16353b(C6418a.m23996b()).mo16347a(C6216b.m23500a()).mo16351b(new C4853i(this));
    }

    /* renamed from: f */
    private void m19071f(List<BeaconNotificationData> list) {
        this.f13889h.mo13555f().mo13509a(list);
    }

    /* renamed from: g */
    private BeaconNotificationData m19072g(List<BeaconNotificationData> list) {
        List<BeaconNotificationData> d = this.f13889h.mo13555f().mo13515d();
        List<BeaconNotificationData> f = this.f13889h.mo13555f().mo13517f();
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
    public BluetoothAdapter mo13330a(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i <= 17) {
            return BluetoothAdapter.getDefaultAdapter();
        }
        if (i >= 18) {
            return ((BluetoothManager) context.getSystemService("bluetooth")).getAdapter();
        }
        return null;
    }

    /* renamed from: a */
    public void mo13316a(int i, int i2, int i3) {
        this.f13891j = i;
        this.f13892k = i2;
        this.f13893l = getString(i3);
    }

    /* renamed from: a */
    public void mo13331a(BeaconNotificationData beaconNotificationData, List<BeaconNotificationData> list) {
        int nextInt = new Random().nextInt();
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (Build.VERSION.SDK_INT >= 26) {
            notificationManager.createNotificationChannel(new NotificationChannel(this.f13890i, "SDK", 4));
        }
        new Intent();
        try {
            Intent intent = new Intent(getApplicationContext(), Class.forName(this.f13889h.mo13554e().mo13539g()));
            intent.setFlags(603979776);
            intent.putExtra("beaconAD", (Serializable) list);
            PendingIntent activity = PendingIntent.getActivity(this, nextInt, intent, 134217728);
            C0297Y.C0301d dVar = new C0297Y.C0301d(getApplicationContext(), this.f13890i);
            dVar.mo1214c((CharSequence) this.f13893l);
            dVar.mo1199a(activity);
            dVar.mo1221f(this.f13892k);
            dVar.mo1200a(BitmapFactory.decodeResource(getApplication().getResources(), this.f13891j));
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
            this.f13887f.mo13373b(list);
        }
    }

    /* renamed from: b */
    public void mo13320b(List<BeaconNotificationData> list) {
        this.f13887f.mo13374c(list);
    }

    /* renamed from: c */
    public void mo13321c(List<BeaconNotificationData> list) {
        if (!list.isEmpty()) {
            mo13332d(list);
        }
    }

    /* renamed from: d */
    public void mo13332d(List<BeaconNotificationData> list) {
        if (m19067b(getBaseContext())) {
            Intent intent = new Intent("SERVICE_EVENT");
            intent.putExtra("SERVICE_INTENT_NAME", (Serializable) list);
            C1020d.m5430a(getBaseContext()).mo5020a(intent);
            return;
        }
        BeaconNotificationData g = m19072g(list);
        if (g != null) {
            m19071f(new C4856l(this, g));
            mo13331a(g, list);
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        this.f13887f = new C4862r(this, new C4859o());
        this.f13887f.mo13372b();
    }

    public void onDestroy() {
        C6413a aVar = this.f13888g;
        if (aVar != null) {
            aVar.mo15709a();
        }
        C4886p pVar = this.f13883b;
        if (pVar != null) {
            pVar.mo13409c();
            this.f13883b.mo13405a((C4886p.C4887a) null);
        }
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        this.f13887f.mo13370a();
        this.f13882a = intent.getStringArrayListExtra("EXTRA_BEACON_LIST");
        List<String> list = this.f13882a;
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f13882a = list;
        if (this.f13882a.isEmpty() || !m19066b()) {
            return 3;
        }
        this.f13883b = new C4886p();
        this.f13883b.mo13407a(mo13330a(getBaseContext()));
        if (this.f13884c == null) {
            this.f13884c = m19062a();
        }
        this.f13883b.mo13405a((C4886p.C4887a) new C4851g(this));
        if (this.f13883b.mo13406a()) {
            return 3;
        }
        this.f13888g = new C4852h(this);
        C6433l.m24012a(0, 12, TimeUnit.SECONDS).mo16545b(C6418a.m23997c()).mo16540a(C6216b.m23500a()).mo16542a(this.f13888g);
        return 3;
    }
}
