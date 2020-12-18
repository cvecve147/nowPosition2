package com.google.android.gms.internal.measurement;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.internal.measurement.nc */
final class C3875nc extends SSLSocketFactory {

    /* renamed from: a */
    private final SSLSocketFactory f11567a;

    C3875nc() {
        this(HttpsURLConnection.getDefaultSSLSocketFactory());
    }

    private C3875nc(SSLSocketFactory sSLSocketFactory) {
        this.f11567a = sSLSocketFactory;
    }

    /* renamed from: a */
    private final SSLSocket m15604a(SSLSocket sSLSocket) {
        return new C3879oc(this, sSLSocket);
    }

    public final Socket createSocket() {
        return m15604a((SSLSocket) this.f11567a.createSocket());
    }

    public final Socket createSocket(String str, int i) {
        return m15604a((SSLSocket) this.f11567a.createSocket(str, i));
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return m15604a((SSLSocket) this.f11567a.createSocket(str, i, inetAddress, i2));
    }

    public final Socket createSocket(InetAddress inetAddress, int i) {
        return m15604a((SSLSocket) this.f11567a.createSocket(inetAddress, i));
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return m15604a((SSLSocket) this.f11567a.createSocket(inetAddress, i, inetAddress2, i2));
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        return m15604a((SSLSocket) this.f11567a.createSocket(socket, str, i, z));
    }

    public final String[] getDefaultCipherSuites() {
        return this.f11567a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f11567a.getSupportedCipherSuites();
    }
}
