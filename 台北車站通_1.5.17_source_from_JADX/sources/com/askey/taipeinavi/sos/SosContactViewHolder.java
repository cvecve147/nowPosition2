package com.askey.taipeinavi.sos;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import p267i.p274b.p282c.C6761s;

public class SosContactViewHolder extends C6761s {
    TextView mTxtOrg;

    /* renamed from: a */
    public void mo5500a(Context context, Object obj) {
        this.mTxtOrg.setText(((C1301c) obj).f4575a);
    }

    /* renamed from: a */
    public void mo5501a(View view) {
        ButterKnife.m5843a((Object) this, view);
    }
}
