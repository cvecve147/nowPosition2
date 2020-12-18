package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wp */
final class C3586wp implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3558vp f10465a;

    C3586wp(C3558vp vpVar) {
        this.f10465a = vpVar;
    }

    public final void run() {
        if (this.f10465a.f10390e == null) {
            synchronized (C3558vp.f10386a) {
                if (this.f10465a.f10390e == null) {
                    boolean booleanValue = ((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7938nc)).booleanValue();
                    if (booleanValue) {
                        try {
                            C3558vp.f10387b = new C3389ps(this.f10465a.f10389d.f8286b, "ADSHIELD", (String) null);
                        } catch (Throwable unused) {
                            booleanValue = false;
                        }
                    }
                    this.f10465a.f10390e = Boolean.valueOf(booleanValue);
                    C3558vp.f10386a.open();
                }
            }
        }
    }
}
