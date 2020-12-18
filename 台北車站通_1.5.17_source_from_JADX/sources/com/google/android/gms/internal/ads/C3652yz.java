package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yz */
public final class C3652yz<T> {

    /* renamed from: a */
    public final T f10632a;

    /* renamed from: b */
    public final C3471sp f10633b;

    /* renamed from: c */
    public final C3024db f10634c;

    /* renamed from: d */
    public boolean f10635d;

    private C3652yz(C3024db dbVar) {
        this.f10635d = false;
        this.f10632a = null;
        this.f10633b = null;
        this.f10634c = dbVar;
    }

    private C3652yz(T t, C3471sp spVar) {
        this.f10635d = false;
        this.f10632a = t;
        this.f10633b = spVar;
        this.f10634c = null;
    }

    /* renamed from: a */
    public static <T> C3652yz<T> m14675a(C3024db dbVar) {
        return new C3652yz<>(dbVar);
    }

    /* renamed from: a */
    public static <T> C3652yz<T> m14676a(T t, C3471sp spVar) {
        return new C3652yz<>(t, spVar);
    }
}
