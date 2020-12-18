package com.facebook;

import com.facebook.internal.C1459P;
import com.facebook.internal.C1480ba;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.apache.http.HttpStatus;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: com.facebook.H */
public class C1352H {

    /* renamed from: a */
    private final HttpURLConnection f4816a;

    /* renamed from: b */
    private final JSONObject f4817b;

    /* renamed from: c */
    private final JSONArray f4818c;

    /* renamed from: d */
    private final FacebookRequestError f4819d;

    /* renamed from: e */
    private final String f4820e;

    /* renamed from: f */
    private final GraphRequest f4821f;

    C1352H(GraphRequest graphRequest, HttpURLConnection httpURLConnection, FacebookRequestError facebookRequestError) {
        this(graphRequest, httpURLConnection, (String) null, (JSONObject) null, (JSONArray) null, facebookRequestError);
    }

    C1352H(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONArray jSONArray) {
        this(graphRequest, httpURLConnection, str, (JSONObject) null, jSONArray, (FacebookRequestError) null);
    }

    C1352H(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this(graphRequest, httpURLConnection, str, jSONObject, (JSONArray) null, (FacebookRequestError) null);
    }

    C1352H(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        this.f4821f = graphRequest;
        this.f4816a = httpURLConnection;
        this.f4820e = str;
        this.f4817b = jSONObject;
        this.f4818c = jSONArray;
        this.f4819d = facebookRequestError;
    }

    /* renamed from: a */
    private static C1352H m6585a(GraphRequest graphRequest, HttpURLConnection httpURLConnection, Object obj, Object obj2) {
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            FacebookRequestError a = FacebookRequestError.m6482a(jSONObject, obj2, httpURLConnection);
            if (a != null) {
                if (a.mo5916b() == 190 && C1480ba.m6950a(graphRequest.mo5957c())) {
                    AccessToken.m6458a((AccessToken) null);
                }
                return new C1352H(graphRequest, httpURLConnection, a);
            }
            Object a2 = C1480ba.m6922a(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
            if (a2 instanceof JSONObject) {
                return new C1352H(graphRequest, httpURLConnection, a2.toString(), (JSONObject) a2);
            }
            if (a2 instanceof JSONArray) {
                return new C1352H(graphRequest, httpURLConnection, a2.toString(), (JSONArray) a2);
            }
            obj = JSONObject.NULL;
        }
        if (obj == JSONObject.NULL) {
            return new C1352H(graphRequest, httpURLConnection, obj.toString(), (JSONObject) null);
        }
        throw new C1574p("Got unexpected object type in response, class: " + obj.getClass().getSimpleName());
    }

    /* renamed from: a */
    static List<C1352H> m6586a(InputStream inputStream, HttpURLConnection httpURLConnection, C1343G g) {
        String a = C1480ba.m6924a(inputStream);
        C1459P.m6842a(C1355K.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(a.length()), a);
        return m6587a(a, httpURLConnection, g);
    }

