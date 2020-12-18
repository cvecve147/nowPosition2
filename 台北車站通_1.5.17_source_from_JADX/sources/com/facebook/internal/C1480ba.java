package com.facebook.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.C1352H;
import com.facebook.C1353I;
import com.facebook.C1574p;
import com.facebook.C1601x;
import com.facebook.GraphRequest;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import org.apache.http.HttpHost;
import org.apache.http.protocol.HTTP;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: com.facebook.internal.ba */
public final class C1480ba {

    /* renamed from: a */
    private static int f5122a = 0;

    /* renamed from: b */
    private static long f5123b = -1;

    /* renamed from: c */
    private static long f5124c = -1;

    /* renamed from: d */
    private static long f5125d = -1;

    /* renamed from: e */
    private static String f5126e = "";

    /* renamed from: f */
    private static String f5127f = "";

    /* renamed from: g */
    private static String f5128g = "NoCarrier";

    /* renamed from: com.facebook.internal.ba$a */
    public interface C1481a {
        /* renamed from: a */
        void mo5992a(C1574p pVar);

        /* renamed from: a */
        void mo5993a(JSONObject jSONObject);
    }

    /* renamed from: com.facebook.internal.ba$b */
    public static class C1482b {

        /* renamed from: a */
        List<String> f5129a;

        /* renamed from: b */
        List<String> f5130b;

        public C1482b(List<String> list, List<String> list2) {
            this.f5129a = list;
            this.f5130b = list2;
        }

        /* renamed from: a */
        public List<String> mo6176a() {
            return this.f5130b;
        }

