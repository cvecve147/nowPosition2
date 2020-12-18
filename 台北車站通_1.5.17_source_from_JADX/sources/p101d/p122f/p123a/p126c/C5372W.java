package p101d.p122f.p123a.p126c;

import android.content.Context;
import android.os.Bundle;

/* renamed from: d.f.a.c.W */
class C5372W implements C5430ma {

    /* renamed from: a */
    private final Context f15166a;

    /* renamed from: b */
    private final String f15167b;

    public C5372W(Context context, String str) {
        this.f15166a = context;
        this.f15167b = str;
    }

    /* renamed from: a */
    public String mo14803a() {
        try {
            Bundle bundle = this.f15166a.getPackageManager().getApplicationInfo(this.f15167b, 128).metaData;
            if (bundle != null) {
                return bundle.getString("io.fabric.unity.crashlytics.version");
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
