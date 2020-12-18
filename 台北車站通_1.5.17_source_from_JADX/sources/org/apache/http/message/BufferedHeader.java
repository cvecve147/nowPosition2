package org.apache.http.message;

import java.io.Serializable;
import org.apache.http.FormattedHeader;
import org.apache.http.HeaderElement;
import org.apache.http.ParseException;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

@NotThreadSafe
public class BufferedHeader implements FormattedHeader, Cloneable, Serializable {
    private static final long serialVersionUID = -2768352615787625448L;
    private final CharArrayBuffer buffer;
    private final String name;
    private final int valuePos;

    public BufferedHeader(CharArrayBuffer charArrayBuffer) {
        Args.notNull(charArrayBuffer, "Char array buffer");
        int indexOf = charArrayBuffer.indexOf(58);
        if (indexOf != -1) {
            String substringTrimmed = charArrayBuffer.substringTrimmed(0, indexOf);
            if (substringTrimmed.length() != 0) {
                this.buffer = charArrayBuffer;
                this.name = substringTrimmed;
                this.valuePos = indexOf + 1;
                return;
            }
            throw new ParseException("Invalid header: " + charArrayBuffer.toString());
        }
        throw new ParseException("Invalid header: " + charArrayBuffer.toString());
    }

    public Object clone() {
        return super.clone();
    }

    public CharArrayBuffer getBuffer() {
        return this.buffer;
    }

    public HeaderElement[] getElements() {
        ParserCursor parserCursor = new ParserCursor(0, this.buffer.length());
        parserCursor.updatePos(this.valuePos);
        return BasicHeaderValueParser.INSTANCE.parseElements(this.buffer, parserCursor);
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        CharArrayBuffer charArrayBuffer = this.buffer;
        return charArrayBuffer.substringTrimmed(this.valuePos, charArrayBuffer.length());
    }

    public int getValuePos() {
        return this.valuePos;
    }

    public String toString() {
        return this.buffer.toString();
    }
}
