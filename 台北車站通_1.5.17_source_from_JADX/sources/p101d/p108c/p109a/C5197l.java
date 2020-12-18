package p101d.p108c.p109a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.support.p011v7.widget.LinearLayoutManager;
import android.support.p011v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import com.afollestad.materialdialogs.internal.C1160f;
import com.afollestad.materialdialogs.internal.C1161g;
import com.afollestad.materialdialogs.internal.MDButton;
import com.afollestad.materialdialogs.internal.MDRootLayout;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import p013b.p018b.p028h.p029a.p030a.C1014d;
import p101d.p108c.p109a.C5185b;
import p101d.p108c.p109a.p110a.C5182c;
import p101d.p108c.p109a.p110a.C5183d;
import p101d.p108c.p109a.p110a.C5184e;

/* renamed from: d.c.a.l */
public class C5197l extends C5189d implements View.OnClickListener, C5185b.C5187b {

    /* renamed from: c */
    RecyclerView f14588c;

    /* renamed from: d */
    View f14589d;

    /* renamed from: e */
    FrameLayout f14590e;

    /* renamed from: f */
    ProgressBar f14591f;

    /* renamed from: g */
    TextView f14592g;

    /* renamed from: h */
    TextView f14593h;

    /* renamed from: i */
    TextView f14594i;

    /* renamed from: j */
    CheckBox f14595j;

    /* renamed from: k */
    MDButton f14596k;

    /* renamed from: l */
    MDButton f14597l;

    /* renamed from: m */
    MDButton f14598m;

    /* renamed from: n */
    C5206i f14599n;

    /* renamed from: o */
    List<Integer> f14600o;

    /* renamed from: p */
    protected final C5198a f14601p;

    /* renamed from: q */
    protected ImageView f14602q;

    /* renamed from: r */
    protected TextView f14603r;

    /* renamed from: s */
    protected TextView f14604s;

    /* renamed from: t */
    protected EditText f14605t;

    /* renamed from: u */
    private final Handler f14606u = new Handler();

    /* renamed from: d.c.a.l$a */
    public static class C5198a {

        /* renamed from: A */
        protected C5207j f14607A;

        /* renamed from: Aa */
        protected boolean f14608Aa;

        /* renamed from: B */
        protected C5202e f14609B;

        /* renamed from: Ba */
        protected boolean f14610Ba;

        /* renamed from: C */
        protected C5205h f14611C;

        /* renamed from: Ca */
        protected boolean f14612Ca;

        /* renamed from: D */
        protected C5204g f14613D;

        /* renamed from: Da */
        protected boolean f14614Da;

        /* renamed from: E */
        protected C5203f f14615E;

        /* renamed from: Ea */
        protected boolean f14616Ea;

        /* renamed from: F */
        protected boolean f14617F;

        /* renamed from: Fa */
        protected boolean f14618Fa;

        /* renamed from: G */
        protected boolean f14619G;

        /* renamed from: Ga */
        protected boolean f14620Ga;

        /* renamed from: H */
        protected C5217v f14621H;

        /* renamed from: Ha */
        protected int f14622Ha;

        /* renamed from: I */
        protected boolean f14623I;

        /* renamed from: Ia */
        protected int f14624Ia;

        /* renamed from: J */
        protected boolean f14625J;

        /* renamed from: Ja */
        protected int f14626Ja;

        /* renamed from: K */
        protected float f14627K;

        /* renamed from: Ka */
        protected int f14628Ka;

        /* renamed from: L */
        protected int f14629L;

        /* renamed from: La */
        protected int f14630La;

        /* renamed from: M */
        protected Integer[] f14631M;

        /* renamed from: N */
        protected Integer[] f14632N;

        /* renamed from: O */
        protected boolean f14633O;

        /* renamed from: P */
        protected Typeface f14634P;

        /* renamed from: Q */
        protected Typeface f14635Q;

        /* renamed from: R */
        protected Drawable f14636R;

        /* renamed from: S */
        protected boolean f14637S;

        /* renamed from: T */
        protected int f14638T;

        /* renamed from: U */
        protected RecyclerView.C0748a<?> f14639U;

        /* renamed from: V */
        protected RecyclerView.C0759i f14640V;

        /* renamed from: W */
        protected DialogInterface.OnDismissListener f14641W;

        /* renamed from: X */
        protected DialogInterface.OnCancelListener f14642X;

        /* renamed from: Y */
        protected DialogInterface.OnKeyListener f14643Y;

