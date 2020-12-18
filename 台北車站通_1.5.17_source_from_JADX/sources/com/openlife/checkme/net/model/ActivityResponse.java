package com.openlife.checkme.net.model;

import com.openlife.checkme.p097f.C4953c;
import java.util.ArrayList;
import java.util.List;

public class ActivityResponse extends C4953c<List<ActivityData>> {
    public List<ActivityData> getData() {
        T t = this.data;
        return t != null ? (List) t : new ArrayList();
    }
}
