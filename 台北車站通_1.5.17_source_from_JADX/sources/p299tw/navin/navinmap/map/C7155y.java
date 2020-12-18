package p299tw.navin.navinmap.map;

import android.os.CountDownTimer;

/* renamed from: tw.navin.navinmap.map.y */
class C7155y extends CountDownTimer {

    /* renamed from: a */
    final /* synthetic */ C7030F f19839a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7155y(C7030F f, long j, long j2) {
        super(j, j2);
        this.f19839a = f;
    }

    public void onFinish() {
        this.f19839a.m26428d(true);
    }

    public void onTick(long j) {
    }
}
