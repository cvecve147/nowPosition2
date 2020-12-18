package com.facebook;

/* renamed from: com.facebook.h */
public enum C1427h {
    NONE(false),
    FACEBOOK_APPLICATION_WEB(true),
    FACEBOOK_APPLICATION_NATIVE(true),
    FACEBOOK_APPLICATION_SERVICE(true),
    WEB_VIEW(true),
    CHROME_CUSTOM_TAB(true),
    TEST_USER(true),
    CLIENT_TOKEN(true),
    DEVICE_AUTH(true);
    

    /* renamed from: k */
    private final boolean f5010k;

    private C1427h(boolean z) {
        this.f5010k = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo6097a() {
        return this.f5010k;
    }
}
