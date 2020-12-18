package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONException;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Wh */
public final class C2806Wh {

    /* renamed from: a */
    private static final Pattern f8532a = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);

    /* renamed from: b */
    private static final Pattern f8533b = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    /* renamed from: a */
    public static String m11500a() {
        String str = (String) C3390pt.m13458f().mo8515a(C2558Nu.f7888fa);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ClientCookie.VERSION_ATTR, str);
            jSONObject.put("sdk", "Google Mobile Ads");
            jSONObject.put("sdkVersion", "12.4.51-000");
            return "<script>" + "Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});" + "</script>";
        } catch (JSONException e) {
            C2227Cf.m9535c("Unable to build MRAID_ENV", e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m11501a(String str, String... strArr) {
        if (strArr.length == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        Matcher matcher = f8532a.matcher(str);
        int i = 0;
        if (matcher.find()) {
            int end = matcher.end();
            sb.append(str.substring(0, end));
            int length = strArr.length;
            while (i < length) {
                String str2 = strArr[i];
                if (str2 != null) {
                    sb.append(str2);
                }
                i++;
            }
            str = str.substring(end);
        } else if (!f8533b.matcher(str).find()) {
            int length2 = strArr.length;
            while (i < length2) {
                String str3 = strArr[i];
                if (str3 != null) {
                    sb.append(str3);
                }
                i++;
            }
        }
        sb.append(str);
        return sb.toString();
    }
}
