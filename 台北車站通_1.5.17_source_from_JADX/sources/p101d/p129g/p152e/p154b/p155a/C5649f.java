package p101d.p129g.p152e.p154b.p155a;

import p101d.p129g.p152e.C5593I;
import p101d.p129g.p152e.C5594J;
import p101d.p129g.p152e.C5731p;
import p101d.p129g.p152e.p153a.C5597b;
import p101d.p129g.p152e.p154b.C5698q;
import p101d.p129g.p152e.p157c.C5713a;

/* renamed from: d.g.e.b.a.f */
public final class C5649f implements C5594J {

    /* renamed from: a */
    private final C5698q f15612a;

    public C5649f(C5698q qVar) {
        this.f15612a = qVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: d.g.e.I<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: d.g.e.I} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: d.g.e.b.a.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: d.g.e.b.a.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: d.g.e.b.a.v} */
    /* JADX WARNING: type inference failed for: r8v3, types: [d.g.e.I, d.g.e.I<?>] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p101d.p129g.p152e.C5593I<?> mo15146a(p101d.p129g.p152e.p154b.C5698q r8, p101d.p129g.p152e.C5731p r9, p101d.p129g.p152e.p157c.C5713a<?> r10, p101d.p129g.p152e.p153a.C5597b r11) {
        /*
            r7 = this;
            java.lang.Class r11 = r11.value()
            d.g.e.c.a r11 = p101d.p129g.p152e.p157c.C5713a.m21561a(r11)
            d.g.e.b.z r8 = r8.mo15215a(r11)
            java.lang.Object r8 = r8.mo15214a()
            boolean r11 = r8 instanceof p101d.p129g.p152e.C5593I
            if (r11 == 0) goto L_0x0017
            d.g.e.I r8 = (p101d.p129g.p152e.C5593I) r8
            goto L_0x004d
        L_0x0017:
            boolean r11 = r8 instanceof p101d.p129g.p152e.C5594J
            if (r11 == 0) goto L_0x0022
            d.g.e.J r8 = (p101d.p129g.p152e.C5594J) r8
            d.g.e.I r8 = r8.mo15100a(r9, r10)
            goto L_0x004d
        L_0x0022:
            boolean r11 = r8 instanceof p101d.p129g.p152e.C5587C
            if (r11 != 0) goto L_0x0033
            boolean r0 = r8 instanceof p101d.p129g.p152e.C5736t
            if (r0 == 0) goto L_0x002b
            goto L_0x0033
        L_0x002b:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "@JsonAdapter value must be TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer reference."
            r8.<init>(r9)
            throw r8
        L_0x0033:
            r0 = 0
            if (r11 == 0) goto L_0x003b
            r11 = r8
            d.g.e.C r11 = (p101d.p129g.p152e.C5587C) r11
            r2 = r11
            goto L_0x003c
        L_0x003b:
            r2 = r0
        L_0x003c:
            boolean r11 = r8 instanceof p101d.p129g.p152e.C5736t
            if (r11 == 0) goto L_0x0043
            r0 = r8
            d.g.e.t r0 = (p101d.p129g.p152e.C5736t) r0
        L_0x0043:
            r3 = r0
            d.g.e.b.a.v r8 = new d.g.e.b.a.v
            r6 = 0
            r1 = r8
            r4 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
        L_0x004d:
            if (r8 == 0) goto L_0x0053
            d.g.e.I r8 = r8.mo15098a()
        L_0x0053:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p129g.p152e.p154b.p155a.C5649f.mo15146a(d.g.e.b.q, d.g.e.p, d.g.e.c.a, d.g.e.a.b):d.g.e.I");
    }

    /* renamed from: a */
    public <T> C5593I<T> mo15100a(C5731p pVar, C5713a<T> aVar) {
        C5597b bVar = (C5597b) aVar.mo15267a().getAnnotation(C5597b.class);
        if (bVar == null) {
            return null;
        }
        return mo15146a(this.f15612a, pVar, aVar, bVar);
    }
}
