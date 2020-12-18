package p101d.p129g.p159f.p163b.p164a;

import android.media.MediaPlayer;
import android.util.Log;

/* renamed from: d.g.f.b.a.d */
class C5757d implements MediaPlayer.OnErrorListener {

    /* renamed from: a */
    final /* synthetic */ C5758e f15911a;

    C5757d(C5758e eVar) {
        this.f15911a = eVar;
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        String a = C5758e.f15912a;
        Log.w(a, "Failed to beep " + i + ", " + i2);
        mediaPlayer.stop();
        mediaPlayer.release();
        return true;
    }
}
