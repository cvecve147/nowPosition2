package com.google.firebase.iid;

import android.support.annotation.Keep;
import com.google.firebase.components.C4030a;
import com.google.firebase.components.C4034d;
import com.google.firebase.components.C4035e;
import com.google.firebase.components.C4036f;
import com.google.firebase.iid.p076a.C4070a;
import java.util.Arrays;
import java.util.List;
import p101d.p129g.p149d.C5574a;

@Keep
public final class Registrar implements C4035e {

    /* renamed from: com.google.firebase.iid.Registrar$a */
    private static class C4068a implements C4070a {

        /* renamed from: a */
        private final FirebaseInstanceId f12073a;

        public C4068a(FirebaseInstanceId firebaseInstanceId) {
            this.f12073a = firebaseInstanceId;
        }
    }

    @Keep
    public final List<C4030a<?>> getComponents() {
        C4030a.C4031a<FirebaseInstanceId> a = C4030a.m16179a(FirebaseInstanceId.class);
        a.mo11433a(C4036f.m16195a(C5574a.class));
        a.mo11432a((C4034d<FirebaseInstanceId>) C4075f.f12084a);
        a.mo11431a();
        C4030a<FirebaseInstanceId> b = a.mo11434b();
        C4030a.C4031a<C4070a> a2 = C4030a.m16179a(C4070a.class);
        a2.mo11433a(C4036f.m16195a(FirebaseInstanceId.class));
        a2.mo11432a((C4034d<C4070a>) C4076g.f12085a);
        return Arrays.asList(new C4030a[]{b, a2.mo11434b()});
    }
}
