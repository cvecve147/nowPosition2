package android.support.p011v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p007v4.view.p009a.C0446b;
import android.support.p011v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* renamed from: android.support.v7.widget.StaggeredGridLayoutManager */
public class StaggeredGridLayoutManager extends RecyclerView.C0759i implements RecyclerView.C0772s.C0774b {

    /* renamed from: A */
    boolean f3167A = false;

    /* renamed from: B */
    private BitSet f3168B;

    /* renamed from: C */
    int f3169C = -1;

    /* renamed from: D */
    int f3170D = Integer.MIN_VALUE;

    /* renamed from: E */
    LazySpanLookup f3171E = new LazySpanLookup();

    /* renamed from: F */
    private int f3172F = 2;

    /* renamed from: G */
    private boolean f3173G;

    /* renamed from: H */
    private boolean f3174H;

    /* renamed from: I */
    private SavedState f3175I;

    /* renamed from: J */
    private int f3176J;

    /* renamed from: K */
    private final Rect f3177K = new Rect();

    /* renamed from: L */
    private final C0786a f3178L = new C0786a();

    /* renamed from: M */
    private boolean f3179M = false;

    /* renamed from: N */
    private boolean f3180N = true;

    /* renamed from: O */
    private int[] f3181O;

    /* renamed from: P */
    private final Runnable f3182P = new C0799Va(this);

    /* renamed from: s */
    private int f3183s = -1;

    /* renamed from: t */
    C0788c[] f3184t;

    /* renamed from: u */
    C0687Aa f3185u;

    /* renamed from: v */
    C0687Aa f3186v;

    /* renamed from: w */
    private int f3187w;

    /* renamed from: x */
    private int f3188x;

    /* renamed from: y */
    private final C0876pa f3189y;

    /* renamed from: z */
    boolean f3190z = false;

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup */
    static class LazySpanLookup {

        /* renamed from: a */
        int[] f3191a;

        /* renamed from: b */
        List<FullSpanItem> f3192b;

        /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem */
        static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new C0802Wa();

            /* renamed from: a */
            int f3193a;

            /* renamed from: b */
            int f3194b;

            /* renamed from: c */
            int[] f3195c;

            /* renamed from: d */
            boolean f3196d;

            FullSpanItem() {
            }

