package com.openlife.checkme.activity.gift.detail;

import android.content.Context;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.openlife.checkme.C4452a;
import com.openlife.checkme.C4948e;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4959j;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.C4672k;
import com.openlife.checkme.net.model.GiftDetailData;
import com.openlife.checkme.p093c.C4883m;
import org.apache.http.protocol.HTTP;
import p013b.p018b.p028h.p029a.C1006a;
import p101d.p108c.p109a.C5197l;

public class GiftDetailFragment extends C4672k<C4586l, C4583i> implements C4582h {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C4586l f13338a;

    /* renamed from: b */
    private Context f13339b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f13340c;
    ImageView cover;
    TextView last;
    TextView point;
    Button redeem;
    TextView title;
    WebView webView;

    /* renamed from: a */
    public static GiftDetailFragment m18074a(int i) {
        GiftDetailFragment giftDetailFragment = new GiftDetailFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("ID", i);
        giftDetailFragment.setArguments(bundle);
        return giftDetailFragment;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C4586l mo12600l() {
        return this.f13338a;
    }

    /* renamed from: a */
    public void mo12783a(int i, String str) {
        C5197l.C5198a aVar = new C5197l.C5198a(getActivity());
        aVar.mo14400g(C4961l.app_name);
        aVar.mo14383a((CharSequence) str);
        aVar.mo14399f(C4961l.g_agree);
        aVar.mo14391b((C5197l.C5207j) new C4578d(this, i));
        aVar.mo14395c();
    }

    /* renamed from: a */
    public void mo12784a(GiftDetailData giftDetailData) {
        Button button;
        int i;
        Context context;
        ImageLoader.getInstance().displayImage(giftDetailData.getImage(), this.cover, C4452a.m17659a(C4959j.default_gift));
        this.title.setText(giftDetailData.getName());
        this.point.setText(giftDetailData.getPointStr());
        this.last.setText(getString(C4961l.giftdetail_last, new Object[]{giftDetailData.getStockStr()}));
        this.webView.loadDataWithBaseURL((String) null, giftDetailData.getNotice(), "text/html", HTTP.UTF_8, (String) null);
        if (giftDetailData.getStatus() == 1) {
            this.redeem.setEnabled(true);
            this.redeem.setText(getString(C4961l.giftdetail_b_redeem));
            button = this.redeem;
            context = this.f13339b;
            i = C4948e.cyan;
        } else {
            this.redeem.setEnabled(false);
            this.redeem.setText(getString(C4961l.giftdetail_b_nostock));
            button = this.redeem;
            context = this.f13339b;
            i = C4948e.mediumgray;
        }
        button.setBackgroundColor(C1006a.m5386a(context, i));
        this.redeem.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12594a(boolean z, int i) {
        if (z) {
            this.redeem.setBackgroundColor(getResources().getColor(i));
        }
    }

    /* renamed from: b */
    public void mo12785b() {
        WebSettings settings = this.webView.getSettings();
        settings.setBuiltInZoomControls(false);
        settings.setSupportZoom(true);
        this.webView.setWebChromeClient(new WebChromeClient());
        this.webView.setWebViewClient(new C4575a(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo12786g() {
        C5197l.C5198a aVar = new C5197l.C5198a(getActivity());
        aVar.mo14400g(C4961l.app_name);
        aVar.mo14378a(C4961l.giftdetail_a_confirm);
        aVar.mo14399f(C4961l.g_agree);
        aVar.mo14396d(C4961l.g_cancel);
        aVar.mo14391b((C5197l.C5207j) new C4577c(this));
        aVar.mo14395c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo12598j() {
        return C4957h.fragment_gift_detail_cm;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f13339b = getActivity().getBaseContext();
        this.f13340c = getArguments().getInt("ID");
        mo12785b();
        this.f13338a.mo12683b(this.f13340c);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13338a = new C4586l(this, new C4583i());
    }

    /* access modifiers changed from: package-private */
    public void redeemGift() {
        if (C4883m.m19229a(getActivity())) {
            C5197l.C5198a aVar = new C5197l.C5198a(getActivity());
            aVar.mo14400g(C4961l.app_name);
            aVar.mo14378a(C4961l.giftdetail_a_redeem);
            aVar.mo14399f(C4961l.g_confirm);
            aVar.mo14396d(C4961l.g_cancel);
            aVar.mo14391b((C5197l.C5207j) new C4576b(this));
            aVar.mo14395c();
        }
    }
}
