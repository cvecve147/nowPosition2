package com.openlife.checkme.net.model;

import com.openlife.checkme.p094d.C4947j;
import com.openlife.checkme.p097f.C4952b;

public class VerifyOtpBody extends C4952b {
    private String mobile;
    private String otp;

    public VerifyOtpBody(String str, String str2) {
        this.mobile = str;
        this.otp = str2;
        setAccount(C4947j.m19536a().mo13553d().mo13476a());
    }
}
