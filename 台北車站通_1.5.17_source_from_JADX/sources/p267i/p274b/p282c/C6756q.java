package p267i.p274b.p282c;

import android.support.p011v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: i.b.c.q */
public class C6756q extends RecyclerView.C0748a<C6759c> {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public RecyclerView f18765c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C6751l f18766d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C6752m f18767e;

    /* renamed from: f */
    private View.OnClickListener f18768f = new C6757a();

    /* renamed from: g */
    private View.OnLongClickListener f18769g = new C6758b();

    /* renamed from: h */
    private C6761s f18770h;

    /* renamed from: i */
    private int f18771i;

    /* renamed from: j */
    private ArrayList<? extends Object> f18772j;

    /* renamed from: i.b.c.q$a */
    private class C6757a implements View.OnClickListener {
        private C6757a() {
        }

        public void onClick(View view) {
            int g = C6756q.this.f18765c.mo3693g(view);
            if (C6756q.this.f18766d != null) {
                C6756q.this.f18766d.mo5549a(view, g);
            }
        }
    }

    /* renamed from: i.b.c.q$b */
    private class C6758b implements View.OnLongClickListener {
        private C6758b() {
        }

        public boolean onLongClick(View view) {
            int g = C6756q.this.f18765c.mo3693g(view);
            if (C6756q.this.f18767e == null) {
                return true;
            }
            C6756q.this.f18767e.mo17247a(view, g);
            return true;
        }
    }

    /* renamed from: i.b.c.q$c */
    static class C6759c extends RecyclerView.C0778w {
        C6759c(View view) {
            super(view);
        }
    }

    public C6756q(C6761s sVar, ArrayList<? extends Object> arrayList, int i) {
        this.f18772j = arrayList;
        this.f18770h = sVar;
        this.f18771i = i;
    }

    /* renamed from: a */
    public int mo337a() {
        ArrayList<? extends Object> arrayList = this.f18772j;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: a */
    public void mo17248a(C6751l lVar) {
        this.f18766d = lVar;
    }

    /* renamed from: a */
    public void mo17249a(C6752m mVar) {
        this.f18767e = mVar;
    }

    /* renamed from: a */
    public void mo346b(C6759c cVar, int i) {
        this.f18770h.mo5501a(cVar.f3093b);
        this.f18770h.mo5500a(cVar.f3093b.getContext(), this.f18772j.get(i));
    }

    /* renamed from: b */
    public C6759c m25581b(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f18771i, viewGroup, false);
        inflate.setOnClickListener(this.f18768f);
        inflate.setOnLongClickListener(this.f18769g);
        C6759c cVar = new C6759c(inflate);
        this.f18770h.mo5501a(inflate);
        return cVar;
    }

    /* renamed from: c */
    public void mo17251c(RecyclerView recyclerView) {
        this.f18765c = recyclerView;
    }
}
