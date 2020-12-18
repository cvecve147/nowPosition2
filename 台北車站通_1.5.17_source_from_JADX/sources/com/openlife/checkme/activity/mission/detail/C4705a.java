package com.openlife.checkme.activity.mission.detail;

import com.openlife.checkme.net.model.Execution;
import com.openlife.checkme.p093c.C4878i;

/* renamed from: com.openlife.checkme.activity.mission.detail.a */
class C4705a implements C4878i.C4879a {

    /* renamed from: a */
    final /* synthetic */ MissionDetailFragment f13625a;

    C4705a(MissionDetailFragment missionDetailFragment) {
        this.f13625a = missionDetailFragment;
    }

    /* renamed from: a */
    public void mo13060a() {
        this.f13625a.mo12963e();
    }

    /* renamed from: a */
    public void mo13061a(int i) {
        MissionDetailFragment missionDetailFragment = this.f13625a;
        missionDetailFragment.mo12969j(missionDetailFragment.getString(i));
    }

    /* renamed from: a */
    public void mo13062a(Execution execution) {
        this.f13625a.f13611e.mo13084a(this.f13625a.f13612f, execution);
    }

    /* renamed from: a */
    public void mo13063a(Throwable th) {
        this.f13625a.mo12756f();
    }

    /* renamed from: b */
    public void mo13064b() {
    }
}
