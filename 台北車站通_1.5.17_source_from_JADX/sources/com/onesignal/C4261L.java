package com.onesignal;

import com.onesignal.C4306Xa;

/* renamed from: com.onesignal.L */
class C4261L implements Runnable {
    C4261L() {
    }

    public void run() {
        try {
            Thread.sleep((long) C4264M.m16934h());
            C4306Xa.m17135a(C4306Xa.C4316j.WARN, "Location permission exists but GoogleApiClient timed out. Maybe related to mismatch google-play aar versions.");
            C4264M.m16931e();
            C4264M.m16924a(C4264M.f12649d);
        } catch (InterruptedException unused) {
        }
    }
}
