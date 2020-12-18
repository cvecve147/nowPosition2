package com.onesignal;

/* renamed from: com.onesignal.zb */
class C4451zb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f13114a;

    /* renamed from: b */
    final /* synthetic */ C4224Ab f13115b;

    C4451zb(C4224Ab ab, String str) {
        this.f13115b = ab;
        this.f13114a = str;
    }

    public void run() {
        int i = 0;
        while (i < C4224Ab.f12546a && !this.f13115b.m16772a(this.f13114a, i)) {
            i++;
            C4252Ia.m16865a(C4224Ab.f12547b * i);
        }
    }
}
