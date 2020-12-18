package android.support.p011v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.p007v4.p008os.C0417d;
import android.support.p007v4.view.AbsSavedState;
import android.support.p007v4.view.C0459c;
import android.support.p007v4.view.C0475j;
import android.support.p007v4.view.C0476k;
import android.support.p007v4.view.C0478m;
import android.support.p007v4.view.C0485t;
import android.support.p007v4.view.C0487v;
import android.support.p007v4.view.C0499x;
import android.support.p007v4.view.p009a.C0445a;
import android.support.p007v4.view.p009a.C0446b;
import android.support.p011v7.widget.C0867oa;
import android.support.p011v7.widget.C0887sb;
import android.support.p011v7.widget.C0892tb;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p013b.p018b.p028h.p039h.C1100q;
import p013b.p018b.p040i.p047e.C1122a;
import p013b.p018b.p040i.p047e.C1123b;

/* renamed from: android.support.v7.widget.RecyclerView */
public class RecyclerView extends ViewGroup implements C0485t, C0476k {

    /* renamed from: a */
    private static final int[] f2923a = {16843830};

    /* renamed from: b */
    private static final int[] f2924b = {16842987};

    /* renamed from: c */
    static final boolean f2925c;

    /* renamed from: d */
    static final boolean f2926d = (Build.VERSION.SDK_INT >= 23);

    /* renamed from: e */
    static final boolean f2927e = (Build.VERSION.SDK_INT >= 16);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final boolean f2928f = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: g */
    private static final boolean f2929g = (Build.VERSION.SDK_INT <= 15);

    /* renamed from: h */
    private static final boolean f2930h = (Build.VERSION.SDK_INT <= 15);

    /* renamed from: i */
    private static final Class<?>[] f2931i;

    /* renamed from: j */
    static final Interpolator f2932j = new C0709Da();

    /* renamed from: A */
    private C0765m f2933A;

    /* renamed from: Aa */
    private final int[] f2934Aa;

    /* renamed from: B */
    boolean f2935B;

    /* renamed from: Ba */
    private C0478m f2936Ba;

    /* renamed from: C */
    boolean f2937C;

    /* renamed from: Ca */
    private final int[] f2938Ca;

    /* renamed from: D */
    boolean f2939D;
    /* access modifiers changed from: private */

    /* renamed from: Da */
    public final int[] f2940Da;

    /* renamed from: E */
    boolean f2941E;

    /* renamed from: Ea */
    private final int[] f2942Ea;

    /* renamed from: F */
    private int f2943F;

    /* renamed from: Fa */
    final List<C0778w> f2944Fa;

    /* renamed from: G */
    boolean f2945G;

    /* renamed from: Ga */
    private Runnable f2946Ga;

    /* renamed from: H */
    boolean f2947H;

    /* renamed from: Ha */
    private final C0892tb.C0894b f2948Ha;

    /* renamed from: I */
    private boolean f2949I;

    /* renamed from: J */
    private int f2950J;

    /* renamed from: K */
    boolean f2951K;

    /* renamed from: L */
    private final AccessibilityManager f2952L;

    /* renamed from: M */
    private List<C0763k> f2953M;

    /* renamed from: N */
    boolean f2954N;

    /* renamed from: O */
    boolean f2955O;

    /* renamed from: P */
    private int f2956P;

    /* renamed from: Q */
    private int f2957Q;

    /* renamed from: R */
    private C0752e f2958R;

    /* renamed from: S */
    private EdgeEffect f2959S;

    /* renamed from: T */
    private EdgeEffect f2960T;

    /* renamed from: U */
    private EdgeEffect f2961U;

    /* renamed from: V */
    private EdgeEffect f2962V;

    /* renamed from: W */
    C0753f f2963W;

    /* renamed from: aa */
    private int f2964aa;

    /* renamed from: ba */
    private int f2965ba;

    /* renamed from: ca */
    private VelocityTracker f2966ca;

    /* renamed from: da */
    private int f2967da;

    /* renamed from: ea */
    private int f2968ea;

    /* renamed from: fa */
    private int f2969fa;

    /* renamed from: ga */
    private int f2970ga;

    /* renamed from: ha */
    private int f2971ha;

    /* renamed from: ia */
    private C0764l f2972ia;

    /* renamed from: ja */
    private final int f2973ja;

    /* renamed from: k */
    private final C0771r f2974k;

    /* renamed from: ka */
    private final int f2975ka;

    /* renamed from: l */
    final C0769p f2976l;

    /* renamed from: la */
    private float f2977la;

    /* renamed from: m */
    private SavedState f2978m;

    /* renamed from: ma */
    private float f2979ma;

    /* renamed from: n */
    C0844j f2980n;

    /* renamed from: na */
    private boolean f2981na;

    /* renamed from: o */
    C0789T f2982o;

    /* renamed from: oa */
    final C0777v f2983oa;

    /* renamed from: p */
    final C0892tb f2984p;

    /* renamed from: pa */
    C0867oa f2985pa;

    /* renamed from: q */
    boolean f2986q;

    /* renamed from: qa */
    C0867oa.C0868a f2987qa;

    /* renamed from: r */
    final Runnable f2988r;

    /* renamed from: ra */
    final C0775t f2989ra;

    /* renamed from: s */
    final Rect f2990s;

    /* renamed from: sa */
    private C0766n f2991sa;

    /* renamed from: t */
    private final Rect f2992t;

    /* renamed from: ta */
    private List<C0766n> f2993ta;

    /* renamed from: u */
    final RectF f2994u;

    /* renamed from: ua */
    boolean f2995ua;

    /* renamed from: v */
    C0748a f2996v;

    /* renamed from: va */
    boolean f2997va;

    /* renamed from: w */
    C0759i f2998w;

    /* renamed from: wa */
    private C0753f.C0755b f2999wa;

    /* renamed from: x */
    C0770q f3000x;

    /* renamed from: xa */
    boolean f3001xa;

    /* renamed from: y */
    final ArrayList<C0758h> f3002y;

    /* renamed from: ya */
    C0726Ka f3003ya;

    /* renamed from: z */
    private final ArrayList<C0765m> f3004z;

    /* renamed from: za */
    private C0751d f3005za;

    /* renamed from: android.support.v7.widget.RecyclerView$SavedState */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0724Ja();

        /* renamed from: a */
        Parcelable f3006a;

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3006a = parcel.readParcelable(classLoader == null ? C0759i.class.getClassLoader() : classLoader);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3784a(SavedState savedState) {
            this.f3006a = savedState.f3006a;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f3006a, 0);
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$a */
    public static abstract class C0748a<VH extends C0778w> {

        /* renamed from: a */
        private final C0749b f3007a = new C0749b();

        /* renamed from: b */
        private boolean f3008b = false;

        /* renamed from: a */
        public abstract int mo337a();

        /* renamed from: a */
        public long mo338a(int i) {
            return -1;
        }

        /* renamed from: a */
        public final VH mo3785a(ViewGroup viewGroup, int i) {
            try {
                C0417d.m1972a("RV CreateView");
                VH b = mo345b(viewGroup, i);
                if (b.f3093b.getParent() == null) {
                    b.f3098g = i;
                    return b;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                C0417d.m1971a();
            }
        }

        /* renamed from: a */
        public final void mo3786a(int i, int i2) {
            this.f3007a.mo3804a(i, i2);
        }

        /* renamed from: a */
        public final void mo3787a(int i, int i2, Object obj) {
            this.f3007a.mo3805a(i, i2, obj);
        }

        /* renamed from: a */
        public void mo3788a(C0750c cVar) {
            this.f3007a.registerObserver(cVar);
        }

        /* renamed from: a */
        public final void mo3789a(VH vh, int i) {
            vh.f3095d = i;
            if (mo3797b()) {
                vh.f3097f = mo338a(i);
            }
            vh.mo4028a(1, 519);
            C0417d.m1972a("RV OnBindView");
            mo3790a(vh, i, vh.mo4043j());
            vh.mo4034b();
            ViewGroup.LayoutParams layoutParams = vh.f3093b.getLayoutParams();
            if (layoutParams instanceof C0762j) {
                ((C0762j) layoutParams).f3044c = true;
            }
            C0417d.m1971a();
        }

        /* renamed from: a */
        public void mo3790a(VH vh, int i, List<Object> list) {
            mo346b(vh, i);
        }

        /* renamed from: a */
        public void mo3791a(RecyclerView recyclerView) {
        }

        /* renamed from: a */
        public boolean mo3792a(VH vh) {
            return false;
        }

        /* renamed from: b */
        public int mo344b(int i) {
            return 0;
        }

        /* renamed from: b */
        public abstract VH mo345b(ViewGroup viewGroup, int i);

        /* renamed from: b */
        public final void mo3793b(int i, int i2) {
            this.f3007a.mo3807c(i, i2);
        }

        /* renamed from: b */
        public void mo3794b(C0750c cVar) {
            this.f3007a.unregisterObserver(cVar);
        }

        /* renamed from: b */
        public void mo3795b(VH vh) {
        }

        /* renamed from: b */
        public abstract void mo346b(VH vh, int i);

        /* renamed from: b */
        public void mo3796b(RecyclerView recyclerView) {
        }

        /* renamed from: b */
        public final boolean mo3797b() {
            return this.f3008b;
        }

        /* renamed from: c */
        public final void mo3798c() {
            this.f3007a.mo3803a();
        }

        /* renamed from: c */
        public final void mo3799c(int i) {
            this.f3007a.mo3806b(i, 1);
        }

        /* renamed from: c */
        public final void mo3800c(int i, int i2) {
            this.f3007a.mo3808d(i, i2);
        }

        /* renamed from: c */
        public void mo3801c(VH vh) {
        }

        /* renamed from: d */
        public final void mo3802d(int i) {
            this.f3007a.mo3808d(i, 1);
        }

        /* renamed from: d */
        public void mo348d(VH vh) {
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$b */
    static class C0749b extends Observable<C0750c> {
        C0749b() {
        }

        /* renamed from: a */
        public void mo3803a() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0750c) this.mObservers.get(size)).mo3809a();
            }
        }

