package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.widget.PopupWindow;

@TargetApi(19)
@C2478La
/* renamed from: com.google.android.gms.internal.ads.S */
public final class C2685S extends C2564O {

    /* renamed from: i */
    private Object f8227i = new Object();

    /* renamed from: j */
    private PopupWindow f8228j;

    /* renamed from: k */
    private boolean f8229k = false;

    C2685S(Context context, C2282Ed ed, C3520uh uhVar, C2534N n) {
        super(context, ed, uhVar, n);
    }

    /* renamed from: d */
    private final void m11128d() {
        synchronized (this.f8227i) {
            this.f8229k = true;
            if ((this.f7033b instanceof Activity) && ((Activity) this.f7033b).isDestroyed()) {
                this.f8228j = null;
            }
            if (this.f8228j != null) {
                if (this.f8228j.isShowing()) {
                    this.f8228j.dismiss();
                }
                this.f8228j = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo8108a(int i) {
        m11128d();
        super.mo8108a(i);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:17|18|19|20|21) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0067 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8601c() {
        /*
            r8 = this;
            android.content.Context r0 = r8.f7033b
            boolean r1 = r0 instanceof android.app.Activity
            r2 = 0
            if (r1 == 0) goto L_0x000e
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            goto L_0x000f
        L_0x000e:
            r0 = r2
        L_0x000f:
            if (r0 == 0) goto L_0x006e
            android.view.View r1 = r0.getDecorView()
            if (r1 != 0) goto L_0x0018
            goto L_0x006e
        L_0x0018:
            android.content.Context r1 = r8.f7033b
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r1 = r1.isDestroyed()
            if (r1 == 0) goto L_0x0023
            return
        L_0x0023:
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            android.content.Context r3 = r8.f7033b
            r1.<init>(r3)
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r4 = -1
            r3.<init>(r4, r4)
            r1.setLayoutParams(r3)
            com.google.android.gms.internal.ads.uh r3 = r8.f7034c
            android.view.View r3 = r3.getView()
            r1.addView(r3, r4, r4)
            java.lang.Object r3 = r8.f8227i
            monitor-enter(r3)
            boolean r5 = r8.f8229k     // Catch:{ all -> 0x006b }
            if (r5 == 0) goto L_0x0045
            monitor-exit(r3)     // Catch:{ all -> 0x006b }
            return
        L_0x0045:
            android.widget.PopupWindow r5 = new android.widget.PopupWindow     // Catch:{ all -> 0x006b }
            r6 = 0
            r7 = 1
            r5.<init>(r1, r7, r7, r6)     // Catch:{ all -> 0x006b }
            r8.f8228j = r5     // Catch:{ all -> 0x006b }
            android.widget.PopupWindow r1 = r8.f8228j     // Catch:{ all -> 0x006b }
            r1.setOutsideTouchable(r7)     // Catch:{ all -> 0x006b }
            android.widget.PopupWindow r1 = r8.f8228j     // Catch:{ all -> 0x006b }
            r1.setClippingEnabled(r6)     // Catch:{ all -> 0x006b }
            java.lang.String r1 = "Displaying the 1x1 popup off the screen."
            com.google.android.gms.internal.ads.C2227Cf.m9532b(r1)     // Catch:{ all -> 0x006b }
            android.widget.PopupWindow r1 = r8.f8228j     // Catch:{ Exception -> 0x0067 }
            android.view.View r0 = r0.getDecorView()     // Catch:{ Exception -> 0x0067 }
            r1.showAtLocation(r0, r6, r4, r4)     // Catch:{ Exception -> 0x0067 }
            goto L_0x0069
        L_0x0067:
            r8.f8228j = r2     // Catch:{ all -> 0x006b }
        L_0x0069:
            monitor-exit(r3)     // Catch:{ all -> 0x006b }
            return
        L_0x006b:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x006b }
            throw r0
        L_0x006e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2685S.mo8601c():void");
    }

    public final void cancel() {
        m11128d();
        super.cancel();
    }
}
