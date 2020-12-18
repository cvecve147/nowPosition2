package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.ads.C1642d;
import com.google.android.gms.ads.C1670i;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.ht */
public final class C3157ht {

    /* renamed from: a */
    private final C1642d[] f9444a;

    /* renamed from: b */
    private final String f9445b;

    public C3157ht(Context context, AttributeSet attributeSet) {
        C1642d[] a;
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C1670i.AdsAttrs);
        String string = obtainAttributes.getString(C1670i.AdsAttrs_adSize);
        String string2 = obtainAttributes.getString(C1670i.AdsAttrs_adSizes);
        boolean z = !TextUtils.isEmpty(string);
        boolean z2 = !TextUtils.isEmpty(string2);
        if (z && !z2) {
            a = m12561a(string);
        } else if (!z && z2) {
            a = m12561a(string2);
        } else if (z) {
            throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
        } else {
            throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
        }
        this.f9444a = a;
        this.f9445b = obtainAttributes.getString(C1670i.AdsAttrs_adUnitId);
        if (TextUtils.isEmpty(this.f9445b)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    /* renamed from: a */
    private static C1642d[] m12561a(String str) {
        String[] split = str.split("\\s*,\\s*");
        C1642d[] dVarArr = new C1642d[split.length];
        for (int i = 0; i < split.length; i++) {
            String trim = split[i].trim();
            if (trim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] split2 = trim.split("[xX]");
                split2[0] = split2[0].trim();
                split2[1] = split2[1].trim();
                try {
                    dVarArr[i] = new C1642d("FULL_WIDTH".equals(split2[0]) ? -1 : Integer.parseInt(split2[0]), "AUTO_HEIGHT".equals(split2[1]) ? -2 : Integer.parseInt(split2[1]));
                } catch (NumberFormatException unused) {
                    String valueOf = String.valueOf(trim);
                    throw new IllegalArgumentException(valueOf.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(valueOf) : new String("Could not parse XML attribute \"adSize\": "));
                }
            } else if ("BANNER".equals(trim)) {
                dVarArr[i] = C1642d.f5458a;
            } else if ("LARGE_BANNER".equals(trim)) {
                dVarArr[i] = C1642d.f5460c;
            } else if ("FULL_BANNER".equals(trim)) {
                dVarArr[i] = C1642d.f5459b;
            } else if ("LEADERBOARD".equals(trim)) {
                dVarArr[i] = C1642d.f5461d;
            } else if ("MEDIUM_RECTANGLE".equals(trim)) {
                dVarArr[i] = C1642d.f5462e;
            } else if ("SMART_BANNER".equals(trim)) {
                dVarArr[i] = C1642d.f5464g;
            } else if ("WIDE_SKYSCRAPER".equals(trim)) {
                dVarArr[i] = C1642d.f5463f;
            } else if ("FLUID".equals(trim)) {
                dVarArr[i] = C1642d.f5465h;
            } else if ("ICON".equals(trim)) {
                dVarArr[i] = C1642d.f5466i;
            } else {
                String valueOf2 = String.valueOf(trim);
                throw new IllegalArgumentException(valueOf2.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(valueOf2) : new String("Could not parse XML attribute \"adSize\": "));
            }
        }
        if (dVarArr.length != 0) {
            return dVarArr;
        }
        String valueOf3 = String.valueOf(str);
        throw new IllegalArgumentException(valueOf3.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(valueOf3) : new String("Could not parse XML attribute \"adSize\": "));
    }

    /* renamed from: a */
    public final String mo9527a() {
        return this.f9445b;
    }

    /* renamed from: a */
    public final C1642d[] mo9528a(boolean z) {
        if (z || this.f9444a.length == 1) {
            return this.f9444a;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }
}
