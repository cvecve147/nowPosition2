package android.support.design.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p007v4.view.AbsSavedState;
import android.support.p007v4.view.C0459c;
import android.support.p007v4.view.C0487v;
import android.support.p007v4.view.p009a.C0446b;
import android.support.p007v4.widget.C0508D;
import android.support.p007v4.widget.C0527J;
import android.support.p007v4.widget.C0571u;
import android.support.p011v7.widget.C0721I;
import android.support.p011v7.widget.C0829eb;
import android.support.p011v7.widget.C0831fa;
import android.support.p011v7.widget.C0871p;
import android.support.p011v7.widget.C0905vb;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import p013b.p018b.p022d.C0958d;
import p013b.p018b.p022d.C0960f;
import p013b.p018b.p022d.C0961g;
import p013b.p018b.p022d.C0962h;
import p013b.p018b.p022d.C0963i;
import p013b.p018b.p028h.p029a.C1006a;
import p013b.p018b.p028h.p031b.p032a.C1026a;
import p013b.p018b.p040i.p041a.C1105c;
import p013b.p018b.p040i.p041a.C1111i;
import p013b.p018b.p040i.p043c.p044a.C1118b;

public class TextInputLayout extends LinearLayout implements C0905vb {

    /* renamed from: A */
    private Drawable f765A;

    /* renamed from: B */
    private Drawable f766B;

    /* renamed from: C */
    private ColorStateList f767C;

    /* renamed from: D */
    private boolean f768D;

    /* renamed from: E */
    private PorterDuff.Mode f769E;

    /* renamed from: F */
    private boolean f770F;

    /* renamed from: G */
    private ColorStateList f771G;

    /* renamed from: H */
    private ColorStateList f772H;

    /* renamed from: I */
    private boolean f773I;

    /* renamed from: J */
    final C0157m f774J;

    /* renamed from: K */
    private boolean f775K;

    /* renamed from: L */
    private ValueAnimator f776L;

    /* renamed from: M */
    private boolean f777M;

    /* renamed from: N */
    private boolean f778N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public boolean f779O;

    /* renamed from: a */
    private final FrameLayout f780a;

    /* renamed from: b */
    EditText f781b;

    /* renamed from: c */
    private CharSequence f782c;

    /* renamed from: d */
    private boolean f783d;

    /* renamed from: e */
    private CharSequence f784e;

    /* renamed from: f */
    private Paint f785f;

    /* renamed from: g */
    private final Rect f786g;

    /* renamed from: h */
    private LinearLayout f787h;

    /* renamed from: i */
    private int f788i;

    /* renamed from: j */
    private Typeface f789j;

    /* renamed from: k */
    private boolean f790k;

    /* renamed from: l */
    TextView f791l;

    /* renamed from: m */
    private int f792m;

    /* renamed from: n */
    private boolean f793n;

    /* renamed from: o */
    private CharSequence f794o;

    /* renamed from: p */
    boolean f795p;

    /* renamed from: q */
    private TextView f796q;

    /* renamed from: r */
    private int f797r;

    /* renamed from: s */
    private int f798s;

    /* renamed from: t */
    private int f799t;

    /* renamed from: u */
    private boolean f800u;

    /* renamed from: v */
    private boolean f801v;

    /* renamed from: w */
    private Drawable f802w;

    /* renamed from: x */
    private CharSequence f803x;

    /* renamed from: y */
    private CheckableImageButton f804y;

    /* renamed from: z */
    private boolean f805z;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0127Q();

        /* renamed from: a */
        CharSequence f806a;

