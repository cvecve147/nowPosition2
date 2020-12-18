package android.support.p007v4.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.arch.lifecycle.C0042p;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.p007v4.app.C0339l;
import android.support.p007v4.app.C0350r;
import android.support.p007v4.view.C0487v;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p013b.p018b.p028h.p039h.C1082d;
import p013b.p018b.p028h.p039h.C1085g;
import p013b.p018b.p028h.p039h.C1086h;
import p013b.p018b.p028h.p039h.C1096m;

/* renamed from: android.support.v4.app.y */
final class C0360y extends C0350r implements LayoutInflater.Factory2 {

    /* renamed from: a */
    static boolean f1498a = false;

    /* renamed from: b */
    static Field f1499b;

    /* renamed from: c */
    static final Interpolator f1500c = new DecelerateInterpolator(2.5f);

    /* renamed from: d */
    static final Interpolator f1501d = new DecelerateInterpolator(1.5f);

    /* renamed from: e */
    static final Interpolator f1502e = new AccelerateInterpolator(2.5f);

    /* renamed from: f */
    static final Interpolator f1503f = new AccelerateInterpolator(1.5f);

    /* renamed from: A */
    String f1504A;

    /* renamed from: B */
    boolean f1505B;

    /* renamed from: C */
    ArrayList<C0321d> f1506C;

    /* renamed from: D */
    ArrayList<Boolean> f1507D;

    /* renamed from: E */
    ArrayList<C0339l> f1508E;

    /* renamed from: F */
    Bundle f1509F = null;

    /* renamed from: G */
    SparseArray<Parcelable> f1510G = null;

    /* renamed from: H */
    ArrayList<C0369i> f1511H;

    /* renamed from: I */
    C0370z f1512I;

    /* renamed from: J */
    Runnable f1513J = new C0354s(this);

    /* renamed from: g */
    ArrayList<C0367g> f1514g;

    /* renamed from: h */
    boolean f1515h;

    /* renamed from: i */
    int f1516i = 0;

    /* renamed from: j */
    final ArrayList<C0339l> f1517j = new ArrayList<>();

    /* renamed from: k */
    SparseArray<C0339l> f1518k;

    /* renamed from: l */
    ArrayList<C0321d> f1519l;

    /* renamed from: m */
    ArrayList<C0339l> f1520m;

    /* renamed from: n */
    ArrayList<C0321d> f1521n;

    /* renamed from: o */
    ArrayList<Integer> f1522o;

    /* renamed from: p */
    ArrayList<C0350r.C0353c> f1523p;

    /* renamed from: q */
    private final CopyOnWriteArrayList<C1096m<C0350r.C0352b, Boolean>> f1524q = new CopyOnWriteArrayList<>();

    /* renamed from: r */
    int f1525r = 0;

    /* renamed from: s */
    C0349q f1526s;

    /* renamed from: t */
    C0347o f1527t;

    /* renamed from: u */
    C0339l f1528u;

    /* renamed from: v */
    C0339l f1529v;

    /* renamed from: w */
    boolean f1530w;

    /* renamed from: x */
    boolean f1531x;

    /* renamed from: y */
    boolean f1532y;

    /* renamed from: z */
    boolean f1533z;

    /* renamed from: android.support.v4.app.y$a */
    private static class C0361a extends C0362b {

        /* renamed from: b */
        View f1534b;

        C0361a(View view, Animation.AnimationListener animationListener) {
            super(animationListener, (C0354s) null);
            this.f1534b = view;
        }

        public void onAnimationEnd(Animation animation) {
            if (C0487v.m2308x(this.f1534b) || Build.VERSION.SDK_INT >= 24) {
                this.f1534b.post(new C0359x(this));
            } else {
                this.f1534b.setLayerType(0, (Paint) null);
            }
            super.onAnimationEnd(animation);
        }
    }

    /* renamed from: android.support.v4.app.y$b */
    private static class C0362b implements Animation.AnimationListener {

        /* renamed from: a */
        private final Animation.AnimationListener f1535a;

        private C0362b(Animation.AnimationListener animationListener) {
            this.f1535a = animationListener;
        }

        /* synthetic */ C0362b(Animation.AnimationListener animationListener, C0354s sVar) {
            this(animationListener);
        }

        public void onAnimationEnd(Animation animation) {
            Animation.AnimationListener animationListener = this.f1535a;
            if (animationListener != null) {
                animationListener.onAnimationEnd(animation);
            }
        }

        public void onAnimationRepeat(Animation animation) {
            Animation.AnimationListener animationListener = this.f1535a;
            if (animationListener != null) {
                animationListener.onAnimationRepeat(animation);
            }
        }

        public void onAnimationStart(Animation animation) {
            Animation.AnimationListener animationListener = this.f1535a;
            if (animationListener != null) {
                animationListener.onAnimationStart(animation);
            }
        }
    }

    /* renamed from: android.support.v4.app.y$c */
    private static class C0363c {

        /* renamed from: a */
        public final Animation f1536a;

        /* renamed from: b */
        public final Animator f1537b;

        private C0363c(Animator animator) {
            this.f1536a = null;
            this.f1537b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        /* synthetic */ C0363c(Animator animator, C0354s sVar) {
            this(animator);
        }

        private C0363c(Animation animation) {
            this.f1536a = animation;
            this.f1537b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        /* synthetic */ C0363c(Animation animation, C0354s sVar) {
            this(animation);
        }
    }

    /* renamed from: android.support.v4.app.y$d */
    private static class C0364d extends AnimatorListenerAdapter {

        /* renamed from: a */
        View f1538a;

        C0364d(View view) {
            this.f1538a = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f1538a.setLayerType(0, (Paint) null);
            animator.removeListener(this);
        }

        public void onAnimationStart(Animator animator) {
            this.f1538a.setLayerType(2, (Paint) null);
        }
    }

    /* renamed from: android.support.v4.app.y$e */
    private static class C0365e extends AnimationSet implements Runnable {

        /* renamed from: a */
        private final ViewGroup f1539a;

        /* renamed from: b */
        private final View f1540b;

        /* renamed from: c */
        private boolean f1541c;

        /* renamed from: d */
        private boolean f1542d;

        C0365e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f1539a = viewGroup;
            this.f1540b = view;
            addAnimation(animation);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            if (this.f1541c) {
                return !this.f1542d;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f1541c = true;
                C0320ca.m1419a(this.f1539a, this);
            }
            return true;
        }

        public boolean getTransformation(long j, Transformation transformation, float f) {
            if (this.f1541c) {
                return !this.f1542d;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f1541c = true;
                C0320ca.m1419a(this.f1539a, this);
            }
            return true;
        }

        public void run() {
            this.f1539a.endViewTransition(this.f1540b);
            this.f1542d = true;
        }
    }

    /* renamed from: android.support.v4.app.y$f */
    static class C0366f {

        /* renamed from: a */
        public static final int[] f1543a = {16842755, 16842960, 16842961};
    }

    /* renamed from: android.support.v4.app.y$g */
    interface C0367g {
        /* renamed from: a */
        boolean mo1262a(ArrayList<C0321d> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: android.support.v4.app.y$h */
    private class C0368h implements C0367g {

        /* renamed from: a */
        final String f1544a;

        /* renamed from: b */
        final int f1545b;

        /* renamed from: c */
        final int f1546c;

        C0368h(String str, int i, int i2) {
            this.f1544a = str;
            this.f1545b = i;
            this.f1546c = i2;
        }

        /* renamed from: a */
        public boolean mo1262a(ArrayList<C0321d> arrayList, ArrayList<Boolean> arrayList2) {
            C0350r S;
            C0339l lVar = C0360y.this.f1529v;
            if (lVar != null && this.f1545b < 0 && this.f1544a == null && (S = lVar.mo1328S()) != null && S.mo1503g()) {
                return false;
            }
            return C0360y.this.mo1547a(arrayList, arrayList2, this.f1544a, this.f1545b, this.f1546c);
        }
    }

    /* renamed from: android.support.v4.app.y$i */
    static class C0369i implements C0339l.C0342c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final boolean f1548a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C0321d f1549b;

        /* renamed from: c */
        private int f1550c;

        C0369i(C0321d dVar, boolean z) {
            this.f1548a = z;
            this.f1549b = dVar;
        }

        /* renamed from: a */
        public void mo1423a() {
            this.f1550c++;
        }

        /* renamed from: b */
        public void mo1424b() {
            this.f1550c--;
            if (this.f1550c == 0) {
                this.f1549b.f1345a.m1711G();
            }
        }

        /* renamed from: c */
        public void mo1609c() {
            C0321d dVar = this.f1549b;
            dVar.f1345a.m1716a(dVar, this.f1548a, false, false);
        }

        /* renamed from: d */
        public void mo1610d() {
            boolean z = this.f1550c > 0;
            C0360y yVar = this.f1549b.f1345a;
            int size = yVar.f1517j.size();
            for (int i = 0; i < size; i++) {
                C0339l lVar = yVar.f1517j.get(i);
                lVar.mo1355a((C0339l.C0342c) null);
                if (z && lVar.mo1320G()) {
                    lVar.mo1383da();
                }
            }
            C0321d dVar = this.f1549b;
            dVar.f1345a.m1716a(dVar, this.f1548a, !z, true);
        }

        /* renamed from: e */
        public boolean mo1611e() {
            return this.f1550c == 0;
        }
    }

    C0360y() {
    }

    /* renamed from: B */
    private void m1706B() {
        SparseArray<C0339l> sparseArray = this.f1518k;
        if (sparseArray != null) {
            for (int size = sparseArray.size() - 1; size >= 0; size--) {
                if (this.f1518k.valueAt(size) == null) {
                    SparseArray<C0339l> sparseArray2 = this.f1518k;
                    sparseArray2.delete(sparseArray2.keyAt(size));
                }
            }
        }
    }

    /* renamed from: C */
    private void m1707C() {
        if (mo1501e()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.f1504A != null) {
            throw new IllegalStateException("Can not perform this action inside of " + this.f1504A);
        }
    }

    /* renamed from: D */
    private void m1708D() {
        this.f1515h = false;
        this.f1507D.clear();
        this.f1506C.clear();
    }

    /* renamed from: E */
    private void m1709E() {
        SparseArray<C0339l> sparseArray = this.f1518k;
        int size = sparseArray == null ? 0 : sparseArray.size();
        for (int i = 0; i < size; i++) {
            C0339l valueAt = this.f1518k.valueAt(i);
            if (valueAt != null) {
                if (valueAt.mo1384e() != null) {
                    int y = valueAt.mo1421y();
                    View e = valueAt.mo1384e();
                    Animation animation = e.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        e.clearAnimation();
                    }
                    valueAt.mo1358a((View) null);
                    mo1536a(valueAt, y, 0, 0, false);
                } else if (valueAt.mo1387f() != null) {
                    valueAt.mo1387f().end();
                }
            }
        }
    }

    /* renamed from: F */
    private void m1710F() {
        if (this.f1511H != null) {
            while (!this.f1511H.isEmpty()) {
                this.f1511H.remove(0).mo1610d();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public void m1711G() {
        synchronized (this) {
            boolean z = false;
            boolean z2 = this.f1511H != null && !this.f1511H.isEmpty();
            if (this.f1514g != null && this.f1514g.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.f1526s.mo1493e().removeCallbacks(this.f1513J);
                this.f1526s.mo1493e().post(this.f1513J);
            }
        }
    }

    /* renamed from: a */
    private int m1712a(ArrayList<C0321d> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, C1082d<C0339l> dVar) {
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            C0321d dVar2 = arrayList.get(i4);
            boolean booleanValue = arrayList2.get(i4).booleanValue();
            if (dVar2.mo1269e() && !dVar2.mo1261a(arrayList, i4 + 1, i2)) {
                if (this.f1511H == null) {
                    this.f1511H = new ArrayList<>();
                }
                C0369i iVar = new C0369i(dVar2, booleanValue);
                this.f1511H.add(iVar);
                dVar2.mo1258a((C0339l.C0342c) iVar);
                if (booleanValue) {
                    dVar2.mo1267c();
                } else {
                    dVar2.mo1265b(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, dVar2);
                }
                m1721a(dVar);
            }
        }
        return i3;
    }

    /* renamed from: a */
    static C0363c m1713a(Context context, float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(f1501d);
        alphaAnimation.setDuration(220);
        return new C0363c((Animation) alphaAnimation, (C0354s) null);
    }

    /* renamed from: a */
    static C0363c m1714a(Context context, float f, float f2, float f3, float f4) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f1500c);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(f1501d);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return new C0363c((Animation) animationSet, (C0354s) null);
    }

