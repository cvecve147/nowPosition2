package com.openlife.checkme.net.model;

import com.openlife.checkme.p097f.C4953c;

public class PointResponse extends C4953c<PointData> {
    public PointData getData() {
        T t = this.data;
        return t != null ? (PointData) t : new PointData();
    }
}