        /* renamed from: Z */
        protected DialogInterface.OnShowListener f14644Z;

        /* renamed from: a */
        protected final Context f14645a;

        /* renamed from: aa */
        protected C5216u f14646aa;

        /* renamed from: b */
        protected CharSequence f14647b;

        /* renamed from: ba */
        protected boolean f14648ba;

        /* renamed from: c */
        protected C5192g f14649c;

        /* renamed from: ca */
        protected int f14650ca;

        /* renamed from: d */
        protected C5192g f14651d;

        /* renamed from: da */
        protected int f14652da;

        /* renamed from: e */
        protected C5192g f14653e = C5192g.END;

        /* renamed from: ea */
        protected int f14654ea;

        /* renamed from: f */
        protected C5192g f14655f;

        /* renamed from: fa */
        protected boolean f14656fa;

        /* renamed from: g */
        protected C5192g f14657g;

        /* renamed from: ga */
        protected boolean f14658ga;

        /* renamed from: h */
        protected int f14659h;

        /* renamed from: ha */
        protected int f14660ha;

        /* renamed from: i */
        protected int f14661i;

        /* renamed from: ia */
        protected int f14662ia;

        /* renamed from: j */
        protected int f14663j;

        /* renamed from: ja */
        protected CharSequence f14664ja;

        /* renamed from: k */
        protected CharSequence f14665k;

        /* renamed from: ka */
        protected CharSequence f14666ka;

        /* renamed from: l */
        protected ArrayList<CharSequence> f14667l;

        /* renamed from: la */
        protected C5201d f14668la;

        /* renamed from: m */
        protected CharSequence f14669m;

        /* renamed from: ma */
        protected boolean f14670ma;

        /* renamed from: n */
        protected CharSequence f14671n;

        /* renamed from: na */
        protected int f14672na;

        /* renamed from: o */
        protected CharSequence f14673o;

        /* renamed from: oa */
        protected boolean f14674oa;

        /* renamed from: p */
        protected View f14675p;

        /* renamed from: pa */
        protected int f14676pa;

        /* renamed from: q */
        protected int f14677q;

        /* renamed from: qa */
        protected int f14678qa;

        /* renamed from: r */
        protected ColorStateList f14679r;

        /* renamed from: ra */
        protected int f14680ra;

        /* renamed from: s */
        protected ColorStateList f14681s;

        /* renamed from: sa */
        protected int[] f14682sa;

        /* renamed from: t */
        protected ColorStateList f14683t;

        /* renamed from: ta */
        protected CharSequence f14684ta;

        /* renamed from: u */
        protected ColorStateList f14685u;

        /* renamed from: ua */
        protected boolean f14686ua;

        /* renamed from: v */
        protected ColorStateList f14687v;

        /* renamed from: va */
        protected CompoundButton.OnCheckedChangeListener f14688va;

        /* renamed from: w */
        protected C5199b f14689w;

        /* renamed from: wa */
        protected String f14690wa;

        /* renamed from: x */
        protected C5207j f14691x;

        /* renamed from: xa */
        protected NumberFormat f14692xa;

        /* renamed from: y */
        protected C5207j f14693y;

        /* renamed from: ya */
        protected boolean f14694ya;

        /* renamed from: z */
        protected C5207j f14695z;

        /* renamed from: za */
        protected boolean f14696za;

