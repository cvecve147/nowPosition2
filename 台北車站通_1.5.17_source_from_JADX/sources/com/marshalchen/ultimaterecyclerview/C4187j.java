package com.marshalchen.ultimaterecyclerview;

import android.view.ViewGroup;
import com.marshalchen.ultimaterecyclerview.p079b.C4166a;
import java.lang.Enum;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.marshalchen.ultimaterecyclerview.j */
public abstract class C4187j<E extends Enum<E>> extends C4195q<C4194p> {

    /* renamed from: o */
    private Map<E, C4166a> f12464o = new HashMap();

    /* renamed from: a */
    public <T extends C4166a> T mo11850a(E e) {
        return (C4166a) this.f12464o.get(e);
    }

    /* renamed from: a */
    public void mo346b(C4194p pVar, int i) {
        mo11853i(pVar.mo4040g()).mo11793a(pVar, i);
    }

    /* renamed from: a */
    public void mo11852a(E e, C4166a aVar) {
        this.f12464o.put(e, aVar);
    }

    /* renamed from: b */
    public int mo344b(int i) {
        return mo11855k(i).ordinal();
    }

    /* renamed from: b */
    public C4194p m16678b(ViewGroup viewGroup, int i) {
        return mo11853i(i).mo11792a(viewGroup);
    }

    /* renamed from: i */
    public <T extends C4166a> T mo11853i(int i) {
        return mo11850a(mo11854j(i));
    }

    /* renamed from: j */
    public abstract E mo11854j(int i);

    /* renamed from: k */
    public abstract E mo11855k(int i);
}
