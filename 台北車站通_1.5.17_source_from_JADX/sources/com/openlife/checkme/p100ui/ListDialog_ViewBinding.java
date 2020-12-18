package com.openlife.checkme.p100ui;

import android.view.View;
import android.widget.ListView;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.p100ui.ListDialog;

/* renamed from: com.openlife.checkme.ui.ListDialog_ViewBinding */
public class ListDialog_ViewBinding<T extends ListDialog> implements Unbinder {

    /* renamed from: a */
    protected T f14228a;

    public ListDialog_ViewBinding(T t, View view) {
        this.f14228a = t;
        t.mListView = (ListView) C1153c.m5853c(view, C4956g.listview, "field 'mListView'", ListView.class);
    }

    /* renamed from: a */
    public void mo5375a() {
        T t = this.f14228a;
        if (t != null) {
            t.mListView = null;
            this.f14228a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
