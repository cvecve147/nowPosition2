package org.apache.http.config;

import org.apache.http.util.Args;

public class MessageConstraints implements Cloneable {
    public static final MessageConstraints DEFAULT = new Builder().build();
    private final int maxHeaderCount;
    private final int maxLineLength;

    public static class Builder {
        private int maxHeaderCount = -1;
        private int maxLineLength = -1;

        Builder() {
        }

        public MessageConstraints build() {
            return new MessageConstraints(this.maxLineLength, this.maxHeaderCount);
        }

        public Builder setMaxHeaderCount(int i) {
            this.maxHeaderCount = i;
            return this;
        }

        public Builder setMaxLineLength(int i) {
            this.maxLineLength = i;
            return this;
        }
    }

    MessageConstraints(int i, int i2) {
        this.maxLineLength = i;
        this.maxHeaderCount = i2;
    }

    public static Builder copy(MessageConstraints messageConstraints) {
        Args.notNull(messageConstraints, "Message constraints");
        return new Builder().setMaxHeaderCount(messageConstraints.getMaxHeaderCount()).setMaxLineLength(messageConstraints.getMaxLineLength());
    }

    public static Builder custom() {
        return new Builder();
    }

    public static MessageConstraints lineLen(int i) {
        Args.notNegative(i, "Max line length");
        return new MessageConstraints(i, -1);
    }

    /* access modifiers changed from: protected */
    public MessageConstraints clone() {
        return (MessageConstraints) super.clone();
    }

    public int getMaxHeaderCount() {
        return this.maxHeaderCount;
    }

    public int getMaxLineLength() {
        return this.maxLineLength;
    }

    public String toString() {
        return "[maxLineLength=" + this.maxLineLength + ", maxHeaderCount=" + this.maxHeaderCount + "]";
    }
}
