package p101d.p129g.p159f.p163b.p164a;

import android.media.MediaPlayer;

/* renamed from: d.g.f.b.a.c */
class C5756c implements MediaPlayer.OnCompletionListener {

    /* renamed from: a */
    final /* synthetic */ C5758e f15910a;

    C5756c(C5758e eVar) {
        this.f15910a = eVar;
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        mediaPlayer.stop();
        mediaPlayer.release();
    }
}
