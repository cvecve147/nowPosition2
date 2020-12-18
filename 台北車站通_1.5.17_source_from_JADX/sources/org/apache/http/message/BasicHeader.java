package org.apache.http.message;

import java.io.Serializable;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.annotation.Immutable;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

@Immutable
public class BasicHeader implements Header, Cloneable, Serializable {
    private static final long serialVersionUID = -5427236326487562174L;
    private final String name;
    private final String value;

    public BasicHeader(String str, String str2) {
        Args.notNull(str, "Name");
        this.name = str;
        this.value = str2;
    }

    public Object clone() {
        return super.clone();
    }

    public HeaderElement[] getElements() {
        String str = this.value;
        return str != null ? BasicHeaderValueParser.parseElements(str, (HeaderValueParser) null) : new HeaderElement[0];
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public String toString() {
        return BasicLineFormatter.INSTANCE.formatHeader((CharArrayBuffer) null, (Header) this).toString();
    }
}
