package p013b.p018b.p028h.p031b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import p013b.p018b.p028h.p029a.p030a.C1007a;
import p013b.p018b.p028h.p029a.p030a.C1014d;
import p013b.p018b.p028h.p037f.C1059f;
import p013b.p018b.p028h.p039h.C1088j;

/* renamed from: b.b.h.b.c */
public class C1039c {

    /* renamed from: a */
    private static final C1040a f3951a;

    /* renamed from: b */
    private static final C1088j<String, Typeface> f3952b = new C1088j<>(16);

    /* renamed from: b.b.h.b.c$a */
    interface C1040a {
        /* renamed from: a */
        Typeface mo5064a(Context context, Resources resources, int i, String str, int i2);

        /* renamed from: a */
        Typeface mo5065a(Context context, CancellationSignal cancellationSignal, C1059f.C1061b[] bVarArr, int i);

        /* renamed from: a */
        Typeface mo5066a(Context context, C1007a.C1009b bVar, Resources resources, int i);
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f3951a = i >= 26 ? new C1043f() : (i < 24 || !C1042e.m5502a()) ? Build.VERSION.SDK_INT >= 21 ? new C1041d() : new C1046i() : new C1042e();
    }

    /* renamed from: a */
    public static Typeface m5491a(Context context, Resources resources, int i, String str, int i2) {
        Typeface a = f3951a.mo5064a(context, resources, i, str, i2);
        if (a != null) {
            f3952b.mo5157a(m5495b(resources, i, i2), a);
        }
        return a;
    }

    /* renamed from: a */
    public static Typeface m5492a(Context context, CancellationSignal cancellationSignal, C1059f.C1061b[] bVarArr, int i) {
        return f3951a.mo5065a(context, cancellationSignal, bVarArr, i);
    }

    /* renamed from: a */
    public static Typeface m5493a(Context context, C1007a.C1008a aVar, Resources resources, int i, int i2, C1014d.C1015a aVar2, Handler handler, boolean z) {
        Typeface typeface;
        if (aVar instanceof C1007a.C1011d) {
            C1007a.C1011d dVar = (C1007a.C1011d) aVar;
            boolean z2 = false;
            if (!z ? aVar2 == null : dVar.mo5007a() == 0) {
                z2 = true;
            }
            typeface = C1059f.m5558a(context, dVar.mo5008b(), aVar2, handler, z2, z ? dVar.mo5009c() : -1, i2);
        } else {
            typeface = f3951a.mo5066a(context, (C1007a.C1009b) aVar, resources, i2);
            if (aVar2 != null) {
                if (typeface != null) {
                    aVar2.mo5013a(typeface, handler);
                } else {
                    aVar2.mo5012a(-3, handler);
                }
            }
        }
        if (typeface != null) {
            f3952b.mo5157a(m5495b(resources, i, i2), typeface);
        }
        return typeface;
    }

    /* renamed from: a */
    public static Typeface m5494a(Resources resources, int i, int i2) {
        return f3952b.mo5161b(m5495b(resources, i, i2));
    }

    /* renamed from: b */
    private static String m5495b(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }
}
