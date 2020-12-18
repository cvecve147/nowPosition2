package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.common.api.C1872g;
import java.lang.ref.WeakReference;
import java.util.Map;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.fh */
public abstract class C3088fh implements C1872g {

    /* renamed from: a */
    protected Context f9138a;

    /* renamed from: b */
    private String f9139b;

    /* renamed from: c */
    private WeakReference<C2749Ug> f9140c;

    public C3088fh(C2749Ug ug) {
        this.f9138a = ug.getContext();
        this.f9139b = C1697X.m7698e().mo9454b(this.f9138a, ug.mo8201ub().f10855a);
        this.f9140c = new WeakReference<>(ug);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m12321a(String str, Map<String, String> map) {
        C2749Ug ug = (C2749Ug) this.f9140c.get();
        if (ug != null) {
            ug.mo8149a(str, (Map<String, ?>) map);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m12322b(java.lang.String r1) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -1947652542: goto L_0x007d;
                case -1396664534: goto L_0x0072;
                case -1347010958: goto L_0x0068;
                case -918817863: goto L_0x005d;
                case -659376217: goto L_0x0053;
                case -642208130: goto L_0x0049;
                case -354048396: goto L_0x003e;
                case -32082395: goto L_0x0033;
                case 3387234: goto L_0x0029;
                case 96784904: goto L_0x001f;
                case 580119100: goto L_0x0014;
                case 725497484: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0087
        L_0x0009:
            java.lang.String r0 = "noCacheDir"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 7
            goto L_0x0088
        L_0x0014:
            java.lang.String r0 = "expireFailed"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 6
            goto L_0x0088
        L_0x001f:
            java.lang.String r0 = "error"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 1
            goto L_0x0088
        L_0x0029:
            java.lang.String r0 = "noop"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 4
            goto L_0x0088
        L_0x0033:
            java.lang.String r0 = "externalAbort"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 10
            goto L_0x0088
        L_0x003e:
            java.lang.String r0 = "sizeExceeded"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 11
            goto L_0x0088
        L_0x0049:
            java.lang.String r0 = "playerFailed"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 5
            goto L_0x0088
        L_0x0053:
            java.lang.String r0 = "contentLengthMissing"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 0
            goto L_0x0088
        L_0x005d:
            java.lang.String r0 = "downloadTimeout"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 9
            goto L_0x0088
        L_0x0068:
            java.lang.String r0 = "inProgress"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 2
            goto L_0x0088
        L_0x0072:
            java.lang.String r0 = "badUrl"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 8
            goto L_0x0088
        L_0x007d:
            java.lang.String r0 = "interrupted"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 3
            goto L_0x0088
        L_0x0087:
            r1 = -1
        L_0x0088:
            java.lang.String r0 = "internal"
            switch(r1) {
                case 0: goto L_0x0096;
                case 1: goto L_0x0096;
                case 2: goto L_0x0096;
                case 3: goto L_0x0096;
                case 4: goto L_0x0096;
                case 5: goto L_0x0096;
                case 6: goto L_0x0094;
                case 7: goto L_0x0094;
                case 8: goto L_0x0091;
                case 9: goto L_0x0091;
                case 10: goto L_0x008e;
                case 11: goto L_0x008e;
                default: goto L_0x008d;
            }
        L_0x008d:
            goto L_0x0096
        L_0x008e:
            java.lang.String r0 = "policy"
            goto L_0x0096
        L_0x0091:
            java.lang.String r0 = "network"
            goto L_0x0096
        L_0x0094:
            java.lang.String r0 = "io"
        L_0x0096:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3088fh.m12322b(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public void mo7319a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9421a(String str, String str2, int i) {
        C3432rf.f10110a.post(new C3145hh(this, str, str2, i));
    }

    /* renamed from: a */
    public final void mo9422a(String str, String str2, String str3, String str4) {
        C3432rf.f10110a.post(new C3173ih(this, str, str2, str3, str4));
    }

    /* renamed from: a */
    public abstract boolean mo9423a(String str);

    /* renamed from: b */
    public abstract void mo9424b();
}
