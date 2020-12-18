package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.p007v4.view.C0459c;
import android.support.p007v4.view.C0487v;
import android.support.p007v4.widget.C0508D;
import android.support.p011v7.view.menu.C0668p;
import android.support.p011v7.view.menu.C0681w;
import android.support.p011v7.widget.C0862mb;
import android.support.p011v7.widget.C0879qa;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import p013b.p018b.p022d.C0956b;
import p013b.p018b.p022d.C0957c;
import p013b.p018b.p022d.C0958d;
import p013b.p018b.p022d.C0960f;
import p013b.p018b.p028h.p029a.p030a.C1014d;
import p013b.p018b.p028h.p031b.p032a.C1026a;
import p013b.p018b.p040i.p041a.C1103a;

public class NavigationMenuItemView extends C0074a implements C0681w.C0682a {

    /* renamed from: v */
    private static final int[] f461v = {16842912};

    /* renamed from: A */
    private FrameLayout f462A;

    /* renamed from: B */
    private C0668p f463B;

    /* renamed from: C */
    private ColorStateList f464C;

    /* renamed from: D */
    private boolean f465D;

    /* renamed from: E */
    private Drawable f466E;

    /* renamed from: F */
    private final C0459c f467F;

    /* renamed from: w */
    private final int f468w;

    /* renamed from: x */
    private boolean f469x;

    /* renamed from: y */
    boolean f470y;

    /* renamed from: z */
    private final CheckedTextView f471z;

    public NavigationMenuItemView(Context context) {
        this(context, (AttributeSet) null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f467F = new C0076c(this);
        setOrientation(0);
        LayoutInflater.from(context).inflate(C0960f.design_navigation_menu_item, this, true);
        this.f468w = context.getResources().getDimensionPixelSize(C0956b.design_navigation_icon_size);
        this.f471z = (CheckedTextView) findViewById(C0958d.design_menu_item_text);
        this.f471z.setDuplicateParentStateEnabled(true);
        C0487v.m2274a((View) this.f471z, this.f467F);
    }

    /* renamed from: c */
    private void m342c() {
        int i;
        C0879qa.C0880a aVar;
        if (m344e()) {
            this.f471z.setVisibility(8);
            FrameLayout frameLayout = this.f462A;
            if (frameLayout != null) {
                aVar = (C0879qa.C0880a) frameLayout.getLayoutParams();
                i = -1;
            } else {
                return;
            }
        } else {
            this.f471z.setVisibility(0);
            FrameLayout frameLayout2 = this.f462A;
            if (frameLayout2 != null) {
                aVar = (C0879qa.C0880a) frameLayout2.getLayoutParams();
                i = -2;
            } else {
                return;
            }
        }
        aVar.width = i;
        this.f462A.setLayoutParams(aVar);
    }

    /* renamed from: d */
    private StateListDrawable m343d() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(C1103a.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f461v, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    /* renamed from: e */
    private boolean m344e() {
        return this.f463B.getTitle() == null && this.f463B.getIcon() == null && this.f463B.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f462A == null) {
                this.f462A = (FrameLayout) ((ViewStub) findViewById(C0958d.design_menu_item_action_area_stub)).inflate();
            }
            this.f462A.removeAllViews();
            this.f462A.addView(view);
        }
    }

    /* renamed from: a */
    public void mo276a(C0668p pVar, int i) {
        this.f463B = pVar;
        setVisibility(pVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            C0487v.m2273a((View) this, (Drawable) m343d());
        }
        setCheckable(pVar.isCheckable());
        setChecked(pVar.isChecked());
        setEnabled(pVar.isEnabled());
        setTitle(pVar.getTitle());
        setIcon(pVar.getIcon());
        setActionView(pVar.getActionView());
        setContentDescription(pVar.getContentDescription());
        C0862mb.m4963a(this, pVar.getTooltipText());
        m342c();
    }

    /* renamed from: a */
    public boolean mo277a() {
        return false;
    }

    /* renamed from: b */
    public void mo278b() {
        FrameLayout frameLayout = this.f462A;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.f471z.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public C0668p getItemData() {
        return this.f463B;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0668p pVar = this.f463B;
        if (pVar != null && pVar.isCheckable() && this.f463B.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, f461v);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f470y != z) {
            this.f470y = z;
            this.f467F.mo1919a((View) this.f471z, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f471z.setChecked(z);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f465D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C1026a.m5462i(drawable).mutate();
                C1026a.m5447a(drawable, this.f464C);
            }
            int i = this.f468w;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f469x) {
            if (this.f466E == null) {
                this.f466E = C1014d.m5413a(getResources(), C0957c.navigation_empty_icon, getContext().getTheme());
                Drawable drawable2 = this.f466E;
                if (drawable2 != null) {
                    int i2 = this.f468w;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f466E;
        }
        C0508D.m2422a(this.f471z, drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    /* access modifiers changed from: package-private */
    public void setIconTintList(ColorStateList colorStateList) {
        this.f464C = colorStateList;
        this.f465D = this.f464C != null;
        C0668p pVar = this.f463B;
        if (pVar != null) {
            setIcon(pVar.getIcon());
        }
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f469x = z;
    }

    public void setTextAppearance(int i) {
        C0508D.m2421a(this.f471z, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f471z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f471z.setText(charSequence);
    }
}
