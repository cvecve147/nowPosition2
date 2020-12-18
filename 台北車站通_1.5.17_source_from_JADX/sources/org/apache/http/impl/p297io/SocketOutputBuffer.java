package org.apache.http.impl.p297io;

import java.net.Socket;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

@NotThreadSafe
@Deprecated
/* renamed from: org.apache.http.impl.io.SocketOutputBuffer */
public class SocketOutputBuffer extends AbstractSessionOutputBuffer {
    public SocketOutputBuffer(Socket socket, int i, HttpParams httpParams) {
        Args.notNull(socket, "Socket");
        i = i < 0 ? socket.getSendBufferSize() : i;
        init(socket.getOutputStream(), i < 1024 ? 1024 : i, httpParams);
    }
}
