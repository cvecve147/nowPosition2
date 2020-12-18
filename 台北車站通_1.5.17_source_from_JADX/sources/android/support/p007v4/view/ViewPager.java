package android.support.p007v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.p007v4.view.p009a.C0446b;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p013b.p018b.p028h.p029a.C1006a;

/* renamed from: android.support.v4.view.ViewPager */
public class ViewPager extends ViewGroup {

    /* renamed from: a */
    static final int[] f1661a = {16842931};

    /* renamed from: b */
    private static final Comparator<C0436b> f1662b = new C0504z();

    /* renamed from: c */
    private static final Interpolator f1663c = new C0418A();

    /* renamed from: d */
    private static final C0443i f1664d = new C0443i();

    /* renamed from: A */
    private boolean f1665A;

    /* renamed from: B */
    private int f1666B = 1;

    /* renamed from: C */
    private boolean f1667C;

    /* renamed from: D */
    private boolean f1668D;

    /* renamed from: E */
    private int f1669E;

    /* renamed from: F */
    private int f1670F;

    /* renamed from: G */
    private int f1671G;

    /* renamed from: H */
    private float f1672H;

    /* renamed from: I */
    private float f1673I;

    /* renamed from: J */
    private float f1674J;

    /* renamed from: K */
    private float f1675K;

    /* renamed from: L */
    private int f1676L = -1;

    /* renamed from: M */
    private VelocityTracker f1677M;

    /* renamed from: N */
    private int f1678N;

    /* renamed from: O */
    private int f1679O;

    /* renamed from: P */
    private int f1680P;

    /* renamed from: Q */
    private int f1681Q;

    /* renamed from: R */
    private boolean f1682R;

    /* renamed from: S */
    private long f1683S;

    /* renamed from: T */
    private EdgeEffect f1684T;

    /* renamed from: U */
    private EdgeEffect f1685U;

    /* renamed from: V */
    private boolean f1686V = true;

    /* renamed from: W */
    private boolean f1687W = false;

    /* renamed from: aa */
    private boolean f1688aa;

    /* renamed from: ba */
    private int f1689ba;

    /* renamed from: ca */
    private List<C0440f> f1690ca;

    /* renamed from: da */
    private C0440f f1691da;

    /* renamed from: e */
    private int f1692e;

    /* renamed from: ea */
    private C0440f f1693ea;

    /* renamed from: f */
    private final ArrayList<C0436b> f1694f = new ArrayList<>();

    /* renamed from: fa */
    private List<C0439e> f1695fa;

    /* renamed from: g */
    private final C0436b f1696g = new C0436b();

    /* renamed from: ga */
    private C0441g f1697ga;

    /* renamed from: h */
    private final Rect f1698h = new Rect();

    /* renamed from: ha */
    private int f1699ha;

    /* renamed from: i */
    C0483r f1700i;

    /* renamed from: ia */
    private int f1701ia;

    /* renamed from: j */
    int f1702j;

    /* renamed from: ja */
    private ArrayList<View> f1703ja;

    /* renamed from: k */
    private int f1704k = -1;

    /* renamed from: ka */
    private final Runnable f1705ka = new C0420B(this);

    /* renamed from: l */
    private Parcelable f1706l = null;

    /* renamed from: la */
    private int f1707la = 0;

    /* renamed from: m */
    private ClassLoader f1708m = null;

    /* renamed from: n */
    private Scroller f1709n;

    /* renamed from: o */
    private boolean f1710o;

    /* renamed from: p */
    private C0442h f1711p;

    /* renamed from: q */
    private int f1712q;

    /* renamed from: r */
    private Drawable f1713r;

    /* renamed from: s */
    private int f1714s;

    /* renamed from: t */
    private int f1715t;

    /* renamed from: u */
    private float f1716u = -3.4028235E38f;

    /* renamed from: v */
    private float f1717v = Float.MAX_VALUE;

    /* renamed from: w */
    private int f1718w;

    /* renamed from: x */
    private int f1719x;

    /* renamed from: y */
    private boolean f1720y;

    /* renamed from: z */
    private boolean f1721z;

    /* renamed from: android.support.v4.view.ViewPager$SavedState */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0422D();

        /* renamed from: a */
        int f1722a;

        /* renamed from: b */
        Parcelable f1723b;

