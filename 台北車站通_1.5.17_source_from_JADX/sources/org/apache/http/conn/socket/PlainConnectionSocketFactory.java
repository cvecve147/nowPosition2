package org.apache.http.conn.socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import org.apache.http.HttpHost;
import org.apache.http.annotation.Immutable;
import org.apache.http.protocol.HttpContext;

@Immutable
public class PlainConnectionSocketFactory implements ConnectionSocketFactory {
    public static final PlainConnectionSocketFactory INSTANCE = new PlainConnectionSocketFactory();

    public static PlainConnectionSocketFactory getSocketFactory() {
        return INSTANCE;
    }

    public Socket connectSocket(int i, Socket socket, HttpHost httpHost, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, HttpContext httpContext) {
        if (socket == null) {
            socket = createSocket(httpContext);
        }
        if (inetSocketAddress2 != null) {
            socket.bind(inetSocketAddress2);
        }
        try {
            socket.connect(inetSocketAddress, i);
            return socket;
        } catch (IOException e) {
            try {
                socket.close();
            } catch (IOException unused) {
            }
            throw e;
        }
    }

    public Socket createSocket(HttpContext httpContext) {
        return new Socket();
    }
}
