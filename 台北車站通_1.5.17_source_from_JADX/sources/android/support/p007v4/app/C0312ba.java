package android.support.p007v4.app;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.p007v4.app.C0290T;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: android.support.v4.app.ba */
public final class C0312ba {

    /* renamed from: a */
    private static final Object f1315a = new Object();

    /* renamed from: b */
    private static String f1316b;

    /* renamed from: c */
    private static Set<String> f1317c = new HashSet();

    /* renamed from: d */
    private static final Object f1318d = new Object();

    /* renamed from: e */
    private static C0316d f1319e;

    /* renamed from: f */
    private final Context f1320f;

    /* renamed from: g */
    private final NotificationManager f1321g = ((NotificationManager) this.f1320f.getSystemService("notification"));

    /* renamed from: android.support.v4.app.ba$a */
    private static class C0313a implements C0318e {

        /* renamed from: a */
        final String f1322a;

        /* renamed from: b */
        final int f1323b;

        /* renamed from: c */
        final String f1324c;

        /* renamed from: d */
        final boolean f1325d = false;

        C0313a(String str, int i, String str2) {
            this.f1322a = str;
            this.f1323b = i;
            this.f1324c = str2;
        }

        /* renamed from: a */
        public void mo1243a(C0290T t) {
            if (this.f1325d) {
                t.mo1178a(this.f1322a);
            } else {
                t.mo1179a(this.f1322a, this.f1323b, this.f1324c);
            }
        }

        public String toString() {
            return "CancelTask[" + "packageName:" + this.f1322a + ", id:" + this.f1323b + ", tag:" + this.f1324c + ", all:" + this.f1325d + "]";
        }
    }

    /* renamed from: android.support.v4.app.ba$b */
    private static class C0314b implements C0318e {

        /* renamed from: a */
        final String f1326a;

        /* renamed from: b */
        final int f1327b;

        /* renamed from: c */
        final String f1328c;

        /* renamed from: d */
        final Notification f1329d;

        C0314b(String str, int i, String str2, Notification notification) {
            this.f1326a = str;
            this.f1327b = i;
            this.f1328c = str2;
            this.f1329d = notification;
        }

        /* renamed from: a */
        public void mo1243a(C0290T t) {
            t.mo1180a(this.f1326a, this.f1327b, this.f1328c, this.f1329d);
        }

        public String toString() {
            return "NotifyTask[" + "packageName:" + this.f1326a + ", id:" + this.f1327b + ", tag:" + this.f1328c + "]";
        }
    }

    /* renamed from: android.support.v4.app.ba$c */
    private static class C0315c {

        /* renamed from: a */
        final ComponentName f1330a;

        /* renamed from: b */
        final IBinder f1331b;

        C0315c(ComponentName componentName, IBinder iBinder) {
            this.f1330a = componentName;
            this.f1331b = iBinder;
        }
    }

    /* renamed from: android.support.v4.app.ba$d */
    private static class C0316d implements Handler.Callback, ServiceConnection {

        /* renamed from: a */
        private final Context f1332a;

        /* renamed from: b */
        private final HandlerThread f1333b;

        /* renamed from: c */
        private final Handler f1334c;

        /* renamed from: d */
        private final Map<ComponentName, C0317a> f1335d = new HashMap();

        /* renamed from: e */
        private Set<String> f1336e = new HashSet();

        /* renamed from: android.support.v4.app.ba$d$a */
        private static class C0317a {

            /* renamed from: a */
            final ComponentName f1337a;

            /* renamed from: b */
            boolean f1338b = false;

            /* renamed from: c */
            C0290T f1339c;

            /* renamed from: d */
            ArrayDeque<C0318e> f1340d = new ArrayDeque<>();

            /* renamed from: e */
            int f1341e = 0;

            C0317a(ComponentName componentName) {
                this.f1337a = componentName;
            }
        }

        C0316d(Context context) {
            this.f1332a = context;
            this.f1333b = new HandlerThread("NotificationManagerCompat");
            this.f1333b.start();
            this.f1334c = new Handler(this.f1333b.getLooper(), this);
        }

        /* renamed from: a */
        private void m1406a() {
            Set<String> b = C0312ba.m1398b(this.f1332a);
            if (!b.equals(this.f1336e)) {
                this.f1336e = b;
                List<ResolveInfo> queryIntentServices = this.f1332a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet = new HashSet<>();
                for (ResolveInfo next : queryIntentServices) {
                    if (b.contains(next.serviceInfo.packageName)) {
                        ComponentName componentName = new ComponentName(next.serviceInfo.packageName, next.serviceInfo.name);
                        if (next.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!this.f1335d.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.f1335d.put(componentName2, new C0317a(componentName2));
                    }
                }
                Iterator<Map.Entry<ComponentName, C0317a>> it = this.f1335d.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry next2 = it.next();
                    if (!hashSet.contains(next2.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + next2.getKey());
                        }
                        m1411b((C0317a) next2.getValue());
                        it.remove();
                    }
                }
            }
        }

        /* renamed from: a */
        private void m1407a(ComponentName componentName) {
            C0317a aVar = this.f1335d.get(componentName);
            if (aVar != null) {
                m1413c(aVar);
            }
        }

        /* renamed from: a */
        private void m1408a(ComponentName componentName, IBinder iBinder) {
            C0317a aVar = this.f1335d.get(componentName);
            if (aVar != null) {
                aVar.f1339c = C0290T.C0291a.m1312a(iBinder);
                aVar.f1341e = 0;
                m1413c(aVar);
            }
        }

