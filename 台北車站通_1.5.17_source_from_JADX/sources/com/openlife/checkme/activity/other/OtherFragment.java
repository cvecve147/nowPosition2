package com.openlife.checkme.activity.other;

import android.content.Context;
import android.os.Bundle;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4959j;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.C4672k;
import com.openlife.checkme.p093c.C4871b;
import com.openlife.checkme.p094d.C4938a;
import com.openlife.checkme.p100ui.C5042t;
import com.openlife.checkme.p100ui.C5043u;
import com.openlife.checkme.p100ui.FormView;
import com.openlife.checkme.p100ui.LabelItem;
import com.openlife.checkme.p100ui.TextItem;

public class OtherFragment extends C4672k<C4754q, C4753p> implements C4752o {

    /* renamed from: a */
    TextItem f13679a;

    /* renamed from: b */
    TextItem f13680b;

    /* renamed from: c */
    TextItem f13681c;

    /* renamed from: d */
    TextItem f13682d;

    /* renamed from: e */
    C5043u f13683e;

    /* renamed from: f */
    TextItem f13684f;
    FormView formView;

    /* renamed from: g */
    TextItem f13685g;

    /* renamed from: h */
    TextItem f13686h;

    /* renamed from: i */
    TextItem f13687i;

    /* renamed from: j */
    TextItem f13688j;

    /* renamed from: k */
    TextItem f13689k;

    /* renamed from: l */
    TextItem f13690l;

    /* renamed from: m */
    TextItem f13691m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C4754q f13692n;

    /* renamed from: b */
    public static OtherFragment m18690b() {
        return new OtherFragment();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C4754q mo12600l() {
        return this.f13692n;
    }

    /* renamed from: a */
    public void mo13128a(Context context) {
        this.f13679a = new TextItem(context, C4961l.other_activity);
        this.f13680b = new TextItem(context, C4961l.other_announcement);
        this.f13681c = new TextItem(context, C4961l.other_account);
        this.f13682d = new TextItem(context, C4961l.other_login);
        this.f13683e = new C5043u(context, C4961l.other_notification);
        this.f13684f = new TextItem(context, C4961l.other_version);
        this.f13685g = new TextItem(context, C4961l.other_rating);
        this.f13686h = new TextItem(context, C4961l.other_question);
        this.f13687i = new TextItem(context, C4961l.other_guide);
        this.f13688j = new TextItem(context, C4961l.other_service);
        this.f13689k = new TextItem(context, C4961l.other_about);
        this.f13690l = new TextItem(context, C4961l.other_term);
        this.f13691m = new TextItem(context, C4961l.other_privacy);
        this.f13684f.mo14078a(getString(C4961l.other_p_version, new Object[]{C4871b.m19172a()}));
        this.f13679a.mo14079b(C4959j.others_btn_more);
        this.f13680b.mo14079b(C4959j.others_btn_more);
        this.f13681c.mo14079b(C4959j.others_btn_more);
        this.f13682d.mo14079b(C4959j.others_btn_more);
        this.f13685g.mo14079b(C4959j.others_btn_more);
        this.f13686h.mo14079b(C4959j.others_btn_more);
        this.f13687i.mo14079b(C4959j.others_btn_more);
        this.f13688j.mo14079b(C4959j.others_btn_more);
        this.f13689k.mo14079b(C4959j.others_btn_more);
        this.f13690l.mo14079b(C4959j.others_btn_more);
        this.f13691m.mo14079b(C4959j.others_btn_more);
        FormView.C5011a aVar = new FormView.C5011a();
        aVar.mo14054a((FormView.C5012b) new C5042t(context));
        aVar.mo14054a((FormView.C5012b) this.f13679a);
        aVar.mo14054a((FormView.C5012b) new LabelItem(context, C4961l.other_p_activity));
        aVar.mo14054a((FormView.C5012b) C4938a.m19452d(context) ? this.f13681c : this.f13682d);
        aVar.mo14054a((FormView.C5012b) new C5042t(context));
        if (C4938a.m19452d(context)) {
            aVar.mo14054a((FormView.C5012b) this.f13683e);
        }
        aVar.mo14054a((FormView.C5012b) this.f13684f);
        aVar.mo14054a((FormView.C5012b) this.f13685g);
        aVar.mo14054a((FormView.C5012b) new C5042t(context));
        aVar.mo14054a((FormView.C5012b) this.f13686h);
        aVar.mo14054a((FormView.C5012b) this.f13687i);
        aVar.mo14054a((FormView.C5012b) this.f13688j);
        aVar.mo14054a((FormView.C5012b) new C5042t(context));
        aVar.mo14054a((FormView.C5012b) this.f13689k);
        aVar.mo14054a((FormView.C5012b) this.f13690l);
        aVar.mo14054a((FormView.C5012b) this.f13691m);
        this.formView.setAdapter(aVar);
    }

    /* renamed from: a */
    public void mo13129a(boolean z) {
        this.f13683e.mo14114a(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12594a(boolean z, int i) {
    }

    /* renamed from: g */
    public void mo13130g() {
        this.f13679a.mo14059b().setOnClickListener(new C4741d(this));
        this.f13680b.mo14059b().setOnClickListener(new C4745h(this));
        this.f13681c.mo14059b().setOnClickListener(new C4746i(this));
        this.f13682d.mo14059b().setOnClickListener(new C4747j(this));
        this.f13683e.mo14113a((C5043u.C5045b) new C4748k(this));
        this.f13685g.mo14059b().setOnClickListener(new C4749l(this));
        this.f13686h.mo14059b().setOnClickListener(new C4738a(this));
        this.f13687i.mo14059b().setOnClickListener(new C4739b(this));
        this.f13688j.mo14059b().setOnClickListener(new C4740c(this));
        this.f13689k.mo14059b().setOnClickListener(new C4742e(this));
        this.f13690l.mo14059b().setOnClickListener(new C4743f(this));
        this.f13691m.mo14059b().setOnClickListener(new C4744g(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo12598j() {
        return C4957h.fragment_other_cm;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        mo13128a((Context) getActivity());
        this.f13692n.mo13148c();
        mo13130g();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13692n = new C4754q(this, new C4753p());
    }
}
