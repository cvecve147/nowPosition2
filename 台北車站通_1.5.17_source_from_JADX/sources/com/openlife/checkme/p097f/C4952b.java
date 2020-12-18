package com.openlife.checkme.p097f;

import android.content.Context;
import com.openlife.checkme.p093c.C4883m;
import com.openlife.checkme.p094d.C4938a;
import com.openlife.checkme.p094d.C4947j;
import java.util.Calendar;
import p101d.p129g.p152e.p153a.C5598c;

/* renamed from: com.openlife.checkme.f.b */
public class C4952b {
    @C5598c("account")
    private String account;
    @C5598c("datetime")
    private String datetime;
    @C5598c("identifier")
    private String identifier;
    @C5598c("src")
    private String src;

    public C4952b() {
        this.src = "94105";
        C4947j a = C4947j.m19536a();
        Context b = a.mo13551b();
        this.datetime = C4883m.m19224a(C4883m.m19225a(), Calendar.getInstance().getTime());
        this.identifier = C4883m.m19232b(b);
        String d = a.mo13554e().mo13530d();
        this.src = d == null ? this.src : d;
        C4938a d2 = a.mo13553d();
        this.account = d2.mo13496k() ? d2.mo13476a() : null;
    }

    public C4952b(Context context) {
        this.src = "94105";
        this.datetime = C4883m.m19224a(C4883m.m19225a(), Calendar.getInstance().getTime());
        this.identifier = C4883m.m19232b(context);
        String d = C4947j.m19536a().mo13554e().mo13530d();
        this.src = d == null ? this.src : d;
        this.account = C4938a.m19452d(context) ? C4938a.m19448a(context) : null;
    }

    public String getSignature() {
        return C4883m.m19233b(C4883m.m19221a((Object) this));
    }

    /* access modifiers changed from: protected */
    public void setAccount(String str) {
        this.account = str;
    }

    /* access modifiers changed from: protected */
    public void setDatetime(String str) {
        this.datetime = str;
    }

    /* access modifiers changed from: protected */
    public void setIdentifier(String str) {
        this.identifier = str;
    }

    /* access modifiers changed from: protected */
    public void setSrc(String str) {
        this.src = str;
    }
}
