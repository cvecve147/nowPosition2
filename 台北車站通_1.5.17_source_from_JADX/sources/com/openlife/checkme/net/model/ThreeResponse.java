package com.openlife.checkme.net.model;

import com.openlife.checkme.p097f.C4953c;

public class ThreeResponse<T extends C4953c, R extends C4953c, E extends C4953c> {
    private T response1;
    private R response2;
    private E response3;

    public ThreeResponse(T t, R r, E e) {
        this.response1 = t;
        this.response2 = r;
        this.response3 = e;
    }

    public T getResponse1() {
        return this.response1;
    }

    public R getResponse2() {
        return this.response2;
    }

    public E getResponse3() {
        return this.response3;
    }
}
