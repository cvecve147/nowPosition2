package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.common.p072c.C1989c;
import com.google.android.gms.common.util.C2085g;
import com.google.android.gms.common.util.C2090l;
import com.google.android.gms.common.util.C2092n;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import org.apache.http.HttpHeaders;
import org.apache.http.protocol.HTTP;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.ge */
public final class C3114ge {

    /* renamed from: a */
    public static final Handler f9351a = new C2885Zd(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f9352b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f9353c = true;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f9354d;

    /* renamed from: e */
    private boolean f9355e = false;

    /* renamed from: f */
    private boolean f9356f = false;

    /* renamed from: g */
    private Pattern f9357g;

    /* renamed from: h */
    private Pattern f9358h;

    /* renamed from: a */
    public static Bitmap m12393a(View view) {
        view.setDrawingCacheEnabled(true);
        Bitmap createBitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        return createBitmap;
    }

    /* renamed from: a */
    public static Bundle m12394a(C2325Fr fr) {
        String str;
        String str2;
        String str3;
        if (fr == null) {
            return null;
        }
        if (!((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7954qa)).booleanValue()) {
            if (!((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7966sa)).booleanValue()) {
                return null;
            }
        }
        if (C1697X.m7702i().mo8333m().mo9146b() && C1697X.m7702i().mo8333m().mo9152d()) {
            return null;
        }
        if (fr.mo8099d()) {
            fr.mo8094a();
        }
        C3673zr c = fr.mo8098c();
        if (c != null) {
            str3 = c.mo10271b();
            str2 = c.mo10274d();
            str = c.mo10275e();
            if (str3 != null) {
                C1697X.m7702i().mo8333m().mo9138a(str3);
            }
            if (str != null) {
                C1697X.m7702i().mo8333m().mo9144b(str);
            }
        } else {
            str3 = C1697X.m7702i().mo8333m().mo9147c();
            str = C1697X.m7702i().mo8333m().mo9153e();
            str2 = null;
        }
        Bundle bundle = new Bundle(1);
        if (str != null) {
            if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7966sa)).booleanValue() && !C1697X.m7702i().mo8333m().mo9152d()) {
                bundle.putString("v_fp_vertical", str);
            }
        }
        if (str3 != null) {
            if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7954qa)).booleanValue() && !C1697X.m7702i().mo8333m().mo9146b()) {
                bundle.putString("fingerprint", str3);
                if (!str3.equals(str2)) {
                    bundle.putString("v_fp", str2);
                }
            }
        }
        if (!bundle.isEmpty()) {
            return bundle;
        }
        return null;
    }

    /* renamed from: a */
    public static DisplayMetrics m12395a(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* renamed from: a */
    public static WebResourceResponse m12396a(HttpURLConnection httpURLConnection) {
        C1697X.m7698e();
        String contentType = httpURLConnection.getContentType();
        String str = "";
        String trim = TextUtils.isEmpty(contentType) ? str : contentType.split(";")[0].trim();
        C1697X.m7698e();
        String contentType2 = httpURLConnection.getContentType();
        if (!TextUtils.isEmpty(contentType2)) {
            String[] split = contentType2.split(";");
            if (split.length != 1) {
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    if (split[i].trim().startsWith("charset")) {
                        String[] split2 = split[i].trim().split("=");
                        if (split2.length > 1) {
                            str = split2[1].trim();
                            break;
                        }
                    }
                    i++;
                }
            }
        }
        String str2 = str;
        Map headerFields = httpURLConnection.getHeaderFields();
        HashMap hashMap = new HashMap(headerFields.size());
        for (Map.Entry entry : headerFields.entrySet()) {
            if (!(entry.getKey() == null || entry.getValue() == null || ((List) entry.getValue()).size() <= 0)) {
                hashMap.put((String) entry.getKey(), (String) ((List) entry.getValue()).get(0));
            }
        }
        return C1697X.m7700g().mo9714a(trim, str2, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
    }

    /* renamed from: a */
    public static PopupWindow m12397a(View view, int i, int i2, boolean z) {
        return new PopupWindow(view, i, i2, false);
    }

    /* renamed from: a */
    public static String m12399a() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: a */
    public static String m12400a(Context context, View view, zzjn zzjn) {
        if (!((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7753Ia)).booleanValue()) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", zzjn.f10897e);
            jSONObject2.put("height", zzjn.f10894b);
            jSONObject.put("size", jSONObject2);
            jSONObject.put("activity", m12445l(context));
            if (!zzjn.f10896d) {
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent != null) {
                        int i = -1;
                        if (parent instanceof ViewGroup) {
                            i = ((ViewGroup) parent).indexOfChild(view);
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(SVGParser.XML_STYLESHEET_ATTR_TYPE, parent.getClass().getName());
                        jSONObject3.put("index_of_child", i);
                        jSONArray.put(jSONObject3);
                    }
                    view = (parent == null || !(parent instanceof View)) ? null : (View) parent;
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put("parents", jSONArray);
                }
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            C2227Cf.m9535c("Fail to get view hierarchy json", e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m12402a(InputStreamReader inputStreamReader) {
        StringBuilder sb = new StringBuilder(8192);
        char[] cArr = new char[2048];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, read);
        }
    }

    /* renamed from: a */
    public static String m12403a(String str) {
        return Uri.parse(str).buildUpon().query((String) null).build().toString();
    }

    /* renamed from: a */
    public static Map<String, String> m12404a(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String next : C1697X.m7700g().mo9718a(uri)) {
            hashMap.put(next, uri.getQueryParameter(next));
        }
        return hashMap;
    }

    /* renamed from: a */
    private final JSONArray m12405a(Collection<?> collection) {
        JSONArray jSONArray = new JSONArray();
        for (Object a : collection) {
            m12413a(jSONArray, (Object) a);
        }
        return jSONArray;
    }

    /* renamed from: a */
    private final JSONObject m12406a(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            m12414a(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m12407a(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    @TargetApi(18)
    /* renamed from: a */
    public static void m12408a(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7832Vd)).booleanValue()) {
                m12425b(context, intent);
            }
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(uri2).length() + 26);
            sb.append("Opening ");
            sb.append(uri2);
            sb.append(" in a new browser.");
            C2227Cf.m9532b(sb.toString());
        } catch (ActivityNotFoundException e) {
            C2227Cf.m9533b("No browser is found.", e);
        }
    }

    /* renamed from: a */
    public static void m12409a(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        m12410a(context, str, (List<String>) arrayList);
    }

    /* renamed from: a */
    public static void m12410a(Context context, String str, List<String> list) {
        for (String ffVar : list) {
            new C3086ff(context, str, ffVar).mo8107a();
        }
    }

    /* renamed from: a */
    public static void m12411a(Context context, Throwable th) {
        if (context != null) {
            boolean z = false;
            try {
                z = ((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7905i)).booleanValue();
            } catch (IllegalStateException unused) {
            }
            if (z) {
                C2085g.m9140a(context, th);
            }
        }
    }

    /* renamed from: a */
    public static void m12412a(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            C3057ee.m12269a(runnable);
        }
    }

    /* renamed from: a */
    private final void m12413a(JSONArray jSONArray, Object obj) {
        Object a;
        if (obj instanceof Bundle) {
            a = m12406a((Bundle) obj);
        } else if (obj instanceof Map) {
            a = mo9447a((Map<String, ?>) (Map) obj);
        } else if (obj instanceof Collection) {
            a = m12405a((Collection<?>) (Collection) obj);
        } else if (obj instanceof Object[]) {
            JSONArray jSONArray2 = new JSONArray();
            for (Object a2 : (Object[]) obj) {
                m12413a(jSONArray2, a2);
            }
            jSONArray.put(jSONArray2);
            return;
        } else {
            jSONArray.put(obj);
            return;
        }
        jSONArray.put(a);
    }

    /* renamed from: a */
    private final void m12414a(JSONObject jSONObject, String str, Object obj) {
        Collection asList;
        Object a;
        if (obj instanceof Bundle) {
            a = m12406a((Bundle) obj);
        } else if (obj instanceof Map) {
            a = mo9447a((Map<String, ?>) (Map) obj);
        } else {
            if (obj instanceof Collection) {
                if (str == null) {
                    str = "null";
                }
                asList = (Collection) obj;
            } else if (obj instanceof Object[]) {
                asList = Arrays.asList((Object[]) obj);
            } else {
                jSONObject.put(str, obj);
                return;
            }
            a = m12405a((Collection<?>) asList);
        }
        jSONObject.put(str, a);
    }

    /* renamed from: a */
    private static boolean m12415a(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    @TargetApi(24)
    /* renamed from: a */
    public static boolean m12416a(Activity activity, Configuration configuration) {
        C3390pt.m13453a();
        int a = C3432rf.m13595a((Context) activity, configuration.screenHeightDp);
        int a2 = C3432rf.m13595a((Context) activity, configuration.screenWidthDp);
        DisplayMetrics a3 = m12395a((WindowManager) activity.getApplicationContext().getSystemService("window"));
        int i = a3.heightPixels;
        int i2 = a3.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int round = ((int) Math.round(((double) activity.getResources().getDisplayMetrics().density) + 0.5d)) * ((Integer) C3390pt.m13458f().mo8515a(C2558Nu.f7898ge)).intValue();
        return m12415a(i, a + dimensionPixelSize, round) && m12415a(i2, a2, round);
    }

    /* renamed from: a */
    public static boolean m12417a(Context context) {
        String str;
        ActivityInfo activityInfo;
        boolean z;
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        try {
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
            if (resolveActivity == null || (activityInfo = resolveActivity.activityInfo) == null) {
                str = "Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.";
            } else {
                if ((activityInfo.configChanges & 16) == 0) {
                    C2227Cf.m9536d(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[]{"keyboard"}));
                    z = false;
                } else {
                    z = true;
                }
                if ((resolveActivity.activityInfo.configChanges & 32) == 0) {
                    C2227Cf.m9536d(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[]{"keyboardHidden"}));
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & 128) == 0) {
                    C2227Cf.m9536d(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[]{"orientation"}));
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & 256) == 0) {
                    C2227Cf.m9536d(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[]{"screenLayout"}));
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & 512) == 0) {
                    C2227Cf.m9536d(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[]{"uiMode"}));
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & 1024) == 0) {
                    C2227Cf.m9536d(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[]{"screenSize"}));
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & 2048) != 0) {
                    return z;
                }
                str = String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[]{"smallestScreenSize"});
            }
            C2227Cf.m9536d(str);
            return false;
        } catch (Exception e) {
            C2227Cf.m9535c("Could not verify that com.google.android.gms.ads.AdActivity is declared in AndroidManifest.xml", e);
            C1697X.m7702i().mo8319a((Throwable) e, "AdUtil.hasAdActivity");
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m12418a(Context context, String str) {
        return C1989c.m8748b(context).mo7516a(str, context.getPackageName()) == 0;
    }

    /* renamed from: a */
    public static boolean m12420a(ClassLoader classLoader, Class<?> cls, String str) {
        try {
            return cls.isAssignableFrom(Class.forName(str, false, classLoader));
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static int[] m12421a(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        if (window == null || (findViewById = window.findViewById(16908290)) == null) {
            return m12437e();
        }
        return new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    /* renamed from: b */
    public static int m12422b(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
            sb.append("Could not parse value:");
            sb.append(valueOf);
            C2227Cf.m9536d(sb.toString());
            return 0;
        }
    }

    /* renamed from: b */
    public static Bitmap m12423b(View view) {
        if (view == null) {
            return null;
        }
        Bitmap f = m12438f(view);
        return f == null ? m12436e(view) : f;
    }

    /* renamed from: b */
    public static String m12424b() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    @TargetApi(18)
    /* renamed from: b */
    public static void m12425b(Context context, Intent intent) {
        if (intent != null && C2092n.m9165f()) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            extras.putBinder("android.support.customtabs.extra.SESSION", (IBinder) null);
            extras.putString("com.android.browser.application_id", context.getPackageName());
            intent.putExtras(extras);
        }
    }

    /* renamed from: b */
    public static void m12426b(Context context, String str, String str2) {
        try {
            FileOutputStream openFileOutput = context.openFileOutput(str, 0);
            openFileOutput.write(str2.getBytes(HTTP.UTF_8));
            openFileOutput.close();
        } catch (Exception e) {
            C2227Cf.m9533b("Error writing to file in internal storage.", e);
        }
    }

    /* renamed from: c */
    public static Bundle m12427c() {
        Bundle bundle = new Bundle();
        try {
            if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7776M)).booleanValue()) {
                Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
                Debug.getMemoryInfo(memoryInfo);
                bundle.putParcelable("debug_memory_info", memoryInfo);
            }
            if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7782N)).booleanValue()) {
                Runtime runtime = Runtime.getRuntime();
                bundle.putLong("runtime_free_memory", runtime.freeMemory());
                bundle.putLong("runtime_max_memory", runtime.maxMemory());
                bundle.putLong("runtime_total_memory", runtime.totalMemory());
            }
            bundle.putInt("web_view_count", C1697X.m7702i().mo8332l());
        } catch (Exception e) {
            C2227Cf.m9535c("Unable to gather memory stats", e);
        }
        return bundle;
    }

    /* renamed from: c */
    public static WebResourceResponse m12428c(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", C1697X.m7698e().mo9454b(context, str));
            hashMap.put(HttpHeaders.CACHE_CONTROL, "max-stale=3600");
            String str3 = (String) new C2632Qe(context).mo8742a(str2, (Map<String, String>) hashMap).get(60, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", HTTP.UTF_8, new ByteArrayInputStream(str3.getBytes(HTTP.UTF_8)));
            }
            return null;
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
            C2227Cf.m9535c("Could not fetch MRAID JS.", e);
            return null;
        }
    }

    /* renamed from: c */
    public static String m12429c(Context context, String str) {
        try {
            return new String(C2090l.m9158a(context.openFileInput(str), true), HTTP.UTF_8);
        } catch (IOException unused) {
            C2227Cf.m9532b("Error reading from internal storage.");
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m12430c(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 == 0) goto L_0x0012
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0012
            android.app.Activity r2 = (android.app.Activity) r2
            goto L_0x0013
        L_0x0012:
            r2 = r0
        L_0x0013:
            r1 = 0
            if (r2 != 0) goto L_0x0017
            return r1
        L_0x0017:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L_0x001e
            goto L_0x0022
        L_0x001e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L_0x0022:
            if (r0 == 0) goto L_0x002d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x002d
            r2 = 1
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3114ge.m12430c(android.view.View):boolean");
    }

    /* renamed from: c */
    public static boolean m12431c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
    }

    /* renamed from: d */
    public static int m12432d(View view) {
        if (view == null) {
            return -1;
        }
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof AdapterView)) {
            parent = parent.getParent();
        }
        if (parent == null) {
            return -1;
        }
        return ((AdapterView) parent).getPositionForView(view);
    }

    /* renamed from: d */
    private static String m12433d() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        if (Build.VERSION.RELEASE != null) {
            sb.append(" ");
            sb.append(Build.VERSION.RELEASE);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        if (Build.DEVICE != null) {
            sb.append("; ");
            sb.append(Build.DEVICE);
            if (Build.DISPLAY != null) {
                sb.append(" Build/");
                sb.append(Build.DISPLAY);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    /* renamed from: d */
    protected static String m12434d(Context context) {
        try {
            return new WebView(context).getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return m12433d();
        }
    }

    /* renamed from: e */
    public static AlertDialog.Builder m12435e(Context context) {
        return new AlertDialog.Builder(context);
    }

    /* renamed from: e */
    private static Bitmap m12436e(View view) {
        try {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width != 0) {
                if (height != 0) {
                    Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                    Canvas canvas = new Canvas(createBitmap);
                    view.layout(0, 0, width, height);
                    view.draw(canvas);
                    return createBitmap;
                }
            }
            C2227Cf.m9536d("Width or height of view is zero");
            return null;
        } catch (RuntimeException e) {
            C2227Cf.m9533b("Fail to capture the webview", e);
            return null;
        }
    }

    /* renamed from: e */
    private static int[] m12437e() {
        return new int[]{0, 0};
    }

    /* renamed from: f */
    private static Bitmap m12438f(View view) {
        Bitmap bitmap = null;
        try {
            boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
            view.setDrawingCacheEnabled(true);
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null) {
                bitmap = Bitmap.createBitmap(drawingCache);
            }
            view.setDrawingCacheEnabled(isDrawingCacheEnabled);
        } catch (RuntimeException e) {
            C2227Cf.m9533b("Fail to capture the web view", e);
        }
        return bitmap;
    }

    /* renamed from: f */
    public static C3647yu m12439f(Context context) {
        return new C3647yu(context);
    }

    /* renamed from: g */
    public static boolean m12440g(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager != null) {
                if (keyguardManager != null) {
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                    if (runningAppProcesses != null) {
                        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            ActivityManager.RunningAppProcessInfo next = it.next();
                            if (Process.myPid() == next.pid) {
                                if (next.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode()) {
                                    PowerManager powerManager = (PowerManager) context.getSystemService("power");
                                    if (powerManager == null ? false : powerManager.isScreenOn()) {
                                        return true;
                                    }
                                }
                            }
                        }
                    } else {
                        return false;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: h */
    public static Bitmap m12441h(Context context) {
        if (!(context instanceof Activity)) {
            return null;
        }
        try {
            if (!((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7737Fc)).booleanValue()) {
                return m12436e(((Activity) context).getWindow().getDecorView());
            }
            Window window = ((Activity) context).getWindow();
            if (window != null) {
                return m12438f(window.getDecorView().getRootView());
            }
            return null;
        } catch (RuntimeException e) {
            C2227Cf.m9533b("Fail to capture screen shot", e);
            return null;
        }
    }

    /* renamed from: i */
    public static int m12442i(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            return 0;
        }
        return applicationInfo.targetSdkVersion;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r2 = m12446m(r2);
     */
    @android.annotation.TargetApi(16)
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m12443j(android.content.Context r2) {
        /*
            r0 = 0
            if (r2 == 0) goto L_0x0018
            boolean r1 = com.google.android.gms.common.util.C2092n.m9163d()
            if (r1 != 0) goto L_0x000a
            goto L_0x0018
        L_0x000a:
            android.app.KeyguardManager r2 = m12446m(r2)
            if (r2 == 0) goto L_0x0018
            boolean r2 = r2.isKeyguardLocked()
            if (r2 == 0) goto L_0x0018
            r2 = 1
            return r2
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3114ge.m12443j(android.content.Context):boolean");
    }

    /* renamed from: k */
    public static boolean m12444k(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            C2227Cf.m9533b("Error loading class.", th);
            C1697X.m7702i().mo8319a(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    /* renamed from: l */
    private static String m12445l(Context context) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (!(activityManager == null || (runningTasks = activityManager.getRunningTasks(1)) == null || runningTasks.isEmpty() || (runningTaskInfo = runningTasks.get(0)) == null || runningTaskInfo.topActivity == null)) {
                return runningTaskInfo.topActivity.getClassName();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: m */
    private static KeyguardManager m12446m(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    /* renamed from: a */
    public final JSONObject mo9446a(Bundle bundle, JSONObject jSONObject) {
        if (bundle != null) {
            try {
                return m12406a(bundle);
            } catch (JSONException e) {
                C2227Cf.m9533b("Error converting Bundle to JSON", e);
            }
        }
        return null;
    }

    /* renamed from: a */
    public final JSONObject mo9447a(Map<String, ?> map) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String next : map.keySet()) {
                m12414a(jSONObject, next, (Object) map.get(next));
            }
            return jSONObject;
        } catch (ClassCastException e) {
            String valueOf = String.valueOf(e.getMessage());
            throw new JSONException(valueOf.length() != 0 ? "Could not convert map to JSON: ".concat(valueOf) : new String("Could not convert map to JSON: "));
        }
    }

    /* renamed from: a */
    public final void mo9448a(Context context, String str, WebSettings webSettings) {
        webSettings.setUserAgentString(mo9454b(context, str));
    }

    /* renamed from: a */
    public final void mo9449a(Context context, String str, String str2, Bundle bundle, boolean z) {
        if (z) {
            C1697X.m7698e();
            bundle.putString("device", m12424b());
            bundle.putString("eids", TextUtils.join(",", C2558Nu.m10772a()));
        }
        C3390pt.m13453a();
        C3432rf.m13601a(context, str, str2, bundle, z, new C3199je(this, context, str));
    }

    /* renamed from: a */
    public final void mo9450a(Context context, String str, boolean z, HttpURLConnection httpURLConnection) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setRequestProperty("User-Agent", mo9454b(context, str));
        httpURLConnection.setUseCaches(false);
    }

    /* renamed from: a */
    public final void mo9451a(Context context, List<String> list) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (!TextUtils.isEmpty(C2813Wo.m11506a(activity))) {
                if (list == null) {
                    C2857Yd.m11615f("Cannot ping urls: empty list.");
                } else if (!C3249kv.m12930a(context)) {
                    C2857Yd.m11615f("Cannot ping url because custom tabs is not supported");
                } else {
                    C3249kv kvVar = new C3249kv();
                    kvVar.mo9669a((C3278lv) new C3142he(this, list, kvVar, context));
                    kvVar.mo9671b(activity);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo9452a(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return mo9453a(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, m12446m(context));
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0074 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo9453a(android.view.View r4, android.os.PowerManager r5, android.app.KeyguardManager r6) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.ge r0 = com.google.android.gms.ads.internal.C1697X.m7698e()
            boolean r0 = r0.f9353c
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x002f
            if (r6 != 0) goto L_0x000e
            r6 = r2
            goto L_0x0012
        L_0x000e:
            boolean r6 = r6.inKeyguardRestrictedInputMode()
        L_0x0012:
            if (r6 == 0) goto L_0x002f
            com.google.android.gms.internal.ads.Du<java.lang.Boolean> r6 = com.google.android.gms.internal.ads.C2558Nu.f7820Tb
            com.google.android.gms.internal.ads.Lu r0 = com.google.android.gms.internal.ads.C3390pt.m13458f()
            java.lang.Object r6 = r0.mo8515a(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x002d
            boolean r6 = m12430c((android.view.View) r4)
            if (r6 == 0) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            r6 = r2
            goto L_0x0030
        L_0x002f:
            r6 = r1
        L_0x0030:
            int r0 = r4.getVisibility()
            if (r0 != 0) goto L_0x0075
            boolean r0 = r4.isShown()
            if (r0 == 0) goto L_0x0075
            if (r5 == 0) goto L_0x0047
            boolean r5 = r5.isScreenOn()
            if (r5 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r5 = r2
            goto L_0x0048
        L_0x0047:
            r5 = r1
        L_0x0048:
            if (r5 == 0) goto L_0x0075
            if (r6 == 0) goto L_0x0075
            com.google.android.gms.internal.ads.Du<java.lang.Boolean> r5 = com.google.android.gms.internal.ads.C2558Nu.f7808Rb
            com.google.android.gms.internal.ads.Lu r6 = com.google.android.gms.internal.ads.C3390pt.m13458f()
            java.lang.Object r5 = r6.mo8515a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0074
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r4.getLocalVisibleRect(r5)
            if (r5 != 0) goto L_0x0074
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r4 = r4.getGlobalVisibleRect(r5)
            if (r4 == 0) goto L_0x0075
        L_0x0074:
            return r1
        L_0x0075:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3114ge.mo9453a(android.view.View, android.os.PowerManager, android.app.KeyguardManager):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x003b, code lost:
        continue;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x001d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0045 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0025 A[Catch:{ Exception -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0059 A[Catch:{ Exception -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005e A[Catch:{ Exception -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a7 A[Catch:{ Exception -> 0x00b6 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo9454b(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f9352b
            monitor-enter(r0)
            java.lang.String r1 = r4.f9354d     // Catch:{ all -> 0x00d2 }
            if (r1 == 0) goto L_0x000b
            java.lang.String r5 = r4.f9354d     // Catch:{ all -> 0x00d2 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d2 }
            return r5
        L_0x000b:
            if (r6 != 0) goto L_0x0013
            java.lang.String r5 = m12433d()     // Catch:{ all -> 0x00d2 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d2 }
            return r5
        L_0x0013:
            com.google.android.gms.internal.ads.me r1 = com.google.android.gms.ads.internal.C1697X.m7700g()     // Catch:{ Exception -> 0x001d }
            java.lang.String r1 = r1.mo9716a((android.content.Context) r5)     // Catch:{ Exception -> 0x001d }
            r4.f9354d = r1     // Catch:{ Exception -> 0x001d }
        L_0x001d:
            java.lang.String r1 = r4.f9354d     // Catch:{ all -> 0x00d2 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00d2 }
            if (r1 == 0) goto L_0x006e
            com.google.android.gms.internal.ads.C3390pt.m13453a()     // Catch:{ all -> 0x00d2 }
            boolean r1 = com.google.android.gms.internal.ads.C3432rf.m13608b()     // Catch:{ all -> 0x00d2 }
            if (r1 != 0) goto L_0x0068
            r1 = 0
            r4.f9354d = r1     // Catch:{ all -> 0x00d2 }
            android.os.Handler r1 = f9351a     // Catch:{ all -> 0x00d2 }
            com.google.android.gms.internal.ads.ie r2 = new com.google.android.gms.internal.ads.ie     // Catch:{ all -> 0x00d2 }
            r2.<init>(r4, r5)     // Catch:{ all -> 0x00d2 }
            r1.post(r2)     // Catch:{ all -> 0x00d2 }
        L_0x003b:
            java.lang.String r1 = r4.f9354d     // Catch:{ all -> 0x00d2 }
            if (r1 != 0) goto L_0x006e
            java.lang.Object r1 = r4.f9352b     // Catch:{ InterruptedException -> 0x0045 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0045 }
            goto L_0x003b
        L_0x0045:
            java.lang.String r1 = m12433d()     // Catch:{ all -> 0x00d2 }
            r4.f9354d = r1     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = "Interrupted, use default user agent: "
            java.lang.String r2 = r4.f9354d     // Catch:{ all -> 0x00d2 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x00d2 }
            int r3 = r2.length()     // Catch:{ all -> 0x00d2 }
            if (r3 == 0) goto L_0x005e
            java.lang.String r1 = r1.concat(r2)     // Catch:{ all -> 0x00d2 }
            goto L_0x0064
        L_0x005e:
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x00d2 }
            r2.<init>(r1)     // Catch:{ all -> 0x00d2 }
            r1 = r2
        L_0x0064:
            com.google.android.gms.internal.ads.C2227Cf.m9536d(r1)     // Catch:{ all -> 0x00d2 }
            goto L_0x003b
        L_0x0068:
            java.lang.String r1 = m12434d((android.content.Context) r5)     // Catch:{ all -> 0x00d2 }
            r4.f9354d = r1     // Catch:{ all -> 0x00d2 }
        L_0x006e:
            java.lang.String r1 = r4.f9354d     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00d2 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00d2 }
            int r2 = r2.length()     // Catch:{ all -> 0x00d2 }
            int r2 = r2 + 10
            java.lang.String r3 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00d2 }
            int r3 = r3.length()     // Catch:{ all -> 0x00d2 }
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d2 }
            r3.<init>(r2)     // Catch:{ all -> 0x00d2 }
            r3.append(r1)     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = " (Mobile; "
            r3.append(r1)     // Catch:{ all -> 0x00d2 }
            r3.append(r6)     // Catch:{ all -> 0x00d2 }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x00d2 }
            r4.f9354d = r6     // Catch:{ all -> 0x00d2 }
            com.google.android.gms.common.c.b r5 = com.google.android.gms.common.p072c.C1989c.m8748b(r5)     // Catch:{ Exception -> 0x00b6 }
            boolean r5 = r5.mo7518a()     // Catch:{ Exception -> 0x00b6 }
            if (r5 == 0) goto L_0x00c0
            java.lang.String r5 = r4.f9354d     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r6 = ";aia"
            java.lang.String r5 = r5.concat(r6)     // Catch:{ Exception -> 0x00b6 }
            r4.f9354d = r5     // Catch:{ Exception -> 0x00b6 }
            goto L_0x00c0
        L_0x00b6:
            r5 = move-exception
            com.google.android.gms.internal.ads.Id r6 = com.google.android.gms.ads.internal.C1697X.m7702i()     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = "AdUtil.getUserAgent"
            r6.mo8319a((java.lang.Throwable) r5, (java.lang.String) r1)     // Catch:{ all -> 0x00d2 }
        L_0x00c0:
            java.lang.String r5 = r4.f9354d     // Catch:{ all -> 0x00d2 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00d2 }
            java.lang.String r6 = ")"
            java.lang.String r5 = r5.concat(r6)     // Catch:{ all -> 0x00d2 }
            r4.f9354d = r5     // Catch:{ all -> 0x00d2 }
            java.lang.String r5 = r4.f9354d     // Catch:{ all -> 0x00d2 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d2 }
            return r5
        L_0x00d2:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00d2 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3114ge.mo9454b(android.content.Context, java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public final void mo9455b(Context context, String str, String str2, Bundle bundle, boolean z) {
        if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7835Wb)).booleanValue()) {
            mo9449a(context, str, str2, bundle, z);
        }
    }

    /* renamed from: b */
    public final boolean mo9456b(Context context) {
        if (this.f9355e) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.getApplicationContext().registerReceiver(new C3260le(this, (C3142he) null), intentFilter);
        this.f9355e = true;
        return true;
    }

    /* renamed from: b */
    public final int[] mo9457b(Activity activity) {
        int[] a = m12421a(activity);
        C3390pt.m13453a();
        C3390pt.m13453a();
        return new int[]{C3432rf.m13605b((Context) activity, a[0]), C3432rf.m13605b((Context) activity, a[1])};
    }

    /* renamed from: c */
    public final boolean mo9458c(Context context) {
        if (this.f9356f) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        context.getApplicationContext().registerReceiver(new C3232ke(this, (C3142he) null), intentFilter);
        this.f9356f = true;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = r0.findViewById(16908290);
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int[] mo9459c(android.app.Activity r7) {
        /*
            r6 = this;
            android.view.Window r0 = r7.getWindow()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0021
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r4)
            if (r0 == 0) goto L_0x0021
            int[] r4 = new int[r1]
            int r5 = r0.getTop()
            r4[r3] = r5
            int r0 = r0.getBottom()
            r4[r2] = r0
            goto L_0x0025
        L_0x0021:
            int[] r4 = m12437e()
        L_0x0025:
            int[] r0 = new int[r1]
            com.google.android.gms.internal.ads.C3390pt.m13453a()
            r1 = r4[r3]
            int r1 = com.google.android.gms.internal.ads.C3432rf.m13605b((android.content.Context) r7, (int) r1)
            r0[r3] = r1
            com.google.android.gms.internal.ads.C3390pt.m13453a()
            r1 = r4[r2]
            int r7 = com.google.android.gms.internal.ads.C3432rf.m13605b((android.content.Context) r7, (int) r1)
            r0[r2] = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3114ge.mo9459c(android.app.Activity):int[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (((java.lang.String) com.google.android.gms.internal.ads.C3390pt.m13458f().mo8515a(com.google.android.gms.internal.ads.C2558Nu.f7789Oa)).equals(r3.f9357g.pattern()) == false) goto L_0x0025;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo9460d(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            monitor-enter(r3)     // Catch:{ PatternSyntaxException -> 0x0046 }
            java.util.regex.Pattern r0 = r3.f9357g     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0025
            com.google.android.gms.internal.ads.Du<java.lang.String> r0 = com.google.android.gms.internal.ads.C2558Nu.f7789Oa     // Catch:{ all -> 0x0043 }
            com.google.android.gms.internal.ads.Lu r2 = com.google.android.gms.internal.ads.C3390pt.m13458f()     // Catch:{ all -> 0x0043 }
            java.lang.Object r0 = r2.mo8515a(r0)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0043 }
            java.util.regex.Pattern r2 = r3.f9357g     // Catch:{ all -> 0x0043 }
            java.lang.String r2 = r2.pattern()     // Catch:{ all -> 0x0043 }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0043 }
            if (r0 != 0) goto L_0x0037
        L_0x0025:
            com.google.android.gms.internal.ads.Du<java.lang.String> r0 = com.google.android.gms.internal.ads.C2558Nu.f7789Oa     // Catch:{ all -> 0x0043 }
            com.google.android.gms.internal.ads.Lu r2 = com.google.android.gms.internal.ads.C3390pt.m13458f()     // Catch:{ all -> 0x0043 }
            java.lang.Object r0 = r2.mo8515a(r0)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0043 }
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch:{ all -> 0x0043 }
            r3.f9357g = r0     // Catch:{ all -> 0x0043 }
        L_0x0037:
            java.util.regex.Pattern r0 = r3.f9357g     // Catch:{ all -> 0x0043 }
            java.util.regex.Matcher r4 = r0.matcher(r4)     // Catch:{ all -> 0x0043 }
            boolean r4 = r4.matches()     // Catch:{ all -> 0x0043 }
            monitor-exit(r3)     // Catch:{ all -> 0x0043 }
            return r4
        L_0x0043:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0043 }
            throw r4     // Catch:{ PatternSyntaxException -> 0x0046 }
        L_0x0046:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3114ge.mo9460d(java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (((java.lang.String) com.google.android.gms.internal.ads.C3390pt.m13458f().mo8515a(com.google.android.gms.internal.ads.C2558Nu.f7795Pa)).equals(r3.f9358h.pattern()) == false) goto L_0x0025;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo9461e(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            monitor-enter(r3)     // Catch:{ PatternSyntaxException -> 0x0046 }
            java.util.regex.Pattern r0 = r3.f9358h     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0025
            com.google.android.gms.internal.ads.Du<java.lang.String> r0 = com.google.android.gms.internal.ads.C2558Nu.f7795Pa     // Catch:{ all -> 0x0043 }
            com.google.android.gms.internal.ads.Lu r2 = com.google.android.gms.internal.ads.C3390pt.m13458f()     // Catch:{ all -> 0x0043 }
            java.lang.Object r0 = r2.mo8515a(r0)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0043 }
            java.util.regex.Pattern r2 = r3.f9358h     // Catch:{ all -> 0x0043 }
            java.lang.String r2 = r2.pattern()     // Catch:{ all -> 0x0043 }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0043 }
            if (r0 != 0) goto L_0x0037
        L_0x0025:
            com.google.android.gms.internal.ads.Du<java.lang.String> r0 = com.google.android.gms.internal.ads.C2558Nu.f7795Pa     // Catch:{ all -> 0x0043 }
            com.google.android.gms.internal.ads.Lu r2 = com.google.android.gms.internal.ads.C3390pt.m13458f()     // Catch:{ all -> 0x0043 }
            java.lang.Object r0 = r2.mo8515a(r0)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0043 }
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch:{ all -> 0x0043 }
            r3.f9358h = r0     // Catch:{ all -> 0x0043 }
        L_0x0037:
            java.util.regex.Pattern r0 = r3.f9358h     // Catch:{ all -> 0x0043 }
            java.util.regex.Matcher r4 = r0.matcher(r4)     // Catch:{ all -> 0x0043 }
            boolean r4 = r4.matches()     // Catch:{ all -> 0x0043 }
            monitor-exit(r3)     // Catch:{ all -> 0x0043 }
            return r4
        L_0x0043:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0043 }
            throw r4     // Catch:{ PatternSyntaxException -> 0x0046 }
        L_0x0046:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3114ge.mo9461e(java.lang.String):boolean");
    }
}
