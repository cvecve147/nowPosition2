package p208e.p209a.p210a.p211a.p212a.p218e;

import java.security.GeneralSecurityException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.LinkedList;

/* renamed from: e.a.a.a.a.e.a */
final class C6144a {
    /* renamed from: a */
    private static boolean m23238a(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!x509Certificate.getSubjectX500Principal().equals(x509Certificate2.getIssuerX500Principal())) {
            return false;
        }
        try {
            x509Certificate2.verify(x509Certificate.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static X509Certificate[] m23239a(X509Certificate[] x509CertificateArr, C6160l lVar) {
        LinkedList linkedList = new LinkedList();
        boolean b = lVar.mo16232b(x509CertificateArr[0]);
        linkedList.add(x509CertificateArr[0]);
        boolean z = true;
        boolean z2 = b;
        int i = 1;
        while (i < x509CertificateArr.length) {
            if (lVar.mo16232b(x509CertificateArr[i])) {
                z2 = true;
            }
            if (!m23238a(x509CertificateArr[i], x509CertificateArr[i - 1])) {
                break;
            }
            linkedList.add(x509CertificateArr[i]);
            i++;
        }
        X509Certificate a = lVar.mo16231a(x509CertificateArr[i - 1]);
        if (a != null) {
            linkedList.add(a);
        } else {
            z = z2;
        }
        if (z) {
            return (X509Certificate[]) linkedList.toArray(new X509Certificate[linkedList.size()]);
        }
        throw new CertificateException("Didn't find a trust anchor in chain cleanup!");
    }
}
