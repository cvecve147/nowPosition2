package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.p007v4.view.AbsSavedState;
import android.support.p007v4.view.C0434L;
import android.support.p007v4.view.C0466f;
import android.support.p007v4.view.C0479n;
import android.support.p007v4.view.C0481p;
import android.support.p007v4.view.C0482q;
import android.support.p007v4.view.C0487v;
import android.support.p007v4.widget.C0527J;
import android.support.p007v4.widget.C0551j;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p013b.p018b.p020b.C0932a;
import p013b.p018b.p020b.C0933b;
import p013b.p018b.p020b.C0934c;
import p013b.p018b.p028h.p029a.C1006a;
import p013b.p018b.p028h.p031b.p032a.C1026a;
import p013b.p018b.p028h.p035d.C1052a;
import p013b.p018b.p028h.p039h.C1095l;
import p013b.p018b.p028h.p039h.C1097n;
import p013b.p018b.p028h.p039h.C1099p;

public class CoordinatorLayout extends ViewGroup implements C0479n {

    /* renamed from: a */
    static final String f589a;

    /* renamed from: b */
    static final Class<?>[] f590b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    static final ThreadLocal<Map<String, Constructor<C0104b>>> f591c = new ThreadLocal<>();

    /* renamed from: d */
    static final Comparator<View> f592d;

    /* renamed from: e */
    private static final C1097n<Rect> f593e = new C1099p(12);

    /* renamed from: f */
    private final List<View> f594f;

    /* renamed from: g */
    private final C0551j<View> f595g;

    /* renamed from: h */
    private final List<View> f596h;

    /* renamed from: i */
    private final List<View> f597i;

    /* renamed from: j */
    private final int[] f598j;

    /* renamed from: k */
    private Paint f599k;

    /* renamed from: l */
    private boolean f600l;

    /* renamed from: m */
    private boolean f601m;

    /* renamed from: n */
    private int[] f602n;

    /* renamed from: o */
    private View f603o;

    /* renamed from: p */
    private View f604p;

    /* renamed from: q */
    private C0108f f605q;

    /* renamed from: r */
    private boolean f606r;

    /* renamed from: s */
    private C0434L f607s;

    /* renamed from: t */
    private boolean f608t;

    /* renamed from: u */
    private Drawable f609u;

    /* renamed from: v */
    ViewGroup.OnHierarchyChangeListener f610v;

    /* renamed from: w */
    private C0482q f611w;

    /* renamed from: x */
    private final C0481p f612x;

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0161q();

        /* renamed from: a */
        SparseArray<Parcelable> f613a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f613a = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f613a.append(iArr[i], readParcelableArray[i]);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.f613a;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f613a.keyAt(i2);
                parcelableArr[i2] = this.f613a.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$a */
    public interface C0103a {
        /* renamed from: a */
        C0104b mo580a();
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$b */
    public static abstract class C0104b<V extends View> {
        public C0104b() {
        }

        public C0104b(Context context, AttributeSet attributeSet) {
        }

        /* renamed from: a */
        public C0434L mo581a(CoordinatorLayout coordinatorLayout, V v, C0434L l) {
            return l;
        }

        /* renamed from: a */
        public void mo582a() {
        }

        /* renamed from: a */
        public void mo583a(C0107e eVar) {
        }

        /* renamed from: a */
        public void mo397a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        /* renamed from: a */
        public void mo398a(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                mo447d(coordinatorLayout, v, view);
            }
        }

        @Deprecated
        /* renamed from: a */
        public void mo584a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        /* renamed from: a */
        public void mo399a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                mo584a(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        @Deprecated
        /* renamed from: a */
        public void mo437a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        /* renamed from: a */
        public void mo400a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                mo437a(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        @Deprecated
        /* renamed from: a */
        public void mo585a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        /* renamed from: a */
        public void mo586a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                mo585a(coordinatorLayout, v, view, view2, i);
            }
        }

        /* renamed from: a */
        public boolean mo587a(CoordinatorLayout coordinatorLayout, V v) {
            return mo591c(coordinatorLayout, v) > 0.0f;
        }

