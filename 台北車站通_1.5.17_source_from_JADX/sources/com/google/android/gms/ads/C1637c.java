package com.google.android.gms.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.C1819b;
import com.google.android.gms.internal.ads.C3187iu;
import com.google.android.gms.internal.ads.C3220ju;
import java.util.Date;

/* renamed from: com.google.android.gms.ads.c */
public final class C1637c {

    /* renamed from: a */
    private final C3187iu f5456a;

    /* renamed from: com.google.android.gms.ads.c$a */
    public static final class C1638a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C3220ju f5457a = new C3220ju();

        public C1638a() {
            this.f5457a.mo9630b("B3EEABB8EE11C2BE770B684D95219ECB");
        }

        /* renamed from: a */
        public final C1638a mo6567a(int i) {
            this.f5457a.mo9624a(i);
            return this;
        }

        /* renamed from: a */
        public final C1638a mo6568a(Location location) {
            this.f5457a.mo9625a(location);
            return this;
        }

        /* renamed from: a */
        public final C1638a mo6569a(Class<? extends C1819b> cls, Bundle bundle) {
            this.f5457a.mo9626a(cls, bundle);
            if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
                this.f5457a.mo9632c("B3EEABB8EE11C2BE770B684D95219ECB");
            }
            return this;
        }

        /* renamed from: a */
        public final C1638a mo6570a(String str) {
            this.f5457a.mo9627a(str);
            return this;
        }

        /* renamed from: a */
        public final C1638a mo6571a(Date date) {
            this.f5457a.mo9628a(date);
            return this;
        }

        /* renamed from: a */
        public final C1638a mo6572a(boolean z) {
            this.f5457a.mo9631b(z);
            return this;
        }

        /* renamed from: a */
        public final C1637c mo6573a() {
            return new C1637c(this);
        }

        /* renamed from: b */
        public final C1638a mo6574b(String str) {
            this.f5457a.mo9630b(str);
            return this;
        }

        /* renamed from: b */
        public final C1638a mo6575b(boolean z) {
            this.f5457a.mo9629a(z);
            return this;
        }
    }

    private C1637c(C1638a aVar) {
        this.f5456a = new C3187iu(aVar.f5457a);
    }

    /* renamed from: a */
    public final C3187iu mo6566a() {
        return this.f5456a;
    }
}
