package p101d.p119e.p120a.p121a;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: d.e.a.a.c */
public class C5251c {

    /* renamed from: a */
    protected static final Comparator<byte[]> f14872a = new C5250b();

    /* renamed from: b */
    private List<byte[]> f14873b = new LinkedList();

    /* renamed from: c */
    private List<byte[]> f14874c = new ArrayList(64);

    /* renamed from: d */
    private int f14875d = 0;

    /* renamed from: e */
    private final int f14876e;

    public C5251c(int i) {
        this.f14876e = i;
    }

    /* renamed from: a */
    private synchronized void m20334a() {
        while (this.f14875d > this.f14876e) {
            byte[] remove = this.f14873b.remove(0);
            this.f14874c.remove(remove);
            this.f14875d -= remove.length;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo14574a(byte[] r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L_0x002e
            int r0 = r3.length     // Catch:{ all -> 0x002b }
            int r1 = r2.f14876e     // Catch:{ all -> 0x002b }
            if (r0 <= r1) goto L_0x0009
            goto L_0x002e
        L_0x0009:
            java.util.List<byte[]> r0 = r2.f14873b     // Catch:{ all -> 0x002b }
            r0.add(r3)     // Catch:{ all -> 0x002b }
            java.util.List<byte[]> r0 = r2.f14874c     // Catch:{ all -> 0x002b }
            java.util.Comparator<byte[]> r1 = f14872a     // Catch:{ all -> 0x002b }
            int r0 = java.util.Collections.binarySearch(r0, r3, r1)     // Catch:{ all -> 0x002b }
            if (r0 >= 0) goto L_0x001b
            int r0 = -r0
            int r0 = r0 + -1
        L_0x001b:
            java.util.List<byte[]> r1 = r2.f14874c     // Catch:{ all -> 0x002b }
            r1.add(r0, r3)     // Catch:{ all -> 0x002b }
            int r0 = r2.f14875d     // Catch:{ all -> 0x002b }
            int r3 = r3.length     // Catch:{ all -> 0x002b }
            int r0 = r0 + r3
            r2.f14875d = r0     // Catch:{ all -> 0x002b }
            r2.m20334a()     // Catch:{ all -> 0x002b }
            monitor-exit(r2)
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x002e:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p119e.p120a.p121a.C5251c.mo14574a(byte[]):void");
    }

    /* renamed from: a */
    public synchronized byte[] mo14575a(int i) {
        for (int i2 = 0; i2 < this.f14874c.size(); i2++) {
            byte[] bArr = this.f14874c.get(i2);
            if (bArr.length >= i) {
                this.f14875d -= bArr.length;
                this.f14874c.remove(i2);
                this.f14873b.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }
}
