package com.openlife.checkme.net.model;

import p101d.p129g.p152e.p153a.C5598c;

public class MissionCommitData {
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

    public void setBonusPoint(int i) {
        this.bonusPoint = i;
    }
}
