package com.openlife.checkme.p100ui;

import android.content.Context;
import android.support.p011v7.widget.SwitchCompat;
import android.widget.CompoundButton;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.p100ui.FormView;

/* renamed from: com.openlife.checkme.ui.u */
public class C5043u extends FormView.C5012b {

    /* renamed from: c */
    private TextView f14320c;

    /* renamed from: d */
    private SwitchCompat f14321d;

    /* renamed from: e */
    private Context f14322e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C5045b f14323f;

    /* renamed from: com.openlife.checkme.ui.u$a */
    class C5044a implements CompoundButton.OnCheckedChangeListener {
        C5044a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (C5043u.this.f14323f != null) {
                C5043u.this.f14323f.mo13143a(z);
            }
        }
    }

    /* renamed from: com.openlife.checkme.ui.u$b */
    public interface C5045b {
        /* renamed from: a */
        void mo13143a(boolean z);
    }

    public C5043u(Context context) {
        super(context);
        this.f14322e = context;
        ButterKnife.m5843a((Object) this, mo14059b());
        this.f14320c = (TextView) mo14059b().findViewById(C4956g.title);
        this.f14321d = (SwitchCompat) mo14059b().findViewById(C4956g.switcher);
        this.f14321d.setOnCheckedChangeListener(new C5044a());
    }

    public C5043u(Context context, int i) {
        this(context);
        m19862a(i);
    }

    /* renamed from: a */
    private void m19862a(int i) {
        this.f14320c.setText(this.f14322e.getString(i));
    }

    /* renamed from: a */
    public int mo14038a() {
        return C4957h.view_item_switcher_cm;
    }

    /* renamed from: a */
    public void mo14113a(C5045b bVar) {
        this.f14323f = bVar;
    }

    /* renamed from: a */
    public void mo14114a(boolean z) {
        this.f14321d.setChecked(z);
    }
}
