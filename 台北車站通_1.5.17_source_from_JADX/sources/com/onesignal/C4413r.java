package com.onesignal;

import android.content.DialogInterface;
import android.content.Intent;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.onesignal.r */
class C4413r implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ List f13014a;

    /* renamed from: b */
    final /* synthetic */ Intent f13015b;

    /* renamed from: c */
    final /* synthetic */ C4424t f13016c;

    C4413r(C4424t tVar, List list, Intent intent) {
        this.f13016c = tVar;
        this.f13014a = list;
        this.f13015b = intent;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        int i2 = i + 3;
        if (this.f13014a.size() > 1) {
            try {
                JSONObject jSONObject = new JSONObject(this.f13016c.f13045b.toString());
                jSONObject.put("actionSelected", this.f13014a.get(i2));
                this.f13015b.putExtra("onesignal_data", jSONObject.toString());
                C4299V.m17082b(this.f13016c.f13044a, this.f13015b);
            } catch (Throwable unused) {
            }
        } else {
            C4299V.m17082b(this.f13016c.f13044a, this.f13015b);
        }
    }
}
