package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.Io */
public abstract class C2408Io {

    /* renamed from: a */
    protected volatile int f7295a = -1;

    /* renamed from: a */
    public static final <T extends C2408Io> T m10308a(T t, byte[] bArr) {
        m10309a(t, bArr, 0, bArr.length);
        return t;
    }

    /* renamed from: a */
    private static final <T extends C2408Io> T m10309a(T t, byte[] bArr, int i, int i2) {
        try {
            C3641yo a = C3641yo.m14599a(bArr, 0, i2);
            t.mo7847a(a);
            a.mo10235a(0);
            return t;
        } catch (C2380Ho e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e2);
        }
    }

    /* renamed from: a */
    public static final byte[] m10310a(C2408Io io) {
        byte[] bArr = new byte[io.mo8362a()];
        try {
            C2180Ao a = C2180Ao.m9370a(bArr, 0, bArr.length);
            io.mo7848a(a);
            a.mo7830a();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    /* renamed from: a */
    public final int mo8362a() {
        int c = mo7849c();
        this.f7295a = c;
        return c;
    }

    /* renamed from: a */
    public abstract C2408Io mo7847a(C3641yo yoVar);

    /* renamed from: a */
    public void mo7848a(C2180Ao ao) {
    }

    /* renamed from: b */
    public C2408Io clone() {
        return (C2408Io) super.clone();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo7849c() {
        return 0;
    }

    public String toString() {
        return C2436Jo.m10357a(this);
    }
}
