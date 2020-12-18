package p299tw.navin.navinmap.map.p300a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.net.Uri;
import java.io.File;
import p267i.p268a.p269a.p270a.C6664d;
import p299tw.navin.navinmap.util.C7173l;

/* renamed from: tw.navin.navinmap.map.a.c */
public abstract class C7084c {

    /* renamed from: a */
    public static String f19524a = "SVG";

    /* renamed from: b */
    protected Context f19525b;

    /* renamed from: c */
    protected C7085a f19526c;

    /* renamed from: tw.navin.navinmap.map.a.c$a */
    public interface C7085a {
        /* renamed from: a */
        void mo21032a();

        /* renamed from: b */
        void mo21033b();
    }

    public C7084c(Context context) {
        this.f19525b = context;
    }

    /* renamed from: a */
    public abstract int mo21113a();

    /* renamed from: a */
    public abstract void mo21114a(Canvas canvas, Matrix matrix);

    /* renamed from: a */
    public abstract void mo21115a(String str);

    /* renamed from: a */
    public void mo21118a(C7085a aVar) {
        this.f19526c = aVar;
    }

    /* renamed from: b */
    public abstract int mo21116b();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Uri mo21119b(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        C6664d a = C6664d.m25338a();
        String a2 = C7173l.m26995a(str, "/");
        if (a2.contains("?")) {
            a2 = a2.substring(0, a2.indexOf(63));
        }
        File a3 = a.mo17113a(this.f19525b, a2);
        if (!a3.exists()) {
            return null;
        }
        return Uri.fromFile(a3);
    }

    /* renamed from: c */
    public void mo21117c() {
        this.f19525b = null;
        this.f19526c = null;
    }
}
