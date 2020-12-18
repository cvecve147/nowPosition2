package com.facebook;

/* renamed from: com.facebook.q */
public class C1575q extends C1574p {

    /* renamed from: a */
    private final C1352H f5356a;

    public C1575q(C1352H h, String str) {
        super(str);
        this.f5356a = h;
    }

    public final String toString() {
        C1352H h = this.f5356a;
        FacebookRequestError a = h != null ? h.mo5987a() : null;
        StringBuilder sb = new StringBuilder();
        sb.append("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(" ");
        }
        if (a != null) {
            sb.append("httpResponseCode: ");
            sb.append(a.mo5921f());
            sb.append(", facebookErrorCode: ");
            sb.append(a.mo5916b());
            sb.append(", facebookErrorType: ");
            sb.append(a.mo5918d());
            sb.append(", message: ");
            sb.append(a.mo5917c());
            sb.append("}");
        }
        return sb.toString();
    }
}
