package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.internal.C1939j;
import com.google.android.gms.common.internal.C2061y;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.k */
public class C1944k {

    /* renamed from: a */
    private final Set<C1939j<?>> f6282a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: a */
    public static <L> C1939j.C1940a<L> m8612a(L l, String str) {
        C2061y.m9068a(l, (Object) "Listener must not be null");
        C2061y.m9068a(str, (Object) "Listener type must not be null");
        C2061y.m9069a(str, (Object) "Listener type must not be empty");
        return new C1939j.C1940a<>(l, str);
    }

    /* renamed from: a */
    public static <L> C1939j<L> m8613a(L l, Looper looper, String str) {
        C2061y.m9068a(l, (Object) "Listener must not be null");
        C2061y.m9068a(looper, (Object) "Looper must not be null");
        C2061y.m9068a(str, (Object) "Listener type must not be null");
        return new C1939j<>(looper, l, str);
    }

    /* renamed from: a */
    public final void mo7463a() {
        for (C1939j<?> a : this.f6282a) {
            a.mo7451a();
        }
        this.f6282a.clear();
    }
}
