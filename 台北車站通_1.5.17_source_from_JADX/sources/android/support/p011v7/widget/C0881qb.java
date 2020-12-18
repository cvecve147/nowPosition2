package android.support.p011v7.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import p013b.p018b.p040i.p041a.C1106d;
import p013b.p018b.p040i.p041a.C1108f;
import p013b.p018b.p040i.p041a.C1109g;
import p013b.p018b.p040i.p041a.C1111i;

/* renamed from: android.support.v7.widget.qb */
class C0881qb {

    /* renamed from: a */
    private final Context f3626a;

    /* renamed from: b */
    private final View f3627b;

    /* renamed from: c */
    private final TextView f3628c;

    /* renamed from: d */
    private final WindowManager.LayoutParams f3629d = new WindowManager.LayoutParams();

    /* renamed from: e */
    private final Rect f3630e = new Rect();

    /* renamed from: f */
    private final int[] f3631f = new int[2];

    /* renamed from: g */
    private final int[] f3632g = new int[2];

    C0881qb(Context context) {
        this.f3626a = context;
        this.f3627b = LayoutInflater.from(this.f3626a).inflate(C1109g.abc_tooltip, (ViewGroup) null);
        this.f3628c = (TextView) this.f3627b.findViewById(C1108f.message);
        this.f3629d.setTitle(C0881qb.class.getSimpleName());
        this.f3629d.packageName = this.f3626a.getPackageName();
        WindowManager.LayoutParams layoutParams = this.f3629d;
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C1111i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    /* renamed from: a */
    private static View m5053a(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* renamed from: a */
    private void m5054a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int i3;
        int i4;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f3626a.getResources().getDimensionPixelOffset(C1106d.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f3626a.getResources().getDimensionPixelOffset(C1106d.tooltip_precise_anchor_extra_offset);
            i4 = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            i4 = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f3626a.getResources().getDimensionPixelOffset(z ? C1106d.tooltip_y_offset_touch : C1106d.tooltip_y_offset_non_touch);
        View a = m5053a(view);
        if (a == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        a.getWindowVisibleDisplayFrame(this.f3630e);
        Rect rect = this.f3630e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f3626a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f3630e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        a.getLocationOnScreen(this.f3632g);
        view.getLocationOnScreen(this.f3631f);
        int[] iArr = this.f3631f;
        int i5 = iArr[0];
        int[] iArr2 = this.f3632g;
        iArr[0] = i5 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i) - (a.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f3627b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f3627b.getMeasuredHeight();
        int[] iArr3 = this.f3631f;
        int i6 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
        int i7 = iArr3[1] + i4 + dimensionPixelOffset3;
        if (!z ? measuredHeight + i7 > this.f3630e.height() : i6 >= 0) {
            layoutParams.y = i6;
        } else {
            layoutParams.y = i7;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4683a() {
        if (mo4685b()) {
            ((WindowManager) this.f3626a.getSystemService("window")).removeView(this.f3627b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4684a(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (mo4685b()) {
            mo4683a();
        }
        this.f3628c.setText(charSequence);
        m5054a(view, i, i2, z, this.f3629d);
        ((WindowManager) this.f3626a.getSystemService("window")).addView(this.f3627b, this.f3629d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo4685b() {
        return this.f3627b.getParent() != null;
    }
}
