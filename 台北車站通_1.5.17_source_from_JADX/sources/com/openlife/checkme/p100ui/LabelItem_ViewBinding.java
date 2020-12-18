package com.openlife.checkme.p100ui;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.p100ui.LabelItem;

/* renamed from: com.openlife.checkme.ui.LabelItem_ViewBinding */
public class LabelItem_ViewBinding<T extends LabelItem> implements Unbinder {

    /* renamed from: a */
    protected T f14224a;

    public LabelItem_ViewBinding(T t, View view) {
        this.f14224a = t;
        t.lablel = (TextView) C1153c.m5853c(view, C4956g.division, "field 'lablel'", TextView.class);
    }

    /* renamed from: a */
    public void mo5375a() {
        T t = this.f14224a;
        if (t != null) {
            t.lablel = null;
            this.f14224a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
