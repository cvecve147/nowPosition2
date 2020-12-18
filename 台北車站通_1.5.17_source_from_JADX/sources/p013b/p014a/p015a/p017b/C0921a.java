package p013b.p014a.p015a.p017b;

import java.util.HashMap;
import p013b.p014a.p015a.p017b.C0923c;

/* renamed from: b.a.a.b.a */
public class C0921a<K, V> extends C0923c<K, V> {

    /* renamed from: e */
    private HashMap<K, C0923c.C0926c<K, V>> f3730e = new HashMap<>();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0923c.C0926c<K, V> mo4798a(K k) {
        return this.f3730e.get(k);
    }

    public boolean contains(K k) {
        return this.f3730e.containsKey(k);
    }

    public V remove(K k) {
        V remove = super.remove(k);
        this.f3730e.remove(k);
        return remove;
    }
}
