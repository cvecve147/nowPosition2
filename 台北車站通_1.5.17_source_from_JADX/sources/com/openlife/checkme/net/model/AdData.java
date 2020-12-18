package com.openlife.checkme.net.model;

import java.util.ArrayList;
import java.util.List;
import p101d.p129g.p152e.p153a.C5598c;

public class AdData {
    @C5598c("banner")
    private List<AdBannerData> banner;
    @C5598c("interstitial_Ad")
    private List<AdInterstitial> interstitialAd;

    public AdData() {
    }

    public AdData(List<AdBannerData> list, List<AdInterstitial> list2) {
        this.banner = list;
        this.interstitialAd = list2;
    }

    public List<AdBannerData> getBanner() {
        List<AdBannerData> list = this.banner;
        return list != null ? list : new ArrayList();
    }

    public List<AdInterstitial> getInterstitialAd() {
        List<AdInterstitial> list = this.interstitialAd;
        return list != null ? list : new ArrayList();
    }
}
