package com.openlife.checkme.net.model;

import com.openlife.checkme.p097f.C4953c;

public class HomeAdResponse extends C4953c<AdData> {
    public AdData getData() {
        T t = this.data;
        return t != null ? (AdData) t : new AdData();
    }
}