        /* renamed from: b */
        boolean f807b;

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f806a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f807b = parcel.readInt() != 1 ? false : true;
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.f806a + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f806a, parcel, i);
            parcel.writeInt(this.f807b ? 1 : 0);
        }
    }

    /* renamed from: android.support.design.widget.TextInputLayout$a */
    private class C0140a extends C0459c {
        C0140a() {
        }

        /* renamed from: a */
        public void mo309a(View view, C0446b bVar) {
            super.mo309a(view, bVar);
            bVar.mo1857a((CharSequence) TextInputLayout.class.getSimpleName());
            CharSequence h = TextInputLayout.this.f774J.mo884h();
            if (!TextUtils.isEmpty(h)) {
                bVar.mo1878e(h);
            }
            EditText editText = TextInputLayout.this.f781b;
            if (editText != null) {
                bVar.mo1863b((View) editText);
            }
            TextView textView = TextInputLayout.this.f791l;
            CharSequence text = textView != null ? textView.getText() : null;
            if (!TextUtils.isEmpty(text)) {
                bVar.mo1879e(true);
                bVar.mo1870c(text);
            }
        }

        /* renamed from: b */
        public void mo832b(View view, AccessibilityEvent accessibilityEvent) {
            super.mo832b(view, accessibilityEvent);
            accessibilityEvent.setClassName(TextInputLayout.class.getSimpleName());
        }

        /* renamed from: c */
        public void mo833c(View view, AccessibilityEvent accessibilityEvent) {
            super.mo833c(view, accessibilityEvent);
            CharSequence h = TextInputLayout.this.f774J.mo884h();
            if (!TextUtils.isEmpty(h)) {
                accessibilityEvent.getText().add(h);
            }
        }
    }

    public TextInputLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f786g = new Rect();
        this.f774J = new C0157m(this);
        C0128S.m655a(context);
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        this.f780a = new FrameLayout(context);
        this.f780a.setAddStatesFromChildren(true);
        addView(this.f780a);
        this.f774J.mo875b(C0145a.f817b);
        this.f774J.mo866a((Interpolator) new AccelerateInterpolator());
        this.f774J.mo871b(8388659);
        C0829eb a = C0829eb.m4793a(context, attributeSet, C0963i.TextInputLayout, i, C0962h.Widget_Design_TextInputLayout);
        this.f783d = a.mo4475a(C0963i.TextInputLayout_hintEnabled, true);
        setHint(a.mo4483e(C0963i.TextInputLayout_android_hint));
        this.f775K = a.mo4475a(C0963i.TextInputLayout_hintAnimationEnabled, true);
        if (a.mo4487g(C0963i.TextInputLayout_android_textColorHint)) {
            ColorStateList a2 = a.mo4472a(C0963i.TextInputLayout_android_textColorHint);
            this.f772H = a2;
            this.f771G = a2;
        }
        if (a.mo4486g(C0963i.TextInputLayout_hintTextAppearance, -1) != -1) {
            setHintTextAppearance(a.mo4486g(C0963i.TextInputLayout_hintTextAppearance, 0));
        }
        this.f792m = a.mo4486g(C0963i.TextInputLayout_errorTextAppearance, 0);
        boolean a3 = a.mo4475a(C0963i.TextInputLayout_errorEnabled, false);
        boolean a4 = a.mo4475a(C0963i.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(a.mo4480d(C0963i.TextInputLayout_counterMaxLength, -1));
        this.f798s = a.mo4486g(C0963i.TextInputLayout_counterTextAppearance, 0);
        this.f799t = a.mo4486g(C0963i.TextInputLayout_counterOverflowTextAppearance, 0);
        this.f801v = a.mo4475a(C0963i.TextInputLayout_passwordToggleEnabled, false);
        this.f802w = a.mo4477b(C0963i.TextInputLayout_passwordToggleDrawable);
        this.f803x = a.mo4483e(C0963i.TextInputLayout_passwordToggleContentDescription);
        if (a.mo4487g(C0963i.TextInputLayout_passwordToggleTint)) {
            this.f768D = true;
            this.f767C = a.mo4472a(C0963i.TextInputLayout_passwordToggleTint);
        }
        if (a.mo4487g(C0963i.TextInputLayout_passwordToggleTintMode)) {
            this.f770F = true;
            this.f769E = C0142V.m776a(a.mo4480d(C0963i.TextInputLayout_passwordToggleTintMode, -1), (PorterDuff.Mode) null);
        }
        a.mo4474a();
        setErrorEnabled(a3);
        setCounterEnabled(a4);
        m753b();
        if (C0487v.m2292h(this) == 0) {
            C0487v.m2288d(this, 1);
        }
        C0487v.m2274a((View) this, (C0459c) new C0140a());
    }

    /* renamed from: a */
    private void m745a() {
        C0487v.m2269a(this.f787h, C0487v.m2297m(this.f781b), 0, C0487v.m2296l(this.f781b), this.f781b.getPaddingBottom());
    }

    /* renamed from: a */
    private static void m747a(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m747a((ViewGroup) childAt, z);
            }
        }
    }

    /* renamed from: a */
    private void m748a(TextView textView) {
        LinearLayout linearLayout = this.f787h;
        if (linearLayout != null) {
            linearLayout.removeView(textView);
            int i = this.f788i - 1;
            this.f788i = i;
            if (i == 0) {
                this.f787h.setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    private void m749a(TextView textView, int i) {
        if (this.f787h == null) {
            this.f787h = new LinearLayout(getContext());
            this.f787h.setOrientation(0);
            addView(this.f787h, -1, -2);
            this.f787h.addView(new C0571u(getContext()), new LinearLayout.LayoutParams(0, 0, 1.0f));
            if (this.f781b != null) {
                m745a();
            }
        }
        this.f787h.setVisibility(0);
        this.f787h.addView(textView, i);
        this.f788i++;
    }

    /* renamed from: a */
    private void m750a(CharSequence charSequence, boolean z) {
        ViewPropertyAnimator viewPropertyAnimator;
        this.f794o = charSequence;
        if (!this.f790k) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        this.f793n = !TextUtils.isEmpty(charSequence);
        this.f791l.animate().cancel();
        if (this.f793n) {
            this.f791l.setText(charSequence);
            this.f791l.setVisibility(0);
            if (z) {
                if (this.f791l.getAlpha() == 1.0f) {
                    this.f791l.setAlpha(0.0f);
                }
                viewPropertyAnimator = this.f791l.animate().alpha(1.0f).setDuration(200).setInterpolator(C0145a.f819d).setListener(new C0122M(this));
            } else {
                this.f791l.setAlpha(1.0f);
                m760f();
                mo795a(z);
            }
        } else {
            if (this.f791l.getVisibility() == 0) {
                if (z) {
                    viewPropertyAnimator = this.f791l.animate().alpha(0.0f).setDuration(200).setInterpolator(C0145a.f818c).setListener(new C0123N(this, charSequence));
                } else {
                    this.f791l.setText(charSequence);
                    this.f791l.setVisibility(4);
                }
            }
            m760f();
            mo795a(z);
        }
        viewPropertyAnimator.start();
        m760f();
        mo795a(z);
    }

    /* renamed from: a */
    private static boolean m752a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m753b() {
        Drawable drawable;
        if (this.f802w == null) {
            return;
        }
        if (this.f768D || this.f770F) {
            this.f802w = C1026a.m5462i(this.f802w).mutate();
            if (this.f768D) {
                C1026a.m5447a(this.f802w, this.f767C);
            }
            if (this.f770F) {
                C1026a.m5450a(this.f802w, this.f769E);
            }
            CheckableImageButton checkableImageButton = this.f804y;
            if (checkableImageButton != null && checkableImageButton.getDrawable() != (drawable = this.f802w)) {
                this.f804y.setImageDrawable(drawable);
            }
        }
    }

    /* renamed from: b */
    private void m754b(boolean z) {
        ValueAnimator valueAnimator = this.f776L;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f776L.cancel();
        }
        if (!z || !this.f775K) {
            this.f774J.mo870b(1.0f);
        } else {
            mo793a(1.0f);
        }
        this.f773I = false;
    }

    /* renamed from: c */
    private void m755c() {
        Drawable background;
        int i = Build.VERSION.SDK_INT;
        if ((i == 21 || i == 22) && (background = this.f781b.getBackground()) != null && !this.f777M) {
            Drawable newDrawable = background.getConstantState().newDrawable();
            if (background instanceof DrawableContainer) {
                this.f777M = C0162r.m844a((DrawableContainer) background, newDrawable.getConstantState());
            }
            if (!this.f777M) {
                C0487v.m2273a((View) this.f781b, newDrawable);
                this.f777M = true;
            }
        }
    }

    /* renamed from: c */
    private void m756c(boolean z) {
        ValueAnimator valueAnimator = this.f776L;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f776L.cancel();
        }
        if (!z || !this.f775K) {
            this.f774J.mo870b(0.0f);
        } else {
            mo793a(0.0f);
        }
        this.f773I = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m757d(boolean z) {
        boolean z2;
        if (this.f801v) {
            int selectionEnd = this.f781b.getSelectionEnd();
            if (m758d()) {
                this.f781b.setTransformationMethod((TransformationMethod) null);
                z2 = true;
            } else {
                this.f781b.setTransformationMethod(PasswordTransformationMethod.getInstance());
                z2 = false;
            }
            this.f805z = z2;
            this.f804y.setChecked(this.f805z);
            if (z) {
                this.f804y.jumpDrawablesToCurrentState();
            }
            this.f781b.setSelection(selectionEnd);
        }
    }

    /* renamed from: d */
    private boolean m758d() {
        EditText editText = this.f781b;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    /* renamed from: e */
    private boolean m759e() {
        return this.f801v && (m758d() || this.f805z);
    }

    /* renamed from: f */
    private void m760f() {
        Drawable background;
        TextView textView;
        EditText editText = this.f781b;
        if (editText != null && (background = editText.getBackground()) != null) {
            m755c();
            if (C0831fa.m4813a(background)) {
                background = background.mutate();
            }
            if ((!this.f793n || (textView = this.f791l) == null) && (!this.f800u || (textView = this.f796q) == null)) {
                C1026a.m5454b(background);
                this.f781b.refreshDrawableState();
                return;
            }
            background.setColorFilter(C0871p.m4991a(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        }
    }

    /* renamed from: g */
    private void m761g() {
        int i;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f780a.getLayoutParams();
        if (this.f783d) {
            if (this.f785f == null) {
                this.f785f = new Paint();
            }
            this.f785f.setTypeface(this.f774J.mo879d());
            this.f785f.setTextSize(this.f774J.mo876c());
            i = (int) (-this.f785f.ascent());
        } else {
            i = 0;
        }
        if (i != layoutParams.topMargin) {
            layoutParams.topMargin = i;
            this.f780a.requestLayout();
        }
    }

    /* renamed from: h */
    private void m762h() {
        if (this.f781b != null) {
            if (m759e()) {
                if (this.f804y == null) {
                    this.f804y = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C0960f.design_text_input_password_icon, this.f780a, false);
                    this.f804y.setImageDrawable(this.f802w);
                    this.f804y.setContentDescription(this.f803x);
                    this.f780a.addView(this.f804y);
                    this.f804y.setOnClickListener(new C0125O(this));
                }
                EditText editText = this.f781b;
                if (editText != null && C0487v.m2294j(editText) <= 0) {
                    this.f781b.setMinimumHeight(C0487v.m2294j(this.f804y));
                }
                this.f804y.setVisibility(0);
                this.f804y.setChecked(this.f805z);
                if (this.f765A == null) {
                    this.f765A = new ColorDrawable();
                }
                this.f765A.setBounds(0, 0, this.f804y.getMeasuredWidth(), 1);
                Drawable[] a = C0508D.m2423a(this.f781b);
                if (a[2] != this.f765A) {
                    this.f766B = a[2];
                }
                C0508D.m2422a(this.f781b, a[0], a[1], this.f765A, a[3]);
                this.f804y.setPadding(this.f781b.getPaddingLeft(), this.f781b.getPaddingTop(), this.f781b.getPaddingRight(), this.f781b.getPaddingBottom());
                return;
            }
            CheckableImageButton checkableImageButton = this.f804y;
            if (checkableImageButton != null && checkableImageButton.getVisibility() == 0) {
                this.f804y.setVisibility(8);
            }
            if (this.f765A != null) {
                Drawable[] a2 = C0508D.m2423a(this.f781b);
                if (a2[2] == this.f765A) {
                    C0508D.m2422a(this.f781b, a2[0], a2[1], this.f766B, a2[3]);
                    this.f765A = null;
                }
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f781b == null) {
            if (!(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f781b = editText;
            if (!m758d()) {
                this.f774J.mo878c(this.f781b.getTypeface());
            }
            this.f774J.mo860a(this.f781b.getTextSize());
            int gravity = this.f781b.getGravity();
            this.f774J.mo871b((gravity & -113) | 48);
            this.f774J.mo880d(gravity);
            this.f781b.addTextChangedListener(new C0121L(this));
            if (this.f771G == null) {
                this.f771G = this.f781b.getHintTextColors();
            }
            if (this.f783d && TextUtils.isEmpty(this.f784e)) {
                this.f782c = this.f781b.getHint();
                setHint(this.f782c);
                this.f781b.setHint((CharSequence) null);
            }
            if (this.f796q != null) {
                mo794a(this.f781b.getText().length());
            }
            if (this.f787h != null) {
                m745a();
            }
            m762h();
            mo796a(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        this.f784e = charSequence;
        this.f774J.mo867a(charSequence);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo793a(float f) {
        if (this.f774J.mo883g() != f) {
            if (this.f776L == null) {
                this.f776L = new ValueAnimator();
                this.f776L.setInterpolator(C0145a.f816a);
                this.f776L.setDuration(200);
                this.f776L.addUpdateListener(new C0126P(this));
            }
            this.f776L.setFloatValues(new float[]{this.f774J.mo883g(), f});
            this.f776L.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo794a(int i) {
        boolean z = this.f800u;
        int i2 = this.f797r;
        if (i2 == -1) {
            this.f796q.setText(String.valueOf(i));
            this.f800u = false;
        } else {
            this.f800u = i > i2;
            boolean z2 = this.f800u;
            if (z != z2) {
                C0508D.m2421a(this.f796q, z2 ? this.f799t : this.f798s);
            }
            this.f796q.setText(getContext().getString(C0961g.character_counter_pattern, new Object[]{Integer.valueOf(i), Integer.valueOf(this.f797r)}));
        }
        if (this.f781b != null && z != this.f800u) {
            mo795a(false);
            m760f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo795a(boolean z) {
        mo796a(z, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo796a(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f781b;
        boolean z3 = editText != null && !TextUtils.isEmpty(editText.getText());
        boolean a = m752a(getDrawableState(), 16842908);
        boolean isEmpty = true ^ TextUtils.isEmpty(getError());
        ColorStateList colorStateList2 = this.f771G;
        if (colorStateList2 != null) {
            this.f774J.mo873b(colorStateList2);
        }
        if (isEnabled && this.f800u && (textView = this.f796q) != null) {
            this.f774J.mo863a(textView.getTextColors());
        } else if ((isEnabled && a && (colorStateList = this.f772H) != null) || (colorStateList = this.f771G) != null) {
            this.f774J.mo863a(colorStateList);
        }
        if (z3 || (isEnabled() && (a || isEmpty))) {
            if (z2 || this.f773I) {
                m754b(z);
            }
        } else if (z2 || !this.f773I) {
            m756c(z);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f780a.addView(view, layoutParams2);
            this.f780a.setLayoutParams(layoutParams);
            m761g();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText;
        if (this.f782c == null || (editText = this.f781b) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        CharSequence hint = editText.getHint();
        this.f781b.setHint(this.f782c);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
        } finally {
            this.f781b.setHint(hint);
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f779O = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f779O = false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f783d) {
            this.f774J.mo864a(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (!this.f778N) {
            boolean z = true;
            this.f778N = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            if (!C0487v.m2309y(this) || !isEnabled()) {
                z = false;
            }
            mo795a(z);
            m760f();
            C0157m mVar = this.f774J;
            if (mVar != null ? mVar.mo868a(drawableState) | false : false) {
                invalidate();
            }
            this.f778N = false;
        }
    }

    public int getCounterMaxLength() {
        return this.f797r;
    }

    public EditText getEditText() {
        return this.f781b;
    }

    public CharSequence getError() {
        if (this.f790k) {
            return this.f794o;
        }
        return null;
    }

    public CharSequence getHint() {
        if (this.f783d) {
            return this.f784e;
        }
        return null;
    }

    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f803x;
    }

    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f802w;
    }

    public Typeface getTypeface() {
        return this.f789j;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        EditText editText;
        super.onLayout(z, i, i2, i3, i4);
        if (this.f783d && (editText = this.f781b) != null) {
            Rect rect = this.f786g;
            C0527J.m2562a((ViewGroup) this, (View) editText, rect);
            int compoundPaddingLeft = rect.left + this.f781b.getCompoundPaddingLeft();
            int compoundPaddingRight = rect.right - this.f781b.getCompoundPaddingRight();
            this.f774J.mo872b(compoundPaddingLeft, rect.top + this.f781b.getCompoundPaddingTop(), compoundPaddingRight, rect.bottom - this.f781b.getCompoundPaddingBottom());
            this.f774J.mo862a(compoundPaddingLeft, getPaddingTop(), compoundPaddingRight, (i4 - i2) - getPaddingBottom());
            this.f774J.mo887k();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        m762h();
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo1736a());
        setError(savedState.f806a);
        if (savedState.f807b) {
            m757d(true);
        }
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f793n) {
            savedState.f806a = getError();
        }
        savedState.f807b = this.f805z;
        return savedState;
    }

    public void setCounterEnabled(boolean z) {
        if (this.f795p != z) {
            if (z) {
                this.f796q = new C0721I(getContext());
                this.f796q.setId(C0958d.textinput_counter);
                Typeface typeface = this.f789j;
                if (typeface != null) {
                    this.f796q.setTypeface(typeface);
                }
                this.f796q.setMaxLines(1);
                try {
                    C0508D.m2421a(this.f796q, this.f798s);
                } catch (Exception unused) {
                    C0508D.m2421a(this.f796q, C1111i.TextAppearance_AppCompat_Caption);
                    this.f796q.setTextColor(C1006a.m5386a(getContext(), C1105c.error_color_material));
                }
                m749a(this.f796q, -1);
                EditText editText = this.f781b;
                mo794a(editText == null ? 0 : editText.getText().length());
            } else {
                m748a(this.f796q);
                this.f796q = null;
            }
            this.f795p = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f797r != i) {
            if (i <= 0) {
                i = -1;
            }
            this.f797r = i;
            if (this.f795p) {
                EditText editText = this.f781b;
                mo794a(editText == null ? 0 : editText.getText().length());
            }
        }
    }

    public void setEnabled(boolean z) {
        m747a((ViewGroup) this, z);
        super.setEnabled(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r1.f791l;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setError(java.lang.CharSequence r2) {
        /*
            r1 = this;
            boolean r0 = android.support.p007v4.view.C0487v.m2309y(r1)
            if (r0 == 0) goto L_0x001c
            boolean r0 = r1.isEnabled()
            if (r0 == 0) goto L_0x001c
            android.widget.TextView r0 = r1.f791l
            if (r0 == 0) goto L_0x001a
            java.lang.CharSequence r0 = r0.getText()
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 != 0) goto L_0x001c
        L_0x001a:
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            r1.m750a((java.lang.CharSequence) r2, (boolean) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.TextInputLayout.setError(java.lang.CharSequence):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setErrorEnabled(boolean r6) {
        /*
            r5 = this;
            boolean r0 = r5.f790k
            if (r0 == r6) goto L_0x0086
            android.widget.TextView r0 = r5.f791l
            if (r0 == 0) goto L_0x000f
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.cancel()
        L_0x000f:
            r0 = 0
            if (r6 == 0) goto L_0x0077
            android.support.v7.widget.I r1 = new android.support.v7.widget.I
            android.content.Context r2 = r5.getContext()
            r1.<init>(r2)
            r5.f791l = r1
            android.widget.TextView r1 = r5.f791l
            int r2 = p013b.p018b.p022d.C0958d.textinput_error
            r1.setId(r2)
            android.graphics.Typeface r1 = r5.f789j
            if (r1 == 0) goto L_0x002d
            android.widget.TextView r2 = r5.f791l
            r2.setTypeface(r1)
        L_0x002d:
            r1 = 1
            android.widget.TextView r2 = r5.f791l     // Catch:{ Exception -> 0x004d }
            int r3 = r5.f792m     // Catch:{ Exception -> 0x004d }
            android.support.p007v4.widget.C0508D.m2421a(r2, r3)     // Catch:{ Exception -> 0x004d }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x004d }
            r3 = 23
            if (r2 < r3) goto L_0x004b
            android.widget.TextView r2 = r5.f791l     // Catch:{ Exception -> 0x004d }
            android.content.res.ColorStateList r2 = r2.getTextColors()     // Catch:{ Exception -> 0x004d }
            int r2 = r2.getDefaultColor()     // Catch:{ Exception -> 0x004d }
            r3 = -65281(0xffffffffffff00ff, float:NaN)
            if (r2 != r3) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r2 = r0
            goto L_0x004e
        L_0x004d:
            r2 = r1
        L_0x004e:
            if (r2 == 0) goto L_0x0066
            android.widget.TextView r2 = r5.f791l
            int r3 = p013b.p018b.p040i.p041a.C1111i.TextAppearance_AppCompat_Caption
            android.support.p007v4.widget.C0508D.m2421a(r2, r3)
            android.widget.TextView r2 = r5.f791l
            android.content.Context r3 = r5.getContext()
            int r4 = p013b.p018b.p040i.p041a.C1105c.error_color_material
            int r3 = p013b.p018b.p028h.p029a.C1006a.m5386a((android.content.Context) r3, (int) r4)
            r2.setTextColor(r3)
        L_0x0066:
            android.widget.TextView r2 = r5.f791l
            r3 = 4
            r2.setVisibility(r3)
            android.widget.TextView r2 = r5.f791l
            android.support.p007v4.view.C0487v.m2286c(r2, r1)
            android.widget.TextView r1 = r5.f791l
            r5.m749a((android.widget.TextView) r1, (int) r0)
            goto L_0x0084
        L_0x0077:
            r5.f793n = r0
            r5.m760f()
            android.widget.TextView r0 = r5.f791l
            r5.m748a((android.widget.TextView) r0)
            r0 = 0
            r5.f791l = r0
        L_0x0084:
            r5.f790k = r6
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.TextInputLayout.setErrorEnabled(boolean):void");
    }

    public void setErrorTextAppearance(int i) {
        this.f792m = i;
        TextView textView = this.f791l;
        if (textView != null) {
            C0508D.m2421a(textView, i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f783d) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f775K = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f783d) {
            this.f783d = z;
            CharSequence hint = this.f781b.getHint();
            if (!this.f783d) {
                if (!TextUtils.isEmpty(this.f784e) && TextUtils.isEmpty(hint)) {
                    this.f781b.setHint(this.f784e);
                }
                setHintInternal((CharSequence) null);
            } else if (!TextUtils.isEmpty(hint)) {
                if (TextUtils.isEmpty(this.f784e)) {
                    setHint(hint);
                }
                this.f781b.setHint((CharSequence) null);
            }
            if (this.f781b != null) {
                m761g();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.f774J.mo861a(i);
        this.f772H = this.f774J.mo859a();
        if (this.f781b != null) {
            mo795a(false);
            m761g();
        }
    }

    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f803x = charSequence;
        CheckableImageButton checkableImageButton = this.f804y;
        if (checkableImageButton != null) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? C1118b.m5721b(getContext(), i) : null);
    }

    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f802w = drawable;
        CheckableImageButton checkableImageButton = this.f804y;
        if (checkableImageButton != null) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public void setPasswordVisibilityToggleEnabled(boolean z) {
        EditText editText;
        if (this.f801v != z) {
            this.f801v = z;
            if (!z && this.f805z && (editText = this.f781b) != null) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.f805z = false;
            m762h();
        }
    }

    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f767C = colorStateList;
        this.f768D = true;
        m753b();
    }

    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f769E = mode;
        this.f770F = true;
        m753b();
    }

    public void setTypeface(Typeface typeface) {
        Typeface typeface2 = this.f789j;
        if ((typeface2 != null && !typeface2.equals(typeface)) || (this.f789j == null && typeface != null)) {
            this.f789j = typeface;
            this.f774J.mo878c(typeface);
            TextView textView = this.f796q;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
            TextView textView2 = this.f791l;
            if (textView2 != null) {
                textView2.setTypeface(typeface);
            }
        }
    }
}
