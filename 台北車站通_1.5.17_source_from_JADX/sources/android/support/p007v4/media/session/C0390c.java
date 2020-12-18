package android.support.p007v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.p007v4.media.MediaMetadataCompat;
import android.support.p007v4.media.session.C0385a;
import android.support.p007v4.media.session.C0396f;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: android.support.v4.media.session.c */
public abstract class C0390c implements IBinder.DeathRecipient {

    /* renamed from: a */
    private final Object f1623a;

    /* renamed from: b */
    C0391a f1624b;

    /* renamed from: c */
    boolean f1625c;

    /* renamed from: android.support.v4.media.session.c$a */
    private class C0391a extends Handler {
    }

    /* renamed from: android.support.v4.media.session.c$b */
    private static class C0392b implements C0396f.C0397a {

        /* renamed from: a */
        private final WeakReference<C0390c> f1626a;

        C0392b(C0390c cVar) {
            this.f1626a = new WeakReference<>(cVar);
        }

        /* renamed from: a */
        public void mo1698a(int i, int i2, int i3, int i4, int i5) {
            C0390c cVar = (C0390c) this.f1626a.get();
            if (cVar != null) {
                cVar.mo1692a(new C0395e(i, i2, i3, i4, i5));
            }
        }

        /* renamed from: a */
        public void mo1699a(CharSequence charSequence) {
            C0390c cVar = (C0390c) this.f1626a.get();
            if (cVar != null) {
                cVar.mo1693a(charSequence);
            }
        }

        /* renamed from: a */
        public void mo1700a(Object obj) {
            C0390c cVar = (C0390c) this.f1626a.get();
            if (cVar != null) {
                cVar.mo1690a(MediaMetadataCompat.m1856a(obj));
            }
        }

        /* renamed from: a */
        public void mo1701a(String str, Bundle bundle) {
            C0390c cVar = (C0390c) this.f1626a.get();
            if (cVar == null) {
                return;
            }
            if (!cVar.f1625c || Build.VERSION.SDK_INT >= 23) {
                cVar.mo1694a(str, bundle);
            }
        }

        /* renamed from: a */
        public void mo1702a(List<?> list) {
            C0390c cVar = (C0390c) this.f1626a.get();
            if (cVar != null) {
                cVar.mo1695a(MediaSessionCompat$QueueItem.m1888a(list));
            }
        }

        /* renamed from: b */
        public void mo1703b(Object obj) {
            C0390c cVar = (C0390c) this.f1626a.get();
            if (cVar != null && !cVar.f1625c) {
                cVar.mo1691a(PlaybackStateCompat.m1889a(obj));
            }
        }

        /* renamed from: f */
        public void mo1704f(Bundle bundle) {
            C0390c cVar = (C0390c) this.f1626a.get();
            if (cVar != null) {
                cVar.mo1689a(bundle);
            }
        }

        /* renamed from: w */
        public void mo1705w() {
            C0390c cVar = (C0390c) this.f1626a.get();
            if (cVar != null) {
                cVar.mo1687a();
            }
        }
    }

    /* renamed from: android.support.v4.media.session.c$c */
    private static class C0393c extends C0385a.C0386a {

        /* renamed from: a */
        private final WeakReference<C0390c> f1627a;

        C0393c(C0390c cVar) {
            this.f1627a = new WeakReference<>(cVar);
        }

        /* renamed from: L */
        public void mo1676L() {
            C0390c cVar = (C0390c) this.f1627a.get();
            if (cVar != null) {
                cVar.mo1688a(13, (Object) null, (Bundle) null);
            }
        }

        /* renamed from: a */
        public void mo1653a(MediaMetadataCompat mediaMetadataCompat) {
            C0390c cVar = (C0390c) this.f1627a.get();
            if (cVar != null) {
                cVar.mo1688a(3, mediaMetadataCompat, (Bundle) null);
            }
        }

