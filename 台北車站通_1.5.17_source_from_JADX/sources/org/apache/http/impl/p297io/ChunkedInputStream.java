package org.apache.http.impl.p297io;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.ConnectionClosedException;
import org.apache.http.Header;
import org.apache.http.HttpException;
import org.apache.http.MalformedChunkCodingException;
import org.apache.http.TruncatedChunkException;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.config.MessageConstraints;
import org.apache.http.message.LineParser;
import org.apache.http.p298io.BufferInfo;
import org.apache.http.p298io.SessionInputBuffer;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

@NotThreadSafe
/* renamed from: org.apache.http.impl.io.ChunkedInputStream */
public class ChunkedInputStream extends InputStream {
    private static final int BUFFER_SIZE = 2048;
    private static final int CHUNK_CRLF = 3;
    private static final int CHUNK_DATA = 2;
    private static final int CHUNK_INVALID = Integer.MAX_VALUE;
    private static final int CHUNK_LEN = 1;
    private final CharArrayBuffer buffer;
    private int chunkSize;
    private boolean closed;
    private final MessageConstraints constraints;
    private boolean eof;
    private Header[] footers;

    /* renamed from: in */
    private final SessionInputBuffer f19309in;
    private int pos;
    private int state;

    public ChunkedInputStream(SessionInputBuffer sessionInputBuffer) {
        this(sessionInputBuffer, (MessageConstraints) null);
    }

    public ChunkedInputStream(SessionInputBuffer sessionInputBuffer, MessageConstraints messageConstraints) {
        this.eof = false;
        this.closed = false;
        this.footers = new Header[0];
        Args.notNull(sessionInputBuffer, "Session input buffer");
        this.f19309in = sessionInputBuffer;
        this.pos = 0;
        this.buffer = new CharArrayBuffer(16);
        this.constraints = messageConstraints == null ? MessageConstraints.DEFAULT : messageConstraints;
        this.state = 1;
    }

    private int getChunkSize() {
        int i = this.state;
        if (i != 1) {
            if (i == 3) {
                this.buffer.clear();
                if (this.f19309in.readLine(this.buffer) == -1) {
                    throw new MalformedChunkCodingException("CRLF expected at end of chunk");
                } else if (this.buffer.isEmpty()) {
                    this.state = 1;
                } else {
                    throw new MalformedChunkCodingException("Unexpected content at the end of chunk");
                }
            } else {
                throw new IllegalStateException("Inconsistent codec state");
            }
        }
        this.buffer.clear();
        if (this.f19309in.readLine(this.buffer) != -1) {
            int indexOf = this.buffer.indexOf(59);
            if (indexOf < 0) {
                indexOf = this.buffer.length();
            }
            try {
                return Integer.parseInt(this.buffer.substringTrimmed(0, indexOf), 16);
            } catch (NumberFormatException unused) {
                throw new MalformedChunkCodingException("Bad chunk header");
            }
        } else {
            throw new ConnectionClosedException("Premature end of chunk coded message body: closing chunk expected");
        }
    }

    private void nextChunk() {
        if (this.state != CHUNK_INVALID) {
            try {
                this.chunkSize = getChunkSize();
                if (this.chunkSize >= 0) {
                    this.state = 2;
                    this.pos = 0;
                    if (this.chunkSize == 0) {
                        this.eof = true;
                        parseTrailerHeaders();
                        return;
                    }
                    return;
                }
                throw new MalformedChunkCodingException("Negative chunk size");
            } catch (MalformedChunkCodingException e) {
                this.state = CHUNK_INVALID;
                throw e;
            }
        } else {
            throw new MalformedChunkCodingException("Corrupt data stream");
        }
    }

    private void parseTrailerHeaders() {
        try {
            this.footers = AbstractMessageParser.parseHeaders(this.f19309in, this.constraints.getMaxHeaderCount(), this.constraints.getMaxLineLength(), (LineParser) null);
        } catch (HttpException e) {
            MalformedChunkCodingException malformedChunkCodingException = new MalformedChunkCodingException("Invalid footer: " + e.getMessage());
            malformedChunkCodingException.initCause(e);
            throw malformedChunkCodingException;
        }
    }

    public int available() {
        SessionInputBuffer sessionInputBuffer = this.f19309in;
        if (sessionInputBuffer instanceof BufferInfo) {
            return Math.min(((BufferInfo) sessionInputBuffer).length(), this.chunkSize - this.pos);
        }
        return 0;
    }

    public void close() {
        if (!this.closed) {
            try {
                if (!this.eof && this.state != CHUNK_INVALID) {
                    do {
                    } while (read(new byte[BUFFER_SIZE]) >= 0);
                }
            } finally {
                this.eof = true;
                this.closed = true;
            }
        }
    }

    public Header[] getFooters() {
        return (Header[]) this.footers.clone();
    }

    public int read() {
        if (this.closed) {
            throw new IOException("Attempted read from closed stream.");
        } else if (this.eof) {
            return -1;
        } else {
            if (this.state != 2) {
                nextChunk();
                if (this.eof) {
                    return -1;
                }
            }
            int read = this.f19309in.read();
            if (read != -1) {
                this.pos++;
                if (this.pos >= this.chunkSize) {
                    this.state = 3;
                }
            }
            return read;
        }
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) {
        if (this.closed) {
            throw new IOException("Attempted read from closed stream.");
        } else if (this.eof) {
            return -1;
        } else {
            if (this.state != 2) {
                nextChunk();
                if (this.eof) {
                    return -1;
                }
            }
            int read = this.f19309in.read(bArr, i, Math.min(i2, this.chunkSize - this.pos));
            if (read != -1) {
                this.pos += read;
                if (this.pos >= this.chunkSize) {
                    this.state = 3;
                }
                return read;
            }
            this.eof = true;
            throw new TruncatedChunkException("Truncated chunk ( expected size: " + this.chunkSize + "; actual size: " + this.pos + ")");
        }
    }
}
