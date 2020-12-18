package com.openlife.checkme.sdk;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.C4672k;
import com.openlife.checkme.activity.C4703m;
import com.openlife.checkme.activity.C4757r;
import com.openlife.checkme.activity.guide.GuideActivity;
import com.openlife.checkme.checkme_special.home.SpMainActivity;
import com.openlife.checkme.p093c.C4881k;
import com.openlife.checkme.p093c.C4883m;
import com.openlife.checkme.p094d.C4939b;
import com.openlife.checkme.p094d.C4947j;
import com.openlife.checkme.sdk.p099b.C4983b;
import com.openlife.checkme.sdk.p099b.C4985d;
import com.openlife.checkme.sdk.p099b.C4992k;
import p101d.p108c.p109a.C5197l;

/* renamed from: com.openlife.checkme.sdk.q */
public abstract class C5008q<P extends C4757r, M extends C4703m> extends C4672k implements C4983b {

    /* renamed from: a */
    private C4992k f14205a;

    /* renamed from: c */
    public void mo14001c() {
    }

    /* renamed from: f */
    public void mo14002f(int i) {
        C5197l.C5198a aVar = new C5197l.C5198a(getActivity());
        aVar.mo14383a((CharSequence) mo12966g(i));
        aVar.mo14394c((CharSequence) mo12966g(C4961l.g_ok));
        aVar.mo14391b((C5197l.C5207j) new C5007p(this));
        aVar.mo14385a(false);
        aVar.mo14395c();
    }

    /* renamed from: h */
    public void mo14003h(String str) {
    }

    /* renamed from: i */
    public void mo12968i() {
        C4947j.m19536a().mo13554e().mo13527c();
        C4947j.m19536a().mo13552c();
        boolean c = C4939b.m19479c(getActivity().getBaseContext());
        C4947j.m19536a().mo13553d().mo13496k();
        String d = C4947j.m19536a().mo13554e().mo13530d();
        Uri uri = C4881k.f13969a;
        if (((d.hashCode() == 52392498 && d.equals("74241")) ? (char) 0 : 65535) == 0) {
            if (c) {
                GuideActivity.m18194b(getActivity());
            } else if (uri != null) {
                C4883m.m19226a((Context) getActivity(), uri);
                C4881k.f13969a = null;
            } else {
                SpMainActivity.m19279a(getActivity());
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f14205a = new C4992k(this, new C4985d());
    }
}
