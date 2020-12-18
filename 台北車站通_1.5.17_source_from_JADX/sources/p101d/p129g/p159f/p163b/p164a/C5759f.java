package p101d.p129g.p159f.p163b.p164a;

import android.content.Intent;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import p101d.p129g.p159f.C5743a;

/* renamed from: d.g.f.b.a.f */
public final class C5759f {

    /* renamed from: a */
    private static final Pattern f15916a = Pattern.compile(",");

    /* renamed from: b */
    static final Set<C5743a> f15917b = EnumSet.of(C5743a.UPC_A, new C5743a[]{C5743a.UPC_E, C5743a.EAN_13, C5743a.EAN_8, C5743a.RSS_14, C5743a.RSS_EXPANDED});

    /* renamed from: c */
    static final Set<C5743a> f15918c = EnumSet.of(C5743a.CODE_39, C5743a.CODE_93, C5743a.CODE_128, C5743a.ITF, C5743a.CODABAR);

    /* renamed from: d */
    private static final Set<C5743a> f15919d = EnumSet.copyOf(f15917b);

    /* renamed from: e */
    static final Set<C5743a> f15920e = EnumSet.of(C5743a.QR_CODE);

    /* renamed from: f */
    static final Set<C5743a> f15921f = EnumSet.of(C5743a.DATA_MATRIX);

    /* renamed from: g */
    static final Set<C5743a> f15922g = EnumSet.of(C5743a.AZTEC);

    /* renamed from: h */
    static final Set<C5743a> f15923h = EnumSet.of(C5743a.PDF_417);

    /* renamed from: i */
    private static final Map<String, Set<C5743a>> f15924i = new HashMap();

    static {
        f15919d.addAll(f15918c);
        f15924i.put("ONE_D_MODE", f15919d);
        f15924i.put("PRODUCT_MODE", f15917b);
        f15924i.put("QR_CODE_MODE", f15920e);
        f15924i.put("DATA_MATRIX_MODE", f15921f);
        f15924i.put("AZTEC_MODE", f15922g);
        f15924i.put("PDF417_MODE", f15923h);
    }

    /* renamed from: a */
    public static Set<C5743a> m21765a(Intent intent) {
        String stringExtra = intent.getStringExtra("SCAN_FORMATS");
        return m21766a(stringExtra != null ? Arrays.asList(f15916a.split(stringExtra)) : null, intent.getStringExtra("SCAN_MODE"));
    }

    /* renamed from: a */
    private static Set<C5743a> m21766a(Iterable<String> iterable, String str) {
        if (iterable != null) {
            EnumSet<E> noneOf = EnumSet.noneOf(C5743a.class);
            try {
                for (String valueOf : iterable) {
                    noneOf.add(C5743a.valueOf(valueOf));
                }
                return noneOf;
            } catch (IllegalArgumentException unused) {
            }
        }
        if (str != null) {
            return f15924i.get(str);
        }
        return null;
    }
}
