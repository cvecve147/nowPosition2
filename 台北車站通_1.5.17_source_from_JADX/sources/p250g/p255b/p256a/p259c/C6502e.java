package p250g.p255b.p256a.p259c;

import p250g.p255b.p256a.C6570h;
import p250g.p255b.p256a.C6571i;

/* renamed from: g.b.a.c.e */
public class C6502e extends C6500c {

    /* renamed from: b */
    private final C6570h f18049b;

    public C6502e(C6570h hVar, C6571i iVar) {
        super(iVar);
        if (hVar == null) {
            throw new IllegalArgumentException("The field must not be null");
        } else if (hVar.mo16812k()) {
            this.f18049b = hVar;
        } else {
            throw new IllegalArgumentException("The field must be supported");
        }
    }

    /* renamed from: c */
    public boolean mo16788c() {
        return this.f18049b.mo16788c();
    }

    /* renamed from: m */
    public final C6570h mo16816m() {
        return this.f18049b;
    }
}
