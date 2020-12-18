package com.openlife.checkme.checkme_special.other;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4959j;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.C4672k;
import com.openlife.checkme.activity.C4757r;
import com.openlife.checkme.p100ui.C5042t;
import com.openlife.checkme.p100ui.FormView;
import com.openlife.checkme.p100ui.TextItem;

public class SpOtherFragment extends C4672k {

    /* renamed from: a */
    private TextItem f14083a;

    /* renamed from: b */
    private TextItem f14084b;

    /* renamed from: c */
    private TextItem f14085c;

    /* renamed from: d */
    private TextItem f14086d;
    FormView formView;

    /* renamed from: a */
    public static SpOtherFragment m19416a() {
        return new SpOtherFragment();
    }

    /* renamed from: a */
    public void mo13465a(Activity activity, Context context) {
        this.f14083a.mo14059b().setOnClickListener(new C4926a(this, activity, context));
        this.f14084b.mo14059b().setOnClickListener(new C4927b(this, activity));
        this.f14085c.mo14059b().setOnClickListener(new C4928c(this, activity, context));
        this.f14086d.mo14059b().setOnClickListener(new C4929d(this, activity, context));
    }

    /* renamed from: a */
    public void mo13466a(Context context) {
        this.f14083a = new TextItem(context, C4961l.other_question);
        this.f14084b = new TextItem(context, C4961l.other_guide);
        this.f14085c = new TextItem(context, C4961l.other_term);
        this.f14086d = new TextItem(context, C4961l.other_privacy);
        this.f14083a.mo14079b(C4959j.others_btn_more);
        this.f14084b.mo14079b(C4959j.others_btn_more);
        this.f14085c.mo14079b(C4959j.others_btn_more);
        this.f14086d.mo14079b(C4959j.others_btn_more);
        FormView.C5011a aVar = new FormView.C5011a();
        aVar.mo14054a((FormView.C5012b) new C5042t(context));
        aVar.mo14054a((FormView.C5012b) this.f14083a);
        aVar.mo14054a((FormView.C5012b) this.f14084b);
        aVar.mo14054a((FormView.C5012b) new C5042t(context));
        aVar.mo14054a((FormView.C5012b) this.f14085c);
        aVar.mo14054a((FormView.C5012b) this.f14086d);
        this.formView.setAdapter(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12594a(boolean z, int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo12598j() {
        return C4957h.fragment_other_cm;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C4757r mo12600l() {
        return null;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        mo13466a(getActivity());
        mo13465a(getActivity(), getActivity().getBaseContext());
    }

    public void onDestroyView() {
        super.onDestroyView();
        mo12970m().mo5375a();
    }
}
