package com.openlife.checkme.activity.home;

import com.openlife.checkme.net.model.GiftData;
import com.openlife.checkme.net.model.MissionData;
import java.util.List;

/* renamed from: com.openlife.checkme.activity.home.y */
public class C4667y {

    /* renamed from: a */
    private int f13532a;

    /* renamed from: b */
    private List<GiftData> f13533b;

    /* renamed from: c */
    private MissionData f13534c;

    /* renamed from: d */
    private C4668a f13535d;

    /* renamed from: com.openlife.checkme.activity.home.y$a */
    public enum C4668a {
        RECOMMEND_GIFT_TITLE,
        RECOMMEND_GIFT,
        MISSION_TITLE,
        MISSION_CONTENT,
        NEAR_MISSION_TITLE,
        NEAR_MISSION_CONTENT
    }

    public C4667y(int i, C4668a aVar) {
        this.f13532a = i;
        this.f13535d = aVar;
    }

    public C4667y(MissionData missionData, C4668a aVar) {
        this.f13534c = missionData;
        this.f13535d = aVar;
    }

    public C4667y(List<GiftData> list) {
        this.f13533b = list;
        this.f13535d = C4668a.RECOMMEND_GIFT;
    }

    /* renamed from: a */
    public C4668a mo12952a() {
        return this.f13535d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4667y.class != obj.getClass()) {
            return false;
        }
        C4667y yVar = (C4667y) obj;
        if (this.f13532a != yVar.f13532a) {
            return false;
        }
        List<GiftData> list = this.f13533b;
        if (list == null ? yVar.f13533b != null : !list.equals(yVar.f13533b)) {
            return false;
        }
        MissionData missionData = this.f13534c;
        if (missionData == null ? yVar.f13534c == null : missionData.equals(yVar.f13534c)) {
            return this.f13535d == yVar.f13535d;
        }
        return false;
    }

    public int hashCode() {
        int i = this.f13532a * 31;
        List<GiftData> list = this.f13533b;
        int i2 = 0;
        int hashCode = (i + (list != null ? list.hashCode() : 0)) * 31;
        MissionData missionData = this.f13534c;
        int hashCode2 = (hashCode + (missionData != null ? missionData.hashCode() : 0)) * 31;
        C4668a aVar = this.f13535d;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode2 + i2;
    }
}
