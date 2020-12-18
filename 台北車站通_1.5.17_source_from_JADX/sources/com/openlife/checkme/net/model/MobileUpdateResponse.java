package com.openlife.checkme.net.model;

import com.openlife.checkme.p097f.C4953c;

public class MobileUpdateResponse extends C4953c<MobileUpdateData> {
    public MobileUpdateData getData() {
        T t = this.data;
        return t != null ? (MobileUpdateData) t : new MobileUpdateData();
    }
}
