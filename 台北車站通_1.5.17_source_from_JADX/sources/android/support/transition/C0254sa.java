package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.transition.C0195M;
import android.support.transition.C0215b;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.transition.sa */
public abstract class C0254sa extends C0195M {

    /* renamed from: K */
    private static final String[] f1100K = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: L */
    private int f1101L = 3;

    /* renamed from: android.support.transition.sa$a */
    private static class C0255a extends AnimatorListenerAdapter implements C0195M.C0198c, C0215b.C0216a {

        /* renamed from: a */
        private final View f1102a;

        /* renamed from: b */
        private final int f1103b;

        /* renamed from: c */
        private final ViewGroup f1104c;

        /* renamed from: d */
        private final boolean f1105d;

        /* renamed from: e */
        private boolean f1106e;

        /* renamed from: f */
        boolean f1107f = false;

        C0255a(View view, int i, boolean z) {
            this.f1102a = view;
            this.f1103b = i;
            this.f1104c = (ViewGroup) view.getParent();
            this.f1105d = z;
            m1189a(true);
        }

        /* renamed from: a */
        private void m1188a() {
            if (!this.f1107f) {
                C0236ka.m1116a(this.f1102a, this.f1103b);
                ViewGroup viewGroup = this.f1104c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m1189a(false);
        }

        /* renamed from: a */
        private void m1189a(boolean z) {
            ViewGroup viewGroup;
            if (this.f1105d && this.f1106e != z && (viewGroup = this.f1104c) != null) {
                this.f1106e = z;
                C0214aa.m1066a(viewGroup, z);
            }
        }

        /* renamed from: a */
        public void mo1010a(C0195M m) {
            m1189a(false);
        }

        /* renamed from: b */
        public void mo1011b(C0195M m) {
        }

        /* renamed from: c */
        public void mo1012c(C0195M m) {
            m1189a(true);
        }

        /* renamed from: d */
        public void mo1013d(C0195M m) {
            m1188a();
            m.mo987b((C0195M.C0198c) this);
        }

        public void onAnimationCancel(Animator animator) {
            this.f1107f = true;
        }

        public void onAnimationEnd(Animator animator) {
            m1188a();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f1107f) {
                C0236ka.m1116a(this.f1102a, this.f1103b);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f1107f) {
                C0236ka.m1116a(this.f1102a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: android.support.transition.sa$b */
    private static class C0256b {

        /* renamed from: a */
        boolean f1108a;

        /* renamed from: b */
        boolean f1109b;

        /* renamed from: c */
        int f1110c;

        /* renamed from: d */
        int f1111d;

        /* renamed from: e */
        ViewGroup f1112e;

        /* renamed from: f */
        ViewGroup f1113f;

        private C0256b() {
        }

        /* synthetic */ C0256b(C0252ra raVar) {
            this();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0077, code lost:
        if (r9 == 0) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0081, code lost:
        if (r0.f1112e == null) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0093, code lost:
        if (r0.f1110c == 0) goto L_0x0095;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.support.transition.C0254sa.C0256b m1176b(android.support.transition.C0208V r8, android.support.transition.C0208V r9) {
        /*
            r7 = this;
            android.support.transition.sa$b r0 = new android.support.transition.sa$b
            r1 = 0
            r0.<init>(r1)
            r2 = 0
            r0.f1108a = r2
            r0.f1109b = r2
            java.lang.String r3 = "android:visibility:parent"
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L_0x0033
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f1014a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x0033
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f1014a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f1110c = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f1014a
            java.lang.Object r6 = r6.get(r3)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f1112e = r6
            goto L_0x0037
        L_0x0033:
            r0.f1110c = r4
            r0.f1112e = r1
        L_0x0037:
            if (r9 == 0) goto L_0x0058
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.f1014a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x0058
            java.util.Map<java.lang.String, java.lang.Object> r1 = r9.f1014a
            java.lang.Object r1 = r1.get(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.f1111d = r1
            java.util.Map<java.lang.String, java.lang.Object> r1 = r9.f1014a
            java.lang.Object r1 = r1.get(r3)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            goto L_0x005a
        L_0x0058:
            r0.f1111d = r4
        L_0x005a:
            r0.f1113f = r1
            r1 = 1
            if (r8 == 0) goto L_0x0084
            if (r9 == 0) goto L_0x0084
            int r8 = r0.f1110c
            int r9 = r0.f1111d
            if (r8 != r9) goto L_0x006e
            android.view.ViewGroup r8 = r0.f1112e
            android.view.ViewGroup r9 = r0.f1113f
            if (r8 != r9) goto L_0x006e
            return r0
        L_0x006e:
            int r8 = r0.f1110c
            int r9 = r0.f1111d
            if (r8 == r9) goto L_0x007a
            if (r8 != 0) goto L_0x0077
            goto L_0x0095
        L_0x0077:
            if (r9 != 0) goto L_0x0098
            goto L_0x008a
        L_0x007a:
            android.view.ViewGroup r8 = r0.f1113f
            if (r8 != 0) goto L_0x007f
            goto L_0x0095
        L_0x007f:
            android.view.ViewGroup r8 = r0.f1112e
            if (r8 != 0) goto L_0x0098
            goto L_0x008a
        L_0x0084:
            if (r8 != 0) goto L_0x008f
            int r8 = r0.f1111d
            if (r8 != 0) goto L_0x008f
        L_0x008a:
            r0.f1109b = r1
        L_0x008c:
            r0.f1108a = r1
            goto L_0x0098
        L_0x008f:
            if (r9 != 0) goto L_0x0098
            int r8 = r0.f1110c
            if (r8 != 0) goto L_0x0098
        L_0x0095:
            r0.f1109b = r2
            goto L_0x008c
        L_0x0098:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.transition.C0254sa.m1176b(android.support.transition.V, android.support.transition.V):android.support.transition.sa$b");
    }

    /* renamed from: d */
    private void m1177d(C0208V v) {
        v.f1014a.put("android:visibility:visibility", Integer.valueOf(v.f1015b.getVisibility()));
        v.f1014a.put("android:visibility:parent", v.f1015b.getParent());
        int[] iArr = new int[2];
        v.f1015b.getLocationOnScreen(iArr);
        v.f1014a.put("android:visibility:screenLocation", iArr);
    }

    /* renamed from: a */
    public Animator mo1101a(ViewGroup viewGroup, C0208V v, int i, C0208V v2, int i2) {
        if ((this.f1101L & 1) != 1 || v2 == null) {
            return null;
        }
        if (v == null) {
            View view = (View) v2.f1015b.getParent();
            if (m1176b(mo976a(view, false), mo988b(view, false)).f1108a) {
                return null;
            }
        }
        return mo1096a(viewGroup, v2.f1015b, v, v2);
    }

    /* renamed from: a */
    public Animator mo972a(ViewGroup viewGroup, C0208V v, C0208V v2) {
        C0256b b = m1176b(v, v2);
        if (!b.f1108a) {
            return null;
        }
        if (b.f1112e == null && b.f1113f == null) {
            return null;
        }
        if (b.f1109b) {
            return mo1101a(viewGroup, v, b.f1110c, v2, b.f1111d);
        }
        return mo1103b(viewGroup, v, b.f1110c, v2, b.f1111d);
    }

    /* renamed from: a */
    public abstract Animator mo1096a(ViewGroup viewGroup, View view, C0208V v, C0208V v2);

    /* renamed from: a */
    public void mo1102a(int i) {
        if ((i & -4) == 0) {
            this.f1101L = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    /* renamed from: a */
    public void mo980a(C0208V v) {
        m1177d(v);
    }

    /* renamed from: a */
    public boolean mo985a(C0208V v, C0208V v2) {
        if (v == null && v2 == null) {
            return false;
        }
        if (v != null && v2 != null && v2.f1014a.containsKey("android:visibility:visibility") != v.f1014a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C0256b b = m1176b(v, v2);
        if (b.f1108a) {
            return b.f1110c == 0 || b.f1111d == 0;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0076 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00dd A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo1103b(android.view.ViewGroup r7, android.support.transition.C0208V r8, int r9, android.support.transition.C0208V r10, int r11) {
        /*
            r6 = this;
            int r9 = r6.f1101L
            r0 = 2
            r9 = r9 & r0
            r1 = 0
            if (r9 == r0) goto L_0x0008
            return r1
        L_0x0008:
            if (r8 == 0) goto L_0x000d
            android.view.View r9 = r8.f1015b
            goto L_0x000e
        L_0x000d:
            r9 = r1
        L_0x000e:
            if (r10 == 0) goto L_0x0013
            android.view.View r2 = r10.f1015b
            goto L_0x0014
        L_0x0013:
            r2 = r1
        L_0x0014:
            r3 = 1
            if (r2 == 0) goto L_0x0026
            android.view.ViewParent r4 = r2.getParent()
            if (r4 != 0) goto L_0x001e
            goto L_0x0026
        L_0x001e:
            r4 = 4
            if (r11 != r4) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            if (r9 != r2) goto L_0x0029
        L_0x0024:
            r9 = r1
            goto L_0x0073
        L_0x0026:
            if (r2 == 0) goto L_0x002b
            r9 = r2
        L_0x0029:
            r2 = r1
            goto L_0x0073
        L_0x002b:
            if (r9 == 0) goto L_0x0071
            android.view.ViewParent r2 = r9.getParent()
            if (r2 != 0) goto L_0x0034
            goto L_0x0029
        L_0x0034:
            android.view.ViewParent r2 = r9.getParent()
            boolean r2 = r2 instanceof android.view.View
            if (r2 == 0) goto L_0x0071
            android.view.ViewParent r2 = r9.getParent()
            android.view.View r2 = (android.view.View) r2
            android.support.transition.V r4 = r6.mo988b((android.view.View) r2, (boolean) r3)
            android.support.transition.V r5 = r6.mo976a((android.view.View) r2, (boolean) r3)
            android.support.transition.sa$b r4 = r6.m1176b(r4, r5)
            boolean r4 = r4.f1108a
            if (r4 != 0) goto L_0x0057
            android.view.View r9 = android.support.transition.C0207U.m1052a((android.view.ViewGroup) r7, (android.view.View) r9, (android.view.View) r2)
            goto L_0x0029
        L_0x0057:
            android.view.ViewParent r4 = r2.getParent()
            if (r4 != 0) goto L_0x006f
            int r2 = r2.getId()
            r4 = -1
            if (r2 == r4) goto L_0x006f
            android.view.View r2 = r7.findViewById(r2)
            if (r2 == 0) goto L_0x006f
            boolean r2 = r6.f994z
            if (r2 == 0) goto L_0x006f
            goto L_0x0029
        L_0x006f:
            r9 = r1
            goto L_0x0029
        L_0x0071:
            r9 = r1
            r2 = r9
        L_0x0073:
            r4 = 0
            if (r9 == 0) goto L_0x00bb
            if (r8 == 0) goto L_0x00bb
            java.util.Map<java.lang.String, java.lang.Object> r11 = r8.f1014a
            java.lang.String r1 = "android:visibility:screenLocation"
            java.lang.Object r11 = r11.get(r1)
            int[] r11 = (int[]) r11
            r1 = r11[r4]
            r11 = r11[r3]
            int[] r0 = new int[r0]
            r7.getLocationOnScreen(r0)
            r2 = r0[r4]
            int r1 = r1 - r2
            int r2 = r9.getLeft()
            int r1 = r1 - r2
            r9.offsetLeftAndRight(r1)
            r0 = r0[r3]
            int r11 = r11 - r0
            int r0 = r9.getTop()
            int r11 = r11 - r0
            r9.offsetTopAndBottom(r11)
            android.support.transition.Z r11 = android.support.transition.C0214aa.m1065a(r7)
            r11.mo1027a(r9)
            android.animation.Animator r7 = r6.mo1097b(r7, r9, r8, r10)
            if (r7 != 0) goto L_0x00b2
            r11.mo1028b(r9)
            goto L_0x00ba
        L_0x00b2:
            android.support.transition.ra r8 = new android.support.transition.ra
            r8.<init>(r6, r11, r9)
            r7.addListener(r8)
        L_0x00ba:
            return r7
        L_0x00bb:
            if (r2 == 0) goto L_0x00dd
            int r9 = r2.getVisibility()
            android.support.transition.C0236ka.m1116a((android.view.View) r2, (int) r4)
            android.animation.Animator r7 = r6.mo1097b(r7, r2, r8, r10)
            if (r7 == 0) goto L_0x00d9
            android.support.transition.sa$a r8 = new android.support.transition.sa$a
            r8.<init>(r2, r11, r3)
            r7.addListener(r8)
            android.support.transition.C0213a.m1063a(r7, r8)
            r6.mo974a((android.support.transition.C0195M.C0198c) r8)
            goto L_0x00dc
        L_0x00d9:
            android.support.transition.C0236ka.m1116a((android.view.View) r2, (int) r9)
        L_0x00dc:
            return r7
        L_0x00dd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.transition.C0254sa.mo1103b(android.view.ViewGroup, android.support.transition.V, int, android.support.transition.V, int):android.animation.Animator");
    }

    /* renamed from: b */
    public abstract Animator mo1097b(ViewGroup viewGroup, View view, C0208V v, C0208V v2);

    /* renamed from: c */
    public void mo991c(C0208V v) {
        m1177d(v);
    }

    /* renamed from: n */
    public String[] mo1006n() {
        return f1100K;
    }
}
