package com.openlife.checkme.activity.account.history;

import com.openlife.checkme.activity.C4673l;
import com.openlife.checkme.net.model.PointHistoryBody;
import com.openlife.checkme.net.model.PointHistoryResponse;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.activity.account.history.e */
public class C4478e extends C4673l implements C4475b {
    /* renamed from: a */
    public PointHistoryBody mo12623a() {
        return new PointHistoryBody();
    }

    /* renamed from: a */
    public C6433l<PointHistoryResponse> mo12624a(PointHistoryBody pointHistoryBody) {
        return this.f13552a.mo13605b().mo13579a(pointHistoryBody.getSignature(), pointHistoryBody);
    }
}
