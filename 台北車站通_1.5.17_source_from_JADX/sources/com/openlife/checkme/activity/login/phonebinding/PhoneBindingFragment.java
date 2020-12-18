package com.openlife.checkme.activity.login.phonebinding;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.widget.Button;
import android.widget.TextView;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.C4672k;
import com.openlife.checkme.activity.login.smsbinding.SmsBindingActivity;

public class PhoneBindingFragment extends C4672k<C4691h, C4689f> implements C4688e {

    /* renamed from: a */
    private C4691h f13575a;
    TextInputEditText input;
    TextInputLayout inputLayout;
    TextView pointTv;
    Button send;

    /* renamed from: a */
    public static PhoneBindingFragment m18461a(int i) {
        PhoneBindingFragment phoneBindingFragment = new PhoneBindingFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("POINT", i);
        phoneBindingFragment.setArguments(bundle);
        return phoneBindingFragment;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C4691h mo12600l() {
        return this.f13575a;
    }

    /* renamed from: a */
    public void mo13003a(Integer num) {
        if (num == null) {
            this.inputLayout.setError((CharSequence) null);
        } else {
            this.inputLayout.setError(getString(num.intValue()));
        }
    }

    /* renamed from: a */
    public void mo13004a(String str) {
    }

    /* renamed from: a */
    public void mo13005a(boolean z) {
        this.send.setEnabled(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12594a(boolean z, int i) {
        if (z) {
            this.send.getBackground().setColorFilter(getResources().getColor(i), PorterDuff.Mode.SRC);
        }
    }

    /* renamed from: b */
    public void mo13006b() {
        mo13005a(!this.input.getText().toString().isEmpty());
        this.input.setInputType(3);
        this.input.addTextChangedListener(new C4684a(this));
    }

    /* renamed from: g */
    public void mo13007g(String str) {
        SmsBindingActivity.m18485a(getActivity(), str);
    }

    /* renamed from: i */
    public void mo13008i(String str) {
        this.pointTv.setText(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo12598j() {
        return C4957h.fragment_login_phonebinding_cm;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        int i = getArguments().getInt("POINT");
        mo13006b();
        mo13008i(getString(C4961l.g_p_getpoint, new Object[]{Integer.valueOf(i)}));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13575a = new C4691h(this, new C4689f());
    }

    /* access modifiers changed from: package-private */
    public void onSendClick() {
        this.f13575a.mo13018a(this.input.getText().toString());
    }
}
