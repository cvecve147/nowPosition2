package com.openlife.checkme.net.model;

import com.openlife.checkme.p097f.C4953c;

public class UserSignInResponse extends C4953c<UserSignInData> {
    public UserSignInData getData() {
        T t = this.data;
        return t != null ? (UserSignInData) t : new UserSignInData();
    }
}
