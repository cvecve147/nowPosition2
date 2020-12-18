package android.support.p007v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

/* renamed from: android.support.v4.media.session.n */
class C0407n {

    /* renamed from: android.support.v4.media.session.n$a */
    static final class C0408a {
        /* renamed from: a */
        public static String m1961a(Object obj) {
            return ((PlaybackState.CustomAction) obj).getAction();
        }

        /* renamed from: b */
        public static Bundle m1962b(Object obj) {
            return ((PlaybackState.CustomAction) obj).getExtras();
        }

        /* renamed from: c */
        public static int m1963c(Object obj) {
            return ((PlaybackState.CustomAction) obj).getIcon();
        }

        /* renamed from: d */
        public static CharSequence m1964d(Object obj) {
            return ((PlaybackState.CustomAction) obj).getName();
        }
    }

    /* renamed from: a */
    public static long m1952a(Object obj) {
        return ((PlaybackState) obj).getActions();
    }

    /* renamed from: b */
    public static long m1953b(Object obj) {
        return ((PlaybackState) obj).getActiveQueueItemId();
    }

    /* renamed from: c */
    public static long m1954c(Object obj) {
        return ((PlaybackState) obj).getBufferedPosition();
    }

    /* renamed from: d */
    public static List<Object> m1955d(Object obj) {
        return ((PlaybackState) obj).getCustomActions();
    }

    /* renamed from: e */
    public static CharSequence m1956e(Object obj) {
        return ((PlaybackState) obj).getErrorMessage();
    }

    /* renamed from: f */
    public static long m1957f(Object obj) {
        return ((PlaybackState) obj).getLastPositionUpdateTime();
    }

    /* renamed from: g */
    public static float m1958g(Object obj) {
        return ((PlaybackState) obj).getPlaybackSpeed();
    }

    /* renamed from: h */
    public static long m1959h(Object obj) {
        return ((PlaybackState) obj).getPosition();
    }

    /* renamed from: i */
    public static int m1960i(Object obj) {
        return ((PlaybackState) obj).getState();
    }
}