        /* renamed from: a */
        public void mo3804a(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0750c) this.mObservers.get(size)).mo3811a(i, i2, 1);
            }
        }

        /* renamed from: a */
        public void mo3805a(int i, int i2, Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0750c) this.mObservers.get(size)).mo3812a(i, i2, obj);
            }
        }

        /* renamed from: b */
        public void mo3806b(int i, int i2) {
            mo3805a(i, i2, (Object) null);
        }

        /* renamed from: c */
        public void mo3807c(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0750c) this.mObservers.get(size)).mo3813b(i, i2);
            }
        }

        /* renamed from: d */
        public void mo3808d(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0750c) this.mObservers.get(size)).mo3814c(i, i2);
            }
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$c */
    public static abstract class C0750c {
        /* renamed from: a */
        public void mo3809a() {
        }

        /* renamed from: a */
        public void mo3810a(int i, int i2) {
        }

        /* renamed from: a */
        public void mo3811a(int i, int i2, int i3) {
        }

        /* renamed from: a */
        public void mo3812a(int i, int i2, Object obj) {
            mo3810a(i, i2);
        }

        /* renamed from: b */
        public void mo3813b(int i, int i2) {
        }

        /* renamed from: c */
        public void mo3814c(int i, int i2) {
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$d */
    public interface C0751d {
        /* renamed from: a */
        int mo3815a(int i, int i2);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$e */
    public static class C0752e {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public EdgeEffect mo3816a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$f */
    public static abstract class C0753f {

        /* renamed from: a */
        private C0755b f3009a = null;

        /* renamed from: b */
        private ArrayList<C0754a> f3010b = new ArrayList<>();

        /* renamed from: c */
        private long f3011c = 120;

        /* renamed from: d */
        private long f3012d = 120;

        /* renamed from: e */
        private long f3013e = 250;

        /* renamed from: f */
        private long f3014f = 250;

        /* renamed from: android.support.v7.widget.RecyclerView$f$a */
        public interface C0754a {
            /* renamed from: a */
            void mo3838a();
        }

        /* renamed from: android.support.v7.widget.RecyclerView$f$b */
        interface C0755b {
            /* renamed from: a */
            void mo3839a(C0778w wVar);
        }

        /* renamed from: android.support.v7.widget.RecyclerView$f$c */
        public static class C0756c {

            /* renamed from: a */
            public int f3015a;

            /* renamed from: b */
            public int f3016b;

            /* renamed from: c */
            public int f3017c;

            /* renamed from: d */
            public int f3018d;

            /* renamed from: a */
            public C0756c mo3840a(C0778w wVar) {
                mo3841a(wVar, 0);
                return this;
            }

            /* renamed from: a */
            public C0756c mo3841a(C0778w wVar, int i) {
                View view = wVar.f3093b;
                this.f3015a = view.getLeft();
                this.f3016b = view.getTop();
                this.f3017c = view.getRight();
                this.f3018d = view.getBottom();
                return this;
            }
        }

        /* renamed from: a */
        static int m4058a(C0778w wVar) {
            int c = wVar.f3102k & 14;
            if (wVar.mo4046m()) {
                return 4;
            }
            if ((c & 4) != 0) {
                return c;
            }
            int i = wVar.mo4042i();
            int e = wVar.mo4038e();
            return (i == -1 || e == -1 || i == e) ? c : c | 2048;
        }

        /* renamed from: a */
        public C0756c mo3817a(C0775t tVar, C0778w wVar) {
            C0756c h = mo3836h();
            h.mo3840a(wVar);
            return h;
        }

        /* renamed from: a */
        public C0756c mo3818a(C0775t tVar, C0778w wVar, int i, List<Object> list) {
            C0756c h = mo3836h();
            h.mo3840a(wVar);
            return h;
        }

        /* renamed from: a */
        public final void mo3819a() {
            int size = this.f3010b.size();
            for (int i = 0; i < size; i++) {
                this.f3010b.get(i).mo3838a();
            }
            this.f3010b.clear();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3820a(C0755b bVar) {
            this.f3009a = bVar;
        }

        /* renamed from: a */
        public abstract boolean mo3821a(C0778w wVar, C0756c cVar, C0756c cVar2);

        /* renamed from: a */
        public abstract boolean mo3822a(C0778w wVar, C0778w wVar2, C0756c cVar, C0756c cVar2);

        /* renamed from: a */
        public boolean mo3823a(C0778w wVar, List<Object> list) {
            return mo3825b(wVar);
        }

        /* renamed from: b */
        public abstract void mo3824b();

        /* renamed from: b */
        public abstract boolean mo3825b(C0778w wVar);

        /* renamed from: b */
        public abstract boolean mo3826b(C0778w wVar, C0756c cVar, C0756c cVar2);

        /* renamed from: c */
        public long mo3827c() {
            return this.f3011c;
        }

        /* renamed from: c */
        public final void mo3828c(C0778w wVar) {
            mo3833e(wVar);
            C0755b bVar = this.f3009a;
            if (bVar != null) {
                bVar.mo3839a(wVar);
            }
        }

        /* renamed from: c */
        public abstract boolean mo3829c(C0778w wVar, C0756c cVar, C0756c cVar2);

        /* renamed from: d */
        public long mo3830d() {
            return this.f3014f;
        }

        /* renamed from: d */
        public abstract void mo3831d(C0778w wVar);

        /* renamed from: e */
        public long mo3832e() {
            return this.f3013e;
        }

        /* renamed from: e */
        public void mo3833e(C0778w wVar) {
        }

        /* renamed from: f */
        public long mo3834f() {
            return this.f3012d;
        }

        /* renamed from: g */
        public abstract boolean mo3835g();

        /* renamed from: h */
        public C0756c mo3836h() {
            return new C0756c();
        }

        /* renamed from: i */
        public abstract void mo3837i();
    }

    /* renamed from: android.support.v7.widget.RecyclerView$g */
    private class C0757g implements C0753f.C0755b {
        C0757g() {
        }

        /* renamed from: a */
        public void mo3839a(C0778w wVar) {
            wVar.mo4033a(true);
            if (wVar.f3100i != null && wVar.f3101j == null) {
                wVar.f3100i = null;
            }
            wVar.f3101j = null;
            if (!wVar.m4331A() && !RecyclerView.this.mo3731m(wVar.f3093b) && wVar.mo4050q()) {
                RecyclerView.this.removeDetachedView(wVar.f3093b, false);
            }
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$h */
    public static abstract class C0758h {
        @Deprecated
        /* renamed from: a */
        public void mo3842a(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: a */
        public void mo3843a(Canvas canvas, RecyclerView recyclerView, C0775t tVar) {
            mo3842a(canvas, recyclerView);
        }

        @Deprecated
        /* renamed from: a */
        public void mo3844a(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        /* renamed from: a */
        public void mo3845a(Rect rect, View view, RecyclerView recyclerView, C0775t tVar) {
            mo3844a(rect, ((C0762j) view.getLayoutParams()).mo3940a(), recyclerView);
        }

        @Deprecated
        /* renamed from: b */
        public void mo3846b(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: b */
        public void mo3847b(Canvas canvas, RecyclerView recyclerView, C0775t tVar) {
            mo3846b(canvas, recyclerView);
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$i */
    public static abstract class C0759i {

        /* renamed from: a */
        C0789T f3020a;

        /* renamed from: b */
        RecyclerView f3021b;

        /* renamed from: c */
        private final C0887sb.C0889b f3022c = new C0720Ha(this);

        /* renamed from: d */
        private final C0887sb.C0889b f3023d = new C0722Ia(this);

        /* renamed from: e */
        C0887sb f3024e = new C0887sb(this.f3022c);

        /* renamed from: f */
        C0887sb f3025f = new C0887sb(this.f3023d);

        /* renamed from: g */
        C0772s f3026g;

        /* renamed from: h */
        boolean f3027h = false;

        /* renamed from: i */
        boolean f3028i = false;

        /* renamed from: j */
        boolean f3029j = false;

        /* renamed from: k */
        private boolean f3030k = true;

        /* renamed from: l */
        private boolean f3031l = true;

        /* renamed from: m */
        int f3032m;

        /* renamed from: n */
        boolean f3033n;

        /* renamed from: o */
        private int f3034o;

        /* renamed from: p */
        private int f3035p;

        /* renamed from: q */
        private int f3036q;

        /* renamed from: r */
        private int f3037r;

        /* renamed from: android.support.v7.widget.RecyclerView$i$a */
        public interface C0760a {
            /* renamed from: a */
            void mo3939a(int i, int i2);
        }

        /* renamed from: android.support.v7.widget.RecyclerView$i$b */
        public static class C0761b {

            /* renamed from: a */
            public int f3038a;

            /* renamed from: b */
            public int f3039b;

            /* renamed from: c */
            public boolean f3040c;

            /* renamed from: d */
            public boolean f3041d;
        }

        /* renamed from: a */
        public static int m4091a(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        /* renamed from: a */
        public static int m4092a(int i, int i2, int i3, int i4, boolean z) {
            int i5;
            int i6 = i - i3;
            int i7 = 0;
            int max = Math.max(0, i6);
            if (z) {
                if (i4 < 0) {
                    if (i4 == -1) {
                        if (i2 == Integer.MIN_VALUE || (i2 != 0 && i2 == 1073741824)) {
                            i5 = max;
                        } else {
                            i2 = 0;
                            i5 = 0;
                        }
                        i7 = i2;
                        max = i5;
                        return View.MeasureSpec.makeMeasureSpec(max, i7);
                    }
                    max = 0;
                    return View.MeasureSpec.makeMeasureSpec(max, i7);
                }
            } else if (i4 < 0) {
                if (i4 == -1) {
                    i7 = i2;
                } else {
                    if (i4 == -2) {
                        if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                            i7 = Integer.MIN_VALUE;
                        }
                    }
                    max = 0;
                }
                return View.MeasureSpec.makeMeasureSpec(max, i7);
            }
            max = i4;
            i7 = 1073741824;
            return View.MeasureSpec.makeMeasureSpec(max, i7);
        }

        /* renamed from: a */
        public static C0761b m4093a(Context context, AttributeSet attributeSet, int i, int i2) {
            C0761b bVar = new C0761b();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1123b.RecyclerView, i, i2);
            bVar.f3038a = obtainStyledAttributes.getInt(C1123b.RecyclerView_android_orientation, 1);
            bVar.f3039b = obtainStyledAttributes.getInt(C1123b.RecyclerView_spanCount, 1);
            bVar.f3040c = obtainStyledAttributes.getBoolean(C1123b.RecyclerView_reverseLayout, false);
            bVar.f3041d = obtainStyledAttributes.getBoolean(C1123b.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return bVar;
        }

        /* renamed from: a */
        private void m4094a(int i, View view) {
            this.f3020a.mo4243a(i);
        }

        /* renamed from: a */
        private void m4095a(C0769p pVar, int i, View view) {
            C0778w i2 = RecyclerView.m3934i(view);
            if (!i2.mo4056v()) {
                if (!i2.mo4046m() || i2.mo4048o() || this.f3021b.f2996v.mo3797b()) {
                    mo3850a(i);
                    pVar.mo3986c(view);
                    this.f3021b.f2984p.mo4727d(i2);
                    return;
                }
                mo3913g(i);
                pVar.mo3980b(i2);
            }
        }

        /* renamed from: a */
        private void m4096a(View view, int i, boolean z) {
            C0778w i2 = RecyclerView.m3934i(view);
            if (z || i2.mo4048o()) {
                this.f3021b.f2984p.mo4719a(i2);
            } else {
                this.f3021b.f2984p.mo4730g(i2);
            }
            C0762j jVar = (C0762j) view.getLayoutParams();
            if (i2.mo4058x() || i2.mo4049p()) {
                if (i2.mo4049p()) {
                    i2.mo4057w();
                } else {
                    i2.mo4036c();
                }
                this.f3020a.mo4245a(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f3021b) {
                int b = this.f3020a.mo4249b(view);
                if (i == -1) {
                    i = this.f3020a.mo4242a();
                }
                if (b == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f3021b.indexOfChild(view) + this.f3021b.mo3724j());
                } else if (b != i) {
                    this.f3021b.f2998w.mo3851a(b, i);
                }
            } else {
                this.f3020a.mo4246a(view, i, false);
                jVar.f3044c = true;
                C0772s sVar = this.f3026g;
                if (sVar != null && sVar.mo4007c()) {
                    this.f3026g.mo4005b(view);
                }
            }
            if (jVar.f3045d) {
                i2.f3093b.invalidate();
                jVar.f3045d = false;
            }
        }

        /* renamed from: b */
        private static boolean m4097b(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        /* renamed from: b */
        private int[] m4098b(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            int[] iArr = new int[2];
            int o = mo3928o();
            int q = mo3931q();
            int r = mo3932r() - mo3930p();
            int h = mo3914h() - mo3926n();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - o;
            int min = Math.min(0, i);
            int i2 = top - q;
            int min2 = Math.min(0, i2);
            int i3 = width - r;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - h);
            if (mo3920k() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        /* renamed from: d */
        private boolean m4099d(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int o = mo3928o();
            int q = mo3931q();
            int r = mo3932r() - mo3930p();
            int h = mo3914h() - mo3926n();
            Rect rect = this.f3021b.f2990s;
            mo3887b(focusedChild, rect);
            return rect.left - i < r && rect.right - i > o && rect.top - i2 < h && rect.bottom - i2 > q;
        }

        /* renamed from: A */
        public void mo3848A() {
            this.f3027h = true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: B */
        public boolean mo3492B() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: C */
        public void mo3849C() {
            C0772s sVar = this.f3026g;
            if (sVar != null) {
                sVar.mo4008d();
            }
        }

        /* renamed from: D */
        public boolean mo3366D() {
            return false;
        }

        /* renamed from: a */
        public int mo3368a(int i, C0769p pVar, C0775t tVar) {
            return 0;
        }

        /* renamed from: a */
        public int mo3369a(C0769p pVar, C0775t tVar) {
            RecyclerView recyclerView = this.f3021b;
            if (recyclerView == null || recyclerView.f2996v == null || !mo3509a()) {
                return 1;
            }
            return this.f3021b.f2996v.mo337a();
        }

        /* renamed from: a */
        public int mo3501a(C0775t tVar) {
            return 0;
        }

        /* renamed from: a */
        public C0762j mo3370a(Context context, AttributeSet attributeSet) {
            return new C0762j(context, attributeSet);
        }

        /* renamed from: a */
        public C0762j mo3371a(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof C0762j ? new C0762j((C0762j) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0762j((ViewGroup.MarginLayoutParams) layoutParams) : new C0762j(layoutParams);
        }

        /* renamed from: a */
        public View mo3373a(View view, int i, C0769p pVar, C0775t tVar) {
            return null;
        }

        /* renamed from: a */
        public void mo3850a(int i) {
            m4094a(i, mo3890c(i));
        }

        /* renamed from: a */
        public void mo3851a(int i, int i2) {
            View c = mo3890c(i);
            if (c != null) {
                mo3850a(i);
                mo3896c(c, i2);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.f3021b.toString());
        }

        /* renamed from: a */
        public void mo3503a(int i, int i2, C0775t tVar, C0760a aVar) {
        }

        /* renamed from: a */
        public void mo3504a(int i, C0760a aVar) {
        }

        /* renamed from: a */
        public void mo3852a(int i, C0769p pVar) {
            View c = mo3890c(i);
            mo3913g(i);
            pVar.mo3981b(c);
        }

        /* renamed from: a */
        public void mo3374a(Rect rect, int i, int i2) {
            mo3892c(m4091a(i, rect.width() + mo3928o() + mo3930p(), mo3924m()), m4091a(i2, rect.height() + mo3931q() + mo3926n(), mo3922l()));
        }

        /* renamed from: a */
        public void mo3505a(Parcelable parcelable) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3853a(C0446b bVar) {
            RecyclerView recyclerView = this.f3021b;
            mo3857a(recyclerView.f2976l, recyclerView.f2989ra, bVar);
        }

        /* renamed from: a */
        public void mo3854a(C0748a aVar, C0748a aVar2) {
        }

        /* renamed from: a */
        public void mo3855a(C0769p pVar) {
            for (int e = mo3903e() - 1; e >= 0; e--) {
                m4095a(pVar, e, mo3890c(e));
            }
        }

        /* renamed from: a */
        public void mo3856a(C0769p pVar, C0775t tVar, int i, int i2) {
            this.f3021b.mo3662c(i, i2);
        }

        /* renamed from: a */
        public void mo3857a(C0769p pVar, C0775t tVar, C0446b bVar) {
            if (this.f3021b.canScrollVertically(-1) || this.f3021b.canScrollHorizontally(-1)) {
                bVar.mo1854a(8192);
                bVar.mo1890j(true);
            }
            if (this.f3021b.canScrollVertically(1) || this.f3021b.canScrollHorizontally(1)) {
                bVar.mo1854a((int) SVGParser.ENTITY_WATCH_BUFFER_SIZE);
                bVar.mo1890j(true);
            }
            bVar.mo1858a((Object) C0446b.C0448b.m2138a(mo3385b(pVar, tVar), mo3369a(pVar, tVar), mo3902d(pVar, tVar), mo3889c(pVar, tVar)));
        }

        /* renamed from: a */
        public void mo3378a(C0769p pVar, C0775t tVar, View view, C0446b bVar) {
            int i = 0;
            int l = mo3513b() ? mo3923l(view) : 0;
            if (mo3509a()) {
                i = mo3923l(view);
            }
            bVar.mo1865b((Object) C0446b.C0449c.m2139a(l, 1, i, 1, false, false));
        }

        /* renamed from: a */
        public void mo3858a(C0769p pVar, C0775t tVar, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f3021b;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f3021b.canScrollVertically(-1) && !this.f3021b.canScrollHorizontally(-1) && !this.f3021b.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                C0748a aVar = this.f3021b.f2996v;
                if (aVar != null) {
                    accessibilityEvent.setItemCount(aVar.mo337a());
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3859a(RecyclerView recyclerView) {
            this.f3028i = true;
            mo3884b(recyclerView);
        }

        /* renamed from: a */
        public void mo3380a(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: a */
        public void mo3381a(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        /* renamed from: a */
        public void mo3382a(RecyclerView recyclerView, int i, int i2, Object obj) {
            mo3895c(recyclerView, i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3860a(RecyclerView recyclerView, C0769p pVar) {
            this.f3028i = false;
            mo3512b(recyclerView, pVar);
        }

        /* renamed from: a */
        public void mo3861a(View view) {
            mo3862a(view, -1);
        }

        /* renamed from: a */
        public void mo3862a(View view, int i) {
            m4096a(view, i, true);
        }

        /* renamed from: a */
        public void mo3863a(View view, int i, int i2) {
            C0762j jVar = (C0762j) view.getLayoutParams();
            Rect j = this.f3021b.mo3723j(view);
            int i3 = i + j.left + j.right;
            int i4 = i2 + j.top + j.bottom;
            int a = m4092a(mo3932r(), mo3933s(), mo3928o() + mo3930p() + jVar.leftMargin + jVar.rightMargin + i3, jVar.width, mo3509a());
            int a2 = m4092a(mo3914h(), mo3916i(), mo3931q() + mo3926n() + jVar.topMargin + jVar.bottomMargin + i4, jVar.height, mo3513b());
            if (mo3878a(view, a, a2, jVar)) {
                view.measure(a, a2);
            }
        }

        /* renamed from: a */
        public void mo3864a(View view, int i, int i2, int i3, int i4) {
            C0762j jVar = (C0762j) view.getLayoutParams();
            Rect rect = jVar.f3043b;
            view.layout(i + rect.left + jVar.leftMargin, i2 + rect.top + jVar.topMargin, (i3 - rect.right) - jVar.rightMargin, (i4 - rect.bottom) - jVar.bottomMargin);
        }

        /* renamed from: a */
        public void mo3865a(View view, int i, C0762j jVar) {
            C0778w i2 = RecyclerView.m3934i(view);
            if (i2.mo4048o()) {
                this.f3021b.f2984p.mo4719a(i2);
            } else {
                this.f3021b.f2984p.mo4730g(i2);
            }
            this.f3020a.mo4245a(view, i, jVar, i2.mo4048o());
        }

        /* renamed from: a */
        public void mo3866a(View view, Rect rect) {
            RecyclerView recyclerView = this.f3021b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.mo3723j(view));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3867a(View view, C0446b bVar) {
            C0778w i = RecyclerView.m3934i(view);
            if (i != null && !i.mo4048o() && !this.f3020a.mo4253c(i.f3093b)) {
                RecyclerView recyclerView = this.f3021b;
                mo3378a(recyclerView.f2976l, recyclerView.f2989ra, view, bVar);
            }
        }

        /* renamed from: a */
        public void mo3868a(View view, C0769p pVar) {
            mo3929o(view);
            pVar.mo3981b(view);
        }

        /* renamed from: a */
        public void mo3869a(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((C0762j) view.getLayoutParams()).f3043b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.f3021b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f3021b.f2994u;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: a */
        public void mo3506a(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f3021b;
            mo3858a(recyclerView.f2976l, recyclerView.f2989ra, accessibilityEvent);
        }

        /* renamed from: a */
        public void mo3507a(String str) {
            RecyclerView recyclerView = this.f3021b;
            if (recyclerView != null) {
                recyclerView.mo3641a(str);
            }
        }

        /* renamed from: a */
        public boolean mo3509a() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3870a(int i, Bundle bundle) {
            RecyclerView recyclerView = this.f3021b;
            return mo3871a(recyclerView.f2976l, recyclerView.f2989ra, i, bundle);
        }

        /* renamed from: a */
        public boolean mo3383a(C0762j jVar) {
            return jVar != null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0072 A[ADDED_TO_REGION] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo3871a(android.support.p011v7.widget.RecyclerView.C0769p r2, android.support.p011v7.widget.RecyclerView.C0775t r3, int r4, android.os.Bundle r5) {
            /*
                r1 = this;
                android.support.v7.widget.RecyclerView r2 = r1.f3021b
                r3 = 0
                if (r2 != 0) goto L_0x0006
                return r3
            L_0x0006:
                r5 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r4 == r5) goto L_0x0042
                r5 = 8192(0x2000, float:1.14794E-41)
                if (r4 == r5) goto L_0x0012
                r2 = r3
                r4 = r2
                goto L_0x0070
            L_0x0012:
                r4 = -1
                boolean r2 = r2.canScrollVertically(r4)
                if (r2 == 0) goto L_0x0029
                int r2 = r1.mo3914h()
                int r5 = r1.mo3931q()
                int r2 = r2 - r5
                int r5 = r1.mo3926n()
                int r2 = r2 - r5
                int r2 = -r2
                goto L_0x002a
            L_0x0029:
                r2 = r3
            L_0x002a:
                android.support.v7.widget.RecyclerView r5 = r1.f3021b
                boolean r4 = r5.canScrollHorizontally(r4)
                if (r4 == 0) goto L_0x006f
                int r4 = r1.mo3932r()
                int r5 = r1.mo3928o()
                int r4 = r4 - r5
                int r5 = r1.mo3930p()
                int r4 = r4 - r5
                int r4 = -r4
                goto L_0x0070
            L_0x0042:
                boolean r2 = r2.canScrollVertically(r0)
                if (r2 == 0) goto L_0x0057
                int r2 = r1.mo3914h()
                int r4 = r1.mo3931q()
                int r2 = r2 - r4
                int r4 = r1.mo3926n()
                int r2 = r2 - r4
                goto L_0x0058
            L_0x0057:
                r2 = r3
            L_0x0058:
                android.support.v7.widget.RecyclerView r4 = r1.f3021b
                boolean r4 = r4.canScrollHorizontally(r0)
                if (r4 == 0) goto L_0x006f
                int r4 = r1.mo3932r()
                int r5 = r1.mo3928o()
                int r4 = r4 - r5
                int r5 = r1.mo3930p()
                int r4 = r4 - r5
                goto L_0x0070
            L_0x006f:
                r4 = r3
            L_0x0070:
                if (r2 != 0) goto L_0x0075
                if (r4 != 0) goto L_0x0075
                return r3
            L_0x0075:
                android.support.v7.widget.RecyclerView r3 = r1.f3021b
                r3.scrollBy(r4, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.RecyclerView.C0759i.mo3871a(android.support.v7.widget.RecyclerView$p, android.support.v7.widget.RecyclerView$t, int, android.os.Bundle):boolean");
        }

        /* renamed from: a */
        public boolean mo3872a(C0769p pVar, C0775t tVar, View view, int i, Bundle bundle) {
            return false;
        }

        /* renamed from: a */
        public boolean mo3873a(RecyclerView recyclerView, C0775t tVar, View view, View view2) {
            return mo3876a(recyclerView, view, view2);
        }

        /* renamed from: a */
        public boolean mo3874a(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return mo3875a(recyclerView, view, rect, z, false);
        }

        /* renamed from: a */
        public boolean mo3875a(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] b = m4098b(recyclerView, view, rect, z);
            int i = b[0];
            int i2 = b[1];
            if ((z2 && !m4099d(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.mo3721i(i, i2);
            }
            return true;
        }

        @Deprecated
        /* renamed from: a */
        public boolean mo3876a(RecyclerView recyclerView, View view, View view2) {
            return mo3937x() || recyclerView.mo3733o();
        }

        /* renamed from: a */
        public boolean mo3877a(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3878a(View view, int i, int i2, C0762j jVar) {
            return view.isLayoutRequested() || !this.f3030k || !m4097b(view.getWidth(), i, jVar.width) || !m4097b(view.getHeight(), i2, jVar.height);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3879a(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.f3021b;
            return mo3872a(recyclerView.f2976l, recyclerView.f2989ra, view, i, bundle);
        }

        /* renamed from: a */
        public boolean mo3880a(View view, boolean z, boolean z2) {
            boolean z3 = this.f3024e.mo4700a(view, 24579) && this.f3025f.mo4700a(view, 24579);
            return z ? z3 : !z3;
        }

        /* renamed from: a */
        public boolean mo3881a(Runnable runnable) {
            RecyclerView recyclerView = this.f3021b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        /* renamed from: b */
        public int mo3384b(int i, C0769p pVar, C0775t tVar) {
            return 0;
        }

        /* renamed from: b */
        public int mo3385b(C0769p pVar, C0775t tVar) {
            RecyclerView recyclerView = this.f3021b;
            if (recyclerView == null || recyclerView.f2996v == null || !mo3513b()) {
                return 1;
            }
            return this.f3021b.f2996v.mo337a();
        }

        /* renamed from: b */
        public int mo3510b(C0775t tVar) {
            return 0;
        }

        /* renamed from: b */
        public View mo3511b(int i) {
            int e = mo3903e();
            for (int i2 = 0; i2 < e; i2++) {
                View c = mo3890c(i2);
                C0778w i3 = RecyclerView.m3934i(c);
                if (i3 != null && i3.mo4041h() == i && !i3.mo4056v() && (this.f3021b.f2989ra.mo4016d() || !i3.mo4048o())) {
                    return c;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3882b(int i, int i2) {
            this.f3036q = View.MeasureSpec.getSize(i);
            this.f3034o = View.MeasureSpec.getMode(i);
            if (this.f3034o == 0 && !RecyclerView.f2926d) {
                this.f3036q = 0;
            }
            this.f3037r = View.MeasureSpec.getSize(i2);
            this.f3035p = View.MeasureSpec.getMode(i2);
            if (this.f3035p == 0 && !RecyclerView.f2926d) {
                this.f3037r = 0;
            }
        }

        /* renamed from: b */
        public void mo3883b(C0769p pVar) {
            for (int e = mo3903e() - 1; e >= 0; e--) {
                if (!RecyclerView.m3934i(mo3890c(e)).mo4056v()) {
                    mo3852a(e, pVar);
                }
            }
        }

        /* renamed from: b */
        public void mo3884b(RecyclerView recyclerView) {
        }

        /* renamed from: b */
        public void mo3386b(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: b */
        public void mo3512b(RecyclerView recyclerView, C0769p pVar) {
            mo3894c(recyclerView);
        }

        /* renamed from: b */
        public void mo3885b(View view) {
            mo3886b(view, -1);
        }

        /* renamed from: b */
        public void mo3886b(View view, int i) {
            m4096a(view, i, false);
        }

        /* renamed from: b */
        public void mo3887b(View view, Rect rect) {
            RecyclerView.m3921a(view, rect);
        }

        /* renamed from: b */
        public boolean mo3513b() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo3888b(View view, int i, int i2, C0762j jVar) {
            return !this.f3030k || !m4097b(view.getMeasuredWidth(), i, jVar.width) || !m4097b(view.getMeasuredHeight(), i2, jVar.height);
        }

        /* renamed from: c */
        public int mo3889c(C0769p pVar, C0775t tVar) {
            return 0;
        }

        /* renamed from: c */
        public int mo3515c(C0775t tVar) {
            return 0;
        }

        /* renamed from: c */
        public abstract C0762j mo3388c();

        /* renamed from: c */
        public View mo3890c(int i) {
            C0789T t = this.f3020a;
            if (t != null) {
                return t.mo4251c(i);
            }
            return null;
        }

        /* renamed from: c */
        public View mo3891c(View view) {
            View c;
            RecyclerView recyclerView = this.f3021b;
            if (recyclerView == null || (c = recyclerView.mo3660c(view)) == null || this.f3020a.mo4253c(c)) {
                return null;
            }
            return c;
        }

        /* renamed from: c */
        public void mo3892c(int i, int i2) {
            this.f3021b.setMeasuredDimension(i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo3893c(C0769p pVar) {
            int e = pVar.mo3990e();
            for (int i = e - 1; i >= 0; i--) {
                View c = pVar.mo3982c(i);
                C0778w i2 = RecyclerView.m3934i(c);
                if (!i2.mo4056v()) {
                    i2.mo4033a(false);
                    if (i2.mo4050q()) {
                        this.f3021b.removeDetachedView(c, false);
                    }
                    C0753f fVar = this.f3021b.f2963W;
                    if (fVar != null) {
                        fVar.mo3831d(i2);
                    }
                    i2.mo4033a(true);
                    pVar.mo3975a(c);
                }
            }
            pVar.mo3983c();
            if (e > 0) {
                this.f3021b.invalidate();
            }
        }

        @Deprecated
        /* renamed from: c */
        public void mo3894c(RecyclerView recyclerView) {
        }

        /* renamed from: c */
        public void mo3895c(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: c */
        public void mo3896c(View view, int i) {
            mo3865a(view, i, (C0762j) view.getLayoutParams());
        }

        /* renamed from: d */
        public int mo3897d() {
            return -1;
        }

        /* renamed from: d */
        public int mo3516d(C0775t tVar) {
            return 0;
        }

        /* renamed from: d */
        public int mo3898d(View view) {
            return ((C0762j) view.getLayoutParams()).f3043b.bottom;
        }

        /* renamed from: d */
        public View mo3899d(View view, int i) {
            return null;
        }

        /* renamed from: d */
        public void mo3900d(int i) {
            RecyclerView recyclerView = this.f3021b;
            if (recyclerView != null) {
                recyclerView.mo3675d(i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo3901d(int i, int i2) {
            int e = mo3903e();
            if (e == 0) {
                this.f3021b.mo3662c(i, i2);
                return;
            }
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < e; i7++) {
                View c = mo3890c(i7);
                Rect rect = this.f3021b.f2990s;
                mo3887b(c, rect);
                int i8 = rect.left;
                if (i8 < i3) {
                    i3 = i8;
                }
                int i9 = rect.right;
                if (i9 > i4) {
                    i4 = i9;
                }
                int i10 = rect.top;
                if (i10 < i6) {
                    i6 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i5) {
                    i5 = i11;
                }
            }
            this.f3021b.f2990s.set(i3, i6, i4, i5);
            mo3374a(this.f3021b.f2990s, i, i2);
        }

        /* renamed from: d */
        public void mo3389d(RecyclerView recyclerView) {
        }

        /* renamed from: d */
        public boolean mo3902d(C0769p pVar, C0775t tVar) {
            return false;
        }

        /* renamed from: e */
        public int mo3903e() {
            C0789T t = this.f3020a;
            if (t != null) {
                return t.mo4242a();
            }
            return 0;
        }

        /* renamed from: e */
        public int mo3517e(C0775t tVar) {
            return 0;
        }

        /* renamed from: e */
        public int mo3904e(View view) {
            return view.getBottom() + mo3898d(view);
        }

        /* renamed from: e */
        public void mo3905e(int i) {
            RecyclerView recyclerView = this.f3021b;
            if (recyclerView != null) {
                recyclerView.mo3686e(i);
            }
        }

        /* renamed from: e */
        public void mo3390e(C0769p pVar, C0775t tVar) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo3906e(RecyclerView recyclerView) {
            mo3882b(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* renamed from: f */
        public int mo3519f(C0775t tVar) {
            return 0;
        }

        /* renamed from: f */
        public int mo3907f(View view) {
            return view.getLeft() - mo3921k(view);
        }

        /* renamed from: f */
        public void mo3908f(int i) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo3909f(RecyclerView recyclerView) {
            int i;
            if (recyclerView == null) {
                this.f3021b = null;
                this.f3020a = null;
                i = 0;
                this.f3036q = 0;
            } else {
                this.f3021b = recyclerView;
                this.f3020a = recyclerView.f2982o;
                this.f3036q = recyclerView.getWidth();
                i = recyclerView.getHeight();
            }
            this.f3037r = i;
            this.f3034o = 1073741824;
            this.f3035p = 1073741824;
        }

        /* renamed from: f */
        public boolean mo3910f() {
            RecyclerView recyclerView = this.f3021b;
            return recyclerView != null && recyclerView.f2986q;
        }

        /* renamed from: g */
        public int mo3911g(View view) {
            Rect rect = ((C0762j) view.getLayoutParams()).f3043b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: g */
        public View mo3912g() {
            View focusedChild;
            RecyclerView recyclerView = this.f3021b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f3020a.mo4253c(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* renamed from: g */
        public void mo3913g(int i) {
            if (mo3890c(i) != null) {
                this.f3020a.mo4256e(i);
            }
        }

        /* renamed from: g */
        public void mo3392g(C0775t tVar) {
        }

        /* renamed from: h */
        public int mo3914h() {
            return this.f3037r;
        }

        /* renamed from: h */
        public int mo3915h(View view) {
            Rect rect = ((C0762j) view.getLayoutParams()).f3043b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: h */
        public void mo3521h(int i) {
        }

        /* renamed from: i */
        public int mo3916i() {
            return this.f3035p;
        }

        /* renamed from: i */
        public int mo3917i(View view) {
            return view.getRight() + mo3925m(view);
        }

        /* renamed from: j */
        public int mo3918j() {
            RecyclerView recyclerView = this.f3021b;
            C0748a adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.mo337a();
            }
            return 0;
        }

        /* renamed from: j */
        public int mo3919j(View view) {
            return view.getTop() - mo3927n(view);
        }

        /* renamed from: k */
        public int mo3920k() {
            return C0487v.m2293i(this.f3021b);
        }

        /* renamed from: k */
        public int mo3921k(View view) {
            return ((C0762j) view.getLayoutParams()).f3043b.left;
        }

        /* renamed from: l */
        public int mo3922l() {
            return C0487v.m2294j(this.f3021b);
        }

        /* renamed from: l */
        public int mo3923l(View view) {
            return ((C0762j) view.getLayoutParams()).mo3940a();
        }

        /* renamed from: m */
        public int mo3924m() {
            return C0487v.m2295k(this.f3021b);
        }

        /* renamed from: m */
        public int mo3925m(View view) {
            return ((C0762j) view.getLayoutParams()).f3043b.right;
        }

        /* renamed from: n */
        public int mo3926n() {
            RecyclerView recyclerView = this.f3021b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        /* renamed from: n */
        public int mo3927n(View view) {
            return ((C0762j) view.getLayoutParams()).f3043b.top;
        }

        /* renamed from: o */
        public int mo3928o() {
            RecyclerView recyclerView = this.f3021b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        /* renamed from: o */
        public void mo3929o(View view) {
            this.f3020a.mo4255d(view);
        }

        /* renamed from: p */
        public int mo3930p() {
            RecyclerView recyclerView = this.f3021b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* renamed from: q */
        public int mo3931q() {
            RecyclerView recyclerView = this.f3021b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* renamed from: r */
        public int mo3932r() {
            return this.f3036q;
        }

        /* renamed from: s */
        public int mo3933s() {
            return this.f3034o;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public boolean mo3934t() {
            int e = mo3903e();
            for (int i = 0; i < e; i++) {
                ViewGroup.LayoutParams layoutParams = mo3890c(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: u */
        public boolean mo3935u() {
            return this.f3028i;
        }

        /* renamed from: v */
        public boolean mo3524v() {
            return this.f3029j;
        }

        /* renamed from: w */
        public final boolean mo3936w() {
            return this.f3031l;
        }

        /* renamed from: x */
        public boolean mo3937x() {
            C0772s sVar = this.f3026g;
            return sVar != null && sVar.mo4007c();
        }

        /* renamed from: y */
        public Parcelable mo3525y() {
            return null;
        }

        /* renamed from: z */
        public void mo3938z() {
            RecyclerView recyclerView = this.f3021b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$j */
    public static class C0762j extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        C0778w f3042a;

        /* renamed from: b */
        final Rect f3043b = new Rect();

        /* renamed from: c */
        boolean f3044c = true;

        /* renamed from: d */
        boolean f3045d = false;

        public C0762j(int i, int i2) {
            super(i, i2);
        }

        public C0762j(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0762j(C0762j jVar) {
            super(jVar);
        }

        public C0762j(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0762j(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* renamed from: a */
        public int mo3940a() {
            return this.f3042a.mo4041h();
        }

        /* renamed from: b */
        public boolean mo3941b() {
            return this.f3042a.mo4051r();
        }

        /* renamed from: c */
        public boolean mo3942c() {
            return this.f3042a.mo4048o();
        }

        /* renamed from: d */
        public boolean mo3943d() {
            return this.f3042a.mo4046m();
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$k */
    public interface C0763k {
        /* renamed from: a */
        void mo3944a(View view);

        /* renamed from: b */
        void mo3945b(View view);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$l */
    public static abstract class C0764l {
        /* renamed from: a */
        public abstract boolean mo3946a(int i, int i2);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$m */
    public interface C0765m {
        /* renamed from: a */
        void mo3947a(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: a */
        void mo3948a(boolean z);

        /* renamed from: b */
        boolean mo3949b(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$n */
    public static abstract class C0766n {
        /* renamed from: a */
        public void mo3950a(RecyclerView recyclerView, int i) {
        }

        /* renamed from: a */
        public void mo3951a(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$o */
    public static class C0767o {

        /* renamed from: a */
        SparseArray<C0768a> f3046a = new SparseArray<>();

        /* renamed from: b */
        private int f3047b = 0;

        /* renamed from: android.support.v7.widget.RecyclerView$o$a */
        static class C0768a {

            /* renamed from: a */
            final ArrayList<C0778w> f3048a = new ArrayList<>();

            /* renamed from: b */
            int f3049b = 5;

            /* renamed from: c */
            long f3050c = 0;

            /* renamed from: d */
            long f3051d = 0;

            C0768a() {
            }
        }

        /* renamed from: b */
        private C0768a m4242b(int i) {
            C0768a aVar = this.f3046a.get(i);
            if (aVar != null) {
                return aVar;
            }
            C0768a aVar2 = new C0768a();
            this.f3046a.put(i, aVar2);
            return aVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public long mo3952a(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        /* renamed from: a */
        public C0778w mo3953a(int i) {
            C0768a aVar = this.f3046a.get(i);
            if (aVar == null || aVar.f3048a.isEmpty()) {
                return null;
            }
            ArrayList<C0778w> arrayList = aVar.f3048a;
            return arrayList.remove(arrayList.size() - 1);
        }

        /* renamed from: a */
        public void mo3954a() {
            for (int i = 0; i < this.f3046a.size(); i++) {
                this.f3046a.valueAt(i).f3048a.clear();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3955a(int i, long j) {
            C0768a b = m4242b(i);
            b.f3051d = mo3952a(b.f3051d, j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3956a(C0748a aVar) {
            this.f3047b++;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3957a(C0748a aVar, C0748a aVar2, boolean z) {
            if (aVar != null) {
                mo3960b();
            }
            if (!z && this.f3047b == 0) {
                mo3954a();
            }
            if (aVar2 != null) {
                mo3956a(aVar2);
            }
        }

        /* renamed from: a */
        public void mo3958a(C0778w wVar) {
            int g = wVar.mo4040g();
            ArrayList<C0778w> arrayList = m4242b(g).f3048a;
            if (this.f3046a.get(g).f3049b > arrayList.size()) {
                wVar.mo4053t();
                arrayList.add(wVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3959a(int i, long j, long j2) {
            long j3 = m4242b(i).f3051d;
            return j3 == 0 || j + j3 < j2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3960b() {
            this.f3047b--;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3961b(int i, long j) {
            C0768a b = m4242b(i);
            b.f3050c = mo3952a(b.f3050c, j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo3962b(int i, long j, long j2) {
            long j3 = m4242b(i).f3050c;
            return j3 == 0 || j + j3 < j2;
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$p */
    public final class C0769p {

        /* renamed from: a */
        final ArrayList<C0778w> f3052a = new ArrayList<>();

        /* renamed from: b */
        ArrayList<C0778w> f3053b = null;

        /* renamed from: c */
        final ArrayList<C0778w> f3054c = new ArrayList<>();

        /* renamed from: d */
        private final List<C0778w> f3055d = Collections.unmodifiableList(this.f3052a);

        /* renamed from: e */
        private int f3056e = 2;

        /* renamed from: f */
        int f3057f = 2;

        /* renamed from: g */
        C0767o f3058g;

        /* renamed from: h */
        private C0776u f3059h;

        public C0769p() {
        }

        /* renamed from: a */
        private void m4254a(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m4254a((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        /* renamed from: a */
        private boolean m4255a(C0778w wVar, int i, int i2, long j) {
            wVar.f3110s = RecyclerView.this;
            int g = wVar.mo4040g();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != Long.MAX_VALUE && !this.f3058g.mo3959a(g, nanoTime, j)) {
                return false;
            }
            RecyclerView.this.f2996v.mo3789a(wVar, i);
            this.f3058g.mo3955a(wVar.mo4040g(), RecyclerView.this.getNanoTime() - nanoTime);
            m4256e(wVar);
            if (!RecyclerView.this.f2989ra.mo4016d()) {
                return true;
            }
            wVar.f3099h = i2;
            return true;
        }

        /* renamed from: e */
        private void m4256e(C0778w wVar) {
            if (RecyclerView.this.mo3732n()) {
                View view = wVar.f3093b;
                if (C0487v.m2292h(view) == 0) {
                    C0487v.m2288d(view, 1);
                }
                if (!C0487v.m2304t(view)) {
                    wVar.mo4027a(16384);
                    C0487v.m2274a(view, RecyclerView.this.f3003ya.mo3445b());
                }
            }
        }

        /* renamed from: f */
        private void m4257f(C0778w wVar) {
            View view = wVar.f3093b;
            if (view instanceof ViewGroup) {
                m4254a((ViewGroup) view, false);
            }
        }

        /* renamed from: a */
        public int mo3963a(int i) {
            if (i >= 0 && i < RecyclerView.this.f2989ra.mo4011a()) {
                return !RecyclerView.this.f2989ra.mo4016d() ? i : RecyclerView.this.f2980n.mo4530b(i);
            }
            throw new IndexOutOfBoundsException("invalid position " + i + ". State " + "item count is " + RecyclerView.this.f2989ra.mo4011a() + RecyclerView.this.mo3724j());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0778w mo3964a(int i, boolean z) {
            View b;
            int size = this.f3052a.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                C0778w wVar = this.f3052a.get(i3);
                if (wVar.mo4058x() || wVar.mo4041h() != i || wVar.mo4046m() || (!RecyclerView.this.f2989ra.f3075h && wVar.mo4048o())) {
                    i3++;
                } else {
                    wVar.mo4027a(32);
                    return wVar;
                }
            }
            if (z || (b = RecyclerView.this.f2982o.mo4250b(i)) == null) {
                int size2 = this.f3054c.size();
                while (i2 < size2) {
                    C0778w wVar2 = this.f3054c.get(i2);
                    if (wVar2.mo4046m() || wVar2.mo4041h() != i) {
                        i2++;
                    } else {
                        if (!z) {
                            this.f3054c.remove(i2);
                        }
                        return wVar2;
                    }
                }
                return null;
            }
            C0778w i4 = RecyclerView.m3934i(b);
            RecyclerView.this.f2982o.mo4258f(b);
            int b2 = RecyclerView.this.f2982o.mo4249b(b);
            if (b2 != -1) {
                RecyclerView.this.f2982o.mo4243a(b2);
                mo3986c(b);
                i4.mo4027a(8224);
                return i4;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + i4 + RecyclerView.this.mo3724j());
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x01a8  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x01d1  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x01d4  */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x0204  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x0212  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.support.p011v7.widget.RecyclerView.C0778w mo3965a(int r17, boolean r18, long r19) {
            /*
                r16 = this;
                r6 = r16
                r3 = r17
                r0 = r18
                if (r3 < 0) goto L_0x022e
                android.support.v7.widget.RecyclerView r1 = android.support.p011v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$t r1 = r1.f2989ra
                int r1 = r1.mo4011a()
                if (r3 >= r1) goto L_0x022e
                android.support.v7.widget.RecyclerView r1 = android.support.p011v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$t r1 = r1.f2989ra
                boolean r1 = r1.mo4016d()
                r2 = 0
                r7 = 1
                r8 = 0
                if (r1 == 0) goto L_0x0027
                android.support.v7.widget.RecyclerView$w r1 = r16.mo3976b((int) r17)
                if (r1 == 0) goto L_0x0028
                r4 = r7
                goto L_0x0029
            L_0x0027:
                r1 = r2
            L_0x0028:
                r4 = r8
            L_0x0029:
                if (r1 != 0) goto L_0x005d
                android.support.v7.widget.RecyclerView$w r1 = r16.mo3964a((int) r17, (boolean) r18)
                if (r1 == 0) goto L_0x005d
                boolean r5 = r6.mo3989d((android.support.p011v7.widget.RecyclerView.C0778w) r1)
                if (r5 != 0) goto L_0x005c
                if (r0 != 0) goto L_0x005a
                r5 = 4
                r1.mo4027a((int) r5)
                boolean r5 = r1.mo4049p()
                if (r5 == 0) goto L_0x004e
                android.support.v7.widget.RecyclerView r5 = android.support.p011v7.widget.RecyclerView.this
                android.view.View r9 = r1.f3093b
                r5.removeDetachedView(r9, r8)
                r1.mo4057w()
                goto L_0x0057
            L_0x004e:
                boolean r5 = r1.mo4058x()
                if (r5 == 0) goto L_0x0057
                r1.mo4036c()
            L_0x0057:
                r6.mo3980b((android.support.p011v7.widget.RecyclerView.C0778w) r1)
            L_0x005a:
                r1 = r2
                goto L_0x005d
            L_0x005c:
                r4 = r7
            L_0x005d:
                if (r1 != 0) goto L_0x0187
                android.support.v7.widget.RecyclerView r5 = android.support.p011v7.widget.RecyclerView.this
                android.support.v7.widget.j r5 = r5.f2980n
                int r5 = r5.mo4530b((int) r3)
                if (r5 < 0) goto L_0x014a
                android.support.v7.widget.RecyclerView r9 = android.support.p011v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$a r9 = r9.f2996v
                int r9 = r9.mo337a()
                if (r5 >= r9) goto L_0x014a
                android.support.v7.widget.RecyclerView r9 = android.support.p011v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$a r9 = r9.f2996v
                int r9 = r9.mo344b((int) r5)
                android.support.v7.widget.RecyclerView r10 = android.support.p011v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$a r10 = r10.f2996v
                boolean r10 = r10.mo3797b()
                if (r10 == 0) goto L_0x0096
                android.support.v7.widget.RecyclerView r1 = android.support.p011v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$a r1 = r1.f2996v
                long r10 = r1.mo338a((int) r5)
                android.support.v7.widget.RecyclerView$w r1 = r6.mo3966a((long) r10, (int) r9, (boolean) r0)
                if (r1 == 0) goto L_0x0096
                r1.f3095d = r5
                r4 = r7
            L_0x0096:
                if (r1 != 0) goto L_0x00eb
                android.support.v7.widget.RecyclerView$u r0 = r6.f3059h
                if (r0 == 0) goto L_0x00eb
                android.view.View r0 = r0.mo4019a(r6, r3, r9)
                if (r0 == 0) goto L_0x00eb
                android.support.v7.widget.RecyclerView r1 = android.support.p011v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$w r1 = r1.mo3716h(r0)
                if (r1 == 0) goto L_0x00ce
                boolean r0 = r1.mo4056v()
                if (r0 != 0) goto L_0x00b1
                goto L_0x00eb
            L_0x00b1:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view."
                r1.append(r2)
                android.support.v7.widget.RecyclerView r2 = android.support.p011v7.widget.RecyclerView.this
                java.lang.String r2 = r2.mo3724j()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00ce:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view which does not have a ViewHolder"
                r1.append(r2)
                android.support.v7.widget.RecyclerView r2 = android.support.p011v7.widget.RecyclerView.this
                java.lang.String r2 = r2.mo3724j()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00eb:
                if (r1 != 0) goto L_0x0101
                android.support.v7.widget.RecyclerView$o r0 = r16.mo3987d()
                android.support.v7.widget.RecyclerView$w r1 = r0.mo3953a((int) r9)
                if (r1 == 0) goto L_0x0101
                r1.mo4053t()
                boolean r0 = android.support.p011v7.widget.RecyclerView.f2925c
                if (r0 == 0) goto L_0x0101
                r6.m4257f((android.support.p011v7.widget.RecyclerView.C0778w) r1)
            L_0x0101:
                if (r1 != 0) goto L_0x0187
                android.support.v7.widget.RecyclerView r0 = android.support.p011v7.widget.RecyclerView.this
                long r0 = r0.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
                if (r5 == 0) goto L_0x011f
                android.support.v7.widget.RecyclerView$o r10 = r6.f3058g
                r11 = r9
                r12 = r0
                r14 = r19
                boolean r5 = r10.mo3962b(r11, r12, r14)
                if (r5 != 0) goto L_0x011f
                return r2
            L_0x011f:
                android.support.v7.widget.RecyclerView r2 = android.support.p011v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$a r5 = r2.f2996v
                android.support.v7.widget.RecyclerView$w r2 = r5.mo3785a((android.view.ViewGroup) r2, (int) r9)
                boolean r5 = android.support.p011v7.widget.RecyclerView.f2928f
                if (r5 == 0) goto L_0x013c
                android.view.View r5 = r2.f3093b
                android.support.v7.widget.RecyclerView r5 = android.support.p011v7.widget.RecyclerView.m3932e((android.view.View) r5)
                if (r5 == 0) goto L_0x013c
                java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
                r10.<init>(r5)
                r2.f3094c = r10
            L_0x013c:
                android.support.v7.widget.RecyclerView r5 = android.support.p011v7.widget.RecyclerView.this
                long r10 = r5.getNanoTime()
                android.support.v7.widget.RecyclerView$o r5 = r6.f3058g
                long r10 = r10 - r0
                r5.mo3961b(r9, r10)
                r10 = r2
                goto L_0x0188
            L_0x014a:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "(offset:"
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ")."
                r1.append(r2)
                java.lang.String r2 = "state:"
                r1.append(r2)
                android.support.v7.widget.RecyclerView r2 = android.support.p011v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$t r2 = r2.f2989ra
                int r2 = r2.mo4011a()
                r1.append(r2)
                android.support.v7.widget.RecyclerView r2 = android.support.p011v7.widget.RecyclerView.this
                java.lang.String r2 = r2.mo3724j()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0187:
                r10 = r1
            L_0x0188:
                r9 = r4
                if (r9 == 0) goto L_0x01c1
                android.support.v7.widget.RecyclerView r0 = android.support.p011v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$t r0 = r0.f2989ra
                boolean r0 = r0.mo4016d()
                if (r0 != 0) goto L_0x01c1
                r0 = 8192(0x2000, float:1.14794E-41)
                boolean r1 = r10.mo4035b((int) r0)
                if (r1 == 0) goto L_0x01c1
                r10.mo4028a((int) r8, (int) r0)
                android.support.v7.widget.RecyclerView r0 = android.support.p011v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$t r0 = r0.f2989ra
                boolean r0 = r0.f3078k
                if (r0 == 0) goto L_0x01c1
                int r0 = android.support.p011v7.widget.RecyclerView.C0753f.m4058a((android.support.p011v7.widget.RecyclerView.C0778w) r10)
                r0 = r0 | 4096(0x1000, float:5.74E-42)
                android.support.v7.widget.RecyclerView r1 = android.support.p011v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$f r2 = r1.f2963W
                android.support.v7.widget.RecyclerView$t r1 = r1.f2989ra
                java.util.List r4 = r10.mo4043j()
                android.support.v7.widget.RecyclerView$f$c r0 = r2.mo3818a((android.support.p011v7.widget.RecyclerView.C0775t) r1, (android.support.p011v7.widget.RecyclerView.C0778w) r10, (int) r0, (java.util.List<java.lang.Object>) r4)
                android.support.v7.widget.RecyclerView r1 = android.support.p011v7.widget.RecyclerView.this
                r1.mo3638a((android.support.p011v7.widget.RecyclerView.C0778w) r10, (android.support.p011v7.widget.RecyclerView.C0753f.C0756c) r0)
            L_0x01c1:
                android.support.v7.widget.RecyclerView r0 = android.support.p011v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$t r0 = r0.f2989ra
                boolean r0 = r0.mo4016d()
                if (r0 == 0) goto L_0x01d4
                boolean r0 = r10.mo4045l()
                if (r0 == 0) goto L_0x01d4
                r10.f3099h = r3
                goto L_0x01e7
            L_0x01d4:
                boolean r0 = r10.mo4045l()
                if (r0 == 0) goto L_0x01e9
                boolean r0 = r10.mo4052s()
                if (r0 != 0) goto L_0x01e9
                boolean r0 = r10.mo4046m()
                if (r0 == 0) goto L_0x01e7
                goto L_0x01e9
            L_0x01e7:
                r0 = r8
                goto L_0x01fc
            L_0x01e9:
                android.support.v7.widget.RecyclerView r0 = android.support.p011v7.widget.RecyclerView.this
                android.support.v7.widget.j r0 = r0.f2980n
                int r2 = r0.mo4530b((int) r3)
                r0 = r16
                r1 = r10
                r3 = r17
                r4 = r19
                boolean r0 = r0.m4255a(r1, r2, r3, r4)
            L_0x01fc:
                android.view.View r1 = r10.f3093b
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L_0x0212
                android.support.v7.widget.RecyclerView r1 = android.support.p011v7.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
            L_0x020a:
                android.support.v7.widget.RecyclerView$j r1 = (android.support.p011v7.widget.RecyclerView.C0762j) r1
                android.view.View r2 = r10.f3093b
                r2.setLayoutParams(r1)
                goto L_0x0223
            L_0x0212:
                android.support.v7.widget.RecyclerView r2 = android.support.p011v7.widget.RecyclerView.this
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L_0x0221
                android.support.v7.widget.RecyclerView r2 = android.support.p011v7.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams((android.view.ViewGroup.LayoutParams) r1)
                goto L_0x020a
            L_0x0221:
                android.support.v7.widget.RecyclerView$j r1 = (android.support.p011v7.widget.RecyclerView.C0762j) r1
            L_0x0223:
                r1.f3042a = r10
                if (r9 == 0) goto L_0x022a
                if (r0 == 0) goto L_0x022a
                goto L_0x022b
            L_0x022a:
                r7 = r8
            L_0x022b:
                r1.f3045d = r7
                return r10
            L_0x022e:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "("
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "). Item count:"
                r1.append(r2)
                android.support.v7.widget.RecyclerView r2 = android.support.p011v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$t r2 = r2.f2989ra
                int r2 = r2.mo4011a()
                r1.append(r2)
                android.support.v7.widget.RecyclerView r2 = android.support.p011v7.widget.RecyclerView.this
                java.lang.String r2 = r2.mo3724j()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.RecyclerView.C0769p.mo3965a(int, boolean, long):android.support.v7.widget.RecyclerView$w");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0778w mo3966a(long j, int i, boolean z) {
            for (int size = this.f3052a.size() - 1; size >= 0; size--) {
                C0778w wVar = this.f3052a.get(size);
                if (wVar.mo4039f() == j && !wVar.mo4058x()) {
                    if (i == wVar.mo4040g()) {
                        wVar.mo4027a(32);
                        if (wVar.mo4048o() && !RecyclerView.this.f2989ra.mo4016d()) {
                            wVar.mo4028a(2, 14);
                        }
                        return wVar;
                    } else if (!z) {
                        this.f3052a.remove(size);
                        RecyclerView.this.removeDetachedView(wVar.f3093b, false);
                        mo3975a(wVar.f3093b);
                    }
                }
            }
            int size2 = this.f3054c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                C0778w wVar2 = this.f3054c.get(size2);
                if (wVar2.mo4039f() == j) {
                    if (i == wVar2.mo4040g()) {
                        if (!z) {
                            this.f3054c.remove(size2);
                        }
                        return wVar2;
                    } else if (!z) {
                        mo3991e(size2);
                        return null;
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo3967a() {
            this.f3052a.clear();
            mo3996i();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3968a(int i, int i2) {
            int size = this.f3054c.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0778w wVar = this.f3054c.get(i3);
                if (wVar != null && wVar.f3095d >= i) {
                    wVar.mo4030a(i2, true);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3969a(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f3054c.size() - 1; size >= 0; size--) {
                C0778w wVar = this.f3054c.get(size);
                if (wVar != null) {
                    int i4 = wVar.f3095d;
                    if (i4 >= i3) {
                        wVar.mo4030a(-i2, z);
                    } else if (i4 >= i) {
                        wVar.mo4027a(8);
                        mo3991e(size);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3970a(C0748a aVar, C0748a aVar2, boolean z) {
            mo3967a();
            mo3987d().mo3957a(aVar, aVar2, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3971a(C0767o oVar) {
            C0767o oVar2 = this.f3058g;
            if (oVar2 != null) {
                oVar2.mo3960b();
            }
            this.f3058g = oVar;
            if (oVar != null) {
                this.f3058g.mo3956a(RecyclerView.this.getAdapter());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3972a(C0776u uVar) {
            this.f3059h = uVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3973a(C0778w wVar) {
            C0770q qVar = RecyclerView.this.f3000x;
            if (qVar != null) {
                qVar.mo3998a(wVar);
            }
            C0748a aVar = RecyclerView.this.f2996v;
            if (aVar != null) {
                aVar.mo348d(wVar);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f2989ra != null) {
                recyclerView.f2984p.mo4731h(wVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3974a(C0778w wVar, boolean z) {
            RecyclerView.m3928b(wVar);
            if (wVar.mo4035b(16384)) {
                wVar.mo4028a(0, 16384);
                C0487v.m2274a(wVar.f3093b, (C0459c) null);
            }
            if (z) {
                mo3973a(wVar);
            }
            wVar.f3110s = null;
            mo3987d().mo3958a(wVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3975a(View view) {
            C0778w i = RecyclerView.m3934i(view);
            C0769p unused = i.f3106o = null;
            boolean unused2 = i.f3107p = false;
            i.mo4036c();
            mo3980b(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0778w mo3976b(int i) {
            int size;
            int b;
            ArrayList<C0778w> arrayList = this.f3053b;
            if (!(arrayList == null || (size = arrayList.size()) == 0)) {
                int i2 = 0;
                int i3 = 0;
                while (i3 < size) {
                    C0778w wVar = this.f3053b.get(i3);
                    if (wVar.mo4058x() || wVar.mo4041h() != i) {
                        i3++;
                    } else {
                        wVar.mo4027a(32);
                        return wVar;
                    }
                }
                if (RecyclerView.this.f2996v.mo3797b() && (b = RecyclerView.this.f2980n.mo4530b(i)) > 0 && b < RecyclerView.this.f2996v.mo337a()) {
                    long a = RecyclerView.this.f2996v.mo338a(b);
                    while (i2 < size) {
                        C0778w wVar2 = this.f3053b.get(i2);
                        if (wVar2.mo4058x() || wVar2.mo4039f() != a) {
                            i2++;
                        } else {
                            wVar2.mo4027a(32);
                            return wVar2;
                        }
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public View mo3977b(int i, boolean z) {
            return mo3965a(i, z, Long.MAX_VALUE).f3093b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3978b() {
            int size = this.f3054c.size();
            for (int i = 0; i < size; i++) {
                this.f3054c.get(i).mo4026a();
            }
            int size2 = this.f3052a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f3052a.get(i2).mo4026a();
            }
            ArrayList<C0778w> arrayList = this.f3053b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.f3053b.get(i3).mo4026a();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3979b(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (i < i2) {
                i4 = i2;
                i3 = -1;
                i5 = i;
            } else {
                i4 = i;
                i3 = 1;
                i5 = i2;
            }
            int size = this.f3054c.size();
            for (int i7 = 0; i7 < size; i7++) {
                C0778w wVar = this.f3054c.get(i7);
                if (wVar != null && (i6 = wVar.f3095d) >= i5 && i6 <= i4) {
                    if (i6 == i) {
                        wVar.mo4030a(i2 - i, false);
                    } else {
                        wVar.mo4030a(i3, false);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3980b(C0778w wVar) {
            boolean z;
            boolean z2 = false;
            if (wVar.mo4049p() || wVar.f3093b.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(wVar.mo4049p());
                sb.append(" isAttached:");
                if (wVar.f3093b.getParent() != null) {
                    z2 = true;
                }
                sb.append(z2);
                sb.append(RecyclerView.this.mo3724j());
                throw new IllegalArgumentException(sb.toString());
            } else if (wVar.mo4050q()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + wVar + RecyclerView.this.mo3724j());
            } else if (!wVar.mo4056v()) {
                boolean d = wVar.mo11858z();
                C0748a aVar = RecyclerView.this.f2996v;
                if ((aVar != null && d && aVar.mo3792a(wVar)) || wVar.mo4047n()) {
                    if (this.f3057f <= 0 || wVar.mo4035b(526)) {
                        z = false;
                    } else {
                        int size = this.f3054c.size();
                        if (size >= this.f3057f && size > 0) {
                            mo3991e(0);
                            size--;
                        }
                        if (RecyclerView.f2928f && size > 0 && !RecyclerView.this.f2987qa.mo4620a(wVar.f3095d)) {
                            int i = size - 1;
                            while (i >= 0) {
                                if (!RecyclerView.this.f2987qa.mo4620a(this.f3054c.get(i).f3095d)) {
                                    break;
                                }
                                i--;
                            }
                            size = i + 1;
                        }
                        this.f3054c.add(size, wVar);
                        z = true;
                    }
                    if (!z) {
                        mo3974a(wVar, true);
                        z2 = true;
                    }
                } else {
                    z = false;
                }
                RecyclerView.this.f2984p.mo4731h(wVar);
                if (!z && !z2 && d) {
                    wVar.f3110s = null;
                }
            } else {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.mo3724j());
            }
        }

        /* renamed from: b */
        public void mo3981b(View view) {
            C0778w i = RecyclerView.m3934i(view);
            if (i.mo4050q()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (i.mo4049p()) {
                i.mo4057w();
            } else if (i.mo4058x()) {
                i.mo4036c();
            }
            mo3980b(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public View mo3982c(int i) {
            return this.f3052a.get(i).f3093b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo3983c() {
            this.f3052a.clear();
            ArrayList<C0778w> arrayList = this.f3053b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo3984c(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.f3054c.size() - 1; size >= 0; size--) {
                C0778w wVar = this.f3054c.get(size);
                if (wVar != null && (i3 = wVar.f3095d) >= i && i3 < i4) {
                    wVar.mo4027a(2);
                    mo3991e(size);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo3985c(C0778w wVar) {
            (wVar.f3107p ? this.f3053b : this.f3052a).remove(wVar);
            C0769p unused = wVar.f3106o = null;
            boolean unused2 = wVar.f3107p = false;
            wVar.mo4036c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo3986c(View view) {
            ArrayList<C0778w> arrayList;
            C0778w i = RecyclerView.m3934i(view);
            if (!i.mo4035b(12) && i.mo4051r() && !RecyclerView.this.mo3646a(i)) {
                if (this.f3053b == null) {
                    this.f3053b = new ArrayList<>();
                }
                i.mo4031a(this, true);
                arrayList = this.f3053b;
            } else if (!i.mo4046m() || i.mo4048o() || RecyclerView.this.f2996v.mo3797b()) {
                i.mo4031a(this, false);
                arrayList = this.f3052a;
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.mo3724j());
            }
            arrayList.add(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C0767o mo3987d() {
            if (this.f3058g == null) {
                this.f3058g = new C0767o();
            }
            return this.f3058g;
        }

        /* renamed from: d */
        public View mo3988d(int i) {
            return mo3977b(i, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo3989d(C0778w wVar) {
            if (wVar.mo4048o()) {
                return RecyclerView.this.f2989ra.mo4016d();
            }
            int i = wVar.f3095d;
            if (i < 0 || i >= RecyclerView.this.f2996v.mo337a()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + wVar + RecyclerView.this.mo3724j());
            } else if (!RecyclerView.this.f2989ra.mo4016d() && RecyclerView.this.f2996v.mo344b(wVar.f3095d) != wVar.mo4040g()) {
                return false;
            } else {
                if (RecyclerView.this.f2996v.mo3797b()) {
                    return wVar.mo4039f() == RecyclerView.this.f2996v.mo338a(wVar.f3095d);
                }
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public int mo3990e() {
            return this.f3052a.size();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo3991e(int i) {
            mo3974a(this.f3054c.get(i), true);
            this.f3054c.remove(i);
        }

        /* renamed from: f */
        public List<C0778w> mo3992f() {
            return this.f3055d;
        }

        /* renamed from: f */
        public void mo3993f(int i) {
            this.f3056e = i;
            mo3997j();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo3994g() {
            int size = this.f3054c.size();
            for (int i = 0; i < size; i++) {
                C0762j jVar = (C0762j) this.f3054c.get(i).f3093b.getLayoutParams();
                if (jVar != null) {
                    jVar.f3044c = true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo3995h() {
            int size = this.f3054c.size();
            for (int i = 0; i < size; i++) {
                C0778w wVar = this.f3054c.get(i);
                if (wVar != null) {
                    wVar.mo4027a(6);
                    wVar.mo4032a((Object) null);
                }
            }
            C0748a aVar = RecyclerView.this.f2996v;
            if (aVar == null || !aVar.mo3797b()) {
                mo3996i();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo3996i() {
            for (int size = this.f3054c.size() - 1; size >= 0; size--) {
                mo3991e(size);
            }
            this.f3054c.clear();
            if (RecyclerView.f2928f) {
                RecyclerView.this.f2987qa.mo4618a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo3997j() {
            C0759i iVar = RecyclerView.this.f2998w;
            this.f3057f = this.f3056e + (iVar != null ? iVar.f3032m : 0);
            for (int size = this.f3054c.size() - 1; size >= 0 && this.f3054c.size() > this.f3057f; size--) {
                mo3991e(size);
            }
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$q */
    public interface C0770q {
        /* renamed from: a */
        void mo3998a(C0778w wVar);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$r */
    private class C0771r extends C0750c {
        C0771r() {
        }

        /* renamed from: a */
        public void mo3809a() {
            RecyclerView.this.mo3641a((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f2989ra.f3074g = true;
            recyclerView.mo3658b(true);
            if (!RecyclerView.this.f2980n.mo4533c()) {
                RecyclerView.this.requestLayout();
            }
        }

        /* renamed from: a */
        public void mo3811a(int i, int i2, int i3) {
            RecyclerView.this.mo3641a((String) null);
            if (RecyclerView.this.f2980n.mo4528a(i, i2, i3)) {
                mo3999b();
            }
        }

        /* renamed from: a */
        public void mo3812a(int i, int i2, Object obj) {
            RecyclerView.this.mo3641a((String) null);
            if (RecyclerView.this.f2980n.mo4529a(i, i2, obj)) {
                mo3999b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3999b() {
            if (RecyclerView.f2927e) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f2937C && recyclerView.f2935B) {
                    C0487v.m2277a((View) recyclerView, recyclerView.f2988r);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.f2951K = true;
            recyclerView2.requestLayout();
        }

        /* renamed from: b */
        public void mo3813b(int i, int i2) {
            RecyclerView.this.mo3641a((String) null);
            if (RecyclerView.this.f2980n.mo4532b(i, i2)) {
                mo3999b();
            }
        }

        /* renamed from: c */
        public void mo3814c(int i, int i2) {
            RecyclerView.this.mo3641a((String) null);
            if (RecyclerView.this.f2980n.mo4535c(i, i2)) {
                mo3999b();
            }
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$s */
    public static abstract class C0772s {

        /* renamed from: a */
        private int f3062a;

        /* renamed from: b */
        private RecyclerView f3063b;

        /* renamed from: c */
        private boolean f3064c;

        /* renamed from: d */
        private boolean f3065d;

        /* renamed from: e */
        private View f3066e;

        /* renamed from: f */
        private final C0773a f3067f;

        /* renamed from: android.support.v7.widget.RecyclerView$s$a */
        public static class C0773a {
            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo4009a(RecyclerView recyclerView) {
                throw null;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public boolean mo4010a() {
                throw null;
            }
        }

        /* renamed from: android.support.v7.widget.RecyclerView$s$b */
        public interface C0774b {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m4300a(int i, int i2) {
            RecyclerView recyclerView = this.f3063b;
            if (!this.f3065d || this.f3062a == -1 || recyclerView == null) {
                mo4008d();
            }
            this.f3064c = false;
            View view = this.f3066e;
            if (view != null) {
                if (mo4001a(view) != this.f3062a) {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f3066e = null;
                } else {
                    mo4004a(this.f3066e, recyclerView.f2989ra, this.f3067f);
                    this.f3067f.mo4009a(recyclerView);
                    throw null;
                }
            }
            if (this.f3065d) {
                mo4003a(i, i2, recyclerView.f2989ra, this.f3067f);
                this.f3067f.mo4010a();
                throw null;
            }
        }

        /* renamed from: a */
        public abstract int mo4000a();

        /* renamed from: a */
        public abstract int mo4001a(View view);

        /* renamed from: a */
        public abstract void mo4002a(int i);

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo4003a(int i, int i2, C0775t tVar, C0773a aVar);

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo4004a(View view, C0775t tVar, C0773a aVar);

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract void mo4005b(View view);

        /* renamed from: b */
        public abstract boolean mo4006b();

        /* renamed from: c */
        public abstract boolean mo4007c();

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public final void mo4008d() {
            throw null;
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$t */
    public static class C0775t {

        /* renamed from: a */
        private int f3068a = -1;

        /* renamed from: b */
        private SparseArray<Object> f3069b;

        /* renamed from: c */
        int f3070c = 0;

        /* renamed from: d */
        int f3071d = 0;

        /* renamed from: e */
        int f3072e = 1;

        /* renamed from: f */
        int f3073f = 0;

        /* renamed from: g */
        boolean f3074g = false;

        /* renamed from: h */
        boolean f3075h = false;

        /* renamed from: i */
        boolean f3076i = false;

        /* renamed from: j */
        boolean f3077j = false;

        /* renamed from: k */
        boolean f3078k = false;

        /* renamed from: l */
        boolean f3079l = false;

        /* renamed from: m */
        int f3080m;

        /* renamed from: n */
        long f3081n;

        /* renamed from: o */
        int f3082o;

        /* renamed from: p */
        int f3083p;

        /* renamed from: q */
        int f3084q;

        /* renamed from: a */
        public int mo4011a() {
            return this.f3075h ? this.f3070c - this.f3071d : this.f3073f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4012a(int i) {
            if ((this.f3072e & i) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f3072e));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4013a(C0748a aVar) {
            this.f3072e = 1;
            this.f3073f = aVar.mo337a();
            this.f3075h = false;
            this.f3076i = false;
            this.f3077j = false;
        }

        /* renamed from: b */
        public int mo4014b() {
            return this.f3068a;
        }

        /* renamed from: c */
        public boolean mo4015c() {
            return this.f3068a != -1;
        }

        /* renamed from: d */
        public boolean mo4016d() {
            return this.f3075h;
        }

        /* renamed from: e */
        public boolean mo4017e() {
            return this.f3079l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f3068a + ", mData=" + this.f3069b + ", mItemCount=" + this.f3073f + ", mIsMeasuring=" + this.f3077j + ", mPreviousLayoutItemCount=" + this.f3070c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f3071d + ", mStructureChanged=" + this.f3074g + ", mInPreLayout=" + this.f3075h + ", mRunSimpleAnimations=" + this.f3078k + ", mRunPredictiveAnimations=" + this.f3079l + '}';
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$u */
    public static abstract class C0776u {
        /* renamed from: a */
        public abstract View mo4019a(C0769p pVar, int i, int i2);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$v */
    class C0777v implements Runnable {

        /* renamed from: a */
        private int f3085a;

        /* renamed from: b */
        private int f3086b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public OverScroller f3087c;

        /* renamed from: d */
        Interpolator f3088d = RecyclerView.f2932j;

        /* renamed from: e */
        private boolean f3089e = false;

        /* renamed from: f */
        private boolean f3090f = false;

        C0777v() {
            this.f3087c = new OverScroller(RecyclerView.this.getContext(), RecyclerView.f2932j);
        }

        /* renamed from: a */
        private float m4321a(float f) {
            return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
        }

        /* renamed from: a */
        private int m4322a(int i, int i2, int i3, int i4) {
            int i5;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt((double) ((i3 * i3) + (i4 * i4)));
            int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
            int width = z ? RecyclerView.this.getWidth() : RecyclerView.this.getHeight();
            int i6 = width / 2;
            float f = (float) width;
            float f2 = (float) i6;
            float a = f2 + (m4321a(Math.min(1.0f, (((float) sqrt2) * 1.0f) / f)) * f2);
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(a / ((float) sqrt)) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i5 = (int) (((((float) abs) / f) + 1.0f) * 300.0f);
            }
            return Math.min(i5, 2000);
        }

        /* renamed from: c */
        private void m4324c() {
            this.f3090f = false;
            this.f3089e = true;
        }

        /* renamed from: d */
        private void m4325d() {
            this.f3089e = false;
            if (this.f3090f) {
                mo4020a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4020a() {
            if (this.f3089e) {
                this.f3090f = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            C0487v.m2277a((View) RecyclerView.this, (Runnable) this);
        }

        /* renamed from: a */
        public void mo4021a(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.f3086b = 0;
            this.f3085a = 0;
            this.f3087c.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            mo4020a();
        }

        /* renamed from: a */
        public void mo4022a(int i, int i2, int i3, Interpolator interpolator) {
            if (this.f3088d != interpolator) {
                this.f3088d = interpolator;
                this.f3087c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            RecyclerView.this.setScrollState(2);
            this.f3086b = 0;
            this.f3085a = 0;
            this.f3087c.startScroll(0, 0, i, i2, i3);
            if (Build.VERSION.SDK_INT < 23) {
                this.f3087c.computeScrollOffset();
            }
            mo4020a();
        }

        /* renamed from: a */
        public void mo4023a(int i, int i2, Interpolator interpolator) {
            int a = m4322a(i, i2, 0, 0);
            if (interpolator == null) {
                interpolator = RecyclerView.f2932j;
            }
            mo4022a(i, i2, a, interpolator);
        }

        /* renamed from: b */
        public void mo4024b() {
            RecyclerView.this.removeCallbacks(this);
            this.f3087c.abortAnimation();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0120, code lost:
            if (r8 > 0) goto L_0x0124;
         */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x011c  */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x012c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r22 = this;
                r0 = r22
                android.support.v7.widget.RecyclerView r1 = android.support.p011v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$i r1 = r1.f2998w
                if (r1 != 0) goto L_0x000c
                r22.mo4024b()
                return
            L_0x000c:
                r22.m4324c()
                android.support.v7.widget.RecyclerView r1 = android.support.p011v7.widget.RecyclerView.this
                r1.mo3661c()
                android.widget.OverScroller r1 = r0.f3087c
                android.support.v7.widget.RecyclerView r2 = android.support.p011v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$i r2 = r2.f2998w
                android.support.v7.widget.RecyclerView$s r2 = r2.f3026g
                boolean r3 = r1.computeScrollOffset()
                r4 = 0
                if (r3 == 0) goto L_0x01c2
                android.support.v7.widget.RecyclerView r3 = android.support.p011v7.widget.RecyclerView.this
                int[] r3 = r3.f2940Da
                int r11 = r1.getCurrX()
                int r12 = r1.getCurrY()
                int r5 = r0.f3085a
                int r13 = r11 - r5
                int r5 = r0.f3086b
                int r14 = r12 - r5
                r0.f3085a = r11
                r0.f3086b = r12
                android.support.v7.widget.RecyclerView r5 = android.support.p011v7.widget.RecyclerView.this
                r9 = 0
                r10 = 1
                r6 = r13
                r7 = r14
                r8 = r3
                boolean r5 = r5.mo3645a((int) r6, (int) r7, (int[]) r8, (int[]) r9, (int) r10)
                r6 = 1
                if (r5 == 0) goto L_0x0051
                r5 = r3[r4]
                int r13 = r13 - r5
                r3 = r3[r6]
                int r14 = r14 - r3
            L_0x0051:
                android.support.v7.widget.RecyclerView r3 = android.support.p011v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$a r5 = r3.f2996v
                if (r5 == 0) goto L_0x00d1
                r3.mo3782x()
                android.support.v7.widget.RecyclerView r3 = android.support.p011v7.widget.RecyclerView.this
                r3.mo3748r()
                java.lang.String r3 = "RV Scroll"
                android.support.p007v4.p008os.C0417d.m1972a(r3)
                android.support.v7.widget.RecyclerView r3 = android.support.p011v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$t r5 = r3.f2989ra
                r3.mo3637a((android.support.p011v7.widget.RecyclerView.C0775t) r5)
                if (r13 == 0) goto L_0x007c
                android.support.v7.widget.RecyclerView r3 = android.support.p011v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$i r5 = r3.f2998w
                android.support.v7.widget.RecyclerView$p r7 = r3.f2976l
                android.support.v7.widget.RecyclerView$t r3 = r3.f2989ra
                int r3 = r5.mo3368a((int) r13, (android.support.p011v7.widget.RecyclerView.C0769p) r7, (android.support.p011v7.widget.RecyclerView.C0775t) r3)
                int r5 = r13 - r3
                goto L_0x007e
            L_0x007c:
                r3 = r4
                r5 = r3
            L_0x007e:
                if (r14 == 0) goto L_0x008f
                android.support.v7.widget.RecyclerView r7 = android.support.p011v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$i r8 = r7.f2998w
                android.support.v7.widget.RecyclerView$p r9 = r7.f2976l
                android.support.v7.widget.RecyclerView$t r7 = r7.f2989ra
                int r7 = r8.mo3384b((int) r14, (android.support.p011v7.widget.RecyclerView.C0769p) r9, (android.support.p011v7.widget.RecyclerView.C0775t) r7)
                int r8 = r14 - r7
                goto L_0x0091
            L_0x008f:
                r7 = r4
                r8 = r7
            L_0x0091:
                android.support.p007v4.p008os.C0417d.m1971a()
                android.support.v7.widget.RecyclerView r9 = android.support.p011v7.widget.RecyclerView.this
                r9.mo3780v()
                android.support.v7.widget.RecyclerView r9 = android.support.p011v7.widget.RecyclerView.this
                r9.mo3754s()
                android.support.v7.widget.RecyclerView r9 = android.support.p011v7.widget.RecyclerView.this
                r9.mo3663c((boolean) r4)
                if (r2 == 0) goto L_0x00d5
                boolean r9 = r2.mo4006b()
                if (r9 != 0) goto L_0x00d5
                boolean r9 = r2.mo4007c()
                if (r9 == 0) goto L_0x00d5
                android.support.v7.widget.RecyclerView r9 = android.support.p011v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$t r9 = r9.f2989ra
                int r9 = r9.mo4011a()
                if (r9 != 0) goto L_0x00bf
                r2.mo4008d()
                goto L_0x00d5
            L_0x00bf:
                int r10 = r2.mo4000a()
                if (r10 < r9) goto L_0x00c9
                int r9 = r9 - r6
                r2.mo4002a((int) r9)
            L_0x00c9:
                int r9 = r13 - r5
                int r10 = r14 - r8
                r2.m4300a(r9, r10)
                goto L_0x00d5
            L_0x00d1:
                r3 = r4
                r5 = r3
                r7 = r5
                r8 = r7
            L_0x00d5:
                android.support.v7.widget.RecyclerView r9 = android.support.p011v7.widget.RecyclerView.this
                java.util.ArrayList<android.support.v7.widget.RecyclerView$h> r9 = r9.f3002y
                boolean r9 = r9.isEmpty()
                if (r9 != 0) goto L_0x00e4
                android.support.v7.widget.RecyclerView r9 = android.support.p011v7.widget.RecyclerView.this
                r9.invalidate()
            L_0x00e4:
                android.support.v7.widget.RecyclerView r9 = android.support.p011v7.widget.RecyclerView.this
                int r9 = r9.getOverScrollMode()
                r10 = 2
                if (r9 == r10) goto L_0x00f2
                android.support.v7.widget.RecyclerView r9 = android.support.p011v7.widget.RecyclerView.this
                r9.mo3652b(r13, r14)
            L_0x00f2:
                android.support.v7.widget.RecyclerView r15 = android.support.p011v7.widget.RecyclerView.this
                r20 = 0
                r21 = 1
                r16 = r3
                r17 = r7
                r18 = r5
                r19 = r8
                boolean r9 = r15.mo3643a((int) r16, (int) r17, (int) r18, (int) r19, (int[]) r20, (int) r21)
                if (r9 != 0) goto L_0x0148
                if (r5 != 0) goto L_0x010a
                if (r8 == 0) goto L_0x0148
            L_0x010a:
                float r9 = r1.getCurrVelocity()
                int r9 = (int) r9
                if (r5 == r11) goto L_0x0119
                if (r5 >= 0) goto L_0x0115
                int r15 = -r9
                goto L_0x011a
            L_0x0115:
                if (r5 <= 0) goto L_0x0119
                r15 = r9
                goto L_0x011a
            L_0x0119:
                r15 = r4
            L_0x011a:
                if (r8 == r12) goto L_0x0123
                if (r8 >= 0) goto L_0x0120
                int r9 = -r9
                goto L_0x0124
            L_0x0120:
                if (r8 <= 0) goto L_0x0123
                goto L_0x0124
            L_0x0123:
                r9 = r4
            L_0x0124:
                android.support.v7.widget.RecyclerView r4 = android.support.p011v7.widget.RecyclerView.this
                int r4 = r4.getOverScrollMode()
                if (r4 == r10) goto L_0x0131
                android.support.v7.widget.RecyclerView r4 = android.support.p011v7.widget.RecyclerView.this
                r4.mo3628a((int) r15, (int) r9)
            L_0x0131:
                if (r15 != 0) goto L_0x013b
                if (r5 == r11) goto L_0x013b
                int r4 = r1.getFinalX()
                if (r4 != 0) goto L_0x0148
            L_0x013b:
                if (r9 != 0) goto L_0x0145
                if (r8 == r12) goto L_0x0145
                int r4 = r1.getFinalY()
                if (r4 != 0) goto L_0x0148
            L_0x0145:
                r1.abortAnimation()
            L_0x0148:
                if (r3 != 0) goto L_0x014c
                if (r7 == 0) goto L_0x0151
            L_0x014c:
                android.support.v7.widget.RecyclerView r4 = android.support.p011v7.widget.RecyclerView.this
                r4.mo3676d(r3, r7)
            L_0x0151:
                android.support.v7.widget.RecyclerView r4 = android.support.p011v7.widget.RecyclerView.this
                boolean r4 = r4.awakenScrollBars()
                if (r4 != 0) goto L_0x015e
                android.support.v7.widget.RecyclerView r4 = android.support.p011v7.widget.RecyclerView.this
                r4.invalidate()
            L_0x015e:
                if (r14 == 0) goto L_0x016e
                android.support.v7.widget.RecyclerView r4 = android.support.p011v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$i r4 = r4.f2998w
                boolean r4 = r4.mo3513b()
                if (r4 == 0) goto L_0x016e
                if (r7 != r14) goto L_0x016e
                r4 = r6
                goto L_0x016f
            L_0x016e:
                r4 = 0
            L_0x016f:
                if (r13 == 0) goto L_0x017f
                android.support.v7.widget.RecyclerView r5 = android.support.p011v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$i r5 = r5.f2998w
                boolean r5 = r5.mo3509a()
                if (r5 == 0) goto L_0x017f
                if (r3 != r13) goto L_0x017f
                r3 = r6
                goto L_0x0180
            L_0x017f:
                r3 = 0
            L_0x0180:
                if (r13 != 0) goto L_0x0184
                if (r14 == 0) goto L_0x018b
            L_0x0184:
                if (r3 != 0) goto L_0x018b
                if (r4 == 0) goto L_0x0189
                goto L_0x018b
            L_0x0189:
                r3 = 0
                goto L_0x018c
            L_0x018b:
                r3 = r6
            L_0x018c:
                boolean r1 = r1.isFinished()
                if (r1 != 0) goto L_0x01aa
                if (r3 != 0) goto L_0x019d
                android.support.v7.widget.RecyclerView r1 = android.support.p011v7.widget.RecyclerView.this
                boolean r1 = r1.mo3664c((int) r6)
                if (r1 != 0) goto L_0x019d
                goto L_0x01aa
            L_0x019d:
                r22.mo4020a()
                android.support.v7.widget.RecyclerView r1 = android.support.p011v7.widget.RecyclerView.this
                android.support.v7.widget.oa r3 = r1.f2985pa
                if (r3 == 0) goto L_0x01c2
                r3.mo4615a((android.support.p011v7.widget.RecyclerView) r1, (int) r13, (int) r14)
                goto L_0x01c2
            L_0x01aa:
                android.support.v7.widget.RecyclerView r1 = android.support.p011v7.widget.RecyclerView.this
                r3 = 0
                r1.setScrollState(r3)
                boolean r1 = android.support.p011v7.widget.RecyclerView.f2928f
                if (r1 == 0) goto L_0x01bd
                android.support.v7.widget.RecyclerView r1 = android.support.p011v7.widget.RecyclerView.this
                android.support.v7.widget.oa$a r1 = r1.f2987qa
                r1.mo4618a()
            L_0x01bd:
                android.support.v7.widget.RecyclerView r1 = android.support.p011v7.widget.RecyclerView.this
                r1.mo3695g((int) r6)
            L_0x01c2:
                if (r2 == 0) goto L_0x01d5
                boolean r1 = r2.mo4006b()
                if (r1 == 0) goto L_0x01ce
                r1 = 0
                r2.m4300a(r1, r1)
            L_0x01ce:
                boolean r1 = r0.f3090f
                if (r1 != 0) goto L_0x01d5
                r2.mo4008d()
            L_0x01d5:
                r22.m4325d()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.RecyclerView.C0777v.run():void");
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$w */
    public static abstract class C0778w {

        /* renamed from: a */
        private static final List<Object> f3092a = Collections.EMPTY_LIST;

        /* renamed from: b */
        public final View f3093b;

        /* renamed from: c */
        WeakReference<RecyclerView> f3094c;

        /* renamed from: d */
        int f3095d = -1;

        /* renamed from: e */
        int f3096e = -1;

        /* renamed from: f */
        long f3097f = -1;

        /* renamed from: g */
        int f3098g = -1;

        /* renamed from: h */
        int f3099h = -1;

        /* renamed from: i */
        C0778w f3100i = null;

        /* renamed from: j */
        C0778w f3101j = null;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public int f3102k;

        /* renamed from: l */
        List<Object> f3103l = null;

        /* renamed from: m */
        List<Object> f3104m = null;

        /* renamed from: n */
        private int f3105n = 0;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public C0769p f3106o = null;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public boolean f3107p = false;

        /* renamed from: q */
        private int f3108q = 0;

        /* renamed from: r */
        int f3109r = -1;

        /* renamed from: s */
        RecyclerView f3110s;

        public C0778w(View view) {
            if (view != null) {
                this.f3093b = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        /* access modifiers changed from: private */
        /* renamed from: A */
        public boolean m4331A() {
            return (this.f3102k & 16) != 0;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m4334a(RecyclerView recyclerView) {
            int i = this.f3109r;
            if (i == -1) {
                i = C0487v.m2292h(this.f3093b);
            }
            this.f3108q = i;
            recyclerView.mo3647a(this, 4);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m4338b(RecyclerView recyclerView) {
            recyclerView.mo3647a(this, this.f3108q);
            this.f3108q = 0;
        }

        /* renamed from: y */
        private void mo11857y() {
            if (this.f3103l == null) {
                this.f3103l = new ArrayList();
                this.f3104m = Collections.unmodifiableList(this.f3103l);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: z */
        public boolean mo11858z() {
            return (this.f3102k & 16) == 0 && C0487v.m2307w(this.f3093b);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4026a() {
            this.f3096e = -1;
            this.f3099h = -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4027a(int i) {
            this.f3102k = i | this.f3102k;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4028a(int i, int i2) {
            this.f3102k = (i & i2) | (this.f3102k & (~i2));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4029a(int i, int i2, boolean z) {
            mo4027a(8);
            mo4030a(i2, z);
            this.f3095d = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4030a(int i, boolean z) {
            if (this.f3096e == -1) {
                this.f3096e = this.f3095d;
            }
            if (this.f3099h == -1) {
                this.f3099h = this.f3095d;
            }
            if (z) {
                this.f3099h += i;
            }
            this.f3095d += i;
            if (this.f3093b.getLayoutParams() != null) {
                ((C0762j) this.f3093b.getLayoutParams()).f3044c = true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4031a(C0769p pVar, boolean z) {
            this.f3106o = pVar;
            this.f3107p = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4032a(Object obj) {
            if (obj == null) {
                mo4027a(1024);
            } else if ((1024 & this.f3102k) == 0) {
                mo11857y();
                this.f3103l.add(obj);
            }
        }

        /* renamed from: a */
        public final void mo4033a(boolean z) {
            int i;
            this.f3105n = z ? this.f3105n - 1 : this.f3105n + 1;
            int i2 = this.f3105n;
            if (i2 < 0) {
                this.f3105n = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z && i2 == 1) {
                i = this.f3102k | 16;
            } else if (z && this.f3105n == 0) {
                i = this.f3102k & -17;
            } else {
                return;
            }
            this.f3102k = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4034b() {
            List<Object> list = this.f3103l;
            if (list != null) {
                list.clear();
            }
            this.f3102k &= -1025;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo4035b(int i) {
            return (i & this.f3102k) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4036c() {
            this.f3102k &= -33;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4037d() {
            this.f3102k &= -257;
        }

        /* renamed from: e */
        public final int mo4038e() {
            RecyclerView recyclerView = this.f3110s;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.mo3659c(this);
        }

        /* renamed from: f */
        public final long mo4039f() {
            return this.f3097f;
        }

        /* renamed from: g */
        public final int mo4040g() {
            return this.f3098g;
        }

        /* renamed from: h */
        public final int mo4041h() {
            int i = this.f3099h;
            return i == -1 ? this.f3095d : i;
        }

        /* renamed from: i */
        public final int mo4042i() {
            return this.f3096e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public List<Object> mo4043j() {
            if ((this.f3102k & 1024) != 0) {
                return f3092a;
            }
            List<Object> list = this.f3103l;
            return (list == null || list.size() == 0) ? f3092a : this.f3104m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo4044k() {
            return (this.f3102k & 512) != 0 || mo4046m();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public boolean mo4045l() {
            return (this.f3102k & 1) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public boolean mo4046m() {
            return (this.f3102k & 4) != 0;
        }

        /* renamed from: n */
        public final boolean mo4047n() {
            return (this.f3102k & 16) == 0 && !C0487v.m2307w(this.f3093b);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public boolean mo4048o() {
            return (this.f3102k & 8) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public boolean mo4049p() {
            return this.f3106o != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public boolean mo4050q() {
            return (this.f3102k & 256) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public boolean mo4051r() {
            return (this.f3102k & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public boolean mo4052s() {
            return (this.f3102k & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public void mo4053t() {
            this.f3102k = 0;
            this.f3095d = -1;
            this.f3096e = -1;
            this.f3097f = -1;
            this.f3099h = -1;
            this.f3105n = 0;
            this.f3100i = null;
            this.f3101j = null;
            mo4034b();
            this.f3108q = 0;
            this.f3109r = -1;
            RecyclerView.m3928b(this);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f3095d + " id=" + this.f3097f + ", oldPos=" + this.f3096e + ", pLpos:" + this.f3099h);
            if (mo4049p()) {
                sb.append(" scrap ");
                sb.append(this.f3107p ? "[changeScrap]" : "[attachedScrap]");
            }
            if (mo4046m()) {
                sb.append(" invalid");
            }
            if (!mo4045l()) {
                sb.append(" unbound");
            }
            if (mo4052s()) {
                sb.append(" update");
            }
            if (mo4048o()) {
                sb.append(" removed");
            }
            if (mo4056v()) {
                sb.append(" ignored");
            }
            if (mo4050q()) {
                sb.append(" tmpDetached");
            }
            if (!mo4047n()) {
                sb.append(" not recyclable(" + this.f3105n + ")");
            }
            if (mo4044k()) {
                sb.append(" undefined adapter position");
            }
            if (this.f3093b.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public void mo4055u() {
            if (this.f3096e == -1) {
                this.f3096e = this.f3095d;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public boolean mo4056v() {
            return (this.f3102k & 128) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public void mo4057w() {
            this.f3106o.mo3985c(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public boolean mo4058x() {
            return (this.f3102k & 32) != 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 0
            r3 = 16843830(0x1010436, float:2.369658E-38)
            r1[r2] = r3
            f2923a = r1
            int[] r1 = new int[r0]
            r3 = 16842987(0x10100eb, float:2.3694217E-38)
            r1[r2] = r3
            f2924b = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 18
            if (r1 == r3) goto L_0x0025
            r3 = 19
            if (r1 == r3) goto L_0x0025
            r3 = 20
            if (r1 != r3) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r1 = r2
            goto L_0x0026
        L_0x0025:
            r1 = r0
        L_0x0026:
            f2925c = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r1 < r3) goto L_0x0030
            r1 = r0
            goto L_0x0031
        L_0x0030:
            r1 = r2
        L_0x0031:
            f2926d = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 16
            if (r1 < r3) goto L_0x003b
            r1 = r0
            goto L_0x003c
        L_0x003b:
            r1 = r2
        L_0x003c:
            f2927e = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            if (r1 < r3) goto L_0x0046
            r1 = r0
            goto L_0x0047
        L_0x0046:
            r1 = r2
        L_0x0047:
            f2928f = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 15
            if (r1 > r3) goto L_0x0051
            r1 = r0
            goto L_0x0052
        L_0x0051:
            r1 = r2
        L_0x0052:
            f2929g = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 > r3) goto L_0x005a
            r1 = r0
            goto L_0x005b
        L_0x005a:
            r1 = r2
        L_0x005b:
            f2930h = r1
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r1[r2] = r3
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r1[r0] = r2
            r0 = 2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r0] = r2
            r0 = 3
            r1[r0] = r2
            f2931i = r1
            android.support.v7.widget.Da r0 = new android.support.v7.widget.Da
            r0.<init>()
            f2932j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.RecyclerView.<clinit>():void");
    }

    public RecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2974k = new C0771r();
        this.f2976l = new C0769p();
        this.f2984p = new C0892tb();
        this.f2988r = new C0704Ba(this);
        this.f2990s = new Rect();
        this.f2992t = new Rect();
        this.f2994u = new RectF();
        this.f3002y = new ArrayList<>();
        this.f3004z = new ArrayList<>();
        this.f2943F = 0;
        this.f2954N = false;
        this.f2955O = false;
        this.f2956P = 0;
        this.f2957Q = 0;
        this.f2958R = new C0752e();
        this.f2963W = new C0826ea();
        this.f2964aa = 0;
        this.f2965ba = -1;
        this.f2977la = Float.MIN_VALUE;
        this.f2979ma = Float.MIN_VALUE;
        boolean z = true;
        this.f2981na = true;
        this.f2983oa = new C0777v();
        this.f2987qa = f2928f ? new C0867oa.C0868a() : null;
        this.f2989ra = new C0775t();
        this.f2995ua = false;
        this.f2997va = false;
        this.f2999wa = new C0757g();
        this.f3001xa = false;
        this.f2934Aa = new int[2];
        this.f2938Ca = new int[2];
        this.f2940Da = new int[2];
        this.f2942Ea = new int[2];
        this.f2944Fa = new ArrayList();
        this.f2946Ga = new C0706Ca(this);
        this.f2948Ha = new C0711Ea(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2924b, i, 0);
            this.f2986q = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.f2986q = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2971ha = viewConfiguration.getScaledTouchSlop();
        this.f2977la = C0499x.m2413a(viewConfiguration, context);
        this.f2979ma = C0499x.m2415b(viewConfiguration, context);
        this.f2973ja = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2975ka = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f2963W.mo3820a(this.f2999wa);
        mo3728l();
        m3903G();
        if (C0487v.m2292h(this) == 0) {
            C0487v.m2288d(this, 1);
        }
        this.f2952L = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C0726Ka(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C1123b.RecyclerView, i, 0);
            String string = obtainStyledAttributes2.getString(C1123b.RecyclerView_layoutManager);
            if (obtainStyledAttributes2.getInt(C1123b.RecyclerView_android_descendantFocusability, -1) == -1) {
                setDescendantFocusability(262144);
            }
            this.f2939D = obtainStyledAttributes2.getBoolean(C1123b.RecyclerView_fastScrollEnabled, false);
            if (this.f2939D) {
                mo3632a((StateListDrawable) obtainStyledAttributes2.getDrawable(C1123b.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes2.getDrawable(C1123b.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes2.getDrawable(C1123b.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes2.getDrawable(C1123b.RecyclerView_fastScrollHorizontalTrackDrawable));
            }
            obtainStyledAttributes2.recycle();
            m3915a(context, string, attributeSet, i, 0);
            if (Build.VERSION.SDK_INT >= 21) {
                TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f2923a, i, 0);
                boolean z2 = obtainStyledAttributes3.getBoolean(0, true);
                obtainStyledAttributes3.recycle();
                z = z2;
            }
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z);
    }

    /* renamed from: A */
    private void m3897A() {
        int i = this.f2950J;
        this.f2950J = 0;
        if (i != 0 && mo3732n()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            C0445a.m2085a(obtain, i);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    /* renamed from: B */
    private void m3898B() {
        boolean z = true;
        this.f2989ra.mo4012a(1);
        mo3637a(this.f2989ra);
        this.f2989ra.f3077j = false;
        mo3782x();
        this.f2984p.mo4717a();
        mo3748r();
        m3905I();
        m3910N();
        C0775t tVar = this.f2989ra;
        if (!tVar.f3078k || !this.f2997va) {
            z = false;
        }
        tVar.f3076i = z;
        this.f2997va = false;
        this.f2995ua = false;
        C0775t tVar2 = this.f2989ra;
        tVar2.f3075h = tVar2.f3079l;
        tVar2.f3073f = this.f2996v.mo337a();
        m3923a(this.f2934Aa);
        if (this.f2989ra.f3078k) {
            int a = this.f2982o.mo4242a();
            for (int i = 0; i < a; i++) {
                C0778w i2 = m3934i(this.f2982o.mo4251c(i));
                if (!i2.mo4056v() && (!i2.mo4046m() || this.f2996v.mo3797b())) {
                    this.f2984p.mo4725c(i2, this.f2963W.mo3818a(this.f2989ra, i2, C0753f.m4058a(i2), i2.mo4043j()));
                    if (this.f2989ra.f3076i && i2.mo4051r() && !i2.mo4048o() && !i2.mo4056v() && !i2.mo4046m()) {
                        this.f2984p.mo4718a(mo3672d(i2), i2);
                    }
                }
            }
        }
        if (this.f2989ra.f3079l) {
            mo3781w();
            C0775t tVar3 = this.f2989ra;
            boolean z2 = tVar3.f3074g;
            tVar3.f3074g = false;
            this.f2998w.mo3390e(this.f2976l, tVar3);
            this.f2989ra.f3074g = z2;
            for (int i3 = 0; i3 < this.f2982o.mo4242a(); i3++) {
                C0778w i4 = m3934i(this.f2982o.mo4251c(i3));
                if (!i4.mo4056v() && !this.f2984p.mo4726c(i4)) {
                    int a2 = C0753f.m4058a(i4);
                    boolean b = i4.mo4035b(8192);
                    if (!b) {
                        a2 |= SVGParser.ENTITY_WATCH_BUFFER_SIZE;
                    }
                    C0753f.C0756c a3 = this.f2963W.mo3818a(this.f2989ra, i4, a2, i4.mo4043j());
                    if (b) {
                        mo3638a(i4, a3);
                    } else {
                        this.f2984p.mo4720a(i4, a3);
                    }
                }
            }
        }
        mo3651b();
        mo3754s();
        mo3663c(false);
        this.f2989ra.f3072e = 2;
    }

    /* renamed from: C */
    private void m3899C() {
        mo3782x();
        mo3748r();
        this.f2989ra.mo4012a(6);
        this.f2980n.mo4531b();
        this.f2989ra.f3073f = this.f2996v.mo337a();
        C0775t tVar = this.f2989ra;
        tVar.f3071d = 0;
        tVar.f3075h = false;
        this.f2998w.mo3390e(this.f2976l, tVar);
        C0775t tVar2 = this.f2989ra;
        tVar2.f3074g = false;
        this.f2978m = null;
        tVar2.f3078k = tVar2.f3078k && this.f2963W != null;
        this.f2989ra.f3072e = 4;
        mo3754s();
        mo3663c(false);
    }

    /* renamed from: D */
    private void m3900D() {
        this.f2989ra.mo4012a(4);
        mo3782x();
        mo3748r();
        C0775t tVar = this.f2989ra;
        tVar.f3072e = 1;
        if (tVar.f3078k) {
            for (int a = this.f2982o.mo4242a() - 1; a >= 0; a--) {
                C0778w i = m3934i(this.f2982o.mo4251c(a));
                if (!i.mo4056v()) {
                    long d = mo3672d(i);
                    C0753f.C0756c a2 = this.f2963W.mo3817a(this.f2989ra, i);
                    C0778w a3 = this.f2984p.mo4716a(d);
                    if (a3 != null && !a3.mo4056v()) {
                        boolean b = this.f2984p.mo4724b(a3);
                        boolean b2 = this.f2984p.mo4724b(i);
                        if (!b || a3 != i) {
                            C0753f.C0756c f = this.f2984p.mo4729f(a3);
                            this.f2984p.mo4723b(i, a2);
                            C0753f.C0756c e = this.f2984p.mo4728e(i);
                            if (f == null) {
                                m3914a(d, i, a3);
                            } else {
                                m3917a(a3, i, f, e, b, b2);
                            }
                        }
                    }
                    this.f2984p.mo4723b(i, a2);
                }
            }
            this.f2984p.mo4721a(this.f2948Ha);
        }
        this.f2998w.mo3893c(this.f2976l);
        C0775t tVar2 = this.f2989ra;
        tVar2.f3070c = tVar2.f3073f;
        this.f2954N = false;
        this.f2955O = false;
        tVar2.f3078k = false;
        tVar2.f3079l = false;
        this.f2998w.f3027h = false;
        ArrayList<C0778w> arrayList = this.f2976l.f3053b;
        if (arrayList != null) {
            arrayList.clear();
        }
        C0759i iVar = this.f2998w;
        if (iVar.f3033n) {
            iVar.f3032m = 0;
            iVar.f3033n = false;
            this.f2976l.mo3997j();
        }
        this.f2998w.mo3392g(this.f2989ra);
        mo3754s();
        mo3663c(false);
        this.f2984p.mo4717a();
        int[] iArr = this.f2934Aa;
        if (m3935k(iArr[0], iArr[1])) {
            mo3676d(0, 0);
        }
        m3906J();
        m3908L();
    }

    /* renamed from: E */
    private View m3901E() {
        C0778w b;
        int i = this.f2989ra.f3080m;
        if (i == -1) {
            i = 0;
        }
        int a = this.f2989ra.mo4011a();
        int i2 = i;
        while (i2 < a) {
            C0778w b2 = mo3650b(i2);
            if (b2 == null) {
                break;
            } else if (b2.f3093b.hasFocusable()) {
                return b2.f3093b;
            } else {
                i2++;
            }
        }
        int min = Math.min(a, i);
        while (true) {
            min--;
            if (min < 0 || (b = mo3650b(min)) == null) {
                return null;
            }
            if (b.f3093b.hasFocusable()) {
                return b.f3093b;
            }
        }
    }

    /* renamed from: F */
    private boolean m3902F() {
        int a = this.f2982o.mo4242a();
        for (int i = 0; i < a; i++) {
            C0778w i2 = m3934i(this.f2982o.mo4251c(i));
            if (i2 != null && !i2.mo4056v() && i2.mo4051r()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: G */
    private void m3903G() {
        this.f2982o = new C0789T(new C0713Fa(this));
    }

    /* renamed from: H */
    private boolean m3904H() {
        return this.f2963W != null && this.f2998w.mo3366D();
    }

    /* renamed from: I */
    private void m3905I() {
        if (this.f2954N) {
            this.f2980n.mo4538f();
            if (this.f2955O) {
                this.f2998w.mo3389d(this);
            }
        }
        if (m3904H()) {
            this.f2980n.mo4537e();
        } else {
            this.f2980n.mo4531b();
        }
        boolean z = false;
        boolean z2 = this.f2995ua || this.f2997va;
        this.f2989ra.f3078k = this.f2941E && this.f2963W != null && (this.f2954N || z2 || this.f2998w.f3027h) && (!this.f2954N || this.f2996v.mo3797b());
        C0775t tVar = this.f2989ra;
        if (tVar.f3078k && z2 && !this.f2954N && m3904H()) {
            z = true;
        }
        tVar.f3079l = z;
    }

    /* renamed from: J */
    private void m3906J() {
        View view;
        if (this.f2981na && this.f2996v != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!f2930h || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.f2982o.mo4253c(focusedChild)) {
                            return;
                        }
                    } else if (this.f2982o.mo4242a() == 0) {
                        requestFocus();
                        return;
                    }
                }
                View view2 = null;
                C0778w a = (this.f2989ra.f3081n == -1 || !this.f2996v.mo3797b()) ? null : mo3626a(this.f2989ra.f3081n);
                if (a != null && !this.f2982o.mo4253c(a.f3093b) && a.f3093b.hasFocusable()) {
                    view2 = a.f3093b;
                } else if (this.f2982o.mo4242a() > 0) {
                    view2 = m3901E();
                }
                if (view2 != null) {
                    int i = this.f2989ra.f3082o;
                    if (((long) i) == -1 || (view = view2.findViewById(i)) == null || !view.isFocusable()) {
                        view = view2;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    /* renamed from: K */
    private void m3907K() {
        boolean z;
        EdgeEffect edgeEffect = this.f2959S;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.f2959S.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f2960T;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.f2960T.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2961U;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.f2961U.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2962V;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.f2962V.isFinished();
        }
        if (z) {
            C0487v.m2261B(this);
        }
    }

    /* renamed from: L */
    private void m3908L() {
        C0775t tVar = this.f2989ra;
        tVar.f3081n = -1;
        tVar.f3080m = -1;
        tVar.f3082o = -1;
    }

    /* renamed from: M */
    private void m3909M() {
        VelocityTracker velocityTracker = this.f2966ca;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        mo3695g(0);
        m3907K();
    }

    /* renamed from: N */
    private void m3910N() {
        C0778w wVar = null;
        View focusedChild = (!this.f2981na || !hasFocus() || this.f2996v == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            wVar = mo3673d(focusedChild);
        }
        if (wVar == null) {
            m3908L();
            return;
        }
        this.f2989ra.f3081n = this.f2996v.mo3797b() ? wVar.mo4039f() : -1;
        this.f2989ra.f3080m = this.f2954N ? -1 : wVar.mo4048o() ? wVar.f3096e : wVar.mo4038e();
        this.f2989ra.f3082o = m3936n(wVar.f3093b);
    }

    /* renamed from: O */
    private void m3911O() {
        this.f2983oa.mo4024b();
        C0759i iVar = this.f2998w;
        if (iVar != null) {
            iVar.mo3849C();
        }
    }

    /* renamed from: a */
    private String m3912a(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3913a(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L_0x0021
            r6.mo3694g()
            android.widget.EdgeEffect r1 = r6.f2959S
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
        L_0x001c:
            android.support.p007v4.widget.C0555n.m2739a(r1, r4, r9)
            r9 = r3
            goto L_0x0039
        L_0x0021:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x0038
            r6.mo3717h()
            android.widget.EdgeEffect r1 = r6.f2961U
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            goto L_0x001c
        L_0x0038:
            r9 = 0
        L_0x0039:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L_0x0053
            r6.mo3720i()
            android.widget.EdgeEffect r9 = r6.f2960T
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            android.support.p007v4.widget.C0555n.m2739a(r9, r1, r7)
            goto L_0x006f
        L_0x0053:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x006e
            r6.mo3689f()
            android.widget.EdgeEffect r9 = r6.f2962V
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            android.support.p007v4.widget.C0555n.m2739a(r9, r1, r2)
            goto L_0x006f
        L_0x006e:
            r3 = r9
        L_0x006f:
            if (r3 != 0) goto L_0x0079
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L_0x0079
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x007c
        L_0x0079:
            android.support.p007v4.view.C0487v.m2261B(r6)
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.RecyclerView.m3913a(float, float, float, float):void");
    }

    /* renamed from: a */
    private void m3914a(long j, C0778w wVar, C0778w wVar2) {
        int a = this.f2982o.mo4242a();
        for (int i = 0; i < a; i++) {
            C0778w i2 = m3934i(this.f2982o.mo4251c(i));
            if (i2 != wVar && mo3672d(i2) == j) {
                C0748a aVar = this.f2996v;
                if (aVar == null || !aVar.mo3797b()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + i2 + " \n View Holder 2:" + wVar + mo3724j());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + i2 + " \n View Holder 2:" + wVar + mo3724j());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + wVar2 + " cannot be found but it is necessary for " + wVar + mo3724j());
    }

    /* renamed from: a */
    private void m3915a(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        Constructor<? extends U> constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String a = m3912a(context, trim);
                try {
                    Class<? extends U> asSubclass = (isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).loadClass(a).asSubclass(C0759i.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(f2931i);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                    } catch (NoSuchMethodException e) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((C0759i) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e2) {
                    e2.initCause(e);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + a, e2);
                } catch (ClassNotFoundException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + a, e3);
                } catch (InvocationTargetException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + a, e4);
                } catch (InstantiationException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + a, e5);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + a, e6);
                } catch (ClassCastException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + a, e7);
                }
            }
        }
    }

    /* renamed from: a */
    private void m3916a(C0748a aVar, boolean z, boolean z2) {
        C0748a aVar2 = this.f2996v;
        if (aVar2 != null) {
            aVar2.mo3794b((C0750c) this.f2974k);
            this.f2996v.mo3796b(this);
        }
        if (!z || z2) {
            mo3779u();
        }
        this.f2980n.mo4538f();
        C0748a aVar3 = this.f2996v;
        this.f2996v = aVar;
        if (aVar != null) {
            aVar.mo3788a((C0750c) this.f2974k);
            aVar.mo3791a(this);
        }
        C0759i iVar = this.f2998w;
        if (iVar != null) {
            iVar.mo3854a(aVar3, this.f2996v);
        }
        this.f2976l.mo3970a(aVar3, this.f2996v, z);
        this.f2989ra.f3074g = true;
    }

    /* renamed from: a */
    private void m3917a(C0778w wVar, C0778w wVar2, C0753f.C0756c cVar, C0753f.C0756c cVar2, boolean z, boolean z2) {
        wVar.mo4033a(false);
        if (z) {
            m3933e(wVar);
        }
        if (wVar != wVar2) {
            if (z2) {
                m3933e(wVar2);
            }
            wVar.f3100i = wVar2;
            m3933e(wVar);
            this.f2976l.mo3985c(wVar);
            wVar2.mo4033a(false);
            wVar2.f3101j = wVar;
        }
        if (this.f2963W.mo3822a(wVar, wVar2, cVar, cVar2)) {
            mo3778t();
        }
    }

    /* renamed from: a */
    static void m3921a(View view, Rect rect) {
        C0762j jVar = (C0762j) view.getLayoutParams();
        Rect rect2 = jVar.f3043b;
        rect.set((view.getLeft() - rect2.left) - jVar.leftMargin, (view.getTop() - rect2.top) - jVar.topMargin, view.getRight() + rect2.right + jVar.rightMargin, view.getBottom() + rect2.bottom + jVar.bottomMargin);
    }

    /* renamed from: a */
    private void m3922a(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f2990s.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0762j) {
            C0762j jVar = (C0762j) layoutParams;
            if (!jVar.f3044c) {
                Rect rect = jVar.f3043b;
                Rect rect2 = this.f2990s;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f2990s);
            offsetRectIntoDescendantCoords(view, this.f2990s);
        }
        this.f2998w.mo3875a(this, view, this.f2990s, !this.f2941E, view2 == null);
    }

    /* renamed from: a */
    private void m3923a(int[] iArr) {
        int a = this.f2982o.mo4242a();
        if (a == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < a; i3++) {
            C0778w i4 = m3934i(this.f2982o.mo4251c(i3));
            if (!i4.mo4056v()) {
                int h = i4.mo4041h();
                if (h < i2) {
                    i2 = h;
                }
                if (h > i) {
                    i = h;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i;
    }

    /* renamed from: a */
    private boolean m3925a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        C0765m mVar = this.f2933A;
        if (mVar != null) {
            if (action == 0) {
                this.f2933A = null;
            } else {
                mVar.mo3947a(this, motionEvent);
                if (action == 3 || action == 1) {
                    this.f2933A = null;
                }
                return true;
            }
        }
        if (action != 0) {
            int size = this.f3004z.size();
            for (int i = 0; i < size; i++) {
                C0765m mVar2 = this.f3004z.get(i);
                if (mVar2.mo3949b(this, motionEvent)) {
                    this.f2933A = mVar2;
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m3926a(View view, View view2, int i) {
        int i2;
        if (view2 == null || view2 == this || mo3660c(view2) == null) {
            return false;
        }
        if (view == null || mo3660c(view) == null) {
            return true;
        }
        this.f2990s.set(0, 0, view.getWidth(), view.getHeight());
        this.f2992t.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f2990s);
        offsetDescendantRectToMyCoords(view2, this.f2992t);
        char c = 65535;
        int i3 = this.f2998w.mo3920k() == 1 ? -1 : 1;
        Rect rect = this.f2990s;
        int i4 = rect.left;
        int i5 = this.f2992t.left;
        if ((i4 < i5 || rect.right <= i5) && this.f2990s.right < this.f2992t.right) {
            i2 = 1;
        } else {
            Rect rect2 = this.f2990s;
            int i6 = rect2.right;
            int i7 = this.f2992t.right;
            i2 = ((i6 > i7 || rect2.left >= i7) && this.f2990s.left > this.f2992t.left) ? -1 : 0;
        }
        Rect rect3 = this.f2990s;
        int i8 = rect3.top;
        int i9 = this.f2992t.top;
        if ((i8 < i9 || rect3.bottom <= i9) && this.f2990s.bottom < this.f2992t.bottom) {
            c = 1;
        } else {
            Rect rect4 = this.f2990s;
            int i10 = rect4.bottom;
            int i11 = this.f2992t.bottom;
            if ((i10 <= i11 && rect4.top < i11) || this.f2990s.top <= this.f2992t.top) {
                c = 0;
            }
        }
        if (i == 1) {
            return c < 0 || (c == 0 && i2 * i3 <= 0);
        }
        if (i == 2) {
            return c > 0 || (c == 0 && i2 * i3 >= 0);
        }
        if (i == 17) {
            return i2 < 0;
        }
        if (i == 33) {
            return c < 0;
        }
        if (i == 66) {
            return i2 > 0;
        }
        if (i == 130) {
            return c > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i + mo3724j());
    }

    /* renamed from: b */
    static void m3928b(C0778w wVar) {
        WeakReference<RecyclerView> weakReference = wVar.f3094c;
        if (weakReference != null) {
            Object obj = weakReference.get();
            while (true) {
                View view = (View) obj;
                while (true) {
                    if (view == null) {
                        wVar.f3094c = null;
                        return;
                    } else if (view != wVar.f3093b) {
                        obj = view.getParent();
                        if (!(obj instanceof View)) {
                            view = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private boolean m3930b(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.f2933A = null;
        }
        int size = this.f3004z.size();
        int i = 0;
        while (i < size) {
            C0765m mVar = this.f3004z.get(i);
            if (!mVar.mo3949b(this, motionEvent) || action == 3) {
                i++;
            } else {
                this.f2933A = mVar;
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private void m3931c(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2965ba) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f2965ba = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f2969fa = x;
            this.f2967da = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f2970ga = y;
            this.f2968ea = y;
        }
    }

    /* renamed from: e */
    static RecyclerView m3932e(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView e = m3932e(viewGroup.getChildAt(i));
            if (e != null) {
                return e;
            }
        }
        return null;
    }

    /* renamed from: e */
    private void m3933e(C0778w wVar) {
        View view = wVar.f3093b;
        boolean z = view.getParent() == this;
        this.f2976l.mo3985c(mo3716h(view));
        if (wVar.mo4050q()) {
            this.f2982o.mo4245a(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.f2982o.mo4247a(view, true);
        } else {
            this.f2982o.mo4244a(view);
        }
    }

    private C0478m getScrollingChildHelper() {
        if (this.f2936Ba == null) {
            this.f2936Ba = new C0478m(this);
        }
        return this.f2936Ba;
    }

    /* renamed from: i */
    static C0778w m3934i(View view) {
        if (view == null) {
            return null;
        }
        return ((C0762j) view.getLayoutParams()).f3042a;
    }

    /* renamed from: k */
    private boolean m3935k(int i, int i2) {
        m3923a(this.f2934Aa);
        int[] iArr = this.f2934Aa;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    /* renamed from: n */
    private int m3936n(View view) {
        int id;
        loop0:
        while (true) {
            id = view.getId();
            while (true) {
                if (view.isFocused() || !(view instanceof ViewGroup) || !view.hasFocus()) {
                    return id;
                }
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                }
            }
        }
        return id;
    }

    /* renamed from: z */
    private void m3937z() {
        m3909M();
        setScrollState(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0778w mo3625a(int i, boolean z) {
        int b = this.f2982o.mo4248b();
        C0778w wVar = null;
        for (int i2 = 0; i2 < b; i2++) {
            C0778w i3 = m3934i(this.f2982o.mo4254d(i2));
            if (i3 != null && !i3.mo4048o()) {
                if (z) {
                    if (i3.f3095d != i) {
                        continue;
                    }
                } else if (i3.mo4041h() != i) {
                    continue;
                }
                if (!this.f2982o.mo4253c(i3.f3093b)) {
                    return i3;
                }
                wVar = i3;
            }
        }
        return wVar;
    }

    /* renamed from: a */
    public C0778w mo3626a(long j) {
        C0748a aVar = this.f2996v;
        C0778w wVar = null;
        if (aVar != null && aVar.mo3797b()) {
            int b = this.f2982o.mo4248b();
            for (int i = 0; i < b; i++) {
                C0778w i2 = m3934i(this.f2982o.mo4254d(i));
                if (i2 != null && !i2.mo4048o() && i2.mo4039f() == j) {
                    if (!this.f2982o.mo4253c(i2.f3093b)) {
                        return i2;
                    }
                    wVar = i2;
                }
            }
        }
        return wVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3627a(int i) {
        C0759i iVar = this.f2998w;
        if (iVar != null) {
            iVar.mo3908f(i);
        }
        mo3690f(i);
        C0766n nVar = this.f2991sa;
        if (nVar != null) {
            nVar.mo3950a(this, i);
        }
        List<C0766n> list = this.f2993ta;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f2993ta.get(size).mo3950a(this, i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3628a(int i, int i2) {
        if (i < 0) {
            mo3694g();
            this.f2959S.onAbsorb(-i);
        } else if (i > 0) {
            mo3717h();
            this.f2961U.onAbsorb(i);
        }
        if (i2 < 0) {
            mo3720i();
            this.f2960T.onAbsorb(-i2);
        } else if (i2 > 0) {
            mo3689f();
            this.f2962V.onAbsorb(i2);
        }
        if (i != 0 || i2 != 0) {
            C0487v.m2261B(this);
        }
    }

    /* renamed from: a */
    public void mo3629a(int i, int i2, Interpolator interpolator) {
        C0759i iVar = this.f2998w;
        if (iVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f2947H) {
            if (!iVar.mo3509a()) {
                i = 0;
            }
            if (!this.f2998w.mo3513b()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                this.f2983oa.mo4023a(i, i2, interpolator);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3630a(int i, int i2, Object obj) {
        int i3;
        int b = this.f2982o.mo4248b();
        int i4 = i + i2;
        for (int i5 = 0; i5 < b; i5++) {
            View d = this.f2982o.mo4254d(i5);
            C0778w i6 = m3934i(d);
            if (i6 != null && !i6.mo4056v() && (i3 = i6.f3095d) >= i && i3 < i4) {
                i6.mo4027a(2);
                i6.mo4032a(obj);
                ((C0762j) d.getLayoutParams()).f3044c = true;
            }
        }
        this.f2976l.mo3984c(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3631a(int i, int i2, boolean z) {
        int i3 = i + i2;
        int b = this.f2982o.mo4248b();
        for (int i4 = 0; i4 < b; i4++) {
            C0778w i5 = m3934i(this.f2982o.mo4254d(i4));
            if (i5 != null && !i5.mo4056v()) {
                int i6 = i5.f3095d;
                if (i6 >= i3) {
                    i5.mo4030a(-i2, z);
                } else if (i6 >= i) {
                    i5.mo4029a(i - 1, -i2, z);
                }
                this.f2989ra.f3074g = true;
            }
        }
        this.f2976l.mo3969a(i, i2, z);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3632a(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + mo3724j());
        }
        Resources resources = getContext().getResources();
        new C0850ka(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C1122a.fastscroll_default_thickness), resources.getDimensionPixelSize(C1122a.fastscroll_minimum_range), resources.getDimensionPixelOffset(C1122a.fastscroll_margin));
    }

    /* renamed from: a */
    public void mo3633a(C0758h hVar) {
        mo3634a(hVar, -1);
    }

    /* renamed from: a */
    public void mo3634a(C0758h hVar, int i) {
        C0759i iVar = this.f2998w;
        if (iVar != null) {
            iVar.mo3507a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f3002y.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.f3002y.add(hVar);
        } else {
            this.f3002y.add(i, hVar);
        }
        mo3746p();
        requestLayout();
    }

    /* renamed from: a */
    public void mo3635a(C0765m mVar) {
        this.f3004z.add(mVar);
    }

    /* renamed from: a */
    public void mo3636a(C0766n nVar) {
        if (this.f2993ta == null) {
            this.f2993ta = new ArrayList();
        }
        this.f2993ta.add(nVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3637a(C0775t tVar) {
        if (getScrollState() == 2) {
            OverScroller a = this.f2983oa.f3087c;
            tVar.f3083p = a.getFinalX() - a.getCurrX();
            tVar.f3084q = a.getFinalY() - a.getCurrY();
            return;
        }
        tVar.f3083p = 0;
        tVar.f3084q = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3638a(C0778w wVar, C0753f.C0756c cVar) {
        wVar.mo4028a(0, 8192);
        if (this.f2989ra.f3076i && wVar.mo4051r() && !wVar.mo4048o() && !wVar.mo4056v()) {
            this.f2984p.mo4718a(mo3672d(wVar), wVar);
        }
        this.f2984p.mo4725c(wVar, cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3639a(C0778w wVar, C0753f.C0756c cVar, C0753f.C0756c cVar2) {
        wVar.mo4033a(false);
        if (this.f2963W.mo3821a(wVar, cVar, cVar2)) {
            mo3778t();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3640a(View view) {
        C0778w i = m3934i(view);
        mo3726k(view);
        C0748a aVar = this.f2996v;
        if (!(aVar == null || i == null)) {
            aVar.mo3795b(i);
        }
        List<C0763k> list = this.f2953M;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f2953M.get(size).mo3945b(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3641a(String str) {
        if (mo3733o()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + mo3724j());
            }
            throw new IllegalStateException(str);
        } else if (this.f2957Q > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + mo3724j()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3642a(boolean z) {
        this.f2956P--;
        if (this.f2956P < 1) {
            this.f2956P = 0;
            if (z) {
                m3897A();
                mo3685e();
            }
        }
    }

    /* renamed from: a */
    public boolean mo3643a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().mo1960a(i, i2, i3, i4, iArr, i5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo3644a(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        mo3661c();
        if (this.f2996v != null) {
            mo3782x();
            mo3748r();
            C0417d.m1972a("RV Scroll");
            mo3637a(this.f2989ra);
            if (i != 0) {
                i6 = this.f2998w.mo3368a(i, this.f2976l, this.f2989ra);
                i5 = i - i6;
            } else {
                i6 = 0;
                i5 = 0;
            }
            if (i2 != 0) {
                i4 = this.f2998w.mo3384b(i2, this.f2976l, this.f2989ra);
                i3 = i2 - i4;
            } else {
                i4 = 0;
                i3 = 0;
            }
            C0417d.m1971a();
            mo3780v();
            mo3754s();
            mo3663c(false);
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (!this.f3002y.isEmpty()) {
            invalidate();
        }
        if (mo3643a(i6, i4, i5, i3, this.f2938Ca, 0)) {
            int i7 = this.f2969fa;
            int[] iArr = this.f2938Ca;
            this.f2969fa = i7 - iArr[0];
            this.f2970ga -= iArr[1];
            if (motionEvent != null) {
                motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
            }
            int[] iArr2 = this.f2942Ea;
            int i8 = iArr2[0];
            int[] iArr3 = this.f2938Ca;
            iArr2[0] = i8 + iArr3[0];
            iArr2[1] = iArr2[1] + iArr3[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null && !C0475j.m2212e(motionEvent, 8194)) {
                m3913a(motionEvent.getX(), (float) i5, motionEvent.getY(), (float) i3);
            }
            mo3652b(i, i2);
        }
        if (!(i6 == 0 && i4 == 0)) {
            mo3676d(i6, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (i6 == 0 && i4 == 0) ? false : true;
    }

    /* renamed from: a */
    public boolean mo3645a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().mo1962a(i, i2, iArr, iArr2, i3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo3646a(C0778w wVar) {
        C0753f fVar = this.f2963W;
        return fVar == null || fVar.mo3823a(wVar, wVar.mo4043j());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo3647a(C0778w wVar, int i) {
        if (mo3733o()) {
            wVar.f3109r = i;
            this.f2944Fa.add(wVar);
            return false;
        }
        C0487v.m2288d(wVar.f3093b, i);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo3648a(AccessibilityEvent accessibilityEvent) {
        if (!mo3733o()) {
            return false;
        }
        int a = accessibilityEvent != null ? C0445a.m2084a(accessibilityEvent) : 0;
        if (a == 0) {
            a = 0;
        }
        this.f2950J = a | this.f2950J;
        return true;
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C0759i iVar = this.f2998w;
        if (iVar == null || !iVar.mo3877a(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    /* renamed from: b */
    public C0778w mo3650b(int i) {
        C0778w wVar = null;
        if (this.f2954N) {
            return null;
        }
        int b = this.f2982o.mo4248b();
        for (int i2 = 0; i2 < b; i2++) {
            C0778w i3 = m3934i(this.f2982o.mo4254d(i2));
            if (i3 != null && !i3.mo4048o() && mo3659c(i3) == i) {
                if (!this.f2982o.mo4253c(i3.f3093b)) {
                    return i3;
                }
                wVar = i3;
            }
        }
        return wVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3651b() {
        int b = this.f2982o.mo4248b();
        for (int i = 0; i < b; i++) {
            C0778w i2 = m3934i(this.f2982o.mo4254d(i));
            if (!i2.mo4056v()) {
                i2.mo4026a();
            }
        }
        this.f2976l.mo3978b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3652b(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.f2959S;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.f2959S.onRelease();
            z = this.f2959S.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2961U;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f2961U.onRelease();
            z |= this.f2961U.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2960T;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f2960T.onRelease();
            z |= this.f2960T.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2962V;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f2962V.onRelease();
            z |= this.f2962V.isFinished();
        }
        if (z) {
            C0487v.m2261B(this);
        }
    }

    /* renamed from: b */
    public void mo3653b(C0758h hVar) {
        C0759i iVar = this.f2998w;
        if (iVar != null) {
            iVar.mo3507a("Cannot remove item decoration during a scroll  or layout");
        }
        this.f3002y.remove(hVar);
        if (this.f3002y.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        mo3746p();
        requestLayout();
    }

    /* renamed from: b */
    public void mo3654b(C0765m mVar) {
        this.f3004z.remove(mVar);
        if (this.f2933A == mVar) {
            this.f2933A = null;
        }
    }

    /* renamed from: b */
    public void mo3655b(C0766n nVar) {
        List<C0766n> list = this.f2993ta;
        if (list != null) {
            list.remove(nVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3656b(C0778w wVar, C0753f.C0756c cVar, C0753f.C0756c cVar2) {
        m3933e(wVar);
        wVar.mo4033a(false);
        if (this.f2963W.mo3826b(wVar, cVar, cVar2)) {
            mo3778t();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3657b(View view) {
        C0778w i = m3934i(view);
        mo3729l(view);
        C0748a aVar = this.f2996v;
        if (!(aVar == null || i == null)) {
            aVar.mo3801c(i);
        }
        List<C0763k> list = this.f2953M;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f2953M.get(size).mo3944a(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3658b(boolean z) {
        this.f2955O = z | this.f2955O;
        this.f2954N = true;
        mo3747q();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo3659c(C0778w wVar) {
        if (wVar.mo4035b(524) || !wVar.mo4045l()) {
            return -1;
        }
        return this.f2980n.mo4521a(wVar.f3095d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo3660c(android.view.View r3) {
        /*
            r2 = this;
        L_0x0000:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L_0x0010
            if (r0 == r2) goto L_0x0010
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x0010
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L_0x0000
        L_0x0010:
            if (r0 != r2) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.RecyclerView.mo3660c(android.view.View):android.view.View");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3661c() {
        if (!this.f2941E || this.f2954N) {
            C0417d.m1972a("RV FullInvalidate");
            mo3674d();
            C0417d.m1971a();
        } else if (this.f2980n.mo4533c()) {
            if (this.f2980n.mo4534c(4) && !this.f2980n.mo4534c(11)) {
                C0417d.m1972a("RV PartialInvalidate");
                mo3782x();
                mo3748r();
                this.f2980n.mo4537e();
                if (!this.f2945G) {
                    if (m3902F()) {
                        mo3674d();
                    } else {
                        this.f2980n.mo4524a();
                    }
                }
                mo3663c(true);
                mo3754s();
            } else if (this.f2980n.mo4533c()) {
                C0417d.m1972a("RV FullInvalidate");
                mo3674d();
            } else {
                return;
            }
            C0417d.m1971a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3662c(int i, int i2) {
        setMeasuredDimension(C0759i.m4091a(i, getPaddingLeft() + getPaddingRight(), C0487v.m2295k(this)), C0759i.m4091a(i2, getPaddingTop() + getPaddingBottom(), C0487v.m2294j(this)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3663c(boolean z) {
        if (this.f2943F < 1) {
            this.f2943F = 1;
        }
        if (!z && !this.f2947H) {
            this.f2945G = false;
        }
        if (this.f2943F == 1) {
            if (z && this.f2945G && !this.f2947H && this.f2998w != null && this.f2996v != null) {
                mo3674d();
            }
            if (!this.f2947H) {
                this.f2945G = false;
            }
        }
        this.f2943F--;
    }

    /* renamed from: c */
    public boolean mo3664c(int i) {
        return getScrollingChildHelper().mo1957a(i);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0762j) && this.f2998w.mo3383a((C0762j) layoutParams);
    }

    public int computeHorizontalScrollExtent() {
        C0759i iVar = this.f2998w;
        if (iVar != null && iVar.mo3509a()) {
            return this.f2998w.mo3501a(this.f2989ra);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        C0759i iVar = this.f2998w;
        if (iVar != null && iVar.mo3509a()) {
            return this.f2998w.mo3510b(this.f2989ra);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        C0759i iVar = this.f2998w;
        if (iVar != null && iVar.mo3509a()) {
            return this.f2998w.mo3515c(this.f2989ra);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        C0759i iVar = this.f2998w;
        if (iVar != null && iVar.mo3513b()) {
            return this.f2998w.mo3516d(this.f2989ra);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        C0759i iVar = this.f2998w;
        if (iVar != null && iVar.mo3513b()) {
            return this.f2998w.mo3517e(this.f2989ra);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        C0759i iVar = this.f2998w;
        if (iVar != null && iVar.mo3513b()) {
            return this.f2998w.mo3519f(this.f2989ra);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public long mo3672d(C0778w wVar) {
        return this.f2996v.mo3797b() ? wVar.mo4039f() : (long) wVar.f3095d;
    }

    /* renamed from: d */
    public C0778w mo3673d(View view) {
        View c = mo3660c(view);
        if (c == null) {
            return null;
        }
        return mo3716h(c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3674d() {
        String str;
        if (this.f2996v == null) {
            str = "No adapter attached; skipping layout";
        } else if (this.f2998w == null) {
            str = "No layout manager attached; skipping layout";
        } else {
            C0775t tVar = this.f2989ra;
            tVar.f3077j = false;
            if (tVar.f3072e == 1) {
                m3898B();
            } else if (!this.f2980n.mo4536d() && this.f2998w.mo3932r() == getWidth() && this.f2998w.mo3914h() == getHeight()) {
                this.f2998w.mo3906e(this);
                m3900D();
                return;
            }
            this.f2998w.mo3906e(this);
            m3899C();
            m3900D();
            return;
        }
        Log.e("RecyclerView", str);
    }

    /* renamed from: d */
    public void mo3675d(int i) {
        int a = this.f2982o.mo4242a();
        for (int i2 = 0; i2 < a; i2++) {
            this.f2982o.mo4251c(i2).offsetLeftAndRight(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3676d(int i, int i2) {
        this.f2957Q++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        mo3718h(i, i2);
        C0766n nVar = this.f2991sa;
        if (nVar != null) {
            nVar.mo3951a(this, i, i2);
        }
        List<C0766n> list = this.f2993ta;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f2993ta.get(size).mo3951a(this, i, i2);
            }
        }
        this.f2957Q--;
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().mo1956a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().mo1955a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().mo1961a(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().mo1959a(i, i2, i3, i4, iArr);
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z;
        boolean z2;
        int i;
        float f;
        super.draw(canvas);
        int size = this.f3002y.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.f3002y.get(i2).mo3847b(canvas, this, this.f2989ra);
        }
        EdgeEffect edgeEffect = this.f2959S;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f2986q ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.f2959S;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f2960T;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f2986q) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f2960T;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f2961U;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f2986q ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.f2961U;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f2962V;
        if (edgeEffect7 == null || edgeEffect7.isFinished()) {
            z2 = z;
        } else {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f2986q) {
                f = (float) ((-getWidth()) + getPaddingRight());
                i = (-getHeight()) + getPaddingBottom();
            } else {
                f = (float) (-getWidth());
                i = -getHeight();
            }
            canvas.translate(f, (float) i);
            EdgeEffect edgeEffect8 = this.f2962V;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 = z3 | z;
            canvas.restoreToCount(save4);
        }
        if (!z2 && this.f2963W != null && this.f3002y.size() > 0 && this.f2963W.mo3835g()) {
            z2 = true;
        }
        if (z2) {
            C0487v.m2261B(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3685e() {
        int i;
        for (int size = this.f2944Fa.size() - 1; size >= 0; size--) {
            C0778w wVar = this.f2944Fa.get(size);
            if (wVar.f3093b.getParent() == this && !wVar.mo4056v() && (i = wVar.f3109r) != -1) {
                C0487v.m2288d(wVar.f3093b, i);
                wVar.f3109r = -1;
            }
        }
        this.f2944Fa.clear();
    }

    /* renamed from: e */
    public void mo3686e(int i) {
        int a = this.f2982o.mo4242a();
        for (int i2 = 0; i2 < a; i2++) {
            this.f2982o.mo4251c(i2).offsetTopAndBottom(i);
        }
    }

    /* renamed from: e */
    public boolean mo3687e(int i, int i2) {
        C0759i iVar = this.f2998w;
        int i3 = 0;
        if (iVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.f2947H) {
            return false;
        } else {
            boolean a = iVar.mo3509a();
            boolean b = this.f2998w.mo3513b();
            if (!a || Math.abs(i) < this.f2973ja) {
                i = 0;
            }
            if (!b || Math.abs(i2) < this.f2973ja) {
                i2 = 0;
            }
            if (i == 0 && i2 == 0) {
                return false;
            }
            float f = (float) i;
            float f2 = (float) i2;
            if (!dispatchNestedPreFling(f, f2)) {
                boolean z = a || b;
                dispatchNestedFling(f, f2, z);
                C0764l lVar = this.f2972ia;
                if (lVar != null && lVar.mo3946a(i, i2)) {
                    return true;
                }
                if (z) {
                    if (a) {
                        i3 = 1;
                    }
                    if (b) {
                        i3 |= 2;
                    }
                    mo3725j(i3, 1);
                    int i4 = this.f2975ka;
                    int max = Math.max(-i4, Math.min(i, i4));
                    int i5 = this.f2975ka;
                    this.f2983oa.mo4021a(max, Math.max(-i5, Math.min(i2, i5)));
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: f */
    public int mo3688f(View view) {
        C0778w i = m3934i(view);
        if (i != null) {
            return i.mo4038e();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3689f() {
        int i;
        int i2;
        EdgeEffect edgeEffect;
        if (this.f2962V == null) {
            this.f2962V = this.f2958R.mo3816a(this, 3);
            if (this.f2986q) {
                edgeEffect = this.f2962V;
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                edgeEffect = this.f2962V;
                i2 = getMeasuredWidth();
                i = getMeasuredHeight();
            }
            edgeEffect.setSize(i2, i);
        }
    }

    /* renamed from: f */
    public void mo3690f(int i) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3691f(int i, int i2) {
        int b = this.f2982o.mo4248b();
        for (int i3 = 0; i3 < b; i3++) {
            C0778w i4 = m3934i(this.f2982o.mo4254d(i3));
            if (i4 != null && !i4.mo4056v() && i4.f3095d >= i) {
                i4.mo4030a(i2, false);
                this.f2989ra.f3074g = true;
            }
        }
        this.f2976l.mo3968a(i, i2);
        requestLayout();
    }

    public View focusSearch(View view, int i) {
        View view2;
        boolean z;
        View d = this.f2998w.mo3899d(view, i);
        if (d != null) {
            return d;
        }
        boolean z2 = this.f2996v != null && this.f2998w != null && !mo3733o() && !this.f2947H;
        FocusFinder instance = FocusFinder.getInstance();
        if (!z2 || !(i == 2 || i == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i);
            if (findNextFocus != null || !z2) {
                view2 = findNextFocus;
            } else {
                mo3661c();
                if (mo3660c(view) == null) {
                    return null;
                }
                mo3782x();
                view2 = this.f2998w.mo3373a(view, i, this.f2976l, this.f2989ra);
                mo3663c(false);
            }
        } else {
            if (this.f2998w.mo3513b()) {
                int i2 = i == 2 ? 130 : 33;
                z = instance.findNextFocus(this, view, i2) == null;
                if (f2929g) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.f2998w.mo3509a()) {
                int i3 = (this.f2998w.mo3920k() == 1) ^ (i == 2) ? 66 : 17;
                z = instance.findNextFocus(this, view, i3) == null;
                if (f2929g) {
                    i = i3;
                }
            }
            if (z) {
                mo3661c();
                if (mo3660c(view) == null) {
                    return null;
                }
                mo3782x();
                this.f2998w.mo3373a(view, i, this.f2976l, this.f2989ra);
                mo3663c(false);
            }
            view2 = instance.findNextFocus(this, view, i);
        }
        if (view2 == null || view2.hasFocusable()) {
            return m3926a(view, view2, i) ? view2 : super.focusSearch(view, i);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        }
        m3922a(view2, (View) null);
        return view;
    }

    /* renamed from: g */
    public int mo3693g(View view) {
        C0778w i = m3934i(view);
        if (i != null) {
            return i.mo4041h();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo3694g() {
        int i;
        int i2;
        EdgeEffect edgeEffect;
        if (this.f2959S == null) {
            this.f2959S = this.f2958R.mo3816a(this, 0);
            if (this.f2986q) {
                edgeEffect = this.f2959S;
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                edgeEffect = this.f2959S;
                i2 = getMeasuredHeight();
                i = getMeasuredWidth();
            }
            edgeEffect.setSize(i2, i);
        }
    }

    /* renamed from: g */
    public void mo3695g(int i) {
        getScrollingChildHelper().mo1966c(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo3696g(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int b = this.f2982o.mo4248b();
        if (i < i2) {
            i4 = i2;
            i3 = -1;
            i5 = i;
        } else {
            i4 = i;
            i5 = i2;
            i3 = 1;
        }
        for (int i7 = 0; i7 < b; i7++) {
            C0778w i8 = m3934i(this.f2982o.mo4254d(i7));
            if (i8 != null && (i6 = i8.f3095d) >= i5 && i6 <= i4) {
                if (i6 == i) {
                    i8.mo4030a(i2 - i, false);
                } else {
                    i8.mo4030a(i3, false);
                }
                this.f2989ra.f3074g = true;
            }
        }
        this.f2976l.mo3979b(i, i2);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C0759i iVar = this.f2998w;
        if (iVar != null) {
            return iVar.mo3388c();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo3724j());
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        C0759i iVar = this.f2998w;
        if (iVar != null) {
            return iVar.mo3370a(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo3724j());
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0759i iVar = this.f2998w;
        if (iVar != null) {
            return iVar.mo3371a(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo3724j());
    }

    public C0748a getAdapter() {
        return this.f2996v;
    }

    public int getBaseline() {
        C0759i iVar = this.f2998w;
        return iVar != null ? iVar.mo3897d() : super.getBaseline();
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        C0751d dVar = this.f3005za;
        return dVar == null ? super.getChildDrawingOrder(i, i2) : dVar.mo3815a(i, i2);
    }

    public boolean getClipToPadding() {
        return this.f2986q;
    }

    public C0726Ka getCompatAccessibilityDelegate() {
        return this.f3003ya;
    }

    public C0752e getEdgeEffectFactory() {
        return this.f2958R;
    }

    public C0753f getItemAnimator() {
        return this.f2963W;
    }

    public int getItemDecorationCount() {
        return this.f3002y.size();
    }

    public C0759i getLayoutManager() {
        return this.f2998w;
    }

    public int getMaxFlingVelocity() {
        return this.f2975ka;
    }

    public int getMinFlingVelocity() {
        return this.f2973ja;
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        if (f2928f) {
            return System.nanoTime();
        }
        return 0;
    }

    public C0764l getOnFlingListener() {
        return this.f2972ia;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f2981na;
    }

    public C0767o getRecycledViewPool() {
        return this.f2976l.mo3987d();
    }

    public int getScrollState() {
        return this.f2964aa;
    }

    /* renamed from: h */
    public C0778w mo3716h(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m3934i(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo3717h() {
        int i;
        int i2;
        EdgeEffect edgeEffect;
        if (this.f2961U == null) {
            this.f2961U = this.f2958R.mo3816a(this, 2);
            if (this.f2986q) {
                edgeEffect = this.f2961U;
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                edgeEffect = this.f2961U;
                i2 = getMeasuredHeight();
                i = getMeasuredWidth();
            }
            edgeEffect.setSize(i2, i);
        }
    }

    /* renamed from: h */
    public void mo3718h(int i, int i2) {
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().mo1954a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo3720i() {
        int i;
        int i2;
        EdgeEffect edgeEffect;
        if (this.f2960T == null) {
            this.f2960T = this.f2958R.mo3816a(this, 1);
            if (this.f2986q) {
                edgeEffect = this.f2960T;
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                edgeEffect = this.f2960T;
                i2 = getMeasuredWidth();
                i = getMeasuredHeight();
            }
            edgeEffect.setSize(i2, i);
        }
    }

    /* renamed from: i */
    public void mo3721i(int i, int i2) {
        mo3629a(i, i2, (Interpolator) null);
    }

    public boolean isAttachedToWindow() {
        return this.f2935B;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().mo1963b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public Rect mo3723j(View view) {
        C0762j jVar = (C0762j) view.getLayoutParams();
        if (!jVar.f3044c) {
            return jVar.f3043b;
        }
        if (this.f2989ra.mo4016d() && (jVar.mo3941b() || jVar.mo3943d())) {
            return jVar.f3043b;
        }
        Rect rect = jVar.f3043b;
        rect.set(0, 0, 0, 0);
        int size = this.f3002y.size();
        for (int i = 0; i < size; i++) {
            this.f2990s.set(0, 0, 0, 0);
            this.f3002y.get(i).mo3845a(this.f2990s, view, this, this.f2989ra);
            int i2 = rect.left;
            Rect rect2 = this.f2990s;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        jVar.f3044c = false;
        return rect;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public String mo3724j() {
        return " " + super.toString() + ", adapter:" + this.f2996v + ", layout:" + this.f2998w + ", context:" + getContext();
    }

    /* renamed from: j */
    public boolean mo3725j(int i, int i2) {
        return getScrollingChildHelper().mo1958a(i, i2);
    }

    /* renamed from: k */
    public void mo3726k(View view) {
    }

    /* renamed from: k */
    public boolean mo3727k() {
        return !this.f2941E || this.f2954N || this.f2980n.mo4533c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo3728l() {
        this.f2980n = new C0844j(new C0715Ga(this));
    }

    /* renamed from: l */
    public void mo3729l(View view) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo3730m() {
        this.f2962V = null;
        this.f2960T = null;
        this.f2961U = null;
        this.f2959S = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo3731m(View view) {
        mo3782x();
        boolean e = this.f2982o.mo4257e(view);
        if (e) {
            C0778w i = m3934i(view);
            this.f2976l.mo3985c(i);
            this.f2976l.mo3980b(i);
        }
        mo3663c(!e);
        return e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo3732n() {
        AccessibilityManager accessibilityManager = this.f2952L;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    /* renamed from: o */
    public boolean mo3733o() {
        return this.f2956P > 0;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        if (r0 >= 30.0f) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachedToWindow() {
        /*
            r4 = this;
            super.onAttachedToWindow()
            r0 = 0
            r4.f2956P = r0
            r1 = 1
            r4.f2935B = r1
            boolean r2 = r4.f2941E
            if (r2 == 0) goto L_0x0014
            boolean r2 = r4.isLayoutRequested()
            if (r2 != 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r1 = r0
        L_0x0015:
            r4.f2941E = r1
            android.support.v7.widget.RecyclerView$i r1 = r4.f2998w
            if (r1 == 0) goto L_0x001e
            r1.mo3859a((android.support.p011v7.widget.RecyclerView) r4)
        L_0x001e:
            r4.f3001xa = r0
            boolean r0 = f2928f
            if (r0 == 0) goto L_0x0066
            java.lang.ThreadLocal<android.support.v7.widget.oa> r0 = android.support.p011v7.widget.C0867oa.f3556a
            java.lang.Object r0 = r0.get()
            android.support.v7.widget.oa r0 = (android.support.p011v7.widget.C0867oa) r0
            r4.f2985pa = r0
            android.support.v7.widget.oa r0 = r4.f2985pa
            if (r0 != 0) goto L_0x0061
            android.support.v7.widget.oa r0 = new android.support.v7.widget.oa
            r0.<init>()
            r4.f2985pa = r0
            android.view.Display r0 = android.support.p007v4.view.C0487v.m2289e(r4)
            r1 = 1114636288(0x42700000, float:60.0)
            boolean r2 = r4.isInEditMode()
            if (r2 != 0) goto L_0x0052
            if (r0 == 0) goto L_0x0052
            float r0 = r0.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r0 = r1
        L_0x0053:
            android.support.v7.widget.oa r1 = r4.f2985pa
            r2 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r2 = r2 / r0
            long r2 = (long) r2
            r1.f3560e = r2
            java.lang.ThreadLocal<android.support.v7.widget.oa> r0 = android.support.p011v7.widget.C0867oa.f3556a
            r0.set(r1)
        L_0x0061:
            android.support.v7.widget.oa r0 = r4.f2985pa
            r0.mo4614a((android.support.p011v7.widget.RecyclerView) r4)
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.RecyclerView.onAttachedToWindow():void");
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        C0867oa oaVar;
        super.onDetachedFromWindow();
        C0753f fVar = this.f2963W;
        if (fVar != null) {
            fVar.mo3824b();
        }
        mo3783y();
        this.f2935B = false;
        C0759i iVar = this.f2998w;
        if (iVar != null) {
            iVar.mo3860a(this, this.f2976l);
        }
        this.f2944Fa.clear();
        removeCallbacks(this.f2946Ga);
        this.f2984p.mo4722b();
        if (f2928f && (oaVar = this.f2985pa) != null) {
            oaVar.mo4616b(this);
            this.f2985pa = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f3002y.size();
        for (int i = 0; i < size; i++) {
            this.f3002y.get(i).mo3843a(canvas, this, this.f2989ra);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.f2998w != null && !this.f2947H && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.f2998w.mo3513b() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f2998w.mo3509a()) {
                    f = motionEvent.getAxisValue(10);
                    if (!(f2 == 0.0f && f == 0.0f)) {
                        mo3644a((int) (f * this.f2977la), (int) (f2 * this.f2979ma), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f2998w.mo3513b()) {
                        f2 = -axisValue;
                    } else if (this.f2998w.mo3509a()) {
                        f = axisValue;
                        f2 = 0.0f;
                        mo3644a((int) (f * this.f2977la), (int) (f2 * this.f2979ma), motionEvent);
                    }
                }
                f2 = 0.0f;
                f = 0.0f;
                mo3644a((int) (f * this.f2977la), (int) (f2 * this.f2979ma), motionEvent);
            }
            f = 0.0f;
            mo3644a((int) (f * this.f2977la), (int) (f2 * this.f2979ma), motionEvent);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.f2947H) {
            return false;
        }
        if (m3930b(motionEvent)) {
            m3937z();
            return true;
        }
        C0759i iVar = this.f2998w;
        if (iVar == null) {
            return false;
        }
        boolean a = iVar.mo3509a();
        boolean b = this.f2998w.mo3513b();
        if (this.f2966ca == null) {
            this.f2966ca = VelocityTracker.obtain();
        }
        this.f2966ca.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f2949I) {
                this.f2949I = false;
            }
            this.f2965ba = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.f2969fa = x;
            this.f2967da = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.f2970ga = y;
            this.f2968ea = y;
            if (this.f2964aa == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
            int[] iArr = this.f2942Ea;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = a ? 1 : 0;
            if (b) {
                i |= 2;
            }
            mo3725j(i, 0);
        } else if (actionMasked == 1) {
            this.f2966ca.clear();
            mo3695g(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f2965ba);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f2965ba + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f2964aa != 1) {
                int i2 = x2 - this.f2967da;
                int i3 = y2 - this.f2968ea;
                if (!a || Math.abs(i2) <= this.f2971ha) {
                    z = false;
                } else {
                    this.f2969fa = x2;
                    z = true;
                }
                if (b && Math.abs(i3) > this.f2971ha) {
                    this.f2970ga = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            m3937z();
        } else if (actionMasked == 5) {
            this.f2965ba = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f2969fa = x3;
            this.f2967da = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f2970ga = y3;
            this.f2968ea = y3;
        } else if (actionMasked == 6) {
            m3931c(motionEvent);
        }
        return this.f2964aa == 1;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0417d.m1972a("RV OnLayout");
        mo3674d();
        C0417d.m1971a();
        this.f2941E = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C0759i iVar = this.f2998w;
        if (iVar == null) {
            mo3662c(i, i2);
            return;
        }
        boolean z = false;
        if (iVar.mo3524v()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f2998w.mo3856a(this.f2976l, this.f2989ra, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            if (!z && this.f2996v != null) {
                if (this.f2989ra.f3072e == 1) {
                    m3898B();
                }
                this.f2998w.mo3882b(i, i2);
                this.f2989ra.f3077j = true;
                m3899C();
                this.f2998w.mo3901d(i, i2);
                if (this.f2998w.mo3492B()) {
                    this.f2998w.mo3882b(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f2989ra.f3077j = true;
                    m3899C();
                    this.f2998w.mo3901d(i, i2);
                }
            }
        } else if (this.f2937C) {
            this.f2998w.mo3856a(this.f2976l, this.f2989ra, i, i2);
        } else {
            if (this.f2951K) {
                mo3782x();
                mo3748r();
                m3905I();
                mo3754s();
                C0775t tVar = this.f2989ra;
                if (tVar.f3079l) {
                    tVar.f3075h = true;
                } else {
                    this.f2980n.mo4531b();
                    this.f2989ra.f3075h = false;
                }
                this.f2951K = false;
                mo3663c(false);
            } else if (this.f2989ra.f3079l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            C0748a aVar = this.f2996v;
            if (aVar != null) {
                this.f2989ra.f3073f = aVar.mo337a();
            } else {
                this.f2989ra.f3073f = 0;
            }
            mo3782x();
            this.f2998w.mo3856a(this.f2976l, this.f2989ra, i, i2);
            mo3663c(false);
            this.f2989ra.f3075h = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (mo3733o()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        this.f2978m = (SavedState) parcelable;
        super.onRestoreInstanceState(this.f2978m.mo1736a());
        C0759i iVar = this.f2998w;
        if (iVar != null && (parcelable2 = this.f2978m.f3006a) != null) {
            iVar.mo3505a(parcelable2);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f2978m;
        if (savedState2 != null) {
            savedState.mo3784a(savedState2);
        } else {
            C0759i iVar = this.f2998w;
            savedState.f3006a = iVar != null ? iVar.mo3525y() : null;
        }
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            mo3730m();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        boolean z2 = false;
        if (this.f2947H || this.f2949I) {
            return false;
        }
        if (m3925a(motionEvent)) {
            m3937z();
            return true;
        }
        C0759i iVar = this.f2998w;
        if (iVar == null) {
            return false;
        }
        boolean a = iVar.mo3509a();
        boolean b = this.f2998w.mo3513b();
        if (this.f2966ca == null) {
            this.f2966ca = VelocityTracker.obtain();
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.f2942Ea;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        int[] iArr2 = this.f2942Ea;
        obtain.offsetLocation((float) iArr2[0], (float) iArr2[1]);
        if (actionMasked == 0) {
            this.f2965ba = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.f2969fa = x;
            this.f2967da = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.f2970ga = y;
            this.f2968ea = y;
            int i5 = a ? 1 : 0;
            if (b) {
                i5 |= 2;
            }
            mo3725j(i5, 0);
        } else if (actionMasked == 1) {
            this.f2966ca.addMovement(obtain);
            this.f2966ca.computeCurrentVelocity(1000, (float) this.f2975ka);
            float f = a ? -this.f2966ca.getXVelocity(this.f2965ba) : 0.0f;
            float f2 = b ? -this.f2966ca.getYVelocity(this.f2965ba) : 0.0f;
            if ((f == 0.0f && f2 == 0.0f) || !mo3687e((int) f, (int) f2)) {
                setScrollState(0);
            }
            m3909M();
            z2 = true;
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f2965ba);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f2965ba + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            int i6 = this.f2969fa - x2;
            int i7 = this.f2970ga - y2;
            if (mo3645a(i6, i7, this.f2940Da, this.f2938Ca, 0)) {
                int[] iArr3 = this.f2940Da;
                i6 -= iArr3[0];
                i7 -= iArr3[1];
                int[] iArr4 = this.f2938Ca;
                obtain.offsetLocation((float) iArr4[0], (float) iArr4[1]);
                int[] iArr5 = this.f2942Ea;
                int i8 = iArr5[0];
                int[] iArr6 = this.f2938Ca;
                iArr5[0] = i8 + iArr6[0];
                iArr5[1] = iArr5[1] + iArr6[1];
            }
            if (this.f2964aa != 1) {
                if (!a || Math.abs(i2) <= (i4 = this.f2971ha)) {
                    z = false;
                } else {
                    i2 = i2 > 0 ? i2 - i4 : i2 + i4;
                    z = true;
                }
                if (b && Math.abs(i) > (i3 = this.f2971ha)) {
                    i = i > 0 ? i - i3 : i + i3;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
            if (this.f2964aa == 1) {
                int[] iArr7 = this.f2938Ca;
                this.f2969fa = x2 - iArr7[0];
                this.f2970ga = y2 - iArr7[1];
                if (mo3644a(a ? i2 : 0, b ? i : 0, obtain)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (!(this.f2985pa == null || (i2 == 0 && i == 0))) {
                    this.f2985pa.mo4615a(this, i2, i);
                }
            }
        } else if (actionMasked == 3) {
            m3937z();
        } else if (actionMasked == 5) {
            this.f2965ba = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f2969fa = x3;
            this.f2967da = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f2970ga = y3;
            this.f2968ea = y3;
        } else if (actionMasked == 6) {
            m3931c(motionEvent);
        }
        if (!z2) {
            this.f2966ca.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo3746p() {
        int b = this.f2982o.mo4248b();
        for (int i = 0; i < b; i++) {
            ((C0762j) this.f2982o.mo4254d(i).getLayoutParams()).f3044c = true;
        }
        this.f2976l.mo3994g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo3747q() {
        int b = this.f2982o.mo4248b();
        for (int i = 0; i < b; i++) {
            C0778w i2 = m3934i(this.f2982o.mo4254d(i));
            if (i2 != null && !i2.mo4056v()) {
                i2.mo4027a(6);
            }
        }
        mo3746p();
        this.f2976l.mo3995h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo3748r() {
        this.f2956P++;
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z) {
        C0778w i = m3934i(view);
        if (i != null) {
            if (i.mo4050q()) {
                i.mo4037d();
            } else if (!i.mo4056v()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + i + mo3724j());
            }
        }
        view.clearAnimation();
        mo3657b(view);
        super.removeDetachedView(view, z);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f2998w.mo3873a(this, this.f2989ra, view, view2) && view2 != null) {
            m3922a(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f2998w.mo3874a(this, view, rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f3004z.size();
        for (int i = 0; i < size; i++) {
            this.f3004z.get(i).mo3948a(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        if (this.f2943F != 0 || this.f2947H) {
            this.f2945G = true;
        } else {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo3754s() {
        mo3642a(true);
    }

    public void scrollBy(int i, int i2) {
        C0759i iVar = this.f2998w;
        if (iVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f2947H) {
            boolean a = iVar.mo3509a();
            boolean b = this.f2998w.mo3513b();
            if (a || b) {
                if (!a) {
                    i = 0;
                }
                if (!b) {
                    i2 = 0;
                }
                mo3644a(i, i2, (MotionEvent) null);
            }
        }
    }

    public void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!mo3648a(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(C0726Ka ka) {
        this.f3003ya = ka;
        C0487v.m2274a((View) this, (C0459c) this.f3003ya);
    }

    public void setAdapter(C0748a aVar) {
        setLayoutFrozen(false);
        m3916a(aVar, false, true);
        mo3658b(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(C0751d dVar) {
        if (dVar != this.f3005za) {
            this.f3005za = dVar;
            setChildrenDrawingOrderEnabled(this.f3005za != null);
        }
    }

    public void setClipToPadding(boolean z) {
        if (z != this.f2986q) {
            mo3730m();
        }
        this.f2986q = z;
        super.setClipToPadding(z);
        if (this.f2941E) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0752e eVar) {
        C1100q.m5687a(eVar);
        this.f2958R = eVar;
        mo3730m();
    }

    public void setHasFixedSize(boolean z) {
        this.f2937C = z;
    }

    public void setItemAnimator(C0753f fVar) {
        C0753f fVar2 = this.f2963W;
        if (fVar2 != null) {
            fVar2.mo3824b();
            this.f2963W.mo3820a((C0753f.C0755b) null);
        }
        this.f2963W = fVar;
        C0753f fVar3 = this.f2963W;
        if (fVar3 != null) {
            fVar3.mo3820a(this.f2999wa);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.f2976l.mo3993f(i);
    }

    public void setLayoutFrozen(boolean z) {
        if (z != this.f2947H) {
            mo3641a("Do not setLayoutFrozen in layout or scroll");
            if (!z) {
                this.f2947H = false;
                if (!(!this.f2945G || this.f2998w == null || this.f2996v == null)) {
                    requestLayout();
                }
                this.f2945G = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f2947H = true;
            this.f2949I = true;
            mo3783y();
        }
    }

    public void setLayoutManager(C0759i iVar) {
        if (iVar != this.f2998w) {
            mo3783y();
            if (this.f2998w != null) {
                C0753f fVar = this.f2963W;
                if (fVar != null) {
                    fVar.mo3824b();
                }
                this.f2998w.mo3883b(this.f2976l);
                this.f2998w.mo3893c(this.f2976l);
                this.f2976l.mo3967a();
                if (this.f2935B) {
                    this.f2998w.mo3860a(this, this.f2976l);
                }
                this.f2998w.mo3909f((RecyclerView) null);
                this.f2998w = null;
            } else {
                this.f2976l.mo3967a();
            }
            this.f2982o.mo4252c();
            this.f2998w = iVar;
            if (iVar != null) {
                if (iVar.f3021b == null) {
                    this.f2998w.mo3909f(this);
                    if (this.f2935B) {
                        this.f2998w.mo3859a(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + iVar + " is already attached to a RecyclerView:" + iVar.f3021b.mo3724j());
                }
            }
            this.f2976l.mo3997j();
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().mo1953a(z);
    }

    public void setOnFlingListener(C0764l lVar) {
        this.f2972ia = lVar;
    }

    @Deprecated
    public void setOnScrollListener(C0766n nVar) {
        this.f2991sa = nVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f2981na = z;
    }

    public void setRecycledViewPool(C0767o oVar) {
        this.f2976l.mo3971a(oVar);
    }

    public void setRecyclerListener(C0770q qVar) {
        this.f3000x = qVar;
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i) {
        if (i != this.f2964aa) {
            this.f2964aa = i;
            if (i != 2) {
                m3911O();
            }
            mo3627a(i);
        }
    }

    public void setScrollingTouchSlop(int i) {
        int i2;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
            } else {
                i2 = viewConfiguration.getScaledPagingTouchSlop();
                this.f2971ha = i2;
            }
        }
        i2 = viewConfiguration.getScaledTouchSlop();
        this.f2971ha = i2;
    }

    public void setViewCacheExtension(C0776u uVar) {
        this.f2976l.mo3972a(uVar);
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().mo1964b(i);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().mo1965c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo3778t() {
        if (!this.f3001xa && this.f2935B) {
            C0487v.m2277a((View) this, this.f2946Ga);
            this.f3001xa = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo3779u() {
        C0753f fVar = this.f2963W;
        if (fVar != null) {
            fVar.mo3824b();
        }
        C0759i iVar = this.f2998w;
        if (iVar != null) {
            iVar.mo3883b(this.f2976l);
            this.f2998w.mo3893c(this.f2976l);
        }
        this.f2976l.mo3967a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo3780v() {
        C0778w wVar;
        int a = this.f2982o.mo4242a();
        for (int i = 0; i < a; i++) {
            View c = this.f2982o.mo4251c(i);
            C0778w h = mo3716h(c);
            if (!(h == null || (wVar = h.f3101j) == null)) {
                View view = wVar.f3093b;
                int left = c.getLeft();
                int top = c.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo3781w() {
        int b = this.f2982o.mo4248b();
        for (int i = 0; i < b; i++) {
            C0778w i2 = m3934i(this.f2982o.mo4254d(i));
            if (!i2.mo4056v()) {
                i2.mo4055u();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo3782x() {
        this.f2943F++;
        if (this.f2943F == 1 && !this.f2947H) {
            this.f2945G = false;
        }
    }

    /* renamed from: y */
    public void mo3783y() {
        setScrollState(0);
        m3911O();
    }
}
