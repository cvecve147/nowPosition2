package com.facebook.login;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p007v4.app.C0336i;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.AccessToken;
import com.facebook.C1340F;
import com.facebook.C1353I;
import com.facebook.C1364U;
import com.facebook.C1365V;
import com.facebook.C1366W;
import com.facebook.C1367X;
import com.facebook.C1427h;
import com.facebook.C1574p;
import com.facebook.C1601x;
import com.facebook.FacebookActivity;
import com.facebook.GraphRequest;
import com.facebook.internal.C1430A;
import com.facebook.internal.C1444H;
import com.facebook.internal.C1450J;
import com.facebook.internal.C1480ba;
import com.facebook.internal.C1484ca;
import com.facebook.internal.C1525y;
import com.facebook.login.LoginClient;
import com.facebook.p060a.C1406q;
import com.facebook.p062b.p063a.C1419b;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class DeviceAuthDialog extends C0336i {

    /* renamed from: fa */
    private ProgressBar f5252fa;

    /* renamed from: ga */
    private TextView f5253ga;

    /* renamed from: ha */
    private DeviceAuthMethodHandler f5254ha;
    /* access modifiers changed from: private */

    /* renamed from: ia */
    public AtomicBoolean f5255ia = new AtomicBoolean();

    /* renamed from: ja */
    private volatile C1340F f5256ja;

    /* renamed from: ka */
    private volatile ScheduledFuture f5257ka;
    /* access modifiers changed from: private */

    /* renamed from: la */
    public volatile RequestState f5258la;
    /* access modifiers changed from: private */

    /* renamed from: ma */
    public Dialog f5259ma;
    /* access modifiers changed from: private */

    /* renamed from: na */
    public boolean f5260na = false;
    /* access modifiers changed from: private */

    /* renamed from: oa */
    public boolean f5261oa = false;
    /* access modifiers changed from: private */

    /* renamed from: pa */
    public LoginClient.Request f5262pa = null;

    private static class RequestState implements Parcelable {
        public static final Parcelable.Creator<RequestState> CREATOR = new C1555k();

        /* renamed from: a */
        private String f5263a;

        /* renamed from: b */
        private String f5264b;

        /* renamed from: c */
        private long f5265c;

        /* renamed from: d */
        private long f5266d;

        RequestState() {
        }

        protected RequestState(Parcel parcel) {
            this.f5263a = parcel.readString();
            this.f5264b = parcel.readString();
            this.f5265c = parcel.readLong();
            this.f5266d = parcel.readLong();
        }

        /* renamed from: a */
        public long mo6280a() {
            return this.f5265c;
        }

        /* renamed from: a */
        public void mo6281a(long j) {
            this.f5265c = j;
        }

        /* renamed from: a */
        public void mo6282a(String str) {
            this.f5264b = str;
        }

        /* renamed from: b */
        public String mo6283b() {
            return this.f5264b;
        }

        /* renamed from: b */
        public void mo6284b(long j) {
            this.f5266d = j;
        }

        /* renamed from: b */
        public void mo6285b(String str) {
            this.f5263a = str;
        }

        /* renamed from: c */
        public String mo6286c() {
            return this.f5263a;
        }

        /* renamed from: d */
        public boolean mo6287d() {
            return this.f5266d != 0 && (new Date().getTime() - this.f5266d) - (this.f5265c * 1000) < 0;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f5263a);
            parcel.writeString(this.f5264b);
            parcel.writeLong(this.f5265c);
            parcel.writeLong(this.f5266d);
        }
    }

    /* renamed from: a */
    private void m7133a(TextView textView, String str) {
        C1450J.C1451a aVar = new C1450J.C1451a(mo1396i(), Uri.parse(str));
        aVar.mo6147a((C1450J.C1452b) new C1548d(this, textView));
        C1444H.m6810a(aVar.mo6148a());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m7134a(RequestState requestState) {
        this.f5258la = requestState;
        this.f5253ga.setText(requestState.mo6286c());
        this.f5253ga.setVisibility(0);
        this.f5252fa.setVisibility(8);
        if (!this.f5261oa && C1419b.m6751b(requestState.mo6286c())) {
            C1406q.m6714b(mo1396i()).mo6070a("fb_smart_login_service", (Double) null, (Bundle) null);
        }
        if (requestState.mo6287d()) {
            m7158ia();
        } else {
            m7156ha();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m7140a(C1574p pVar) {
        if (this.f5255ia.compareAndSet(false, true)) {
            if (this.f5258la != null) {
                C1419b.m6749a(this.f5258la.mo6286c());
            }
            this.f5254ha.mo6290a((Exception) pVar);
            this.f5259ma.dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m7141a(String str, C1480ba.C1482b bVar, String str2) {
        this.f5254ha.mo6291a(str2, C1601x.m7389c(), str, bVar.mo6177b(), bVar.mo6176a(), C1427h.DEVICE_AUTH, (Date) null, (Date) null);
        this.f5259ma.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m7142a(String str, C1480ba.C1482b bVar, String str2, String str3) {
        String string = mo1415t().getString(C1366W.com_facebook_smart_login_confirmation_title);
        String string2 = mo1415t().getString(C1366W.com_facebook_smart_login_confirmation_continue_as);
        String string3 = mo1415t().getString(C1366W.com_facebook_smart_login_confirmation_cancel);
        String format = String.format(string2, new Object[]{str3});
        AlertDialog.Builder builder = new AlertDialog.Builder(mo1396i());
        builder.setMessage(string).setCancelable(true).setNegativeButton(format, new C1553i(this, str, bVar, str2)).setPositiveButton(string3, new C1552h(this));
        builder.create().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m7147b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        new GraphRequest(new AccessToken(str, C1601x.m7389c(), "0", (Collection<String>) null, (Collection<String>) null, (C1427h) null, (Date) null, (Date) null), "me", bundle, C1353I.GET, new C1554j(this, str)).mo5956b();
    }

    /* renamed from: fa */
    private GraphRequest m7152fa() {
        Bundle bundle = new Bundle();
        bundle.putString("code", this.f5258la.mo6283b());
        return new GraphRequest((AccessToken) null, "device/login_status", bundle, C1353I.POST, new C1551g(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: ga */
    public void m7154ga() {
        if (this.f5255ia.compareAndSet(false, true)) {
            if (this.f5258la != null) {
                C1419b.m6749a(this.f5258la.mo6286c());
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.f5254ha;
            if (deviceAuthMethodHandler != null) {
                deviceAuthMethodHandler.mo6293e();
            }
            this.f5259ma.dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ha */
    public void m7156ha() {
        this.f5258la.mo6284b(new Date().getTime());
        this.f5256ja = m7152fa().mo5956b();
    }

    /* access modifiers changed from: private */
    /* renamed from: ia */
    public void m7158ia() {
        this.f5257ka = DeviceAuthMethodHandler.m7174d().schedule(new C1550f(this), this.f5258la.mo6280a(), TimeUnit.SECONDS);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public View m7159j(boolean z) {
        View view;
        LayoutInflater layoutInflater = mo1337a().getLayoutInflater();
        if (z) {
            view = layoutInflater.inflate(C1365V.com_facebook_smart_device_dialog_fragment, (ViewGroup) null);
            C1525y b = C1430A.m6778b(C1601x.m7389c());
            if (b.mo6250e() != null) {
                m7133a((TextView) view.findViewById(C1364U.com_facebook_smart_instructions_2), b.mo6250e());
            }
            if (b.mo6251f() != null) {
                m7133a((TextView) view.findViewById(C1364U.com_facebook_smart_instructions_1), b.mo6251f());
            }
        } else {
            view = layoutInflater.inflate(C1365V.com_facebook_device_auth_dialog_fragment, (ViewGroup) null);
        }
        this.f5252fa = (ProgressBar) view.findViewById(C1364U.progress_bar);
        this.f5253ga = (TextView) view.findViewById(C1364U.confirmation_code);
        ((Button) view.findViewById(C1364U.cancel_button)).setOnClickListener(new C1549e(this));
        ((TextView) view.findViewById(C1364U.com_facebook_device_auth_instructions)).setText(Html.fromHtml(mo1341a(C1366W.com_facebook_device_auth_instructions)));
        return view;
    }

    /* renamed from: K */
    public void mo1324K() {
        this.f5260na = true;
        this.f5255ia.set(true);
        super.mo1324K();
        if (this.f5256ja != null) {
            this.f5256ja.cancel(true);
        }
        if (this.f5257ka != null) {
            this.f5257ka.cancel(true);
        }
    }

    /* renamed from: a */
    public View mo1339a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RequestState requestState;
        View a = super.mo1339a(layoutInflater, viewGroup, bundle);
        this.f5254ha = (DeviceAuthMethodHandler) ((C1569y) ((FacebookActivity) mo1337a()).mo2622i()).mo6389fa().mo6319d();
        if (!(bundle == null || (requestState = (RequestState) bundle.getParcelable("request_state")) == null)) {
            m7134a(requestState);
        }
        return a;
    }

    /* renamed from: a */
    public void mo6279a(LoginClient.Request request) {
        this.f5262pa = request;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", request.mo6337f()));
        String d = request.mo6334d();
        if (d != null) {
            bundle.putString("redirect_uri", d);
        }
        bundle.putString("access_token", C1484ca.m6974a() + "|" + C1484ca.m6980b());
        bundle.putString("device_info", C1419b.m6748a());
        new GraphRequest((AccessToken) null, "device/login", bundle, C1353I.POST, new C1547c(this)).mo5956b();
    }

    /* renamed from: e */
    public void mo1303e(Bundle bundle) {
        super.mo1303e(bundle);
        if (this.f5258la != null) {
            bundle.putParcelable("request_state", this.f5258la);
        }
    }

    /* renamed from: n */
    public Dialog mo1307n(Bundle bundle) {
        this.f5259ma = new Dialog(mo1337a(), C1367X.com_facebook_auth_dialog);
        mo1337a().getLayoutInflater();
        this.f5259ma.setContentView(m7159j(C1419b.m6750b() && !this.f5261oa));
        return this.f5259ma;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (!this.f5260na) {
            m7154ga();
        }
    }
}
