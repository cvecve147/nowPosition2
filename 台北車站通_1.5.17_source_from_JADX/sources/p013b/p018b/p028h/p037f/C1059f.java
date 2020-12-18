package p013b.p018b.p028h.p037f;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpStatus;
import p013b.p018b.p028h.p029a.p030a.C1007a;
import p013b.p018b.p028h.p031b.C1039c;
import p013b.p018b.p028h.p031b.C1048j;
import p013b.p018b.p028h.p037f.C1067k;
import p013b.p018b.p028h.p039h.C1088j;
import p013b.p018b.p028h.p039h.C1100q;
import p013b.p018b.p028h.p039h.C1101r;

/* renamed from: b.b.h.f.f */
public class C1059f {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C1088j<String, Typeface> f3979a = new C1088j<>(16);

    /* renamed from: b */
    private static final C1067k f3980b = new C1067k("fonts", 10, 10000);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final Object f3981c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C1101r<String, ArrayList<C1067k.C1068a<C1062c>>> f3982d = new C1101r<>();

    /* renamed from: e */
    private static final Comparator<byte[]> f3983e = new C1058e();

    /* renamed from: b.b.h.f.f$a */
    public static class C1060a {

        /* renamed from: a */
        private final int f3984a;

        /* renamed from: b */
        private final C1061b[] f3985b;

        public C1060a(int i, C1061b[] bVarArr) {
            this.f3984a = i;
            this.f3985b = bVarArr;
        }

        /* renamed from: a */
        public C1061b[] mo5088a() {
            return this.f3985b;
        }

        /* renamed from: b */
        public int mo5089b() {
            return this.f3984a;
        }
    }

    /* renamed from: b.b.h.f.f$b */
    public static class C1061b {

        /* renamed from: a */
        private final Uri f3986a;

        /* renamed from: b */
        private final int f3987b;

        /* renamed from: c */
        private final int f3988c;

        /* renamed from: d */
        private final boolean f3989d;

        /* renamed from: e */
        private final int f3990e;

        public C1061b(Uri uri, int i, int i2, boolean z, int i3) {
            C1100q.m5687a(uri);
            this.f3986a = uri;
            this.f3987b = i;
            this.f3988c = i2;
            this.f3989d = z;
            this.f3990e = i3;
        }

        /* renamed from: a */
        public int mo5090a() {
            return this.f3990e;
        }

        /* renamed from: b */
        public int mo5091b() {
            return this.f3987b;
        }

        /* renamed from: c */
        public Uri mo5092c() {
            return this.f3986a;
        }

        /* renamed from: d */
        public int mo5093d() {
            return this.f3988c;
        }

        /* renamed from: e */
        public boolean mo5094e() {
            return this.f3989d;
        }
    }

    /* renamed from: b.b.h.f.f$c */
    private static final class C1062c {

        /* renamed from: a */
        final Typeface f3991a;

        /* renamed from: b */
        final int f3992b;

        C1062c(Typeface typeface, int i) {
            this.f3991a = typeface;
            this.f3992b = i;
        }
    }

