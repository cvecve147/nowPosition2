package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.iid.zzi;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p013b.p018b.p028h.p039h.C1101r;
import p101d.p129g.p131b.p132a.p144g.C5537h;
import p101d.p129g.p131b.p132a.p144g.C5540j;

/* renamed from: com.google.firebase.iid.l */
final class C4081l {

    /* renamed from: a */
    private static int f12092a;

    /* renamed from: b */
    private static PendingIntent f12093b;

    /* renamed from: c */
    private final C1101r<String, C5537h<Bundle>> f12094c = new C1101r<>();

    /* renamed from: d */
    private final Context f12095d;

    /* renamed from: e */
    private final C4074e f12096e;

    /* renamed from: f */
    private Messenger f12097f;

    /* renamed from: g */
    private Messenger f12098g;

    /* renamed from: h */
    private zzi f12099h;

    public C4081l(Context context, C4074e eVar) {
        this.f12095d = context;
        this.f12096e = eVar;
        this.f12097f = new Messenger(new C4082m(this, Looper.getMainLooper()));
    }

    /* renamed from: a */
    private static synchronized String m16321a() {
        String num;
        synchronized (C4081l.class) {
            int i = f12092a;
            f12092a = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* renamed from: a */
    private static synchronized void m16322a(Context context, Intent intent) {
        synchronized (C4081l.class) {
            if (f12093b == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f12093b = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", f12093b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m16323a(Message message) {
        String concat;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new zzi.C4096a());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzi) {
                        this.f12099h = (zzi) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.f12098g = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    String stringExtra = intent2.getStringExtra("registration_id");
                    if (stringExtra == null) {
                        stringExtra = intent2.getStringExtra("unregistered");
                    }
                    if (stringExtra == null) {
                        String stringExtra2 = intent2.getStringExtra("error");
                        if (stringExtra2 == null) {
                            String valueOf = String.valueOf(intent2.getExtras());
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
                            sb.append("Unexpected response, no error or registration id ");
                            sb.append(valueOf);
                            concat = sb.toString();
                        } else {
                            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                                String valueOf2 = String.valueOf(stringExtra2);
                                Log.d("FirebaseInstanceId", valueOf2.length() != 0 ? "Received InstanceID error ".concat(valueOf2) : new String("Received InstanceID error "));
                            }
                            if (stringExtra2.startsWith("|")) {
                                String[] split = stringExtra2.split("\\|");
                                if (split.length <= 2 || !"ID".equals(split[1])) {
                                    String valueOf3 = String.valueOf(stringExtra2);
                                    concat = valueOf3.length() != 0 ? "Unexpected structured response ".concat(valueOf3) : new String("Unexpected structured response ");
                                } else {
                                    String str = split[2];
                                    String str2 = split[3];
                                    if (str2.startsWith(":")) {
                                        str2 = str2.substring(1);
                                    }
                                    m16325a(str, intent2.putExtra("error", str2).getExtras());
                                    return;
                                }
                            } else {
                                synchronized (this.f12094c) {
                                    for (int i = 0; i < this.f12094c.size(); i++) {
                                        m16325a(this.f12094c.mo5236b(i), intent2.getExtras());
                                    }
                                }
                                return;
                            }
                        }
                        Log.w("FirebaseInstanceId", concat);
                        return;
                    }
                    Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", group2);
                        m16325a(group, extras);
                        return;
                    } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String valueOf4 = String.valueOf(stringExtra);
                        Log.d("FirebaseInstanceId", valueOf4.length() != 0 ? "Unexpected response string: ".concat(valueOf4) : new String("Unexpected response string: "));
                        return;
                    } else {
                        return;
                    }
                } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf5 = String.valueOf(action);
                    Log.d("FirebaseInstanceId", valueOf5.length() != 0 ? "Unexpected response action: ".concat(valueOf5) : new String("Unexpected response action: "));
                    return;
                } else {
                    return;
                }
            }
        }
        Log.w("FirebaseInstanceId", "Dropping invalid message");
    }

    /* renamed from: a */
    private final void m16325a(String str, Bundle bundle) {
        synchronized (this.f12094c) {
            C5537h remove = this.f12094c.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                Log.w("FirebaseInstanceId", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
                return;
            }
            remove.mo14998a(bundle);
        }
    }

    /* renamed from: b */
    private final Bundle m16326b(Bundle bundle) {
        Bundle c = m16327c(bundle);
        if (c == null || !c.containsKey("google.messenger")) {
            return c;
        }
        Bundle c2 = m16327c(bundle);
        if (c2 == null || !c2.containsKey("google.messenger")) {
            return c2;
        }
        return null;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: c */
    private final android.os.Bundle m16327c(android.os.Bundle r8) {
        /*
            r7 = this;
            java.lang.String r0 = m16321a()
            d.g.b.a.g.h r1 = new d.g.b.a.g.h
            r1.<init>()
            b.b.h.h.r<java.lang.String, d.g.b.a.g.h<android.os.Bundle>> r2 = r7.f12094c
            monitor-enter(r2)
            b.b.h.h.r<java.lang.String, d.g.b.a.g.h<android.os.Bundle>> r3 = r7.f12094c     // Catch:{ all -> 0x0122 }
            r3.put(r0, r1)     // Catch:{ all -> 0x0122 }
            monitor-exit(r2)     // Catch:{ all -> 0x0122 }
            com.google.firebase.iid.e r2 = r7.f12096e
            int r2 = r2.mo11505b()
            if (r2 == 0) goto L_0x011a
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = "com.google.android.gms"
            r2.setPackage(r3)
            com.google.firebase.iid.e r3 = r7.f12096e
            int r3 = r3.mo11505b()
            r4 = 2
            if (r3 != r4) goto L_0x0030
            java.lang.String r3 = "com.google.iid.TOKEN_REQUEST"
            goto L_0x0032
        L_0x0030:
            java.lang.String r3 = "com.google.android.c2dm.intent.REGISTER"
        L_0x0032:
            r2.setAction(r3)
            r2.putExtras(r8)
            android.content.Context r8 = r7.f12095d
            m16322a((android.content.Context) r8, (android.content.Intent) r2)
            java.lang.String r8 = java.lang.String.valueOf(r0)
            int r8 = r8.length()
            int r8 = r8 + 5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r8)
            java.lang.String r8 = "|ID|"
            r3.append(r8)
            r3.append(r0)
            java.lang.String r8 = "|"
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            java.lang.String r3 = "kid"
            r2.putExtra(r3, r8)
            r8 = 3
            java.lang.String r3 = "FirebaseInstanceId"
            boolean r3 = android.util.Log.isLoggable(r3, r8)
            if (r3 == 0) goto L_0x0093
            android.os.Bundle r3 = r2.getExtras()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r5 = java.lang.String.valueOf(r3)
            int r5 = r5.length()
            int r5 = r5 + 8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "Sending "
            r6.append(r5)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            java.lang.String r5 = "FirebaseInstanceId"
            android.util.Log.d(r5, r3)
        L_0x0093:
            android.os.Messenger r3 = r7.f12097f
            java.lang.String r5 = "google.messenger"
            r2.putExtra(r5, r3)
            android.os.Messenger r3 = r7.f12098g
            if (r3 != 0) goto L_0x00a2
            com.google.firebase.iid.zzi r3 = r7.f12099h
            if (r3 == 0) goto L_0x00c7
        L_0x00a2:
            android.os.Message r3 = android.os.Message.obtain()
            r3.obj = r2
            android.os.Messenger r5 = r7.f12098g     // Catch:{ RemoteException -> 0x00b8 }
            if (r5 == 0) goto L_0x00b2
            android.os.Messenger r5 = r7.f12098g     // Catch:{ RemoteException -> 0x00b8 }
            r5.send(r3)     // Catch:{ RemoteException -> 0x00b8 }
            goto L_0x00da
        L_0x00b2:
            com.google.firebase.iid.zzi r5 = r7.f12099h     // Catch:{ RemoteException -> 0x00b8 }
            r5.mo11539a(r3)     // Catch:{ RemoteException -> 0x00b8 }
            goto L_0x00da
        L_0x00b8:
            java.lang.String r3 = "FirebaseInstanceId"
            boolean r8 = android.util.Log.isLoggable(r3, r8)
            if (r8 == 0) goto L_0x00c7
            java.lang.String r8 = "FirebaseInstanceId"
            java.lang.String r3 = "Messenger failed, fallback to startService"
            android.util.Log.d(r8, r3)
        L_0x00c7:
            com.google.firebase.iid.e r8 = r7.f12096e
            int r8 = r8.mo11505b()
            if (r8 != r4) goto L_0x00d5
            android.content.Context r8 = r7.f12095d
            r8.sendBroadcast(r2)
            goto L_0x00da
        L_0x00d5:
            android.content.Context r8 = r7.f12095d
            r8.startService(r2)
        L_0x00da:
            d.g.b.a.g.g r8 = r1.mo14996a()     // Catch:{ InterruptedException | TimeoutException -> 0x00fe, ExecutionException -> 0x00f7 }
            r1 = 30000(0x7530, double:1.4822E-319)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException | TimeoutException -> 0x00fe, ExecutionException -> 0x00f7 }
            java.lang.Object r8 = p101d.p129g.p131b.p132a.p144g.C5540j.m21081a(r8, r1, r3)     // Catch:{ InterruptedException | TimeoutException -> 0x00fe, ExecutionException -> 0x00f7 }
            android.os.Bundle r8 = (android.os.Bundle) r8     // Catch:{ InterruptedException | TimeoutException -> 0x00fe, ExecutionException -> 0x00f7 }
            b.b.h.h.r<java.lang.String, d.g.b.a.g.h<android.os.Bundle>> r1 = r7.f12094c
            monitor-enter(r1)
            b.b.h.h.r<java.lang.String, d.g.b.a.g.h<android.os.Bundle>> r2 = r7.f12094c     // Catch:{ all -> 0x00f2 }
            r2.remove(r0)     // Catch:{ all -> 0x00f2 }
            monitor-exit(r1)     // Catch:{ all -> 0x00f2 }
            return r8
        L_0x00f2:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00f2 }
            throw r8
        L_0x00f5:
            r8 = move-exception
            goto L_0x010d
        L_0x00f7:
            r8 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x00f5 }
            r1.<init>(r8)     // Catch:{ all -> 0x00f5 }
            throw r1     // Catch:{ all -> 0x00f5 }
        L_0x00fe:
            java.lang.String r8 = "FirebaseInstanceId"
            java.lang.String r1 = "No response"
            android.util.Log.w(r8, r1)     // Catch:{ all -> 0x00f5 }
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x00f5 }
            java.lang.String r1 = "TIMEOUT"
            r8.<init>(r1)     // Catch:{ all -> 0x00f5 }
            throw r8     // Catch:{ all -> 0x00f5 }
        L_0x010d:
            b.b.h.h.r<java.lang.String, d.g.b.a.g.h<android.os.Bundle>> r1 = r7.f12094c
            monitor-enter(r1)
            b.b.h.h.r<java.lang.String, d.g.b.a.g.h<android.os.Bundle>> r2 = r7.f12094c     // Catch:{ all -> 0x0117 }
            r2.remove(r0)     // Catch:{ all -> 0x0117 }
            monitor-exit(r1)     // Catch:{ all -> 0x0117 }
            throw r8
        L_0x0117:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0117 }
            throw r8
        L_0x011a:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r0 = "MISSING_INSTANCEID_SERVICE"
            r8.<init>(r0)
            throw r8
        L_0x0122:
            r8 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0122 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C4081l.m16327c(android.os.Bundle):android.os.Bundle");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Bundle mo11510a(Bundle bundle) {
        if (this.f12096e.mo11504a() < 12000000) {
            return m16326b(bundle);
        }
        try {
            return (Bundle) C5540j.m21080a(C4060I.m16282a(this.f12095d).mo11484a(1, bundle));
        } catch (InterruptedException | ExecutionException e) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("Error making request: ");
                sb.append(valueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            if (!(e.getCause() instanceof C4072c) || ((C4072c) e.getCause()).mo11503a() != 4) {
                return null;
            }
            return m16326b(bundle);
        }
    }
}
