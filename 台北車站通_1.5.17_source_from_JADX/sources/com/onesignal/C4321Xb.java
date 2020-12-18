package com.onesignal;

import com.onesignal.C4306Xa;
import com.onesignal.C4416rb;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.onesignal.Xb */
class C4321Xb extends C4416rb.C4417a {

    /* renamed from: a */
    final /* synthetic */ JSONObject f12815a;

    /* renamed from: b */
    final /* synthetic */ ArrayList f12816b;

    /* renamed from: c */
    final /* synthetic */ JSONObject f12817c;

    /* renamed from: d */
    final /* synthetic */ C4327Zb f12818d;

    C4321Xb(C4327Zb zb, JSONObject jSONObject, ArrayList arrayList, JSONObject jSONObject2) {
        this.f12818d = zb;
        this.f12815a = jSONObject;
        this.f12816b = arrayList;
        this.f12817c = jSONObject2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12377a(int i, String str, Throwable th) {
        C4306Xa.C4316j jVar = C4306Xa.C4316j.WARN;
        C4306Xa.m17135a(jVar, "Failed last request. statusCode: " + i + "\nresponse: " + str);
        synchronized (this.f12818d.f12827b) {
            if (this.f12818d.m17240a(i, str, "No user with this id found")) {
                this.f12818d.mo12418m();
            } else {
                this.f12818d.m17237a(i);
            }
        }
        if (this.f12815a.has("tags")) {
            Iterator it = this.f12816b.iterator();
            while (it.hasNext()) {
                C4306Xa.C4308b bVar = (C4306Xa.C4308b) it.next();
                if (bVar != null) {
                    bVar.mo12429a(new C4306Xa.C4320n(i, str));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12355a(String str) {
        synchronized (this.f12818d.f12827b) {
            this.f12818d.f12833h.mo12384b(this.f12817c, this.f12815a);
            this.f12818d.mo12400c(this.f12815a);
        }
        JSONObject jSONObject = C4421sb.m17514a(false).f12836b;
        if (this.f12815a.has("tags") && jSONObject != null) {
            Iterator it = this.f12816b.iterator();
            while (it.hasNext()) {
                C4306Xa.C4308b bVar = (C4306Xa.C4308b) it.next();
                if (bVar != null) {
                    bVar.mo12430a(jSONObject);
                }
            }
        }
    }
}
