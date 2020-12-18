package com.openlife.checkme.net.model;

import com.openlife.checkme.p097f.C4953c;

public class BiResponse<T extends C4953c, R extends C4953c> {
    private T response1;
    private R response2;

    public BiResponse(T t, R r) {
        this.response1 = t;
        this.response2 = r;
    }

    public T getResponse1() {
        return this.response1;
    }

    public R getResponse2() {
        return this.response2;
    }
}
