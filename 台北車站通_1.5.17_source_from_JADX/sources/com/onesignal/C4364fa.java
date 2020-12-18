package com.onesignal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.onesignal.fa */
class C4364fa {

    /* renamed from: a */
    public String f12888a;

    /* renamed from: b */
    public HashMap<String, HashMap<String, String>> f12889b;

    /* renamed from: c */
    public ArrayList<ArrayList<C4236Ea>> f12890c;

    /* renamed from: d */
    private double f12891d;

    /* renamed from: e */
    private boolean f12892e;

    /* renamed from: f */
    boolean f12893f;

    C4364fa(JSONObject jSONObject) {
        this.f12888a = jSONObject.getString("id");
        this.f12889b = m17340a(jSONObject.getJSONObject("variants"));
        this.f12890c = mo12497a(jSONObject.getJSONArray("triggers"));
    }

    C4364fa(boolean z) {
        this.f12893f = z;
    }

    /* renamed from: a */
    private static HashMap<String, HashMap<String, String>> m17340a(JSONObject jSONObject) {
        HashMap<String, HashMap<String, String>> hashMap = new HashMap<>();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
            HashMap hashMap2 = new HashMap();
            Iterator<String> keys2 = jSONObject2.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                hashMap2.put(next2, jSONObject2.getString(next2));
            }
            hashMap.put(next, hashMap2);
        }
        return hashMap;
    }

    /* renamed from: a */
    public double mo12496a() {
        return this.f12891d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<ArrayList<C4236Ea>> mo12497a(JSONArray jSONArray) {
        ArrayList<ArrayList<C4236Ea>> arrayList = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i);
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                arrayList2.add(new C4236Ea(jSONArray2.getJSONObject(i2)));
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo12498a(double d) {
        this.f12891d = d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo12499b() {
        if (this.f12892e) {
            return false;
        }
        this.f12892e = true;
        return true;
    }

    public String toString() {
        return "OSInAppMessage{messageId='" + this.f12888a + '\'' + ", variants=" + this.f12889b + ", triggers=" + this.f12890c + ", displayDuration=" + this.f12891d + ", actionTaken=" + this.f12892e + '}';
    }
}
