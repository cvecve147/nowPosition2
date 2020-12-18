package com.openlife.checkme.p100ui.Viewholder;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.p100ui.Viewholder.MissionTitleViewHolder;

/* renamed from: com.openlife.checkme.ui.Viewholder.MissionTitleViewHolder_ViewBinding */
public class MissionTitleViewHolder_ViewBinding<T extends MissionTitleViewHolder> implements Unbinder {

    /* renamed from: a */
    protected T f14268a;

    public MissionTitleViewHolder_ViewBinding(T t, View view) {
        this.f14268a = t;
        t.mTitleText = (TextView) C1153c.m5853c(view, C4956g.title, "field 'mTitleText'", TextView.class);
    }

    /* renamed from: a */
    public void mo5375a() {
        T t = this.f14268a;
        if (t != null) {
            t.mTitleText = null;
            this.f14268a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