        /* renamed from: a */
        private boolean m1409a(C0317a aVar) {
            if (aVar.f1338b) {
                return true;
            }
            aVar.f1338b = this.f1332a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f1337a), this, 33);
            if (aVar.f1338b) {
                aVar.f1341e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f1337a);
                this.f1332a.unbindService(this);
            }
            return aVar.f1338b;
        }

        /* renamed from: b */
        private void m1410b(ComponentName componentName) {
            C0317a aVar = this.f1335d.get(componentName);
            if (aVar != null) {
                m1411b(aVar);
            }
        }

        /* renamed from: b */
        private void m1411b(C0317a aVar) {
            if (aVar.f1338b) {
                this.f1332a.unbindService(this);
                aVar.f1338b = false;
            }
            aVar.f1339c = null;
        }

        /* renamed from: b */
        private void m1412b(C0318e eVar) {
            m1406a();
            for (C0317a next : this.f1335d.values()) {
                next.f1340d.add(eVar);
                m1413c(next);
            }
        }

        /* renamed from: c */
        private void m1413c(C0317a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f1337a + ", " + aVar.f1340d.size() + " queued tasks");
            }
            if (!aVar.f1340d.isEmpty()) {
                if (!m1409a(aVar) || aVar.f1339c == null) {
                    m1414d(aVar);
                    return;
                }
                while (true) {
                    C0318e peek = aVar.f1340d.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + peek);
                        }
                        peek.mo1243a(aVar.f1339c);
                        aVar.f1340d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Remote service has died: " + aVar.f1337a);
                        }
                    } catch (RemoteException e) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f1337a, e);
                    }
                }
                if (!aVar.f1340d.isEmpty()) {
                    m1414d(aVar);
                }
            }
        }

        /* renamed from: d */
        private void m1414d(C0317a aVar) {
            if (!this.f1334c.hasMessages(3, aVar.f1337a)) {
                aVar.f1341e++;
                int i = aVar.f1341e;
                if (i > 6) {
                    Log.w("NotifManCompat", "Giving up on delivering " + aVar.f1340d.size() + " tasks to " + aVar.f1337a + " after " + aVar.f1341e + " retries");
                    aVar.f1340d.clear();
                    return;
                }
                int i2 = (1 << (i - 1)) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i2 + " ms");
                }
                this.f1334c.sendMessageDelayed(this.f1334c.obtainMessage(3, aVar.f1337a), (long) i2);
            }
        }

        /* renamed from: a */
        public void mo1246a(C0318e eVar) {
            this.f1334c.obtainMessage(0, eVar).sendToTarget();
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                m1412b((C0318e) message.obj);
                return true;
            } else if (i == 1) {
                C0315c cVar = (C0315c) message.obj;
                m1408a(cVar.f1330a, cVar.f1331b);
                return true;
            } else if (i == 2) {
                m1410b((ComponentName) message.obj);
                return true;
            } else if (i != 3) {
                return false;
            } else {
                m1407a((ComponentName) message.obj);
                return true;
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f1334c.obtainMessage(1, new C0315c(componentName, iBinder)).sendToTarget();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f1334c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* renamed from: android.support.v4.app.ba$e */
    private interface C0318e {
        /* renamed from: a */
        void mo1243a(C0290T t);
    }

    private C0312ba(Context context) {
        this.f1320f = context;
    }

    /* renamed from: a */
    public static C0312ba m1395a(Context context) {
        return new C0312ba(context);
    }

    /* renamed from: a */
    private void m1396a(C0318e eVar) {
        synchronized (f1318d) {
            if (f1319e == null) {
                f1319e = new C0316d(this.f1320f.getApplicationContext());
            }
            f1319e.mo1246a(eVar);
        }
    }

    /* renamed from: a */
    private static boolean m1397a(Notification notification) {
        Bundle a = C0297Y.m1324a(notification);
        return a != null && a.getBoolean("android.support.useSideChannel");
    }

    /* renamed from: b */
    public static Set<String> m1398b(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f1315a) {
            if (string != null) {
                if (!string.equals(f1316b)) {
                    String[] split = string.split(":");
                    HashSet hashSet = new HashSet(split.length);
                    for (String unflattenFromString : split) {
                        ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                        if (unflattenFromString2 != null) {
                            hashSet.add(unflattenFromString2.getPackageName());
                        }
                    }
                    f1317c = hashSet;
                    f1316b = string;
                }
            }
            set = f1317c;
        }
        return set;
    }

    /* renamed from: a */
    public void mo1238a(int i) {
        mo1240a((String) null, i);
    }

    /* renamed from: a */
    public void mo1239a(int i, Notification notification) {
        mo1241a((String) null, i, notification);
    }

    /* renamed from: a */
    public void mo1240a(String str, int i) {
        this.f1321g.cancel(str, i);
        if (Build.VERSION.SDK_INT <= 19) {
            m1396a((C0318e) new C0313a(this.f1320f.getPackageName(), i, str));
        }
    }

    /* renamed from: a */
    public void mo1241a(String str, int i, Notification notification) {
        if (m1397a(notification)) {
            m1396a((C0318e) new C0314b(this.f1320f.getPackageName(), i, str, notification));
            this.f1321g.cancel(str, i);
            return;
        }
        this.f1321g.notify(str, i, notification);
    }

    /* renamed from: a */
    public boolean mo1242a() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return this.f1321g.areNotificationsEnabled();
        }
        if (i < 19) {
            return true;
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f1320f.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f1320f.getApplicationInfo();
        String packageName = this.f1320f.getApplicationContext().getPackageName();
        int i2 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            return ((Integer) cls.getMethod("checkOpNoThrow", new Class[]{Integer.TYPE, Integer.TYPE, String.class}).invoke(appOpsManager, new Object[]{Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i2), packageName})).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }
}
