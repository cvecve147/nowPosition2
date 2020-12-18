package p101d.p108c.p109a.p110a;

import android.content.Context;
import android.graphics.Typeface;
import p013b.p018b.p028h.p039h.C1101r;

/* renamed from: d.c.a.a.e */
public class C5184e {

    /* renamed from: a */
    private static final C1101r<String, Typeface> f14562a = new C1101r<>();

    /* renamed from: a */
    public static Typeface m20055a(Context context, String str) {
        synchronized (f14562a) {
            if (!f14562a.containsKey(str)) {
                try {
                    Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), String.format("fonts/%s", new Object[]{str}));
                    f14562a.put(str, createFromAsset);
                    return createFromAsset;
                } catch (RuntimeException unused) {
                    return null;
                }
            } else {
                Typeface typeface = f14562a.get(str);
                return typeface;
            }
        }
    }
}