        /* renamed from: a */
        public boolean mo406a(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        /* renamed from: a */
        public boolean mo407a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* renamed from: a */
        public boolean mo588a(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        /* renamed from: a */
        public boolean mo423a(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        /* renamed from: a */
        public boolean mo439a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean mo424a(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: a */
        public boolean mo440a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        /* renamed from: a */
        public boolean mo589a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        /* renamed from: b */
        public int mo590b(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        /* renamed from: b */
        public boolean mo444b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: b */
        public boolean mo426b(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        @Deprecated
        /* renamed from: b */
        public boolean mo445b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        /* renamed from: b */
        public boolean mo414b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return mo445b(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        /* renamed from: c */
        public float mo591c(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        /* renamed from: c */
        public void mo592c(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: d */
        public Parcelable mo418d(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        /* renamed from: d */
        public void mo447d(CoordinatorLayout coordinatorLayout, V v, View view) {
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: android.support.design.widget.CoordinatorLayout$c */
    public @interface C0105c {
        Class<? extends C0104b> value();
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$d */
    private class C0106d implements ViewGroup.OnHierarchyChangeListener {
        C0106d() {
        }

        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f610v;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.mo521a(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f610v;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$e */
    public static class C0107e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        C0104b f615a;

        /* renamed from: b */
        boolean f616b = false;

        /* renamed from: c */
        public int f617c = 0;

        /* renamed from: d */
        public int f618d = 0;

        /* renamed from: e */
        public int f619e = -1;

        /* renamed from: f */
        int f620f = -1;

        /* renamed from: g */
        public int f621g = 0;

        /* renamed from: h */
        public int f622h = 0;

        /* renamed from: i */
        int f623i;

        /* renamed from: j */
        int f624j;

        /* renamed from: k */
        View f625k;

        /* renamed from: l */
        View f626l;

        /* renamed from: m */
        private boolean f627m;

        /* renamed from: n */
        private boolean f628n;

        /* renamed from: o */
        private boolean f629o;

        /* renamed from: p */
        private boolean f630p;

        /* renamed from: q */
        final Rect f631q = new Rect();

        /* renamed from: r */
        Object f632r;

        public C0107e(int i, int i2) {
            super(i, i2);
        }

        C0107e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0934c.CoordinatorLayout_Layout);
            this.f617c = obtainStyledAttributes.getInteger(C0934c.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f620f = obtainStyledAttributes.getResourceId(C0934c.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f618d = obtainStyledAttributes.getInteger(C0934c.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f619e = obtainStyledAttributes.getInteger(C0934c.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f621g = obtainStyledAttributes.getInt(C0934c.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f622h = obtainStyledAttributes.getInt(C0934c.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            this.f616b = obtainStyledAttributes.hasValue(C0934c.CoordinatorLayout_Layout_layout_behavior);
            if (this.f616b) {
                this.f615a = CoordinatorLayout.m508a(context, attributeSet, obtainStyledAttributes.getString(C0934c.CoordinatorLayout_Layout_layout_behavior));
            }
            obtainStyledAttributes.recycle();
            C0104b bVar = this.f615a;
            if (bVar != null) {
                bVar.mo583a(this);
            }
        }

        public C0107e(C0107e eVar) {
            super(eVar);
        }

        public C0107e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0107e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* renamed from: a */
        private void m584a(View view, CoordinatorLayout coordinatorLayout) {
            this.f625k = coordinatorLayout.findViewById(this.f620f);
            View view2 = this.f625k;
            if (view2 != null) {
                if (view2 != coordinatorLayout) {
                    ViewParent parent = view2.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                view2 = (View) parent;
                            }
                            parent = parent.getParent();
                        } else if (!coordinatorLayout.isInEditMode()) {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f626l = view2;
                    return;
                } else if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (!coordinatorLayout.isInEditMode()) {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f620f) + " to anchor view " + view);
            }
            this.f626l = null;
            this.f625k = null;
        }

        /* renamed from: a */
        private boolean m585a(View view, int i) {
            int a = C0466f.m2170a(((C0107e) view.getLayoutParams()).f621g, i);
            return a != 0 && (C0466f.m2170a(this.f622h, i) & a) == a;
        }

        /* renamed from: b */
        private boolean m586b(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f625k.getId() != this.f620f) {
                return false;
            }
            View view2 = this.f625k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f626l = null;
                    this.f625k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f626l = view2;
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public View mo596a(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f620f == -1) {
                this.f626l = null;
                this.f625k = null;
                return null;
            }
            if (this.f625k == null || !m586b(view, coordinatorLayout)) {
                m584a(view, coordinatorLayout);
            }
            return this.f625k;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo597a(int i, boolean z) {
            if (i == 0) {
                this.f628n = z;
            } else if (i == 1) {
                this.f629o = z;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo598a(Rect rect) {
            this.f631q.set(rect);
        }

        /* renamed from: a */
        public void mo599a(C0104b bVar) {
            C0104b bVar2 = this.f615a;
            if (bVar2 != bVar) {
                if (bVar2 != null) {
                    bVar2.mo582a();
                }
                this.f615a = bVar;
                this.f632r = null;
                this.f616b = true;
                if (bVar != null) {
                    bVar.mo583a(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo600a(boolean z) {
            this.f630p = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo601a() {
            return this.f625k == null && this.f620f != -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo602a(int i) {
            if (i == 0) {
                return this.f628n;
            }
            if (i != 1) {
                return false;
            }
            return this.f629o;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
            r0 = r1.f615a;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo603a(android.support.design.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4) {
            /*
                r1 = this;
                android.view.View r0 = r1.f626l
                if (r4 == r0) goto L_0x001b
                int r0 = android.support.p007v4.view.C0487v.m2293i(r2)
                boolean r0 = r1.m585a((android.view.View) r4, (int) r0)
                if (r0 != 0) goto L_0x001b
                android.support.design.widget.CoordinatorLayout$b r0 = r1.f615a
                if (r0 == 0) goto L_0x0019
                boolean r2 = r0.mo424a((android.support.design.widget.CoordinatorLayout) r2, r3, (android.view.View) r4)
                if (r2 == 0) goto L_0x0019
                goto L_0x001b
            L_0x0019:
                r2 = 0
                goto L_0x001c
            L_0x001b:
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.C0107e.mo603a(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.View):boolean");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo604b(int i) {
            mo597a(i, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo605b() {
            if (this.f615a == null) {
                this.f627m = false;
            }
            return this.f627m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo606b(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.f627m;
            if (z) {
                return true;
            }
            C0104b bVar = this.f615a;
            boolean a = (bVar != null ? bVar.mo587a(coordinatorLayout, view) : false) | z;
            this.f627m = a;
            return a;
        }

        /* renamed from: c */
        public int mo607c() {
            return this.f620f;
        }

        /* renamed from: d */
        public C0104b mo608d() {
            return this.f615a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo609e() {
            return this.f630p;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public Rect mo610f() {
            return this.f631q;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo611g() {
            this.f630p = false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo612h() {
            this.f627m = false;
        }
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$f */
    class C0108f implements ViewTreeObserver.OnPreDrawListener {
        C0108f() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.mo521a(0);
            return true;
        }
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$g */
    static class C0109g implements Comparator<View> {
        C0109g() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            float s = C0487v.m2303s(view);
            float s2 = C0487v.m2303s(view2);
            if (s > s2) {
                return -1;
            }
            return s < s2 ? 1 : 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<android.support.design.widget.CoordinatorLayout> r0 = android.support.design.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            r1 = 0
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = r0.getName()
            goto L_0x000f
        L_0x000e:
            r0 = r1
        L_0x000f:
            f589a = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r0 < r2) goto L_0x001f
            android.support.design.widget.CoordinatorLayout$g r0 = new android.support.design.widget.CoordinatorLayout$g
            r0.<init>()
            f592d = r0
            goto L_0x0021
        L_0x001f:
            f592d = r1
        L_0x0021:
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            f590b = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            f591c = r0
            b.b.h.h.p r0 = new b.b.h.h.p
            r1 = 12
            r0.<init>(r1)
            f593e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.<clinit>():void");
    }

    public CoordinatorLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0932a.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f594f = new ArrayList();
        this.f595g = new C0551j<>();
        this.f596h = new ArrayList();
        this.f597i = new ArrayList();
        this.f598j = new int[2];
        this.f612x = new C0481p(this);
        TypedArray obtainStyledAttributes = i == 0 ? context.obtainStyledAttributes(attributeSet, C0934c.CoordinatorLayout, 0, C0933b.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, C0934c.CoordinatorLayout, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(C0934c.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f602n = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f602n.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.f602n;
                iArr[i2] = (int) (((float) iArr[i2]) * f);
            }
        }
        this.f609u = obtainStyledAttributes.getDrawable(C0934c.CoordinatorLayout_statusBarBackground);
        obtainStyledAttributes.recycle();
        m528f();
        super.setOnHierarchyChangeListener(new C0106d());
    }

    /* renamed from: a */
    static C0104b m508a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(f589a)) {
            str = f589a + '.' + str;
        }
        try {
            Map map = f591c.get();
            if (map == null) {
                map = new HashMap();
                f591c.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = context.getClassLoader().loadClass(str).getConstructor(f590b);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (C0104b) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e);
        }
    }

    /* renamed from: a */
    private static void m509a(Rect rect) {
        rect.setEmpty();
        f593e.mo5228a(rect);
    }

    /* renamed from: a */
    private void m510a(C0107e eVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + eVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - eVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + eVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - eVar.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* renamed from: a */
    private void m511a(View view, int i, Rect rect, Rect rect2, C0107e eVar, int i2, int i3) {
        int a = C0466f.m2170a(m520c(eVar.f617c), i);
        int a2 = C0466f.m2170a(m521d(eVar.f618d), i);
        int i4 = a & 7;
        int i5 = a & 112;
        int i6 = a2 & 7;
        int i7 = a2 & 112;
        int width = i6 != 1 ? i6 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i7 != 16 ? i7 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i4 == 1) {
            width -= i2 / 2;
        } else if (i4 != 5) {
            width -= i2;
        }
        if (i5 == 16) {
            height -= i3 / 2;
        } else if (i5 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    /* renamed from: a */
    private void m512a(View view, Rect rect, int i) {
        boolean z;
        boolean z2;
        int width;
        int i2;
        int i3;
        int i4;
        int height;
        int i5;
        int i6;
        int i7;
        if (C0487v.m2309y(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            C0107e eVar = (C0107e) view.getLayoutParams();
            C0104b d = eVar.mo608d();
            Rect d2 = m522d();
            Rect d3 = m522d();
            d3.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (d == null || !d.mo588a(this, view, d2)) {
                d2.set(d3);
            } else if (!d3.contains(d2)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + d2.toShortString() + " | Bounds:" + d3.toShortString());
            }
            m509a(d3);
            if (d2.isEmpty()) {
                m509a(d2);
                return;
            }
            int a = C0466f.m2170a(eVar.f622h, i);
            if ((a & 48) != 48 || (i6 = (d2.top - eVar.topMargin) - eVar.f624j) >= (i7 = rect.top)) {
                z = false;
            } else {
                m529f(view, i7 - i6);
                z = true;
            }
            if ((a & 80) == 80 && (height = ((getHeight() - d2.bottom) - eVar.bottomMargin) + eVar.f624j) < (i5 = rect.bottom)) {
                m529f(view, height - i5);
                z = true;
            }
            if (!z) {
                m529f(view, 0);
            }
            if ((a & 3) != 3 || (i3 = (d2.left - eVar.leftMargin) - eVar.f623i) >= (i4 = rect.left)) {
                z2 = false;
            } else {
                m526e(view, i4 - i3);
                z2 = true;
            }
            if ((a & 5) == 5 && (width = ((getWidth() - d2.right) - eVar.rightMargin) + eVar.f623i) < (i2 = rect.right)) {
                m526e(view, width - i2);
                z2 = true;
            }
            if (!z2) {
                m526e(view, 0);
            }
            m509a(d2);
        }
    }

    /* renamed from: a */
    private void m513a(View view, View view2, int i) {
        C0107e eVar = (C0107e) view.getLayoutParams();
        Rect d = m522d();
        Rect d2 = m522d();
        try {
            mo528a(view2, d);
            mo527a(view, i, d, d2);
            view.layout(d2.left, d2.top, d2.right, d2.bottom);
        } finally {
            m509a(d);
            m509a(d2);
        }
    }

    /* renamed from: a */
    private void m514a(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
        }
        Comparator<View> comparator = f592d;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: a */
    private void m515a(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0104b d = ((C0107e) childAt.getLayoutParams()).mo608d();
            if (d != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    d.mo439a(this, childAt, obtain);
                } else {
                    d.mo444b(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0107e) getChildAt(i2).getLayoutParams()).mo612h();
        }
        this.f603o = null;
        this.f600l = false;
    }

    /* renamed from: a */
    private boolean m516a(MotionEvent motionEvent, int i) {
        MotionEvent motionEvent2 = motionEvent;
        int i2 = i;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f596h;
        m514a(list);
        int size = list.size();
        boolean z = false;
        boolean z2 = false;
        MotionEvent motionEvent3 = null;
        for (int i3 = 0; i3 < size; i3++) {
            View view = list.get(i3);
            C0107e eVar = (C0107e) view.getLayoutParams();
            C0104b d = eVar.mo608d();
            boolean z3 = true;
            if ((!z && !z2) || actionMasked == 0) {
                if (!z && d != null) {
                    if (i2 == 0) {
                        z = d.mo439a(this, view, motionEvent2);
                    } else if (i2 == 1) {
                        z = d.mo444b(this, view, motionEvent2);
                    }
                    if (z) {
                        this.f603o = view;
                    }
                }
                boolean b = eVar.mo605b();
                boolean b2 = eVar.mo606b(this, view);
                if (!b2 || b) {
                    z3 = false;
                }
                if (b2 && !z3) {
                    break;
                }
                z2 = z3;
            } else if (d != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i2 == 0) {
                    d.mo439a(this, view, motionEvent3);
                } else if (i2 == 1) {
                    d.mo444b(this, view, motionEvent3);
                }
            }
        }
        list.clear();
        return z;
    }

    /* renamed from: b */
    private int m517b(int i) {
        StringBuilder sb;
        int[] iArr = this.f602n;
        if (iArr == null) {
            sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            sb = new StringBuilder();
            sb.append("Keyline index ");
            sb.append(i);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    /* renamed from: b */
    private C0434L m518b(C0434L l) {
        C0104b d;
        if (l.mo1775g()) {
            return l;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (C0487v.m2291g(childAt) && (d = ((C0107e) childAt.getLayoutParams()).mo608d()) != null) {
                l = d.mo581a(this, childAt, l);
                if (l.mo1775g()) {
                    break;
                }
            }
        }
        return l;
    }

    /* renamed from: b */
    private void m519b(View view, int i, int i2) {
        C0107e eVar = (C0107e) view.getLayoutParams();
        int a = C0466f.m2170a(m524e(eVar.f617c), i2);
        int i3 = a & 7;
        int i4 = a & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int b = m517b(i) - measuredWidth;
        int i5 = 0;
        if (i3 == 1) {
            b += measuredWidth / 2;
        } else if (i3 == 5) {
            b += measuredWidth;
        }
        if (i4 == 16) {
            i5 = 0 + (measuredHeight / 2);
        } else if (i4 == 80) {
            i5 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + eVar.leftMargin, Math.min(b, ((width - getPaddingRight()) - measuredWidth) - eVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + eVar.topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - eVar.bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    /* renamed from: c */
    private static int m520c(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    /* renamed from: d */
    private static int m521d(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* renamed from: d */
    private static Rect m522d() {
        Rect a = f593e.mo5227a();
        return a == null ? new Rect() : a;
    }

    /* renamed from: d */
    private void m523d(View view, int i) {
        C0107e eVar = (C0107e) view.getLayoutParams();
        Rect d = m522d();
        d.set(getPaddingLeft() + eVar.leftMargin, getPaddingTop() + eVar.topMargin, (getWidth() - getPaddingRight()) - eVar.rightMargin, (getHeight() - getPaddingBottom()) - eVar.bottomMargin);
        if (this.f607s != null && C0487v.m2291g(this) && !C0487v.m2291g(view)) {
            d.left += this.f607s.mo1770c();
            d.top += this.f607s.mo1772e();
            d.right -= this.f607s.mo1771d();
            d.bottom -= this.f607s.mo1769b();
        }
        Rect d2 = m522d();
        C0466f.m2171a(m521d(eVar.f617c), view.getMeasuredWidth(), view.getMeasuredHeight(), d, d2, i);
        view.layout(d2.left, d2.top, d2.right, d2.bottom);
        m509a(d);
        m509a(d2);
    }

    /* renamed from: e */
    private static int m524e(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    /* renamed from: e */
    private void m525e() {
        this.f594f.clear();
        this.f595g.mo2372a();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0107e d = mo543d(childAt);
            d.mo596a(this, childAt);
            this.f595g.mo2373a(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (d.mo603a(this, childAt, childAt2)) {
                        if (!this.f595g.mo2376b(childAt2)) {
                            this.f595g.mo2373a(childAt2);
                        }
                        this.f595g.mo2374a(childAt2, childAt);
                    }
                }
            }
        }
        this.f594f.addAll(this.f595g.mo2375b());
        Collections.reverse(this.f594f);
    }

    /* renamed from: e */
    private void m526e(View view, int i) {
        C0107e eVar = (C0107e) view.getLayoutParams();
        int i2 = eVar.f623i;
        if (i2 != i) {
            C0487v.m2267a(view, i - i2);
            eVar.f623i = i;
        }
    }

    /* renamed from: e */
    private boolean m527e(View view) {
        return this.f595g.mo2379e(view);
    }

    /* renamed from: f */
    private void m528f() {
        if (Build.VERSION.SDK_INT >= 21) {
            if (C0487v.m2291g(this)) {
                if (this.f611w == null) {
                    this.f611w = new C0160p(this);
                }
                C0487v.m2275a((View) this, this.f611w);
                setSystemUiVisibility(1280);
                return;
            }
            C0487v.m2275a((View) this, (C0482q) null);
        }
    }

    /* renamed from: f */
    private void m529f(View view, int i) {
        C0107e eVar = (C0107e) view.getLayoutParams();
        int i2 = eVar.f624j;
        if (i2 != i) {
            C0487v.m2283b(view, i - i2);
            eVar.f624j = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C0434L mo519a(C0434L l) {
        if (C1095l.m5678a(this.f607s, l)) {
            return l;
        }
        this.f607s = l;
        boolean z = true;
        this.f608t = l != null && l.mo1772e() > 0;
        if (this.f608t || getBackground() != null) {
            z = false;
        }
        setWillNotDraw(z);
        C0434L b = m518b(l);
        requestLayout();
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo520a() {
        if (this.f601m) {
            if (this.f605q == null) {
                this.f605q = new C0108f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f605q);
        }
        this.f606r = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo521a(int i) {
        boolean z;
        int i2 = i;
        int i3 = C0487v.m2293i(this);
        int size = this.f594f.size();
        Rect d = m522d();
        Rect d2 = m522d();
        Rect d3 = m522d();
        for (int i4 = 0; i4 < size; i4++) {
            View view = this.f594f.get(i4);
            C0107e eVar = (C0107e) view.getLayoutParams();
            if (i2 != 0 || view.getVisibility() != 8) {
                for (int i5 = 0; i5 < i4; i5++) {
                    if (eVar.f626l == this.f594f.get(i5)) {
                        mo535b(view, i3);
                    }
                }
                mo529a(view, true, d2);
                if (eVar.f621g != 0 && !d2.isEmpty()) {
                    int a = C0466f.m2170a(eVar.f621g, i3);
                    int i6 = a & 112;
                    if (i6 == 48) {
                        d.top = Math.max(d.top, d2.bottom);
                    } else if (i6 == 80) {
                        d.bottom = Math.max(d.bottom, getHeight() - d2.top);
                    }
                    int i7 = a & 7;
                    if (i7 == 3) {
                        d.left = Math.max(d.left, d2.right);
                    } else if (i7 == 5) {
                        d.right = Math.max(d.right, getWidth() - d2.left);
                    }
                }
                if (eVar.f622h != 0 && view.getVisibility() == 0) {
                    m512a(view, d, i3);
                }
                if (i2 != 2) {
                    mo536b(view, d3);
                    if (!d3.equals(d2)) {
                        mo541c(view, d2);
                    }
                }
                for (int i8 = i4 + 1; i8 < size; i8++) {
                    View view2 = this.f594f.get(i8);
                    C0107e eVar2 = (C0107e) view2.getLayoutParams();
                    C0104b d4 = eVar2.mo608d();
                    if (d4 != null && d4.mo424a(this, view2, view)) {
                        if (i2 != 0 || !eVar2.mo609e()) {
                            if (i2 != 2) {
                                z = d4.mo426b(this, view2, view);
                            } else {
                                d4.mo592c(this, view2, view);
                                z = true;
                            }
                            if (i2 == 1) {
                                eVar2.mo600a(z);
                            }
                        } else {
                            eVar2.mo611g();
                        }
                    }
                }
            }
        }
        m509a(d);
        m509a(d2);
        m509a(d3);
    }

    /* renamed from: a */
    public void mo522a(View view) {
        List c = this.f595g.mo2377c(view);
        if (c != null && !c.isEmpty()) {
            for (int i = 0; i < c.size(); i++) {
                View view2 = (View) c.get(i);
                C0104b d = ((C0107e) view2.getLayoutParams()).mo608d();
                if (d != null) {
                    d.mo426b(this, view2, view);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo523a(View view, int i) {
        this.f612x.mo1969a(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0107e eVar = (C0107e) childAt.getLayoutParams();
            if (eVar.mo602a(i)) {
                C0104b d = eVar.mo608d();
                if (d != null) {
                    d.mo398a(this, childAt, view, i);
                }
                eVar.mo604b(i);
                eVar.mo611g();
            }
        }
        this.f604p = null;
    }

    /* renamed from: a */
    public void mo524a(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* renamed from: a */
    public void mo525a(View view, int i, int i2, int i3, int i4, int i5) {
        C0104b d;
        int childCount = getChildCount();
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                int i7 = i5;
            } else {
                C0107e eVar = (C0107e) childAt.getLayoutParams();
                if (eVar.mo602a(i5) && (d = eVar.mo608d()) != null) {
                    d.mo399a(this, childAt, view, i, i2, i3, i4, i5);
                    z = true;
                }
            }
        }
        if (z) {
            mo521a(1);
        }
    }

    /* renamed from: a */
    public void mo526a(View view, int i, int i2, int[] iArr, int i3) {
        C0104b d;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                int i7 = i3;
            } else {
                C0107e eVar = (C0107e) childAt.getLayoutParams();
                if (eVar.mo602a(i3) && (d = eVar.mo608d()) != null) {
                    int[] iArr2 = this.f598j;
                    iArr2[1] = 0;
                    iArr2[0] = 0;
                    d.mo400a(this, childAt, view, i, i2, iArr2, i3);
                    i4 = i > 0 ? Math.max(i4, this.f598j[0]) : Math.min(i4, this.f598j[0]);
                    i5 = i2 > 0 ? Math.max(i5, this.f598j[1]) : Math.min(i5, this.f598j[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            mo521a(1);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo527a(View view, int i, Rect rect, Rect rect2) {
        C0107e eVar = (C0107e) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m511a(view, i, rect, rect2, eVar, measuredWidth, measuredHeight);
        m510a(eVar, rect2, measuredWidth, measuredHeight);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo528a(View view, Rect rect) {
        C0527J.m2562a((ViewGroup) this, view, rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo529a(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            mo528a(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: a */
    public boolean mo530a(View view, int i, int i2) {
        Rect d = m522d();
        mo528a(view, d);
        try {
            return d.contains(i, i2);
        } finally {
            m509a(d);
        }
    }

    /* renamed from: a */
    public boolean mo531a(View view, View view2) {
        boolean z = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect d = m522d();
        mo529a(view, view.getParent() != this, d);
        Rect d2 = m522d();
        mo529a(view2, view2.getParent() != this, d2);
        try {
            if (d.left <= d2.right && d.top <= d2.bottom && d.right >= d2.left && d.bottom >= d2.top) {
                z = true;
            }
            return z;
        } finally {
            m509a(d);
            m509a(d2);
        }
    }

    /* renamed from: a */
    public boolean mo532a(View view, View view2, int i, int i2) {
        int i3 = i2;
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0107e eVar = (C0107e) childAt.getLayoutParams();
                C0104b d = eVar.mo608d();
                if (d != null) {
                    boolean b = d.mo414b(this, childAt, view, view2, i, i2);
                    eVar.mo597a(i3, b);
                    z |= b;
                } else {
                    eVar.mo597a(i3, false);
                }
            }
        }
        return z;
    }

    /* renamed from: b */
    public List<View> mo533b(View view) {
        List<View> d = this.f595g.mo2378d(view);
        this.f597i.clear();
        if (d != null) {
            this.f597i.addAll(d);
        }
        return this.f597i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo534b() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (m527e(getChildAt(i))) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z == this.f606r) {
            return;
        }
        if (z) {
            mo520a();
        } else {
            mo539c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo535b(View view, int i) {
        C0104b d;
        View view2 = view;
        C0107e eVar = (C0107e) view.getLayoutParams();
        if (eVar.f625k != null) {
            Rect d2 = m522d();
            Rect d3 = m522d();
            Rect d4 = m522d();
            mo528a(eVar.f625k, d2);
            boolean z = false;
            mo529a(view2, false, d3);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i2 = measuredHeight;
            m511a(view, i, d2, d4, eVar, measuredWidth, measuredHeight);
            if (!(d4.left == d3.left && d4.top == d3.top)) {
                z = true;
            }
            m510a(eVar, d4, measuredWidth, i2);
            int i3 = d4.left - d3.left;
            int i4 = d4.top - d3.top;
            if (i3 != 0) {
                C0487v.m2267a(view2, i3);
            }
            if (i4 != 0) {
                C0487v.m2283b(view2, i4);
            }
            if (z && (d = eVar.mo608d()) != null) {
                d.mo426b(this, view2, eVar.f625k);
            }
            m509a(d2);
            m509a(d3);
            m509a(d4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo536b(View view, Rect rect) {
        rect.set(((C0107e) view.getLayoutParams()).mo610f());
    }

    /* renamed from: b */
    public void mo537b(View view, View view2, int i, int i2) {
        C0104b d;
        this.f612x.mo1971a(view, view2, i, i2);
        this.f604p = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0107e eVar = (C0107e) childAt.getLayoutParams();
            if (eVar.mo602a(i2) && (d = eVar.mo608d()) != null) {
                d.mo586a(this, childAt, view, view2, i, i2);
            }
        }
    }

    /* renamed from: c */
    public List<View> mo538c(View view) {
        List c = this.f595g.mo2377c(view);
        this.f597i.clear();
        if (c != null) {
            this.f597i.addAll(c);
        }
        return this.f597i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo539c() {
        if (this.f601m && this.f605q != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f605q);
        }
        this.f606r = false;
    }

    /* renamed from: c */
    public void mo540c(View view, int i) {
        C0107e eVar = (C0107e) view.getLayoutParams();
        if (!eVar.mo601a()) {
            View view2 = eVar.f625k;
            if (view2 != null) {
                m513a(view, view2, i);
                return;
            }
            int i2 = eVar.f619e;
            if (i2 >= 0) {
                m519b(view, i2, i);
            } else {
                m523d(view, i);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo541c(View view, Rect rect) {
        ((C0107e) view.getLayoutParams()).mo598a(rect);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0107e) && super.checkLayoutParams(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0107e mo543d(View view) {
        C0107e eVar = (C0107e) view.getLayoutParams();
        if (!eVar.f616b) {
            if (view instanceof C0103a) {
                C0104b a = ((C0103a) view).mo580a();
                if (a == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                eVar.mo599a(a);
            } else {
                C0105c cVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    cVar = (C0105c) cls.getAnnotation(C0105c.class);
                    if (cVar != null) {
                        break;
                    }
                }
                if (cVar != null) {
                    try {
                        eVar.mo599a((C0104b) cVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        Log.e("CoordinatorLayout", "Default behavior class " + cVar.value().getName() + " could not be instantiated. Did you forget" + " a default constructor?", e);
                    }
                }
            }
            eVar.f616b = true;
        }
        return eVar;
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        C0107e eVar = (C0107e) view.getLayoutParams();
        C0104b bVar = eVar.f615a;
        if (bVar != null) {
            float c = bVar.mo591c(this, view);
            if (c > 0.0f) {
                if (this.f599k == null) {
                    this.f599k = new Paint();
                }
                this.f599k.setColor(eVar.f615a.mo590b(this, view));
                this.f599k.setAlpha(C1052a.m5544a(Math.round(c * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f599k);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f609u;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public C0107e generateDefaultLayoutParams() {
        return new C0107e(-2, -2);
    }

    public C0107e generateLayoutParams(AttributeSet attributeSet) {
        return new C0107e(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0107e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0107e ? new C0107e((C0107e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0107e((ViewGroup.MarginLayoutParams) layoutParams) : new C0107e(layoutParams);
    }

    /* access modifiers changed from: package-private */
    public final List<View> getDependencySortedChildren() {
        m525e();
        return Collections.unmodifiableList(this.f594f);
    }

    public final C0434L getLastWindowInsets() {
        return this.f607s;
    }

    public int getNestedScrollAxes() {
        return this.f612x.mo1967a();
    }

    public Drawable getStatusBarBackground() {
        return this.f609u;
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m515a(false);
        if (this.f606r) {
            if (this.f605q == null) {
                this.f605q = new C0108f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f605q);
        }
        if (this.f607s == null && C0487v.m2291g(this)) {
            C0487v.m2262C(this);
        }
        this.f601m = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m515a(false);
        if (this.f606r && this.f605q != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f605q);
        }
        View view = this.f604p;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f601m = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f608t && this.f609u != null) {
            C0434L l = this.f607s;
            int e = l != null ? l.mo1772e() : 0;
            if (e > 0) {
                this.f609u.setBounds(0, 0, getWidth(), e);
                this.f609u.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m515a(true);
        }
        boolean a = m516a(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m515a(true);
        }
        return a;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0104b d;
        int i5 = C0487v.m2293i(this);
        int size = this.f594f.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = this.f594f.get(i6);
            if (view.getVisibility() != 8 && ((d = ((C0107e) view.getLayoutParams()).mo608d()) == null || !d.mo406a(this, view, i5))) {
                mo540c(view, i5);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0117, code lost:
        if (r0.mo407a(r30, r20, r11, r21, r23, 0) == false) goto L_0x0126;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.m525e()
            r30.mo534b()
            int r8 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r9 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            int r10 = android.support.p007v4.view.C0487v.m2293i(r30)
            r2 = 1
            if (r10 != r2) goto L_0x0021
            r12 = r2
            goto L_0x0022
        L_0x0021:
            r12 = 0
        L_0x0022:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r8 + r9
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            android.support.v4.view.L r3 = r7.f607s
            if (r3 == 0) goto L_0x004b
            boolean r3 = android.support.p007v4.view.C0487v.m2291g(r30)
            if (r3 == 0) goto L_0x004b
            r19 = r2
            goto L_0x004d
        L_0x004b:
            r19 = 0
        L_0x004d:
            java.util.List<android.view.View> r2 = r7.f594f
            int r6 = r2.size()
            r4 = r0
            r2 = r1
            r3 = 0
            r5 = 0
        L_0x0057:
            if (r5 >= r6) goto L_0x016c
            java.util.List<android.view.View> r0 = r7.f594f
            java.lang.Object r0 = r0.get(r5)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0071
            r22 = r5
            r29 = r6
            goto L_0x0166
        L_0x0071:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            android.support.design.widget.CoordinatorLayout$e r1 = (android.support.design.widget.CoordinatorLayout.C0107e) r1
            int r0 = r1.f619e
            if (r0 < 0) goto L_0x00b8
            if (r13 == 0) goto L_0x00b8
            int r0 = r7.m517b((int) r0)
            int r11 = r1.f617c
            int r11 = m524e((int) r11)
            int r11 = android.support.p007v4.view.C0466f.m2170a(r11, r10)
            r11 = r11 & 7
            r22 = r2
            r2 = 3
            if (r11 != r2) goto L_0x0095
            if (r12 == 0) goto L_0x009a
        L_0x0095:
            r2 = 5
            if (r11 != r2) goto L_0x00a6
            if (r12 == 0) goto L_0x00a6
        L_0x009a:
            int r2 = r14 - r9
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r11 = r0
            r21 = r2
            goto L_0x00bd
        L_0x00a6:
            if (r11 != r2) goto L_0x00aa
            if (r12 == 0) goto L_0x00af
        L_0x00aa:
            r2 = 3
            if (r11 != r2) goto L_0x00ba
            if (r12 == 0) goto L_0x00ba
        L_0x00af:
            int r0 = r0 - r8
            r11 = 0
            int r0 = java.lang.Math.max(r11, r0)
            r21 = r0
            goto L_0x00bd
        L_0x00b8:
            r22 = r2
        L_0x00ba:
            r11 = 0
            r21 = r11
        L_0x00bd:
            if (r19 == 0) goto L_0x00ef
            boolean r0 = android.support.p007v4.view.C0487v.m2291g(r20)
            if (r0 != 0) goto L_0x00ef
            android.support.v4.view.L r0 = r7.f607s
            int r0 = r0.mo1770c()
            android.support.v4.view.L r2 = r7.f607s
            int r2 = r2.mo1771d()
            int r0 = r0 + r2
            android.support.v4.view.L r2 = r7.f607s
            int r2 = r2.mo1772e()
            android.support.v4.view.L r11 = r7.f607s
            int r11 = r11.mo1769b()
            int r2 = r2 + r11
            int r0 = r14 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r11 = r0
            r23 = r2
            goto L_0x00f3
        L_0x00ef:
            r11 = r31
            r23 = r32
        L_0x00f3:
            android.support.design.widget.CoordinatorLayout$b r0 = r1.mo608d()
            if (r0 == 0) goto L_0x011a
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r27 = r3
            r3 = r11
            r28 = r4
            r4 = r21
            r22 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.mo407a((android.support.design.widget.CoordinatorLayout) r1, r2, (int) r3, (int) r4, (int) r5, (int) r6)
            if (r0 != 0) goto L_0x0133
            goto L_0x0126
        L_0x011a:
            r26 = r1
            r27 = r3
            r28 = r4
            r29 = r6
            r25 = r22
            r22 = r5
        L_0x0126:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r11
            r3 = r21
            r4 = r23
            r0.mo524a((android.view.View) r1, (int) r2, (int) r3, (int) r4, (int) r5)
        L_0x0133:
            int r0 = r20.getMeasuredWidth()
            int r0 = r17 + r0
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            r2 = r28
            int r0 = java.lang.Math.max(r2, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r18 + r2
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r25
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r11 = r27
            int r2 = android.view.View.combineMeasuredStates(r11, r2)
            r4 = r0
            r3 = r2
            r2 = r1
        L_0x0166:
            int r5 = r22 + 1
            r6 = r29
            goto L_0x0057
        L_0x016c:
            r1 = r2
            r11 = r3
            r2 = r4
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r11
            r3 = r31
            int r0 = android.view.View.resolveSizeAndState(r2, r3, r0)
            int r2 = r11 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        C0104b d;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0107e eVar = (C0107e) childAt.getLayoutParams();
                if (eVar.mo602a(0) && (d = eVar.mo608d()) != null) {
                    z2 |= d.mo589a(this, childAt, view, f, f2, z);
                }
            }
        }
        if (z2) {
            mo521a(1);
        }
        return z2;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        C0104b d;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0107e eVar = (C0107e) childAt.getLayoutParams();
                if (eVar.mo602a(0) && (d = eVar.mo608d()) != null) {
                    z |= d.mo440a(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo526a(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo525a(view, i, i2, i3, i4, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo537b(view, view2, i, 0);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo1736a());
        SparseArray<Parcelable> sparseArray = savedState.f613a;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C0104b d = mo543d(childAt).mo608d();
            if (!(id == -1 || d == null || (parcelable2 = sparseArray.get(id)) == null)) {
                d.mo397a(this, childAt, parcelable2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable d;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C0104b d2 = ((C0107e) childAt.getLayoutParams()).mo608d();
            if (!(id == -1 || d2 == null || (d = d2.mo418d(this, childAt)) == null)) {
                sparseArray.append(id, d);
            }
        }
        savedState.f613a = sparseArray;
        return savedState;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo532a(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        mo523a(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f603o
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.m516a((android.view.MotionEvent) r1, (int) r4)
            if (r3 == 0) goto L_0x002b
            goto L_0x0016
        L_0x0015:
            r3 = r5
        L_0x0016:
            android.view.View r6 = r0.f603o
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.support.design.widget.CoordinatorLayout$e r6 = (android.support.design.widget.CoordinatorLayout.C0107e) r6
            android.support.design.widget.CoordinatorLayout$b r6 = r6.mo608d()
            if (r6 == 0) goto L_0x002b
            android.view.View r7 = r0.f603o
            boolean r6 = r6.mo444b((android.support.design.widget.CoordinatorLayout) r0, r7, (android.view.MotionEvent) r1)
            goto L_0x002c
        L_0x002b:
            r6 = r5
        L_0x002c:
            android.view.View r7 = r0.f603o
            r8 = 0
            if (r7 != 0) goto L_0x0037
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x004a
        L_0x0037:
            if (r3 == 0) goto L_0x004a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x004a:
            if (r8 == 0) goto L_0x004f
            r8.recycle()
        L_0x004f:
            if (r2 == r4) goto L_0x0054
            r1 = 3
            if (r2 != r1) goto L_0x0057
        L_0x0054:
            r0.m515a((boolean) r5)
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        C0104b d = ((C0107e) view.getLayoutParams()).mo608d();
        if (d == null || !d.mo423a(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f600l) {
            m515a(false);
            this.f600l = true;
        }
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m528f();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f610v = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f609u;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f609u = drawable3;
            Drawable drawable4 = this.f609u;
            if (drawable4 != null) {
                if (drawable4.isStateful()) {
                    this.f609u.setState(getDrawableState());
                }
                C1026a.m5453a(this.f609u, C0487v.m2293i(this));
                this.f609u.setVisible(getVisibility() == 0, false);
                this.f609u.setCallback(this);
            }
            C0487v.m2261B(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? C1006a.m5394c(getContext(), i) : null);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f609u;
        if (drawable != null && drawable.isVisible() != z) {
            this.f609u.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f609u;
    }
}
