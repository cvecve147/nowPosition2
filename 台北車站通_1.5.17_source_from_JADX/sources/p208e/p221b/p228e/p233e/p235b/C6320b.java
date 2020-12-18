package p208e.p221b.p228e.p233e.p235b;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import p208e.p221b.C6436o;
import p208e.p221b.C6438q;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p226c.C6233b;
import p208e.p221b.p228e.p229a.C6249b;
import p208e.p221b.p228e.p229a.C6250c;
import p208e.p221b.p228e.p230b.C6268b;

/* renamed from: e.b.e.e.b.b */
public final class C6320b<T, U extends Collection<? super T>> extends C6319a<T, U> {

    /* renamed from: b */
    final int f17484b;

    /* renamed from: c */
    final int f17485c;

    /* renamed from: d */
    final Callable<U> f17486d;

    /* renamed from: e.b.e.e.b.b$a */
    static final class C6321a<T, U extends Collection<? super T>> implements C6438q<T>, C6223b {

        /* renamed from: a */
        final C6438q<? super U> f17487a;

        /* renamed from: b */
        final int f17488b;

        /* renamed from: c */
        final Callable<U> f17489c;

        /* renamed from: d */
        U f17490d;

        /* renamed from: e */
        int f17491e;

        /* renamed from: f */
        C6223b f17492f;

        C6321a(C6438q<? super U> qVar, int i, Callable<U> callable) {
            this.f17487a = qVar;
            this.f17488b = i;
            this.f17489c = callable;
        }

        /* renamed from: a */
        public void mo15709a() {
            this.f17492f.mo15709a();
        }

        /* renamed from: a */
        public void mo13383a(C6223b bVar) {
            if (C6249b.m23557a(this.f17492f, bVar)) {
                this.f17492f = bVar;
                this.f17487a.mo13383a((C6223b) this);
            }
        }

        /* renamed from: a */
        public void mo13341a(T t) {
            U u = this.f17490d;
            if (u != null) {
                u.add(t);
                int i = this.f17491e + 1;
                this.f17491e = i;
                if (i >= this.f17488b) {
                    this.f17487a.mo13341a(u);
                    this.f17491e = 0;
                    mo16406b();
                }
            }
        }

        /* renamed from: a */
        public void mo13342a(Throwable th) {
            this.f17490d = null;
            this.f17487a.mo13342a(th);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo16406b() {
            try {
                U call = this.f17489c.call();
                C6268b.m23590a(call, "Empty buffer supplied");
                this.f17490d = (Collection) call;
                return true;
            } catch (Throwable th) {
                C6233b.m23529b(th);
                this.f17490d = null;
                C6223b bVar = this.f17492f;
                if (bVar == null) {
                    C6250c.m23566a(th, this.f17487a);
                    return false;
                }
                bVar.mo15709a();
                this.f17487a.mo13342a(th);
                return false;
            }
        }

        /* renamed from: c */
        public void mo13343c() {
            U u = this.f17490d;
            this.f17490d = null;
            if (u != null && !u.isEmpty()) {
                this.f17487a.mo13341a(u);
            }
            this.f17487a.mo13343c();
        }
    }

    /* renamed from: e.b.e.e.b.b$b */
    static final class C6322b<T, U extends Collection<? super T>> extends AtomicBoolean implements C6438q<T>, C6223b {

        /* renamed from: a */
        final C6438q<? super U> f17493a;

        /* renamed from: b */
        final int f17494b;

        /* renamed from: c */
        final int f17495c;

        /* renamed from: d */
        final Callable<U> f17496d;

        /* renamed from: e */
        C6223b f17497e;

        /* renamed from: f */
        final ArrayDeque<U> f17498f = new ArrayDeque<>();

        /* renamed from: g */
        long f17499g;

        C6322b(C6438q<? super U> qVar, int i, int i2, Callable<U> callable) {
            this.f17493a = qVar;
            this.f17494b = i;
            this.f17495c = i2;
            this.f17496d = callable;
        }

        /* renamed from: a */
        public void mo15709a() {
            this.f17497e.mo15709a();
        }

        /* renamed from: a */
        public void mo13383a(C6223b bVar) {
            if (C6249b.m23557a(this.f17497e, bVar)) {
                this.f17497e = bVar;
                this.f17493a.mo13383a((C6223b) this);
            }
        }

        /* renamed from: a */
        public void mo13341a(T t) {
            long j = this.f17499g;
            this.f17499g = 1 + j;
            if (j % ((long) this.f17495c) == 0) {
                try {
                    U call = this.f17496d.call();
                    C6268b.m23590a(call, "The bufferSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
                    this.f17498f.offer((Collection) call);
                } catch (Throwable th) {
                    this.f17498f.clear();
                    this.f17497e.mo15709a();
                    this.f17493a.mo13342a(th);
                    return;
                }
            }
            Iterator<U> it = this.f17498f.iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) it.next();
                collection.add(t);
                if (this.f17494b <= collection.size()) {
                    it.remove();
                    this.f17493a.mo13341a(collection);
                }
            }
        }

        /* renamed from: a */
        public void mo13342a(Throwable th) {
            this.f17498f.clear();
            this.f17493a.mo13342a(th);
        }

        /* renamed from: c */
        public void mo13343c() {
            while (!this.f17498f.isEmpty()) {
                this.f17493a.mo13341a(this.f17498f.poll());
            }
            this.f17493a.mo13343c();
        }
    }

    public C6320b(C6436o<T> oVar, int i, int i2, Callable<U> callable) {
        super(oVar);
        this.f17484b = i;
        this.f17485c = i2;
        this.f17486d = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo15707b(C6438q<? super U> qVar) {
        int i = this.f17485c;
        int i2 = this.f17484b;
        if (i == i2) {
            C6321a aVar = new C6321a(qVar, i2, this.f17486d);
            if (aVar.mo16406b()) {
                this.f17483a.mo16542a(aVar);
                return;
            }
            return;
        }
        this.f17483a.mo16542a(new C6322b(qVar, i2, i, this.f17486d));
    }
}
