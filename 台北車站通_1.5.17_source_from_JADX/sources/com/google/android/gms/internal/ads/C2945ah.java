package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.gmsg.C1718E;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.ah */
public final class C2945ah implements C1718E<C2749Ug> {

    /* renamed from: a */
    private boolean f8911a;

    /* renamed from: a */
    private static int m11931a(Context context, Map<String, String> map, String str, int i) {
        String str2 = map.get(str);
        if (str2 == null) {
            return i;
        }
        try {
            C3390pt.m13453a();
            return C3432rf.m13595a(context, Integer.parseInt(str2));
        } catch (NumberFormatException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(str2).length());
            sb.append("Could not parse ");
            sb.append(str);
            sb.append(" in a video GMSG: ");
            sb.append(str2);
            C2227Cf.m9536d(sb.toString());
            return i;
        }
    }

    /* renamed from: a */
    private static void m11932a(C2342Gg gg, Map<String, String> map) {
        String str = map.get("minBufferMs");
        String str2 = map.get("maxBufferMs");
        String str3 = map.get("bufferForPlaybackMs");
        String str4 = map.get("bufferForPlaybackAfterRebufferMs");
        if (str != null) {
            try {
                Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                C2227Cf.m9536d(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", new Object[]{str, str2}));
                return;
            }
        }
        if (str2 != null) {
            Integer.parseInt(str2);
        }
        if (str3 != null) {
            Integer.parseInt(str3);
        }
        if (str4 != null) {
            Integer.parseInt(str4);
        }
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        int i;
        int i2;
        C2749Ug ug = (C2749Ug) obj;
        String str = (String) map.get("action");
        if (str == null) {
            C2227Cf.m9536d("Action missing from video GMSG.");
            return;
        }
        if (C2227Cf.m9531a(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String jSONObject2 = jSONObject.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + String.valueOf(jSONObject2).length());
            sb.append("Video GMSG: ");
            sb.append(str);
            sb.append(" ");
            sb.append(jSONObject2);
            C2227Cf.m9532b(sb.toString());
        }
        if ("background".equals(str)) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                C2227Cf.m9536d("Color parameter missing from color video GMSG.");
                return;
            }
            try {
                ug.setBackgroundColor(Color.parseColor(str2));
            } catch (IllegalArgumentException unused) {
                C2227Cf.m9536d("Invalid color parameter in video GMSG.");
            }
        } else {
            int i3 = 0;
            if ("decoderProps".equals(str)) {
                String str3 = (String) map.get("mimeTypes");
                if (str3 == null) {
                    C2227Cf.m9536d("No MIME types specified for decoder properties inspection.");
                    C2342Gg.m9860a(ug, "missingMimeTypes");
                } else if (Build.VERSION.SDK_INT < 16) {
                    C2227Cf.m9536d("Video decoder properties available on API versions >= 16.");
                    C2342Gg.m9860a(ug, "deficientApiVersion");
                } else {
                    HashMap hashMap = new HashMap();
                    String[] split = str3.split(",");
                    int length = split.length;
                    while (i3 < length) {
                        String str4 = split[i3];
                        hashMap.put(str4, C3375pf.m13335a(str4.trim()));
                        i3++;
                    }
                    C2342Gg.m9861a(ug, (Map<String, List<Map<String, Object>>>) hashMap);
                }
            } else {
                C2484Lg yb = ug.mo8205yb();
                if (yb == null) {
                    C2227Cf.m9536d("Could not get underlay container for a video GMSG.");
                    return;
                }
                boolean equals = "new".equals(str);
                boolean equals2 = "position".equals(str);
                if (equals || equals2) {
                    Context context = ug.getContext();
                    int a = m11931a(context, map, "x", 0);
                    int a2 = m11931a(context, map, "y", 0);
                    int a3 = m11931a(context, map, "w", -1);
                    int a4 = m11931a(context, map, "h", -1);
                    if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7846Yc)).booleanValue()) {
                        i2 = Math.min(a3, ug.mo8133Ab() - a);
                        i = Math.min(a4, ug.mo8134Bb() - a2);
                    } else {
                        i2 = a3;
                        i = a4;
                    }
                    try {
                        i3 = Integer.parseInt((String) map.get("player"));
                    } catch (NumberFormatException unused2) {
                    }
                    int i4 = i3;
                    boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
                    if (!equals || yb.mo8479c() != null) {
                        yb.mo8476a(a, a2, i2, i);
                        return;
                    }
                    yb.mo8477a(a, a2, i2, i, i4, parseBoolean, new C2720Tg((String) map.get("flags")));
                    C2342Gg c = yb.mo8479c();
                    if (c != null) {
                        m11932a(c, map);
                        return;
                    }
                    return;
                }
                C2342Gg c2 = yb.mo8479c();
                if (c2 == null) {
                    C2342Gg.m9859a(ug);
                } else if ("click".equals(str)) {
                    Context context2 = ug.getContext();
                    int a5 = m11931a(context2, map, "x", 0);
                    int a6 = m11931a(context2, map, "y", 0);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, (float) a5, (float) a6, 0);
                    c2.mo8121a(obtain);
                    obtain.recycle();
                } else if ("currentTime".equals(str)) {
                    String str5 = (String) map.get("time");
                    if (str5 == null) {
                        C2227Cf.m9536d("Time parameter missing from currentTime video GMSG.");
                        return;
                    }
                    try {
                        c2.mo8119a((int) (Float.parseFloat(str5) * 1000.0f));
                    } catch (NumberFormatException unused3) {
                        String valueOf = String.valueOf(str5);
                        C2227Cf.m9536d(valueOf.length() != 0 ? "Could not parse time parameter from currentTime video GMSG: ".concat(valueOf) : new String("Could not parse time parameter from currentTime video GMSG: "));
                    }
                } else if ("hide".equals(str)) {
                    c2.setVisibility(4);
                } else if ("load".equals(str)) {
                    c2.mo8127k();
                } else if ("loadControl".equals(str)) {
                    m11932a(c2, map);
                } else if ("muted".equals(str)) {
                    if (Boolean.parseBoolean((String) map.get("muted"))) {
                        c2.mo8128l();
                    } else {
                        c2.mo8129m();
                    }
                } else if ("pause".equals(str)) {
                    c2.mo8125i();
                } else if ("play".equals(str)) {
                    c2.mo8126j();
                } else if ("show".equals(str)) {
                    c2.setVisibility(0);
                } else if ("src".equals(str)) {
                    c2.mo8122a((String) map.get("src"));
                } else if ("touchMove".equals(str)) {
                    Context context3 = ug.getContext();
                    c2.mo8118a((float) m11931a(context3, map, "dx", 0), (float) m11931a(context3, map, "dy", 0));
                    if (!this.f8911a) {
                        ug.mo8135Cb();
                        this.f8911a = true;
                    }
                } else if ("volume".equals(str)) {
                    String str6 = (String) map.get("volume");
                    if (str6 == null) {
                        C2227Cf.m9536d("Level parameter missing from volume video GMSG.");
                        return;
                    }
                    try {
                        c2.setVolume(Float.parseFloat(str6));
                    } catch (NumberFormatException unused4) {
                        String valueOf2 = String.valueOf(str6);
                        C2227Cf.m9536d(valueOf2.length() != 0 ? "Could not parse volume parameter from volume video GMSG: ".concat(valueOf2) : new String("Could not parse volume parameter from volume video GMSG: "));
                    }
                } else if ("watermark".equals(str)) {
                    c2.mo8130n();
                } else {
                    String valueOf3 = String.valueOf(str);
                    C2227Cf.m9536d(valueOf3.length() != 0 ? "Unknown video action: ".concat(valueOf3) : new String("Unknown video action: "));
                }
            }
        }
    }
}
