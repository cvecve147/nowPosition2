package android.support.p011v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.support.p007v4.view.C0487v;
import android.support.p007v4.widget.NestedScrollView;
import android.support.p011v7.widget.C0879qa;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p013b.p018b.p040i.p041a.C1103a;
import p013b.p018b.p040i.p041a.C1108f;
import p013b.p018b.p040i.p041a.C1112j;

/* renamed from: android.support.v7.app.AlertController */
class AlertController {

    /* renamed from: A */
    NestedScrollView f2086A;

    /* renamed from: B */
    private int f2087B = 0;

    /* renamed from: C */
    private Drawable f2088C;

    /* renamed from: D */
    private ImageView f2089D;

    /* renamed from: E */
    private TextView f2090E;

    /* renamed from: F */
    private TextView f2091F;

    /* renamed from: G */
    private View f2092G;

    /* renamed from: H */
    ListAdapter f2093H;

    /* renamed from: I */
    int f2094I = -1;

    /* renamed from: J */
    private int f2095J;

    /* renamed from: K */
    private int f2096K;

    /* renamed from: L */
    int f2097L;

    /* renamed from: M */
    int f2098M;

    /* renamed from: N */
    int f2099N;

    /* renamed from: O */
    int f2100O;

    /* renamed from: P */
    private boolean f2101P;

    /* renamed from: Q */
    private int f2102Q = 0;

    /* renamed from: R */
    Handler f2103R;

    /* renamed from: S */
    private final View.OnClickListener f2104S = new C0612c(this);

    /* renamed from: a */
    private final Context f2105a;

    /* renamed from: b */
    final C0591E f2106b;

    /* renamed from: c */
    private final Window f2107c;

    /* renamed from: d */
    private final int f2108d;

    /* renamed from: e */
    private CharSequence f2109e;

    /* renamed from: f */
    private CharSequence f2110f;

    /* renamed from: g */
    ListView f2111g;

    /* renamed from: h */
    private View f2112h;

    /* renamed from: i */
    private int f2113i;

    /* renamed from: j */
    private int f2114j;

    /* renamed from: k */
    private int f2115k;

    /* renamed from: l */
    private int f2116l;

    /* renamed from: m */
    private int f2117m;

    /* renamed from: n */
    private boolean f2118n = false;

    /* renamed from: o */
    Button f2119o;

    /* renamed from: p */
    private CharSequence f2120p;

    /* renamed from: q */
    Message f2121q;

    /* renamed from: r */
    private Drawable f2122r;

    /* renamed from: s */
    Button f2123s;

    /* renamed from: t */
    private CharSequence f2124t;

    /* renamed from: u */
    Message f2125u;

    /* renamed from: v */
    private Drawable f2126v;

    /* renamed from: w */
    Button f2127w;

    /* renamed from: x */
    private CharSequence f2128x;

    /* renamed from: y */
    Message f2129y;

    /* renamed from: z */
    private Drawable f2130z;

    /* renamed from: android.support.v7.app.AlertController$RecycleListView */
    public static class RecycleListView extends ListView {

        /* renamed from: a */
        private final int f2131a;

        /* renamed from: b */
        private final int f2132b;

        public RecycleListView(Context context) {
            this(context, (AttributeSet) null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1112j.RecycleListView);
            this.f2132b = obtainStyledAttributes.getDimensionPixelOffset(C1112j.RecycleListView_paddingBottomNoButtons, -1);
            this.f2131a = obtainStyledAttributes.getDimensionPixelOffset(C1112j.RecycleListView_paddingTopNoTitle, -1);
        }

