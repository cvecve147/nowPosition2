package com.askey.taipeinavi.notification;

import android.graphics.Bitmap;
import com.askey.taipeinavi.p058d.C1213g;
import com.onesignal.C4284Q;
import com.onesignal.C4440wa;

public class OSNotificationService extends C4284Q {
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Bitmap f4507o;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo5607a(C4440wa waVar) {
        if (!C1213g.m6068k(getApplicationContext())) {
            return true;
        }
        C4284Q.C4285a aVar = new C4284Q.C4285a();
        aVar.f12705a = new C1266b(this);
        mo12391a(aVar);
        return true;
    }

    public void onDestroy() {
        Bitmap bitmap = this.f4507o;
        if (bitmap != null) {
            bitmap.recycle();
            this.f4507o = null;
        }
        super.onDestroy();
    }
}
