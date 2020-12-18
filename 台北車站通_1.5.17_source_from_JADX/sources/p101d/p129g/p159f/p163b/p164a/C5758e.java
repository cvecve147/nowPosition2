package p101d.p129g.p159f.p163b.p164a;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.util.Log;
import java.io.IOException;

/* renamed from: d.g.f.b.a.e */
public final class C5758e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f15912a = "e";

    /* renamed from: b */
    private final Context f15913b;

    /* renamed from: c */
    private boolean f15914c = true;

    /* renamed from: d */
    private boolean f15915d = false;

    public C5758e(Activity activity) {
        activity.setVolumeControlStream(3);
        this.f15913b = activity.getApplicationContext();
    }

    /* renamed from: a */
    public void mo15353a(boolean z) {
        this.f15914c = z;
    }

    /* renamed from: b */
    public MediaPlayer mo15354b() {
        AssetFileDescriptor openRawResourceFd;
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(3);
        mediaPlayer.setOnCompletionListener(new C5756c(this));
        mediaPlayer.setOnErrorListener(new C5757d(this));
        try {
            openRawResourceFd = this.f15913b.getResources().openRawResourceFd(C5768n.zxing_beep);
            mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
            openRawResourceFd.close();
            mediaPlayer.setVolume(0.1f, 0.1f);
            mediaPlayer.prepare();
            mediaPlayer.start();
            return mediaPlayer;
        } catch (IOException e) {
            Log.w(f15912a, e);
            mediaPlayer.release();
            return null;
        } catch (Throwable th) {
            openRawResourceFd.close();
            throw th;
        }
    }

    /* renamed from: c */
    public synchronized void mo15355c() {
        if (this.f15914c) {
            mo15354b();
        }
        if (this.f15915d) {
            ((Vibrator) this.f15913b.getSystemService("vibrator")).vibrate(200);
        }
    }
}
