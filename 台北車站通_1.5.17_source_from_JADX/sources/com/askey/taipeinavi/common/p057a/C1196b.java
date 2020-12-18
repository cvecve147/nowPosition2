package com.askey.taipeinavi.common.p057a;

import android.net.http.SslCertificate;
import android.net.http.SslError;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.askey.taipeinavi.common.a.b */
public class C1196b {

    /* renamed from: a */
    private static C1196b f4383a;

    /* renamed from: b */
    private final List<C1195a> f4384b = new ArrayList();

    private C1196b() {
        this.f4384b.add(new C1197c());
    }

    /* renamed from: a */
    public static C1196b m5987a() {
        if (f4383a == null) {
            f4383a = new C1196b();
        }
        return f4383a;
    }

    /* renamed from: a */
    private boolean m5988a(SslCertificate.DName dName, String str, String str2) {
        return (dName == null || dName.getCName() == null || !dName.getCName().equals(str) || dName.getOName() == null || !dName.getOName().equals(str2)) ? false : true;
    }

    /* renamed from: b */
    private boolean m5989b(SslError sslError) {
        SslCertificate.DName issuedBy = sslError.getCertificate().getIssuedBy();
        SslCertificate.DName issuedTo = sslError.getCertificate().getIssuedTo();
        for (C1195a next : this.f4384b) {
            if (m5988a(issuedBy, next.mo5497c(), next.mo5498d()) && m5988a(issuedTo, next.mo5496b(), next.mo5495a())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo5499a(SslError sslError) {
        return m5989b(sslError);
    }
}
