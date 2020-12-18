package org.apache.http.config;

import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import org.apache.http.Consts;
import org.apache.http.annotation.Immutable;
import org.apache.http.util.Args;

@Immutable
public class ConnectionConfig implements Cloneable {
    public static final ConnectionConfig DEFAULT = new Builder().build();
    private final int bufferSize;
    private final Charset charset;
    private final int fragmentSizeHint;
    private final CodingErrorAction malformedInputAction;
    private final MessageConstraints messageConstraints;
    private final CodingErrorAction unmappableInputAction;

    public static class Builder {
        private int bufferSize;
        private Charset charset;
        private int fragmentSizeHint = -1;
        private CodingErrorAction malformedInputAction;
        private MessageConstraints messageConstraints;
        private CodingErrorAction unmappableInputAction;

        Builder() {
        }

        public ConnectionConfig build() {
            Charset charset2 = this.charset;
            if (charset2 == null && !(this.malformedInputAction == null && this.unmappableInputAction == null)) {
                charset2 = Consts.ASCII;
            }
            Charset charset3 = charset2;
            int i = this.bufferSize;
            if (i <= 0) {
                i = 8192;
            }
            int i2 = i;
            int i3 = this.fragmentSizeHint;
            return new ConnectionConfig(i2, i3 >= 0 ? i3 : i2, charset3, this.malformedInputAction, this.unmappableInputAction, this.messageConstraints);
        }

        public Builder setBufferSize(int i) {
            this.bufferSize = i;
            return this;
        }

        public Builder setCharset(Charset charset2) {
            this.charset = charset2;
            return this;
        }

        public Builder setFragmentSizeHint(int i) {
            this.fragmentSizeHint = i;
            return this;
        }

        public Builder setMalformedInputAction(CodingErrorAction codingErrorAction) {
            this.malformedInputAction = codingErrorAction;
            if (codingErrorAction != null && this.charset == null) {
                this.charset = Consts.ASCII;
            }
            return this;
        }

        public Builder setMessageConstraints(MessageConstraints messageConstraints2) {
            this.messageConstraints = messageConstraints2;
            return this;
        }

        public Builder setUnmappableInputAction(CodingErrorAction codingErrorAction) {
            this.unmappableInputAction = codingErrorAction;
            if (codingErrorAction != null && this.charset == null) {
                this.charset = Consts.ASCII;
            }
            return this;
        }
    }

    ConnectionConfig(int i, int i2, Charset charset2, CodingErrorAction codingErrorAction, CodingErrorAction codingErrorAction2, MessageConstraints messageConstraints2) {
        this.bufferSize = i;
        this.fragmentSizeHint = i2;
        this.charset = charset2;
        this.malformedInputAction = codingErrorAction;
        this.unmappableInputAction = codingErrorAction2;
        this.messageConstraints = messageConstraints2;
    }

    public static Builder copy(ConnectionConfig connectionConfig) {
        Args.notNull(connectionConfig, "Connection config");
        return new Builder().setCharset(connectionConfig.getCharset()).setMalformedInputAction(connectionConfig.getMalformedInputAction()).setUnmappableInputAction(connectionConfig.getUnmappableInputAction()).setMessageConstraints(connectionConfig.getMessageConstraints());
    }

    public static Builder custom() {
        return new Builder();
    }

    /* access modifiers changed from: protected */
    public ConnectionConfig clone() {
        return (ConnectionConfig) super.clone();
    }

    public int getBufferSize() {
        return this.bufferSize;
    }

    public Charset getCharset() {
        return this.charset;
    }

    public int getFragmentSizeHint() {
        return this.fragmentSizeHint;
    }

    public CodingErrorAction getMalformedInputAction() {
        return this.malformedInputAction;
    }

    public MessageConstraints getMessageConstraints() {
        return this.messageConstraints;
    }

    public CodingErrorAction getUnmappableInputAction() {
        return this.unmappableInputAction;
    }

    public String toString() {
        return "[bufferSize=" + this.bufferSize + ", fragmentSizeHint=" + this.fragmentSizeHint + ", charset=" + this.charset + ", malformedInputAction=" + this.malformedInputAction + ", unmappableInputAction=" + this.unmappableInputAction + ", messageConstraints=" + this.messageConstraints + "]";
    }
}