        public C5198a(Context context) {
            C5192g gVar = C5192g.START;
            this.f14649c = gVar;
            this.f14651d = gVar;
            C5192g gVar2 = C5192g.START;
            this.f14655f = gVar2;
            this.f14657g = gVar2;
            this.f14659h = 0;
            this.f14661i = -1;
            this.f14663j = -1;
            this.f14617F = false;
            this.f14619G = false;
            this.f14621H = C5217v.LIGHT;
            this.f14623I = true;
            this.f14625J = true;
            this.f14627K = 1.2f;
            this.f14629L = -1;
            this.f14631M = null;
            this.f14632N = null;
            this.f14633O = true;
            this.f14638T = -1;
            this.f14660ha = -2;
            this.f14662ia = 0;
            this.f14672na = -1;
            this.f14676pa = -1;
            this.f14678qa = -1;
            this.f14680ra = 0;
            this.f14696za = false;
            this.f14608Aa = false;
            this.f14610Ba = false;
            this.f14612Ca = false;
            this.f14614Da = false;
            this.f14616Ea = false;
            this.f14618Fa = false;
            this.f14620Ga = false;
            this.f14645a = context;
            this.f14677q = C5182c.m20035a(context, C5208m.colorAccent, C5182c.m20046b(context, C5209n.md_material_blue_600));
            if (Build.VERSION.SDK_INT >= 21) {
                this.f14677q = C5182c.m20035a(context, 16843829, this.f14677q);
            }
            this.f14681s = C5182c.m20037a(context, this.f14677q);
            this.f14683t = C5182c.m20037a(context, this.f14677q);
            this.f14685u = C5182c.m20037a(context, this.f14677q);
            this.f14687v = C5182c.m20037a(context, C5182c.m20035a(context, C5208m.md_link_color, this.f14677q));
            this.f14659h = C5182c.m20035a(context, C5208m.md_btn_ripple_color, C5182c.m20035a(context, C5208m.colorControlHighlight, Build.VERSION.SDK_INT >= 21 ? C5182c.m20050d(context, 16843820) : 0));
            this.f14692xa = NumberFormat.getPercentInstance();
            this.f14690wa = "%1d/%2d";
            this.f14621H = C5182c.m20043a(C5182c.m20050d(context, 16842806)) ? C5217v.LIGHT : C5217v.DARK;
            m20091d();
            this.f14649c = C5182c.m20040a(context, C5208m.md_title_gravity, this.f14649c);
            this.f14651d = C5182c.m20040a(context, C5208m.md_content_gravity, this.f14651d);
            this.f14653e = C5182c.m20040a(context, C5208m.md_btnstacked_gravity, this.f14653e);
            this.f14655f = C5182c.m20040a(context, C5208m.md_items_gravity, this.f14655f);
            this.f14657g = C5182c.m20040a(context, C5208m.md_buttons_gravity, this.f14657g);
            mo14384a(C5182c.m20053g(context, C5208m.md_medium_font), C5182c.m20053g(context, C5208m.md_regular_font));
            if (this.f14635Q == null) {
                try {
                    this.f14635Q = Build.VERSION.SDK_INT >= 21 ? Typeface.create("sans-serif-medium", 0) : Typeface.create("sans-serif", 1);
                } catch (Exception unused) {
                }
            }
            if (this.f14634P == null) {
                try {
                    this.f14634P = Typeface.create("sans-serif", 0);
                } catch (Exception unused2) {
                }
            }
        }

        /* renamed from: d */
        private void m20091d() {
            if (C1161g.m5890a(false) != null) {
                C1161g a = C1161g.m5889a();
                if (a.f4257b) {
                    this.f14621H = C5217v.DARK;
                }
                int i = a.f4258c;
                if (i != 0) {
                    this.f14661i = i;
                }
                int i2 = a.f4259d;
                if (i2 != 0) {
                    this.f14663j = i2;
                }
                ColorStateList colorStateList = a.f4260e;
                if (colorStateList != null) {
                    this.f14681s = colorStateList;
                }
                ColorStateList colorStateList2 = a.f4261f;
                if (colorStateList2 != null) {
                    this.f14685u = colorStateList2;
                }
                ColorStateList colorStateList3 = a.f4262g;
                if (colorStateList3 != null) {
                    this.f14683t = colorStateList3;
                }
                int i3 = a.f4264i;
                if (i3 != 0) {
                    this.f14654ea = i3;
                }
                Drawable drawable = a.f4265j;
                if (drawable != null) {
                    this.f14636R = drawable;
                }
                int i4 = a.f4266k;
                if (i4 != 0) {
                    this.f14652da = i4;
                }
                int i5 = a.f4267l;
                if (i5 != 0) {
                    this.f14650ca = i5;
                }
                int i6 = a.f4270o;
                if (i6 != 0) {
                    this.f14624Ia = i6;
                }
                int i7 = a.f4269n;
                if (i7 != 0) {
                    this.f14622Ha = i7;
                }
                int i8 = a.f4271p;
                if (i8 != 0) {
                    this.f14626Ja = i8;
                }
                int i9 = a.f4272q;
                if (i9 != 0) {
                    this.f14628Ka = i9;
                }
                int i10 = a.f4273r;
                if (i10 != 0) {
                    this.f14630La = i10;
                }
                int i11 = a.f4263h;
                if (i11 != 0) {
                    this.f14677q = i11;
                }
                ColorStateList colorStateList4 = a.f4268m;
                if (colorStateList4 != null) {
                    this.f14687v = colorStateList4;
                }
                this.f14649c = a.f4274s;
                this.f14651d = a.f4275t;
                this.f14653e = a.f4276u;
                this.f14655f = a.f4277v;
                this.f14657g = a.f4278w;
            }
        }

