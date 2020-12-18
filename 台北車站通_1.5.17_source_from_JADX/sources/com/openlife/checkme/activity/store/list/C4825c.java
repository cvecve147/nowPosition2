package com.openlife.checkme.activity.store.list;

import com.openlife.checkme.activity.C4703m;
import com.openlife.checkme.net.model.ChainStoreListBody;
import com.openlife.checkme.net.model.ChainStoreListResponse;
import com.openlife.checkme.net.model.StreetStoreListBody;
import com.openlife.checkme.net.model.StreetStoreListResponse;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.activity.store.list.c */
public interface C4825c extends C4703m {
    /* renamed from: a */
    C6433l<ChainStoreListResponse> mo13306a(ChainStoreListBody chainStoreListBody);

    /* renamed from: a */
    C6433l<StreetStoreListResponse> mo13307a(StreetStoreListBody streetStoreListBody);

    /* renamed from: k */
    ChainStoreListBody mo13308k();

    /* renamed from: l */
    StreetStoreListBody mo13309l();
}
