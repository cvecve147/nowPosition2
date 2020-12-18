package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.C1574p;
import com.facebook.C1576r;
import com.facebook.C1601x;
import com.facebook.login.C1546b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.internal.S */
public final class C1461S {

    /* renamed from: a */
    private static final String f5085a = "com.facebook.internal.S";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static List<C1465d> f5086b = m6876f();

    /* renamed from: c */
    private static Map<String, List<C1465d>> f5087c = m6875e();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static AtomicBoolean f5088d = new AtomicBoolean(false);

    /* renamed from: e */
    private static final List<Integer> f5089e = Arrays.asList(new Integer[]{20160327, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140204, 20131107, 20130618, 20130502, 20121101});

    /* renamed from: com.facebook.internal.S$a */
    private static class C1462a extends C1465d {
        private C1462a() {
            super((C1460Q) null);
        }

        /* synthetic */ C1462a(C1460Q q) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public String mo6160b() {
            return "com.facebook.lite.platform.LoginGDPDialogActivity";
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public String mo6161c() {
            return "com.facebook.lite";
        }
    }

    /* renamed from: com.facebook.internal.S$b */
    private static class C1463b extends C1465d {
        private C1463b() {
            super((C1460Q) null);
        }

        /* synthetic */ C1463b(C1460Q q) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public String mo6160b() {
            return "com.facebook.katana.ProxyAuth";
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public String mo6161c() {
            return "com.facebook.katana";
        }
    }

    /* renamed from: com.facebook.internal.S$c */
    private static class C1464c extends C1465d {
        private C1464c() {
            super((C1460Q) null);
        }

        /* synthetic */ C1464c(C1460Q q) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public String mo6160b() {
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public String mo6161c() {
            return "com.facebook.orca";
        }
    }

    /* renamed from: com.facebook.internal.S$d */
    private static abstract class C1465d {

        /* renamed from: a */
        private static final HashSet<String> f5090a = m6885d();

        /* renamed from: b */
        private TreeSet<Integer> f5091b;

        private C1465d() {
        }

