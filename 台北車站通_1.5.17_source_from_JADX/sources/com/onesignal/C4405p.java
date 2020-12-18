package com.onesignal;

import android.support.p007v4.widget.C0525I;
import android.view.View;

/* renamed from: com.onesignal.p */
class C4405p extends C0525I.C0526a {

    /* renamed from: a */
    private int f12980a;

    /* renamed from: b */
    final /* synthetic */ C4408q f12981b;

    C4405p(C4408q qVar) {
        this.f12981b = qVar;
    }

    /* renamed from: a */
    public int mo660a(View view, int i, int i2) {
        return this.f12981b.f13000f.f13003c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x008b, code lost:
        if (r2.f12981b.f12997c != null) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004d, code lost:
        if (r2.f12981b.f12997c != null) goto L_0x004f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo661a(android.view.View r3, float r4, float r5) {
        /*
            r2 = this;
            com.onesignal.q r3 = r2.f12981b
            com.onesignal.q$b r3 = r3.f13000f
            int r3 = r3.f13002b
            com.onesignal.q r4 = r2.f12981b
            boolean r4 = r4.f12999e
            if (r4 != 0) goto L_0x008e
            com.onesignal.q r4 = r2.f12981b
            com.onesignal.q$b r4 = r4.f13000f
            int r4 = r4.f13006f
            r0 = 1
            if (r4 != r0) goto L_0x0059
            int r4 = r2.f12980a
            com.onesignal.q r1 = r2.f12981b
            com.onesignal.q$b r1 = r1.f13000f
            int r1 = r1.f13009i
            if (r4 > r1) goto L_0x0038
            com.onesignal.q r4 = r2.f12981b
            com.onesignal.q$b r4 = r4.f13000f
            int r4 = r4.f13007g
            float r4 = (float) r4
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x008e
        L_0x0038:
            com.onesignal.q r3 = r2.f12981b
            com.onesignal.q$b r3 = r3.f13000f
            int r3 = r3.f13008h
            com.onesignal.q r4 = r2.f12981b
            boolean unused = r4.f12999e = r0
            com.onesignal.q r4 = r2.f12981b
            com.onesignal.q$a r4 = r4.f12997c
            if (r4 == 0) goto L_0x008e
        L_0x004f:
            com.onesignal.q r4 = r2.f12981b
            com.onesignal.q$a r4 = r4.f12997c
            r4.mo12281a()
            goto L_0x008e
        L_0x0059:
            int r4 = r2.f12980a
            com.onesignal.q r1 = r2.f12981b
            com.onesignal.q$b r1 = r1.f13000f
            int r1 = r1.f13009i
            if (r4 < r1) goto L_0x0076
            com.onesignal.q r4 = r2.f12981b
            com.onesignal.q$b r4 = r4.f13000f
            int r4 = r4.f13007g
            float r4 = (float) r4
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x008e
        L_0x0076:
            com.onesignal.q r3 = r2.f12981b
            com.onesignal.q$b r3 = r3.f13000f
            int r3 = r3.f13008h
            com.onesignal.q r4 = r2.f12981b
            boolean unused = r4.f12999e = r0
            com.onesignal.q r4 = r2.f12981b
            com.onesignal.q$a r4 = r4.f12997c
            if (r4 == 0) goto L_0x008e
            goto L_0x004f
        L_0x008e:
            com.onesignal.q r4 = r2.f12981b
            android.support.v4.widget.I r4 = r4.f12998d
            com.onesignal.q r5 = r2.f12981b
            com.onesignal.q$b r5 = r5.f13000f
            int r5 = r5.f13003c
            boolean r3 = r4.mo2158d(r5, r3)
            if (r3 == 0) goto L_0x00a7
            com.onesignal.q r3 = r2.f12981b
            android.support.p007v4.view.C0487v.m2261B(r3)
        L_0x00a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C4405p.mo661a(android.view.View, float, float):void");
    }

    /* renamed from: b */
    public int mo664b(View view, int i, int i2) {
        this.f12980a = i;
        return (this.f12981b.f13000f.f13006f != 1 ? i <= this.f12981b.f13000f.f13002b : i >= this.f12981b.f13000f.f13002b) ? i : this.f12981b.f13000f.f13002b;
    }

    /* renamed from: b */
    public boolean mo665b(View view, int i) {
        return true;
    }
}