        /* renamed from: a */
        public C5198a mo14378a(int i) {
            mo14380a(i, false);
            return this;
        }

        /* renamed from: a */
        public C5198a mo14379a(int i, C5204g gVar) {
            this.f14629L = i;
            this.f14609B = null;
            this.f14613D = gVar;
            this.f14615E = null;
            return this;
        }

        /* renamed from: a */
        public C5198a mo14380a(int i, boolean z) {
            CharSequence text = this.f14645a.getText(i);
            if (z) {
                text = Html.fromHtml(text.toString().replace("\n", "<br/>"));
            }
            mo14383a(text);
            return this;
        }

        /* renamed from: a */
        public C5198a mo14381a(ColorStateList colorStateList) {
            this.f14683t = colorStateList;
            this.f14616Ea = true;
            return this;
        }

        /* renamed from: a */
        public C5198a mo14382a(C5207j jVar) {
            this.f14693y = jVar;
            return this;
        }

        /* renamed from: a */
        public C5198a mo14383a(CharSequence charSequence) {
            if (this.f14675p == null) {
                this.f14665k = charSequence;
                return this;
            }
            throw new IllegalStateException("You cannot set content() when you're using a custom view.");
        }

        /* renamed from: a */
        public C5198a mo14384a(String str, String str2) {
            if (str != null) {
                this.f14635Q = C5184e.m20055a(this.f14645a, str);
                if (this.f14635Q == null) {
                    throw new IllegalArgumentException("No font asset found for " + str);
                }
            }
            if (str2 != null) {
                this.f14634P = C5184e.m20055a(this.f14645a, str2);
                if (this.f14634P == null) {
                    throw new IllegalArgumentException("No font asset found for " + str2);
                }
            }
            return this;
        }

        /* renamed from: a */
        public C5198a mo14385a(boolean z) {
            this.f14623I = z;
            this.f14625J = z;
            return this;
        }

        /* renamed from: a */
        public C5198a mo14386a(CharSequence... charSequenceArr) {
            if (this.f14675p == null) {
                this.f14667l = new ArrayList<>();
                Collections.addAll(this.f14667l, charSequenceArr);
                return this;
            }
            throw new IllegalStateException("You cannot set items() when you're using a custom view.");
        }

        /* renamed from: a */
        public C5197l mo14387a() {
            return new C5197l(this);
        }

        /* renamed from: b */
        public final Context mo14388b() {
            return this.f14645a;
        }

        /* renamed from: b */
        public C5198a mo14389b(int i) {
            mo14386a(this.f14645a.getResources().getTextArray(i));
            return this;
        }

        /* renamed from: b */
        public C5198a mo14390b(ColorStateList colorStateList) {
            this.f14681s = colorStateList;
            this.f14612Ca = true;
            return this;
        }

        /* renamed from: b */
        public C5198a mo14391b(C5207j jVar) {
            this.f14691x = jVar;
            return this;
        }

        /* renamed from: b */
        public C5198a mo14392b(CharSequence charSequence) {
            this.f14673o = charSequence;
            return this;
        }

        /* renamed from: c */
        public C5198a mo14393c(int i) {
            mo14381a(C5182c.m20037a(this.f14645a, i));
            return this;
        }

        /* renamed from: c */
        public C5198a mo14394c(CharSequence charSequence) {
            this.f14669m = charSequence;
            return this;
        }

        /* renamed from: c */
        public C5197l mo14395c() {
            C5197l a = mo14387a();
            a.show();
            return a;
        }

        /* renamed from: d */
        public C5198a mo14396d(int i) {
            if (i == 0) {
                return this;
            }
            mo14392b(this.f14645a.getText(i));
            return this;
        }

        /* renamed from: d */
        public C5198a mo14397d(CharSequence charSequence) {
            this.f14647b = charSequence;
            return this;
        }

        /* renamed from: e */
        public C5198a mo14398e(int i) {
            mo14390b(C5182c.m20037a(this.f14645a, i));
            return this;
        }

        /* renamed from: f */
        public C5198a mo14399f(int i) {
            if (i == 0) {
                return this;
            }
            mo14394c(this.f14645a.getText(i));
            return this;
        }

        /* renamed from: g */
        public C5198a mo14400g(int i) {
            mo14397d(this.f14645a.getText(i));
            return this;
        }
    }

