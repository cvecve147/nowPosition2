package p208e.p209a.p210a.p211a.p212a.p215c;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: e.a.a.a.a.c.q */
public class C6128q implements C6118h<C6131s>, C6127p, C6131s {

    /* renamed from: a */
    private final List<C6131s> f17117a = new ArrayList();

    /* renamed from: b */
    private final AtomicBoolean f17118b = new AtomicBoolean(false);

    /* renamed from: c */
    private final AtomicReference<Throwable> f17119c = new AtomicReference<>((Object) null);

    /* renamed from: b */
    public static boolean m23183b(Object obj) {
        try {
            return (((C6118h) obj) == null || ((C6131s) obj) == null || ((C6127p) obj) == null) ? false : true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public synchronized void mo16115a(C6131s sVar) {
        this.f17117a.add(sVar);
    }

    /* renamed from: a */
    public void mo16140a(Throwable th) {
        this.f17119c.set(th);
    }

    /* renamed from: a */
    public synchronized void mo16142a(boolean z) {
        this.f17118b.set(z);
    }

    /* renamed from: a */
    public boolean mo16143a() {
        return this.f17118b.get();
    }

    /* renamed from: b */
    public boolean mo16116b() {
        for (C6131s a : mo16117c()) {
            if (!a.mo16143a()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public synchronized Collection<C6131s> mo16117c() {
        return Collections.unmodifiableCollection(this.f17117a);
    }

    public int compareTo(Object obj) {
        return C6121k.m23160a(this, obj);
    }

    /* renamed from: f */
    public C6121k mo14752f() {
        return C6121k.NORMAL;
    }
}
