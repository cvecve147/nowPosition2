package com.askey.taipeinavi.notification;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.p007v4.app.C0297Y;
import com.askey.taipeinavi.R;

/* renamed from: com.askey.taipeinavi.notification.b */
class C1266b implements C0297Y.C0302e {

    /* renamed from: a */
    final /* synthetic */ OSNotificationService f4512a;

    C1266b(OSNotificationService oSNotificationService) {
        this.f4512a = oSNotificationService;
    }

    /* renamed from: a */
    public C0297Y.C0301d mo1223a(C0297Y.C0301d dVar) {
        if (this.f4512a.f4507o == null) {
            OSNotificationService oSNotificationService = this.f4512a;
            Bitmap unused = oSNotificationService.f4507o = BitmapFactory.decodeResource(oSNotificationService.getResources(), R.mipmap.icon_notify_large);
        }
        dVar.mo1221f(R.mipmap.icon_notify_small);
        dVar.mo1200a(this.f4512a.f4507o);
        return dVar;
    }
}