        /* synthetic */ C1465d(C1460Q q) {
            this();
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0005, code lost:
            if (r0.f5091b == null) goto L_0x0007;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized void m6884a(boolean r1) {
            /*
                r0 = this;
                monitor-enter(r0)
                if (r1 != 0) goto L_0x0007
                java.util.TreeSet<java.lang.Integer> r1 = r0.f5091b     // Catch:{ all -> 0x000f }
                if (r1 != 0) goto L_0x000d
            L_0x0007:
                java.util.TreeSet r1 = com.facebook.internal.C1461S.m6873c((com.facebook.internal.C1461S.C1465d) r0)     // Catch:{ all -> 0x000f }
                r0.f5091b = r1     // Catch:{ all -> 0x000f }
            L_0x000d:
                monitor-exit(r0)
                return
            L_0x000f:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C1461S.C1465d.m6884a(boolean):void");
        }

        /* renamed from: d */
        private static HashSet<String> m6885d() {
            HashSet<String> hashSet = new HashSet<>();
            hashSet.add("8a3c4b262d721acd49a4bf97d5213199c86fa2b9");
            hashSet.add("a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc");
            hashSet.add("5e8f16062ea3cd2c4a0d547876baa6f38cabf625");
            return hashSet;
        }

        /* renamed from: a */
        public TreeSet<Integer> mo6162a() {
            if (this.f5091b == null) {
                m6884a(false);
            }
            return this.f5091b;
        }

        /* renamed from: a */
        public boolean mo6163a(Context context, String str) {
            String str2 = Build.BRAND;
            int i = context.getApplicationInfo().flags;
            if (str2.startsWith("generic") && (i & 2) != 0) {
                return true;
            }
            try {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo(str, 64).signatures;
                if (signatureArr != null && signatureArr.length > 0) {
                    for (Signature byteArray : signatureArr) {
                        if (!f5090a.contains(C1480ba.m6927a(byteArray.toByteArray()))) {
                            return false;
                        }
                    }
                    return true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract String mo6160b();

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public abstract String mo6161c();
    }

    /* renamed from: com.facebook.internal.S$e */
    public static class C1466e {

        /* renamed from: a */
        private C1465d f5092a;

        /* renamed from: b */
        private int f5093b;

        private C1466e() {
        }

        /* renamed from: a */
        public static C1466e m6890a() {
            C1466e eVar = new C1466e();
            eVar.f5093b = -1;
            return eVar;
        }

        /* renamed from: a */
        public static C1466e m6891a(C1465d dVar, int i) {
            C1466e eVar = new C1466e();
            eVar.f5092a = dVar;
            eVar.f5093b = i;
            return eVar;
        }

        /* renamed from: b */
        public int mo6164b() {
            return this.f5093b;
        }
    }

    /* renamed from: com.facebook.internal.S$f */
    private static class C1467f extends C1465d {
        private C1467f() {
            super((C1460Q) null);
        }

        /* synthetic */ C1467f(C1460Q q) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public String mo6160b() {
            return "com.facebook.katana.ProxyAuth";
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public String mo6161c() {
            return "com.facebook.wakizashi";
        }
    }

    /* renamed from: a */
    public static int m6852a(int i) {
        return m6860a(f5086b, new int[]{i}).mo6164b();
    }

    /* renamed from: a */
    public static int m6853a(TreeSet<Integer> treeSet, int i, int[] iArr) {
        Iterator<Integer> descendingIterator = treeSet.descendingIterator();
        int length = iArr.length - 1;
        int i2 = -1;
        while (descendingIterator.hasNext()) {
            int intValue = descendingIterator.next().intValue();
            i2 = Math.max(i2, intValue);
            while (length >= 0 && iArr[length] > intValue) {
                length--;
            }
            if (length < 0) {
                return -1;
            }
            if (iArr[length] == intValue) {
                if (length % 2 == 0) {
                    return Math.min(i2, i);
                }
                return -1;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static Intent m6854a(Context context) {
        for (C1465d next : f5086b) {
            Intent b = m6865b(context, new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(next.mo6161c()).addCategory("android.intent.category.DEFAULT"), next);
            if (b != null) {
                return b;
            }
        }
        return null;
    }

    /* renamed from: a */
    static Intent m6855a(Context context, Intent intent, C1465d dVar) {
        ResolveInfo resolveActivity;
        if (intent == null || (resolveActivity = context.getPackageManager().resolveActivity(intent, 0)) == null || !dVar.mo6163a(context, resolveActivity.activityInfo.packageName)) {
            return null;
        }
        return intent;
    }

    /* renamed from: a */
    public static Intent m6856a(Context context, String str, Collection<String> collection, String str2, boolean z, boolean z2, C1546b bVar, String str3) {
        C1462a aVar = new C1462a((C1460Q) null);
        Context context2 = context;
        return m6855a(context, m6858a((C1465d) aVar, str, collection, str2, z, z2, bVar, str3), (C1465d) aVar);
    }

    /* renamed from: a */
    public static Intent m6857a(Intent intent, Bundle bundle, C1574p pVar) {
        UUID a = m6863a(intent);
        if (a == null) {
            return null;
        }
        Intent intent2 = new Intent();
        intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", m6872c(intent));
        Bundle bundle2 = new Bundle();
        bundle2.putString("action_id", a.toString());
        if (pVar != null) {
            bundle2.putBundle("error", m6859a(pVar));
        }
        intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
        if (bundle != null) {
            intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
        }
        return intent2;
    }

    /* renamed from: a */
    private static Intent m6858a(C1465d dVar, String str, Collection<String> collection, String str2, boolean z, boolean z2, C1546b bVar, String str3) {
        String b = dVar.mo6160b();
        if (b == null) {
            return null;
        }
        Intent putExtra = new Intent().setClassName(dVar.mo6161c(), b).putExtra("client_id", str);
        if (!C1480ba.m6952a(collection)) {
            putExtra.putExtra("scope", TextUtils.join(",", collection));
        }
        if (!C1480ba.m6958b(str2)) {
            putExtra.putExtra("e2e", str2);
        }
        putExtra.putExtra("state", str3);
        putExtra.putExtra("response_type", "token,signed_request");
        putExtra.putExtra("return_scopes", "true");
        if (z2) {
            putExtra.putExtra("default_audience", bVar.mo6362a());
        }
        putExtra.putExtra("legacy_override", C1601x.m7397j());
        putExtra.putExtra("auth_type", "rerequest");
        return putExtra;
    }

    /* renamed from: a */
    public static Bundle m6859a(C1574p pVar) {
        if (pVar == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("error_description", pVar.toString());
        if (pVar instanceof C1576r) {
            bundle.putString("error_type", "UserCanceled");
        }
        return bundle;
    }

    /* renamed from: a */
    private static C1466e m6860a(List<C1465d> list, int[] iArr) {
        m6874d();
        if (list == null) {
            return C1466e.m6890a();
        }
        for (C1465d next : list) {
            int a = m6853a(next.mo6162a(), m6871c(), iArr);
            if (a != -1) {
                return C1466e.m6891a(next, a);
            }
        }
        return C1466e.m6890a();
    }

    /* renamed from: a */
    public static C1574p m6861a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("error_type");
        if (string == null) {
            string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
        }
        String string2 = bundle.getString("error_description");
        if (string2 == null) {
            string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
        }
        return (string == null || !string.equalsIgnoreCase("UserCanceled")) ? new C1574p(string2) : new C1576r(string2);
    }

    /* renamed from: a */
    public static UUID m6863a(Intent intent) {
        String str;
        if (intent == null) {
            return null;
        }
        if (m6870b(m6872c(intent))) {
            Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
            str = bundleExtra != null ? bundleExtra.getString("action_id") : null;
        } else {
            str = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
        }
        if (str == null) {
            return null;
        }
        try {
            return UUID.fromString(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: b */
    static Intent m6865b(Context context, Intent intent, C1465d dVar) {
        ResolveInfo resolveService;
        if (intent == null || (resolveService = context.getPackageManager().resolveService(intent, 0)) == null || !dVar.mo6163a(context, resolveService.serviceInfo.packageName)) {
            return null;
        }
        return intent;
    }

    /* renamed from: b */
    public static Intent m6866b(Context context, String str, Collection<String> collection, String str2, boolean z, boolean z2, C1546b bVar, String str3) {
        for (C1465d next : f5086b) {
            Context context2 = context;
            Intent a = m6855a(context, m6858a(next, str, collection, str2, z, z2, bVar, str3), next);
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: b */
    private static Uri m6867b(C1465d dVar) {
        return Uri.parse("content://" + dVar.mo6161c() + ".provider.PlatformProvider/versions");
    }

    /* renamed from: b */
    public static Bundle m6868b(Intent intent) {
        return !m6870b(m6872c(intent)) ? intent.getExtras() : intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
    }

    /* renamed from: b */
    public static boolean m6870b(int i) {
        return f5089e.contains(Integer.valueOf(i)) && i >= 20140701;
    }

    /* renamed from: c */
    public static final int m6871c() {
        return f5089e.get(0).intValue();
    }

    /* renamed from: c */
    public static int m6872c(Intent intent) {
        return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        android.util.Log.e(f5085a, "Failed to query content resolver.");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x004f */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.TreeSet<java.lang.Integer> m6873c(com.facebook.internal.C1461S.C1465d r10) {
        /*
            java.lang.String r0 = "Failed to query content resolver."
            java.util.TreeSet r1 = new java.util.TreeSet
            r1.<init>()
            android.content.Context r2 = com.facebook.C1601x.m7386b()
            android.content.ContentResolver r3 = r2.getContentResolver()
            java.lang.String r2 = "version"
            java.lang.String[] r5 = new java.lang.String[]{r2}
            android.net.Uri r4 = m6867b((com.facebook.internal.C1461S.C1465d) r10)
            r9 = 0
            android.content.Context r6 = com.facebook.C1601x.m7386b()     // Catch:{ all -> 0x0072 }
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch:{ all -> 0x0072 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0072 }
            r7.<init>()     // Catch:{ all -> 0x0072 }
            java.lang.String r10 = r10.mo6161c()     // Catch:{ all -> 0x0072 }
            r7.append(r10)     // Catch:{ all -> 0x0072 }
            java.lang.String r10 = ".provider.PlatformProvider"
            r7.append(r10)     // Catch:{ all -> 0x0072 }
            java.lang.String r10 = r7.toString()     // Catch:{ all -> 0x0072 }
            r7 = 0
            android.content.pm.ProviderInfo r10 = r6.resolveContentProvider(r10, r7)     // Catch:{ RuntimeException -> 0x003d }
            goto L_0x0044
        L_0x003d:
            r10 = move-exception
            java.lang.String r6 = f5085a     // Catch:{ all -> 0x0072 }
            android.util.Log.e(r6, r0, r10)     // Catch:{ all -> 0x0072 }
            r10 = r9
        L_0x0044:
            if (r10 == 0) goto L_0x006c
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ NullPointerException | SecurityException -> 0x004f }
            r9 = r10
            goto L_0x0054
        L_0x004f:
            java.lang.String r10 = f5085a     // Catch:{ all -> 0x0072 }
            android.util.Log.e(r10, r0)     // Catch:{ all -> 0x0072 }
        L_0x0054:
            if (r9 == 0) goto L_0x006c
        L_0x0056:
            boolean r10 = r9.moveToNext()     // Catch:{ all -> 0x0072 }
            if (r10 == 0) goto L_0x006c
            int r10 = r9.getColumnIndex(r2)     // Catch:{ all -> 0x0072 }
            int r10 = r9.getInt(r10)     // Catch:{ all -> 0x0072 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0072 }
            r1.add(r10)     // Catch:{ all -> 0x0072 }
            goto L_0x0056
        L_0x006c:
            if (r9 == 0) goto L_0x0071
            r9.close()
        L_0x0071:
            return r1
        L_0x0072:
            r10 = move-exception
            if (r9 == 0) goto L_0x0078
            r9.close()
        L_0x0078:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C1461S.m6873c(com.facebook.internal.S$d):java.util.TreeSet");
    }

    /* renamed from: d */
    public static void m6874d() {
        if (f5088d.compareAndSet(false, true)) {
            C1601x.m7395h().execute(new C1460Q());
        }
    }

    /* renamed from: e */
    private static Map<String, List<C1465d>> m6875e() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1464c((C1460Q) null));
        hashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", f5086b);
        hashMap.put("com.facebook.platform.action.request.FEED_DIALOG", f5086b);
        hashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", f5086b);
        hashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", f5086b);
        hashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
        hashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
        return hashMap;
    }

    /* renamed from: f */
    private static List<C1465d> m6876f() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1463b((C1460Q) null));
        arrayList.add(new C1467f((C1460Q) null));
        return arrayList;
    }
}
