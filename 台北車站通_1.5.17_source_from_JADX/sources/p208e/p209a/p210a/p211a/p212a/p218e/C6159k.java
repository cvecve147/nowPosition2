package p208e.p209a.p210a.p211a.p212a.p218e;

import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import p208e.p209a.p210a.p211a.C6199f;
import p208e.p209a.p210a.p211a.C6211p;

/* renamed from: e.a.a.a.a.e.k */
class C6159k implements X509TrustManager {

    /* renamed from: a */
    private static final X509Certificate[] f17171a = new X509Certificate[0];

    /* renamed from: b */
    private final TrustManager[] f17172b;

    /* renamed from: c */
    private final C6160l f17173c;

    /* renamed from: d */
    private final long f17174d;

    /* renamed from: e */
    private final List<byte[]> f17175e = new LinkedList();

    /* renamed from: f */
    private final Set<X509Certificate> f17176f = Collections.synchronizedSet(new HashSet());

    public C6159k(C6160l lVar, C6158j jVar) {
        this.f17172b = m23321a(lVar);
        this.f17173c = lVar;
        this.f17174d = jVar.mo14774d();
        for (String a : jVar.mo14773c()) {
            this.f17175e.add(m23320a(a));
        }
    }

    /* renamed from: a */
    private void m23317a(X509Certificate[] x509CertificateArr) {
        if (this.f17174d == -1 || System.currentTimeMillis() - this.f17174d <= 15552000000L) {
            X509Certificate[] a = C6144a.m23239a(x509CertificateArr, this.f17173c);
            int length = a.length;
            int i = 0;
            while (i < length) {
                if (!m23319a(a[i])) {
                    i++;
                } else {
                    return;
                }
            }
            throw new CertificateException("No valid pins found in chain!");
        }
        C6211p f = C6199f.m23420f();
        f.mo16262a("Fabric", "Certificate pins are stale, (" + (System.currentTimeMillis() - this.f17174d) + " millis vs " + 15552000000L + " millis) falling back to system trust.");
    }

    /* renamed from: a */
    private void m23318a(X509Certificate[] x509CertificateArr, String str) {
        for (TrustManager trustManager : this.f17172b) {
            ((X509TrustManager) trustManager).checkServerTrusted(x509CertificateArr, str);
        }
    }

    /* renamed from: a */
    private boolean m23319a(X509Certificate x509Certificate) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(x509Certificate.getPublicKey().getEncoded());
            for (byte[] equals : this.f17175e) {
                if (Arrays.equals(equals, digest)) {
                    return true;
                }
            }
            return false;
        } catch (NoSuchAlgorithmException e) {
            throw new CertificateException(e);
        }
    }

    /* renamed from: a */
    private byte[] m23320a(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    /* renamed from: a */
    private TrustManager[] m23321a(C6160l lVar) {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance("X509");
            instance.init(lVar.f17177a);
            return instance.getTrustManagers();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        } catch (KeyStoreException e2) {
            throw new AssertionError(e2);
        }
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        throw new CertificateException("Client certificates not supported!");
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        if (!this.f17176f.contains(x509CertificateArr[0])) {
            m23318a(x509CertificateArr, str);
            m23317a(x509CertificateArr);
            this.f17176f.add(x509CertificateArr[0]);
        }
    }

    public X509Certificate[] getAcceptedIssuers() {
        return f17171a;
    }
}