        /* renamed from: b */
        public List<String> mo6177b() {
            return this.f5129a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m6916a(java.io.InputStream r6, java.io.OutputStream r7) {
        /*
            r0 = 0
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0023 }
            r1.<init>(r6)     // Catch:{ all -> 0x0023 }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0021 }
            r2 = 0
            r3 = r2
        L_0x000c:
            int r4 = r1.read(r0)     // Catch:{ all -> 0x0021 }
            r5 = -1
            if (r4 == r5) goto L_0x0018
            r7.write(r0, r2, r4)     // Catch:{ all -> 0x0021 }
            int r3 = r3 + r4
            goto L_0x000c
        L_0x0018:
            r1.close()
            if (r6 == 0) goto L_0x0020
            r6.close()
        L_0x0020:
            return r3
        L_0x0021:
            r7 = move-exception
            goto L_0x0025
        L_0x0023:
            r7 = move-exception
            r1 = r0
        L_0x0025:
            if (r1 == 0) goto L_0x002a
            r1.close()
        L_0x002a:
            if (r6 == 0) goto L_0x002f
            r6.close()
        L_0x002f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C1480ba.m6916a(java.io.InputStream, java.io.OutputStream):int");
    }

    /* renamed from: a */
    private static long m6917a(double d) {
        return Math.round(d / 1.073741824E9d);
    }

    /* renamed from: a */
    public static long m6918a(Uri uri) {
        Cursor cursor = null;
        try {
            cursor = C1601x.m7386b().getContentResolver().query(uri, (String[]) null, (String) null, (String[]) null, (String) null);
            int columnIndex = cursor.getColumnIndex("_size");
            cursor.moveToFirst();
            return cursor.getLong(columnIndex);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* renamed from: a */
    public static Uri m6919a(String str, String str2, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        return builder.build();
    }

    /* renamed from: a */
    public static C1482b m6920a(JSONObject jSONObject) {
        String optString;
        JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        ArrayList arrayList2 = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            String optString2 = optJSONObject.optString("permission");
            if (!(optString2 == null || optString2.equals("installed") || (optString = optJSONObject.optString("status")) == null)) {
                if (optString.equals("granted")) {
                    arrayList.add(optString2);
                } else if (optString.equals("declined")) {
                    arrayList2.add(optString2);
                }
            }
        }
        return new C1482b(arrayList, arrayList2);
    }

    /* renamed from: a */
    public static Object m6921a(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Object m6922a(JSONObject jSONObject, String str, String str2) {
        Object opt = jSONObject.opt(str);
        if (opt != null && (opt instanceof String)) {
            opt = new JSONTokener((String) opt).nextValue();
        }
        if (opt == null || (opt instanceof JSONObject) || (opt instanceof JSONArray)) {
            return opt;
        }
        if (str2 != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt(str2, opt);
            return jSONObject2;
        }
        throw new C1574p("Got an unexpected non-JSON object.");
    }

    /* renamed from: a */
    public static String m6923a(int i) {
        return new BigInteger(i * 5, new Random()).toString(32);
    }

    /* renamed from: a */
    public static String m6924a(InputStream inputStream) {
        InputStreamReader inputStreamReader;
        BufferedInputStream bufferedInputStream;
        Throwable th;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
                try {
                    StringBuilder sb = new StringBuilder();
                    char[] cArr = new char[2048];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (read != -1) {
                            sb.append(cArr, 0, read);
                        } else {
                            String sb2 = sb.toString();
                            m6940a((Closeable) bufferedInputStream);
                            m6940a((Closeable) inputStreamReader);
                            return sb2;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    m6940a((Closeable) bufferedInputStream);
                    m6940a((Closeable) inputStreamReader);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader = null;
                m6940a((Closeable) bufferedInputStream);
                m6940a((Closeable) inputStreamReader);
                throw th;
            }
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th = th4;
            inputStreamReader = null;
            m6940a((Closeable) bufferedInputStream);
            m6940a((Closeable) inputStreamReader);
            throw th;
        }
    }

    /* renamed from: a */
    private static String m6925a(String str, byte[] bArr) {
        try {
            return m6926a(MessageDigest.getInstance(str), bArr);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static String m6926a(MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            sb.append(Integer.toHexString((b >> 4) & 15));
            sb.append(Integer.toHexString((b >> 0) & 15));
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m6927a(byte[] bArr) {
        return m6925a("SHA-1", bArr);
    }

    /* renamed from: a */
    public static Method m6928a(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Method m6929a(String str, String str2, Class<?>... clsArr) {
        try {
            return m6928a(Class.forName(str), str2, clsArr);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Date m6930a(Bundle bundle, String str, Date date) {
        long j;
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Long) {
            j = ((Long) obj).longValue();
        } else if (!(obj instanceof String)) {
            return null;
        } else {
            try {
                j = Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return j == 0 ? new Date(Long.MAX_VALUE) : new Date(date.getTime() + (j * 1000));
    }

    /* renamed from: a */
    public static List<String> m6931a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static <T> List<T> m6932a(T... tArr) {
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Map<String, String> m6933a(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            hashMap.put(parcel.readString(), parcel.readString());
        }
        return hashMap;
    }

    /* renamed from: a */
    public static JSONObject m6934a(String str) {
        JSONObject a = C1471V.m6903a(str);
        if (a != null) {
            return a;
        }
        C1352H a2 = m6967e(str).mo5950a();
        if (a2.mo5987a() != null) {
            return null;
        }
        return a2.mo5988b();
    }

    /* renamed from: a */
    public static void m6935a(Context context) {
        m6936a(context, "facebook.com");
        m6936a(context, ".facebook.com");
        m6936a(context, "https://facebook.com");
        m6936a(context, "https://.facebook.com");
    }

    /* renamed from: a */
    private static void m6936a(Context context, String str) {
        CookieSyncManager.createInstance(context).sync();
        CookieManager instance = CookieManager.getInstance();
        String cookie = instance.getCookie(str);
        if (cookie != null) {
            for (String split : cookie.split(";")) {
                String[] split2 = split.split("=");
                if (split2.length > 0) {
                    instance.setCookie(str, split2[0].trim() + "=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                }
            }
            instance.removeExpiredCookie();
        }
    }

    /* renamed from: a */
    public static void m6937a(Bundle bundle, String str, Uri uri) {
        if (uri != null) {
            m6938a(bundle, str, uri.toString());
        }
    }

    /* renamed from: a */
    public static void m6938a(Bundle bundle, String str, String str2) {
        if (!m6958b(str2)) {
            bundle.putString(str, str2);
        }
    }

    /* renamed from: a */
    public static void m6939a(Parcel parcel, Map<String, String> map) {
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry next : map.entrySet()) {
            parcel.writeString((String) next.getKey());
            parcel.writeString((String) next.getValue());
        }
    }

    /* renamed from: a */
    public static void m6940a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m6941a(String str, C1481a aVar) {
        JSONObject a = C1471V.m6903a(str);
        if (a != null) {
            aVar.mo5993a(a);
            return;
        }
        C1475Z z = new C1475Z(aVar, str);
        GraphRequest e = m6967e(str);
        e.mo5952a((GraphRequest.C1347b) z);
        e.mo5956b();
    }

    /* renamed from: a */
    public static void m6942a(String str, Exception exc) {
        if (C1601x.m7401n() && str != null && exc != null) {
            Log.d(str, exc.getClass().getSimpleName() + ": " + exc.getMessage());
        }
    }

    /* renamed from: a */
    public static void m6943a(String str, String str2) {
        if (C1601x.m7401n() && str != null && str2 != null) {
            Log.d(str, str2);
        }
    }

    /* renamed from: a */
    public static void m6944a(String str, String str2, Throwable th) {
        if (C1601x.m7401n() && !m6958b(str)) {
            Log.d(str, str2, th);
        }
    }

    /* renamed from: a */
    public static void m6945a(URLConnection uRLConnection) {
        if (uRLConnection != null && (uRLConnection instanceof HttpURLConnection)) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    /* renamed from: a */
    public static void m6946a(JSONObject jSONObject, Context context) {
        String str;
        Locale locale;
        int i;
        int i2;
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        m6969e(context);
        String packageName = context.getPackageName();
        int i3 = -1;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            i3 = packageInfo.versionCode;
            str = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = "";
        }
        jSONArray.put(packageName);
        jSONArray.put(i3);
        jSONArray.put(str);
        jSONArray.put(Build.VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale = context.getResources().getConfiguration().locale;
        } catch (Exception unused2) {
            locale = Locale.getDefault();
        }
        jSONArray.put(locale.getLanguage() + "_" + locale.getCountry());
        jSONArray.put(f5126e);
        jSONArray.put(f5128g);
        double d = 0.0d;
        try {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                i = displayMetrics.widthPixels;
                try {
                    i2 = displayMetrics.heightPixels;
                    try {
                        d = (double) displayMetrics.density;
                    } catch (Exception unused3) {
                    }
                } catch (Exception unused4) {
                    i2 = 0;
                }
                jSONArray.put(i);
                jSONArray.put(i2);
                jSONArray.put(String.format("%.2f", new Object[]{Double.valueOf(d)}));
                jSONArray.put(m6959c());
                jSONArray.put(f5124c);
                jSONArray.put(f5125d);
                jSONArray.put(f5127f);
                jSONObject.put("extinfo", jSONArray.toString());
            }
        } catch (Exception unused5) {
        }
        i = 0;
        i2 = 0;
        jSONArray.put(i);
        jSONArray.put(i2);
        jSONArray.put(String.format("%.2f", new Object[]{Double.valueOf(d)}));
        jSONArray.put(m6959c());
        jSONArray.put(f5124c);
        jSONArray.put(f5125d);
        jSONArray.put(f5127f);
        jSONObject.put("extinfo", jSONArray.toString());
    }

    /* renamed from: a */
    public static void m6947a(JSONObject jSONObject, C1485d dVar, String str, boolean z) {
        if (!(dVar == null || dVar.mo6180c() == null)) {
            jSONObject.put("attribution", dVar.mo6180c());
        }
        if (!(dVar == null || dVar.mo6178a() == null)) {
            jSONObject.put("advertiser_id", dVar.mo6178a());
            jSONObject.put("advertiser_tracking_enabled", !dVar.mo6181d());
        }
        if (!(dVar == null || dVar.mo6179b() == null)) {
            jSONObject.put("installer_package", dVar.mo6179b());
        }
        jSONObject.put("anon_id", str);
        jSONObject.put("application_tracking_enabled", !z);
    }

    /* renamed from: a */
    private static boolean m6948a() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    /* renamed from: a */
    public static boolean m6949a(Bundle bundle, String str, Object obj) {
        String obj2;
        if (obj == null) {
            bundle.remove(str);
            return true;
        } else if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            return true;
        } else if (obj instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj);
            return true;
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return true;
        } else if (obj instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj);
            return true;
        } else if (obj instanceof Integer) {
            bundle.putInt(str, ((Integer) obj).intValue());
            return true;
        } else if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
            return true;
        } else if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return true;
        } else if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
            return true;
        } else {
            if (obj instanceof String) {
                obj2 = (String) obj;
            } else if (!(obj instanceof JSONArray) && !(obj instanceof JSONObject)) {
                return false;
            } else {
                obj2 = obj.toString();
            }
            bundle.putString(str, obj2);
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m6950a(AccessToken accessToken) {
        if (accessToken != null) {
            return accessToken.equals(AccessToken.m6460b());
        }
        return false;
    }

    /* renamed from: a */
    public static <T> boolean m6951a(T t, T t2) {
        return t == null ? t2 == null : t.equals(t2);
    }

    /* renamed from: a */
    public static <T> boolean m6952a(Collection<T> collection) {
        return collection == null || collection.size() == 0;
    }

    /* renamed from: b */
    public static String m6953b(Context context) {
        return context == null ? "null" : context == context.getApplicationContext() ? "unknown" : context.getClass().getSimpleName();
    }

    /* renamed from: b */
    private static String m6954b(String str, String str2) {
        return m6925a(str, str2.getBytes());
    }

    /* renamed from: b */
    public static <T> Collection<T> m6955b(T... tArr) {
        return Collections.unmodifiableCollection(Arrays.asList(tArr));
    }

    /* renamed from: b */
    private static void m6956b() {
        try {
            if (m6948a()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f5125d = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            }
            f5125d = m6917a((double) f5125d);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static boolean m6957b(Uri uri) {
        return uri != null && "content".equalsIgnoreCase(uri.getScheme());
    }

    /* renamed from: b */
    public static boolean m6958b(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: c */
    private static int m6959c() {
        int i = f5122a;
        if (i > 0) {
            return i;
        }
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new C1477aa());
            if (listFiles != null) {
                f5122a = listFiles.length;
            }
        } catch (Exception unused) {
        }
        if (f5122a <= 0) {
            f5122a = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return f5122a;
    }

    /* renamed from: c */
    public static String m6960c(Context context) {
        C1484ca.m6976a((Object) context, "context");
        C1601x.m7390c(context);
        return C1601x.m7389c();
    }

    /* renamed from: c */
    public static String m6961c(String str) {
        return m6954b("MD5", str);
    }

    /* renamed from: c */
    public static boolean m6962c(Uri uri) {
        return uri != null && "file".equalsIgnoreCase(uri.getScheme());
    }

    /* renamed from: d */
    public static Bundle m6963d(String str) {
        Bundle bundle = new Bundle();
        if (!m6958b(str)) {
            for (String split : str.split("&")) {
                String[] split2 = split.split("=");
                try {
                    if (split2.length == 2) {
                        bundle.putString(URLDecoder.decode(split2[0], HTTP.UTF_8), URLDecoder.decode(split2[1], HTTP.UTF_8));
                    } else if (split2.length == 1) {
                        bundle.putString(URLDecoder.decode(split2[0], HTTP.UTF_8), "");
                    }
                } catch (UnsupportedEncodingException e) {
                    m6942a("FacebookSDK", (Exception) e);
                }
            }
        }
        return bundle;
    }

    /* renamed from: d */
    private static void m6964d() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            f5126e = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
            f5127f = timeZone.getID();
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    private static void m6965d(Context context) {
        if (f5128g.equals("NoCarrier")) {
            try {
                f5128g = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    public static boolean m6966d(Uri uri) {
        return uri != null && (HttpHost.DEFAULT_SCHEME_NAME.equalsIgnoreCase(uri.getScheme()) || "https".equalsIgnoreCase(uri.getScheme()) || "fbstaging".equalsIgnoreCase(uri.getScheme()));
    }

    /* renamed from: e */
    private static GraphRequest m6967e(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,name,first_name,middle_name,last_name,link");
        bundle.putString("access_token", str);
        return new GraphRequest((AccessToken) null, "me", bundle, C1353I.GET, (GraphRequest.C1347b) null);
    }

    /* renamed from: e */
    private static void m6968e() {
        try {
            if (m6948a()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f5124c = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
            }
            f5124c = m6917a((double) f5124c);
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    private static void m6969e(Context context) {
        if (f5123b == -1 || System.currentTimeMillis() - f5123b >= 1800000) {
            f5123b = System.currentTimeMillis();
            m6964d();
            m6965d(context);
            m6968e();
            m6956b();
        }
    }
}
