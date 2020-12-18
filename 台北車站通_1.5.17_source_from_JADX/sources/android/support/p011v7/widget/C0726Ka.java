package android.support.p011v7.widget;

import android.os.Bundle;
import android.support.p007v4.view.C0459c;
import android.support.p007v4.view.p009a.C0446b;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v7.widget.Ka */
public class C0726Ka extends C0459c {

    /* renamed from: d */
    final RecyclerView f2820d;

    /* renamed from: e */
    final C0459c f2821e = new C0727a(this);

    /* renamed from: android.support.v7.widget.Ka$a */
    public static class C0727a extends C0459c {

        /* renamed from: d */
        final C0726Ka f2822d;

        public C0727a(C0726Ka ka) {
            this.f2822d = ka;
        }

        /* renamed from: a */
        public void mo309a(View view, C0446b bVar) {
            super.mo309a(view, bVar);
            if (!this.f2822d.mo3446c() && this.f2822d.f2820d.getLayoutManager() != null) {
                this.f2822d.f2820d.getLayoutManager().mo3867a(view, bVar);
            }
        }

        /* renamed from: a */
        public boolean mo1844a(View view, int i, Bundle bundle) {
            if (super.mo1844a(view, i, bundle)) {
                return true;
            }
            if (this.f2822d.mo3446c() || this.f2822d.f2820d.getLayoutManager() == null) {
                return false;
            }
            return this.f2822d.f2820d.getLayoutManager().mo3879a(view, i, bundle);
        }
    }

    public C0726Ka(RecyclerView recyclerView) {
        this.f2820d = recyclerView;
    }

    /* renamed from: a */
    public void mo309a(View view, C0446b bVar) {
        super.mo309a(view, bVar);
        bVar.mo1857a((CharSequence) RecyclerView.class.getName());
        if (!mo3446c() && this.f2820d.getLayoutManager() != null) {
            this.f2820d.getLayoutManager().mo3853a(bVar);
        }
    }

    /* renamed from: a */
    public boolean mo1844a(View view, int i, Bundle bundle) {
        if (super.mo1844a(view, i, bundle)) {
            return true;
        }
        if (mo3446c() || this.f2820d.getLayoutManager() == null) {
            return false;
        }
        return this.f2820d.getLayoutManager().mo3870a(i, bundle);
    }

    /* renamed from: b */
    public C0459c mo3445b() {
        return this.f2821e;
    }

    /* renamed from: b */
    public void mo832b(View view, AccessibilityEvent accessibilityEvent) {
        super.mo832b(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if ((view instanceof RecyclerView) && !mo3446c()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().mo3506a(accessibilityEvent);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo3446c() {
        return this.f2820d.mo3727k();
    }
}
