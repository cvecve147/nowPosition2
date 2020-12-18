package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.C1634b;
import com.google.android.gms.ads.C1645e;
import com.google.android.gms.ads.C1669h;
import com.google.android.gms.ads.p065a.C1632d;
import com.google.android.gms.ads.p065a.C1633e;
import com.google.android.gms.ads.p068d.C1644b;
import com.google.android.gms.common.C1993f;
import com.google.android.gms.common.C2064k;
import com.google.android.gms.common.util.C2092n;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.rf */
public final class C3432rf {

    /* renamed from: a */
    public static final Handler f10110a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private static final String f10111b = C1645e.class.getName();

    /* renamed from: c */
    private static final String f10112c = C1669h.class.getName();

    /* renamed from: d */
    private static final String f10113d = C1632d.class.getName();

    /* renamed from: e */
    private static final String f10114e = C1633e.class.getName();

    /* renamed from: f */
    private static final String f10115f = C1644b.class.getName();

    /* renamed from: g */
    private static final String f10116g = C1634b.class.getName();

    /* renamed from: a */
    public static int m13595a(Context context, int i) {
        return m13596a(context.getResources().getDisplayMetrics(), i);
    }

    /* renamed from: a */
    public static int m13596a(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, displayMetrics);
    }

    /* renamed from: a */
    public static String m13597a(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
        if (string == null || m13604a()) {
            string = "emulator";
        }
        return m13598a(string);
    }

    /* renamed from: a */
    public static String m13598a(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(str.getBytes());
                return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, instance.digest())});
            } catch (NoSuchAlgorithmException unused) {
                i++;
            } catch (ArithmeticException unused2) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m13599a(StackTraceElement[] stackTraceElementArr, String str) {
        int i;
        String str2;
        int i2 = 0;
        while (true) {
            i = i2 + 1;
            if (i >= stackTraceElementArr.length) {
                str2 = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            String className = stackTraceElement.getClassName();
            if (!"loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) || (!f10111b.equalsIgnoreCase(className) && !f10112c.equalsIgnoreCase(className) && !f10113d.equalsIgnoreCase(className) && !f10114e.equalsIgnoreCase(className) && !f10115f.equalsIgnoreCase(className) && !f10116g.equalsIgnoreCase(className))) {
                i2 = i;
            }
        }
        str2 = stackTraceElementArr[i].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb = new StringBuilder();
            int i3 = 2;
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                while (true) {
                    int i4 = i3 - 1;
                    if (i3 <= 0 || !stringTokenizer.hasMoreElements()) {
                        str = sb.toString();
                    } else {
                        sb.append(".");
                        sb.append(stringTokenizer.nextToken());
                        i3 = i4;
                    }
                }
                str = sb.toString();
            }
            if (str2 == null || str2.contains(str)) {
                return null;
            }
            return str2;
        }
        return null;
    }

    /* renamed from: a */
    public static Throwable m13600a(Throwable th) {
        if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7911j)).booleanValue()) {
            return th;
        }
        LinkedList linkedList = new LinkedList();
        while (th != null) {
            linkedList.push(th);
            th = th.getCause();
        }
        Throwable th2 = null;
        while (!linkedList.isEmpty()) {
            Throwable th3 = (Throwable) linkedList.pop();
            StackTraceElement[] stackTrace = th3.getStackTrace();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
            boolean z = false;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (m13609b(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                    z = true;
                } else {
                    String className = stackTraceElement.getClassName();
                    if (!(!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java.")))) {
                        stackTraceElement = new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1);
                    }
                    arrayList.add(stackTraceElement);
                }
            }
            if (z) {
                th2 = th2 == null ? new Throwable(th3.getMessage()) : new Throwable(th3.getMessage(), th2);
                th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            }
        }
        return th2;
    }

    /* renamed from: a */
    public static void m13601a(Context context, String str, String str2, Bundle bundle, boolean z, C3518uf ufVar) {
        if (z) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            bundle.putString("os", Build.VERSION.RELEASE);
            bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
            bundle.putString("appid", applicationContext.getPackageName());
            if (str == null) {
                int b = C1993f.m8774a().mo7535b(context);
                StringBuilder sb = new StringBuilder(20);
                sb.append(b);
                sb.append(".12451000");
                str = sb.toString();
            }
            bundle.putString("js", str);
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", str2);
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        ufVar.mo7980a(appendQueryParameter.toString());
    }

    /* renamed from: a */
    private final void m13602a(ViewGroup viewGroup, zzjn zzjn, String str, int i, int i2) {
        if (viewGroup.getChildCount() == 0) {
            Context context = viewGroup.getContext();
            TextView textView = new TextView(context);
            textView.setGravity(17);
            textView.setText(str);
            textView.setTextColor(i);
            textView.setBackgroundColor(i2);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(i);
            int a = m13595a(context, 3);
            frameLayout.addView(textView, new FrameLayout.LayoutParams(zzjn.f10898f - a, zzjn.f10895c - a, 17));
            viewGroup.addView(frameLayout, zzjn.f10898f, zzjn.f10895c);
        }
    }

    /* renamed from: a */
    public static void m13603a(boolean z, HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setReadTimeout(60000);
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setUseCaches(false);
    }

    /* renamed from: a */
    public static boolean m13604a() {
        return Build.DEVICE.startsWith("generic");
    }

    /* renamed from: b */
    public static int m13605b(Context context, int i) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return m13606b(displayMetrics, i);
    }

    /* renamed from: b */
    public static int m13606b(DisplayMetrics displayMetrics, int i) {
        return Math.round(((float) i) / displayMetrics.density);
    }

    /* renamed from: b */
    public static String m13607b(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            return null;
        }
        return Settings.Secure.getString(contentResolver, "android_id");
    }

    /* renamed from: b */
    public static boolean m13608b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: b */
    public static boolean m13609b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith((String) C3390pt.m13458f().mo8515a(C2558Nu.f7917k))) {
            return true;
        }
        try {
            return Class.forName(str).isAnnotationPresent(C2478La.class);
        } catch (Exception e) {
            String valueOf = String.valueOf(str);
            C2227Cf.m9530a(valueOf.length() != 0 ? "Fail to check class type for class ".concat(valueOf) : new String("Fail to check class type for class "), e);
            return false;
        }
    }

    /* renamed from: c */
    public static String m13610c() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(byteArray);
                instance.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(instance.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return bigInteger;
    }

    /* renamed from: c */
    public static boolean m13611c(Context context) {
        return C1993f.m8774a().mo7526a(context, (int) C2064k.GOOGLE_PLAY_SERVICES_VERSION_CODE) == 0;
    }

    /* renamed from: d */
    public static int m13612d(Context context) {
        return DynamiteModule.m9191b(context, ModuleDescriptor.MODULE_ID);
    }

    /* renamed from: e */
    public static int m13613e(Context context) {
        return DynamiteModule.m9183a(context, ModuleDescriptor.MODULE_ID);
    }

    /* renamed from: f */
    public static boolean m13614f(Context context) {
        int a = C1993f.m8774a().mo7526a(context, (int) C2064k.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        return a == 0 || a == 2;
    }

    /* renamed from: g */
    public static boolean m13615g(Context context) {
        if (context.getResources().getConfiguration().orientation != 2) {
            return false;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return ((int) (((float) displayMetrics.heightPixels) / displayMetrics.density)) < 600;
    }

    @TargetApi(17)
    /* renamed from: h */
    public static boolean m13616h(Context context) {
        int i;
        int i2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (C2092n.m9164e()) {
            defaultDisplay.getRealMetrics(displayMetrics);
            i2 = displayMetrics.heightPixels;
            i = displayMetrics.widthPixels;
        } else {
            try {
                i2 = ((Integer) Display.class.getMethod("getRawHeight", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                i = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
            } catch (Exception unused) {
            }
        }
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics.heightPixels == i2 && displayMetrics.widthPixels == i;
    }

    /* renamed from: i */
    public static int m13617i(Context context) {
        int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo9965a(Context context, String str, String str2, Bundle bundle, boolean z) {
        m13601a(context, (String) null, str2, bundle, true, new C3461sf(this));
    }

    /* renamed from: a */
    public final void mo9966a(ViewGroup viewGroup, zzjn zzjn, String str) {
        m13602a(viewGroup, zzjn, str, -16777216, -1);
    }

    /* renamed from: a */
    public final void mo9967a(ViewGroup viewGroup, zzjn zzjn, String str, String str2) {
        C2227Cf.m9536d(str2);
        m13602a(viewGroup, zzjn, str, -65536, -16777216);
    }
}
