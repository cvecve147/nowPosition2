package com.openlife.checkme.activity.activity;

import com.openlife.checkme.activity.C4703m;
import com.openlife.checkme.net.model.ActivityBody;
import com.openlife.checkme.net.model.ActivityResponse;
import com.openlife.checkme.net.model.UserSignInBody;
import com.openlife.checkme.net.model.UserSignInResponse;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.activity.activity.b */
public interface C4522b extends C4703m {
    /* renamed from: a */
    ActivityBody mo12699a();

    /* renamed from: a */
    C6433l<ActivityResponse> mo12700a(ActivityBody activityBody);

    /* renamed from: a */
    C6433l<UserSignInResponse> mo12701a(UserSignInBody userSignInBody);

    /* renamed from: b */
    UserSignInBody mo12702b();
}
