package com.facebook;

/* renamed from: com.facebook.o */
public class C1573o extends C1574p {

    /* renamed from: a */
    private int f5354a;

    /* renamed from: b */
    private String f5355b;

    public C1573o(String str, int i, String str2) {
        super(str);
        this.f5354a = i;
        this.f5355b = str2;
    }

    /* renamed from: a */
    public int mo6401a() {
        return this.f5354a;
    }

    /* renamed from: b */
    public String mo6402b() {
        return this.f5355b;
    }

    public final String toString() {
        return "{FacebookDialogException: " + "errorCode: " + mo6401a() + ", message: " + getMessage() + ", url: " + mo6402b() + "}";
    }
}
