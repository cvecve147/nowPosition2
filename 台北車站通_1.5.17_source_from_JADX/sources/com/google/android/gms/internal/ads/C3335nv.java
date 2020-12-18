package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.ads.internal.gmsg.C1718E;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.nv */
public final class C3335nv implements View.OnClickListener {

    /* renamed from: a */
    private final C3370pa f9931a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C2651Qw f9932b;

    /* renamed from: c */
    private C1718E f9933c;

    /* renamed from: d */
    String f9934d;

    /* renamed from: e */
    Long f9935e;

    /* renamed from: f */
    WeakReference<View> f9936f;

    public C3335nv(C3370pa paVar) {
        this.f9931a = paVar;
    }

    /* renamed from: c */
    private final void m13187c() {
        this.f9934d = null;
        this.f9935e = null;
        WeakReference<View> weakReference = this.f9936f;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            this.f9936f = null;
            if (view != null) {
                view.setClickable(false);
                view.setOnClickListener((View.OnClickListener) null);
            }
        }
    }

    /* renamed from: a */
    public final void mo9814a() {
        if (this.f9932b != null && this.f9935e != null) {
            m13187c();
            try {
                this.f9932b.mo8767Va();
            } catch (RemoteException e) {
                C2227Cf.m9537d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: a */
    public final void mo9815a(C2651Qw qw) {
        this.f9932b = qw;
        C1718E e = this.f9933c;
        if (e != null) {
            this.f9931a.mo9854a("/unconfirmedClick", e);
        }
        this.f9933c = new C3363ov(this);
        this.f9931a.mo9857b("/unconfirmedClick", this.f9933c);
    }

    /* renamed from: b */
    public final C2651Qw mo9816b() {
        return this.f9932b;
    }

    public final void onClick(View view) {
        WeakReference<View> weakReference = this.f9936f;
        if (weakReference != null && weakReference.get() == view) {
            if (!(this.f9934d == null || this.f9935e == null)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f9934d);
                    jSONObject.put("time_interval", C1697X.m7705l().mo7725a() - this.f9935e.longValue());
                    jSONObject.put("messageType", "onePointFiveClick");
                    this.f9931a.mo9855a("sendMessageToNativeJs", jSONObject);
                } catch (JSONException e) {
                    C2227Cf.m9533b("Unable to dispatch sendMessageToNativeJs event", e);
                }
            }
            m13187c();
        }
    }
}
