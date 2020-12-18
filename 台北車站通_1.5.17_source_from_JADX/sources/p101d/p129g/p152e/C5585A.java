package p101d.p129g.p152e;

import java.math.BigInteger;
import p101d.p129g.p152e.p154b.C5611a;
import p101d.p129g.p152e.p154b.C5702u;

/* renamed from: d.g.e.A */
public final class C5585A extends C5737u {

    /* renamed from: a */
    private static final Class<?>[] f15570a = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* renamed from: b */
    private Object f15571b;

    public C5585A(Boolean bool) {
        mo15082a((Object) bool);
    }

    public C5585A(Number number) {
        mo15082a((Object) number);
    }

    public C5585A(String str) {
        mo15082a((Object) str);
    }

    /* renamed from: a */
    private static boolean m21229a(C5585A a) {
        Object obj = a.f15571b;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    /* renamed from: b */
    private static boolean m21230b(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class<?> cls = obj.getClass();
        for (Class<?> isAssignableFrom : f15570a) {
            if (isAssignableFrom.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo15082a(Object obj) {
        if (obj instanceof Character) {
            obj = String.valueOf(((Character) obj).charValue());
        } else {
            C5611a.m21266a((obj instanceof Number) || m21230b(obj));
        }
        this.f15571b = obj;
    }

    /* renamed from: d */
    public String mo15083d() {
        return mo15093t() ? mo15091r().toString() : mo15092s() ? mo15087j().toString() : (String) this.f15571b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5585A.class != obj.getClass()) {
            return false;
        }
        C5585A a = (C5585A) obj;
        if (this.f15571b == null) {
            return a.f15571b == null;
        }
        if (m21229a(this) && m21229a(a)) {
            return mo15091r().longValue() == a.mo15091r().longValue();
        }
        if (!(this.f15571b instanceof Number) || !(a.f15571b instanceof Number)) {
            return this.f15571b.equals(a.f15571b);
        }
        double doubleValue = mo15091r().doubleValue();
        double doubleValue2 = a.mo15091r().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f15571b == null) {
            return 31;
        }
        if (m21229a(this)) {
            doubleToLongBits = mo15091r().longValue();
        } else {
            Object obj = this.f15571b;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(mo15091r().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    /* renamed from: i */
    public boolean mo15086i() {
        return mo15092s() ? mo15087j().booleanValue() : Boolean.parseBoolean(mo15083d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public Boolean mo15087j() {
        return (Boolean) this.f15571b;
    }

    /* renamed from: o */
    public double mo15088o() {
        return mo15093t() ? mo15091r().doubleValue() : Double.parseDouble(mo15083d());
    }

    /* renamed from: p */
    public int mo15089p() {
        return mo15093t() ? mo15091r().intValue() : Integer.parseInt(mo15083d());
    }

    /* renamed from: q */
    public long mo15090q() {
        return mo15093t() ? mo15091r().longValue() : Long.parseLong(mo15083d());
    }

    /* renamed from: r */
    public Number mo15091r() {
        Object obj = this.f15571b;
        return obj instanceof String ? new C5702u((String) obj) : (Number) obj;
    }

    /* renamed from: s */
    public boolean mo15092s() {
        return this.f15571b instanceof Boolean;
    }

    /* renamed from: t */
    public boolean mo15093t() {
        return this.f15571b instanceof Number;
    }

    /* renamed from: u */
    public boolean mo15094u() {
        return this.f15571b instanceof String;
    }
}
