package com.facebook;

import com.facebook.GraphRequest;
import com.facebook.internal.C1459P;
import com.facebook.internal.C1480ba;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.B */
class C1336B implements GraphRequest.C1347b {

    /* renamed from: a */
    final /* synthetic */ GraphRequest.C1347b f4743a;

    /* renamed from: b */
    final /* synthetic */ GraphRequest f4744b;

    C1336B(GraphRequest graphRequest, GraphRequest.C1347b bVar) {
        this.f4744b = graphRequest;
        this.f4743a = bVar;
    }

    /* renamed from: a */
    public void mo5885a(C1352H h) {
        JSONObject b = h.mo5988b();
        JSONObject optJSONObject = b != null ? b.optJSONObject("__debug__") : null;
        JSONArray optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray("messages") : null;
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                String optString = optJSONObject2 != null ? optJSONObject2.optString("message") : null;
                String optString2 = optJSONObject2 != null ? optJSONObject2.optString(SVGParser.XML_STYLESHEET_ATTR_TYPE) : null;
                String optString3 = optJSONObject2 != null ? optJSONObject2.optString("link") : null;
                if (!(optString == null || optString2 == null)) {
                    C1355K k = C1355K.GRAPH_API_DEBUG_INFO;
                    if (optString2.equals("warning")) {
                        k = C1355K.GRAPH_API_DEBUG_WARNING;
                    }
                    if (!C1480ba.m6958b(optString3)) {
                        optString = optString + " Link: " + optString3;
                    }
                    C1459P.m6841a(k, GraphRequest.f4791a, optString);
                }
            }
        }
        GraphRequest.C1347b bVar = this.f4743a;
        if (bVar != null) {
            bVar.mo5885a(h);
        }
    }
}
