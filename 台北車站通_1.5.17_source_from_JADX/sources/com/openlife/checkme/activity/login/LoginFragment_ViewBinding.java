package com.openlife.checkme.activity.login;

import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.activity.login.LoginFragment;

public class LoginFragment_ViewBinding<T extends LoginFragment> implements Unbinder {

    /* renamed from: a */
    protected T f13561a;

    /* renamed from: b */
    private View f13562b;

    /* renamed from: c */
    private View f13563c;

    public LoginFragment_ViewBinding(T t, View view) {
        this.f13561a = t;
        View a = C1153c.m5849a(view, C4956g.guest_login, "field 'guestLogin' and method 'questLogin'");
        t.guestLogin = (Button) C1153c.m5850a(a, C4956g.guest_login, "field 'guestLogin'", Button.class);
        this.f13562b = a;
        a.setOnClickListener(new C4676c(this, t));
        View a2 = C1153c.m5849a(view, C4956g.faceook_login, "method 'facebookLogin'");
        this.f13563c = a2;
        a2.setOnClickListener(new C4677d(this, t));
    }

    /* renamed from: a */
    public void mo5375a() {
        T t = this.f13561a;
        if (t != null) {
            t.guestLogin = null;
            this.f13562b.setOnClickListener((View.OnClickListener) null);
            this.f13562b = null;
            this.f13563c.setOnClickListener((View.OnClickListener) null);
            this.f13563c = null;
            this.f13561a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
