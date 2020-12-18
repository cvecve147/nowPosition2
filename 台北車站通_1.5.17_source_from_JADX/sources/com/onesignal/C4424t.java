package com.onesignal;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.onesignal.t */
class C4424t implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Activity f13044a;

    /* renamed from: b */
    final /* synthetic */ JSONObject f13045b;

    /* renamed from: c */
    final /* synthetic */ int f13046c;

    C4424t(Activity activity, JSONObject jSONObject, int i) {
        this.f13044a = activity;
        this.f13045b = jSONObject;
        this.f13046c = i;
    }

    public void run() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f13044a);
        builder.setTitle(C4430u.m17633e(this.f13045b));
        builder.setMessage(this.f13045b.optString("alert"));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C4430u.m17620b(this.f13044a, this.f13045b, arrayList, arrayList2);
        Intent a = C4430u.m17630d(this.f13046c);
        a.putExtra("action_button", true);
        a.putExtra("from_alert", true);
        a.putExtra("onesignal_data", this.f13045b.toString());
        if (this.f13045b.has("grp")) {
            a.putExtra("grp", this.f13045b.optString("grp"));
        }
        C4413r rVar = new C4413r(this, arrayList2, a);
        builder.setOnCancelListener(new C4418s(this, a));
        for (int i = 0; i < arrayList.size(); i++) {
            if (i == 0) {
                builder.setNeutralButton((CharSequence) arrayList.get(i), rVar);
            } else if (i == 1) {
                builder.setNegativeButton((CharSequence) arrayList.get(i), rVar);
            } else if (i == 2) {
                builder.setPositiveButton((CharSequence) arrayList.get(i), rVar);
            }
        }
        AlertDialog create = builder.create();
        create.setCanceledOnTouchOutside(false);
        create.show();
    }
}
