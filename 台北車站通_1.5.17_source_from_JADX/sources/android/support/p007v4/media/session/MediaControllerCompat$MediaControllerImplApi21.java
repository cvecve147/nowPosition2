package android.support.p007v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.p007v4.app.C0330h;
import android.support.p007v4.media.MediaMetadataCompat;
import android.support.p007v4.media.session.C0387b;
import android.support.p007v4.media.session.C0390c;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 */
class MediaControllerCompat$MediaControllerImplApi21 implements C0394d {

    /* renamed from: a */
    private final List<C0390c> f1590a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C0387b f1591b;

    /* renamed from: c */
    private HashMap<C0390c, C0384a> f1592c;

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: a */
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> f1593a;

        /* access modifiers changed from: protected */
        public void onReceiveResult(int i, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = (MediaControllerCompat$MediaControllerImplApi21) this.f1593a.get();
            if (mediaControllerCompat$MediaControllerImplApi21 != null && bundle != null) {
                C0387b unused = mediaControllerCompat$MediaControllerImplApi21.f1591b = C0387b.C0388a.m1905a(C0330h.m1458a(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
                mediaControllerCompat$MediaControllerImplApi21.m1879a();
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
    private static class C0384a extends C0390c.C0393c {
        C0384a(C0390c cVar) {
            super(cVar);
        }

        /* renamed from: a */
        public void mo1653a(MediaMetadataCompat mediaMetadataCompat) {
            throw new AssertionError();
        }

        /* renamed from: a */
        public void mo1654a(ParcelableVolumeInfo parcelableVolumeInfo) {
            throw new AssertionError();
        }

        /* renamed from: a */
        public void mo1655a(CharSequence charSequence) {
            throw new AssertionError();
        }

        /* renamed from: a */
        public void mo1656a(List<MediaSessionCompat$QueueItem> list) {
            throw new AssertionError();
        }

        /* renamed from: f */
        public void mo1657f(Bundle bundle) {
            throw new AssertionError();
        }

        /* renamed from: w */
        public void mo1658w() {
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1879a() {
        if (this.f1591b != null) {
            synchronized (this.f1590a) {
                for (C0390c next : this.f1590a) {
                    C0384a aVar = new C0384a(next);
                    this.f1592c.put(next, aVar);
                    next.f1625c = true;
                    try {
                        this.f1591b.mo1685a(aVar);
                        next.mo1696b();
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                    }
                }
                this.f1590a.clear();
            }
        }
    }
}
