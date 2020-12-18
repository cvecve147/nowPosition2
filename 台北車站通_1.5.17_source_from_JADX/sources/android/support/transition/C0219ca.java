package android.support.transition;

import android.animation.LayoutTransition;
import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.transition.ca */
class C0219ca implements C0223ea {

    /* renamed from: a */
    private static LayoutTransition f1025a;

    /* renamed from: b */
    private static Field f1026b;

    /* renamed from: c */
    private static boolean f1027c;

    /* renamed from: d */
    private static Method f1028d;

    /* renamed from: e */
    private static boolean f1029e;

    C0219ca() {
    }

    /* renamed from: a */
    private static void m1073a(LayoutTransition layoutTransition) {
        if (!f1029e) {
            try {
                f1028d = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                f1028d.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
            }
            f1029e = true;
        }
        Method method = f1028d;
        if (method != null) {
            try {
                method.invoke(layoutTransition, new Object[0]);
            } catch (IllegalAccessException unused2) {
                Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
            } catch (InvocationTargetException unused3) {
                Log.i("ViewGroupUtilsApi14", "Failed to invoke cancel method by reflection");
            }
        }
    }

    /* renamed from: a */
    public C0212Z mo1037a(ViewGroup viewGroup) {
        return C0210X.m1053a(viewGroup);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1038a(android.view.ViewGroup r6, boolean r7) {
        /*
            r5 = this;
            android.animation.LayoutTransition r0 = f1025a
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L_0x002a
            android.support.transition.ba r0 = new android.support.transition.ba
            r0.<init>(r5)
            f1025a = r0
            android.animation.LayoutTransition r0 = f1025a
            r4 = 2
            r0.setAnimator(r4, r3)
            android.animation.LayoutTransition r0 = f1025a
            r0.setAnimator(r2, r3)
            android.animation.LayoutTransition r0 = f1025a
            r0.setAnimator(r1, r3)
            android.animation.LayoutTransition r0 = f1025a
            r4 = 3
            r0.setAnimator(r4, r3)
            android.animation.LayoutTransition r0 = f1025a
            r4 = 4
            r0.setAnimator(r4, r3)
        L_0x002a:
            if (r7 == 0) goto L_0x004a
            android.animation.LayoutTransition r7 = r6.getLayoutTransition()
            if (r7 == 0) goto L_0x0044
            boolean r0 = r7.isRunning()
            if (r0 == 0) goto L_0x003b
            m1073a((android.animation.LayoutTransition) r7)
        L_0x003b:
            android.animation.LayoutTransition r0 = f1025a
            if (r7 == r0) goto L_0x0044
            int r0 = android.support.transition.C0189G.transition_layout_save
            r6.setTag(r0, r7)
        L_0x0044:
            android.animation.LayoutTransition r7 = f1025a
        L_0x0046:
            r6.setLayoutTransition(r7)
            goto L_0x0098
        L_0x004a:
            r6.setLayoutTransition(r3)
            boolean r7 = f1027c
            java.lang.String r0 = "ViewGroupUtilsApi14"
            if (r7 != 0) goto L_0x006a
            java.lang.Class<android.view.ViewGroup> r7 = android.view.ViewGroup.class
            java.lang.String r4 = "mLayoutSuppressed"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r4)     // Catch:{ NoSuchFieldException -> 0x0063 }
            f1026b = r7     // Catch:{ NoSuchFieldException -> 0x0063 }
            java.lang.reflect.Field r7 = f1026b     // Catch:{ NoSuchFieldException -> 0x0063 }
            r7.setAccessible(r1)     // Catch:{ NoSuchFieldException -> 0x0063 }
            goto L_0x0068
        L_0x0063:
            java.lang.String r7 = "Failed to access mLayoutSuppressed field by reflection"
            android.util.Log.i(r0, r7)
        L_0x0068:
            f1027c = r1
        L_0x006a:
            java.lang.reflect.Field r7 = f1026b
            if (r7 == 0) goto L_0x0083
            boolean r7 = r7.getBoolean(r6)     // Catch:{ IllegalAccessException -> 0x007e }
            if (r7 == 0) goto L_0x007c
            java.lang.reflect.Field r1 = f1026b     // Catch:{ IllegalAccessException -> 0x007a }
            r1.setBoolean(r6, r2)     // Catch:{ IllegalAccessException -> 0x007a }
            goto L_0x007c
        L_0x007a:
            r2 = r7
            goto L_0x007e
        L_0x007c:
            r2 = r7
            goto L_0x0083
        L_0x007e:
            java.lang.String r7 = "Failed to get mLayoutSuppressed field by reflection"
            android.util.Log.i(r0, r7)
        L_0x0083:
            if (r2 == 0) goto L_0x0088
            r6.requestLayout()
        L_0x0088:
            int r7 = android.support.transition.C0189G.transition_layout_save
            java.lang.Object r7 = r6.getTag(r7)
            android.animation.LayoutTransition r7 = (android.animation.LayoutTransition) r7
            if (r7 == 0) goto L_0x0098
            int r0 = android.support.transition.C0189G.transition_layout_save
            r6.setTag(r0, r3)
            goto L_0x0046
        L_0x0098:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.transition.C0219ca.mo1038a(android.view.ViewGroup, boolean):void");
    }
}
