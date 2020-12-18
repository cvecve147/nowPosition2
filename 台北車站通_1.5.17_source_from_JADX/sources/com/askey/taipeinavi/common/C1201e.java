package com.askey.taipeinavi.common;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.askey.taipeinavi.R;
import p267i.p274b.p282c.C6761s;

/* renamed from: com.askey.taipeinavi.common.e */
class C1201e extends C6761s {

    /* renamed from: a */
    private ImageView f4387a;

    /* renamed from: b */
    private TextView f4388b;

    /* renamed from: c */
    private int f4389c = -1;

    public C1201e(int i) {
        this.f4389c = i;
    }

    /* renamed from: a */
    public void mo5500a(Context context, Object obj) {
        C1200d dVar = (C1200d) obj;
        this.f4387a.setImageResource(dVar.f4385a);
        this.f4388b.setText(context.getString(dVar.f4386b));
    }

    /* renamed from: a */
    public void mo5501a(View view) {
        this.f4387a = (ImageView) view.findViewById(R.id.imgIcon);
        this.f4388b = (TextView) view.findViewById(R.id.txtName);
        int i = this.f4389c;
        if (i != -1) {
            this.f4388b.setTextColor(i);
        }
    }
}
