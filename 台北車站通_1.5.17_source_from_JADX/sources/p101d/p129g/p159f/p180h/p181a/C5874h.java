package p101d.p129g.p159f.p180h.p181a;

import java.util.Formatter;

/* renamed from: d.g.f.h.a.h */
class C5874h {

    /* renamed from: a */
    private final C5868c f16261a;

    /* renamed from: b */
    private final C5869d[] f16262b;

    C5874h(C5868c cVar) {
        this.f16261a = new C5868c(cVar);
        this.f16262b = new C5869d[((cVar.mo15600d() - cVar.mo15602f()) + 1)];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C5868c mo15625a() {
        return this.f16261a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C5869d mo15626a(int i) {
        return this.f16262b[mo15630c(i)];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo15627a(int i, C5869d dVar) {
        this.f16262b[mo15630c(i)] = dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C5869d mo15628b(int i) {
        C5869d dVar;
        C5869d dVar2;
        C5869d a = mo15626a(i);
        if (a != null) {
            return a;
        }
        for (int i2 = 1; i2 < 5; i2++) {
            int c = mo15630c(i) - i2;
            if (c >= 0 && (dVar2 = this.f16262b[c]) != null) {
                return dVar2;
            }
            int c2 = mo15630c(i) + i2;
            C5869d[] dVarArr = this.f16262b;
            if (c2 < dVarArr.length && (dVar = dVarArr[c2]) != null) {
                return dVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C5869d[] mo15629b() {
        return this.f16262b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo15630c(int i) {
        return i - this.f16261a.mo15602f();
    }

    public String toString() {
        Formatter formatter = new Formatter();
        int i = 0;
        for (C5869d dVar : this.f16262b) {
            if (dVar == null) {
                formatter.format("%3d:    |   %n", new Object[]{Integer.valueOf(i)});
                i++;
            } else {
                formatter.format("%3d: %3d|%3d%n", new Object[]{Integer.valueOf(i), Integer.valueOf(dVar.mo15609c()), Integer.valueOf(dVar.mo15611e())});
                i++;
            }
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
