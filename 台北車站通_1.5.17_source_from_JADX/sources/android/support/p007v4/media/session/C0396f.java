package android.support.p007v4.media.session;

import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

/* renamed from: android.support.v4.media.session.f */
class C0396f {

    /* renamed from: android.support.v4.media.session.f$a */
    public interface C0397a {
        /* renamed from: a */
        void mo1698a(int i, int i2, int i3, int i4, int i5);

        /* renamed from: a */
        void mo1699a(CharSequence charSequence);

        /* renamed from: a */
        void mo1700a(Object obj);

        /* renamed from: a */
        void mo1701a(String str, Bundle bundle);

        /* renamed from: a */
        void mo1702a(List<?> list);

        /* renamed from: b */
        void mo1703b(Object obj);

        /* renamed from: f */
        void mo1704f(Bundle bundle);

        /* renamed from: w */
        void mo1705w();
    }

    /* renamed from: android.support.v4.media.session.f$b */
    static class C0398b<T extends C0397a> extends MediaController.Callback {

        /* renamed from: a */
        protected final T f1633a;

        public C0398b(T t) {
            this.f1633a = t;
        }

        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            this.f1633a.mo1698a(playbackInfo.getPlaybackType(), C0399c.m1949b(playbackInfo), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }

        public void onExtrasChanged(Bundle bundle) {
            this.f1633a.mo1704f(bundle);
        }

        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.f1633a.mo1700a((Object) mediaMetadata);
        }

        public void onPlaybackStateChanged(PlaybackState playbackState) {
            this.f1633a.mo1703b(playbackState);
        }

        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            this.f1633a.mo1702a((List<?>) list);
        }

        public void onQueueTitleChanged(CharSequence charSequence) {
            this.f1633a.mo1699a(charSequence);
        }

        public void onSessionDestroyed() {
            this.f1633a.mo1705w();
        }

        public void onSessionEvent(String str, Bundle bundle) {
            this.f1633a.mo1701a(str, bundle);
        }
    }

    /* renamed from: android.support.v4.media.session.f$c */
    public static class C0399c {
        /* renamed from: a */
        private static int m1947a(AudioAttributes audioAttributes) {
            if ((audioAttributes.getFlags() & 1) == 1) {
                return 7;
            }
            if ((audioAttributes.getFlags() & 4) == 4) {
                return 6;
            }
            switch (audioAttributes.getUsage()) {
                case 1:
                case 11:
                case 12:
                case 14:
                    return 3;
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                case 13:
                    return 1;
                default:
                    return 3;
            }
        }

        /* renamed from: a */
        public static AudioAttributes m1948a(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getAudioAttributes();
        }

        /* renamed from: b */
        public static int m1949b(Object obj) {
            return m1947a(m1948a(obj));
        }
    }

    /* renamed from: a */
    public static Object m1938a(C0397a aVar) {
        return new C0398b(aVar);
    }
}
