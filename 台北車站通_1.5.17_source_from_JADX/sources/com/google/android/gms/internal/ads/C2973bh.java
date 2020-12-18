package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.ads.internal.gmsg.C1718E;
import java.util.Map;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.bh */
public final class C2973bh implements C1718E<C2749Ug> {
    public final /* synthetic */ void zza(Object obj, Map map) {
        C2749Ug ug = (C2749Ug) obj;
        if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7872cc)).booleanValue()) {
            C2457Kh jb = ug.mo8174jb();
            if (jb == null) {
                try {
                    C2457Kh kh = new C2457Kh(ug, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                    ug.mo8144a(kh);
                    jb = kh;
                } catch (NullPointerException e) {
                    e = e;
                    C2227Cf.m9533b("Unable to parse videoMeta message.", e);
                    C1697X.m7702i().mo8319a(e, "VideoMetaGmsgHandler.onGmsg");
                    return;
                } catch (NumberFormatException e2) {
                    e = e2;
                    C2227Cf.m9533b("Unable to parse videoMeta message.", e);
                    C1697X.m7702i().mo8319a(e, "VideoMetaGmsgHandler.onGmsg");
                    return;
                }
            }
            boolean equals = "1".equals(map.get("muted"));
            float parseFloat = Float.parseFloat((String) map.get("currentTime"));
            int parseInt = Integer.parseInt((String) map.get("playbackState"));
            if (parseInt < 0 || 3 < parseInt) {
                parseInt = 0;
            }
            String str = (String) map.get("aspectRatio");
            float parseFloat2 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
            if (C2227Cf.m9531a(3)) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 79);
                sb.append("Video Meta GMSG: isMuted : ");
                sb.append(equals);
                sb.append(" , playbackState : ");
                sb.append(parseInt);
                sb.append(" , aspectRatio : ");
                sb.append(str);
                C2227Cf.m9532b(sb.toString());
            }
            jb.mo8403a(parseFloat, parseInt, equals, parseFloat2);
        }
    }
}
