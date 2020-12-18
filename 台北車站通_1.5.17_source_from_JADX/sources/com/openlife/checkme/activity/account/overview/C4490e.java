package com.openlife.checkme.activity.account.overview;

import com.openlife.checkme.activity.C4673l;
import com.openlife.checkme.net.model.PointBody;
import com.openlife.checkme.net.model.PointResponse;
import com.openlife.checkme.net.model.UserInviteCodeBody;
import com.openlife.checkme.net.model.UserInviteCodeResponse;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.activity.account.overview.e */
public class C4490e extends C4673l implements C4487b {
    /* renamed from: a */
    public PointBody mo12641a() {
        return new PointBody();
    }

    /* renamed from: a */
    public UserInviteCodeBody mo12642a(String str) {
        return new UserInviteCodeBody(str);
    }

    /* renamed from: a */
    public C6433l<PointResponse> mo12643a(PointBody pointBody) {
        return this.f13552a.mo13605b().mo13578a(pointBody.getSignature(), pointBody);
    }

    /* renamed from: a */
    public C6433l<UserInviteCodeResponse> mo12644a(UserInviteCodeBody userInviteCodeBody) {
        return this.f13552a.mo13605b().mo13587a(userInviteCodeBody.getSignature(), userInviteCodeBody);
    }
}
