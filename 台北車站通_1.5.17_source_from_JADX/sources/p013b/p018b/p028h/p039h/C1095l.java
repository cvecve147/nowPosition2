package p013b.p018b.p028h.p039h;

import android.os.Build;
import java.util.Objects;

/* renamed from: b.b.h.h.l */
public class C1095l {
    /* renamed from: a */
    public static boolean m5678a(Object obj, Object obj2) {
        return Build.VERSION.SDK_INT >= 19 ? Objects.equals(obj, obj2) : obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
