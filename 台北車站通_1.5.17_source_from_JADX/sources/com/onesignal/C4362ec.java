package com.onesignal;

/* renamed from: com.onesignal.ec */
class C4362ec implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C4384jc f12887a;

    C4362ec(C4384jc jcVar) {
        this.f12887a = jcVar;
    }

    public void run() {
        C4384jc jcVar = this.f12887a;
        jcVar.m17408d(jcVar.f12931f);
        this.f12887a.f12929d.evaluateJavascript("getPageMetaData()", new C4358dc(this));
    }
}
