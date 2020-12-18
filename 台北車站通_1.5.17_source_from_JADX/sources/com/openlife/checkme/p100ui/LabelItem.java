package com.openlife.checkme.p100ui;

import android.content.Context;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.p100ui.FormView;

/* renamed from: com.openlife.checkme.ui.LabelItem */
public class LabelItem extends FormView.C5012b {

    /* renamed from: a */
    private Context f14223a;
    TextView lablel;

    public LabelItem(Context context) {
        super(context);
        this.f14223a = context;
        ButterKnife.m5843a((Object) this, mo14059b());
    }

    public LabelItem(Context context, int i) {
        this(context);
        mo14061a(i);
    }

    /* renamed from: a */
    public int mo14038a() {
        return C4957h.view_item_label_cm;
    }

    /* renamed from: a */
    public void mo14061a(int i) {
        this.lablel.setText(this.f14223a.getString(i));
    }
}
