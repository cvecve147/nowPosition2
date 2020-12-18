package com.openlife.checkme.activity.activity;

import com.openlife.checkme.activity.C4673l;
import com.openlife.checkme.net.model.ActivityBody;
import com.openlife.checkme.net.model.ActivityResponse;
import com.openlife.checkme.net.model.UserSignInBody;
import com.openlife.checkme.net.model.UserSignInResponse;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.activity.activity.e */
public class C4525e extends C4673l implements C4522b {
    /* renamed from: a */
    public ActivityBody mo12699a() {
        return new ActivityBody();
    }

    /* renamed from: a */
    public C6433l<ActivityResponse> mo12700a(ActivityBody activityBody) {
        return this.f13552a.mo13605b().mo13557a(activityBody.getSignature(), activityBody);
    }

    /* renamed from: a */
    public C6433l<UserSignInResponse> mo12701a(UserSignInBody userSignInBody) {
        return this.f13552a.mo13605b().mo13588a(userSignInBody.getSignature(), userSignInBody);
    }

    /* renamed from: b */
    public UserSignInBody mo12702b() {
        return new UserSignInBody();
    }
}
