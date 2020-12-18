package p208e.p221b.p228e.p240j;

import java.io.Serializable;
import p208e.p221b.C6438q;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p228e.p230b.C6268b;

/* renamed from: e.b.e.j.i */
public enum C6407i {
    COMPLETE;

    /* renamed from: e.b.e.j.i$a */
    static final class C6408a implements Serializable {

        /* renamed from: a */
        final C6223b f17772a;

        public String toString() {
            return "NotificationLite.Disposable[" + this.f17772a + "]";
        }
    }

    /* renamed from: e.b.e.j.i$b */
    static final class C6409b implements Serializable {

        /* renamed from: a */
        final Throwable f17773a;

        C6409b(Throwable th) {
            this.f17773a = th;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C6409b) {
                return C6268b.m23591a((Object) this.f17773a, (Object) ((C6409b) obj).f17773a);
            }
            return false;
        }

        public int hashCode() {
            return this.f17773a.hashCode();
        }

        public String toString() {
            return "NotificationLite.Error[" + this.f17773a + "]";
        }
    }

    /* renamed from: a */
    public static Object m23951a() {
        return COMPLETE;
    }

    /* renamed from: a */
    public static <T> Object m23952a(T t) {
        return t;
    }

    /* renamed from: a */
    public static Object m23953a(Throwable th) {
        return new C6409b(th);
    }

    /* renamed from: a */
    public static <T> boolean m23954a(Object obj, C6438q<? super T> qVar) {
        if (obj == COMPLETE) {
            qVar.mo13343c();
            return true;
        } else if (obj instanceof C6409b) {
            qVar.mo13342a(((C6409b) obj).f17773a);
            return true;
        } else if (obj instanceof C6408a) {
            qVar.mo13383a(((C6408a) obj).f17772a);
            return false;
        } else {
            qVar.mo13341a(obj);
            return false;
        }
    }

    public String toString() {
        return "NotificationLite.Complete";
    }
}
