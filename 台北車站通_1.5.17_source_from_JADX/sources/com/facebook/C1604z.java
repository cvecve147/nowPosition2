package com.facebook;

/* renamed from: com.facebook.z */
public class C1604z extends C1574p {

    /* renamed from: a */
    private final FacebookRequestError f5414a;

    public C1604z(FacebookRequestError facebookRequestError, String str) {
        super(str);
        this.f5414a = facebookRequestError;
    }

    /* renamed from: a */
    public final FacebookRequestError mo6464a() {
        return this.f5414a;
    }

    public final String toString() {
        return "{FacebookServiceException: " + "httpResponseCode: " + this.f5414a.mo5921f() + ", facebookErrorCode: " + this.f5414a.mo5916b() + ", facebookErrorType: " + this.f5414a.mo5918d() + ", message: " + this.f5414a.mo5917c() + "}";
    }
}
