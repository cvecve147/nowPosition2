package com.onesignal;

import com.onesignal.C4306Xa;
import com.onesignal.C4416rb;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.kb */
class C4390kb {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static int f12942a;

    /* renamed from: com.onesignal.kb$a */
    interface C4391a {
        /* renamed from: a */
        void mo12414a(C4392b bVar);
    }

    /* renamed from: com.onesignal.kb$b */
    static class C4392b {

        /* renamed from: a */
        String f12943a;

        /* renamed from: b */
        boolean f12944b;

        /* renamed from: c */
        boolean f12945c;

        /* renamed from: d */
        JSONArray f12946d;

        /* renamed from: e */
        boolean f12947e;

        /* renamed from: f */
        boolean f12948f;

        C4392b() {
        }
    }

    /* renamed from: a */
    static void m17421a(C4391a aVar) {
        C4379ib ibVar = new C4379ib(aVar);
        String str = "apps/" + C4306Xa.f12757c + "/android_params.js";
        String v = C4306Xa.m17208v();
        if (v != null) {
            str = str + "?player_id=" + v;
        }
        C4306Xa.m17135a(C4306Xa.C4316j.DEBUG, "Starting request to get Android parameters.");
        C4416rb.m17501a(str, (C4416rb.C4417a) ibVar, "CACHE_KEY_REMOTE_PARAMS");
    }

    /* renamed from: b */
    static /* synthetic */ int m17423b() {
        int i = f12942a;
        f12942a = i + 1;
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m17424b(String str, C4391a aVar) {
        try {
            aVar.mo12414a(new C4383jb(new JSONObject(str)));
        } catch (NullPointerException | JSONException e) {
            C4306Xa.m17136a(C4306Xa.C4316j.FATAL, "Error parsing android_params!: ", e);
            C4306Xa.C4316j jVar = C4306Xa.C4316j.FATAL;
            C4306Xa.m17135a(jVar, "Response that errored from android_params!: " + str);
        }
    }
}
