package com.openlife.checkme.net.model;

import com.openlife.checkme.p097f.C4952b;
import p101d.p129g.p152e.p153a.C5598c;

public class UserRegisterBody extends C4952b {
    @C5598c("email")
    private String email;
    @C5598c("gender")
    private String gender;
    @C5598c("nickname")
    private String nickname;
    @C5598c("password")
    private String password;

    public UserRegisterBody(String str, String str2, String str3, String str4) {
        this.email = str;
        this.password = str2;
        this.nickname = str3;
        this.gender = str4;
        setAccount((String) null);
    }
}
