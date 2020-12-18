package com.google.android.gms.ads.mediation;

import android.os.Bundle;

/* renamed from: com.google.android.gms.ads.mediation.b */
public interface C1819b {

    /* renamed from: com.google.android.gms.ads.mediation.b$a */
    public static class C1820a {

        /* renamed from: a */
        private int f5938a;

        /* renamed from: a */
        public final Bundle mo7067a() {
            Bundle bundle = new Bundle();
            bundle.putInt("capabilities", this.f5938a);
            return bundle;
        }

        /* renamed from: a */
        public final C1820a mo7068a(int i) {
            this.f5938a = 1;
            return this;
        }
    }

    void onDestroy();

    void onPause();

    void onResume();
}
