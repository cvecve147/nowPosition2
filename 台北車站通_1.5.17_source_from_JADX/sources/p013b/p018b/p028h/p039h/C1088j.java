package p013b.p018b.p028h.p039h;

import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: b.b.h.h.j */
public class C1088j<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f4055a;

    /* renamed from: b */
    private int f4056b;

    /* renamed from: c */
    private int f4057c;

    /* renamed from: d */
    private int f4058d;

    /* renamed from: e */
    private int f4059e;

    /* renamed from: f */
    private int f4060f;

    /* renamed from: g */
    private int f4061g;

    /* renamed from: h */
    private int f4062h;

    public C1088j(int i) {
        if (i > 0) {
            this.f4057c = i;
            this.f4055a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: c */
    private int m5652c(K k, V v) {
        int b = mo5160b(k, v);
        if (b >= 0) {
            return b;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public V mo5156a(K k) {
        return null;
    }

    /* renamed from: a */
    public final V mo5157a(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f4058d++;
            this.f4056b += m5652c(k, v);
            put = this.f4055a.put(k, v);
            if (put != null) {
                this.f4056b -= m5652c(k, put);
            }
        }
        if (put != null) {
            mo5159a(false, k, put, v);
        }
        mo5158a(this.f4057c);
        return put;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5158a(int r5) {
        /*
            r4 = this;
        L_0x0000:
            monitor-enter(r4)
            int r0 = r4.f4056b     // Catch:{ all -> 0x0071 }
            if (r0 < 0) goto L_0x0052
            java.util.LinkedHashMap<K, V> r0 = r4.f4055a     // Catch:{ all -> 0x0071 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x0011
            int r0 = r4.f4056b     // Catch:{ all -> 0x0071 }
            if (r0 != 0) goto L_0x0052
        L_0x0011:
            int r0 = r4.f4056b     // Catch:{ all -> 0x0071 }
            if (r0 <= r5) goto L_0x0050
            java.util.LinkedHashMap<K, V> r0 = r4.f4055a     // Catch:{ all -> 0x0071 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x001e
            goto L_0x0050
        L_0x001e:
            java.util.LinkedHashMap<K, V> r0 = r4.f4055a     // Catch:{ all -> 0x0071 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0071 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0071 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0071 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0071 }
            java.util.LinkedHashMap<K, V> r2 = r4.f4055a     // Catch:{ all -> 0x0071 }
            r2.remove(r1)     // Catch:{ all -> 0x0071 }
            int r2 = r4.f4056b     // Catch:{ all -> 0x0071 }
            int r3 = r4.m5652c(r1, r0)     // Catch:{ all -> 0x0071 }
            int r2 = r2 - r3
            r4.f4056b = r2     // Catch:{ all -> 0x0071 }
            int r2 = r4.f4060f     // Catch:{ all -> 0x0071 }
            r3 = 1
            int r2 = r2 + r3
            r4.f4060f = r2     // Catch:{ all -> 0x0071 }
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            r2 = 0
            r4.mo5159a(r3, r1, r0, r2)
            goto L_0x0000
        L_0x0050:
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            return
        L_0x0052:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0071 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
            r0.<init>()     // Catch:{ all -> 0x0071 }
            java.lang.Class r1 = r4.getClass()     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0071 }
            r0.append(r1)     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0071 }
            r5.<init>(r0)     // Catch:{ all -> 0x0071 }
            throw r5     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p018b.p028h.p039h.C1088j.mo5158a(int):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5159a(boolean z, K k, V v, V v2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo5160b(K k, V v) {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        r0 = mo5156a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r4.f4059e++;
        r1 = r4.f4055a.put(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r1 == null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        r4.f4055a.put(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        r4.f4056b += m5652c(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        if (r1 == null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        mo5159a(false, r5, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        mo5158a(r4.f4057c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
        return r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V mo5161b(K r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0054
            monitor-enter(r4)
            java.util.LinkedHashMap<K, V> r0 = r4.f4055a     // Catch:{ all -> 0x0051 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0051 }
            if (r0 == 0) goto L_0x0013
            int r5 = r4.f4061g     // Catch:{ all -> 0x0051 }
            int r5 = r5 + 1
            r4.f4061g = r5     // Catch:{ all -> 0x0051 }
            monitor-exit(r4)     // Catch:{ all -> 0x0051 }
            return r0
        L_0x0013:
            int r0 = r4.f4062h     // Catch:{ all -> 0x0051 }
            int r0 = r0 + 1
            r4.f4062h = r0     // Catch:{ all -> 0x0051 }
            monitor-exit(r4)     // Catch:{ all -> 0x0051 }
            java.lang.Object r0 = r4.mo5156a(r5)
            if (r0 != 0) goto L_0x0022
            r5 = 0
            return r5
        L_0x0022:
            monitor-enter(r4)
            int r1 = r4.f4059e     // Catch:{ all -> 0x004e }
            int r1 = r1 + 1
            r4.f4059e = r1     // Catch:{ all -> 0x004e }
            java.util.LinkedHashMap<K, V> r1 = r4.f4055a     // Catch:{ all -> 0x004e }
            java.lang.Object r1 = r1.put(r5, r0)     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x0037
            java.util.LinkedHashMap<K, V> r2 = r4.f4055a     // Catch:{ all -> 0x004e }
            r2.put(r5, r1)     // Catch:{ all -> 0x004e }
            goto L_0x0040
        L_0x0037:
            int r2 = r4.f4056b     // Catch:{ all -> 0x004e }
            int r3 = r4.m5652c(r5, r0)     // Catch:{ all -> 0x004e }
            int r2 = r2 + r3
            r4.f4056b = r2     // Catch:{ all -> 0x004e }
        L_0x0040:
            monitor-exit(r4)     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x0048
            r2 = 0
            r4.mo5159a(r2, r5, r0, r1)
            return r1
        L_0x0048:
            int r5 = r4.f4057c
            r4.mo5158a((int) r5)
            return r0
        L_0x004e:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x004e }
            throw r5
        L_0x0051:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0051 }
            throw r5
        L_0x0054:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "key == null"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p018b.p028h.p039h.C1088j.mo5161b(java.lang.Object):java.lang.Object");
    }

    public final synchronized String toString() {
        int i;
        i = this.f4061g + this.f4062h;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f4057c), Integer.valueOf(this.f4061g), Integer.valueOf(this.f4062h), Integer.valueOf(i != 0 ? (this.f4061g * 100) / i : 0)});
    }
}