    /* renamed from: a */
    private static Animation.AnimationListener m1715a(Animation animation) {
        String str;
        try {
            if (f1499b == null) {
                f1499b = Animation.class.getDeclaredField("mListener");
                f1499b.setAccessible(true);
            }
            return (Animation.AnimationListener) f1499b.get(animation);
        } catch (NoSuchFieldException e) {
            e = e;
            str = "No field with the name mListener is found in Animation class";
            Log.e("FragmentManager", str, e);
            return null;
        } catch (IllegalAccessException e2) {
            e = e2;
            str = "Cannot access Animation's mListener field";
            Log.e("FragmentManager", str, e);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1716a(C0321d dVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            dVar.mo1265b(z3);
        } else {
            dVar.mo1267c();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(dVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C0277I.m1243a(this, (ArrayList<C0321d>) arrayList, (ArrayList<Boolean>) arrayList2, 0, 1, true);
        }
        if (z3) {
            mo1530a(this.f1525r, true);
        }
        SparseArray<C0339l> sparseArray = this.f1518k;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                C0339l valueAt = this.f1518k.valueAt(i);
                if (valueAt != null && valueAt.f1406K != null && valueAt.f1412Q && dVar.mo1266b(valueAt.f1396A)) {
                    float f = valueAt.f1414S;
                    if (f > 0.0f) {
                        valueAt.f1406K.setAlpha(f);
                    }
                    if (z3) {
                        valueAt.f1414S = 0.0f;
                    } else {
                        valueAt.f1414S = -1.0f;
                        valueAt.f1412Q = false;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m1717a(C0339l lVar, C0363c cVar, int i) {
        View view = lVar.f1406K;
        ViewGroup viewGroup = lVar.f1405J;
        viewGroup.startViewTransition(view);
        lVar.mo1373c(i);
        Animation animation = cVar.f1536a;
        if (animation != null) {
            C0365e eVar = new C0365e(animation, viewGroup, view);
            lVar.mo1358a(lVar.f1406K);
            eVar.setAnimationListener(new C0356u(this, m1715a((Animation) eVar), viewGroup, lVar));
            m1730b(view, cVar);
            lVar.f1406K.startAnimation(eVar);
            return;
        }
        Animator animator = cVar.f1537b;
        lVar.mo1346a(animator);
        animator.addListener(new C0357v(this, viewGroup, view, lVar));
        animator.setTarget(lVar.f1406K);
        m1730b(lVar.f1406K, cVar);
        animator.start();
    }

    /* renamed from: a */
    private static void m1720a(C0370z zVar) {
        if (zVar != null) {
            List<C0339l> b = zVar.mo1613b();
            if (b != null) {
                for (C0339l lVar : b) {
                    lVar.f1401F = true;
                }
            }
            List<C0370z> a = zVar.mo1612a();
            if (a != null) {
                for (C0370z a2 : a) {
                    m1720a(a2);
                }
            }
        }
    }

    /* renamed from: a */
    private void m1721a(C1082d<C0339l> dVar) {
        int i = this.f1525r;
        if (i >= 1) {
            int min = Math.min(i, 4);
            int size = this.f1517j.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0339l lVar = this.f1517j.get(i2);
                if (lVar.f1418c < min) {
                    mo1536a(lVar, min, lVar.mo1407o(), lVar.mo1411p(), false);
                    if (lVar.f1406K != null && !lVar.f1398C && lVar.f1412Q) {
                        dVar.add(lVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m1722a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C1086h("FragmentManager"));
        C0349q qVar = this.f1526s;
        if (qVar != null) {
            try {
                qVar.mo1458a("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            mo1497a("  ", (FileDescriptor) null, printWriter, new String[0]);
        }
        throw runtimeException;
    }

    /* renamed from: a */
    private void m1723a(ArrayList<C0321d> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<C0369i> arrayList3 = this.f1511H;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i = 0;
        while (i < size) {
            C0369i iVar = this.f1511H.get(i);
            if (arrayList == null || iVar.f1548a || (indexOf2 = arrayList.indexOf(iVar.f1549b)) == -1 || !arrayList2.get(indexOf2).booleanValue()) {
                if (iVar.mo1611e() || (arrayList != null && iVar.f1549b.mo1261a(arrayList, 0, arrayList.size()))) {
                    this.f1511H.remove(i);
                    i--;
                    size--;
                    if (arrayList == null || iVar.f1548a || (indexOf = arrayList.indexOf(iVar.f1549b)) == -1 || !arrayList2.get(indexOf).booleanValue()) {
                        iVar.mo1610d();
                    }
                }
                i++;
            }
            iVar.mo1609c();
            i++;
        }
    }

    /* renamed from: a */
    private static void m1724a(ArrayList<C0321d> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C0321d dVar = arrayList.get(i);
            boolean z = true;
            if (arrayList2.get(i).booleanValue()) {
                dVar.mo1256a(-1);
                if (i != i2 - 1) {
                    z = false;
                }
                dVar.mo1265b(z);
            } else {
                dVar.mo1256a(1);
                dVar.mo1267c();
            }
            i++;
        }
    }

    /* renamed from: a */
    static boolean m1725a(Animator animator) {
        if (animator == null) {
            return false;
        }
        if (animator instanceof ValueAnimator) {
            PropertyValuesHolder[] values = ((ValueAnimator) animator).getValues();
            for (PropertyValuesHolder propertyName : values) {
                if ("alpha".equals(propertyName.getPropertyName())) {
                    return true;
                }
            }
        } else if (animator instanceof AnimatorSet) {
            ArrayList<Animator> childAnimations = ((AnimatorSet) animator).getChildAnimations();
            for (int i = 0; i < childAnimations.size(); i++) {
                if (m1725a(childAnimations.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m1726a(C0363c cVar) {
        Animation animation = cVar.f1536a;
        if (animation instanceof AlphaAnimation) {
            return true;
        }
        if (!(animation instanceof AnimationSet)) {
            return m1725a(cVar.f1537b);
        }
        List<Animation> animations = ((AnimationSet) animation).getAnimations();
        for (int i = 0; i < animations.size(); i++) {
            if (animations.get(i) instanceof AlphaAnimation) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m1727a(View view, C0363c cVar) {
        return view != null && cVar != null && Build.VERSION.SDK_INT >= 19 && view.getLayerType() == 0 && C0487v.m2306v(view) && m1726a(cVar);
    }

    /* renamed from: a */
    private boolean m1728a(String str, int i, int i2) {
        C0350r S;
        mo1593s();
        m1735c(true);
        C0339l lVar = this.f1529v;
        if (lVar != null && i < 0 && str == null && (S = lVar.mo1328S()) != null && S.mo1503g()) {
            return true;
        }
        boolean a = mo1547a(this.f1506C, this.f1507D, str, i, i2);
        if (a) {
            this.f1515h = true;
            try {
                m1734c(this.f1506C, this.f1507D);
            } finally {
                m1708D();
            }
        }
        mo1592r();
        m1706B();
        return a;
    }

    /* renamed from: b */
    public static int m1729b(int i, boolean z) {
        if (i == 4097) {
            return z ? 1 : 2;
        }
        if (i == 4099) {
            return z ? 5 : 6;
        }
        if (i != 8194) {
            return -1;
        }
        return z ? 3 : 4;
    }

    /* renamed from: b */
    private static void m1730b(View view, C0363c cVar) {
        if (view != null && cVar != null && m1727a(view, cVar)) {
            Animator animator = cVar.f1537b;
            if (animator != null) {
                animator.addListener(new C0364d(view));
                return;
            }
            Animation.AnimationListener a = m1715a(cVar.f1536a);
            view.setLayerType(2, (Paint) null);
            cVar.f1536a.setAnimationListener(new C0361a(view, a));
        }
    }

    /* renamed from: b */
    private void m1731b(C1082d<C0339l> dVar) {
        int size = dVar.size();
        for (int i = 0; i < size; i++) {
            C0339l e = dVar.mo5125e(i);
            if (!e.f1428m) {
                View z = e.mo1422z();
                e.f1414S = z.getAlpha();
                z.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: b */
    private void m1732b(ArrayList<C0321d> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        int i4;
        ArrayList<C0321d> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i5 = i;
        int i6 = i2;
        boolean z = arrayList3.get(i5).f1364t;
        ArrayList<C0339l> arrayList5 = this.f1508E;
        if (arrayList5 == null) {
            this.f1508E = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.f1508E.addAll(this.f1517j);
        C0339l u = mo1596u();
        boolean z2 = false;
        for (int i7 = i5; i7 < i6; i7++) {
            C0321d dVar = arrayList3.get(i7);
            u = !arrayList4.get(i7).booleanValue() ? dVar.mo1255a(this.f1508E, u) : dVar.mo1264b(this.f1508E, u);
            z2 = z2 || dVar.f1353i;
        }
        this.f1508E.clear();
        if (!z) {
            C0277I.m1243a(this, arrayList, arrayList2, i, i2, false);
        }
        m1724a(arrayList, arrayList2, i, i2);
        if (z) {
            C1082d dVar2 = new C1082d();
            m1721a((C1082d<C0339l>) dVar2);
            int a = m1712a(arrayList, arrayList2, i, i2, (C1082d<C0339l>) dVar2);
            m1731b((C1082d<C0339l>) dVar2);
            i3 = a;
        } else {
            i3 = i6;
        }
        if (i3 != i5 && z) {
            C0277I.m1243a(this, arrayList, arrayList2, i, i3, true);
            mo1530a(this.f1525r, true);
        }
        while (i5 < i6) {
            C0321d dVar3 = arrayList3.get(i5);
            if (arrayList4.get(i5).booleanValue() && (i4 = dVar3.f1357m) >= 0) {
                mo1550b(i4);
                dVar3.f1357m = -1;
            }
            dVar3.mo1270f();
            i5++;
        }
        if (z2) {
            mo1598w();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        return false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m1733b(java.util.ArrayList<android.support.p007v4.app.C0321d> r5, java.util.ArrayList<java.lang.Boolean> r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList<android.support.v4.app.y$g> r0 = r4.f1514g     // Catch:{ all -> 0x003c }
            r1 = 0
            if (r0 == 0) goto L_0x003a
            java.util.ArrayList<android.support.v4.app.y$g> r0 = r4.f1514g     // Catch:{ all -> 0x003c }
            int r0 = r0.size()     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x000f
            goto L_0x003a
        L_0x000f:
            java.util.ArrayList<android.support.v4.app.y$g> r0 = r4.f1514g     // Catch:{ all -> 0x003c }
            int r0 = r0.size()     // Catch:{ all -> 0x003c }
            r2 = r1
        L_0x0016:
            if (r1 >= r0) goto L_0x0028
            java.util.ArrayList<android.support.v4.app.y$g> r3 = r4.f1514g     // Catch:{ all -> 0x003c }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x003c }
            android.support.v4.app.y$g r3 = (android.support.p007v4.app.C0360y.C0367g) r3     // Catch:{ all -> 0x003c }
            boolean r3 = r3.mo1262a(r5, r6)     // Catch:{ all -> 0x003c }
            r2 = r2 | r3
            int r1 = r1 + 1
            goto L_0x0016
        L_0x0028:
            java.util.ArrayList<android.support.v4.app.y$g> r5 = r4.f1514g     // Catch:{ all -> 0x003c }
            r5.clear()     // Catch:{ all -> 0x003c }
            android.support.v4.app.q r5 = r4.f1526s     // Catch:{ all -> 0x003c }
            android.os.Handler r5 = r5.mo1493e()     // Catch:{ all -> 0x003c }
            java.lang.Runnable r6 = r4.f1513J     // Catch:{ all -> 0x003c }
            r5.removeCallbacks(r6)     // Catch:{ all -> 0x003c }
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            return r2
        L_0x003a:
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            return r1
        L_0x003c:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p007v4.app.C0360y.m1733b(java.util.ArrayList, java.util.ArrayList):boolean");
    }

    /* renamed from: c */
    private void m1734c(ArrayList<C0321d> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            m1723a(arrayList, arrayList2);
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                if (!arrayList.get(i).f1364t) {
                    if (i2 != i) {
                        m1732b(arrayList, arrayList2, i2, i);
                    }
                    i2 = i + 1;
                    if (arrayList2.get(i).booleanValue()) {
                        while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f1364t) {
                            i2++;
                        }
                    }
                    m1732b(arrayList, arrayList2, i, i2);
                    i = i2 - 1;
                }
                i++;
            }
            if (i2 != size) {
                m1732b(arrayList, arrayList2, i2, size);
            }
        }
    }

    /* renamed from: c */
    private void m1735c(boolean z) {
        if (this.f1515h) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f1526s == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        } else if (Looper.myLooper() == this.f1526s.mo1493e().getLooper()) {
            if (!z) {
                m1707C();
            }
            if (this.f1506C == null) {
                this.f1506C = new ArrayList<>();
                this.f1507D = new ArrayList<>();
            }
            this.f1515h = true;
            try {
                m1723a((ArrayList<C0321d>) null, (ArrayList<Boolean>) null);
            } finally {
                this.f1515h = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* renamed from: d */
    public static int m1736d(int i) {
        if (i == 4097) {
            return 8194;
        }
        if (i != 4099) {
            return i != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    private void m1737e(int i) {
        try {
            this.f1515h = true;
            mo1530a(i, false);
            this.f1515h = false;
            mo1593s();
        } catch (Throwable th) {
            this.f1515h = false;
            throw th;
        }
    }

    /* renamed from: p */
    private C0339l m1738p(C0339l lVar) {
        ViewGroup viewGroup = lVar.f1405J;
        View view = lVar.f1406K;
        if (!(viewGroup == null || view == null)) {
            for (int indexOf = this.f1517j.indexOf(lVar) - 1; indexOf >= 0; indexOf--) {
                C0339l lVar2 = this.f1517j.get(indexOf);
                if (lVar2.f1405J == viewGroup && lVar2.f1406K != null) {
                    return lVar2;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo1525A() {
        if (this.f1518k != null) {
            for (int i = 0; i < this.f1518k.size(); i++) {
                C0339l valueAt = this.f1518k.valueAt(i);
                if (valueAt != null) {
                    mo1577j(valueAt);
                }
            }
        }
    }

    /* renamed from: a */
    public C0270D mo1494a() {
        return new C0321d(this);
    }

    /* renamed from: a */
    public C0339l mo1526a(int i) {
        for (int size = this.f1517j.size() - 1; size >= 0; size--) {
            C0339l lVar = this.f1517j.get(size);
            if (lVar != null && lVar.f1441z == i) {
                return lVar;
            }
        }
        SparseArray<C0339l> sparseArray = this.f1518k;
        if (sparseArray == null) {
            return null;
        }
        for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
            C0339l valueAt = this.f1518k.valueAt(size2);
            if (valueAt != null && valueAt.f1441z == i) {
                return valueAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C0339l mo1527a(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        C0339l lVar = this.f1518k.get(i);
        if (lVar != null) {
            return lVar;
        }
        m1722a((RuntimeException) new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i));
        throw null;
    }

    /* renamed from: a */
    public C0339l mo1495a(String str) {
        if (str != null) {
            for (int size = this.f1517j.size() - 1; size >= 0; size--) {
                C0339l lVar = this.f1517j.get(size);
                if (lVar != null && str.equals(lVar.f1397B)) {
                    return lVar;
                }
            }
        }
        SparseArray<C0339l> sparseArray = this.f1518k;
        if (sparseArray == null || str == null) {
            return null;
        }
        for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
            C0339l valueAt = this.f1518k.valueAt(size2);
            if (valueAt != null && str.equals(valueAt.f1397B)) {
                return valueAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0363c mo1528a(C0339l lVar, int i, boolean z, int i2) {
        int b;
        int o = lVar.mo1407o();
        Animation a = lVar.mo1340a(i, z, o);
        if (a != null) {
            return new C0363c(a, (C0354s) null);
        }
        Animator b2 = lVar.mo1364b(i, z, o);
        if (b2 != null) {
            return new C0363c(b2, (C0354s) null);
        }
        if (o != 0) {
            boolean equals = "anim".equals(this.f1526s.mo1491c().getResources().getResourceTypeName(o));
            boolean z2 = false;
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.f1526s.mo1491c(), o);
                    if (loadAnimation != null) {
                        return new C0363c(loadAnimation, (C0354s) null);
                    }
                    z2 = true;
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(this.f1526s.mo1491c(), o);
                    if (loadAnimator != null) {
                        return new C0363c(loadAnimator, (C0354s) null);
                    }
                } catch (RuntimeException e2) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f1526s.mo1491c(), o);
                        if (loadAnimation2 != null) {
                            return new C0363c(loadAnimation2, (C0354s) null);
                        }
                    } else {
                        throw e2;
                    }
                }
            }
        }
        if (i == 0 || (b = m1729b(i, z)) < 0) {
            return null;
        }
        switch (b) {
            case 1:
                return m1714a(this.f1526s.mo1491c(), 1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return m1714a(this.f1526s.mo1491c(), 1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return m1714a(this.f1526s.mo1491c(), 0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return m1714a(this.f1526s.mo1491c(), 1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return m1713a(this.f1526s.mo1491c(), 0.0f, 1.0f);
            case 6:
                return m1713a(this.f1526s.mo1491c(), 1.0f, 0.0f);
            default:
                if (i2 == 0 && this.f1526s.mo1462h()) {
                    i2 = this.f1526s.mo1461g();
                }
                if (i2 == 0) {
                }
                return null;
        }
    }

    /* renamed from: a */
    public void mo1496a(int i, int i2) {
        if (i >= 0) {
            mo1542a((C0367g) new C0368h((String) null, i, i2), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    /* renamed from: a */
    public void mo1529a(int i, C0321d dVar) {
        synchronized (this) {
            if (this.f1521n == null) {
                this.f1521n = new ArrayList<>();
            }
            int size = this.f1521n.size();
            if (i < size) {
                if (f1498a) {
                    Log.v("FragmentManager", "Setting back stack index " + i + " to " + dVar);
                }
                this.f1521n.set(i, dVar);
            } else {
                while (size < i) {
                    this.f1521n.add((Object) null);
                    if (this.f1522o == null) {
                        this.f1522o = new ArrayList<>();
                    }
                    if (f1498a) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.f1522o.add(Integer.valueOf(size));
                    size++;
                }
                if (f1498a) {
                    Log.v("FragmentManager", "Adding back stack index " + i + " with " + dVar);
                }
                this.f1521n.add(dVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1530a(int i, boolean z) {
        C0349q qVar;
        if (this.f1526s == null && i != 0) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f1525r) {
            this.f1525r = i;
            if (this.f1518k != null) {
                int size = this.f1517j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    mo1572h(this.f1517j.get(i2));
                }
                int size2 = this.f1518k.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    C0339l valueAt = this.f1518k.valueAt(i3);
                    if (valueAt != null && ((valueAt.f1429n || valueAt.f1399D) && !valueAt.f1412Q)) {
                        mo1572h(valueAt);
                    }
                }
                mo1525A();
                if (this.f1530w && (qVar = this.f1526s) != null && this.f1525r == 5) {
                    qVar.mo1463i();
                    this.f1530w = false;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo1531a(Configuration configuration) {
        for (int i = 0; i < this.f1517j.size(); i++) {
            C0339l lVar = this.f1517j.get(i);
            if (lVar != null) {
                lVar.mo1354a(configuration);
            }
        }
    }

    /* renamed from: a */
    public void mo1532a(Bundle bundle, String str, C0339l lVar) {
        int i = lVar.f1422g;
        if (i >= 0) {
            bundle.putInt(str, i);
            return;
        }
        m1722a((RuntimeException) new IllegalStateException("Fragment " + lVar + " is not currently in the FragmentManager"));
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1533a(Parcelable parcelable, C0370z zVar) {
        List<C0042p> list;
        List<C0370z> list2;
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.f1150a != null) {
                if (zVar != null) {
                    List<C0339l> b = zVar.mo1613b();
                    list2 = zVar.mo1612a();
                    list = zVar.mo1614c();
                    int size = b != null ? b.size() : 0;
                    int i = 0;
                    while (i < size) {
                        C0339l lVar = b.get(i);
                        if (f1498a) {
                            Log.v("FragmentManager", "restoreAllState: re-attaching retained " + lVar);
                        }
                        int i2 = 0;
                        while (true) {
                            FragmentState[] fragmentStateArr = fragmentManagerState.f1150a;
                            if (i2 >= fragmentStateArr.length || fragmentStateArr[i2].f1156b == lVar.f1422g) {
                                FragmentState[] fragmentStateArr2 = fragmentManagerState.f1150a;
                            } else {
                                i2++;
                            }
                        }
                        FragmentState[] fragmentStateArr22 = fragmentManagerState.f1150a;
                        if (i2 != fragmentStateArr22.length) {
                            FragmentState fragmentState = fragmentStateArr22[i2];
                            fragmentState.f1166l = lVar;
                            lVar.f1420e = null;
                            lVar.f1434s = 0;
                            lVar.f1431p = false;
                            lVar.f1428m = false;
                            lVar.f1425j = null;
                            Bundle bundle = fragmentState.f1165k;
                            if (bundle != null) {
                                bundle.setClassLoader(this.f1526s.mo1491c().getClassLoader());
                                lVar.f1420e = fragmentState.f1165k.getSparseParcelableArray("android:view_state");
                                lVar.f1419d = fragmentState.f1165k;
                            }
                            i++;
                        } else {
                            m1722a((RuntimeException) new IllegalStateException("Could not find active fragment with index " + lVar.f1422g));
                            throw null;
                        }
                    }
                } else {
                    list2 = null;
                    list = null;
                }
                this.f1518k = new SparseArray<>(fragmentManagerState.f1150a.length);
                int i3 = 0;
                while (true) {
                    FragmentState[] fragmentStateArr3 = fragmentManagerState.f1150a;
                    if (i3 >= fragmentStateArr3.length) {
                        break;
                    }
                    FragmentState fragmentState2 = fragmentStateArr3[i3];
                    if (fragmentState2 != null) {
                        C0339l a = fragmentState2.mo1135a(this.f1526s, this.f1527t, this.f1528u, (list2 == null || i3 >= list2.size()) ? null : list2.get(i3), (list == null || i3 >= list.size()) ? null : list.get(i3));
                        if (f1498a) {
                            Log.v("FragmentManager", "restoreAllState: active #" + i3 + ": " + a);
                        }
                        this.f1518k.put(a.f1422g, a);
                        fragmentState2.f1166l = null;
                    }
                    i3++;
                }
                if (zVar != null) {
                    List<C0339l> b2 = zVar.mo1613b();
                    int size2 = b2 != null ? b2.size() : 0;
                    for (int i4 = 0; i4 < size2; i4++) {
                        C0339l lVar2 = b2.get(i4);
                        int i5 = lVar2.f1426k;
                        if (i5 >= 0) {
                            lVar2.f1425j = this.f1518k.get(i5);
                            if (lVar2.f1425j == null) {
                                Log.w("FragmentManager", "Re-attaching retained fragment " + lVar2 + " target no longer exists: " + lVar2.f1426k);
                            }
                        }
                    }
                }
                this.f1517j.clear();
                if (fragmentManagerState.f1151b != null) {
                    int i6 = 0;
                    while (true) {
                        int[] iArr = fragmentManagerState.f1151b;
                        if (i6 >= iArr.length) {
                            break;
                        }
                        C0339l lVar3 = this.f1518k.get(iArr[i6]);
                        if (lVar3 != null) {
                            lVar3.f1428m = true;
                            if (f1498a) {
                                Log.v("FragmentManager", "restoreAllState: added #" + i6 + ": " + lVar3);
                            }
                            if (!this.f1517j.contains(lVar3)) {
                                synchronized (this.f1517j) {
                                    this.f1517j.add(lVar3);
                                }
                                i6++;
                            } else {
                                throw new IllegalStateException("Already added!");
                            }
                        } else {
                            m1722a((RuntimeException) new IllegalStateException("No instantiated fragment for index #" + fragmentManagerState.f1151b[i6]));
                            throw null;
                        }
                    }
                }
                BackStackState[] backStackStateArr = fragmentManagerState.f1152c;
                if (backStackStateArr != null) {
                    this.f1519l = new ArrayList<>(backStackStateArr.length);
                    int i7 = 0;
                    while (true) {
                        BackStackState[] backStackStateArr2 = fragmentManagerState.f1152c;
                        if (i7 >= backStackStateArr2.length) {
                            break;
                        }
                        C0321d a2 = backStackStateArr2[i7].mo1117a(this);
                        if (f1498a) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i7 + " (index " + a2.f1357m + "): " + a2);
                            PrintWriter printWriter = new PrintWriter(new C1086h("FragmentManager"));
                            a2.mo1260a("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f1519l.add(a2);
                        int i8 = a2.f1357m;
                        if (i8 >= 0) {
                            mo1529a(i8, a2);
                        }
                        i7++;
                    }
                } else {
                    this.f1519l = null;
                }
                int i9 = fragmentManagerState.f1153d;
                if (i9 >= 0) {
                    this.f1529v = this.f1518k.get(i9);
                }
                this.f1516i = fragmentManagerState.f1154e;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1534a(C0321d dVar) {
        if (this.f1519l == null) {
            this.f1519l = new ArrayList<>();
        }
        this.f1519l.add(dVar);
    }

    /* renamed from: a */
    public void mo1535a(C0339l lVar) {
        if (f1498a) {
            Log.v("FragmentManager", "attach: " + lVar);
        }
        if (lVar.f1399D) {
            lVar.f1399D = false;
            if (lVar.f1428m) {
                return;
            }
            if (!this.f1517j.contains(lVar)) {
                if (f1498a) {
                    Log.v("FragmentManager", "add from attach: " + lVar);
                }
                synchronized (this.f1517j) {
                    this.f1517j.add(lVar);
                }
                lVar.f1428m = true;
                if (lVar.f1402G && lVar.f1403H) {
                    this.f1530w = true;
                    return;
                }
                return;
            }
            throw new IllegalStateException("Fragment already added: " + lVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: int} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02a7  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x044f  */
    /* JADX WARNING: Removed duplicated region for block: B:231:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0192  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1536a(android.support.p007v4.app.C0339l r18, int r19, int r20, int r21, boolean r22) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            boolean r0 = r7.f1428m
            r8 = 1
            if (r0 == 0) goto L_0x0011
            boolean r0 = r7.f1399D
            if (r0 == 0) goto L_0x000e
            goto L_0x0011
        L_0x000e:
            r0 = r19
            goto L_0x0016
        L_0x0011:
            r0 = r19
            if (r0 <= r8) goto L_0x0016
            r0 = r8
        L_0x0016:
            boolean r1 = r7.f1429n
            if (r1 == 0) goto L_0x002a
            int r1 = r7.f1418c
            if (r0 <= r1) goto L_0x002a
            if (r1 != 0) goto L_0x0028
            boolean r0 = r18.mo1319F()
            if (r0 == 0) goto L_0x0028
            r0 = r8
            goto L_0x002a
        L_0x0028:
            int r0 = r7.f1418c
        L_0x002a:
            boolean r1 = r7.f1408M
            r9 = 4
            r10 = 3
            if (r1 == 0) goto L_0x0038
            int r1 = r7.f1418c
            if (r1 >= r9) goto L_0x0038
            if (r0 <= r10) goto L_0x0038
            r11 = r10
            goto L_0x0039
        L_0x0038:
            r11 = r0
        L_0x0039:
            int r0 = r7.f1418c
            r12 = 2
            java.lang.String r13 = "FragmentManager"
            r14 = 0
            r15 = 0
            if (r0 > r11) goto L_0x02ec
            boolean r0 = r7.f1430o
            if (r0 == 0) goto L_0x004b
            boolean r0 = r7.f1431p
            if (r0 != 0) goto L_0x004b
            return
        L_0x004b:
            android.view.View r0 = r18.mo1384e()
            if (r0 != 0) goto L_0x0057
            android.animation.Animator r0 = r18.mo1387f()
            if (r0 == 0) goto L_0x006b
        L_0x0057:
            r7.mo1358a((android.view.View) r14)
            r7.mo1346a((android.animation.Animator) r14)
            int r2 = r18.mo1421y()
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r17
            r1 = r18
            r0.mo1536a((android.support.p007v4.app.C0339l) r1, (int) r2, (int) r3, (int) r4, (boolean) r5)
        L_0x006b:
            int r0 = r7.f1418c
            if (r0 == 0) goto L_0x007c
            if (r0 == r8) goto L_0x01ac
            if (r0 == r12) goto L_0x02a1
            if (r0 == r10) goto L_0x02a5
            if (r0 == r9) goto L_0x0079
            goto L_0x044a
        L_0x0079:
            r0 = r9
            goto L_0x02c6
        L_0x007c:
            if (r11 <= 0) goto L_0x01ac
            boolean r0 = f1498a
            if (r0 == 0) goto L_0x0096
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto CREATED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r13, r0)
        L_0x0096:
            android.os.Bundle r0 = r7.f1419d
            if (r0 == 0) goto L_0x00e9
            android.support.v4.app.q r1 = r6.f1526s
            android.content.Context r1 = r1.mo1491c()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r0.setClassLoader(r1)
            android.os.Bundle r0 = r7.f1419d
            java.lang.String r1 = "android:view_state"
            android.util.SparseArray r0 = r0.getSparseParcelableArray(r1)
            r7.f1420e = r0
            android.os.Bundle r0 = r7.f1419d
            java.lang.String r1 = "android:target_state"
            android.support.v4.app.l r0 = r6.mo1527a((android.os.Bundle) r0, (java.lang.String) r1)
            r7.f1425j = r0
            android.support.v4.app.l r0 = r7.f1425j
            if (r0 == 0) goto L_0x00c9
            android.os.Bundle r0 = r7.f1419d
            java.lang.String r1 = "android:target_req_state"
            int r0 = r0.getInt(r1, r15)
            r7.f1427l = r0
        L_0x00c9:
            java.lang.Boolean r0 = r7.f1421f
            if (r0 == 0) goto L_0x00d6
            boolean r0 = r0.booleanValue()
            r7.f1409N = r0
            r7.f1421f = r14
            goto L_0x00e0
        L_0x00d6:
            android.os.Bundle r0 = r7.f1419d
            java.lang.String r1 = "android:user_visible_hint"
            boolean r0 = r0.getBoolean(r1, r8)
            r7.f1409N = r0
        L_0x00e0:
            boolean r0 = r7.f1409N
            if (r0 != 0) goto L_0x00e9
            r7.f1408M = r8
            if (r11 <= r10) goto L_0x00e9
            r11 = r10
        L_0x00e9:
            android.support.v4.app.q r0 = r6.f1526s
            r7.f1436u = r0
            android.support.v4.app.l r1 = r6.f1528u
            r7.f1440y = r1
            if (r1 == 0) goto L_0x00f6
            android.support.v4.app.y r0 = r1.f1437v
            goto L_0x00fa
        L_0x00f6:
            android.support.v4.app.y r0 = r0.mo1492d()
        L_0x00fa:
            r7.f1435t = r0
            android.support.v4.app.l r0 = r7.f1425j
            java.lang.String r5 = "Fragment "
            if (r0 == 0) goto L_0x0145
            android.util.SparseArray<android.support.v4.app.l> r1 = r6.f1518k
            int r0 = r0.f1422g
            java.lang.Object r0 = r1.get(r0)
            android.support.v4.app.l r1 = r7.f1425j
            if (r0 != r1) goto L_0x0120
            int r0 = r1.f1418c
            if (r0 >= r8) goto L_0x0145
            r2 = 1
            r3 = 0
            r4 = 0
            r16 = 1
            r0 = r17
            r9 = r5
            r5 = r16
            r0.mo1536a((android.support.p007v4.app.C0339l) r1, (int) r2, (int) r3, (int) r4, (boolean) r5)
            goto L_0x0146
        L_0x0120:
            r9 = r5
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            r1.append(r7)
            java.lang.String r2 = " declared target fragment "
            r1.append(r2)
            android.support.v4.app.l r2 = r7.f1425j
            r1.append(r2)
            java.lang.String r2 = " that does not belong to this FragmentManager!"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0145:
            r9 = r5
        L_0x0146:
            android.support.v4.app.q r0 = r6.f1526s
            android.content.Context r0 = r0.mo1491c()
            r6.mo1552b((android.support.p007v4.app.C0339l) r7, (android.content.Context) r0, (boolean) r15)
            r7.f1404I = r15
            android.support.v4.app.q r0 = r6.f1526s
            android.content.Context r0 = r0.mo1491c()
            r7.mo1298a((android.content.Context) r0)
            boolean r0 = r7.f1404I
            if (r0 == 0) goto L_0x0192
            android.support.v4.app.l r0 = r7.f1440y
            if (r0 != 0) goto L_0x0168
            android.support.v4.app.q r0 = r6.f1526s
            r0.mo1456a(r7)
            goto L_0x016b
        L_0x0168:
            r0.mo1367b((android.support.p007v4.app.C0339l) r7)
        L_0x016b:
            android.support.v4.app.q r0 = r6.f1526s
            android.content.Context r0 = r0.mo1491c()
            r6.mo1537a((android.support.p007v4.app.C0339l) r7, (android.content.Context) r0, (boolean) r15)
            boolean r0 = r7.f1416U
            if (r0 != 0) goto L_0x0188
            android.os.Bundle r0 = r7.f1419d
            r6.mo1559c(r7, r0, r15)
            android.os.Bundle r0 = r7.f1419d
            r7.mo1394h(r0)
            android.os.Bundle r0 = r7.f1419d
            r6.mo1553b((android.support.p007v4.app.C0339l) r7, (android.os.Bundle) r0, (boolean) r15)
            goto L_0x018f
        L_0x0188:
            android.os.Bundle r0 = r7.f1419d
            r7.mo1401k(r0)
            r7.f1418c = r8
        L_0x018f:
            r7.f1401F = r15
            goto L_0x01ac
        L_0x0192:
            android.support.v4.app.fa r0 = new android.support.v4.app.fa
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            r1.append(r7)
            java.lang.String r2 = " did not call through to super.onAttach()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01ac:
            r17.mo1562d((android.support.p007v4.app.C0339l) r18)
            if (r11 <= r8) goto L_0x02a1
            boolean r0 = f1498a
            if (r0 == 0) goto L_0x01c9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto ACTIVITY_CREATED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r13, r0)
        L_0x01c9:
            boolean r0 = r7.f1430o
            if (r0 != 0) goto L_0x028c
            int r0 = r7.f1396A
            if (r0 == 0) goto L_0x023f
            r1 = -1
            if (r0 == r1) goto L_0x0220
            android.support.v4.app.o r1 = r6.f1527t
            android.view.View r0 = r1.mo1312a(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L_0x0240
            boolean r1 = r7.f1432q
            if (r1 == 0) goto L_0x01e3
            goto L_0x0240
        L_0x01e3:
            android.content.res.Resources r0 = r18.mo1415t()     // Catch:{ NotFoundException -> 0x01ee }
            int r1 = r7.f1396A     // Catch:{ NotFoundException -> 0x01ee }
            java.lang.String r0 = r0.getResourceName(r1)     // Catch:{ NotFoundException -> 0x01ee }
            goto L_0x01f0
        L_0x01ee:
            java.lang.String r0 = "unknown"
        L_0x01f0:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No view found for id 0x"
            r2.append(r3)
            int r3 = r7.f1396A
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r3 = " ("
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ") for fragment "
            r2.append(r0)
            r2.append(r7)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            r6.m1722a((java.lang.RuntimeException) r1)
            throw r14
        L_0x0220:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot create fragment "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " for a container view with no id"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r6.m1722a((java.lang.RuntimeException) r0)
            throw r14
        L_0x023f:
            r0 = r14
        L_0x0240:
            r7.f1405J = r0
            android.os.Bundle r1 = r7.f1419d
            android.view.LayoutInflater r1 = r7.mo1397i(r1)
            android.os.Bundle r2 = r7.f1419d
            android.view.View r1 = r7.mo1365b((android.view.LayoutInflater) r1, (android.view.ViewGroup) r0, (android.os.Bundle) r2)
            r7.f1406K = r1
            android.view.View r1 = r7.f1406K
            if (r1 == 0) goto L_0x028a
            r7.f1407L = r1
            r1.setSaveFromParentEnabled(r15)
            if (r0 == 0) goto L_0x0260
            android.view.View r1 = r7.f1406K
            r0.addView(r1)
        L_0x0260:
            boolean r0 = r7.f1398C
            if (r0 == 0) goto L_0x026b
            android.view.View r0 = r7.f1406K
            r1 = 8
            r0.setVisibility(r1)
        L_0x026b:
            android.view.View r0 = r7.f1406K
            android.os.Bundle r1 = r7.f1419d
            r7.mo1359a((android.view.View) r0, (android.os.Bundle) r1)
            android.view.View r0 = r7.f1406K
            android.os.Bundle r1 = r7.f1419d
            r6.mo1539a((android.support.p007v4.app.C0339l) r7, (android.view.View) r0, (android.os.Bundle) r1, (boolean) r15)
            android.view.View r0 = r7.f1406K
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0286
            android.view.ViewGroup r0 = r7.f1405J
            if (r0 == 0) goto L_0x0286
            goto L_0x0287
        L_0x0286:
            r8 = r15
        L_0x0287:
            r7.f1412Q = r8
            goto L_0x028c
        L_0x028a:
            r7.f1407L = r14
        L_0x028c:
            android.os.Bundle r0 = r7.f1419d
            r7.mo1391g((android.os.Bundle) r0)
            android.os.Bundle r0 = r7.f1419d
            r6.mo1538a((android.support.p007v4.app.C0339l) r7, (android.os.Bundle) r0, (boolean) r15)
            android.view.View r0 = r7.f1406K
            if (r0 == 0) goto L_0x029f
            android.os.Bundle r0 = r7.f1419d
            r7.mo1403l(r0)
        L_0x029f:
            r7.f1419d = r14
        L_0x02a1:
            if (r11 <= r12) goto L_0x02a5
            r7.f1418c = r10
        L_0x02a5:
            if (r11 <= r10) goto L_0x02c5
            boolean r0 = f1498a
            if (r0 == 0) goto L_0x02bf
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto STARTED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r13, r0)
        L_0x02bf:
            r18.mo1363aa()
            r6.mo1568f(r7, r15)
        L_0x02c5:
            r0 = 4
        L_0x02c6:
            if (r11 <= r0) goto L_0x044a
            boolean r0 = f1498a
            if (r0 == 0) goto L_0x02e0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto RESUMED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r13, r0)
        L_0x02e0:
            r18.mo1335Z()
            r6.mo1566e(r7, r15)
            r7.f1419d = r14
            r7.f1420e = r14
            goto L_0x044a
        L_0x02ec:
            if (r0 <= r11) goto L_0x044a
            if (r0 == r8) goto L_0x03d6
            if (r0 == r12) goto L_0x035c
            if (r0 == r10) goto L_0x033f
            r1 = 4
            if (r0 == r1) goto L_0x031e
            r1 = 5
            if (r0 == r1) goto L_0x02fc
            goto L_0x044a
        L_0x02fc:
            if (r11 >= r1) goto L_0x031c
            boolean r0 = f1498a
            if (r0 == 0) goto L_0x0316
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom RESUMED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r13, r0)
        L_0x0316:
            r18.mo1333X()
            r6.mo1564d(r7, r15)
        L_0x031c:
            r0 = 4
            goto L_0x031f
        L_0x031e:
            r0 = r1
        L_0x031f:
            if (r11 >= r0) goto L_0x033f
            boolean r0 = f1498a
            if (r0 == 0) goto L_0x0339
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom STARTED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r13, r0)
        L_0x0339:
            r18.mo1372ba()
            r6.mo1570g(r7, r15)
        L_0x033f:
            if (r11 >= r10) goto L_0x035c
            boolean r0 = f1498a
            if (r0 == 0) goto L_0x0359
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom STOPPED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r13, r0)
        L_0x0359:
            r18.mo1334Y()
        L_0x035c:
            if (r11 >= r12) goto L_0x03d6
            boolean r0 = f1498a
            if (r0 == 0) goto L_0x0376
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom ACTIVITY_CREATED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r13, r0)
        L_0x0376:
            android.view.View r0 = r7.f1406K
            if (r0 == 0) goto L_0x0389
            android.support.v4.app.q r0 = r6.f1526s
            boolean r0 = r0.mo1459b(r7)
            if (r0 == 0) goto L_0x0389
            android.util.SparseArray<android.os.Parcelable> r0 = r7.f1420e
            if (r0 != 0) goto L_0x0389
            r17.mo1583m(r18)
        L_0x0389:
            r18.mo1330U()
            r6.mo1573h(r7, r15)
            android.view.View r0 = r7.f1406K
            if (r0 == 0) goto L_0x03ce
            android.view.ViewGroup r1 = r7.f1405J
            if (r1 == 0) goto L_0x03ce
            r1.endViewTransition(r0)
            android.view.View r0 = r7.f1406K
            r0.clearAnimation()
            int r0 = r6.f1525r
            r1 = 0
            if (r0 <= 0) goto L_0x03bf
            boolean r0 = r6.f1533z
            if (r0 != 0) goto L_0x03bf
            android.view.View r0 = r7.f1406K
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x03bf
            float r0 = r7.f1414S
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x03bf
            r0 = r20
            r2 = r21
            android.support.v4.app.y$c r0 = r6.mo1528a((android.support.p007v4.app.C0339l) r7, (int) r0, (boolean) r15, (int) r2)
            goto L_0x03c0
        L_0x03bf:
            r0 = r14
        L_0x03c0:
            r7.f1414S = r1
            if (r0 == 0) goto L_0x03c7
            r6.m1717a((android.support.p007v4.app.C0339l) r7, (android.support.p007v4.app.C0360y.C0363c) r0, (int) r11)
        L_0x03c7:
            android.view.ViewGroup r0 = r7.f1405J
            android.view.View r1 = r7.f1406K
            r0.removeView(r1)
        L_0x03ce:
            r7.f1405J = r14
            r7.f1406K = r14
            r7.f1407L = r14
            r7.f1431p = r15
        L_0x03d6:
            if (r11 >= r8) goto L_0x044a
            boolean r0 = r6.f1533z
            if (r0 == 0) goto L_0x03fd
            android.view.View r0 = r18.mo1384e()
            if (r0 == 0) goto L_0x03ed
            android.view.View r0 = r18.mo1384e()
            r7.mo1358a((android.view.View) r14)
            r0.clearAnimation()
            goto L_0x03fd
        L_0x03ed:
            android.animation.Animator r0 = r18.mo1387f()
            if (r0 == 0) goto L_0x03fd
            android.animation.Animator r0 = r18.mo1387f()
            r7.mo1346a((android.animation.Animator) r14)
            r0.cancel()
        L_0x03fd:
            android.view.View r0 = r18.mo1384e()
            if (r0 != 0) goto L_0x0446
            android.animation.Animator r0 = r18.mo1387f()
            if (r0 == 0) goto L_0x040a
            goto L_0x0446
        L_0x040a:
            boolean r0 = f1498a
            if (r0 == 0) goto L_0x0422
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom CREATED: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r13, r0)
        L_0x0422:
            boolean r0 = r7.f1401F
            if (r0 != 0) goto L_0x042d
            r18.mo1329T()
            r6.mo1554b((android.support.p007v4.app.C0339l) r7, (boolean) r15)
            goto L_0x042f
        L_0x042d:
            r7.f1418c = r15
        L_0x042f:
            r18.mo1331V()
            r6.mo1560c((android.support.p007v4.app.C0339l) r7, (boolean) r15)
            if (r22 != 0) goto L_0x044a
            boolean r0 = r7.f1401F
            if (r0 != 0) goto L_0x043f
            r17.mo1569g(r18)
            goto L_0x044a
        L_0x043f:
            r7.f1436u = r14
            r7.f1440y = r14
            r7.f1435t = r14
            goto L_0x044a
        L_0x0446:
            r7.mo1373c((int) r11)
            goto L_0x044b
        L_0x044a:
            r8 = r11
        L_0x044b:
            int r0 = r7.f1418c
            if (r0 == r8) goto L_0x047c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveToState: Fragment state for "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = " not updated inline; "
            r0.append(r1)
            java.lang.String r1 = "expected state "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = " found "
            r0.append(r1)
            int r1 = r7.f1418c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r13, r0)
            r7.f1418c = r8
        L_0x047c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p007v4.app.C0360y.mo1536a(android.support.v4.app.l, int, int, int, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1537a(C0339l lVar, Context context, boolean z) {
        C0339l lVar2 = this.f1528u;
        if (lVar2 != null) {
            C0350r n = lVar2.mo1406n();
            if (n instanceof C0360y) {
                ((C0360y) n).mo1537a(lVar, context, true);
            }
        }
        Iterator<C1096m<C0350r.C0352b, Boolean>> it = this.f1524q.iterator();
        while (it.hasNext()) {
            C1096m next = it.next();
            if (!z || ((Boolean) next.f4079b).booleanValue()) {
                ((C0350r.C0352b) next.f4078a).mo1505a((C0350r) this, lVar, context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1538a(C0339l lVar, Bundle bundle, boolean z) {
        C0339l lVar2 = this.f1528u;
        if (lVar2 != null) {
            C0350r n = lVar2.mo1406n();
            if (n instanceof C0360y) {
                ((C0360y) n).mo1538a(lVar, bundle, true);
            }
        }
        Iterator<C1096m<C0350r.C0352b, Boolean>> it = this.f1524q.iterator();
        while (it.hasNext()) {
            C1096m next = it.next();
            if (!z || ((Boolean) next.f4079b).booleanValue()) {
                ((C0350r.C0352b) next.f4078a).mo1506a((C0350r) this, lVar, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1539a(C0339l lVar, View view, Bundle bundle, boolean z) {
        C0339l lVar2 = this.f1528u;
        if (lVar2 != null) {
            C0350r n = lVar2.mo1406n();
            if (n instanceof C0360y) {
                ((C0360y) n).mo1539a(lVar, view, bundle, true);
            }
        }
        Iterator<C1096m<C0350r.C0352b, Boolean>> it = this.f1524q.iterator();
        while (it.hasNext()) {
            C1096m next = it.next();
            if (!z || ((Boolean) next.f4079b).booleanValue()) {
                ((C0350r.C0352b) next.f4078a).mo1507a(this, lVar, view, bundle);
            }
        }
    }

    /* renamed from: a */
    public void mo1540a(C0339l lVar, boolean z) {
        if (f1498a) {
            Log.v("FragmentManager", "add: " + lVar);
        }
        mo1567f(lVar);
        if (lVar.f1399D) {
            return;
        }
        if (!this.f1517j.contains(lVar)) {
            synchronized (this.f1517j) {
                this.f1517j.add(lVar);
            }
            lVar.f1428m = true;
            lVar.f1429n = false;
            if (lVar.f1406K == null) {
                lVar.f1413R = false;
            }
            if (lVar.f1402G && lVar.f1403H) {
                this.f1530w = true;
            }
            if (z) {
                mo1575i(lVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("Fragment already added: " + lVar);
    }

    /* renamed from: a */
    public void mo1541a(C0349q qVar, C0347o oVar, C0339l lVar) {
        if (this.f1526s == null) {
            this.f1526s = qVar;
            this.f1527t = oVar;
            this.f1528u = lVar;
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    /* renamed from: a */
    public void mo1542a(C0367g gVar, boolean z) {
        if (!z) {
            m1707C();
        }
        synchronized (this) {
            if (!this.f1533z) {
                if (this.f1526s != null) {
                    if (this.f1514g == null) {
                        this.f1514g = new ArrayList<>();
                    }
                    this.f1514g.add(gVar);
                    m1711G();
                    return;
                }
            }
            if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* renamed from: a */
    public void mo1543a(Menu menu) {
        if (this.f1525r >= 1) {
            for (int i = 0; i < this.f1517j.size(); i++) {
                C0339l lVar = this.f1517j.get(i);
                if (lVar != null) {
                    lVar.mo1374c(menu);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo1497a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        int size5;
        String str2 = str + "    ";
        SparseArray<C0339l> sparseArray = this.f1518k;
        if (sparseArray != null && (size5 = sparseArray.size()) > 0) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (int i = 0; i < size5; i++) {
                C0339l valueAt = this.f1518k.valueAt(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(valueAt);
                if (valueAt != null) {
                    valueAt.mo1360a(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size6 = this.f1517j.size();
        if (size6 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size6; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.f1517j.get(i2).toString());
            }
        }
        ArrayList<C0339l> arrayList = this.f1520m;
        if (arrayList != null && (size4 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size4; i3++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(this.f1520m.get(i3).toString());
            }
        }
        ArrayList<C0321d> arrayList2 = this.f1519l;
        if (arrayList2 != null && (size3 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size3; i4++) {
                C0321d dVar = this.f1519l.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(dVar.toString());
                dVar.mo1259a(str2, fileDescriptor, printWriter, strArr);
            }
        }
        synchronized (this) {
            if (this.f1521n != null && (size2 = this.f1521n.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i5 = 0; i5 < size2; i5++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println(this.f1521n.get(i5));
                }
            }
            if (this.f1522o != null && this.f1522o.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f1522o.toArray()));
            }
        }
        ArrayList<C0367g> arrayList3 = this.f1514g;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i6 = 0; i6 < size; i6++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(this.f1514g.get(i6));
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1526s);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1527t);
        if (this.f1528u != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1528u);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1525r);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f1531x);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1532y);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f1533z);
        if (this.f1530w) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f1530w);
        }
        if (this.f1504A != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.f1504A);
        }
    }

    /* renamed from: a */
    public void mo1544a(boolean z) {
        for (int size = this.f1517j.size() - 1; size >= 0; size--) {
            C0339l lVar = this.f1517j.get(size);
            if (lVar != null) {
                lVar.mo1379d(z);
            }
        }
    }

    /* renamed from: a */
    public boolean mo1545a(Menu menu, MenuInflater menuInflater) {
        if (this.f1525r < 1) {
            return false;
        }
        ArrayList<C0339l> arrayList = null;
        boolean z = false;
        for (int i = 0; i < this.f1517j.size(); i++) {
            C0339l lVar = this.f1517j.get(i);
            if (lVar != null && lVar.mo1370b(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(lVar);
                z = true;
            }
        }
        if (this.f1520m != null) {
            for (int i2 = 0; i2 < this.f1520m.size(); i2++) {
                C0339l lVar2 = this.f1520m.get(i2);
                if (arrayList == null || !arrayList.contains(lVar2)) {
                    lVar2.mo1325L();
                }
            }
        }
        this.f1520m = arrayList;
        return z;
    }

    /* renamed from: a */
    public boolean mo1546a(MenuItem menuItem) {
        if (this.f1525r < 1) {
            return false;
        }
        for (int i = 0; i < this.f1517j.size(); i++) {
            C0339l lVar = this.f1517j.get(i);
            if (lVar != null && lVar.mo1377c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo1547a(ArrayList<C0321d> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int i3;
        ArrayList<C0321d> arrayList3 = this.f1519l;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f1519l.remove(size));
            arrayList2.add(true);
        } else {
            if (str != null || i >= 0) {
                i3 = this.f1519l.size() - 1;
                while (i3 >= 0) {
                    C0321d dVar = this.f1519l.get(i3);
                    if ((str != null && str.equals(dVar.mo1268d())) || (i >= 0 && i == dVar.f1357m)) {
                        break;
                    }
                    i3--;
                }
                if (i3 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        i3--;
                        if (i3 < 0) {
                            break;
                        }
                        C0321d dVar2 = this.f1519l.get(i3);
                        if ((str == null || !str.equals(dVar2.mo1268d())) && (i < 0 || i != dVar2.f1357m)) {
                            break;
                        }
                    }
                }
            } else {
                i3 = -1;
            }
            if (i3 == this.f1519l.size() - 1) {
                return false;
            }
            for (int size2 = this.f1519l.size() - 1; size2 > i3; size2--) {
                arrayList.add(this.f1519l.remove(size2));
                arrayList2.add(true);
            }
        }
        return true;
    }

    /* renamed from: b */
    public int mo1548b(C0321d dVar) {
        synchronized (this) {
            if (this.f1522o != null) {
                if (this.f1522o.size() > 0) {
                    int intValue = this.f1522o.remove(this.f1522o.size() - 1).intValue();
                    if (f1498a) {
                        Log.v("FragmentManager", "Adding back stack index " + intValue + " with " + dVar);
                    }
                    this.f1521n.set(intValue, dVar);
                    return intValue;
                }
            }
            if (this.f1521n == null) {
                this.f1521n = new ArrayList<>();
            }
            int size = this.f1521n.size();
            if (f1498a) {
                Log.v("FragmentManager", "Setting back stack index " + size + " to " + dVar);
            }
            this.f1521n.add(dVar);
            return size;
        }
    }

    /* renamed from: b */
    public C0339l mo1549b(String str) {
        C0339l a;
        SparseArray<C0339l> sparseArray = this.f1518k;
        if (sparseArray == null || str == null) {
            return null;
        }
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            C0339l valueAt = this.f1518k.valueAt(size);
            if (valueAt != null && (a = valueAt.mo1336a(str)) != null) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: b */
    public void mo1550b(int i) {
        synchronized (this) {
            this.f1521n.set(i, (Object) null);
            if (this.f1522o == null) {
                this.f1522o = new ArrayList<>();
            }
            if (f1498a) {
                Log.v("FragmentManager", "Freeing back stack index " + i);
            }
            this.f1522o.add(Integer.valueOf(i));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1551b(C0339l lVar) {
        Animator animator;
        if (lVar.f1406K != null) {
            C0363c a = mo1528a(lVar, lVar.mo1411p(), !lVar.f1398C, lVar.mo1412q());
            if (a == null || (animator = a.f1537b) == null) {
                if (a != null) {
                    m1730b(lVar.f1406K, a);
                    lVar.f1406K.startAnimation(a.f1536a);
                    a.f1536a.start();
                }
                lVar.f1406K.setVisibility((!lVar.f1398C || lVar.mo1318E()) ? 0 : 8);
                if (lVar.mo1318E()) {
                    lVar.mo1389f(false);
                }
            } else {
                animator.setTarget(lVar.f1406K);
                if (!lVar.f1398C) {
                    lVar.f1406K.setVisibility(0);
                } else if (lVar.mo1318E()) {
                    lVar.mo1389f(false);
                } else {
                    ViewGroup viewGroup = lVar.f1405J;
                    View view = lVar.f1406K;
                    viewGroup.startViewTransition(view);
                    a.f1537b.addListener(new C0358w(this, viewGroup, view, lVar));
                }
                m1730b(lVar.f1406K, a);
                a.f1537b.start();
            }
        }
        if (lVar.f1428m && lVar.f1402G && lVar.f1403H) {
            this.f1530w = true;
        }
        lVar.f1413R = false;
        lVar.mo1361a(lVar.f1398C);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1552b(C0339l lVar, Context context, boolean z) {
        C0339l lVar2 = this.f1528u;
        if (lVar2 != null) {
            C0350r n = lVar2.mo1406n();
            if (n instanceof C0360y) {
                ((C0360y) n).mo1552b(lVar, context, true);
            }
        }
        Iterator<C1096m<C0350r.C0352b, Boolean>> it = this.f1524q.iterator();
        while (it.hasNext()) {
            C1096m next = it.next();
            if (!z || ((Boolean) next.f4079b).booleanValue()) {
                ((C0350r.C0352b) next.f4078a).mo1509b((C0350r) this, lVar, context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1553b(C0339l lVar, Bundle bundle, boolean z) {
        C0339l lVar2 = this.f1528u;
        if (lVar2 != null) {
            C0350r n = lVar2.mo1406n();
            if (n instanceof C0360y) {
                ((C0360y) n).mo1553b(lVar, bundle, true);
            }
        }
        Iterator<C1096m<C0350r.C0352b, Boolean>> it = this.f1524q.iterator();
        while (it.hasNext()) {
            C1096m next = it.next();
            if (!z || ((Boolean) next.f4079b).booleanValue()) {
                ((C0350r.C0352b) next.f4078a).mo1510b((C0350r) this, lVar, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1554b(C0339l lVar, boolean z) {
        C0339l lVar2 = this.f1528u;
        if (lVar2 != null) {
            C0350r n = lVar2.mo1406n();
            if (n instanceof C0360y) {
                ((C0360y) n).mo1554b(lVar, true);
            }
        }
        Iterator<C1096m<C0350r.C0352b, Boolean>> it = this.f1524q.iterator();
        while (it.hasNext()) {
            C1096m next = it.next();
            if (!z || ((Boolean) next.f4079b).booleanValue()) {
                ((C0350r.C0352b) next.f4078a).mo1504a(this, lVar);
            }
        }
    }

    /* renamed from: b */
    public void mo1555b(boolean z) {
        for (int size = this.f1517j.size() - 1; size >= 0; size--) {
            C0339l lVar = this.f1517j.get(size);
            if (lVar != null) {
                lVar.mo1385e(z);
            }
        }
    }

    /* renamed from: b */
    public boolean mo1498b() {
        boolean s = mo1593s();
        m1710F();
        return s;
    }

    /* renamed from: b */
    public boolean mo1556b(Menu menu) {
        if (this.f1525r < 1) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.f1517j.size(); i++) {
            C0339l lVar = this.f1517j.get(i);
            if (lVar != null && lVar.mo1381d(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b */
    public boolean mo1557b(MenuItem menuItem) {
        if (this.f1525r < 1) {
            return false;
        }
        for (int i = 0; i < this.f1517j.size(); i++) {
            C0339l lVar = this.f1517j.get(i);
            if (lVar != null && lVar.mo1382d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public int mo1499c() {
        ArrayList<C0321d> arrayList = this.f1519l;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: c */
    public void mo1558c(C0339l lVar) {
        if (f1498a) {
            Log.v("FragmentManager", "detach: " + lVar);
        }
        if (!lVar.f1399D) {
            lVar.f1399D = true;
            if (lVar.f1428m) {
                if (f1498a) {
                    Log.v("FragmentManager", "remove from detach: " + lVar);
                }
                synchronized (this.f1517j) {
                    this.f1517j.remove(lVar);
                }
                if (lVar.f1402G && lVar.f1403H) {
                    this.f1530w = true;
                }
                lVar.f1428m = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1559c(C0339l lVar, Bundle bundle, boolean z) {
        C0339l lVar2 = this.f1528u;
        if (lVar2 != null) {
            C0350r n = lVar2.mo1406n();
            if (n instanceof C0360y) {
                ((C0360y) n).mo1559c(lVar, bundle, true);
            }
        }
        Iterator<C1096m<C0350r.C0352b, Boolean>> it = this.f1524q.iterator();
        while (it.hasNext()) {
            C1096m next = it.next();
            if (!z || ((Boolean) next.f4079b).booleanValue()) {
                ((C0350r.C0352b) next.f4078a).mo1512c(this, lVar, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1560c(C0339l lVar, boolean z) {
        C0339l lVar2 = this.f1528u;
        if (lVar2 != null) {
            C0350r n = lVar2.mo1406n();
            if (n instanceof C0360y) {
                ((C0360y) n).mo1560c(lVar, true);
            }
        }
        Iterator<C1096m<C0350r.C0352b, Boolean>> it = this.f1524q.iterator();
        while (it.hasNext()) {
            C1096m next = it.next();
            if (!z || ((Boolean) next.f4079b).booleanValue()) {
                ((C0350r.C0352b) next.f4078a).mo1508b(this, lVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo1561c(int i) {
        return this.f1525r >= i;
    }

    /* renamed from: d */
    public List<C0339l> mo1500d() {
        List<C0339l> list;
        if (this.f1517j.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f1517j) {
            list = (List) this.f1517j.clone();
        }
        return list;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo1562d(C0339l lVar) {
        if (lVar.f1430o && !lVar.f1433r) {
            lVar.f1406K = lVar.mo1365b(lVar.mo1397i(lVar.f1419d), (ViewGroup) null, lVar.f1419d);
            View view = lVar.f1406K;
            if (view != null) {
                lVar.f1407L = view;
                view.setSaveFromParentEnabled(false);
                if (lVar.f1398C) {
                    lVar.f1406K.setVisibility(8);
                }
                lVar.mo1359a(lVar.f1406K, lVar.f1419d);
                mo1539a(lVar, lVar.f1406K, lVar.f1419d, false);
                return;
            }
            lVar.f1407L = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo1563d(C0339l lVar, Bundle bundle, boolean z) {
        C0339l lVar2 = this.f1528u;
        if (lVar2 != null) {
            C0350r n = lVar2.mo1406n();
            if (n instanceof C0360y) {
                ((C0360y) n).mo1563d(lVar, bundle, true);
            }
        }
        Iterator<C1096m<C0350r.C0352b, Boolean>> it = this.f1524q.iterator();
        while (it.hasNext()) {
            C1096m next = it.next();
            if (!z || ((Boolean) next.f4079b).booleanValue()) {
                ((C0350r.C0352b) next.f4078a).mo1514d(this, lVar, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo1564d(C0339l lVar, boolean z) {
        C0339l lVar2 = this.f1528u;
        if (lVar2 != null) {
            C0350r n = lVar2.mo1406n();
            if (n instanceof C0360y) {
                ((C0360y) n).mo1564d(lVar, true);
            }
        }
        Iterator<C1096m<C0350r.C0352b, Boolean>> it = this.f1524q.iterator();
        while (it.hasNext()) {
            C1096m next = it.next();
            if (!z || ((Boolean) next.f4079b).booleanValue()) {
                ((C0350r.C0352b) next.f4078a).mo1511c(this, lVar);
            }
        }
    }

    /* renamed from: e */
    public void mo1565e(C0339l lVar) {
        if (f1498a) {
            Log.v("FragmentManager", "hide: " + lVar);
        }
        if (!lVar.f1398C) {
            lVar.f1398C = true;
            lVar.f1413R = true ^ lVar.f1413R;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo1566e(C0339l lVar, boolean z) {
        C0339l lVar2 = this.f1528u;
        if (lVar2 != null) {
            C0350r n = lVar2.mo1406n();
            if (n instanceof C0360y) {
                ((C0360y) n).mo1566e(lVar, true);
            }
        }
        Iterator<C1096m<C0350r.C0352b, Boolean>> it = this.f1524q.iterator();
        while (it.hasNext()) {
            C1096m next = it.next();
            if (!z || ((Boolean) next.f4079b).booleanValue()) {
                ((C0350r.C0352b) next.f4078a).mo1513d(this, lVar);
            }
        }
    }

    /* renamed from: e */
    public boolean mo1501e() {
        return this.f1531x || this.f1532y;
    }

    /* renamed from: f */
    public void mo1502f() {
        mo1542a((C0367g) new C0368h((String) null, -1, 0), false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo1567f(C0339l lVar) {
        if (lVar.f1422g < 0) {
            int i = this.f1516i;
            this.f1516i = i + 1;
            lVar.mo1344a(i, this.f1528u);
            if (this.f1518k == null) {
                this.f1518k = new SparseArray<>();
            }
            this.f1518k.put(lVar.f1422g, lVar);
            if (f1498a) {
                Log.v("FragmentManager", "Allocated fragment index " + lVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo1568f(C0339l lVar, boolean z) {
        C0339l lVar2 = this.f1528u;
        if (lVar2 != null) {
            C0350r n = lVar2.mo1406n();
            if (n instanceof C0360y) {
                ((C0360y) n).mo1568f(lVar, true);
            }
        }
        Iterator<C1096m<C0350r.C0352b, Boolean>> it = this.f1524q.iterator();
        while (it.hasNext()) {
            C1096m next = it.next();
            if (!z || ((Boolean) next.f4079b).booleanValue()) {
                ((C0350r.C0352b) next.f4078a).mo1515e(this, lVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo1569g(C0339l lVar) {
        if (lVar.f1422g >= 0) {
            if (f1498a) {
                Log.v("FragmentManager", "Freeing fragment index " + lVar);
            }
            this.f1518k.put(lVar.f1422g, (Object) null);
            lVar.mo1314A();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo1570g(C0339l lVar, boolean z) {
        C0339l lVar2 = this.f1528u;
        if (lVar2 != null) {
            C0350r n = lVar2.mo1406n();
            if (n instanceof C0360y) {
                ((C0360y) n).mo1570g(lVar, true);
            }
        }
        Iterator<C1096m<C0350r.C0352b, Boolean>> it = this.f1524q.iterator();
        while (it.hasNext()) {
            C1096m next = it.next();
            if (!z || ((Boolean) next.f4079b).booleanValue()) {
                ((C0350r.C0352b) next.f4078a).mo1516f(this, lVar);
            }
        }
    }

    /* renamed from: g */
    public boolean mo1503g() {
        m1707C();
        return m1728a((String) null, -1, 0);
    }

    /* renamed from: h */
    public void mo1571h() {
        this.f1531x = false;
        this.f1532y = false;
        m1737e(2);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        r0 = r0.f1406K;
        r1 = r11.f1405J;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1572h(android.support.p007v4.app.C0339l r11) {
        /*
            r10 = this;
            if (r11 != 0) goto L_0x0003
            return
        L_0x0003:
            int r0 = r10.f1525r
            boolean r1 = r11.f1429n
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001a
            boolean r1 = r11.mo1319F()
            if (r1 == 0) goto L_0x0016
            int r0 = java.lang.Math.min(r0, r2)
            goto L_0x001a
        L_0x0016:
            int r0 = java.lang.Math.min(r0, r3)
        L_0x001a:
            r6 = r0
            int r7 = r11.mo1411p()
            int r8 = r11.mo1412q()
            r9 = 0
            r4 = r10
            r5 = r11
            r4.mo1536a((android.support.p007v4.app.C0339l) r5, (int) r6, (int) r7, (int) r8, (boolean) r9)
            android.view.View r0 = r11.f1406K
            if (r0 == 0) goto L_0x008c
            android.support.v4.app.l r0 = r10.m1738p(r11)
            if (r0 == 0) goto L_0x004b
            android.view.View r0 = r0.f1406K
            android.view.ViewGroup r1 = r11.f1405J
            int r0 = r1.indexOfChild(r0)
            android.view.View r4 = r11.f1406K
            int r4 = r1.indexOfChild(r4)
            if (r4 >= r0) goto L_0x004b
            r1.removeViewAt(r4)
            android.view.View r4 = r11.f1406K
            r1.addView(r4, r0)
        L_0x004b:
            boolean r0 = r11.f1412Q
            if (r0 == 0) goto L_0x008c
            android.view.ViewGroup r0 = r11.f1405J
            if (r0 == 0) goto L_0x008c
            float r0 = r11.f1414S
            r1 = 0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x005f
            android.view.View r4 = r11.f1406K
            r4.setAlpha(r0)
        L_0x005f:
            r11.f1414S = r1
            r11.f1412Q = r3
            int r0 = r11.mo1411p()
            int r1 = r11.mo1412q()
            android.support.v4.app.y$c r0 = r10.mo1528a((android.support.p007v4.app.C0339l) r11, (int) r0, (boolean) r2, (int) r1)
            if (r0 == 0) goto L_0x008c
            android.view.View r1 = r11.f1406K
            m1730b((android.view.View) r1, (android.support.p007v4.app.C0360y.C0363c) r0)
            android.view.animation.Animation r1 = r0.f1536a
            if (r1 == 0) goto L_0x0080
            android.view.View r0 = r11.f1406K
            r0.startAnimation(r1)
            goto L_0x008c
        L_0x0080:
            android.animation.Animator r1 = r0.f1537b
            android.view.View r2 = r11.f1406K
            r1.setTarget(r2)
            android.animation.Animator r0 = r0.f1537b
            r0.start()
        L_0x008c:
            boolean r0 = r11.f1413R
            if (r0 == 0) goto L_0x0093
            r10.mo1551b((android.support.p007v4.app.C0339l) r11)
        L_0x0093:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p007v4.app.C0360y.mo1572h(android.support.v4.app.l):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo1573h(C0339l lVar, boolean z) {
        C0339l lVar2 = this.f1528u;
        if (lVar2 != null) {
            C0350r n = lVar2.mo1406n();
            if (n instanceof C0360y) {
                ((C0360y) n).mo1573h(lVar, true);
            }
        }
        Iterator<C1096m<C0350r.C0352b, Boolean>> it = this.f1524q.iterator();
        while (it.hasNext()) {
            C1096m next = it.next();
            if (!z || ((Boolean) next.f4079b).booleanValue()) {
                ((C0350r.C0352b) next.f4078a).mo1517g(this, lVar);
            }
        }
    }

    /* renamed from: i */
    public void mo1574i() {
        this.f1531x = false;
        this.f1532y = false;
        m1737e(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo1575i(C0339l lVar) {
        mo1536a(lVar, this.f1525r, 0, 0, false);
    }

    /* renamed from: j */
    public void mo1576j() {
        this.f1533z = true;
        mo1593s();
        m1737e(0);
        this.f1526s = null;
        this.f1527t = null;
        this.f1528u = null;
    }

    /* renamed from: j */
    public void mo1577j(C0339l lVar) {
        if (!lVar.f1408M) {
            return;
        }
        if (this.f1515h) {
            this.f1505B = true;
            return;
        }
        lVar.f1408M = false;
        mo1536a(lVar, this.f1525r, 0, 0, false);
    }

    /* renamed from: k */
    public void mo1578k() {
        m1737e(1);
    }

    /* renamed from: k */
    public void mo1579k(C0339l lVar) {
        if (f1498a) {
            Log.v("FragmentManager", "remove: " + lVar + " nesting=" + lVar.f1434s);
        }
        boolean z = !lVar.mo1319F();
        if (!lVar.f1399D || z) {
            synchronized (this.f1517j) {
                this.f1517j.remove(lVar);
            }
            if (lVar.f1402G && lVar.f1403H) {
                this.f1530w = true;
            }
            lVar.f1428m = false;
            lVar.f1429n = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public Bundle mo1580l(C0339l lVar) {
        Bundle bundle;
        if (this.f1509F == null) {
            this.f1509F = new Bundle();
        }
        lVar.mo1399j(this.f1509F);
        mo1563d(lVar, this.f1509F, false);
        if (!this.f1509F.isEmpty()) {
            bundle = this.f1509F;
            this.f1509F = null;
        } else {
            bundle = null;
        }
        if (lVar.f1406K != null) {
            mo1583m(lVar);
        }
        if (lVar.f1420e != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", lVar.f1420e);
        }
        if (!lVar.f1409N) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", lVar.f1409N);
        }
        return bundle;
    }

    /* renamed from: l */
    public void mo1581l() {
        for (int i = 0; i < this.f1517j.size(); i++) {
            C0339l lVar = this.f1517j.get(i);
            if (lVar != null) {
                lVar.mo1332W();
            }
        }
    }

    /* renamed from: m */
    public void mo1582m() {
        m1737e(4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo1583m(C0339l lVar) {
        if (lVar.f1407L != null) {
            SparseArray<Parcelable> sparseArray = this.f1510G;
            if (sparseArray == null) {
                this.f1510G = new SparseArray<>();
            } else {
                sparseArray.clear();
            }
            lVar.f1407L.saveHierarchyState(this.f1510G);
            if (this.f1510G.size() > 0) {
                lVar.f1420e = this.f1510G;
                this.f1510G = null;
            }
        }
    }

    /* renamed from: n */
    public void mo1584n() {
        m1737e(2);
    }

    /* renamed from: n */
    public void mo1585n(C0339l lVar) {
        if (lVar == null || (this.f1518k.get(lVar.f1422g) == lVar && (lVar.f1436u == null || lVar.mo1406n() == this))) {
            this.f1529v = lVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + lVar + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: o */
    public void mo1586o() {
        this.f1531x = false;
        this.f1532y = false;
        m1737e(5);
    }

    /* renamed from: o */
    public void mo1587o(C0339l lVar) {
        if (f1498a) {
            Log.v("FragmentManager", "show: " + lVar);
        }
        if (lVar.f1398C) {
            lVar.f1398C = false;
            lVar.f1413R = !lVar.f1413R;
        }
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C0339l lVar;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        String str2 = str;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet2.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, C0366f.f1543a);
        int i = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        String str3 = attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!C0339l.m1489a(this.f1526s.mo1491c(), str3)) {
            return null;
        }
        if (view != null) {
            i = view.getId();
        }
        if (i == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str3);
        }
        C0339l a = resourceId != -1 ? mo1526a(resourceId) : null;
        if (a == null && string != null) {
            a = mo1495a(string);
        }
        if (a == null && i != -1) {
            a = mo1526a(i);
        }
        if (f1498a) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + str3 + " existing=" + a);
        }
        if (a == null) {
            C0339l a2 = this.f1527t.mo1311a(context, str3, (Bundle) null);
            a2.f1430o = true;
            a2.f1441z = resourceId != 0 ? resourceId : i;
            a2.f1396A = i;
            a2.f1397B = string;
            a2.f1431p = true;
            a2.f1435t = this;
            C0349q qVar = this.f1526s;
            a2.f1436u = qVar;
            a2.mo1349a(qVar.mo1491c(), attributeSet2, a2.f1419d);
            mo1540a(a2, true);
            lVar = a2;
        } else if (!a.f1431p) {
            a.f1431p = true;
            C0349q qVar2 = this.f1526s;
            a.f1436u = qVar2;
            if (!a.f1401F) {
                a.mo1349a(qVar2.mo1491c(), attributeSet2, a.f1419d);
            }
            lVar = a;
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i) + " with another fragment for " + str3);
        }
        if (this.f1525r >= 1 || !lVar.f1430o) {
            mo1575i(lVar);
        } else {
            mo1536a(lVar, 1, 0, 0, false);
        }
        View view2 = lVar.f1406K;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (lVar.f1406K.getTag() == null) {
                lVar.f1406K.setTag(string);
            }
            return lVar.f1406K;
        }
        throw new IllegalStateException("Fragment " + str3 + " did not create a view.");
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    /* renamed from: p */
    public void mo1590p() {
        this.f1531x = false;
        this.f1532y = false;
        m1737e(4);
    }

    /* renamed from: q */
    public void mo1591q() {
        this.f1532y = true;
        m1737e(3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo1592r() {
        if (this.f1505B) {
            this.f1505B = false;
            mo1525A();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: s */
    public boolean mo1593s() {
        m1735c(true);
        boolean z = false;
        while (m1733b(this.f1506C, this.f1507D)) {
            this.f1515h = true;
            try {
                m1734c(this.f1506C, this.f1507D);
                m1708D();
                z = true;
            } catch (Throwable th) {
                m1708D();
                throw th;
            }
        }
        mo1592r();
        m1706B();
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public LayoutInflater.Factory2 mo1594t() {
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Object obj = this.f1528u;
        if (obj == null) {
            obj = this.f1526s;
        }
        C1085g.m5639a(obj, sb);
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: u */
    public C0339l mo1596u() {
        return this.f1529v;
    }

    /* renamed from: v */
    public void mo1597v() {
        this.f1512I = null;
        this.f1531x = false;
        this.f1532y = false;
        int size = this.f1517j.size();
        for (int i = 0; i < size; i++) {
            C0339l lVar = this.f1517j.get(i);
            if (lVar != null) {
                lVar.mo1323J();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo1598w() {
        if (this.f1523p != null) {
            for (int i = 0; i < this.f1523p.size(); i++) {
                this.f1523p.get(i).onBackStackChanged();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public C0370z mo1599x() {
        m1720a(this.f1512I);
        return this.f1512I;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public Parcelable mo1600y() {
        int[] iArr;
        int size;
        m1710F();
        m1709E();
        mo1593s();
        this.f1531x = true;
        BackStackState[] backStackStateArr = null;
        this.f1512I = null;
        SparseArray<C0339l> sparseArray = this.f1518k;
        if (sparseArray == null || sparseArray.size() <= 0) {
            return null;
        }
        int size2 = this.f1518k.size();
        FragmentState[] fragmentStateArr = new FragmentState[size2];
        boolean z = false;
        for (int i = 0; i < size2; i++) {
            C0339l valueAt = this.f1518k.valueAt(i);
            if (valueAt != null) {
                if (valueAt.f1422g >= 0) {
                    FragmentState fragmentState = new FragmentState(valueAt);
                    fragmentStateArr[i] = fragmentState;
                    if (valueAt.f1418c <= 0 || fragmentState.f1165k != null) {
                        fragmentState.f1165k = valueAt.f1419d;
                    } else {
                        fragmentState.f1165k = mo1580l(valueAt);
                        C0339l lVar = valueAt.f1425j;
                        if (lVar != null) {
                            if (lVar.f1422g >= 0) {
                                if (fragmentState.f1165k == null) {
                                    fragmentState.f1165k = new Bundle();
                                }
                                mo1532a(fragmentState.f1165k, "android:target_state", valueAt.f1425j);
                                int i2 = valueAt.f1427l;
                                if (i2 != 0) {
                                    fragmentState.f1165k.putInt("android:target_req_state", i2);
                                }
                            } else {
                                m1722a((RuntimeException) new IllegalStateException("Failure saving state: " + valueAt + " has target not in fragment manager: " + valueAt.f1425j));
                                throw null;
                            }
                        }
                    }
                    if (f1498a) {
                        Log.v("FragmentManager", "Saved state of " + valueAt + ": " + fragmentState.f1165k);
                    }
                    z = true;
                } else {
                    m1722a((RuntimeException) new IllegalStateException("Failure saving state: active " + valueAt + " has cleared index: " + valueAt.f1422g));
                    throw null;
                }
            }
        }
        if (!z) {
            if (f1498a) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        int size3 = this.f1517j.size();
        if (size3 > 0) {
            iArr = new int[size3];
            int i3 = 0;
            while (i3 < size3) {
                iArr[i3] = this.f1517j.get(i3).f1422g;
                if (iArr[i3] >= 0) {
                    if (f1498a) {
                        Log.v("FragmentManager", "saveAllState: adding fragment #" + i3 + ": " + this.f1517j.get(i3));
                    }
                    i3++;
                } else {
                    m1722a((RuntimeException) new IllegalStateException("Failure saving state: active " + this.f1517j.get(i3) + " has cleared index: " + iArr[i3]));
                    throw null;
                }
            }
        } else {
            iArr = null;
        }
        ArrayList<C0321d> arrayList = this.f1519l;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            for (int i4 = 0; i4 < size; i4++) {
                backStackStateArr[i4] = new BackStackState(this.f1519l.get(i4));
                if (f1498a) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i4 + ": " + this.f1519l.get(i4));
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f1150a = fragmentStateArr;
        fragmentManagerState.f1151b = iArr;
        fragmentManagerState.f1152c = backStackStateArr;
        C0339l lVar2 = this.f1529v;
        if (lVar2 != null) {
            fragmentManagerState.f1153d = lVar2.f1422g;
        }
        fragmentManagerState.f1154e = this.f1516i;
        mo1601z();
        return fragmentManagerState;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo1601z() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        C0370z zVar;
        if (this.f1518k != null) {
            arrayList3 = null;
            arrayList2 = null;
            arrayList = null;
            for (int i = 0; i < this.f1518k.size(); i++) {
                C0339l valueAt = this.f1518k.valueAt(i);
                if (valueAt != null) {
                    if (valueAt.f1400E) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(valueAt);
                        C0339l lVar = valueAt.f1425j;
                        valueAt.f1426k = lVar != null ? lVar.f1422g : -1;
                        if (f1498a) {
                            Log.v("FragmentManager", "retainNonConfig: keeping retained " + valueAt);
                        }
                    }
                    C0360y yVar = valueAt.f1437v;
                    if (yVar != null) {
                        yVar.mo1601z();
                        zVar = valueAt.f1437v.f1512I;
                    } else {
                        zVar = valueAt.f1438w;
                    }
                    if (arrayList2 == null && zVar != null) {
                        arrayList2 = new ArrayList(this.f1518k.size());
                        for (int i2 = 0; i2 < i; i2++) {
                            arrayList2.add((Object) null);
                        }
                    }
                    if (arrayList2 != null) {
                        arrayList2.add(zVar);
                    }
                    if (arrayList == null && valueAt.f1439x != null) {
                        arrayList = new ArrayList(this.f1518k.size());
                        for (int i3 = 0; i3 < i; i3++) {
                            arrayList.add((Object) null);
                        }
                    }
                    if (arrayList != null) {
                        arrayList.add(valueAt.f1439x);
                    }
                }
            }
        } else {
            arrayList3 = null;
            arrayList2 = null;
            arrayList = null;
        }
        if (arrayList3 == null && arrayList2 == null && arrayList == null) {
            this.f1512I = null;
        } else {
            this.f1512I = new C0370z(arrayList3, arrayList2, arrayList);
        }
    }
}
