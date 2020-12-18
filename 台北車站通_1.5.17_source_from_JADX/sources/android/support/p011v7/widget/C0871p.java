package android.support.p011v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import p013b.p018b.p023e.p024a.C0967d;
import p013b.p018b.p023e.p024a.C0977k;
import p013b.p018b.p028h.p029a.C1006a;
import p013b.p018b.p028h.p031b.C1025a;
import p013b.p018b.p028h.p031b.p032a.C1026a;
import p013b.p018b.p028h.p039h.C1080b;
import p013b.p018b.p028h.p039h.C1087i;
import p013b.p018b.p028h.p039h.C1088j;
import p013b.p018b.p028h.p039h.C1102s;
import p013b.p018b.p040i.p041a.C1103a;
import p013b.p018b.p040i.p041a.C1107e;

/* renamed from: android.support.v7.widget.p */
public final class C0871p {

    /* renamed from: a */
    private static final PorterDuff.Mode f3572a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private static C0871p f3573b;

    /* renamed from: c */
    private static final C0873b f3574c = new C0873b(6);

    /* renamed from: d */
    private static final int[] f3575d = {C1107e.abc_textfield_search_default_mtrl_alpha, C1107e.abc_textfield_default_mtrl_alpha, C1107e.abc_ab_share_pack_mtrl_alpha};

    /* renamed from: e */
    private static final int[] f3576e = {C1107e.abc_ic_commit_search_api_mtrl_alpha, C1107e.abc_seekbar_tick_mark_material, C1107e.abc_ic_menu_share_mtrl_alpha, C1107e.abc_ic_menu_copy_mtrl_am_alpha, C1107e.abc_ic_menu_cut_mtrl_alpha, C1107e.abc_ic_menu_selectall_mtrl_alpha, C1107e.abc_ic_menu_paste_mtrl_am_alpha};

    /* renamed from: f */
    private static final int[] f3577f = {C1107e.abc_textfield_activated_mtrl_alpha, C1107e.abc_textfield_search_activated_mtrl_alpha, C1107e.abc_cab_background_top_mtrl_alpha, C1107e.abc_text_cursor_material, C1107e.abc_text_select_handle_left_mtrl_dark, C1107e.abc_text_select_handle_middle_mtrl_dark, C1107e.abc_text_select_handle_right_mtrl_dark, C1107e.abc_text_select_handle_left_mtrl_light, C1107e.abc_text_select_handle_middle_mtrl_light, C1107e.abc_text_select_handle_right_mtrl_light};

    /* renamed from: g */
    private static final int[] f3578g = {C1107e.abc_popup_background_mtrl_mult, C1107e.abc_cab_background_internal_bg, C1107e.abc_menu_hardkey_panel_mtrl_mult};

    /* renamed from: h */
    private static final int[] f3579h = {C1107e.abc_tab_indicator_material, C1107e.abc_textfield_search_material};

    /* renamed from: i */
    private static final int[] f3580i = {C1107e.abc_btn_check_material, C1107e.abc_btn_radio_material};

    /* renamed from: j */
    private WeakHashMap<Context, C1102s<ColorStateList>> f3581j;

    /* renamed from: k */
    private C1080b<String, C0874c> f3582k;

    /* renamed from: l */
    private C1102s<String> f3583l;

    /* renamed from: m */
    private final Object f3584m = new Object();

    /* renamed from: n */
    private final WeakHashMap<Context, C1087i<WeakReference<Drawable.ConstantState>>> f3585n = new WeakHashMap<>(0);

    /* renamed from: o */
    private TypedValue f3586o;

    /* renamed from: p */
    private boolean f3587p;

    /* renamed from: android.support.v7.widget.p$a */
    private static class C0872a implements C0874c {
        C0872a() {
        }

        /* renamed from: a */
        public Drawable mo4629a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0967d.m5260a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* renamed from: android.support.v7.widget.p$b */
    private static class C0873b extends C1088j<Integer, PorterDuffColorFilter> {
        public C0873b(int i) {
            super(i);
        }

