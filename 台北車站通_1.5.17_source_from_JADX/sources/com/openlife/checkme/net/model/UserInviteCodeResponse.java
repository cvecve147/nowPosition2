package com.openlife.checkme.net.model;

import com.openlife.checkme.p097f.C4953c;

public class UserInviteCodeResponse extends C4953c<UserInviteCodeData> {
    public UserInviteCodeData getData() {
        T t = this.data;
        return t != null ? (UserInviteCodeData) t : new UserInviteCodeData();
    }
}
