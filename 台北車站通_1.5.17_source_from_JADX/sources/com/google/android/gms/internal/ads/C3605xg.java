package com.google.android.gms.internal.ads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.apache.http.HttpHeaders;

/* renamed from: com.google.android.gms.internal.ads.xg */
public final class C3605xg {
    /* renamed from: a */
    private static long m14417a(String str) {
        try {
            return m14420a().parse(str).getTime();
        } catch (ParseException e) {
            C3656zb.m14680a(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0;
        }
    }

    /* renamed from: a */
    public static C3471sp m14418a(C2272Dv dv) {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        C2272Dv dv2 = dv;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = dv2.f6921c;
        String str = map.get("Date");
        long a = str != null ? m14417a(str) : 0;
        String str2 = map.get(HttpHeaders.CACHE_CONTROL);
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",");
            int i2 = 0;
            j2 = 0;
            j = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j2 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
            z = true;
        } else {
            z = false;
            j2 = 0;
            j = 0;
        }
        String str3 = map.get(HttpHeaders.EXPIRES);
        long a2 = str3 != null ? m14417a(str3) : 0;
        String str4 = map.get(HttpHeaders.LAST_MODIFIED);
        long a3 = str4 != null ? m14417a(str4) : 0;
        String str5 = map.get(HttpHeaders.ETAG);
        if (z) {
            j4 = currentTimeMillis + (j2 * 1000);
            if (i == 0) {
                Long.signum(j);
                j3 = (j * 1000) + j4;
                C3471sp spVar = new C3471sp();
                spVar.f10218a = dv2.f6920b;
                spVar.f10219b = str5;
                spVar.f10223f = j4;
                spVar.f10222e = j3;
                spVar.f10220c = a;
                spVar.f10221d = a3;
                spVar.f10224g = map;
                spVar.f10225h = dv2.f6922d;
                return spVar;
            }
        } else if (a <= 0 || a2 < a) {
            j4 = 0;
        } else {
            j3 = (a2 - a) + currentTimeMillis;
            j4 = j3;
            C3471sp spVar2 = new C3471sp();
            spVar2.f10218a = dv2.f6920b;
            spVar2.f10219b = str5;
            spVar2.f10223f = j4;
            spVar2.f10222e = j3;
            spVar2.f10220c = a;
            spVar2.f10221d = a3;
            spVar2.f10224g = map;
            spVar2.f10225h = dv2.f6922d;
            return spVar2;
        }
        j3 = j4;
        C3471sp spVar22 = new C3471sp();
        spVar22.f10218a = dv2.f6920b;
        spVar22.f10219b = str5;
        spVar22.f10223f = j4;
        spVar22.f10222e = j3;
        spVar22.f10220c = a;
        spVar22.f10221d = a3;
        spVar22.f10224g = map;
        spVar22.f10225h = dv2.f6922d;
        return spVar22;
    }

    /* renamed from: a */
    static String m14419a(long j) {
        return m14420a().format(new Date(j));
    }

    /* renamed from: a */
    private static SimpleDateFormat m14420a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
