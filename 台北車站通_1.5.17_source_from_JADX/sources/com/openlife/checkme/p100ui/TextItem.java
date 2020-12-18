package com.openlife.checkme.p100ui;

import android.content.Context;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.p100ui.FormView;

/* renamed from: com.openlife.checkme.ui.TextItem */
public class TextItem extends FormView.C5012b {

    /* renamed from: a */
    private Context f14266a;
    TextView subTitle;
    TextView title;

    public TextItem(Context context) {
        super(context);
        this.f14266a = context;
        ButterKnife.m5843a((Object) this, mo14059b());
    }

    public TextItem(Context context, int i) {
        this(context);
        mo14077a(i);
    }

    /* renamed from: a */
    public int mo14038a() {
        return C4957h.view_item_text_cm;
    }

    /* renamed from: a */
    public void mo14077a(int i) {
        this.title.setText(this.f14266a.getString(i));
    }

    /* renamed from: a */
    public void mo14078a(String str) {
        this.subTitle.setText(str);
    }

    /* renamed from: b */
    public void mo14079b(int i) {
        this.subTitle.setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
        this.subTitle.setCompoundDrawablePadding(16);
    }
}
