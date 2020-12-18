package com.openlife.checkme.p100ui.Viewholder;

import android.support.p011v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.p100ui.Viewholder.MissionViewHolder;

/* renamed from: com.openlife.checkme.ui.Viewholder.MissionViewHolder_ViewBinding */
public class MissionViewHolder_ViewBinding<T extends MissionViewHolder> implements Unbinder {

    /* renamed from: a */
    protected T f14269a;

    public MissionViewHolder_ViewBinding(T t, View view) {
        this.f14269a = t;
        t.layout = (RelativeLayout) C1153c.m5853c(view, C4956g.layout, "field 'layout'", RelativeLayout.class);
        t.title = (TextView) C1153c.m5853c(view, C4956g.title, "field 'title'", TextView.class);
        t.cover = (ImageView) C1153c.m5853c(view, C4956g.cover, "field 'cover'", ImageView.class);
        t.point = (TextView) C1153c.m5853c(view, C4956g.point, "field 'point'", TextView.class);
        t.tagLayout = (LinearLayout) C1153c.m5853c(view, C4956g.tag_layout, "field 'tagLayout'", LinearLayout.class);
        t.cardView = (CardView) C1153c.m5853c(view, C4956g.cardView, "field 'cardView'", CardView.class);
    }

    /* renamed from: a */
    public void mo5375a() {
        T t = this.f14269a;
        if (t != null) {
            t.layout = null;
            t.title = null;
            t.cover = null;
            t.point = null;
            t.tagLayout = null;
            t.cardView = null;
            this.f14269a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
