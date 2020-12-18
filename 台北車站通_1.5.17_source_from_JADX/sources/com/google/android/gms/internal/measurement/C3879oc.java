package com.google.android.gms.internal.measurement;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* renamed from: com.google.android.gms.internal.measurement.oc */
final class C3879oc extends SSLSocket {

    /* renamed from: a */
    private final SSLSocket f11573a;

    C3879oc(C3875nc ncVar, SSLSocket sSLSocket) {
        this.f11573a = sSLSocket;
    }

    public final void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.f11573a.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void bind(SocketAddress socketAddress) {
        this.f11573a.bind(socketAddress);
    }

    public final synchronized void close() {
        this.f11573a.close();
    }

    public final void connect(SocketAddress socketAddress) {
        this.f11573a.connect(socketAddress);
    }

    public final void connect(SocketAddress socketAddress, int i) {
        this.f11573a.connect(socketAddress, i);
    }

    public final boolean equals(Object obj) {
        return this.f11573a.equals(obj);
    }

    public final SocketChannel getChannel() {
        return this.f11573a.getChannel();
    }

    public final boolean getEnableSessionCreation() {
        return this.f11573a.getEnableSessionCreation();
    }

    public final String[] getEnabledCipherSuites() {
        return this.f11573a.getEnabledCipherSuites();
    }

    public final String[] getEnabledProtocols() {
        return this.f11573a.getEnabledProtocols();
    }

    public final InetAddress getInetAddress() {
        return this.f11573a.getInetAddress();
    }

    public final InputStream getInputStream() {
        return this.f11573a.getInputStream();
    }

    public final boolean getKeepAlive() {
        return this.f11573a.getKeepAlive();
    }

    public final InetAddress getLocalAddress() {
        return this.f11573a.getLocalAddress();
    }

    public final int getLocalPort() {
        return this.f11573a.getLocalPort();
    }

    public final SocketAddress getLocalSocketAddress() {
        return this.f11573a.getLocalSocketAddress();
    }

    public final boolean getNeedClientAuth() {
        return this.f11573a.getNeedClientAuth();
    }

    public final boolean getOOBInline() {
        return this.f11573a.getOOBInline();
    }

    public final OutputStream getOutputStream() {
        return this.f11573a.getOutputStream();
    }

    public final int getPort() {
        return this.f11573a.getPort();
    }

    public final synchronized int getReceiveBufferSize() {
        return this.f11573a.getReceiveBufferSize();
    }

    public final SocketAddress getRemoteSocketAddress() {
        return this.f11573a.getRemoteSocketAddress();
    }

    public final boolean getReuseAddress() {
        return this.f11573a.getReuseAddress();
    }

    public final synchronized int getSendBufferSize() {
        return this.f11573a.getSendBufferSize();
    }

    public final SSLSession getSession() {
        return this.f11573a.getSession();
    }

    public final int getSoLinger() {
        return this.f11573a.getSoLinger();
    }

    public final synchronized int getSoTimeout() {
        return this.f11573a.getSoTimeout();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f11573a.getSupportedCipherSuites();
    }

    public final String[] getSupportedProtocols() {
        return this.f11573a.getSupportedProtocols();
    }

    public final boolean getTcpNoDelay() {
        return this.f11573a.getTcpNoDelay();
    }

    public final int getTrafficClass() {
        return this.f11573a.getTrafficClass();
    }

    public final boolean getUseClientMode() {
        return this.f11573a.getUseClientMode();
    }

    public final boolean getWantClientAuth() {
        return this.f11573a.getWantClientAuth();
    }

    public final boolean isBound() {
        return this.f11573a.isBound();
    }

    public final boolean isClosed() {
        return this.f11573a.isClosed();
    }

    public final boolean isConnected() {
        return this.f11573a.isConnected();
    }

    public final boolean isInputShutdown() {
        return this.f11573a.isInputShutdown();
    }

    public final boolean isOutputShutdown() {
        return this.f11573a.isOutputShutdown();
    }

    public final void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.f11573a.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void sendUrgentData(int i) {
        this.f11573a.sendUrgentData(i);
    }

    public final void setEnableSessionCreation(boolean z) {
        this.f11573a.setEnableSessionCreation(z);
    }

    public final void setEnabledCipherSuites(String[] strArr) {
        this.f11573a.setEnabledCipherSuites(strArr);
    }

    public final void setEnabledProtocols(String[] strArr) {
        if (strArr != null && Arrays.asList(strArr).contains("SSLv3")) {
            ArrayList arrayList = new ArrayList(Arrays.asList(this.f11573a.getEnabledProtocols()));
            if (arrayList.size() > 1) {
                arrayList.remove("SSLv3");
            }
            strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        this.f11573a.setEnabledProtocols(strArr);
    }

    public final void setKeepAlive(boolean z) {
        this.f11573a.setKeepAlive(z);
    }

    public final void setNeedClientAuth(boolean z) {
        this.f11573a.setNeedClientAuth(z);
    }

    public final void setOOBInline(boolean z) {
        this.f11573a.setOOBInline(z);
    }

    public final void setPerformancePreferences(int i, int i2, int i3) {
        this.f11573a.setPerformancePreferences(i, i2, i3);
    }

    public final synchronized void setReceiveBufferSize(int i) {
        this.f11573a.setReceiveBufferSize(i);
    }

    public final void setReuseAddress(boolean z) {
        this.f11573a.setReuseAddress(z);
    }

    public final synchronized void setSendBufferSize(int i) {
        this.f11573a.setSendBufferSize(i);
    }

    public final void setSoLinger(boolean z, int i) {
        this.f11573a.setSoLinger(z, i);
    }

    public final synchronized void setSoTimeout(int i) {
        this.f11573a.setSoTimeout(i);
    }

    public final void setTcpNoDelay(boolean z) {
        this.f11573a.setTcpNoDelay(z);
    }

    public final void setTrafficClass(int i) {
        this.f11573a.setTrafficClass(i);
    }

    public final void setUseClientMode(boolean z) {
        this.f11573a.setUseClientMode(z);
    }

    public final void setWantClientAuth(boolean z) {
        this.f11573a.setWantClientAuth(z);
    }

    public final void shutdownInput() {
        this.f11573a.shutdownInput();
    }

    public final void shutdownOutput() {
        this.f11573a.shutdownOutput();
    }

    public final void startHandshake() {
        this.f11573a.startHandshake();
    }

    public final String toString() {
        return this.f11573a.toString();
    }
}
