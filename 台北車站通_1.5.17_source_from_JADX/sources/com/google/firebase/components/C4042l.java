package com.google.firebase.components;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.firebase.components.l */
public final class C4042l {

    /* renamed from: a */
    private final Context f12015a;

    /* renamed from: b */
    private final C4045o f12016b;

    public C4042l(Context context) {
        this(context, new C4044n());
    }

    private C4042l(Context context, C4045o oVar) {
        this.f12015a = context;
        this.f12016b = oVar;
    }

    /* renamed from: a */
    private static List<C4035e> m16200a(List<String> list) {
        String str;
        Object[] objArr;
        ArrayList arrayList = new ArrayList();
        for (String next : list) {
            try {
                Class<?> cls = Class.forName(next);
                if (!C4035e.class.isAssignableFrom(cls)) {
                    Log.w("ComponentDiscovery", String.format("Class %s is not an instance of %s", new Object[]{next, "com.google.firebase.components.ComponentRegistrar"}));
                } else {
                    arrayList.add((C4035e) cls.newInstance());
                }
            } catch (ClassNotFoundException e) {
                e = e;
                str = String.format("Class %s is not an found.", new Object[]{next});
                Log.w("ComponentDiscovery", str, e);
            } catch (IllegalAccessException e2) {
                e = e2;
                objArr = new Object[]{next};
                str = String.format("Could not instantiate %s.", objArr);
                Log.w("ComponentDiscovery", str, e);
            } catch (InstantiationException e3) {
                e = e3;
                objArr = new Object[]{next};
                str = String.format("Could not instantiate %s.", objArr);
                Log.w("ComponentDiscovery", str, e);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final List<C4035e> mo11445a() {
        return m16200a(this.f12016b.mo11446a(this.f12015a));
    }
}
