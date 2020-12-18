package com.onesignal;

import com.onesignal.C4236Ea;
import com.onesignal.C4306Xa;
import com.onesignal.C4347ba;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.onesignal.Ga */
class C4244Ga {

    /* renamed from: a */
    C4347ba f12593a;

    /* renamed from: b */
    private final ConcurrentHashMap<String, Object> f12594b = new ConcurrentHashMap<>();

    C4244Ga(C4347ba.C4348a aVar) {
        this.f12593a = new C4347ba(aVar);
    }

    /* renamed from: a */
    private boolean m16796a(C4236Ea ea) {
        C4236Ea.C4237a aVar = ea.f12567b;
        if (aVar == C4236Ea.C4237a.UNKNOWN) {
            return false;
        }
        if (aVar != C4236Ea.C4237a.CUSTOM) {
            return this.f12593a.mo12470a(ea);
        }
        C4236Ea.C4238b bVar = ea.f12569d;
        Object obj = this.f12594b.get(ea.f12568c);
        if (obj == null) {
            if (bVar == C4236Ea.C4238b.NOT_EXISTS) {
                return true;
            }
            return bVar == C4236Ea.C4238b.NOT_EQUAL_TO && ea.f12570e != null;
        } else if (bVar == C4236Ea.C4238b.EXISTS) {
            return true;
        } else {
            if (bVar == C4236Ea.C4238b.NOT_EXISTS) {
                return false;
            }
            if (bVar == C4236Ea.C4238b.CONTAINS) {
                return (obj instanceof Collection) && ((Collection) obj).contains(ea.f12570e);
            }
            if (obj instanceof String) {
                Object obj2 = ea.f12570e;
                if ((obj2 instanceof String) && m16800a((String) obj2, (String) obj, bVar)) {
                    return true;
                }
            }
            Object obj3 = ea.f12570e;
            return ((obj3 instanceof Number) && (obj instanceof Number) && m16797a((Number) obj3, (Number) obj, bVar)) || m16799a(ea.f12570e, obj, bVar);
        }
    }

    /* renamed from: a */
    private boolean m16797a(Number number, Number number2, C4236Ea.C4238b bVar) {
        double doubleValue = number.doubleValue();
        double doubleValue2 = number2.doubleValue();
        switch (C4241Fa.f12590a[bVar.ordinal()]) {
            case 1:
                return doubleValue2 == doubleValue;
            case 2:
                return doubleValue2 != doubleValue;
            case 3:
            case 4:
            case 5:
                C4306Xa.C4316j jVar = C4306Xa.C4316j.ERROR;
                C4306Xa.m17154b(jVar, "Attempted to use an invalid operator with a numeric value: " + bVar.toString());
                return false;
            case 6:
                return doubleValue2 < doubleValue;
            case 7:
                return doubleValue2 > doubleValue;
            case 8:
                return doubleValue2 < doubleValue || doubleValue2 == doubleValue;
            case 9:
                int i = (doubleValue2 > doubleValue ? 1 : (doubleValue2 == doubleValue ? 0 : -1));
                return i > 0 || i == 0;
            default:
                return false;
        }
    }

    /* renamed from: a */
    private boolean m16798a(Number number, String str, C4236Ea.C4238b bVar) {
        try {
            return m16797a((Number) Double.valueOf(number.doubleValue()), (Number) Double.valueOf(Double.parseDouble(str)), bVar);
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private boolean m16799a(Object obj, Object obj2, C4236Ea.C4238b bVar) {
        if (obj == null) {
            return false;
        }
        if (bVar.mo12291a()) {
            return m16800a(obj.toString(), obj2.toString(), bVar);
        }
        if (!(obj2 instanceof String) || !(obj instanceof Number)) {
            return false;
        }
        return m16798a((Number) obj, (String) obj2, bVar);
    }

    /* renamed from: a */
    private boolean m16800a(String str, String str2, C4236Ea.C4238b bVar) {
        int i = C4241Fa.f12590a[bVar.ordinal()];
        if (i == 1) {
            return str.equals(str2);
        }
        if (i == 2) {
            return !str.equals(str2);
        }
        C4306Xa.C4316j jVar = C4306Xa.C4316j.ERROR;
        C4306Xa.m17154b(jVar, "Attempted to use an invalid operator for a string trigger comparison: " + bVar.toString());
        return false;
    }

    /* renamed from: a */
    private boolean m16801a(ArrayList<C4236Ea> arrayList) {
        Iterator<C4236Ea> it = arrayList.iterator();
        while (it.hasNext()) {
            if (!m16796a(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo12295a(C4364fa faVar) {
        if (faVar.f12890c.size() == 0) {
            return true;
        }
        Iterator<ArrayList<C4236Ea>> it = faVar.f12890c.iterator();
        while (it.hasNext()) {
            if (m16801a(it.next())) {
                return true;
            }
        }
        return false;
    }
}
