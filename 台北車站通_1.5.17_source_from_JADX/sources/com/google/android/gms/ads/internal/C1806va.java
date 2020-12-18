package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C2478La;
import com.google.android.gms.internal.ads.C3114ge;
import com.google.android.gms.internal.ads.C3345od;
import com.google.android.gms.internal.ads.zzael;
import java.util.List;
import java.util.Map;

@C2478La
/* renamed from: com.google.android.gms.ads.internal.va */
public final class C1806va {

    /* renamed from: a */
    private final Context f5902a;

    /* renamed from: b */
    private boolean f5903b;

    /* renamed from: c */
    private C3345od f5904c;

    /* renamed from: d */
    private zzael f5905d;

    public C1806va(Context context, C3345od odVar, zzael zzael) {
        this.f5902a = context;
        this.f5904c = odVar;
        this.f5905d = zzael;
        if (this.f5905d == null) {
            this.f5905d = new zzael();
        }
    }

    /* renamed from: c */
    private final boolean m8051c() {
        C3345od odVar = this.f5904c;
        return (odVar != null && odVar.mo9379d().f10852f) || this.f5905d.f10828a;
    }

    /* renamed from: a */
    public final void mo7031a() {
        this.f5903b = true;
    }

    /* renamed from: a */
    public final void mo7032a(String str) {
        List<String> list;
        if (m8051c()) {
            if (str == null) {
                str = "";
            }
            C3345od odVar = this.f5904c;
            if (odVar != null) {
                odVar.mo9373a(str, (Map<String, String>) null, 3);
                return;
            }
            zzael zzael = this.f5905d;
            if (zzael.f10828a && (list = zzael.f10829b) != null) {
                for (String next : list) {
                    if (!TextUtils.isEmpty(next)) {
                        String replace = next.replace("{NAVIGATION_URL}", Uri.encode(str));
                        C1697X.m7698e();
                        C3114ge.m12409a(this.f5902a, "", replace);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean mo7033b() {
        return !m8051c() || this.f5903b;
    }
}
