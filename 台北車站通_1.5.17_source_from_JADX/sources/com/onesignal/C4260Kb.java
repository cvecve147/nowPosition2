package com.onesignal;

import android.os.Bundle;
import java.lang.reflect.Method;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.onesignal.Kb */
class C4260Kb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C4273Mb f12643a;

    C4260Kb(C4273Mb mb) {
        this.f12643a = mb;
    }

    public void run() {
        boolean unused = this.f12643a.f12677j = true;
        try {
            if (this.f12643a.f12672e == null) {
                Method unused2 = this.f12643a.f12672e = C4273Mb.m16960d(C4273Mb.f12669b);
                this.f12643a.f12672e.setAccessible(true);
            }
            Bundle bundle = (Bundle) this.f12643a.f12672e.invoke(this.f12643a.f12671d, new Object[]{3, this.f12643a.f12674g.getPackageName(), "inapp", null});
            if (bundle.getInt("RESPONSE_CODE") == 0) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                for (int i = 0; i < stringArrayList2.size(); i++) {
                    String str = stringArrayList.get(i);
                    String string = new JSONObject(stringArrayList2.get(i)).getString("purchaseToken");
                    if (!this.f12643a.f12675h.contains(string) && !arrayList2.contains(string)) {
                        arrayList2.add(string);
                        arrayList.add(str);
                    }
                }
                if (arrayList.size() > 0) {
                    this.f12643a.m16950a((ArrayList<String>) arrayList, (ArrayList<String>) arrayList2);
                } else if (stringArrayList2.size() == 0) {
                    boolean unused3 = this.f12643a.f12676i = false;
                    C4370gb.m17361b("GTPlayerPurchases", "ExistingPurchases", false);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        boolean unused4 = this.f12643a.f12677j = false;
    }
}
