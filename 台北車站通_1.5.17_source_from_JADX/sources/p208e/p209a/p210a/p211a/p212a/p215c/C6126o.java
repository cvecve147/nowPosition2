package p208e.p209a.p210a.p211a.p212a.p215c;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: e.a.a.a.a.c.o */
public class C6126o<V> extends FutureTask<V> implements C6118h<C6131s>, C6127p, C6131s, C6117g {

    /* renamed from: a */
    final Object f17116a;

    public C6126o(Runnable runnable, V v) {
        super(runnable, v);
        this.f17116a = mo16148b(runnable);
    }

    public C6126o(Callable<V> callable) {
        super(callable);
        this.f17116a = mo16148b(callable);
    }

    /* renamed from: a */
    public void mo16115a(C6131s sVar) {
        ((C6118h) ((C6127p) mo16138d())).mo16115a(sVar);
    }

    /* renamed from: a */
    public void mo16140a(Throwable th) {
        ((C6131s) ((C6127p) mo16138d())).mo16140a(th);
    }

    /* renamed from: a */
    public void mo16142a(boolean z) {
        ((C6131s) ((C6127p) mo16138d())).mo16142a(z);
    }

    /* renamed from: a */
    public boolean mo16143a() {
        return ((C6131s) ((C6127p) mo16138d())).mo16143a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public <T extends C6118h<C6131s> & C6127p & C6131s> T mo16148b(Object obj) {
        return C6128q.m23183b(obj) ? (C6118h) obj : new C6128q();
    }

    /* renamed from: b */
    public boolean mo16116b() {
        return ((C6118h) ((C6127p) mo16138d())).mo16116b();
    }

    /* renamed from: c */
    public Collection<C6131s> mo16117c() {
        return ((C6118h) ((C6127p) mo16138d())).mo16117c();
    }

    public int compareTo(Object obj) {
        return ((C6127p) mo16138d()).compareTo(obj);
    }

    /* renamed from: d */
    public <T extends C6118h<C6131s> & C6127p & C6131s> T mo16138d() {
        return (C6118h) this.f17116a;
    }

    /* renamed from: f */
    public C6121k mo14752f() {
        return ((C6127p) mo16138d()).mo14752f();
    }
}
