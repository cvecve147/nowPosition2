package com.openlife.checkme.p093c;

import android.bluetooth.BluetoothAdapter;
import java.util.List;
import p208e.p221b.C6438q;
import p208e.p221b.p225b.C6223b;

/* renamed from: com.openlife.checkme.c.e */
class C4874e implements C6438q<Long> {

    /* renamed from: a */
    final /* synthetic */ C4878i f13955a;

    C4874e(C4878i iVar) {
        this.f13955a = iVar;
    }

    /* renamed from: a */
    public void mo13383a(C6223b bVar) {
        this.f13955a.f13967h.add(bVar);
        if (BluetoothAdapter.getDefaultAdapter() != null) {
            if (!BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                C4878i iVar = this.f13955a;
                iVar.mo13394a((List<String>) iVar.f13961b);
                bVar.mo15709a();
            }
            if (!this.f13955a.f13960a.mo13406a()) {
                this.f13955a.f13960a.mo13408b();
                return;
            }
            return;
        }
        bVar.mo15709a();
    }

    /* renamed from: a */
    public void mo13341a(Long l) {
    }

    /* renamed from: a */
    public void mo13342a(Throwable th) {
        this.f13955a.f13960a.mo13409c();
    }

    /* renamed from: c */
    public void mo13343c() {
        if (this.f13955a.f13960a.mo13406a()) {
            this.f13955a.f13960a.mo13409c();
        }
        for (C6223b bVar : this.f13955a.f13967h) {
            if (bVar != null) {
                bVar.mo15709a();
            }
        }
        this.f13955a.f13967h.clear();
    }
}
