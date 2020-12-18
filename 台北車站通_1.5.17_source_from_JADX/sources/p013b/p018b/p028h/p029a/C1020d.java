package p013b.p018b.p028h.p029a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: b.b.h.a.d */
public final class C1020d {

    /* renamed from: a */
    private static final Object f3915a = new Object();

    /* renamed from: b */
    private static C1020d f3916b;

    /* renamed from: c */
    private final Context f3917c;

    /* renamed from: d */
    private final HashMap<BroadcastReceiver, ArrayList<C1022b>> f3918d = new HashMap<>();

    /* renamed from: e */
    private final HashMap<String, ArrayList<C1022b>> f3919e = new HashMap<>();

    /* renamed from: f */
    private final ArrayList<C1021a> f3920f = new ArrayList<>();

    /* renamed from: g */
    private final Handler f3921g;

    /* renamed from: b.b.h.a.d$a */
    private static final class C1021a {

        /* renamed from: a */
        final Intent f3922a;

        /* renamed from: b */
        final ArrayList<C1022b> f3923b;

        C1021a(Intent intent, ArrayList<C1022b> arrayList) {
            this.f3922a = intent;
            this.f3923b = arrayList;
        }
    }

    /* renamed from: b.b.h.a.d$b */
    private static final class C1022b {

        /* renamed from: a */
        final IntentFilter f3924a;

        /* renamed from: b */
        final BroadcastReceiver f3925b;

        /* renamed from: c */
        boolean f3926c;

        /* renamed from: d */
        boolean f3927d;

