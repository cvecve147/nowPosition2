package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import java.util.regex.Pattern;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Ke */
public final class C2454Ke extends C3546vd {

    /* renamed from: e */
    private final Context f7441e;

    private C2454Ke(Context context, C3634yh yhVar) {
        super(yhVar);
        this.f7441e = context;
    }

    /* renamed from: a */
    public static C3623xy m10408a(Context context) {
        C3623xy xyVar = new C3623xy(new C2830Xe(new File(context.getCacheDir(), "admob_volley")), new C2454Ke(context, new C2889Zh()));
        xyVar.mo10222a();
        return xyVar;
    }

    /* renamed from: a */
    public final C2272Dv mo8398a(C2216Bw<?> bw) {
        if (bw.mo7915o() && bw.mo7907b() == 0) {
            if (Pattern.matches((String) C3390pt.m13458f().mo8515a(C2558Nu.f7822Td), bw.mo7909c())) {
                C3390pt.m13453a();
                if (C3432rf.m13611c(this.f7441e)) {
                    C2272Dv a = new C3190ix(this.f7441e).mo8398a(bw);
                    if (a != null) {
                        String valueOf = String.valueOf(bw.mo7909c());
                        C2857Yd.m11615f(valueOf.length() != 0 ? "Got gmscore asset response: ".concat(valueOf) : new String("Got gmscore asset response: "));
                        return a;
                    }
                    String valueOf2 = String.valueOf(bw.mo7909c());
                    C2857Yd.m11615f(valueOf2.length() != 0 ? "Failed to get gmscore asset response: ".concat(valueOf2) : new String("Failed to get gmscore asset response: "));
                }
            }
        }
        return super.mo8398a(bw);
    }
}
