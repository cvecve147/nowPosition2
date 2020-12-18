package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.wf */
final /* synthetic */ class C3576wf implements C2199Bf {

    /* renamed from: a */
    private final String f10431a;

    /* renamed from: b */
    private final String f10432b;

    /* renamed from: c */
    private final Map f10433c;

    /* renamed from: d */
    private final byte[] f10434d;

    C3576wf(String str, String str2, Map map, byte[] bArr) {
        this.f10431a = str;
        this.f10432b = str2;
        this.f10433c = map;
        this.f10434d = bArr;
    }

    /* renamed from: a */
    public final void mo7817a(JsonWriter jsonWriter) {
        C3548vf.m14220a(this.f10431a, this.f10432b, this.f10433c, this.f10434d, jsonWriter);
    }
}
