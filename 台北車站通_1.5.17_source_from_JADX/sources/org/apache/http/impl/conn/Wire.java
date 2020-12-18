package org.apache.http.impl.conn;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.apache.commons.logging.Log;
import org.apache.http.annotation.Immutable;
import org.apache.http.message.TokenParser;
import org.apache.http.util.Args;

@Immutable
public class Wire {

    /* renamed from: id */
    private final String f19307id;
    private final Log log;

    public Wire(Log log2) {
        this(log2, "");
    }

    public Wire(Log log2, String str) {
        this.log = log2;
        this.f19307id = str;
    }

    private void wire(String str, InputStream inputStream) {
        String str2;
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                break;
            }
            if (read == 13) {
                str2 = "[\\r]";
            } else if (read == 10) {
                sb.append("[\\n]\"");
                sb.insert(0, "\"");
                sb.insert(0, str);
                Log log2 = this.log;
                log2.debug(this.f19307id + " " + sb.toString());
                sb.setLength(0);
            } else if (read < 32 || read > 127) {
                sb.append("[0x");
                sb.append(Integer.toHexString(read));
                str2 = "]";
            } else {
                sb.append((char) read);
            }
            sb.append(str2);
        }
        if (sb.length() > 0) {
            sb.append(TokenParser.DQUOTE);
            sb.insert(0, TokenParser.DQUOTE);
            sb.insert(0, str);
            Log log3 = this.log;
            log3.debug(this.f19307id + " " + sb.toString());
        }
    }

    public boolean enabled() {
        return this.log.isDebugEnabled();
    }

    public void input(int i) {
        input(new byte[]{(byte) i});
    }

    public void input(InputStream inputStream) {
        Args.notNull(inputStream, "Input");
        wire("<< ", inputStream);
    }

    public void input(String str) {
        Args.notNull(str, "Input");
        input(str.getBytes());
    }

    public void input(byte[] bArr) {
        Args.notNull(bArr, "Input");
        wire("<< ", new ByteArrayInputStream(bArr));
    }

    public void input(byte[] bArr, int i, int i2) {
        Args.notNull(bArr, "Input");
        wire("<< ", new ByteArrayInputStream(bArr, i, i2));
    }

    public void output(int i) {
        output(new byte[]{(byte) i});
    }

    public void output(InputStream inputStream) {
        Args.notNull(inputStream, "Output");
        wire(">> ", inputStream);
    }

    public void output(String str) {
        Args.notNull(str, "Output");
        output(str.getBytes());
    }

    public void output(byte[] bArr) {
        Args.notNull(bArr, "Output");
        wire(">> ", new ByteArrayInputStream(bArr));
    }

    public void output(byte[] bArr, int i, int i2) {
        Args.notNull(bArr, "Output");
        wire(">> ", new ByteArrayInputStream(bArr, i, i2));
    }
}