        /* renamed from: a */
        public void mo1654a(ParcelableVolumeInfo parcelableVolumeInfo) {
            C0390c cVar = (C0390c) this.f1627a.get();
            if (cVar != null) {
                cVar.mo1688a(4, parcelableVolumeInfo != null ? new C0395e(parcelableVolumeInfo.f1600a, parcelableVolumeInfo.f1601b, parcelableVolumeInfo.f1602c, parcelableVolumeInfo.f1603d, parcelableVolumeInfo.f1604e) : null, (Bundle) null);
            }
        }

        /* renamed from: a */
        public void mo1677a(PlaybackStateCompat playbackStateCompat) {
            C0390c cVar = (C0390c) this.f1627a.get();
            if (cVar != null) {
                cVar.mo1688a(2, playbackStateCompat, (Bundle) null);
            }
        }

        /* renamed from: a */
        public void mo1655a(CharSequence charSequence) {
            C0390c cVar = (C0390c) this.f1627a.get();
            if (cVar != null) {
                cVar.mo1688a(6, charSequence, (Bundle) null);
            }
        }

        /* renamed from: a */
        public void mo1656a(List<MediaSessionCompat$QueueItem> list) {
            C0390c cVar = (C0390c) this.f1627a.get();
            if (cVar != null) {
                cVar.mo1688a(5, list, (Bundle) null);
            }
        }

        /* renamed from: b */
        public void mo1678b(int i) {
            C0390c cVar = (C0390c) this.f1627a.get();
            if (cVar != null) {
                cVar.mo1688a(9, Integer.valueOf(i), (Bundle) null);
            }
        }

        /* renamed from: b */
        public void mo1679b(boolean z) {
            C0390c cVar = (C0390c) this.f1627a.get();
            if (cVar != null) {
                cVar.mo1688a(11, Boolean.valueOf(z), (Bundle) null);
            }
        }

        /* renamed from: c */
        public void mo1680c(String str, Bundle bundle) {
            C0390c cVar = (C0390c) this.f1627a.get();
            if (cVar != null) {
                cVar.mo1688a(1, str, bundle);
            }
        }

        /* renamed from: c */
        public void mo1681c(boolean z) {
        }

        /* renamed from: d */
        public void mo1682d(int i) {
            C0390c cVar = (C0390c) this.f1627a.get();
            if (cVar != null) {
                cVar.mo1688a(12, Integer.valueOf(i), (Bundle) null);
            }
        }

        /* renamed from: f */
        public void mo1657f(Bundle bundle) {
            C0390c cVar = (C0390c) this.f1627a.get();
            if (cVar != null) {
                cVar.mo1688a(7, bundle, (Bundle) null);
            }
        }

        /* renamed from: w */
        public void mo1658w() {
            C0390c cVar = (C0390c) this.f1627a.get();
            if (cVar != null) {
                cVar.mo1688a(8, (Object) null, (Bundle) null);
            }
        }
    }

    public C0390c() {
        this.f1623a = Build.VERSION.SDK_INT >= 21 ? C0396f.m1938a(new C0392b(this)) : new C0393c(this);
    }

    /* renamed from: a */
    public void mo1687a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1688a(int i, Object obj, Bundle bundle) {
        C0391a aVar = this.f1624b;
        if (aVar != null) {
            Message obtainMessage = aVar.obtainMessage(i, obj);
            obtainMessage.setData(bundle);
            obtainMessage.sendToTarget();
        }
    }

    /* renamed from: a */
    public void mo1689a(Bundle bundle) {
    }

    /* renamed from: a */
    public void mo1690a(MediaMetadataCompat mediaMetadataCompat) {
    }

    /* renamed from: a */
    public void mo1691a(PlaybackStateCompat playbackStateCompat) {
    }

    /* renamed from: a */
    public void mo1692a(C0395e eVar) {
    }

    /* renamed from: a */
    public void mo1693a(CharSequence charSequence) {
    }

    /* renamed from: a */
    public void mo1694a(String str, Bundle bundle) {
    }

    /* renamed from: a */
    public void mo1695a(List<MediaSessionCompat$QueueItem> list) {
    }

    /* renamed from: b */
    public void mo1696b() {
    }

    public void binderDied() {
        mo1687a();
    }
}
