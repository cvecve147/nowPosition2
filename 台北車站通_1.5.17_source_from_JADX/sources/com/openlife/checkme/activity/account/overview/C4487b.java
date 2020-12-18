package com.openlife.checkme.activity.account.overview;

import com.openlife.checkme.activity.C4703m;
import com.openlife.checkme.net.model.PointBody;
import com.openlife.checkme.net.model.PointResponse;
import com.openlife.checkme.net.model.UserInviteCodeBody;
import com.openlife.checkme.net.model.UserInviteCodeResponse;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.activity.account.overview.b */
public interface C4487b extends C4703m {
    /* renamed from: a */
    PointBody mo12641a();

    /* renamed from: a */
    UserInviteCodeBody mo12642a(String str);

    /* renamed from: a */
    C6433l<PointResponse> mo12643a(PointBody pointBody);

    /* renamed from: a */
    C6433l<UserInviteCodeResponse> mo12644a(UserInviteCodeBody userInviteCodeBody);
}
