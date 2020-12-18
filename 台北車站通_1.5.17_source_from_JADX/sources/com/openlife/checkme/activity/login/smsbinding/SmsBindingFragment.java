package com.openlife.checkme.activity.login.smsbinding;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.widget.Button;
import android.widget.TextView;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.C4672k;
import p101d.p108c.p109a.C5197l;

public class SmsBindingFragment extends C4672k<C4702k, C4699h> implements C4698g {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C4702k f13586a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f13587b;
    TextInputEditText input;
    TextInputLayout inputLayout;
    Button send;
    TextView smsTv;

    /* renamed from: g */
    public static SmsBindingFragment m18490g(String str) {
        SmsBindingFragment smsBindingFragment = new SmsBindingFragment();
        Bundle bundle = new Bundle();
        bundle.putString("PHONE", str);
        smsBindingFragment.setArguments(bundle);
        return smsBindingFragment;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C4702k mo12600l() {
        return this.f13586a;
    }

    /* renamed from: a */
    public void mo13020a(int i) {
        C5197l.C5198a aVar = new C5197l.C5198a(getActivity());
        aVar.mo14378a(i);
        aVar.mo14399f(C4961l.g_ok);
        aVar.mo14396d(C4961l.g_cancel);
        aVar.mo14391b((C5197l.C5207j) new C4693b(this));
        aVar.mo14395c();
    }

    /* renamed from: a */
    public void mo13021a(Integer num) {
        if (num == null) {
            this.inputLayout.setError((CharSequence) null);
        } else {
            this.inputLayout.setError(getString(num.intValue()));
        }
    }

    /* renamed from: a */
    public void mo13022a(String str) {
    }

    /* renamed from: a */
    public void mo13023a(boolean z) {
        this.send.setEnabled(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12594a(boolean z, int i) {
        if (z) {
            this.send.getBackground().setColorFilter(getResources().getColor(i), PorterDuff.Mode.SRC);
            this.smsTv.setTextColor(getResources().getColor(i));
        }
    }

    /* renamed from: b */
    public void mo13024b() {
        mo13023a(!this.input.getText().toString().isEmpty());
        this.input.addTextChangedListener(new C4692a(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo12598j() {
        return C4957h.fragment_login_smsbinding_cm;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f13587b = getArguments().getString("PHONE");
        mo13024b();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13586a = new C4702k(this, new C4699h());
    }

    /* access modifiers changed from: package-private */
    public void onSendClick() {
        this.f13586a.mo13039a(this.f13587b, this.input.getText().toString());
    }

    /* access modifiers changed from: package-private */
    public void onSmsProblem() {
        mo13020a(C4961l.loginsms_h_retrysms);
    }
}
