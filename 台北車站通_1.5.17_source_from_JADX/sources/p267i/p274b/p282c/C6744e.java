package p267i.p274b.p282c;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.p007v4.app.C0339l;
import android.support.p011v7.app.C0607a;
import android.support.p011v7.app.C0623m;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import java.util.List;
import p013b.p018b.p028h.p029a.C1006a;
import p013b.p018b.p040i.p041a.C1103a;

/* renamed from: i.b.c.e */
public class C6744e extends C0623m {

    /* renamed from: a */
    private C6739a f18746a = null;

    /* renamed from: b */
    protected C6747h f18747b = null;

    /* renamed from: c */
    protected C6749j f18748c = null;

    /* renamed from: d */
    private View f18749d;

    /* renamed from: e */
    private TextView f18750e;

    /* renamed from: f */
    private View f18751f;

    /* renamed from: g */
    private View f18752g;

    /* renamed from: h */
    protected View.OnClickListener f18753h;

    /* renamed from: i */
    protected View.OnClickListener f18754i;

    /* renamed from: a */
    public void mo17229a(View.OnClickListener onClickListener) {
        this.f18753h = onClickListener;
    }

    /* renamed from: a */
    public void mo17230a(View view, int i, int i2, int i3) {
        this.f18749d = view;
        if (i != -1) {
            this.f18750e = (TextView) view.findViewById(i);
        }
        if (i2 != -1) {
            this.f18751f = view.findViewById(i2);
            this.f18751f.setOnClickListener(new C6742c(this));
        }
        if (i3 != -1) {
            this.f18752g = view.findViewById(i3);
            this.f18752g.setOnClickListener(new C6743d(this));
        }
    }

    /* renamed from: a */
    public void mo17231a(C6749j jVar) {
        this.f18748c = jVar;
    }

    /* renamed from: a */
    public void mo17232a(String str) {
        TextView textView = this.f18750e;
        if (textView != null) {
            textView.setText(str);
        }
    }

    /* renamed from: a */
    public void mo17233a(boolean z, int i) {
        View findViewById = findViewById(i);
        if (findViewById != null) {
            int n = Build.VERSION.SDK_INT >= 19 ? mo17240n() : 0;
            TypedValue typedValue = new TypedValue();
            getTheme().resolveAttribute(C1103a.actionBarSize, typedValue, true);
            int complexToDimensionPixelSize = n + TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
            if (!z) {
                complexToDimensionPixelSize = 0;
            }
            findViewById.setPadding(0, complexToDimensionPixelSize, 0, 0);
        }
    }

    /* renamed from: b */
    public void mo17234b(View.OnClickListener onClickListener) {
        this.f18754i = onClickListener;
    }

    /* renamed from: b */
    public void mo17235b(String str) {
        C6739a aVar = this.f18746a;
        if (aVar == null || !aVar.isShowing()) {
            this.f18746a = new C6739a(this);
            if (str == null) {
                this.f18746a.show();
            } else {
                this.f18746a.mo17222a(str);
            }
        }
    }

    /* renamed from: b */
    public void mo17236b(boolean z) {
        if (z) {
            getWindow().addFlags(67108864);
        } else {
            getWindow().clearFlags(67108864);
        }
    }

    /* renamed from: d */
    public void mo17237d(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(Integer.MIN_VALUE);
            getWindow().setStatusBarColor(C1006a.m5386a((Context) this, i));
        }
    }

    /* renamed from: e */
    public void mo17238e(int i) {
        TextView textView = this.f18750e;
        if (textView != null) {
            textView.setText(i);
        }
    }

    /* renamed from: m */
    public void mo17239m() {
        C6739a aVar = this.f18746a;
        if (aVar != null && aVar.isShowing()) {
            this.f18746a.dismiss();
            this.f18746a = null;
        }
    }

    /* renamed from: n */
    public int mo17240n() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: o */
    public View mo17241o() {
        return this.f18749d;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public void onDestroy() {
        this.f18747b = null;
        this.f18748c = null;
        this.f18749d = null;
        this.f18750e = null;
        this.f18751f = null;
        this.f18752g = null;
        this.f18753h = null;
        this.f18754i = null;
        super.onDestroy();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        List<C0339l> d = mo1430d().mo1500d();
        if (d != null) {
            for (C0339l next : d) {
                if (next != null) {
                    next.mo1345a(i, strArr, iArr);
                }
            }
        }
    }

    /* renamed from: p */
    public void mo17242p() {
        C0607a j = mo2624j();
        if (j != null && j.mo2534k()) {
            j.mo2532i();
        }
    }

    /* renamed from: q */
    public void mo17243q() {
        mo17235b((String) null);
    }
}
