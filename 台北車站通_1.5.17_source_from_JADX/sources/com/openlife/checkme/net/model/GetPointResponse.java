package com.openlife.checkme.net.model;

import com.openlife.checkme.p097f.C4953c;

public class GetPointResponse extends C4953c<GetPointData> {
    public GetPointData getData() {
        T t = this.data;
        return t != null ? (GetPointData) t : new GetPointData();
    }
}