    /* renamed from: a */
    static List<C1352H> m6587a(String str, HttpURLConnection httpURLConnection, C1343G g) {
        List<C1352H> a = m6589a(httpURLConnection, (List<GraphRequest>) g, new JSONTokener(str).nextValue());
        C1459P.m6842a(C1355K.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", g.mo5942h(), Integer.valueOf(str.length()), a);
        return a;
    }

    /* renamed from: a */
    static List<C1352H> m6588a(HttpURLConnection httpURLConnection, C1343G g) {
        InputStream inputStream = null;
        try {
            inputStream = httpURLConnection.getResponseCode() >= 400 ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
            return m6586a(inputStream, httpURLConnection, g);
        } catch (C1574p e) {
            C1459P.m6842a(C1355K.REQUESTS, "Response", "Response <Error>: %s", e);
            return m6590a((List<GraphRequest>) g, httpURLConnection, e);
        } catch (Exception e2) {
            C1459P.m6842a(C1355K.REQUESTS, "Response", "Response <Error>: %s", e2);
            return m6590a((List<GraphRequest>) g, httpURLConnection, new C1574p((Throwable) e2));
        } finally {
            C1480ba.m6940a(inputStream);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<com.facebook.C1352H> m6589a(java.net.HttpURLConnection r7, java.util.List<com.facebook.GraphRequest> r8, java.lang.Object r9) {
        /*
            int r0 = r8.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
            r3 = 1
            if (r0 != r3) goto L_0x004e
            java.lang.Object r3 = r8.get(r2)
            com.facebook.GraphRequest r3 = (com.facebook.GraphRequest) r3
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0040, IOException -> 0x0034 }
            r4.<init>()     // Catch:{ JSONException -> 0x0040, IOException -> 0x0034 }
            java.lang.String r5 = "body"
            r4.put(r5, r9)     // Catch:{ JSONException -> 0x0040, IOException -> 0x0034 }
            if (r7 == 0) goto L_0x0024
            int r5 = r7.getResponseCode()     // Catch:{ JSONException -> 0x0040, IOException -> 0x0034 }
            goto L_0x0026
        L_0x0024:
            r5 = 200(0xc8, float:2.8E-43)
        L_0x0026:
            java.lang.String r6 = "code"
            r4.put(r6, r5)     // Catch:{ JSONException -> 0x0040, IOException -> 0x0034 }
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0040, IOException -> 0x0034 }
            r5.<init>()     // Catch:{ JSONException -> 0x0040, IOException -> 0x0034 }
            r5.put(r4)     // Catch:{ JSONException -> 0x0040, IOException -> 0x0034 }
            goto L_0x004f
        L_0x0034:
            r4 = move-exception
            com.facebook.H r5 = new com.facebook.H
            com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
            r6.<init>((java.net.HttpURLConnection) r7, (java.lang.Exception) r4)
            r5.<init>(r3, r7, r6)
            goto L_0x004b
        L_0x0040:
            r4 = move-exception
            com.facebook.H r5 = new com.facebook.H
            com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
            r6.<init>((java.net.HttpURLConnection) r7, (java.lang.Exception) r4)
            r5.<init>(r3, r7, r6)
        L_0x004b:
            r1.add(r5)
        L_0x004e:
            r5 = r9
        L_0x004f:
            boolean r3 = r5 instanceof org.json.JSONArray
            if (r3 == 0) goto L_0x0091
            org.json.JSONArray r5 = (org.json.JSONArray) r5
            int r3 = r5.length()
            if (r3 != r0) goto L_0x0091
        L_0x005b:
            int r0 = r5.length()
            if (r2 >= r0) goto L_0x0090
            java.lang.Object r0 = r8.get(r2)
            com.facebook.GraphRequest r0 = (com.facebook.GraphRequest) r0
            java.lang.Object r3 = r5.get(r2)     // Catch:{ JSONException -> 0x007f, p -> 0x0073 }
            com.facebook.H r3 = m6585a(r0, r7, r3, r9)     // Catch:{ JSONException -> 0x007f, p -> 0x0073 }
            r1.add(r3)     // Catch:{ JSONException -> 0x007f, p -> 0x0073 }
            goto L_0x008d
        L_0x0073:
            r3 = move-exception
            com.facebook.H r4 = new com.facebook.H
            com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
            r6.<init>((java.net.HttpURLConnection) r7, (java.lang.Exception) r3)
            r4.<init>(r0, r7, r6)
            goto L_0x008a
        L_0x007f:
            r3 = move-exception
            com.facebook.H r4 = new com.facebook.H
            com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
            r6.<init>((java.net.HttpURLConnection) r7, (java.lang.Exception) r3)
            r4.<init>(r0, r7, r6)
        L_0x008a:
            r1.add(r4)
        L_0x008d:
            int r2 = r2 + 1
            goto L_0x005b
        L_0x0090:
            return r1
        L_0x0091:
            com.facebook.p r7 = new com.facebook.p
            java.lang.String r8 = "Unexpected number of results"
            r7.<init>((java.lang.String) r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C1352H.m6589a(java.net.HttpURLConnection, java.util.List, java.lang.Object):java.util.List");
    }

    /* renamed from: a */
    static List<C1352H> m6590a(List<GraphRequest> list, HttpURLConnection httpURLConnection, C1574p pVar) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new C1352H(list.get(i), httpURLConnection, new FacebookRequestError(httpURLConnection, (Exception) pVar)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final FacebookRequestError mo5987a() {
        return this.f4819d;
    }

    /* renamed from: b */
    public final JSONObject mo5988b() {
        return this.f4817b;
    }

    public String toString() {
        String str;
        try {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf(this.f4816a != null ? this.f4816a.getResponseCode() : HttpStatus.SC_OK);
            str = String.format(locale, "%d", objArr);
        } catch (IOException unused) {
            str = "unknown";
        }
        return "{Response: " + " responseCode: " + str + ", graphObject: " + this.f4817b + ", error: " + this.f4819d + "}";
    }
}
