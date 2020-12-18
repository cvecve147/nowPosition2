package com.openlife.checkme.activity.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.facebook.C1428i;
import com.facebook.C1572n;
import com.facebook.login.C1534D;
import com.facebook.login.C1537E;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.activity.home.MainActivity;
import com.openlife.checkme.net.model.FbLoginBody;
import com.openlife.checkme.p094d.C4938a;
import com.openlife.checkme.sdk.C5008q;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class LoginFragment extends C5008q<C4683j, C4681h> implements C4680g {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C4683j f13557a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C1534D f13558b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List<String> f13559c;

    /* renamed from: d */
    private C1428i f13560d;
    Button guestLogin;

    /* renamed from: a */
    public static LoginFragment m18426a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("vendorId", str);
        LoginFragment loginFragment = new LoginFragment();
        loginFragment.setArguments(bundle);
        return loginFragment;
    }

    /* renamed from: b */
    private void m18429b() {
        this.f13558b = C1534D.m7111a();
        this.f13559c = Arrays.asList(new String[]{"email", "public_profile", "user_birthday", "user_likes", "user_location"});
        this.f13560d = C1428i.C1429a.m6772a();
        this.f13558b.mo6273a(this.f13560d, (C1572n<C1537E>) new C4675b(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C4683j mo12600l() {
        return this.f13557a;
    }

    /* renamed from: a */
    public void mo12988a(FbLoginBody fbLoginBody) {
        this.f13557a.mo13000a(fbLoginBody);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12594a(boolean z, int i) {
        if (z) {
            this.guestLogin.setTextColor(getResources().getColor(i));
        }
    }

    /* access modifiers changed from: package-private */
    public void facebookLogin() {
        this.f13558b.mo6272a(getActivity(), (Collection<String>) this.f13559c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo12598j() {
        return C4957h.fragment_login_cm;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m18429b();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f13560d.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13557a = new C4683j(this, new C4681h());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C4938a.m19449a(getActivity(), getArguments().getString("vendorId"));
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onDestroyView() {
        super.onDestroyView();
        mo12970m().mo5375a();
    }

    /* access modifiers changed from: package-private */
    public void questLogin() {
        MainActivity.m18285a(getActivity());
    }
}
