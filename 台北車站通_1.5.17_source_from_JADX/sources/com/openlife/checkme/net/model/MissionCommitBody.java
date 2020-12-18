package com.openlife.checkme.net.model;

import com.openlife.checkme.p093c.C4881k;
import com.openlife.checkme.p093c.C4883m;
import com.openlife.checkme.p097f.C4952b;
import java.util.Calendar;
import p101d.p129g.p152e.p153a.C5598c;

public class MissionCommitBody extends C4952b {
    @C5598c("checksum")
    private String checksum;
    @C5598c("execution")
    private Execution execution;
    @C5598c("execution_date")
    private String executionDate;
    @C5598c("id")

    /* renamed from: id */
    private int f14132id;
    @C5598c("version")
    private String version = "0.1";

    public MissionCommitBody(int i, Execution execution2) {
        this.f14132id = i;
        this.executionDate = C4883m.m19224a(C4883m.m19225a(), Calendar.getInstance().getTime());
        this.execution = execution2;
        this.checksum = C4883m.m19238c(i + C4881k.m19213a() + this.executionDate);
    }
}
