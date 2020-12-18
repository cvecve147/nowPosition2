package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.C1718E;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.bz */
public final class C2992bz implements C3281ly, C2963az {

    /* renamed from: a */
    private final C2934_y f8983a;

    /* renamed from: b */
    private final HashSet<AbstractMap.SimpleEntry<String, C1718E<? super C2934_y>>> f8984b = new HashSet<>();

    public C2992bz(C2934_y _yVar) {
        this.f8983a = _yVar;
    }

    /* renamed from: a */
    public final void mo7966a(String str) {
        this.f8983a.mo7966a(str);
    }

    /* renamed from: a */
    public final void mo9185a(String str, C1718E<? super C2934_y> e) {
        this.f8983a.mo9185a(str, e);
        this.f8984b.remove(new AbstractMap.SimpleEntry(str, e));
    }

    /* renamed from: a */
    public final void mo9270a(String str, String str2) {
        C3309my.m13109a((C3281ly) this, str, str2);
    }

    /* renamed from: a */
    public final void mo8149a(String str, Map map) {
        C3309my.m13110a((C3281ly) this, str, map);
    }

    /* renamed from: a */
    public final void mo8150a(String str, JSONObject jSONObject) {
        C3309my.m13112b(this, str, jSONObject);
    }

    /* renamed from: b */
    public final void mo9202b() {
        Iterator<AbstractMap.SimpleEntry<String, C1718E<? super C2934_y>>> it = this.f8984b.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry next = it.next();
            String valueOf = String.valueOf(((C1718E) next.getValue()).toString());
            C2857Yd.m11615f(valueOf.length() != 0 ? "Unregistering eventhandler: ".concat(valueOf) : new String("Unregistering eventhandler: "));
            this.f8983a.mo9185a((String) next.getKey(), (C1718E) next.getValue());
        }
        this.f8984b.clear();
    }

    /* renamed from: b */
    public final void mo9186b(String str, C1718E<? super C2934_y> e) {
        this.f8983a.mo9186b(str, e);
        this.f8984b.add(new AbstractMap.SimpleEntry(str, e));
    }

    /* renamed from: b */
    public final void mo7967b(String str, JSONObject jSONObject) {
        C3309my.m13111a((C3281ly) this, str, jSONObject);
    }
}
