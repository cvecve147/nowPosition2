package com.openlife.checkme.net.model;

import com.openlife.checkme.p097f.C4953c;
import p101d.p129g.p152e.p153a.C5598c;

public class UserSignInData extends C4953c {
    @C5598c("bonus_point")
    private int bonusPoint;
    @C5598c("current_point")
    private int currentPoint;

    public int getBonusPoint() {
        return this.bonusPoint;
    }

    public int getCurrentPoint() {
        return this.currentPoint;
    }

    public String getCurrentPointStr() {
        return String.valueOf(this.currentPoint);
    }

    public String getPointStr() {
        return String.valueOf(this.bonusPoint);
    }

    public void setCurrentPoint(int i) {
        this.currentPoint = i;
    }
}
