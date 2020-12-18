package com.askey.taipeinavi.parking;

import android.util.Log;
import p101d.p191i.p192a.p193a.C5975w;
import p101d.p191i.p192a.p200e.C6019c;

/* renamed from: com.askey.taipeinavi.parking.d */
class C1273d implements C5975w.C5976a {

    /* renamed from: a */
    final /* synthetic */ STOMapActivity f4525a;

    C1273d(STOMapActivity sTOMapActivity) {
        this.f4525a = sTOMapActivity;
    }

    /* renamed from: a */
    public void mo5625a() {
        Log.d(STOMapActivity.f4513d, "onMapIn");
    }

    /* renamed from: a */
    public void mo5626a(C6019c cVar) {
        String m = STOMapActivity.f4513d;
        Log.d(m, "onPositionChanged: " + cVar.mo15922g());
    }

    /* renamed from: a */
    public void mo5627a(Boolean bool) {
        String m = STOMapActivity.f4513d;
        Log.d(m, "onPlaceCheck: " + bool);
    }

    /* renamed from: a */
    public void mo5628a(String str) {
        Log.d(STOMapActivity.f4513d, "onError");
    }

    /* renamed from: b */
    public void mo5629b() {
        Log.d(STOMapActivity.f4513d, "onMapOut");
    }

    /* renamed from: b */
    public void mo5630b(C6019c cVar) {
        Log.d(STOMapActivity.f4513d, "onNavigation");
    }
}
