package android.support.p011v7.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p007v4.view.AbsSavedState;
import android.support.p007v4.widget.C0546h;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p013b.p018b.p040i.p041a.C1103a;
import p013b.p018b.p040i.p041a.C1106d;
import p013b.p018b.p040i.p050h.C1138c;

/* renamed from: android.support.v7.widget.SearchView */
public class SearchView extends C0879qa implements C1138c {

    /* renamed from: p */
    static final C0781a f3111p = new C0781a();

    /* renamed from: A */
    private int[] f3112A;

    /* renamed from: B */
    private int[] f3113B;

    /* renamed from: C */
    private final ImageView f3114C;

    /* renamed from: D */
    private final Drawable f3115D;

    /* renamed from: E */
    private final int f3116E;

    /* renamed from: F */
    private final int f3117F;

    /* renamed from: G */
    private final Intent f3118G;

    /* renamed from: H */
    private final Intent f3119H;

    /* renamed from: I */
    private final CharSequence f3120I;

    /* renamed from: J */
    private C0783c f3121J;

    /* renamed from: K */
    private C0782b f3122K;

    /* renamed from: L */
    View.OnFocusChangeListener f3123L;

    /* renamed from: M */
    private C0784d f3124M;

    /* renamed from: N */
    private View.OnClickListener f3125N;

    /* renamed from: O */
    private boolean f3126O;

    /* renamed from: P */
    private boolean f3127P;

    /* renamed from: Q */
    C0546h f3128Q;

    /* renamed from: R */
    private boolean f3129R;

    /* renamed from: S */
    private CharSequence f3130S;

    /* renamed from: T */
    private boolean f3131T;

    /* renamed from: U */
    private boolean f3132U;

    /* renamed from: V */
    private int f3133V;

    /* renamed from: W */
    private boolean f3134W;

    /* renamed from: aa */
    private CharSequence f3135aa;

    /* renamed from: ba */
    private boolean f3136ba;

    /* renamed from: ca */
    private int f3137ca;

    /* renamed from: da */
    SearchableInfo f3138da;

    /* renamed from: ea */
    private Bundle f3139ea;

    /* renamed from: fa */
    private final Runnable f3140fa;

    /* renamed from: ga */
    private Runnable f3141ga;

    /* renamed from: ha */
    private final WeakHashMap<String, Drawable.ConstantState> f3142ha;

    /* renamed from: q */
    final SearchAutoComplete f3143q;

    /* renamed from: r */
    private final View f3144r;

    /* renamed from: s */
    private final View f3145s;

    /* renamed from: t */
    final ImageView f3146t;

    /* renamed from: u */
    final ImageView f3147u;

    /* renamed from: v */
    final ImageView f3148v;

    /* renamed from: w */
    final ImageView f3149w;

    /* renamed from: x */
    private C0785e f3150x;

    /* renamed from: y */
    private Rect f3151y;

    /* renamed from: z */
    private Rect f3152z;

    /* renamed from: android.support.v7.widget.SearchView$SavedState */
    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0780Sa();

