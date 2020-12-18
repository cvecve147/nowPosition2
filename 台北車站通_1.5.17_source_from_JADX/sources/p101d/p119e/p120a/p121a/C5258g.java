package p101d.p119e.p120a.p121a;

import java.util.Map;
import org.apache.http.HttpHeaders;
import org.apache.http.impl.cookie.DateParseException;
import org.apache.http.impl.cookie.DateUtils;
import p101d.p119e.p120a.C5267b;
import p101d.p119e.p120a.C5279l;

/* renamed from: d.e.a.a.g */
public class C5258g {
    /* renamed from: a */
    public static long m20364a(String str) {
        try {
            return DateUtils.parseDate(str).getTime();
        } catch (DateParseException unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static C5267b.C5268a m20365a(C5279l lVar) {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        C5279l lVar2 = lVar;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = lVar2.f14932c;
        String str = map.get("Date");
        long a = str != null ? m20364a(str) : 0;
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
        long a2 = str3 != null ? m20364a(str3) : 0;
        String str4 = map.get(HttpHeaders.LAST_MODIFIED);
        long a3 = str4 != null ? m20364a(str4) : 0;
        String str5 = map.get(HttpHeaders.ETAG);
        if (z) {
            j4 = currentTimeMillis + (j2 * 1000);
            if (i == 0) {
                Long.signum(j);
                j3 = (j * 1000) + j4;
                C5267b.C5268a aVar = new C5267b.C5268a();
                aVar.f14898a = lVar2.f14931b;
                aVar.f14899b = str5;
                aVar.f14903f = j4;
                aVar.f14902e = j3;
                aVar.f14900c = a;
                aVar.f14901d = a3;
                aVar.f14904g = map;
                return aVar;
            }
        } else if (a <= 0 || a2 < a) {
            j4 = 0;
        } else {
            j3 = (a2 - a) + currentTimeMillis;
            j4 = j3;
            C5267b.C5268a aVar2 = new C5267b.C5268a();
            aVar2.f14898a = lVar2.f14931b;
            aVar2.f14899b = str5;
            aVar2.f14903f = j4;
            aVar2.f14902e = j3;
            aVar2.f14900c = a;
            aVar2.f14901d = a3;
            aVar2.f14904g = map;
            return aVar2;
        }
        j3 = j4;
        C5267b.C5268a aVar22 = new C5267b.C5268a();
        aVar22.f14898a = lVar2.f14931b;
        aVar22.f14899b = str5;
        aVar22.f14903f = j4;
        aVar22.f14902e = j3;
        aVar22.f14900c = a;
        aVar22.f14901d = a3;
        aVar22.f14904g = map;
        return aVar22;
    }

    /* renamed from: a */
    public static String m20366a(Map<String, String> map) {
        return m20367a(map, "ISO-8859-1");
    }

    /* renamed from: a */
    public static String m20367a(Map<String, String> map, String str) {
        String str2 = map.get("Content-Type");
        if (str2 != null) {
            String[] split = str2.split(";");
            for (int i = 1; i < split.length; i++) {
                String[] split2 = split[i].trim().split("=");
                if (split2.length == 2 && split2[0].equals("charset")) {
                    return split2[1];
                }
            }
        }
        return str;
    }
}
