package p250g.p255b.p256a;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import p250g.p255b.p256a.p257a.C6470c;
import p250g.p255b.p256a.p259c.C6498a;

/* renamed from: g.b.a.m */
public class C6576m extends C6470c implements C6578n, Cloneable, Serializable {

    /* renamed from: c */
    private C6497c f18308c;

    /* renamed from: d */
    private int f18309d;

    /* renamed from: g.b.a.m$a */
    public static final class C6577a extends C6498a {

        /* renamed from: a */
        private C6576m f18310a;

        /* renamed from: b */
        private C6497c f18311b;

        C6577a(C6576m mVar, C6497c cVar) {
            this.f18310a = mVar;
            this.f18311b = cVar;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            this.f18310a = (C6576m) objectInputStream.readObject();
            this.f18311b = ((C6517d) objectInputStream.readObject()).mo16836a(this.f18310a.getChronology());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) {
            objectOutputStream.writeObject(this.f18310a);
            objectOutputStream.writeObject(this.f18311b.mo16792g());
        }

        /* renamed from: a */
        public C6576m mo16981a(int i) {
            this.f18310a.mo16688a(mo16799c().mo16749b(this.f18310a.mo16689e(), i));
            return this.f18310a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public C6467a mo16796b() {
            return this.f18310a.getChronology();
        }

        /* renamed from: c */
        public C6497c mo16799c() {
            return this.f18311b;
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public long mo16803f() {
            return this.f18310a.mo16689e();
        }
    }

    public C6576m() {
    }

    public C6576m(long j, C6567g gVar) {
        super(j, gVar);
    }

    /* renamed from: a */
    public C6577a mo16979a(C6517d dVar) {
        if (dVar != null) {
            C6497c a = dVar.mo16836a(getChronology());
            if (a.mo16793h()) {
                return new C6577a(this, a);
            }
            throw new IllegalArgumentException("Field '" + dVar + "' is not supported");
        }
        throw new IllegalArgumentException("The DateTimeFieldType must not be null");
    }

    /* renamed from: a */
    public void mo16688a(long j) {
        int i = this.f18309d;
        if (i != 0) {
            if (i == 1) {
                j = this.f18308c.mo16752e(j);
            } else if (i == 2) {
                j = this.f18308c.mo16753d(j);
            } else if (i == 3) {
                j = this.f18308c.mo16760h(j);
            } else if (i == 4) {
                j = this.f18308c.mo16758f(j);
            } else if (i == 5) {
                j = this.f18308c.mo16759g(j);
            }
        }
        super.mo16688a(j);
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError("Clone error");
        }
    }
}
