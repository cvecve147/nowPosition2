package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Qu */
public final class C2649Qu {

    /* renamed from: a */
    private BlockingQueue<C2930_u> f8165a = new ArrayBlockingQueue(100);

    /* renamed from: b */
    private ExecutorService f8166b;

    /* renamed from: c */
    private LinkedHashMap<String, String> f8167c = new LinkedHashMap<>();

    /* renamed from: d */
    private Map<String, C2763Uu> f8168d = new HashMap();

    /* renamed from: e */
    private String f8169e;

    /* renamed from: f */
    private Context f8170f;

    /* renamed from: g */
    private String f8171g;

    /* renamed from: h */
    private AtomicBoolean f8172h;

    /* renamed from: i */
    private File f8173i;

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0099 A[SYNTHETIC, Splitter:B:30:0x0099] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a6 A[SYNTHETIC, Splitter:B:35:0x00a6] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0002 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m11005a() {
        /*
            r6 = this;
            java.lang.String r0 = "CsiReporter: Cannot close file: sdk_csi_data.txt."
        L_0x0002:
            java.util.concurrent.BlockingQueue<com.google.android.gms.internal.ads._u> r1 = r6.f8165a     // Catch:{ InterruptedException -> 0x00c2 }
            java.lang.Object r1 = r1.take()     // Catch:{ InterruptedException -> 0x00c2 }
            com.google.android.gms.internal.ads._u r1 = (com.google.android.gms.internal.ads.C2930_u) r1     // Catch:{ InterruptedException -> 0x00c2 }
            java.lang.String r2 = r1.mo9181b()     // Catch:{ InterruptedException -> 0x00c2 }
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0002
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r3 = r6.f8167c
            java.util.Map r1 = r1.mo9182c()
            java.util.Map r1 = r6.mo8753a(r3, r1)
            java.lang.String r3 = r6.f8169e
            android.net.Uri r3 = android.net.Uri.parse(r3)
            android.net.Uri$Builder r3 = r3.buildUpon()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0030:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x004c
            java.lang.Object r4 = r1.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            r3.appendQueryParameter(r5, r4)
            goto L_0x0030
        L_0x004c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            android.net.Uri r3 = r3.build()
            java.lang.String r3 = r3.toString()
            r1.<init>(r3)
            java.lang.String r3 = "&it="
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.util.concurrent.atomic.AtomicBoolean r2 = r6.f8172h
            boolean r2 = r2.get()
            if (r2 == 0) goto L_0x00b6
            java.io.File r2 = r6.f8173i
            if (r2 == 0) goto L_0x00af
            r3 = 0
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0091 }
            r5 = 1
            r4.<init>(r2, r5)     // Catch:{ IOException -> 0x0091 }
            byte[] r1 = r1.getBytes()     // Catch:{ IOException -> 0x008c, all -> 0x0089 }
            r4.write(r1)     // Catch:{ IOException -> 0x008c, all -> 0x0089 }
            r1 = 10
            r4.write(r1)     // Catch:{ IOException -> 0x008c, all -> 0x0089 }
            r4.close()     // Catch:{ IOException -> 0x009e }
            goto L_0x0002
        L_0x0089:
            r1 = move-exception
            r3 = r4
            goto L_0x00a4
        L_0x008c:
            r1 = move-exception
            r3 = r4
            goto L_0x0092
        L_0x008f:
            r1 = move-exception
            goto L_0x00a4
        L_0x0091:
            r1 = move-exception
        L_0x0092:
            java.lang.String r2 = "CsiReporter: Cannot write to file: sdk_csi_data.txt."
            com.google.android.gms.internal.ads.C2227Cf.m9535c(r2, r1)     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x0002
            r3.close()     // Catch:{ IOException -> 0x009e }
            goto L_0x0002
        L_0x009e:
            r1 = move-exception
            com.google.android.gms.internal.ads.C2227Cf.m9535c(r0, r1)
            goto L_0x0002
        L_0x00a4:
            if (r3 == 0) goto L_0x00ae
            r3.close()     // Catch:{ IOException -> 0x00aa }
            goto L_0x00ae
        L_0x00aa:
            r2 = move-exception
            com.google.android.gms.internal.ads.C2227Cf.m9535c(r0, r2)
        L_0x00ae:
            throw r1
        L_0x00af:
            java.lang.String r1 = "CsiReporter: File doesn't exists. Cannot write CSI data to file."
            com.google.android.gms.internal.ads.C2227Cf.m9536d(r1)
            goto L_0x0002
        L_0x00b6:
            com.google.android.gms.ads.internal.C1697X.m7698e()
            android.content.Context r2 = r6.f8170f
            java.lang.String r3 = r6.f8171g
            com.google.android.gms.internal.ads.C3114ge.m12409a((android.content.Context) r2, (java.lang.String) r3, (java.lang.String) r1)
            goto L_0x0002
        L_0x00c2:
            r0 = move-exception
            java.lang.String r1 = "CsiReporter:reporter interrupted"
            com.google.android.gms.internal.ads.C2227Cf.m9535c(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2649Qu.m11005a():void");
    }

    /* renamed from: a */
    public final C2763Uu mo8752a(String str) {
        C2763Uu uu = this.f8168d.get(str);
        return uu != null ? uu : C2763Uu.f8413a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Map<String, String> mo8753a(Map<String, String> map, Map<String, String> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (map2 == null) {
            return linkedHashMap;
        }
        for (Map.Entry next : map2.entrySet()) {
            String str = (String) next.getKey();
            String str2 = (String) linkedHashMap.get(str);
            linkedHashMap.put(str, mo8752a(str).mo8937a(str2, (String) next.getValue()));
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public final void mo8754a(Context context, String str, String str2, Map<String, String> map) {
        File externalStorageDirectory;
        this.f8170f = context;
        this.f8171g = str;
        this.f8169e = str2;
        this.f8172h = new AtomicBoolean(false);
        this.f8172h.set(((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7912ja)).booleanValue());
        if (this.f8172h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.f8173i = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry next : map.entrySet()) {
            this.f8167c.put((String) next.getKey(), (String) next.getValue());
        }
        this.f8166b = Executors.newSingleThreadExecutor();
        this.f8166b.execute(new C2679Ru(this));
        this.f8168d.put("action", C2763Uu.f8414b);
        this.f8168d.put("ad_format", C2763Uu.f8414b);
        this.f8168d.put("e", C2763Uu.f8415c);
    }

    /* renamed from: a */
    public final void mo8755a(List<String> list) {
        if (list != null && !list.isEmpty()) {
            this.f8167c.put("e", TextUtils.join(",", list));
        }
    }

    /* renamed from: a */
    public final boolean mo8756a(C2930_u _uVar) {
        return this.f8165a.offer(_uVar);
    }
}
