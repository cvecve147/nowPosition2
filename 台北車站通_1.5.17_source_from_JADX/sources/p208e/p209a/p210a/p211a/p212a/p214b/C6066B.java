package p208e.p209a.p210a.p211a.p212a.p214b;

import android.os.SystemClock;
import android.util.Log;

/* renamed from: e.a.a.a.a.b.B */
public class C6066B {

    /* renamed from: a */
    private final String f16975a;

    /* renamed from: b */
    private final String f16976b;

    /* renamed from: c */
    private final boolean f16977c;

    /* renamed from: d */
    private long f16978d;

    /* renamed from: e */
    private long f16979e;

    public C6066B(String str, String str2) {
        this.f16975a = str;
        this.f16976b = str2;
        this.f16977c = !Log.isLoggable(str2, 2);
    }

    /* renamed from: c */
    private void m22991c() {
        String str = this.f16976b;
        Log.v(str, this.f16975a + ": " + this.f16979e + "ms");
    }

    /* renamed from: a */
    public synchronized void mo16038a() {
        if (!this.f16977c) {
            this.f16978d = SystemClock.elapsedRealtime();
            this.f16979e = 0;
        }
    }

    /* renamed from: b */
    public synchronized void mo16039b() {
        if (!this.f16977c) {
            if (this.f16979e == 0) {
                this.f16979e = SystemClock.elapsedRealtime() - this.f16978d;
                m22991c();
            }
        }
    }
}
