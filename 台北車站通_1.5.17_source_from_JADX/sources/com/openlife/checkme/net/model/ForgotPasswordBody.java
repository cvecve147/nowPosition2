package com.openlife.checkme.net.model;

import com.openlife.checkme.p097f.C4952b;
import p101d.p129g.p152e.p153a.C5598c;

public class ForgotPasswordBody extends C4952b {
    @C5598c("email")
    private String email;

    public ForgotPasswordBody(String str) {
        this.email = str;
    }
}
