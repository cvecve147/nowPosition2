package p013b.p018b.p040i.p050h;

import android.content.Context;
import android.support.p011v7.view.menu.C0662l;
import android.support.p011v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;
import p013b.p018b.p040i.p050h.C1136b;

/* renamed from: b.b.i.h.e */
public class C1140e extends C1136b implements C0662l.C0663a {

    /* renamed from: c */
    private Context f4137c;

    /* renamed from: d */
    private ActionBarContextView f4138d;

    /* renamed from: e */
    private C1136b.C1137a f4139e;

    /* renamed from: f */
    private WeakReference<View> f4140f;

    /* renamed from: g */
    private boolean f4141g;

    /* renamed from: h */
    private boolean f4142h;

    /* renamed from: i */
    private C0662l f4143i;

    public C1140e(Context context, ActionBarContextView actionBarContextView, C1136b.C1137a aVar, boolean z) {
        this.f4137c = context;
        this.f4138d = actionBarContextView;
        this.f4139e = aVar;
        C0662l lVar = new C0662l(actionBarContextView.getContext());
        lVar.mo2875c(1);
        this.f4143i = lVar;
        this.f4143i.mo2708a((C0662l.C0663a) this);
        this.f4142h = z;
    }

    /* renamed from: a */
    public void mo2561a() {
        if (!this.f4141g) {
            this.f4141g = true;
            this.f4138d.sendAccessibilityEvent(32);
            this.f4139e.mo2486a(this);
        }
    }

    /* renamed from: a */
    public void mo2562a(int i) {
        mo2564a((CharSequence) this.f4137c.getString(i));
    }

    /* renamed from: a */
    public void mo362a(C0662l lVar) {
        mo2573i();
        this.f4138d.mo3112d();
    }

    /* renamed from: a */
    public void mo2563a(View view) {
        this.f4138d.setCustomView(view);
        this.f4140f = view != null ? new WeakReference<>(view) : null;
    }

    /* renamed from: a */
    public void mo2564a(CharSequence charSequence) {
        this.f4138d.setSubtitle(charSequence);
    }

    /* renamed from: a */
    public void mo2565a(boolean z) {
        super.mo2565a(z);
        this.f4138d.setTitleOptional(z);
    }

    /* renamed from: a */
    public boolean mo363a(C0662l lVar, MenuItem menuItem) {
        return this.f4139e.mo2488a((C1136b) this, menuItem);
    }

    /* renamed from: b */
    public View mo2566b() {
        WeakReference<View> weakReference = this.f4140f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* renamed from: b */
    public void mo2567b(int i) {
        mo2568b((CharSequence) this.f4137c.getString(i));
    }

    /* renamed from: b */
    public void mo2568b(CharSequence charSequence) {
        this.f4138d.setTitle(charSequence);
    }

    /* renamed from: c */
    public Menu mo2569c() {
        return this.f4143i;
    }

    /* renamed from: d */
    public MenuInflater mo2570d() {
        return new C1143g(this.f4138d.getContext());
    }

    /* renamed from: e */
    public CharSequence mo2571e() {
        return this.f4138d.getSubtitle();
    }

    /* renamed from: g */
    public CharSequence mo2572g() {
        return this.f4138d.getTitle();
    }

    /* renamed from: i */
    public void mo2573i() {
        this.f4139e.mo2489b(this, this.f4143i);
    }

    /* renamed from: j */
    public boolean mo2574j() {
        return this.f4138d.mo3110b();
    }
}
