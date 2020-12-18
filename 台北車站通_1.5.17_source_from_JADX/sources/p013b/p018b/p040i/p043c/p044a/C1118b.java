package p013b.p018b.p040i.p043c.p044a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p011v7.widget.C0871p;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;
import p013b.p018b.p028h.p029a.C1006a;

/* renamed from: b.b.i.c.a.b */
public final class C1118b {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f4096a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<Context, SparseArray<C1119a>> f4097b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f4098c = new Object();

    /* renamed from: b.b.i.c.a.b$a */
    private static class C1119a {

        /* renamed from: a */
        final ColorStateList f4099a;

        /* renamed from: b */
        final Configuration f4100b;

        C1119a(ColorStateList colorStateList, Configuration configuration) {
            this.f4099a = colorStateList;
            this.f4100b = configuration;
        }
    }

    /* renamed from: a */
    public static ColorStateList m5718a(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList c = m5722c(context, i);
        if (c != null) {
            return c;
        }
        ColorStateList d = m5723d(context, i);
        if (d == null) {
            return C1006a.m5392b(context, i);
        }
        m5720a(context, i, d);
        return d;
    }

    /* renamed from: a */
    private static TypedValue m5719a() {
        TypedValue typedValue = f4096a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f4096a.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: a */
    private static void m5720a(Context context, int i, ColorStateList colorStateList) {
        synchronized (f4098c) {
            SparseArray sparseArray = f4097b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                f4097b.put(context, sparseArray);
            }
            sparseArray.append(i, new C1119a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    /* renamed from: b */
    public static Drawable m5721b(Context context, int i) {
        return C0871p.m4995a().mo4624a(context, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        return null;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList m5722c(android.content.Context r4, int r5) {
        /*
            java.lang.Object r0 = f4098c
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<b.b.i.c.a.b$a>> r1 = f4097b     // Catch:{ all -> 0x0035 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0035 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0032
            int r2 = r1.size()     // Catch:{ all -> 0x0035 }
            if (r2 <= 0) goto L_0x0032
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0035 }
            b.b.i.c.a.b$a r2 = (p013b.p018b.p040i.p043c.p044a.C1118b.C1119a) r2     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0032
            android.content.res.Configuration r3 = r2.f4100b     // Catch:{ all -> 0x0035 }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0035 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0035 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x002f
            android.content.res.ColorStateList r4 = r2.f4099a     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r4
        L_0x002f:
            r1.remove(r5)     // Catch:{ all -> 0x0035 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            r4 = 0
            return r4
        L_0x0035:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p018b.p040i.p043c.p044a.C1118b.m5722c(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* renamed from: d */
    private static ColorStateList m5723d(Context context, int i) {
        if (m5724e(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return C1117a.m5714a(resources, resources.getXml(i), context.getTheme());
        } catch (Exception e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* renamed from: e */
    private static boolean m5724e(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue a = m5719a();
        resources.getValue(i, a, true);
        int i2 = a.type;
        return i2 >= 28 && i2 <= 31;
    }
}
