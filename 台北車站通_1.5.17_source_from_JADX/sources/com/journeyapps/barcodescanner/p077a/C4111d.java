package com.journeyapps.barcodescanner.p077a;

import android.hardware.Camera;
import android.os.Handler;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.journeyapps.barcodescanner.a.d */
public final class C4111d {

    /* renamed from: a */
    private static final String f12194a = "d";

    /* renamed from: b */
    private static final Collection<String> f12195b = new ArrayList(2);

    /* renamed from: c */
    private boolean f12196c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f12197d;

    /* renamed from: e */
    private final boolean f12198e;

    /* renamed from: f */
    private final Camera f12199f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Handler f12200g = new Handler(this.f12202i);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f12201h = 1;

    /* renamed from: i */
    private final Handler.Callback f12202i = new C4108a(this);

    /* renamed from: j */
    private final Camera.AutoFocusCallback f12203j = new C4110c(this);

    static {
        f12195b.add("auto");
        f12195b.add("macro");
    }

    public C4111d(Camera camera, C4121m mVar) {
        boolean z = true;
        this.f12199f = camera;
        String focusMode = camera.getParameters().getFocusMode();
        this.f12198e = (!mVar.mo11649c() || !f12195b.contains(focusMode)) ? false : z;
        String str = f12194a;
        Log.i(str, "Current focus mode '" + focusMode + "'; use auto focus? " + this.f12198e);
        mo11609a();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public synchronized void m16419c() {
        if (!this.f12196c && !this.f12200g.hasMessages(this.f12201h)) {
            this.f12200g.sendMessageDelayed(this.f12200g.obtainMessage(this.f12201h), 2000);
        }
    }

    /* renamed from: d */
    private void m16422d() {
        this.f12200g.removeMessages(this.f12201h);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m16423e() {
        if (this.f12198e && !this.f12196c && !this.f12197d) {
            try {
                this.f12199f.autoFocus(this.f12203j);
                this.f12197d = true;
            } catch (RuntimeException e) {
                Log.w(f12194a, "Unexpected exception while focusing", e);
                m16419c();
            }
        }
    }

    /* renamed from: a */
    public void mo11609a() {
        this.f12196c = false;
        m16423e();
    }

    /* renamed from: b */
    public void mo11610b() {
        this.f12196c = true;
        this.f12197d = false;
        m16422d();
        if (this.f12198e) {
            try {
                this.f12199f.cancelAutoFocus();
            } catch (RuntimeException e) {
                Log.w(f12194a, "Unexpected exception while cancelling focusing", e);
            }
        }
    }
}
