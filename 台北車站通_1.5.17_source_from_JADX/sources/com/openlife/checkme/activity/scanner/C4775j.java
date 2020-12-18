package com.openlife.checkme.activity.scanner;

import android.app.AlertDialog;
import android.os.CountDownTimer;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.C4962m;

/* renamed from: com.openlife.checkme.activity.scanner.j */
class C4775j extends CountDownTimer {

    /* renamed from: a */
    final /* synthetic */ ScannerFragment f13771a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4775j(ScannerFragment scannerFragment, long j, long j2) {
        super(j, j2);
        this.f13771a = scannerFragment;
    }

    public void onFinish() {
        this.f13771a.mo13162a();
        this.f13771a.m18763z();
        if (!this.f13771a.f13725g[0].isEmpty()) {
            this.f13771a.m18741A();
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f13771a.getActivity(), C4962m.MyDialogTheme);
        builder.setMessage(C4961l.scanner_p_qrcode_remind);
        builder.setCancelable(false);
        builder.setPositiveButton(C4961l.g_searchagain, new C4773h(this));
        builder.setNegativeButton(C4961l.g_cancel, new C4774i(this));
        builder.create().show();
    }

    public void onTick(long j) {
    }
}
