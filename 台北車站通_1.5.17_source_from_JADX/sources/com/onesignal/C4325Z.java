package com.onesignal;

import java.util.TimerTask;

/* renamed from: com.onesignal.Z */
class C4325Z extends TimerTask {

    /* renamed from: a */
    final /* synthetic */ C4236Ea f12824a;

    /* renamed from: b */
    final /* synthetic */ C4347ba f12825b;

    C4325Z(C4347ba baVar, C4236Ea ea) {
        this.f12825b = baVar;
        this.f12824a = ea;
    }

    public void run() {
        this.f12825b.f12869c.remove(this.f12824a.f12566a);
        this.f12825b.f12868b.mo12471a();
    }
}
