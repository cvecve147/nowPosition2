package com.openlife.checkme.activity.account.redemption.detail;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.openlife.checkme.C4452a;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4959j;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.C4672k;
import com.openlife.checkme.net.model.RedeemHistoryDetailData;
import com.openlife.checkme.p093c.C4883m;
import com.openlife.checkme.p100ui.BaseWebView;
import org.apache.http.protocol.HTTP;
import p101d.p108c.p109a.C5197l;

public class RedemptionDetailFragment extends C4672k<C4515o, C4512l> implements C4511k {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C4515o f13207a;

    /* renamed from: b */
    private Context f13208b;

    /* renamed from: c */
    private RedeemHistoryDetailData f13209c;
    TextView code;
    ImageView cover;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f13210d;

    /* renamed from: e */
    private boolean f13211e;
    TextView expiredDate;
    ImageButton redeem;
    TextView title;
    ImageButton url;
    View view;
    BaseWebView webView;

    /* renamed from: a */
    public static RedemptionDetailFragment m17836a(int i, boolean z) {
        RedemptionDetailFragment redemptionDetailFragment = new RedemptionDetailFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("ID", i);
        bundle.putBoolean("ENABLE", z);
        redemptionDetailFragment.setArguments(bundle);
        return redemptionDetailFragment;
    }

    /* renamed from: k */
    private void m17840k() {
        C5197l.C5198a aVar = new C5197l.C5198a(getActivity());
        aVar.mo14378a(C4961l.redeem_check);
        aVar.mo14399f(C4961l.g_ok);
        aVar.mo14396d(C4961l.g_cancel);
        aVar.mo14391b((C5197l.C5207j) new C4503c(this));
        aVar.mo14382a((C5197l.C5207j) new C4502b(this));
        aVar.mo14385a(false);
        aVar.mo14395c();
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m17841o() {
        C5197l.C5198a aVar = new C5197l.C5198a(getActivity());
        aVar.mo14378a(C4961l.redeem_sec_check);
        aVar.mo14399f(C4961l.g_ok);
        aVar.mo14396d(C4961l.g_cancel);
        aVar.mo14391b((C5197l.C5207j) new C4505e(this));
        aVar.mo14382a((C5197l.C5207j) new C4504d(this));
        aVar.mo14385a(false);
        aVar.mo14395c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C4515o mo12600l() {
        return this.f13207a;
    }

    /* renamed from: a */
    public void mo12664a(RedeemHistoryDetailData redeemHistoryDetailData) {
        String str;
        TextView textView;
        this.f13209c = redeemHistoryDetailData;
        ImageLoader.getInstance().displayImage(redeemHistoryDetailData.getImage(), this.cover, C4452a.m17659a(C4959j.default_gift));
        this.title.setText(redeemHistoryDetailData.getName());
        if (redeemHistoryDetailData.getSerial().contains("密碼")) {
            textView = this.code;
            str = redeemHistoryDetailData.getSerial().replaceFirst("密碼", "\n密碼");
        } else {
            textView = this.code;
            str = redeemHistoryDetailData.getSerial();
        }
        textView.setText(str);
        this.expiredDate.setText(redeemHistoryDetailData.getExpireDate());
        int i = 0;
        this.redeem.setVisibility(0);
        ImageButton imageButton = this.url;
        if (redeemHistoryDetailData.getUrl().isEmpty()) {
            i = 8;
        }
        imageButton.setVisibility(i);
        this.webView.loadDataWithBaseURL((String) null, redeemHistoryDetailData.getNotice(), "text/html", HTTP.UTF_8, (String) null);
    }

    /* renamed from: a */
    public void mo12665a(boolean z) {
        ImageButton imageButton;
        int i;
        this.f13211e = z;
        if (this.f13211e) {
            imageButton = this.redeem;
            i = C4959j.gift_btn_hadex;
        } else {
            imageButton = this.redeem;
            i = C4959j.gift_btn_ex;
        }
        imageButton.setImageResource(i);
        this.redeem.setEnabled(!this.f13211e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12594a(boolean z, int i) {
        if (z) {
            this.view.setBackgroundResource(i);
        }
    }

    /* renamed from: b */
    public void mo12666b() {
        this.url.setVisibility(8);
        this.redeem.setVisibility(8);
        this.webView.setOnEventListener(new C4501a(this));
    }

    /* renamed from: b */
    public void mo12667b(boolean z) {
        this.url.setEnabled(z);
        this.redeem.setEnabled(z);
        if (!z) {
            this.redeem.setImageResource(C4959j.gift_btn_hadex);
        }
    }

    /* renamed from: g */
    public void mo12668g() {
        Toast.makeText(this.f13208b, C4961l.g_copy_done, 0).show();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo12598j() {
        return C4957h.fragment_redemption_detail_cm;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f13208b = getActivity().getBaseContext();
        this.f13210d = getArguments().getInt("ID");
        boolean z = getArguments().getBoolean("ENABLE");
        this.f13207a.mo12682a(z, this.f13210d);
        mo12666b();
        mo12667b(z);
        this.f13207a.mo12683b(this.f13210d);
    }

    /* access modifiers changed from: package-private */
    public void onCopyClick() {
        ((ClipboardManager) this.f13208b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText((CharSequence) null, this.f13209c.getSerial()));
        mo12668g();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13207a = new C4515o(this, new C4512l());
    }

    /* access modifiers changed from: package-private */
    public void onRedeemClick() {
        m17840k();
    }

    /* access modifiers changed from: package-private */
    public void onUrlClick() {
        C4883m.m19240c(getActivity(), this.f13209c.getUrl());
    }
}
