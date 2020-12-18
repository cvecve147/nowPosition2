package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.internal.C1697X;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@TargetApi(14)
@C2478La
/* renamed from: com.google.android.gms.internal.ads.sg */
public final class C3462sg extends C2285Eg implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener {

    /* renamed from: c */
    private static final Map<Integer, String> f10184c = new HashMap();

    /* renamed from: d */
    private final C2776Vg f10185d;

    /* renamed from: e */
    private final boolean f10186e;

    /* renamed from: f */
    private int f10187f = 0;

    /* renamed from: g */
    private int f10188g = 0;

    /* renamed from: h */
    private MediaPlayer f10189h;

    /* renamed from: i */
    private Uri f10190i;

    /* renamed from: j */
    private int f10191j;

    /* renamed from: k */
    private int f10192k;

    /* renamed from: l */
    private int f10193l;

    /* renamed from: m */
    private int f10194m;

    /* renamed from: n */
    private int f10195n;

    /* renamed from: o */
    private C2692Sg f10196o;

    /* renamed from: p */
    private boolean f10197p;

    /* renamed from: q */
    private int f10198q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C2257Dg f10199r;

    static {
        if (Build.VERSION.SDK_INT >= 17) {
            f10184c.put(-1004, "MEDIA_ERROR_IO");
            f10184c.put(-1007, "MEDIA_ERROR_MALFORMED");
            f10184c.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
            f10184c.put(-110, "MEDIA_ERROR_TIMED_OUT");
            f10184c.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        }
        f10184c.put(100, "MEDIA_ERROR_SERVER_DIED");
        f10184c.put(1, "MEDIA_ERROR_UNKNOWN");
        f10184c.put(1, "MEDIA_INFO_UNKNOWN");
        f10184c.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        f10184c.put(701, "MEDIA_INFO_BUFFERING_START");
        f10184c.put(702, "MEDIA_INFO_BUFFERING_END");
        f10184c.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        f10184c.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        f10184c.put(802, "MEDIA_INFO_METADATA_UPDATE");
        if (Build.VERSION.SDK_INT >= 19) {
            f10184c.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            f10184c.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }

    public C3462sg(Context context, boolean z, boolean z2, C2720Tg tg, C2776Vg vg) {
        super(context);
        setSurfaceTextureListener(this);
        this.f10185d = vg;
        this.f10197p = z;
        this.f10186e = z2;
        this.f10185d.mo8952a(this);
    }

    /* renamed from: a */
    private final void m13741a(float f) {
        MediaPlayer mediaPlayer = this.f10189h;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f, f);
            } catch (IllegalStateException unused) {
            }
        } else {
            C2227Cf.m9536d("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }

    /* renamed from: a */
    private final void m13742a(boolean z) {
        C2857Yd.m11615f("AdMediaPlayerView release");
        C2692Sg sg = this.f10196o;
        if (sg != null) {
            sg.mo8824b();
            this.f10196o = null;
        }
        MediaPlayer mediaPlayer = this.f10189h;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f10189h.release();
            this.f10189h = null;
            m13743c(0);
            if (z) {
                this.f10188g = 0;
                this.f10188g = 0;
            }
        }
    }

    /* renamed from: c */
    private final void m13743c(int i) {
        if (i == 3) {
            this.f10185d.mo8955c();
            this.f6954b.mo9032b();
        } else if (this.f10187f == 3) {
            this.f10185d.mo8956d();
            this.f6954b.mo9033c();
        }
        this.f10187f = i;
    }

    /* renamed from: f */
    private final void m13744f() {
        C2857Yd.m11615f("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.f10190i != null && surfaceTexture != null) {
            m13742a(false);
            try {
                C1697X.m7715v();
                this.f10189h = new MediaPlayer();
                this.f10189h.setOnBufferingUpdateListener(this);
                this.f10189h.setOnCompletionListener(this);
                this.f10189h.setOnErrorListener(this);
                this.f10189h.setOnInfoListener(this);
                this.f10189h.setOnPreparedListener(this);
                this.f10189h.setOnVideoSizeChangedListener(this);
                this.f10193l = 0;
                if (this.f10197p) {
                    this.f10196o = new C2692Sg(getContext());
                    this.f10196o.mo8823a(surfaceTexture, getWidth(), getHeight());
                    this.f10196o.start();
                    SurfaceTexture c = this.f10196o.mo8825c();
                    if (c != null) {
                        surfaceTexture = c;
                    } else {
                        this.f10196o.mo8824b();
                        this.f10196o = null;
                    }
                }
                this.f10189h.setDataSource(getContext(), this.f10190i);
                C1697X.m7716w();
                this.f10189h.setSurface(new Surface(surfaceTexture));
                this.f10189h.setAudioStreamType(3);
                this.f10189h.setScreenOnWhilePlaying(true);
                this.f10189h.prepareAsync();
                m13743c(1);
            } catch (IOException | IllegalArgumentException | IllegalStateException e) {
                String valueOf = String.valueOf(this.f10190i);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                sb.append("Failed to initialize MediaPlayer at ");
                sb.append(valueOf);
                C2227Cf.m9535c(sb.toString(), e);
                onError(this.f10189h, 1, 0);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034 A[LOOP:0: B:10:0x0034->B:15:0x004f, LOOP_START] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m13745g() {
        /*
            r7 = this;
            boolean r0 = r7.f10186e
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r7.m13746h()
            if (r0 == 0) goto L_0x0059
            android.media.MediaPlayer r0 = r7.f10189h
            int r0 = r0.getCurrentPosition()
            if (r0 <= 0) goto L_0x0059
            int r0 = r7.f10188g
            r1 = 3
            if (r0 == r1) goto L_0x0059
            java.lang.String r0 = "AdMediaPlayerView nudging MediaPlayer"
            com.google.android.gms.internal.ads.C2857Yd.m11615f(r0)
            r0 = 0
            r7.m13741a((float) r0)
            android.media.MediaPlayer r0 = r7.f10189h
            r0.start()
            android.media.MediaPlayer r0 = r7.f10189h
            int r0 = r0.getCurrentPosition()
            com.google.android.gms.common.util.e r1 = com.google.android.gms.ads.internal.C1697X.m7705l()
            long r1 = r1.mo7725a()
        L_0x0034:
            boolean r3 = r7.m13746h()
            if (r3 == 0) goto L_0x0051
            android.media.MediaPlayer r3 = r7.f10189h
            int r3 = r3.getCurrentPosition()
            if (r3 != r0) goto L_0x0051
            com.google.android.gms.common.util.e r3 = com.google.android.gms.ads.internal.C1697X.m7705l()
            long r3 = r3.mo7725a()
            long r3 = r3 - r1
            r5 = 250(0xfa, double:1.235E-321)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0034
        L_0x0051:
            android.media.MediaPlayer r0 = r7.f10189h
            r0.pause()
            r7.mo8027a()
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3462sg.m13745g():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.f10187f;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m13746h() {
        /*
            r2 = this;
            android.media.MediaPlayer r0 = r2.f10189h
            if (r0 == 0) goto L_0x000f
            int r0 = r2.f10187f
            r1 = -1
            if (r0 == r1) goto L_0x000f
            if (r0 == 0) goto L_0x000f
            r1 = 1
            if (r0 == r1) goto L_0x000f
            return r1
        L_0x000f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3462sg.m13746h():boolean");
    }

    /* renamed from: a */
    public final void mo8027a() {
        m13741a(this.f6954b.mo9029a());
    }

    /* renamed from: a */
    public final void mo8028a(float f, float f2) {
        C2692Sg sg = this.f10196o;
        if (sg != null) {
            sg.mo8821a(f, f2);
        }
    }

    /* renamed from: a */
    public final void mo8029a(int i) {
        StringBuilder sb = new StringBuilder(34);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i);
        C2857Yd.m11615f(sb.toString());
        if (m13746h()) {
            this.f10189h.seekTo(i);
            this.f10198q = 0;
            return;
        }
        this.f10198q = i;
    }

    /* renamed from: a */
    public final void mo8030a(C2257Dg dg) {
        this.f10199r = dg;
    }

    /* renamed from: b */
    public final void mo8031b() {
        C2857Yd.m11615f("AdMediaPlayerView pause");
        if (m13746h() && this.f10189h.isPlaying()) {
            this.f10189h.pause();
            m13743c(4);
            C3114ge.f9351a.post(new C2228Cg(this));
        }
        this.f10188g = 4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo9996b(int i) {
        C2257Dg dg = this.f10199r;
        if (dg != null) {
            dg.onWindowVisibilityChanged(i);
        }
    }

    /* renamed from: c */
    public final void mo8032c() {
        C2857Yd.m11615f("AdMediaPlayerView play");
        if (m13746h()) {
            this.f10189h.start();
            m13743c(3);
            this.f6953a.mo8565a();
            C3114ge.f9351a.post(new C2200Bg(this));
        }
        this.f10188g = 3;
    }

    /* renamed from: d */
    public final void mo8033d() {
        C2857Yd.m11615f("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.f10189h;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f10189h.release();
            this.f10189h = null;
            m13743c(0);
            this.f10188g = 0;
        }
        this.f10185d.mo8951a();
    }

    /* renamed from: e */
    public final String mo8034e() {
        String str = this.f10197p ? " spherical" : "";
        return str.length() != 0 ? "MediaPlayer".concat(str) : new String("MediaPlayer");
    }

    public final int getCurrentPosition() {
        if (m13746h()) {
            return this.f10189h.getCurrentPosition();
        }
        return 0;
    }

    public final int getDuration() {
        if (m13746h()) {
            return this.f10189h.getDuration();
        }
        return -1;
    }

    public final int getVideoHeight() {
        MediaPlayer mediaPlayer = this.f10189h;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    public final int getVideoWidth() {
        MediaPlayer mediaPlayer = this.f10189h;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.f10193l = i;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        C2857Yd.m11615f("AdMediaPlayerView completion");
        m13743c(5);
        this.f10188g = 5;
        C3114ge.f9351a.post(new C3549vg(this));
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        String str = f10184c.get(Integer.valueOf(i));
        String str2 = f10184c.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer error: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        C2227Cf.m9536d(sb.toString());
        m13743c(-1);
        this.f10188g = -1;
        C3114ge.f9351a.post(new C3577wg(this, str, str2));
        return true;
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        String str = f10184c.get(Integer.valueOf(i));
        String str2 = f10184c.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        C2857Yd.m11615f(sb.toString());
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.f10191j
            int r0 = android.view.TextureView.getDefaultSize(r0, r6)
            int r1 = r5.f10192k
            int r1 = android.view.TextureView.getDefaultSize(r1, r7)
            int r2 = r5.f10191j
            if (r2 <= 0) goto L_0x0082
            int r2 = r5.f10192k
            if (r2 <= 0) goto L_0x0082
            com.google.android.gms.internal.ads.Sg r2 = r5.f10196o
            if (r2 != 0) goto L_0x0082
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L_0x0046
            if (r1 != r2) goto L_0x0046
            int r0 = r5.f10191j
            int r1 = r0 * r7
            int r2 = r5.f10192k
            int r3 = r6 * r2
            if (r1 >= r3) goto L_0x003c
            int r0 = r0 * r7
            int r0 = r0 / r2
            r1 = r7
            goto L_0x0082
        L_0x003c:
            int r1 = r0 * r7
            int r3 = r6 * r2
            if (r1 <= r3) goto L_0x0065
            int r2 = r2 * r6
            int r1 = r2 / r0
            goto L_0x0083
        L_0x0046:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L_0x0057
            int r0 = r5.f10192k
            int r0 = r0 * r6
            int r2 = r5.f10191j
            int r0 = r0 / r2
            if (r1 != r3) goto L_0x0055
            if (r0 <= r7) goto L_0x0055
            goto L_0x0063
        L_0x0055:
            r1 = r0
            goto L_0x0083
        L_0x0057:
            if (r1 != r2) goto L_0x0067
            int r1 = r5.f10191j
            int r1 = r1 * r7
            int r2 = r5.f10192k
            int r1 = r1 / r2
            if (r0 != r3) goto L_0x0064
            if (r1 <= r6) goto L_0x0064
        L_0x0063:
            goto L_0x0065
        L_0x0064:
            r6 = r1
        L_0x0065:
            r1 = r7
            goto L_0x0083
        L_0x0067:
            int r2 = r5.f10191j
            int r4 = r5.f10192k
            if (r1 != r3) goto L_0x0073
            if (r4 <= r7) goto L_0x0073
            int r2 = r2 * r7
            int r2 = r2 / r4
            r1 = r7
            goto L_0x0074
        L_0x0073:
            r1 = r4
        L_0x0074:
            if (r0 != r3) goto L_0x0080
            if (r2 <= r6) goto L_0x0080
            int r7 = r5.f10192k
            int r7 = r7 * r6
            int r0 = r5.f10191j
            int r1 = r7 / r0
            goto L_0x0083
        L_0x0080:
            r6 = r2
            goto L_0x0083
        L_0x0082:
            r6 = r0
        L_0x0083:
            r5.setMeasuredDimension(r6, r1)
            com.google.android.gms.internal.ads.Sg r7 = r5.f10196o
            if (r7 == 0) goto L_0x008d
            r7.mo8822a((int) r6, (int) r1)
        L_0x008d:
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 16
            if (r7 != r0) goto L_0x00a6
            int r7 = r5.f10194m
            if (r7 <= 0) goto L_0x0099
            if (r7 != r6) goto L_0x009f
        L_0x0099:
            int r7 = r5.f10195n
            if (r7 <= 0) goto L_0x00a2
            if (r7 == r1) goto L_0x00a2
        L_0x009f:
            r5.m13745g()
        L_0x00a2:
            r5.f10194m = r6
            r5.f10195n = r1
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3462sg.onMeasure(int, int):void");
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        C2857Yd.m11615f("AdMediaPlayerView prepared");
        m13743c(2);
        this.f10185d.mo8953b();
        C3114ge.f9351a.post(new C3519ug(this));
        this.f10191j = mediaPlayer.getVideoWidth();
        this.f10192k = mediaPlayer.getVideoHeight();
        int i = this.f10198q;
        if (i != 0) {
            mo8029a(i);
        }
        m13745g();
        int i2 = this.f10191j;
        int i3 = this.f10192k;
        StringBuilder sb = new StringBuilder(62);
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i2);
        sb.append(" x ");
        sb.append(i3);
        C2227Cf.m9534c(sb.toString());
        if (this.f10188g == 3) {
            mo8032c();
        }
        mo8027a();
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C2857Yd.m11615f("AdMediaPlayerView surface created");
        m13744f();
        C3114ge.f9351a.post(new C3633yg(this));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C2857Yd.m11615f("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.f10189h;
        if (mediaPlayer != null && this.f10198q == 0) {
            this.f10198q = mediaPlayer.getCurrentPosition();
        }
        C2692Sg sg = this.f10196o;
        if (sg != null) {
            sg.mo8824b();
        }
        C3114ge.f9351a.post(new C2171Ag(this));
        m13742a(true);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C2857Yd.m11615f("AdMediaPlayerView surface changed");
        boolean z = true;
        boolean z2 = this.f10188g == 3;
        if (!(this.f10191j == i && this.f10192k == i2)) {
            z = false;
        }
        if (this.f10189h != null && z2 && z) {
            int i3 = this.f10198q;
            if (i3 != 0) {
                mo8029a(i3);
            }
            mo8032c();
        }
        C2692Sg sg = this.f10196o;
        if (sg != null) {
            sg.mo8822a(i, i2);
        }
        C3114ge.f9351a.post(new C3662zg(this, i, i2));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f10185d.mo8954b(this);
        this.f6953a.mo8566a(surfaceTexture, this.f10199r);
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i);
        sb.append(" x ");
        sb.append(i2);
        C2857Yd.m11615f(sb.toString());
        this.f10191j = mediaPlayer.getVideoWidth();
        this.f10192k = mediaPlayer.getVideoHeight();
        if (this.f10191j != 0 && this.f10192k != 0) {
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb = new StringBuilder(58);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i);
        C2857Yd.m11615f(sb.toString());
        C3114ge.f9351a.post(new C3490tg(this, i));
        super.onWindowVisibilityChanged(i);
    }

    public final void setVideoPath(String str) {
        Uri parse = Uri.parse(str);
        zzhl a = zzhl.m14772a(parse);
        if (a != null) {
            parse = Uri.parse(a.f10867a);
        }
        this.f10190i = parse;
        this.f10198q = 0;
        m13744f();
        requestLayout();
        invalidate();
    }

    public final String toString() {
        String name = C3462sg.class.getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }
}
