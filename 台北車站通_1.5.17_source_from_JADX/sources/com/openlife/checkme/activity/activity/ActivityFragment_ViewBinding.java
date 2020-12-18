package com.openlife.checkme.activity.activity;

import android.view.View;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.activity.activity.ActivityFragment;
import com.openlife.checkme.p100ui.FormView;

public class ActivityFragment_ViewBinding<T extends ActivityFragment> implements Unbinder {

    /* renamed from: a */
    protected T f13239a;

    public ActivityFragment_ViewBinding(T t, View view) {
        this.f13239a = t;
        t.formView = (FormView) C1153c.m5853c(view, C4956g.form_view, "field 'formView'", FormView.class);
    }

    /* renamed from: a */
    public void mo5375a() {
        T t = this.f13239a;
        if (t != null) {
            t.formView = null;
            this.f13239a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
