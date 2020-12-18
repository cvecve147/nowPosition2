package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.ef */
public final class C3058ef {

    /* renamed from: a */
    private Map<Integer, Bitmap> f9099a = new ConcurrentHashMap();

    /* renamed from: b */
    private AtomicInteger f9100b = new AtomicInteger(0);

    /* renamed from: a */
    public final int mo9380a(Bitmap bitmap) {
        if (bitmap == null) {
            C2227Cf.m9532b("Bitmap is null. Skipping putting into the Memory Map.");
            return -1;
        }
        int andIncrement = this.f9100b.getAndIncrement();
        this.f9099a.put(Integer.valueOf(andIncrement), bitmap);
        return andIncrement;
    }

    /* renamed from: a */
    public final Bitmap mo9381a(Integer num) {
        return this.f9099a.get(num);
    }

    /* renamed from: b */
    public final void mo9382b(Integer num) {
        this.f9099a.remove(num);
    }
}
