package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Pn */
final class C2614Pn extends C2583On<FieldDescriptorType, Object> {
    C2614Pn(int i) {
        super(i, (C2614Pn) null);
    }

    /* renamed from: b */
    public final void mo8633b() {
        if (!mo8631a()) {
            for (int i = 0; i < mo8634c(); i++) {
                Map.Entry b = mo8632b(i);
                if (((C2406Im) b.getKey()).mo8343g()) {
                    b.setValue(Collections.unmodifiableList((List) b.getValue()));
                }
            }
            for (Map.Entry entry : mo8637d()) {
                if (((C2406Im) entry.getKey()).mo8343g()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo8633b();
    }
}
