package com.openlife.checkme.net.model;

import com.openlife.checkme.p097f.C4952b;
import p101d.p129g.p152e.p153a.C5598c;

public class UserInviteCodeBody extends C4952b {
    @C5598c("invite_code")
    private String inviteCode;

    public UserInviteCodeBody(String str) {
        this.inviteCode = str;
    }
}
