package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C1850a;
import com.google.android.gms.common.api.C1874i;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: com.google.android.gms.common.api.internal.ea */
public interface C1929ea {
    /* renamed from: a */
    <A extends C1850a.C1852b, T extends C1921c<? extends C1874i, A>> T mo7346a(T t);

    /* renamed from: a */
    void mo7347a();

    /* renamed from: a */
    void mo7348a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: b */
    void mo7349b();

    void connect();

    boolean isConnected();
}
