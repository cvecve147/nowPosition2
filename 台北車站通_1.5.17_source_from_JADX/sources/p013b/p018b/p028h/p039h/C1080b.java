package p013b.p018b.p028h.p039h;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: b.b.h.h.b */
public class C1080b<K, V> extends C1101r<K, V> implements Map<K, V> {

    /* renamed from: h */
    C1089k<K, V> f4031h;

    public C1080b() {
    }

    public C1080b(int i) {
        super(i);
    }

    public C1080b(C1101r rVar) {
        super(rVar);
    }

    /* renamed from: b */
    private C1089k<K, V> m5608b() {
        if (this.f4031h == null) {
            this.f4031h = new C1079a(this);
        }
        return this.f4031h;
    }

    /* renamed from: a */
    public boolean mo5113a(Collection<?> collection) {
        return C1089k.m5662c(this, collection);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return m5608b().mo5165d();
    }

    public Set<K> keySet() {
        return m5608b().mo5166e();
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo5233a(this.f4089g + map.size());
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public Collection<V> values() {
        return m5608b().mo5167f();
    }
}
