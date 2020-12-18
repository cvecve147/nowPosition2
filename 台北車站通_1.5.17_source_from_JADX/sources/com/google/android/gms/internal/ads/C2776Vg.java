package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C1697X;
import java.util.concurrent.TimeUnit;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Vg */
public final class C2776Vg {

    /* renamed from: a */
    private final Context f8438a;

    /* renamed from: b */
    private final String f8439b;

    /* renamed from: c */
    private final zzang f8440c;

    /* renamed from: d */
    private final C2875Yu f8441d;

    /* renamed from: e */
    private final C2930_u f8442e;

    /* renamed from: f */
    private final C2512Me f8443f;

    /* renamed from: g */
    private final long[] f8444g;

    /* renamed from: h */
    private final String[] f8445h;

    /* renamed from: i */
    private boolean f8446i = false;

    /* renamed from: j */
    private boolean f8447j = false;

    /* renamed from: k */
    private boolean f8448k = false;

    /* renamed from: l */
    private boolean f8449l = false;

    /* renamed from: m */
    private boolean f8450m;

    /* renamed from: n */
    private C2285Eg f8451n;

    /* renamed from: o */
    private boolean f8452o;

    /* renamed from: p */
    private boolean f8453p;

    /* renamed from: q */
    private long f8454q = -1;

    public C2776Vg(Context context, zzang zzang, String str, C2930_u _uVar, C2875Yu yu) {
        C2601Pe pe = new C2601Pe();
        C2601Pe pe2 = pe;
        pe2.mo8664a("min_1", Double.MIN_VALUE, 1.0d);
        pe2.mo8664a("1_5", 1.0d, 5.0d);
        pe2.mo8664a("5_10", 5.0d, 10.0d);
        pe2.mo8664a("10_20", 10.0d, 20.0d);
        pe2.mo8664a("20_30", 20.0d, 30.0d);
        pe2.mo8664a("30_max", 30.0d, Double.MAX_VALUE);
        this.f8443f = pe.mo8663a();
        this.f8438a = context;
        this.f8440c = zzang;
        this.f8439b = str;
        this.f8442e = _uVar;
        this.f8441d = yu;
        String str2 = (String) C3390pt.m13458f().mo8515a(C2558Nu.f7728E);
        if (str2 == null) {
            this.f8445h = new String[0];
            this.f8444g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        this.f8445h = new String[split.length];
        this.f8444g = new long[split.length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.f8444g[i] = Long.parseLong(split[i]);
            } catch (NumberFormatException e) {
                C2227Cf.m9535c("Unable to parse frame hash target time number.", e);
                this.f8444g[i] = -1;
            }
        }
    }

    /* renamed from: a */
    public final void mo8951a() {
        if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7722D)).booleanValue() && !this.f8452o) {
            Bundle bundle = new Bundle();
            bundle.putString(SVGParser.XML_STYLESHEET_ATTR_TYPE, "native-player-metrics");
            bundle.putString("request", this.f8439b);
            bundle.putString("player", this.f8451n.mo8034e());
            for (C2569Oe next : this.f8443f.mo8529a()) {
                String valueOf = String.valueOf(next.f8031a);
                bundle.putString(valueOf.length() != 0 ? "fps_c_".concat(valueOf) : new String("fps_c_"), Integer.toString(next.f8035e));
                String valueOf2 = String.valueOf(next.f8031a);
                bundle.putString(valueOf2.length() != 0 ? "fps_p_".concat(valueOf2) : new String("fps_p_"), Double.toString(next.f8034d));
            }
            int i = 0;
            while (true) {
                long[] jArr = this.f8444g;
                if (i < jArr.length) {
                    String str = this.f8445h[i];
                    if (str != null) {
                        String valueOf3 = String.valueOf(Long.valueOf(jArr[i]));
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 3);
                        sb.append("fh_");
                        sb.append(valueOf3);
                        bundle.putString(sb.toString(), str);
                    }
                    i++;
                } else {
                    C1697X.m7698e().mo9449a(this.f8438a, this.f8440c.f10855a, "gmob-apps", bundle, true);
                    this.f8452o = true;
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo8952a(C2285Eg eg) {
        C2736Tu.m11306a(this.f8442e, this.f8441d, "vpc2");
        this.f8446i = true;
        C2930_u _uVar = this.f8442e;
        if (_uVar != null) {
            _uVar.mo9178a("vpn", eg.mo8034e());
        }
        this.f8451n = eg;
    }

    /* renamed from: b */
    public final void mo8953b() {
        if (this.f8446i && !this.f8447j) {
            C2736Tu.m11306a(this.f8442e, this.f8441d, "vfr2");
            this.f8447j = true;
        }
    }

    /* renamed from: b */
    public final void mo8954b(C2285Eg eg) {
        if (this.f8448k && !this.f8449l) {
            if (C2857Yd.m11614a() && !this.f8449l) {
                C2857Yd.m11615f("VideoMetricsMixin first frame");
            }
            C2736Tu.m11306a(this.f8442e, this.f8441d, "vff2");
            this.f8449l = true;
        }
        long c = C1697X.m7705l().mo7727c();
        if (this.f8450m && this.f8453p && this.f8454q != -1) {
            this.f8443f.mo8530a(((double) TimeUnit.SECONDS.toNanos(1)) / ((double) (c - this.f8454q)));
        }
        this.f8453p = this.f8450m;
        this.f8454q = c;
        long longValue = ((Long) C3390pt.m13458f().mo8515a(C2558Nu.f7734F)).longValue();
        long currentPosition = (long) eg.getCurrentPosition();
        int i = 0;
        while (true) {
            String[] strArr = this.f8445h;
            if (i >= strArr.length) {
                return;
            }
            if (strArr[i] != null || longValue <= Math.abs(currentPosition - this.f8444g[i])) {
                C2285Eg eg2 = eg;
                i++;
            } else {
                String[] strArr2 = this.f8445h;
                int i2 = 8;
                Bitmap bitmap = eg.getBitmap(8, 8);
                int i3 = 0;
                long j = 63;
                long j2 = 0;
                while (i3 < i2) {
                    long j3 = j;
                    long j4 = j2;
                    int i4 = 0;
                    while (i4 < i2) {
                        int pixel = bitmap.getPixel(i4, i3);
                        j4 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1 : 0) << ((int) j3);
                        i4++;
                        j3--;
                        i2 = 8;
                    }
                    i3++;
                    j2 = j4;
                    i2 = 8;
                    j = j3;
                }
                strArr2[i] = String.format("%016X", new Object[]{Long.valueOf(j2)});
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo8955c() {
        this.f8450m = true;
        if (this.f8447j && !this.f8448k) {
            C2736Tu.m11306a(this.f8442e, this.f8441d, "vfp2");
            this.f8448k = true;
        }
    }

    /* renamed from: d */
    public final void mo8956d() {
        this.f8450m = false;
    }
}
