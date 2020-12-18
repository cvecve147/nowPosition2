package com.facebook;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.C1343G;
import com.facebook.internal.C1456M;
import com.facebook.internal.C1459P;
import com.facebook.internal.C1472W;
import com.facebook.internal.C1480ba;
import com.facebook.internal.C1484ca;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.HttpHeaders;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.protocol.HTTP;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GraphRequest {

    /* renamed from: a */
    public static final String f4791a = "GraphRequest";

    /* renamed from: b */
    private static String f4792b;

    /* renamed from: c */
    private static Pattern f4793c = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");

    /* renamed from: d */
    private static volatile String f4794d;

    /* renamed from: e */
    private AccessToken f4795e;

    /* renamed from: f */
    private C1353I f4796f;

    /* renamed from: g */
    private String f4797g;

    /* renamed from: h */
    private JSONObject f4798h;

    /* renamed from: i */
    private String f4799i;

    /* renamed from: j */
    private String f4800j;

    /* renamed from: k */
    private boolean f4801k;

    /* renamed from: l */
    private Bundle f4802l;

    /* renamed from: m */
    private C1347b f4803m;

    /* renamed from: n */
    private String f4804n;

    /* renamed from: o */
    private Object f4805o;

    /* renamed from: p */
    private String f4806p;

    /* renamed from: q */
    private boolean f4807q;

    public static class ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {
        public static final Parcelable.Creator<ParcelableResourceWithMimeType> CREATOR = new C1339E();

        /* renamed from: a */
        private final String f4808a;

        /* renamed from: b */
        private final RESOURCE f4809b;

        private ParcelableResourceWithMimeType(Parcel parcel) {
            this.f4808a = parcel.readString();
            this.f4809b = parcel.readParcelable(C1601x.m7386b().getClassLoader());
        }

        /* synthetic */ ParcelableResourceWithMimeType(Parcel parcel, C1334A a) {
            this(parcel);
        }

        public ParcelableResourceWithMimeType(RESOURCE resource, String str) {
            this.f4808a = str;
            this.f4809b = resource;
        }

        /* renamed from: a */
        public String mo5969a() {
            return this.f4808a;
        }

        /* renamed from: b */
        public RESOURCE mo5970b() {
            return this.f4809b;
        }

        public int describeContents() {
            return 1;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f4808a);
            parcel.writeParcelable(this.f4809b, i);
        }
    }

    /* renamed from: com.facebook.GraphRequest$a */
    private static class C1346a {

        /* renamed from: a */
        private final GraphRequest f4810a;

        /* renamed from: b */
        private final Object f4811b;

        public C1346a(GraphRequest graphRequest, Object obj) {
            this.f4810a = graphRequest;
            this.f4811b = obj;
        }

        /* renamed from: a */
        public GraphRequest mo5973a() {
            return this.f4810a;
        }

        /* renamed from: b */
        public Object mo5974b() {
            return this.f4811b;
        }
    }

    /* renamed from: com.facebook.GraphRequest$b */
    public interface C1347b {
        /* renamed from: a */
        void mo5885a(C1352H h);
    }

    /* renamed from: com.facebook.GraphRequest$c */
    public interface C1348c {
        /* renamed from: a */
        void mo5975a(JSONObject jSONObject, C1352H h);
    }

    /* renamed from: com.facebook.GraphRequest$d */
    private interface C1349d {
        /* renamed from: a */
        void mo5906a(String str, String str2);
    }

    /* renamed from: com.facebook.GraphRequest$e */
    public interface C1350e extends C1347b {
        /* renamed from: a */
        void mo5976a(long j, long j2);
    }

    /* renamed from: com.facebook.GraphRequest$f */
    private static class C1351f implements C1349d {

        /* renamed from: a */
        private final OutputStream f4812a;

        /* renamed from: b */
        private final C1459P f4813b;

        /* renamed from: c */
        private boolean f4814c = true;

        /* renamed from: d */
        private boolean f4815d = false;

        public C1351f(OutputStream outputStream, C1459P p, boolean z) {
            this.f4812a = outputStream;
            this.f4813b = p;
            this.f4815d = z;
        }

        /* renamed from: b */
        private RuntimeException m6573b() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        /* renamed from: a */
        public void mo5977a() {
            if (!this.f4815d) {
                mo5986b("--%s", "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f");
                return;
            }
            this.f4812a.write("&".getBytes());
        }

        /* renamed from: a */
        public void mo5978a(String str, Bitmap bitmap) {
            mo5982a(str, str, "image/png");
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.f4812a);
            mo5986b("", new Object[0]);
            mo5977a();
            C1459P p = this.f4813b;
            if (p != null) {
                p.mo6156a("    " + str, (Object) "<Image>");
            }
        }

        /* renamed from: a */
        public void mo5979a(String str, Uri uri, String str2) {
            int i;
            if (str2 == null) {
                str2 = "content/unknown";
            }
            mo5982a(str, str, str2);
            if (this.f4812a instanceof C1360P) {
                ((C1360P) this.f4812a).mo6003a(C1480ba.m6918a(uri));
                i = 0;
            } else {
                i = C1480ba.m6916a(C1601x.m7386b().getContentResolver().openInputStream(uri), this.f4812a) + 0;
            }
            mo5986b("", new Object[0]);
            mo5977a();
            C1459P p = this.f4813b;
            if (p != null) {
                p.mo6156a("    " + str, (Object) String.format(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(i)}));
            }
        }

        /* renamed from: a */
        public void mo5980a(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) {
            int i;
            if (str2 == null) {
                str2 = "content/unknown";
            }
            mo5982a(str, str, str2);
            OutputStream outputStream = this.f4812a;
            if (outputStream instanceof C1360P) {
                ((C1360P) outputStream).mo6003a(parcelFileDescriptor.getStatSize());
                i = 0;
            } else {
                i = C1480ba.m6916a((InputStream) new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.f4812a) + 0;
            }
            mo5986b("", new Object[0]);
            mo5977a();
            C1459P p = this.f4813b;
            if (p != null) {
                p.mo6156a("    " + str, (Object) String.format(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(i)}));
            }
        }

        /* renamed from: a */
        public void mo5981a(String str, Object obj, GraphRequest graphRequest) {
            OutputStream outputStream = this.f4812a;
            if (outputStream instanceof C1368Y) {
                ((C1368Y) outputStream).mo6004a(graphRequest);
            }
            if (GraphRequest.m6539e(obj)) {
                mo5906a(str, GraphRequest.m6540f(obj));
            } else if (obj instanceof Bitmap) {
                mo5978a(str, (Bitmap) obj);
            } else if (obj instanceof byte[]) {
                mo5984a(str, (byte[]) obj);
            } else if (obj instanceof Uri) {
                mo5979a(str, (Uri) obj, (String) null);
            } else if (obj instanceof ParcelFileDescriptor) {
                mo5980a(str, (ParcelFileDescriptor) obj, (String) null);
            } else if (obj instanceof ParcelableResourceWithMimeType) {
                ParcelableResourceWithMimeType parcelableResourceWithMimeType = (ParcelableResourceWithMimeType) obj;
                Parcelable b = parcelableResourceWithMimeType.mo5970b();
                String a = parcelableResourceWithMimeType.mo5969a();
                if (b instanceof ParcelFileDescriptor) {
                    mo5980a(str, (ParcelFileDescriptor) b, a);
                } else if (b instanceof Uri) {
                    mo5979a(str, (Uri) b, a);
                } else {
                    throw m6573b();
                }
            } else {
                throw m6573b();
            }
        }

        /* renamed from: a */
        public void mo5906a(String str, String str2) {
            mo5982a(str, (String) null, (String) null);
            mo5986b("%s", str2);
            mo5977a();
            C1459P p = this.f4813b;
            if (p != null) {
                p.mo6156a("    " + str, (Object) str2);
            }
        }

        /* renamed from: a */
        public void mo5982a(String str, String str2, String str3) {
            if (!this.f4815d) {
                mo5985a("Content-Disposition: form-data; name=\"%s\"", str);
                if (str2 != null) {
                    mo5985a("; filename=\"%s\"", str2);
                }
                mo5986b("", new Object[0]);
                if (str3 != null) {
                    mo5986b("%s: %s", "Content-Type", str3);
                }
                mo5986b("", new Object[0]);
                return;
            }
            this.f4812a.write(String.format("%s=", new Object[]{str}).getBytes());
        }

        /* renamed from: a */
        public void mo5983a(String str, JSONArray jSONArray, Collection<GraphRequest> collection) {
            String str2;
            Object[] objArr;
            OutputStream outputStream = this.f4812a;
            if (!(outputStream instanceof C1368Y)) {
                mo5906a(str, jSONArray.toString());
                return;
            }
            C1368Y y = (C1368Y) outputStream;
            mo5982a(str, (String) null, (String) null);
            mo5985a("[", new Object[0]);
            int i = 0;
            for (GraphRequest a : collection) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                y.mo6004a(a);
                if (i > 0) {
                    objArr = new Object[]{jSONObject.toString()};
                    str2 = ",%s";
                } else {
                    objArr = new Object[]{jSONObject.toString()};
                    str2 = "%s";
                }
                mo5985a(str2, objArr);
                i++;
            }
            mo5985a("]", new Object[0]);
            C1459P p = this.f4813b;
            if (p != null) {
                p.mo6156a("    " + str, (Object) jSONArray.toString());
            }
        }

        /* renamed from: a */
        public void mo5984a(String str, byte[] bArr) {
            mo5982a(str, str, "content/unknown");
            this.f4812a.write(bArr);
            mo5986b("", new Object[0]);
            mo5977a();
            C1459P p = this.f4813b;
            if (p != null) {
                p.mo6156a("    " + str, (Object) String.format(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(bArr.length)}));
            }
        }

        /* renamed from: a */
        public void mo5985a(String str, Object... objArr) {
            String str2;
            OutputStream outputStream;
            if (!this.f4815d) {
                if (this.f4814c) {
                    this.f4812a.write("--".getBytes());
                    this.f4812a.write("3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f".getBytes());
                    this.f4812a.write("\r\n".getBytes());
                    this.f4814c = false;
                }
                outputStream = this.f4812a;
                str2 = String.format(str, objArr);
            } else {
                outputStream = this.f4812a;
                str2 = URLEncoder.encode(String.format(Locale.US, str, objArr), HTTP.UTF_8);
            }
            outputStream.write(str2.getBytes());
        }

        /* renamed from: b */
        public void mo5986b(String str, Object... objArr) {
            mo5985a(str, objArr);
            if (!this.f4815d) {
                mo5985a("\r\n", new Object[0]);
            }
        }
    }

    public GraphRequest() {
        this((AccessToken) null, (String) null, (Bundle) null, (C1353I) null, (C1347b) null);
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, C1353I i, C1347b bVar) {
        this(accessToken, str, bundle, i, bVar, (String) null);
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, C1353I i, C1347b bVar, String str2) {
        this.f4801k = true;
        this.f4807q = false;
        this.f4795e = accessToken;
        this.f4797g = str;
        this.f4806p = str2;
        mo5952a(bVar);
        mo5953a(i);
        this.f4802l = bundle != null ? new Bundle(bundle) : new Bundle();
        if (this.f4806p == null) {
            this.f4806p = C1601x.m7397j();
        }
    }

    /* renamed from: a */
    public static GraphRequest m6508a(AccessToken accessToken, C1348c cVar) {
        return new GraphRequest(accessToken, "me", (Bundle) null, (C1353I) null, new C1334A(cVar));
    }

    /* renamed from: a */
    public static GraphRequest m6509a(AccessToken accessToken, String str, C1347b bVar) {
        return new GraphRequest(accessToken, str, (Bundle) null, (C1353I) null, bVar);
    }

    /* renamed from: a */
    public static GraphRequest m6510a(AccessToken accessToken, String str, JSONObject jSONObject, C1347b bVar) {
        GraphRequest graphRequest = new GraphRequest(accessToken, str, (Bundle) null, C1353I.POST, bVar);
        graphRequest.mo5954a(jSONObject);
        return graphRequest;
    }

    /* renamed from: a */
    public static C1352H m6511a(GraphRequest graphRequest) {
        List<C1352H> a = m6517a(graphRequest);
        if (a != null && a.size() == 1) {
            return a.get(0);
        }
        throw new C1574p("invalid state: expected a single response");
    }

    /* renamed from: a */
    private String m6512a(String str) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.f4802l.keySet()) {
            Object obj = this.f4802l.get(str2);
            if (obj == null) {
                obj = "";
            }
            if (m6539e(obj)) {
                buildUpon.appendQueryParameter(str2, m6540f(obj).toString());
            } else if (this.f4796f == C1353I.GET) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unsupported parameter type for GET request: %s", new Object[]{obj.getClass().getSimpleName()}));
            }
        }
        return buildUpon.toString();
    }

    /* renamed from: a */
    private static HttpURLConnection m6513a(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestProperty("User-Agent", m6546p());
        httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_LANGUAGE, Locale.getDefault().toString());
        httpURLConnection.setChunkedStreamingMode(0);
        return httpURLConnection;
    }

    /* renamed from: a */
    public static List<C1352H> m6514a(C1343G g) {
        C1484ca.m6984c(g, "requests");
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnection = m6535c(g);
            return m6515a(httpURLConnection, g);
        } catch (Exception e) {
            List<C1352H> a = C1352H.m6590a(g.mo5943i(), httpURLConnection, new C1574p((Throwable) e));
            m6521a(g, a);
            return a;
        } finally {
            C1480ba.m6945a((URLConnection) httpURLConnection);
        }
    }

    /* renamed from: a */
    public static List<C1352H> m6515a(HttpURLConnection httpURLConnection, C1343G g) {
        List<C1352H> a = C1352H.m6588a(httpURLConnection, g);
        C1480ba.m6945a((URLConnection) httpURLConnection);
        int size = g.size();
        if (size == a.size()) {
            m6521a(g, a);
            C1425g.m6764c().mo6092a();
            return a;
        }
        throw new C1574p(String.format(Locale.US, "Received %d responses while expecting %d", new Object[]{Integer.valueOf(a.size()), Integer.valueOf(size)}));
    }

    /* renamed from: a */
    public static List<C1352H> m6516a(Collection<GraphRequest> collection) {
        return m6514a(new C1343G(collection));
    }

    /* renamed from: a */
    public static List<C1352H> m6517a(GraphRequest... graphRequestArr) {
        C1484ca.m6976a((Object) graphRequestArr, "requests");
        return m6516a((Collection<GraphRequest>) Arrays.asList(graphRequestArr));
    }

    /* renamed from: a */
    private static void m6518a(Bundle bundle, C1351f fVar, GraphRequest graphRequest) {
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (m6539e(obj)) {
                fVar.mo5981a(str, obj, graphRequest);
            }
        }
    }

    /* renamed from: a */
    private static void m6519a(C1343G g, C1459P p, int i, URL url, OutputStream outputStream, boolean z) {
        C1351f fVar = new C1351f(outputStream, p, z);
        if (i == 1) {
            GraphRequest graphRequest = g.get(0);
            HashMap hashMap = new HashMap();
            for (String str : graphRequest.f4802l.keySet()) {
                Object obj = graphRequest.f4802l.get(str);
                if (m6537d(obj)) {
                    hashMap.put(str, new C1346a(graphRequest, obj));
                }
            }
            if (p != null) {
                p.mo6155a("  Parameters:\n");
            }
            m6518a(graphRequest.f4802l, fVar, graphRequest);
            if (p != null) {
                p.mo6155a("  Attachments:\n");
            }
            m6525a((Map<String, C1346a>) hashMap, fVar);
            JSONObject jSONObject = graphRequest.f4798h;
            if (jSONObject != null) {
                m6527a(jSONObject, url.getPath(), (C1349d) fVar);
                return;
            }
            return;
        }
        String e = m6538e(g);
        if (!C1480ba.m6958b(e)) {
            fVar.mo5906a("batch_app_id", e);
            HashMap hashMap2 = new HashMap();
            m6522a(fVar, (Collection<GraphRequest>) g, (Map<String, C1346a>) hashMap2);
            if (p != null) {
                p.mo6155a("  Attachments:\n");
            }
            m6525a((Map<String, C1346a>) hashMap2, fVar);
            return;
        }
        throw new C1574p("App ID was not specified at the request or Settings.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ca  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final void m6520a(com.facebook.C1343G r13, java.net.HttpURLConnection r14) {
        /*
            com.facebook.internal.P r6 = new com.facebook.internal.P
            com.facebook.K r0 = com.facebook.C1355K.REQUESTS
            java.lang.String r1 = "Request"
            r6.<init>(r0, r1)
            int r2 = r13.size()
            boolean r5 = m6542g(r13)
            r0 = 0
            r1 = 1
            if (r2 != r1) goto L_0x001c
            com.facebook.GraphRequest r3 = r13.get((int) r0)
            com.facebook.I r3 = r3.f4796f
            goto L_0x001e
        L_0x001c:
            com.facebook.I r3 = com.facebook.C1353I.POST
        L_0x001e:
            java.lang.String r4 = r3.name()
            r14.setRequestMethod(r4)
            m6524a((java.net.HttpURLConnection) r14, (boolean) r5)
            java.net.URL r4 = r14.getURL()
            java.lang.String r7 = "Request:\n"
            r6.mo6155a(r7)
            java.lang.String r7 = r13.mo5942h()
            java.lang.String r8 = "Id"
            r6.mo6156a((java.lang.String) r8, (java.lang.Object) r7)
            java.lang.String r7 = "URL"
            r6.mo6156a((java.lang.String) r7, (java.lang.Object) r4)
            java.lang.String r7 = r14.getRequestMethod()
            java.lang.String r8 = "Method"
            r6.mo6156a((java.lang.String) r8, (java.lang.Object) r7)
            java.lang.String r7 = "User-Agent"
            java.lang.String r8 = r14.getRequestProperty(r7)
            r6.mo6156a((java.lang.String) r7, (java.lang.Object) r8)
            java.lang.String r7 = "Content-Type"
            java.lang.String r8 = r14.getRequestProperty(r7)
            r6.mo6156a((java.lang.String) r7, (java.lang.Object) r8)
            int r7 = r13.mo5944j()
            r14.setConnectTimeout(r7)
            int r7 = r13.mo5944j()
            r14.setReadTimeout(r7)
            com.facebook.I r7 = com.facebook.C1353I.POST
            if (r3 != r7) goto L_0x006d
            r0 = r1
        L_0x006d:
            if (r0 != 0) goto L_0x0073
            r6.mo6154a()
            return
        L_0x0073:
            r14.setDoOutput(r1)
            r0 = 0
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x00c6 }
            java.io.OutputStream r14 = r14.getOutputStream()     // Catch:{ all -> 0x00c6 }
            r1.<init>(r14)     // Catch:{ all -> 0x00c6 }
            if (r5 == 0) goto L_0x008b
            java.util.zip.GZIPOutputStream r14 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0088 }
            r14.<init>(r1)     // Catch:{ all -> 0x0088 }
            goto L_0x008c
        L_0x0088:
            r13 = move-exception
            r14 = r1
            goto L_0x00c8
        L_0x008b:
            r14 = r1
        L_0x008c:
            boolean r0 = m6541f((com.facebook.C1343G) r13)     // Catch:{ all -> 0x00c4 }
            if (r0 == 0) goto L_0x00b6
            com.facebook.P r0 = new com.facebook.P     // Catch:{ all -> 0x00c4 }
            android.os.Handler r1 = r13.mo5939f()     // Catch:{ all -> 0x00c4 }
            r0.<init>(r1)     // Catch:{ all -> 0x00c4 }
            r8 = 0
            r7 = r13
            r9 = r2
            r10 = r4
            r11 = r0
            r12 = r5
            m6519a(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00c4 }
            int r1 = r0.mo6002a()     // Catch:{ all -> 0x00c4 }
            java.util.Map r10 = r0.mo6005b()     // Catch:{ all -> 0x00c4 }
            com.facebook.S r0 = new com.facebook.S     // Catch:{ all -> 0x00c4 }
            long r11 = (long) r1     // Catch:{ all -> 0x00c4 }
            r7 = r0
            r8 = r14
            r9 = r13
            r7.<init>(r8, r9, r10, r11)     // Catch:{ all -> 0x00c4 }
            r14 = r0
        L_0x00b6:
            r0 = r13
            r1 = r6
            r3 = r4
            r4 = r14
            m6519a(r0, r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00c4 }
            r14.close()
            r6.mo6154a()
            return
        L_0x00c4:
            r13 = move-exception
            goto L_0x00c8
        L_0x00c6:
            r13 = move-exception
            r14 = r0
        L_0x00c8:
            if (r14 == 0) goto L_0x00cd
            r14.close()
        L_0x00cd:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.m6520a(com.facebook.G, java.net.HttpURLConnection):void");
    }

    /* renamed from: a */
    static void m6521a(C1343G g, List<C1352H> list) {
        int size = g.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            C1347b bVar = g.get(i).f4803m;
            if (bVar != null) {
                arrayList.add(new Pair(bVar, list.get(i)));
            }
        }
        if (arrayList.size() > 0) {
            C1337C c = new C1337C(arrayList, g);
            Handler f = g.mo5939f();
            if (f == null) {
                c.run();
            } else {
                f.post(c);
            }
        }
    }

    /* renamed from: a */
    private static void m6522a(C1351f fVar, Collection<GraphRequest> collection, Map<String, C1346a> map) {
        JSONArray jSONArray = new JSONArray();
        for (GraphRequest a : collection) {
            a.m6526a(jSONArray, map);
        }
        fVar.mo5983a("batch", jSONArray, collection);
    }

    /* renamed from: a */
    private static void m6523a(String str, Object obj, C1349d dVar, boolean z) {
        String str2;
        String jSONObject;
        Class<?> cls = obj.getClass();
        if (JSONObject.class.isAssignableFrom(cls)) {
            JSONObject jSONObject2 = (JSONObject) obj;
            if (z) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    m6523a(String.format("%s[%s]", new Object[]{str, next}), jSONObject2.opt(next), dVar, z);
                }
                return;
            }
            String str3 = "id";
            if (!jSONObject2.has(str3)) {
                str3 = "url";
                if (!jSONObject2.has(str3)) {
                    if (jSONObject2.has("fbsdk:create_object")) {
                        jSONObject = jSONObject2.toString();
                        m6523a(str, (Object) jSONObject, dVar, z);
                    }
                    return;
                }
            }
            jSONObject = jSONObject2.optString(str3);
            m6523a(str, (Object) jSONObject, dVar, z);
        } else if (JSONArray.class.isAssignableFrom(cls)) {
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                m6523a(String.format(Locale.ROOT, "%s[%d]", new Object[]{str, Integer.valueOf(i)}), jSONArray.opt(i), dVar, z);
            }
        } else {
            if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
                str2 = obj.toString();
            } else if (Date.class.isAssignableFrom(cls)) {
                str2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
            } else {
                return;
            }
            dVar.mo5906a(str, str2);
        }
    }

    /* renamed from: a */
    private static void m6524a(HttpURLConnection httpURLConnection, boolean z) {
        if (z) {
            httpURLConnection.setRequestProperty("Content-Type", URLEncodedUtils.CONTENT_TYPE);
            httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
            return;
        }
        httpURLConnection.setRequestProperty("Content-Type", m6545o());
    }

    /* renamed from: a */
    private static void m6525a(Map<String, C1346a> map, C1351f fVar) {
        for (String next : map.keySet()) {
            C1346a aVar = map.get(next);
            if (m6537d(aVar.mo5974b())) {
                fVar.mo5981a(next, aVar.mo5974b(), aVar.mo5973a());
            }
        }
    }

    /* renamed from: a */
    private void m6526a(JSONArray jSONArray, Map<String, C1346a> map) {
        JSONObject jSONObject = new JSONObject();
        String str = this.f4799i;
        if (str != null) {
            jSONObject.put("name", str);
            jSONObject.put("omit_response_on_success", this.f4801k);
        }
        String str2 = this.f4800j;
        if (str2 != null) {
            jSONObject.put("depends_on", str2);
        }
        String i = mo5964i();
        jSONObject.put("relative_url", i);
        jSONObject.put("method", this.f4796f);
        AccessToken accessToken = this.f4795e;
        if (accessToken != null) {
            C1459P.m6845c(accessToken.mo5894h());
        }
        ArrayList arrayList = new ArrayList();
        for (String str3 : this.f4802l.keySet()) {
            Object obj = this.f4802l.get(str3);
            if (m6537d(obj)) {
                String format = String.format(Locale.ROOT, "%s%d", new Object[]{"file", Integer.valueOf(map.size())});
                arrayList.add(format);
                map.put(format, new C1346a(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put("attached_files", TextUtils.join(",", arrayList));
        }
        if (this.f4798h != null) {
            ArrayList arrayList2 = new ArrayList();
            m6527a(this.f4798h, i, (C1349d) new C1338D(this, arrayList2));
            jSONObject.put("body", TextUtils.join("&", arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m6527a(org.json.JSONObject r6, java.lang.String r7, com.facebook.GraphRequest.C1349d r8) {
        /*
            boolean r0 = m6534b((java.lang.String) r7)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = ":"
            int r0 = r7.indexOf(r0)
            java.lang.String r3 = "?"
            int r7 = r7.indexOf(r3)
            r3 = 3
            if (r0 <= r3) goto L_0x001e
            r3 = -1
            if (r7 == r3) goto L_0x001c
            if (r0 >= r7) goto L_0x001e
        L_0x001c:
            r7 = r1
            goto L_0x001f
        L_0x001e:
            r7 = r2
        L_0x001f:
            java.util.Iterator r0 = r6.keys()
        L_0x0023:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0044
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r6.opt(r3)
            if (r7 == 0) goto L_0x003f
            java.lang.String r5 = "image"
            boolean r5 = r3.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x003f
            r5 = r1
            goto L_0x0040
        L_0x003f:
            r5 = r2
        L_0x0040:
            m6523a((java.lang.String) r3, (java.lang.Object) r4, (com.facebook.GraphRequest.C1349d) r8, (boolean) r5)
            goto L_0x0023
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.m6527a(org.json.JSONObject, java.lang.String, com.facebook.GraphRequest$d):void");
    }

    /* renamed from: b */
    public static C1340F m6529b(C1343G g) {
        C1484ca.m6984c(g, "requests");
        C1340F f = new C1340F(g);
        f.executeOnExecutor(C1601x.m7395h(), new Void[0]);
        return f;
    }

    /* renamed from: b */
    public static C1340F m6530b(Collection<GraphRequest> collection) {
        return m6529b(new C1343G(collection));
    }

    /* renamed from: b */
    public static C1340F m6531b(GraphRequest... graphRequestArr) {
        C1484ca.m6976a((Object) graphRequestArr, "requests");
        return m6530b((Collection<GraphRequest>) Arrays.asList(graphRequestArr));
    }

    /* renamed from: b */
    static final boolean m6533b(GraphRequest graphRequest) {
        String l = graphRequest.mo5967l();
        if (C1480ba.m6958b(l)) {
            return true;
        }
        if (l.startsWith("v")) {
            l = l.substring(1);
        }
        String[] split = l.split("\\.");
        if (split.length < 2 || Integer.parseInt(split[0]) <= 2) {
            return Integer.parseInt(split[0]) >= 2 && Integer.parseInt(split[1]) >= 4;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m6534b(String str) {
        Matcher matcher = f4793c.matcher(str);
        if (matcher.matches()) {
            str = matcher.group(1);
        }
        return str.startsWith("me/") || str.startsWith("/me/");
    }

    /* renamed from: c */
    public static HttpURLConnection m6535c(C1343G g) {
        m6536d(g);
        try {
            HttpURLConnection httpURLConnection = null;
            try {
                httpURLConnection = m6513a(g.size() == 1 ? new URL(g.get(0).mo5966k()) : new URL(C1472W.m6907c()));
                m6520a(g, httpURLConnection);
                return httpURLConnection;
            } catch (IOException | JSONException e) {
                C1480ba.m6945a((URLConnection) httpURLConnection);
                throw new C1574p("could not construct request body", e);
            }
        } catch (MalformedURLException e2) {
            throw new C1574p("could not construct URL for request", e2);
        }
    }

    /* renamed from: d */
    static final void m6536d(C1343G g) {
        Iterator it = g.iterator();
        while (it.hasNext()) {
            GraphRequest graphRequest = (GraphRequest) it.next();
            if (C1353I.GET.equals(graphRequest.mo5962g()) && m6533b(graphRequest)) {
                Bundle h = graphRequest.mo5963h();
                if (!h.containsKey("fields") || C1480ba.m6958b(h.getString("fields"))) {
                    C1459P.m6840a(C1355K.DEVELOPER_ERRORS, 5, "Request", "starting with Graph API v2.4, GET requests for /%s should contain an explicit \"fields\" parameter.", graphRequest.mo5961f());
                }
            }
        }
    }

    /* renamed from: d */
    private static boolean m6537d(Object obj) {
        return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof ParcelableResourceWithMimeType);
    }

    /* renamed from: e */
    private static String m6538e(C1343G g) {
        String a;
        if (!C1480ba.m6958b(g.mo5938e())) {
            return g.mo5938e();
        }
        Iterator it = g.iterator();
        while (it.hasNext()) {
            AccessToken accessToken = ((GraphRequest) it.next()).f4795e;
            if (accessToken != null && (a = accessToken.mo5886a()) != null) {
                return a;
            }
        }
        return !C1480ba.m6958b(f4792b) ? f4792b : C1601x.m7389c();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static boolean m6539e(Object obj) {
        return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static String m6540f(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if ((obj instanceof Boolean) || (obj instanceof Number)) {
            return obj.toString();
        }
        if (obj instanceof Date) {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format(obj);
        }
        throw new IllegalArgumentException("Unsupported parameter type.");
    }

    /* renamed from: f */
    private static boolean m6541f(C1343G g) {
        for (C1343G.C1344a aVar : g.mo5940g()) {
            if (aVar instanceof C1343G.C1345b) {
                return true;
            }
        }
        Iterator it = g.iterator();
        while (it.hasNext()) {
            if (((GraphRequest) it.next()).mo5959d() instanceof C1350e) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    private static boolean m6542g(C1343G g) {
        Iterator it = g.iterator();
        while (it.hasNext()) {
            GraphRequest graphRequest = (GraphRequest) it.next();
            Iterator it2 = graphRequest.f4802l.keySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (m6537d(graphRequest.f4802l.get((String) it2.next()))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007d  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6543m() {
        /*
            r4 = this;
            com.facebook.AccessToken r0 = r4.f4795e
            java.lang.String r1 = "access_token"
            if (r0 == 0) goto L_0x001d
            android.os.Bundle r0 = r4.f4802l
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x0059
            com.facebook.AccessToken r0 = r4.f4795e
            java.lang.String r0 = r0.mo5894h()
            com.facebook.internal.C1459P.m6845c(r0)
        L_0x0017:
            android.os.Bundle r2 = r4.f4802l
            r2.putString(r1, r0)
            goto L_0x0059
        L_0x001d:
            boolean r0 = r4.f4807q
            if (r0 != 0) goto L_0x0059
            android.os.Bundle r0 = r4.f4802l
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x0059
            java.lang.String r0 = com.facebook.C1601x.m7389c()
            java.lang.String r2 = com.facebook.C1601x.m7394g()
            boolean r3 = com.facebook.internal.C1480ba.m6958b((java.lang.String) r0)
            if (r3 != 0) goto L_0x0052
            boolean r3 = com.facebook.internal.C1480ba.m6958b((java.lang.String) r2)
            if (r3 != 0) goto L_0x0052
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "|"
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            goto L_0x0017
        L_0x0052:
            java.lang.String r0 = f4791a
            java.lang.String r1 = "Warning: Request without access token missing application ID or client token."
            android.util.Log.d(r0, r1)
        L_0x0059:
            android.os.Bundle r0 = r4.f4802l
            java.lang.String r1 = "sdk"
            java.lang.String r2 = "android"
            r0.putString(r1, r2)
            android.os.Bundle r0 = r4.f4802l
            java.lang.String r1 = "format"
            java.lang.String r2 = "json"
            r0.putString(r1, r2)
            com.facebook.K r0 = com.facebook.C1355K.GRAPH_API_DEBUG_INFO
            boolean r0 = com.facebook.C1601x.m7385a((com.facebook.C1355K) r0)
            java.lang.String r1 = "debug"
            if (r0 == 0) goto L_0x007d
            android.os.Bundle r0 = r4.f4802l
            java.lang.String r2 = "info"
        L_0x0079:
            r0.putString(r1, r2)
            goto L_0x008a
        L_0x007d:
            com.facebook.K r0 = com.facebook.C1355K.GRAPH_API_DEBUG_WARNING
            boolean r0 = com.facebook.C1601x.m7385a((com.facebook.C1355K) r0)
            if (r0 == 0) goto L_0x008a
            android.os.Bundle r0 = r4.f4802l
            java.lang.String r2 = "warning"
            goto L_0x0079
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.m6543m():void");
    }

    /* renamed from: n */
    private String m6544n() {
        if (f4793c.matcher(this.f4797g).matches()) {
            return this.f4797g;
        }
        return String.format("%s/%s", new Object[]{this.f4806p, this.f4797g});
    }

    /* renamed from: o */
    private static String m6545o() {
        return String.format("multipart/form-data; boundary=%s", new Object[]{"3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f"});
    }

    /* renamed from: p */
    private static String m6546p() {
        if (f4794d == null) {
            f4794d = String.format("%s.%s", new Object[]{"FBAndroidSDK", "4.19.0"});
            String a = C1456M.m6834a();
            if (!C1480ba.m6958b(a)) {
                f4794d = String.format(Locale.ROOT, "%s/%s", new Object[]{f4794d, a});
            }
        }
        return f4794d;
    }

    /* renamed from: a */
    public final C1352H mo5950a() {
        return m6511a(this);
    }

    /* renamed from: a */
    public final void mo5951a(Bundle bundle) {
        this.f4802l = bundle;
    }

    /* renamed from: a */
    public final void mo5952a(C1347b bVar) {
        if (C1601x.m7385a(C1355K.GRAPH_API_DEBUG_INFO) || C1601x.m7385a(C1355K.GRAPH_API_DEBUG_WARNING)) {
            this.f4803m = new C1336B(this, bVar);
        } else {
            this.f4803m = bVar;
        }
    }

    /* renamed from: a */
    public final void mo5953a(C1353I i) {
        if (this.f4804n == null || i == C1353I.GET) {
            if (i == null) {
                i = C1353I.GET;
            }
            this.f4796f = i;
            return;
        }
        throw new C1574p("Can't change HTTP method on request with overridden URL.");
    }

    /* renamed from: a */
    public final void mo5954a(JSONObject jSONObject) {
        this.f4798h = jSONObject;
    }

    /* renamed from: a */
    public final void mo5955a(boolean z) {
        this.f4807q = z;
    }

    /* renamed from: b */
    public final C1340F mo5956b() {
        return m6531b(this);
    }

    /* renamed from: c */
    public final AccessToken mo5957c() {
        return this.f4795e;
    }

    /* renamed from: c */
    public final void mo5958c(Object obj) {
        this.f4805o = obj;
    }

    /* renamed from: d */
    public final C1347b mo5959d() {
        return this.f4803m;
    }

    /* renamed from: e */
    public final JSONObject mo5960e() {
        return this.f4798h;
    }

    /* renamed from: f */
    public final String mo5961f() {
        return this.f4797g;
    }

    /* renamed from: g */
    public final C1353I mo5962g() {
        return this.f4796f;
    }

    /* renamed from: h */
    public final Bundle mo5963h() {
        return this.f4802l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final String mo5964i() {
        if (this.f4804n == null) {
            String format = String.format("%s/%s", new Object[]{C1472W.m6907c(), m6544n()});
            m6543m();
            Uri parse = Uri.parse(m6512a(format));
            return String.format("%s?%s", new Object[]{parse.getPath(), parse.getQuery()});
        }
        throw new C1574p("Can't override URL for a batch request");
    }

    /* renamed from: j */
    public final Object mo5965j() {
        return this.f4805o;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        r0 = r3.f4797g;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo5966k() {
        /*
            r3 = this;
            java.lang.String r0 = r3.f4804n
            if (r0 == 0) goto L_0x0009
            java.lang.String r0 = r0.toString()
            return r0
        L_0x0009:
            com.facebook.I r0 = r3.mo5962g()
            com.facebook.I r1 = com.facebook.C1353I.POST
            if (r0 != r1) goto L_0x0022
            java.lang.String r0 = r3.f4797g
            if (r0 == 0) goto L_0x0022
            java.lang.String r1 = "/videos"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L_0x0022
            java.lang.String r0 = com.facebook.internal.C1472W.m6908d()
            goto L_0x0026
        L_0x0022:
            java.lang.String r0 = com.facebook.internal.C1472W.m6907c()
        L_0x0026:
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 1
            java.lang.String r2 = r3.m6544n()
            r1[r0] = r2
            java.lang.String r0 = "%s/%s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r3.m6543m()
            java.lang.String r0 = r3.m6512a((java.lang.String) r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.mo5966k():java.lang.String");
    }

    /* renamed from: l */
    public final String mo5967l() {
        return this.f4806p;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{Request: ");
        sb.append(" accessToken: ");
        Object obj = this.f4795e;
        if (obj == null) {
            obj = "null";
        }
        sb.append(obj);
        sb.append(", graphPath: ");
        sb.append(this.f4797g);
        sb.append(", graphObject: ");
        sb.append(this.f4798h);
        sb.append(", httpMethod: ");
        sb.append(this.f4796f);
        sb.append(", parameters: ");
        sb.append(this.f4802l);
        sb.append("}");
        return sb.toString();
    }
}
