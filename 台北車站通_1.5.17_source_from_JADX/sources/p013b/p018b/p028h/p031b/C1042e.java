package p013b.p018b.p028h.p031b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p013b.p018b.p028h.p029a.p030a.C1007a;
import p013b.p018b.p028h.p037f.C1059f;
import p013b.p018b.p028h.p039h.C1101r;

/* renamed from: b.b.h.b.e */
class C1042e extends C1046i {

    /* renamed from: a */
    private static final Class f3953a;

    /* renamed from: b */
    private static final Constructor f3954b;

    /* renamed from: c */
    private static final Method f3955c;

    /* renamed from: d */
    private static final Method f3956d;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method2 = null;
            method = null;
        }
        f3954b = constructor;
        f3953a = cls;
        f3955c = method;
        f3956d = method2;
    }

    C1042e() {
    }

    /* renamed from: a */
    private static Typeface m5501a(Object obj) {
        try {
            Object newInstance = Array.newInstance(f3953a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f3956d.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static boolean m5502a() {
        if (f3955c == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return f3955c != null;
    }

    /* renamed from: a */
    private static boolean m5503a(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f3955c.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private static Object m5504b() {
        try {
            return f3954b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public Typeface mo5065a(Context context, CancellationSignal cancellationSignal, C1059f.C1061b[] bVarArr, int i) {
        Object b = m5504b();
        C1101r rVar = new C1101r();
        for (C1059f.C1061b bVar : bVarArr) {
            Uri c = bVar.mo5092c();
            ByteBuffer byteBuffer = (ByteBuffer) rVar.get(c);
            if (byteBuffer == null) {
                byteBuffer = C1048j.m5536a(context, cancellationSignal, c);
                rVar.put(c, byteBuffer);
            }
            if (!m5503a(b, byteBuffer, bVar.mo5091b(), bVar.mo5093d(), bVar.mo5094e())) {
                return null;
            }
        }
        return Typeface.create(m5501a(b), i);
    }

    /* renamed from: a */
    public Typeface mo5066a(Context context, C1007a.C1009b bVar, Resources resources, int i) {
        Object b = m5504b();
        for (C1007a.C1010c cVar : bVar.mo5002a()) {
            ByteBuffer a = C1048j.m5535a(context, resources, cVar.mo5004b());
            if (a == null || !m5503a(b, a, 0, cVar.mo5005c(), cVar.mo5006d())) {
                return null;
            }
        }
        return m5501a(b);
    }
}
