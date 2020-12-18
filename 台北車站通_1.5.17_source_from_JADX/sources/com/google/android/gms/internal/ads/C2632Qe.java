package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Executor;
import org.apache.http.client.methods.HttpGet;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Qe */
public final class C2632Qe {

    /* renamed from: a */
    private static C3623xy f8137a;

    /* renamed from: b */
    private static final Object f8138b = new Object();
    @Deprecated

    /* renamed from: c */
    private static final C2803We<Void> f8139c = new C2659Re();

    public C2632Qe(Context context) {
        m10971a(context.getApplicationContext() != null ? context.getApplicationContext() : context);
    }

    /* renamed from: a */
    private static C3623xy m10971a(Context context) {
        C3623xy xyVar;
        C3623xy xyVar2;
        synchronized (f8138b) {
            if (f8137a == null) {
                C2558Nu.m10773a(context);
                if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7816Sd)).booleanValue()) {
                    xyVar2 = C2454Ke.m10408a(context);
                } else {
                    xyVar2 = new C3623xy(new C2830Xe(new File(context.getCacheDir(), "volley")), new C3546vd((C2828Xc) new C2889Zh()));
                    xyVar2.mo10222a();
                }
                f8137a = xyVar2;
            }
            xyVar = f8137a;
        }
        return xyVar;
    }

    /* renamed from: a */
    public final C2804Wf<String> mo8740a(int i, String str, Map<String, String> map, byte[] bArr) {
        String str2 = str;
        C2858Ye ye = new C2858Ye((C2659Re) null);
        C2747Ue ue = new C2747Ue(this, str2, ye);
        C3548vf vfVar = new C3548vf((String) null);
        C2774Ve ve = new C2774Ve(this, i, str, ye, ue, bArr, map, vfVar);
        if (C3548vf.m14223a()) {
            try {
                vfVar.mo10123a(str2, HttpGet.METHOD_NAME, ve.mo7901a(), ve.mo7914n());
            } catch (C2936a e) {
                C2227Cf.m9536d(e.getMessage());
            }
        }
        f8137a.mo10221a(ve);
        return ye;
    }

    @Deprecated
    /* renamed from: a */
    public final <T> C2804Wf<T> mo8741a(String str, C2803We<T> we) {
        C3116gg ggVar = new C3116gg();
        f8137a.mo10221a(new C2886Ze(str, ggVar));
        return C2483Lf.m10499a(C2483Lf.m10498a(ggVar, new C2718Te(this, we), (Executor) C3057ee.f9097a), Throwable.class, new C2690Se(this, we), C2972bg.f8939b);
    }

    /* renamed from: a */
    public final C2804Wf<String> mo8742a(String str, Map<String, String> map) {
        return mo8740a(0, str, map, (byte[]) null);
    }
}
