package com.google.android.gms.iid;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.util.C2092n;
import java.io.IOException;
import java.security.KeyPair;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p013b.p018b.p028h.p039h.C1080b;
import p101d.p129g.p131b.p132a.p144g.C5540j;

/* renamed from: com.google.android.gms.iid.h */
public final class C2144h {

    /* renamed from: a */
    private static final C2148l<Boolean> f6623a = C2147k.m9258a().mo7762a("gcm_iid_use_messenger_ipc", true);

    /* renamed from: b */
    private static String f6624b = null;

    /* renamed from: c */
    private static boolean f6625c = false;

    /* renamed from: d */
    private static int f6626d = 0;

    /* renamed from: e */
    private static int f6627e = 0;

    /* renamed from: f */
    private static int f6628f = 0;

    /* renamed from: g */
    private static BroadcastReceiver f6629g = null;

    /* renamed from: h */
    private Context f6630h;

    /* renamed from: i */
    private Map<String, Object> f6631i = new C1080b();

    /* renamed from: j */
    private Messenger f6632j;

    /* renamed from: k */
    private Messenger f6633k;

    /* renamed from: l */
    private MessengerCompat f6634l;

    /* renamed from: m */
    private PendingIntent f6635m;

    public C2144h(Context context) {
        this.f6630h = context;
    }

