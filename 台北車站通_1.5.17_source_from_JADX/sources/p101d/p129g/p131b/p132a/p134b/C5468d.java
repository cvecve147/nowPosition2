package p101d.p129g.p131b.p132a.p134b;

import android.os.IBinder;
import java.lang.reflect.Field;
import p101d.p129g.p131b.p132a.p134b.C5464b;

/* renamed from: d.g.b.a.b.d */
public final class C5468d<T> extends C5464b.C5465a {

    /* renamed from: a */
    private final T f15378a;

    private C5468d(T t) {
        this.f15378a = t;
    }

    /* renamed from: a */
    public static <T> C5464b m20961a(T t) {
        return new C5468d(t);
    }

    /* renamed from: z */
    public static <T> T m20962z(C5464b bVar) {
        if (bVar instanceof C5468d) {
            return ((C5468d) bVar).f15378a;
        }
        IBinder asBinder = bVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        } else if (!field.isAccessible()) {
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (NullPointerException e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (IllegalAccessException e2) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
            }
        } else {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
    }
}
