package com.askey.taipeinavi.sos;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.askey.taipeinavi.R;

public class SosContactViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SosContactViewHolder f4568a;

    public SosContactViewHolder_ViewBinding(SosContactViewHolder sosContactViewHolder, View view) {
        this.f4568a = sosContactViewHolder;
        sosContactViewHolder.mTxtOrg = (TextView) C1153c.m5853c(view, R.id.txtOrg, "field 'mTxtOrg'", TextView.class);
    }

    /* renamed from: a */
    public void mo5375a() {
        SosContactViewHolder sosContactViewHolder = this.f4568a;
        if (sosContactViewHolder != null) {
            this.f4568a = null;
            sosContactViewHolder.mTxtOrg = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
