package com.onesignal;

import android.content.Context;
import android.net.Uri;
import com.onesignal.C4284Q;
import java.security.SecureRandom;
import org.json.JSONObject;

/* renamed from: com.onesignal.S */
class C4290S {

    /* renamed from: a */
    Context f12708a;

    /* renamed from: b */
    JSONObject f12709b;

    /* renamed from: c */
    boolean f12710c;

    /* renamed from: d */
    boolean f12711d;

    /* renamed from: e */
    boolean f12712e;

    /* renamed from: f */
    Long f12713f;

    /* renamed from: g */
    CharSequence f12714g;

    /* renamed from: h */
    CharSequence f12715h;

    /* renamed from: i */
    Uri f12716i;

    /* renamed from: j */
    Integer f12717j;

    /* renamed from: k */
    Integer f12718k;

    /* renamed from: l */
    Uri f12719l;

    /* renamed from: m */
    C4284Q.C4285a f12720m;

    C4290S(Context context) {
        this.f12708a = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Integer mo12403a() {
        if (this.f12720m == null) {
            this.f12720m = new C4284Q.C4285a();
        }
        C4284Q.C4285a aVar = this.f12720m;
        if (aVar.f12706b == null) {
            aVar.f12706b = Integer.valueOf(new SecureRandom().nextInt());
        }
        return this.f12720m.f12706b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12404a(Integer num) {
        if (num != null) {
            C4284Q.C4285a aVar = this.f12720m;
            if (aVar == null || aVar.f12706b == null) {
                if (this.f12720m == null) {
                    this.f12720m = new C4284Q.C4285a();
                }
                this.f12720m.f12706b = num;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo12405b() {
        Integer num;
        C4284Q.C4285a aVar = this.f12720m;
        if (aVar == null || (num = aVar.f12706b) == null) {
            return -1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public CharSequence mo12406c() {
        CharSequence charSequence = this.f12714g;
        return charSequence != null ? charSequence : this.f12709b.optString("alert", (String) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public CharSequence mo12407d() {
        CharSequence charSequence = this.f12715h;
        return charSequence != null ? charSequence : this.f12709b.optString("title", (String) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo12408e() {
        C4284Q.C4285a aVar = this.f12720m;
        return (aVar == null || aVar.f12705a == null) ? false : true;
    }
}
