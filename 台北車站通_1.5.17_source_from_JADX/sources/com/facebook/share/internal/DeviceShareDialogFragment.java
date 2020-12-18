package com.facebook.share.internal;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p007v4.app.C0270D;
import android.support.p007v4.app.C0336i;
import android.support.p007v4.app.C0344n;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.AccessToken;
import com.facebook.C1353I;
import com.facebook.C1364U;
import com.facebook.C1365V;
import com.facebook.C1366W;
import com.facebook.C1367X;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.internal.C1484ca;
import com.facebook.p062b.p063a.C1419b;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class DeviceShareDialogFragment extends C0336i {

    /* renamed from: fa */
    private static ScheduledThreadPoolExecutor f5357fa;

    /* renamed from: ga */
    private ProgressBar f5358ga;

    /* renamed from: ha */
    private TextView f5359ha;
    /* access modifiers changed from: private */

    /* renamed from: ia */
    public Dialog f5360ia;

    /* renamed from: ja */
    private volatile RequestState f5361ja;

    /* renamed from: ka */
    private volatile ScheduledFuture f5362ka;

    /* renamed from: la */
    private ShareContent f5363la;

    private static class RequestState implements Parcelable {
        public static final Parcelable.Creator<RequestState> CREATOR = new C1581d();

        /* renamed from: a */
        private String f5364a;

        /* renamed from: b */
        private long f5365b;

        RequestState() {
        }

        protected RequestState(Parcel parcel) {
            this.f5364a = parcel.readString();
            this.f5365b = parcel.readLong();
        }

        /* renamed from: a */
        public long mo6407a() {
            return this.f5365b;
        }

        /* renamed from: a */
        public void mo6408a(long j) {
            this.f5365b = j;
        }

        /* renamed from: a */
        public void mo6409a(String str) {
            this.f5364a = str;
        }

        /* renamed from: b */
        public String mo6410b() {
            return this.f5364a;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f5364a);
            parcel.writeLong(this.f5365b);
        }
    }

    /* renamed from: a */
    private void m7323a(int i, Intent intent) {
        C1419b.m6749a(this.f5361ja.mo6410b());
        if (mo1316C()) {
            C0344n a = mo1337a();
            a.setResult(i, intent);
            a.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m7324a(FacebookRequestError facebookRequestError) {
        m7328fa();
        Intent intent = new Intent();
        intent.putExtra("error", facebookRequestError);
        m7323a(-1, intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m7325a(RequestState requestState) {
        this.f5361ja = requestState;
        this.f5359ha.setText(requestState.mo6410b());
        this.f5359ha.setVisibility(0);
        this.f5358ga.setVisibility(8);
        this.f5362ka = m7329ga().schedule(new C1580c(this), requestState.mo6407a(), TimeUnit.SECONDS);
    }

    /* renamed from: fa */
    private void m7328fa() {
        if (mo1316C()) {
            C0270D a = mo1406n().mo1494a();
            a.mo1130c(this);
            a.mo1122a();
        }
    }

    /* renamed from: ga */
    private static synchronized ScheduledThreadPoolExecutor m7329ga() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (DeviceShareDialogFragment.class) {
            if (f5357fa == null) {
                f5357fa = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = f5357fa;
        }
        return scheduledThreadPoolExecutor;
    }

    /* renamed from: ha */
    private Bundle m7330ha() {
        ShareContent shareContent = this.f5363la;
        if (shareContent == null) {
            return null;
        }
        if (shareContent instanceof ShareLinkContent) {
            return C1586h.m7354a((ShareLinkContent) shareContent);
        }
        if (shareContent instanceof ShareOpenGraphContent) {
            return C1586h.m7355a((ShareOpenGraphContent) shareContent);
        }
        return null;
    }

    /* renamed from: ia */
    private void m7331ia() {
        Bundle ha = m7330ha();
        if (ha == null || ha.size() == 0) {
            m7324a(new FacebookRequestError(0, "", "Failed to get share content"));
        }
        ha.putString("access_token", C1484ca.m6974a() + "|" + C1484ca.m6980b());
        ha.putString("device_info", C1419b.m6748a());
        new GraphRequest((AccessToken) null, "device/share", ha, C1353I.POST, new C1579b(this)).mo5956b();
    }

    /* renamed from: a */
    public View mo1339a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RequestState requestState;
        View a = super.mo1339a(layoutInflater, viewGroup, bundle);
        if (!(bundle == null || (requestState = (RequestState) bundle.getParcelable("request_state")) == null)) {
            m7325a(requestState);
        }
        return a;
    }

    /* renamed from: a */
    public void mo6406a(ShareContent shareContent) {
        this.f5363la = shareContent;
    }

    /* renamed from: e */
    public void mo1303e(Bundle bundle) {
        super.mo1303e(bundle);
        if (this.f5361ja != null) {
            bundle.putParcelable("request_state", this.f5361ja);
        }
    }

    /* renamed from: n */
    public Dialog mo1307n(Bundle bundle) {
        this.f5360ia = new Dialog(mo1337a(), C1367X.com_facebook_auth_dialog);
        View inflate = mo1337a().getLayoutInflater().inflate(C1365V.com_facebook_device_auth_dialog_fragment, (ViewGroup) null);
        this.f5358ga = (ProgressBar) inflate.findViewById(C1364U.progress_bar);
        this.f5359ha = (TextView) inflate.findViewById(C1364U.confirmation_code);
        ((Button) inflate.findViewById(C1364U.cancel_button)).setOnClickListener(new C1578a(this));
        ((TextView) inflate.findViewById(C1364U.com_facebook_device_auth_instructions)).setText(Html.fromHtml(mo1341a(C1366W.com_facebook_device_auth_instructions)));
        this.f5360ia.setContentView(inflate);
        m7331ia();
        return this.f5360ia;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f5362ka != null) {
            this.f5362ka.cancel(true);
        }
        m7323a(-1, new Intent());
    }
}
