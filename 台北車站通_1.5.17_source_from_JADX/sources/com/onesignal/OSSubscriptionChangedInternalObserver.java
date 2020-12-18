package com.onesignal;

class OSSubscriptionChangedInternalObserver {
    OSSubscriptionChangedInternalObserver() {
    }

    /* renamed from: a */
    static void m16990a(OSSubscriptionState oSSubscriptionState) {
        C4229Ca ca = new C4229Ca();
        ca.f12560b = C4306Xa.f12750S;
        ca.f12559a = (OSSubscriptionState) oSSubscriptionState.clone();
        if (C4306Xa.m17207u().mo12553c(ca)) {
            C4306Xa.f12750S = (OSSubscriptionState) oSSubscriptionState.clone();
            C4306Xa.f12750S.mo12374f();
        }
    }

    public void changed(OSSubscriptionState oSSubscriptionState) {
        m16990a(oSSubscriptionState);
    }
}