        /* renamed from: a */
        public void mo2420a(boolean z, boolean z2) {
            if (!z2 || !z) {
                setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f2131a, getPaddingRight(), z2 ? getPaddingBottom() : this.f2132b);
            }
        }
    }

    /* renamed from: android.support.v7.app.AlertController$a */
    public static class C0578a {

        /* renamed from: A */
        public int f2133A;

        /* renamed from: B */
        public int f2134B;

        /* renamed from: C */
        public int f2135C;

        /* renamed from: D */
        public int f2136D;

        /* renamed from: E */
        public boolean f2137E = false;

        /* renamed from: F */
        public boolean[] f2138F;

        /* renamed from: G */
        public boolean f2139G;

        /* renamed from: H */
        public boolean f2140H;

        /* renamed from: I */
        public int f2141I = -1;

        /* renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f2142J;

        /* renamed from: K */
        public Cursor f2143K;

        /* renamed from: L */
        public String f2144L;

        /* renamed from: M */
        public String f2145M;

        /* renamed from: N */
        public AdapterView.OnItemSelectedListener f2146N;

        /* renamed from: O */
        public C0579a f2147O;

        /* renamed from: P */
        public boolean f2148P = true;

        /* renamed from: a */
        public final Context f2149a;

        /* renamed from: b */
        public final LayoutInflater f2150b;

        /* renamed from: c */
        public int f2151c = 0;

        /* renamed from: d */
        public Drawable f2152d;

        /* renamed from: e */
        public int f2153e = 0;

        /* renamed from: f */
        public CharSequence f2154f;

        /* renamed from: g */
        public View f2155g;

        /* renamed from: h */
        public CharSequence f2156h;

        /* renamed from: i */
        public CharSequence f2157i;

        /* renamed from: j */
        public Drawable f2158j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f2159k;

        /* renamed from: l */
        public CharSequence f2160l;

        /* renamed from: m */
        public Drawable f2161m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f2162n;

        /* renamed from: o */
        public CharSequence f2163o;

        /* renamed from: p */
        public Drawable f2164p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f2165q;

        /* renamed from: r */
        public boolean f2166r;

        /* renamed from: s */
        public DialogInterface.OnCancelListener f2167s;

        /* renamed from: t */
        public DialogInterface.OnDismissListener f2168t;

        /* renamed from: u */
        public DialogInterface.OnKeyListener f2169u;

        /* renamed from: v */
        public CharSequence[] f2170v;

        /* renamed from: w */
        public ListAdapter f2171w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f2172x;

        /* renamed from: y */
        public int f2173y;

        /* renamed from: z */
        public View f2174z;

        /* renamed from: android.support.v7.app.AlertController$a$a */
        public interface C0579a {
            /* renamed from: a */
            void mo2422a(ListView listView);
        }

        public C0578a(Context context) {
            this.f2149a = context;
            this.f2166r = true;
            this.f2150b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARNING: type inference failed for: r9v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r9v3 */
        /* JADX WARNING: type inference failed for: r9v4 */
        /* JADX WARNING: type inference failed for: r2v6, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v20, types: [android.support.v7.app.i] */
        /* JADX WARNING: type inference failed for: r1v21, types: [android.support.v7.app.h] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x008f  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0096  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x009a  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m2802b(android.support.p011v7.app.AlertController r12) {
            /*
                r11 = this;
                android.view.LayoutInflater r0 = r11.f2150b
                int r1 = r12.f2097L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                android.support.v7.app.AlertController$RecycleListView r0 = (android.support.p011v7.app.AlertController.RecycleListView) r0
                boolean r1 = r11.f2139G
                r8 = 1
                if (r1 == 0) goto L_0x0033
                android.database.Cursor r4 = r11.f2143K
                if (r4 != 0) goto L_0x0026
                android.support.v7.app.h r9 = new android.support.v7.app.h
                android.content.Context r3 = r11.f2149a
                int r4 = r12.f2098M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r11.f2170v
                r1 = r9
                r2 = r11
                r7 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7)
                goto L_0x0067
            L_0x0026:
                android.support.v7.app.i r9 = new android.support.v7.app.i
                android.content.Context r3 = r11.f2149a
                r5 = 0
                r1 = r9
                r2 = r11
                r6 = r0
                r7 = r12
                r1.<init>(r2, r3, r4, r5, r6, r7)
                goto L_0x0067
            L_0x0033:
                boolean r1 = r11.f2140H
                if (r1 == 0) goto L_0x003a
                int r1 = r12.f2099N
                goto L_0x003c
            L_0x003a:
                int r1 = r12.f2100O
            L_0x003c:
                r4 = r1
                android.database.Cursor r5 = r11.f2143K
                r1 = 16908308(0x1020014, float:2.3877285E-38)
                if (r5 == 0) goto L_0x0059
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r11.f2149a
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r2 = r11.f2144L
                r7 = 0
                r6[r7] = r2
                int[] r10 = new int[r8]
                r10[r7] = r1
                r2 = r9
                r7 = r10
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x0067
            L_0x0059:
                android.widget.ListAdapter r9 = r11.f2171w
                if (r9 == 0) goto L_0x005e
                goto L_0x0067
            L_0x005e:
                android.support.v7.app.AlertController$c r9 = new android.support.v7.app.AlertController$c
                android.content.Context r2 = r11.f2149a
                java.lang.CharSequence[] r3 = r11.f2170v
                r9.<init>(r2, r4, r1, r3)
            L_0x0067:
                android.support.v7.app.AlertController$a$a r1 = r11.f2147O
                if (r1 == 0) goto L_0x006e
                r1.mo2422a(r0)
            L_0x006e:
                r12.f2093H = r9
                int r1 = r11.f2141I
                r12.f2094I = r1
                android.content.DialogInterface$OnClickListener r1 = r11.f2172x
                if (r1 == 0) goto L_0x0081
                android.support.v7.app.j r1 = new android.support.v7.app.j
                r1.<init>(r11, r12)
            L_0x007d:
                r0.setOnItemClickListener(r1)
                goto L_0x008b
            L_0x0081:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r11.f2142J
                if (r1 == 0) goto L_0x008b
                android.support.v7.app.k r1 = new android.support.v7.app.k
                r1.<init>(r11, r0, r12)
                goto L_0x007d
            L_0x008b:
                android.widget.AdapterView$OnItemSelectedListener r1 = r11.f2146N
                if (r1 == 0) goto L_0x0092
                r0.setOnItemSelectedListener(r1)
            L_0x0092:
                boolean r1 = r11.f2140H
                if (r1 == 0) goto L_0x009a
                r0.setChoiceMode(r8)
                goto L_0x00a2
            L_0x009a:
                boolean r1 = r11.f2139G
                if (r1 == 0) goto L_0x00a2
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00a2:
                r12.f2111g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.app.AlertController.C0578a.m2802b(android.support.v7.app.AlertController):void");
        }

        /* renamed from: a */
        public void mo2421a(AlertController alertController) {
            View view = this.f2155g;
            if (view != null) {
                alertController.mo2415b(view);
            } else {
                CharSequence charSequence = this.f2154f;
                if (charSequence != null) {
                    alertController.mo2416b(charSequence);
                }
                Drawable drawable = this.f2152d;
                if (drawable != null) {
                    alertController.mo2410a(drawable);
                }
                int i = this.f2151c;
                if (i != 0) {
                    alertController.mo2414b(i);
                }
                int i2 = this.f2153e;
                if (i2 != 0) {
                    alertController.mo2414b(alertController.mo2407a(i2));
                }
            }
            CharSequence charSequence2 = this.f2156h;
            if (charSequence2 != null) {
                alertController.mo2412a(charSequence2);
            }
            if (!(this.f2157i == null && this.f2158j == null)) {
                alertController.mo2409a(-1, this.f2157i, this.f2159k, (Message) null, this.f2158j);
            }
            if (!(this.f2160l == null && this.f2161m == null)) {
                alertController.mo2409a(-2, this.f2160l, this.f2162n, (Message) null, this.f2161m);
            }
            if (!(this.f2163o == null && this.f2164p == null)) {
                alertController.mo2409a(-3, this.f2163o, this.f2165q, (Message) null, this.f2164p);
            }
            if (!(this.f2170v == null && this.f2143K == null && this.f2171w == null)) {
                m2802b(alertController);
            }
            View view2 = this.f2174z;
            if (view2 == null) {
                int i3 = this.f2173y;
                if (i3 != 0) {
                    alertController.mo2418c(i3);
                }
            } else if (this.f2137E) {
                alertController.mo2411a(view2, this.f2133A, this.f2134B, this.f2135C, this.f2136D);
            } else {
                alertController.mo2419c(view2);
            }
        }
    }

    /* renamed from: android.support.v7.app.AlertController$b */
    private static final class C0580b extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f2175a;

        public C0580b(DialogInterface dialogInterface) {
            this.f2175a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f2175a.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: android.support.v7.app.AlertController$c */
    private static class C0581c extends ArrayAdapter<CharSequence> {
        public C0581c(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, C0591E e, Window window) {
        this.f2105a = context;
        this.f2106b = e;
        this.f2107c = window;
        this.f2103R = new C0580b(e);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C1112j.AlertDialog, C1103a.alertDialogStyle, 0);
        this.f2095J = obtainStyledAttributes.getResourceId(C1112j.AlertDialog_android_layout, 0);
        this.f2096K = obtainStyledAttributes.getResourceId(C1112j.AlertDialog_buttonPanelSideLayout, 0);
        this.f2097L = obtainStyledAttributes.getResourceId(C1112j.AlertDialog_listLayout, 0);
        this.f2098M = obtainStyledAttributes.getResourceId(C1112j.AlertDialog_multiChoiceItemLayout, 0);
        this.f2099N = obtainStyledAttributes.getResourceId(C1112j.AlertDialog_singleChoiceItemLayout, 0);
        this.f2100O = obtainStyledAttributes.getResourceId(C1112j.AlertDialog_listItemLayout, 0);
        this.f2101P = obtainStyledAttributes.getBoolean(C1112j.AlertDialog_showTitle, true);
        this.f2108d = obtainStyledAttributes.getDimensionPixelSize(C1112j.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        e.mo2500a(1);
    }

    /* renamed from: a */
    private ViewGroup m2776a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: a */
    static void m2777a(View view, View view2, View view3) {
        int i = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i = 4;
            }
            view3.setVisibility(i);
        }
    }

    /* renamed from: a */
    private void m2778a(ViewGroup viewGroup) {
        boolean z;
        Button button;
        this.f2119o = (Button) viewGroup.findViewById(16908313);
        this.f2119o.setOnClickListener(this.f2104S);
        boolean z2 = true;
        if (!TextUtils.isEmpty(this.f2120p) || this.f2122r != null) {
            this.f2119o.setText(this.f2120p);
            Drawable drawable = this.f2122r;
            if (drawable != null) {
                int i = this.f2108d;
                drawable.setBounds(0, 0, i, i);
                this.f2119o.setCompoundDrawables(this.f2122r, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f2119o.setVisibility(0);
            z = true;
        } else {
            this.f2119o.setVisibility(8);
            z = false;
        }
        this.f2123s = (Button) viewGroup.findViewById(16908314);
        this.f2123s.setOnClickListener(this.f2104S);
        if (!TextUtils.isEmpty(this.f2124t) || this.f2126v != null) {
            this.f2123s.setText(this.f2124t);
            Drawable drawable2 = this.f2126v;
            if (drawable2 != null) {
                int i2 = this.f2108d;
                drawable2.setBounds(0, 0, i2, i2);
                this.f2123s.setCompoundDrawables(this.f2126v, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f2123s.setVisibility(0);
            z |= true;
        } else {
            this.f2123s.setVisibility(8);
        }
        this.f2127w = (Button) viewGroup.findViewById(16908315);
        this.f2127w.setOnClickListener(this.f2104S);
        if (!TextUtils.isEmpty(this.f2128x) || this.f2130z != null) {
            this.f2127w.setText(this.f2128x);
            Drawable drawable3 = this.f2122r;
            if (drawable3 != null) {
                int i3 = this.f2108d;
                drawable3.setBounds(0, 0, i3, i3);
                this.f2119o.setCompoundDrawables(this.f2122r, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f2127w.setVisibility(0);
            z |= true;
        } else {
            this.f2127w.setVisibility(8);
        }
        if (m2781a(this.f2105a)) {
            if (z) {
                button = this.f2119o;
            } else if (z) {
                button = this.f2123s;
            } else if (z) {
                button = this.f2127w;
            }
            m2780a(button);
        }
        if (!z) {
            z2 = false;
        }
        if (!z2) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m2779a(ViewGroup viewGroup, View view, int i, int i2) {
        View findViewById = this.f2107c.findViewById(C1108f.scrollIndicatorUp);
        View findViewById2 = this.f2107c.findViewById(C1108f.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            C0487v.m2268a(view, i, i2);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        View view2 = null;
        if (findViewById != null && (i & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 == null || (i & 2) != 0) {
            view2 = findViewById2;
        } else {
            viewGroup.removeView(findViewById2);
        }
        if (findViewById != null || view2 != null) {
            if (this.f2110f != null) {
                this.f2086A.setOnScrollChangeListener(new C0613d(this, findViewById, view2));
                this.f2086A.post(new C0614e(this, findViewById, view2));
                return;
            }
            ListView listView = this.f2111g;
            if (listView != null) {
                listView.setOnScrollListener(new C0615f(this, findViewById, view2));
                this.f2111g.post(new C0616g(this, findViewById, view2));
                return;
            }
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (view2 != null) {
                viewGroup.removeView(view2);
            }
        }
    }

    /* renamed from: a */
    private void m2780a(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    private static boolean m2781a(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C1103a.alertDialogCenterButtons, typedValue, true);
        return typedValue.data != 0;
    }

    /* renamed from: a */
    static boolean m2782a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m2782a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private int m2783b() {
        int i = this.f2096K;
        return i == 0 ? this.f2095J : this.f2102Q == 1 ? i : this.f2095J;
    }

    /* renamed from: b */
    private void m2784b(ViewGroup viewGroup) {
        this.f2086A = (NestedScrollView) this.f2107c.findViewById(C1108f.scrollView);
        this.f2086A.setFocusable(false);
        this.f2086A.setNestedScrollingEnabled(false);
        this.f2091F = (TextView) viewGroup.findViewById(16908299);
        TextView textView = this.f2091F;
        if (textView != null) {
            CharSequence charSequence = this.f2110f;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.f2086A.removeView(this.f2091F);
            if (this.f2111g != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f2086A.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.f2086A);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.f2111g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: c */
    private void m2785c() {
        ListAdapter listAdapter;
        View findViewById;
        View findViewById2;
        View findViewById3 = this.f2107c.findViewById(C1108f.parentPanel);
        View findViewById4 = findViewById3.findViewById(C1108f.topPanel);
        View findViewById5 = findViewById3.findViewById(C1108f.contentPanel);
        View findViewById6 = findViewById3.findViewById(C1108f.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(C1108f.customPanel);
        m2786c(viewGroup);
        View findViewById7 = viewGroup.findViewById(C1108f.topPanel);
        View findViewById8 = viewGroup.findViewById(C1108f.contentPanel);
        View findViewById9 = viewGroup.findViewById(C1108f.buttonPanel);
        ViewGroup a = m2776a(findViewById7, findViewById4);
        ViewGroup a2 = m2776a(findViewById8, findViewById5);
        ViewGroup a3 = m2776a(findViewById9, findViewById6);
        m2784b(a2);
        m2778a(a3);
        m2787d(a);
        char c = 0;
        boolean z = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        boolean z2 = (a == null || a.getVisibility() == 8) ? false : true;
        boolean z3 = (a3 == null || a3.getVisibility() == 8) ? false : true;
        if (!(z3 || a2 == null || (findViewById2 = a2.findViewById(C1108f.textSpacerNoButtons)) == null)) {
            findViewById2.setVisibility(0);
        }
        if (z2) {
            NestedScrollView nestedScrollView = this.f2086A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (!(this.f2110f == null && this.f2111g == null)) {
                view = a.findViewById(C1108f.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (!(a2 == null || (findViewById = a2.findViewById(C1108f.textSpacerNoTitle)) == null)) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f2111g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).mo2420a(z2, z3);
        }
        if (!z) {
            View view2 = this.f2111g;
            if (view2 == null) {
                view2 = this.f2086A;
            }
            if (view2 != null) {
                if (z3) {
                    c = 2;
                }
                m2779a(a2, view2, z2 | c ? 1 : 0, 3);
            }
        }
        ListView listView2 = this.f2111g;
        if (listView2 != null && (listAdapter = this.f2093H) != null) {
            listView2.setAdapter(listAdapter);
            int i = this.f2094I;
            if (i > -1) {
                listView2.setItemChecked(i, true);
                listView2.setSelection(i);
            }
        }
    }

    /* renamed from: c */
    private void m2786c(ViewGroup viewGroup) {
        View view = this.f2112h;
        boolean z = false;
        if (view == null) {
            view = this.f2113i != 0 ? LayoutInflater.from(this.f2105a).inflate(this.f2113i, viewGroup, false) : null;
        }
        if (view != null) {
            z = true;
        }
        if (!z || !m2782a(view)) {
            this.f2107c.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f2107c.findViewById(C1108f.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f2118n) {
                frameLayout.setPadding(this.f2114j, this.f2115k, this.f2116l, this.f2117m);
            }
            if (this.f2111g != null) {
                ((C0879qa.C0880a) viewGroup.getLayoutParams()).f3624a = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: d */
    private void m2787d(ViewGroup viewGroup) {
        if (this.f2092G != null) {
            viewGroup.addView(this.f2092G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f2107c.findViewById(C1108f.title_template).setVisibility(8);
            return;
        }
        this.f2089D = (ImageView) this.f2107c.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f2109e)) || !this.f2101P) {
            this.f2107c.findViewById(C1108f.title_template).setVisibility(8);
            this.f2089D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        this.f2090E = (TextView) this.f2107c.findViewById(C1108f.alertTitle);
        this.f2090E.setText(this.f2109e);
        int i = this.f2087B;
        if (i != 0) {
            this.f2089D.setImageResource(i);
            return;
        }
        Drawable drawable = this.f2088C;
        if (drawable != null) {
            this.f2089D.setImageDrawable(drawable);
            return;
        }
        this.f2090E.setPadding(this.f2089D.getPaddingLeft(), this.f2089D.getPaddingTop(), this.f2089D.getPaddingRight(), this.f2089D.getPaddingBottom());
        this.f2089D.setVisibility(8);
    }

    /* renamed from: a */
    public int mo2407a(int i) {
        TypedValue typedValue = new TypedValue();
        this.f2105a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: a */
    public void mo2408a() {
        this.f2106b.setContentView(m2783b());
        m2785c();
    }

    /* renamed from: a */
    public void mo2409a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f2103R.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f2128x = charSequence;
            this.f2129y = message;
            this.f2130z = drawable;
        } else if (i == -2) {
            this.f2124t = charSequence;
            this.f2125u = message;
            this.f2126v = drawable;
        } else if (i == -1) {
            this.f2120p = charSequence;
            this.f2121q = message;
            this.f2122r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: a */
    public void mo2410a(Drawable drawable) {
        this.f2088C = drawable;
        this.f2087B = 0;
        ImageView imageView = this.f2089D;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.f2089D.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: a */
    public void mo2411a(View view, int i, int i2, int i3, int i4) {
        this.f2112h = view;
        this.f2113i = 0;
        this.f2118n = true;
        this.f2114j = i;
        this.f2115k = i2;
        this.f2116l = i3;
        this.f2117m = i4;
    }

    /* renamed from: a */
    public void mo2412a(CharSequence charSequence) {
        this.f2110f = charSequence;
        TextView textView = this.f2091F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: a */
    public boolean mo2413a(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f2086A;
        return nestedScrollView != null && nestedScrollView.mo2167a(keyEvent);
    }

    /* renamed from: b */
    public void mo2414b(int i) {
        this.f2088C = null;
        this.f2087B = i;
        ImageView imageView = this.f2089D;
        if (imageView == null) {
            return;
        }
        if (i != 0) {
            imageView.setVisibility(0);
            this.f2089D.setImageResource(this.f2087B);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: b */
    public void mo2415b(View view) {
        this.f2092G = view;
    }

    /* renamed from: b */
    public void mo2416b(CharSequence charSequence) {
        this.f2109e = charSequence;
        TextView textView = this.f2090E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: b */
    public boolean mo2417b(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f2086A;
        return nestedScrollView != null && nestedScrollView.mo2167a(keyEvent);
    }

    /* renamed from: c */
    public void mo2418c(int i) {
        this.f2112h = null;
        this.f2113i = i;
        this.f2118n = false;
    }

    /* renamed from: c */
    public void mo2419c(View view) {
        this.f2112h = view;
        this.f2113i = 0;
        this.f2118n = false;
    }
}
