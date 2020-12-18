package p208e.p221b.p228e.p233e.p235b;

import p208e.p221b.C6433l;
import p208e.p221b.C6438q;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p228e.p230b.C6268b;
import p208e.p221b.p228e.p232d.C6281b;

/* renamed from: e.b.e.e.b.j */
public final class C6339j<T> extends C6433l<T> {

    /* renamed from: a */
    final T[] f17580a;

    /* renamed from: e.b.e.e.b.j$a */
    static final class C6340a<T> extends C6281b<T> {

        /* renamed from: a */
        final C6438q<? super T> f17581a;

        /* renamed from: b */
        final T[] f17582b;

        /* renamed from: c */
        int f17583c;

        /* renamed from: d */
        boolean f17584d;

        /* renamed from: e */
        volatile boolean f17585e;

        C6340a(C6438q<? super T> qVar, T[] tArr) {
            this.f17581a = qVar;
            this.f17582b = tArr;
        }

        /* renamed from: a */
        public int mo16357a(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f17584d = true;
            return 1;
        }

        /* renamed from: a */
        public void mo15709a() {
            this.f17585e = true;
        }

        /* renamed from: b */
        public boolean mo16424b() {
            return this.f17585e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo16425c() {
            T[] tArr = this.f17582b;
            int length = tArr.length;
            for (int i = 0; i < length && !mo16424b(); i++) {
                T t = tArr[i];
                if (t == null) {
                    C6438q<? super T> qVar = this.f17581a;
                    qVar.mo13342a((Throwable) new NullPointerException("The " + i + "th element is null"));
                    return;
                }
                this.f17581a.mo13341a(t);
            }
            if (!mo16424b()) {
                this.f17581a.mo13343c();
            }
        }

        public void clear() {
            this.f17583c = this.f17582b.length;
        }

        public boolean isEmpty() {
            return this.f17583c == this.f17582b.length;
        }

        public T poll() {
            int i = this.f17583c;
            T[] tArr = this.f17582b;
            if (i == tArr.length) {
                return null;
            }
            this.f17583c = i + 1;
            T t = tArr[i];
            C6268b.m23590a(t, "The array element is null");
            return t;
        }
    }

    public C6339j(T[] tArr) {
        this.f17580a = tArr;
    }

    /* renamed from: b */
    public void mo15707b(C6438q<? super T> qVar) {
        C6340a aVar = new C6340a(qVar, this.f17580a);
        qVar.mo13383a((C6223b) aVar);
        if (!aVar.f17584d) {
            aVar.mo16425c();
        }
    }
}
