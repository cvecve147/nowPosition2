package p208e.p209a.p210a.p211a.p212a.p214b;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.provider.Settings;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;
import p208e.p209a.p210a.p211a.C6199f;
import p208e.p209a.p210a.p211a.C6211p;

/* renamed from: e.a.a.a.a.b.l */
public class C6080l {

    /* renamed from: a */
    private static Boolean f16997a;

    /* renamed from: b */
    private static final char[] f16998b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: c */
    private static long f16999c = -1;

    /* renamed from: d */
    public static final Comparator<File> f17000d = new C6079k();

    /* renamed from: e.a.a.a.a.b.l$a */
    enum C6081a {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;
        

        /* renamed from: k */
        private static final Map<String, C6081a> f17011k = null;

        static {
            f17011k = new HashMap(4);
            f17011k.put("armeabi-v7a", ARMV7);
            f17011k.put("armeabi", ARMV6);
            f17011k.put("arm64-v8a", ARM64);
            f17011k.put("x86", X86_32);
        }

        /* renamed from: a */
        static C6081a m23067a() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                C6199f.m23420f().mo16269d("Fabric", "Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            C6081a aVar = f17011k.get(str.toLowerCase(Locale.US));
            return aVar == null ? UNKNOWN : aVar;
        }
    }

    /* renamed from: a */
    public static int m23025a() {
        return C6081a.m23067a().ordinal();
    }

