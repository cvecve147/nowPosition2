package p101d.p108c.p109a;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p011v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.afollestad.materialdialogs.internal.C1160f;
import java.util.ArrayList;
import p101d.p108c.p109a.C5197l;
import p101d.p108c.p109a.p110a.C5182c;

/* renamed from: d.c.a.b */
class C5185b extends RecyclerView.C0748a<C5186a> {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C5197l f14563c;

    /* renamed from: d */
    private final int f14564d;

    /* renamed from: e */
    private final C5192g f14565e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C5187b f14566f;

    /* renamed from: d.c.a.b$a */
    static class C5186a extends RecyclerView.C0778w implements View.OnClickListener, View.OnLongClickListener {

        /* renamed from: t */
        final CompoundButton f14567t;

        /* renamed from: u */
        final TextView f14568u;

        /* renamed from: v */
        final C5185b f14569v;

        C5186a(View view, C5185b bVar) {
            super(view);
            this.f14567t = (CompoundButton) view.findViewById(C5212q.md_control);
            this.f14568u = (TextView) view.findViewById(C5212q.md_title);
            this.f14569v = bVar;
            view.setOnClickListener(this);
            if (bVar.f14563c.f14601p.f14611C != null) {
                view.setOnLongClickListener(this);
            }
        }

        public void onClick(View view) {
            if (this.f14569v.f14566f != null && mo4038e() != -1) {
                CharSequence charSequence = null;
                if (this.f14569v.f14563c.f14601p.f14667l != null && mo4038e() < this.f14569v.f14563c.f14601p.f14667l.size()) {
                    charSequence = this.f14569v.f14563c.f14601p.f14667l.get(mo4038e());
                }
                View view2 = view;
                this.f14569v.f14566f.mo14346a(this.f14569v.f14563c, view2, mo4038e(), charSequence, false);
            }
        }

        public boolean onLongClick(View view) {
            if (this.f14569v.f14566f == null || mo4038e() == -1) {
                return false;
            }
            CharSequence charSequence = null;
            if (this.f14569v.f14563c.f14601p.f14667l != null && mo4038e() < this.f14569v.f14563c.f14601p.f14667l.size()) {
                charSequence = this.f14569v.f14563c.f14601p.f14667l.get(mo4038e());
            }
            return this.f14569v.f14566f.mo14346a(this.f14569v.f14563c, view, mo4038e(), charSequence, true);
        }
    }

    /* renamed from: d.c.a.b$b */
    interface C5187b {
        /* renamed from: a */
        boolean mo14346a(C5197l lVar, View view, int i, CharSequence charSequence, boolean z);
    }

    C5185b(C5197l lVar, int i) {
        this.f14563c = lVar;
        this.f14564d = i;
        this.f14565e = lVar.f14601p.f14655f;
    }

    @TargetApi(17)
    /* renamed from: a */
    private void m20057a(ViewGroup viewGroup) {
        ((LinearLayout) viewGroup).setGravity(this.f14565e.mo14355a() | 16);
        if (viewGroup.getChildCount() != 2) {
            return;
        }
        if (this.f14565e == C5192g.END && !m20059d() && (viewGroup.getChildAt(0) instanceof CompoundButton)) {
            CompoundButton compoundButton = (CompoundButton) viewGroup.getChildAt(0);
            viewGroup.removeView(compoundButton);
            TextView textView = (TextView) viewGroup.getChildAt(0);
            viewGroup.removeView(textView);
            textView.setPadding(textView.getPaddingRight(), textView.getPaddingTop(), textView.getPaddingLeft(), textView.getPaddingBottom());
            viewGroup.addView(textView);
            viewGroup.addView(compoundButton);
        } else if (this.f14565e == C5192g.START && m20059d() && (viewGroup.getChildAt(1) instanceof CompoundButton)) {
            CompoundButton compoundButton2 = (CompoundButton) viewGroup.getChildAt(1);
            viewGroup.removeView(compoundButton2);
            TextView textView2 = (TextView) viewGroup.getChildAt(0);
            viewGroup.removeView(textView2);
            textView2.setPadding(textView2.getPaddingRight(), textView2.getPaddingTop(), textView2.getPaddingRight(), textView2.getPaddingBottom());
            viewGroup.addView(compoundButton2);
            viewGroup.addView(textView2);
        }
    }

    @TargetApi(17)
    /* renamed from: d */
    private boolean m20059d() {
        return Build.VERSION.SDK_INT >= 17 && this.f14563c.mo14367c().mo14388b().getResources().getConfiguration().getLayoutDirection() == 1;
    }

    /* renamed from: a */
    public int mo337a() {
        ArrayList<CharSequence> arrayList = this.f14563c.f14601p.f14667l;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: a */
    public void mo346b(C5186a aVar, int i) {
        View childAt;
        View view = aVar.f3093b;
        boolean a = C5182c.m20045a(Integer.valueOf(i), (T[]) this.f14563c.f14601p.f14632N);
        int i2 = C5179a.f14558a[this.f14563c.f14599n.ordinal()];
        if (i2 == 1) {
            RadioButton radioButton = (RadioButton) aVar.f14567t;
            boolean z = this.f14563c.f14601p.f14629L == i;
            C5197l.C5198a aVar2 = this.f14563c.f14601p;
            ColorStateList colorStateList = aVar2.f14679r;
            if (colorStateList != null) {
                C1160f.m5887a(radioButton, colorStateList);
            } else {
                C1160f.m5886a(radioButton, aVar2.f14677q);
            }
            radioButton.setChecked(z);
            radioButton.setEnabled(!a);
        } else if (i2 == 2) {
            CheckBox checkBox = (CheckBox) aVar.f14567t;
            boolean contains = this.f14563c.f14600o.contains(Integer.valueOf(i));
            C5197l.C5198a aVar3 = this.f14563c.f14601p;
            ColorStateList colorStateList2 = aVar3.f14679r;
            if (colorStateList2 != null) {
                C1160f.m5882a(checkBox, colorStateList2);
            } else {
                C1160f.m5881a(checkBox, aVar3.f14677q);
            }
            checkBox.setChecked(contains);
            checkBox.setEnabled(!a);
        }
        aVar.f14568u.setText(this.f14563c.f14601p.f14667l.get(i));
        aVar.f14568u.setTextColor(this.f14563c.f14601p.f14654ea);
        C5197l lVar = this.f14563c;
        lVar.mo14365a(aVar.f14568u, lVar.f14601p.f14634P);
        ViewGroup viewGroup = (ViewGroup) view;
        m20057a(viewGroup);
        int[] iArr = this.f14563c.f14601p.f14682sa;
        if (iArr != null) {
            view.setId(i < iArr.length ? iArr[i] : -1);
        }
        if (Build.VERSION.SDK_INT >= 21 && viewGroup.getChildCount() == 2) {
            if (viewGroup.getChildAt(0) instanceof CompoundButton) {
                childAt = viewGroup.getChildAt(0);
            } else if (viewGroup.getChildAt(1) instanceof CompoundButton) {
                childAt = viewGroup.getChildAt(1);
            } else {
                return;
            }
            childAt.setBackground((Drawable) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14343a(C5187b bVar) {
        this.f14566f = bVar;
    }

    /* renamed from: b */
    public C5186a m20064b(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f14564d, viewGroup, false);
        C5182c.m20042a(inflate, this.f14563c.mo14370e());
        return new C5186a(inflate, this);
    }
}
