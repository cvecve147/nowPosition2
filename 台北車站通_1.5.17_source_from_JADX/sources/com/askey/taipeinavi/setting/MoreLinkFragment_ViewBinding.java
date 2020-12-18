package com.askey.taipeinavi.setting;

import android.view.View;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.askey.taipeinavi.R;

public class MoreLinkFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MoreLinkFragment f4530a;

    /* renamed from: b */
    private View f4531b;

    public MoreLinkFragment_ViewBinding(MoreLinkFragment moreLinkFragment, View view) {
        this.f4530a = moreLinkFragment;
        View a = C1153c.m5849a(view, R.id.cellFunTaipei, "method 'onFunTaipeiClicked'");
        this.f4531b = a;
        a.setOnClickListener(new C1285b(this, moreLinkFragment));
    }

    /* renamed from: a */
    public void mo5375a() {
        if (this.f4530a != null) {
            this.f4530a = null;
            this.f4531b.setOnClickListener((View.OnClickListener) null);
            this.f4531b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