            FullSpanItem(Parcel parcel) {
                this.f3193a = parcel.readInt();
                this.f3194b = parcel.readInt();
                this.f3196d = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    this.f3195c = new int[readInt];
                    parcel.readIntArray(this.f3195c);
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public int mo4153a(int i) {
                int[] iArr = this.f3195c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f3193a + ", mGapDir=" + this.f3194b + ", mHasUnwantedGapAfter=" + this.f3196d + ", mGapPerSpan=" + Arrays.toString(this.f3195c) + '}';
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f3193a);
                parcel.writeInt(this.f3194b);
                parcel.writeInt(this.f3196d ? 1 : 0);
                int[] iArr = this.f3195c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f3195c);
            }
        }

        LazySpanLookup() {
        }

        /* renamed from: c */
        private void m4520c(int i, int i2) {
            List<FullSpanItem> list = this.f3192b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = this.f3192b.get(size);
                    int i3 = fullSpanItem.f3193a;
                    if (i3 >= i) {
                        fullSpanItem.f3193a = i3 + i2;
                    }
                }
            }
        }

        /* renamed from: d */
        private void m4521d(int i, int i2) {
            List<FullSpanItem> list = this.f3192b;
            if (list != null) {
                int i3 = i + i2;
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = this.f3192b.get(size);
                    int i4 = fullSpanItem.f3193a;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            this.f3192b.remove(size);
                        } else {
                            fullSpanItem.f3193a = i4 - i2;
                        }
                    }
                }
            }
        }

        /* renamed from: g */
        private int m4522g(int i) {
            if (this.f3192b == null) {
                return -1;
            }
            FullSpanItem c = mo4149c(i);
            if (c != null) {
                this.f3192b.remove(c);
            }
            int size = this.f3192b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (this.f3192b.get(i2).f3193a >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            this.f3192b.remove(i2);
            return this.f3192b.get(i2).f3193a;
        }

        /* renamed from: a */
        public FullSpanItem mo4141a(int i, int i2, int i3, boolean z) {
            List<FullSpanItem> list = this.f3192b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = this.f3192b.get(i4);
                int i5 = fullSpanItem.f3193a;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || fullSpanItem.f3194b == i3 || (z && fullSpanItem.f3196d))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4142a() {
            int[] iArr = this.f3191a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3192b = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4143a(int i) {
            int[] iArr = this.f3191a;
            if (iArr == null) {
                this.f3191a = new int[(Math.max(i, 10) + 1)];
                Arrays.fill(this.f3191a, -1);
            } else if (i >= iArr.length) {
                this.f3191a = new int[mo4152f(i)];
                System.arraycopy(iArr, 0, this.f3191a, 0, iArr.length);
                int[] iArr2 = this.f3191a;
                Arrays.fill(iArr2, iArr.length, iArr2.length, -1);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4144a(int i, int i2) {
            int[] iArr = this.f3191a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo4143a(i3);
                int[] iArr2 = this.f3191a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f3191a, i, i3, -1);
                m4520c(i, i2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4145a(int i, C0788c cVar) {
            mo4143a(i);
            this.f3191a[i] = cVar.f3220e;
        }

        /* renamed from: a */
        public void mo4146a(FullSpanItem fullSpanItem) {
            if (this.f3192b == null) {
                this.f3192b = new ArrayList();
            }
            int size = this.f3192b.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = this.f3192b.get(i);
                if (fullSpanItem2.f3193a == fullSpanItem.f3193a) {
                    this.f3192b.remove(i);
                }
                if (fullSpanItem2.f3193a >= fullSpanItem.f3193a) {
                    this.f3192b.add(i, fullSpanItem);
                    return;
                }
            }
            this.f3192b.add(fullSpanItem);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo4147b(int i) {
            List<FullSpanItem> list = this.f3192b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f3192b.get(size).f3193a >= i) {
                        this.f3192b.remove(size);
                    }
                }
            }
            return mo4151e(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4148b(int i, int i2) {
            int[] iArr = this.f3191a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo4143a(i3);
                int[] iArr2 = this.f3191a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f3191a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                m4521d(i, i2);
            }
        }

        /* renamed from: c */
        public FullSpanItem mo4149c(int i) {
            List<FullSpanItem> list = this.f3192b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f3192b.get(size);
                if (fullSpanItem.f3193a == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo4150d(int i) {
            int[] iArr = this.f3191a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public int mo4151e(int i) {
            int[] iArr = this.f3191a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int g = m4522g(i);
            if (g == -1) {
                int[] iArr2 = this.f3191a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f3191a.length;
            }
            int i2 = g + 1;
            Arrays.fill(this.f3191a, i, i2, -1);
            return i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public int mo4152f(int i) {
            int length = this.f3191a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }
    }

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$SavedState */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0804Xa();

        /* renamed from: a */
        int f3197a;

        /* renamed from: b */
        int f3198b;

        /* renamed from: c */
        int f3199c;

        /* renamed from: d */
        int[] f3200d;

        /* renamed from: e */
        int f3201e;

        /* renamed from: f */
        int[] f3202f;

        /* renamed from: g */
        List<LazySpanLookup.FullSpanItem> f3203g;

        /* renamed from: h */
        boolean f3204h;

        /* renamed from: i */
        boolean f3205i;

        /* renamed from: j */
        boolean f3206j;

        public SavedState() {
        }

        SavedState(Parcel parcel) {
            this.f3197a = parcel.readInt();
            this.f3198b = parcel.readInt();
            this.f3199c = parcel.readInt();
            int i = this.f3199c;
            if (i > 0) {
                this.f3200d = new int[i];
                parcel.readIntArray(this.f3200d);
            }
            this.f3201e = parcel.readInt();
            int i2 = this.f3201e;
            if (i2 > 0) {
                this.f3202f = new int[i2];
                parcel.readIntArray(this.f3202f);
            }
            boolean z = false;
            this.f3204h = parcel.readInt() == 1;
            this.f3205i = parcel.readInt() == 1;
            this.f3206j = parcel.readInt() == 1 ? true : z;
            this.f3203g = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f3199c = savedState.f3199c;
            this.f3197a = savedState.f3197a;
            this.f3198b = savedState.f3198b;
            this.f3200d = savedState.f3200d;
            this.f3201e = savedState.f3201e;
            this.f3202f = savedState.f3202f;
            this.f3204h = savedState.f3204h;
            this.f3205i = savedState.f3205i;
            this.f3206j = savedState.f3206j;
            this.f3203g = savedState.f3203g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4157a() {
            this.f3200d = null;
            this.f3199c = 0;
            this.f3197a = -1;
            this.f3198b = -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4158b() {
            this.f3200d = null;
            this.f3199c = 0;
            this.f3201e = 0;
            this.f3202f = null;
            this.f3203g = null;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f3197a);
            parcel.writeInt(this.f3198b);
            parcel.writeInt(this.f3199c);
            if (this.f3199c > 0) {
                parcel.writeIntArray(this.f3200d);
            }
            parcel.writeInt(this.f3201e);
            if (this.f3201e > 0) {
                parcel.writeIntArray(this.f3202f);
            }
            parcel.writeInt(this.f3204h ? 1 : 0);
            parcel.writeInt(this.f3205i ? 1 : 0);
            parcel.writeInt(this.f3206j ? 1 : 0);
            parcel.writeList(this.f3203g);
        }
    }

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$a */
    class C0786a {

        /* renamed from: a */
        int f3207a;

        /* renamed from: b */
        int f3208b;

        /* renamed from: c */
        boolean f3209c;

        /* renamed from: d */
        boolean f3210d;

        /* renamed from: e */
        boolean f3211e;

        /* renamed from: f */
        int[] f3212f;

        C0786a() {
            mo4164b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4161a() {
            this.f3208b = this.f3209c ? StaggeredGridLayoutManager.this.f3185u.mo3076b() : StaggeredGridLayoutManager.this.f3185u.mo3084f();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4162a(int i) {
            this.f3208b = this.f3209c ? StaggeredGridLayoutManager.this.f3185u.mo3076b() - i : StaggeredGridLayoutManager.this.f3185u.mo3084f() + i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4163a(C0788c[] cVarArr) {
            int length = cVarArr.length;
            int[] iArr = this.f3212f;
            if (iArr == null || iArr.length < length) {
                this.f3212f = new int[StaggeredGridLayoutManager.this.f3184t.length];
            }
            for (int i = 0; i < length; i++) {
                this.f3212f[i] = cVarArr[i].mo4175b(Integer.MIN_VALUE);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4164b() {
            this.f3207a = -1;
            this.f3208b = Integer.MIN_VALUE;
            this.f3209c = false;
            this.f3210d = false;
            this.f3211e = false;
            int[] iArr = this.f3212f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$b */
    public static class C0787b extends RecyclerView.C0762j {

        /* renamed from: e */
        C0788c f3214e;

        /* renamed from: f */
        boolean f3215f;

        public C0787b(int i, int i2) {
            super(i, i2);
        }

        public C0787b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0787b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0787b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* renamed from: a */
        public void mo4165a(boolean z) {
            this.f3215f = z;
        }

        /* renamed from: e */
        public final int mo4166e() {
            C0788c cVar = this.f3214e;
            if (cVar == null) {
                return -1;
            }
            return cVar.f3220e;
        }

        /* renamed from: f */
        public boolean mo4167f() {
            return this.f3215f;
        }
    }

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$c */
    class C0788c {

        /* renamed from: a */
        ArrayList<View> f3216a = new ArrayList<>();

        /* renamed from: b */
        int f3217b = Integer.MIN_VALUE;

        /* renamed from: c */
        int f3218c = Integer.MIN_VALUE;

        /* renamed from: d */
        int f3219d = 0;

        /* renamed from: e */
        final int f3220e;

        C0788c(int i) {
            this.f3220e = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo4168a(int i) {
            int i2 = this.f3218c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f3216a.size() == 0) {
                return i;
            }
            mo4172a();
            return this.f3218c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo4169a(int i, int i2, boolean z) {
            return mo4170a(i, i2, false, false, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo4170a(int i, int i2, boolean z, boolean z2, boolean z3) {
            int f = StaggeredGridLayoutManager.this.f3185u.mo3084f();
            int b = StaggeredGridLayoutManager.this.f3185u.mo3076b();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f3216a.get(i);
                int d = StaggeredGridLayoutManager.this.f3185u.mo3081d(view);
                int a = StaggeredGridLayoutManager.this.f3185u.mo3074a(view);
                boolean z4 = false;
                boolean z5 = !z3 ? d < b : d <= b;
                if (!z3 ? a > f : a >= f) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (!z || !z2) {
                        if (!z2 && d >= f && a <= b) {
                        }
                    } else if (d >= f && a <= b) {
                    }
                    return StaggeredGridLayoutManager.this.mo3923l(view);
                }
                i += i3;
            }
            return -1;
        }

        /* renamed from: a */
        public View mo4171a(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f3216a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f3216a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f3190z && staggeredGridLayoutManager.mo3923l(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f3190z && staggeredGridLayoutManager2.mo3923l(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f3216a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f3216a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f3190z && staggeredGridLayoutManager3.mo3923l(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f3190z && staggeredGridLayoutManager4.mo3923l(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4172a() {
            LazySpanLookup.FullSpanItem c;
            ArrayList<View> arrayList = this.f3216a;
            View view = arrayList.get(arrayList.size() - 1);
            C0787b b = mo4177b(view);
            this.f3218c = StaggeredGridLayoutManager.this.f3185u.mo3074a(view);
            if (b.f3215f && (c = StaggeredGridLayoutManager.this.f3171E.mo4149c(b.mo3940a())) != null && c.f3194b == 1) {
                this.f3218c += c.mo4153a(this.f3220e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4173a(View view) {
            C0787b b = mo4177b(view);
            b.f3214e = this;
            this.f3216a.add(view);
            this.f3218c = Integer.MIN_VALUE;
            if (this.f3216a.size() == 1) {
                this.f3217b = Integer.MIN_VALUE;
            }
            if (b.mo3942c() || b.mo3941b()) {
                this.f3219d += StaggeredGridLayoutManager.this.f3185u.mo3077b(view);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4174a(boolean z, int i) {
            int a = z ? mo4168a(Integer.MIN_VALUE) : mo4175b(Integer.MIN_VALUE);
            mo4179c();
            if (a != Integer.MIN_VALUE) {
                if (z && a < StaggeredGridLayoutManager.this.f3185u.mo3076b()) {
                    return;
                }
                if (z || a <= StaggeredGridLayoutManager.this.f3185u.mo3084f()) {
                    if (i != Integer.MIN_VALUE) {
                        a += i;
                    }
                    this.f3218c = a;
                    this.f3217b = a;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo4175b(int i) {
            int i2 = this.f3217b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f3216a.size() == 0) {
                return i;
            }
            mo4178b();
            return this.f3217b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo4176b(int i, int i2, boolean z) {
            return mo4170a(i, i2, z, true, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0787b mo4177b(View view) {
            return (C0787b) view.getLayoutParams();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4178b() {
            LazySpanLookup.FullSpanItem c;
            View view = this.f3216a.get(0);
            C0787b b = mo4177b(view);
            this.f3217b = StaggeredGridLayoutManager.this.f3185u.mo3081d(view);
            if (b.f3215f && (c = StaggeredGridLayoutManager.this.f3171E.mo4149c(b.mo3940a())) != null && c.f3194b == -1) {
                this.f3217b -= c.mo4153a(this.f3220e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4179c() {
            this.f3216a.clear();
            mo4190k();
            this.f3219d = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4180c(int i) {
            int i2 = this.f3217b;
            if (i2 != Integer.MIN_VALUE) {
                this.f3217b = i2 + i;
            }
            int i3 = this.f3218c;
            if (i3 != Integer.MIN_VALUE) {
                this.f3218c = i3 + i;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4181c(View view) {
            C0787b b = mo4177b(view);
            b.f3214e = this;
            this.f3216a.add(0, view);
            this.f3217b = Integer.MIN_VALUE;
            if (this.f3216a.size() == 1) {
                this.f3218c = Integer.MIN_VALUE;
            }
            if (b.mo3942c() || b.mo3941b()) {
                this.f3219d += StaggeredGridLayoutManager.this.f3185u.mo3077b(view);
            }
        }

        /* renamed from: d */
        public int mo4182d() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.f3190z) {
                i2 = this.f3216a.size() - 1;
                i = -1;
            } else {
                i2 = 0;
                i = this.f3216a.size();
            }
            return mo4169a(i2, i, true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4183d(int i) {
            this.f3217b = i;
            this.f3218c = i;
        }

        /* renamed from: e */
        public int mo4184e() {
            return StaggeredGridLayoutManager.this.f3190z ? mo4176b(this.f3216a.size() - 1, -1, false) : mo4176b(0, this.f3216a.size(), false);
        }

        /* renamed from: f */
        public int mo4185f() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.f3190z) {
                i2 = 0;
                i = this.f3216a.size();
            } else {
                i2 = this.f3216a.size() - 1;
                i = -1;
            }
            return mo4169a(i2, i, true);
        }

        /* renamed from: g */
        public int mo4186g() {
            return StaggeredGridLayoutManager.this.f3190z ? mo4176b(0, this.f3216a.size(), false) : mo4176b(this.f3216a.size() - 1, -1, false);
        }

        /* renamed from: h */
        public int mo4187h() {
            return this.f3219d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public int mo4188i() {
            int i = this.f3218c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo4172a();
            return this.f3218c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public int mo4189j() {
            int i = this.f3217b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo4178b();
            return this.f3217b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo4190k() {
            this.f3217b = Integer.MIN_VALUE;
            this.f3218c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo4191l() {
            int size = this.f3216a.size();
            View remove = this.f3216a.remove(size - 1);
            C0787b b = mo4177b(remove);
            b.f3214e = null;
            if (b.mo3942c() || b.mo3941b()) {
                this.f3219d -= StaggeredGridLayoutManager.this.f3185u.mo3077b(remove);
            }
            if (size == 1) {
                this.f3217b = Integer.MIN_VALUE;
            }
            this.f3218c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo4192m() {
            View remove = this.f3216a.remove(0);
            C0787b b = mo4177b(remove);
            b.f3214e = null;
            if (this.f3216a.size() == 0) {
                this.f3218c = Integer.MIN_VALUE;
            }
            if (b.mo3942c() || b.mo3941b()) {
                this.f3219d -= StaggeredGridLayoutManager.this.f3185u.mo3077b(remove);
            }
            this.f3217b = Integer.MIN_VALUE;
        }
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.f3187w = i2;
        mo4139j(i);
        this.f3189y = new C0876pa();
        m4421O();
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.C0759i.C0761b a = RecyclerView.C0759i.m4093a(context, attributeSet, i, i2);
        mo4138i(a.f3038a);
        mo4139j(a.f3039b);
        mo4137c(a.f3040c);
        this.f3189y = new C0876pa();
        m4421O();
    }

    /* renamed from: O */
    private void m4421O() {
        this.f3185u = C0687Aa.m3426a(this, this.f3187w);
        this.f3186v = C0687Aa.m3426a(this, 1 - this.f3187w);
    }

    /* renamed from: P */
    private void m4422P() {
        if (this.f3186v.mo3080d() != 1073741824) {
            int e = mo3903e();
            float f = 0.0f;
            for (int i = 0; i < e; i++) {
                View c = mo3890c(i);
                float b = (float) this.f3186v.mo3077b(c);
                if (b >= f) {
                    if (((C0787b) c.getLayoutParams()).mo4167f()) {
                        b = (b * 1.0f) / ((float) this.f3183s);
                    }
                    f = Math.max(f, b);
                }
            }
            int i2 = this.f3188x;
            int round = Math.round(f * ((float) this.f3183s));
            if (this.f3186v.mo3080d() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f3186v.mo3086g());
            }
            mo4140k(round);
            if (this.f3188x != i2) {
                for (int i3 = 0; i3 < e; i3++) {
                    View c2 = mo3890c(i3);
                    C0787b bVar = (C0787b) c2.getLayoutParams();
                    if (!bVar.f3215f) {
                        if (!mo4128N() || this.f3187w != 1) {
                            int i4 = bVar.f3214e.f3220e;
                            int i5 = this.f3188x * i4;
                            int i6 = i4 * i2;
                            if (this.f3187w == 1) {
                                c2.offsetLeftAndRight(i5 - i6);
                            } else {
                                c2.offsetTopAndBottom(i5 - i6);
                            }
                        } else {
                            int i7 = this.f3183s;
                            int i8 = bVar.f3214e.f3220e;
                            c2.offsetLeftAndRight(((-((i7 - 1) - i8)) * this.f3188x) - ((-((i7 - 1) - i8)) * i2));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: Q */
    private void m4423Q() {
        this.f3167A = (this.f3187w == 1 || !mo4128N()) ? this.f3190z : !this.f3190z;
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* renamed from: a */
    private int m4424a(RecyclerView.C0769p pVar, C0876pa paVar, RecyclerView.C0775t tVar) {
        C0788c cVar;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        View view;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        boolean z;
        RecyclerView.C0769p pVar2 = pVar;
        C0876pa paVar2 = paVar;
        ? r9 = 0;
        this.f3168B.set(0, this.f3183s, true);
        int i7 = this.f3189y.f3596i ? paVar2.f3592e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : paVar2.f3592e == 1 ? paVar2.f3594g + paVar2.f3589b : paVar2.f3593f - paVar2.f3589b;
        m4442e(paVar2.f3592e, i7);
        int b = this.f3167A ? this.f3185u.mo3076b() : this.f3185u.mo3084f();
        boolean z2 = false;
        while (paVar.mo4633a(tVar) && (this.f3189y.f3596i || !this.f3168B.isEmpty())) {
            View a = paVar2.mo4632a(pVar2);
            C0787b bVar = (C0787b) a.getLayoutParams();
            int a2 = bVar.mo3940a();
            int d = this.f3171E.mo4150d(a2);
            boolean z3 = d == -1 ? true : r9;
            if (z3) {
                cVar = bVar.f3215f ? this.f3184t[r9] : m4425a(paVar2);
                this.f3171E.mo4145a(a2, cVar);
            } else {
                cVar = this.f3184t[d];
            }
            C0788c cVar2 = cVar;
            bVar.f3214e = cVar2;
            if (paVar2.f3592e == 1) {
                mo3885b(a);
            } else {
                mo3886b(a, (int) r9);
            }
            m4433a(a, bVar, (boolean) r9);
            if (paVar2.f3592e == 1) {
                int r = bVar.f3215f ? m4454r(b) : cVar2.mo4168a(b);
                int b2 = this.f3185u.mo3077b(a) + r;
                if (z3 && bVar.f3215f) {
                    LazySpanLookup.FullSpanItem n = m4448n(r);
                    n.f3194b = -1;
                    n.f3193a = a2;
                    this.f3171E.mo4146a(n);
                }
                i = b2;
                i2 = r;
            } else {
                int u = bVar.f3215f ? m4457u(b) : cVar2.mo4175b(b);
                i2 = u - this.f3185u.mo3077b(a);
                if (z3 && bVar.f3215f) {
                    LazySpanLookup.FullSpanItem o = m4449o(u);
                    o.f3194b = 1;
                    o.f3193a = a2;
                    this.f3171E.mo4146a(o);
                }
                i = u;
            }
            if (bVar.f3215f && paVar2.f3591d == -1) {
                if (!z3) {
                    if (!(paVar2.f3592e == 1 ? mo4119E() : mo4120F())) {
                        LazySpanLookup.FullSpanItem c = this.f3171E.mo4149c(a2);
                        if (c != null) {
                            c.f3196d = true;
                        }
                    }
                }
                this.f3179M = true;
            }
            m4432a(a, bVar, paVar2);
            if (!mo4128N() || this.f3187w != 1) {
                int f = bVar.f3215f ? this.f3186v.mo3084f() : (cVar2.f3220e * this.f3188x) + this.f3186v.mo3084f();
                i4 = f;
                i3 = this.f3186v.mo3077b(a) + f;
            } else {
                int b3 = bVar.f3215f ? this.f3186v.mo3076b() : this.f3186v.mo3076b() - (((this.f3183s - 1) - cVar2.f3220e) * this.f3188x);
                i3 = b3;
                i4 = b3 - this.f3186v.mo3077b(a);
            }
            if (this.f3187w == 1) {
                staggeredGridLayoutManager = this;
                view = a;
                i6 = i4;
                i4 = i2;
                i5 = i3;
            } else {
                staggeredGridLayoutManager = this;
                view = a;
                i6 = i2;
                i5 = i;
                i = i3;
            }
            staggeredGridLayoutManager.mo3864a(view, i6, i4, i5, i);
            if (bVar.f3215f) {
                m4442e(this.f3189y.f3592e, i7);
            } else {
                m4430a(cVar2, this.f3189y.f3592e, i7);
            }
            m4428a(pVar2, this.f3189y);
            if (this.f3189y.f3595h && a.hasFocusable()) {
                if (bVar.f3215f) {
                    this.f3168B.clear();
                } else {
                    z = false;
                    this.f3168B.set(cVar2.f3220e, false);
                    r9 = z;
                    z2 = true;
                }
            }
            z = false;
            r9 = z;
            z2 = true;
        }
        int i8 = r9;
        if (!z2) {
            m4428a(pVar2, this.f3189y);
        }
        int f2 = this.f3189y.f3592e == -1 ? this.f3185u.mo3084f() - m4457u(this.f3185u.mo3084f()) : m4454r(this.f3185u.mo3076b()) - this.f3185u.mo3076b();
        return f2 > 0 ? Math.min(paVar2.f3589b, f2) : i8;
    }

    /* renamed from: a */
    private C0788c m4425a(C0876pa paVar) {
        int i;
        int i2;
        int i3 = -1;
        if (m4458v(paVar.f3592e)) {
            i2 = this.f3183s - 1;
            i = -1;
        } else {
            i2 = 0;
            i3 = this.f3183s;
            i = 1;
        }
        C0788c cVar = null;
        if (paVar.f3592e == 1) {
            int i4 = Integer.MAX_VALUE;
            int f = this.f3185u.mo3084f();
            while (i2 != i3) {
                C0788c cVar2 = this.f3184t[i2];
                int a = cVar2.mo4168a(f);
                if (a < i4) {
                    cVar = cVar2;
                    i4 = a;
                }
                i2 += i;
            }
            return cVar;
        }
        int i5 = Integer.MIN_VALUE;
        int b = this.f3185u.mo3076b();
        while (i2 != i3) {
            C0788c cVar3 = this.f3184t[i2];
            int b2 = cVar3.mo4175b(b);
            if (b2 > i5) {
                cVar = cVar3;
                i5 = b2;
            }
            i2 += i;
        }
        return cVar;
    }

    /* renamed from: a */
    private void m4426a(RecyclerView.C0769p pVar, int i) {
        int e = mo3903e() - 1;
        while (e >= 0) {
            View c = mo3890c(e);
            if (this.f3185u.mo3081d(c) >= i && this.f3185u.mo3085f(c) >= i) {
                C0787b bVar = (C0787b) c.getLayoutParams();
                if (bVar.f3215f) {
                    int i2 = 0;
                    while (i2 < this.f3183s) {
                        if (this.f3184t[i2].f3216a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f3183s; i3++) {
                        this.f3184t[i3].mo4191l();
                    }
                } else if (bVar.f3214e.f3216a.size() != 1) {
                    bVar.f3214e.mo4191l();
                } else {
                    return;
                }
                mo3868a(c, pVar);
                e--;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m4427a(RecyclerView.C0769p pVar, RecyclerView.C0775t tVar, boolean z) {
        int b;
        int r = m4454r(Integer.MIN_VALUE);
        if (r != Integer.MIN_VALUE && (b = this.f3185u.mo3076b() - r) > 0) {
            int i = b - (-mo4136c(-b, pVar, tVar));
            if (z && i > 0) {
                this.f3185u.mo3075a(i);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r4.f3592e == -1) goto L_0x0012;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4428a(android.support.p011v7.widget.RecyclerView.C0769p r3, android.support.p011v7.widget.C0876pa r4) {
        /*
            r2 = this;
            boolean r0 = r4.f3588a
            if (r0 == 0) goto L_0x004d
            boolean r0 = r4.f3596i
            if (r0 == 0) goto L_0x0009
            goto L_0x004d
        L_0x0009:
            int r0 = r4.f3589b
            r1 = -1
            if (r0 != 0) goto L_0x001e
            int r0 = r4.f3592e
            if (r0 != r1) goto L_0x0018
        L_0x0012:
            int r4 = r4.f3594g
        L_0x0014:
            r2.m4426a((android.support.p011v7.widget.RecyclerView.C0769p) r3, (int) r4)
            goto L_0x004d
        L_0x0018:
            int r4 = r4.f3593f
        L_0x001a:
            r2.m4436b((android.support.p011v7.widget.RecyclerView.C0769p) r3, (int) r4)
            goto L_0x004d
        L_0x001e:
            int r0 = r4.f3592e
            if (r0 != r1) goto L_0x0037
            int r0 = r4.f3593f
            int r1 = r2.m4455s(r0)
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x002c
            goto L_0x0012
        L_0x002c:
            int r1 = r4.f3594g
            int r4 = r4.f3589b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r1 - r4
            goto L_0x0014
        L_0x0037:
            int r0 = r4.f3594g
            int r0 = r2.m4456t(r0)
            int r1 = r4.f3594g
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x0043
            goto L_0x0018
        L_0x0043:
            int r1 = r4.f3593f
            int r4 = r4.f3589b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + r1
            goto L_0x001a
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.StaggeredGridLayoutManager.m4428a(android.support.v7.widget.RecyclerView$p, android.support.v7.widget.pa):void");
    }

    /* renamed from: a */
    private void m4429a(C0786a aVar) {
        boolean z;
        SavedState savedState = this.f3175I;
        int i = savedState.f3199c;
        if (i > 0) {
            if (i == this.f3183s) {
                for (int i2 = 0; i2 < this.f3183s; i2++) {
                    this.f3184t[i2].mo4179c();
                    SavedState savedState2 = this.f3175I;
                    int i3 = savedState2.f3200d[i2];
                    if (i3 != Integer.MIN_VALUE) {
                        i3 += savedState2.f3205i ? this.f3185u.mo3076b() : this.f3185u.mo3084f();
                    }
                    this.f3184t[i2].mo4183d(i3);
                }
            } else {
                savedState.mo4158b();
                SavedState savedState3 = this.f3175I;
                savedState3.f3197a = savedState3.f3198b;
            }
        }
        SavedState savedState4 = this.f3175I;
        this.f3174H = savedState4.f3206j;
        mo4137c(savedState4.f3204h);
        m4423Q();
        SavedState savedState5 = this.f3175I;
        int i4 = savedState5.f3197a;
        if (i4 != -1) {
            this.f3169C = i4;
            z = savedState5.f3205i;
        } else {
            z = this.f3167A;
        }
        aVar.f3209c = z;
        SavedState savedState6 = this.f3175I;
        if (savedState6.f3201e > 1) {
            LazySpanLookup lazySpanLookup = this.f3171E;
            lazySpanLookup.f3191a = savedState6.f3202f;
            lazySpanLookup.f3192b = savedState6.f3203g;
        }
    }

    /* renamed from: a */
    private void m4430a(C0788c cVar, int i, int i2) {
        int h = cVar.mo4187h();
        if (i == -1) {
            if (cVar.mo4189j() + h > i2) {
                return;
            }
        } else if (cVar.mo4188i() - h < i2) {
            return;
        }
        this.f3168B.set(cVar.f3220e, false);
    }

    /* renamed from: a */
    private void m4431a(View view, int i, int i2, boolean z) {
        mo3866a(view, this.f3177K);
        C0787b bVar = (C0787b) view.getLayoutParams();
        int i3 = bVar.leftMargin;
        Rect rect = this.f3177K;
        int d = m4441d(i, i3 + rect.left, bVar.rightMargin + rect.right);
        int i4 = bVar.topMargin;
        Rect rect2 = this.f3177K;
        int d2 = m4441d(i2, i4 + rect2.top, bVar.bottomMargin + rect2.bottom);
        if (z ? mo3888b(view, d, d2, (RecyclerView.C0762j) bVar) : mo3878a(view, d, d2, (RecyclerView.C0762j) bVar)) {
            view.measure(d, d2);
        }
    }

    /* renamed from: a */
    private void m4432a(View view, C0787b bVar, C0876pa paVar) {
        if (paVar.f3592e == 1) {
            if (bVar.f3215f) {
                m4451p(view);
            } else {
                bVar.f3214e.mo4173a(view);
            }
        } else if (bVar.f3215f) {
            m4453q(view);
        } else {
            bVar.f3214e.mo4181c(view);
        }
    }

    /* renamed from: a */
    private void m4433a(View view, C0787b bVar, boolean z) {
        int i;
        int i2;
        if (bVar.f3215f) {
            if (this.f3187w == 1) {
                i2 = this.f3176J;
            } else {
                m4431a(view, RecyclerView.C0759i.m4092a(mo3932r(), mo3933s(), mo3928o() + mo3930p(), bVar.width, true), this.f3176J, z);
                return;
            }
        } else if (this.f3187w == 1) {
            i2 = RecyclerView.C0759i.m4092a(this.f3188x, mo3933s(), 0, bVar.width, false);
        } else {
            i2 = RecyclerView.C0759i.m4092a(mo3932r(), mo3933s(), mo3928o() + mo3930p(), bVar.width, true);
            i = RecyclerView.C0759i.m4092a(this.f3188x, mo3916i(), 0, bVar.height, false);
            m4431a(view, i2, i, z);
        }
        i = RecyclerView.C0759i.m4092a(mo3914h(), mo3916i(), mo3931q() + mo3926n(), bVar.height, true);
        m4431a(view, i2, i, z);
    }

    /* renamed from: a */
    private boolean m4434a(C0788c cVar) {
        if (this.f3167A) {
            if (cVar.mo4188i() < this.f3185u.mo3076b()) {
                ArrayList<View> arrayList = cVar.f3216a;
                return !cVar.mo4177b(arrayList.get(arrayList.size() - 1)).f3215f;
            }
        } else if (cVar.mo4189j() > this.f3185u.mo3084f()) {
            return !cVar.mo4177b(cVar.f3216a.get(0)).f3215f;
        }
        return false;
    }

    /* renamed from: b */
    private void m4435b(int i, RecyclerView.C0775t tVar) {
        int i2;
        int i3;
        int b;
        C0876pa paVar = this.f3189y;
        boolean z = false;
        paVar.f3589b = 0;
        paVar.f3590c = i;
        if (!mo3937x() || (b = tVar.mo4014b()) == -1) {
            i3 = 0;
            i2 = 0;
        } else {
            if (this.f3167A == (b < i)) {
                i3 = this.f3185u.mo3086g();
                i2 = 0;
            } else {
                i2 = this.f3185u.mo3086g();
                i3 = 0;
            }
        }
        if (mo3910f()) {
            this.f3189y.f3593f = this.f3185u.mo3084f() - i2;
            this.f3189y.f3594g = this.f3185u.mo3076b() + i3;
        } else {
            this.f3189y.f3594g = this.f3185u.mo3073a() + i3;
            this.f3189y.f3593f = -i2;
        }
        C0876pa paVar2 = this.f3189y;
        paVar2.f3595h = false;
        paVar2.f3588a = true;
        if (this.f3185u.mo3080d() == 0 && this.f3185u.mo3073a() == 0) {
            z = true;
        }
        paVar2.f3596i = z;
    }

    /* renamed from: b */
    private void m4436b(RecyclerView.C0769p pVar, int i) {
        while (mo3903e() > 0) {
            View c = mo3890c(0);
            if (this.f3185u.mo3074a(c) <= i && this.f3185u.mo3083e(c) <= i) {
                C0787b bVar = (C0787b) c.getLayoutParams();
                if (bVar.f3215f) {
                    int i2 = 0;
                    while (i2 < this.f3183s) {
                        if (this.f3184t[i2].f3216a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f3183s; i3++) {
                        this.f3184t[i3].mo4192m();
                    }
                } else if (bVar.f3214e.f3216a.size() != 1) {
                    bVar.f3214e.mo4192m();
                } else {
                    return;
                }
                mo3868a(c, pVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    private void m4437b(RecyclerView.C0769p pVar, RecyclerView.C0775t tVar, boolean z) {
        int f;
        int u = m4457u(Integer.MAX_VALUE);
        if (u != Integer.MAX_VALUE && (f = u - this.f3185u.mo3084f()) > 0) {
            int c = f - mo4136c(f, pVar, tVar);
            if (z && c > 0) {
                this.f3185u.mo3075a(-c);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0045 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4438c(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f3167A
            if (r0 == 0) goto L_0x0009
            int r0 = r6.mo4124J()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.mo4123I()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001b
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001d
        L_0x0016:
            int r2 = r7 + 1
            r3 = r2
            r2 = r8
            goto L_0x001f
        L_0x001b:
            int r2 = r7 + r8
        L_0x001d:
            r3 = r2
            r2 = r7
        L_0x001f:
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.f3171E
            r4.mo4151e(r2)
            r4 = 1
            if (r9 == r4) goto L_0x003e
            r5 = 2
            if (r9 == r5) goto L_0x0038
            if (r9 == r1) goto L_0x002d
            goto L_0x0043
        L_0x002d:
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f3171E
            r9.mo4148b(r7, r4)
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.f3171E
            r7.mo4144a((int) r8, (int) r4)
            goto L_0x0043
        L_0x0038:
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f3171E
            r9.mo4148b(r7, r8)
            goto L_0x0043
        L_0x003e:
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f3171E
            r9.mo4144a((int) r7, (int) r8)
        L_0x0043:
            if (r3 > r0) goto L_0x0046
            return
        L_0x0046:
            boolean r7 = r6.f3167A
            if (r7 == 0) goto L_0x004f
            int r7 = r6.mo4123I()
            goto L_0x0053
        L_0x004f:
            int r7 = r6.mo4124J()
        L_0x0053:
            if (r2 > r7) goto L_0x0058
            r6.mo3938z()
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.StaggeredGridLayoutManager.m4438c(int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x014b, code lost:
        if (mo4121G() != false) goto L_0x014f;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4439c(android.support.p011v7.widget.RecyclerView.C0769p r9, android.support.p011v7.widget.RecyclerView.C0775t r10, boolean r11) {
        /*
            r8 = this;
            android.support.v7.widget.StaggeredGridLayoutManager$a r0 = r8.f3178L
            android.support.v7.widget.StaggeredGridLayoutManager$SavedState r1 = r8.f3175I
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r8.f3169C
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r10.mo4011a()
            if (r1 != 0) goto L_0x0018
            r8.mo3883b((android.support.p011v7.widget.RecyclerView.C0769p) r9)
            r0.mo4164b()
            return
        L_0x0018:
            boolean r1 = r0.f3211e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r8.f3169C
            if (r1 != r2) goto L_0x0029
            android.support.v7.widget.StaggeredGridLayoutManager$SavedState r1 = r8.f3175I
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = r3
            goto L_0x002a
        L_0x0029:
            r1 = r4
        L_0x002a:
            if (r1 == 0) goto L_0x0043
            r0.mo4164b()
            android.support.v7.widget.StaggeredGridLayoutManager$SavedState r5 = r8.f3175I
            if (r5 == 0) goto L_0x0037
            r8.m4429a((android.support.p011v7.widget.StaggeredGridLayoutManager.C0786a) r0)
            goto L_0x003e
        L_0x0037:
            r8.m4423Q()
            boolean r5 = r8.f3167A
            r0.f3209c = r5
        L_0x003e:
            r8.mo4134b((android.support.p011v7.widget.RecyclerView.C0775t) r10, (android.support.p011v7.widget.StaggeredGridLayoutManager.C0786a) r0)
            r0.f3211e = r4
        L_0x0043:
            android.support.v7.widget.StaggeredGridLayoutManager$SavedState r5 = r8.f3175I
            if (r5 != 0) goto L_0x0060
            int r5 = r8.f3169C
            if (r5 != r2) goto L_0x0060
            boolean r5 = r0.f3209c
            boolean r6 = r8.f3173G
            if (r5 != r6) goto L_0x0059
            boolean r5 = r8.mo4128N()
            boolean r6 = r8.f3174H
            if (r5 == r6) goto L_0x0060
        L_0x0059:
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r5 = r8.f3171E
            r5.mo4142a()
            r0.f3210d = r4
        L_0x0060:
            int r5 = r8.mo3903e()
            if (r5 <= 0) goto L_0x00c9
            android.support.v7.widget.StaggeredGridLayoutManager$SavedState r5 = r8.f3175I
            if (r5 == 0) goto L_0x006e
            int r5 = r5.f3199c
            if (r5 >= r4) goto L_0x00c9
        L_0x006e:
            boolean r5 = r0.f3210d
            if (r5 == 0) goto L_0x008e
            r1 = r3
        L_0x0073:
            int r5 = r8.f3183s
            if (r1 >= r5) goto L_0x00c9
            android.support.v7.widget.StaggeredGridLayoutManager$c[] r5 = r8.f3184t
            r5 = r5[r1]
            r5.mo4179c()
            int r5 = r0.f3208b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L_0x008b
            android.support.v7.widget.StaggeredGridLayoutManager$c[] r6 = r8.f3184t
            r6 = r6[r1]
            r6.mo4183d(r5)
        L_0x008b:
            int r1 = r1 + 1
            goto L_0x0073
        L_0x008e:
            if (r1 != 0) goto L_0x00af
            android.support.v7.widget.StaggeredGridLayoutManager$a r1 = r8.f3178L
            int[] r1 = r1.f3212f
            if (r1 != 0) goto L_0x0097
            goto L_0x00af
        L_0x0097:
            r1 = r3
        L_0x0098:
            int r5 = r8.f3183s
            if (r1 >= r5) goto L_0x00c9
            android.support.v7.widget.StaggeredGridLayoutManager$c[] r5 = r8.f3184t
            r5 = r5[r1]
            r5.mo4179c()
            android.support.v7.widget.StaggeredGridLayoutManager$a r6 = r8.f3178L
            int[] r6 = r6.f3212f
            r6 = r6[r1]
            r5.mo4183d(r6)
            int r1 = r1 + 1
            goto L_0x0098
        L_0x00af:
            r1 = r3
        L_0x00b0:
            int r5 = r8.f3183s
            if (r1 >= r5) goto L_0x00c2
            android.support.v7.widget.StaggeredGridLayoutManager$c[] r5 = r8.f3184t
            r5 = r5[r1]
            boolean r6 = r8.f3167A
            int r7 = r0.f3208b
            r5.mo4174a((boolean) r6, (int) r7)
            int r1 = r1 + 1
            goto L_0x00b0
        L_0x00c2:
            android.support.v7.widget.StaggeredGridLayoutManager$a r1 = r8.f3178L
            android.support.v7.widget.StaggeredGridLayoutManager$c[] r5 = r8.f3184t
            r1.mo4163a((android.support.p011v7.widget.StaggeredGridLayoutManager.C0788c[]) r5)
        L_0x00c9:
            r8.mo3855a((android.support.p011v7.widget.RecyclerView.C0769p) r9)
            android.support.v7.widget.pa r1 = r8.f3189y
            r1.f3588a = r3
            r8.f3179M = r3
            android.support.v7.widget.Aa r1 = r8.f3186v
            int r1 = r1.mo3086g()
            r8.mo4140k(r1)
            int r1 = r0.f3207a
            r8.m4435b((int) r1, (android.support.p011v7.widget.RecyclerView.C0775t) r10)
            boolean r1 = r0.f3209c
            if (r1 == 0) goto L_0x00f0
            r8.m4459w(r2)
            android.support.v7.widget.pa r1 = r8.f3189y
            r8.m4424a((android.support.p011v7.widget.RecyclerView.C0769p) r9, (android.support.p011v7.widget.C0876pa) r1, (android.support.p011v7.widget.RecyclerView.C0775t) r10)
            r8.m4459w(r4)
            goto L_0x00fb
        L_0x00f0:
            r8.m4459w(r4)
            android.support.v7.widget.pa r1 = r8.f3189y
            r8.m4424a((android.support.p011v7.widget.RecyclerView.C0769p) r9, (android.support.p011v7.widget.C0876pa) r1, (android.support.p011v7.widget.RecyclerView.C0775t) r10)
            r8.m4459w(r2)
        L_0x00fb:
            android.support.v7.widget.pa r1 = r8.f3189y
            int r2 = r0.f3207a
            int r5 = r1.f3591d
            int r2 = r2 + r5
            r1.f3590c = r2
            r8.m4424a((android.support.p011v7.widget.RecyclerView.C0769p) r9, (android.support.p011v7.widget.C0876pa) r1, (android.support.p011v7.widget.RecyclerView.C0775t) r10)
            r8.m4422P()
            int r1 = r8.mo3903e()
            if (r1 <= 0) goto L_0x0121
            boolean r1 = r8.f3167A
            if (r1 == 0) goto L_0x011b
            r8.m4427a((android.support.p011v7.widget.RecyclerView.C0769p) r9, (android.support.p011v7.widget.RecyclerView.C0775t) r10, (boolean) r4)
            r8.m4437b((android.support.p011v7.widget.RecyclerView.C0769p) r9, (android.support.p011v7.widget.RecyclerView.C0775t) r10, (boolean) r3)
            goto L_0x0121
        L_0x011b:
            r8.m4437b((android.support.p011v7.widget.RecyclerView.C0769p) r9, (android.support.p011v7.widget.RecyclerView.C0775t) r10, (boolean) r4)
            r8.m4427a((android.support.p011v7.widget.RecyclerView.C0769p) r9, (android.support.p011v7.widget.RecyclerView.C0775t) r10, (boolean) r3)
        L_0x0121:
            if (r11 == 0) goto L_0x014e
            boolean r11 = r10.mo4016d()
            if (r11 != 0) goto L_0x014e
            int r11 = r8.f3172F
            if (r11 == 0) goto L_0x013f
            int r11 = r8.mo3903e()
            if (r11 <= 0) goto L_0x013f
            boolean r11 = r8.f3179M
            if (r11 != 0) goto L_0x013d
            android.view.View r11 = r8.mo4126L()
            if (r11 == 0) goto L_0x013f
        L_0x013d:
            r11 = r4
            goto L_0x0140
        L_0x013f:
            r11 = r3
        L_0x0140:
            if (r11 == 0) goto L_0x014e
            java.lang.Runnable r11 = r8.f3182P
            r8.mo3881a((java.lang.Runnable) r11)
            boolean r11 = r8.mo4121G()
            if (r11 == 0) goto L_0x014e
            goto L_0x014f
        L_0x014e:
            r4 = r3
        L_0x014f:
            boolean r11 = r10.mo4016d()
            if (r11 == 0) goto L_0x015a
            android.support.v7.widget.StaggeredGridLayoutManager$a r11 = r8.f3178L
            r11.mo4164b()
        L_0x015a:
            boolean r11 = r0.f3209c
            r8.f3173G = r11
            boolean r11 = r8.mo4128N()
            r8.f3174H = r11
            if (r4 == 0) goto L_0x016e
            android.support.v7.widget.StaggeredGridLayoutManager$a r11 = r8.f3178L
            r11.mo4164b()
            r8.m4439c((android.support.p011v7.widget.RecyclerView.C0769p) r9, (android.support.p011v7.widget.RecyclerView.C0775t) r10, (boolean) r3)
        L_0x016e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.StaggeredGridLayoutManager.m4439c(android.support.v7.widget.RecyclerView$p, android.support.v7.widget.RecyclerView$t, boolean):void");
    }

    /* renamed from: c */
    private boolean m4440c(RecyclerView.C0775t tVar, C0786a aVar) {
        aVar.f3207a = this.f3173G ? m4452q(tVar.mo4011a()) : m4450p(tVar.mo4011a());
        aVar.f3208b = Integer.MIN_VALUE;
        return true;
    }

    /* renamed from: d */
    private int m4441d(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* renamed from: e */
    private void m4442e(int i, int i2) {
        for (int i3 = 0; i3 < this.f3183s; i3++) {
            if (!this.f3184t[i3].f3216a.isEmpty()) {
                m4430a(this.f3184t[i3], i, i2);
            }
        }
    }

    /* renamed from: h */
    private int m4443h(RecyclerView.C0775t tVar) {
        if (mo3903e() == 0) {
            return 0;
        }
        return C0741Pa.m3878a(tVar, this.f3185u, mo4133b(!this.f3180N), mo4129a(!this.f3180N), this, this.f3180N);
    }

    /* renamed from: i */
    private int m4444i(RecyclerView.C0775t tVar) {
        if (mo3903e() == 0) {
            return 0;
        }
        return C0741Pa.m3879a(tVar, this.f3185u, mo4133b(!this.f3180N), mo4129a(!this.f3180N), this, this.f3180N, this.f3167A);
    }

    /* renamed from: j */
    private int m4445j(RecyclerView.C0775t tVar) {
        if (mo3903e() == 0) {
            return 0;
        }
        return C0741Pa.m3880b(tVar, this.f3185u, mo4133b(!this.f3180N), mo4129a(!this.f3180N), this, this.f3180N);
    }

    /* renamed from: l */
    private int m4446l(int i) {
        if (mo3903e() == 0) {
            return this.f3167A ? 1 : -1;
        }
        return (i < mo4123I()) != this.f3167A ? -1 : 1;
    }

    /* renamed from: m */
    private int m4447m(int i) {
        if (i == 1) {
            return (this.f3187w != 1 && mo4128N()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.f3187w != 1 && mo4128N()) ? -1 : 1;
        }
        if (i == 17) {
            return this.f3187w == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.f3187w == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 66) {
            return this.f3187w == 0 ? 1 : Integer.MIN_VALUE;
        }
        if (i != 130) {
            return Integer.MIN_VALUE;
        }
        return this.f3187w == 1 ? 1 : Integer.MIN_VALUE;
    }

    /* renamed from: n */
    private LazySpanLookup.FullSpanItem m4448n(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f3195c = new int[this.f3183s];
        for (int i2 = 0; i2 < this.f3183s; i2++) {
            fullSpanItem.f3195c[i2] = i - this.f3184t[i2].mo4168a(i);
        }
        return fullSpanItem;
    }

    /* renamed from: o */
    private LazySpanLookup.FullSpanItem m4449o(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f3195c = new int[this.f3183s];
        for (int i2 = 0; i2 < this.f3183s; i2++) {
            fullSpanItem.f3195c[i2] = this.f3184t[i2].mo4175b(i) - i;
        }
        return fullSpanItem;
    }

    /* renamed from: p */
    private int m4450p(int i) {
        int e = mo3903e();
        for (int i2 = 0; i2 < e; i2++) {
            int l = mo3923l(mo3890c(i2));
            if (l >= 0 && l < i) {
                return l;
            }
        }
        return 0;
    }

    /* renamed from: p */
    private void m4451p(View view) {
        for (int i = this.f3183s - 1; i >= 0; i--) {
            this.f3184t[i].mo4173a(view);
        }
    }

    /* renamed from: q */
    private int m4452q(int i) {
        for (int e = mo3903e() - 1; e >= 0; e--) {
            int l = mo3923l(mo3890c(e));
            if (l >= 0 && l < i) {
                return l;
            }
        }
        return 0;
    }

    /* renamed from: q */
    private void m4453q(View view) {
        for (int i = this.f3183s - 1; i >= 0; i--) {
            this.f3184t[i].mo4181c(view);
        }
    }

    /* renamed from: r */
    private int m4454r(int i) {
        int a = this.f3184t[0].mo4168a(i);
        for (int i2 = 1; i2 < this.f3183s; i2++) {
            int a2 = this.f3184t[i2].mo4168a(i);
            if (a2 > a) {
                a = a2;
            }
        }
        return a;
    }

    /* renamed from: s */
    private int m4455s(int i) {
        int b = this.f3184t[0].mo4175b(i);
        for (int i2 = 1; i2 < this.f3183s; i2++) {
            int b2 = this.f3184t[i2].mo4175b(i);
            if (b2 > b) {
                b = b2;
            }
        }
        return b;
    }

    /* renamed from: t */
    private int m4456t(int i) {
        int a = this.f3184t[0].mo4168a(i);
        for (int i2 = 1; i2 < this.f3183s; i2++) {
            int a2 = this.f3184t[i2].mo4168a(i);
            if (a2 < a) {
                a = a2;
            }
        }
        return a;
    }

    /* renamed from: u */
    private int m4457u(int i) {
        int b = this.f3184t[0].mo4175b(i);
        for (int i2 = 1; i2 < this.f3183s; i2++) {
            int b2 = this.f3184t[i2].mo4175b(i);
            if (b2 < b) {
                b = b2;
            }
        }
        return b;
    }

    /* renamed from: v */
    private boolean m4458v(int i) {
        if (this.f3187w == 0) {
            return (i == -1) != this.f3167A;
        }
        return ((i == -1) == this.f3167A) == mo4128N();
    }

    /* renamed from: w */
    private void m4459w(int i) {
        C0876pa paVar = this.f3189y;
        paVar.f3592e = i;
        int i2 = 1;
        if (this.f3167A != (i == -1)) {
            i2 = -1;
        }
        paVar.f3591d = i2;
    }

    /* renamed from: D */
    public boolean mo3366D() {
        return this.f3175I == null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public boolean mo4119E() {
        int a = this.f3184t[0].mo4168a(Integer.MIN_VALUE);
        for (int i = 1; i < this.f3183s; i++) {
            if (this.f3184t[i].mo4168a(Integer.MIN_VALUE) != a) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public boolean mo4120F() {
        int b = this.f3184t[0].mo4175b(Integer.MIN_VALUE);
        for (int i = 1; i < this.f3183s; i++) {
            if (this.f3184t[i].mo4175b(Integer.MIN_VALUE) != b) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public boolean mo4121G() {
        int i;
        int i2;
        if (mo3903e() == 0 || this.f3172F == 0 || !mo3935u()) {
            return false;
        }
        if (this.f3167A) {
            i2 = mo4124J();
            i = mo4123I();
        } else {
            i2 = mo4123I();
            i = mo4124J();
        }
        if (i2 == 0 && mo4126L() != null) {
            this.f3171E.mo4142a();
        } else if (!this.f3179M) {
            return false;
        } else {
            int i3 = this.f3167A ? -1 : 1;
            int i4 = i + 1;
            LazySpanLookup.FullSpanItem a = this.f3171E.mo4141a(i2, i4, i3, true);
            if (a == null) {
                this.f3179M = false;
                this.f3171E.mo4147b(i4);
                return false;
            }
            LazySpanLookup.FullSpanItem a2 = this.f3171E.mo4141a(i2, a.f3193a, i3 * -1, true);
            if (a2 == null) {
                this.f3171E.mo4147b(a.f3193a);
            } else {
                this.f3171E.mo4147b(a2.f3193a + 1);
            }
        }
        mo3848A();
        mo3938z();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public int mo4122H() {
        View a = this.f3167A ? mo4129a(true) : mo4133b(true);
        if (a == null) {
            return -1;
        }
        return mo3923l(a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public int mo4123I() {
        if (mo3903e() == 0) {
            return 0;
        }
        return mo3923l(mo3890c(0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public int mo4124J() {
        int e = mo3903e();
        if (e == 0) {
            return 0;
        }
        return mo3923l(mo3890c(e - 1));
    }

    /* renamed from: K */
    public int mo4125K() {
        return this.f3183s;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r10 = false;
     */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo4126L() {
        /*
            r12 = this;
            int r0 = r12.mo3903e()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f3183s
            r2.<init>(r3)
            int r3 = r12.f3183s
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f3187w
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.mo4128N()
            if (r3 == 0) goto L_0x0020
            r3 = r1
            goto L_0x0021
        L_0x0020:
            r3 = r5
        L_0x0021:
            boolean r6 = r12.f3167A
            if (r6 == 0) goto L_0x0027
            r6 = r5
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = r4
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = r1
        L_0x002e:
            if (r0 == r6) goto L_0x00ab
            android.view.View r7 = r12.mo3890c((int) r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            android.support.v7.widget.StaggeredGridLayoutManager$b r8 = (android.support.p011v7.widget.StaggeredGridLayoutManager.C0787b) r8
            android.support.v7.widget.StaggeredGridLayoutManager$c r9 = r8.f3214e
            int r9 = r9.f3220e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x0054
            android.support.v7.widget.StaggeredGridLayoutManager$c r9 = r8.f3214e
            boolean r9 = r12.m4434a((android.support.p011v7.widget.StaggeredGridLayoutManager.C0788c) r9)
            if (r9 == 0) goto L_0x004d
            return r7
        L_0x004d:
            android.support.v7.widget.StaggeredGridLayoutManager$c r9 = r8.f3214e
            int r9 = r9.f3220e
            r2.clear(r9)
        L_0x0054:
            boolean r9 = r8.f3215f
            if (r9 == 0) goto L_0x0059
            goto L_0x00a9
        L_0x0059:
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00a9
            android.view.View r9 = r12.mo3890c((int) r9)
            boolean r10 = r12.f3167A
            if (r10 == 0) goto L_0x0077
            android.support.v7.widget.Aa r10 = r12.f3185u
            int r10 = r10.mo3074a((android.view.View) r7)
            android.support.v7.widget.Aa r11 = r12.f3185u
            int r11 = r11.mo3074a((android.view.View) r9)
            if (r10 >= r11) goto L_0x0074
            return r7
        L_0x0074:
            if (r10 != r11) goto L_0x008a
            goto L_0x0088
        L_0x0077:
            android.support.v7.widget.Aa r10 = r12.f3185u
            int r10 = r10.mo3081d(r7)
            android.support.v7.widget.Aa r11 = r12.f3185u
            int r11 = r11.mo3081d(r9)
            if (r10 <= r11) goto L_0x0086
            return r7
        L_0x0086:
            if (r10 != r11) goto L_0x008a
        L_0x0088:
            r10 = r1
            goto L_0x008b
        L_0x008a:
            r10 = r4
        L_0x008b:
            if (r10 == 0) goto L_0x00a9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            android.support.v7.widget.StaggeredGridLayoutManager$b r9 = (android.support.p011v7.widget.StaggeredGridLayoutManager.C0787b) r9
            android.support.v7.widget.StaggeredGridLayoutManager$c r8 = r8.f3214e
            int r8 = r8.f3220e
            android.support.v7.widget.StaggeredGridLayoutManager$c r9 = r9.f3214e
            int r9 = r9.f3220e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00a0
            r8 = r1
            goto L_0x00a1
        L_0x00a0:
            r8 = r4
        L_0x00a1:
            if (r3 >= 0) goto L_0x00a5
            r9 = r1
            goto L_0x00a6
        L_0x00a5:
            r9 = r4
        L_0x00a6:
            if (r8 == r9) goto L_0x00a9
            return r7
        L_0x00a9:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00ab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.StaggeredGridLayoutManager.mo4126L():android.view.View");
    }

    /* renamed from: M */
    public void mo4127M() {
        this.f3171E.mo4142a();
        mo3938z();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public boolean mo4128N() {
        return mo3920k() == 1;
    }

    /* renamed from: a */
    public int mo3368a(int i, RecyclerView.C0769p pVar, RecyclerView.C0775t tVar) {
        return mo4136c(i, pVar, tVar);
    }

    /* renamed from: a */
    public int mo3369a(RecyclerView.C0769p pVar, RecyclerView.C0775t tVar) {
        return this.f3187w == 1 ? this.f3183s : super.mo3369a(pVar, tVar);
    }

    /* renamed from: a */
    public int mo3501a(RecyclerView.C0775t tVar) {
        return m4443h(tVar);
    }

    /* renamed from: a */
    public RecyclerView.C0762j mo3370a(Context context, AttributeSet attributeSet) {
        return new C0787b(context, attributeSet);
    }

    /* renamed from: a */
    public RecyclerView.C0762j mo3371a(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0787b((ViewGroup.MarginLayoutParams) layoutParams) : new C0787b(layoutParams);
    }

    /* renamed from: a */
    public View mo3373a(View view, int i, RecyclerView.C0769p pVar, RecyclerView.C0775t tVar) {
        View c;
        View a;
        if (mo3903e() == 0 || (c = mo3891c(view)) == null) {
            return null;
        }
        m4423Q();
        int m = m4447m(i);
        if (m == Integer.MIN_VALUE) {
            return null;
        }
        C0787b bVar = (C0787b) c.getLayoutParams();
        boolean z = bVar.f3215f;
        C0788c cVar = bVar.f3214e;
        int J = m == 1 ? mo4124J() : mo4123I();
        m4435b(J, tVar);
        m4459w(m);
        C0876pa paVar = this.f3189y;
        paVar.f3590c = paVar.f3591d + J;
        paVar.f3589b = (int) (((float) this.f3185u.mo3086g()) * 0.33333334f);
        C0876pa paVar2 = this.f3189y;
        paVar2.f3595h = true;
        paVar2.f3588a = false;
        m4424a(pVar, paVar2, tVar);
        this.f3173G = this.f3167A;
        if (!z && (a = cVar.mo4171a(J, m)) != null && a != c) {
            return a;
        }
        if (m4458v(m)) {
            for (int i2 = this.f3183s - 1; i2 >= 0; i2--) {
                View a2 = this.f3184t[i2].mo4171a(J, m);
                if (a2 != null && a2 != c) {
                    return a2;
                }
            }
        } else {
            for (int i3 = 0; i3 < this.f3183s; i3++) {
                View a3 = this.f3184t[i3].mo4171a(J, m);
                if (a3 != null && a3 != c) {
                    return a3;
                }
            }
        }
        boolean z2 = (this.f3190z ^ true) == (m == -1);
        if (!z) {
            View b = mo3511b(z2 ? cVar.mo4182d() : cVar.mo4185f());
            if (!(b == null || b == c)) {
                return b;
            }
        }
        if (m4458v(m)) {
            for (int i4 = this.f3183s - 1; i4 >= 0; i4--) {
                if (i4 != cVar.f3220e) {
                    View b2 = mo3511b(z2 ? this.f3184t[i4].mo4182d() : this.f3184t[i4].mo4185f());
                    if (!(b2 == null || b2 == c)) {
                        return b2;
                    }
                }
            }
        } else {
            for (int i5 = 0; i5 < this.f3183s; i5++) {
                View b3 = mo3511b(z2 ? this.f3184t[i5].mo4182d() : this.f3184t[i5].mo4185f());
                if (b3 != null && b3 != c) {
                    return b3;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo4129a(boolean z) {
        int f = this.f3185u.mo3084f();
        int b = this.f3185u.mo3076b();
        View view = null;
        for (int e = mo3903e() - 1; e >= 0; e--) {
            View c = mo3890c(e);
            int d = this.f3185u.mo3081d(c);
            int a = this.f3185u.mo3074a(c);
            if (a > f && d < b) {
                if (a <= b || !z) {
                    return c;
                }
                if (view == null) {
                    view = c;
                }
            }
        }
        return view;
    }

    /* renamed from: a */
    public void mo3503a(int i, int i2, RecyclerView.C0775t tVar, RecyclerView.C0759i.C0760a aVar) {
        int i3;
        int i4;
        if (this.f3187w != 0) {
            i = i2;
        }
        if (mo3903e() != 0 && i != 0) {
            mo4130a(i, tVar);
            int[] iArr = this.f3181O;
            if (iArr == null || iArr.length < this.f3183s) {
                this.f3181O = new int[this.f3183s];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f3183s; i6++) {
                C0876pa paVar = this.f3189y;
                if (paVar.f3591d == -1) {
                    i4 = paVar.f3593f;
                    i3 = this.f3184t[i6].mo4175b(i4);
                } else {
                    i4 = this.f3184t[i6].mo4168a(paVar.f3594g);
                    i3 = this.f3189y.f3594g;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.f3181O[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.f3181O, 0, i5);
            for (int i8 = 0; i8 < i5 && this.f3189y.mo4633a(tVar); i8++) {
                aVar.mo3939a(this.f3189y.f3590c, this.f3181O[i8]);
                C0876pa paVar2 = this.f3189y;
                paVar2.f3590c += paVar2.f3591d;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4130a(int i, RecyclerView.C0775t tVar) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = mo4124J();
            i2 = 1;
        } else {
            i2 = -1;
            i3 = mo4123I();
        }
        this.f3189y.f3588a = true;
        m4435b(i3, tVar);
        m4459w(i2);
        C0876pa paVar = this.f3189y;
        paVar.f3590c = i3 + paVar.f3591d;
        paVar.f3589b = Math.abs(i);
    }

    /* renamed from: a */
    public void mo3374a(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int o = mo3928o() + mo3930p();
        int q = mo3931q() + mo3926n();
        if (this.f3187w == 1) {
            i4 = RecyclerView.C0759i.m4091a(i2, rect.height() + q, mo3922l());
            i3 = RecyclerView.C0759i.m4091a(i, (this.f3188x * this.f3183s) + o, mo3924m());
        } else {
            i3 = RecyclerView.C0759i.m4091a(i, rect.width() + o, mo3924m());
            i4 = RecyclerView.C0759i.m4091a(i2, (this.f3188x * this.f3183s) + q, mo3922l());
        }
        mo3892c(i3, i4);
    }

    /* renamed from: a */
    public void mo3505a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f3175I = (SavedState) parcelable;
            mo3938z();
        }
    }

    /* renamed from: a */
    public void mo3378a(RecyclerView.C0769p pVar, RecyclerView.C0775t tVar, View view, C0446b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0787b)) {
            super.mo3867a(view, bVar);
            return;
        }
        C0787b bVar2 = (C0787b) layoutParams;
        int i5 = 1;
        if (this.f3187w == 0) {
            i4 = bVar2.mo4166e();
            if (bVar2.f3215f) {
                i5 = this.f3183s;
            }
            i3 = i5;
            i2 = -1;
            i = -1;
        } else {
            i4 = -1;
            i3 = -1;
            i2 = bVar2.mo4166e();
            if (bVar2.f3215f) {
                i5 = this.f3183s;
            }
            i = i5;
        }
        bVar.mo1865b((Object) C0446b.C0449c.m2139a(i4, i3, i2, i, bVar2.f3215f, false));
    }

    /* renamed from: a */
    public void mo3380a(RecyclerView recyclerView, int i, int i2) {
        m4438c(i, i2, 1);
    }

    /* renamed from: a */
    public void mo3381a(RecyclerView recyclerView, int i, int i2, int i3) {
        m4438c(i, i2, 8);
    }

    /* renamed from: a */
    public void mo3382a(RecyclerView recyclerView, int i, int i2, Object obj) {
        m4438c(i, i2, 4);
    }

    /* renamed from: a */
    public void mo3506a(AccessibilityEvent accessibilityEvent) {
        super.mo3506a(accessibilityEvent);
        if (mo3903e() > 0) {
            View b = mo4133b(false);
            View a = mo4129a(false);
            if (b != null && a != null) {
                int l = mo3923l(b);
                int l2 = mo3923l(a);
                if (l < l2) {
                    accessibilityEvent.setFromIndex(l);
                    accessibilityEvent.setToIndex(l2);
                    return;
                }
                accessibilityEvent.setFromIndex(l2);
                accessibilityEvent.setToIndex(l);
            }
        }
    }

    /* renamed from: a */
    public void mo3507a(String str) {
        if (this.f3175I == null) {
            super.mo3507a(str);
        }
    }

    /* renamed from: a */
    public boolean mo3509a() {
        return this.f3187w == 0;
    }

    /* renamed from: a */
    public boolean mo3383a(RecyclerView.C0762j jVar) {
        return jVar instanceof C0787b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4131a(RecyclerView.C0775t tVar, C0786a aVar) {
        int i;
        int i2;
        int i3;
        boolean z = false;
        if (!tVar.mo4016d() && (i = this.f3169C) != -1) {
            if (i < 0 || i >= tVar.mo4011a()) {
                this.f3169C = -1;
                this.f3170D = Integer.MIN_VALUE;
            } else {
                SavedState savedState = this.f3175I;
                if (savedState == null || savedState.f3197a == -1 || savedState.f3199c < 1) {
                    View b = mo3511b(this.f3169C);
                    if (b != null) {
                        aVar.f3207a = this.f3167A ? mo4124J() : mo4123I();
                        if (this.f3170D != Integer.MIN_VALUE) {
                            if (aVar.f3209c) {
                                i3 = this.f3185u.mo3076b() - this.f3170D;
                                i2 = this.f3185u.mo3074a(b);
                            } else {
                                i3 = this.f3185u.mo3084f() + this.f3170D;
                                i2 = this.f3185u.mo3081d(b);
                            }
                            aVar.f3208b = i3 - i2;
                            return true;
                        } else if (this.f3185u.mo3077b(b) > this.f3185u.mo3086g()) {
                            aVar.f3208b = aVar.f3209c ? this.f3185u.mo3076b() : this.f3185u.mo3084f();
                            return true;
                        } else {
                            int d = this.f3185u.mo3081d(b) - this.f3185u.mo3084f();
                            if (d < 0) {
                                aVar.f3208b = -d;
                                return true;
                            }
                            int b2 = this.f3185u.mo3076b() - this.f3185u.mo3074a(b);
                            if (b2 < 0) {
                                aVar.f3208b = b2;
                                return true;
                            }
                            aVar.f3208b = Integer.MIN_VALUE;
                        }
                    } else {
                        aVar.f3207a = this.f3169C;
                        int i4 = this.f3170D;
                        if (i4 == Integer.MIN_VALUE) {
                            if (m4446l(aVar.f3207a) == 1) {
                                z = true;
                            }
                            aVar.f3209c = z;
                            aVar.mo4161a();
                        } else {
                            aVar.mo4162a(i4);
                        }
                        aVar.f3210d = true;
                    }
                } else {
                    aVar.f3208b = Integer.MIN_VALUE;
                    aVar.f3207a = this.f3169C;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public int[] mo4132a(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f3183s];
        } else if (iArr.length < this.f3183s) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f3183s + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.f3183s; i++) {
            iArr[i] = this.f3184t[i].mo4184e();
        }
        return iArr;
    }

    /* renamed from: b */
    public int mo3384b(int i, RecyclerView.C0769p pVar, RecyclerView.C0775t tVar) {
        return mo4136c(i, pVar, tVar);
    }

    /* renamed from: b */
    public int mo3385b(RecyclerView.C0769p pVar, RecyclerView.C0775t tVar) {
        return this.f3187w == 0 ? this.f3183s : super.mo3385b(pVar, tVar);
    }

    /* renamed from: b */
    public int mo3510b(RecyclerView.C0775t tVar) {
        return m4444i(tVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public View mo4133b(boolean z) {
        int f = this.f3185u.mo3084f();
        int b = this.f3185u.mo3076b();
        int e = mo3903e();
        View view = null;
        for (int i = 0; i < e; i++) {
            View c = mo3890c(i);
            int d = this.f3185u.mo3081d(c);
            if (this.f3185u.mo3074a(c) > f && d < b) {
                if (d >= f || !z) {
                    return c;
                }
                if (view == null) {
                    view = c;
                }
            }
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4134b(RecyclerView.C0775t tVar, C0786a aVar) {
        if (!mo4131a(tVar, aVar) && !m4440c(tVar, aVar)) {
            aVar.mo4161a();
            aVar.f3207a = 0;
        }
    }

    /* renamed from: b */
    public void mo3386b(RecyclerView recyclerView, int i, int i2) {
        m4438c(i, i2, 2);
    }

    /* renamed from: b */
    public void mo3512b(RecyclerView recyclerView, RecyclerView.C0769p pVar) {
        super.mo3512b(recyclerView, pVar);
        mo3881a(this.f3182P);
        for (int i = 0; i < this.f3183s; i++) {
            this.f3184t[i].mo4179c();
        }
        recyclerView.requestLayout();
    }

    /* renamed from: b */
    public boolean mo3513b() {
        return this.f3187w == 1;
    }

    /* renamed from: b */
    public int[] mo4135b(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f3183s];
        } else if (iArr.length < this.f3183s) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f3183s + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.f3183s; i++) {
            iArr[i] = this.f3184t[i].mo4186g();
        }
        return iArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo4136c(int i, RecyclerView.C0769p pVar, RecyclerView.C0775t tVar) {
        if (mo3903e() == 0 || i == 0) {
            return 0;
        }
        mo4130a(i, tVar);
        int a = m4424a(pVar, this.f3189y, tVar);
        if (this.f3189y.f3589b >= a) {
            i = i < 0 ? -a : a;
        }
        this.f3185u.mo3075a(-i);
        this.f3173G = this.f3167A;
        C0876pa paVar = this.f3189y;
        paVar.f3589b = 0;
        m4428a(pVar, paVar);
        return i;
    }

    /* renamed from: c */
    public int mo3515c(RecyclerView.C0775t tVar) {
        return m4445j(tVar);
    }

    /* renamed from: c */
    public RecyclerView.C0762j mo3388c() {
        return this.f3187w == 0 ? new C0787b(-2, -1) : new C0787b(-1, -2);
    }

    /* renamed from: c */
    public void mo4137c(boolean z) {
        mo3507a((String) null);
        SavedState savedState = this.f3175I;
        if (!(savedState == null || savedState.f3204h == z)) {
            savedState.f3204h = z;
        }
        this.f3190z = z;
        mo3938z();
    }

    /* renamed from: d */
    public int mo3516d(RecyclerView.C0775t tVar) {
        return m4443h(tVar);
    }

    /* renamed from: d */
    public void mo3900d(int i) {
        super.mo3900d(i);
        for (int i2 = 0; i2 < this.f3183s; i2++) {
            this.f3184t[i2].mo4180c(i);
        }
    }

    /* renamed from: d */
    public void mo3389d(RecyclerView recyclerView) {
        this.f3171E.mo4142a();
        mo3938z();
    }

    /* renamed from: e */
    public int mo3517e(RecyclerView.C0775t tVar) {
        return m4444i(tVar);
    }

    /* renamed from: e */
    public void mo3905e(int i) {
        super.mo3905e(i);
        for (int i2 = 0; i2 < this.f3183s; i2++) {
            this.f3184t[i2].mo4180c(i);
        }
    }

    /* renamed from: e */
    public void mo3390e(RecyclerView.C0769p pVar, RecyclerView.C0775t tVar) {
        m4439c(pVar, tVar, true);
    }

    /* renamed from: f */
    public int mo3519f(RecyclerView.C0775t tVar) {
        return m4445j(tVar);
    }

    /* renamed from: f */
    public void mo3908f(int i) {
        if (i == 0) {
            mo4121G();
        }
    }

    /* renamed from: g */
    public void mo3392g(RecyclerView.C0775t tVar) {
        super.mo3392g(tVar);
        this.f3169C = -1;
        this.f3170D = Integer.MIN_VALUE;
        this.f3175I = null;
        this.f3178L.mo4164b();
    }

    /* renamed from: h */
    public void mo3521h(int i) {
        SavedState savedState = this.f3175I;
        if (!(savedState == null || savedState.f3197a == i)) {
            savedState.mo4157a();
        }
        this.f3169C = i;
        this.f3170D = Integer.MIN_VALUE;
        mo3938z();
    }

    /* renamed from: i */
    public void mo4138i(int i) {
        if (i == 0 || i == 1) {
            mo3507a((String) null);
            if (i != this.f3187w) {
                this.f3187w = i;
                C0687Aa aa = this.f3185u;
                this.f3185u = this.f3186v;
                this.f3186v = aa;
                mo3938z();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    /* renamed from: j */
    public void mo4139j(int i) {
        mo3507a((String) null);
        if (i != this.f3183s) {
            mo4127M();
            this.f3183s = i;
            this.f3168B = new BitSet(this.f3183s);
            this.f3184t = new C0788c[this.f3183s];
            for (int i2 = 0; i2 < this.f3183s; i2++) {
                this.f3184t[i2] = new C0788c(i2);
            }
            mo3938z();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo4140k(int i) {
        this.f3188x = i / this.f3183s;
        this.f3176J = View.MeasureSpec.makeMeasureSpec(i, this.f3186v.mo3080d());
    }

    /* renamed from: v */
    public boolean mo3524v() {
        return this.f3172F != 0;
    }

    /* renamed from: y */
    public Parcelable mo3525y() {
        int i;
        int i2;
        int[] iArr;
        SavedState savedState = this.f3175I;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        savedState2.f3204h = this.f3190z;
        savedState2.f3205i = this.f3173G;
        savedState2.f3206j = this.f3174H;
        LazySpanLookup lazySpanLookup = this.f3171E;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f3191a) == null) {
            savedState2.f3201e = 0;
        } else {
            savedState2.f3202f = iArr;
            savedState2.f3201e = savedState2.f3202f.length;
            savedState2.f3203g = lazySpanLookup.f3192b;
        }
        if (mo3903e() > 0) {
            savedState2.f3197a = this.f3173G ? mo4124J() : mo4123I();
            savedState2.f3198b = mo4122H();
            int i3 = this.f3183s;
            savedState2.f3199c = i3;
            savedState2.f3200d = new int[i3];
            for (int i4 = 0; i4 < this.f3183s; i4++) {
                if (this.f3173G) {
                    i = this.f3184t[i4].mo4168a(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.f3185u.mo3076b();
                    } else {
                        savedState2.f3200d[i4] = i;
                    }
                } else {
                    i = this.f3184t[i4].mo4175b(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.f3185u.mo3084f();
                    } else {
                        savedState2.f3200d[i4] = i;
                    }
                }
                i -= i2;
                savedState2.f3200d[i4] = i;
            }
        } else {
            savedState2.f3197a = -1;
            savedState2.f3198b = -1;
            savedState2.f3199c = 0;
        }
        return savedState2;
    }
}
