package com.openlife.checkme.checkme_special.home.adapter;

import com.openlife.checkme.net.model.AdBannerData;
import com.openlife.checkme.net.model.MissionData;
import java.util.List;

/* renamed from: com.openlife.checkme.checkme_special.home.adapter.b */
public class C4902b {

    /* renamed from: a */
    private MissionData f14043a;

    /* renamed from: b */
    private int f14044b;

    /* renamed from: c */
    private List<AdBannerData> f14045c;

    /* renamed from: d */
    private C4903a f14046d;

    /* renamed from: com.openlife.checkme.checkme_special.home.adapter.b$a */
    public enum C4903a {
        NEAR_MISSION,
        NEAR_TITLE,
        MISSION,
        TITLE,
        BANNER
    }

    public C4902b(int i, C4903a aVar) {
        this.f14044b = i;
        this.f14046d = aVar;
    }

    public C4902b(MissionData missionData, C4903a aVar) {
        this.f14043a = missionData;
        this.f14046d = aVar;
    }

    public C4902b(List<AdBannerData> list) {
        this.f14045c = list;
        this.f14046d = C4903a.BANNER;
    }

    /* renamed from: a */
    public C4903a mo13451a() {
        return this.f14046d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4902b.class != obj.getClass()) {
            return false;
        }
        C4902b bVar = (C4902b) obj;
        if (this.f14044b != bVar.f14044b) {
            return false;
        }
        MissionData missionData = this.f14043a;
        if (missionData == null ? bVar.f14043a != null : !missionData.equalsNotIncludeDistance(bVar.f14043a)) {
            return false;
        }
        List<AdBannerData> list = this.f14045c;
        if (list == null ? bVar.f14045c == null : list.equals(bVar.f14045c)) {
            return this.f14046d == bVar.f14046d;
        }
        return false;
    }

    public int hashCode() {
        MissionData missionData = this.f14043a;
        int i = 0;
        int hashCode = (((missionData != null ? missionData.hashCode() : 0) * 31) + this.f14044b) * 31;
        List<AdBannerData> list = this.f14045c;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        C4903a aVar = this.f14046d;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode2 + i;
    }
}
