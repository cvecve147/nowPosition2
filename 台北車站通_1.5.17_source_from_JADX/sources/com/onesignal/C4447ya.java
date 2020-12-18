package com.onesignal;

import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.onesignal.ya */
class C4447ya<ObserverType, StateType> {

    /* renamed from: a */
    private String f13107a;

    /* renamed from: b */
    private List<Object> f13108b = new ArrayList();

    /* renamed from: c */
    private boolean f13109c;

    C4447ya(String str, boolean z) {
        this.f13107a = str;
        this.f13109c = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12551a(ObserverType observertype) {
        this.f13108b.add(new WeakReference(observertype));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo12552b(ObserverType observertype) {
        this.f13108b.add(observertype);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo12553c(StateType statetype) {
        Iterator<Object> it = this.f13108b.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof WeakReference) {
                next = ((WeakReference) next).get();
            }
            if (next != null) {
                try {
                    Method declaredMethod = next.getClass().getDeclaredMethod(this.f13107a, new Class[]{statetype.getClass()});
                    declaredMethod.setAccessible(true);
                    if (this.f13109c) {
                        C4252Ia.m16867a((Runnable) new C4444xa(this, declaredMethod, next, statetype));
                    } else {
                        declaredMethod.invoke(next, new Object[]{statetype});
                    }
                    z = true;
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        return z;
    }
}
