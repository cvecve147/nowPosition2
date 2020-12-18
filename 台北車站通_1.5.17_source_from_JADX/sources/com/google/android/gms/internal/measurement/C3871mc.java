package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.C1993f;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.common.p072c.C1989c;
import com.google.android.gms.common.util.C2083e;
import com.google.android.gms.common.util.C2084f;
import com.google.android.gms.measurement.AppMeasurement;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.security.auth.x500.X500Principal;

/* renamed from: com.google.android.gms.internal.measurement.mc */
public final class C3871mc extends C3802Wa {

    /* renamed from: c */
    private static final String[] f11554c = {"firebase_", "google_", "ga_"};

    /* renamed from: d */
    private SecureRandom f11555d;

    /* renamed from: e */
    private final AtomicLong f11556e = new AtomicLong(0);

    /* renamed from: f */
    private int f11557f;

    /* renamed from: g */
    private Integer f11558g = null;

    C3871mc(C3715Aa aa) {
        super(aa);
    }

    /* renamed from: a */
    public static C3717Ac m15508a(C3923zc zcVar, String str) {
        for (C3717Ac ac : zcVar.f11747d) {
            if (ac.f11014d.equals(str)) {
                return ac;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static Object m15509a(int i, Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return m15510a(String.valueOf(obj), i, z);
            }
            return null;
        }
    }

    /* renamed from: a */
    public static String m15510a(String str, int i, boolean z) {
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    /* renamed from: a */
    public static String m15511a(String str, String[] strArr, String[] strArr2) {
        C2061y.m9067a(strArr);
        C2061y.m9067a(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            if (m15529c(str, strArr[i])) {
                return strArr2[i];
            }
        }
        return null;
    }

    /* renamed from: a */
    static MessageDigest m15512a(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    private static void m15513a(Bundle bundle, Object obj) {
        C2061y.m9067a(bundle);
        if (obj == null) {
            return;
        }
        if ((obj instanceof String) || (obj instanceof CharSequence)) {
            bundle.putLong("_el", (long) String.valueOf(obj).length());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0008, code lost:
        r3 = r1.getServiceInfo(new android.content.ComponentName(r3, r4), 0);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m15514a(android.content.Context r3, java.lang.String r4) {
        /*
            r0 = 0
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r1 != 0) goto L_0x0008
            return r0
        L_0x0008:
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0019 }
            r2.<init>(r3, r4)     // Catch:{ NameNotFoundException -> 0x0019 }
            android.content.pm.ServiceInfo r3 = r1.getServiceInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r3 == 0) goto L_0x0019
            boolean r3 = r3.enabled     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r3 == 0) goto L_0x0019
            r3 = 1
            return r3
        L_0x0019:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3871mc.m15514a(android.content.Context, java.lang.String):boolean");
    }

    /* renamed from: a */
    public static boolean m15515a(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    /* renamed from: a */
    private static boolean m15516a(Bundle bundle, int i) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i);
        return true;
    }

    /* renamed from: a */
    static boolean m15517a(zzeu zzeu, zzdz zzdz) {
        C2061y.m9067a(zzeu);
        C2061y.m9067a(zzdz);
        return !TextUtils.isEmpty(zzdz.f11753b);
    }

    /* renamed from: a */
    private final boolean m15518a(String str, String str2, int i, Object obj, boolean z) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                String valueOf = String.valueOf(obj);
                if (valueOf.codePointCount(0, valueOf.length()) > i) {
                    mo10385b().mo10576B().mo10595a("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                    return false;
                }
            } else if ((obj instanceof Bundle) && z) {
                return true;
            } else {
                if ((obj instanceof Parcelable[]) && z) {
                    for (Parcelable parcelable : (Parcelable[]) obj) {
                        if (!(parcelable instanceof Bundle)) {
                            mo10385b().mo10576B().mo10594a("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str2);
                            return false;
                        }
                    }
                    return true;
                } else if (!(obj instanceof ArrayList) || !z) {
                    return false;
                } else {
                    ArrayList arrayList = (ArrayList) obj;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        if (!(obj2 instanceof Bundle)) {
                            mo10385b().mo10576B().mo10594a("All ArrayList elements must be of type Bundle. Value type, name", obj2.getClass(), str2);
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m15519a(long[] jArr, int i) {
        if (i >= (jArr.length << 6)) {
            return false;
        }
        return ((1 << (i % 64)) & jArr[i / 64]) != 0;
    }

    /* renamed from: a */
    static byte[] m15520a(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: a */
    public static long[] m15521a(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    jArr[i] = jArr[i] | (1 << i2);
                }
            }
        }
        return jArr;
    }

    /* renamed from: a */
    public static Bundle[] m15522a(Object obj) {
        Object[] array;
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            array = Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else if (!(obj instanceof ArrayList)) {
            return null;
        } else {
            ArrayList arrayList = (ArrayList) obj;
            array = arrayList.toArray(new Bundle[arrayList.size()]);
        }
        return (Bundle[]) array;
    }

    /* renamed from: a */
    static C3717Ac[] m15523a(C3717Ac[] acArr, String str, Object obj) {
        for (C3717Ac ac : acArr) {
            if (str.equals(ac.f11014d)) {
                ac.f11016f = null;
                ac.f11015e = null;
                ac.f11018h = null;
                if (obj instanceof Long) {
                    ac.f11016f = (Long) obj;
                } else if (obj instanceof String) {
                    ac.f11015e = (String) obj;
                } else if (obj instanceof Double) {
                    ac.f11018h = (Double) obj;
                }
                return acArr;
            }
        }
        C3717Ac[] acArr2 = new C3717Ac[(acArr.length + 1)];
        System.arraycopy(acArr, 0, acArr2, 0, acArr.length);
        C3717Ac ac2 = new C3717Ac();
        ac2.f11014d = str;
        if (obj instanceof Long) {
            ac2.f11016f = (Long) obj;
        } else if (obj instanceof String) {
            ac2.f11015e = (String) obj;
        } else if (obj instanceof Double) {
            ac2.f11018h = (Double) obj;
        }
        acArr2[acArr.length] = ac2;
        return acArr2;
    }

    /* renamed from: b */
    public static Object m15524b(C3923zc zcVar, String str) {
        C3717Ac a = m15508a(zcVar, str);
        if (a == null) {
            return null;
        }
        String str2 = a.f11015e;
        if (str2 != null) {
            return str2;
        }
        Long l = a.f11016f;
        if (l != null) {
            return l;
        }
        Double d = a.f11018h;
        if (d != null) {
            return d;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0037 A[Catch:{ IOException | ClassNotFoundException -> 0x0040 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003c A[Catch:{ IOException | ClassNotFoundException -> 0x0040 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m15525b(java.lang.Object r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0032 }
            r1.<init>()     // Catch:{ all -> 0x0032 }
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0032 }
            r2.<init>(r1)     // Catch:{ all -> 0x0032 }
            r2.writeObject(r4)     // Catch:{ all -> 0x002f }
            r2.flush()     // Catch:{ all -> 0x002f }
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch:{ all -> 0x002f }
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x002f }
            byte[] r1 = r1.toByteArray()     // Catch:{ all -> 0x002f }
            r3.<init>(r1)     // Catch:{ all -> 0x002f }
            r4.<init>(r3)     // Catch:{ all -> 0x002f }
            java.lang.Object r1 = r4.readObject()     // Catch:{ all -> 0x002d }
            r2.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0040 }
            r4.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0040 }
            return r1
        L_0x002d:
            r1 = move-exception
            goto L_0x0035
        L_0x002f:
            r1 = move-exception
            r4 = r0
            goto L_0x0035
        L_0x0032:
            r1 = move-exception
            r4 = r0
            r2 = r4
        L_0x0035:
            if (r2 == 0) goto L_0x003a
            r2.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0040 }
        L_0x003a:
            if (r4 == 0) goto L_0x003f
            r4.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0040 }
        L_0x003f:
            throw r1     // Catch:{ IOException | ClassNotFoundException -> 0x0040 }
        L_0x0040:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3871mc.m15525b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: b */
    static boolean m15526b(String str) {
        C2061y.m9076b(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* renamed from: c */
    static long m15527c(byte[] bArr) {
        C2061y.m9067a(bArr);
        int i = 0;
        C2061y.m9077b(bArr.length > 0);
        long j = 0;
        int length = bArr.length - 1;
        while (length >= 0 && length >= bArr.length - 8) {
            j += (((long) bArr[length]) & 255) << i;
            i += 8;
            length--;
        }
        return j;
    }

    /* renamed from: c */
    private final boolean m15528c(Context context, String str) {
        C3809Y y;
        String str2;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo b = C1989c.m8748b(context).mo7521b(str, 64);
            if (b == null || b.signatures == null || b.signatures.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(b.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e) {
            e = e;
            y = mo10385b().mo10585y();
            str2 = "Error obtaining certificate";
            y.mo10593a(str2, e);
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            e = e2;
            y = mo10385b().mo10585y();
            str2 = "Package name not found";
            y.mo10593a(str2, e);
            return true;
        }
    }

    /* renamed from: c */
    public static boolean m15529c(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    /* renamed from: d */
    private final boolean m15530d(String str, String str2) {
        if (str2 == null) {
            mo10385b().mo10585y().mo10593a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            mo10385b().mo10585y().mo10593a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt) || codePointAt == 95) {
                int length = str2.length();
                int charCount = Character.charCount(codePointAt);
                while (charCount < length) {
                    int codePointAt2 = str2.codePointAt(charCount);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        charCount += Character.charCount(codePointAt2);
                    } else {
                        mo10385b().mo10585y().mo10594a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            mo10385b().mo10585y().mo10594a("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
    }

    /* renamed from: g */
    public static boolean m15531g(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* renamed from: i */
    static boolean m15532i(String str) {
        return str != null && str.matches("(\\+|-)?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b A[ADDED_TO_REGION] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m15533j(java.lang.String r5) {
        /*
            com.google.android.gms.common.internal.C2061y.m9076b((java.lang.String) r5)
            int r0 = r5.hashCode()
            r1 = 94660(0x171c4, float:1.32647E-40)
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == r1) goto L_0x002e
            r1 = 95025(0x17331, float:1.33158E-40)
            if (r0 == r1) goto L_0x0024
            r1 = 95027(0x17333, float:1.33161E-40)
            if (r0 == r1) goto L_0x001a
            goto L_0x0038
        L_0x001a:
            java.lang.String r0 = "_ui"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0038
            r5 = r4
            goto L_0x0039
        L_0x0024:
            java.lang.String r0 = "_ug"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0038
            r5 = r3
            goto L_0x0039
        L_0x002e:
            java.lang.String r0 = "_in"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0038
            r5 = r2
            goto L_0x0039
        L_0x0038:
            r5 = -1
        L_0x0039:
            if (r5 == 0) goto L_0x0040
            if (r5 == r4) goto L_0x0040
            if (r5 == r3) goto L_0x0040
            return r2
        L_0x0040:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3871mc.m15533j(java.lang.String):boolean");
    }

    /* renamed from: l */
    private static int m15534l(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        return "_id".equals(str) ? 256 : 36;
    }

    /* renamed from: A */
    public final int mo10776A() {
        if (this.f11558g == null) {
            this.f11558g = Integer.valueOf(C1993f.m8774a().mo7535b(getContext()) / 1000);
        }
        return this.f11558g.intValue();
    }

    /* renamed from: a */
    public final Bundle mo10777a(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str4 = uri.getQueryParameter("utm_campaign");
                str3 = uri.getQueryParameter("utm_source");
                str2 = uri.getQueryParameter("utm_medium");
                str = uri.getQueryParameter("gclid");
            } else {
                str4 = null;
                str3 = null;
                str2 = null;
                str = null;
            }
            if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("campaign", str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("source", str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("medium", str2);
            }
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("gclid", str);
            }
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("term", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("content", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("aclid", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("cp1", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("anid", queryParameter5);
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            mo10385b().mo10576B().mo10593a("Install referrer url isn't a hierarchical URI", e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Bundle mo10778a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object a = mo10782a(str, bundle.get(str));
                if (a == null) {
                    mo10385b().mo10576B().mo10593a("Param value can't be null", mo10453n().mo10558b(str));
                } else {
                    mo10784a(bundle2, str, a);
                }
            }
        }
        return bundle2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
        if (mo10789a("event param", 40, r14) == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0065, code lost:
        if (mo10789a("event param", 40, r14) == false) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0126  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo10779a(java.lang.String r18, android.os.Bundle r19, java.util.List<java.lang.String> r20, boolean r21, boolean r22) {
        /*
            r17 = this;
            r6 = r17
            r7 = r19
            r8 = r20
            r9 = 0
            if (r7 == 0) goto L_0x016a
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>(r7)
            java.util.Set r0 = r19.keySet()
            java.util.Iterator r11 = r0.iterator()
            r13 = 0
        L_0x0017:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x016b
            java.lang.Object r0 = r11.next()
            r14 = r0
            java.lang.String r14 = (java.lang.String) r14
            r15 = 40
            r0 = 3
            if (r8 == 0) goto L_0x0032
            boolean r1 = r8.contains(r14)
            if (r1 != 0) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r1 = 0
            goto L_0x0069
        L_0x0032:
            r1 = 14
            java.lang.String r2 = "event param"
            if (r21 == 0) goto L_0x004f
            boolean r3 = r6.mo10795b((java.lang.String) r2, (java.lang.String) r14)
            if (r3 != 0) goto L_0x0040
        L_0x003e:
            r3 = r0
            goto L_0x0050
        L_0x0040:
            boolean r3 = r6.mo10790a((java.lang.String) r2, (java.lang.String[]) r9, (java.lang.String) r14)
            if (r3 != 0) goto L_0x0048
            r3 = r1
            goto L_0x0050
        L_0x0048:
            boolean r3 = r6.mo10789a((java.lang.String) r2, (int) r15, (java.lang.String) r14)
            if (r3 != 0) goto L_0x004f
            goto L_0x003e
        L_0x004f:
            r3 = 0
        L_0x0050:
            if (r3 != 0) goto L_0x0068
            boolean r3 = r6.m15530d(r2, r14)
            if (r3 != 0) goto L_0x005a
        L_0x0058:
            r1 = r0
            goto L_0x0069
        L_0x005a:
            boolean r3 = r6.mo10790a((java.lang.String) r2, (java.lang.String[]) r9, (java.lang.String) r14)
            if (r3 != 0) goto L_0x0061
            goto L_0x0069
        L_0x0061:
            boolean r1 = r6.mo10789a((java.lang.String) r2, (int) r15, (java.lang.String) r14)
            if (r1 != 0) goto L_0x0030
            goto L_0x0058
        L_0x0068:
            r1 = r3
        L_0x0069:
            java.lang.String r5 = "_ev"
            r4 = 1
            if (r1 == 0) goto L_0x0082
            boolean r2 = m15516a((android.os.Bundle) r10, (int) r1)
            if (r2 == 0) goto L_0x0163
            java.lang.String r2 = m15510a((java.lang.String) r14, (int) r15, (boolean) r4)
            r10.putString(r5, r2)
            if (r1 != r0) goto L_0x0163
            m15513a((android.os.Bundle) r10, (java.lang.Object) r14)
            goto L_0x0163
        L_0x0082:
            java.lang.Object r3 = r7.get(r14)
            r17.mo10451d()
            if (r22 == 0) goto L_0x00c0
            boolean r0 = r3 instanceof android.os.Parcelable[]
            if (r0 == 0) goto L_0x0094
            r0 = r3
            android.os.Parcelable[] r0 = (android.os.Parcelable[]) r0
            int r0 = r0.length
            goto L_0x009f
        L_0x0094:
            boolean r0 = r3 instanceof java.util.ArrayList
            if (r0 == 0) goto L_0x00b8
            r0 = r3
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
        L_0x009f:
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r0 <= r1) goto L_0x00b8
            com.google.android.gms.internal.measurement.W r1 = r17.mo10385b()
            com.google.android.gms.internal.measurement.Y r1 = r1.mo10576B()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "param"
            java.lang.String r4 = "Parameter array is too long; discarded. Value kind, name, array length"
            r1.mo10595a(r4, r2, r14, r0)
            r0 = 0
            goto L_0x00b9
        L_0x00b8:
            r0 = 1
        L_0x00b9:
            if (r0 != 0) goto L_0x00c0
            r0 = 17
            r12 = r5
            r9 = 1
            goto L_0x0106
        L_0x00c0:
            com.google.android.gms.internal.measurement.w r0 = r17.mo10456r()
            com.google.android.gms.internal.measurement.Q r1 = r17.mo10568i()
            java.lang.String r1 = r1.mo10520z()
            boolean r0 = r0.mo11007f(r1)
            if (r0 == 0) goto L_0x00d8
            boolean r0 = m15531g(r18)
            if (r0 != 0) goto L_0x00de
        L_0x00d8:
            boolean r0 = m15531g(r14)
            if (r0 == 0) goto L_0x00f3
        L_0x00de:
            r4 = 256(0x100, float:3.59E-43)
            java.lang.String r1 = "param"
            r0 = r17
            r2 = r14
            r16 = r3
            r3 = r4
            r9 = 1
            r4 = r16
            r12 = r5
        L_0x00ec:
            r5 = r22
            boolean r0 = r0.m15518a((java.lang.String) r1, (java.lang.String) r2, (int) r3, (java.lang.Object) r4, (boolean) r5)
            goto L_0x0101
        L_0x00f3:
            r16 = r3
            r12 = r5
            r9 = 1
            r3 = 100
            java.lang.String r1 = "param"
            r0 = r17
            r2 = r14
            r4 = r16
            goto L_0x00ec
        L_0x0101:
            if (r0 == 0) goto L_0x0105
            r0 = 0
            goto L_0x0106
        L_0x0105:
            r0 = 4
        L_0x0106:
            if (r0 == 0) goto L_0x0126
            boolean r1 = r12.equals(r14)
            if (r1 != 0) goto L_0x0126
            boolean r0 = m15516a((android.os.Bundle) r10, (int) r0)
            if (r0 == 0) goto L_0x0163
            java.lang.String r0 = m15510a((java.lang.String) r14, (int) r15, (boolean) r9)
            r10.putString(r12, r0)
            java.lang.Object r0 = r7.get(r14)
            m15513a((android.os.Bundle) r10, (java.lang.Object) r0)
            goto L_0x0163
        L_0x0123:
            r9 = 0
            goto L_0x0017
        L_0x0126:
            boolean r0 = m15526b((java.lang.String) r14)
            if (r0 == 0) goto L_0x0167
            int r13 = r13 + 1
            r0 = 25
            if (r13 <= r0) goto L_0x0167
            r0 = 48
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Event can't contain more than 25 params"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.google.android.gms.internal.measurement.W r1 = r17.mo10385b()
            com.google.android.gms.internal.measurement.Y r1 = r1.mo10585y()
            com.google.android.gms.internal.measurement.U r2 = r17.mo10453n()
            r3 = r18
            java.lang.String r2 = r2.mo10557a((java.lang.String) r3)
            com.google.android.gms.internal.measurement.U r4 = r17.mo10453n()
            java.lang.String r4 = r4.mo10551a((android.os.Bundle) r7)
            r1.mo10594a(r0, r2, r4)
            r0 = 5
            m15516a((android.os.Bundle) r10, (int) r0)
        L_0x0163:
            r10.remove(r14)
            goto L_0x0123
        L_0x0167:
            r3 = r18
            goto L_0x0123
        L_0x016a:
            r10 = 0
        L_0x016b:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3871mc.mo10779a(java.lang.String, android.os.Bundle, java.util.List, boolean, boolean):android.os.Bundle");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        mo10385b().mo10585y().mo10592a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends android.os.Parcelable> T mo10780a(byte[] r5, android.os.Parcelable.Creator<T> r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ a -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ a -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ a -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ a -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ a -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002d
        L_0x001c:
            com.google.android.gms.internal.measurement.W r5 = r4.mo10385b()     // Catch:{ all -> 0x001a }
            com.google.android.gms.internal.measurement.Y r5 = r5.mo10585y()     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.mo10592a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002d:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3871mc.mo10780a(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2083e mo10382a() {
        return super.mo10382a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final zzeu mo10781a(String str, Bundle bundle, String str2, long j, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (mo10797c(str) == 0) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putString("_o", str2);
            String str3 = str;
            return new zzeu(str3, new zzer(mo10778a(mo10779a(str3, bundle2, (List<String>) C2084f.m9118a("_o"), false, false))), str2, j);
        }
        mo10385b().mo10585y().mo10593a("Invalid conditional property event name", mo10453n().mo10559c(str));
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final Object mo10782a(String str, Object obj) {
        boolean z;
        int i = 256;
        if ("_ev".equals(str)) {
            z = true;
        } else {
            if (!m15531g(str)) {
                i = 100;
            }
            z = false;
        }
        return m15509a(i, obj, z);
    }

    /* renamed from: a */
    public final void mo10783a(int i, String str, String str2, int i2) {
        mo10787a((String) null, i, str, str2, i2);
    }

    /* renamed from: a */
    public final void mo10784a(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (str != null) {
                mo10385b().mo10577C().mo10594a("Not putting event parameter. Invalid value type. name, type", mo10453n().mo10558b(str), obj != null ? obj.getClass().getSimpleName() : null);
            }
        }
    }

    /* renamed from: a */
    public final void mo10785a(C3717Ac ac, Object obj) {
        C2061y.m9067a(obj);
        ac.f11015e = null;
        ac.f11016f = null;
        ac.f11018h = null;
        if (obj instanceof String) {
            ac.f11015e = (String) obj;
        } else if (obj instanceof Long) {
            ac.f11016f = (Long) obj;
        } else if (obj instanceof Double) {
            ac.f11018h = (Double) obj;
        } else {
            mo10385b().mo10585y().mo10593a("Ignoring invalid (type) event param value", obj);
        }
    }

    /* renamed from: a */
    public final void mo10786a(C3733Ec ec, Object obj) {
        C2061y.m9067a(obj);
        ec.f11091f = null;
        ec.f11092g = null;
        ec.f11094i = null;
        if (obj instanceof String) {
            ec.f11091f = (String) obj;
        } else if (obj instanceof Long) {
            ec.f11092g = (Long) obj;
        } else if (obj instanceof Double) {
            ec.f11094i = (Double) obj;
        } else {
            mo10385b().mo10585y().mo10593a("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* renamed from: a */
    public final void mo10787a(String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        m15516a(bundle, i);
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        this.f11325a.mo10397v().mo10623b("auto", "_err", bundle);
    }

    /* renamed from: a */
    public final boolean mo10788a(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(mo10382a().mo7725a() - j) > j2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo10789a(String str, int i, String str2) {
        if (str2 == null) {
            mo10385b().mo10585y().mo10593a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            mo10385b().mo10585y().mo10595a("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo10790a(String str, String[] strArr, String str2) {
        boolean z;
        boolean z2;
        if (str2 == null) {
            mo10385b().mo10585y().mo10593a("Name is required and can't be null. Type", str);
            return false;
        }
        C2061y.m9067a(str2);
        int i = 0;
        while (true) {
            String[] strArr2 = f11554c;
            if (i >= strArr2.length) {
                z = false;
                break;
            } else if (str2.startsWith(strArr2[i])) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            mo10385b().mo10585y().mo10594a("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        }
        if (strArr != null) {
            C2061y.m9067a(strArr);
            int i2 = 0;
            while (true) {
                if (i2 >= strArr.length) {
                    z2 = false;
                    break;
                } else if (m15529c(str2, strArr[i2])) {
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                mo10385b().mo10585y().mo10594a("Name is reserved. Type, name", str, str2);
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final byte[] mo10791a(C3721Bc bc) {
        try {
            byte[] bArr = new byte[bc.mo10758d()];
            C3824b a = C3824b.m15344a(bArr, 0, bArr.length);
            bc.mo10405a(a);
            a.mo10662a();
            return bArr;
        } catch (IOException e) {
            mo10385b().mo10585y().mo10593a("Data loss. Failed to serialize batch", e);
            return null;
        }
    }

    /* renamed from: a */
    public final byte[] mo10792a(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            mo10385b().mo10585y().mo10593a("Failed to gzip content", e);
            throw e;
        }
    }

    /* renamed from: b */
    public final int mo10793b(String str, Object obj) {
        return "_ldl".equals(str) ? m15518a("user property referrer", str, m15534l(str), obj, false) : m15518a("user property", str, m15534l(str), obj, false) ? 0 : 7;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final long mo10794b(Context context, String str) {
        mo10451d();
        C2061y.m9067a(context);
        C2061y.m9076b(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest a = m15512a("MD5");
        if (a == null) {
            mo10385b().mo10585y().mo10592a("Could not get MD5 instance");
            return -1;
        }
        if (packageManager != null) {
            try {
                if (!m15528c(context, str)) {
                    PackageInfo b = C1989c.m8748b(context).mo7521b(getContext().getPackageName(), 64);
                    if (b.signatures != null && b.signatures.length > 0) {
                        return m15527c(a.digest(b.signatures[0].toByteArray()));
                    }
                    mo10385b().mo10576B().mo10592a("Could not get signatures");
                    return -1;
                }
            } catch (PackageManager.NameNotFoundException e) {
                mo10385b().mo10585y().mo10593a("Package name not found", e);
            }
        }
        return 0;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C3801W mo10385b() {
        return super.mo10385b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo10795b(String str, String str2) {
        if (str2 == null) {
            mo10385b().mo10585y().mo10593a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            mo10385b().mo10585y().mo10593a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                mo10385b().mo10585y().mo10594a("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    mo10385b().mo10585y().mo10594a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: b */
    public final byte[] mo10796b(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            mo10385b().mo10585y().mo10593a("Failed to ungzip content", e);
            throw e;
        }
    }

    /* renamed from: c */
    public final int mo10797c(String str) {
        if (!m15530d("event", str)) {
            return 2;
        }
        if (!mo10790a("event", AppMeasurement.C3996a.f11903a, str)) {
            return 13;
        }
        return !mo10789a("event", 40, str) ? 2 : 0;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3909wa mo10386c() {
        return super.mo10386c();
    }

    /* renamed from: c */
    public final Object mo10798c(String str, Object obj) {
        int l;
        boolean z;
        if ("_ldl".equals(str)) {
            l = m15534l(str);
            z = true;
        } else {
            l = m15534l(str);
            z = false;
        }
        return m15509a(l, obj, z);
    }

    /* renamed from: d */
    public final int mo10799d(String str) {
        if (!mo10795b("user property", str)) {
            return 6;
        }
        if (!mo10790a("user property", AppMeasurement.C4000e.f11907a, str)) {
            return 15;
        }
        return !mo10789a("user property", 24, str) ? 6 : 0;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo10451d() {
        super.mo10451d();
    }

    /* renamed from: e */
    public final int mo10800e(String str) {
        if (!m15530d("user property", str)) {
            return 6;
        }
        if (!mo10790a("user property", AppMeasurement.C4000e.f11907a, str)) {
            return 15;
        }
        return !mo10789a("user property", 24, str) ? 6 : 0;
    }

    /* renamed from: f */
    public final boolean mo10801f(String str) {
        if (TextUtils.isEmpty(str)) {
            mo10385b().mo10585y().mo10592a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        C2061y.m9067a(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        mo10385b().mo10585y().mo10593a("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", str);
        return false;
    }

    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    /* renamed from: h */
    public final boolean mo10802h(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return mo10456r().mo11014w().equals(str);
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C3778Q mo10568i() {
        return super.mo10568i();
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C3734F mo10452j() {
        return super.mo10452j();
    }

    /* renamed from: k */
    public final boolean mo10803k(String str) {
        mo10451d();
        if (C1989c.m8748b(getContext()).mo7515a(str) == 0) {
            return true;
        }
        mo10385b().mo10579E().mo10593a("Permission not granted", str);
        return false;
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C3793U mo10453n() {
        return super.mo10453n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C3871mc mo10454o() {
        return super.mo10454o();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C3849ha mo10455q() {
        return super.mo10455q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C3908w mo10456r() {
        return super.mo10456r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final boolean mo10457u() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo10518v() {
        mo10451d();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                mo10385b().mo10576B().mo10592a("Utils falling back to Random for random id");
            }
        }
        this.f11556e.set(nextLong);
    }

    /* renamed from: y */
    public final long mo10804y() {
        long andIncrement;
        long j;
        if (this.f11556e.get() == 0) {
            synchronized (this.f11556e) {
                long nextLong = new Random(System.nanoTime() ^ mo10382a().mo7725a()).nextLong();
                int i = this.f11557f + 1;
                this.f11557f = i;
                j = nextLong + ((long) i);
            }
            return j;
        }
        synchronized (this.f11556e) {
            this.f11556e.compareAndSet(-1, 1);
            andIncrement = this.f11556e.getAndIncrement();
        }
        return andIncrement;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final SecureRandom mo10805z() {
        mo10451d();
        if (this.f11555d == null) {
            this.f11555d = new SecureRandom();
        }
        return this.f11555d;
    }
}
