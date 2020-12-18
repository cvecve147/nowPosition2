package com.askey.taipeinavi.home;

import android.content.Context;
import com.askey.taipeinavi.R;
import com.askey.taipeinavi.home.HomeFragment;
import com.askey.taipeinavi.p058d.C1209c;
import com.askey.taipeinavi.p058d.C1212f;
import org.json.JSONException;
import org.json.JSONObject;
import p299tw.navin.navinmap.map.C7095d;

/* renamed from: com.askey.taipeinavi.home.G */
class C1220G implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f4413a;

    /* renamed from: b */
    final /* synthetic */ HomeFragment.C1228c f4414b;

    C1220G(HomeFragment.C1228c cVar, String str) {
        this.f4414b = cVar;
        this.f4413a = str;
    }

    public void run() {
        HomeActivity r;
        String a;
        HomeFragment.this.f4380a.mo17239m();
        String str = this.f4413a;
        if (str == null) {
            C1212f.m6034a((Context) HomeFragment.this.f4380a, HomeFragment.this.mo1341a((int) R.string.txt_gift_device_not_found));
        } else if (str.isEmpty()) {
            C1212f.m6040d(HomeFragment.this.f4380a);
        } else {
            try {
                JSONObject jSONObject = new JSONObject(this.f4413a);
                String string = jSONObject.getString(SVGParser.XML_STYLESHEET_ATTR_TYPE);
                char c = 65535;
                int hashCode = string.hashCode();
                if (hashCode != 107868) {
                    if (hashCode != 111178) {
                        if (hashCode == 3321850) {
                            if (string.equals("link")) {
                                c = 0;
                            }
                        }
                    } else if (string.equals("poi")) {
                        c = 2;
                    }
                } else if (string.equals("map")) {
                    c = 1;
                }
                if (c == 0) {
                    HomeFragment.this.f4381b.mo5579a(jSONObject.getString("url"), HomeFragment.this.mo1341a((int) R.string.btxt_gift));
                } else if (c == 1) {
                    HomeFragment.this.f4381b.mo5586c(jSONObject.getString("mapID"));
                } else if (c == 2) {
                    String string2 = jSONObject.getString("poi");
                    if (string2 != null) {
                        C1209c cVar = new C1209c(HomeFragment.this.mo1396i());
                        cVar.mo5514e("Poi");
                        C7095d b = cVar.mo5508b(string2);
                        cVar.mo17135a();
                        if (b != null) {
                            HomeFragment.this.f4381b.mo5582a(b);
                            return;
                        } else {
                            r = HomeFragment.this.f4380a;
                            a = HomeFragment.this.mo1341a((int) R.string.txt_gift_poi_not_found);
                        }
                    } else {
                        r = HomeFragment.this.f4380a;
                        a = HomeFragment.this.mo1341a((int) R.string.txt_gift_poi_not_found);
                    }
                    C1212f.m6034a((Context) r, a);
                }
            } catch (JSONException e) {
                e.printStackTrace();
                C1212f.m6034a((Context) HomeFragment.this.f4380a, HomeFragment.this.mo1341a((int) R.string.txt_gift_connect_failed));
            }
        }
    }
}
