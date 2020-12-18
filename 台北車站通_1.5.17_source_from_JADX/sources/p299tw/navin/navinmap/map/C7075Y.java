package p299tw.navin.navinmap.map;

import p267i.p268a.p269a.C6689e;
import p267i.p268a.p269a.p273c.C6687c;
import p299tw.navin.navinmap.map.C7076Z;

/* renamed from: tw.navin.navinmap.map.Y */
class C7075Y implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String[] f19509a;

    /* renamed from: b */
    final /* synthetic */ String[] f19510b;

    /* renamed from: c */
    final /* synthetic */ C7076Z.C7077a f19511c;

    C7075Y(C7076Z.C7077a aVar, String[] strArr, String[] strArr2) {
        this.f19511c = aVar;
        this.f19509a = strArr;
        this.f19510b = strArr2;
    }

    public void run() {
        C6687c.m25417a(C7076Z.this.getContext(), this.f19509a, C6689e.dialog_select_current_map_title, C6689e.dialog_btn_cancel, new C7074X(this)).mo2610c();
    }
}
