package org.apache.http.message;

import java.util.NoSuchElementException;
import org.apache.http.HeaderIterator;
import org.apache.http.ParseException;
import org.apache.http.TokenIterator;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.util.Args;

@NotThreadSafe
public class BasicTokenIterator implements TokenIterator {
    public static final String HTTP_SEPARATORS = " ,;=()<>@:\\\"/[]?{}\t";
    protected String currentHeader;
    protected String currentToken;
    protected final HeaderIterator headerIt;
    protected int searchPos = findNext(-1);

    public BasicTokenIterator(HeaderIterator headerIterator) {
        Args.notNull(headerIterator, "Header iterator");
        this.headerIt = headerIterator;
    }

    /* access modifiers changed from: protected */
    public String createToken(String str, int i, int i2) {
        return str.substring(i, i2);
    }

    /* access modifiers changed from: protected */
    public int findNext(int i) {
        int i2;
        String createToken;
        int i3 = -1;
        if (i >= 0) {
            i2 = findTokenSeparator(i);
        } else if (!this.headerIt.hasNext()) {
            return -1;
        } else {
            this.currentHeader = this.headerIt.nextHeader().getValue();
            i2 = 0;
        }
        int findTokenStart = findTokenStart(i2);
        if (findTokenStart < 0) {
            createToken = null;
        } else {
            i3 = findTokenEnd(findTokenStart);
            createToken = createToken(this.currentHeader, findTokenStart, i3);
        }
        this.currentToken = createToken;
        return i3;
    }

    /* access modifiers changed from: protected */
    public int findTokenEnd(int i) {
        Args.notNegative(i, "Search position");
        int length = this.currentHeader.length();
        do {
            i++;
            if (i >= length || !isTokenChar(this.currentHeader.charAt(i))) {
                return i;
            }
            i++;
            break;
        } while (!isTokenChar(this.currentHeader.charAt(i)));
        return i;
    }

    /* access modifiers changed from: protected */
    public int findTokenSeparator(int i) {
        Args.notNegative(i, "Search position");
        int length = this.currentHeader.length();
        boolean z = false;
        while (!z && i < length) {
            char charAt = this.currentHeader.charAt(i);
            if (isTokenSeparator(charAt)) {
                z = true;
            } else if (isWhitespace(charAt)) {
                i++;
            } else if (isTokenChar(charAt)) {
                throw new ParseException("Tokens without separator (pos " + i + "): " + this.currentHeader);
            } else {
                throw new ParseException("Invalid character after token (pos " + i + "): " + this.currentHeader);
            }
        }
        return i;
    }

    /* access modifiers changed from: protected */
    public int findTokenStart(int i) {
        Args.notNegative(i, "Search position");
        int i2 = i;
        boolean z = false;
        while (!z) {
            String str = this.currentHeader;
            if (str == null) {
                break;
            }
            int length = str.length();
            while (!z && i2 < length) {
                char charAt = this.currentHeader.charAt(i2);
                if (isTokenSeparator(charAt) || isWhitespace(charAt)) {
                    i2++;
                } else if (isTokenChar(this.currentHeader.charAt(i2))) {
                    z = true;
                } else {
                    throw new ParseException("Invalid character before token (pos " + i2 + "): " + this.currentHeader);
                }
            }
            if (!z) {
                if (this.headerIt.hasNext()) {
                    this.currentHeader = this.headerIt.nextHeader().getValue();
                    i2 = 0;
                } else {
                    this.currentHeader = null;
                }
            }
        }
        if (z) {
            return i2;
        }
        return -1;
    }

    public boolean hasNext() {
        return this.currentToken != null;
    }

    /* access modifiers changed from: protected */
    public boolean isHttpSeparator(char c) {
        return HTTP_SEPARATORS.indexOf(c) >= 0;
    }

    /* access modifiers changed from: protected */
    public boolean isTokenChar(char c) {
        if (Character.isLetterOrDigit(c)) {
            return true;
        }
        return !Character.isISOControl(c) && !isHttpSeparator(c);
    }

    /* access modifiers changed from: protected */
    public boolean isTokenSeparator(char c) {
        return c == ',';
    }

    /* access modifiers changed from: protected */
    public boolean isWhitespace(char c) {
        return c == 9 || Character.isSpaceChar(c);
    }

    public final Object next() {
        return nextToken();
    }

    public String nextToken() {
        String str = this.currentToken;
        if (str != null) {
            this.searchPos = findNext(this.searchPos);
            return str;
        }
        throw new NoSuchElementException("Iteration already finished.");
    }

    public final void remove() {
        throw new UnsupportedOperationException("Removing tokens is not supported.");
    }
}
