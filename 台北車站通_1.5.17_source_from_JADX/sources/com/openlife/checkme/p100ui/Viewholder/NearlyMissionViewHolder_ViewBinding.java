package com.openlife.checkme.p100ui.Viewholder;

import android.support.p011v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.p100ui.Viewholder.NearlyMissionViewHolder;

/* renamed from: com.openlife.checkme.ui.Viewholder.NearlyMissionViewHolder_ViewBinding */
public class NearlyMissionViewHolder_ViewBinding<T extends NearlyMissionViewHolder> implements Unbinder {

    /* renamed from: a */
    protected T f14271a;

    public NearlyMissionViewHolder_ViewBinding(T t, View view) {
        this.f14271a = t;
        t.layout = (RelativeLayout) C1153c.m5853c(view, C4956g.layout, "field 'layout'", RelativeLayout.class);
        t.title = (TextView) C1153c.m5853c(view, C4956g.title, "field 'title'", TextView.class);
        t.cover = (ImageView) C1153c.m5853c(view, C4956g.cover, "field 'cover'", ImageView.class);
        t.point = (TextView) C1153c.m5853c(view, C4956g.point, "field 'point'", TextView.class);
        t.distance = (TextView) C1153c.m5853c(view, C4956g.distance, "field 'distance'", TextView.class);
        t.cardView = (CardView) C1153c.m5853c(view, C4956g.cardView, "field 'cardView'", CardView.class);
    }

    /* renamed from: a */
    public void mo5375a() {
        T t = this.f14271a;
        if (t != null) {
            t.layout = null;
            t.title = null;
            t.cover = null;
            t.point = null;
            t.distance = null;
            t.cardView = null;
            this.f14271a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
