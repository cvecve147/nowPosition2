package com.openlife.checkme.p100ui;

import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.ui.o */
class C5031o implements C6242d<Long> {

    /* renamed from: a */
    final /* synthetic */ PointAnimationActivity f14298a;

    C5031o(PointAnimationActivity pointAnimationActivity) {
        this.f14298a = pointAnimationActivity;
    }

    /* renamed from: a */
    public void accept(Long l) {
        int intValue = l.intValue();
        PointAnimationActivity pointAnimationActivity = this.f14298a;
        Integer[] numArr = pointAnimationActivity.f14260d;
        if (intValue < numArr.length) {
            pointAnimationActivity.cover.setImageResource(numArr[l.intValue()].intValue());
            return;
        }
        int intValue2 = l.intValue();
        PointAnimationActivity pointAnimationActivity2 = this.f14298a;
        if (intValue2 == pointAnimationActivity2.f14260d.length + 5) {
            pointAnimationActivity2.f14261e.cancel();
            this.f14298a.setResult(-1);
            this.f14298a.finish();
        }
    }
}
