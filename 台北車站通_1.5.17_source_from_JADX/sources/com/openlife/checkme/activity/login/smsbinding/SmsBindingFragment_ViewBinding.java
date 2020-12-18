package com.openlife.checkme.activity.login.smsbinding;

import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.activity.login.smsbinding.SmsBindingFragment;

public class SmsBindingFragment_ViewBinding<T extends SmsBindingFragment> implements Unbinder {

    /* renamed from: a */
    protected T f13588a;

    /* renamed from: b */
    private View f13589b;

    /* renamed from: c */
    private View f13590c;

    public SmsBindingFragment_ViewBinding(T t, View view) {
        this.f13588a = t;
        t.inputLayout = (TextInputLayout) C1153c.m5853c(view, C4956g.input_layout, "field 'inputLayout'", TextInputLayout.class);
        t.input = (TextInputEditText) C1153c.m5853c(view, C4956g.input, "field 'input'", TextInputEditText.class);
        View a = C1153c.m5849a(view, C4956g.send, "field 'send' and method 'onSendClick'");
        t.send = (Button) C1153c.m5850a(a, C4956g.send, "field 'send'", Button.class);
        this.f13589b = a;
        a.setOnClickListener(new C4694c(this, t));
        View a2 = C1153c.m5849a(view, C4956g.sms_problem, "field 'smsTv' and method 'onSmsProblem'");
        t.smsTv = (TextView) C1153c.m5850a(a2, C4956g.sms_problem, "field 'smsTv'", TextView.class);
        this.f13590c = a2;
        a2.setOnClickListener(new C4695d(this, t));
    }

    /* renamed from: a */
    public void mo5375a() {
        T t = this.f13588a;
        if (t != null) {
            t.inputLayout = null;
            t.input = null;
            t.send = null;
            t.smsTv = null;
            this.f13589b.setOnClickListener((View.OnClickListener) null);
            this.f13589b = null;
            this.f13590c.setOnClickListener((View.OnClickListener) null);
            this.f13590c = null;
            this.f13588a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
