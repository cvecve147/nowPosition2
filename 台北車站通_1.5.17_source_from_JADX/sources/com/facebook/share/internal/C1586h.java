package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.C1574p;
import com.facebook.internal.C1480ba;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.h */
public class C1586h {
    /* renamed from: a */
    public static Bundle m7353a(ShareContent shareContent) {
        Bundle bundle = new Bundle();
        ShareHashtag b = shareContent.mo6419b();
        if (b != null) {
            C1480ba.m6938a(bundle, "hashtag", b.mo6422a());
        }
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m7354a(ShareLinkContent shareLinkContent) {
        Bundle a = m7353a((ShareContent) shareLinkContent);
        C1480ba.m6937a(a, SVGParser.XML_STYLESHEET_ATTR_HREF, shareLinkContent.mo6418a());
        C1480ba.m6938a(a, "quote", shareLinkContent.mo6429c());
        return a;
    }

    /* renamed from: a */
    public static Bundle m7355a(ShareOpenGraphContent shareOpenGraphContent) {
        Bundle a = m7353a((ShareContent) shareOpenGraphContent);
        C1480ba.m6938a(a, "action_type", shareOpenGraphContent.mo6436c().mo6431c());
        try {
            JSONObject a2 = C1585g.m7352a(C1585g.m7351a(shareOpenGraphContent), false);
            if (a2 != null) {
                C1480ba.m6938a(a, "action_properties", a2.toString());
            }
            return a;
        } catch (JSONException e) {
            throw new C1574p("Unable to serialize the ShareOpenGraphContent to JSON", e);
        }
    }
}
