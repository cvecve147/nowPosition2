package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Du */
public abstract class C2271Du<T> {

    /* renamed from: a */
    private final int f6916a;

    /* renamed from: b */
    private final String f6917b;

    /* renamed from: c */
    private final T f6918c;

    private C2271Du(int i, String str, T t) {
        this.f6916a = i;
        this.f6917b = str;
        this.f6918c = t;
        C3390pt.m13457e().mo8383a(this);
    }

    /* synthetic */ C2271Du(int i, String str, Object obj, C2300Eu eu) {
        this(i, str, obj);
    }

    /* renamed from: a */
    public static C2271Du<String> m9659a(int i, String str) {
        C2271Du<String> a = m9664a(i, str, (String) null);
        C3390pt.m13457e().mo8385b(a);
        return a;
    }

    /* renamed from: a */
    public static C2271Du<Float> m9660a(int i, String str, float f) {
        return new C2386Hu(i, str, Float.valueOf(f));
    }

    /* renamed from: a */
    public static C2271Du<Integer> m9661a(int i, String str, int i2) {
        return new C2328Fu(i, str, Integer.valueOf(i2));
    }

    /* renamed from: a */
    public static C2271Du<Long> m9662a(int i, String str, long j) {
        return new C2358Gu(i, str, Long.valueOf(j));
    }

    /* renamed from: a */
    public static C2271Du<Boolean> m9663a(int i, String str, Boolean bool) {
        return new C2300Eu(i, str, bool);
    }

    /* renamed from: a */
    public static C2271Du<String> m9664a(int i, String str, String str2) {
        return new C2414Iu(i, str, str2);
    }

    /* renamed from: b */
    public static C2271Du<String> m9665b(int i, String str) {
        C2271Du<String> a = m9664a(i, str, (String) null);
        C3390pt.m13457e().mo8386c(a);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo8012a(SharedPreferences sharedPreferences);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo8013a(JSONObject jSONObject);

    /* renamed from: a */
    public final String mo8014a() {
        return this.f6917b;
    }

    /* renamed from: a */
    public abstract void mo8015a(SharedPreferences.Editor editor, T t);

    /* renamed from: b */
    public final int mo8016b() {
        return this.f6916a;
    }

    /* renamed from: c */
    public final T mo8017c() {
        return this.f6918c;
    }
}