        /* renamed from: b */
        private static int m5020b(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public PorterDuffColorFilter mo4630a(int i, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) mo5161b(Integer.valueOf(m5020b(i, mode)));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public PorterDuffColorFilter mo4631a(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) mo5157a(Integer.valueOf(m5020b(i, mode)), porterDuffColorFilter);
        }
    }

    /* renamed from: android.support.v7.widget.p$c */
    private interface C0874c {
        /* renamed from: a */
        Drawable mo4629a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: android.support.v7.widget.p$d */
    private static class C0875d implements C0874c {
        C0875d() {
        }

        /* renamed from: a */
        public Drawable mo4629a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0977k.createFromXmlInner(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    private static long m4989a(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* renamed from: a */
    static PorterDuff.Mode m4990a(int i) {
        if (i == C1107e.abc_switch_thumb_material) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return null;
    }

    /* renamed from: a */
    public static PorterDuffColorFilter m4991a(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter a = f3574c.mo4630a(i, mode);
        if (a != null) {
            return a;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        f3574c.mo4631a(i, mode, porterDuffColorFilter);
        return porterDuffColorFilter;
    }

    /* renamed from: a */
    private static PorterDuffColorFilter m4992a(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m4991a(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: a */
    private Drawable m4993a(Context context, int i, boolean z, Drawable drawable) {
        LayerDrawable layerDrawable;
        Drawable findDrawableByLayerId;
        int i2;
        ColorStateList b = mo4628b(context, i);
        if (b != null) {
            if (C0831fa.m4813a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable i3 = C1026a.m5462i(drawable);
            C1026a.m5447a(i3, b);
            PorterDuff.Mode a = m4990a(i);
            if (a == null) {
                return i3;
            }
            C1026a.m5450a(i3, a);
            return i3;
        }
        if (i == C1107e.abc_seekbar_track_material) {
            layerDrawable = (LayerDrawable) drawable;
            m4997a(layerDrawable.findDrawableByLayerId(16908288), C0810_a.m4757b(context, C1103a.colorControlNormal), f3572a);
            findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908303);
            i2 = C1103a.colorControlNormal;
        } else if (i == C1107e.abc_ratingbar_material || i == C1107e.abc_ratingbar_indicator_material || i == C1107e.abc_ratingbar_small_material) {
            layerDrawable = (LayerDrawable) drawable;
            m4997a(layerDrawable.findDrawableByLayerId(16908288), C0810_a.m4754a(context, C1103a.colorControlNormal), f3572a);
            findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908303);
            i2 = C1103a.colorControlActivated;
        } else if (m5001a(context, i, drawable) || !z) {
            return drawable;
        } else {
            return null;
        }
        m4997a(findDrawableByLayerId, C0810_a.m4757b(context, i2), f3572a);
        m4997a(layerDrawable.findDrawableByLayerId(16908301), C0810_a.m4757b(context, C1103a.colorControlActivated), f3572a);
        return drawable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m4994a(android.content.Context r5, long r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f3584m
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, b.b.h.h.i<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r1 = r4.f3585n     // Catch:{ all -> 0x002f }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x002f }
            b.b.h.h.i r1 = (p013b.p018b.p028h.p039h.C1087i) r1     // Catch:{ all -> 0x002f }
            r2 = 0
            if (r1 != 0) goto L_0x0010
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return r2
        L_0x0010:
            java.lang.Object r3 = r1.mo5147b((long) r6)     // Catch:{ all -> 0x002f }
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch:{ all -> 0x002f }
            if (r3 == 0) goto L_0x002d
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x002f }
            android.graphics.drawable.Drawable$ConstantState r3 = (android.graphics.drawable.Drawable.ConstantState) r3     // Catch:{ all -> 0x002f }
            if (r3 == 0) goto L_0x002a
            android.content.res.Resources r5 = r5.getResources()     // Catch:{ all -> 0x002f }
            android.graphics.drawable.Drawable r5 = r3.newDrawable(r5)     // Catch:{ all -> 0x002f }
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return r5
        L_0x002a:
            r1.mo5146a((long) r6)     // Catch:{ all -> 0x002f }
        L_0x002d:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return r2
        L_0x002f:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.C0871p.m4994a(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    public static C0871p m4995a() {
        if (f3573b == null) {
            f3573b = new C0871p();
            m4999a(f3573b);
        }
        return f3573b;
    }

    /* renamed from: a */
    private void m4996a(Context context, int i, ColorStateList colorStateList) {
        if (this.f3581j == null) {
            this.f3581j = new WeakHashMap<>();
        }
        C1102s sVar = this.f3581j.get(context);
        if (sVar == null) {
            sVar = new C1102s();
            this.f3581j.put(context, sVar);
        }
        sVar.mo5251a(i, colorStateList);
    }

    /* renamed from: a */
    private static void m4997a(Drawable drawable, int i, PorterDuff.Mode mode) {
        if (C0831fa.m4813a(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = f3572a;
        }
        drawable.setColorFilter(m4991a(i, mode));
    }

    /* renamed from: a */
    static void m4998a(Drawable drawable, C0821cb cbVar, int[] iArr) {
        if (!C0831fa.m4813a(drawable) || drawable.mutate() == drawable) {
            if (cbVar.f3395d || cbVar.f3394c) {
                drawable.setColorFilter(m4992a(cbVar.f3395d ? cbVar.f3392a : null, cbVar.f3394c ? cbVar.f3393b : f3572a, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("AppCompatDrawableManag", "Mutated drawable is not the same instance as the input.");
    }

    /* renamed from: a */
    private static void m4999a(C0871p pVar) {
        if (Build.VERSION.SDK_INT < 24) {
            pVar.m5000a("vector", (C0874c) new C0875d());
            pVar.m5000a("animated-vector", (C0874c) new C0872a());
        }
    }

    /* renamed from: a */
    private void m5000a(String str, C0874c cVar) {
        if (this.f3582k == null) {
            this.f3582k = new C1080b<>();
        }
        this.f3582k.put(str, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0060 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m5001a(android.content.Context r6, int r7, android.graphics.drawable.Drawable r8) {
        /*
            android.graphics.PorterDuff$Mode r0 = f3572a
            int[] r1 = f3575d
            boolean r1 = m5004a((int[]) r1, (int) r7)
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            r3 = -1
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0015
            int r2 = p013b.p018b.p040i.p041a.C1103a.colorControlNormal
        L_0x0012:
            r1 = r3
        L_0x0013:
            r7 = r5
            goto L_0x0043
        L_0x0015:
            int[] r1 = f3577f
            boolean r1 = m5004a((int[]) r1, (int) r7)
            if (r1 == 0) goto L_0x0020
            int r2 = p013b.p018b.p040i.p041a.C1103a.colorControlActivated
            goto L_0x0012
        L_0x0020:
            int[] r1 = f3578g
            boolean r1 = m5004a((int[]) r1, (int) r7)
            if (r1 == 0) goto L_0x002b
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x0012
        L_0x002b:
            int r1 = p013b.p018b.p040i.p041a.C1107e.abc_list_divider_mtrl_alpha
            if (r7 != r1) goto L_0x003b
            r2 = 16842800(0x1010030, float:2.3693693E-38)
            r7 = 1109603123(0x42233333, float:40.8)
            int r7 = java.lang.Math.round(r7)
            r1 = r7
            goto L_0x0013
        L_0x003b:
            int r1 = p013b.p018b.p040i.p041a.C1107e.abc_dialog_material_background
            if (r7 != r1) goto L_0x0040
            goto L_0x0012
        L_0x0040:
            r1 = r3
            r7 = r4
            r2 = r7
        L_0x0043:
            if (r7 == 0) goto L_0x0060
            boolean r7 = android.support.p011v7.widget.C0831fa.m4813a(r8)
            if (r7 == 0) goto L_0x004f
            android.graphics.drawable.Drawable r8 = r8.mutate()
        L_0x004f:
            int r6 = android.support.p011v7.widget.C0810_a.m4757b(r6, r2)
            android.graphics.PorterDuffColorFilter r6 = m4991a((int) r6, (android.graphics.PorterDuff.Mode) r0)
            r8.setColorFilter(r6)
            if (r1 == r3) goto L_0x005f
            r8.setAlpha(r1)
        L_0x005f:
            return r5
        L_0x0060:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.C0871p.m5001a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    /* renamed from: a */
    private boolean m5002a(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        synchronized (this.f3584m) {
            C1087i iVar = this.f3585n.get(context);
            if (iVar == null) {
                iVar = new C1087i();
                this.f3585n.put(context, iVar);
            }
            iVar.mo5149b(j, new WeakReference(constantState));
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m5003a(Drawable drawable) {
        return (drawable instanceof C0977k) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* renamed from: a */
    private static boolean m5004a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m5005b(Context context) {
        if (!this.f3587p) {
            this.f3587p = true;
            Drawable a = mo4624a(context, C1107e.abc_vector_test);
            if (a == null || !m5003a(a)) {
                this.f3587p = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    /* renamed from: c */
    private ColorStateList m5006c(Context context) {
        return m5007c(context, 0);
    }

    /* renamed from: c */
    private ColorStateList m5007c(Context context, int i) {
        int b = C0810_a.m4757b(context, C1103a.colorControlHighlight);
        int a = C0810_a.m4754a(context, C1103a.colorButtonNormal);
        return new ColorStateList(new int[][]{C0810_a.f3353b, C0810_a.f3356e, C0810_a.f3354c, C0810_a.f3360i}, new int[]{a, C1025a.m5441a(b, i), C1025a.m5441a(b, i), i});
    }

    /* renamed from: d */
    private ColorStateList m5008d(Context context) {
        return m5007c(context, C0810_a.m4757b(context, C1103a.colorAccent));
    }

    /* renamed from: d */
    private Drawable m5009d(Context context, int i) {
        if (this.f3586o == null) {
            this.f3586o = new TypedValue();
        }
        TypedValue typedValue = this.f3586o;
        context.getResources().getValue(i, typedValue, true);
        long a = m4989a(typedValue);
        Drawable a2 = m4994a(context, a);
        if (a2 != null) {
            return a2;
        }
        if (i == C1107e.abc_cab_background_top_material) {
            a2 = new LayerDrawable(new Drawable[]{mo4624a(context, C1107e.abc_cab_background_internal_bg), mo4624a(context, C1107e.abc_cab_background_top_mtrl_alpha)});
        }
        if (a2 != null) {
            a2.setChangingConfigurations(typedValue.changingConfigurations);
            m5002a(context, a, a2);
        }
        return a2;
    }

    /* renamed from: e */
    private ColorStateList m5010e(Context context) {
        return m5007c(context, C0810_a.m4757b(context, C1103a.colorButtonNormal));
    }

    /* renamed from: e */
    private ColorStateList m5011e(Context context, int i) {
        C1102s sVar;
        WeakHashMap<Context, C1102s<ColorStateList>> weakHashMap = this.f3581j;
        if (weakHashMap == null || (sVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) sVar.mo5252b(i);
    }

    /* renamed from: f */
    private ColorStateList m5012f(Context context) {
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList c = C0810_a.m4758c(context, C1103a.colorSwitchThumbNormal);
        if (c == null || !c.isStateful()) {
            iArr[0] = C0810_a.f3353b;
            iArr2[0] = C0810_a.m4754a(context, C1103a.colorSwitchThumbNormal);
            iArr[1] = C0810_a.f3357f;
            iArr2[1] = C0810_a.m4757b(context, C1103a.colorControlActivated);
            iArr[2] = C0810_a.f3360i;
            iArr2[2] = C0810_a.m4757b(context, C1103a.colorSwitchThumbNormal);
        } else {
            iArr[0] = C0810_a.f3353b;
            iArr2[0] = c.getColorForState(iArr[0], 0);
            iArr[1] = C0810_a.f3357f;
            iArr2[1] = C0810_a.m4757b(context, C1103a.colorControlActivated);
            iArr[2] = C0810_a.f3360i;
            iArr2[2] = c.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[Catch:{ Exception -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a A[Catch:{ Exception -> 0x00a2 }] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m5013f(android.content.Context r11, int r12) {
        /*
            r10 = this;
            b.b.h.h.b<java.lang.String, android.support.v7.widget.p$c> r0 = r10.f3582k
            r1 = 0
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b2
            b.b.h.h.s<java.lang.String> r0 = r10.f3583l
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.mo5252b(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            b.b.h.h.b<java.lang.String, android.support.v7.widget.p$c> r3 = r10.f3582k
            java.lang.Object r0 = r3.get(r0)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            b.b.h.h.s r0 = new b.b.h.h.s
            r0.<init>()
            r10.f3583l = r0
        L_0x002f:
            android.util.TypedValue r0 = r10.f3586o
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.f3586o = r0
        L_0x003a:
            android.util.TypedValue r0 = r10.f3586o
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            long r4 = m4989a((android.util.TypedValue) r0)
            android.graphics.drawable.Drawable r6 = r10.m4994a((android.content.Context) r11, (long) r4)
            if (r6 == 0) goto L_0x004f
            return r6
        L_0x004f:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00aa
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00aa
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch:{ Exception -> 0x00a2 }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x00a2 }
        L_0x0067:
            int r8 = r1.next()     // Catch:{ Exception -> 0x00a2 }
            r9 = 2
            if (r8 == r9) goto L_0x0071
            if (r8 == r3) goto L_0x0071
            goto L_0x0067
        L_0x0071:
            if (r8 != r9) goto L_0x009a
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x00a2 }
            b.b.h.h.s<java.lang.String> r8 = r10.f3583l     // Catch:{ Exception -> 0x00a2 }
            r8.mo5251a(r12, r3)     // Catch:{ Exception -> 0x00a2 }
            b.b.h.h.b<java.lang.String, android.support.v7.widget.p$c> r8 = r10.f3582k     // Catch:{ Exception -> 0x00a2 }
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Exception -> 0x00a2 }
            android.support.v7.widget.p$c r3 = (android.support.p011v7.widget.C0871p.C0874c) r3     // Catch:{ Exception -> 0x00a2 }
            if (r3 == 0) goto L_0x008f
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch:{ Exception -> 0x00a2 }
            android.graphics.drawable.Drawable r1 = r3.mo4629a(r11, r1, r7, r8)     // Catch:{ Exception -> 0x00a2 }
            r6 = r1
        L_0x008f:
            if (r6 == 0) goto L_0x00aa
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00a2 }
            r6.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00a2 }
            r10.m5002a((android.content.Context) r11, (long) r4, (android.graphics.drawable.Drawable) r6)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x00aa
        L_0x009a:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch:{ Exception -> 0x00a2 }
            throw r11     // Catch:{ Exception -> 0x00a2 }
        L_0x00a2:
            r11 = move-exception
            java.lang.String r0 = "AppCompatDrawableManag"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r11)
        L_0x00aa:
            if (r6 != 0) goto L_0x00b1
            b.b.h.h.s<java.lang.String> r11 = r10.f3583l
            r11.mo5251a(r12, r2)
        L_0x00b1:
            return r6
        L_0x00b2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.C0871p.m5013f(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    public Drawable mo4624a(Context context, int i) {
        return mo4625a(context, i, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Drawable mo4625a(Context context, int i, boolean z) {
        m5005b(context);
        Drawable f = m5013f(context, i);
        if (f == null) {
            f = m5009d(context, i);
        }
        if (f == null) {
            f = C1006a.m5394c(context, i);
        }
        if (f != null) {
            f = m4993a(context, i, z, f);
        }
        if (f != null) {
            C0831fa.m4814b(f);
        }
        return f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Drawable mo4626a(Context context, C0884rb rbVar, int i) {
        Drawable f = m5013f(context, i);
        if (f == null) {
            f = rbVar.mo4688a(i);
        }
        if (f != null) {
            return m4993a(context, i, false, f);
        }
        return null;
    }

    /* renamed from: a */
    public void mo4627a(Context context) {
        synchronized (this.f3584m) {
            C1087i iVar = this.f3585n.get(context);
            if (iVar != null) {
                iVar.mo5153d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0077  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.res.ColorStateList mo4628b(android.content.Context r3, int r4) {
        /*
            r2 = this;
            android.content.res.ColorStateList r0 = r2.m5011e(r3, r4)
            if (r0 != 0) goto L_0x007a
            int r1 = p013b.p018b.p040i.p041a.C1107e.abc_edit_text_material
            if (r4 != r1) goto L_0x0012
            int r0 = p013b.p018b.p040i.p041a.C1105c.abc_tint_edittext
        L_0x000c:
            android.content.res.ColorStateList r0 = p013b.p018b.p040i.p043c.p044a.C1118b.m5718a(r3, r0)
            goto L_0x0075
        L_0x0012:
            int r1 = p013b.p018b.p040i.p041a.C1107e.abc_switch_track_mtrl_alpha
            if (r4 != r1) goto L_0x0019
            int r0 = p013b.p018b.p040i.p041a.C1105c.abc_tint_switch_track
            goto L_0x000c
        L_0x0019:
            int r1 = p013b.p018b.p040i.p041a.C1107e.abc_switch_thumb_material
            if (r4 != r1) goto L_0x0022
            android.content.res.ColorStateList r0 = r2.m5012f(r3)
            goto L_0x0075
        L_0x0022:
            int r1 = p013b.p018b.p040i.p041a.C1107e.abc_btn_default_mtrl_shape
            if (r4 != r1) goto L_0x002b
            android.content.res.ColorStateList r0 = r2.m5010e(r3)
            goto L_0x0075
        L_0x002b:
            int r1 = p013b.p018b.p040i.p041a.C1107e.abc_btn_borderless_material
            if (r4 != r1) goto L_0x0034
            android.content.res.ColorStateList r0 = r2.m5006c(r3)
            goto L_0x0075
        L_0x0034:
            int r1 = p013b.p018b.p040i.p041a.C1107e.abc_btn_colored_material
            if (r4 != r1) goto L_0x003d
            android.content.res.ColorStateList r0 = r2.m5008d(r3)
            goto L_0x0075
        L_0x003d:
            int r1 = p013b.p018b.p040i.p041a.C1107e.abc_spinner_mtrl_am_alpha
            if (r4 == r1) goto L_0x0072
            int r1 = p013b.p018b.p040i.p041a.C1107e.abc_spinner_textfield_background_material
            if (r4 != r1) goto L_0x0046
            goto L_0x0072
        L_0x0046:
            int[] r1 = f3576e
            boolean r1 = m5004a((int[]) r1, (int) r4)
            if (r1 == 0) goto L_0x0055
            int r0 = p013b.p018b.p040i.p041a.C1103a.colorControlNormal
            android.content.res.ColorStateList r0 = android.support.p011v7.widget.C0810_a.m4758c(r3, r0)
            goto L_0x0075
        L_0x0055:
            int[] r1 = f3579h
            boolean r1 = m5004a((int[]) r1, (int) r4)
            if (r1 == 0) goto L_0x0060
            int r0 = p013b.p018b.p040i.p041a.C1105c.abc_tint_default
            goto L_0x000c
        L_0x0060:
            int[] r1 = f3580i
            boolean r1 = m5004a((int[]) r1, (int) r4)
            if (r1 == 0) goto L_0x006b
            int r0 = p013b.p018b.p040i.p041a.C1105c.abc_tint_btn_checkable
            goto L_0x000c
        L_0x006b:
            int r1 = p013b.p018b.p040i.p041a.C1107e.abc_seekbar_thumb_material
            if (r4 != r1) goto L_0x0075
            int r0 = p013b.p018b.p040i.p041a.C1105c.abc_tint_seek_thumb
            goto L_0x000c
        L_0x0072:
            int r0 = p013b.p018b.p040i.p041a.C1105c.abc_tint_spinner
            goto L_0x000c
        L_0x0075:
            if (r0 == 0) goto L_0x007a
            r2.m4996a((android.content.Context) r3, (int) r4, (android.content.res.ColorStateList) r0)
        L_0x007a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.C0871p.mo4628b(android.content.Context, int):android.content.res.ColorStateList");
    }
}
