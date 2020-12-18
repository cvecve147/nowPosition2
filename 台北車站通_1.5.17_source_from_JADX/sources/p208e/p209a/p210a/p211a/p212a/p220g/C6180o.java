package p208e.p209a.p210a.p211a.p212a.p220g;

import android.content.Context;
import android.graphics.BitmapFactory;
import p208e.p209a.p210a.p211a.C6199f;
import p208e.p209a.p210a.p211a.C6211p;
import p208e.p209a.p210a.p211a.p212a.p214b.C6080l;

/* renamed from: e.a.a.a.a.g.o */
public class C6180o {

    /* renamed from: a */
    public final String f17228a;

    /* renamed from: b */
    public final int f17229b;

    /* renamed from: c */
    public final int f17230c;

    /* renamed from: d */
    public final int f17231d;

    public C6180o(String str, int i, int i2, int i3) {
        this.f17228a = str;
        this.f17229b = i;
        this.f17230c = i2;
        this.f17231d = i3;
    }

    /* renamed from: a */
    public static C6180o m23366a(Context context, String str) {
        if (str != null) {
            try {
                int d = C6080l.m23056d(context);
                C6211p f = C6199f.m23420f();
                f.mo16269d("Fabric", "App icon resource ID is " + d);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeResource(context.getResources(), d, options);
                return new C6180o(str, d, options.outWidth, options.outHeight);
            } catch (Exception e) {
                C6199f.m23420f().mo16266b("Fabric", "Failed to load icon", e);
            }
        }
        return null;
    }
}
