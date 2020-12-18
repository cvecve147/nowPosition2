package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p013b.p018b.p021c.C0954p;

public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: a */
    private final int f3720a = getResources().getDimensionPixelOffset(C0954p.browser_actions_context_menu_min_padding);

    /* renamed from: b */
    private final int f3721b = getResources().getDimensionPixelOffset(C0954p.browser_actions_context_menu_max_width);

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f3720a * 2), this.f3721b), 1073741824), i2);
    }
}
