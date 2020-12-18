package com.openlife.checkme.p100ui;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.p100ui.TextItem;

/* renamed from: com.openlife.checkme.ui.TextItem_ViewBinding */
public class TextItem_ViewBinding<T extends TextItem> implements Unbinder {

    /* renamed from: a */
    protected T f14267a;

    public TextItem_ViewBinding(T t, View view) {
        this.f14267a = t;
        t.title = (TextView) C1153c.m5853c(view, C4956g.title, "field 'title'", TextView.class);
        t.subTitle = (TextView) C1153c.m5853c(view, C4956g.sub_title, "field 'subTitle'", TextView.class);
    }

    /* renamed from: a */
    public void mo5375a() {
        T t = this.f14267a;
        if (t != null) {
            t.title = null;
            t.subTitle = null;
            this.f14267a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
