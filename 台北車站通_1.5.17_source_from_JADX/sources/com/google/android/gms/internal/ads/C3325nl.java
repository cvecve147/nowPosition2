package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.interfaces.ECPublicKey;

/* renamed from: com.google.android.gms.internal.ads.nl */
public final class C3325nl implements C2975bj {

    /* renamed from: a */
    private static final byte[] f9871a = new byte[0];

    /* renamed from: b */
    private final C3382pl f9872b;

    /* renamed from: c */
    private final String f9873c;

    /* renamed from: d */
    private final byte[] f9874d;

    /* renamed from: e */
    private final C3524ul f9875e;

    /* renamed from: f */
    private final C3268ll f9876f;

    public C3325nl(ECPublicKey eCPublicKey, byte[] bArr, String str, C3524ul ulVar, C3268ll llVar) {
        C3439rl.m13668a(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f9872b = new C3382pl(eCPublicKey);
        this.f9874d = bArr;
        this.f9873c = str;
        this.f9875e = ulVar;
        this.f9876f = llVar;
    }

    /* renamed from: a */
    public final byte[] mo7993a(byte[] bArr, byte[] bArr2) {
        C3410ql a = this.f9872b.mo9896a(this.f9873c, this.f9874d, bArr2, this.f9876f.mo8210a(), this.f9875e);
        byte[] a2 = this.f9876f.mo8211a(a.mo9937b()).mo8580a(bArr, f9871a);
        byte[] a3 = a.mo9936a();
        return ByteBuffer.allocate(a3.length + a2.length).put(a3).put(a2).array();
    }
}
