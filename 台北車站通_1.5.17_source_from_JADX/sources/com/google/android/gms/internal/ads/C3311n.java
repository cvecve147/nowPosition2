package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.n */
public class C3311n {

    /* renamed from: a */
    private final C3520uh f9840a;

    /* renamed from: b */
    private final String f9841b;

    public C3311n(C3520uh uhVar) {
        this(uhVar, "");
    }

    public C3311n(C3520uh uhVar, String str) {
        this.f9840a = uhVar;
        this.f9841b = str;
    }

    /* renamed from: a */
    public final void mo9764a(int i, int i2, int i3, int i4) {
        try {
            this.f9840a.mo8150a("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            C2227Cf.m9533b("Error occured while dispatching size change.", e);
        }
    }

    /* renamed from: a */
    public final void mo9765a(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.f9840a.mo8150a("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", (double) f).put("rotation", i5));
        } catch (JSONException e) {
            C2227Cf.m9533b("Error occured while obtaining screen information.", e);
        }
    }

    /* renamed from: a */
    public final void mo9766a(String str) {
        try {
            this.f9840a.mo8150a("onError", new JSONObject().put("message", str).put("action", this.f9841b));
        } catch (JSONException e) {
            C2227Cf.m9533b("Error occurred while dispatching error event.", e);
        }
    }

    /* renamed from: b */
    public final void mo9767b(int i, int i2, int i3, int i4) {
        try {
            this.f9840a.mo8150a("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            C2227Cf.m9533b("Error occured while dispatching default position.", e);
        }
    }

    /* renamed from: b */
    public final void mo9768b(String str) {
        try {
            this.f9840a.mo8150a("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e) {
            C2227Cf.m9533b("Error occured while dispatching ready Event.", e);
        }
    }

    /* renamed from: c */
    public final void mo9769c(String str) {
        try {
            this.f9840a.mo8150a("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            C2227Cf.m9533b("Error occured while dispatching state change.", e);
        }
    }
}
