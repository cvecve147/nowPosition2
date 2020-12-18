package org.apache.http;

import java.nio.charset.Charset;
import org.apache.http.protocol.HTTP;

public final class Consts {
    public static final Charset ASCII = Charset.forName("US-ASCII");

    /* renamed from: CR */
    public static final int f19290CR = 13;

    /* renamed from: HT */
    public static final int f19291HT = 9;
    public static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");

    /* renamed from: LF */
    public static final int f19292LF = 10;

    /* renamed from: SP */
    public static final int f19293SP = 32;
    public static final Charset UTF_8 = Charset.forName(HTTP.UTF_8);

    private Consts() {
    }
}
