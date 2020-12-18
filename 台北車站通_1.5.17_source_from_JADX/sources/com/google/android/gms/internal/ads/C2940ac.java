package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.common.p072c.C1989c;
import com.google.android.gms.common.util.C2087i;
import com.google.android.gms.common.util.C2092n;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.ac */
public final class C2940ac {

    /* renamed from: A */
    private String f8880A;

    /* renamed from: B */
    private boolean f8881B;

    /* renamed from: a */
    private int f8882a;

    /* renamed from: b */
    private boolean f8883b;

    /* renamed from: c */
    private boolean f8884c;

    /* renamed from: d */
    private int f8885d;

    /* renamed from: e */
    private int f8886e;

    /* renamed from: f */
    private int f8887f;

    /* renamed from: g */
    private String f8888g;

    /* renamed from: h */
    private int f8889h;

    /* renamed from: i */
    private int f8890i;

    /* renamed from: j */
    private int f8891j;

    /* renamed from: k */
    private boolean f8892k;

    /* renamed from: l */
    private int f8893l;

    /* renamed from: m */
    private double f8894m;

    /* renamed from: n */
    private boolean f8895n;

    /* renamed from: o */
    private String f8896o;

    /* renamed from: p */
    private String f8897p;

    /* renamed from: q */
    private boolean f8898q;

    /* renamed from: r */
    private boolean f8899r;

    /* renamed from: s */
    private String f8900s;

    /* renamed from: t */
    private boolean f8901t;

    /* renamed from: u */
    private boolean f8902u;

    /* renamed from: v */
    private String f8903v;

    /* renamed from: w */
    private String f8904w;

    /* renamed from: x */
    private float f8905x;

    /* renamed from: y */
    private int f8906y;

    /* renamed from: z */
    private int f8907z;

    public C2940ac(Context context) {
        DisplayMetrics displayMetrics;
        PackageManager packageManager = context.getPackageManager();
        m11921a(context);
        m11923b(context);
        m11924c(context);
        Locale locale = Locale.getDefault();
        boolean z = true;
        this.f8898q = m11919a(packageManager, "geo:0,0?q=donuts") != null;
        this.f8899r = m11919a(packageManager, "http://www.google.com") == null ? false : z;
        this.f8900s = locale.getCountry();
        C3390pt.m13453a();
        this.f8901t = C3432rf.m13604a();
        this.f8902u = C2087i.m9150b(context);
        this.f8903v = locale.getLanguage();
        this.f8904w = m11922b(context, packageManager);
        this.f8880A = m11920a(context, packageManager);
        Resources resources = context.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            this.f8905x = displayMetrics.density;
            this.f8906y = displayMetrics.widthPixels;
            this.f8907z = displayMetrics.heightPixels;
        }
    }

    public C2940ac(Context context, C2909_b _bVar) {
        context.getPackageManager();
        m11921a(context);
        m11923b(context);
        m11924c(context);
        this.f8896o = Build.FINGERPRINT;
        this.f8897p = Build.DEVICE;
        this.f8881B = C2092n.m9162c() && C3249kv.m12930a(context);
        this.f8898q = _bVar.f8733b;
        this.f8899r = _bVar.f8734c;
        this.f8900s = _bVar.f8736e;
        this.f8901t = _bVar.f8737f;
        this.f8902u = _bVar.f8738g;
        this.f8903v = _bVar.f8741j;
        this.f8904w = _bVar.f8742k;
        this.f8880A = _bVar.f8743l;
        this.f8905x = _bVar.f8750s;
        this.f8906y = _bVar.f8751t;
        this.f8907z = _bVar.f8752u;
    }

    /* renamed from: a */
    private static ResolveInfo m11919a(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            C1697X.m7702i().mo8319a(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    /* renamed from: a */
    private static String m11920a(Context context, PackageManager packageManager) {
        try {
            PackageInfo b = C1989c.m8748b(context).mo7521b("com.android.vending", 128);
            if (b != null) {
                int i = b.versionCode;
                String str = b.packageName;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append(i);
                sb.append(".");
                sb.append(str);
                return sb.toString();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: a */
    private final void m11921a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.f8882a = audioManager.getMode();
                this.f8883b = audioManager.isMusicActive();
                this.f8884c = audioManager.isSpeakerphoneOn();
                this.f8885d = audioManager.getStreamVolume(3);
                this.f8886e = audioManager.getRingerMode();
                this.f8887f = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                C1697X.m7702i().mo8319a(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.f8882a = -2;
        this.f8883b = false;
        this.f8884c = false;
        this.f8885d = 0;
        this.f8886e = 0;
        this.f8887f = 0;
    }

    /* renamed from: b */
    private static String m11922b(Context context, PackageManager packageManager) {
        ActivityInfo activityInfo;
        ResolveInfo a = m11919a(packageManager, "market://details?id=com.google.android.gms.ads");
        if (a == null || (activityInfo = a.activityInfo) == null) {
            return null;
        }
        try {
            PackageInfo b = C1989c.m8748b(context).mo7521b(activityInfo.packageName, 0);
            if (b != null) {
                int i = b.versionCode;
                String str = activityInfo.packageName;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append(i);
                sb.append(".");
                sb.append(str);
                return sb.toString();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    @TargetApi(16)
    /* renamed from: b */
    private final void m11923b(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f8888g = telephonyManager.getNetworkOperator();
        this.f8890i = telephonyManager.getNetworkType();
        this.f8891j = telephonyManager.getPhoneType();
        this.f8889h = -2;
        this.f8892k = false;
        this.f8893l = -1;
        C1697X.m7698e();
        if (C3114ge.m12418a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.f8889h = activeNetworkInfo.getType();
                this.f8893l = activeNetworkInfo.getDetailedState().ordinal();
            } else {
                this.f8889h = -1;
            }
            if (Build.VERSION.SDK_INT >= 16) {
                this.f8892k = connectivityManager.isActiveNetworkMetered();
            }
        }
    }

    /* renamed from: c */
    private final void m11924c(Context context) {
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            this.f8894m = (double) (((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
            this.f8895n = z;
            return;
        }
        this.f8894m = -1.0d;
        this.f8895n = false;
    }

    /* renamed from: a */
    public final C2909_b mo9188a() {
        return new C2909_b(this.f8882a, this.f8898q, this.f8899r, this.f8888g, this.f8900s, this.f8901t, this.f8902u, this.f8883b, this.f8884c, this.f8903v, this.f8904w, this.f8880A, this.f8885d, this.f8889h, this.f8890i, this.f8891j, this.f8886e, this.f8887f, this.f8905x, this.f8906y, this.f8907z, this.f8894m, this.f8895n, this.f8892k, this.f8893l, this.f8896o, this.f8881B, this.f8897p);
    }
}