        C1022b(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f3924a = intentFilter;
            this.f3925b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f3925b);
            sb.append(" filter=");
            sb.append(this.f3924a);
            if (this.f3927d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    private C1020d(Context context) {
        this.f3917c = context;
        this.f3921g = new C1019c(this, context.getMainLooper());
    }

    /* renamed from: a */
    public static C1020d m5430a(Context context) {
        C1020d dVar;
        synchronized (f3915a) {
            if (f3916b == null) {
                f3916b = new C1020d(context.getApplicationContext());
            }
            dVar = f3916b;
        }
        return dVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (r2 >= r1.length) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        r3 = r1[r2];
        r4 = r3.f3923b.size();
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r5 >= r4) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r6 = r3.f3923b.get(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r6.f3927d != false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        r6.f3925b.onReceive(r9.f3917c, r3.f3922a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r2 = 0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m5431a() {
        /*
            r9 = this;
        L_0x0000:
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<b.b.h.a.d$b>> r0 = r9.f3918d
            monitor-enter(r0)
            java.util.ArrayList<b.b.h.a.d$a> r1 = r9.f3920f     // Catch:{ all -> 0x0045 }
            int r1 = r1.size()     // Catch:{ all -> 0x0045 }
            if (r1 > 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            return
        L_0x000d:
            b.b.h.a.d$a[] r1 = new p013b.p018b.p028h.p029a.C1020d.C1021a[r1]     // Catch:{ all -> 0x0045 }
            java.util.ArrayList<b.b.h.a.d$a> r2 = r9.f3920f     // Catch:{ all -> 0x0045 }
            r2.toArray(r1)     // Catch:{ all -> 0x0045 }
            java.util.ArrayList<b.b.h.a.d$a> r2 = r9.f3920f     // Catch:{ all -> 0x0045 }
            r2.clear()     // Catch:{ all -> 0x0045 }
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            r0 = 0
            r2 = r0
        L_0x001c:
            int r3 = r1.length
            if (r2 >= r3) goto L_0x0000
            r3 = r1[r2]
            java.util.ArrayList<b.b.h.a.d$b> r4 = r3.f3923b
            int r4 = r4.size()
            r5 = r0
        L_0x0028:
            if (r5 >= r4) goto L_0x0042
            java.util.ArrayList<b.b.h.a.d$b> r6 = r3.f3923b
            java.lang.Object r6 = r6.get(r5)
            b.b.h.a.d$b r6 = (p013b.p018b.p028h.p029a.C1020d.C1022b) r6
            boolean r7 = r6.f3927d
            if (r7 != 0) goto L_0x003f
            android.content.BroadcastReceiver r6 = r6.f3925b
            android.content.Context r7 = r9.f3917c
            android.content.Intent r8 = r3.f3922a
            r6.onReceive(r7, r8)
        L_0x003f:
            int r5 = r5 + 1
            goto L_0x0028
        L_0x0042:
            int r2 = r2 + 1
            goto L_0x001c
        L_0x0045:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p018b.p028h.p029a.C1020d.m5431a():void");
    }

    /* renamed from: a */
    public void mo5018a(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f3918d) {
            ArrayList remove = this.f3918d.remove(broadcastReceiver);
            if (remove != null) {
                for (int size = remove.size() - 1; size >= 0; size--) {
                    C1022b bVar = (C1022b) remove.get(size);
                    bVar.f3927d = true;
                    for (int i = 0; i < bVar.f3924a.countActions(); i++) {
                        String action = bVar.f3924a.getAction(i);
                        ArrayList arrayList = this.f3919e.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                C1022b bVar2 = (C1022b) arrayList.get(size2);
                                if (bVar2.f3925b == broadcastReceiver) {
                                    bVar2.f3927d = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.f3919e.remove(action);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo5019a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f3918d) {
            C1022b bVar = new C1022b(intentFilter, broadcastReceiver);
            ArrayList arrayList = this.f3918d.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.f3918d.put(broadcastReceiver, arrayList);
            }
            arrayList.add(bVar);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList arrayList2 = this.f3919e.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    this.f3919e.put(action, arrayList2);
                }
                arrayList2.add(bVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0171, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0173, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo5020a(android.content.Intent r22) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<b.b.h.a.d$b>> r2 = r1.f3918d
            monitor-enter(r2)
            java.lang.String r10 = r22.getAction()     // Catch:{ all -> 0x0175 }
            android.content.Context r3 = r1.f3917c     // Catch:{ all -> 0x0175 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ all -> 0x0175 }
            java.lang.String r11 = r0.resolveTypeIfNeeded(r3)     // Catch:{ all -> 0x0175 }
            android.net.Uri r12 = r22.getData()     // Catch:{ all -> 0x0175 }
            java.lang.String r13 = r22.getScheme()     // Catch:{ all -> 0x0175 }
            java.util.Set r14 = r22.getCategories()     // Catch:{ all -> 0x0175 }
            int r3 = r22.getFlags()     // Catch:{ all -> 0x0175 }
            r3 = r3 & 8
            if (r3 == 0) goto L_0x002c
            r16 = 1
            goto L_0x002e
        L_0x002c:
            r16 = 0
        L_0x002e:
            if (r16 == 0) goto L_0x0056
            java.lang.String r3 = "LocalBroadcastManager"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0175 }
            r4.<init>()     // Catch:{ all -> 0x0175 }
            java.lang.String r5 = "Resolving type "
            r4.append(r5)     // Catch:{ all -> 0x0175 }
            r4.append(r11)     // Catch:{ all -> 0x0175 }
            java.lang.String r5 = " scheme "
            r4.append(r5)     // Catch:{ all -> 0x0175 }
            r4.append(r13)     // Catch:{ all -> 0x0175 }
            java.lang.String r5 = " of intent "
            r4.append(r5)     // Catch:{ all -> 0x0175 }
            r4.append(r0)     // Catch:{ all -> 0x0175 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0175 }
            android.util.Log.v(r3, r4)     // Catch:{ all -> 0x0175 }
        L_0x0056:
            java.util.HashMap<java.lang.String, java.util.ArrayList<b.b.h.a.d$b>> r3 = r1.f3919e     // Catch:{ all -> 0x0175 }
            java.lang.String r4 = r22.getAction()     // Catch:{ all -> 0x0175 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x0175 }
            r8 = r3
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch:{ all -> 0x0175 }
            if (r8 == 0) goto L_0x0172
            if (r16 == 0) goto L_0x007d
            java.lang.String r3 = "LocalBroadcastManager"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0175 }
            r4.<init>()     // Catch:{ all -> 0x0175 }
            java.lang.String r5 = "Action list: "
            r4.append(r5)     // Catch:{ all -> 0x0175 }
            r4.append(r8)     // Catch:{ all -> 0x0175 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0175 }
            android.util.Log.v(r3, r4)     // Catch:{ all -> 0x0175 }
        L_0x007d:
            r3 = 0
            r6 = r3
            r7 = 0
        L_0x0080:
            int r3 = r8.size()     // Catch:{ all -> 0x0175 }
            if (r7 >= r3) goto L_0x0142
            java.lang.Object r3 = r8.get(r7)     // Catch:{ all -> 0x0175 }
            r5 = r3
            b.b.h.a.d$b r5 = (p013b.p018b.p028h.p029a.C1020d.C1022b) r5     // Catch:{ all -> 0x0175 }
            if (r16 == 0) goto L_0x00a7
            java.lang.String r3 = "LocalBroadcastManager"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0175 }
            r4.<init>()     // Catch:{ all -> 0x0175 }
            java.lang.String r9 = "Matching against filter "
            r4.append(r9)     // Catch:{ all -> 0x0175 }
            android.content.IntentFilter r9 = r5.f3924a     // Catch:{ all -> 0x0175 }
            r4.append(r9)     // Catch:{ all -> 0x0175 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0175 }
            android.util.Log.v(r3, r4)     // Catch:{ all -> 0x0175 }
        L_0x00a7:
            boolean r3 = r5.f3926c     // Catch:{ all -> 0x0175 }
            if (r3 == 0) goto L_0x00c0
            if (r16 == 0) goto L_0x00b4
            java.lang.String r3 = "LocalBroadcastManager"
            java.lang.String r4 = "  Filter's target already added"
            android.util.Log.v(r3, r4)     // Catch:{ all -> 0x0175 }
        L_0x00b4:
            r18 = r7
            r19 = r8
            r17 = r10
            r20 = r11
            r11 = 1
            r10 = r6
            goto L_0x0137
        L_0x00c0:
            android.content.IntentFilter r3 = r5.f3924a     // Catch:{ all -> 0x0175 }
            java.lang.String r9 = "LocalBroadcastManager"
            r4 = r10
            r15 = r5
            r5 = r11
            r17 = r10
            r10 = r6
            r6 = r13
            r18 = r7
            r7 = r12
            r19 = r8
            r8 = r14
            r20 = r11
            r11 = 1
            int r3 = r3.match(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0175 }
            if (r3 < 0) goto L_0x0105
            if (r16 == 0) goto L_0x00f6
            java.lang.String r4 = "LocalBroadcastManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0175 }
            r5.<init>()     // Catch:{ all -> 0x0175 }
            java.lang.String r6 = "  Filter matched!  match=0x"
            r5.append(r6)     // Catch:{ all -> 0x0175 }
            java.lang.String r3 = java.lang.Integer.toHexString(r3)     // Catch:{ all -> 0x0175 }
            r5.append(r3)     // Catch:{ all -> 0x0175 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x0175 }
            android.util.Log.v(r4, r3)     // Catch:{ all -> 0x0175 }
        L_0x00f6:
            if (r10 != 0) goto L_0x00fe
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0175 }
            r6.<init>()     // Catch:{ all -> 0x0175 }
            goto L_0x00ff
        L_0x00fe:
            r6 = r10
        L_0x00ff:
            r6.add(r15)     // Catch:{ all -> 0x0175 }
            r15.f3926c = r11     // Catch:{ all -> 0x0175 }
            goto L_0x0138
        L_0x0105:
            if (r16 == 0) goto L_0x0137
            r4 = -4
            if (r3 == r4) goto L_0x011f
            r4 = -3
            if (r3 == r4) goto L_0x011c
            r4 = -2
            if (r3 == r4) goto L_0x0119
            r4 = -1
            if (r3 == r4) goto L_0x0116
            java.lang.String r3 = "unknown reason"
            goto L_0x0121
        L_0x0116:
            java.lang.String r3 = "type"
            goto L_0x0121
        L_0x0119:
            java.lang.String r3 = "data"
            goto L_0x0121
        L_0x011c:
            java.lang.String r3 = "action"
            goto L_0x0121
        L_0x011f:
            java.lang.String r3 = "category"
        L_0x0121:
            java.lang.String r4 = "LocalBroadcastManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0175 }
            r5.<init>()     // Catch:{ all -> 0x0175 }
            java.lang.String r6 = "  Filter did not match: "
            r5.append(r6)     // Catch:{ all -> 0x0175 }
            r5.append(r3)     // Catch:{ all -> 0x0175 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x0175 }
            android.util.Log.v(r4, r3)     // Catch:{ all -> 0x0175 }
        L_0x0137:
            r6 = r10
        L_0x0138:
            int r7 = r18 + 1
            r10 = r17
            r8 = r19
            r11 = r20
            goto L_0x0080
        L_0x0142:
            r10 = r6
            r11 = 1
            if (r10 == 0) goto L_0x0172
            r3 = 0
        L_0x0147:
            int r4 = r10.size()     // Catch:{ all -> 0x0175 }
            if (r3 >= r4) goto L_0x0159
            java.lang.Object r4 = r10.get(r3)     // Catch:{ all -> 0x0175 }
            b.b.h.a.d$b r4 = (p013b.p018b.p028h.p029a.C1020d.C1022b) r4     // Catch:{ all -> 0x0175 }
            r5 = 0
            r4.f3926c = r5     // Catch:{ all -> 0x0175 }
            int r3 = r3 + 1
            goto L_0x0147
        L_0x0159:
            java.util.ArrayList<b.b.h.a.d$a> r3 = r1.f3920f     // Catch:{ all -> 0x0175 }
            b.b.h.a.d$a r4 = new b.b.h.a.d$a     // Catch:{ all -> 0x0175 }
            r4.<init>(r0, r10)     // Catch:{ all -> 0x0175 }
            r3.add(r4)     // Catch:{ all -> 0x0175 }
            android.os.Handler r0 = r1.f3921g     // Catch:{ all -> 0x0175 }
            boolean r0 = r0.hasMessages(r11)     // Catch:{ all -> 0x0175 }
            if (r0 != 0) goto L_0x0170
            android.os.Handler r0 = r1.f3921g     // Catch:{ all -> 0x0175 }
            r0.sendEmptyMessage(r11)     // Catch:{ all -> 0x0175 }
        L_0x0170:
            monitor-exit(r2)     // Catch:{ all -> 0x0175 }
            return r11
        L_0x0172:
            monitor-exit(r2)     // Catch:{ all -> 0x0175 }
            r0 = 0
            return r0
        L_0x0175:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0175 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p018b.p028h.p029a.C1020d.mo5020a(android.content.Intent):boolean");
    }
}
