package p013b.p018b.p028h.p031b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.HttpStatus;
import p013b.p018b.p028h.p029a.p030a.C1007a;
import p013b.p018b.p028h.p031b.C1039c;
import p013b.p018b.p028h.p037f.C1059f;

/* renamed from: b.b.h.b.i */
class C1046i implements C1039c.C1040a {

    /* renamed from: b.b.h.b.i$a */
    private interface C1047a<T> {
        /* renamed from: a */
        int mo5068a(T t);

        /* renamed from: b */
        boolean mo5070b(T t);
    }

    C1046i() {
    }

    /* renamed from: a */
    private C1007a.C1010c m5525a(C1007a.C1009b bVar, int i) {
        return (C1007a.C1010c) m5526a(bVar.mo5002a(), i, new C1045h(this));
    }

    /* renamed from: a */
    private static <T> T m5526a(T[] tArr, int i, C1047a<T> aVar) {
        int i2 = (i & 1) == 0 ? HttpStatus.SC_BAD_REQUEST : 700;
        boolean z = (i & 2) != 0;
        int i3 = Integer.MAX_VALUE;
        T t = null;
        for (T t2 : tArr) {
            int abs = (Math.abs(aVar.mo5068a(t2) - i2) * 2) + (aVar.mo5070b(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    /* renamed from: a */
    public Typeface mo5064a(Context context, Resources resources, int i, String str, int i2) {
        File a = C1048j.m5534a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!C1048j.m5539a(a, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a.getPath());
            a.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a.delete();
        }
    }

    /* renamed from: a */
    public Typeface mo5065a(Context context, CancellationSignal cancellationSignal, C1059f.C1061b[] bVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (bVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(mo5074a(bVarArr, i).mo5092c());
            try {
                Typeface a = mo5073a(context, inputStream);
                C1048j.m5538a((Closeable) inputStream);
                return a;
            } catch (IOException unused) {
                C1048j.m5538a((Closeable) inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                C1048j.m5538a((Closeable) inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            C1048j.m5538a((Closeable) inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C1048j.m5538a((Closeable) inputStream2);
            throw th;
        }
    }

    /* renamed from: a */
    public Typeface mo5066a(Context context, C1007a.C1009b bVar, Resources resources, int i) {
        C1007a.C1010c a = m5525a(bVar, i);
        if (a == null) {
            return null;
        }
        return C1039c.m5491a(context, resources, a.mo5004b(), a.mo5003a(), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Typeface mo5073a(Context context, InputStream inputStream) {
        File a = C1048j.m5534a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!C1048j.m5540a(a, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a.getPath());
            a.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a.delete();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1059f.C1061b mo5074a(C1059f.C1061b[] bVarArr, int i) {
        return (C1059f.C1061b) m5526a(bVarArr, i, new C1044g(this));
    }
}
