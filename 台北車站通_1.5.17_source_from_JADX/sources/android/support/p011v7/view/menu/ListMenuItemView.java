package android.support.p011v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p007v4.view.C0487v;
import android.support.p011v7.view.menu.C0681w;
import android.support.p011v7.widget.C0829eb;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import p013b.p018b.p040i.p041a.C1103a;
import p013b.p018b.p040i.p041a.C1108f;
import p013b.p018b.p040i.p041a.C1109g;
import p013b.p018b.p040i.p041a.C1112j;

/* renamed from: android.support.v7.view.menu.ListMenuItemView */
public class ListMenuItemView extends LinearLayout implements C0681w.C0682a {

    /* renamed from: a */
    private C0668p f2427a;

    /* renamed from: b */
    private ImageView f2428b;

    /* renamed from: c */
    private RadioButton f2429c;

    /* renamed from: d */
    private TextView f2430d;

    /* renamed from: e */
    private CheckBox f2431e;

    /* renamed from: f */
    private TextView f2432f;

    /* renamed from: g */
    private ImageView f2433g;

    /* renamed from: h */
    private Drawable f2434h;

    /* renamed from: i */
    private int f2435i;

    /* renamed from: j */
    private Context f2436j;

    /* renamed from: k */
    private boolean f2437k;

    /* renamed from: l */
    private Drawable f2438l;

    /* renamed from: m */
    private int f2439m;

    /* renamed from: n */
    private LayoutInflater f2440n;

    /* renamed from: o */
    private boolean f2441o;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1103a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C0829eb a = C0829eb.m4793a(getContext(), attributeSet, C1112j.MenuView, i, 0);
        this.f2434h = a.mo4477b(C1112j.MenuView_android_itemBackground);
        this.f2435i = a.mo4486g(C1112j.MenuView_android_itemTextAppearance, -1);
        this.f2437k = a.mo4475a(C1112j.MenuView_preserveIconSpacing, false);
        this.f2436j = context;
        this.f2438l = a.mo4477b(C1112j.MenuView_subMenuArrow);
        a.mo4474a();
    }

    /* renamed from: b */
    private void m3189b() {
        this.f2431e = (CheckBox) getInflater().inflate(C1109g.abc_list_menu_item_checkbox, this, false);
        addView(this.f2431e);
    }

    /* renamed from: c */
    private void m3190c() {
        this.f2428b = (ImageView) getInflater().inflate(C1109g.abc_list_menu_item_icon, this, false);
        addView(this.f2428b, 0);
    }

    /* renamed from: d */
    private void m3191d() {
        this.f2429c = (RadioButton) getInflater().inflate(C1109g.abc_list_menu_item_radio, this, false);
        addView(this.f2429c);
    }

    private LayoutInflater getInflater() {
        if (this.f2440n == null) {
            this.f2440n = LayoutInflater.from(getContext());
        }
        return this.f2440n;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f2433g;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: a */
    public void mo276a(C0668p pVar, int i) {
        this.f2427a = pVar;
        this.f2439m = i;
        setVisibility(pVar.isVisible() ? 0 : 8);
        setTitle(pVar.mo2915a((C0681w.C0682a) this));
        setCheckable(pVar.isCheckable());
        mo2740a(pVar.mo2951m(), pVar.mo2923d());
        setIcon(pVar.getIcon());
        setEnabled(pVar.isEnabled());
        setSubMenuArrowVisible(pVar.hasSubMenu());
        setContentDescription(pVar.getContentDescription());
    }

    /* renamed from: a */
    public void mo2740a(boolean z, char c) {
        int i = (!z || !this.f2427a.mo2951m()) ? 8 : 0;
        if (i == 0) {
            this.f2432f.setText(this.f2427a.mo2925e());
        }
        if (this.f2432f.getVisibility() != i) {
            this.f2432f.setVisibility(i);
        }
    }

    /* renamed from: a */
    public boolean mo277a() {
        return false;
    }

    public C0668p getItemData() {
        return this.f2427a;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        C0487v.m2273a((View) this, this.f2434h);
        this.f2430d = (TextView) findViewById(C1108f.title);
        int i = this.f2435i;
        if (i != -1) {
            this.f2430d.setTextAppearance(this.f2436j, i);
        }
        this.f2432f = (TextView) findViewById(C1108f.shortcut);
        this.f2433g = (ImageView) findViewById(C1108f.submenuarrow);
        ImageView imageView = this.f2433g;
        if (imageView != null) {
            imageView.setImageDrawable(this.f2438l);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f2428b != null && this.f2437k) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f2428b.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f2429c != null || this.f2431e != null) {
            if (this.f2427a.mo2943i()) {
                if (this.f2429c == null) {
                    m3191d();
                }
                compoundButton2 = this.f2429c;
                compoundButton = this.f2431e;
            } else {
                if (this.f2431e == null) {
                    m3189b();
                }
                compoundButton2 = this.f2431e;
                compoundButton = this.f2429c;
            }
            if (z) {
                compoundButton2.setChecked(this.f2427a.isChecked());
                int i = z ? 0 : 8;
                if (compoundButton2.getVisibility() != i) {
                    compoundButton2.setVisibility(i);
                }
                if (compoundButton != null && compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f2431e;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f2429c;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f2427a.mo2943i()) {
            if (this.f2429c == null) {
                m3191d();
            }
            compoundButton = this.f2429c;
        } else {
            if (this.f2431e == null) {
                m3189b();
            }
            compoundButton = this.f2431e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f2441o = z;
        this.f2437k = z;
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f2427a.mo2950l() || this.f2441o;
        if (!z && !this.f2437k) {
            return;
        }
        if (this.f2428b != null || drawable != null || this.f2437k) {
            if (this.f2428b == null) {
                m3190c();
            }
            if (drawable != null || this.f2437k) {
                ImageView imageView = this.f2428b;
                if (!z) {
                    drawable = null;
                }
                imageView.setImageDrawable(drawable);
                if (this.f2428b.getVisibility() != 0) {
                    this.f2428b.setVisibility(0);
                    return;
                }
                return;
            }
            this.f2428b.setVisibility(8);
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i;
        if (charSequence != null) {
            this.f2430d.setText(charSequence);
            if (this.f2430d.getVisibility() != 0) {
                textView = this.f2430d;
                i = 0;
            } else {
                return;
            }
        } else {
            i = 8;
            if (this.f2430d.getVisibility() != 8) {
                textView = this.f2430d;
            } else {
                return;
            }
        }
        textView.setVisibility(i);
    }
}
