package p208e.p221b.p244i;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p208e.p221b.C6438q;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p242g.C6416a;

/* renamed from: e.b.i.a */
public final class C6428a<T> extends C6430b<T> {

    /* renamed from: a */
    static final C6429a[] f17811a = new C6429a[0];

    /* renamed from: b */
    static final C6429a[] f17812b = new C6429a[0];

    /* renamed from: c */
    final AtomicReference<C6429a<T>[]> f17813c = new AtomicReference<>(f17812b);

    /* renamed from: d */
    Throwable f17814d;

    /* renamed from: e.b.i.a$a */
    static final class C6429a<T> extends AtomicBoolean implements C6223b {

        /* renamed from: a */
        final C6438q<? super T> f17815a;

        /* renamed from: b */
        final C6428a<T> f17816b;

        C6429a(C6438q<? super T> qVar, C6428a<T> aVar) {
            this.f17815a = qVar;
            this.f17816b = aVar;
        }

        /* renamed from: a */
        public void mo15709a() {
            if (compareAndSet(false, true)) {
                this.f17816b.mo16521b(this);
            }
        }

        /* renamed from: a */
        public void mo16522a(T t) {
            if (!get()) {
                this.f17815a.mo13341a(t);
            }
        }

        /* renamed from: a */
        public void mo16523a(Throwable th) {
            if (get()) {
                C6416a.m23988b(th);
            } else {
                this.f17815a.mo13342a(th);
            }
        }

        /* renamed from: b */
        public boolean mo16524b() {
            return get();
        }

        /* renamed from: c */
        public void mo16525c() {
            if (!get()) {
                this.f17815a.mo13343c();
            }
        }
    }

    C6428a() {
    }

    /* renamed from: g */
    public static <T> C6428a<T> m23998g() {
        return new C6428a<>();
    }

    /* renamed from: a */
    public void mo13383a(C6223b bVar) {
        if (this.f17813c.get() == f17811a) {
            bVar.mo15709a();
        }
    }

    /* renamed from: a */
    public void mo13341a(T t) {
        if (this.f17813c.get() != f17811a) {
            if (t == null) {
                mo13342a((Throwable) new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            for (C6429a a : (C6429a[]) this.f17813c.get()) {
                a.mo16522a(t);
            }
        }
    }

    /* renamed from: a */
    public void mo13342a(Throwable th) {
        if (this.f17813c.get() == f17811a) {
            C6416a.m23988b(th);
            return;
        }
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        this.f17814d = th;
        for (C6429a a : (C6429a[]) this.f17813c.getAndSet(f17811a)) {
            a.mo16523a(th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo16520a(C6429a<T> aVar) {
        C6429a[] aVarArr;
        C6429a[] aVarArr2;
        do {
            aVarArr = (C6429a[]) this.f17813c.get();
            if (aVarArr == f17811a) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C6429a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f17813c.compareAndSet(aVarArr, aVarArr2));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo16521b(C6429a<T> aVar) {
        C6429a<T>[] aVarArr;
        C6429a[] aVarArr2;
        do {
            aVarArr = (C6429a[]) this.f17813c.get();
            if (aVarArr != f17811a && aVarArr != f17812b) {
                int length = aVarArr.length;
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (aVarArr[i2] == aVar) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        aVarArr2 = f17812b;
                    } else {
                        C6429a[] aVarArr3 = new C6429a[(length - 1)];
                        System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                        System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                        aVarArr2 = aVarArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.f17813c.compareAndSet(aVarArr, aVarArr2));
    }

    /* renamed from: b */
    public void mo15707b(C6438q<? super T> qVar) {
        C6429a aVar = new C6429a(qVar, this);
        qVar.mo13383a((C6223b) aVar);
        if (!mo16520a(aVar)) {
            Throwable th = this.f17814d;
            if (th != null) {
                qVar.mo13342a(th);
            } else {
                qVar.mo13343c();
            }
        } else if (aVar.mo16524b()) {
            mo16521b(aVar);
        }
    }

    /* renamed from: c */
    public void mo13343c() {
        C6429a<T>[] aVarArr = this.f17813c.get();
        C6429a<T>[] aVarArr2 = f17811a;
        if (aVarArr != aVarArr2) {
            for (C6429a c : (C6429a[]) this.f17813c.getAndSet(aVarArr2)) {
                c.mo16525c();
            }
        }
    }
}
