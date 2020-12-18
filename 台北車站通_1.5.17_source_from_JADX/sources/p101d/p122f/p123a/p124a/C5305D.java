package p101d.p122f.p123a.p124a;

import android.annotation.TargetApi;
import android.os.Build;
import java.io.IOException;
import org.apache.http.protocol.HTTP;
import org.json.JSONException;
import org.json.JSONObject;
import p208e.p209a.p210a.p211a.p212a.p217d.C6133a;

/* renamed from: d.f.a.a.D */
class C5305D implements C6133a<C5301B> {
    C5305D() {
    }

    @TargetApi(9)
    /* renamed from: a */
    public JSONObject mo14670a(C5301B b) {
        try {
            JSONObject jSONObject = new JSONObject();
            C5304C c = b.f14988a;
            jSONObject.put("appBundleId", c.f15013a);
            jSONObject.put("executionId", c.f15014b);
            jSONObject.put("installationId", c.f15015c);
            jSONObject.put("androidId", c.f15016d);
            jSONObject.put("advertisingId", c.f15017e);
            jSONObject.put("limitAdTrackingEnabled", c.f15018f);
            jSONObject.put("betaDeviceToken", c.f15019g);
            jSONObject.put("buildId", c.f15020h);
            jSONObject.put("osVersion", c.f15021i);
            jSONObject.put("deviceModel", c.f15022j);
            jSONObject.put("appVersionCode", c.f15023k);
            jSONObject.put("appVersionName", c.f15024l);
            jSONObject.put("timestamp", b.f14989b);
            jSONObject.put(SVGParser.XML_STYLESHEET_ATTR_TYPE, b.f14990c.toString());
            if (b.f14991d != null) {
                jSONObject.put("details", new JSONObject(b.f14991d));
            }
            jSONObject.put("customType", b.f14992e);
            if (b.f14993f != null) {
                jSONObject.put("customAttributes", new JSONObject(b.f14993f));
            }
            jSONObject.put("predefinedType", b.f14994g);
            if (b.f14995h != null) {
                jSONObject.put("predefinedAttributes", new JSONObject(b.f14995h));
            }
            return jSONObject;
        } catch (JSONException e) {
            if (Build.VERSION.SDK_INT >= 9) {
                throw new IOException(e.getMessage(), e);
            }
            throw new IOException(e.getMessage());
        }
    }

    /* renamed from: b */
    public byte[] mo14671a(C5301B b) {
        return mo14670a(b).toString().getBytes(HTTP.UTF_8);
    }
}
