package com.openlife.checkme.net.model;

import com.openlife.checkme.p097f.C4953c;
import java.util.ArrayList;
import java.util.List;

public class MissionSurroundingResponse extends C4953c<List<MissionData>> {
    public List<MissionData> getData() {
        T t = this.data;
        return t != null ? (List) t : new ArrayList();
    }
}
