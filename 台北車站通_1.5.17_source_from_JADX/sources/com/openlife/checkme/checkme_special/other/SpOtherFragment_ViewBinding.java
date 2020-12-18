package com.openlife.checkme.checkme_special.other;

import android.view.View;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.checkme_special.other.SpOtherFragment;
import com.openlife.checkme.p100ui.FormView;

public class SpOtherFragment_ViewBinding<T extends SpOtherFragment> implements Unbinder {

    /* renamed from: a */
    protected T f14087a;

    public SpOtherFragment_ViewBinding(T t, View view) {
        this.f14087a = t;
        t.formView = (FormView) C1153c.m5853c(view, C4956g.form_view, "field 'formView'", FormView.class);
    }

    /* renamed from: a */
    public void mo5375a() {
        T t = this.f14087a;
        if (t != null) {
            t.formView = null;
            this.f14087a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