    @Deprecated
    /* renamed from: d.c.a.l$b */
    public static abstract class C5199b {
        @Deprecated
        /* renamed from: a */
        public abstract void mo14401a(C5197l lVar);

        @Deprecated
        /* renamed from: b */
        public abstract void mo14402b(C5197l lVar);

        @Deprecated
        /* renamed from: c */
        public abstract void mo14403c(C5197l lVar);

        @Deprecated
        /* renamed from: d */
        public abstract void mo14404d(C5197l lVar);
    }

    /* renamed from: d.c.a.l$c */
    private static class C5200c extends WindowManager.BadTokenException {
        C5200c(String str) {
            super(str);
        }
    }

    /* renamed from: d.c.a.l$d */
    public interface C5201d {
        /* renamed from: a */
        void mo14405a(C5197l lVar, CharSequence charSequence);
    }

    /* renamed from: d.c.a.l$e */
    public interface C5202e {
        /* renamed from: a */
        void mo14406a(C5197l lVar, View view, int i, CharSequence charSequence);
    }

    /* renamed from: d.c.a.l$f */
    public interface C5203f {
        /* renamed from: a */
        boolean mo14407a(C5197l lVar, Integer[] numArr, CharSequence[] charSequenceArr);
    }

    /* renamed from: d.c.a.l$g */
    public interface C5204g {
        /* renamed from: a */
        boolean mo12829a(C5197l lVar, View view, int i, CharSequence charSequence);
    }

    /* renamed from: d.c.a.l$h */
    public interface C5205h {
        /* renamed from: a */
        boolean mo14408a(C5197l lVar, View view, int i, CharSequence charSequence);
    }

    /* renamed from: d.c.a.l$i */
    enum C5206i {
        REGULAR,
        SINGLE,
        MULTI;

        /* renamed from: a */
        public static int m20124a(C5206i iVar) {
            int i = C5196k.f14587b[iVar.ordinal()];
            if (i == 1) {
                return C5213r.md_listitem;
            }
            if (i == 2) {
                return C5213r.md_listitem_singlechoice;
            }
            if (i == 3) {
                return C5213r.md_listitem_multichoice;
            }
            throw new IllegalArgumentException("Not a valid list type");
        }
    }

    /* renamed from: d.c.a.l$j */
    public interface C5207j {
        /* renamed from: a */
        void mo12584a(C5197l lVar, C5188c cVar);
    }

    @SuppressLint({"InflateParams"})
    protected C5197l(C5198a aVar) {
        super(aVar.f14645a, C5190e.m20072b(aVar));
        this.f14601p = aVar;
        this.f14574a = (MDRootLayout) LayoutInflater.from(aVar.f14645a).inflate(C5190e.m20069a(aVar), (ViewGroup) null);
        C5190e.m20071a(this);
    }

    /* renamed from: b */
    private boolean m20077b(View view) {
        C5198a aVar = this.f14601p;
        if (aVar.f14613D == null) {
            return false;
        }
        CharSequence charSequence = null;
        int i = aVar.f14629L;
        if (i >= 0 && i < aVar.f14667l.size()) {
            C5198a aVar2 = this.f14601p;
            charSequence = aVar2.f14667l.get(aVar2.f14629L);
        }
        C5198a aVar3 = this.f14601p;
        return aVar3.f14613D.mo12829a(this, view, aVar3.f14629L, charSequence);
    }

