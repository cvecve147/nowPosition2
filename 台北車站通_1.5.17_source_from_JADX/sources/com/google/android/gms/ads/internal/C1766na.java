package com.google.android.gms.ads.internal;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.internal.ads.C2478La;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

@C2478La
/* renamed from: com.google.android.gms.ads.internal.na */
public final class C1766na {
    /* renamed from: a */
    private static String m7949a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            sb.append(obj == null ? "null" : obj instanceof Bundle ? m7949a((Bundle) obj) : obj.toString());
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static Object[] m7950a(String str, zzjj zzjj, String str2, int i, zzjn zzjn) {
        HashSet hashSet = new HashSet(Arrays.asList(str.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(str2);
        if (hashSet.contains("formatString")) {
            arrayList.add((Object) null);
        }
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(zzjj.f10876b));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(m7949a(zzjj.f10877c));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(zzjj.f10878d));
        }
        if (hashSet.contains("keywords")) {
            List<String> list = zzjj.f10879e;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add((Object) null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(zzjj.f10880f));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(zzjj.f10881g));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(zzjj.f10882h));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(zzjj.f10883i);
        }
        if (hashSet.contains("location")) {
            Location location = zzjj.f10885k;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add((Object) null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(zzjj.f10886l);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(m7949a(zzjj.f10887m));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(m7949a(zzjj.f10888n));
        }
        if (hashSet.contains("categoryExclusions")) {
            List<String> list2 = zzjj.f10889o;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add((Object) null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(zzjj.f10890p);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(zzjj.f10891q);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(zzjj.f10892r));
        }
        return arrayList.toArray();
    }
}
