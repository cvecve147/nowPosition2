package com.openlife.checkme.net.model;

import com.openlife.checkme.p097f.C4953c;

public class UserInfoResponse extends C4953c<UserInfoData> {
    public UserInfoData getData() {
        T t = this.data;
        return t != null ? (UserInfoData) t : new UserInfoData();
    }
}
