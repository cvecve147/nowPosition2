package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.C1718E;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Iv */
public final class C2415Iv implements C1718E<Object> {

    /* renamed from: a */
    private final WeakReference<C2301Ev> f7300a;

    /* renamed from: b */
    private final String f7301b;

    public C2415Iv(C2301Ev ev, String str) {
        this.f7300a = new WeakReference<>(ev);
        this.f7301b = str;
    }

    public final void zza(Object obj, Map<String, String> map) {
        C2301Ev ev;
        String str = map.get("ads_id");
        String str2 = map.get("eventName");
        if (!TextUtils.isEmpty(str) && this.f7301b.equals(str)) {
            try {
                Integer.parseInt(map.get("eventType"));
            } catch (Exception e) {
                C2227Cf.m9533b("Parse Scion log event type error", e);
            }
            if ("_ai".equals(str2)) {
                C2301Ev ev2 = (C2301Ev) this.f7300a.get();
                if (ev2 != null) {
                    ev2.mo8056Pb();
                }
            } else if ("_ac".equals(str2) && (ev = (C2301Ev) this.f7300a.get()) != null) {
                ev.mo8055Ib();
            }
        }
    }
}
