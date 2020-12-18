package org.altbeacon.beacon.p292b;

import org.altbeacon.beacon.p293c.C6895d;

/* renamed from: org.altbeacon.beacon.b.b */
public class C6884b implements C6885c {

    /* renamed from: a */
    private double f18968a;

    /* renamed from: b */
    private double f18969b;

    /* renamed from: c */
    private double f18970c;

    public C6884b(double d, double d2, double d3) {
        this.f18968a = d;
        this.f18969b = d2;
        this.f18970c = d3;
    }

    /* renamed from: a */
    public double mo18728a(int i, double d) {
        if (d == 0.0d) {
            return -1.0d;
        }
        C6895d.m26021a("CurveFittedDistanceCalculator", "calculating distance based on mRssi of %s and txPower of %s", Double.valueOf(d), Integer.valueOf(i));
        double d2 = (d * 1.0d) / ((double) i);
        double pow = d2 < 1.0d ? Math.pow(d2, 10.0d) : (this.f18968a * Math.pow(d2, this.f18969b)) + this.f18970c;
        C6895d.m26021a("CurveFittedDistanceCalculator", "avg mRssi: %s distance: %s", Double.valueOf(d), Double.valueOf(pow));
        return pow;
    }
}
