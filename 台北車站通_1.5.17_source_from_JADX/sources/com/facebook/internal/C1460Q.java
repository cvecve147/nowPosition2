package com.facebook.internal;

import com.facebook.internal.C1461S;

/* renamed from: com.facebook.internal.Q */
class C1460Q implements Runnable {
    C1460Q() {
    }

    public void run() {
        try {
            for (C1461S.C1465d a : C1461S.f5086b) {
                a.m6884a(true);
            }
        } finally {
            C1461S.f5088d.set(false);
        }
    }
}
