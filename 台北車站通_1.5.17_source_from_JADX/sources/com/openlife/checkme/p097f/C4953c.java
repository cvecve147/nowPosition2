package com.openlife.checkme.p097f;

import p101d.p129g.p152e.p153a.C5598c;

/* renamed from: com.openlife.checkme.f.c */
public class C4953c<T> {
    @C5598c("data")
    protected T data;
    @C5598c("error")
    private Integer error;
    @C5598c("message")
    private String message;
    @C5598c("show_message")
    private boolean showMessage;

    public T getData() {
        return this.data;
    }

    public int getError() {
        Integer num = this.error;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public String getMessage() {
        String str = this.message;
        return str != null ? str : "";
    }

    public boolean isShowMessage() {
        return this.showMessage;
    }

    public void setData(T t) {
        this.data = t;
    }

    public void setError(int i) {
        this.error = Integer.valueOf(i);
    }

    public void setShowMessage(boolean z) {
        this.showMessage = z;
    }
}
