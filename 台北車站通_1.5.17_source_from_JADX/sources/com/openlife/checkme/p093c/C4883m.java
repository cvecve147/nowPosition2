package com.openlife.checkme.p093c;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.support.p011v7.app.C0621l;
import android.util.Base64;
import android.util.TypedValue;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.C4962m;
import com.openlife.checkme.activity.home.MainActivity;
import com.openlife.checkme.activity.login.LoginActivity;
import com.openlife.checkme.net.model.BiResponse;
import com.openlife.checkme.net.model.MobileInfo;
import com.openlife.checkme.net.model.ThreeResponse;
import com.openlife.checkme.p094d.C4938a;
import com.openlife.checkme.p094d.C4946i;
import com.openlife.checkme.p097f.C4953c;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.apache.http.protocol.HTTP;
import p101d.p129g.p152e.C5731p;
import p101d.p129g.p152e.C5737u;
import p101d.p129g.p152e.C5740x;
import p101d.p129g.p152e.C5742z;

/* renamed from: com.openlife.checkme.c.m */
public class C4883m {
    /* renamed from: a */
    public static int m19215a(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: a */
    public static ProgressDialog m19216a(Context context, int i) {
        ProgressDialog progressDialog = new ProgressDialog(context, 5);
        progressDialog.setProgressStyle(0);
        progressDialog.requestWindowFeature(1);
        progressDialog.setCancelable(true);
        progressDialog.setMessage(context.getString(C4961l.g_loading));
        return progressDialog;
    }

    /* renamed from: a */
    public static ProgressDialog m19217a(Context context, int i, DialogInterface.OnCancelListener onCancelListener) {
        ProgressDialog progressDialog = new ProgressDialog(context, 5);
        progressDialog.setProgressStyle(0);
        progressDialog.requestWindowFeature(1);
        progressDialog.setCancelable(true);
        progressDialog.setOnCancelListener(onCancelListener);
        progressDialog.setMessage(context.getString(C4961l.g_loading));
        return progressDialog;
    }

    /* renamed from: a */
    public static BiResponse m19218a(C4953c cVar, C4953c cVar2) {
        return new BiResponse(cVar, cVar2);
    }

    /* renamed from: a */
    public static ThreeResponse m19219a(C4953c cVar, C4953c cVar2, C4953c cVar3) {
        return new ThreeResponse(cVar, cVar2, cVar3);
    }

    /* renamed from: a */
    public static String m19220a(Context context, float f) {
        return context.getString(C4961l.exploration_km, new Object[]{new DecimalFormat("##.#").format((double) (f / 1000.0f))});
    }

    /* renamed from: a */
    public static String m19221a(Object obj) {
        String d;
        C5740x xVar = (C5740x) new C5742z().mo15327a(new C5731p().mo15296a(obj));
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, C5737u> key : xVar.mo15324i()) {
            arrayList.add(key.getKey());
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            if (i != 0) {
                sb.append("&");
            }
            sb.append(m19222a((String) arrayList.get(i)));
            sb.append("=");
            if (!xVar.mo15320a((String) arrayList.get(i)).mo15315g()) {
                if (xVar.mo15320a((String) arrayList.get(i)).mo15313e()) {
                    xVar.mo15320a((String) arrayList.get(i)).toString();
                } else {
                    d = xVar.mo15320a((String) arrayList.get(i)).mo15083d();
                    sb.append(m19222a(d));
                }
            }
            d = xVar.mo15320a((String) arrayList.get(i)).toString().replaceAll("/", "\\\\/");
            sb.append(m19222a(d));
        }
        return sb.toString().trim().replace("*", "%2A").replaceAll("%7E", "~");
    }

