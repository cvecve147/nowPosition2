package com.openlife.checkme.activity.login;

import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.C1571m;
import com.facebook.C1572n;
import com.facebook.C1574p;
import com.facebook.GraphRequest;
import com.facebook.login.C1534D;
import com.facebook.login.C1537E;
import java.util.Collection;

/* renamed from: com.openlife.checkme.activity.login.b */
class C4675b implements C1572n<C1537E> {

    /* renamed from: a */
    final /* synthetic */ LoginFragment f13566a;

    C4675b(LoginFragment loginFragment) {
        this.f13566a = loginFragment;
    }

    /* renamed from: a */
    public void mo6399a(C1537E e) {
        GraphRequest a = GraphRequest.m6508a(e.mo6294a(), (GraphRequest.C1348c) new C4674a(this, e));
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,name,email,gender,birthday");
        a.mo5951a(bundle);
        a.mo5956b();
    }

    /* renamed from: a */
    public void mo6398a(C1574p pVar) {
        if ((pVar instanceof C1571m) && AccessToken.m6460b() != null) {
            C1534D.m7111a().mo6276b();
            this.f13566a.f13558b.mo6272a(this.f13566a.getActivity(), (Collection<String>) this.f13566a.f13559c);
        }
    }

    public void onCancel() {
    }
}
