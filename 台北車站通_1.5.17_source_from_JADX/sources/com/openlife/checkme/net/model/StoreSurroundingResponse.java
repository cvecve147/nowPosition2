package com.openlife.checkme.net.model;

import com.openlife.checkme.p097f.C4953c;
import java.util.ArrayList;
import java.util.List;

public class StoreSurroundingResponse extends C4953c<List<MapData>> {
    public List<MapData> getData() {
        T t = this.data;
        return t != null ? (List) t : new ArrayList();
    }
}
