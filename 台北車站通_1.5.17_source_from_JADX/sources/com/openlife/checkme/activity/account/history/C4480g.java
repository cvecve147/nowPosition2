package com.openlife.checkme.activity.account.history;

import com.openlife.checkme.net.model.PointHistoryResponse;
import com.openlife.checkme.p097f.C4953c;
import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.activity.account.history.g */
class C4480g implements C6242d<PointHistoryResponse> {

    /* renamed from: a */
    final /* synthetic */ int f13173a;

    /* renamed from: b */
    final /* synthetic */ C4481h f13174b;

    C4480g(C4481h hVar, int i) {
        this.f13174b = hVar;
        this.f13173a = i;
    }

    /* renamed from: a */
    public void accept(PointHistoryResponse pointHistoryResponse) {
        if (this.f13174b.mo13153a((C4953c) pointHistoryResponse)) {
            if (this.f13173a == 3) {
                this.f13174b.f13175d.mo12617b();
            }
            if (!pointHistoryResponse.getData().isEmpty()) {
                this.f13174b.f13175d.mo12616a(pointHistoryResponse.getData());
            } else {
                this.f13174b.f13175d.mo12615a();
            }
        }
    }
}