    /* renamed from: a */
    private static synchronized String m9243a() {
        String num;
        synchronized (C2144h.class) {
            int i = f6628f;
            f6628f = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* renamed from: a */
    static String m9244a(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string == null) {
                string = bundle.getString("unregistered");
            }
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("error");
            if (string2 != null) {
                throw new IOException(string2);
            }
            String valueOf = String.valueOf(bundle);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
            sb.append("Unexpected response from GCM ");
            sb.append(valueOf);
            Log.w("InstanceID", sb.toString(), new Throwable());
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    /* renamed from: a */
    private static void m9245a(Object obj, Object obj2) {
        if (obj instanceof ConditionVariable) {
            ((ConditionVariable) obj).open();
        }
        if (obj instanceof Messenger) {
            Messenger messenger = (Messenger) obj;
            Message obtain = Message.obtain();
            obtain.obj = obj2;
            try {
                messenger.send(obtain);
            } catch (RemoteException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                sb.append("Failed to send response ");
                sb.append(valueOf);
                Log.w("InstanceID", sb.toString());
            }
        }
    }

    /* renamed from: a */
    private final void m9246a(String str, Object obj) {
        synchronized (C2144h.class) {
            Object obj2 = this.f6631i.get(str);
            this.f6631i.put(str, obj);
            m9245a(obj2, obj);
        }
    }

    /* renamed from: a */
    public static boolean m9247a(Context context) {
        if (f6624b != null) {
            m9251b(context);
        }
        return f6625c;
    }

    /* renamed from: a */
    private static boolean m9248a(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            f6624b = applicationInfo.packageName;
            f6627e = applicationInfo.uid;
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m9249a(PackageManager packageManager, String str, String str2) {
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", str) == 0) {
            return m9248a(packageManager, str);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56 + String.valueOf(str2).length());
        sb.append("Possible malicious package ");
        sb.append(str);
        sb.append(" declares ");
        sb.append(str2);
        sb.append(" without permission");
        Log.w("InstanceID", sb.toString());
        return false;
    }

    /* renamed from: b */
    private final Bundle m9250b(Bundle bundle) {
        Bundle c = m9254c(bundle);
        if (c == null || !c.containsKey("google.messenger")) {
            return c;
        }
        Bundle c2 = m9254c(bundle);
        if (c2 == null || !c2.containsKey("google.messenger")) {
            return c2;
        }
        return null;
    }

    /* renamed from: b */
    public static String m9251b(Context context) {
        boolean z;
        String str = f6624b;
        if (str != null) {
            return str;
        }
        f6626d = Process.myUid();
        PackageManager packageManager = context.getPackageManager();
        boolean z2 = true;
        if (!C2092n.m9171l()) {
            Iterator<ResolveInfo> it = packageManager.queryIntentServices(new Intent("com.google.android.c2dm.intent.REGISTER"), 0).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (m9249a(packageManager, it.next().serviceInfo.packageName, "com.google.android.c2dm.intent.REGISTER")) {
                        f6625c = false;
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                return f6624b;
            }
        }
        Iterator<ResolveInfo> it2 = packageManager.queryBroadcastReceivers(new Intent("com.google.iid.TOKEN_REQUEST"), 0).iterator();
        while (true) {
            if (it2.hasNext()) {
                if (m9249a(packageManager, it2.next().activityInfo.packageName, "com.google.iid.TOKEN_REQUEST")) {
                    f6625c = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        if (z2) {
            return f6624b;
        }
        Log.w("InstanceID", "Failed to resolve IID implementation package, falling back");
        if (m9248a(packageManager, "com.google.android.gms")) {
            f6625c = C2092n.m9171l();
            return f6624b;
        } else if (C2092n.m9168i() || !m9248a(packageManager, "com.google.android.gsf")) {
            Log.w("InstanceID", "Google Play services is missing, unable to get tokens");
            return null;
        } else {
            f6625c = false;
            return f6624b;
        }
    }

    /* renamed from: b */
    private final synchronized void m9252b(Intent intent) {
        if (this.f6635m == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            this.f6635m = PendingIntent.getBroadcast(this.f6630h, 0, intent2, 0);
        }
        intent.putExtra("app", this.f6635m);
    }

    /* renamed from: c */
    private static int m9253c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(m9251b(context), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: c */
    private final android.os.Bundle m9254c(android.os.Bundle r8) {
        /*
            r7 = this;
            android.os.ConditionVariable r0 = new android.os.ConditionVariable
            r0.<init>()
            java.lang.String r1 = m9243a()
            java.lang.Class<com.google.android.gms.iid.h> r2 = com.google.android.gms.iid.C2144h.class
            monitor-enter(r2)
            java.util.Map<java.lang.String, java.lang.Object> r3 = r7.f6631i     // Catch:{ all -> 0x01d1 }
            r3.put(r1, r0)     // Catch:{ all -> 0x01d1 }
            monitor-exit(r2)     // Catch:{ all -> 0x01d1 }
            android.os.Messenger r2 = r7.f6632j
            if (r2 != 0) goto L_0x002b
            android.content.Context r2 = r7.f6630h
            m9251b((android.content.Context) r2)
            android.os.Messenger r2 = new android.os.Messenger
            com.google.android.gms.iid.i r3 = new com.google.android.gms.iid.i
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r3.<init>(r7, r4)
            r2.<init>(r3)
            r7.f6632j = r2
        L_0x002b:
            java.lang.String r2 = f6624b
            if (r2 == 0) goto L_0x01c9
            android.content.Intent r2 = new android.content.Intent
            boolean r3 = f6625c
            if (r3 == 0) goto L_0x0038
            java.lang.String r3 = "com.google.iid.TOKEN_REQUEST"
            goto L_0x003a
        L_0x0038:
            java.lang.String r3 = "com.google.android.c2dm.intent.REGISTER"
        L_0x003a:
            r2.<init>(r3)
            java.lang.String r3 = f6624b
            r2.setPackage(r3)
            r2.putExtras(r8)
            r7.m9252b((android.content.Intent) r2)
            java.lang.String r8 = java.lang.String.valueOf(r1)
            int r8 = r8.length()
            int r8 = r8 + 5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r8)
            java.lang.String r8 = "|ID|"
            r3.append(r8)
            r3.append(r1)
            java.lang.String r8 = "|"
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            java.lang.String r3 = "kid"
            r2.putExtra(r3, r8)
            java.lang.String r8 = java.lang.String.valueOf(r1)
            int r8 = r8.length()
            int r8 = r8 + 5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r8)
            java.lang.String r8 = "|ID|"
            r3.append(r8)
            r3.append(r1)
            java.lang.String r8 = "|"
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            java.lang.String r3 = "X-kid"
            r2.putExtra(r3, r8)
            java.lang.String r8 = f6624b
            java.lang.String r3 = "com.google.android.gsf"
            boolean r8 = r3.equals(r8)
            java.lang.String r3 = "useGsf"
            java.lang.String r3 = r2.getStringExtra(r3)
            if (r3 == 0) goto L_0x00a8
            java.lang.String r8 = "1"
            boolean r8 = r8.equals(r3)
        L_0x00a8:
            r3 = 3
            java.lang.String r4 = "InstanceID"
            boolean r4 = android.util.Log.isLoggable(r4, r3)
            if (r4 == 0) goto L_0x00d9
            android.os.Bundle r4 = r2.getExtras()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = java.lang.String.valueOf(r4)
            int r5 = r5.length()
            int r5 = r5 + 8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "Sending "
            r6.append(r5)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            java.lang.String r5 = "InstanceID"
            android.util.Log.d(r5, r4)
        L_0x00d9:
            android.os.Messenger r4 = r7.f6633k
            if (r4 == 0) goto L_0x0100
            android.os.Messenger r4 = r7.f6632j
            java.lang.String r5 = "google.messenger"
            r2.putExtra(r5, r4)
            android.os.Message r4 = android.os.Message.obtain()
            r4.obj = r2
            android.os.Messenger r5 = r7.f6633k     // Catch:{ RemoteException -> 0x00f1 }
            r5.send(r4)     // Catch:{ RemoteException -> 0x00f1 }
            goto L_0x0178
        L_0x00f1:
            java.lang.String r4 = "InstanceID"
            boolean r4 = android.util.Log.isLoggable(r4, r3)
            if (r4 == 0) goto L_0x0100
            java.lang.String r4 = "InstanceID"
            java.lang.String r5 = "Messenger failed, fallback to startService"
            android.util.Log.d(r4, r5)
        L_0x0100:
            if (r8 == 0) goto L_0x013c
            monitor-enter(r7)
            android.content.BroadcastReceiver r8 = f6629g     // Catch:{ all -> 0x0139 }
            if (r8 != 0) goto L_0x0137
            com.google.android.gms.iid.j r8 = new com.google.android.gms.iid.j     // Catch:{ all -> 0x0139 }
            r8.<init>(r7)     // Catch:{ all -> 0x0139 }
            f6629g = r8     // Catch:{ all -> 0x0139 }
            java.lang.String r8 = "InstanceID"
            boolean r8 = android.util.Log.isLoggable(r8, r3)     // Catch:{ all -> 0x0139 }
            if (r8 == 0) goto L_0x011d
            java.lang.String r8 = "InstanceID"
            java.lang.String r3 = "Registered GSF callback receiver"
            android.util.Log.d(r8, r3)     // Catch:{ all -> 0x0139 }
        L_0x011d:
            android.content.IntentFilter r8 = new android.content.IntentFilter     // Catch:{ all -> 0x0139 }
            java.lang.String r3 = "com.google.android.c2dm.intent.REGISTRATION"
            r8.<init>(r3)     // Catch:{ all -> 0x0139 }
            android.content.Context r3 = r7.f6630h     // Catch:{ all -> 0x0139 }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ all -> 0x0139 }
            r8.addCategory(r3)     // Catch:{ all -> 0x0139 }
            android.content.Context r3 = r7.f6630h     // Catch:{ all -> 0x0139 }
            android.content.BroadcastReceiver r4 = f6629g     // Catch:{ all -> 0x0139 }
            java.lang.String r5 = "com.google.android.c2dm.permission.SEND"
            r6 = 0
            r3.registerReceiver(r4, r8, r5, r6)     // Catch:{ all -> 0x0139 }
        L_0x0137:
            monitor-exit(r7)     // Catch:{ all -> 0x0139 }
            goto L_0x016d
        L_0x0139:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0139 }
            throw r8
        L_0x013c:
            android.os.Messenger r8 = r7.f6632j
            java.lang.String r4 = "google.messenger"
            r2.putExtra(r4, r8)
            java.lang.String r8 = "messenger2"
            java.lang.String r4 = "1"
            r2.putExtra(r8, r4)
            com.google.android.gms.iid.MessengerCompat r8 = r7.f6634l
            if (r8 == 0) goto L_0x0169
            android.os.Message r8 = android.os.Message.obtain()
            r8.obj = r2
            com.google.android.gms.iid.MessengerCompat r4 = r7.f6634l     // Catch:{ RemoteException -> 0x015a }
            r4.mo7754a(r8)     // Catch:{ RemoteException -> 0x015a }
            goto L_0x0178
        L_0x015a:
            java.lang.String r8 = "InstanceID"
            boolean r8 = android.util.Log.isLoggable(r8, r3)
            if (r8 == 0) goto L_0x0169
            java.lang.String r8 = "InstanceID"
            java.lang.String r3 = "Messenger failed, fallback to startService"
            android.util.Log.d(r8, r3)
        L_0x0169:
            boolean r8 = f6625c
            if (r8 == 0) goto L_0x0173
        L_0x016d:
            android.content.Context r8 = r7.f6630h
            r8.sendBroadcast(r2)
            goto L_0x0178
        L_0x0173:
            android.content.Context r8 = r7.f6630h
            r8.startService(r2)
        L_0x0178:
            r2 = 30000(0x7530, double:1.4822E-319)
            r0.block(r2)
            java.lang.Class<com.google.android.gms.iid.h> r8 = com.google.android.gms.iid.C2144h.class
            monitor-enter(r8)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r7.f6631i     // Catch:{ all -> 0x01c6 }
            java.lang.Object r0 = r0.remove(r1)     // Catch:{ all -> 0x01c6 }
            boolean r1 = r0 instanceof android.os.Bundle     // Catch:{ all -> 0x01c6 }
            if (r1 == 0) goto L_0x018e
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch:{ all -> 0x01c6 }
            monitor-exit(r8)     // Catch:{ all -> 0x01c6 }
            return r0
        L_0x018e:
            boolean r1 = r0 instanceof java.lang.String     // Catch:{ all -> 0x01c6 }
            if (r1 == 0) goto L_0x019a
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x01c6 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x01c6 }
            r1.<init>(r0)     // Catch:{ all -> 0x01c6 }
            throw r1     // Catch:{ all -> 0x01c6 }
        L_0x019a:
            java.lang.String r1 = "InstanceID"
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x01c6 }
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x01c6 }
            int r2 = r2.length()     // Catch:{ all -> 0x01c6 }
            int r2 = r2 + 12
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c6 }
            r3.<init>(r2)     // Catch:{ all -> 0x01c6 }
            java.lang.String r2 = "No response "
            r3.append(r2)     // Catch:{ all -> 0x01c6 }
            r3.append(r0)     // Catch:{ all -> 0x01c6 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x01c6 }
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x01c6 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01c6 }
            java.lang.String r1 = "TIMEOUT"
            r0.<init>(r1)     // Catch:{ all -> 0x01c6 }
            throw r0     // Catch:{ all -> 0x01c6 }
        L_0x01c6:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x01c6 }
            throw r0
        L_0x01c9:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r0 = "MISSING_INSTANCEID_SERVICE"
            r8.<init>(r0)
            throw r8
        L_0x01d1:
            r8 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01d1 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.iid.C2144h.m9254c(android.os.Bundle):android.os.Bundle");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Bundle mo7764a(Bundle bundle, KeyPair keyPair) {
        int c = m9253c(this.f6630h);
        bundle.putString("gmsv", Integer.toString(c));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", Integer.toString(C2137a.m9234b(this.f6630h)));
        bundle.putString("app_ver_name", C2137a.m9235c(this.f6630h));
        bundle.putString("cliv", "iid-12451000");
        bundle.putString("appid", C2137a.m9232a(keyPair));
        if (c < 12000000 || !f6623a.get().booleanValue()) {
            return m9250b(bundle);
        }
        try {
            return (Bundle) C5540j.m21080a(new C2158v(this.f6630h).mo7783a(1, bundle));
        } catch (InterruptedException | ExecutionException e) {
            if (Log.isLoggable("InstanceID", 3)) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("Error making request: ");
                sb.append(valueOf);
                Log.d("InstanceID", sb.toString());
            }
            if (!(e.getCause() instanceof C2139c) || ((C2139c) e.getCause()).mo7761a() != 4) {
                return null;
            }
            return m9250b(bundle);
        }
    }

    /* renamed from: a */
    public final void mo7765a(Intent intent) {
        String str;
        if (intent != null) {
            String action = intent.getAction();
            if ("com.google.android.c2dm.intent.REGISTRATION".equals(action) || "com.google.android.gms.iid.InstanceID".equals(action)) {
                String stringExtra = intent.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent.getStringExtra("unregistered");
                }
                if (stringExtra == null) {
                    String stringExtra2 = intent.getStringExtra("error");
                    if (stringExtra2 == null) {
                        String valueOf = String.valueOf(intent.getExtras());
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
                        sb.append("Unexpected response, no error or registration id ");
                        sb.append(valueOf);
                        Log.w("InstanceID", sb.toString());
                        return;
                    }
                    if (Log.isLoggable("InstanceID", 3)) {
                        String valueOf2 = String.valueOf(stringExtra2);
                        Log.d("InstanceID", valueOf2.length() != 0 ? "Received InstanceID error ".concat(valueOf2) : new String("Received InstanceID error "));
                    }
                    String str2 = null;
                    if (stringExtra2.startsWith("|")) {
                        String[] split = stringExtra2.split("\\|");
                        if (!"ID".equals(split[1])) {
                            String valueOf3 = String.valueOf(stringExtra2);
                            Log.w("InstanceID", valueOf3.length() != 0 ? "Unexpected structured response ".concat(valueOf3) : new String("Unexpected structured response "));
                        }
                        if (split.length > 2) {
                            String str3 = split[2];
                            str = split[3];
                            if (str.startsWith(":")) {
                                str = str.substring(1);
                            }
                            str2 = str3;
                        } else {
                            str = "UNKNOWN";
                        }
                        stringExtra2 = str;
                        intent.putExtra("error", stringExtra2);
                    }
                    if (str2 == null) {
                        synchronized (C2144h.class) {
                            for (String next : this.f6631i.keySet()) {
                                Object obj = this.f6631i.get(next);
                                this.f6631i.put(next, stringExtra2);
                                m9245a(obj, (Object) stringExtra2);
                            }
                        }
                        return;
                    }
                    m9246a(str2, (Object) stringExtra2);
                    return;
                }
                Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    Bundle extras = intent.getExtras();
                    extras.putString("registration_id", group2);
                    m9246a(group, (Object) extras);
                } else if (Log.isLoggable("InstanceID", 3)) {
                    String valueOf4 = String.valueOf(stringExtra);
                    Log.d("InstanceID", valueOf4.length() != 0 ? "Unexpected response string: ".concat(valueOf4) : new String("Unexpected response string: "));
                }
            } else if (Log.isLoggable("InstanceID", 3)) {
                String valueOf5 = String.valueOf(intent.getAction());
                Log.d("InstanceID", valueOf5.length() != 0 ? "Unexpected response ".concat(valueOf5) : new String("Unexpected response "));
            }
        } else if (Log.isLoggable("InstanceID", 3)) {
            Log.d("InstanceID", "Unexpected response: null");
        }
    }

    /* renamed from: a */
    public final void mo7766a(Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(MessengerCompat.class.getClassLoader());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof MessengerCompat) {
                        this.f6634l = (MessengerCompat) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.f6633k = (Messenger) parcelableExtra;
                    }
                }
                mo7765a((Intent) message.obj);
                return;
            }
            Log.w("InstanceID", "Dropping invalid message");
        }
    }
}
