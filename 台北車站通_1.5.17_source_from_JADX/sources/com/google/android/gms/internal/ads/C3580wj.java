package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;

/* renamed from: com.google.android.gms.internal.ads.wj */
public class C3580wj extends C2216Bw<String> {

    /* renamed from: p */
    private final Object f10439p = new Object();

    /* renamed from: q */
    private C3426rA<String> f10440q;

    public C3580wj(int i, String str, C3426rA<String> rAVar, C2907Zz zz) {
        super(i, str, zz);
        this.f10440q = rAVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C3652yz<String> mo7900a(C2272Dv dv) {
        String str;
        try {
            byte[] bArr = dv.f6920b;
            String str2 = "ISO-8859-1";
            String str3 = dv.f6921c.get("Content-Type");
            if (str3 != null) {
                String[] split = str3.split(";");
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    String[] split2 = split[i].trim().split("=");
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str2 = split2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str2);
        } catch (UnsupportedEncodingException unused) {
            str = new String(dv.f6920b);
        }
        return C3652yz.m14676a(str, C3605xg.m14418a(dv));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo8945c(String str) {
        C3426rA<String> rAVar;
        synchronized (this.f10439p) {
            rAVar = this.f10440q;
        }
        if (rAVar != null) {
            rAVar.mo9065a(str);
        }
    }
}