    /* renamed from: a */
    public static String m19222a(String str) {
        try {
            return URLEncoder.encode(str, HTTP.UTF_8).replace("+", "%20");
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static String m19223a(SimpleDateFormat simpleDateFormat, SimpleDateFormat simpleDateFormat2, String str) {
        if (str != null) {
            try {
                return simpleDateFormat2.format(simpleDateFormat.parse(str));
            } catch (ParseException unused) {
            }
        }
        return "";
    }

    /* renamed from: a */
    public static String m19224a(SimpleDateFormat simpleDateFormat, Date date) {
        return date != null ? simpleDateFormat.format(date) : "";
    }

    /* renamed from: a */
    public static SimpleDateFormat m19225a() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }

    /* renamed from: a */
    public static void m19226a(Context context, Uri uri) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setData(uri);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
        }
    }

    /* renamed from: a */
    public static void m19227a(Context context, String str) {
        C0621l.C0622a aVar = new C0621l.C0622a(context, C4962m.MyDialogTheme);
        aVar.mo2606b(C4961l.app_name);
        aVar.mo2600a((CharSequence) str);
        aVar.mo2607b(C4961l.g_confirm, (DialogInterface.OnClickListener) new C4882l());
        aVar.mo2604a().show();
    }

    /* renamed from: a */
    public static void m19228a(Context context, String str, String str2, String str3) {
        String str4 = Build.BRAND + " - " + Build.MODEL;
        String str5 = "Android " + Build.VERSION.RELEASE;
        String a = C4871b.m19172a();
        String b = m19232b(context);
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", C4946i.m19502b(context), (String) null));
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(C4938a.m19452d(context) ? C4938a.m19450b(context) : context.getString(C4961l.service_guest));
        intent.putExtra("android.intent.extra.SUBJECT", sb.toString());
        intent.putExtra("android.intent.extra.TEXT", str3 + context.getString(C4961l.service_content, new Object[]{str4, str5, a, str, b}));
        try {
            context.startActivity(Intent.createChooser(intent, context.getString(C4961l.utility_email_chooser)));
        } catch (ActivityNotFoundException unused) {
        }
    }

    /* renamed from: a */
    public static boolean m19229a(Activity activity) {
        if (C4938a.m19452d((Context) activity)) {
            return true;
        }
        int f = C4946i.m19506f((Context) activity);
        if (f == 0) {
            LoginActivity.m18422a(activity);
            return false;
        } else if (f != 1) {
            return false;
        } else {
            activity.setResult(10000);
            activity.finish();
            return false;
        }
    }

    /* renamed from: a */
    public static Integer[] m19230a(Resources resources, int i) {
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        Integer[] numArr = new Integer[obtainTypedArray.length()];
        for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
            numArr[i2] = Integer.valueOf(obtainTypedArray.getResourceId(i2, -1));
        }
        obtainTypedArray.recycle();
        return numArr;
    }

    /* renamed from: b */
    public static float m19231b(Context context, float f) {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    /* renamed from: b */
    public static String m19232b(Context context) {
        String str;
        String str2 = "android_id";
        String str3 = "35" + (Build.BOARD.length() % 10) + (Build.BRAND.length() % 10) + (Build.CPU_ABI.length() % 10) + (Build.DEVICE.length() % 10) + (Build.MANUFACTURER.length() % 10) + (Build.MODEL.length() % 10) + (Build.PRODUCT.length() % 10);
        try {
            str = Build.class.getField("SERIAL").get((Object) null).toString();
        } catch (Exception unused) {
            str = "serial";
        }
        try {
            str2 = Settings.Secure.getString(context.getContentResolver(), str2);
        } catch (Exception unused2) {
        }
        return new UUID((long) str3.hashCode(), (long) (str + str2).hashCode()).toString().toUpperCase();
    }

    /* renamed from: b */
    public static String m19233b(String str) {
        try {
            Mac instance = Mac.getInstance("HmacSHA256");
            instance.init(new SecretKeySpec(C4881k.m19213a().getBytes(HTTP.UTF_8), "HmacSHA256"));
            return Base64.encodeToString(instance.doFinal(str.getBytes(HTTP.UTF_8)), 2);
        } catch (Exception e) {
            return "exception " + e.getMessage();
        }
    }

    /* renamed from: b */
    public static SimpleDateFormat m19234b() {
        return new SimpleDateFormat("yyy-MM-dd");
    }

    /* renamed from: b */
    public static void m19235b(Activity activity) {
        if (activity instanceof MainActivity) {
            activity.setResult(10000);
        }
        activity.finish();
    }

    /* renamed from: b */
    public static void m19236b(Context context, String str) {
        String str2 = Build.BRAND + " - " + Build.MODEL;
        String str3 = "Android " + Build.VERSION.RELEASE;
        String a = C4871b.m19172a();
        if (str == null && !C4938a.m19452d(context)) {
            str = context.getString(C4961l.service_none);
        } else if (str == null && C4938a.m19452d(context)) {
            str = C4938a.m19450b(context);
        }
        String b = m19232b(context);
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", C4946i.m19502b(context), (String) null));
        int i = C4961l.service_subject;
        Object[] objArr = new Object[1];
        objArr[0] = !context.getString(C4961l.service_none).equals(str) ? str : context.getString(C4961l.service_guest);
        intent.putExtra("android.intent.extra.SUBJECT", context.getString(i, objArr));
        intent.putExtra("android.intent.extra.TEXT", context.getString(C4961l.service_content, new Object[]{str2, str3, a, str, b}));
        try {
            context.startActivity(Intent.createChooser(intent, context.getString(C4961l.utility_email_chooser)));
        } catch (ActivityNotFoundException unused) {
        }
    }

    /* renamed from: c */
    public static MobileInfo m19237c(Context context) {
        String str;
        String str2 = "android_id";
        try {
            str = Build.class.getField("SERIAL").get((Object) null).toString();
        } catch (Exception unused) {
            str = "serial";
        }
        String str3 = str;
        try {
            str2 = Settings.Secure.getString(context.getContentResolver(), str2);
        } catch (Exception unused2) {
        }
        return new MobileInfo(Build.BOARD, Build.BRAND, Build.CPU_ABI, Build.DEVICE, Build.MANUFACTURER, Build.MODEL, Build.PRODUCT, str3, str2, m19243d());
    }

    /* renamed from: c */
    public static String m19238c(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                StringBuffer stringBuffer = new StringBuffer(Integer.toHexString(b & 255));
                while (stringBuffer.length() < 2) {
                    stringBuffer.append("0" + stringBuffer);
                }
                sb.append(stringBuffer);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    /* renamed from: c */
    public static SimpleDateFormat m19239c() {
        return new SimpleDateFormat("yyyy/MM/dd");
    }

    /* renamed from: c */
    public static void m19240c(Context context, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setData(Uri.parse(context.getPackageName() + "." + str));
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
        }
    }

    /* renamed from: d */
    public static Uri m19241d(Context context, String str) {
        return Uri.parse(context.getPackageName() + "." + str);
    }

    /* renamed from: d */
    public static String m19242d(String str) {
        MessageDigest instance = MessageDigest.getInstance("SHA-1");
        instance.update(str.getBytes("iso-8859-1"), 0, str.length());
        byte[] digest = instance.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            StringBuffer stringBuffer = new StringBuffer(Integer.toHexString(b & 255));
            while (stringBuffer.length() < 2) {
                stringBuffer.insert(0, "0");
            }
            sb.append(stringBuffer);
        }
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0013, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m19243d() {
        /*
            java.lang.String r0 = "su"
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x0013, all -> 0x0011 }
            java.lang.Process r0 = r1.exec(r0)     // Catch:{ Exception -> 0x0013, all -> 0x0011 }
            r1 = 1
            if (r0 == 0) goto L_0x0010
            r0.destroy()     // Catch:{ Exception -> 0x0010 }
        L_0x0010:
            return r1
        L_0x0011:
            r0 = move-exception
            throw r0
        L_0x0013:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.openlife.checkme.p093c.C4883m.m19243d():boolean");
    }

    /* renamed from: e */
    public static boolean m19244e(String str) {
        try {
            return Pattern.compile("[a-zA-Z]{2}[0-9]{15}(?=.*=)").matcher(str).find();
        } catch (Exception unused) {
            return false;
        }
    }
}
