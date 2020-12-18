package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Wd */
public final class C2802Wd {

    /* renamed from: a */
    private static final Comparator<byte[]> f8525a = new C3575we();

    /* renamed from: b */
    private final List<byte[]> f8526b = new LinkedList();

    /* renamed from: c */
    private final List<byte[]> f8527c = new ArrayList(64);

    /* renamed from: d */
    private int f8528d = 0;

    /* renamed from: e */
    private final int f8529e = SVGParser.ENTITY_WATCH_BUFFER_SIZE;

    public C2802Wd(int i) {
    }

    /* renamed from: a */
    private final synchronized void m11491a() {
        while (this.f8528d > this.f8529e) {
            byte[] remove = this.f8526b.remove(0);
            this.f8527c.remove(remove);
            this.f8528d -= remove.length;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo8992a(byte[] r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L_0x002e
            int r0 = r3.length     // Catch:{ all -> 0x002b }
            int r1 = r2.f8529e     // Catch:{ all -> 0x002b }
            if (r0 <= r1) goto L_0x0009
            goto L_0x002e
        L_0x0009:
            java.util.List<byte[]> r0 = r2.f8526b     // Catch:{ all -> 0x002b }
            r0.add(r3)     // Catch:{ all -> 0x002b }
            java.util.List<byte[]> r0 = r2.f8527c     // Catch:{ all -> 0x002b }
            java.util.Comparator<byte[]> r1 = f8525a     // Catch:{ all -> 0x002b }
            int r0 = java.util.Collections.binarySearch(r0, r3, r1)     // Catch:{ all -> 0x002b }
            if (r0 >= 0) goto L_0x001b
            int r0 = -r0
            int r0 = r0 + -1
        L_0x001b:
            java.util.List<byte[]> r1 = r2.f8527c     // Catch:{ all -> 0x002b }
            r1.add(r0, r3)     // Catch:{ all -> 0x002b }
            int r0 = r2.f8528d     // Catch:{ all -> 0x002b }
            int r3 = r3.length     // Catch:{ all -> 0x002b }
            int r0 = r0 + r3
            r2.f8528d = r0     // Catch:{ all -> 0x002b }
            r2.m11491a()     // Catch:{ all -> 0x002b }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2802Wd.mo8992a(byte[]):void");
    }

    /* renamed from: a */
    public final synchronized byte[] mo8993a(int i) {
        for (int i2 = 0; i2 < this.f8527c.size(); i2++) {
            byte[] bArr = this.f8527c.get(i2);
            if (bArr.length >= i) {
                this.f8528d -= bArr.length;
                this.f8527c.remove(i2);
                this.f8526b.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }
}
