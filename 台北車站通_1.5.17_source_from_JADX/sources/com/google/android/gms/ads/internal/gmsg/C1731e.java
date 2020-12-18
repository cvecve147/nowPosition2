package com.google.android.gms.ads.internal.gmsg;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.ads.internal.C1806va;
import com.google.android.gms.ads.internal.overlay.C1781m;
import com.google.android.gms.ads.internal.overlay.C1787s;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.internal.ads.C2209Bp;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C2238Cp;
import com.google.android.gms.internal.ads.C2478La;
import com.google.android.gms.internal.ads.C2635Qh;
import com.google.android.gms.internal.ads.C2662Rh;
import com.google.android.gms.internal.ads.C2777Vh;
import com.google.android.gms.internal.ads.C2845Xs;
import com.google.android.gms.internal.ads.C2861Yh;
import com.google.android.gms.internal.ads.C2946ai;
import com.google.android.gms.internal.ads.C3021d;
import com.google.android.gms.internal.ads.C3520uh;
import com.google.android.gms.internal.ads.C3602xd;
import com.google.android.gms.internal.ads.zzang;
import java.net.URISyntaxException;
import java.util.Map;

@C2478La
/* renamed from: com.google.android.gms.ads.internal.gmsg.e */
public final class C1731e<T extends C2635Qh & C2662Rh & C2777Vh & C2861Yh & C2946ai> implements C1718E<T> {

    /* renamed from: a */
    private final Context f5697a;

    /* renamed from: b */
    private final C2209Bp f5698b;

    /* renamed from: c */
    private final zzang f5699c;

    /* renamed from: d */
    private final C1787s f5700d;

    /* renamed from: e */
    private final C2845Xs f5701e;

    /* renamed from: f */
    private final C1781m f5702f;

    /* renamed from: g */
    private final C1737k f5703g;

    /* renamed from: h */
    private final C1739m f5704h;

    /* renamed from: i */
    private final C1806va f5705i;

    /* renamed from: j */
    private final C3021d f5706j;

    /* renamed from: k */
    private final C3520uh f5707k = null;

    public C1731e(Context context, zzang zzang, C2209Bp bp, C1787s sVar, C2845Xs xs, C1737k kVar, C1739m mVar, C1781m mVar2, C1806va vaVar, C3021d dVar) {
        this.f5697a = context;
        this.f5699c = zzang;
        this.f5698b = bp;
        this.f5700d = sVar;
        this.f5701e = xs;
        this.f5703g = kVar;
        this.f5704h = mVar;
        this.f5705i = vaVar;
        this.f5706j = dVar;
        this.f5702f = mVar2;
    }

    /* renamed from: a */
    static String m7867a(Context context, C2209Bp bp, String str, View view, Activity activity) {
        if (bp == null) {
            return str;
        }
        try {
            Uri parse = Uri.parse(str);
            if (bp.mo7872b(parse)) {
                parse = bp.mo7868a(parse, context, view, activity);
            }
            return parse.toString();
        } catch (C2238Cp unused) {
            return str;
        } catch (Exception e) {
            C1697X.m7702i().mo8319a((Throwable) e, "OpenGmsgHandler.maybeAddClickSignalsToUrl");
            return str;
        }
    }

    /* renamed from: a */
    private final void m7868a(boolean z) {
        C3021d dVar = this.f5706j;
        if (dVar != null) {
            dVar.mo9303a(z);
        }
    }

    /* renamed from: a */
    private static boolean m7869a(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    /* renamed from: b */
    private static int m7870b(Map<String, String> map) {
        String str = map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return C1697X.m7700g().mo9725b();
        }
        if ("l".equalsIgnoreCase(str)) {
            return C1697X.m7700g().mo9712a();
        }
        if ("c".equalsIgnoreCase(str)) {
            return C1697X.m7700g().mo9728c();
        }
        return -1;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        C2635Qh qh = (C2635Qh) obj;
        String a = C3602xd.m14409a((String) map.get("u"), qh.getContext());
        String str = (String) map.get("a");
        if (str == null) {
            C2227Cf.m9536d("Action missing from an open GMSG.");
            return;
        }
        C1806va vaVar = this.f5705i;
        if (vaVar != null && !vaVar.mo7033b()) {
            this.f5705i.mo7032a(a);
        } else if ("expand".equalsIgnoreCase(str)) {
            if (((C2662Rh) qh).mo8165fb()) {
                C2227Cf.m9536d("Cannot expand WebView that is already expanded.");
                return;
            }
            m7868a(false);
            ((C2777Vh) qh).mo8152a(m7869a((Map<String, String>) map), m7870b(map));
        } else if ("webapp".equalsIgnoreCase(str)) {
            m7868a(false);
            if (a != null) {
                ((C2777Vh) qh).mo8153a(m7869a((Map<String, String>) map), m7870b(map), a);
            } else {
                ((C2777Vh) qh).mo8154a(m7869a((Map<String, String>) map), m7870b(map), (String) map.get("html"), (String) map.get("baseurl"));
            }
        } else if (!"app".equalsIgnoreCase(str) || !"true".equalsIgnoreCase((String) map.get("system_browser"))) {
            m7868a(true);
            String str2 = (String) map.get("intent_url");
            Intent intent = null;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    intent = Intent.parseUri(str2, 0);
                } catch (URISyntaxException e) {
                    String valueOf = String.valueOf(str2);
                    C2227Cf.m9533b(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), e);
                }
            }
            if (!(intent == null || intent.getData() == null)) {
                Uri data = intent.getData();
                String uri = data.toString();
                if (!TextUtils.isEmpty(uri)) {
                    try {
                        uri = m7867a(qh.getContext(), ((C2861Yh) qh).mo8171hb(), uri, ((C2946ai) qh).getView(), qh.mo8163eb());
                    } catch (Exception e2) {
                        C2227Cf.m9533b("Error occurred while adding signals.", e2);
                        C1697X.m7702i().mo8319a((Throwable) e2, "OpenGmsgHandler.onGmsg");
                    }
                    try {
                        data = Uri.parse(uri);
                    } catch (Exception e3) {
                        String valueOf2 = String.valueOf(uri);
                        C2227Cf.m9533b(valueOf2.length() != 0 ? "Error parsing the uri: ".concat(valueOf2) : new String("Error parsing the uri: "), e3);
                        C1697X.m7702i().mo8319a((Throwable) e3, "OpenGmsgHandler.onGmsg");
                    }
                }
                intent.setData(data);
            }
            if (intent != null) {
                ((C2777Vh) qh).mo8142a(new zzc(intent));
                return;
            }
            if (!TextUtils.isEmpty(a)) {
                a = m7867a(qh.getContext(), ((C2861Yh) qh).mo8171hb(), a, ((C2946ai) qh).getView(), qh.mo8163eb());
            }
            ((C2777Vh) qh).mo8142a(new zzc((String) map.get("i"), a, (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e")));
        } else {
            m7868a(true);
            qh.getContext();
            if (TextUtils.isEmpty(a)) {
                C2227Cf.m9536d("Destination url cannot be empty.");
                return;
            }
            try {
                ((C2777Vh) qh).mo8142a(new zzc(new C1732f(qh.getContext(), ((C2861Yh) qh).mo8171hb(), ((C2946ai) qh).getView()).mo6936a((Map<String, String>) map)));
            } catch (ActivityNotFoundException e4) {
                C2227Cf.m9536d(e4.getMessage());
            }
        }
    }
}
