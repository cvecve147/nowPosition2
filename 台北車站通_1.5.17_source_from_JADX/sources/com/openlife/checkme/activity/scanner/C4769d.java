package com.openlife.checkme.activity.scanner;

import com.openlife.checkme.p093c.C4883m;
import java.util.List;

/* renamed from: com.openlife.checkme.activity.scanner.d */
class C4769d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f13763a;

    /* renamed from: b */
    final /* synthetic */ C4770e f13764b;

    C4769d(C4770e eVar, String str) {
        this.f13764b = eVar;
        this.f13763a = str;
    }

    public void run() {
        String str = this.f13763a;
        C4770e eVar = this.f13764b;
        int i = eVar.f13765a;
        if (i == 112) {
            eVar.f13766b.f13726h.setBarcode(str);
            if (this.f13764b.f13766b.f13721c != null && this.f13764b.f13766b.f13721c.mo13397b() && !this.f13764b.f13766b.f13721c.mo13395a()) {
                this.f13764b.f13766b.f13721c.mo13394a((List<String>) this.f13764b.f13766b.f13728j);
                this.f13764b.f13766b.f13721c.mo13392a(this.f13764b.f13766b.getActivity());
                this.f13764b.f13766b.mo13162a();
            }
        } else if (i == 113) {
            if (eVar.f13766b.f13724f == null) {
                this.f13764b.f13766b.m18761x();
                this.f13764b.f13766b.f13724f.start();
            }
            if (C4883m.m19244e(str)) {
                if (this.f13764b.f13766b.f13725g[0].isEmpty()) {
                    this.f13764b.f13766b.f13725g[0] = str;
                    this.f13764b.f13766b.mo13184q();
                }
            } else if (this.f13764b.f13766b.f13725g[1].isEmpty()) {
                this.f13764b.f13766b.f13725g[1] = str;
                this.f13764b.f13766b.mo13185r();
            }
            if (!this.f13764b.f13766b.f13725g[0].isEmpty() && !this.f13764b.f13766b.f13725g[1].isEmpty()) {
                this.f13764b.f13766b.mo13162a();
                this.f13764b.f13766b.m18763z();
                this.f13764b.f13766b.m18741A();
            }
        }
    }
}
