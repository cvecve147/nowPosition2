package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.common.internal.C2010c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Gg */
public final class C2342Gg extends FrameLayout implements C2257Dg {

    /* renamed from: a */
    private final C2749Ug f7048a;

    /* renamed from: b */
    private final FrameLayout f7049b;

    /* renamed from: c */
    private final C2930_u f7050c;

    /* renamed from: d */
    private final C2805Wg f7051d;

    /* renamed from: e */
    private final long f7052e;

    /* renamed from: f */
    private C2285Eg f7053f;

    /* renamed from: g */
    private boolean f7054g;

    /* renamed from: h */
    private boolean f7055h;

    /* renamed from: i */
    private boolean f7056i;

    /* renamed from: j */
    private boolean f7057j;

    /* renamed from: k */
    private long f7058k;

    /* renamed from: l */
    private long f7059l;

    /* renamed from: m */
    private String f7060m;

    /* renamed from: n */
    private Bitmap f7061n;

    /* renamed from: o */
    private ImageView f7062o;

    /* renamed from: p */
    private boolean f7063p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2342Gg(Context context, C2749Ug ug, int i, boolean z, C2930_u _uVar, C2720Tg tg) {
        super(context);
        Context context2 = context;
        C2749Ug ug2 = ug;
        this.f7048a = ug2;
        C2930_u _uVar2 = _uVar;
        this.f7050c = _uVar2;
        this.f7049b = new FrameLayout(context);
        addView(this.f7049b, new FrameLayout.LayoutParams(-1, -1));
        C2010c.m8843a(ug.mo8175kb());
        this.f7053f = ug.mo8175kb().f5898b.mo8083a(context, ug2, i, z, _uVar2, tg);
        C2285Eg eg = this.f7053f;
        if (eg != null) {
            this.f7049b.addView(eg, new FrameLayout.LayoutParams(-1, -1, 17));
            if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7740G)).booleanValue()) {
                mo8130n();
            }
        }
        this.f7062o = new ImageView(context);
        this.f7052e = ((Long) C3390pt.m13458f().mo8515a(C2558Nu.f7764K)).longValue();
        this.f7057j = ((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7752I)).booleanValue();
        C2930_u _uVar3 = this.f7050c;
        if (_uVar3 != null) {
            _uVar3.mo9178a("spinner_used", this.f7057j ? "1" : "0");
        }
        this.f7051d = new C2805Wg(this);
        C2285Eg eg2 = this.f7053f;
        if (eg2 != null) {
            eg2.mo8030a((C2257Dg) this);
        }
        if (this.f7053f == null) {
            mo7983a("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    /* renamed from: a */
    public static void m9859a(C2749Ug ug) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "no_video_view");
        ug.mo8149a("onVideoEvent", (Map<String, ?>) hashMap);
    }

    /* renamed from: a */
    public static void m9860a(C2749Ug ug, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "decoderProps");
        hashMap.put("error", str);
        ug.mo8149a("onVideoEvent", (Map<String, ?>) hashMap);
    }

    /* renamed from: a */
    public static void m9861a(C2749Ug ug, Map<String, List<Map<String, Object>>> map) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "decoderProps");
        hashMap.put("mimeTypes", map);
        ug.mo8149a("onVideoEvent", (Map<String, ?>) hashMap);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m9862a(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.f7048a.mo8149a("onVideoEvent", (Map<String, ?>) hashMap);
    }

    /* renamed from: p */
    private final boolean m9863p() {
        return this.f7062o.getParent() != null;
    }

    /* renamed from: q */
    private final void m9864q() {
        if (this.f7048a.mo8163eb() != null && this.f7055h && !this.f7056i) {
            this.f7048a.mo8163eb().getWindow().clearFlags(128);
            this.f7055h = false;
        }
    }

    /* renamed from: a */
    public final void mo7981a() {
        C2285Eg eg = this.f7053f;
        if (eg != null && this.f7059l == 0) {
            m9862a("canplaythrough", "duration", String.valueOf(((float) eg.getDuration()) / 1000.0f), "videoWidth", String.valueOf(this.f7053f.getVideoWidth()), "videoHeight", String.valueOf(this.f7053f.getVideoHeight()));
        }
    }

    /* renamed from: a */
    public final void mo8118a(float f, float f2) {
        C2285Eg eg = this.f7053f;
        if (eg != null) {
            eg.mo8028a(f, f2);
        }
    }

    /* renamed from: a */
    public final void mo8119a(int i) {
        C2285Eg eg = this.f7053f;
        if (eg != null) {
            eg.mo8029a(i);
        }
    }

    /* renamed from: a */
    public final void mo7982a(int i, int i2) {
        if (this.f7057j) {
            int max = Math.max(i / ((Integer) C3390pt.m13458f().mo8515a(C2558Nu.f7758J)).intValue(), 1);
            int max2 = Math.max(i2 / ((Integer) C3390pt.m13458f().mo8515a(C2558Nu.f7758J)).intValue(), 1);
            Bitmap bitmap = this.f7061n;
            if (bitmap == null || bitmap.getWidth() != max || this.f7061n.getHeight() != max2) {
                this.f7061n = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                this.f7063p = false;
            }
        }
    }

    /* renamed from: a */
    public final void mo8120a(int i, int i2, int i3, int i4) {
        if (i3 != 0 && i4 != 0) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
            layoutParams.setMargins(i, i2, 0, 0);
            this.f7049b.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    @TargetApi(14)
    /* renamed from: a */
    public final void mo8121a(MotionEvent motionEvent) {
        C2285Eg eg = this.f7053f;
        if (eg != null) {
            eg.dispatchTouchEvent(motionEvent);
        }
    }

    /* renamed from: a */
    public final void mo8122a(String str) {
        this.f7060m = str;
    }

    /* renamed from: a */
    public final void mo7983a(String str, String str2) {
        m9862a("error", "what", str, "extra", str2);
    }

    /* renamed from: b */
    public final void mo7984b() {
        this.f7051d.mo8995b();
        C3114ge.f9351a.post(new C2400Ig(this));
    }

    /* renamed from: c */
    public final void mo7985c() {
        m9862a("pause", new String[0]);
        m9864q();
        this.f7054g = false;
    }

    /* renamed from: d */
    public final void mo7986d() {
        if (this.f7054g && m9863p()) {
            this.f7049b.removeView(this.f7062o);
        }
        if (this.f7061n != null) {
            long b = C1697X.m7705l().mo7726b();
            if (this.f7053f.getBitmap(this.f7061n) != null) {
                this.f7063p = true;
            }
            long b2 = C1697X.m7705l().mo7726b() - b;
            if (C2857Yd.m11614a()) {
                StringBuilder sb = new StringBuilder(46);
                sb.append("Spinner frame grab took ");
                sb.append(b2);
                sb.append("ms");
                C2857Yd.m11615f(sb.toString());
            }
            if (b2 > this.f7052e) {
                C2227Cf.m9536d("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.f7057j = false;
                this.f7061n = null;
                C2930_u _uVar = this.f7050c;
                if (_uVar != null) {
                    _uVar.mo9178a("spinner_jank", Long.toString(b2));
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo7987e() {
        if (this.f7063p && this.f7061n != null && !m9863p()) {
            this.f7062o.setImageBitmap(this.f7061n);
            this.f7062o.invalidate();
            this.f7049b.addView(this.f7062o, new FrameLayout.LayoutParams(-1, -1));
            this.f7049b.bringChildToFront(this.f7062o);
        }
        this.f7051d.mo8994a();
        this.f7059l = this.f7058k;
        C3114ge.f9351a.post(new C2428Jg(this));
    }

    /* renamed from: f */
    public final void mo7988f() {
        m9862a("ended", new String[0]);
        m9864q();
    }

    public final void finalize() {
        try {
            this.f7051d.mo8994a();
            if (this.f7053f != null) {
                C2285Eg eg = this.f7053f;
                Executor executor = C2972bg.f8938a;
                eg.getClass();
                executor.execute(C2372Hg.m10065a(eg));
            }
        } finally {
            super.finalize();
        }
    }

    /* renamed from: g */
    public final void mo7989g() {
        if (this.f7048a.mo8163eb() != null && !this.f7055h) {
            this.f7056i = (this.f7048a.mo8163eb().getWindow().getAttributes().flags & 128) != 0;
            if (!this.f7056i) {
                this.f7048a.mo8163eb().getWindow().addFlags(128);
                this.f7055h = true;
            }
        }
        this.f7054g = true;
    }

    /* renamed from: h */
    public final void mo8124h() {
        this.f7051d.mo8994a();
        C2285Eg eg = this.f7053f;
        if (eg != null) {
            eg.mo8033d();
        }
        m9864q();
    }

    /* renamed from: i */
    public final void mo8125i() {
        C2285Eg eg = this.f7053f;
        if (eg != null) {
            eg.mo8031b();
        }
    }

    /* renamed from: j */
    public final void mo8126j() {
        C2285Eg eg = this.f7053f;
        if (eg != null) {
            eg.mo8032c();
        }
    }

    /* renamed from: k */
    public final void mo8127k() {
        if (this.f7053f != null) {
            if (!TextUtils.isEmpty(this.f7060m)) {
                this.f7053f.setVideoPath(this.f7060m);
            } else {
                m9862a("no_src", new String[0]);
            }
        }
    }

    /* renamed from: l */
    public final void mo8128l() {
        C2285Eg eg = this.f7053f;
        if (eg != null) {
            eg.f6954b.mo9031a(true);
            eg.mo8027a();
        }
    }

    /* renamed from: m */
    public final void mo8129m() {
        C2285Eg eg = this.f7053f;
        if (eg != null) {
            eg.f6954b.mo9031a(false);
            eg.mo8027a();
        }
    }

    @TargetApi(14)
    /* renamed from: n */
    public final void mo8130n() {
        C2285Eg eg = this.f7053f;
        if (eg != null) {
            TextView textView = new TextView(eg.getContext());
            String valueOf = String.valueOf(this.f7053f.mo8034e());
            textView.setText(valueOf.length() != 0 ? "AdMob - ".concat(valueOf) : new String("AdMob - "));
            textView.setTextColor(-65536);
            textView.setBackgroundColor(-256);
            this.f7049b.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
            this.f7049b.bringChildToFront(textView);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo8131o() {
        C2285Eg eg = this.f7053f;
        if (eg != null) {
            long currentPosition = (long) eg.getCurrentPosition();
            if (this.f7058k != currentPosition && currentPosition > 0) {
                m9862a("timeupdate", "time", String.valueOf(((float) currentPosition) / 1000.0f));
                this.f7058k = currentPosition;
            }
        }
    }

    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        if (i == 0) {
            this.f7051d.mo8995b();
            z = true;
        } else {
            this.f7051d.mo8994a();
            this.f7059l = this.f7058k;
            z = false;
        }
        C3114ge.f9351a.post(new C2456Kg(this, z));
    }

    public final void setVolume(float f) {
        C2285Eg eg = this.f7053f;
        if (eg != null) {
            eg.f6954b.mo9030a(f);
            eg.mo8027a();
        }
    }
}
