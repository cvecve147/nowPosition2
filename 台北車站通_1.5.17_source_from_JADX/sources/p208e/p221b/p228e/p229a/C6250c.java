package p208e.p221b.p228e.p229a;

import p208e.p221b.C6438q;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p228e.p231c.C6274e;

/* renamed from: e.b.e.a.c */
public enum C6250c implements C6274e<Object> {
    INSTANCE,
    NEVER;

    /* renamed from: a */
    public static void m23565a(C6438q<?> qVar) {
        qVar.mo13383a((C6223b) INSTANCE);
        qVar.mo13343c();
    }

    /* renamed from: a */
    public static void m23566a(Throwable th, C6438q<?> qVar) {
        qVar.mo13383a((C6223b) INSTANCE);
        qVar.mo13342a(th);
    }

    /* renamed from: a */
    public int mo16357a(int i) {
        return i & 2;
    }

    /* renamed from: a */
    public void mo15709a() {
    }

    public void clear() {
    }

    public boolean isEmpty() {
        return true;
    }

    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public Object poll() {
        return null;
    }
}
