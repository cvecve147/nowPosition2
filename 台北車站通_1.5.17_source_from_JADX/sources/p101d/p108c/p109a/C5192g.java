package p101d.p108c.p109a;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;

/* renamed from: d.c.a.g */
public enum C5192g {
    START,
    CENTER,
    END;
    

    /* renamed from: d */
    private static final boolean f14580d = false;

    @SuppressLint({"RtlHardcoded"})
    /* renamed from: a */
    public int mo14355a() {
        int i = C5191f.f14576a[ordinal()];
        if (i == 1) {
            return f14580d ? 8388611 : 3;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return f14580d ? 8388613 : 5;
        }
        throw new IllegalStateException("Invalid gravity constant");
    }

    @TargetApi(17)
    /* renamed from: b */
    public int mo14356b() {
        int i = C5191f.f14576a[ordinal()];
        if (i != 2) {
            return i != 3 ? 5 : 6;
        }
        return 4;
    }
}
