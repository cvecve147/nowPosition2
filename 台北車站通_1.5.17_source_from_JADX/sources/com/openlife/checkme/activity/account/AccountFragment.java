package com.openlife.checkme.activity.account;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.p007v4.view.C0483r;
import android.support.p007v4.view.ViewPager;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.openlife.checkme.C4452a;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.C4672k;

public class AccountFragment extends C4672k<C4485l, C4471g> implements C4470f {

    /* renamed from: a */
    C4467c f13150a;

    /* renamed from: b */
    private C4485l f13151b;

    /* renamed from: c */
    private Context f13152c;
    TextView code;
    ImageView cover;
    TextView name;
    TabLayout tabLayout;
    ViewPager viewPager;

    /* renamed from: b */
    public static AccountFragment m17705b() {
        return new AccountFragment();
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m17706p() {
        InputMethodManager inputMethodManager = (InputMethodManager) getActivity().getSystemService("input_method");
        View currentFocus = getActivity().getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(getActivity());
        }
        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C4485l mo12600l() {
        return this.f13151b;
    }

    /* renamed from: a */
    public void mo12592a(int i) {
        this.f13150a = Build.VERSION.SDK_INT >= 17 ? new C4467c(getChildFragmentManager()) : new C4467c(getFragmentManager());
        this.viewPager.mo1786a((ViewPager.C0440f) new TabLayout.C0137f(this.tabLayout));
        this.viewPager.setOffscreenPageLimit(this.f13150a.mo1972a());
        this.viewPager.setAdapter(this.f13150a);
        this.tabLayout.mo709a((TabLayout.C0133b) new C4465a(this));
        this.viewPager.setCurrentItem(i);
    }

    /* renamed from: a */
    public void mo12593a(String str) {
        this.name.setText(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12594a(boolean z, int i) {
    }

    /* renamed from: g */
    public void mo12595g() {
        TabLayout tabLayout2 = this.tabLayout;
        TabLayout.C0136e a = tabLayout2.mo706a();
        a.mo773c(C4961l.account_t_overview);
        tabLayout2.mo710a(a);
        TabLayout tabLayout3 = this.tabLayout;
        TabLayout.C0136e a2 = tabLayout3.mo706a();
        a2.mo773c(C4961l.account_t_history);
        tabLayout3.mo710a(a2);
        TabLayout tabLayout4 = this.tabLayout;
        TabLayout.C0136e a3 = tabLayout4.mo706a();
        a3.mo773c(C4961l.account_t_redemption);
        tabLayout4.mo710a(a3);
    }

    /* renamed from: g */
    public void mo12596g(String str) {
        this.code.setText(str);
    }

    /* renamed from: i */
    public void mo12597i(String str) {
        ImageLoader.getInstance().displayImage(getString(C4961l.format_fb_uid_pic, new Object[]{str}), this.cover, C4452a.f13123c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo12598j() {
        return C4957h.fragment_account_cm;
    }

    /* renamed from: k */
    public void mo12599k() {
        Toast.makeText(getActivity(), C4961l.g_copy_done, 0).show();
    }

    /* renamed from: o */
    public void mo12601o() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.viewPager.setAdapter((C0483r) null);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f13152c = getActivity().getBaseContext();
        mo12595g();
        mo12592a(0);
        this.f13151b.mo12631c();
    }

    /* access modifiers changed from: package-private */
    public void onCopy() {
        ((ClipboardManager) this.f13152c.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText((CharSequence) null, this.code.getText().toString()));
        mo12599k();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13151b = new C4485l(this, new C4471g());
    }

    public void onDestroyView() {
        mo12601o();
        super.onDestroyView();
        mo12970m().mo5375a();
    }
}