        /* renamed from: c */
        ClassLoader f1724c;

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? SavedState.class.getClassLoader() : classLoader;
            this.f1722a = parcel.readInt();
            this.f1723b = parcel.readParcelable(classLoader);
            this.f1724c = classLoader;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f1722a + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1722a);
            parcel.writeParcelable(this.f1723b, i);
        }
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: android.support.v4.view.ViewPager$a */
    public @interface C0435a {
    }

    /* renamed from: android.support.v4.view.ViewPager$b */
    static class C0436b {

        /* renamed from: a */
        Object f1725a;

        /* renamed from: b */
        int f1726b;

        /* renamed from: c */
        boolean f1727c;

        /* renamed from: d */
        float f1728d;

        /* renamed from: e */
        float f1729e;

        C0436b() {
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$c */
    public static class C0437c extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f1730a;

        /* renamed from: b */
        public int f1731b;

        /* renamed from: c */
        float f1732c = 0.0f;

        /* renamed from: d */
        boolean f1733d;

        /* renamed from: e */
        int f1734e;

        /* renamed from: f */
        int f1735f;

        public C0437c() {
            super(-1, -1);
        }

        public C0437c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f1661a);
            this.f1731b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$d */
    class C0438d extends C0459c {
        C0438d() {
        }

        /* renamed from: b */
        private boolean m2074b() {
            C0483r rVar = ViewPager.this.f1700i;
            return rVar != null && rVar.mo1972a() > 1;
        }

        /* renamed from: a */
        public void mo309a(View view, C0446b bVar) {
            super.mo309a(view, bVar);
            bVar.mo1857a((CharSequence) ViewPager.class.getName());
            bVar.mo1890j(m2074b());
            if (ViewPager.this.canScrollHorizontally(1)) {
                bVar.mo1854a((int) SVGParser.ENTITY_WATCH_BUFFER_SIZE);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                bVar.mo1854a(8192);
            }
        }

        /* renamed from: a */
        public boolean mo1844a(View view, int i, Bundle bundle) {
            ViewPager viewPager;
            int i2;
            if (super.mo1844a(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                viewPager = ViewPager.this;
                i2 = viewPager.f1702j - 1;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                viewPager = ViewPager.this;
                i2 = viewPager.f1702j + 1;
            }
            viewPager.setCurrentItem(i2);
            return true;
        }

        /* renamed from: b */
        public void mo832b(View view, AccessibilityEvent accessibilityEvent) {
            C0483r rVar;
            super.mo832b(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(m2074b());
            if (accessibilityEvent.getEventType() == 4096 && (rVar = ViewPager.this.f1700i) != null) {
                accessibilityEvent.setItemCount(rVar.mo1972a());
                accessibilityEvent.setFromIndex(ViewPager.this.f1702j);
                accessibilityEvent.setToIndex(ViewPager.this.f1702j);
            }
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$e */
    public interface C0439e {
        /* renamed from: a */
        void mo746a(ViewPager viewPager, C0483r rVar, C0483r rVar2);
    }

    /* renamed from: android.support.v4.view.ViewPager$f */
    public interface C0440f {
        /* renamed from: a */
        void mo781a(int i);

        /* renamed from: a */
        void mo782a(int i, float f, int i2);

        /* renamed from: b */
        void mo783b(int i);
    }

    /* renamed from: android.support.v4.view.ViewPager$g */
    public interface C0441g {
        /* renamed from: a */
        void mo1845a(View view, float f);
    }

    /* renamed from: android.support.v4.view.ViewPager$h */
    private class C0442h extends DataSetObserver {
        C0442h() {
        }

        public void onChanged() {
            ViewPager.this.mo1796b();
        }

        public void onInvalidated() {
            ViewPager.this.mo1796b();
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$i */
    static class C0443i implements Comparator<View> {
        C0443i() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            C0437c cVar = (C0437c) view.getLayoutParams();
            C0437c cVar2 = (C0437c) view2.getLayoutParams();
            boolean z = cVar.f1730a;
            return z != cVar2.f1730a ? z ? 1 : -1 : cVar.f1734e - cVar2.f1734e;
        }
    }

    public ViewPager(Context context) {
        super(context);
        mo1805d();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo1805d();
    }

    /* renamed from: a */
    private int m2026a(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.f1680P || Math.abs(i2) <= this.f1678N) {
            i += (int) (f + (i >= this.f1702j ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.f1694f.size() <= 0) {
            return i;
        }
        ArrayList<C0436b> arrayList = this.f1694f;
        return Math.max(this.f1694f.get(0).f1726b, Math.min(i, arrayList.get(arrayList.size() - 1).f1726b));
    }

    /* renamed from: a */
    private Rect m2027a(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* renamed from: a */
    private void m2028a(int i, int i2, int i3, int i4) {
        int min;
        if (i2 <= 0 || this.f1694f.isEmpty()) {
            C0436b b = mo1794b(this.f1702j);
            min = (int) ((b != null ? Math.min(b.f1729e, this.f1717v) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                m2032a(false);
            } else {
                return;
            }
        } else if (!this.f1709n.isFinished()) {
            this.f1709n.setFinalX(getCurrentItem() * getClientWidth());
            return;
        } else {
            min = (int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3)));
        }
        scrollTo(min, getScrollY());
    }

    /* renamed from: a */
    private void m2029a(int i, boolean z, int i2, boolean z2) {
        C0436b b = mo1794b(i);
        int clientWidth = b != null ? (int) (((float) getClientWidth()) * Math.max(this.f1716u, Math.min(b.f1729e, this.f1717v))) : 0;
        if (z) {
            mo1781a(clientWidth, 0, i2);
            if (z2) {
                m2039d(i);
                return;
            }
            return;
        }
        if (z2) {
            m2039d(i);
        }
        m2032a(false);
        scrollTo(clientWidth, 0);
        m2041f(clientWidth);
    }

    /* renamed from: a */
    private void m2030a(C0436b bVar, int i, C0436b bVar2) {
        int i2;
        int i3;
        C0436b bVar3;
        C0436b bVar4;
        int a = this.f1700i.mo1972a();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? ((float) this.f1712q) / ((float) clientWidth) : 0.0f;
        if (bVar2 != null) {
            int i4 = bVar2.f1726b;
            int i5 = bVar.f1726b;
            if (i4 < i5) {
                float f2 = bVar2.f1729e + bVar2.f1728d + f;
                int i6 = i4 + 1;
                int i7 = 0;
                while (i6 <= bVar.f1726b && i7 < this.f1694f.size()) {
                    while (true) {
                        bVar4 = this.f1694f.get(i7);
                        if (i6 > bVar4.f1726b && i7 < this.f1694f.size() - 1) {
                            i7++;
                        }
                    }
                    while (i6 < bVar4.f1726b) {
                        f2 += this.f1700i.mo1983b(i6) + f;
                        i6++;
                    }
                    bVar4.f1729e = f2;
                    f2 += bVar4.f1728d + f;
                    i6++;
                }
            } else if (i4 > i5) {
                int size = this.f1694f.size() - 1;
                float f3 = bVar2.f1729e;
                while (true) {
                    i4--;
                    if (i4 < bVar.f1726b || size < 0) {
                        break;
                    }
                    while (true) {
                        bVar3 = this.f1694f.get(size);
                        if (i4 < bVar3.f1726b && size > 0) {
                            size--;
                        }
                    }
                    while (i4 > bVar3.f1726b) {
                        f3 -= this.f1700i.mo1983b(i4) + f;
                        i4--;
                    }
                    f3 -= bVar3.f1728d + f;
                    bVar3.f1729e = f3;
                }
            }
        }
        int size2 = this.f1694f.size();
        float f4 = bVar.f1729e;
        int i8 = bVar.f1726b;
        int i9 = i8 - 1;
        this.f1716u = i8 == 0 ? f4 : -3.4028235E38f;
        int i10 = a - 1;
        this.f1717v = bVar.f1726b == i10 ? (bVar.f1729e + bVar.f1728d) - 1.0f : Float.MAX_VALUE;
        int i11 = i - 1;
        while (i11 >= 0) {
            C0436b bVar5 = this.f1694f.get(i11);
            while (true) {
                i3 = bVar5.f1726b;
                if (i9 <= i3) {
                    break;
                }
                f4 -= this.f1700i.mo1983b(i9) + f;
                i9--;
            }
            f4 -= bVar5.f1728d + f;
            bVar5.f1729e = f4;
            if (i3 == 0) {
                this.f1716u = f4;
            }
            i11--;
            i9--;
        }
        float f5 = bVar.f1729e + bVar.f1728d + f;
        int i12 = bVar.f1726b + 1;
        int i13 = i + 1;
        while (i13 < size2) {
            C0436b bVar6 = this.f1694f.get(i13);
            while (true) {
                i2 = bVar6.f1726b;
                if (i12 >= i2) {
                    break;
                }
                f5 += this.f1700i.mo1983b(i12) + f;
                i12++;
            }
            if (i2 == i10) {
                this.f1717v = (bVar6.f1728d + f5) - 1.0f;
            }
            bVar6.f1729e = f5;
            f5 += bVar6.f1728d + f;
            i13++;
            i12++;
        }
        this.f1687W = false;
    }

    /* renamed from: a */
    private void m2031a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1676L) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1672H = motionEvent.getX(i);
            this.f1676L = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f1677M;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: a */
    private void m2032a(boolean z) {
        boolean z2 = this.f1707la == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f1709n.isFinished()) {
                this.f1709n.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f1709n.getCurrX();
                int currY = this.f1709n.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m2041f(currX);
                    }
                }
            }
        }
        this.f1665A = false;
        boolean z3 = z2;
        for (int i = 0; i < this.f1694f.size(); i++) {
            C0436b bVar = this.f1694f.get(i);
            if (bVar.f1727c) {
                bVar.f1727c = false;
                z3 = true;
            }
        }
        if (!z3) {
            return;
        }
        if (z) {
            C0487v.m2277a((View) this, this.f1705ka);
        } else {
            this.f1705ka.run();
        }
    }

    /* renamed from: a */
    private boolean m2033a(float f, float f2) {
        return (f < ((float) this.f1670F) && f2 > 0.0f) || (f > ((float) (getWidth() - this.f1670F)) && f2 < 0.0f);
    }

    /* renamed from: b */
    private void m2034b(int i, float f, int i2) {
        C0440f fVar = this.f1691da;
        if (fVar != null) {
            fVar.mo782a(i, f, i2);
        }
        List<C0440f> list = this.f1690ca;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0440f fVar2 = this.f1690ca.get(i3);
                if (fVar2 != null) {
                    fVar2.mo782a(i, f, i2);
                }
            }
        }
        C0440f fVar3 = this.f1693ea;
        if (fVar3 != null) {
            fVar3.mo782a(i, f, i2);
        }
    }

    /* renamed from: b */
    private void m2035b(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.f1699ha : 0, (Paint) null);
        }
    }

    /* renamed from: c */
    private void m2036c(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* renamed from: c */
    private boolean m2037c(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f1672H - f;
        this.f1672H = f;
        float scrollX = ((float) getScrollX()) + f2;
        float clientWidth = (float) getClientWidth();
        float f3 = this.f1716u * clientWidth;
        float f4 = this.f1717v * clientWidth;
        boolean z3 = false;
        C0436b bVar = this.f1694f.get(0);
        ArrayList<C0436b> arrayList = this.f1694f;
        C0436b bVar2 = arrayList.get(arrayList.size() - 1);
        if (bVar.f1726b != 0) {
            f3 = bVar.f1729e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (bVar2.f1726b != this.f1700i.mo1972a() - 1) {
            f4 = bVar2.f1729e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.f1684T.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.f1685U.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f1672H += scrollX - ((float) i);
        scrollTo(i, getScrollY());
        m2041f(i);
        return z3;
    }

    /* renamed from: c */
    private static boolean m2038c(View view) {
        return view.getClass().getAnnotation(C0435a.class) != null;
    }

    /* renamed from: d */
    private void m2039d(int i) {
        C0440f fVar = this.f1691da;
        if (fVar != null) {
            fVar.mo783b(i);
        }
        List<C0440f> list = this.f1690ca;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0440f fVar2 = this.f1690ca.get(i2);
                if (fVar2 != null) {
                    fVar2.mo783b(i);
                }
            }
        }
        C0440f fVar3 = this.f1693ea;
        if (fVar3 != null) {
            fVar3.mo783b(i);
        }
    }

    /* renamed from: e */
    private void m2040e(int i) {
        C0440f fVar = this.f1691da;
        if (fVar != null) {
            fVar.mo781a(i);
        }
        List<C0440f> list = this.f1690ca;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0440f fVar2 = this.f1690ca.get(i2);
                if (fVar2 != null) {
                    fVar2.mo781a(i);
                }
            }
        }
        C0440f fVar3 = this.f1693ea;
        if (fVar3 != null) {
            fVar3.mo781a(i);
        }
    }

    /* renamed from: f */
    private boolean m2041f(int i) {
        if (this.f1694f.size() != 0) {
            C0436b j = m2043j();
            int clientWidth = getClientWidth();
            int i2 = this.f1712q;
            int i3 = clientWidth + i2;
            float f = (float) clientWidth;
            int i4 = j.f1726b;
            float f2 = ((((float) i) / f) - j.f1729e) / (j.f1728d + (((float) i2) / f));
            this.f1688aa = false;
            mo1780a(i4, f2, (int) (((float) i3) * f2));
            if (this.f1688aa) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.f1686V) {
            return false;
        } else {
            this.f1688aa = false;
            mo1780a(0, 0.0f, 0);
            if (this.f1688aa) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* renamed from: i */
    private void m2042i() {
        this.f1667C = false;
        this.f1668D = false;
        VelocityTracker velocityTracker = this.f1677M;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1677M = null;
        }
    }

    /* renamed from: j */
    private C0436b m2043j() {
        int i;
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f = clientWidth > 0 ? ((float) this.f1712q) / ((float) clientWidth) : 0.0f;
        C0436b bVar = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i2 = 0;
        int i3 = -1;
        boolean z = true;
        while (i2 < this.f1694f.size()) {
            C0436b bVar2 = this.f1694f.get(i2);
            if (!z && bVar2.f1726b != (i = i3 + 1)) {
                bVar2 = this.f1696g;
                bVar2.f1729e = f2 + f3 + f;
                bVar2.f1726b = i;
                bVar2.f1728d = this.f1700i.mo1983b(bVar2.f1726b);
                i2--;
            }
            f2 = bVar2.f1729e;
            float f4 = bVar2.f1728d + f2 + f;
            if (!z && scrollX < f2) {
                return bVar;
            }
            if (scrollX < f4 || i2 == this.f1694f.size() - 1) {
                return bVar2;
            }
            i3 = bVar2.f1726b;
            f3 = bVar2.f1728d;
            i2++;
            z = false;
            bVar = bVar2;
        }
        return bVar;
    }

    /* renamed from: k */
    private void m2044k() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((C0437c) getChildAt(i).getLayoutParams()).f1730a) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    /* renamed from: l */
    private boolean m2045l() {
        this.f1676L = -1;
        m2042i();
        this.f1684T.onRelease();
        this.f1685U.onRelease();
        return this.f1684T.isFinished() || this.f1685U.isFinished();
    }

    /* renamed from: m */
    private void m2046m() {
        if (this.f1701ia != 0) {
            ArrayList<View> arrayList = this.f1703ja;
            if (arrayList == null) {
                this.f1703ja = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f1703ja.add(getChildAt(i));
            }
            Collections.sort(this.f1703ja, f1664d);
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f1721z != z) {
            this.f1721z = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public float mo1777a(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0436b mo1778a(int i, int i2) {
        C0436b bVar = new C0436b();
        bVar.f1726b = i;
        bVar.f1725a = this.f1700i.mo1975a((ViewGroup) this, i);
        bVar.f1728d = this.f1700i.mo1983b(i);
        if (i2 < 0 || i2 >= this.f1694f.size()) {
            this.f1694f.add(bVar);
        } else {
            this.f1694f.add(i2, bVar);
        }
        return bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0436b mo1779a(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return mo1795b(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0066  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1780a(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.f1689ba
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x006d
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r4
            r4 = r3
            r3 = r1
        L_0x001d:
            if (r3 >= r6) goto L_0x006d
            android.view.View r8 = r12.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            android.support.v4.view.ViewPager$c r9 = (android.support.p007v4.view.ViewPager.C0437c) r9
            boolean r10 = r9.f1730a
            if (r10 != 0) goto L_0x002e
            goto L_0x006a
        L_0x002e:
            int r9 = r9.f1731b
            r9 = r9 & 7
            if (r9 == r2) goto L_0x004f
            r10 = 3
            if (r9 == r10) goto L_0x0049
            r10 = 5
            if (r9 == r10) goto L_0x003c
            r9 = r4
            goto L_0x005e
        L_0x003c:
            int r9 = r5 - r7
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r7 = r7 + r10
            goto L_0x005b
        L_0x0049:
            int r9 = r8.getWidth()
            int r9 = r9 + r4
            goto L_0x005e
        L_0x004f:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r4)
        L_0x005b:
            r11 = r9
            r9 = r4
            r4 = r11
        L_0x005e:
            int r4 = r4 + r0
            int r10 = r8.getLeft()
            int r4 = r4 - r10
            if (r4 == 0) goto L_0x0069
            r8.offsetLeftAndRight(r4)
        L_0x0069:
            r4 = r9
        L_0x006a:
            int r3 = r3 + 1
            goto L_0x001d
        L_0x006d:
            r12.m2034b(r13, r14, r15)
            android.support.v4.view.ViewPager$g r13 = r12.f1697ga
            if (r13 == 0) goto L_0x00a1
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L_0x007c:
            if (r1 >= r14) goto L_0x00a1
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            android.support.v4.view.ViewPager$c r0 = (android.support.p007v4.view.ViewPager.C0437c) r0
            boolean r0 = r0.f1730a
            if (r0 == 0) goto L_0x008d
            goto L_0x009e
        L_0x008d:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            android.support.v4.view.ViewPager$g r3 = r12.f1697ga
            r3.mo1845a(r15, r0)
        L_0x009e:
            int r1 = r1 + 1
            goto L_0x007c
        L_0x00a1:
            r12.f1688aa = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p007v4.view.ViewPager.mo1780a(int, float, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1781a(int i, int i2, int i3) {
        int i4;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f1709n;
        if (scroller != null && !scroller.isFinished()) {
            i4 = this.f1710o ? this.f1709n.getCurrX() : this.f1709n.getStartX();
            this.f1709n.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            i4 = getScrollX();
        }
        int i5 = i4;
        int scrollY = getScrollY();
        int i6 = i - i5;
        int i7 = i2 - scrollY;
        if (i6 == 0 && i7 == 0) {
            m2032a(false);
            mo1821h();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i8 = clientWidth / 2;
        float f = (float) clientWidth;
        float f2 = (float) i8;
        float a = f2 + (mo1777a(Math.min(1.0f, (((float) Math.abs(i6)) * 1.0f) / f)) * f2);
        int abs = Math.abs(i3);
        int min = Math.min(abs > 0 ? Math.round(Math.abs(a / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i6)) / ((f * this.f1700i.mo1983b(this.f1702j)) + ((float) this.f1712q))) + 1.0f) * 100.0f), 600);
        this.f1710o = false;
        this.f1709n.startScroll(i5, scrollY, i6, i7, min);
        C0487v.m2261B(this);
    }

    /* renamed from: a */
    public void mo1782a(int i, boolean z) {
        this.f1665A = false;
        mo1783a(i, z, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1783a(int i, boolean z, boolean z2) {
        mo1784a(i, z, z2, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1784a(int i, boolean z, boolean z2, int i2) {
        C0483r rVar = this.f1700i;
        if (rVar == null || rVar.mo1972a() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.f1702j != i || this.f1694f.size() == 0) {
            boolean z3 = true;
            if (i < 0) {
                i = 0;
            } else if (i >= this.f1700i.mo1972a()) {
                i = this.f1700i.mo1972a() - 1;
            }
            int i3 = this.f1666B;
            int i4 = this.f1702j;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.f1694f.size(); i5++) {
                    this.f1694f.get(i5).f1727c = true;
                }
            }
            if (this.f1702j == i) {
                z3 = false;
            }
            if (this.f1686V) {
                this.f1702j = i;
                if (z3) {
                    m2039d(i);
                }
                requestLayout();
                return;
            }
            mo1801c(i);
            m2029a(i, z, i2, z3);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    /* renamed from: a */
    public void mo1785a(C0439e eVar) {
        if (this.f1695fa == null) {
            this.f1695fa = new ArrayList();
        }
        this.f1695fa.add(eVar);
    }

    /* renamed from: a */
    public void mo1786a(C0440f fVar) {
        if (this.f1690ca == null) {
            this.f1690ca = new ArrayList();
        }
        this.f1690ca.add(fVar);
    }

    /* renamed from: a */
    public boolean mo1787a() {
        if (this.f1667C) {
            return false;
        }
        this.f1682R = true;
        setScrollState(1);
        this.f1672H = 0.0f;
        this.f1674J = 0.0f;
        VelocityTracker velocityTracker = this.f1677M;
        if (velocityTracker == null) {
            this.f1677M = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.f1677M.addMovement(obtain);
        obtain.recycle();
        this.f1683S = uptimeMillis;
        return true;
    }

    /* renamed from: a */
    public boolean mo1788a(int i) {
        boolean g;
        boolean z;
        View findFocus = findFocus();
        boolean z2 = false;
        View view = null;
        if (findFocus != this) {
            if (findFocus != null) {
                ViewParent parent = findFocus.getParent();
                while (true) {
                    if (!(parent instanceof ViewGroup)) {
                        z = false;
                        break;
                    } else if (parent == this) {
                        z = true;
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
                if (!z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(findFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ");
                        sb.append(parent2.getClass().getSimpleName());
                    }
                    Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
                }
            }
            view = findFocus;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        if (findNextFocus != null && findNextFocus != view) {
            if (i == 17) {
                int i2 = m2027a(this.f1698h, findNextFocus).left;
                int i3 = m2027a(this.f1698h, view).left;
                if (view != null && i2 >= i3) {
                    g = mo1811f();
                    z2 = g;
                }
            } else if (i == 66) {
                int i4 = m2027a(this.f1698h, findNextFocus).left;
                int i5 = m2027a(this.f1698h, view).left;
                if (view != null && i4 <= i5) {
                    g = mo1812g();
                    z2 = g;
                }
            }
            g = findNextFocus.requestFocus();
            z2 = g;
        } else if (i == 17 || i == 1) {
            z2 = mo1811f();
        } else if (i == 66 || i == 2) {
            z2 = mo1812g();
        }
        if (z2) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return z2;
    }

    /* renamed from: a */
    public boolean mo1789a(KeyEvent keyEvent) {
        int i;
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return mo1788a(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return mo1788a(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    return mo1812g();
                } else {
                    i = 66;
                }
            } else if (keyEvent.hasModifiers(2)) {
                return mo1811f();
            } else {
                i = 17;
            }
            return mo1788a(i);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo1790a(View view, boolean z, int i, int i2, int i3) {
        int i4;
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom()) {
                    if (mo1790a(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C0436b b;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (b = mo1795b(childAt)) != null && b.f1726b == this.f1702j) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        C0436b b;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (b = mo1795b(childAt)) != null && b.f1726b == this.f1702j) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C0437c cVar = (C0437c) layoutParams;
        cVar.f1730a |= m2038c(view);
        if (!this.f1720y) {
            super.addView(view, i, layoutParams);
        } else if (cVar == null || !cVar.f1730a) {
            cVar.f1733d = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0436b mo1794b(int i) {
        for (int i2 = 0; i2 < this.f1694f.size(); i2++) {
            C0436b bVar = this.f1694f.get(i2);
            if (bVar.f1726b == i) {
                return bVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0436b mo1795b(View view) {
        for (int i = 0; i < this.f1694f.size(); i++) {
            C0436b bVar = this.f1694f.get(i);
            if (this.f1700i.mo1982a(view, bVar.f1725a)) {
                return bVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1796b() {
        int a = this.f1700i.mo1972a();
        this.f1692e = a;
        boolean z = this.f1694f.size() < (this.f1666B * 2) + 1 && this.f1694f.size() < a;
        int i = this.f1702j;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.f1694f.size()) {
            C0436b bVar = this.f1694f.get(i2);
            int a2 = this.f1700i.mo1973a(bVar.f1725a);
            if (a2 != -1) {
                if (a2 == -2) {
                    this.f1694f.remove(i2);
                    i2--;
                    if (!z2) {
                        this.f1700i.mo1987b((ViewGroup) this);
                        z2 = true;
                    }
                    this.f1700i.mo1981a((ViewGroup) this, bVar.f1726b, bVar.f1725a);
                    int i3 = this.f1702j;
                    if (i3 == bVar.f1726b) {
                        i = Math.max(0, Math.min(i3, a - 1));
                    }
                } else {
                    int i4 = bVar.f1726b;
                    if (i4 != a2) {
                        if (i4 == this.f1702j) {
                            i = a2;
                        }
                        bVar.f1726b = a2;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.f1700i.mo1980a((ViewGroup) this);
        }
        Collections.sort(this.f1694f, f1662b);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                C0437c cVar = (C0437c) getChildAt(i5).getLayoutParams();
                if (!cVar.f1730a) {
                    cVar.f1732c = 0.0f;
                }
            }
            mo1783a(i, false, true);
            requestLayout();
        }
    }

    /* renamed from: b */
    public void mo1797b(float f) {
        if (!this.f1682R) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        } else if (this.f1700i != null) {
            this.f1672H += f;
            float scrollX = ((float) getScrollX()) - f;
            float clientWidth = (float) getClientWidth();
            float f2 = this.f1716u * clientWidth;
            float f3 = this.f1717v * clientWidth;
            C0436b bVar = this.f1694f.get(0);
            ArrayList<C0436b> arrayList = this.f1694f;
            C0436b bVar2 = arrayList.get(arrayList.size() - 1);
            if (bVar.f1726b != 0) {
                f2 = bVar.f1729e * clientWidth;
            }
            if (bVar2.f1726b != this.f1700i.mo1972a() - 1) {
                f3 = bVar2.f1729e * clientWidth;
            }
            if (scrollX < f2) {
                scrollX = f2;
            } else if (scrollX > f3) {
                scrollX = f3;
            }
            int i = (int) scrollX;
            this.f1672H += scrollX - ((float) i);
            scrollTo(i, getScrollY());
            m2041f(i);
            MotionEvent obtain = MotionEvent.obtain(this.f1683S, SystemClock.uptimeMillis(), 2, this.f1672H, 0.0f, 0);
            this.f1677M.addMovement(obtain);
            obtain.recycle();
        }
    }

    /* renamed from: b */
    public void mo1798b(C0439e eVar) {
        List<C0439e> list = this.f1695fa;
        if (list != null) {
            list.remove(eVar);
        }
    }

    /* renamed from: b */
    public void mo1799b(C0440f fVar) {
        List<C0440f> list = this.f1690ca;
        if (list != null) {
            list.remove(fVar);
        }
    }

    /* renamed from: c */
    public void mo1800c() {
        if (this.f1682R) {
            if (this.f1700i != null) {
                VelocityTracker velocityTracker = this.f1677M;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f1679O);
                int xVelocity = (int) velocityTracker.getXVelocity(this.f1676L);
                this.f1665A = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                C0436b j = m2043j();
                mo1784a(m2026a(j.f1726b, ((((float) scrollX) / ((float) clientWidth)) - j.f1729e) / j.f1728d, xVelocity, (int) (this.f1672H - this.f1674J)), true, true, xVelocity);
            }
            m2042i();
            this.f1682R = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r9 == r10) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c3, code lost:
        if (r15 >= 0) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d1, code lost:
        if (r15 >= 0) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00df, code lost:
        if (r15 >= 0) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ea, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x013f, code lost:
        if (r4 < r0.f1694f.size()) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x014a, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x015d, code lost:
        if (r4 < r0.f1694f.size()) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x016f, code lost:
        if (r4 < r0.f1694f.size()) goto L_0x0141;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1801c(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f1702j
            if (r2 == r1) goto L_0x000f
            android.support.v4.view.ViewPager$b r2 = r0.mo1794b((int) r2)
            r0.f1702j = r1
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            android.support.v4.view.r r1 = r0.f1700i
            if (r1 != 0) goto L_0x0018
            r17.m2046m()
            return
        L_0x0018:
            boolean r1 = r0.f1665A
            if (r1 == 0) goto L_0x0020
            r17.m2046m()
            return
        L_0x0020:
            android.os.IBinder r1 = r17.getWindowToken()
            if (r1 != 0) goto L_0x0027
            return
        L_0x0027:
            android.support.v4.view.r r1 = r0.f1700i
            r1.mo1987b((android.view.ViewGroup) r0)
            int r1 = r0.f1666B
            int r4 = r0.f1702j
            int r4 = r4 - r1
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            android.support.v4.view.r r6 = r0.f1700i
            int r6 = r6.mo1972a()
            int r7 = r6 + -1
            int r8 = r0.f1702j
            int r8 = r8 + r1
            int r1 = java.lang.Math.min(r7, r8)
            int r7 = r0.f1692e
            if (r6 != r7) goto L_0x01f2
            r7 = r5
        L_0x004a:
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r8 = r0.f1694f
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x0066
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r8 = r0.f1694f
            java.lang.Object r8 = r8.get(r7)
            android.support.v4.view.ViewPager$b r8 = (android.support.p007v4.view.ViewPager.C0436b) r8
            int r9 = r8.f1726b
            int r10 = r0.f1702j
            if (r9 < r10) goto L_0x0063
            if (r9 != r10) goto L_0x0066
            goto L_0x0067
        L_0x0063:
            int r7 = r7 + 1
            goto L_0x004a
        L_0x0066:
            r8 = 0
        L_0x0067:
            if (r8 != 0) goto L_0x0071
            if (r6 <= 0) goto L_0x0071
            int r8 = r0.f1702j
            android.support.v4.view.ViewPager$b r8 = r0.mo1778a((int) r8, (int) r7)
        L_0x0071:
            r9 = 0
            if (r8 == 0) goto L_0x017f
            int r10 = r7 + -1
            if (r10 < 0) goto L_0x0081
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r11 = r0.f1694f
            java.lang.Object r11 = r11.get(r10)
            android.support.v4.view.ViewPager$b r11 = (android.support.p007v4.view.ViewPager.C0436b) r11
            goto L_0x0082
        L_0x0081:
            r11 = 0
        L_0x0082:
            int r12 = r17.getClientWidth()
            r13 = 1073741824(0x40000000, float:2.0)
            if (r12 > 0) goto L_0x008c
            r3 = r9
            goto L_0x0099
        L_0x008c:
            float r14 = r8.f1728d
            float r14 = r13 - r14
            int r15 = r17.getPaddingLeft()
            float r15 = (float) r15
            float r3 = (float) r12
            float r15 = r15 / r3
            float r3 = r14 + r15
        L_0x0099:
            int r14 = r0.f1702j
            int r14 = r14 + -1
            r15 = r10
            r10 = r7
            r7 = r9
        L_0x00a0:
            if (r14 < 0) goto L_0x00f0
            int r16 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r16 < 0) goto L_0x00c6
            if (r14 >= r4) goto L_0x00c6
            if (r11 != 0) goto L_0x00ab
            goto L_0x00f0
        L_0x00ab:
            int r5 = r11.f1726b
            if (r14 != r5) goto L_0x00ec
            boolean r5 = r11.f1727c
            if (r5 != 0) goto L_0x00ec
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r5 = r0.f1694f
            r5.remove(r15)
            android.support.v4.view.r r5 = r0.f1700i
            java.lang.Object r11 = r11.f1725a
            r5.mo1981a((android.view.ViewGroup) r0, (int) r14, (java.lang.Object) r11)
            int r15 = r15 + -1
            int r10 = r10 + -1
            if (r15 < 0) goto L_0x00ea
            goto L_0x00e1
        L_0x00c6:
            if (r11 == 0) goto L_0x00d4
            int r5 = r11.f1726b
            if (r14 != r5) goto L_0x00d4
            float r5 = r11.f1728d
            float r7 = r7 + r5
            int r15 = r15 + -1
            if (r15 < 0) goto L_0x00ea
            goto L_0x00e1
        L_0x00d4:
            int r5 = r15 + 1
            android.support.v4.view.ViewPager$b r5 = r0.mo1778a((int) r14, (int) r5)
            float r5 = r5.f1728d
            float r7 = r7 + r5
            int r10 = r10 + 1
            if (r15 < 0) goto L_0x00ea
        L_0x00e1:
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r5 = r0.f1694f
            java.lang.Object r5 = r5.get(r15)
            android.support.v4.view.ViewPager$b r5 = (android.support.p007v4.view.ViewPager.C0436b) r5
            goto L_0x00eb
        L_0x00ea:
            r5 = 0
        L_0x00eb:
            r11 = r5
        L_0x00ec:
            int r14 = r14 + -1
            r5 = 0
            goto L_0x00a0
        L_0x00f0:
            float r3 = r8.f1728d
            int r4 = r10 + 1
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x0173
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r5 = r0.f1694f
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0109
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r5 = r0.f1694f
            java.lang.Object r5 = r5.get(r4)
            android.support.v4.view.ViewPager$b r5 = (android.support.p007v4.view.ViewPager.C0436b) r5
            goto L_0x010a
        L_0x0109:
            r5 = 0
        L_0x010a:
            if (r12 > 0) goto L_0x010e
            r7 = r9
            goto L_0x0116
        L_0x010e:
            int r7 = r17.getPaddingRight()
            float r7 = (float) r7
            float r11 = (float) r12
            float r7 = r7 / r11
            float r7 = r7 + r13
        L_0x0116:
            int r11 = r0.f1702j
        L_0x0118:
            int r11 = r11 + 1
            if (r11 >= r6) goto L_0x0173
            int r12 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r12 < 0) goto L_0x014c
            if (r11 <= r1) goto L_0x014c
            if (r5 != 0) goto L_0x0125
            goto L_0x0173
        L_0x0125:
            int r12 = r5.f1726b
            if (r11 != r12) goto L_0x0172
            boolean r12 = r5.f1727c
            if (r12 != 0) goto L_0x0172
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r12 = r0.f1694f
            r12.remove(r4)
            android.support.v4.view.r r12 = r0.f1700i
            java.lang.Object r5 = r5.f1725a
            r12.mo1981a((android.view.ViewGroup) r0, (int) r11, (java.lang.Object) r5)
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r5 = r0.f1694f
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x014a
        L_0x0141:
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r5 = r0.f1694f
            java.lang.Object r5 = r5.get(r4)
            android.support.v4.view.ViewPager$b r5 = (android.support.p007v4.view.ViewPager.C0436b) r5
            goto L_0x0172
        L_0x014a:
            r5 = 0
            goto L_0x0172
        L_0x014c:
            if (r5 == 0) goto L_0x0160
            int r12 = r5.f1726b
            if (r11 != r12) goto L_0x0160
            float r5 = r5.f1728d
            float r3 = r3 + r5
            int r4 = r4 + 1
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r5 = r0.f1694f
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x014a
            goto L_0x0141
        L_0x0160:
            android.support.v4.view.ViewPager$b r5 = r0.mo1778a((int) r11, (int) r4)
            int r4 = r4 + 1
            float r5 = r5.f1728d
            float r3 = r3 + r5
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r5 = r0.f1694f
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x014a
            goto L_0x0141
        L_0x0172:
            goto L_0x0118
        L_0x0173:
            r0.m2030a((android.support.p007v4.view.ViewPager.C0436b) r8, (int) r10, (android.support.p007v4.view.ViewPager.C0436b) r2)
            android.support.v4.view.r r1 = r0.f1700i
            int r2 = r0.f1702j
            java.lang.Object r3 = r8.f1725a
            r1.mo1988b(r0, r2, r3)
        L_0x017f:
            android.support.v4.view.r r1 = r0.f1700i
            r1.mo1980a((android.view.ViewGroup) r0)
            int r1 = r17.getChildCount()
            r2 = 0
        L_0x0189:
            if (r2 >= r1) goto L_0x01b2
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            android.support.v4.view.ViewPager$c r4 = (android.support.p007v4.view.ViewPager.C0437c) r4
            r4.f1735f = r2
            boolean r5 = r4.f1730a
            if (r5 != 0) goto L_0x01af
            float r5 = r4.f1732c
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x01af
            android.support.v4.view.ViewPager$b r3 = r0.mo1795b((android.view.View) r3)
            if (r3 == 0) goto L_0x01af
            float r5 = r3.f1728d
            r4.f1732c = r5
            int r3 = r3.f1726b
            r4.f1734e = r3
        L_0x01af:
            int r2 = r2 + 1
            goto L_0x0189
        L_0x01b2:
            r17.m2046m()
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x01f1
            android.view.View r1 = r17.findFocus()
            if (r1 == 0) goto L_0x01c6
            android.support.v4.view.ViewPager$b r3 = r0.mo1779a((android.view.View) r1)
            goto L_0x01c7
        L_0x01c6:
            r3 = 0
        L_0x01c7:
            if (r3 == 0) goto L_0x01cf
            int r1 = r3.f1726b
            int r2 = r0.f1702j
            if (r1 == r2) goto L_0x01f1
        L_0x01cf:
            r1 = 0
        L_0x01d0:
            int r2 = r17.getChildCount()
            if (r1 >= r2) goto L_0x01f1
            android.view.View r2 = r0.getChildAt(r1)
            android.support.v4.view.ViewPager$b r3 = r0.mo1795b((android.view.View) r2)
            if (r3 == 0) goto L_0x01ee
            int r3 = r3.f1726b
            int r4 = r0.f1702j
            if (r3 != r4) goto L_0x01ee
            r3 = 2
            boolean r2 = r2.requestFocus(r3)
            if (r2 == 0) goto L_0x01ee
            goto L_0x01f1
        L_0x01ee:
            int r1 = r1 + 1
            goto L_0x01d0
        L_0x01f1:
            return
        L_0x01f2:
            android.content.res.Resources r1 = r17.getResources()     // Catch:{ NotFoundException -> 0x01ff }
            int r2 = r17.getId()     // Catch:{ NotFoundException -> 0x01ff }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x01ff }
            goto L_0x0207
        L_0x01ff:
            int r1 = r17.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L_0x0207:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r3.append(r4)
            int r4 = r0.f1692e
            r3.append(r4)
            java.lang.String r4 = ", found: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = " Pager id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " Pager class: "
            r3.append(r1)
            java.lang.Class r1 = r17.getClass()
            r3.append(r1)
            java.lang.String r1 = " Problematic adapter: "
            r3.append(r1)
            android.support.v4.view.r r1 = r0.f1700i
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p007v4.view.ViewPager.mo1801c(int):void");
    }

    public boolean canScrollHorizontally(int i) {
        if (this.f1700i == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.f1716u)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.f1717v));
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0437c) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        this.f1710o = true;
        if (this.f1709n.isFinished() || !this.f1709n.computeScrollOffset()) {
            m2032a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f1709n.getCurrX();
        int currY = this.f1709n.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m2041f(currX)) {
                this.f1709n.abortAnimation();
                scrollTo(0, currY);
            }
        }
        C0487v.m2261B(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo1805d() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f1709n = new Scroller(context, f1663c);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f1671G = viewConfiguration.getScaledPagingTouchSlop();
        this.f1678N = (int) (400.0f * f);
        this.f1679O = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1684T = new EdgeEffect(context);
        this.f1685U = new EdgeEffect(context);
        this.f1680P = (int) (25.0f * f);
        this.f1681Q = (int) (2.0f * f);
        this.f1669E = (int) (f * 16.0f);
        C0487v.m2274a((View) this, (C0459c) new C0438d());
        if (C0487v.m2292h(this) == 0) {
            C0487v.m2288d(this, 1);
        }
        C0487v.m2275a((View) this, (C0482q) new C0421C(this));
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo1789a(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C0436b b;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (b = mo1795b(childAt)) != null && b.f1726b == this.f1702j && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        C0483r rVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (rVar = this.f1700i) != null && rVar.mo1972a() > 1)) {
            if (!this.f1684T.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.f1716u * ((float) width));
                this.f1684T.setSize(height, width);
                z = false | this.f1684T.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f1685U.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.f1717v + 1.0f)) * ((float) width2));
                this.f1685U.setSize(height2, width2);
                z |= this.f1685U.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.f1684T.finish();
            this.f1685U.finish();
        }
        if (z) {
            C0487v.m2261B(this);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1713r;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* renamed from: e */
    public boolean mo1810e() {
        return this.f1682R;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo1811f() {
        int i = this.f1702j;
        if (i <= 0) {
            return false;
        }
        mo1782a(i - 1, true);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo1812g() {
        C0483r rVar = this.f1700i;
        if (rVar == null || this.f1702j >= rVar.mo1972a() - 1) {
            return false;
        }
        mo1782a(this.f1702j + 1, true);
        return true;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0437c();
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0437c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public C0483r getAdapter() {
        return this.f1700i;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.f1701ia == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C0437c) this.f1703ja.get(i2).getLayoutParams()).f1735f;
    }

    public int getCurrentItem() {
        return this.f1702j;
    }

    public int getOffscreenPageLimit() {
        return this.f1666B;
    }

    public int getPageMargin() {
        return this.f1712q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo1821h() {
        mo1801c(this.f1702j);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1686V = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f1705ka);
        Scroller scroller = this.f1709n;
        if (scroller != null && !scroller.isFinished()) {
            this.f1709n.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        super.onDraw(canvas);
        if (this.f1712q > 0 && this.f1713r != null && this.f1694f.size() > 0 && this.f1700i != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f3 = (float) width;
            float f4 = ((float) this.f1712q) / f3;
            int i = 0;
            C0436b bVar = this.f1694f.get(0);
            float f5 = bVar.f1729e;
            int size = this.f1694f.size();
            int i2 = bVar.f1726b;
            int i3 = this.f1694f.get(size - 1).f1726b;
            while (i2 < i3) {
                while (i2 > bVar.f1726b && i < size) {
                    i++;
                    bVar = this.f1694f.get(i);
                }
                if (i2 == bVar.f1726b) {
                    float f6 = bVar.f1729e;
                    float f7 = bVar.f1728d;
                    f = (f6 + f7) * f3;
                    f5 = f6 + f7 + f4;
                } else {
                    float b = this.f1700i.mo1983b(i2);
                    f = (f5 + b) * f3;
                    f5 += b + f4;
                }
                if (((float) this.f1712q) + f > ((float) scrollX)) {
                    f2 = f4;
                    this.f1713r.setBounds(Math.round(f), this.f1714s, Math.round(((float) this.f1712q) + f), this.f1715t);
                    this.f1713r.draw(canvas);
                } else {
                    Canvas canvas2 = canvas;
                    f2 = f4;
                }
                if (f <= ((float) (scrollX + width))) {
                    i2++;
                    f4 = f2;
                } else {
                    return;
                }
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m2045l();
            return false;
        }
        if (action != 0) {
            if (this.f1667C) {
                return true;
            }
            if (this.f1668D) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f1674J = x;
            this.f1672H = x;
            float y = motionEvent.getY();
            this.f1675K = y;
            this.f1673I = y;
            this.f1676L = motionEvent2.getPointerId(0);
            this.f1668D = false;
            this.f1710o = true;
            this.f1709n.computeScrollOffset();
            if (this.f1707la != 2 || Math.abs(this.f1709n.getFinalX() - this.f1709n.getCurrX()) <= this.f1681Q) {
                m2032a(false);
                this.f1667C = false;
            } else {
                this.f1709n.abortAnimation();
                this.f1665A = false;
                mo1821h();
                this.f1667C = true;
                m2036c(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.f1676L;
            if (i != -1) {
                int findPointerIndex = motionEvent2.findPointerIndex(i);
                float x2 = motionEvent2.getX(findPointerIndex);
                float f = x2 - this.f1672H;
                float abs = Math.abs(f);
                float y2 = motionEvent2.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.f1675K);
                int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i2 != 0 && !m2033a(this.f1672H, f)) {
                    if (mo1790a(this, false, (int) f, (int) x2, (int) y2)) {
                        this.f1672H = x2;
                        this.f1673I = y2;
                        this.f1668D = true;
                        return false;
                    }
                }
                if (abs > ((float) this.f1671G) && abs * 0.5f > abs2) {
                    this.f1667C = true;
                    m2036c(true);
                    setScrollState(1);
                    this.f1672H = i2 > 0 ? this.f1674J + ((float) this.f1671G) : this.f1674J - ((float) this.f1671G);
                    this.f1673I = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > ((float) this.f1671G)) {
                    this.f1668D = true;
                }
                if (this.f1667C && m2037c(x2)) {
                    C0487v.m2261B(this);
                }
            }
        } else if (action == 6) {
            m2031a(motionEvent);
        }
        if (this.f1677M == null) {
            this.f1677M = VelocityTracker.obtain();
        }
        this.f1677M.addMovement(motionEvent2);
        return this.f1667C;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        C0436b b;
        int i5;
        int i6;
        int childCount = getChildCount();
        int i7 = i3 - i;
        int i8 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i9 = paddingBottom;
        int i10 = 0;
        int i11 = paddingTop;
        int i12 = paddingLeft;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                C0437c cVar = (C0437c) childAt.getLayoutParams();
                if (cVar.f1730a) {
                    int i14 = cVar.f1731b;
                    int i15 = i14 & 7;
                    int i16 = i14 & 112;
                    if (i15 == 1) {
                        i5 = Math.max((i7 - childAt.getMeasuredWidth()) / 2, i12);
                    } else if (i15 == 3) {
                        i5 = i12;
                        i12 = childAt.getMeasuredWidth() + i12;
                    } else if (i15 != 5) {
                        i5 = i12;
                    } else {
                        i5 = (i7 - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                    }
                    if (i16 == 16) {
                        i6 = Math.max((i8 - childAt.getMeasuredHeight()) / 2, i11);
                    } else if (i16 == 48) {
                        i6 = i11;
                        i11 = childAt.getMeasuredHeight() + i11;
                    } else if (i16 != 80) {
                        i6 = i11;
                    } else {
                        i6 = (i8 - i9) - childAt.getMeasuredHeight();
                        i9 += childAt.getMeasuredHeight();
                    }
                    int i17 = i5 + scrollX;
                    childAt.layout(i17, i6, childAt.getMeasuredWidth() + i17, i6 + childAt.getMeasuredHeight());
                    i10++;
                }
            }
        }
        int i18 = (i7 - i12) - paddingRight;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt2 = getChildAt(i19);
            if (childAt2.getVisibility() != 8) {
                C0437c cVar2 = (C0437c) childAt2.getLayoutParams();
                if (!cVar2.f1730a && (b = mo1795b(childAt2)) != null) {
                    float f = (float) i18;
                    int i20 = ((int) (b.f1729e * f)) + i12;
                    if (cVar2.f1733d) {
                        cVar2.f1733d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * cVar2.f1732c), 1073741824), View.MeasureSpec.makeMeasureSpec((i8 - i11) - i9, 1073741824));
                    }
                    childAt2.layout(i20, i11, childAt2.getMeasuredWidth() + i20, childAt2.getMeasuredHeight() + i11);
                }
            }
        }
        this.f1714s = i11;
        this.f1715t = i8 - i9;
        this.f1689ba = i10;
        if (this.f1686V) {
            z2 = false;
            m2029a(this.f1702j, false, 0, false);
        } else {
            z2 = false;
        }
        this.f1686V = z2;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C0437c cVar;
        C0437c cVar2;
        int i3;
        setMeasuredDimension(ViewGroup.getDefaultSize(0, i), ViewGroup.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.f1670F = Math.min(measuredWidth / 10, this.f1669E);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = measuredHeight;
        int i5 = paddingLeft;
        int i6 = 0;
        while (true) {
            boolean z = true;
            int i7 = 1073741824;
            if (i6 >= childCount) {
                break;
            }
            View childAt = getChildAt(i6);
            if (!(childAt.getVisibility() == 8 || (cVar2 = (C0437c) childAt.getLayoutParams()) == null || !cVar2.f1730a)) {
                int i8 = cVar2.f1731b;
                int i9 = i8 & 7;
                int i10 = i8 & 112;
                boolean z2 = i10 == 48 || i10 == 80;
                if (!(i9 == 3 || i9 == 5)) {
                    z = false;
                }
                int i11 = Integer.MIN_VALUE;
                if (z2) {
                    i3 = Integer.MIN_VALUE;
                    i11 = 1073741824;
                } else {
                    i3 = z ? 1073741824 : Integer.MIN_VALUE;
                }
                int i12 = cVar2.width;
                if (i12 != -2) {
                    if (i12 == -1) {
                        i12 = i5;
                    }
                    i11 = 1073741824;
                } else {
                    i12 = i5;
                }
                int i13 = cVar2.height;
                if (i13 == -2) {
                    i13 = i4;
                    i7 = i3;
                } else if (i13 == -1) {
                    i13 = i4;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, i11), View.MeasureSpec.makeMeasureSpec(i13, i7));
                if (z2) {
                    i4 -= childAt.getMeasuredHeight();
                } else if (z) {
                    i5 -= childAt.getMeasuredWidth();
                }
            }
            i6++;
        }
        this.f1718w = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        this.f1719x = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        this.f1720y = true;
        mo1821h();
        this.f1720y = false;
        int childCount2 = getChildCount();
        for (int i14 = 0; i14 < childCount2; i14++) {
            View childAt2 = getChildAt(i14);
            if (childAt2.getVisibility() != 8 && ((cVar = (C0437c) childAt2.getLayoutParams()) == null || !cVar.f1730a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (((float) i5) * cVar.f1732c), 1073741824), this.f1719x);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C0436b b;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = childCount - 1;
            i2 = -1;
        }
        while (i3 != i4) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (b = mo1795b(childAt)) != null && b.f1726b == this.f1702j && childAt.requestFocus(i, rect)) {
                return true;
            }
            i3 += i2;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo1736a());
        C0483r rVar = this.f1700i;
        if (rVar != null) {
            rVar.mo1977a(savedState.f1723b, savedState.f1724c);
            mo1783a(savedState.f1722a, false, true);
            return;
        }
        this.f1704k = savedState.f1722a;
        this.f1706l = savedState.f1723b;
        this.f1708m = savedState.f1724c;
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1722a = this.f1702j;
        C0483r rVar = this.f1700i;
        if (rVar != null) {
            savedState.f1723b = rVar.mo1984b();
        }
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.f1712q;
            m2028a(i, i3, i5, i5);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x0151  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.f1682R
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r8.getAction()
            r2 = 0
            if (r0 != 0) goto L_0x0014
            int r0 = r8.getEdgeFlags()
            if (r0 == 0) goto L_0x0014
            return r2
        L_0x0014:
            android.support.v4.view.r r0 = r7.f1700i
            if (r0 == 0) goto L_0x0155
            int r0 = r0.mo1972a()
            if (r0 != 0) goto L_0x0020
            goto L_0x0155
        L_0x0020:
            android.view.VelocityTracker r0 = r7.f1677M
            if (r0 != 0) goto L_0x002a
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r7.f1677M = r0
        L_0x002a:
            android.view.VelocityTracker r0 = r7.f1677M
            r0.addMovement(r8)
            int r0 = r8.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 == 0) goto L_0x012f
            if (r0 == r1) goto L_0x00e2
            r3 = 2
            if (r0 == r3) goto L_0x0073
            r3 = 3
            if (r0 == r3) goto L_0x0068
            r3 = 5
            if (r0 == r3) goto L_0x0058
            r3 = 6
            if (r0 == r3) goto L_0x0047
            goto L_0x014f
        L_0x0047:
            r7.m2031a((android.view.MotionEvent) r8)
            int r0 = r7.f1676L
            int r0 = r8.findPointerIndex(r0)
            float r8 = r8.getX(r0)
            r7.f1672H = r8
            goto L_0x014f
        L_0x0058:
            int r0 = r8.getActionIndex()
            float r3 = r8.getX(r0)
            r7.f1672H = r3
            int r8 = r8.getPointerId(r0)
            goto L_0x014d
        L_0x0068:
            boolean r8 = r7.f1667C
            if (r8 == 0) goto L_0x014f
            int r8 = r7.f1702j
            r7.m2029a((int) r8, (boolean) r1, (int) r2, (boolean) r2)
            goto L_0x012a
        L_0x0073:
            boolean r0 = r7.f1667C
            if (r0 != 0) goto L_0x00ce
            int r0 = r7.f1676L
            int r0 = r8.findPointerIndex(r0)
            r3 = -1
            if (r0 != r3) goto L_0x0082
            goto L_0x012a
        L_0x0082:
            float r3 = r8.getX(r0)
            float r4 = r7.f1672H
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            float r0 = r8.getY(r0)
            float r5 = r7.f1673I
            float r5 = r0 - r5
            float r5 = java.lang.Math.abs(r5)
            int r6 = r7.f1671G
            float r6 = (float) r6
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x00ce
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00ce
            r7.f1667C = r1
            r7.m2036c((boolean) r1)
            float r4 = r7.f1674J
            float r3 = r3 - r4
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x00b7
            int r3 = r7.f1671G
            float r3 = (float) r3
            float r4 = r4 + r3
            goto L_0x00bb
        L_0x00b7:
            int r3 = r7.f1671G
            float r3 = (float) r3
            float r4 = r4 - r3
        L_0x00bb:
            r7.f1672H = r4
            r7.f1673I = r0
            r7.setScrollState(r1)
            r7.setScrollingCacheEnabled(r1)
            android.view.ViewParent r0 = r7.getParent()
            if (r0 == 0) goto L_0x00ce
            r0.requestDisallowInterceptTouchEvent(r1)
        L_0x00ce:
            boolean r0 = r7.f1667C
            if (r0 == 0) goto L_0x014f
            int r0 = r7.f1676L
            int r0 = r8.findPointerIndex(r0)
            float r8 = r8.getX(r0)
            boolean r8 = r7.m2037c((float) r8)
            r2 = r2 | r8
            goto L_0x014f
        L_0x00e2:
            boolean r0 = r7.f1667C
            if (r0 == 0) goto L_0x014f
            android.view.VelocityTracker r0 = r7.f1677M
            r2 = 1000(0x3e8, float:1.401E-42)
            int r3 = r7.f1679O
            float r3 = (float) r3
            r0.computeCurrentVelocity(r2, r3)
            int r2 = r7.f1676L
            float r0 = r0.getXVelocity(r2)
            int r0 = (int) r0
            r7.f1665A = r1
            int r2 = r7.getClientWidth()
            int r3 = r7.getScrollX()
            android.support.v4.view.ViewPager$b r4 = r7.m2043j()
            int r5 = r7.f1712q
            float r5 = (float) r5
            float r2 = (float) r2
            float r5 = r5 / r2
            int r6 = r4.f1726b
            float r3 = (float) r3
            float r3 = r3 / r2
            float r2 = r4.f1729e
            float r3 = r3 - r2
            float r2 = r4.f1728d
            float r2 = r2 + r5
            float r3 = r3 / r2
            int r2 = r7.f1676L
            int r2 = r8.findPointerIndex(r2)
            float r8 = r8.getX(r2)
            float r2 = r7.f1674J
            float r8 = r8 - r2
            int r8 = (int) r8
            int r8 = r7.m2026a((int) r6, (float) r3, (int) r0, (int) r8)
            r7.mo1784a((int) r8, (boolean) r1, (boolean) r1, (int) r0)
        L_0x012a:
            boolean r2 = r7.m2045l()
            goto L_0x014f
        L_0x012f:
            android.widget.Scroller r0 = r7.f1709n
            r0.abortAnimation()
            r7.f1665A = r2
            r7.mo1821h()
            float r0 = r8.getX()
            r7.f1674J = r0
            r7.f1672H = r0
            float r0 = r8.getY()
            r7.f1675K = r0
            r7.f1673I = r0
            int r8 = r8.getPointerId(r2)
        L_0x014d:
            r7.f1676L = r8
        L_0x014f:
            if (r2 == 0) goto L_0x0154
            android.support.p007v4.view.C0487v.m2261B(r7)
        L_0x0154:
            return r1
        L_0x0155:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p007v4.view.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void removeView(View view) {
        if (this.f1720y) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(C0483r rVar) {
        C0483r rVar2 = this.f1700i;
        if (rVar2 != null) {
            rVar2.mo1985b((DataSetObserver) null);
            this.f1700i.mo1987b((ViewGroup) this);
            for (int i = 0; i < this.f1694f.size(); i++) {
                C0436b bVar = this.f1694f.get(i);
                this.f1700i.mo1981a((ViewGroup) this, bVar.f1726b, bVar.f1725a);
            }
            this.f1700i.mo1980a((ViewGroup) this);
            this.f1694f.clear();
            m2044k();
            this.f1702j = 0;
            scrollTo(0, 0);
        }
        C0483r rVar3 = this.f1700i;
        this.f1700i = rVar;
        this.f1692e = 0;
        if (this.f1700i != null) {
            if (this.f1711p == null) {
                this.f1711p = new C0442h();
            }
            this.f1700i.mo1985b((DataSetObserver) this.f1711p);
            this.f1665A = false;
            boolean z = this.f1686V;
            this.f1686V = true;
            this.f1692e = this.f1700i.mo1972a();
            if (this.f1704k >= 0) {
                this.f1700i.mo1977a(this.f1706l, this.f1708m);
                mo1783a(this.f1704k, false, true);
                this.f1704k = -1;
                this.f1706l = null;
                this.f1708m = null;
            } else if (!z) {
                mo1821h();
            } else {
                requestLayout();
            }
        }
        List<C0439e> list = this.f1695fa;
        if (list != null && !list.isEmpty()) {
            int size = this.f1695fa.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f1695fa.get(i2).mo746a(this, rVar3, rVar);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.f1665A = false;
        mo1783a(i, !this.f1686V, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to " + 1);
            i = 1;
        }
        if (i != this.f1666B) {
            this.f1666B = i;
            mo1821h();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(C0440f fVar) {
        this.f1691da = fVar;
    }

    public void setPageMargin(int i) {
        int i2 = this.f1712q;
        this.f1712q = i;
        int width = getWidth();
        m2028a(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(C1006a.m5394c(getContext(), i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f1713r = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i) {
        if (this.f1707la != i) {
            this.f1707la = i;
            if (this.f1697ga != null) {
                m2035b(i != 0);
            }
            m2040e(i);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1713r;
    }
}