        /* renamed from: a */
        boolean f3153a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3153a = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f3153a + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f3153a));
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$SearchAutoComplete */
    public static class SearchAutoComplete extends C0849k {

        /* renamed from: d */
        private int f3154d;

        /* renamed from: e */
        private SearchView f3155e;

        /* renamed from: f */
        private boolean f3156f;

        /* renamed from: g */
        final Runnable f3157g;

        public SearchAutoComplete(Context context) {
            this(context, (AttributeSet) null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C1103a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f3157g = new C0792Ta(this);
            this.f3154d = getThreshold();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m4414a() {
            if (this.f3156f) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f3156f = false;
            }
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* access modifiers changed from: private */
        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f3156f = false;
                removeCallbacks(this.f3157g);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f3156f = false;
                removeCallbacks(this.f3157g);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f3156f = true;
            }
        }

        public boolean enoughToFilter() {
            return this.f3154d <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f3156f) {
                removeCallbacks(this.f3157g);
                post(this.f3157g);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f3155e.mo4071g();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f3155e.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f3155e.hasFocus() && getVisibility() == 0) {
                this.f3156f = true;
                if (SearchView.m4393a(getContext())) {
                    SearchView.f3111p.mo4113a(this, true);
                }
            }
        }

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        /* access modifiers changed from: package-private */
        public void setSearchView(SearchView searchView) {
            this.f3155e = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f3154d = i;
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$a */
    private static class C0781a {

        /* renamed from: a */
        private Method f3158a;

        /* renamed from: b */
        private Method f3159b;

        /* renamed from: c */
        private Method f3160c;

        C0781a() {
            try {
                this.f3158a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f3158a.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                this.f3159b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f3159b.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            try {
                this.f3160c = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f3160c.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4112a(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f3159b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4113a(AutoCompleteTextView autoCompleteTextView, boolean z) {
            Method method = this.f3160c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4114b(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f3158a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$b */
    public interface C0782b {
        boolean onClose();
    }

    /* renamed from: android.support.v7.widget.SearchView$c */
    public interface C0783c {
        boolean onQueryTextSubmit(String str);
    }

    /* renamed from: android.support.v7.widget.SearchView$d */
    public interface C0784d {
    }

    /* renamed from: android.support.v7.widget.SearchView$e */
    private static class C0785e extends TouchDelegate {

        /* renamed from: a */
        private final View f3161a;

        /* renamed from: b */
        private final Rect f3162b = new Rect();

        /* renamed from: c */
        private final Rect f3163c = new Rect();

        /* renamed from: d */
        private final Rect f3164d = new Rect();

        /* renamed from: e */
        private final int f3165e;

        /* renamed from: f */
        private boolean f3166f;

        public C0785e(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f3165e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            mo4117a(rect, rect2);
            this.f3161a = view;
        }

        /* renamed from: a */
        public void mo4117a(Rect rect, Rect rect2) {
            this.f3162b.set(rect);
            this.f3164d.set(rect);
            Rect rect3 = this.f3164d;
            int i = this.f3165e;
            rect3.inset(-i, -i);
            this.f3163c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x003d  */
        /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r8) {
            /*
                r7 = this;
                float r0 = r8.getX()
                int r0 = (int) r0
                float r1 = r8.getY()
                int r1 = (int) r1
                int r2 = r8.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x002e
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003a
            L_0x001b:
                boolean r2 = r7.f3166f
                r7.f3166f = r5
                goto L_0x003b
            L_0x0020:
                boolean r2 = r7.f3166f
                if (r2 == 0) goto L_0x003b
                android.graphics.Rect r6 = r7.f3164d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x003b
                r4 = r5
                goto L_0x003b
            L_0x002e:
                android.graphics.Rect r2 = r7.f3162b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003a
                r7.f3166f = r4
                r2 = r4
                goto L_0x003b
            L_0x003a:
                r2 = r5
            L_0x003b:
                if (r2 == 0) goto L_0x006a
                if (r4 == 0) goto L_0x0057
                android.graphics.Rect r2 = r7.f3163c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x0057
                android.view.View r0 = r7.f3161a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r7.f3161a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                goto L_0x0060
            L_0x0057:
                android.graphics.Rect r2 = r7.f3163c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
            L_0x0060:
                float r1 = (float) r1
                r8.setLocation(r0, r1)
                android.view.View r0 = r7.f3161a
                boolean r5 = r0.dispatchTouchEvent(r8)
            L_0x006a:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.SearchView.C0785e.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    /* renamed from: a */
    private Intent m4390a(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f3135aa);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f3139ea;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f3138da.getSearchActivity());
        return intent;
    }

    /* renamed from: a */
    private void m4391a(View view, Rect rect) {
        view.getLocationInWindow(this.f3112A);
        getLocationInWindow(this.f3113B);
        int[] iArr = this.f3112A;
        int i = iArr[1];
        int[] iArr2 = this.f3113B;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    /* renamed from: a */
    private void m4392a(boolean z) {
        this.f3147u.setVisibility((!this.f3129R || !m4399j() || !hasFocus() || (!z && this.f3134W)) ? 8 : 0);
    }

    /* renamed from: a */
    static boolean m4393a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: b */
    private CharSequence m4394b(CharSequence charSequence) {
        if (!this.f3126O || this.f3115D == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f3143q.getTextSize()) * 1.25d);
        this.f3115D.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f3115D), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: b */
    private void m4395b(boolean z) {
        this.f3127P = z;
        int i = 8;
        boolean z2 = false;
        int i2 = z ? 0 : 8;
        boolean z3 = !TextUtils.isEmpty(this.f3143q.getText());
        this.f3146t.setVisibility(i2);
        m4392a(z3);
        this.f3144r.setVisibility(z ? 8 : 0);
        if (this.f3114C.getDrawable() != null && !this.f3126O) {
            i = 0;
        }
        this.f3114C.setVisibility(i);
        m4401l();
        if (!z3) {
            z2 = true;
        }
        m4396c(z2);
        m4404o();
    }

    /* renamed from: c */
    private void m4396c(boolean z) {
        int i;
        if (!this.f3134W || mo4066c() || !z) {
            i = 8;
        } else {
            i = 0;
            this.f3147u.setVisibility(8);
        }
        this.f3149w.setVisibility(i);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C1106d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C1106d.abc_search_view_preferred_width);
    }

    /* renamed from: h */
    private void m4397h() {
        this.f3143q.dismissDropDown();
    }

    /* renamed from: i */
    private boolean m4398i() {
        SearchableInfo searchableInfo = this.f3138da;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f3138da.getVoiceSearchLaunchWebSearch()) {
            intent = this.f3118G;
        } else if (this.f3138da.getVoiceSearchLaunchRecognizer()) {
            intent = this.f3119H;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    /* renamed from: j */
    private boolean m4399j() {
        return (this.f3129R || this.f3134W) && !mo4066c();
    }

    /* renamed from: k */
    private void m4400k() {
        post(this.f3140fa);
    }

    /* renamed from: l */
    private void m4401l() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f3143q.getText());
        int i = 0;
        if (!z2 && (!this.f3126O || this.f3136ba)) {
            z = false;
        }
        ImageView imageView = this.f3148v;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f3148v.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: m */
    private void m4402m() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f3143q;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m4394b(queryHint));
    }

    /* renamed from: n */
    private void m4403n() {
        this.f3143q.setThreshold(this.f3138da.getSuggestThreshold());
        this.f3143q.setImeOptions(this.f3138da.getImeOptions());
        int inputType = this.f3138da.getInputType();
        int i = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f3138da.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f3143q.setInputType(inputType);
        C0546h hVar = this.f3128Q;
        if (hVar != null) {
            hVar.mo2352a((Cursor) null);
        }
        if (this.f3138da.getSuggestAuthority() != null) {
            this.f3128Q = new C0806Ya(getContext(), this, this.f3138da, this.f3142ha);
            this.f3143q.setAdapter(this.f3128Q);
            C0806Ya ya = (C0806Ya) this.f3128Q;
            if (this.f3131T) {
                i = 2;
            }
            ya.mo4424a(i);
        }
    }

    /* renamed from: o */
    private void m4404o() {
        this.f3145s.setVisibility((!m4399j() || !(this.f3147u.getVisibility() == 0 || this.f3149w.getVisibility() == 0)) ? 8 : 0);
    }

    private void setQuery(CharSequence charSequence) {
        this.f3143q.setText(charSequence);
        this.f3143q.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4062a(int i, String str, String str2) {
        getContext().startActivity(m4390a("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4063a(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* renamed from: a */
    public void mo4064a(CharSequence charSequence, boolean z) {
        this.f3143q.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f3143q;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f3135aa = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            mo4070f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4065b() {
        f3111p.mo4114b(this.f3143q);
        f3111p.mo4112a(this.f3143q);
    }

    /* renamed from: c */
    public boolean mo4066c() {
        return this.f3127P;
    }

    public void clearFocus() {
        this.f3132U = true;
        super.clearFocus();
        this.f3143q.clearFocus();
        this.f3143q.setImeVisibility(false);
        this.f3132U = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4068d() {
        if (!TextUtils.isEmpty(this.f3143q.getText())) {
            this.f3143q.setText("");
            this.f3143q.requestFocus();
            this.f3143q.setImeVisibility(true);
        } else if (this.f3126O) {
            C0782b bVar = this.f3122K;
            if (bVar == null || !bVar.onClose()) {
                clearFocus();
                m4395b(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo4069e() {
        m4395b(false);
        this.f3143q.requestFocus();
        this.f3143q.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f3125N;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo4070f() {
        Editable text = this.f3143q.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            C0783c cVar = this.f3121J;
            if (cVar == null || !cVar.onQueryTextSubmit(text.toString())) {
                if (this.f3138da != null) {
                    mo4062a(0, (String) null, text.toString());
                }
                this.f3143q.setImeVisibility(false);
                m4397h();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo4071g() {
        m4395b(mo4066c());
        m4400k();
        if (this.f3143q.hasFocus()) {
            mo4065b();
        }
    }

    public int getImeOptions() {
        return this.f3143q.getImeOptions();
    }

    public int getInputType() {
        return this.f3143q.getInputType();
    }

    public int getMaxWidth() {
        return this.f3133V;
    }

    public CharSequence getQuery() {
        return this.f3143q.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f3130S;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f3138da;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f3120I : getContext().getText(this.f3138da.getHintId());
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.f3117F;
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.f3116E;
    }

    public C0546h getSuggestionsAdapter() {
        return this.f3128Q;
    }

    public void onActionViewCollapsed() {
        mo4064a((CharSequence) "", false);
        clearFocus();
        m4395b(true);
        this.f3143q.setImeOptions(this.f3137ca);
        this.f3136ba = false;
    }

    public void onActionViewExpanded() {
        if (!this.f3136ba) {
            this.f3136ba = true;
            this.f3137ca = this.f3143q.getImeOptions();
            this.f3143q.setImeOptions(this.f3137ca | 33554432);
            this.f3143q.setText("");
            setIconified(false);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f3140fa);
        post(this.f3141ga);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m4391a((View) this.f3143q, this.f3151y);
            Rect rect = this.f3152z;
            Rect rect2 = this.f3151y;
            rect.set(rect2.left, 0, rect2.right, i4 - i2);
            C0785e eVar = this.f3150x;
            if (eVar == null) {
                this.f3150x = new C0785e(this.f3152z, this.f3151y, this.f3143q);
                setTouchDelegate(this.f3150x);
                return;
            }
            eVar.mo4117a(this.f3152z, this.f3151y);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r0 <= 0) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.mo4066c()
            if (r0 == 0) goto L_0x000a
            super.onMeasure(r4, r5)
            return
        L_0x000a:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x002c
            if (r0 == 0) goto L_0x0022
            if (r0 == r2) goto L_0x001d
            goto L_0x0039
        L_0x001d:
            int r0 = r3.f3133V
            if (r0 <= 0) goto L_0x0039
            goto L_0x0030
        L_0x0022:
            int r4 = r3.f3133V
            if (r4 <= 0) goto L_0x0027
            goto L_0x0039
        L_0x0027:
            int r4 = r3.getPreferredWidth()
            goto L_0x0039
        L_0x002c:
            int r0 = r3.f3133V
            if (r0 <= 0) goto L_0x0031
        L_0x0030:
            goto L_0x0035
        L_0x0031:
            int r0 = r3.getPreferredWidth()
        L_0x0035:
            int r4 = java.lang.Math.min(r0, r4)
        L_0x0039:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L_0x004b
            if (r0 == 0) goto L_0x0046
            goto L_0x0053
        L_0x0046:
            int r5 = r3.getPreferredHeight()
            goto L_0x0053
        L_0x004b:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L_0x0053:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.SearchView.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo1736a());
        m4395b(savedState.f3153a);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3153a = mo4066c();
        return savedState;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m4400k();
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.f3132U || !isFocusable()) {
            return false;
        }
        if (mo4066c()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f3143q.requestFocus(i, rect);
        if (requestFocus) {
            m4395b(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f3139ea = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            mo4068d();
        } else {
            mo4069e();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f3126O != z) {
            this.f3126O = z;
            m4395b(z);
            m4402m();
        }
    }

    public void setImeOptions(int i) {
        this.f3143q.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f3143q.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f3133V = i;
        requestLayout();
    }

    public void setOnCloseListener(C0782b bVar) {
        this.f3122K = bVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f3123L = onFocusChangeListener;
    }

    public void setOnQueryTextListener(C0783c cVar) {
        this.f3121J = cVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f3125N = onClickListener;
    }

    public void setOnSuggestionListener(C0784d dVar) {
        this.f3124M = dVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f3130S = charSequence;
        m4402m();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f3131T = z;
        C0546h hVar = this.f3128Q;
        if (hVar instanceof C0806Ya) {
            ((C0806Ya) hVar).mo4424a(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f3138da = searchableInfo;
        if (this.f3138da != null) {
            m4403n();
            m4402m();
        }
        this.f3134W = m4398i();
        if (this.f3134W) {
            this.f3143q.setPrivateImeOptions("nm");
        }
        m4395b(mo4066c());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f3129R = z;
        m4395b(mo4066c());
    }

    public void setSuggestionsAdapter(C0546h hVar) {
        this.f3128Q = hVar;
        this.f3143q.setAdapter(this.f3128Q);
    }
}
