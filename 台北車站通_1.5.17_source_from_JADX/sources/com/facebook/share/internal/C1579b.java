package com.facebook.share.internal;

import com.facebook.C1352H;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.share.internal.DeviceShareDialogFragment;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.b */
class C1579b implements GraphRequest.C1347b {

    /* renamed from: a */
    final /* synthetic */ DeviceShareDialogFragment f5367a;

    C1579b(DeviceShareDialogFragment deviceShareDialogFragment) {
        this.f5367a = deviceShareDialogFragment;
    }

    /* renamed from: a */
    public void mo5885a(C1352H h) {
        FacebookRequestError a = h.mo5987a();
        if (a != null) {
            this.f5367a.m7324a(a);
            return;
        }
        JSONObject b = h.mo5988b();
        DeviceShareDialogFragment.RequestState requestState = new DeviceShareDialogFragment.RequestState();
        try {
            requestState.mo6409a(b.getString("user_code"));
            requestState.mo6408a(b.getLong("expires_in"));
            this.f5367a.m7325a(requestState);
        } catch (JSONException unused) {
            this.f5367a.m7324a(new FacebookRequestError(0, "", "Malformed server response"));
        }
    }
}