    /* renamed from: a */
    public static ProviderInfo m5557a(PackageManager packageManager, C1054a aVar, Resources resources) {
        String d = aVar.mo5078d();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(d, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + d);
        } else if (resolveContentProvider.packageName.equals(aVar.mo5079e())) {
            List<byte[]> a = m5563a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(a, f3983e);
            List<List<byte[]>> a2 = m5562a(aVar, resources);
            for (int i = 0; i < a2.size(); i++) {
                ArrayList arrayList = new ArrayList(a2.get(i));
                Collections.sort(arrayList, f3983e);
                if (m5565a(a, (List<byte[]>) arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + d + ", but package was not " + aVar.mo5079e());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0078, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0089, code lost:
        f3980b.mo5100a(r1, new p013b.p018b.p028h.p037f.C1057d(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0093, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface m5558a(android.content.Context r2, p013b.p018b.p028h.p037f.C1054a r3, p013b.p018b.p028h.p029a.p030a.C1014d.C1015a r4, android.os.Handler r5, boolean r6, int r7, int r8) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.mo5077c()
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            b.b.h.h.j<java.lang.String, android.graphics.Typeface> r1 = f3979a
            java.lang.Object r1 = r1.mo5161b(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0028
            if (r4 == 0) goto L_0x0027
            r4.mo3325a((android.graphics.Typeface) r1)
        L_0x0027:
            return r1
        L_0x0028:
            if (r6 == 0) goto L_0x0043
            r1 = -1
            if (r7 != r1) goto L_0x0043
            b.b.h.f.f$c r2 = m5567b(r2, r3, r8)
            if (r4 == 0) goto L_0x0040
            int r3 = r2.f3992b
            if (r3 != 0) goto L_0x003d
            android.graphics.Typeface r3 = r2.f3991a
            r4.mo5013a((android.graphics.Typeface) r3, (android.os.Handler) r5)
            goto L_0x0040
        L_0x003d:
            r4.mo5012a((int) r3, (android.os.Handler) r5)
        L_0x0040:
            android.graphics.Typeface r2 = r2.f3991a
            return r2
        L_0x0043:
            b.b.h.f.b r1 = new b.b.h.f.b
            r1.<init>(r2, r3, r8, r0)
            r2 = 0
            if (r6 == 0) goto L_0x0056
            b.b.h.f.k r3 = f3980b     // Catch:{ InterruptedException -> 0x0055 }
            java.lang.Object r3 = r3.mo5099a(r1, (int) r7)     // Catch:{ InterruptedException -> 0x0055 }
            b.b.h.f.f$c r3 = (p013b.p018b.p028h.p037f.C1059f.C1062c) r3     // Catch:{ InterruptedException -> 0x0055 }
            android.graphics.Typeface r2 = r3.f3991a     // Catch:{ InterruptedException -> 0x0055 }
        L_0x0055:
            return r2
        L_0x0056:
            if (r4 != 0) goto L_0x005a
            r3 = r2
            goto L_0x005f
        L_0x005a:
            b.b.h.f.c r3 = new b.b.h.f.c
            r3.<init>(r4, r5)
        L_0x005f:
            java.lang.Object r4 = f3981c
            monitor-enter(r4)
            b.b.h.h.r<java.lang.String, java.util.ArrayList<b.b.h.f.k$a<b.b.h.f.f$c>>> r5 = f3982d     // Catch:{ all -> 0x0094 }
            boolean r5 = r5.containsKey(r0)     // Catch:{ all -> 0x0094 }
            if (r5 == 0) goto L_0x0079
            if (r3 == 0) goto L_0x0077
            b.b.h.h.r<java.lang.String, java.util.ArrayList<b.b.h.f.k$a<b.b.h.f.f$c>>> r5 = f3982d     // Catch:{ all -> 0x0094 }
            java.lang.Object r5 = r5.get(r0)     // Catch:{ all -> 0x0094 }
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch:{ all -> 0x0094 }
            r5.add(r3)     // Catch:{ all -> 0x0094 }
        L_0x0077:
            monitor-exit(r4)     // Catch:{ all -> 0x0094 }
            return r2
        L_0x0079:
            if (r3 == 0) goto L_0x0088
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0094 }
            r5.<init>()     // Catch:{ all -> 0x0094 }
            r5.add(r3)     // Catch:{ all -> 0x0094 }
            b.b.h.h.r<java.lang.String, java.util.ArrayList<b.b.h.f.k$a<b.b.h.f.f$c>>> r3 = f3982d     // Catch:{ all -> 0x0094 }
            r3.put(r0, r5)     // Catch:{ all -> 0x0094 }
        L_0x0088:
            monitor-exit(r4)     // Catch:{ all -> 0x0094 }
            b.b.h.f.k r3 = f3980b
            b.b.h.f.d r4 = new b.b.h.f.d
            r4.<init>(r0)
            r3.mo5100a(r1, r4)
            return r2
        L_0x0094:
            r2 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0094 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p018b.p028h.p037f.C1059f.m5558a(android.content.Context, b.b.h.f.a, b.b.h.a.a.d$a, android.os.Handler, boolean, int, int):android.graphics.Typeface");
    }

    /* renamed from: a */
    public static C1060a m5559a(Context context, CancellationSignal cancellationSignal, C1054a aVar) {
        ProviderInfo a = m5557a(context.getPackageManager(), aVar, context.getResources());
        return a == null ? new C1060a(1, (C1061b[]) null) : new C1060a(0, m5566a(context, aVar, a.authority, cancellationSignal));
    }

    /* renamed from: a */
    private static List<List<byte[]>> m5562a(C1054a aVar, Resources resources) {
        return aVar.mo5075a() != null ? aVar.mo5075a() : C1007a.m5396a(resources, aVar.mo5076b());
    }

    /* renamed from: a */
    private static List<byte[]> m5563a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Map<Uri, ByteBuffer> m5564a(Context context, C1061b[] bVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (C1061b bVar : bVarArr) {
            if (bVar.mo5090a() == 0) {
                Uri c = bVar.mo5092c();
                if (!hashMap.containsKey(c)) {
                    hashMap.put(c, C1048j.m5536a(context, cancellationSignal, c));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    private static boolean m5565a(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    static C1061b[] m5566a(Context context, C1054a aVar, String str, CancellationSignal cancellationSignal) {
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str2).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
        Cursor cursor = null;
        try {
            cursor = Build.VERSION.SDK_INT > 16 ? context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.mo5080f()}, (String) null, cancellationSignal) : context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.mo5080f()}, (String) null);
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    arrayList2.add(new C1061b(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : HttpStatus.SC_BAD_REQUEST, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i));
                }
                arrayList = arrayList2;
            }
            return (C1061b[]) arrayList.toArray(new C1061b[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C1062c m5567b(Context context, C1054a aVar, int i) {
        try {
            C1060a a = m5559a(context, (CancellationSignal) null, aVar);
            int i2 = -3;
            if (a.mo5089b() == 0) {
                Typeface a2 = C1039c.m5492a(context, (CancellationSignal) null, a.mo5088a(), i);
                if (a2 != null) {
                    i2 = 0;
                }
                return new C1062c(a2, i2);
            }
            if (a.mo5089b() == 1) {
                i2 = -2;
            }
            return new C1062c((Typeface) null, i2);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C1062c((Typeface) null, -1);
        }
    }
}
