package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2838Xl;
import com.google.android.gms.internal.ads.C2866Yl;

/* renamed from: com.google.android.gms.internal.ads.Yl */
public abstract class C2866Yl<MessageType extends C2838Xl<MessageType, BuilderType>, BuilderType extends C2866Yl<MessageType, BuilderType>> implements C3528un {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract BuilderType mo8624a(MessageType messagetype);

    /* renamed from: a */
    public final /* synthetic */ C3528un mo9074a(C3498tn tnVar) {
        if (mo8614d().getClass().isInstance(tnVar)) {
            mo8624a((C2838Xl) tnVar);
            return this;
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
