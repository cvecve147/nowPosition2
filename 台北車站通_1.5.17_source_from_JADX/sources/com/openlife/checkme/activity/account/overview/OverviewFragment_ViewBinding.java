package com.openlife.checkme.activity.account.overview;

import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.activity.account.overview.OverviewFragment;

public class OverviewFragment_ViewBinding<T extends OverviewFragment> implements Unbinder {

    /* renamed from: a */
    protected T f13183a;

    /* renamed from: b */
    private View f13184b;

    public OverviewFragment_ViewBinding(T t, View view) {
        this.f13183a = t;
        t.availableTitle = (TextView) C1153c.m5853c(view, C4956g.available_title, "field 'availableTitle'", TextView.class);
        t.availablePoint = (TextView) C1153c.m5853c(view, C4956g.available_point, "field 'availablePoint'", TextView.class);
        t.expiredDate = (TextView) C1153c.m5853c(view, C4956g.expired_date, "field 'expiredDate'", TextView.class);
        t.expiredPoint = (TextView) C1153c.m5853c(view, C4956g.expired_point, "field 'expiredPoint'", TextView.class);
        t.codeInputLayout = (TextInputLayout) C1153c.m5853c(view, C4956g.code_input_layout, "field 'codeInputLayout'", TextInputLayout.class);
        t.codeInput = (TextInputEditText) C1153c.m5853c(view, C4956g.code_input, "field 'codeInput'", TextInputEditText.class);
        View a = C1153c.m5849a(view, C4956g.send, "field 'send' and method 'sendCode'");
        t.send = (Button) C1153c.m5850a(a, C4956g.send, "field 'send'", Button.class);
        this.f13184b = a;
        a.setOnClickListener(new C4486a(this, t));
    }

    /* renamed from: a */
    public void mo5375a() {
        T t = this.f13183a;
        if (t != null) {
            t.availableTitle = null;
            t.availablePoint = null;
            t.expiredDate = null;
            t.expiredPoint = null;
            t.codeInputLayout = null;
            t.codeInput = null;
            t.send = null;
            this.f13184b.setOnClickListener((View.OnClickListener) null);
            this.f13184b = null;
            this.f13183a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
