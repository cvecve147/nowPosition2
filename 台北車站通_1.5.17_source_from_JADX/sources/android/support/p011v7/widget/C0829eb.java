package android.support.p011v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import p013b.p018b.p028h.p029a.p030a.C1014d;

/* renamed from: android.support.v7.widget.eb */
public class C0829eb {

    /* renamed from: a */
    private final Context f3427a;

    /* renamed from: b */
    private final TypedArray f3428b;

    /* renamed from: c */
    private TypedValue f3429c;

    private C0829eb(Context context, TypedArray typedArray) {
        this.f3427a = context;
        this.f3428b = typedArray;
    }

    /* renamed from: a */
    public static C0829eb m4791a(Context context, int i, int[] iArr) {
        return new C0829eb(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: a */
    public static C0829eb m4792a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0829eb(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: a */
    public static C0829eb m4793a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0829eb(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public float mo4470a(int i, float f) {
        return this.f3428b.getFloat(i, f);
    }

    /* renamed from: a */
    public int mo4471a(int i, int i2) {
        return this.f3428b.getColor(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r0 = p013b.p018b.p040i.p043c.p044a.C1118b.m5718a(r2.f3427a, (r0 = r2.f3428b.getResourceId(r3, 0)));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.res.ColorStateList mo4472a(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f3428b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x001a
            android.content.res.TypedArray r0 = r2.f3428b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x001a
            android.content.Context r1 = r2.f3427a
            android.content.res.ColorStateList r0 = p013b.p018b.p040i.p043c.p044a.C1118b.m5718a(r1, r0)
            if (r0 == 0) goto L_0x001a
            return r0
        L_0x001a:
            android.content.res.TypedArray r0 = r2.f3428b
            android.content.res.ColorStateList r3 = r0.getColorStateList(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.C0829eb.mo4472a(int):android.content.res.ColorStateList");
    }

    /* renamed from: a */
    public Typeface mo4473a(int i, int i2, C1014d.C1015a aVar) {
        int resourceId = this.f3428b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f3429c == null) {
            this.f3429c = new TypedValue();
        }
        return C1014d.m5410a(this.f3427a, resourceId, this.f3429c, i2, aVar);
    }

    /* renamed from: a */
    public void mo4474a() {
        this.f3428b.recycle();
    }

    /* renamed from: a */
    public boolean mo4475a(int i, boolean z) {
        return this.f3428b.getBoolean(i, z);
    }

    /* renamed from: b */
    public int mo4476b(int i, int i2) {
        return this.f3428b.getDimensionPixelOffset(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r2.f3428b.getResourceId(r3, 0);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable mo4477b(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f3428b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x0018
            android.content.res.TypedArray r0 = r2.f3428b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x0018
            android.content.Context r3 = r2.f3427a
            android.graphics.drawable.Drawable r3 = p013b.p018b.p040i.p043c.p044a.C1118b.m5721b(r3, r0)
            return r3
        L_0x0018:
            android.content.res.TypedArray r0 = r2.f3428b
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.C0829eb.mo4477b(int):android.graphics.drawable.Drawable");
    }

    /* renamed from: c */
    public int mo4478c(int i, int i2) {
        return this.f3428b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: c */
    public Drawable mo4479c(int i) {
        int resourceId;
        if (!this.f3428b.hasValue(i) || (resourceId = this.f3428b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C0871p.m4995a().mo4625a(this.f3427a, resourceId, true);
    }

    /* renamed from: d */
    public int mo4480d(int i, int i2) {
        return this.f3428b.getInt(i, i2);
    }

    /* renamed from: d */
    public String mo4481d(int i) {
        return this.f3428b.getString(i);
    }

    /* renamed from: e */
    public int mo4482e(int i, int i2) {
        return this.f3428b.getInteger(i, i2);
    }

    /* renamed from: e */
    public CharSequence mo4483e(int i) {
        return this.f3428b.getText(i);
    }

    /* renamed from: f */
    public int mo4484f(int i, int i2) {
        return this.f3428b.getLayoutDimension(i, i2);
    }

    /* renamed from: f */
    public CharSequence[] mo4485f(int i) {
        return this.f3428b.getTextArray(i);
    }

    /* renamed from: g */
    public int mo4486g(int i, int i2) {
        return this.f3428b.getResourceId(i, i2);
    }

    /* renamed from: g */
    public boolean mo4487g(int i) {
        return this.f3428b.hasValue(i);
    }
}
