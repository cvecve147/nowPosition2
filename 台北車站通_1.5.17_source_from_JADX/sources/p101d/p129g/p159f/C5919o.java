package p101d.p129g.p159f;

import p101d.p129g.p159f.p167c.p168a.C5773a;

/* renamed from: d.g.f.o */
public class C5919o {

    /* renamed from: a */
    private final float f16372a;

    /* renamed from: b */
    private final float f16373b;

    public C5919o(float f, float f2) {
        this.f16372a = f;
        this.f16373b = f2;
    }

    /* renamed from: a */
    public static float m22413a(C5919o oVar, C5919o oVar2) {
        return C5773a.m21794a(oVar.f16372a, oVar.f16373b, oVar2.f16372a, oVar2.f16373b);
    }

    /* renamed from: a */
    private static float m22414a(C5919o oVar, C5919o oVar2, C5919o oVar3) {
        float f = oVar2.f16372a;
        float f2 = oVar2.f16373b;
        return ((oVar3.f16372a - f) * (oVar.f16373b - f2)) - ((oVar3.f16373b - f2) * (oVar.f16372a - f));
    }

    /* renamed from: a */
    public static void m22415a(C5919o[] oVarArr) {
        C5919o oVar;
        C5919o oVar2;
        C5919o oVar3;
        float a = m22413a(oVarArr[0], oVarArr[1]);
        float a2 = m22413a(oVarArr[1], oVarArr[2]);
        float a3 = m22413a(oVarArr[0], oVarArr[2]);
        if (a2 >= a && a2 >= a3) {
            oVar3 = oVarArr[0];
            oVar2 = oVarArr[1];
            oVar = oVarArr[2];
        } else if (a3 < a2 || a3 < a) {
            oVar3 = oVarArr[2];
            oVar2 = oVarArr[0];
            oVar = oVarArr[1];
        } else {
            oVar3 = oVarArr[1];
            oVar2 = oVarArr[0];
            oVar = oVarArr[2];
        }
        if (m22414a(oVar2, oVar3, oVar) < 0.0f) {
            C5919o oVar4 = oVar;
            oVar = oVar2;
            oVar2 = oVar4;
        }
        oVarArr[0] = oVar2;
        oVarArr[1] = oVar3;
        oVarArr[2] = oVar;
    }

    /* renamed from: a */
    public final float mo15702a() {
        return this.f16372a;
    }

    /* renamed from: b */
    public final float mo15703b() {
        return this.f16373b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5919o)) {
            return false;
        }
        C5919o oVar = (C5919o) obj;
        return this.f16372a == oVar.f16372a && this.f16373b == oVar.f16373b;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f16372a) * 31) + Float.floatToIntBits(this.f16373b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(25);
        sb.append('(');
        sb.append(this.f16372a);
        sb.append(',');
        sb.append(this.f16373b);
        sb.append(')');
        return sb.toString();
    }
}
