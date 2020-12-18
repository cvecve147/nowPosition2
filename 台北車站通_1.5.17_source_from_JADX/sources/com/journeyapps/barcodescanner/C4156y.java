package com.journeyapps.barcodescanner;

import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;
import p101d.p129g.p159f.C5743a;
import p101d.p129g.p159f.C5806e;
import p101d.p129g.p159f.C5861h;

/* renamed from: com.journeyapps.barcodescanner.y */
public class C4156y implements C4151t {

    /* renamed from: a */
    private Collection<C5743a> f12345a;

    /* renamed from: b */
    private Map<C5806e, ?> f12346b;

    /* renamed from: c */
    private String f12347c;

    public C4156y() {
    }

    public C4156y(Collection<C5743a> collection, Map<C5806e, ?> map, String str) {
        this.f12345a = collection;
        this.f12346b = map;
        this.f12347c = str;
    }

    /* renamed from: a */
    public C4150s mo11734a(Map<C5806e, ?> map) {
        EnumMap enumMap = new EnumMap(C5806e.class);
        enumMap.putAll(map);
        Map<C5806e, ?> map2 = this.f12346b;
        if (map2 != null) {
            enumMap.putAll(map2);
        }
        Collection<C5743a> collection = this.f12345a;
        if (collection != null) {
            enumMap.put(C5806e.POSSIBLE_FORMATS, collection);
        }
        String str = this.f12347c;
        if (str != null) {
            enumMap.put(C5806e.CHARACTER_SET, str);
        }
        C5861h hVar = new C5861h();
        hVar.mo15565a((Map<C5806e, ?>) enumMap);
        return new C4150s(hVar);
    }
}
