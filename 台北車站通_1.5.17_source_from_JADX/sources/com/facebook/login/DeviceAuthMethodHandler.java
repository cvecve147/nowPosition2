package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.AccessToken;
import com.facebook.C1427h;
import com.facebook.login.LoginClient;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;

class DeviceAuthMethodHandler extends LoginMethodHandler {
    public static final Parcelable.Creator<DeviceAuthMethodHandler> CREATOR = new C1556l();

    /* renamed from: a */
    private static ScheduledThreadPoolExecutor f5267a;

    protected DeviceAuthMethodHandler(Parcel parcel) {
        super(parcel);
    }

    DeviceAuthMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* renamed from: b */
    private void m7173b(LoginClient.Request request) {
        DeviceAuthDialog deviceAuthDialog = new DeviceAuthDialog();
        deviceAuthDialog.mo1299a(this.f5302b.mo6316c().mo1430d(), "login_with_facebook");
        deviceAuthDialog.mo6279a(request);
    }

    /* renamed from: d */
    public static synchronized ScheduledThreadPoolExecutor m7174d() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (DeviceAuthMethodHandler.class) {
            if (f5267a == null) {
                f5267a = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = f5267a;
        }
        return scheduledThreadPoolExecutor;
    }

    /* renamed from: a */
    public void mo6290a(Exception exc) {
        this.f5302b.mo6313b(LoginClient.Result.m7237a(this.f5302b.mo6323i(), (String) null, exc.getMessage()));
    }

    /* renamed from: a */
    public void mo6291a(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, C1427h hVar, Date date, Date date2) {
        this.f5302b.mo6313b(LoginClient.Result.m7235a(this.f5302b.mo6323i(), new AccessToken(str, str2, str3, collection, collection2, hVar, date, date2)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo6264a(LoginClient.Request request) {
        m7173b(request);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo6265b() {
        return "device_auth";
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public void mo6293e() {
        this.f5302b.mo6313b(LoginClient.Result.m7236a(this.f5302b.mo6323i(), "User canceled log in."));
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