    /* renamed from: a */
    public static int m23026a(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, m23060h(context));
    }

    /* renamed from: a */
    public static int m23027a(Context context, boolean z) {
        Float e = m23057e(context);
        if (!z || e == null) {
            return 1;
        }
        if (((double) e.floatValue()) >= 99.0d) {
            return 3;
        }
        return ((double) e.floatValue()) < 99.0d ? 2 : 0;
    }

    /* renamed from: a */
    public static long m23028a(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    /* renamed from: a */
    public static long m23029a(String str) {
        StatFs statFs = new StatFs(str);
        long blockSize = (long) statFs.getBlockSize();
        return (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
    }

    /* renamed from: a */
    static long m23030a(String str, String str2, int i) {
        return Long.parseLong(str.split(str2)[0].trim()) * ((long) i);
    }

    /* renamed from: a */
    public static ActivityManager.RunningAppProcessInfo m23031a(String str, Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.processName.equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m23032a(File file, String str) {
        BufferedReader bufferedReader;
        String str2 = null;
        if (file.exists()) {
            try {
                bufferedReader = new BufferedReader(new FileReader(file), 1024);
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        String[] split = Pattern.compile("\\s*:\\s*").split(readLine, 2);
                        if (split.length > 1 && split[0].equals(str)) {
                            str2 = split[1];
                            break;
                        }
                    } catch (Exception e) {
                        e = e;
                        try {
                            C6199f.m23420f().mo16266b("Fabric", "Error parsing " + file, e);
                            m23042a((Closeable) bufferedReader, "Failed to close system file reader.");
                            return str2;
                        } catch (Throwable th) {
                            th = th;
                        }
                    }
                }
            } catch (Exception e2) {
                e = e2;
                bufferedReader = null;
                C6199f.m23420f().mo16266b("Fabric", "Error parsing " + file, e);
                m23042a((Closeable) bufferedReader, "Failed to close system file reader.");
                return str2;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
                m23042a((Closeable) bufferedReader, "Failed to close system file reader.");
                throw th;
            }
            m23042a((Closeable) bufferedReader, "Failed to close system file reader.");
        }
        return str2;
    }

    /* renamed from: a */
    public static String m23033a(InputStream inputStream) {
        return m23034a(inputStream, "SHA-1");
    }

    /* renamed from: a */
    private static String m23034a(InputStream inputStream, String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return m23036a(instance.digest());
                }
                instance.update(bArr, 0, read);
            }
        } catch (Exception e) {
            C6199f.m23420f().mo16266b("Fabric", "Could not calculate hash for app icon.", e);
            return "";
        }
    }

    /* renamed from: a */
    private static String m23035a(String str, String str2) {
        return m23037a(str.getBytes(), str2);
    }

    /* renamed from: a */
    public static String m23036a(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = f16998b;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: a */
    private static String m23037a(byte[] bArr, String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            instance.update(bArr);
            return m23036a(instance.digest());
        } catch (NoSuchAlgorithmException e) {
            C6211p f = C6199f.m23420f();
            f.mo16266b("Fabric", "Could not create hashing algorithm: " + str + ", returning empty string.", e);
            return "";
        }
    }

    /* renamed from: a */
    public static String m23038a(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str.replace("-", "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (String append : arrayList) {
            sb.append(append);
        }
        String sb2 = sb.toString();
        if (sb2.length() > 0) {
            return m23053c(sb2);
        }
        return null;
    }

    /* renamed from: a */
    public static void m23039a(Context context, int i, String str, String str2) {
        if (m23063k(context)) {
            C6199f.m23420f().mo16260a(i, "Fabric", str2);
        }
    }

    /* renamed from: a */
    public static void m23040a(Context context, String str, Throwable th) {
        if (m23063k(context)) {
            C6199f.m23420f().mo16265b("Fabric", str);
        }
    }

    /* renamed from: a */
    public static void m23041a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m23042a(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                C6199f.m23420f().mo16266b("Fabric", str, e);
            }
        }
    }

    /* renamed from: a */
    public static void m23043a(Flushable flushable, String str) {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (IOException e) {
                C6199f.m23420f().mo16266b("Fabric", str, e);
            }
        }
    }

    /* renamed from: a */
    public static void m23044a(InputStream inputStream, OutputStream outputStream, byte[] bArr) {
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static boolean m23045a(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    /* renamed from: a */
    public static boolean m23046a(Context context, String str, boolean z) {
        Resources resources;
        if (!(context == null || (resources = context.getResources()) == null)) {
            int a = m23026a(context, str, "bool");
            if (a > 0) {
                return resources.getBoolean(a);
            }
            int a2 = m23026a(context, str, "string");
            if (a2 > 0) {
                return Boolean.parseBoolean(context.getString(a2));
            }
        }
        return z;
    }

    /* renamed from: b */
    public static synchronized long m23047b() {
        long j;
        synchronized (C6080l.class) {
            if (f16999c == -1) {
                long j2 = 0;
                String a = m23032a(new File("/proc/meminfo"), "MemTotal");
                if (!TextUtils.isEmpty(a)) {
                    String upperCase = a.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith("KB")) {
                            j2 = m23030a(upperCase, "KB", 1024);
                        } else if (upperCase.endsWith("MB")) {
                            j2 = m23030a(upperCase, "MB", 1048576);
                        } else if (upperCase.endsWith("GB")) {
                            j2 = m23030a(upperCase, "GB", 1073741824);
                        } else {
                            C6211p f = C6199f.m23420f();
                            f.mo16269d("Fabric", "Unexpected meminfo format while computing RAM: " + upperCase);
                        }
                    } catch (NumberFormatException e) {
                        C6211p f2 = C6199f.m23420f();
                        f2.mo16266b("Fabric", "Unexpected meminfo format while computing RAM: " + upperCase, e);
                    }
                }
                f16999c = j2;
            }
            j = f16999c;
        }
        return j;
    }

    /* renamed from: b */
    public static String m23048b(Context context, String str) {
        int a = m23026a(context, str, "string");
        return a > 0 ? context.getString(a) : "";
    }

    /* renamed from: b */
    public static String m23049b(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return useDelimiter.hasNext() ? useDelimiter.next() : "";
    }

    /* renamed from: b */
    public static boolean m23050b(Context context) {
        if (!m23045a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    /* renamed from: b */
    public static boolean m23051b(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: c */
    public static String m23052c(Context context) {
        InputStream inputStream;
        String str = null;
        try {
            inputStream = context.getResources().openRawResource(m23056d(context));
            try {
                String a = m23033a(inputStream);
                if (!m23051b(a)) {
                    str = a;
                }
                m23042a((Closeable) inputStream, "Failed to close icon input stream.");
                return str;
            } catch (Exception e) {
                e = e;
                try {
                    C6199f.m23420f().mo16266b("Fabric", "Could not calculate hash for app icon.", e);
                    m23042a((Closeable) inputStream, "Failed to close icon input stream.");
                    return null;
                } catch (Throwable th) {
                    th = th;
                    m23042a((Closeable) inputStream, "Failed to close icon input stream.");
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            inputStream = null;
            C6199f.m23420f().mo16266b("Fabric", "Could not calculate hash for app icon.", e);
            m23042a((Closeable) inputStream, "Failed to close icon input stream.");
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            m23042a((Closeable) inputStream, "Failed to close icon input stream.");
            throw th;
        }
    }

    /* renamed from: c */
    public static String m23053c(String str) {
        return m23035a(str, "SHA-1");
    }

    /* renamed from: c */
    public static void m23054c(Context context, String str) {
        if (m23063k(context)) {
            C6199f.m23420f().mo16269d("Fabric", str);
        }
    }

    /* renamed from: c */
    public static boolean m23055c() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    /* renamed from: d */
    public static int m23056d(Context context) {
        return context.getApplicationContext().getApplicationInfo().icon;
    }

    /* renamed from: e */
    public static Float m23057e(Context context) {
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return null;
        }
        return Float.valueOf(((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
    }

    /* renamed from: f */
    public static int m23058f(Context context) {
        int i = m23064l(context) ? 1 : 0;
        if (m23065m(context)) {
            i |= 2;
        }
        return m23055c() ? i | 4 : i;
    }

    /* renamed from: g */
    public static boolean m23059g(Context context) {
        return !m23064l(context) && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null;
    }

    /* renamed from: h */
    public static String m23060h(Context context) {
        int i = context.getApplicationContext().getApplicationInfo().icon;
        return i > 0 ? context.getResources().getResourcePackageName(i) : context.getPackageName();
    }

    /* renamed from: i */
    public static SharedPreferences m23061i(Context context) {
        return context.getSharedPreferences("com.crashlytics.prefs", 0);
    }

    /* renamed from: j */
    public static boolean m23062j(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    /* renamed from: k */
    public static boolean m23063k(Context context) {
        if (f16997a == null) {
            f16997a = Boolean.valueOf(m23046a(context, "com.crashlytics.Trace", false));
        }
        return f16997a.booleanValue();
    }

    /* renamed from: l */
    public static boolean m23064l(Context context) {
        return "sdk".equals(Build.PRODUCT) || "google_sdk".equals(Build.PRODUCT) || Settings.Secure.getString(context.getContentResolver(), "android_id") == null;
    }

    /* renamed from: m */
    public static boolean m23065m(Context context) {
        boolean l = m23064l(context);
        String str = Build.TAGS;
        if ((!l && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        return !l && new File("/system/xbin/su").exists();
    }

    /* renamed from: n */
    public static String m23066n(Context context) {
        int a = m23026a(context, "io.fabric.android.build_id", "string");
        if (a == 0) {
            a = m23026a(context, "com.crashlytics.android.build_id", "string");
        }
        if (a == 0) {
            return null;
        }
        String string = context.getResources().getString(a);
        C6211p f = C6199f.m23420f();
        f.mo16269d("Fabric", "Build ID is: " + string);
        return string;
    }
}
