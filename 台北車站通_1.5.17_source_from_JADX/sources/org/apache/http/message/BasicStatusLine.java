package org.apache.http.message;

import java.io.Serializable;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.annotation.Immutable;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

@Immutable
public class BasicStatusLine implements StatusLine, Cloneable, Serializable {
    private static final long serialVersionUID = -2443303766890459269L;
    private final ProtocolVersion protoVersion;
    private final String reasonPhrase;
    private final int statusCode;

    public BasicStatusLine(ProtocolVersion protocolVersion, int i, String str) {
        Args.notNull(protocolVersion, "Version");
        this.protoVersion = protocolVersion;
        Args.notNegative(i, "Status code");
        this.statusCode = i;
        this.reasonPhrase = str;
    }

    public Object clone() {
        return super.clone();
    }

    public ProtocolVersion getProtocolVersion() {
        return this.protoVersion;
    }

    public String getReasonPhrase() {
        return this.reasonPhrase;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String toString() {
        return BasicLineFormatter.INSTANCE.formatStatusLine((CharArrayBuffer) null, (StatusLine) this).toString();
    }
}
