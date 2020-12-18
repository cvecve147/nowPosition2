package com.askey.taipeinavi.home;

import android.content.DialogInterface;

/* renamed from: com.askey.taipeinavi.home.A */
class C1214A implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ HomeFragment f4407a;

    C1214A(HomeFragment homeFragment) {
        this.f4407a = homeFragment;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -2) {
            this.f4407a.f4438a.mo5558a(this.f4407a.mo1396i());
        } else if (i == -1) {
            this.f4407a.f4381b.mo5590ia();
            this.f4407a.f4438a.mo5559b(this.f4407a.mo1396i());
        }
    }
}