    /* renamed from: i */
    private boolean m20078i() {
        if (this.f14601p.f14615E == null) {
            return false;
        }
        Collections.sort(this.f14600o);
        ArrayList arrayList = new ArrayList();
        for (Integer next : this.f14600o) {
            if (next.intValue() >= 0 && next.intValue() <= this.f14601p.f14667l.size() - 1) {
                arrayList.add(this.f14601p.f14667l.get(next.intValue()));
            }
        }
        C5203f fVar = this.f14601p.f14615E;
        List<Integer> list = this.f14600o;
        return fVar.mo14407a(this, (Integer[]) list.toArray(new Integer[list.size()]), (CharSequence[]) arrayList.toArray(new CharSequence[arrayList.size()]));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Drawable mo14362a(C5188c cVar, boolean z) {
        if (z) {
            C5198a aVar = this.f14601p;
            if (aVar.f14624Ia != 0) {
                return C1014d.m5413a(aVar.f14645a.getResources(), this.f14601p.f14624Ia, (Resources.Theme) null);
            }
            Drawable f = C5182c.m20052f(aVar.f14645a, C5208m.md_btn_stacked_selector);
            return f != null ? f : C5182c.m20052f(getContext(), C5208m.md_btn_stacked_selector);
        }
        int i = C5196k.f14586a[cVar.ordinal()];
        if (i == 1) {
            C5198a aVar2 = this.f14601p;
            if (aVar2.f14628Ka != 0) {
                return C1014d.m5413a(aVar2.f14645a.getResources(), this.f14601p.f14628Ka, (Resources.Theme) null);
            }
            Drawable f2 = C5182c.m20052f(aVar2.f14645a, C5208m.md_btn_neutral_selector);
            if (f2 != null) {
                return f2;
            }
            Drawable f3 = C5182c.m20052f(getContext(), C5208m.md_btn_neutral_selector);
            if (Build.VERSION.SDK_INT >= 21) {
                C5183d.m20054a(f3, this.f14601p.f14659h);
            }
            return f3;
        } else if (i != 2) {
            C5198a aVar3 = this.f14601p;
            if (aVar3.f14626Ja != 0) {
                return C1014d.m5413a(aVar3.f14645a.getResources(), this.f14601p.f14626Ja, (Resources.Theme) null);
            }
            Drawable f4 = C5182c.m20052f(aVar3.f14645a, C5208m.md_btn_positive_selector);
            if (f4 != null) {
                return f4;
            }
            Drawable f5 = C5182c.m20052f(getContext(), C5208m.md_btn_positive_selector);
            if (Build.VERSION.SDK_INT >= 21) {
                C5183d.m20054a(f5, this.f14601p.f14659h);
            }
            return f5;
        } else {
            C5198a aVar4 = this.f14601p;
            if (aVar4.f14630La != 0) {
                return C1014d.m5413a(aVar4.f14645a.getResources(), this.f14601p.f14630La, (Resources.Theme) null);
            }
            Drawable f6 = C5182c.m20052f(aVar4.f14645a, C5208m.md_btn_negative_selector);
            if (f6 != null) {
                return f6;
            }
            Drawable f7 = C5182c.m20052f(getContext(), C5208m.md_btn_negative_selector);
            if (Build.VERSION.SDK_INT >= 21) {
                C5183d.m20054a(f7, this.f14601p.f14659h);
            }
            return f7;
        }
    }

    /* renamed from: a */
    public final MDButton mo14363a(C5188c cVar) {
        int i = C5196k.f14586a[cVar.ordinal()];
        return i != 1 ? i != 2 ? this.f14596k : this.f14598m : this.f14597l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14364a(int i, boolean z) {
        int i2;
        TextView textView = this.f14594i;
        if (textView != null) {
            boolean z2 = false;
            if (this.f14601p.f14678qa > 0) {
                textView.setText(String.format(Locale.getDefault(), "%d/%d", new Object[]{Integer.valueOf(i), Integer.valueOf(this.f14601p.f14678qa)}));
                this.f14594i.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            if ((z && i == 0) || (((i2 = this.f14601p.f14678qa) > 0 && i > i2) || i < this.f14601p.f14676pa)) {
                z2 = true;
            }
            int i3 = z2 ? this.f14601p.f14680ra : this.f14601p.f14663j;
            int i4 = z2 ? this.f14601p.f14680ra : this.f14601p.f14677q;
            if (this.f14601p.f14678qa > 0) {
                this.f14594i.setTextColor(i3);
            }
            C1160f.m5883a(this.f14605t, i4);
            mo14363a(C5188c.POSITIVE).setEnabled(!z2);
        }
    }

    /* renamed from: a */
    public final void mo14365a(TextView textView, Typeface typeface) {
        if (typeface != null) {
            textView.setPaintFlags(textView.getPaintFlags() | 128);
            textView.setTypeface(typeface);
        }
    }

    /* renamed from: a */
    public boolean mo14346a(C5197l lVar, View view, int i, CharSequence charSequence, boolean z) {
        C5198a aVar;
        C5205h hVar;
        C5198a aVar2;
        C5202e eVar;
        boolean z2 = false;
        if (!view.isEnabled()) {
            return false;
        }
        C5206i iVar = this.f14599n;
        if (iVar == null || iVar == C5206i.REGULAR) {
            if (this.f14601p.f14633O) {
                dismiss();
            }
            if (!z && (eVar = aVar2.f14609B) != null) {
                eVar.mo14406a(this, view, i, (aVar2 = this.f14601p).f14667l.get(i));
            }
            if (z && (hVar = aVar.f14611C) != null) {
                return hVar.mo14408a(this, view, i, (aVar = this.f14601p).f14667l.get(i));
            }
        } else if (iVar == C5206i.MULTI) {
            CheckBox checkBox = (CheckBox) view.findViewById(C5212q.md_control);
            if (!checkBox.isEnabled()) {
                return false;
            }
            if (!this.f14600o.contains(Integer.valueOf(i))) {
                this.f14600o.add(Integer.valueOf(i));
                if (!this.f14601p.f14617F || m20078i()) {
                    checkBox.setChecked(true);
                } else {
                    this.f14600o.remove(Integer.valueOf(i));
                }
            } else {
                this.f14600o.remove(Integer.valueOf(i));
                if (!this.f14601p.f14617F || m20078i()) {
                    checkBox.setChecked(false);
                } else {
                    this.f14600o.add(Integer.valueOf(i));
                }
            }
        } else if (iVar == C5206i.SINGLE) {
            RadioButton radioButton = (RadioButton) view.findViewById(C5212q.md_control);
            if (!radioButton.isEnabled()) {
                return false;
            }
            C5198a aVar3 = this.f14601p;
            int i2 = aVar3.f14629L;
            if (!aVar3.f14633O || aVar3.f14669m != null) {
                C5198a aVar4 = this.f14601p;
                if (aVar4.f14619G) {
                    aVar4.f14629L = i;
                    z2 = m20077b(view);
                    this.f14601p.f14629L = i2;
                } else {
                    z2 = true;
                }
            } else {
                dismiss();
                this.f14601p.f14629L = i;
                m20077b(view);
            }
            if (z2) {
                this.f14601p.f14629L = i;
                radioButton.setChecked(true);
                this.f14601p.f14639U.mo3799c(i2);
                this.f14601p.f14639U.mo3799c(i);
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo14366b() {
        RecyclerView recyclerView = this.f14588c;
        if (recyclerView != null) {
            recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new C5194i(this));
        }
    }

    /* renamed from: c */
    public final C5198a mo14367c() {
        return this.f14601p;
    }

    /* renamed from: d */
    public final EditText mo14368d() {
        return this.f14605t;
    }

    public void dismiss() {
        if (this.f14605t != null) {
            C5182c.m20041a((DialogInterface) this, this.f14601p);
        }
        super.dismiss();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final Drawable mo14370e() {
        C5198a aVar = this.f14601p;
        if (aVar.f14622Ha != 0) {
            return C1014d.m5413a(aVar.f14645a.getResources(), this.f14601p.f14622Ha, (Resources.Theme) null);
        }
        Drawable f = C5182c.m20052f(aVar.f14645a, C5208m.md_list_selector);
        return f != null ? f : C5182c.m20052f(getContext(), C5208m.md_list_selector);
    }

    /* renamed from: f */
    public final View mo14371f() {
        return this.f14574a;
    }

    public /* bridge */ /* synthetic */ View findViewById(int i) {
        return super.findViewById(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo14372g() {
        if (this.f14588c != null) {
            ArrayList<CharSequence> arrayList = this.f14601p.f14667l;
            if ((arrayList != null && arrayList.size() != 0) || this.f14601p.f14639U != null) {
                C5198a aVar = this.f14601p;
                if (aVar.f14640V == null) {
                    aVar.f14640V = new LinearLayoutManager(getContext());
                }
                this.f14588c.setLayoutManager(this.f14601p.f14640V);
                this.f14588c.setAdapter(this.f14601p.f14639U);
                if (this.f14599n != null) {
                    ((C5185b) this.f14601p.f14639U).mo14343a((C5185b.C5187b) this);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo14373h() {
        EditText editText = this.f14605t;
        if (editText != null) {
            editText.addTextChangedListener(new C5195j(this));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005d, code lost:
        if (r3.f14601p.f14633O != false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a0, code lost:
        if (r3.f14601p.f14633O != false) goto L_0x00a2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r4.getTag()
            d.c.a.c r0 = (p101d.p108c.p109a.C5188c) r0
            int[] r1 = p101d.p108c.p109a.C5196k.f14586a
            int r2 = r0.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L_0x0083
            r2 = 2
            if (r1 == r2) goto L_0x0060
            r2 = 3
            if (r1 == r2) goto L_0x0019
            goto L_0x00a5
        L_0x0019:
            d.c.a.l$a r1 = r3.f14601p
            d.c.a.l$b r1 = r1.f14689w
            if (r1 == 0) goto L_0x0029
            r1.mo14401a(r3)
            d.c.a.l$a r1 = r3.f14601p
            d.c.a.l$b r1 = r1.f14689w
            r1.mo14404d(r3)
        L_0x0029:
            d.c.a.l$a r1 = r3.f14601p
            d.c.a.l$j r1 = r1.f14691x
            if (r1 == 0) goto L_0x0032
            r1.mo12584a(r3, r0)
        L_0x0032:
            d.c.a.l$a r1 = r3.f14601p
            boolean r1 = r1.f14619G
            if (r1 != 0) goto L_0x003b
            r3.m20077b(r4)
        L_0x003b:
            d.c.a.l$a r4 = r3.f14601p
            boolean r4 = r4.f14617F
            if (r4 != 0) goto L_0x0044
            r3.m20078i()
        L_0x0044:
            d.c.a.l$a r4 = r3.f14601p
            d.c.a.l$d r1 = r4.f14668la
            if (r1 == 0) goto L_0x0059
            android.widget.EditText r2 = r3.f14605t
            if (r2 == 0) goto L_0x0059
            boolean r4 = r4.f14674oa
            if (r4 != 0) goto L_0x0059
            android.text.Editable r4 = r2.getText()
            r1.mo14405a(r3, r4)
        L_0x0059:
            d.c.a.l$a r4 = r3.f14601p
            boolean r4 = r4.f14633O
            if (r4 == 0) goto L_0x00a5
            goto L_0x00a2
        L_0x0060:
            d.c.a.l$a r4 = r3.f14601p
            d.c.a.l$b r4 = r4.f14689w
            if (r4 == 0) goto L_0x0070
            r4.mo14401a(r3)
            d.c.a.l$a r4 = r3.f14601p
            d.c.a.l$b r4 = r4.f14689w
            r4.mo14402b(r3)
        L_0x0070:
            d.c.a.l$a r4 = r3.f14601p
            d.c.a.l$j r4 = r4.f14693y
            if (r4 == 0) goto L_0x0079
            r4.mo12584a(r3, r0)
        L_0x0079:
            d.c.a.l$a r4 = r3.f14601p
            boolean r4 = r4.f14633O
            if (r4 == 0) goto L_0x00a5
            r3.cancel()
            goto L_0x00a5
        L_0x0083:
            d.c.a.l$a r4 = r3.f14601p
            d.c.a.l$b r4 = r4.f14689w
            if (r4 == 0) goto L_0x0093
            r4.mo14401a(r3)
            d.c.a.l$a r4 = r3.f14601p
            d.c.a.l$b r4 = r4.f14689w
            r4.mo14403c(r3)
        L_0x0093:
            d.c.a.l$a r4 = r3.f14601p
            d.c.a.l$j r4 = r4.f14695z
            if (r4 == 0) goto L_0x009c
            r4.mo12584a(r3, r0)
        L_0x009c:
            d.c.a.l$a r4 = r3.f14601p
            boolean r4 = r4.f14633O
            if (r4 == 0) goto L_0x00a5
        L_0x00a2:
            r3.dismiss()
        L_0x00a5:
            d.c.a.l$a r4 = r3.f14601p
            d.c.a.l$j r4 = r4.f14607A
            if (r4 == 0) goto L_0x00ae
            r4.mo12584a(r3, r0)
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p108c.p109a.C5197l.onClick(android.view.View):void");
    }

    public final void onShow(DialogInterface dialogInterface) {
        if (this.f14605t != null) {
            C5182c.m20048b((DialogInterface) this, this.f14601p);
            if (this.f14605t.getText().length() > 0) {
                EditText editText = this.f14605t;
                editText.setSelection(editText.getText().length());
            }
        }
        super.onShow(dialogInterface);
    }

    @Deprecated
    public /* bridge */ /* synthetic */ void setContentView(int i) {
        super.setContentView(i);
        throw null;
    }

    @Deprecated
    public /* bridge */ /* synthetic */ void setContentView(View view) {
        super.setContentView(view);
        throw null;
    }

    @Deprecated
    public /* bridge */ /* synthetic */ void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        throw null;
    }

    public final void setTitle(int i) {
        setTitle((CharSequence) this.f14601p.f14645a.getString(i));
    }

    public final void setTitle(CharSequence charSequence) {
        this.f14603r.setText(charSequence);
    }

    public void show() {
        try {
            super.show();
        } catch (WindowManager.BadTokenException unused) {
            throw new C5200c("Bad window token, you cannot show a dialog before an Activity is created or after it's hidden.");
        }
    }
}
