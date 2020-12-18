package com.openlife.checkme.activity.store.list;

import com.openlife.checkme.activity.C4673l;
import com.openlife.checkme.activity.C4703m;
import com.openlife.checkme.net.model.ChainStoreListBody;
import com.openlife.checkme.net.model.ChainStoreListResponse;
import com.openlife.checkme.net.model.StreetStoreListBody;
import com.openlife.checkme.net.model.StreetStoreListResponse;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.activity.store.list.f */
public class C4828f extends C4673l implements C4703m, C4825c {
    /* renamed from: a */
    public C6433l<ChainStoreListResponse> mo13306a(ChainStoreListBody chainStoreListBody) {
        return this.f13552a.mo13605b().mo13562a(chainStoreListBody.getSignature(), chainStoreListBody);
    }

    /* renamed from: a */
    public C6433l<StreetStoreListResponse> mo13307a(StreetStoreListBody streetStoreListBody) {
        return this.f13552a.mo13605b().mo13584a(streetStoreListBody.getSignature(), streetStoreListBody);
    }

    /* renamed from: k */
    public ChainStoreListBody mo13308k() {
        return new ChainStoreListBody();
    }

    /* renamed from: l */
    public StreetStoreListBody mo13309l() {
        return new StreetStoreListBody();
    }
}
