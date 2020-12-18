package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C2478La;
import com.google.android.gms.internal.ads.C2558Nu;
import com.google.android.gms.internal.ads.C2857Yd;
import com.google.android.gms.internal.ads.C3114ge;
import com.google.android.gms.internal.ads.C3390pt;

@C2478La
/* renamed from: com.google.android.gms.ads.internal.overlay.a */
public final class C1769a {
    /* renamed from: a */
    private static boolean m7988a(Context context, Intent intent, C1787s sVar) {
        try {
            String valueOf = String.valueOf(intent.toURI());
            C2857Yd.m11615f(valueOf.length() != 0 ? "Launching an intent: ".concat(valueOf) : new String("Launching an intent: "));
            C1697X.m7698e();
            C3114ge.m12407a(context, intent);
            if (sVar == null) {
                return true;
            }
            sVar.mo6856Lb();
            return true;
        } catch (ActivityNotFoundException e) {
            C2227Cf.m9536d(e.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m7989a(Context context, zzc zzc, C1787s sVar) {
        String str;
        int i = 0;
        if (zzc == null) {
            str = "No intent data for launcher overlay.";
        } else {
            C2558Nu.m10773a(context);
            Intent intent = zzc.f5877h;
            if (intent != null) {
                return m7988a(context, intent, sVar);
            }
            Intent intent2 = new Intent();
            if (TextUtils.isEmpty(zzc.f5871b)) {
                str = "Open GMSG did not contain a URL.";
            } else {
                if (!TextUtils.isEmpty(zzc.f5872c)) {
                    intent2.setDataAndType(Uri.parse(zzc.f5871b), zzc.f5872c);
                } else {
                    intent2.setData(Uri.parse(zzc.f5871b));
                }
                intent2.setAction("android.intent.action.VIEW");
                if (!TextUtils.isEmpty(zzc.f5873d)) {
                    intent2.setPackage(zzc.f5873d);
                }
                if (!TextUtils.isEmpty(zzc.f5874e)) {
                    String[] split = zzc.f5874e.split("/", 2);
                    if (split.length < 2) {
                        String valueOf = String.valueOf(zzc.f5874e);
                        C2227Cf.m9536d(valueOf.length() != 0 ? "Could not parse component name from open GMSG: ".concat(valueOf) : new String("Could not parse component name from open GMSG: "));
                        return false;
                    }
                    intent2.setClassName(split[0], split[1]);
                }
                String str2 = zzc.f5875f;
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        i = Integer.parseInt(str2);
                    } catch (NumberFormatException unused) {
                        C2227Cf.m9536d("Could not parse intent flags.");
                    }
                    intent2.addFlags(i);
                }
                if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7842Xd)).booleanValue()) {
                    intent2.addFlags(268435456);
                    intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
                } else {
                    if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7837Wd)).booleanValue()) {
                        C1697X.m7698e();
                        C3114ge.m12425b(context, intent2);
                    }
                }
                return m7988a(context, intent2, sVar);
            }
        }
        C2227Cf.m9536d(str);
        return false;
    }
}
