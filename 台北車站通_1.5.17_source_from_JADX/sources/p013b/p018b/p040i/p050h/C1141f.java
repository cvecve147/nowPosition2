package p013b.p018b.p040i.p050h;

import android.content.Context;
import android.support.p011v7.view.menu.C0683x;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import p013b.p018b.p028h.p033c.p034a.C1049a;
import p013b.p018b.p028h.p033c.p034a.C1050b;
import p013b.p018b.p028h.p039h.C1101r;
import p013b.p018b.p040i.p050h.C1136b;

/* renamed from: b.b.i.h.f */
public class C1141f extends ActionMode {

    /* renamed from: a */
    final Context f4144a;

    /* renamed from: b */
    final C1136b f4145b;

    /* renamed from: b.b.i.h.f$a */
    public static class C1142a implements C1136b.C1137a {

        /* renamed from: a */
        final ActionMode.Callback f4146a;

        /* renamed from: b */
        final Context f4147b;

        /* renamed from: c */
        final ArrayList<C1141f> f4148c = new ArrayList<>();

        /* renamed from: d */
        final C1101r<Menu, Menu> f4149d = new C1101r<>();

        public C1142a(Context context, ActionMode.Callback callback) {
            this.f4147b = context;
            this.f4146a = callback;
        }

        /* renamed from: a */
        private Menu m5810a(Menu menu) {
            Menu menu2 = this.f4149d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            Menu a = C0683x.m3417a(this.f4147b, (C1049a) menu);
            this.f4149d.put(menu, a);
            return a;
        }

        /* renamed from: a */
        public void mo2486a(C1136b bVar) {
            this.f4146a.onDestroyActionMode(mo5342b(bVar));
        }

        /* renamed from: a */
        public boolean mo2487a(C1136b bVar, Menu menu) {
            return this.f4146a.onCreateActionMode(mo5342b(bVar), m5810a(menu));
        }

        /* renamed from: a */
        public boolean mo2488a(C1136b bVar, MenuItem menuItem) {
            return this.f4146a.onActionItemClicked(mo5342b(bVar), C0683x.m3418a(this.f4147b, (C1050b) menuItem));
        }

        /* renamed from: b */
        public ActionMode mo5342b(C1136b bVar) {
            int size = this.f4148c.size();
            for (int i = 0; i < size; i++) {
                C1141f fVar = this.f4148c.get(i);
                if (fVar != null && fVar.f4145b == bVar) {
                    return fVar;
                }
            }
            C1141f fVar2 = new C1141f(this.f4147b, bVar);
            this.f4148c.add(fVar2);
            return fVar2;
        }

        /* renamed from: b */
        public boolean mo2489b(C1136b bVar, Menu menu) {
            return this.f4146a.onPrepareActionMode(mo5342b(bVar), m5810a(menu));
        }
    }

    public C1141f(Context context, C1136b bVar) {
        this.f4144a = context;
        this.f4145b = bVar;
    }

    public void finish() {
        this.f4145b.mo2561a();
    }

    public View getCustomView() {
        return this.f4145b.mo2566b();
    }

    public Menu getMenu() {
        return C0683x.m3417a(this.f4144a, (C1049a) this.f4145b.mo2569c());
    }

    public MenuInflater getMenuInflater() {
        return this.f4145b.mo2570d();
    }

    public CharSequence getSubtitle() {
        return this.f4145b.mo2571e();
    }

    public Object getTag() {
        return this.f4145b.mo5315f();
    }

    public CharSequence getTitle() {
        return this.f4145b.mo2572g();
    }

    public boolean getTitleOptionalHint() {
        return this.f4145b.mo5316h();
    }

    public void invalidate() {
        this.f4145b.mo2573i();
    }

    public boolean isTitleOptional() {
        return this.f4145b.mo2574j();
    }

    public void setCustomView(View view) {
        this.f4145b.mo2563a(view);
    }

    public void setSubtitle(int i) {
        this.f4145b.mo2562a(i);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f4145b.mo2564a(charSequence);
    }

    public void setTag(Object obj) {
        this.f4145b.mo5314a(obj);
    }

    public void setTitle(int i) {
        this.f4145b.mo2567b(i);
    }

    public void setTitle(CharSequence charSequence) {
        this.f4145b.mo2568b(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.f4145b.mo2565a(z);
    }
}
