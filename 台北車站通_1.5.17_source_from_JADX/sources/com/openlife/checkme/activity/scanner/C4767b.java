package com.openlife.checkme.activity.scanner;

import com.openlife.checkme.net.model.Execution;
import com.openlife.checkme.p093c.C4878i;

/* renamed from: com.openlife.checkme.activity.scanner.b */
class C4767b implements C4878i.C4879a {

    /* renamed from: a */
    final /* synthetic */ ScannerFragment f13761a;

    C4767b(ScannerFragment scannerFragment) {
        this.f13761a = scannerFragment;
    }

    /* renamed from: a */
    public void mo13060a() {
        this.f13761a.mo12963e();
    }

    /* renamed from: a */
    public void mo13061a(int i) {
        ScannerFragment scannerFragment = this.f13761a;
        scannerFragment.mo12965f(scannerFragment.getString(i));
    }

    /* renamed from: a */
    public void mo13062a(Execution execution) {
        execution.setBarcode(this.f13761a.f13726h.getBarcode());
        Execution unused = this.f13761a.f13726h = execution;
        this.f13761a.f13720b.mo13219a(this.f13761a.f13727i, this.f13761a.f13726h);
    }

    /* renamed from: a */
    public void mo13063a(Throwable th) {
        this.f13761a.mo12756f();
    }

    /* renamed from: b */
    public void mo13064b() {
    }
}
