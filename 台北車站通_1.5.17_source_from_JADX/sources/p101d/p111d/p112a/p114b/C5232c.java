package p101d.p111d.p112a.p114b;

import android.os.SystemClock;
import android.util.Log;

/* renamed from: d.d.a.b.c */
class C5232c {

    /* renamed from: a */
    private long f14777a;

    /* renamed from: b */
    private long f14778b;

    /* renamed from: c */
    private int f14779c;

    C5232c() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14489a() {
        if (C5233d.m20213a()) {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f14777a = uptimeMillis;
            this.f14778b = uptimeMillis;
            this.f14779c = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo14490b() {
        if (C5233d.m20213a()) {
            long uptimeMillis = SystemClock.uptimeMillis() - this.f14777a;
            if (uptimeMillis > 40) {
                Log.e("GestureFps", "Frame time: " + uptimeMillis);
            } else if (uptimeMillis > 20) {
                Log.w("GestureFps", "Frame time: " + uptimeMillis);
            }
            this.f14779c++;
            this.f14777a = SystemClock.uptimeMillis();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo14491c() {
        if (C5233d.m20213a() && this.f14779c > 0) {
            Log.d("GestureFps", "Average FPS: " + Math.round((((float) this.f14779c) * 1000.0f) / ((float) ((int) (SystemClock.uptimeMillis() - this.f14778b)))));
        }
    }
}
