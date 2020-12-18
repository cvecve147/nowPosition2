package com.openlife.checkme.activity.login.phonebinding;

import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.activity.login.phonebinding.PhoneBindingFragment;

public class PhoneBindingFragment_ViewBinding<T extends PhoneBindingFragment> implements Unbinder {

    /* renamed from: a */
    protected T f13576a;

    /* renamed from: b */
    private View f13577b;

    public PhoneBindingFragment_ViewBinding(T t, View view) {
        this.f13576a = t;
        t.inputLayout = (TextInputLayout) C1153c.m5853c(view, C4956g.input_layout, "field 'inputLayout'", TextInputLayout.class);
        t.input = (TextInputEditText) C1153c.m5853c(view, C4956g.input, "field 'input'", TextInputEditText.class);
        t.pointTv = (TextView) C1153c.m5853c(view, C4956g.point, "field 'pointTv'", TextView.class);
        View a = C1153c.m5849a(view, C4956g.send, "field 'send' and method 'onSendClick'");
        t.send = (Button) C1153c.m5850a(a, C4956g.send, "field 'send'", Button.class);
        this.f13577b = a;
        a.setOnClickListener(new C4685b(this, t));
    }

    /* renamed from: a */
    public void mo5375a() {
        T t = this.f13576a;
        if (t != null) {
            t.inputLayout = null;
            t.input = null;
            t.pointTv = null;
            t.send = null;
            this.f13577b.setOnClickListener((View.OnClickListener) null);
            this.f13577b = null;
            this.f13576a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
