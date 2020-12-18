package p267i.p274b.p282c;

import android.content.Context;
import android.support.p011v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: i.b.c.r */
public class C6760r {
    /* renamed from: a */
    public static View m25584a(Context context, ViewGroup viewGroup, RecyclerView.C0759i iVar, C6756q qVar, C6751l lVar) {
        return m25585a(context, viewGroup, iVar, qVar, lVar, (C6752m) null);
    }

    /* renamed from: a */
    public static View m25585a(Context context, ViewGroup viewGroup, RecyclerView.C0759i iVar, C6756q qVar, C6751l lVar, C6752m mVar) {
        View inflate = LayoutInflater.from(context).inflate(C6754o.container_recycle_view, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C6753n.rcView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(iVar);
        recyclerView.setAdapter(qVar);
        qVar.mo17251c(recyclerView);
        qVar.mo17248a(lVar);
        qVar.mo17249a(mVar);
        return inflate;
    }
}
