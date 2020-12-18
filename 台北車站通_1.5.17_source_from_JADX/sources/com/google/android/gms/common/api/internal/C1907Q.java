package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1850a;
import com.google.android.gms.common.api.C1874i;

/* renamed from: com.google.android.gms.common.api.internal.Q */
public interface C1907Q {
    /* renamed from: a */
    <A extends C1850a.C1852b, T extends C1921c<? extends C1874i, A>> T mo7358a(T t);

    /* renamed from: a */
    void mo7359a(ConnectionResult connectionResult, C1850a<?> aVar, boolean z);

    /* renamed from: a */
    boolean mo7360a();

    /* renamed from: b */
    void mo7361b();

    void connect();

    /* renamed from: f */
    void mo7363f(int i);

    /* renamed from: j */
    void mo7364j(Bundle bundle);
}
