package p250g.p255b.p256a.p259c;

import java.io.Serializable;
import p250g.p255b.p256a.C6570h;
import p250g.p255b.p256a.C6571i;

/* renamed from: g.b.a.c.c */
public abstract class C6500c extends C6570h implements Serializable {

    /* renamed from: a */
    private final C6571i f18047a;

    protected C6500c(C6571i iVar) {
        if (iVar != null) {
            this.f18047a = iVar;
            return;
        }
        throw new IllegalArgumentException("The type must not be null");
    }

    /* renamed from: a */
    public int compareTo(C6570h hVar) {
        int i = (mo16787b() > hVar.mo16787b() ? 1 : (mo16787b() == hVar.mo16787b() ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        return i < 0 ? -1 : 1;
    }

    /* renamed from: a */
    public final C6571i mo16810a() {
        return this.f18047a;
    }

    /* renamed from: k */
    public final boolean mo16812k() {
        return true;
    }

    /* renamed from: l */
    public final String mo16813l() {
        return this.f18047a.mo16973d();
    }

    public String toString() {
        return "DurationField[" + mo16813l() + ']';
    }
}
