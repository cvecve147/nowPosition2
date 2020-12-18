package com.onesignal;

import android.content.Context;
import com.onesignal.C4441wb;

/* renamed from: com.onesignal.yb */
public class C4448yb implements C4441wb {

    /* renamed from: a */
    private static C4441wb.C4442a f13110a = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static boolean f13111b = false;

    /* renamed from: a */
    public static void m17645a(String str) {
        C4441wb.C4442a aVar = f13110a;
        if (aVar != null) {
            f13111b = true;
            aVar.mo12409a(str, 1);
        }
    }

    /* renamed from: a */
    public void mo12277a(Context context, String str, C4441wb.C4442a aVar) {
        f13110a = aVar;
        new Thread(new C4445xb(this, context, aVar)).start();
    }
}
