package p101d.p122f.p123a.p125b;

import android.content.Context;
import java.io.FileInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import p208e.p209a.p210a.p211a.p212a.p213a.C6064d;

/* renamed from: d.f.a.b.j */
public class C5343j implements C6064d<String> {
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0044 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String m20606a(android.content.Context r8) {
        /*
            r7 = this;
            java.lang.String r0 = "Failed to close the APK file"
            java.lang.String r1 = "Beta"
            long r2 = java.lang.System.nanoTime()
            r4 = 0
            java.lang.String r5 = "io.crash.air"
            java.util.zip.ZipInputStream r4 = r7.mo14749a(r8, r5)     // Catch:{ NameNotFoundException -> 0x0044, FileNotFoundException -> 0x0034, IOException -> 0x0024 }
            java.lang.String r8 = r7.mo14748a((java.util.zip.ZipInputStream) r4)     // Catch:{ NameNotFoundException -> 0x0044, FileNotFoundException -> 0x0034, IOException -> 0x0024 }
            if (r4 == 0) goto L_0x005d
            r4.close()     // Catch:{ IOException -> 0x0019 }
            goto L_0x005d
        L_0x0019:
            r4 = move-exception
            e.a.a.a.p r5 = p208e.p209a.p210a.p211a.C6199f.m23420f()
            r5.mo16266b(r1, r0, r4)
            goto L_0x005d
        L_0x0022:
            r8 = move-exception
            goto L_0x0087
        L_0x0024:
            r8 = move-exception
            e.a.a.a.p r5 = p208e.p209a.p210a.p211a.C6199f.m23420f()     // Catch:{ all -> 0x0022 }
            java.lang.String r6 = "Failed to read the APK file"
            r5.mo16266b(r1, r6, r8)     // Catch:{ all -> 0x0022 }
            if (r4 == 0) goto L_0x005b
            r4.close()     // Catch:{ IOException -> 0x0053 }
            goto L_0x005b
        L_0x0034:
            r8 = move-exception
            e.a.a.a.p r5 = p208e.p209a.p210a.p211a.C6199f.m23420f()     // Catch:{ all -> 0x0022 }
            java.lang.String r6 = "Failed to find the APK file"
            r5.mo16266b(r1, r6, r8)     // Catch:{ all -> 0x0022 }
            if (r4 == 0) goto L_0x005b
            r4.close()     // Catch:{ IOException -> 0x0053 }
            goto L_0x005b
        L_0x0044:
            e.a.a.a.p r8 = p208e.p209a.p210a.p211a.C6199f.m23420f()     // Catch:{ all -> 0x0022 }
            java.lang.String r5 = "Beta by Crashlytics app is not installed"
            r8.mo16269d(r1, r5)     // Catch:{ all -> 0x0022 }
            if (r4 == 0) goto L_0x005b
            r4.close()     // Catch:{ IOException -> 0x0053 }
            goto L_0x005b
        L_0x0053:
            r8 = move-exception
            e.a.a.a.p r4 = p208e.p209a.p210a.p211a.C6199f.m23420f()
            r4.mo16266b(r1, r0, r8)
        L_0x005b:
            java.lang.String r8 = ""
        L_0x005d:
            long r4 = java.lang.System.nanoTime()
            long r4 = r4 - r2
            double r2 = (double) r4
            r4 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r2 = r2 / r4
            e.a.a.a.p r0 = p208e.p209a.p210a.p211a.C6199f.m23420f()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Beta device token load took "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = "ms"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r0.mo16269d(r1, r2)
            return r8
        L_0x0087:
            if (r4 == 0) goto L_0x0095
            r4.close()     // Catch:{ IOException -> 0x008d }
            goto L_0x0095
        L_0x008d:
            r2 = move-exception
            e.a.a.a.p r3 = p208e.p209a.p210a.p211a.C6199f.m23420f()
            r3.mo16266b(r1, r0, r2)
        L_0x0095:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p122f.p123a.p125b.C5343j.m20606a(android.content.Context):java.lang.String");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo14748a(ZipInputStream zipInputStream) {
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        if (nextEntry == null) {
            return "";
        }
        String name = nextEntry.getName();
        return name.startsWith("assets/com.crashlytics.android.beta/dirfactor-device-token=") ? name.substring(59, name.length() - 1) : "";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ZipInputStream mo14749a(Context context, String str) {
        return new ZipInputStream(new FileInputStream(context.getPackageManager().getApplicationInfo(str, 0).sourceDir));
    }
}
