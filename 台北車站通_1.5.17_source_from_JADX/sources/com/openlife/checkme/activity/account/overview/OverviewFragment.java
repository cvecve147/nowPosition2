package com.openlife.checkme.activity.account.overview;

import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.widget.Button;
import android.widget.TextView;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.C4672k;
import com.openlife.checkme.p100ui.PointAnimationActivity;

public class OverviewFragment extends C4672k<C4493h, C4490e> implements C4489d {

    /* renamed from: a */
    private C4493h f13182a;
    TextView availablePoint;
    TextView availableTitle;
    TextInputEditText codeInput;
    TextInputLayout codeInputLayout;
    TextView expiredDate;
    TextView expiredPoint;
    Button send;

    /* renamed from: b */
    public static OverviewFragment m17777b() {
        return new OverviewFragment();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C4493h mo12600l() {
        return this.f13182a;
    }

    /* renamed from: a */
    public void mo12633a(int i) {
        PointAnimationActivity.m19814a(getActivity(), i);
    }

    /* renamed from: a */
    public void mo12634a(Integer num) {
        if (num == null) {
            this.codeInputLayout.setError((CharSequence) null);
        } else {
            this.codeInputLayout.setError(getString(num.intValue()));
        }
    }

    /* renamed from: a */
    public void mo12635a(String str) {
        this.availableTitle.setVisibility(0);
        this.availablePoint.setText(getString(C4961l.g_points, new Object[]{str}));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12594a(boolean z, int i) {
        if (z) {
            this.send.setTextColor(getResources().getColor(i));
        }
    }

    /* renamed from: b */
    public void mo12636b(String str, String str2) {
        this.expiredDate.setText(getString(C4961l.accountoverview_expired, new Object[]{str}));
        this.expiredPoint.setText(getString(C4961l.g_points, new Object[]{str2}));
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo12598j() {
        return C4957h.fragment_account_overview_cm;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f13182a.mo12648c();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13182a = new C4493h(this, new C4490e());
    }

    public void onDestroyView() {
        super.onDestroyView();
        mo12970m().mo5375a();
    }

    /* access modifiers changed from: package-private */
    public void sendCode() {
        this.f13182a.mo12647a(this.codeInput.getText().toString());
    }
}
