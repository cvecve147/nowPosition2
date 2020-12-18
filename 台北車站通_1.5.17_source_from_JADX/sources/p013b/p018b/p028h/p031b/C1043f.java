package p013b.p018b.p028h.p031b;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import p013b.p018b.p028h.p029a.p030a.C1007a;

/* renamed from: b.b.h.b.f */
public class C1043f extends C1041d {

    /* renamed from: a */
    private static final Class f3957a;

    /* renamed from: b */
    private static final Constructor f3958b;

    /* renamed from: c */
    private static final Method f3959c;

    /* renamed from: d */
    private static final Method f3960d;

    /* renamed from: e */
    private static final Method f3961e;

    /* renamed from: f */
    private static final Method f3962f;

    /* renamed from: g */
    private static final Method f3963g;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method4 = cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class});
            method3 = cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE});
            method2 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            method5 = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), Integer.TYPE, Integer.TYPE});
            method5.setAccessible(true);
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            cls = null;
            method5 = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        f3958b = constructor;
        f3957a = cls;
        f3959c = method4;
        f3960d = method3;
        f3961e = method2;
        f3962f = method;
        f3963g = method5;
    }

    /* renamed from: a */
    private static void m5507a(Object obj) {
        try {
            f3962f.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static boolean m5508a() {
        if (f3959c == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return f3959c != null;
    }

    /* renamed from: a */
    private static boolean m5509a(Context context, Object obj, String str, int i, int i2, int i3) {
        try {
            return ((Boolean) f3959c.invoke(obj, new Object[]{context.getAssets(), str, 0, false, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), null})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static boolean m5510a(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) f3960d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private static Typeface m5511b(Object obj) {
        try {
            Object newInstance = Array.newInstance(f3957a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f3963g.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private static Object m5512b() {
        try {
            return f3958b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    private static boolean m5513c(Object obj) {
        try {
            return ((Boolean) f3961e.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public Typeface mo5064a(Context context, Resources resources, int i, String str, int i2) {
        if (!m5508a()) {
            return super.mo5064a(context, resources, i, str, i2);
        }
        Object b = m5512b();
        if (!m5509a(context, b, str, 0, -1, -1)) {
            m5507a(b);
            return null;
        } else if (!m5513c(b)) {
            return null;
        } else {
            return m5511b(b);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        r11 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004e, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004f, code lost:
        r8 = r12;
        r12 = r11;
        r11 = r8;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface mo5065a(android.content.Context r10, android.os.CancellationSignal r11, p013b.p018b.p028h.p037f.C1059f.C1061b[] r12, int r13) {
        /*
            r9 = this;
            int r0 = r12.length
            r1 = 1
            r2 = 0
            if (r0 >= r1) goto L_0x0006
            return r2
        L_0x0006:
            boolean r0 = m5508a()
            if (r0 != 0) goto L_0x0064
            b.b.h.f.f$b r12 = r9.mo5074a((p013b.p018b.p028h.p037f.C1059f.C1061b[]) r12, (int) r13)
            android.content.ContentResolver r10 = r10.getContentResolver()
            android.net.Uri r13 = r12.mo5092c()     // Catch:{ IOException -> 0x0063 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r10 = r10.openFileDescriptor(r13, r0, r11)     // Catch:{ IOException -> 0x0063 }
            if (r10 != 0) goto L_0x0026
            if (r10 == 0) goto L_0x0025
            r10.close()     // Catch:{ IOException -> 0x0063 }
        L_0x0025:
            return r2
        L_0x0026:
            android.graphics.Typeface$Builder r11 = new android.graphics.Typeface$Builder     // Catch:{ Throwable -> 0x004c, all -> 0x0049 }
            java.io.FileDescriptor r13 = r10.getFileDescriptor()     // Catch:{ Throwable -> 0x004c, all -> 0x0049 }
            r11.<init>(r13)     // Catch:{ Throwable -> 0x004c, all -> 0x0049 }
            int r13 = r12.mo5093d()     // Catch:{ Throwable -> 0x004c, all -> 0x0049 }
            android.graphics.Typeface$Builder r11 = r11.setWeight(r13)     // Catch:{ Throwable -> 0x004c, all -> 0x0049 }
            boolean r12 = r12.mo5094e()     // Catch:{ Throwable -> 0x004c, all -> 0x0049 }
            android.graphics.Typeface$Builder r11 = r11.setItalic(r12)     // Catch:{ Throwable -> 0x004c, all -> 0x0049 }
            android.graphics.Typeface r11 = r11.build()     // Catch:{ Throwable -> 0x004c, all -> 0x0049 }
            if (r10 == 0) goto L_0x0048
            r10.close()     // Catch:{ IOException -> 0x0063 }
        L_0x0048:
            return r11
        L_0x0049:
            r11 = move-exception
            r12 = r2
            goto L_0x0052
        L_0x004c:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x004e }
        L_0x004e:
            r12 = move-exception
            r8 = r12
            r12 = r11
            r11 = r8
        L_0x0052:
            if (r10 == 0) goto L_0x0062
            if (r12 == 0) goto L_0x005f
            r10.close()     // Catch:{ Throwable -> 0x005a }
            goto L_0x0062
        L_0x005a:
            r10 = move-exception
            r12.addSuppressed(r10)     // Catch:{ IOException -> 0x0063 }
            goto L_0x0062
        L_0x005f:
            r10.close()     // Catch:{ IOException -> 0x0063 }
        L_0x0062:
            throw r11     // Catch:{ IOException -> 0x0063 }
        L_0x0063:
            return r2
        L_0x0064:
            java.util.Map r10 = p013b.p018b.p028h.p037f.C1059f.m5564a((android.content.Context) r10, (p013b.p018b.p028h.p037f.C1059f.C1061b[]) r12, (android.os.CancellationSignal) r11)
            java.lang.Object r11 = m5512b()
            int r0 = r12.length
            r3 = 0
            r4 = r3
        L_0x006f:
            if (r3 >= r0) goto L_0x009a
            r5 = r12[r3]
            android.net.Uri r6 = r5.mo5092c()
            java.lang.Object r6 = r10.get(r6)
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            if (r6 != 0) goto L_0x0080
            goto L_0x0097
        L_0x0080:
            int r4 = r5.mo5091b()
            int r7 = r5.mo5093d()
            boolean r5 = r5.mo5094e()
            boolean r4 = m5510a((java.lang.Object) r11, (java.nio.ByteBuffer) r6, (int) r4, (int) r7, (int) r5)
            if (r4 != 0) goto L_0x0096
            m5507a(r11)
            return r2
        L_0x0096:
            r4 = r1
        L_0x0097:
            int r3 = r3 + 1
            goto L_0x006f
        L_0x009a:
            if (r4 != 0) goto L_0x00a0
            m5507a(r11)
            return r2
        L_0x00a0:
            boolean r10 = m5513c(r11)
            if (r10 != 0) goto L_0x00a7
            return r2
        L_0x00a7:
            android.graphics.Typeface r10 = m5511b(r11)
            android.graphics.Typeface r10 = android.graphics.Typeface.create(r10, r13)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p018b.p028h.p031b.C1043f.mo5065a(android.content.Context, android.os.CancellationSignal, b.b.h.f.f$b[], int):android.graphics.Typeface");
    }

    /* renamed from: a */
    public Typeface mo5066a(Context context, C1007a.C1009b bVar, Resources resources, int i) {
        if (!m5508a()) {
            return super.mo5066a(context, bVar, resources, i);
        }
        Object b = m5512b();
        for (C1007a.C1010c cVar : bVar.mo5002a()) {
            if (!m5509a(context, b, cVar.mo5003a(), 0, cVar.mo5005c(), cVar.mo5006d() ? 1 : 0)) {
                m5507a(b);
                return null;
            }
        }
        if (!m5513c(b)) {
            return null;
        }
        return m5511b(b);
    }
}
