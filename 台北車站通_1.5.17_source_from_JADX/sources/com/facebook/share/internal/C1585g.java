package com.facebook.share.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.facebook.AccessToken;
import com.facebook.C1353I;
import com.facebook.C1574p;
import com.facebook.GraphRequest;
import com.facebook.internal.C1480ba;
import com.facebook.share.internal.C1582e;
import com.facebook.share.model.ShareOpenGraphContent;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.g */
public final class C1585g {
    /* renamed from: a */
    public static Pair<String, String> m7347a(String str) {
        String str2;
        int i;
        int indexOf = str.indexOf(58);
        if (indexOf == -1 || str.length() <= (i = indexOf + 1)) {
            str2 = null;
        } else {
            str2 = str.substring(0, indexOf);
            str = str.substring(i);
        }
        return new Pair<>(str2, str);
    }

    /* renamed from: a */
    public static GraphRequest m7348a(AccessToken accessToken, Uri uri, GraphRequest.C1347b bVar) {
        if (C1480ba.m6962c(uri)) {
            return m7349a(accessToken, new File(uri.getPath()), bVar);
        }
        if (C1480ba.m6957b(uri)) {
            GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(uri, "image/png");
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", parcelableResourceWithMimeType);
            return new GraphRequest(accessToken, "me/staging_resources", bundle, C1353I.POST, bVar);
        }
        throw new C1574p("The image Uri must be either a file:// or content:// Uri");
    }

    /* renamed from: a */
    public static GraphRequest m7349a(AccessToken accessToken, File file, GraphRequest.C1347b bVar) {
        GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(ParcelFileDescriptor.open(file, 268435456), "image/png");
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("file", parcelableResourceWithMimeType);
        return new GraphRequest(accessToken, "me/staging_resources", bundle, C1353I.POST, bVar);
    }

    /* renamed from: a */
    public static JSONArray m7350a(JSONArray jSONArray, boolean z) {
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = m7350a((JSONArray) obj, z);
            } else if (obj instanceof JSONObject) {
                obj = m7352a((JSONObject) obj, z);
            }
            jSONArray2.put(obj);
        }
        return jSONArray2;
    }

    /* renamed from: a */
    public static JSONObject m7351a(ShareOpenGraphContent shareOpenGraphContent) {
        return C1582e.m7343a(shareOpenGraphContent.mo6436c(), (C1582e.C1583a) new C1584f());
    }

    /* renamed from: a */
    public static JSONObject m7352a(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONArray names = jSONObject.names();
            for (int i = 0; i < names.length(); i++) {
                String string = names.getString(i);
                Object obj = jSONObject.get(string);
                if (obj instanceof JSONObject) {
                    obj = m7352a((JSONObject) obj, true);
                } else if (obj instanceof JSONArray) {
                    obj = m7350a((JSONArray) obj, true);
                }
                Pair<String, String> a = m7347a(string);
                String str = (String) a.first;
                String str2 = (String) a.second;
                if (!z) {
                    if (str != null && str.equals("fb")) {
                    }
                    jSONObject2.put(str2, obj);
                } else if (str == null || !str.equals("fbsdk")) {
                    if (str != null) {
                        if (!str.equals("og")) {
                            jSONObject3.put(str2, obj);
                        }
                    }
                    jSONObject2.put(str2, obj);
                }
                jSONObject2.put(string, obj);
            }
            if (jSONObject3.length() > 0) {
                jSONObject2.put("data", jSONObject3);
            }
            return jSONObject2;
        } catch (JSONException unused) {
            throw new C1574p("Failed to create json object from share content");
        }
    }
}
